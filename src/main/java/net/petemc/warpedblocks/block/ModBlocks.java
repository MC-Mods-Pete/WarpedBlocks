package net.petemc.warpedblocks.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.petemc.warpedblocks.WarpedBlocks;
import net.petemc.warpedblocks.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, WarpedBlocks.MOD_ID);

    public static final RegistryObject<Block> WARPED_NETHERRACK = registerBlock("warped_netherrack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> WARPED_NETHERRACK_STAIRS = registerBlock("warped_netherrack_stairs",
            () -> new StairBlock(() -> ModBlocks.WARPED_NETHERRACK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> WARPED_NETHERRACK_SLAB = registerBlock("warped_netherrack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> WARPED_NETHERRACK_WALL = registerBlock("warped_netherrack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> WARPED_NETHERRACK_BUTTON = registerBlock("warped_netherrack_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.NETHERRACK),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> WARPED_NETHERRACK_PLATE = registerBlock("warped_netherrack_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> CHISELED_WARPED_NETHERRACK = registerBlock("chiseled_warped_netherrack",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));


    public static final RegistryObject<Block> POLISHED_WARPED_NETHERRACK = registerBlock("polished_warped_netherrack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> POLISHED_WARPED_NETHERRACK_STAIRS = registerBlock("polished_warped_netherrack_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_WARPED_NETHERRACK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> POLISHED_WARPED_NETHERRACK_SLAB = registerBlock("polished_warped_netherrack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> POLISHED_WARPED_NETHERRACK_WALL = registerBlock("polished_warped_netherrack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> POLISHED_WARPED_NETHERRACK_BUTTON = registerBlock("polished_warped_netherrack_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.NETHERRACK),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> POLISHED_WARPED_NETHERRACK_PLATE = registerBlock("polished_warped_netherrack_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK),
                    BlockSetType.STONE));


    public static final RegistryObject<Block> WARPED_NETHERRACK_BRICKS = registerBlock("warped_netherrack_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> WARPED_NETHERRACK_BRICK_STAIRS = registerBlock("warped_netherrack_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WARPED_NETHERRACK_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> WARPED_NETHERRACK_BRICK_SLAB = registerBlock("warped_netherrack_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> WARPED_NETHERRACK_BRICK_WALL = registerBlock("warped_netherrack_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.NETHERRACK)));


    public static final RegistryObject<Block> WARPED_STONE = registerBlock("warped_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
