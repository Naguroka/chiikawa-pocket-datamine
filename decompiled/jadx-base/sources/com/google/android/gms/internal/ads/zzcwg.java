package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcwg extends com.google.android.gms.internal.ads.zzdbj implements com.google.android.gms.internal.ads.zzcvx {
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private java.util.concurrent.ScheduledFuture zzc;
    private boolean zzd;

    public zzcwg(com.google.android.gms.internal.ads.zzcwf zzcwfVar, java.util.Set set, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        super.zzo(zzcwfVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzcvy
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzcvx) obj).zza(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zzb() {
        zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzcvz
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzcvx) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zzc(final com.google.android.gms.internal.ads.zzdgb zzdgbVar) {
        if (this.zzd) {
            return;
        }
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzcwb
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzcvx) obj).zzc(zzdgbVar);
            }
        });
    }

    final /* synthetic */ void zzd() {
        synchronized (this) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new com.google.android.gms.internal.ads.zzdgb("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcwa
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        }, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkB)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
