package net.silverbeam.scmkeyblades.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModKeybladeMaterials implements ToolMaterial {

//Tools always have +1 to their damage due to the normal damage of the player fist (1) being added to the damage of the tool
//Because of this, the attack damage has been set to -1 in the material, so each keyblade can be set to whatever damage wanted in ModItems
    TIER1(3, 1561, 7.0F, -1.0F, 0, () -> Ingredient.ofItems(ModItems.MYTHRIL_SHARD)),
    TIER2(3, 1561, 7.0F, 0.0F, 0, () -> Ingredient.ofItems(ModItems.MYTHRIL_SHARD)),
    TIER3(3, 1561, 7.0F, 0.0F, 0, () -> Ingredient.ofItems(ModItems.MYTHRIL_SHARD)),
    TIER4(3, 1561, 7.0F, 0.0F, 0, () -> Ingredient.ofItems(ModItems.MYTHRIL_SHARD)),
    TIER5(3, 1561, 7.0F, 0.0F, 0, () -> Ingredient.ofItems(ModItems.MYTHRIL_SHARD)),
    TIER6(3, 1561, 7.0F, 0.0F, 0, () -> Ingredient.ofItems(ModItems.MYTHRIL_SHARD));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModKeybladeMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {

        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
