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

    public static final RegistryObject<Item> DODOEGG = ITEMS.register("dodo_egg",
            () -> new Item(new Item.Properties().stacksTo(15)));
    public static final RegistryObject<Item> YELLOWFERNBUNDLE = ITEMS.register("yellow_fern_bundle",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
