package net.shipwreckfantasy.planete216.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shipwreckfantasy.planete216.PLANETE216;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PLANETE216.MOD_ID);

    public static final RegistryObject<Item> DODOEGG = ITEMS.register("dodoegg",
            () -> new Item(new Item.Properties().stacksTo(15)));
    public static final RegistryObject<Item> YELLOWFERNBUNDLE = ITEMS.register("yellowfernbundle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PORTALSHARDS = ITEMS.register("portal_shards",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PORTALCORE = ITEMS.register("portal_core",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
