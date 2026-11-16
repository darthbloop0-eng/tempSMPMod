package arathain.mason.client;

import arathain.mason.entity.RippedSoulEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Identifier;

public class RippedSoulEntityRenderer extends EntityRenderer<RippedSoulEntity> {
    public RippedSoulEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
    }

    @Override
    public void render(RippedSoulEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
        DefaultParticleType overhead = ParticleTypes.SOUL_FIRE_FLAME;
        // Illuminations (wisp trail) is discontinued for 1.20.1, so the soul-fire particle is always used.
        entity.getWorld().addParticle(overhead, entity.getX(), entity.getY(), entity.getZ(), 0, 0, 0);
    }

    @Override
    public Identifier getTexture(RippedSoulEntity entity) {
        return null;
    }
}
