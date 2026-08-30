package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzapg extends java.lang.Thread {
    private final java.util.concurrent.BlockingQueue zza;
    private final com.google.android.gms.internal.ads.zzapf zzb;
    private final com.google.android.gms.internal.ads.zzaow zzc;
    private volatile boolean zzd = false;
    private final com.google.android.gms.internal.ads.zzapd zze;

    public zzapg(java.util.concurrent.BlockingQueue blockingQueue, com.google.android.gms.internal.ads.zzapf zzapfVar, com.google.android.gms.internal.ads.zzaow zzaowVar, com.google.android.gms.internal.ads.zzapd zzapdVar) {
        this.zza = blockingQueue;
        this.zzb = zzapfVar;
        this.zzc = zzaowVar;
        this.zze = zzapdVar;
    }

    private void zzb() throws java.lang.InterruptedException {
        com.google.android.gms.internal.ads.zzapm zzapmVar = (com.google.android.gms.internal.ads.zzapm) this.zza.take();
        android.os.SystemClock.elapsedRealtime();
        zzapmVar.zzt(3);
        try {
            try {
                zzapmVar.zzm("network-queue-take");
                zzapmVar.zzw();
                android.net.TrafficStats.setThreadStatsTag(zzapmVar.zzc());
                com.google.android.gms.internal.ads.zzapi zzapiVarZza = this.zzb.zza(zzapmVar);
                zzapmVar.zzm("network-http-complete");
                if (zzapiVarZza.zze && zzapmVar.zzv()) {
                    zzapmVar.zzp("not-modified");
                    zzapmVar.zzr();
                } else {
                    com.google.android.gms.internal.ads.zzaps zzapsVarZzh = zzapmVar.zzh(zzapiVarZza);
                    zzapmVar.zzm("network-parse-complete");
                    if (zzapsVarZzh.zzb != null) {
                        this.zzc.zzd(zzapmVar.zzj(), zzapsVarZzh.zzb);
                        zzapmVar.zzm("network-cache-written");
                    }
                    zzapmVar.zzq();
                    this.zze.zzb(zzapmVar, zzapsVarZzh, null);
                    zzapmVar.zzs(zzapsVarZzh);
                }
            } catch (com.google.android.gms.internal.ads.zzapv e) {
                android.os.SystemClock.elapsedRealtime();
                this.zze.zza(zzapmVar, e);
                zzapmVar.zzr();
            } catch (java.lang.Exception e2) {
                com.google.android.gms.internal.ads.zzapy.zzc(e2, "Unhandled exception %s", e2.toString());
                com.google.android.gms.internal.ads.zzapv zzapvVar = new com.google.android.gms.internal.ads.zzapv(e2);
                android.os.SystemClock.elapsedRealtime();
                this.zze.zza(zzapmVar, zzapvVar);
                zzapmVar.zzr();
            }
        } finally {
            zzapmVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (java.lang.InterruptedException unused) {
                if (this.zzd) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
                com.google.android.gms.internal.ads.zzapy.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new java.lang.Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
