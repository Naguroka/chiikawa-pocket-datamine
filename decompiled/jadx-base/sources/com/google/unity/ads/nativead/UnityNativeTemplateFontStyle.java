package com.google.unity.ads.nativead;

/* JADX INFO: loaded from: classes5.dex */
public enum UnityNativeTemplateFontStyle {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    public static com.google.unity.ads.nativead.UnityNativeTemplateFontStyle fromIntValue(int value) {
        if (value >= 0 && value < values().length) {
            return values()[value];
        }
        android.util.Log.w(com.google.unity.ads.PluginUtils.LOGTAG, "Invalid index for NativeTemplateFontStyle: " + value);
        return NORMAL;
    }

    android.graphics.Typeface getTypeface() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return android.graphics.Typeface.DEFAULT;
        }
        if (iOrdinal == 1) {
            return android.graphics.Typeface.DEFAULT_BOLD;
        }
        if (iOrdinal == 2) {
            return android.graphics.Typeface.defaultFromStyle(2);
        }
        if (iOrdinal == 3) {
            return android.graphics.Typeface.MONOSPACE;
        }
        return android.graphics.Typeface.DEFAULT;
    }
}
