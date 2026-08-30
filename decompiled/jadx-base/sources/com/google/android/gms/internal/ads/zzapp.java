package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzapp {
    private final java.util.concurrent.atomic.AtomicInteger zza;
    private final java.util.Set zzb;
    private final java.util.concurrent.PriorityBlockingQueue zzc;
    private final java.util.concurrent.PriorityBlockingQueue zzd;
    private final com.google.android.gms.internal.ads.zzaow zze;
    private final com.google.android.gms.internal.ads.zzapf zzf;
    private final com.google.android.gms.internal.ads.zzapg[] zzg;
    private com.google.android.gms.internal.ads.zzaoy zzh;
    private final java.util.List zzi;
    private final java.util.List zzj;
    private final com.google.android.gms.internal.ads.zzapd zzk;

    public zzapp(com.google.android.gms.internal.ads.zzaow zzaowVar, com.google.android.gms.internal.ads.zzapf zzapfVar, int i) {
        com.google.android.gms.internal.ads.zzapd zzapdVar = new com.google.android.gms.internal.ads.zzapd(new android.os.Handler(android.os.Looper.getMainLooper()));
        this.zza = new java.util.concurrent.atomic.AtomicInteger();
        this.zzb = new java.util.HashSet();
        this.zzc = new java.util.concurrent.PriorityBlockingQueue();
        this.zzd = new java.util.concurrent.PriorityBlockingQueue();
        this.zzi = new java.util.ArrayList();
        this.zzj = new java.util.ArrayList();
        this.zze = zzaowVar;
        this.zzf = zzapfVar;
        this.zzg = new com.google.android.gms.internal.ads.zzapg[4];
        this.zzk = zzapdVar;
    }

    public final com.google.android.gms.internal.ads.zzapm zza(com.google.android.gms.internal.ads.zzapm zzapmVar) {
        zzapmVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzapmVar);
        }
        zzapmVar.zzg(this.zza.incrementAndGet());
        zzapmVar.zzm("add-to-queue");
        zzc(zzapmVar, 0);
        this.zzc.add(zzapmVar);
        return zzapmVar;
    }

    final void zzb(com.google.android.gms.internal.ads.zzapm zzapmVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzapmVar);
        }
        synchronized (this.zzi) {
            java.util.Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.ads.zzapo) it.next()).zza();
            }
        }
        zzc(zzapmVar, 5);
    }

    final void zzc(com.google.android.gms.internal.ads.zzapm zzapmVar, int i) {
        synchronized (this.zzj) {
            java.util.Iterator it = this.zzj.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.ads.zzapn) it.next()).zza();
            }
        }
    }

    public final void zzd() {
        com.google.android.gms.internal.ads.zzaoy zzaoyVar = this.zzh;
        if (zzaoyVar != null) {
            zzaoyVar.zzb();
        }
        com.google.android.gms.internal.ads.zzapg[] zzapgVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            com.google.android.gms.internal.ads.zzapg zzapgVar = zzapgVarArr[i];
            if (zzapgVar != null) {
                zzapgVar.zza();
            }
        }
        com.google.android.gms.internal.ads.zzaoy zzaoyVar2 = new com.google.android.gms.internal.ads.zzaoy(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzaoyVar2;
        zzaoyVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            com.google.android.gms.internal.ads.zzapg zzapgVar2 = new com.google.android.gms.internal.ads.zzapg(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i2] = zzapgVar2;
            zzapgVar2.start();
        }
    }
}
