package net.shipwreckfantasy.planete216.event;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shipwreckfantasy.planete216.PLANETE216;
import net.shipwreckfantasy.planete216.entity.ModEntities;
import net.shipwreckfantasy.planete216.entity.client.JavaRachusCuculatusModel;
import net.shipwreckfantasy.planete216.entity.client.ModModelLayers;
import net.shipwreckfantasy.planete216.entity.custom.JavaRaphusCucullatusEntity;
import net.shipwreckfantasy.planete216.entity.custom.RaphusCucullatusEntity;

@Mod.EventBusSubscriber(modid = PLANETE216.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RAPHUSCUCULLATUS.get(), RaphusCucullatusEntity.createAttributes().build());
        event.put(ModEntities.JAVARAPHUSCUCULLATUS.get(), JavaRaphusCucullatusEntity.createAttributes().build());
    }
}
