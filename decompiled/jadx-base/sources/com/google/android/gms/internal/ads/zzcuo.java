package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcuo implements com.google.android.gms.internal.ads.zzcvt, com.google.android.gms.internal.ads.zzdcx, com.google.android.gms.internal.ads.zzdan, com.google.android.gms.internal.ads.zzcwj, com.google.android.gms.internal.ads.zzayk {
    private final com.google.android.gms.internal.ads.zzcwl zza;
    private final com.google.android.gms.internal.ads.zzfbo zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final java.util.concurrent.Executor zzd;
    private java.util.concurrent.ScheduledFuture zzf;
    private final java.lang.String zzh;
    private final com.google.android.gms.internal.ads.zzgdb zze = com.google.android.gms.internal.ads.zzgdb.zze();
    private final java.util.concurrent.atomic.AtomicBoolean zzg = new java.util.concurrent.atomic.AtomicBoolean();

    zzcuo(com.google.android.gms.internal.ads.zzcwl zzcwlVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor, java.lang.String str) {
        this.zza = zzcwlVar;
        this.zzb = zzfboVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        return this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzb;
        if (zzfboVar.zze == 3) {
            return;
        }
        int i = zzfboVar.zzY;
        if (i == 0 || i == 1) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlp)).booleanValue() && zzm()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(com.google.android.gms.internal.ads.zzayj zzayjVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlp)).booleanValue() && zzm() && zzayjVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(com.google.android.gms.internal.ads.zzbvw zzbvwVar, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
    }

    final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzc(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final synchronized void zzj() {
        if (this.zze.isDone()) {
            return;
        }
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzc(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzk() {
        if (this.zzb.zze == 3) {
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbE)).booleanValue()) {
            com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzb;
            if (zzfboVar.zzY == 2) {
                if (zzfboVar.zzq == 0) {
                    this.zza.zza();
                } else {
                    com.google.android.gms.internal.ads.zzgch.zzr(this.zze, new com.google.android.gms.internal.ads.zzcun(this), this.zzd);
                    this.zzf = this.zzc.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcum
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzh();
                        }
                    }, this.zzb.zzq, java.util.concurrent.TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final synchronized void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zze.isDone()) {
            return;
        }
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(new java.lang.Exception());
    }
}
