package net.shipwreckfantasy.planete216.worldgen.biome;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.shipwreckfantasy.planete216.PLANETE216;

public class ModBiomes {
    public static final ResourceKey<Biome> TEST_BIOME = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(PLANETE216.MOD_ID,"test_biome"));

    public static void bootstrap(BootstapContext<Biome> context) {

    }

}
