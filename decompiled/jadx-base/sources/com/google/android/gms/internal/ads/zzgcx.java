package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgcx extends com.google.android.gms.internal.ads.zzgax.zzi implements java.lang.Runnable {
    private final java.lang.Runnable zza;

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final java.lang.String zza() {
        return "task=[" + this.zza.toString() + com.ironsource.y8.i.e;
    }

    public zzgcx(java.lang.Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (java.lang.Throwable th) {
            zzd(th);
            throw th;
        }
    }
}
