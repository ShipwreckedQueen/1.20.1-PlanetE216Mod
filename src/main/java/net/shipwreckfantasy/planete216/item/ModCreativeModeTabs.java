package net.shipwreckfantasy.planete216.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.shipwreckfantasy.planete216.PLANETE216;
import net.shipwreckfantasy.planete216.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> E126_CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PLANETE216.MOD_ID);

    public static final RegistryObject<CreativeModeTab> E216_NATURAL_BLOCKS = E126_CREATIVE_MODE_TAB.register("e216_natural_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.COARSEPALMGRASSBLOCK.get()))
                    .title(Component.translatable("creativetab.e216_natural_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.YELLOWFERNBUNDLE.get());

                        pOutput.accept(ModBlocks.COARSEPALMGRASSBLOCK.get());
                        pOutput.accept(ModBlocks.YELLOWFERN.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> E216_CREATURES = E126_CREATIVE_MODE_TAB.register("e216_creatures",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DODOEGG.get()))
                    .title(Component.translatable("creativetab.creatures"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DODOEGG.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        E126_CREATIVE_MODE_TAB.register(eventBus);
    }
}