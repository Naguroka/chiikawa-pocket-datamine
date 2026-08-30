package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdb implements java.lang.Runnable {
    com.google.android.gms.internal.play_billing.zzde zza;

    zzdb(com.google.android.gms.internal.play_billing.zzde zzdeVar) {
        this.zza = zzdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.play_billing.zzcz zzczVar;
        com.google.android.gms.internal.play_billing.zzde zzdeVar = this.zza;
        if (zzdeVar == null || (zzczVar = zzdeVar.zzd) == null) {
            return;
        }
        this.zza = null;
        if (zzczVar.isDone()) {
            zzdeVar.zzj(zzczVar);
            return;
        }
        try {
            java.util.concurrent.ScheduledFuture scheduledFuture = zzdeVar.zze;
            zzdeVar.zze = null;
            java.lang.String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = java.lang.Math.abs(scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (java.lang.Throwable th) {
                    zzdeVar.zzi(new com.google.android.gms.internal.play_billing.zzdc(str, null));
                    throw th;
                }
            }
            zzdeVar.zzi(new com.google.android.gms.internal.play_billing.zzdc(str + ": " + zzczVar.toString(), null));
            zzczVar.cancel(true);
        } catch (java.lang.Throwable th2) {
            zzczVar.cancel(true);
            throw th2;
        }
    }
}
