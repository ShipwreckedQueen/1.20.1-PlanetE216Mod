package net.shipwreckfantasy.planete216.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.shipwreckfantasy.planete216.PLANETE216;
import net.shipwreckfantasy.planete216.entity.custom.BabyRaphusCucullatusEntity;
import net.shipwreckfantasy.planete216.entity.custom.RaphusCucullatusEntity;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class BabyRaphusCucullatusModel extends GeoModel<BabyRaphusCucullatusEntity> {
    @Override
    public ResourceLocation getModelResource(BabyRaphusCucullatusEntity animatable) {
        return new ResourceLocation(PLANETE216.MOD_ID,"geo/baby_raphuscucullatus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BabyRaphusCucullatusEntity animatable) {
        return new ResourceLocation(PLANETE216.MOD_ID,"textures/entity/baby_raphuscucullatus_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BabyRaphusCucullatusEntity animatable) {
        return new ResourceLocation(PLANETE216.MOD_ID,"animations/baby_raphuscucullatus.animation.json");
    }

    @Override
    public void setCustomAnimations(BabyRaphusCucullatusEntity animatable, long instanceId, AnimationState<BabyRaphusCucullatusEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");
        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
