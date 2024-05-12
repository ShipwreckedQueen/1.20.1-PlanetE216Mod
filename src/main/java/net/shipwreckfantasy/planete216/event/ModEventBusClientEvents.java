package net.shipwreckfantasy.planete216.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shipwreckfantasy.planete216.PLANETE216;
import net.shipwreckfantasy.planete216.entity.client.JavaRachusCuculatusModel;
import net.shipwreckfantasy.planete216.entity.client.ModModelLayers;


    @Mod.EventBusSubscriber(modid = PLANETE216.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public class ModEventBusClientEvents {
        @SubscribeEvent
        public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(ModModelLayers.DODO_LAYER, JavaRachusCuculatusModel::createBodyLayer);
        }
    }
