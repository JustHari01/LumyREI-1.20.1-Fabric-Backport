package com.lumyverse.lumyrei;

import com.cobblemon.mod.common.brewing.ingredient.CobblemonIngredient;
import kotlin.Triple;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CobblemonBrewingDisplay extends BasicDisplay {

    private CobblemonBrewingDisplay(List<EntryIngredient> inputs, Item output) {
        super(inputs, Collections.singletonList(EntryIngredients.of(new ItemStack(output))));
    }

    public static CobblemonBrewingDisplay from(Triple<CobblemonIngredient, CobblemonIngredient, Item> recipe) {
        if (recipe == null || recipe.getFirst() == null || recipe.getSecond() == null || recipe.getThird() == null) {
            return null;
        }

        List<ItemStack> baseStacks = recipe.getFirst().matchingStacks();
        List<ItemStack> reagentStacks = recipe.getSecond().matchingStacks();
        if (baseStacks == null || baseStacks.isEmpty() || reagentStacks == null || reagentStacks.isEmpty()) {
            return null;
        }

        List<EntryIngredient> inputs = new ArrayList<>(3);
        // The top input is the Cobblemon reagent; the three lower slots share the base brew.
        inputs.add(EntryIngredients.ofItemStacks(reagentStacks));
        inputs.add(EntryIngredients.of(net.minecraft.item.Items.BLAZE_POWDER));
        inputs.add(EntryIngredients.ofItemStacks(baseStacks));
        return new CobblemonBrewingDisplay(inputs, recipe.getThird());
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return BrewingStandCategory.BREWING;
    }
}
