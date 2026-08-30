package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgbs extends com.google.android.gms.internal.ads.zzgbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgbu zza;
    private final java.util.concurrent.Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbs(com.google.android.gms.internal.ads.zzgbu zzgbuVar, java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        super(zzgbuVar, executor);
        this.zza = zzgbuVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final java.lang.Object zza() throws java.lang.Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    final java.lang.String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    final void zzc(java.lang.Object obj) {
        this.zza.zzc(obj);
    }
}
