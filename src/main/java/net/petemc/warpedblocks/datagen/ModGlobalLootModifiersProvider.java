package net.petemc.warpedblocks.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.petemc.warpedblocks.WarpedBlocks;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, WarpedBlocks.MOD_ID);
    }

    @Override
    protected void start() {

    }
}
