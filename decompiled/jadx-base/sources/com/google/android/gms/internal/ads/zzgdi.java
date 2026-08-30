package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgdi extends com.google.android.gms.internal.ads.zzgbx implements java.util.concurrent.RunnableFuture {

    @javax.annotation.CheckForNull
    private volatile com.google.android.gms.internal.ads.zzgcp zza;

    zzgdi(com.google.android.gms.internal.ads.zzgbn zzgbnVar) {
        this.zza = new com.google.android.gms.internal.ads.zzgdg(this, zzgbnVar);
    }

    static com.google.android.gms.internal.ads.zzgdi zze(java.lang.Runnable runnable, java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzgdi(java.util.concurrent.Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzgcp zzgcpVar = this.zza;
        if (zzgcpVar != null) {
            zzgcpVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @javax.annotation.CheckForNull
    protected final java.lang.String zza() {
        com.google.android.gms.internal.ads.zzgcp zzgcpVar = this.zza;
        if (zzgcpVar == null) {
            return super.zza();
        }
        return "task=[" + zzgcpVar.toString() + com.ironsource.y8.i.e;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        com.google.android.gms.internal.ads.zzgcp zzgcpVar;
        if (zzt() && (zzgcpVar = this.zza) != null) {
            zzgcpVar.zzh();
        }
        this.zza = null;
    }

    zzgdi(java.util.concurrent.Callable callable) {
        this.zza = new com.google.android.gms.internal.ads.zzgdh(this, callable);
    }
}
