package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfmj {
    private static int zza = 2;

    public static void zza(android.content.Context context) {
        context.registerReceiver(new com.google.android.gms.internal.ads.zzfmi(), new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (com.google.android.gms.internal.ads.zzfmf.zza() != com.google.android.gms.internal.ads.zzfkv.CTV) {
            return 2;
        }
        return zza;
    }
}
