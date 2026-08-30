package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgb {
    private android.net.Uri zza;
    private java.util.Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public zzgb() {
        this.zzb = java.util.Collections.emptyMap();
        this.zzd = -1L;
    }

    /* synthetic */ zzgb(com.google.android.gms.internal.ads.zzgd zzgdVar, com.google.android.gms.internal.ads.zzgc zzgcVar) {
        this.zza = zzgdVar.zza;
        this.zzb = zzgdVar.zzd;
        this.zzc = zzgdVar.zze;
        this.zzd = zzgdVar.zzf;
        this.zze = zzgdVar.zzg;
    }

    public final com.google.android.gms.internal.ads.zzgb zza(int i) {
        this.zze = 6;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgb zzb(java.util.Map map) {
        this.zzb = map;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgb zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgb zzd(android.net.Uri uri) {
        this.zza = uri;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgd zze() {
        if (this.zza != null) {
            return new com.google.android.gms.internal.ads.zzgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }
        throw new java.lang.IllegalStateException("The uri must be set.");
    }
}
