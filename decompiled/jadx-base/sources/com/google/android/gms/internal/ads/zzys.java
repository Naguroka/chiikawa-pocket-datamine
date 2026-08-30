package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzys extends android.os.Handler implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzyy zza;
    private final com.google.android.gms.internal.ads.zzyt zzb;
    private final long zzc;
    private com.google.android.gms.internal.ads.zzyq zzd;
    private java.io.IOException zze;
    private int zzf;
    private java.lang.Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzys(com.google.android.gms.internal.ads.zzyy zzyyVar, android.os.Looper looper, com.google.android.gms.internal.ads.zzyt zzytVar, com.google.android.gms.internal.ads.zzyq zzyqVar, int i, long j) {
        super(looper);
        this.zza = zzyyVar;
        this.zzb = zzytVar;
        this.zzd = zzyqVar;
        this.zzc = j;
    }

    private final void zzd() {
        android.os.SystemClock.elapsedRealtime();
        this.zzd.getClass();
        this.zze = null;
        com.google.android.gms.internal.ads.zzyy zzyyVar = this.zza;
        com.google.android.gms.internal.ads.zzzg zzzgVar = zzyyVar.zzc;
        com.google.android.gms.internal.ads.zzys zzysVar = zzyyVar.zzd;
        zzysVar.getClass();
        zzzgVar.execute(zzysVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (this.zzi) {
            return;
        }
        if (message.what == 1) {
            zzd();
            return;
        }
        if (message.what == 4) {
            throw ((java.lang.Error) message.obj);
        }
        this.zza.zzd = null;
        long j = this.zzc;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - j;
        com.google.android.gms.internal.ads.zzyq zzyqVar = this.zzd;
        zzyqVar.getClass();
        if (this.zzh) {
            zzyqVar.zzJ(this.zzb, jElapsedRealtime, j2, false);
            return;
        }
        int i = message.what;
        if (i == 2) {
            try {
                zzyqVar.zzK(this.zzb, jElapsedRealtime, j2);
                return;
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.internal.ads.zzdo.zzd("LoadTask", "Unexpected exception handling load completed", e);
                this.zza.zze = new com.google.android.gms.internal.ads.zzyw(e);
                return;
            }
        }
        if (i != 3) {
            return;
        }
        java.io.IOException iOException = (java.io.IOException) message.obj;
        this.zze = iOException;
        int i2 = this.zzf + 1;
        this.zzf = i2;
        com.google.android.gms.internal.ads.zzyr zzyrVarZzu = zzyqVar.zzu(this.zzb, jElapsedRealtime, j2, iOException, i2);
        if (zzyrVarZzu.zza == 3) {
            this.zza.zze = this.zze;
        } else if (zzyrVarZzu.zza != 2) {
            if (zzyrVarZzu.zza == 1) {
                this.zzf = 1;
            }
            zzc(zzyrVarZzu.zzb != androidx.media3.common.C.TIME_UNSET ? zzyrVarZzu.zzb : java.lang.Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = java.lang.Thread.currentThread();
            }
            if (z) {
                android.os.Trace.beginSection("load:" + this.zzb.getClass().getSimpleName());
                try {
                    this.zzb.zzh();
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    android.os.Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                java.lang.Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (java.io.IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (java.lang.Error e2) {
            if (!this.zzi) {
                com.google.android.gms.internal.ads.zzdo.zzd("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(4, e2).sendToTarget();
            }
            throw e2;
        } catch (java.lang.Exception e3) {
            if (this.zzi) {
                return;
            }
            com.google.android.gms.internal.ads.zzdo.zzd("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(3, new com.google.android.gms.internal.ads.zzyw(e3)).sendToTarget();
        } catch (java.lang.OutOfMemoryError e4) {
            if (this.zzi) {
                return;
            }
            com.google.android.gms.internal.ads.zzdo.zzd("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(3, new com.google.android.gms.internal.ads.zzyw(e4)).sendToTarget();
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                java.lang.Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzd = null;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.google.android.gms.internal.ads.zzyq zzyqVar = this.zzd;
            zzyqVar.getClass();
            zzyqVar.zzJ(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i) throws java.io.IOException {
        java.io.IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zza.zzd == null);
        this.zza.zzd = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            zzd();
        }
    }
}
