package liam.them;

import liam.them.core.TItems;
import liam.them.core.TSounds;
import net.fabricmc.api.ModInitializer;

public class ThEm implements ModInitializer {
    public static final String MOD_ID = "them";
    @Override
    public void onInitialize() {
        TItems.init();
        TSounds.init();
    }
}
