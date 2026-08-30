package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzct implements java.lang.Runnable {
    final java.util.concurrent.Future zza;
    final com.google.android.gms.internal.play_billing.zzcs zzb;

    zzct(java.util.concurrent.Future future, com.google.android.gms.internal.play_billing.zzcs zzcsVar) {
        this.zza = future;
        this.zzb = zzcsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.lang.Throwable thZza;
        java.util.concurrent.Future future = this.zza;
        if ((future instanceof com.google.android.gms.internal.play_billing.zzdf) && (thZza = com.google.android.gms.internal.play_billing.zzdg.zza((com.google.android.gms.internal.play_billing.zzdf) future)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            boolean zIsDone = future.isDone();
            boolean z = false;
            java.util.concurrent.Future future2 = future;
            if (!zIsDone) {
                throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.zzbj.zza("Future was expected to be done: %s", future));
            }
            while (true) {
                try {
                    obj = future2.get();
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    future2 = future2;
                } catch (java.lang.Throwable th) {
                    if (z) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (java.util.concurrent.ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (java.lang.Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.play_billing.zzbc zzbcVarZza = com.google.android.gms.internal.play_billing.zzbe.zza(this);
        zzbcVarZza.zza(this.zzb);
        return zzbcVarZza.toString();
    }
}
