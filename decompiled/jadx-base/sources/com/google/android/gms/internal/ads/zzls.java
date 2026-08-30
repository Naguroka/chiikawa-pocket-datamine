package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzls implements com.google.android.gms.internal.ads.zzkk {
    private boolean zza;
    private long zzb;
    private long zzc;
    private com.google.android.gms.internal.ads.zzbe zzd = com.google.android.gms.internal.ads.zzbe.zza;

    public zzls(com.google.android.gms.internal.ads.zzcx zzcxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final long zza() {
        long j = this.zzb;
        if (!this.zza) {
            return j;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.zzc;
        com.google.android.gms.internal.ads.zzbe zzbeVar = this.zzd;
        return j + (zzbeVar.zzb == 1.0f ? com.google.android.gms.internal.ads.zzei.zzs(jElapsedRealtime) : zzbeVar.zza(jElapsedRealtime));
    }

    public final void zzb(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final com.google.android.gms.internal.ads.zzbe zzc() {
        return this.zzd;
    }

    public final void zzd() {
        if (this.zza) {
            return;
        }
        this.zzc = android.os.SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zze() {
        if (this.zza) {
            zzb(zza());
            this.zza = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzg(com.google.android.gms.internal.ads.zzbe zzbeVar) {
        if (this.zza) {
            zzb(zza());
        }
        this.zzd = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ boolean zzj() {
        return false;
    }
}
