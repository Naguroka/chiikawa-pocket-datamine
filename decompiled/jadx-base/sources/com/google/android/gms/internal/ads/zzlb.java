package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzlb {
    private static final com.google.android.gms.internal.ads.zzug zzu = new com.google.android.gms.internal.ads.zzug(new java.lang.Object(), -1);
    public final com.google.android.gms.internal.ads.zzbq zza;
    public final com.google.android.gms.internal.ads.zzug zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final com.google.android.gms.internal.ads.zzib zzf;
    public final boolean zzg;
    public final com.google.android.gms.internal.ads.zzwj zzh;
    public final com.google.android.gms.internal.ads.zzyc zzi;
    public final java.util.List zzj;
    public final com.google.android.gms.internal.ads.zzug zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final com.google.android.gms.internal.ads.zzbe zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzlb(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzug zzugVar, long j, long j2, int i, com.google.android.gms.internal.ads.zzib zzibVar, boolean z, com.google.android.gms.internal.ads.zzwj zzwjVar, com.google.android.gms.internal.ads.zzyc zzycVar, java.util.List list, com.google.android.gms.internal.ads.zzug zzugVar2, boolean z2, int i2, int i3, com.google.android.gms.internal.ads.zzbe zzbeVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzbqVar;
        this.zzb = zzugVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzibVar;
        this.zzg = z;
        this.zzh = zzwjVar;
        this.zzi = zzycVar;
        this.zzj = list;
        this.zzk = zzugVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = i3;
        this.zzo = zzbeVar;
        this.zzq = j3;
        this.zzr = j4;
        this.zzs = j5;
        this.zzt = j6;
    }

    public static com.google.android.gms.internal.ads.zzlb zzg(com.google.android.gms.internal.ads.zzyc zzycVar) {
        com.google.android.gms.internal.ads.zzbq zzbqVar = com.google.android.gms.internal.ads.zzbq.zza;
        com.google.android.gms.internal.ads.zzug zzugVar = zzu;
        return new com.google.android.gms.internal.ads.zzlb(zzbqVar, zzugVar, androidx.media3.common.C.TIME_UNSET, 0L, 1, null, false, com.google.android.gms.internal.ads.zzwj.zza, zzycVar, com.google.android.gms.internal.ads.zzfxn.zzn(), zzugVar, false, 1, 0, com.google.android.gms.internal.ads.zzbe.zza, 0L, 0L, 0L, 0L, false);
    }

    public static com.google.android.gms.internal.ads.zzug zzh() {
        return zzu;
    }

    public final com.google.android.gms.internal.ads.zzlb zza(com.google.android.gms.internal.ads.zzug zzugVar) {
        return new com.google.android.gms.internal.ads.zzlb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzugVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final com.google.android.gms.internal.ads.zzlb zzb(com.google.android.gms.internal.ads.zzug zzugVar, long j, long j2, long j3, long j4, com.google.android.gms.internal.ads.zzwj zzwjVar, com.google.android.gms.internal.ads.zzyc zzycVar, java.util.List list) {
        com.google.android.gms.internal.ads.zzug zzugVar2 = this.zzk;
        boolean z = this.zzl;
        int i = this.zzm;
        int i2 = this.zzn;
        com.google.android.gms.internal.ads.zzbe zzbeVar = this.zzo;
        long j5 = this.zzq;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        return new com.google.android.gms.internal.ads.zzlb(this.zza, zzugVar, j2, j3, this.zze, this.zzf, this.zzg, zzwjVar, zzycVar, list, zzugVar2, z, i, i2, zzbeVar, j5, j4, j, jElapsedRealtime, false);
    }

    public final com.google.android.gms.internal.ads.zzlb zzc(boolean z, int i, int i2) {
        return new com.google.android.gms.internal.ads.zzlb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, i2, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final com.google.android.gms.internal.ads.zzlb zzd(com.google.android.gms.internal.ads.zzib zzibVar) {
        return new com.google.android.gms.internal.ads.zzlb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzibVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final com.google.android.gms.internal.ads.zzlb zze(int i) {
        return new com.google.android.gms.internal.ads.zzlb(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final com.google.android.gms.internal.ads.zzlb zzf(com.google.android.gms.internal.ads.zzbq zzbqVar) {
        return new com.google.android.gms.internal.ads.zzlb(zzbqVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzi() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
