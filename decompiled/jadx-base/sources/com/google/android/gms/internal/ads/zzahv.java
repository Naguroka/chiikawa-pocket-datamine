package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzahv implements com.google.android.gms.internal.ads.zzahu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzahv(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
    }

    public static com.google.android.gms.internal.ads.zzahv zzb(long j, long j2, com.google.android.gms.internal.ads.zzadf zzadfVar, com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int iZzm;
        zzdyVar.zzM(10);
        int iZzg = zzdyVar.zzg();
        if (iZzg <= 0) {
            return null;
        }
        int i = zzadfVar.zzd;
        long jZzu = com.google.android.gms.internal.ads.zzei.zzu(iZzg, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i, java.math.RoundingMode.DOWN);
        int iZzq = zzdyVar.zzq();
        int iZzq2 = zzdyVar.zzq();
        int iZzq3 = zzdyVar.zzq();
        zzdyVar.zzM(2);
        long j3 = j2 + ((long) zzadfVar.zzc);
        long[] jArr = new long[iZzq];
        long[] jArr2 = new long[iZzq];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iZzq) {
            long j5 = jZzu;
            jArr[i2] = (((long) i2) * jZzu) / ((long) iZzq);
            jArr2[i2] = java.lang.Math.max(j4, j3);
            if (iZzq3 == 1) {
                iZzm = zzdyVar.zzm();
            } else if (iZzq3 == 2) {
                iZzm = zzdyVar.zzq();
            } else if (iZzq3 == 3) {
                iZzm = zzdyVar.zzo();
            } else {
                if (iZzq3 != 4) {
                    return null;
                }
                iZzm = zzdyVar.zzp();
            }
            j4 += ((long) iZzm) * ((long) iZzq2);
            i2++;
            jZzu = j5;
        }
        long j6 = jZzu;
        if (j != -1 && j != j4) {
            com.google.android.gms.internal.ads.zzdo.zzf("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new com.google.android.gms.internal.ads.zzahv(jArr, jArr2, j6, j4, zzadfVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zze(long j) {
        return this.zza[com.google.android.gms.internal.ads.zzei.zzd(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        long[] jArr = this.zza;
        int iZzd = com.google.android.gms.internal.ads.zzei.zzd(jArr, j, true, true);
        com.google.android.gms.internal.ads.zzadn zzadnVar = new com.google.android.gms.internal.ads.zzadn(jArr[iZzd], this.zzb[iZzd]);
        if (zzadnVar.zzb < j) {
            long[] jArr2 = this.zza;
            if (iZzd != jArr2.length - 1) {
                int i = iZzd + 1;
                return new com.google.android.gms.internal.ads.zzadk(zzadnVar, new com.google.android.gms.internal.ads.zzadn(jArr2[i], this.zzb[i]));
            }
        }
        return new com.google.android.gms.internal.ads.zzadk(zzadnVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
