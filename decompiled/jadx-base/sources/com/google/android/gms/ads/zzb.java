package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb {
    private static volatile com.google.android.gms.ads.internal.client.zzci zza;

    private zzb() {
    }

    public static com.google.android.gms.ads.internal.client.zzci zza(android.content.Context context) {
        if (zza == null) {
            synchronized (com.google.android.gms.ads.zzb.class) {
                if (zza == null) {
                    zza = com.google.android.gms.ads.internal.client.zzbc.zza().zzg(context.getApplicationContext(), new com.google.android.gms.internal.ads.zzbpa());
                }
            }
        }
        return zza;
    }
}
