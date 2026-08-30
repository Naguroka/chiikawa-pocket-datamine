package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcqb implements com.google.android.gms.internal.ads.zzayk {
    private final com.google.android.gms.internal.ads.zzcex zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();

    zzcqb(com.google.android.gms.internal.ads.zzcex zzcexVar, java.util.concurrent.Executor executor) {
        this.zza = zzcexVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final synchronized void zzdn(com.google.android.gms.internal.ads.zzayj zzayjVar) {
        if (this.zza != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmv)).booleanValue()) {
                if (zzayjVar.zzj) {
                    if (!java.lang.Boolean.TRUE.equals(this.zzc.getAndSet(true))) {
                        java.util.concurrent.Executor executor = this.zzb;
                        final com.google.android.gms.internal.ads.zzcex zzcexVar = this.zza;
                        java.util.Objects.requireNonNull(zzcexVar);
                        executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcpz
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcexVar.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!zzayjVar.zzj) {
                    if (!java.lang.Boolean.FALSE.equals(this.zzc.getAndSet(false))) {
                        java.util.concurrent.Executor executor2 = this.zzb;
                        final com.google.android.gms.internal.ads.zzcex zzcexVar2 = this.zza;
                        java.util.Objects.requireNonNull(zzcexVar2);
                        executor2.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcqa
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcexVar2.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
