package net.silverbeam.scmkeyblades.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class KeybladeItem extends SwordItem {
    public KeybladeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.setVelocity(0,0.5,0);
        target.setVelocity(0,0.5,0);
        attacker.velocityModified = true;
        target.velocityModified = true;
        return super.postHit(stack, target, attacker);
    }
}
