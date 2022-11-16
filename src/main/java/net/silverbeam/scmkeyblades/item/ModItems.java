package net.silverbeam.scmkeyblades.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.silverbeam.scmkeyblades.ScmKeyblades;
import net.silverbeam.scmkeyblades.item.custom.KeybladeItem;

public class ModItems {

    public static final Item MYTHRIL_SHARD = registerItem("mythril_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.SCM_KEYBLADES)));
    public static final Item KINGDOM_KEY_POINT = registerItem("kingdom_key_point",
            new Item(new FabricItemSettings().group(ModItemGroup.SCM_KEYBLADES)));
    public static final Item KINGDOM_KEY_BLADE = registerItem("kingdom_key_blade",
            new Item(new FabricItemSettings().group(ModItemGroup.SCM_KEYBLADES)));
    public static final Item KINGDOM_KEY_HANDLE = registerItem("kingdom_key_handle",
            new Item(new FabricItemSettings().group(ModItemGroup.SCM_KEYBLADES)));
    public static final Item STARLIGHT_POINT = registerItem("starlight_point",
            new Item(new FabricItemSettings().group(ModItemGroup.SCM_KEYBLADES)));
    public static final Item STARLIGHT_BLADE = registerItem("starlight_blade",
            new Item(new FabricItemSettings().group(ModItemGroup.SCM_KEYBLADES)));
    public static final Item STARLIGHT_HANDLE = registerItem("starlight_handle",
            new Item(new FabricItemSettings().group(ModItemGroup.SCM_KEYBLADES)));

    //attackSpeed is set to -2f as tools normally have 4 attack speed as that is the players empty handed attack speed.
    public static final Item KINGDOM_KEY = registerItem("kingdom_key",
            new KeybladeItem(ModKeybladeMaterials.TIER1, 5, -2f, new FabricItemSettings().group(ModItemGroup.SCM_KEYBLADES)));
    public static final Item STARLIGHT = registerItem("starlight",
            new KeybladeItem(ModKeybladeMaterials.TIER1, 5, -2f, new FabricItemSettings().group(ModItemGroup.SCM_KEYBLADES)));
    public static final Item SWEET_MEMORIES = registerItem("sweet_memories",
            new KeybladeItem(ModKeybladeMaterials.TIER1, 1, -2f, new FabricItemSettings().group(ModItemGroup.SCM_KEYBLADES)));
    public static final Item SOUL_EATER = registerItem("soul_eater",
            new KeybladeItem(ModKeybladeMaterials.TIER1, 4, -2f, new FabricItemSettings().group(ModItemGroup.SCM_KEYBLADES)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ScmKeyblades.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ScmKeyblades.LOGGER.debug("registering Mod Items for " + ScmKeyblades.MOD_ID);
    }
}
