package net.shipwreckfantasy.planete216.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shipwreckfantasy.planete216.PLANETE216;
import net.shipwreckfantasy.planete216.block.custom.PortalCoreBlock;
import net.shipwreckfantasy.planete216.block.custom.PortalFrameBlock;
import net.shipwreckfantasy.planete216.block.custom.YellowFern;
import net.shipwreckfantasy.planete216.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PLANETE216.MOD_ID);

    public static final RegistryObject<Block> YELLOWFERN = registerBlock("yellow_fern",
            () -> new YellowFern(BlockBehaviour.Properties.copy(Blocks.GRASS)));

    public static final RegistryObject<Block> PORTALFRAMEBLOCK = registerBlock("portal_frame_block",
            () -> new PortalFrameBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f).sound(SoundType.ANCIENT_DEBRIS)));

    public static final RegistryObject<Block> PORTALCOREBLOCK = registerBlock("portal_core_block",
            () -> new PortalCoreBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f).sound(SoundType.GLASS)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
