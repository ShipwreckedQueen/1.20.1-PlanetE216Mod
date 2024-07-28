package net.shipwreckfantasy.planete216.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shipwreckfantasy.planete216.PLANETE216;
import net.shipwreckfantasy.planete216.entity.custom.JavaRaphusCucullatusEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PLANETE216.MOD_ID);
    public static final RegistryObject<EntityType<JavaRaphusCucullatusEntity>> JAVARAPHUSCUCULLATUS =
            ENTITY_TYPES.register("javaraphuscucullatus", () -> EntityType.Builder.of(JavaRaphusCucullatusEntity::new, MobCategory.CREATURE)
                    .sized(0.6f,0.6f).build("javaraphuscucullatus"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
