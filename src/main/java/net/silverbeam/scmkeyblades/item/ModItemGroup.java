package net.silverbeam.scmkeyblades.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.silverbeam.scmkeyblades.ScmKeyblades;

public class ModItemGroup {

    public static final ItemGroup SCM_KEYBLADES = FabricItemGroupBuilder.build(new Identifier(ScmKeyblades.MOD_ID, "scmkeyblades"), () -> new ItemStack(ModItems.MYTHRIL_SHARD));

}
