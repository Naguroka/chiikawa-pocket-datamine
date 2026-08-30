package com.google.android.gms.ads.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzq implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.android.gms.ads.internal.zzu zza;

    zzq(com.google.android.gms.ads.internal.zzu zzuVar) {
        this.zza = zzuVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.ads.internal.zzu zzuVar = this.zza;
        return new com.google.android.gms.internal.ads.zzava(com.google.android.gms.internal.ads.zzauz.zzu(zzuVar.zzd, new com.google.android.gms.internal.ads.zzaux(zzuVar.zza.afmaVersion, false)));
    }
}
