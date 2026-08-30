package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzahx implements com.google.android.gms.internal.ads.zzahu {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzahx(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = i2;
        this.zze = j3;
        this.zzg = jArr;
        this.zzf = j3 != -1 ? j + j3 : -1L;
    }

    public static com.google.android.gms.internal.ads.zzahx zzb(com.google.android.gms.internal.ads.zzahw zzahwVar, long j) {
        long[] jArr;
        long jZza = zzahwVar.zza();
        if (jZza == androidx.media3.common.C.TIME_UNSET) {
            return null;
        }
        long j2 = zzahwVar.zzc;
        if (j2 == -1 || (jArr = zzahwVar.zzf) == null) {
            com.google.android.gms.internal.ads.zzadf zzadfVar = zzahwVar.zza;
            return new com.google.android.gms.internal.ads.zzahx(j, zzadfVar.zzc, jZza, zzadfVar.zzf, -1L, null);
        }
        com.google.android.gms.internal.ads.zzadf zzadfVar2 = zzahwVar.zza;
        return new com.google.android.gms.internal.ads.zzahx(j, zzadfVar2.zzc, jZza, zzadfVar2.zzf, j2, jArr);
    }

    private final long zzf(int i) {
        return (this.zzc * ((long) i)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zze(long j) {
        if (!zzh()) {
            return 0L;
        }
        long j2 = j - this.zza;
        if (j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        com.google.android.gms.internal.ads.zzcw.zzb(jArr);
        double d = (j2 * 256.0d) / this.zze;
        long[] jArr2 = jArr;
        int iZzd = com.google.android.gms.internal.ads.zzei.zzd(jArr2, (long) d, true, true);
        long jZzf = zzf(iZzd);
        long j3 = jArr2[iZzd];
        int i = iZzd + 1;
        long jZzf2 = zzf(i);
        long j4 = iZzd == 99 ? 256L : jArr2[i];
        return jZzf + java.lang.Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (jZzf2 - jZzf));
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        if (!zzh()) {
            com.google.android.gms.internal.ads.zzadn zzadnVar = new com.google.android.gms.internal.ads.zzadn(0L, this.zza + ((long) this.zzb));
            return new com.google.android.gms.internal.ads.zzadk(zzadnVar, zzadnVar);
        }
        long jMax = java.lang.Math.max(0L, java.lang.Math.min(j, this.zzc));
        double d = (jMax * 100.0d) / this.zzc;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzg;
                com.google.android.gms.internal.ads.zzcw.zzb(jArr);
                long[] jArr2 = jArr;
                double d3 = jArr2[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr2[i + 1]) - d3));
            }
        }
        long j2 = this.zze;
        com.google.android.gms.internal.ads.zzadn zzadnVar2 = new com.google.android.gms.internal.ads.zzadn(jMax, this.zza + java.lang.Math.max(this.zzb, java.lang.Math.min(java.lang.Math.round((d2 / 256.0d) * j2), j2 - 1)));
        return new com.google.android.gms.internal.ads.zzadk(zzadnVar2, zzadnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return this.zzg != null;
    }
}
