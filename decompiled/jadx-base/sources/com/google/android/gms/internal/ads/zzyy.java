package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzyy {
    public static final com.google.android.gms.internal.ads.zzyr zza = new com.google.android.gms.internal.ads.zzyr(2, androidx.media3.common.C.TIME_UNSET, null);
    public static final com.google.android.gms.internal.ads.zzyr zzb = new com.google.android.gms.internal.ads.zzyr(3, androidx.media3.common.C.TIME_UNSET, null);
    private final com.google.android.gms.internal.ads.zzzg zzc;
    private com.google.android.gms.internal.ads.zzys zzd;
    private java.io.IOException zze;

    public zzyy(java.lang.String str) {
        final java.lang.String str2 = "ExoPlayer:Loader:ProgressiveMediaPeriod";
        this.zzc = com.google.android.gms.internal.ads.zzze.zza(java.util.concurrent.Executors.newSingleThreadExecutor(new java.util.concurrent.ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.zzeg
            public final /* synthetic */ java.lang.String zza = "ExoPlayer:Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return new java.lang.Thread(runnable, this.zza);
            }
        }), new com.google.android.gms.internal.ads.zzdb() { // from class: com.google.android.gms.internal.ads.zzyp
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(java.lang.Object obj) {
                ((java.util.concurrent.ExecutorService) obj).shutdown();
            }
        });
    }

    public static com.google.android.gms.internal.ads.zzyr zzb(boolean z, long j) {
        return new com.google.android.gms.internal.ads.zzyr(z ? 1 : 0, j, null);
    }

    public final long zza(com.google.android.gms.internal.ads.zzyt zzytVar, com.google.android.gms.internal.ads.zzyq zzyqVar, int i) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        com.google.android.gms.internal.ads.zzcw.zzb(looperMyLooper);
        this.zze = null;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        new com.google.android.gms.internal.ads.zzys(this, looperMyLooper, zzytVar, zzyqVar, i, jElapsedRealtime).zzc(0L);
        return jElapsedRealtime;
    }

    public final void zzg() {
        com.google.android.gms.internal.ads.zzys zzysVar = this.zzd;
        com.google.android.gms.internal.ads.zzcw.zzb(zzysVar);
        zzysVar.zza(false);
    }

    public final void zzh() {
        this.zze = null;
    }

    public final void zzi(int i) throws java.io.IOException {
        java.io.IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        com.google.android.gms.internal.ads.zzys zzysVar = this.zzd;
        if (zzysVar != null) {
            zzysVar.zzb(i);
        }
    }

    public final void zzj(com.google.android.gms.internal.ads.zzyu zzyuVar) {
        com.google.android.gms.internal.ads.zzys zzysVar = this.zzd;
        if (zzysVar != null) {
            zzysVar.zza(true);
        }
        this.zzc.execute(new com.google.android.gms.internal.ads.zzyv(zzyuVar));
        this.zzc.zza();
    }

    public final boolean zzk() {
        return this.zze != null;
    }

    public final boolean zzl() {
        return this.zzd != null;
    }
}
