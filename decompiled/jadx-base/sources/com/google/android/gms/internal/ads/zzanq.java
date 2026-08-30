package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzanq {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final com.google.android.gms.internal.ads.zzef zza = new com.google.android.gms.internal.ads.zzef(0);
    private long zzf = androidx.media3.common.C.TIME_UNSET;
    private long zzg = androidx.media3.common.C.TIME_UNSET;
    private long zzh = androidx.media3.common.C.TIME_UNSET;
    private final com.google.android.gms.internal.ads.zzdy zzb = new com.google.android.gms.internal.ads.zzdy();

    zzanq(int i) {
    }

    private final int zze(com.google.android.gms.internal.ads.zzaco zzacoVar) {
        byte[] bArr = com.google.android.gms.internal.ads.zzei.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzacoVar.zzj();
        return 0;
    }

    public final int zza(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar, int i) throws java.io.IOException {
        if (i <= 0) {
            zze(zzacoVar);
            return 0;
        }
        boolean z = this.zze;
        long j = androidx.media3.common.C.TIME_UNSET;
        if (!z) {
            long jZzd = zzacoVar.zzd();
            int iMin = (int) java.lang.Math.min(112800L, jZzd);
            long j2 = jZzd - ((long) iMin);
            if (zzacoVar.zzf() == j2) {
                this.zzb.zzI(iMin);
                zzacoVar.zzj();
                zzacoVar.zzh(this.zzb.zzN(), 0, iMin);
                com.google.android.gms.internal.ads.zzdy zzdyVar = this.zzb;
                int iZzd = zzdyVar.zzd();
                int iZze = zzdyVar.zze();
                for (int i2 = iZze - 188; i2 >= iZzd; i2--) {
                    byte[] bArrZzN = zzdyVar.zzN();
                    int i3 = 0;
                    for (int i4 = -4; i4 <= 4; i4++) {
                        int i5 = (i4 * 188) + i2;
                        if (i5 >= iZzd && i5 < iZze && bArrZzN[i5] == 71) {
                            i3++;
                            if (i3 == 5) {
                                long jZzb = com.google.android.gms.internal.ads.zzanz.zzb(zzdyVar, i2, i);
                                if (jZzb == androidx.media3.common.C.TIME_UNSET) {
                                    break;
                                }
                                j = jZzb;
                                break;
                            }
                        } else {
                            i3 = 0;
                        }
                    }
                }
                this.zzg = j;
                this.zze = true;
                return 0;
            }
            zzadjVar.zza = j2;
        } else {
            if (this.zzg == androidx.media3.common.C.TIME_UNSET) {
                zze(zzacoVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == androidx.media3.common.C.TIME_UNSET) {
                    zze(zzacoVar);
                    return 0;
                }
                com.google.android.gms.internal.ads.zzef zzefVar = this.zza;
                this.zzh = zzefVar.zzc(this.zzg) - zzefVar.zzb(j3);
                zze(zzacoVar);
                return 0;
            }
            int iMin2 = (int) java.lang.Math.min(112800L, zzacoVar.zzd());
            if (zzacoVar.zzf() == 0) {
                this.zzb.zzI(iMin2);
                zzacoVar.zzj();
                zzacoVar.zzh(this.zzb.zzN(), 0, iMin2);
                com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zzb;
                int iZze2 = zzdyVar2.zze();
                for (int iZzd2 = zzdyVar2.zzd(); iZzd2 < iZze2; iZzd2++) {
                    if (zzdyVar2.zzN()[iZzd2] == 71) {
                        long jZzb2 = com.google.android.gms.internal.ads.zzanz.zzb(zzdyVar2, iZzd2, i);
                        if (jZzb2 != androidx.media3.common.C.TIME_UNSET) {
                            j = jZzb2;
                            break;
                        }
                    }
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
            zzadjVar.zza = 0L;
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final com.google.android.gms.internal.ads.zzef zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
