package liam.them.core;

import liam.them.ThEm;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class TSounds {
    public static final SoundEvent MUSIC_DISC_MOV = registerSound("mov");
    public static SoundEvent registerSound(String id) {
        return Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation(ThEm.MOD_ID, id), SoundEvent.createVariableRangeEvent(new ResourceLocation(ThEm.MOD_ID, id)));
    }
    public static void init(){
    }
}
