package net.shipwreckfantasy.planete216.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.shipwreckfantasy.planete216.PLANETE216;
import net.shipwreckfantasy.planete216.entity.custom.RaphusCucullatusEntity;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class RaphusCucullatusRenderer extends GeoEntityRenderer<RaphusCucullatusEntity> {
    public RaphusCucullatusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RaphusCucullatusModel());
    }

    @Override
    public ResourceLocation getTextureLocation(RaphusCucullatusEntity animatable) {
        return new ResourceLocation(PLANETE216.MOD_ID,"textures/entity/raphuscucullatus_texture.png");
    }

    @Override
    public void render(RaphusCucullatusEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.3f,0.3f,0.3f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
