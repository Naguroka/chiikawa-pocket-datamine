package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaox implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzapm zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzaoy zzb;

    zzaox(com.google.android.gms.internal.ads.zzaoy zzaoyVar, com.google.android.gms.internal.ads.zzapm zzapmVar) {
        this.zza = zzapmVar;
        this.zzb = zzaoyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
    }
}
