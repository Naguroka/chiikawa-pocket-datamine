package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzaz {
    private static volatile android.os.Handler zza;
    private final com.google.android.gms.measurement.internal.zzjs zzb;
    private final java.lang.Runnable zzc;
    private volatile long zzd;

    zzaz(com.google.android.gms.measurement.internal.zzjs zzjsVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjsVar);
        this.zzb = zzjsVar;
        this.zzc = new com.google.android.gms.measurement.internal.zzay(this, zzjsVar);
    }

    private final android.os.Handler zzf() {
        android.os.Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (com.google.android.gms.measurement.internal.zzaz.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.measurement.zzcr(this.zzb.zzaT().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    final void zzb() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j) {
        zzb();
        if (j >= 0) {
            com.google.android.gms.measurement.internal.zzjs zzjsVar = this.zzb;
            this.zzd = zzjsVar.zzaU().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j)) {
                return;
            }
            zzjsVar.zzaW().zze().zzb("Failed to schedule delayed post. time", java.lang.Long.valueOf(j));
        }
    }

    public final boolean zze() {
        return this.zzd != 0;
    }
}
