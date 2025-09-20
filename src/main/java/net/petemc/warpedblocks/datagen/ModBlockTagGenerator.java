package net.petemc.warpedblocks.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
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

        /*
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SAPPHIRE_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.NETHER_SAPPHIRE_ORE.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
/*
        this.tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
                .add(ModBlocks.SOUND_BLOCK.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.SAPPHIRE_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SAPPHIRE_WALL.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PINE_LOG.get())
                .add(ModBlocks.PINE_WOOD.get())
                .add(ModBlocks.STRIPPED_PINE_LOG.get())
                .add(ModBlocks.STRIPPED_PINE_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.PINE_PLANKS.get());

 */
    }
}
