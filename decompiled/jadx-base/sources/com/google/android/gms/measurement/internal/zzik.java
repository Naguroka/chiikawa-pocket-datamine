package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzik extends java.lang.Thread {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzil zza;
    private final java.lang.Object zzb;
    private final java.util.concurrent.BlockingQueue zzc;
    private boolean zzd = false;

    public zzik(com.google.android.gms.measurement.internal.zzil zzilVar, java.lang.String str, java.util.concurrent.BlockingQueue blockingQueue) {
        this.zza = zzilVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(blockingQueue);
        this.zzb = new java.lang.Object();
        this.zzc = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        com.google.android.gms.measurement.internal.zzil zzilVar = this.zza;
        synchronized (zzilVar.zzh) {
            if (!this.zzd) {
                zzilVar.zzi.release();
                zzilVar.zzh.notifyAll();
                if (this == zzilVar.zzb) {
                    zzilVar.zzb = null;
                } else if (this == zzilVar.zzc) {
                    zzilVar.zzc = null;
                } else {
                    zzilVar.zzu.zzaW().zze().zza("Current scheduler thread is neither worker nor network");
                }
                this.zzd = true;
            }
        }
    }

    private final void zzc(java.lang.InterruptedException interruptedException) {
        this.zza.zzu.zzaW().zzk().zzb(java.lang.String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.zza.zzi.acquire();
                z = true;
            } catch (java.lang.InterruptedException e) {
                zzc(e);
            }
        }
        try {
            int threadPriority = android.os.Process.getThreadPriority(android.os.Process.myTid());
            while (true) {
                java.util.concurrent.BlockingQueue blockingQueue = this.zzc;
                com.google.android.gms.measurement.internal.zzij zzijVar = (com.google.android.gms.measurement.internal.zzij) blockingQueue.poll();
                if (zzijVar != null) {
                    android.os.Process.setThreadPriority(true != zzijVar.zza ? 10 : threadPriority);
                    zzijVar.run();
                } else {
                    java.lang.Object obj = this.zzb;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            com.google.android.gms.measurement.internal.zzil.zzs(this.zza);
                            try {
                                obj.wait(30000L);
                            } catch (java.lang.InterruptedException e2) {
                                zzc(e2);
                            }
                        }
                    }
                    synchronized (this.zza.zzh) {
                        if (this.zzc.peek() == null) {
                            zzb();
                            zzb();
                            return;
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            zzb();
            throw th;
        }
    }

    public final void zza() {
        java.lang.Object obj = this.zzb;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
