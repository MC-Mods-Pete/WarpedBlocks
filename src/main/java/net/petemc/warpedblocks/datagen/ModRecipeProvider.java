package net.petemc.warpedblocks.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.petemc.warpedblocks.WarpedBlocks;
import net.petemc.warpedblocks.block.ModBlocks;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_NETHERRACK.get(), 8)
                .pattern("NNN")
                .pattern("NFN")
                .pattern("NNN")
                .define('N', Blocks.NETHERRACK)
                .define('F', Items.WARPED_FUNGUS)
                .unlockedBy(getHasName(Items.WARPED_FUNGUS), has(Items.WARPED_FUNGUS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_NETHERRACK_STAIRS.get(), 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .define('W', ModBlocks.WARPED_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.WARPED_NETHERRACK.get()), has(ModBlocks.WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_NETHERRACK_SLAB.get(), 6)
                .pattern("WWW")
                .define('W', ModBlocks.WARPED_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.WARPED_NETHERRACK.get()), has(ModBlocks.WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_NETHERRACK_WALL.get(), 6)
                .pattern("WWW")
                .pattern("WWW")
                .define('W', ModBlocks.WARPED_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.WARPED_NETHERRACK.get()), has(ModBlocks.WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_NETHERRACK_BUTTON.get())
                .requires(ModBlocks.WARPED_NETHERRACK.get(),1)
                .unlockedBy(getHasName(ModBlocks.WARPED_NETHERRACK.get()), has(ModBlocks.WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_NETHERRACK_PLATE.get())
                .pattern("WW")
                .define('W', ModBlocks.WARPED_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.WARPED_NETHERRACK.get()), has(ModBlocks.WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_WARPED_NETHERRACK.get())
                .pattern("W")
                .pattern("W")
                .define('W', ModBlocks.WARPED_NETHERRACK_SLAB.get())
                .unlockedBy(getHasName(ModBlocks.WARPED_NETHERRACK.get()), has(ModBlocks.WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_WARPED_NETHERRACK.get())
                .pattern("WW")
                .pattern("WW")
                .define('W', ModBlocks.WARPED_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.WARPED_NETHERRACK.get()), has(ModBlocks.WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_WARPED_NETHERRACK_STAIRS.get(), 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .define('W', ModBlocks.POLISHED_WARPED_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_NETHERRACK.get()), has(ModBlocks.POLISHED_WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_WARPED_NETHERRACK_SLAB.get(), 6)
                .pattern("WWW")
                .define('W', ModBlocks.POLISHED_WARPED_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_NETHERRACK.get()), has(ModBlocks.POLISHED_WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_WARPED_NETHERRACK_WALL.get(), 6)
                .pattern("WWW")
                .pattern("WWW")
                .define('W', ModBlocks.POLISHED_WARPED_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_NETHERRACK.get()), has(ModBlocks.POLISHED_WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_WARPED_NETHERRACK_BUTTON.get())
                .requires(ModBlocks.POLISHED_WARPED_NETHERRACK.get(),1)
                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_NETHERRACK.get()), has(ModBlocks.POLISHED_WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_WARPED_NETHERRACK_PLATE.get())
                .pattern("WW")
                .define('W', ModBlocks.POLISHED_WARPED_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_NETHERRACK.get()), has(ModBlocks.POLISHED_WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_NETHERRACK_BRICKS.get(), 4)
                .pattern("WW")
                .pattern("WW")
                .define('W', ModBlocks.POLISHED_WARPED_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_NETHERRACK.get()), has(ModBlocks.POLISHED_WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_NETHERRACK_BRICK_STAIRS.get(), 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .define('W', ModBlocks.WARPED_NETHERRACK_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_NETHERRACK.get()), has(ModBlocks.POLISHED_WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_NETHERRACK_BRICK_SLAB.get(), 6)
                .pattern("WWW")
                .define('W', ModBlocks.WARPED_NETHERRACK_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_NETHERRACK.get()), has(ModBlocks.POLISHED_WARPED_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_NETHERRACK_BRICK_WALL.get(), 6)
                .pattern("WWW")
                .pattern("WWW")
                .define('W', ModBlocks.WARPED_NETHERRACK_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_NETHERRACK.get()), has(ModBlocks.POLISHED_WARPED_NETHERRACK.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  WarpedBlocks.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
