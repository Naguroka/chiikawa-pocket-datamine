package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzq {
    private final com.google.android.gms.ads.query.QueryInfo zza;
    private final java.lang.String zzb;
    private final long zzc;
    private final int zzd;
    private final java.util.concurrent.atomic.AtomicBoolean zze = new java.util.concurrent.atomic.AtomicBoolean(false);

    public zzq(com.google.android.gms.ads.query.QueryInfo queryInfo, java.lang.String str, long j, int i) {
        this.zza = queryInfo;
        this.zzb = str;
        this.zzc = j;
        this.zzd = i;
    }

    public final int zza() {
        return this.zzd;
    }

    public final com.google.android.gms.ads.query.QueryInfo zzb() {
        return this.zza;
    }

    public final java.lang.String zzc() {
        return this.zzb;
    }

    public final void zzd() {
        this.zze.set(true);
    }

    public final boolean zze() {
        return this.zzc <= com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
    }

    public final boolean zzf() {
        return this.zze.get();
    }
}
