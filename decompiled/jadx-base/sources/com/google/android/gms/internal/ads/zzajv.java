package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzajv extends com.google.android.gms.internal.ads.zzajt {
    private com.google.android.gms.internal.ads.zzaju zza;
    private int zzb;
    private boolean zzc;
    private com.google.android.gms.internal.ads.zzady zzd;
    private com.google.android.gms.internal.ads.zzadw zze;

    zzajv() {
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    protected final long zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        if ((zzdyVar.zzN()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzdyVar.zzN()[0];
        com.google.android.gms.internal.ads.zzaju zzajuVar = this.zza;
        com.google.android.gms.internal.ads.zzcw.zzb(zzajuVar);
        int i = !zzajuVar.zzd[(b >> 1) & (255 >>> (8 - zzajuVar.zze))].zza ? zzajuVar.zza.zze : zzajuVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzdyVar.zzc() < zzdyVar.zze() + 4) {
            byte[] bArrCopyOf = java.util.Arrays.copyOf(zzdyVar.zzN(), zzdyVar.zze() + 4);
            zzdyVar.zzJ(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzdyVar.zzK(zzdyVar.zze() + 4);
        }
        long j = i2;
        byte[] bArrZzN = zzdyVar.zzN();
        bArrZzN[zzdyVar.zze() - 4] = (byte) (j & 255);
        bArrZzN[zzdyVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzN[zzdyVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzN[zzdyVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    protected final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        com.google.android.gms.internal.ads.zzady zzadyVar = this.zzd;
        this.zzb = zzadyVar != null ? zzadyVar.zze : 0;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x03ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:169:0x03bc  */
    @Override // com.google.android.gms.internal.ads.zzajt
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(com.google.android.gms.internal.ads.zzdy zzdyVar, long j, com.google.android.gms.internal.ads.zzajq zzajqVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzaju zzajuVar;
        int i;
        int iZzb;
        int i2;
        int i3;
        if (this.zza != null) {
            zzajqVar.zza.getClass();
            return false;
        }
        com.google.android.gms.internal.ads.zzady zzadyVar = this.zzd;
        int i4 = 4;
        if (zzadyVar != null) {
            com.google.android.gms.internal.ads.zzadw zzadwVar = this.zze;
            if (zzadwVar == null) {
                this.zze = com.google.android.gms.internal.ads.zzadz.zzc(zzdyVar, true, true);
            } else {
                byte[] bArr = new byte[zzdyVar.zze()];
                java.lang.System.arraycopy(zzdyVar.zzN(), 0, bArr, 0, zzdyVar.zze());
                int i5 = zzadyVar.zza;
                int i6 = 5;
                com.google.android.gms.internal.ads.zzadz.zzd(5, zzdyVar, false);
                int iZzm = zzdyVar.zzm() + 1;
                com.google.android.gms.internal.ads.zzadv zzadvVar = new com.google.android.gms.internal.ads.zzadv(zzdyVar.zzN());
                zzadvVar.zzc(zzdyVar.zzd() * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = 16;
                    if (i7 >= iZzm) {
                        com.google.android.gms.internal.ads.zzady zzadyVar2 = zzadyVar;
                        int i10 = 6;
                        int iZzb2 = zzadvVar.zzb(6) + 1;
                        for (int i11 = 0; i11 < iZzb2; i11++) {
                            if (zzadvVar.zzb(16) != 0) {
                                throw com.google.android.gms.internal.ads.zzbc.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i12 = 1;
                        int iZzb3 = zzadvVar.zzb(6) + 1;
                        int i13 = 0;
                        while (true) {
                            int i14 = 3;
                            if (i13 >= iZzb3) {
                                int i15 = 1;
                                int iZzb4 = zzadvVar.zzb(i10) + 1;
                                int i16 = 0;
                                while (i16 < iZzb4) {
                                    if (zzadvVar.zzb(16) > 2) {
                                        throw com.google.android.gms.internal.ads.zzbc.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzadvVar.zzc(24);
                                    zzadvVar.zzc(24);
                                    zzadvVar.zzc(24);
                                    int iZzb5 = zzadvVar.zzb(i10) + i15;
                                    int i17 = 8;
                                    zzadvVar.zzc(8);
                                    int[] iArr = new int[iZzb5];
                                    for (int i18 = 0; i18 < iZzb5; i18++) {
                                        iArr[i18] = ((zzadvVar.zzd() ? zzadvVar.zzb(5) : 0) * 8) + zzadvVar.zzb(3);
                                    }
                                    int i19 = 0;
                                    while (i19 < iZzb5) {
                                        int i20 = 0;
                                        while (i20 < i17) {
                                            if ((iArr[i19] & (1 << i20)) != 0) {
                                                zzadvVar.zzc(i17);
                                            }
                                            i20++;
                                            i17 = 8;
                                        }
                                        i19++;
                                        i17 = 8;
                                    }
                                    i16++;
                                    i10 = 6;
                                    i15 = 1;
                                }
                                int iZzb6 = zzadvVar.zzb(i10) + 1;
                                for (int i21 = 0; i21 < iZzb6; i21++) {
                                    int iZzb7 = zzadvVar.zzb(16);
                                    if (iZzb7 != 0) {
                                        com.google.android.gms.internal.ads.zzdo.zzc("VorbisUtil", "mapping type other than 0 not supported: " + iZzb7);
                                    } else {
                                        if (zzadvVar.zzd()) {
                                            i = 1;
                                            iZzb = zzadvVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            iZzb = 1;
                                        }
                                        if (zzadvVar.zzd()) {
                                            int iZzb8 = zzadvVar.zzb(8) + i;
                                            for (int i22 = 0; i22 < iZzb8; i22++) {
                                                int i23 = i5 - 1;
                                                zzadvVar.zzc(com.google.android.gms.internal.ads.zzadz.zza(i23));
                                                zzadvVar.zzc(com.google.android.gms.internal.ads.zzadz.zza(i23));
                                            }
                                        }
                                        if (zzadvVar.zzb(2) != 0) {
                                            throw com.google.android.gms.internal.ads.zzbc.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i24 = 0; i24 < i5; i24++) {
                                                zzadvVar.zzc(4);
                                            }
                                        }
                                        for (int i25 = 0; i25 < iZzb; i25++) {
                                            zzadvVar.zzc(8);
                                            zzadvVar.zzc(8);
                                            zzadvVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb9 = zzadvVar.zzb(6) + 1;
                                com.google.android.gms.internal.ads.zzadx[] zzadxVarArr = new com.google.android.gms.internal.ads.zzadx[iZzb9];
                                for (int i26 = 0; i26 < iZzb9; i26++) {
                                    zzadxVarArr[i26] = new com.google.android.gms.internal.ads.zzadx(zzadvVar.zzd(), zzadvVar.zzb(16), zzadvVar.zzb(16), zzadvVar.zzb(8));
                                }
                                if (!zzadvVar.zzd()) {
                                    throw com.google.android.gms.internal.ads.zzbc.zza("framing bit after modes not set as expected", null);
                                }
                                zzajuVar = new com.google.android.gms.internal.ads.zzaju(zzadyVar2, zzadwVar, bArr, zzadxVarArr, com.google.android.gms.internal.ads.zzadz.zza(iZzb9 - 1));
                                break;
                            }
                            int iZzb10 = zzadvVar.zzb(i9);
                            if (iZzb10 == 0) {
                                i2 = iZzb3;
                                int i27 = 8;
                                zzadvVar.zzc(8);
                                zzadvVar.zzc(16);
                                zzadvVar.zzc(16);
                                zzadvVar.zzc(6);
                                zzadvVar.zzc(8);
                                int iZzb11 = zzadvVar.zzb(4) + 1;
                                int i28 = 0;
                                while (i28 < iZzb11) {
                                    zzadvVar.zzc(i27);
                                    i28++;
                                    i27 = 8;
                                }
                            } else {
                                if (iZzb10 != i12) {
                                    throw com.google.android.gms.internal.ads.zzbc.zza("floor type greater than 1 not decodable: " + iZzb10, null);
                                }
                                int iZzb12 = zzadvVar.zzb(i6);
                                int[] iArr2 = new int[iZzb12];
                                int i29 = -1;
                                for (int i30 = 0; i30 < iZzb12; i30++) {
                                    int iZzb13 = zzadvVar.zzb(4);
                                    iArr2[i30] = iZzb13;
                                    if (iZzb13 > i29) {
                                        i29 = iZzb13;
                                    }
                                }
                                int i31 = i29 + 1;
                                int[] iArr3 = new int[i31];
                                int i32 = 0;
                                while (i32 < i31) {
                                    iArr3[i32] = zzadvVar.zzb(i14) + 1;
                                    int iZzb14 = zzadvVar.zzb(i8);
                                    if (iZzb14 > 0) {
                                        i3 = 8;
                                        zzadvVar.zzc(8);
                                    } else {
                                        i3 = 8;
                                    }
                                    int i33 = iZzb3;
                                    int i34 = 0;
                                    for (int i35 = 1; i34 < (i35 << iZzb14); i35 = 1) {
                                        zzadvVar.zzc(i3);
                                        i34++;
                                        i3 = 8;
                                    }
                                    i32++;
                                    iZzb3 = i33;
                                    i8 = 2;
                                    i14 = 3;
                                }
                                i2 = iZzb3;
                                zzadvVar.zzc(i8);
                                int iZzb15 = zzadvVar.zzb(4);
                                int i36 = 0;
                                int i37 = 0;
                                for (int i38 = 0; i38 < iZzb12; i38++) {
                                    i36 += iArr3[iArr2[i38]];
                                    while (i37 < i36) {
                                        zzadvVar.zzc(iZzb15);
                                        i37++;
                                    }
                                }
                            }
                            i13++;
                            iZzb3 = i2;
                            i10 = 6;
                            i9 = 16;
                            i8 = 2;
                            i12 = 1;
                            i6 = 5;
                        }
                    } else {
                        if (zzadvVar.zzb(24) != 5653314) {
                            throw com.google.android.gms.internal.ads.zzbc.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzadvVar.zza(), null);
                        }
                        int iZzb16 = zzadvVar.zzb(16);
                        int iZzb17 = zzadvVar.zzb(24);
                        if (zzadvVar.zzd()) {
                            zzadvVar.zzc(5);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzadvVar.zzb(com.google.android.gms.internal.ads.zzadz.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZzd = zzadvVar.zzd();
                            for (int i39 = 0; i39 < iZzb17; i39++) {
                                if (!zZzd) {
                                    zzadvVar.zzc(5);
                                } else if (zzadvVar.zzd()) {
                                    zzadvVar.zzc(5);
                                }
                            }
                        }
                        int iZzb19 = zzadvVar.zzb(i4);
                        if (iZzb19 > 2) {
                            throw com.google.android.gms.internal.ads.zzbc.zza("lookup type greater than 2 not decodable: " + iZzb19, null);
                        }
                        if (iZzb19 != 1) {
                            if (iZzb19 != 2) {
                                zzadyVar = zzadyVar;
                            }
                            i7++;
                            zzadyVar = zzadyVar;
                            i4 = 4;
                        } else {
                            i8 = iZzb19;
                        }
                        zzadvVar.zzc(32);
                        zzadvVar.zzc(32);
                        int iZzb20 = zzadvVar.zzb(i4) + 1;
                        zzadvVar.zzc(1);
                        zzadvVar.zzc((int) ((i8 == 1 ? iZzb16 != 0 ? (long) java.lang.Math.floor(java.lang.Math.pow(iZzb17, 1.0d / ((double) iZzb16))) : 0L : ((long) iZzb16) * ((long) iZzb17)) * ((long) iZzb20)));
                        i7++;
                        zzadyVar = zzadyVar;
                        i4 = 4;
                    }
                }
            }
            this.zza = zzajuVar;
            if (zzajuVar == null) {
                return true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.google.android.gms.internal.ads.zzady zzadyVar3 = zzajuVar.zza;
            arrayList.add(zzadyVar3.zzg);
            arrayList.add(zzajuVar.zzc);
            com.google.android.gms.internal.ads.zzay zzayVarZzb = com.google.android.gms.internal.ads.zzadz.zzb(com.google.android.gms.internal.ads.zzfxn.zzm(zzajuVar.zzb.zza));
            com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
            zzzVar.zzaa(androidx.media3.common.MimeTypes.AUDIO_VORBIS);
            zzzVar.zzy(zzadyVar3.zzd);
            zzzVar.zzV(zzadyVar3.zzc);
            zzzVar.zzz(zzadyVar3.zza);
            zzzVar.zzab(zzadyVar3.zzb);
            zzzVar.zzN(arrayList);
            zzzVar.zzT(zzayVarZzb);
            zzajqVar.zza = zzzVar.zzag();
            return true;
        }
        com.google.android.gms.internal.ads.zzadz.zzd(1, zzdyVar, false);
        int iZzj = zzdyVar.zzj();
        int iZzm2 = zzdyVar.zzm();
        int iZzj2 = zzdyVar.zzj();
        int iZzi = zzdyVar.zzi();
        int i40 = iZzi <= 0 ? -1 : iZzi;
        int iZzi2 = zzdyVar.zzi();
        int i41 = iZzi2 <= 0 ? -1 : iZzi2;
        int iZzi3 = zzdyVar.zzi();
        int i42 = iZzi3 <= 0 ? -1 : iZzi3;
        int iZzm3 = zzdyVar.zzm();
        this.zzd = new com.google.android.gms.internal.ads.zzady(iZzj, iZzm2, iZzj2, i40, i41, i42, (int) java.lang.Math.pow(2.0d, iZzm3 & 15), (int) java.lang.Math.pow(2.0d, (iZzm3 & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4), 1 == (zzdyVar.zzm() & 1), java.util.Arrays.copyOf(zzdyVar.zzN(), zzdyVar.zze()));
        zzajuVar = null;
        this.zza = zzajuVar;
        if (zzajuVar == null) {
            return true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.google.android.gms.internal.ads.zzady zzadyVar4 = zzajuVar.zza;
        arrayList2.add(zzadyVar4.zzg);
        arrayList2.add(zzajuVar.zzc);
        com.google.android.gms.internal.ads.zzay zzayVarZzb2 = com.google.android.gms.internal.ads.zzadz.zzb(com.google.android.gms.internal.ads.zzfxn.zzm(zzajuVar.zzb.zza));
        com.google.android.gms.internal.ads.zzz zzzVar2 = new com.google.android.gms.internal.ads.zzz();
        zzzVar2.zzaa(androidx.media3.common.MimeTypes.AUDIO_VORBIS);
        zzzVar2.zzy(zzadyVar4.zzd);
        zzzVar2.zzV(zzadyVar4.zzc);
        zzzVar2.zzz(zzadyVar4.zza);
        zzzVar2.zzab(zzadyVar4.zzb);
        zzzVar2.zzN(arrayList2);
        zzzVar2.zzT(zzayVarZzb2);
        zzajqVar.zza = zzzVar2.zzag();
        return true;
    }
}
