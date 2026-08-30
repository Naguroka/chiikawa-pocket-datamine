package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfre extends com.google.android.gms.internal.ads.zzfrd {
    private static com.google.android.gms.internal.ads.zzfre zzd;

    private zzfre(android.content.Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final com.google.android.gms.internal.ads.zzfre zzj(android.content.Context context) {
        com.google.android.gms.internal.ads.zzfre zzfreVar;
        synchronized (com.google.android.gms.internal.ads.zzfre.class) {
            if (zzd == null) {
                zzd = new com.google.android.gms.internal.ads.zzfre(context);
            }
            zzfreVar = zzd;
        }
        return zzfreVar;
    }

    public final com.google.android.gms.internal.ads.zzfra zzh(long j, boolean z) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzfra zzfraVarZzb;
        synchronized (com.google.android.gms.internal.ads.zzfre.class) {
            zzfraVarZzb = zzb(null, null, j, z);
        }
        return zzfraVarZzb;
    }

    public final com.google.android.gms.internal.ads.zzfra zzi(java.lang.String str, java.lang.String str2, long j, boolean z) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzfra zzfraVarZzb;
        synchronized (com.google.android.gms.internal.ads.zzfre.class) {
            zzfraVarZzb = zzb(str, str2, j, z);
        }
        return zzfraVarZzb;
    }

    public final void zzk() throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzfre.class) {
            zzf(false);
        }
    }

    public final void zzl() throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzfre.class) {
            zzf(true);
        }
    }
}
