package net.petemc.warpedblocks.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.petemc.warpedblocks.WarpedBlocks;
import net.petemc.warpedblocks.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, WarpedBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.WARPED_NETHERRACK.get(),
                     ModBlocks.WARPED_NETHERRACK_STAIRS.get(),
                     ModBlocks.WARPED_NETHERRACK_SLAB.get(),
                     ModBlocks.WARPED_NETHERRACK_PLATE.get(),
                     ModBlocks.WARPED_CHISELED_NETHERRACK.get(),
                     ModBlocks.WARPED_POLISHED_NETHERRACK.get(),
                     ModBlocks.WARPED_POLISHED_NETHERRACK_STAIRS.get(),
                     ModBlocks.WARPED_POLISHED_NETHERRACK_SLAB.get(),
                     ModBlocks.WARPED_POLISHED_NETHERRACK_PLATE.get(),
                     ModBlocks.WARPED_NETHERRACK_BRICKS.get(),
                     ModBlocks.WARPED_NETHERRACK_BRICK_STAIRS.get(),
                     ModBlocks.WARPED_NETHERRACK_BRICK_SLAB.get(),
                     ModBlocks.WARPED_STONE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.WARPED_NETHERRACK_WALL.get(),
                     ModBlocks.WARPED_POLISHED_NETHERRACK_WALL.get(),
                     ModBlocks.WARPED_NETHERRACK_BRICK_WALL.get());
    }
}
