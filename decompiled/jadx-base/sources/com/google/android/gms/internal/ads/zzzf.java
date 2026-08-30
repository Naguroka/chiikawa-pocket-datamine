package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzzf implements com.google.android.gms.internal.ads.zzzg {
    final /* synthetic */ java.util.concurrent.Executor zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdb zzb;

    zzzf(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdb zzdbVar) {
        this.zza = executor;
        this.zzb = zzdbVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
