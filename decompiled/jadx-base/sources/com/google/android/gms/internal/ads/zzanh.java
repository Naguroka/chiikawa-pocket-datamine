package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzanh {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final com.google.android.gms.internal.ads.zzef zza = new com.google.android.gms.internal.ads.zzef(0);
    private long zzf = androidx.media3.common.C.TIME_UNSET;
    private long zzg = androidx.media3.common.C.TIME_UNSET;
    private long zzh = androidx.media3.common.C.TIME_UNSET;
    private final com.google.android.gms.internal.ads.zzdy zzb = new com.google.android.gms.internal.ads.zzdy();

    zzanh() {
    }

    public static long zzc(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int iZzd = zzdyVar.zzd();
        if (zzdyVar.zzb() < 9) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        zzdyVar.zzH(bArr, 0, 9);
        zzdyVar.zzL(iZzd);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    private final int zzf(com.google.android.gms.internal.ads.zzaco zzacoVar) {
        byte[] bArr = com.google.android.gms.internal.ads.zzei.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzacoVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        boolean z = this.zze;
        long j = androidx.media3.common.C.TIME_UNSET;
        if (!z) {
            long jZzd = zzacoVar.zzd();
            int iMin = (int) java.lang.Math.min(20000L, jZzd);
            long j2 = jZzd - ((long) iMin);
            if (zzacoVar.zzf() != j2) {
                zzadjVar.zza = j2;
                return 1;
            }
            this.zzb.zzI(iMin);
            zzacoVar.zzj();
            zzacoVar.zzh(this.zzb.zzN(), 0, iMin);
            com.google.android.gms.internal.ads.zzdy zzdyVar = this.zzb;
            int iZzd = zzdyVar.zzd();
            for (int iZze = zzdyVar.zze() - 4; iZze >= iZzd; iZze--) {
                if (zzg(zzdyVar.zzN(), iZze) == 442) {
                    zzdyVar.zzL(iZze + 4);
                    long jZzc = zzc(zzdyVar);
                    if (jZzc != androidx.media3.common.C.TIME_UNSET) {
                        j = jZzc;
                        break;
                    }
                }
            }
            this.zzg = j;
            this.zze = true;
        } else {
            if (this.zzg == androidx.media3.common.C.TIME_UNSET) {
                zzf(zzacoVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == androidx.media3.common.C.TIME_UNSET) {
                    zzf(zzacoVar);
                    return 0;
                }
                com.google.android.gms.internal.ads.zzef zzefVar = this.zza;
                this.zzh = zzefVar.zzc(this.zzg) - zzefVar.zzb(j3);
                zzf(zzacoVar);
                return 0;
            }
            int iMin2 = (int) java.lang.Math.min(20000L, zzacoVar.zzd());
            if (zzacoVar.zzf() != 0) {
                zzadjVar.zza = 0L;
                return 1;
            }
            this.zzb.zzI(iMin2);
            zzacoVar.zzj();
            zzacoVar.zzh(this.zzb.zzN(), 0, iMin2);
            com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zzb;
            int iZze2 = zzdyVar2.zze();
            for (int iZzd2 = zzdyVar2.zzd(); iZzd2 < iZze2 - 3; iZzd2++) {
                if (zzg(zzdyVar2.zzN(), iZzd2) == 442) {
                    zzdyVar2.zzL(iZzd2 + 4);
                    long jZzc2 = zzc(zzdyVar2);
                    if (jZzc2 != androidx.media3.common.C.TIME_UNSET) {
                        j = jZzc2;
                        break;
                    }
                }
            }
            this.zzf = j;
            this.zzd = true;
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final com.google.android.gms.internal.ads.zzef zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
