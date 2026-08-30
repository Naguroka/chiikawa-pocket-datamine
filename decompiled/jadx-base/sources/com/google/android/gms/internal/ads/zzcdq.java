package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcdq implements com.google.android.gms.internal.ads.zzkg {
    private final com.google.android.gms.internal.ads.zzyk zza = new com.google.android.gms.internal.ads.zzyk(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US;
    private int zzf;
    private boolean zzg;

    zzcdq() {
    }

    final void zza(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final long zzb(com.google.android.gms.internal.ads.zzog zzogVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzc(com.google.android.gms.internal.ads.zzog zzogVar) {
        zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzd(com.google.android.gms.internal.ads.zzog zzogVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zze(com.google.android.gms.internal.ads.zzog zzogVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzf(com.google.android.gms.internal.ads.zzkf zzkfVar, com.google.android.gms.internal.ads.zzwj zzwjVar, com.google.android.gms.internal.ads.zzxv[] zzxvVarArr) {
        int i;
        this.zzf = 0;
        for (com.google.android.gms.internal.ads.zzxv zzxvVar : zzxvVarArr) {
            if (zzxvVar != null) {
                int i2 = this.zzf;
                int i3 = zzxvVar.zzg().zzc;
                if (i3 == 0) {
                    i = androidx.media3.exoplayer.DefaultLoadControl.DEFAULT_MUXED_BUFFER_SIZE;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        throw new java.lang.IllegalArgumentException();
                    }
                } else {
                    i = androidx.media3.exoplayer.DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
                }
                this.zzf = i2 + i;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzg(com.google.android.gms.internal.ads.zzog zzogVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzh(com.google.android.gms.internal.ads.zzkf zzkfVar) {
        char c;
        long j = zzkfVar.zzb;
        boolean z = true;
        if (j > this.zzc) {
            c = 0;
        } else {
            c = j < this.zzb ? (char) 2 : (char) 1;
        }
        int iZza = this.zza.zza();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || iZza >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final /* synthetic */ boolean zzi(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzug zzugVar, long j) {
        com.google.android.gms.internal.ads.zzdo.zzf("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzj(com.google.android.gms.internal.ads.zzkf zzkfVar) {
        long j = zzkfVar.zzd ? this.zze : this.zzd;
        return j <= 0 || zzkfVar.zzb >= j;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final com.google.android.gms.internal.ads.zzyk zzk() {
        return this.zza;
    }

    public final synchronized void zzl(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zze = ((long) i) * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzo(int i) {
        this.zzb = ((long) i) * 1000;
    }
}
