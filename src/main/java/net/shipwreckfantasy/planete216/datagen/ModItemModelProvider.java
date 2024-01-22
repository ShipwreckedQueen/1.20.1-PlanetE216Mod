package net.shipwreckfantasy.planete216.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.shipwreckfantasy.planete216.PLANETE216;
import net.shipwreckfantasy.planete216.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PLANETE216.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ModItems.DODOSPAWNEGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
}
