package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaww implements java.util.concurrent.Callable {
    private final com.google.android.gms.internal.ads.zzawd zza;
    private final com.google.android.gms.internal.ads.zzasc zzb;

    public zzaww(com.google.android.gms.internal.ads.zzawd zzawdVar, com.google.android.gms.internal.ads.zzasc zzascVar) {
        this.zza = zzawdVar;
        this.zzb = zzascVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        com.google.android.gms.internal.ads.zzasy zzasyVarZzc = this.zza.zzc();
        if (zzasyVarZzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                try {
                    this.zzb.zzaY(zzasyVarZzc.zzaV(), com.google.android.gms.internal.ads.zzgxb.zza());
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (com.google.android.gms.internal.ads.zzgyg | java.lang.NullPointerException unused) {
            return null;
        }
    }
}
