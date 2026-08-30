package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfrf extends com.google.android.gms.internal.ads.zzfrd {
    private static com.google.android.gms.internal.ads.zzfrf zzd;

    private zzfrf(android.content.Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final com.google.android.gms.internal.ads.zzfrf zzi(android.content.Context context) {
        com.google.android.gms.internal.ads.zzfrf zzfrfVar;
        synchronized (com.google.android.gms.internal.ads.zzfrf.class) {
            if (zzd == null) {
                zzd = new com.google.android.gms.internal.ads.zzfrf(context);
            }
            zzfrfVar = zzd;
        }
        return zzfrfVar;
    }

    public final com.google.android.gms.internal.ads.zzfra zzh(long j, boolean z) throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzfrf.class) {
            if (this.zzc.zzd()) {
                return zzb(null, null, j, z);
            }
            return new com.google.android.gms.internal.ads.zzfra();
        }
    }

    public final void zzj() throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzfrf.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }
}
