package net.shipwreckfantasy.planete216.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.shipwreckfantasy.planete216.PLANETE216;
import net.shipwreckfantasy.planete216.entity.custom.BabyRaphusCucullatusEntity;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BabyRaphusCucullatusRenderer extends GeoEntityRenderer<BabyRaphusCucullatusEntity> {
    public BabyRaphusCucullatusRenderer(EntityRendererProvider.Context renderManager, GeoModel<BabyRaphusCucullatusEntity> model) {
        super(renderManager, model);
    }

    @Override
    public ResourceLocation getTextureLocation(BabyRaphusCucullatusEntity animatable) {
        return new ResourceLocation(PLANETE216.MOD_ID,"textures/entity/raphuscucullatus_texture.png");
    }
}
