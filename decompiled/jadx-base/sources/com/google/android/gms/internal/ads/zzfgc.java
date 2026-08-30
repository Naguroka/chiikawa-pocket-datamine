package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfgc implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfft zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgd zzb;

    zzfgc(com.google.android.gms.internal.ads.zzfgd zzfgdVar, com.google.android.gms.internal.ads.zzfft zzfftVar) {
        this.zza = zzfftVar;
        this.zzb = zzfgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        this.zzb.zza.zzd.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(java.lang.Object obj) {
        this.zzb.zza.zzd.zzd(this.zza);
    }
}
