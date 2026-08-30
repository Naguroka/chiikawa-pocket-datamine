package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfdg {
    public static void zza(android.content.Context context, boolean z) {
        if (z) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + com.google.android.gms.ads.internal.util.client.zzf.zzy(context) + "\")) to get test ads on this device.");
    }

    public static void zzb(int i, java.lang.Throwable th, java.lang.String str) {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad failed to load : " + i);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzp().zzv(th, str);
    }
}
