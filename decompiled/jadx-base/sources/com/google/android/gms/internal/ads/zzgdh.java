package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgdh extends com.google.android.gms.internal.ads.zzgcp {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgdi zza;
    private final java.util.concurrent.Callable zzb;

    zzgdh(com.google.android.gms.internal.ads.zzgdi zzgdiVar, java.util.concurrent.Callable callable) {
        this.zza = zzgdiVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final java.lang.Object zza() throws java.lang.Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final java.lang.String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final void zzd(java.lang.Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final void zze(java.lang.Object obj) {
        this.zza.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final boolean zzg() {
        return this.zza.isDone();
    }
}
