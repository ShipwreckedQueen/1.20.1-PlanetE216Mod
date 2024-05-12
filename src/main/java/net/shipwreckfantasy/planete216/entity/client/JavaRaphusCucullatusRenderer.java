package net.shipwreckfantasy.planete216.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.shipwreckfantasy.planete216.PLANETE216;
import net.shipwreckfantasy.planete216.entity.custom.JavaRaphusCucullatusEntity;

public class JavaRaphusCucullatusRenderer extends MobRenderer<JavaRaphusCucullatusEntity, JavaRachusCuculatusModel<JavaRaphusCucullatusEntity>> {

    public JavaRaphusCucullatusRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new JavaRachusCuculatusModel<>(pContext.bakeLayer(ModModelLayers.DODO_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(JavaRaphusCucullatusEntity pEntity) {
        return new ResourceLocation(PLANETE216.MOD_ID, "textures/entity/java_raphus_cuculatus_texture.png");
    }

    @Override
    public void render(JavaRaphusCucullatusEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pPoseStack.scale(0.3f,0.3f,0.3f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
