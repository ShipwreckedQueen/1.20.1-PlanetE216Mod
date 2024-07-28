package net.shipwreckfantasy.planete216.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shipwreckfantasy.planete216.PLANETE216;
import net.shipwreckfantasy.planete216.entity.ModEntities;
import net.shipwreckfantasy.planete216.entity.custom.JavaRaphusCucullatusEntity;

@Mod.EventBusSubscriber(modid = PLANETE216.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.JAVARAPHUSCUCULLATUS.get(), JavaRaphusCucullatusEntity.createAttributes().build());
    }
}
