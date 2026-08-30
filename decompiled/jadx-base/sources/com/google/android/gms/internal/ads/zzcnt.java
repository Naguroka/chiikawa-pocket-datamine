package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcnt implements com.google.android.gms.internal.ads.zzazd {
    private final java.util.concurrent.ScheduledExecutorService zza;
    private final com.google.android.gms.common.util.Clock zzb;
    private java.util.concurrent.ScheduledFuture zzc;
    private long zzd = -1;
    private long zze = -1;
    private java.lang.Runnable zzf = null;
    private boolean zzg = false;

    public zzcnt(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.Clock clock) {
        this.zza = scheduledExecutorService;
        this.zzb = clock;
        com.google.android.gms.ads.internal.zzv.zzb().zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final void zza(boolean z) {
        if (z) {
            zzc();
        } else {
            zzb();
        }
    }

    final synchronized void zzb() {
        if (this.zzg) {
            return;
        }
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.zze = -1L;
        } else {
            this.zzc.cancel(true);
            this.zze = this.zzd - this.zzb.elapsedRealtime();
        }
        this.zzg = true;
    }

    final synchronized void zzc() {
        java.util.concurrent.ScheduledFuture scheduledFuture;
        if (this.zzg) {
            if (this.zze > 0 && (scheduledFuture = this.zzc) != null && scheduledFuture.isCancelled()) {
                this.zzc = this.zza.schedule(this.zzf, this.zze, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            this.zzg = false;
        }
    }

    public final synchronized void zzd(int i, java.lang.Runnable runnable) {
        this.zzf = runnable;
        long j = i;
        this.zzd = this.zzb.elapsedRealtime() + j;
        this.zzc = this.zza.schedule(runnable, j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
