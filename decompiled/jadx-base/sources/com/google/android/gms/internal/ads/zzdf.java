package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdf {
    public static void zza(boolean z, java.lang.String str) throws com.google.android.gms.internal.ads.zzde {
        if (!z) {
            throw new com.google.android.gms.internal.ads.zzde(str);
        }
    }

    public static boolean zzb(android.content.Context context) {
        if (com.google.android.gms.internal.ads.zzei.zza < 24) {
            return false;
        }
        if (com.google.android.gms.internal.ads.zzei.zza < 26 && (com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(com.google.android.gms.internal.ads.zzei.zzc) || "XT1650".equals(com.google.android.gms.internal.ads.zzei.zzd))) {
            return false;
        }
        if (com.google.android.gms.internal.ads.zzei.zza >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzd("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzc() {
        return zzd("EGL_KHR_surfaceless_context");
    }

    private static boolean zzd(java.lang.String str) {
        java.lang.String strEglQueryString = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }
}
