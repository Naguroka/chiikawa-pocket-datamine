package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgcq {
    private final com.google.android.gms.internal.ads.zzfvm zza = new com.google.android.gms.internal.ads.zzfvm();
    private final java.lang.String zzb;
    private volatile java.util.logging.Logger zzc;

    zzgcq(java.lang.Class cls) {
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
