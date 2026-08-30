package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcy {
    private final com.google.android.gms.internal.play_billing.zzbm zza = new com.google.android.gms.internal.play_billing.zzbm();
    private final java.lang.String zzb;
    private volatile java.util.logging.Logger zzc;

    zzcy(java.lang.Class cls) {
        this.zzb = cls.getName();
    }

    final java.util.logging.Logger zza() {
        java.util.logging.Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            java.util.logging.Logger logger2 = this.zzc;
            if (logger2 != null) {
                return logger2;
            }
            java.util.logging.Logger logger3 = java.util.logging.Logger.getLogger(this.zzb);
            this.zzc = logger3;
            return logger3;
        }
    }
}
