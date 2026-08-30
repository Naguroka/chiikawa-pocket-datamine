package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bs {
    private static long a(java.util.Map map, java.lang.String str) {
        if (map == null) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        try {
            java.lang.String str2 = (java.lang.String) map.get(str);
            return str2 != null ? java.lang.Long.parseLong(str2) : androidx.media3.common.C.TIME_UNSET;
        } catch (java.lang.NumberFormatException unused) {
            return androidx.media3.common.C.TIME_UNSET;
        }
    }

    public static android.util.Pair a(com.applovin.impl.y6 y6Var) {
        java.util.Map mapD = y6Var.d();
        if (mapD == null) {
            return null;
        }
        return new android.util.Pair(java.lang.Long.valueOf(a(mapD, androidx.media3.exoplayer.drm.WidevineUtil.PROPERTY_LICENSE_DURATION_REMAINING)), java.lang.Long.valueOf(a(mapD, androidx.media3.exoplayer.drm.WidevineUtil.PROPERTY_PLAYBACK_DURATION_REMAINING)));
    }
}
