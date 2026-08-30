package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbjd implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcex zza;

    zzbjd(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        this.zza = zzcexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zza.zzD() != null ? this.zza.zzD().zzax : null;
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbw(zzcexVar.getContext(), zzcexVar.zzn().afmaVersion, str, null, zzvVar).zzb();
    }
}
