package net.shipwreckfantasy.planete216.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.behavior.FollowTemptation;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.shipwreckfantasy.planete216.entity.ModEntities;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.InstancedAnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.object.PlayState;


public class RaphusCucullatusEntity extends Animal implements GeoEntity {
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    private Object oFlap;
    private Object flap;
    private float flapSpeed;
    private float oFlapSpeed;
    private float flapping;


    public RaphusCucullatusEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(2, new FloatGoal(this));
        this.goalSelector.addGoal(1, new WaterAvoidingRandomStrollGoal(this,1.1D));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 3f));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(1,new BreedGoal(this,1.13D));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.4D));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(4, new TemptGoal(this,1.13D, Ingredient.of(Items.SWEET_BERRIES),false));
    }


    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 4.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.13D)
                .add(Attributes.FOLLOW_RANGE, 10D);

    }



    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return ModEntities.RAPHUSCUCULLATUS.get().create(level());
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.is(Items.SWEET_BERRIES);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controller", 0,this::predicate));
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> AnimationState) {
        if (AnimationState.isMoving()) {
            AnimationState.getController().setAnimation(RawAnimation.begin().then("walk.model.new", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        AnimationState.getController().setAnimation(RawAnimation.begin().then("idle.model.new", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return super.getHurtSound(pDamageSource);
    }

    public void aiStep() {
        super.aiStep();
        this.oFlap = this.flap;
        this.oFlapSpeed = this.flapSpeed;
        this.flapSpeed += (this.onGround() ? -1.0F : 4.0F) * 0.3F;
        this.flapSpeed = Mth.clamp(this.flapSpeed, 0.0F, 1.0F);
        if (!this.onGround() && this.flapping < 1.0F) {
            this.flapping = 1.0F;
        }

        this.flapping *= 0.9F;
        Vec3 vec3 = this.getDeltaMovement();
        if (!this.onGround() && vec3.y < 0.0D) {
            this.setDeltaMovement(vec3.multiply(1.0D, 0.6D, 1.0D));
        }
    }
}


