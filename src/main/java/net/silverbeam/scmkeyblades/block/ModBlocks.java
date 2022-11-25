package net.silverbeam.scmkeyblades.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.silverbeam.scmkeyblades.ScmKeyblades;
import net.silverbeam.scmkeyblades.item.ModItemGroup;

public class ModBlocks {
    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore",
        new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool().hardness(3f),
                UniformIntProvider.create(3, 7)), ModItemGroup.SCM_KEYBLADES);
    public static final Block DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool().hardness(3f),
                    UniformIntProvider.create(3, 7)), ModItemGroup.SCM_KEYBLADES);


    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().hardness(3f)), ModItemGroup.SCM_KEYBLADES);




    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(ScmKeyblades.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(ScmKeyblades.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        ScmKeyblades.LOGGER.debug("Registering ModBlocks for " + ScmKeyblades.MOD_ID);
    }
}
