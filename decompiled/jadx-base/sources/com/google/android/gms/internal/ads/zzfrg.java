package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfrg {
    private static com.google.android.gms.internal.ads.zzfrg zzb;
    final com.google.android.gms.internal.ads.zzfrc zza;

    private zzfrg(android.content.Context context) {
        this.zza = com.google.android.gms.internal.ads.zzfrc.zzb(context);
        com.google.android.gms.internal.ads.zzfrb.zza(context);
    }

    public static final com.google.android.gms.internal.ads.zzfrg zza(android.content.Context context) {
        com.google.android.gms.internal.ads.zzfrg zzfrgVar;
        synchronized (com.google.android.gms.internal.ads.zzfrg.class) {
            if (zzb == null) {
                zzb = new com.google.android.gms.internal.ads.zzfrg(context);
            }
            zzfrgVar = zzb;
        }
        return zzfrgVar;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfra zzfraVar) throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzfrg.class) {
            this.zza.zze("vendor_scoped_gpid_v2_id");
            this.zza.zze("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
