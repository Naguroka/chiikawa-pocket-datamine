package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzacg {
    private final com.google.android.gms.internal.ads.zzacf zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean(false);

    public zzacg(com.google.android.gms.internal.ads.zzacf zzacfVar) {
        this.zza = zzacfVar;
    }

    public final com.google.android.gms.internal.ads.zzacn zza(java.lang.Object... objArr) {
        java.lang.reflect.Constructor constructorZza;
        synchronized (this.zzb) {
            if (!this.zzb.get()) {
                try {
                    constructorZza = this.zza.zza();
                } catch (java.lang.ClassNotFoundException unused) {
                    this.zzb.set(true);
                    constructorZza = null;
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Error instantiating extension", e);
                }
            }
            constructorZza = null;
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (com.google.android.gms.internal.ads.zzacn) constructorZza.newInstance(objArr);
        } catch (java.lang.Exception e2) {
            throw new java.lang.IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
