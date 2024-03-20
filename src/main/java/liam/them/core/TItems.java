package liam.them.core;

import liam.them.ThEm;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;


public class TItems {
    public static final Item MUSIC_DISC_MOV = registerItem("music_disc_mov", new RecordItem(1, TSounds.MUSIC_DISC_MOV, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 117));
    public static Item registerItem(String id, Item item){
        return Registry.register(BuiltInRegistries.ITEM,new ResourceLocation(ThEm.MOD_ID, id), item);
    }
    public static void init(){
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content ->{
            content.accept(MUSIC_DISC_MOV);
        });
    }

}
