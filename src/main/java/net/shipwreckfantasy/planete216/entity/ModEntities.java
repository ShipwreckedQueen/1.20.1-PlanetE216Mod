package net.shipwreckfantasy.planete216.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shipwreckfantasy.planete216.PLANETE216;
import net.shipwreckfantasy.planete216.entity.custom.RaphusCucullatusEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PLANETE216.MOD_ID);

    public static final RegistryObject<EntityType<RaphusCucullatusEntity>> RAPHUSCUCULLATUS =
            ENTITY_TYPES.register("raphus_cucullatus", () -> EntityType.Builder.of(RaphusCucullatusEntity::new, MobCategory.CREATURE)
                    .sized(0.6f,0.6f).build("raphus_cucullatus"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
