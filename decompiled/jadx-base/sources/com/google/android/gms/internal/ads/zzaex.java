package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzaex {
    protected final com.google.android.gms.internal.ads.zzadt zza;

    protected zzaex(com.google.android.gms.internal.ads.zzadt zzadtVar) {
        this.zza = zzadtVar;
    }

    protected abstract boolean zza(com.google.android.gms.internal.ads.zzdy zzdyVar) throws com.google.android.gms.internal.ads.zzbc;

    protected abstract boolean zzb(com.google.android.gms.internal.ads.zzdy zzdyVar, long j) throws com.google.android.gms.internal.ads.zzbc;

    public final boolean zzf(com.google.android.gms.internal.ads.zzdy zzdyVar, long j) throws com.google.android.gms.internal.ads.zzbc {
        return zza(zzdyVar) && zzb(zzdyVar, j);
    }
}
