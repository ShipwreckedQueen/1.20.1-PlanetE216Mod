package net.shipwreckfantasy.planete216.entity.modgoals;

import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class Dodo_PanicGoal extends PanicGoal implements GeoAnimatable {

    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    private boolean isRunning;

    public boolean isRunning() {
        return isRunning;
    }

    public Dodo_PanicGoal(PathfinderMob pMob, double pSpeedModifier) {
        super(pMob, pSpeedModifier);
    }

    @Override
    public void start() {
        super.start();
        isRunning = true;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "paniccontroller", 0, this::shouldPanicpredicate));
    }

    private PlayState shouldPanicpredicate(AnimationState<Dodo_PanicGoal> dodoPanicGoalAnimationState) {
        if (dodoPanicGoalAnimationState.isMoving()) {
            dodoPanicGoalAnimationState.getController().setAnimation(RawAnimation.begin().then("run.model.new", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        } else {
            dodoPanicGoalAnimationState.getController().setAnimation(RawAnimation.begin().then("idle.model.new", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
    }

    @Override
    public void stop() {
        super.stop();
        isRunning = false;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {return cache;}

    @Override
    public double getTick(Object object) {
        return 0;
    }

}
