package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaja {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, androidx.media3.extractor.mp4.Atom.TYPE_avc1, androidx.media3.extractor.mp4.Atom.TYPE_hvc1, androidx.media3.extractor.mp4.Atom.TYPE_hev1, androidx.media3.extractor.mp4.Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, androidx.media3.extractor.mp4.Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    public static com.google.android.gms.internal.ads.zzadq zza(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        return zzc(zzacoVar, true, false);
    }

    public static com.google.android.gms.internal.ads.zzadq zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, boolean z) throws java.io.IOException {
        return zzc(zzacoVar, false, z);
    }

    private static com.google.android.gms.internal.ads.zzadq zzc(com.google.android.gms.internal.ads.zzaco zzacoVar, boolean z, boolean z2) throws java.io.IOException {
        int i;
        com.google.android.gms.internal.ads.zzdy zzdyVar;
        int i2;
        int[] iArr;
        long jZzd = zzacoVar.zzd();
        long j = -1;
        long j2 = 4096;
        if (jZzd != -1 && jZzd <= 4096) {
            j2 = jZzd;
        }
        com.google.android.gms.internal.ads.zzdy zzdyVar2 = new com.google.android.gms.internal.ads.zzdy(64);
        int i3 = (int) j2;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i3) {
            zzdyVar2.zzI(8);
            boolean z4 = true;
            if (!zzacoVar.zzm(zzdyVar2.zzN(), i4, 8, true)) {
                break;
            }
            long jZzu = zzdyVar2.zzu();
            int iZzg = zzdyVar2.zzg();
            if (jZzu == 1) {
                zzacoVar.zzh(zzdyVar2.zzN(), 8, 8);
                i = 16;
                zzdyVar2.zzK(16);
                jZzu = zzdyVar2.zzt();
            } else {
                if (jZzu == 0) {
                    long jZzd2 = zzacoVar.zzd();
                    if (jZzd2 != j) {
                        jZzu = (jZzd2 - zzacoVar.zze()) + 8;
                    }
                }
                i = 8;
            }
            long j3 = jZzu;
            long j4 = i;
            if (j3 < j4) {
                return new com.google.android.gms.internal.ads.zzahy(iZzg, j3, i);
            }
            i5 += i;
            if (iZzg == 1836019574) {
                i3 += (int) j3;
                if (jZzd != -1 && i3 > jZzd) {
                    i3 = (int) jZzd;
                }
                zzdyVar2 = zzdyVar2;
                j = -1;
                i4 = 0;
            } else {
                if (iZzg == 1836019558 || iZzg == 1836475768) {
                    i4 = 1;
                    break;
                }
                z3 |= !(iZzg != 1835295092);
                long j5 = jZzd;
                if ((((long) i5) + j3) - j4 >= i3) {
                    i4 = 0;
                    break;
                }
                int i6 = (int) (j3 - j4);
                i5 += i6;
                if (iZzg != 1718909296) {
                    zzdyVar = zzdyVar2;
                    i2 = 0;
                    if (i6 != 0) {
                        zzacoVar.zzg(i6);
                    }
                } else {
                    if (i6 < 8) {
                        return new com.google.android.gms.internal.ads.zzahy(androidx.media3.extractor.mp4.Atom.TYPE_ftyp, i6, 8);
                    }
                    zzdyVar = zzdyVar2;
                    zzdyVar.zzI(i6);
                    i2 = 0;
                    zzacoVar.zzh(zzdyVar.zzN(), 0, i6);
                    int iZzg2 = zzdyVar.zzg();
                    boolean zZzd = zzd(iZzg2, z2) | z3;
                    zzdyVar.zzM(4);
                    int iZzb = zzdyVar.zzb() / 4;
                    if (!zZzd && iZzb > 0) {
                        iArr = new int[iZzb];
                        int i7 = 0;
                        while (true) {
                            if (i7 >= iZzb) {
                                z4 = zZzd;
                                break;
                            }
                            int iZzg3 = zzdyVar.zzg();
                            iArr[i7] = iZzg3;
                            if (zzd(iZzg3, z2)) {
                                break;
                            }
                            i7++;
                        }
                    } else {
                        z4 = zZzd;
                        iArr = null;
                    }
                    if (!z4) {
                        return new com.google.android.gms.internal.ads.zzajf(iZzg2, iArr);
                    }
                    z3 = z4;
                }
                zzdyVar2 = zzdyVar;
                i4 = i2;
                jZzd = j5;
                j = -1;
            }
        }
        if (!z3) {
            return com.google.android.gms.internal.ads.zzaiw.zza;
        }
        if (z != i4) {
            return i4 != 0 ? com.google.android.gms.internal.ads.zzair.zza : com.google.android.gms.internal.ads.zzair.zzb;
        }
        return null;
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
