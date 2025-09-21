package net.petemc.warpedblocks.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.petemc.warpedblocks.WarpedBlocks;
import net.petemc.warpedblocks.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, WarpedBlocks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Warped blocks
        blockWithItem(ModBlocks.WARPED_NETHERRACK);
        stairsBlock(((StairBlock) ModBlocks.WARPED_NETHERRACK_STAIRS.get()), blockTexture(ModBlocks.WARPED_NETHERRACK.get()));
        slabBlock(((SlabBlock) ModBlocks.WARPED_NETHERRACK_SLAB.get()), blockTexture(ModBlocks.WARPED_NETHERRACK.get()), blockTexture(ModBlocks.WARPED_NETHERRACK.get()));
        wallBlock((WallBlock) ModBlocks.WARPED_NETHERRACK_WALL.get(), blockTexture(ModBlocks.WARPED_NETHERRACK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.WARPED_NETHERRACK_BUTTON.get()), blockTexture(ModBlocks.WARPED_NETHERRACK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.WARPED_NETHERRACK_PLATE.get()), blockTexture(ModBlocks.WARPED_NETHERRACK.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CHISELED_WARPED_NETHERRACK.get()), blockTexture(ModBlocks.CHISELED_WARPED_NETHERRACK.get()),
                ResourceLocation.fromNamespaceAndPath(WarpedBlocks.MOD_ID, "block/chiseled_warped_netherrack_top"));
        blockItem(ModBlocks.CHISELED_WARPED_NETHERRACK);

        // Polished Warped blocks
        blockWithItem(ModBlocks.POLISHED_WARPED_NETHERRACK);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_WARPED_NETHERRACK_STAIRS.get()), blockTexture(ModBlocks.POLISHED_WARPED_NETHERRACK.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_WARPED_NETHERRACK_SLAB.get()), blockTexture(ModBlocks.POLISHED_WARPED_NETHERRACK.get()), blockTexture(ModBlocks.POLISHED_WARPED_NETHERRACK.get()));
        wallBlock((WallBlock) ModBlocks.POLISHED_WARPED_NETHERRACK_WALL.get(), blockTexture(ModBlocks.POLISHED_WARPED_NETHERRACK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.POLISHED_WARPED_NETHERRACK_BUTTON.get()), blockTexture(ModBlocks.POLISHED_WARPED_NETHERRACK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.POLISHED_WARPED_NETHERRACK_PLATE.get()), blockTexture(ModBlocks.POLISHED_WARPED_NETHERRACK.get()));

        // Brick blocks
        blockWithItem(ModBlocks.WARPED_NETHERRACK_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.WARPED_NETHERRACK_BRICK_STAIRS.get()), blockTexture(ModBlocks.WARPED_NETHERRACK_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.WARPED_NETHERRACK_BRICK_SLAB.get()), blockTexture(ModBlocks.WARPED_NETHERRACK_BRICKS.get()), blockTexture(ModBlocks.WARPED_NETHERRACK_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.WARPED_NETHERRACK_BRICK_WALL.get(), blockTexture(ModBlocks.WARPED_NETHERRACK_BRICKS.get()));

        blockWithItem(ModBlocks.WARPED_STONE);
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(WarpedBlocks.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
