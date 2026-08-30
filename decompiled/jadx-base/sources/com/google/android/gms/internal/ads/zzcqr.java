package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcqr {
    private final com.google.android.gms.internal.ads.zzcyl zza;
    private final com.google.android.gms.internal.ads.zzdar zzb;

    public zzcqr(com.google.android.gms.internal.ads.zzcyl zzcylVar, com.google.android.gms.internal.ads.zzdar zzdarVar) {
        this.zza = zzcylVar;
        this.zzb = zzdarVar;
    }

    public final com.google.android.gms.internal.ads.zzcyl zza() {
        return this.zza;
    }

    final com.google.android.gms.internal.ads.zzdar zzb() {
        return this.zzb;
    }

    final com.google.android.gms.internal.ads.zzddk zzc() {
        com.google.android.gms.internal.ads.zzdar zzdarVar = this.zzb;
        return zzdarVar != null ? new com.google.android.gms.internal.ads.zzddk(zzdarVar, com.google.android.gms.internal.ads.zzbzw.zzg) : new com.google.android.gms.internal.ads.zzddk(new com.google.android.gms.internal.ads.zzcqq(this), com.google.android.gms.internal.ads.zzbzw.zzg);
    }
}
