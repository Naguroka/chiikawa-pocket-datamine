package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfmf {
    private static android.app.UiModeManager zza;

    public static com.google.android.gms.internal.ads.zzfkv zza() {
        android.app.UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return com.google.android.gms.internal.ads.zzfkv.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? com.google.android.gms.internal.ads.zzfkv.OTHER : com.google.android.gms.internal.ads.zzfkv.CTV;
        }
        return com.google.android.gms.internal.ads.zzfkv.MOBILE;
    }

    public static void zzb(android.content.Context context) {
        if (context != null) {
            zza = (android.app.UiModeManager) context.getSystemService("uimode");
        }
    }
}
