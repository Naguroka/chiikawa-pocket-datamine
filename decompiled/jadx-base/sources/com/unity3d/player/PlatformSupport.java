package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public class PlatformSupport {
    static final boolean MARSHMALLOW_SUPPORT;
    static final boolean NOUGAT_SUPPORT;
    static final boolean PIE_SUPPORT;
    static final boolean RED_VELVET_CAKE_SUPPORT;
    static final boolean SNOW_CONE_SUPPORT;
    static final boolean TIRAMISU_SUPPORT;
    static final boolean UPSIDE_DOWN_CAKE_SUPPORT;
    static final boolean VANILLA_ICE_CREAM_SUPPORT;

    static {
        int i = android.os.Build.VERSION.SDK_INT;
        MARSHMALLOW_SUPPORT = true;
        NOUGAT_SUPPORT = true;
        PIE_SUPPORT = i >= 28;
        RED_VELVET_CAKE_SUPPORT = i >= 30;
        SNOW_CONE_SUPPORT = i >= 31;
        TIRAMISU_SUPPORT = i >= 33;
        UPSIDE_DOWN_CAKE_SUPPORT = i >= 34;
        VANILLA_ICE_CREAM_SUPPORT = i >= 35;
    }
}
