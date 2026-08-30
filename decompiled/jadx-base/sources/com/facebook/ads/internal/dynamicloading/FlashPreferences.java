package com.facebook.ads.internal.dynamicloading;

/* JADX INFO: loaded from: classes4.dex */
public class FlashPreferences {
    public static final java.lang.String PREFERENCES_FILE = "com.facebook.ads.flash";
    public static final java.lang.String SP_KEY_FLASH_CONFIG = "flash_config";
    public static final java.lang.String SP_KEY_LAST_CONFIG_UPDATE_TIMESTAMP = "update_timestamp";
    public static final java.lang.String SP_KEY_LAST_RESULT = "last_result";

    public static android.content.SharedPreferences getSharedPreferences(android.content.Context context) {
        return context.getSharedPreferences(PREFERENCES_FILE, 0);
    }
}
