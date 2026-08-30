package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaoy extends java.lang.Thread {
    private static final boolean zza = com.google.android.gms.internal.ads.zzapy.zzb;
    private final java.util.concurrent.BlockingQueue zzb;
    private final java.util.concurrent.BlockingQueue zzc;
    private final com.google.android.gms.internal.ads.zzaow zzd;
    private volatile boolean zze = false;
    private final com.google.android.gms.internal.ads.zzapz zzf;
    private final com.google.android.gms.internal.ads.zzapd zzg;

    public zzaoy(java.util.concurrent.BlockingQueue blockingQueue, java.util.concurrent.BlockingQueue blockingQueue2, com.google.android.gms.internal.ads.zzaow zzaowVar, com.google.android.gms.internal.ads.zzapd zzapdVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaowVar;
        this.zzg = zzapdVar;
        this.zzf = new com.google.android.gms.internal.ads.zzapz(this, blockingQueue2, zzapdVar);
    }

    private void zzc() throws java.lang.InterruptedException {
        com.google.android.gms.internal.ads.zzapm zzapmVar = (com.google.android.gms.internal.ads.zzapm) this.zzb.take();
        zzapmVar.zzm("cache-queue-take");
        zzapmVar.zzt(1);
        try {
            zzapmVar.zzw();
            com.google.android.gms.internal.ads.zzaov zzaovVarZza = this.zzd.zza(zzapmVar.zzj());
            if (zzaovVarZza == null) {
                zzapmVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzapmVar)) {
                    this.zzc.put(zzapmVar);
                }
            } else {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (zzaovVarZza.zza(jCurrentTimeMillis)) {
                    zzapmVar.zzm("cache-hit-expired");
                    zzapmVar.zze(zzaovVarZza);
                    if (!this.zzf.zzc(zzapmVar)) {
                        this.zzc.put(zzapmVar);
                    }
                } else {
                    zzapmVar.zzm("cache-hit");
                    com.google.android.gms.internal.ads.zzaps zzapsVarZzh = zzapmVar.zzh(new com.google.android.gms.internal.ads.zzapi(zzaovVarZza.zza, zzaovVarZza.zzg));
                    zzapmVar.zzm("cache-hit-parsed");
                    if (!zzapsVarZzh.zzc()) {
                        zzapmVar.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzapmVar.zzj(), true);
                        zzapmVar.zze(null);
                        if (!this.zzf.zzc(zzapmVar)) {
                            this.zzc.put(zzapmVar);
                        }
                    } else if (zzaovVarZza.zzf < jCurrentTimeMillis) {
                        zzapmVar.zzm("cache-hit-refresh-needed");
                        zzapmVar.zze(zzaovVarZza);
                        zzapsVarZzh.zzd = true;
                        if (this.zzf.zzc(zzapmVar)) {
                            this.zzg.zzb(zzapmVar, zzapsVarZzh, null);
                        } else {
                            this.zzg.zzb(zzapmVar, zzapsVarZzh, new com.google.android.gms.internal.ads.zzaox(this, zzapmVar));
                        }
                    } else {
                        this.zzg.zzb(zzapmVar, zzapsVarZzh, null);
                    }
                }
            }
        } finally {
            zzapmVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            com.google.android.gms.internal.ads.zzapy.zzd("start new dispatcher", new java.lang.Object[0]);
        }
        android.os.Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (java.lang.InterruptedException unused) {
                if (this.zze) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
                com.google.android.gms.internal.ads.zzapy.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new java.lang.Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
