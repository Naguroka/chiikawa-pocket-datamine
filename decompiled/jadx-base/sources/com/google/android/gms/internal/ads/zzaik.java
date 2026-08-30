package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaik {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        zzb = "OpusHead".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    public static com.google.android.gms.internal.ads.zzay zzb(com.google.android.gms.internal.ads.zzen zzenVar) {
        com.google.android.gms.internal.ads.zzem zzemVar;
        com.google.android.gms.internal.ads.zzeo zzeoVarZzb = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_hdlr);
        com.google.android.gms.internal.ads.zzeo zzeoVarZzb2 = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_keys);
        com.google.android.gms.internal.ads.zzeo zzeoVarZzb3 = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_ilst);
        if (zzeoVarZzb != null && zzeoVarZzb2 != null && zzeoVarZzb3 != null && zzi(zzeoVarZzb.zza) == 1835299937) {
            com.google.android.gms.internal.ads.zzdy zzdyVar = zzeoVarZzb2.zza;
            zzdyVar.zzL(12);
            int iZzg = zzdyVar.zzg();
            java.lang.String[] strArr = new java.lang.String[iZzg];
            for (int i = 0; i < iZzg; i++) {
                int iZzg2 = zzdyVar.zzg();
                zzdyVar.zzM(4);
                strArr[i] = zzdyVar.zzB(iZzg2 - 8, java.nio.charset.StandardCharsets.UTF_8);
            }
            com.google.android.gms.internal.ads.zzdy zzdyVar2 = zzeoVarZzb3.zza;
            zzdyVar2.zzL(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (zzdyVar2.zzb() > 8) {
                int iZzd = zzdyVar2.zzd() + zzdyVar2.zzg();
                int iZzg3 = zzdyVar2.zzg() - 1;
                if (iZzg3 < 0 || iZzg3 >= iZzg) {
                    com.google.android.gms.internal.ads.zzdo.zzf("BoxParsers", "Skipped metadata with unknown key index: " + iZzg3);
                } else {
                    java.lang.String str = strArr[iZzg3];
                    while (true) {
                        int iZzd2 = zzdyVar2.zzd();
                        if (iZzd2 >= iZzd) {
                            zzemVar = null;
                            break;
                        }
                        int iZzg4 = zzdyVar2.zzg();
                        if (zzdyVar2.zzg() == 1684108385) {
                            int iZzg5 = zzdyVar2.zzg();
                            int iZzg6 = zzdyVar2.zzg();
                            int i2 = iZzg4 - 16;
                            byte[] bArr = new byte[i2];
                            zzdyVar2.zzH(bArr, 0, i2);
                            zzemVar = new com.google.android.gms.internal.ads.zzem(str, bArr, iZzg6, iZzg5);
                            break;
                        }
                        zzdyVar2.zzL(iZzd2 + iZzg4);
                    }
                    if (zzemVar != null) {
                        arrayList.add(zzemVar);
                    }
                }
                zzdyVar2.zzL(iZzd);
            }
            if (!arrayList.isEmpty()) {
                return new com.google.android.gms.internal.ads.zzay(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    public static com.google.android.gms.internal.ads.zzay zzc(com.google.android.gms.internal.ads.zzeo zzeoVar) {
        int iZzn;
        com.google.android.gms.internal.ads.zzdy zzdyVar = zzeoVar.zza;
        zzdyVar.zzL(8);
        com.google.android.gms.internal.ads.zzay zzayVar = new com.google.android.gms.internal.ads.zzay(androidx.media3.common.C.TIME_UNSET, new com.google.android.gms.internal.ads.zzax[0]);
        while (zzdyVar.zzb() >= 8) {
            int iZzd = zzdyVar.zzd();
            int iZzg = zzdyVar.zzg() + iZzd;
            int iZzg2 = zzdyVar.zzg();
            com.google.android.gms.internal.ads.zzay zzayVar2 = null;
            if (iZzg2 == 1835365473) {
                zzdyVar.zzL(iZzd);
                zzdyVar.zzM(8);
                zzg(zzdyVar);
                while (zzdyVar.zzd() < iZzg) {
                    int iZzd2 = zzdyVar.zzd();
                    int iZzg3 = zzdyVar.zzg() + iZzd2;
                    if (zzdyVar.zzg() == 1768715124) {
                        zzdyVar.zzL(iZzd2);
                        zzdyVar.zzM(8);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (zzdyVar.zzd() < iZzg3) {
                            com.google.android.gms.internal.ads.zzax zzaxVarZza = com.google.android.gms.internal.ads.zzais.zza(zzdyVar);
                            if (zzaxVarZza != null) {
                                arrayList.add(zzaxVarZza);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzayVar2 = new com.google.android.gms.internal.ads.zzay(arrayList);
                            break;
                        }
                        break;
                    }
                    zzdyVar.zzL(iZzg3);
                }
                zzayVar = zzayVar.zzd(zzayVar2);
            } else if (iZzg2 == 1936553057) {
                zzdyVar.zzL(iZzd);
                zzdyVar.zzM(12);
                while (zzdyVar.zzd() < iZzg) {
                    int iZzd3 = zzdyVar.zzd();
                    int iZzg4 = zzdyVar.zzg();
                    if (zzdyVar.zzg() == 1935766900) {
                        if (iZzg4 < 16) {
                            break;
                        }
                        zzdyVar.zzM(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int iZzm = zzdyVar.zzm();
                            int iZzm2 = zzdyVar.zzm();
                            if (iZzm == 0) {
                                i = iZzm2;
                            } else if (iZzm == 1) {
                                i2 = iZzm2;
                            }
                        }
                        if (i == 12) {
                            iZzn = androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK;
                        } else if (i == 13) {
                            iZzn = 120;
                        } else if (i == 21 && zzdyVar.zzb() >= 8 && zzdyVar.zzd() + 8 <= iZzg) {
                            int iZzg5 = zzdyVar.zzg();
                            int iZzg6 = zzdyVar.zzg();
                            if (iZzg5 < 12 || iZzg6 != 1936877170) {
                                iZzn = -2147483647;
                            } else {
                                iZzn = zzdyVar.zzn();
                            }
                        } else {
                            iZzn = -2147483647;
                        }
                        if (iZzn == -2147483647) {
                            break;
                        }
                        zzayVar2 = new com.google.android.gms.internal.ads.zzay(androidx.media3.common.C.TIME_UNSET, new com.google.android.gms.internal.ads.zzahc(iZzn, i2));
                        break;
                    }
                    zzdyVar.zzL(iZzd3 + iZzg4);
                }
                zzayVar = zzayVar.zzd(zzayVar2);
            } else if (iZzg2 == -1451722374) {
                zzayVar = zzayVar.zzd(zzl(zzdyVar));
            }
            zzdyVar.zzL(iZzg);
        }
        return zzayVar;
    }

    public static com.google.android.gms.internal.ads.zzew zzd(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        long jZzt;
        long jZzt2;
        zzdyVar.zzL(8);
        if (zza(zzdyVar.zzg()) == 0) {
            jZzt = zzdyVar.zzu();
            jZzt2 = zzdyVar.zzu();
        } else {
            jZzt = zzdyVar.zzt();
            jZzt2 = zzdyVar.zzt();
        }
        return new com.google.android.gms.internal.ads.zzew(jZzt, jZzt2, zzdyVar.zzu());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x026f  */
    /* JADX WARN: Code duplicated, block: B:102:0x027d  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a1 A[DONT_INVERT, LOOP:13: B:107:0x02a1->B:111:0x02ab, LOOP_START, PHI: r16
  0x02a1: PHI (r16v15 int) = (r16v3 int), (r16v16 int) binds: [B:106:0x029f, B:111:0x02ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ab A[LOOP:13: B:107:0x02a1->B:111:0x02ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02b1 A[EDGE_INSN: B:112:0x02b1->B:113:0x02b2 BREAK  A[LOOP:13: B:107:0x02a1->B:111:0x02ab]] */
    /* JADX WARN: Code duplicated, block: B:114:0x02b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x02b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x02ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x02bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x02be  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:122:0x02df  */
    /* JADX WARN: Code duplicated, block: B:123:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:126:0x0308  */
    /* JADX WARN: Code duplicated, block: B:129:0x0350  */
    /* JADX WARN: Code duplicated, block: B:130:0x0353  */
    /* JADX WARN: Code duplicated, block: B:267:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b3 A[PHI: r11
  0x01b3: PHI (r11v4 int) = (r11v3 int), (r11v3 int), (r11v38 int), (r11v3 int) binds: [B:40:0x00fe, B:47:0x011a, B:64:0x01b2, B:46:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01df A[LOOP:11: B:69:0x01d7->B:72:0x01df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x021e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0223 A[ADDED_TO_REGION, LOOP:12: B:80:0x0223->B:82:0x0227, LOOP_START, PHI: r2 r16 r29
  0x0223: PHI (r2v5 int) = (r2v3 int), (r2v6 int) binds: [B:78:0x0220, B:82:0x0227] A[DONT_GENERATE, DONT_INLINE]
  0x0223: PHI (r16v18 int) = (r16v3 int), (r16v19 int) binds: [B:78:0x0220, B:82:0x0227] A[DONT_GENERATE, DONT_INLINE]
  0x0223: PHI (r29v3 int) = (r29v1 int), (r29v7 int) binds: [B:78:0x0220, B:82:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0225 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0227 A[LOOP:12: B:80:0x0223->B:82:0x0227, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0243  */
    /* JADX WARN: Code duplicated, block: B:91:0x024b  */
    /* JADX WARN: Code duplicated, block: B:92:0x024d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0252  */
    /* JADX WARN: Code duplicated, block: B:97:0x0259  */
    public static com.google.android.gms.internal.ads.zzaje zze(com.google.android.gms.internal.ads.zzajb zzajbVar, com.google.android.gms.internal.ads.zzen zzenVar, com.google.android.gms.internal.ads.zzadb zzadbVar) throws com.google.android.gms.internal.ads.zzbc {
        com.google.android.gms.internal.ads.zzaid zzaihVar;
        boolean z;
        int iZzp;
        int iZzp2;
        int iZzp3;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int i;
        com.google.android.gms.internal.ads.zzajb zzajbVar2;
        int iZzp4;
        int i2;
        long j;
        long j2;
        int i3;
        int iZzp5;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        long[] jArr;
        long j3;
        int[] iArr;
        int i8;
        int[] iArr2;
        long[] jArr2;
        java.lang.String str;
        long j4;
        boolean zZza;
        int i9;
        int iZzg;
        int iZzc;
        int i10;
        com.google.android.gms.internal.ads.zzajb zzajbVarZza;
        long[] jArr3;
        int[] iArr3;
        int i11;
        int length;
        com.google.android.gms.internal.ads.zzajb zzajbVarZza2 = zzajbVar;
        com.google.android.gms.internal.ads.zzeo zzeoVarZzb = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_stsz);
        if (zzeoVarZzb != null) {
            zzaihVar = new com.google.android.gms.internal.ads.zzaig(zzeoVarZzb, zzajbVarZza2.zzg);
        } else {
            com.google.android.gms.internal.ads.zzeo zzeoVarZzb2 = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_stz2);
            if (zzeoVarZzb2 == null) {
                throw com.google.android.gms.internal.ads.zzbc.zza("Track has no sample table size information", null);
            }
            zzaihVar = new com.google.android.gms.internal.ads.zzaih(zzeoVarZzb2);
        }
        int iZzb = zzaihVar.zzb();
        if (iZzb == 0) {
            return new com.google.android.gms.internal.ads.zzaje(zzajbVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (zzajbVarZza2.zzb == 2) {
            long j5 = zzajbVarZza2.zzf;
            if (j5 > 0) {
                com.google.android.gms.internal.ads.zzz zzzVarZzb = zzajbVarZza2.zzg.zzb();
                zzzVarZzb.zzI(iZzb / (j5 / 1000000.0f));
                zzajbVarZza2 = zzajbVarZza2.zza(zzzVarZzb.zzag());
            }
        }
        com.google.android.gms.internal.ads.zzajb zzajbVar3 = zzajbVarZza2;
        com.google.android.gms.internal.ads.zzeo zzeoVarZzb3 = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_stco);
        if (zzeoVarZzb3 == null) {
            zzeoVarZzb3 = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_co64);
            zzeoVarZzb3.getClass();
            z = true;
        } else {
            z = false;
        }
        com.google.android.gms.internal.ads.zzeo zzeoVarZzb4 = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_stsc);
        zzeoVarZzb4.getClass();
        com.google.android.gms.internal.ads.zzdy zzdyVar = zzeoVarZzb4.zza;
        com.google.android.gms.internal.ads.zzeo zzeoVarZzb5 = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_stts);
        zzeoVarZzb5.getClass();
        com.google.android.gms.internal.ads.zzdy zzdyVar2 = zzeoVarZzb5.zza;
        com.google.android.gms.internal.ads.zzeo zzeoVarZzb6 = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_stss);
        com.google.android.gms.internal.ads.zzdy zzdyVar3 = zzeoVarZzb6 != null ? zzeoVarZzb6.zza : null;
        com.google.android.gms.internal.ads.zzeo zzeoVarZzb7 = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_ctts);
        com.google.android.gms.internal.ads.zzdy zzdyVar4 = zzeoVarZzb7 != null ? zzeoVarZzb7.zza : null;
        com.google.android.gms.internal.ads.zzahz zzahzVar = new com.google.android.gms.internal.ads.zzahz(zzdyVar, zzeoVarZzb3.zza, z);
        zzdyVar2.zzL(12);
        int iZzp6 = zzdyVar2.zzp() - 1;
        int iZzp7 = zzdyVar2.zzp();
        int iZzp8 = zzdyVar2.zzp();
        if (zzdyVar4 != null) {
            zzdyVar4.zzL(12);
            iZzp = zzdyVar4.zzp();
        } else {
            iZzp = 0;
        }
        if (zzdyVar3 != null) {
            zzdyVar3.zzL(12);
            iZzp2 = zzdyVar3.zzp();
            if (iZzp2 > 0) {
                iZzp3 = zzdyVar3.zzp() - 1;
            } else {
                iZzp3 = -1;
                zzdyVar3 = null;
            }
        } else {
            iZzp2 = 0;
            iZzp3 = -1;
        }
        int iZza = zzaihVar.zza();
        com.google.android.gms.internal.ads.zzab zzabVar = zzajbVar3.zzg;
        if (iZza != -1) {
            java.lang.String str2 = zzabVar.zzo;
            if ((!androidx.media3.common.MimeTypes.AUDIO_RAW.equals(str2) && !androidx.media3.common.MimeTypes.AUDIO_MLAW.equals(str2) && !androidx.media3.common.MimeTypes.AUDIO_ALAW.equals(str2)) || iZzp6 != 0) {
                jArrCopyOf = new long[iZzb];
                iArrCopyOf = new int[iZzb];
                jArrCopyOf2 = new long[iZzb];
                iArrCopyOf2 = new int[iZzb];
                i = iZzp6;
                zzajbVar2 = zzajbVar3;
                iZzp4 = iZzp3;
                i2 = 0;
                j = 0;
                j2 = 0;
                i3 = 0;
                iZzp5 = 0;
                i4 = 0;
                i5 = iZzp;
                i6 = 0;
                while (i6 < iZzb) {
                    j4 = j;
                    zZza = true;
                    while (true) {
                        if (i3 != 0) {
                            i9 = i3;
                            break;
                        }
                        zZza = zzahzVar.zza();
                        if (!zZza) {
                            i9 = 0;
                            break;
                        }
                        com.google.android.gms.internal.ads.zzdy zzdyVar5 = zzdyVar2;
                        long j6 = zzahzVar.zzd;
                        i3 = zzahzVar.zzc;
                        j4 = j6;
                        zzdyVar2 = zzdyVar5;
                        zzdyVar3 = zzdyVar3;
                        iZzb = iZzb;
                    }
                    if (!zZza) {
                        com.google.android.gms.internal.ads.zzdo.zzf("BoxParsers", "Unexpected end of chunk data");
                        jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i6);
                        iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i6);
                        jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i6);
                        iArrCopyOf2 = java.util.Arrays.copyOf(iArrCopyOf2, i6);
                        iZzb = i6;
                        break;
                    }
                    iZzg = i4;
                    if (zzdyVar4 != null) {
                        while (iZzp5 == 0) {
                            if (i5 <= 0) {
                                iZzp5 = 0;
                                break;
                            }
                            i5--;
                            iZzp5 = zzdyVar4.zzp();
                            iZzg = zzdyVar4.zzg();
                        }
                        iZzp5--;
                    }
                    jArrCopyOf[i6] = j4;
                    iZzc = zzaihVar.zzc();
                    iArrCopyOf[i6] = iZzc;
                    if (iZzc > i2) {
                        i2 = iZzc;
                    }
                    jArrCopyOf2[i6] = j2 + ((long) iZzg);
                    if (zzdyVar3 == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    iArrCopyOf2[i6] = i10;
                    if (i6 == iZzp4) {
                        iArrCopyOf2[i6] = 1;
                        iZzp2--;
                        if (iZzp2 > 0) {
                            zzdyVar3.getClass();
                            iZzp4 = zzdyVar3.zzp() - 1;
                        }
                    }
                    j2 += (long) iZzp8;
                    iZzp7--;
                    if (iZzp7 == 0) {
                        if (i > 0) {
                            i--;
                            iZzp7 = zzdyVar2.zzp();
                            iZzp8 = zzdyVar2.zzg();
                        } else {
                            iZzp7 = 0;
                        }
                    }
                    long j7 = j4 + ((long) iArrCopyOf[i6]);
                    i3 = i9 - 1;
                    i6++;
                    i4 = iZzg;
                    iZzb = iZzb;
                    zzdyVar2 = zzdyVar2;
                    j = j7;
                    zzdyVar3 = zzdyVar3;
                }
                long j8 = j2 + ((long) i4);
                if (zzdyVar4 == null) {
                    z2 = true;
                    break;
                }
                while (true) {
                    if (i5 <= 0) {
                        z2 = true;
                        break;
                    }
                    if (zzdyVar4.zzp() != 0) {
                        z2 = false;
                        break;
                    }
                    zzdyVar4.zzg();
                    i5--;
                }
                if (iZzp2 == 0) {
                    if (iZzp7 == 0) {
                        if (i3 != 0) {
                            i7 = 0;
                        } else if (i != 0) {
                            z2 = z2;
                            iZzb = iZzb;
                            i = i;
                            zzajbVar2 = zzajbVar2;
                            iZzp5 = iZzp5;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                        } else if (iZzp5 != 0) {
                            z2 = z2;
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                            iZzp5 = iZzp5;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                            i = 0;
                        } else if (z2) {
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                        } else {
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                            i = 0;
                            iZzp5 = 0;
                            z2 = false;
                        }
                        jArr = jArrCopyOf2;
                        j3 = j8;
                        iZzb = iZzb;
                        iArr = iArrCopyOf;
                        i8 = i2;
                        iArr2 = iArrCopyOf2;
                        jArr2 = jArrCopyOf;
                    } else {
                        i7 = iZzp7;
                    }
                    iZzp2 = 0;
                } else {
                    z2 = z2;
                    iZzb = iZzb;
                    i7 = iZzp7;
                    i3 = i3;
                    i = i;
                    zzajbVar2 = zzajbVar2;
                    iZzp5 = iZzp5;
                }
                int i12 = zzajbVar2.zza;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Inconsistent stbl box for track ");
                sb.append(i12);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(iZzp2);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i7);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i3);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(iZzp5);
                if (true != z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb.append(str);
                com.google.android.gms.internal.ads.zzdo.zzf("BoxParsers", sb.toString());
                jArr = jArrCopyOf2;
                j3 = j8;
                iZzb = iZzb;
                iArr = iArrCopyOf;
                i8 = i2;
                iArr2 = iArrCopyOf2;
                jArr2 = jArrCopyOf;
            } else if (iZzp == 0 && iZzp2 == 0) {
                int i13 = zzahzVar.zza;
                long[] jArr4 = new long[i13];
                int[] iArr4 = new int[i13];
                while (zzahzVar.zza()) {
                    int i14 = zzahzVar.zzb;
                    jArr4[i14] = zzahzVar.zzd;
                    iArr4[i14] = zzahzVar.zzc;
                }
                long j9 = iZzp8;
                int i15 = 8192 / iZza;
                int i16 = 0;
                for (int i17 = 0; i17 < i13; i17++) {
                    int i18 = iArr4[i17];
                    int i19 = com.google.android.gms.internal.ads.zzei.zza;
                    i16 += ((i18 + i15) - 1) / i15;
                }
                long[] jArr5 = new long[i16];
                int[] iArr5 = new int[i16];
                long[] jArr6 = new long[i16];
                int[] iArr6 = new int[i16];
                int i20 = 0;
                int i21 = 0;
                i8 = 0;
                int i22 = 0;
                while (i21 < i13) {
                    int i23 = iArr4[i21];
                    long j10 = jArr4[i21];
                    int i24 = i22;
                    int i25 = i13;
                    int iMax = i8;
                    int i26 = i24;
                    long[] jArr7 = jArr4;
                    int i27 = i23;
                    while (i27 > 0) {
                        int iMin = java.lang.Math.min(i15, i27);
                        jArr5[i26] = j10;
                        int i28 = i15;
                        int i29 = iZza * iMin;
                        iArr5[i26] = i29;
                        iMax = java.lang.Math.max(iMax, i29);
                        jArr6[i26] = ((long) i20) * j9;
                        iArr6[i26] = 1;
                        j10 += (long) iArr5[i26];
                        i20 += iMin;
                        i27 -= iMin;
                        i26++;
                        i15 = i28;
                        iZza = iZza;
                    }
                    i21++;
                    jArr4 = jArr7;
                    int i30 = i26;
                    i8 = iMax;
                    i13 = i25;
                    i22 = i30;
                }
                j3 = j9 * ((long) i20);
                jArr2 = jArr5;
                zzajbVar2 = zzajbVar3;
                jArr = jArr6;
                iArr2 = iArr6;
                iArr = iArr5;
            } else {
                iZzp6 = 0;
                jArrCopyOf = new long[iZzb];
                iArrCopyOf = new int[iZzb];
                jArrCopyOf2 = new long[iZzb];
                iArrCopyOf2 = new int[iZzb];
                i = iZzp6;
                zzajbVar2 = zzajbVar3;
                iZzp4 = iZzp3;
                i2 = 0;
                j = 0;
                j2 = 0;
                i3 = 0;
                iZzp5 = 0;
                i4 = 0;
                i5 = iZzp;
                i6 = 0;
                while (i6 < iZzb) {
                    j4 = j;
                    zZza = true;
                    while (true) {
                        if (i3 != 0) {
                            i9 = i3;
                            break;
                        }
                        zZza = zzahzVar.zza();
                        if (!zZza) {
                            i9 = 0;
                            break;
                        }
                        com.google.android.gms.internal.ads.zzdy zzdyVar6 = zzdyVar2;
                        long j11 = zzahzVar.zzd;
                        i3 = zzahzVar.zzc;
                        j4 = j11;
                        zzdyVar2 = zzdyVar6;
                        zzdyVar3 = zzdyVar3;
                        iZzb = iZzb;
                    }
                    if (!zZza) {
                        com.google.android.gms.internal.ads.zzdo.zzf("BoxParsers", "Unexpected end of chunk data");
                        jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i6);
                        iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i6);
                        jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i6);
                        iArrCopyOf2 = java.util.Arrays.copyOf(iArrCopyOf2, i6);
                        iZzb = i6;
                        break;
                    }
                    iZzg = i4;
                    if (zzdyVar4 != null) {
                        while (iZzp5 == 0) {
                            if (i5 <= 0) {
                                iZzp5 = 0;
                                break;
                            }
                            i5--;
                            iZzp5 = zzdyVar4.zzp();
                            iZzg = zzdyVar4.zzg();
                        }
                        iZzp5--;
                    }
                    jArrCopyOf[i6] = j4;
                    iZzc = zzaihVar.zzc();
                    iArrCopyOf[i6] = iZzc;
                    if (iZzc > i2) {
                        i2 = iZzc;
                    }
                    jArrCopyOf2[i6] = j2 + ((long) iZzg);
                    if (zzdyVar3 == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    iArrCopyOf2[i6] = i10;
                    if (i6 == iZzp4) {
                        iArrCopyOf2[i6] = 1;
                        iZzp2--;
                        if (iZzp2 > 0) {
                            zzdyVar3.getClass();
                            iZzp4 = zzdyVar3.zzp() - 1;
                        }
                    }
                    j2 += (long) iZzp8;
                    iZzp7--;
                    if (iZzp7 == 0) {
                        if (i > 0) {
                            i--;
                            iZzp7 = zzdyVar2.zzp();
                            iZzp8 = zzdyVar2.zzg();
                        } else {
                            iZzp7 = 0;
                        }
                    }
                    long j12 = j4 + ((long) iArrCopyOf[i6]);
                    i3 = i9 - 1;
                    i6++;
                    i4 = iZzg;
                    iZzb = iZzb;
                    zzdyVar2 = zzdyVar2;
                    j = j12;
                    zzdyVar3 = zzdyVar3;
                }
                long j13 = j2 + ((long) i4);
                if (zzdyVar4 == null) {
                    z2 = true;
                    break;
                }
                while (true) {
                    if (i5 <= 0) {
                        z2 = true;
                        break;
                    }
                    if (zzdyVar4.zzp() != 0) {
                        z2 = false;
                        break;
                    }
                    zzdyVar4.zzg();
                    i5--;
                }
                if (iZzp2 == 0) {
                    if (iZzp7 == 0) {
                        if (i3 != 0) {
                            i7 = 0;
                        } else if (i != 0) {
                            z2 = z2;
                            iZzb = iZzb;
                            i = i;
                            zzajbVar2 = zzajbVar2;
                            iZzp5 = iZzp5;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                        } else if (iZzp5 != 0) {
                            z2 = z2;
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                            iZzp5 = iZzp5;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                            i = 0;
                        } else if (z2) {
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                            i = 0;
                            iZzp5 = 0;
                            z2 = false;
                        } else {
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                        }
                        jArr = jArrCopyOf2;
                        j3 = j13;
                        iZzb = iZzb;
                        iArr = iArrCopyOf;
                        i8 = i2;
                        iArr2 = iArrCopyOf2;
                        jArr2 = jArrCopyOf;
                    } else {
                        i7 = iZzp7;
                    }
                    iZzp2 = 0;
                } else {
                    z2 = z2;
                    iZzb = iZzb;
                    i7 = iZzp7;
                    i3 = i3;
                    i = i;
                    zzajbVar2 = zzajbVar2;
                    iZzp5 = iZzp5;
                }
                int i110 = zzajbVar2.zza;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Inconsistent stbl box for track ");
                sb2.append(i110);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(iZzp2);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i7);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i3);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(iZzp5);
                if (true != z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb2.append(str);
                com.google.android.gms.internal.ads.zzdo.zzf("BoxParsers", sb2.toString());
                jArr = jArrCopyOf2;
                j3 = j13;
                iZzb = iZzb;
                iArr = iArrCopyOf;
                i8 = i2;
                iArr2 = iArrCopyOf2;
                jArr2 = jArrCopyOf;
            }
        } else {
            jArrCopyOf = new long[iZzb];
            iArrCopyOf = new int[iZzb];
            jArrCopyOf2 = new long[iZzb];
            iArrCopyOf2 = new int[iZzb];
            i = iZzp6;
            zzajbVar2 = zzajbVar3;
            iZzp4 = iZzp3;
            i2 = 0;
            j = 0;
            j2 = 0;
            i3 = 0;
            iZzp5 = 0;
            i4 = 0;
            i5 = iZzp;
            i6 = 0;
            while (i6 < iZzb) {
                j4 = j;
                zZza = true;
                while (true) {
                    if (i3 != 0) {
                        i9 = i3;
                        break;
                    }
                    zZza = zzahzVar.zza();
                    if (!zZza) {
                        i9 = 0;
                        break;
                    }
                    com.google.android.gms.internal.ads.zzdy zzdyVar7 = zzdyVar2;
                    long j14 = zzahzVar.zzd;
                    i3 = zzahzVar.zzc;
                    j4 = j14;
                    zzdyVar2 = zzdyVar7;
                    zzdyVar3 = zzdyVar3;
                    iZzb = iZzb;
                }
                if (!zZza) {
                    com.google.android.gms.internal.ads.zzdo.zzf("BoxParsers", "Unexpected end of chunk data");
                    jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i6);
                    iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i6);
                    jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i6);
                    iArrCopyOf2 = java.util.Arrays.copyOf(iArrCopyOf2, i6);
                    iZzb = i6;
                    break;
                }
                iZzg = i4;
                if (zzdyVar4 != null) {
                    while (iZzp5 == 0) {
                        if (i5 <= 0) {
                            iZzp5 = 0;
                            break;
                        }
                        i5--;
                        iZzp5 = zzdyVar4.zzp();
                        iZzg = zzdyVar4.zzg();
                    }
                    iZzp5--;
                }
                jArrCopyOf[i6] = j4;
                iZzc = zzaihVar.zzc();
                iArrCopyOf[i6] = iZzc;
                if (iZzc > i2) {
                    i2 = iZzc;
                }
                jArrCopyOf2[i6] = j2 + ((long) iZzg);
                if (zzdyVar3 == 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                iArrCopyOf2[i6] = i10;
                if (i6 == iZzp4) {
                    iArrCopyOf2[i6] = 1;
                    iZzp2--;
                    if (iZzp2 > 0) {
                        zzdyVar3.getClass();
                        iZzp4 = zzdyVar3.zzp() - 1;
                    }
                }
                j2 += (long) iZzp8;
                iZzp7--;
                if (iZzp7 == 0) {
                    if (i > 0) {
                        i--;
                        iZzp7 = zzdyVar2.zzp();
                        iZzp8 = zzdyVar2.zzg();
                    } else {
                        iZzp7 = 0;
                    }
                }
                long j15 = j4 + ((long) iArrCopyOf[i6]);
                i3 = i9 - 1;
                i6++;
                i4 = iZzg;
                iZzb = iZzb;
                zzdyVar2 = zzdyVar2;
                j = j15;
                zzdyVar3 = zzdyVar3;
            }
            long j16 = j2 + ((long) i4);
            if (zzdyVar4 == null) {
                z2 = true;
                break;
            }
            while (true) {
                if (i5 <= 0) {
                    z2 = true;
                    break;
                }
                if (zzdyVar4.zzp() != 0) {
                    z2 = false;
                    break;
                }
                zzdyVar4.zzg();
                i5--;
            }
            if (iZzp2 == 0) {
                if (iZzp7 == 0) {
                    if (i3 != 0) {
                        i7 = 0;
                    } else if (i != 0) {
                        z2 = z2;
                        iZzb = iZzb;
                        i = i;
                        zzajbVar2 = zzajbVar2;
                        iZzp5 = iZzp5;
                        i7 = 0;
                        iZzp2 = 0;
                        i3 = 0;
                    } else if (iZzp5 != 0) {
                        z2 = z2;
                        iZzb = iZzb;
                        zzajbVar2 = zzajbVar2;
                        iZzp5 = iZzp5;
                        i7 = 0;
                        iZzp2 = 0;
                        i3 = 0;
                        i = 0;
                    } else if (z2) {
                        iZzb = iZzb;
                        zzajbVar2 = zzajbVar2;
                        i7 = 0;
                        iZzp2 = 0;
                        i3 = 0;
                        i = 0;
                        iZzp5 = 0;
                        z2 = false;
                    } else {
                        iZzb = iZzb;
                        zzajbVar2 = zzajbVar2;
                    }
                    jArr = jArrCopyOf2;
                    j3 = j16;
                    iZzb = iZzb;
                    iArr = iArrCopyOf;
                    i8 = i2;
                    iArr2 = iArrCopyOf2;
                    jArr2 = jArrCopyOf;
                } else {
                    i7 = iZzp7;
                }
                iZzp2 = 0;
            } else {
                z2 = z2;
                iZzb = iZzb;
                i7 = iZzp7;
                i3 = i3;
                i = i;
                zzajbVar2 = zzajbVar2;
                iZzp5 = iZzp5;
            }
            int i111 = zzajbVar2.zza;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Inconsistent stbl box for track ");
            sb3.append(i111);
            sb3.append(": remainingSynchronizationSamples ");
            sb3.append(iZzp2);
            sb3.append(", remainingSamplesAtTimestampDelta ");
            sb3.append(i7);
            sb3.append(", remainingSamplesInChunk ");
            sb3.append(i3);
            sb3.append(", remainingTimestampDeltaChanges ");
            sb3.append(i);
            sb3.append(", remainingSamplesAtTimestampOffset ");
            sb3.append(iZzp5);
            if (true != z2) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            sb3.append(str);
            com.google.android.gms.internal.ads.zzdo.zzf("BoxParsers", sb3.toString());
            jArr = jArrCopyOf2;
            j3 = j16;
            iZzb = iZzb;
            iArr = iArrCopyOf;
            i8 = i2;
            iArr2 = iArrCopyOf2;
            jArr2 = jArrCopyOf;
        }
        long jZzu = com.google.android.gms.internal.ads.zzei.zzu(j3, 1000000L, zzajbVar2.zzc, java.math.RoundingMode.DOWN);
        long[] jArr8 = zzajbVar2.zzi;
        if (jArr8 == null) {
            com.google.android.gms.internal.ads.zzei.zzF(jArr, 1000000L, zzajbVar2.zzc);
            return new com.google.android.gms.internal.ads.zzaje(zzajbVar2, jArr2, iArr, i8, jArr, iArr2, jZzu);
        }
        int[] iArr7 = iArr2;
        if (jArr8.length == 1 && zzajbVar2.zzb == 1 && (length = jArr.length) >= 2) {
            long[] jArr9 = zzajbVar2.zzj;
            jArr9.getClass();
            long j17 = jArr9[0];
            long jZzu2 = com.google.android.gms.internal.ads.zzei.zzu(jArr8[0], zzajbVar2.zzc, zzajbVar2.zzd, java.math.RoundingMode.DOWN) + j17;
            int i31 = length - 1;
            int iMax2 = java.lang.Math.max(0, java.lang.Math.min(4, i31));
            int iMax3 = java.lang.Math.max(0, java.lang.Math.min(length - 4, i31));
            long j18 = jArr[0];
            if (j18 <= j17 && j17 < jArr[iMax2] && jArr[iMax3] < jZzu2 && jZzu2 <= j3) {
                long jZzu3 = com.google.android.gms.internal.ads.zzei.zzu(j17 - j18, zzajbVar2.zzg.zzE, zzajbVar2.zzc, java.math.RoundingMode.DOWN);
                long jZzu4 = com.google.android.gms.internal.ads.zzei.zzu(j3 - jZzu2, zzajbVar2.zzg.zzE, zzajbVar2.zzc, java.math.RoundingMode.DOWN);
                if (jZzu3 != 0) {
                    if (jZzu3 <= 2147483647L && jZzu4 <= 2147483647L) {
                        zzadbVar.zza = (int) jZzu3;
                        zzadbVar.zzb = (int) jZzu4;
                        com.google.android.gms.internal.ads.zzei.zzF(jArr, 1000000L, zzajbVar2.zzc);
                        return new com.google.android.gms.internal.ads.zzaje(zzajbVar2, jArr2, iArr, i8, jArr, iArr7, com.google.android.gms.internal.ads.zzei.zzu(zzajbVar2.zzi[0], 1000000L, zzajbVar2.zzd, java.math.RoundingMode.DOWN));
                    }
                } else if (jZzu4 != 0) {
                    jZzu3 = 0;
                    if (jZzu3 <= 2147483647L) {
                        zzadbVar.zza = (int) jZzu3;
                        zzadbVar.zzb = (int) jZzu4;
                        com.google.android.gms.internal.ads.zzei.zzF(jArr, 1000000L, zzajbVar2.zzc);
                        return new com.google.android.gms.internal.ads.zzaje(zzajbVar2, jArr2, iArr, i8, jArr, iArr7, com.google.android.gms.internal.ads.zzei.zzu(zzajbVar2.zzi[0], 1000000L, zzajbVar2.zzd, java.math.RoundingMode.DOWN));
                    }
                }
            }
        }
        long[] jArr10 = zzajbVar2.zzi;
        int length2 = jArr10.length;
        if (length2 == 1) {
            if (jArr10[0] == 0) {
                long[] jArr11 = zzajbVar2.zzj;
                jArr11.getClass();
                long j19 = jArr11[0];
                for (int i32 = 0; i32 < jArr.length; i32++) {
                    jArr[i32] = com.google.android.gms.internal.ads.zzei.zzu(jArr[i32] - j19, 1000000L, zzajbVar2.zzc, java.math.RoundingMode.DOWN);
                }
                return new com.google.android.gms.internal.ads.zzaje(zzajbVar2, jArr2, iArr, i8, jArr, iArr7, com.google.android.gms.internal.ads.zzei.zzu(j3 - j19, 1000000L, zzajbVar2.zzc, java.math.RoundingMode.DOWN));
            }
            length2 = 1;
        }
        boolean z3 = zzajbVar2.zzb == 1;
        long[] jArr12 = zzajbVar2.zzj;
        int[] iArr8 = new int[length2];
        int[] iArr9 = new int[length2];
        jArr12.getClass();
        long[] jArr13 = jArr12;
        int i33 = 0;
        boolean z4 = false;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            long[] jArr14 = zzajbVar2.zzi;
            if (i35 >= jArr14.length) {
                break;
            }
            long[] jArr15 = jArr2;
            long j20 = jArr13[i35];
            if (j20 != -1) {
                long j21 = jArr14[i35];
                boolean z5 = z4;
                int i36 = i34;
                iArr3 = iArr9;
                int i37 = i33;
                long jZzu5 = com.google.android.gms.internal.ads.zzei.zzu(j21, zzajbVar2.zzc, zzajbVar2.zzd, java.math.RoundingMode.DOWN);
                iArr8[i35] = com.google.android.gms.internal.ads.zzei.zzd(jArr, j20, true, true);
                while (true) {
                    int i38 = iArr8[i35];
                    if (i38 < 0 || (iArr7[i38] & 1) != 0) {
                        break;
                    }
                    iArr8[i35] = i38 - 1;
                }
                long j22 = j20 + jZzu5;
                int iZza2 = com.google.android.gms.internal.ads.zzei.zza(jArr, j22, z3, false);
                iArr3[i35] = iZza2;
                if (zzajbVar2.zzb == 2) {
                    while (true) {
                        iZza2 = iArr3[i35];
                        if (iZza2 >= jArr.length - 1) {
                            break;
                        }
                        int i39 = iZza2 + 1;
                        if (jArr[i39] > j22) {
                            break;
                        }
                        iArr3[i35] = i39;
                    }
                }
                int i40 = iArr8[i35];
                int i41 = i37 + (iZza2 - i40);
                z4 = z5 | (i36 != i40);
                i11 = iZza2;
                i33 = i41;
            } else {
                iArr3 = iArr9;
                i11 = i34;
            }
            i35++;
            i34 = i11;
            jArr2 = jArr15;
            iArr9 = iArr3;
        }
        int[] iArr10 = iArr9;
        long[] jArr16 = jArr2;
        boolean z6 = z4 | (i33 != iZzb);
        long[] jArr17 = z6 ? new long[i33] : jArr16;
        int[] iArr11 = z6 ? new int[i33] : iArr;
        if (true == z6) {
            i8 = 0;
        }
        int[] iArr12 = z6 ? new int[i33] : iArr7;
        long[] jArr18 = new long[i33];
        boolean z7 = false;
        int i42 = 0;
        int i43 = 0;
        long j23 = 0;
        while (i43 < zzajbVar2.zzi.length) {
            long j24 = zzajbVar2.zzj[i43];
            int i44 = iArr8[i43];
            int i45 = iArr10[i43];
            if (z6) {
                int i46 = i45 - i44;
                jArr3 = jArr16;
                java.lang.System.arraycopy(jArr3, i44, jArr17, i42, i46);
                java.lang.System.arraycopy(iArr, i44, iArr11, i42, i46);
                java.lang.System.arraycopy(iArr7, i44, iArr12, i42, i46);
            } else {
                jArr3 = jArr16;
            }
            int i47 = i8;
            while (i44 < i45) {
                int[] iArr13 = iArr12;
                int i48 = i45;
                long jZzu6 = com.google.android.gms.internal.ads.zzei.zzu(j23, 1000000L, zzajbVar2.zzd, java.math.RoundingMode.DOWN);
                long[] jArr19 = jArr17;
                long[] jArr20 = jArr;
                long jZzu7 = com.google.android.gms.internal.ads.zzei.zzu(jArr[i44] - j24, 1000000L, zzajbVar2.zzc, java.math.RoundingMode.DOWN);
                z7 = (!(jZzu7 >= 0)) | z7;
                jArr18[i42] = jZzu6 + jZzu7;
                if (z6 && iArr11[i42] > i47) {
                    i47 = iArr[i44];
                }
                i42++;
                i44++;
                i45 = i48;
                jArr17 = jArr19;
                iArr12 = iArr13;
                jArr = jArr20;
            }
            j23 += zzajbVar2.zzi[i43];
            i43++;
            jArr17 = jArr17;
            i8 = i47;
            iArr12 = iArr12;
            jArr16 = jArr3;
            iArr8 = iArr8;
        }
        long[] jArr21 = jArr17;
        int[] iArr14 = iArr12;
        long jZzu8 = com.google.android.gms.internal.ads.zzei.zzu(j23, 1000000L, zzajbVar2.zzd, java.math.RoundingMode.DOWN);
        if (z7) {
            com.google.android.gms.internal.ads.zzz zzzVarZzb2 = zzajbVar2.zzg.zzb();
            zzzVarZzb2.zzJ(true);
            zzajbVarZza = zzajbVar2.zza(zzzVarZzb2.zzag());
        } else {
            zzajbVarZza = zzajbVar2;
        }
        return new com.google.android.gms.internal.ads.zzaje(zzajbVarZza, jArr21, iArr11, i8, jArr18, iArr14, jZzu8);
    }

    /* JADX WARN: Code duplicated, block: B:555:0x0c2f  */
    /* JADX WARN: Code duplicated, block: B:556:0x0c33  */
    /* JADX WARN: Code duplicated, block: B:559:0x0c69  */
    /* JADX WARN: Code duplicated, block: B:560:0x0c9c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0123  */
    /* JADX WARN: Code duplicated, block: B:63:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0129  */
    /* JADX WARN: Code duplicated, block: B:66:0x012c  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:68:0x012f A[PHI: r7
  0x012f: PHI (r7v4 int) = (r7v2 int), (r7v6 int) binds: [B:62:0x0123, B:67:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:76:0x0140  */
    public static java.util.List zzf(com.google.android.gms.internal.ads.zzen zzenVar, com.google.android.gms.internal.ads.zzadb zzadbVar, long j, com.google.android.gms.internal.ads.zzu zzuVar, boolean z, boolean z2, com.google.android.gms.internal.ads.zzfuc zzfucVar) throws com.google.android.gms.internal.ads.zzbc {
        int i;
        long jZzu;
        long jZzu2;
        int i2;
        int i3;
        long j2;
        java.util.ArrayList arrayList;
        int i4;
        com.google.android.gms.internal.ads.zzen zzenVar2;
        long[] jArr;
        long[] jArr2;
        com.google.android.gms.internal.ads.zzab zzabVar;
        com.google.android.gms.internal.ads.zzajb zzajbVar;
        android.util.Pair pairCreate;
        long j3;
        com.google.android.gms.internal.ads.zzu zzuVarZzb;
        int i5;
        java.lang.String str;
        byte b;
        int i6;
        com.google.android.gms.internal.ads.zzaif zzaifVar;
        int i7;
        int i8;
        int i9;
        com.google.android.gms.internal.ads.zzaif zzaifVar2;
        int i10;
        java.lang.String str2;
        java.util.List listZzo;
        int i11;
        com.google.android.gms.internal.ads.zzfh zzfhVar;
        boolean z3;
        java.lang.String str3;
        java.lang.String str4;
        boolean z4;
        java.lang.String str5;
        boolean z5;
        char c;
        boolean z6;
        int i12;
        java.lang.String str6;
        boolean z7;
        boolean z8;
        boolean z9;
        java.lang.String str7;
        long j4;
        com.google.android.gms.internal.ads.zzfxn zzfxnVarZzo;
        com.google.android.gms.internal.ads.zzajb zzajbVar2;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i13 = 0;
        while (i13 < zzenVar.zzc.size()) {
            com.google.android.gms.internal.ads.zzen zzenVar3 = (com.google.android.gms.internal.ads.zzen) zzenVar.zzc.get(i13);
            if (zzenVar3.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i4 = i13;
            } else {
                com.google.android.gms.internal.ads.zzeo zzeoVarZzb = zzenVar.zzb(androidx.media3.extractor.mp4.Atom.TYPE_mvhd);
                zzeoVarZzb.getClass();
                com.google.android.gms.internal.ads.zzen zzenVarZza = zzenVar3.zza(androidx.media3.extractor.mp4.Atom.TYPE_mdia);
                zzenVarZza.getClass();
                com.google.android.gms.internal.ads.zzeo zzeoVarZzb2 = zzenVarZza.zzb(androidx.media3.extractor.mp4.Atom.TYPE_hdlr);
                zzeoVarZzb2.getClass();
                int iZzi = zzi(zzeoVarZzb2.zza);
                if (iZzi == 1936684398) {
                    i = 1;
                } else if (iZzi == 1986618469) {
                    i = 2;
                } else if (iZzi == 1952807028 || iZzi == 1935832172 || iZzi == 1937072756 || iZzi == 1668047728) {
                    i = 3;
                } else {
                    i = iZzi == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    arrayList = arrayList3;
                    i4 = i13;
                    zzenVar2 = zzenVar3;
                } else {
                    com.google.android.gms.internal.ads.zzeo zzeoVarZzb3 = zzenVar3.zzb(androidx.media3.extractor.mp4.Atom.TYPE_tkhd);
                    zzeoVarZzb3.getClass();
                    com.google.android.gms.internal.ads.zzdy zzdyVar = zzeoVarZzb3.zza;
                    zzdyVar.zzL(8);
                    int iZza = zza(zzdyVar.zzg());
                    zzdyVar.zzM(iZza == 0 ? 8 : 16);
                    int iZzg = zzdyVar.zzg();
                    zzdyVar.zzM(4);
                    int iZzd = zzdyVar.zzd();
                    int i14 = 0;
                    while (true) {
                        int i15 = iZza == 0 ? 4 : 8;
                        jZzu = androidx.media3.common.C.TIME_UNSET;
                        if (i14 >= i15) {
                            zzdyVar.zzM(i15);
                        } else {
                            if (zzdyVar.zzN()[iZzd + i14] != -1) {
                                jZzu2 = iZza == 0 ? zzdyVar.zzu() : zzdyVar.zzw();
                                if (jZzu2 != 0) {
                                    break;
                                }
                                break;
                            }
                            i14++;
                        }
                        jZzu2 = -9223372036854775807L;
                        break;
                    }
                    zzdyVar.zzM(16);
                    int iZzg2 = zzdyVar.zzg();
                    int iZzg3 = zzdyVar.zzg();
                    zzdyVar.zzM(4);
                    int iZzg4 = zzdyVar.zzg();
                    int iZzg5 = zzdyVar.zzg();
                    int i16 = 65536;
                    if (iZzg2 != 0) {
                        if (iZzg2 == 0) {
                            i16 = iZzg4;
                            i2 = iZzg2;
                        } else if (iZzg3 != -65536) {
                            i16 = iZzg4;
                            i2 = 0;
                        } else if (iZzg4 == 65536) {
                            iZzg3 = -65536;
                            i16 = iZzg4;
                            i2 = 0;
                        } else if (iZzg5 == 0) {
                            i3 = 270;
                        } else {
                            iZzg3 = -65536;
                            i2 = 0;
                        }
                        if (i2 != -65536 && iZzg3 == 0 && i16 == 0 && iZzg5 == -65536) {
                            i3 = org.objectweb.asm.Opcodes.GETFIELD;
                        } else {
                            i3 = 0;
                        }
                    } else {
                        if (iZzg3 == 65536) {
                            if (iZzg4 == -65536) {
                                if (iZzg5 == 0) {
                                    i3 = 90;
                                } else {
                                    iZzg4 = -65536;
                                }
                            }
                            iZzg3 = 65536;
                        }
                        iZzg2 = 0;
                        if (iZzg2 == 0) {
                            i16 = iZzg4;
                            i2 = iZzg2;
                        } else if (iZzg3 != -65536) {
                            i16 = iZzg4;
                            i2 = 0;
                        } else if (iZzg4 == 65536) {
                            iZzg3 = -65536;
                            i16 = iZzg4;
                            i2 = 0;
                        } else if (iZzg5 == 0) {
                            i3 = 270;
                        } else {
                            iZzg3 = -65536;
                            i2 = 0;
                        }
                        if (i2 != -65536) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                        }
                    }
                    com.google.android.gms.internal.ads.zzaii zzaiiVar = new com.google.android.gms.internal.ads.zzaii(iZzg, jZzu2, i3);
                    long j5 = j == androidx.media3.common.C.TIME_UNSET ? zzaiiVar.zzb : j;
                    long j6 = zzd(zzeoVarZzb.zza).zzc;
                    long jZzu3 = j5 == androidx.media3.common.C.TIME_UNSET ? -9223372036854775807L : com.google.android.gms.internal.ads.zzei.zzu(j5, 1000000L, j6, java.math.RoundingMode.DOWN);
                    com.google.android.gms.internal.ads.zzen zzenVarZza2 = zzenVarZza.zza(androidx.media3.extractor.mp4.Atom.TYPE_minf);
                    zzenVarZza2.getClass();
                    com.google.android.gms.internal.ads.zzen zzenVarZza3 = zzenVarZza2.zza(androidx.media3.extractor.mp4.Atom.TYPE_stbl);
                    zzenVarZza3.getClass();
                    com.google.android.gms.internal.ads.zzeo zzeoVarZzb4 = zzenVarZza.zzb(androidx.media3.extractor.mp4.Atom.TYPE_mdhd);
                    zzeoVarZzb4.getClass();
                    com.google.android.gms.internal.ads.zzdy zzdyVar2 = zzeoVarZzb4.zza;
                    zzdyVar2.zzL(8);
                    int iZza2 = zza(zzdyVar2.zzg());
                    zzdyVar2.zzM(iZza2 == 0 ? 8 : 16);
                    long jZzu4 = zzdyVar2.zzu();
                    int iZzd2 = zzdyVar2.zzd();
                    int i17 = 0;
                    while (true) {
                        int i18 = iZza2 == 0 ? 4 : 8;
                        if (i17 >= i18) {
                            j2 = j6;
                            zzdyVar2.zzM(i18);
                            break;
                        }
                        j2 = j6;
                        if (zzdyVar2.zzN()[iZzd2 + i17] != -1) {
                            long jZzu5 = iZza2 == 0 ? zzdyVar2.zzu() : zzdyVar2.zzw();
                            if (jZzu5 == 0) {
                                break;
                            }
                            jZzu = com.google.android.gms.internal.ads.zzei.zzu(jZzu5, 1000000L, jZzu4, java.math.RoundingMode.DOWN);
                            break;
                        }
                        i17++;
                        j6 = j2;
                    }
                    int iZzq = zzdyVar2.zzq();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append((char) (((iZzq >> 10) & 31) + 96));
                    sb.append((char) (((iZzq >> 5) & 31) + 96));
                    sb.append((char) ((iZzq & 31) + 96));
                    com.google.android.gms.internal.ads.zzaic zzaicVar = new com.google.android.gms.internal.ads.zzaic(jZzu4, jZzu, sb.toString());
                    com.google.android.gms.internal.ads.zzeo zzeoVarZzb5 = zzenVarZza3.zzb(androidx.media3.extractor.mp4.Atom.TYPE_stsd);
                    if (zzeoVarZzb5 == null) {
                        throw com.google.android.gms.internal.ads.zzbc.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    int i19 = zzaiiVar.zza;
                    int i20 = zzaiiVar.zzc;
                    java.lang.String str8 = zzaicVar.zzc;
                    com.google.android.gms.internal.ads.zzdy zzdyVar3 = zzeoVarZzb5.zza;
                    zzdyVar3.zzL(12);
                    int iZzg6 = zzdyVar3.zzg();
                    com.google.android.gms.internal.ads.zzaif zzaifVar3 = new com.google.android.gms.internal.ads.zzaif(iZzg6);
                    int i21 = 0;
                    while (i21 < iZzg6) {
                        int i22 = i13;
                        int iZzd3 = zzdyVar3.zzd();
                        java.util.ArrayList arrayList4 = arrayList3;
                        int iZzg7 = zzdyVar3.zzg();
                        java.lang.String str9 = "childAtomSize must be positive";
                        com.google.android.gms.internal.ads.zzacr.zzb(iZzg7 > 0, "childAtomSize must be positive");
                        int iZzg8 = zzdyVar3.zzg();
                        int i23 = i21;
                        int i24 = iZzg6;
                        if (iZzg8 == 1635148593 || iZzg8 == 1635148595 || iZzg8 == 1701733238 || iZzg8 == 1831958048 || iZzg8 == 1836070006 || iZzg8 == 1752589105 || iZzg8 == 1751479857 || iZzg8 == 1932670515 || iZzg8 == 1211250227 || iZzg8 == 1748121139 || iZzg8 == 1987063864 || iZzg8 == 1987063865 || iZzg8 == 1635135537 || iZzg8 == 1685479798 || iZzg8 == 1685479729 || iZzg8 == 1685481573 || iZzg8 == 1685481521) {
                            zzaicVar = zzaicVar;
                            com.google.android.gms.internal.ads.zzaif zzaifVar4 = zzaifVar3;
                            zzdyVar3 = zzdyVar3;
                            i = i;
                            str8 = str8;
                            int i25 = i20;
                            int i26 = i19;
                            zzaiiVar = zzaiiVar;
                            j3 = j2;
                            zzdyVar3.zzL(iZzd3 + 16);
                            zzdyVar3.zzM(16);
                            int iZzq2 = zzdyVar3.zzq();
                            int iZzq3 = zzdyVar3.zzq();
                            zzdyVar3.zzM(50);
                            int iZzd4 = zzdyVar3.zzd();
                            if (iZzg8 == 1701733238) {
                                android.util.Pair pairZzj = zzj(zzdyVar3, iZzd3, iZzg7);
                                if (pairZzj != null) {
                                    int iIntValue = ((java.lang.Integer) pairZzj.first).intValue();
                                    zzuVarZzb = zzuVar == null ? null : zzuVar.zzb(((com.google.android.gms.internal.ads.zzajc) pairZzj.second).zzb);
                                    zzaifVar4.zza[i23] = (com.google.android.gms.internal.ads.zzajc) pairZzj.second;
                                    iZzg8 = iIntValue;
                                } else {
                                    zzaifVar4 = zzaifVar4;
                                    iZzg8 = 1701733238;
                                    zzuVarZzb = zzuVar;
                                }
                                zzdyVar3.zzL(iZzd4);
                            } else {
                                zzaifVar4 = zzaifVar4;
                                zzuVarZzb = zzuVar;
                            }
                            if (iZzg8 == 1831958048) {
                                int i27 = iZzg8;
                                str = androidx.media3.common.MimeTypes.VIDEO_MPEG;
                                i5 = i27;
                            } else {
                                i5 = androidx.media3.extractor.mp4.Atom.TYPE_H263;
                                if (iZzg8 == 1211250227) {
                                    str = androidx.media3.common.MimeTypes.VIDEO_H263;
                                } else {
                                    i5 = iZzg8;
                                    str = null;
                                }
                            }
                            int i28 = i5;
                            int i29 = iZzd4;
                            com.google.android.gms.internal.ads.zzu zzuVar2 = zzuVarZzb;
                            float fZzp = 1.0f;
                            zzenVar3 = zzenVar3;
                            int iZzb = -1;
                            int i30 = -1;
                            int i31 = 8;
                            com.google.android.gms.internal.ads.zzfh zzfhVar2 = null;
                            int i32 = 8;
                            int i33 = -1;
                            int i34 = -1;
                            java.util.List listZzo2 = null;
                            java.nio.ByteBuffer byteBufferZzn = null;
                            com.google.android.gms.internal.ads.zzaia zzaiaVar = null;
                            boolean z10 = false;
                            byte[] bArrCopyOfRange = null;
                            int i35 = -1;
                            java.lang.String str10 = null;
                            while (i29 - iZzd3 < iZzg7) {
                                zzdyVar3.zzL(i29);
                                int iZzd5 = zzdyVar3.zzd();
                                int iZzg9 = zzdyVar3.zzg();
                                if (iZzg9 != 0) {
                                    i7 = iZzg9;
                                } else {
                                    if (zzdyVar3.zzd() - iZzd3 == iZzg7) {
                                        break;
                                    }
                                    i7 = 0;
                                }
                                com.google.android.gms.internal.ads.zzacr.zzb(i7 > 0, str9);
                                int iZzg10 = zzdyVar3.zzg();
                                int i36 = iZzd3;
                                if (iZzg10 == 1635148611) {
                                    int i37 = iZzd5 + 8;
                                    com.google.android.gms.internal.ads.zzacr.zzb(str == null, null);
                                    zzdyVar3.zzL(i37);
                                    com.google.android.gms.internal.ads.zzabr zzabrVarZza = com.google.android.gms.internal.ads.zzabr.zza(zzdyVar3);
                                    java.util.List list = zzabrVarZza.zza;
                                    zzaifVar4.zzc = zzabrVarZza.zzb;
                                    if (z10) {
                                        z9 = true;
                                    } else {
                                        fZzp = zzabrVarZza.zzk;
                                        z9 = false;
                                    }
                                    java.lang.String str11 = zzabrVarZza.zzl;
                                    int i38 = zzabrVarZza.zzj;
                                    int i39 = zzabrVarZza.zzg;
                                    int i40 = zzabrVarZza.zzh;
                                    int i41 = zzabrVarZza.zzi;
                                    z10 = z9;
                                    str10 = str11;
                                    i35 = i38;
                                    zzaifVar2 = zzaifVar4;
                                    str2 = str9;
                                    i8 = i40;
                                    i31 = zzabrVarZza.zze;
                                    str = "video/avc";
                                    i11 = i28;
                                    listZzo2 = list;
                                    i33 = i39;
                                    i32 = zzabrVarZza.zzf;
                                    iZzb = i41;
                                } else if (iZzg10 == 1752589123) {
                                    int i42 = iZzd5 + 8;
                                    com.google.android.gms.internal.ads.zzacr.zzb(str == null, null);
                                    zzdyVar3.zzL(i42);
                                    com.google.android.gms.internal.ads.zzadc zzadcVarZza = com.google.android.gms.internal.ads.zzadc.zza(zzdyVar3);
                                    java.util.List list2 = zzadcVarZza.zza;
                                    zzaifVar4.zzc = zzadcVarZza.zzb;
                                    if (z10) {
                                        z8 = true;
                                    } else {
                                        fZzp = zzadcVarZza.zzi;
                                        z8 = false;
                                    }
                                    int i43 = zzadcVarZza.zzj;
                                    java.lang.String str12 = zzadcVarZza.zzk;
                                    int i44 = zzadcVarZza.zzh;
                                    if (i44 != -1) {
                                        i34 = i44;
                                    }
                                    int i45 = zzadcVarZza.zze;
                                    int i46 = zzadcVarZza.zzf;
                                    int i47 = zzadcVarZza.zzg;
                                    i35 = i43;
                                    str10 = str12;
                                    zzaifVar2 = zzaifVar4;
                                    i8 = i46;
                                    str2 = str9;
                                    i31 = zzadcVarZza.zzc;
                                    i32 = zzadcVarZza.zzd;
                                    str = "video/hevc";
                                    i11 = i28;
                                    listZzo2 = list2;
                                    z10 = z8;
                                    zzfhVar2 = zzadcVarZza.zzl;
                                    iZzb = i47;
                                    i33 = i45;
                                } else if (iZzg10 == 1818785347) {
                                    int i48 = iZzd5 + 8;
                                    com.google.android.gms.internal.ads.zzacr.zzb("video/hevc".equals(str), "lhvC must follow hvcC atom");
                                    if (zzfhVar2 != null) {
                                        z7 = zzfhVar2.zza.size() >= 2;
                                    } else {
                                        z7 = false;
                                        zzfhVar2 = null;
                                    }
                                    com.google.android.gms.internal.ads.zzacr.zzb(z7, "must have at least two layers");
                                    zzdyVar3.zzL(i48);
                                    zzfhVar2.getClass();
                                    com.google.android.gms.internal.ads.zzadc zzadcVarZzb = com.google.android.gms.internal.ads.zzadc.zzb(zzdyVar3, zzfhVar2);
                                    com.google.android.gms.internal.ads.zzacr.zzb(zzaifVar4.zzc == zzadcVarZzb.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                    int i49 = zzadcVarZzb.zze;
                                    if (i49 != -1) {
                                        com.google.android.gms.internal.ads.zzacr.zzb(i33 == i49, "colorSpace must be the same for both views");
                                    }
                                    int i50 = zzadcVarZzb.zzf;
                                    if (i50 != -1) {
                                        com.google.android.gms.internal.ads.zzacr.zzb(i30 == i50, "colorRange must be the same for both views");
                                    }
                                    int i51 = zzadcVarZzb.zzg;
                                    if (i51 != -1) {
                                        com.google.android.gms.internal.ads.zzacr.zzb(iZzb == i51, "colorTransfer must be the same for both views");
                                    }
                                    com.google.android.gms.internal.ads.zzacr.zzb(i31 == zzadcVarZzb.zzc, "bitdepthLuma must be the same for both views");
                                    com.google.android.gms.internal.ads.zzacr.zzb(i32 == zzadcVarZzb.zzd, "bitdepthChroma must be the same for both views");
                                    if (listZzo2 != null) {
                                        com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
                                        zzfxkVar.zzh(listZzo2);
                                        zzfxkVar.zzh(zzadcVarZzb.zza);
                                        listZzo2 = zzfxkVar.zzi();
                                    } else {
                                        com.google.android.gms.internal.ads.zzacr.zzb(false, "initializationData must be already set from hvcC atom");
                                    }
                                    str = "video/mv-hevc";
                                    i8 = i30;
                                    str10 = zzadcVarZzb.zzk;
                                    zzaifVar2 = zzaifVar4;
                                    str2 = str9;
                                    i11 = i28;
                                } else if (iZzg10 == 1986361461) {
                                    zzdyVar3.zzL(iZzd5 + 8);
                                    zzaifVar2 = zzaifVar4;
                                    int iZzd6 = zzdyVar3.zzd();
                                    com.google.android.gms.internal.ads.zzaib zzaibVar = null;
                                    while (iZzd6 - iZzd5 < i7) {
                                        zzdyVar3.zzL(iZzd6);
                                        int iZzg11 = zzdyVar3.zzg();
                                        com.google.android.gms.internal.ads.zzacr.zzb(iZzg11 > 0, str9);
                                        int i52 = i31;
                                        if (zzdyVar3.zzg() == 1702454643) {
                                            zzdyVar3.zzL(iZzd6 + 8);
                                            int iZzd7 = zzdyVar3.zzd();
                                            while (true) {
                                                if (iZzd7 - iZzd6 >= iZzg11) {
                                                    str6 = str9;
                                                    zzaibVar = null;
                                                    break;
                                                }
                                                zzdyVar3.zzL(iZzd7);
                                                int iZzg12 = zzdyVar3.zzg();
                                                com.google.android.gms.internal.ads.zzacr.zzb(iZzg12 > 0, str9);
                                                str6 = str9;
                                                if (zzdyVar3.zzg() == 1937011305) {
                                                    zzdyVar3.zzM(4);
                                                    int iZzm = zzdyVar3.zzm() & 15;
                                                    zzaibVar = new com.google.android.gms.internal.ads.zzaib(new com.google.android.gms.internal.ads.zzaie(1 == (iZzm & 1), (iZzm & 2) == 2, (iZzm & 8) == 8, (iZzm & 4) == 4));
                                                    break;
                                                }
                                                iZzd7 += iZzg12;
                                                str9 = str6;
                                            }
                                        } else {
                                            str6 = str9;
                                        }
                                        iZzd6 += iZzg11;
                                        i32 = i32;
                                        i31 = i52;
                                        str9 = str6;
                                        i30 = i30;
                                        listZzo2 = listZzo2;
                                    }
                                    i8 = i30;
                                    i9 = i31;
                                    i10 = i32;
                                    str2 = str9;
                                    listZzo = listZzo2;
                                    com.google.android.gms.internal.ads.zzaij zzaijVar = zzaibVar == null ? null : new com.google.android.gms.internal.ads.zzaij(zzaibVar);
                                    if (zzaijVar != null) {
                                        if (zzfhVar2 == null) {
                                            z6 = true;
                                            i12 = -1;
                                            zzfhVar2 = null;
                                        } else if (zzfhVar2.zza.size() >= 2) {
                                            com.google.android.gms.internal.ads.zzacr.zzb(zzaijVar.zzb(), "both eye views must be marked as available");
                                            com.google.android.gms.internal.ads.zzacr.zzb(!zzaijVar.zza.zza.zzc, "for MV-HEVC, eye_views_reversed must be set to false");
                                        } else {
                                            z6 = true;
                                            i12 = -1;
                                        }
                                        if (i34 != i12) {
                                            i11 = i28;
                                            i32 = i10;
                                            i31 = i9;
                                            listZzo2 = listZzo;
                                        } else if (z6 != zzaijVar.zza.zza.zzc) {
                                            i11 = i28;
                                            i32 = i10;
                                            i31 = i9;
                                            listZzo2 = listZzo;
                                            i34 = 4;
                                        } else {
                                            i34 = 5;
                                            i11 = i28;
                                            i32 = i10;
                                            i31 = i9;
                                            listZzo2 = listZzo;
                                        }
                                    }
                                    i11 = i28;
                                    zzfhVar = zzfhVar2;
                                    zzfhVar2 = zzfhVar;
                                    i32 = i10;
                                    i31 = i9;
                                    listZzo2 = listZzo;
                                } else {
                                    i8 = i30;
                                    i9 = i31;
                                    zzaifVar2 = zzaifVar4;
                                    i10 = i32;
                                    str2 = str9;
                                    listZzo = listZzo2;
                                    if (iZzg10 == 1685480259 || iZzg10 == 1685485123) {
                                        i11 = i28;
                                        zzfhVar = zzfhVar2;
                                        com.google.android.gms.internal.ads.zzacj zzacjVarZza = com.google.android.gms.internal.ads.zzacj.zza(zzdyVar3);
                                        if (zzacjVarZza != null) {
                                            str10 = zzacjVarZza.zza;
                                            str = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                                        }
                                    } else if (iZzg10 == 1987076931) {
                                        if (str == null) {
                                            str5 = null;
                                            z5 = true;
                                        } else {
                                            str5 = null;
                                            z5 = false;
                                        }
                                        com.google.android.gms.internal.ads.zzacr.zzb(z5, str5);
                                        zzdyVar3.zzL(iZzd5 + 12);
                                        byte bZzm = (byte) zzdyVar3.zzm();
                                        byte bZzm2 = (byte) zzdyVar3.zzm();
                                        int iZzm2 = zzdyVar3.zzm();
                                        int i53 = iZzm2 >> 4;
                                        int i54 = iZzm2 >> 1;
                                        int i55 = i28;
                                        java.lang.String str13 = i55 == 1987063864 ? androidx.media3.common.MimeTypes.VIDEO_VP8 : androidx.media3.common.MimeTypes.VIDEO_VP9;
                                        if (str13.equals(androidx.media3.common.MimeTypes.VIDEO_VP9)) {
                                            int i56 = com.google.android.gms.internal.ads.zzcy.zza;
                                            c = 3;
                                            listZzo = com.google.android.gms.internal.ads.zzfxn.zzo(new byte[]{1, 1, bZzm, 2, 1, bZzm2, 3, 1, (byte) i53, 4, 1, (byte) (i54 & 7)});
                                        } else {
                                            c = 3;
                                        }
                                        int i57 = iZzm2 & 1;
                                        int iZzm3 = zzdyVar3.zzm();
                                        int iZzm4 = zzdyVar3.zzm();
                                        int iZza3 = com.google.android.gms.internal.ads.zzk.zza(iZzm3);
                                        int i58 = 1 != i57 ? 2 : 1;
                                        int iZzb2 = com.google.android.gms.internal.ads.zzk.zzb(iZzm4);
                                        i33 = iZza3;
                                        i31 = i53;
                                        i11 = i55;
                                        i8 = i58;
                                        listZzo2 = listZzo;
                                        iZzb = iZzb2;
                                        i32 = i31;
                                        str = str13;
                                    } else {
                                        int i59 = i28;
                                        if (iZzg10 == 1635135811) {
                                            int i60 = i7 - 8;
                                            byte[] bArr = new byte[i60];
                                            zzdyVar3.zzH(bArr, 0, i60);
                                            com.google.android.gms.internal.ads.zzfxn zzfxnVarZzo2 = com.google.android.gms.internal.ads.zzfxn.zzo(bArr);
                                            zzdyVar3.zzL(iZzd5 + 8);
                                            com.google.android.gms.internal.ads.zzk zzkVarZzk = zzk(zzdyVar3);
                                            int i61 = zzkVarZzk.zzf;
                                            int i62 = zzkVarZzk.zzg;
                                            int i63 = zzkVarZzk.zzb;
                                            int i64 = zzkVarZzk.zzc;
                                            listZzo2 = zzfxnVarZzo2;
                                            iZzb = zzkVarZzk.zzd;
                                            i31 = i61;
                                            i11 = i59;
                                            i8 = i64;
                                            str = "video/av01";
                                            i32 = i62;
                                            i33 = i63;
                                        } else if (iZzg10 == 1668050025) {
                                            if (byteBufferZzn == null) {
                                                byteBufferZzn = zzn();
                                            }
                                            java.nio.ByteBuffer byteBuffer = byteBufferZzn;
                                            byteBuffer.position(21);
                                            byteBuffer.putShort(zzdyVar3.zzE());
                                            byteBuffer.putShort(zzdyVar3.zzE());
                                            byteBufferZzn = byteBuffer;
                                            i11 = i59;
                                            i32 = i10;
                                            i31 = i9;
                                            listZzo2 = listZzo;
                                        } else {
                                            if (iZzg10 == 1835295606) {
                                                if (byteBufferZzn == null) {
                                                    byteBufferZzn = zzn();
                                                }
                                                java.nio.ByteBuffer byteBuffer2 = byteBufferZzn;
                                                short sZzE = zzdyVar3.zzE();
                                                short sZzE2 = zzdyVar3.zzE();
                                                short sZzE3 = zzdyVar3.zzE();
                                                short sZzE4 = zzdyVar3.zzE();
                                                short sZzE5 = zzdyVar3.zzE();
                                                short sZzE6 = zzdyVar3.zzE();
                                                short sZzE7 = zzdyVar3.zzE();
                                                zzfhVar = zzfhVar2;
                                                short sZzE8 = zzdyVar3.zzE();
                                                long jZzu6 = zzdyVar3.zzu();
                                                long jZzu7 = zzdyVar3.zzu();
                                                i11 = i59;
                                                byteBuffer2.position(1);
                                                byteBuffer2.putShort(sZzE5);
                                                byteBuffer2.putShort(sZzE6);
                                                byteBuffer2.putShort(sZzE);
                                                byteBuffer2.putShort(sZzE2);
                                                byteBuffer2.putShort(sZzE3);
                                                byteBuffer2.putShort(sZzE4);
                                                byteBuffer2.putShort(sZzE7);
                                                byteBuffer2.putShort(sZzE8);
                                                byteBuffer2.putShort((short) (jZzu6 / 10000));
                                                byteBuffer2.putShort((short) (jZzu7 / 10000));
                                                byteBufferZzn = byteBuffer2;
                                            } else {
                                                zzfhVar = zzfhVar2;
                                                i11 = i59;
                                                if (iZzg10 == 1681012275) {
                                                    if (str == null) {
                                                        str4 = null;
                                                        z4 = true;
                                                    } else {
                                                        str4 = null;
                                                        z4 = false;
                                                    }
                                                    com.google.android.gms.internal.ads.zzacr.zzb(z4, str4);
                                                    str3 = androidx.media3.common.MimeTypes.VIDEO_H263;
                                                } else if (iZzg10 == 1702061171) {
                                                    com.google.android.gms.internal.ads.zzacr.zzb(str == null, null);
                                                    com.google.android.gms.internal.ads.zzaia zzaiaVarZzm = zzm(zzdyVar3, iZzd5);
                                                    str3 = zzaiaVarZzm.zza;
                                                    byte[] bArr2 = zzaiaVarZzm.zzb;
                                                    if (bArr2 != null) {
                                                        zzaiaVar = zzaiaVarZzm;
                                                        listZzo2 = com.google.android.gms.internal.ads.zzfxn.zzo(bArr2);
                                                        zzfhVar2 = zzfhVar;
                                                        i32 = i10;
                                                        i31 = i9;
                                                        str = str3;
                                                    } else {
                                                        zzaiaVar = zzaiaVarZzm;
                                                    }
                                                } else if (iZzg10 == 1885434736) {
                                                    zzdyVar3.zzL(iZzd5 + 8);
                                                    fZzp = zzdyVar3.zzp() / zzdyVar3.zzp();
                                                    zzfhVar2 = zzfhVar;
                                                    i32 = i10;
                                                    i31 = i9;
                                                    listZzo2 = listZzo;
                                                    z10 = true;
                                                } else if (iZzg10 == 1937126244) {
                                                    int i65 = iZzd5 + 8;
                                                    while (true) {
                                                        if (i65 - iZzd5 < i7) {
                                                            zzdyVar3.zzL(i65);
                                                            int iZzg13 = zzdyVar3.zzg() + i65;
                                                            if (zzdyVar3.zzg() == 1886547818) {
                                                                bArrCopyOfRange = java.util.Arrays.copyOfRange(zzdyVar3.zzN(), i65, iZzg13);
                                                            } else {
                                                                i65 = iZzg13;
                                                            }
                                                        } else {
                                                            zzfhVar2 = zzfhVar;
                                                            i32 = i10;
                                                            i31 = i9;
                                                            listZzo2 = listZzo;
                                                            bArrCopyOfRange = null;
                                                        }
                                                    }
                                                } else if (iZzg10 == 1936995172) {
                                                    int iZzm5 = zzdyVar3.zzm();
                                                    zzdyVar3.zzM(3);
                                                    if (iZzm5 == 0) {
                                                        int iZzm6 = zzdyVar3.zzm();
                                                        if (iZzm6 == 0) {
                                                            zzfhVar2 = zzfhVar;
                                                            i32 = i10;
                                                            i31 = i9;
                                                            listZzo2 = listZzo;
                                                            i34 = 0;
                                                        } else if (iZzm6 == 1) {
                                                            zzfhVar2 = zzfhVar;
                                                            i32 = i10;
                                                            i31 = i9;
                                                            listZzo2 = listZzo;
                                                            i34 = 1;
                                                        } else if (iZzm6 == 2) {
                                                            zzfhVar2 = zzfhVar;
                                                            i32 = i10;
                                                            i31 = i9;
                                                            listZzo2 = listZzo;
                                                            i34 = 2;
                                                        } else if (iZzm6 == 3) {
                                                            i34 = 3;
                                                            zzfhVar2 = zzfhVar;
                                                            i32 = i10;
                                                            i31 = i9;
                                                            listZzo2 = listZzo;
                                                        }
                                                    }
                                                } else if (iZzg10 == 1668246642) {
                                                    if (i33 == -1) {
                                                        if (iZzb == -1) {
                                                            int iZzg14 = zzdyVar3.zzg();
                                                            if (iZzg14 == 1852009592 || iZzg14 == 1852009571) {
                                                                int iZzq4 = zzdyVar3.zzq();
                                                                int iZzq5 = zzdyVar3.zzq();
                                                                zzdyVar3.zzM(2);
                                                                if (i7 != 19) {
                                                                    z3 = false;
                                                                } else if ((zzdyVar3.zzm() & 128) != 0) {
                                                                    i7 = 19;
                                                                    z3 = true;
                                                                } else {
                                                                    i7 = 19;
                                                                    z3 = false;
                                                                }
                                                                int iZza4 = com.google.android.gms.internal.ads.zzk.zza(iZzq4);
                                                                int i66 = true != z3 ? 2 : 1;
                                                                i33 = iZza4;
                                                                iZzb = com.google.android.gms.internal.ads.zzk.zzb(iZzq5);
                                                                i8 = i66;
                                                            } else {
                                                                com.google.android.gms.internal.ads.zzdo.zzf("BoxParsers", "Unsupported color type: ".concat(com.google.android.gms.internal.ads.zzeq.zze(iZzg14)));
                                                                iZzb = -1;
                                                                i33 = -1;
                                                            }
                                                        } else {
                                                            i33 = -1;
                                                        }
                                                    }
                                                }
                                                str = str3;
                                            }
                                            zzfhVar2 = zzfhVar;
                                            i32 = i10;
                                            i31 = i9;
                                            listZzo2 = listZzo;
                                        }
                                    }
                                    zzfhVar2 = zzfhVar;
                                    i32 = i10;
                                    i31 = i9;
                                    listZzo2 = listZzo;
                                }
                                i29 += i7;
                                iZzg7 = iZzg7;
                                iZzd3 = i36;
                                zzaifVar4 = zzaifVar2;
                                str9 = str2;
                                i30 = i8;
                                i28 = i11;
                            }
                            int i67 = i30;
                            int i68 = i31;
                            com.google.android.gms.internal.ads.zzaif zzaifVar5 = zzaifVar4;
                            int i69 = i32;
                            iZzg7 = iZzg7;
                            iZzd3 = iZzd3;
                            java.util.List list3 = listZzo2;
                            b = -1;
                            if (str == null) {
                                i20 = i25;
                                i6 = i26;
                                zzaifVar = zzaifVar5;
                            } else {
                                com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                                i6 = i26;
                                zzzVar.zzL(i6);
                                zzzVar.zzaa(str);
                                zzzVar.zzA(str10);
                                zzzVar.zzaf(iZzq2);
                                zzzVar.zzK(iZzq3);
                                zzzVar.zzW(fZzp);
                                i20 = i25;
                                zzzVar.zzZ(i20);
                                zzzVar.zzX(bArrCopyOfRange);
                                zzzVar.zzad(i34);
                                zzzVar.zzN(list3);
                                zzzVar.zzS(i35);
                                zzzVar.zzF(zzuVar2);
                                com.google.android.gms.internal.ads.zzi zziVar = new com.google.android.gms.internal.ads.zzi();
                                zziVar.zzc(i33);
                                zziVar.zzb(i67);
                                zziVar.zzd(iZzb);
                                zziVar.zze(byteBufferZzn != null ? byteBufferZzn.array() : null);
                                zziVar.zzf(i68);
                                zziVar.zza(i69);
                                zzzVar.zzB(zziVar.zzg());
                                if (zzaiaVar != null) {
                                    zzzVar.zzy(com.google.android.gms.internal.ads.zzgaq.zze(zzaiaVar.zzc));
                                    zzzVar.zzV(com.google.android.gms.internal.ads.zzgaq.zze(zzaiaVar.zzd));
                                }
                                com.google.android.gms.internal.ads.zzab zzabVarZzag = zzzVar.zzag();
                                zzaifVar = zzaifVar5;
                                zzaifVar.zzb = zzabVarZzag;
                            }
                        } else if (iZzg8 == 1836069985 || iZzg8 == 1701733217 || iZzg8 == 1633889587 || iZzg8 == 1700998451 || iZzg8 == 1633889588 || iZzg8 == 1835823201 || iZzg8 == 1685353315 || iZzg8 == 1685353317 || iZzg8 == 1685353320 || iZzg8 == 1685353324 || iZzg8 == 1685353336 || iZzg8 == 1935764850 || iZzg8 == 1935767394 || iZzg8 == 1819304813 || iZzg8 == 1936684916 || iZzg8 == 1953984371 || iZzg8 == 778924082 || iZzg8 == 778924083 || iZzg8 == 1835557169 || iZzg8 == 1835560241 || iZzg8 == 1634492771 || iZzg8 == 1634492791 || iZzg8 == 1970037111 || iZzg8 == 1332770163 || iZzg8 == 1716281667 || iZzg8 == 1767992678) {
                            int i70 = i19;
                            com.google.android.gms.internal.ads.zzaif zzaifVar6 = zzaifVar3;
                            zzaicVar = zzaicVar;
                            zzdyVar3 = zzdyVar3;
                            i = i;
                            str8 = str8;
                            zzaiiVar = zzaiiVar;
                            j3 = j2;
                            zzo(zzdyVar3, iZzg8, iZzd3, iZzg7, i70, str8, z2, zzuVar, zzaifVar6, i23);
                            iZzg7 = iZzg7;
                            iZzd3 = iZzd3;
                            zzenVar3 = zzenVar3;
                            i20 = i20;
                            i6 = i70;
                            zzaifVar = zzaifVar6;
                            b = -1;
                        } else {
                            if (iZzg8 == 1414810956 || iZzg8 == 1954034535 || iZzg8 == 2004251764 || iZzg8 == 1937010800 || iZzg8 == 1664495672) {
                                zzdyVar3.zzL(iZzd3 + 16);
                                if (iZzg8 == 1414810956) {
                                    str7 = androidx.media3.common.MimeTypes.APPLICATION_TTML;
                                } else {
                                    if (iZzg8 == 1954034535) {
                                        int i71 = iZzg7 - 16;
                                        byte[] bArr3 = new byte[i71];
                                        zzdyVar3.zzH(bArr3, 0, i71);
                                        j4 = Long.MAX_VALUE;
                                        zzfxnVarZzo = com.google.android.gms.internal.ads.zzfxn.zzo(bArr3);
                                        str7 = androidx.media3.common.MimeTypes.APPLICATION_TX3G;
                                    } else if (iZzg8 == 2004251764) {
                                        str7 = androidx.media3.common.MimeTypes.APPLICATION_MP4VTT;
                                    } else if (iZzg8 == 1937010800) {
                                        str7 = androidx.media3.common.MimeTypes.APPLICATION_TTML;
                                        j4 = 0;
                                        zzfxnVarZzo = null;
                                    } else {
                                        zzaifVar3.zzd = 1;
                                        str7 = androidx.media3.common.MimeTypes.APPLICATION_MP4CEA608;
                                        j4 = Long.MAX_VALUE;
                                        zzfxnVarZzo = null;
                                    }
                                    com.google.android.gms.internal.ads.zzz zzzVar2 = new com.google.android.gms.internal.ads.zzz();
                                    zzzVar2.zzL(i19);
                                    zzzVar2.zzaa(str7);
                                    zzzVar2.zzQ(str8);
                                    zzzVar2.zzae(j4);
                                    zzzVar2.zzN(zzfxnVarZzo);
                                    zzaifVar3.zzb = zzzVar2.zzag();
                                    i6 = i19;
                                }
                                j4 = Long.MAX_VALUE;
                                zzfxnVarZzo = null;
                                com.google.android.gms.internal.ads.zzz zzzVar3 = new com.google.android.gms.internal.ads.zzz();
                                zzzVar3.zzL(i19);
                                zzzVar3.zzaa(str7);
                                zzzVar3.zzQ(str8);
                                zzzVar3.zzae(j4);
                                zzzVar3.zzN(zzfxnVarZzo);
                                zzaifVar3.zzb = zzzVar3.zzag();
                                i6 = i19;
                            } else {
                                if (iZzg8 == 1835365492) {
                                    zzdyVar3.zzL(iZzd3 + 16);
                                    zzdyVar3.zzy((char) 0);
                                    java.lang.String strZzy = zzdyVar3.zzy((char) 0);
                                    if (strZzy != null) {
                                        com.google.android.gms.internal.ads.zzz zzzVar4 = new com.google.android.gms.internal.ads.zzz();
                                        zzzVar4.zzL(i19);
                                        zzzVar4.zzaa(strZzy);
                                        zzaifVar3.zzb = zzzVar4.zzag();
                                    }
                                } else if (iZzg8 == 1667329389) {
                                    com.google.android.gms.internal.ads.zzz zzzVar5 = new com.google.android.gms.internal.ads.zzz();
                                    zzzVar5.zzL(i19);
                                    zzzVar5.zzaa(androidx.media3.common.MimeTypes.APPLICATION_CAMERA_MOTION);
                                    zzaifVar3.zzb = zzzVar5.zzag();
                                }
                                i6 = i19;
                            }
                            j3 = j2;
                            zzaifVar = zzaifVar3;
                            b = -1;
                        }
                        zzdyVar3.zzL(iZzd3 + iZzg7);
                        i21 = i23 + 1;
                        zzuVar = zzuVar;
                        i20 = i20;
                        zzaifVar3 = zzaifVar;
                        i19 = i6;
                        str8 = str8;
                        iZzg6 = i24;
                        i13 = i22;
                        arrayList3 = arrayList4;
                        zzenVar3 = zzenVar3;
                        i = i;
                        zzaiiVar = zzaiiVar;
                        j2 = j3;
                        zzdyVar3 = zzdyVar3;
                        zzaicVar = zzaicVar;
                    }
                    com.google.android.gms.internal.ads.zzaic zzaicVar2 = zzaicVar;
                    com.google.android.gms.internal.ads.zzaif zzaifVar7 = zzaifVar3;
                    int i72 = i;
                    arrayList = arrayList3;
                    com.google.android.gms.internal.ads.zzaii zzaiiVar2 = zzaiiVar;
                    i4 = i13;
                    com.google.android.gms.internal.ads.zzen zzenVar4 = zzenVar3;
                    long j7 = j2;
                    if (z) {
                        zzenVar2 = zzenVar4;
                    } else {
                        zzenVar2 = zzenVar4;
                        com.google.android.gms.internal.ads.zzen zzenVarZza4 = zzenVar2.zza(androidx.media3.extractor.mp4.Atom.TYPE_edts);
                        if (zzenVarZza4 != null) {
                            com.google.android.gms.internal.ads.zzeo zzeoVarZzb6 = zzenVarZza4.zzb(androidx.media3.extractor.mp4.Atom.TYPE_elst);
                            if (zzeoVarZzb6 == null) {
                                pairCreate = null;
                            } else {
                                com.google.android.gms.internal.ads.zzdy zzdyVar4 = zzeoVarZzb6.zza;
                                zzdyVar4.zzL(8);
                                int iZza5 = zza(zzdyVar4.zzg());
                                int iZzp = zzdyVar4.zzp();
                                long[] jArr3 = new long[iZzp];
                                long[] jArr4 = new long[iZzp];
                                for (int i73 = 0; i73 < iZzp; i73++) {
                                    jArr3[i73] = iZza5 == 1 ? zzdyVar4.zzw() : zzdyVar4.zzu();
                                    jArr4[i73] = iZza5 == 1 ? zzdyVar4.zzt() : zzdyVar4.zzg();
                                    if (zzdyVar4.zzE() != 1) {
                                        throw new java.lang.IllegalArgumentException("Unsupported media rate.");
                                    }
                                    zzdyVar4.zzM(2);
                                }
                                pairCreate = android.util.Pair.create(jArr3, jArr4);
                            }
                            if (pairCreate != null) {
                                jArr2 = (long[]) pairCreate.first;
                                jArr = (long[]) pairCreate.second;
                            }
                        }
                        zzabVar = zzaifVar7.zzb;
                        if (zzabVar == null) {
                            com.google.android.gms.internal.ads.zzajb zzajbVar3 = new com.google.android.gms.internal.ads.zzajb(zzaiiVar2.zza, i72, zzaicVar2.zza, j7, jZzu3, zzaicVar2.zzb, zzabVar, zzaifVar7.zzd, zzaifVar7.zza, zzaifVar7.zzc, jArr2, jArr);
                            zzfucVar = zzfucVar;
                            zzajbVar = zzajbVar3;
                        }
                        zzajbVar2 = (com.google.android.gms.internal.ads.zzajb) zzfucVar.apply(zzajbVar);
                        if (zzajbVar2 != null) {
                            com.google.android.gms.internal.ads.zzen zzenVarZza5 = zzenVar2.zza(androidx.media3.extractor.mp4.Atom.TYPE_mdia);
                            zzenVarZza5.getClass();
                            com.google.android.gms.internal.ads.zzen zzenVarZza6 = zzenVarZza5.zza(androidx.media3.extractor.mp4.Atom.TYPE_minf);
                            zzenVarZza6.getClass();
                            com.google.android.gms.internal.ads.zzen zzenVarZza7 = zzenVarZza6.zza(androidx.media3.extractor.mp4.Atom.TYPE_stbl);
                            zzenVarZza7.getClass();
                            com.google.android.gms.internal.ads.zzaje zzajeVarZze = zze(zzajbVar2, zzenVarZza7, zzadbVar);
                            arrayList2 = arrayList;
                            arrayList2.add(zzajeVarZze);
                        } else {
                            arrayList2 = arrayList;
                        }
                    }
                    jArr = null;
                    jArr2 = null;
                    zzabVar = zzaifVar7.zzb;
                    if (zzabVar == null) {
                        com.google.android.gms.internal.ads.zzajb zzajbVar4 = new com.google.android.gms.internal.ads.zzajb(zzaiiVar2.zza, i72, zzaicVar2.zza, j7, jZzu3, zzaicVar2.zzb, zzabVar, zzaifVar7.zzd, zzaifVar7.zza, zzaifVar7.zzc, jArr2, jArr);
                        zzfucVar = zzfucVar;
                        zzajbVar = zzajbVar4;
                    }
                    zzajbVar2 = (com.google.android.gms.internal.ads.zzajb) zzfucVar.apply(zzajbVar);
                    if (zzajbVar2 != null) {
                        com.google.android.gms.internal.ads.zzen zzenVarZza8 = zzenVar2.zza(androidx.media3.extractor.mp4.Atom.TYPE_mdia);
                        zzenVarZza8.getClass();
                        com.google.android.gms.internal.ads.zzen zzenVarZza9 = zzenVarZza8.zza(androidx.media3.extractor.mp4.Atom.TYPE_minf);
                        zzenVarZza9.getClass();
                        com.google.android.gms.internal.ads.zzen zzenVarZza10 = zzenVarZza9.zza(androidx.media3.extractor.mp4.Atom.TYPE_stbl);
                        zzenVarZza10.getClass();
                        com.google.android.gms.internal.ads.zzaje zzajeVarZze2 = zze(zzajbVar2, zzenVarZza10, zzadbVar);
                        arrayList2 = arrayList;
                        arrayList2.add(zzajeVarZze2);
                    } else {
                        arrayList2 = arrayList;
                    }
                }
                zzajbVar = null;
                zzajbVar2 = (com.google.android.gms.internal.ads.zzajb) zzfucVar.apply(zzajbVar);
                if (zzajbVar2 != null) {
                    com.google.android.gms.internal.ads.zzen zzenVarZza11 = zzenVar2.zza(androidx.media3.extractor.mp4.Atom.TYPE_mdia);
                    zzenVarZza11.getClass();
                    com.google.android.gms.internal.ads.zzen zzenVarZza12 = zzenVarZza11.zza(androidx.media3.extractor.mp4.Atom.TYPE_minf);
                    zzenVarZza12.getClass();
                    com.google.android.gms.internal.ads.zzen zzenVarZza13 = zzenVarZza12.zza(androidx.media3.extractor.mp4.Atom.TYPE_stbl);
                    zzenVarZza13.getClass();
                    com.google.android.gms.internal.ads.zzaje zzajeVarZze3 = zze(zzajbVar2, zzenVarZza13, zzadbVar);
                    arrayList2 = arrayList;
                    arrayList2.add(zzajeVarZze3);
                } else {
                    arrayList2 = arrayList;
                }
            }
            i13 = i4 + 1;
            arrayList3 = arrayList2;
        }
        return arrayList3;
    }

    public static void zzg(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int iZzd = zzdyVar.zzd();
        zzdyVar.zzM(4);
        if (zzdyVar.zzg() != 1751411826) {
            iZzd += 4;
        }
        zzdyVar.zzL(iZzd);
    }

    private static int zzh(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int iZzm = zzdyVar.zzm();
        int i = iZzm & 127;
        while ((iZzm & 128) == 128) {
            iZzm = zzdyVar.zzm();
            i = (i << 7) | (iZzm & 127);
        }
        return i;
    }

    private static int zzi(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        zzdyVar.zzL(16);
        return zzdyVar.zzg();
    }

    private static android.util.Pair zzj(com.google.android.gms.internal.ads.zzdy zzdyVar, int i, int i2) throws com.google.android.gms.internal.ads.zzbc {
        com.google.android.gms.internal.ads.zzajc zzajcVar;
        android.util.Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int iZzd = zzdyVar.zzd();
        while (iZzd - i < i2) {
            zzdyVar.zzL(iZzd);
            int iZzg = zzdyVar.zzg();
            com.google.android.gms.internal.ads.zzacr.zzb(iZzg > 0, "childAtomSize must be positive");
            if (zzdyVar.zzg() == 1936289382) {
                int i5 = iZzd + 8;
                int i6 = 0;
                int i7 = -1;
                java.lang.String strZzB = null;
                java.lang.Integer numValueOf = null;
                while (i5 - iZzd < iZzg) {
                    zzdyVar.zzL(i5);
                    int iZzg2 = zzdyVar.zzg();
                    int iZzg3 = zzdyVar.zzg();
                    if (iZzg3 == 1718775137) {
                        numValueOf = java.lang.Integer.valueOf(zzdyVar.zzg());
                    } else if (iZzg3 == 1935894637) {
                        zzdyVar.zzM(4);
                        strZzB = zzdyVar.zzB(4, java.nio.charset.StandardCharsets.UTF_8);
                    } else if (iZzg3 == 1935894633) {
                        i7 = i5;
                        i6 = iZzg2;
                    }
                    i5 += iZzg2;
                }
                if (androidx.media3.common.C.CENC_TYPE_cenc.equals(strZzB) || androidx.media3.common.C.CENC_TYPE_cbc1.equals(strZzB) || androidx.media3.common.C.CENC_TYPE_cens.equals(strZzB) || androidx.media3.common.C.CENC_TYPE_cbcs.equals(strZzB)) {
                    com.google.android.gms.internal.ads.zzacr.zzb(numValueOf != null, "frma atom is mandatory");
                    com.google.android.gms.internal.ads.zzacr.zzb(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            zzajcVar = null;
                            break;
                        }
                        zzdyVar.zzL(i8);
                        int iZzg4 = zzdyVar.zzg();
                        if (zzdyVar.zzg() == 1952804451) {
                            int iZza = zza(zzdyVar.zzg());
                            zzdyVar.zzM(1);
                            if (iZza == 0) {
                                zzdyVar.zzM(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iZzm = zzdyVar.zzm();
                                int i9 = (iZzm & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                i3 = iZzm & 15;
                                i4 = i9;
                            }
                            boolean z = zzdyVar.zzm() == 1;
                            int iZzm2 = zzdyVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzdyVar.zzH(bArr2, 0, 16);
                            if (z && iZzm2 == 0) {
                                int iZzm3 = zzdyVar.zzm();
                                byte[] bArr3 = new byte[iZzm3];
                                zzdyVar.zzH(bArr3, 0, iZzm3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            zzajcVar = new com.google.android.gms.internal.ads.zzajc(z, strZzB, iZzm2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i8 += iZzg4;
                    }
                    com.google.android.gms.internal.ads.zzacr.zzb(zzajcVar != null, "tenc atom is mandatory");
                    int i10 = com.google.android.gms.internal.ads.zzei.zza;
                    pairCreate = android.util.Pair.create(numValueOf, zzajcVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzd += iZzg;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:75:0x0151  */
    /* JADX WARN: Code duplicated, block: B:83:0x016b A[PHI: r3
  0x016b: PHI (r3v5 int) = (r3v4 int), (r3v4 int), (r3v8 int) binds: [B:76:0x015d, B:77:0x015f, B:82:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x017a  */
    private static com.google.android.gms.internal.ads.zzk zzk(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int i;
        int iZzd;
        int iZzd2;
        com.google.android.gms.internal.ads.zzi zziVar = new com.google.android.gms.internal.ads.zzi();
        byte[] bArrZzN = zzdyVar.zzN();
        com.google.android.gms.internal.ads.zzdx zzdxVar = new com.google.android.gms.internal.ads.zzdx(bArrZzN, bArrZzN.length);
        zzdxVar.zzl(zzdyVar.zzd() * 8);
        zzdxVar.zzo(1);
        int iZzd3 = zzdxVar.zzd(3);
        zzdxVar.zzn(6);
        boolean zZzp = zzdxVar.zzp();
        boolean zZzp2 = zzdxVar.zzp();
        boolean z = false;
        if (iZzd3 != 2) {
            if (iZzd3 <= 2) {
                i = true != zZzp ? 8 : 10;
                zziVar.zzf(i);
                zziVar.zza(i);
            }
        } else if (zZzp) {
            i = true == zZzp2 ? 12 : 10;
            zziVar.zzf(i);
            zziVar.zza(i);
        } else {
            zZzp = false;
            iZzd3 = 2;
            if (iZzd3 <= 2) {
                if (true != zZzp) {
                }
                zziVar.zzf(i);
                zziVar.zza(i);
            }
        }
        int i2 = 13;
        zzdxVar.zzn(13);
        zzdxVar.zzm();
        int iZzd4 = zzdxVar.zzd(4);
        if (iZzd4 != 1) {
            com.google.android.gms.internal.ads.zzdo.zze("BoxParsers", "Unsupported obu_type: " + iZzd4);
            return zziVar.zzg();
        }
        if (zzdxVar.zzp()) {
            com.google.android.gms.internal.ads.zzdo.zze("BoxParsers", "Unsupported obu_extension_flag");
            return zziVar.zzg();
        }
        boolean zZzp3 = zzdxVar.zzp();
        zzdxVar.zzm();
        if (zZzp3 && zzdxVar.zzd(8) > 127) {
            com.google.android.gms.internal.ads.zzdo.zze("BoxParsers", "Excessive obu_size");
            return zziVar.zzg();
        }
        int iZzd5 = zzdxVar.zzd(3);
        zzdxVar.zzm();
        if (zzdxVar.zzp()) {
            com.google.android.gms.internal.ads.zzdo.zze("BoxParsers", "Unsupported reduced_still_picture_header");
            return zziVar.zzg();
        }
        if (zzdxVar.zzp()) {
            com.google.android.gms.internal.ads.zzdo.zze("BoxParsers", "Unsupported timing_info_present_flag");
            return zziVar.zzg();
        }
        if (zzdxVar.zzp()) {
            com.google.android.gms.internal.ads.zzdo.zze("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return zziVar.zzg();
        }
        int iZzd6 = zzdxVar.zzd(5);
        for (int i3 = 0; i3 <= iZzd6; i3++) {
            zzdxVar.zzn(12);
            if (zzdxVar.zzd(5) > 7) {
                zzdxVar.zzm();
            }
        }
        int iZzd7 = zzdxVar.zzd(4);
        int iZzd8 = zzdxVar.zzd(4);
        zzdxVar.zzn(iZzd7 + 1);
        zzdxVar.zzn(iZzd8 + 1);
        if (zzdxVar.zzp()) {
            zzdxVar.zzn(7);
        }
        zzdxVar.zzn(7);
        boolean zZzp4 = zzdxVar.zzp();
        if (zZzp4) {
            zzdxVar.zzn(2);
        }
        if ((zzdxVar.zzp() || zzdxVar.zzd(1) > 0) && !zzdxVar.zzp()) {
            zzdxVar.zzn(1);
        }
        if (zZzp4) {
            zzdxVar.zzn(3);
        }
        zzdxVar.zzn(3);
        boolean zZzp5 = zzdxVar.zzp();
        if (iZzd5 != 2) {
            if (iZzd5 != 1) {
            }
            if (zzdxVar.zzp()) {
                int iZzd9 = zzdxVar.zzd(8);
                iZzd = zzdxVar.zzd(8);
                int iZzd10 = zzdxVar.zzd(8);
                if (!z || iZzd9 != 1) {
                    i2 = iZzd;
                    iZzd2 = zzdxVar.zzd(1);
                } else if (iZzd != 13) {
                    iZzd9 = 1;
                    i2 = iZzd;
                    iZzd2 = zzdxVar.zzd(1);
                } else if (iZzd10 == 0) {
                    iZzd2 = 1;
                    iZzd9 = 1;
                } else {
                    iZzd9 = 1;
                    iZzd2 = zzdxVar.zzd(1);
                }
                zziVar.zzc(com.google.android.gms.internal.ads.zzk.zza(iZzd9));
                zziVar.zzb(iZzd2 != 1 ? 2 : 1);
                zziVar.zzd(com.google.android.gms.internal.ads.zzk.zzb(i2));
            }
            return zziVar.zzg();
        }
        if (zZzp5) {
            zzdxVar.zzm();
        }
        if (zzdxVar.zzp()) {
            z = true;
        }
        if (zzdxVar.zzp()) {
            int iZzd11 = zzdxVar.zzd(8);
            iZzd = zzdxVar.zzd(8);
            int iZzd12 = zzdxVar.zzd(8);
            if (!z) {
                i2 = iZzd;
                iZzd2 = zzdxVar.zzd(1);
            } else {
                i2 = iZzd;
                iZzd2 = zzdxVar.zzd(1);
            }
            zziVar.zzc(com.google.android.gms.internal.ads.zzk.zza(iZzd11));
            zziVar.zzb(iZzd2 != 1 ? 2 : 1);
            zziVar.zzd(com.google.android.gms.internal.ads.zzk.zzb(i2));
        }
        return zziVar.zzg();
    }

    private static com.google.android.gms.internal.ads.zzay zzl(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        short sZzE = zzdyVar.zzE();
        zzdyVar.zzM(2);
        java.lang.String strZzB = zzdyVar.zzB(sZzE, java.nio.charset.StandardCharsets.UTF_8);
        int iMax = java.lang.Math.max(strZzB.lastIndexOf(43), strZzB.lastIndexOf(45));
        try {
            return new com.google.android.gms.internal.ads.zzay(androidx.media3.common.C.TIME_UNSET, new com.google.android.gms.internal.ads.zzet(java.lang.Float.parseFloat(strZzB.substring(0, iMax)), java.lang.Float.parseFloat(strZzB.substring(iMax, strZzB.length() - 1))));
        } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused) {
            return null;
        }
    }

    private static com.google.android.gms.internal.ads.zzaia zzm(com.google.android.gms.internal.ads.zzdy zzdyVar, int i) {
        zzdyVar.zzL(i + 12);
        zzdyVar.zzM(1);
        zzh(zzdyVar);
        zzdyVar.zzM(2);
        int iZzm = zzdyVar.zzm();
        if ((iZzm & 128) != 0) {
            zzdyVar.zzM(2);
        }
        if ((iZzm & 64) != 0) {
            zzdyVar.zzM(zzdyVar.zzm());
        }
        if ((iZzm & 32) != 0) {
            zzdyVar.zzM(2);
        }
        zzdyVar.zzM(1);
        zzh(zzdyVar);
        java.lang.String strZzd = com.google.android.gms.internal.ads.zzbb.zzd(zzdyVar.zzm());
        if (androidx.media3.common.MimeTypes.AUDIO_MPEG.equals(strZzd) || androidx.media3.common.MimeTypes.AUDIO_DTS.equals(strZzd) || androidx.media3.common.MimeTypes.AUDIO_DTS_HD.equals(strZzd)) {
            return new com.google.android.gms.internal.ads.zzaia(strZzd, null, -1L, -1L);
        }
        zzdyVar.zzM(4);
        long jZzu = zzdyVar.zzu();
        long jZzu2 = zzdyVar.zzu();
        zzdyVar.zzM(1);
        int iZzh = zzh(zzdyVar);
        byte[] bArr = new byte[iZzh];
        zzdyVar.zzH(bArr, 0, iZzh);
        return new com.google.android.gms.internal.ads.zzaia(strZzd, bArr, jZzu2 <= 0 ? -1L : jZzu2, jZzu > 0 ? jZzu : -1L);
    }

    private static java.nio.ByteBuffer zzn() {
        return java.nio.ByteBuffer.allocate(25).order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code duplicated, block: B:132:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:141:0x020d  */
    /* JADX WARN: Code duplicated, block: B:144:0x022a  */
    /* JADX WARN: Code duplicated, block: B:145:0x023b  */
    /* JADX WARN: Code duplicated, block: B:146:0x024a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0251  */
    /* JADX WARN: Code duplicated, block: B:150:0x025c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0264  */
    /* JADX WARN: Code duplicated, block: B:153:0x0273  */
    /* JADX WARN: Code duplicated, block: B:157:0x0288  */
    /* JADX WARN: Code duplicated, block: B:158:0x0293  */
    /* JADX WARN: Code duplicated, block: B:160:0x0298  */
    /* JADX WARN: Code duplicated, block: B:182:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:185:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:186:0x0307  */
    /* JADX WARN: Code duplicated, block: B:188:0x030c  */
    /* JADX WARN: Code duplicated, block: B:190:0x0335  */
    /* JADX WARN: Code duplicated, block: B:191:0x0339  */
    /* JADX WARN: Code duplicated, block: B:193:0x034d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0352 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0354  */
    /* JADX WARN: Code duplicated, block: B:199:0x036e  */
    /* JADX WARN: Code duplicated, block: B:219:0x0444  */
    /* JADX WARN: Code duplicated, block: B:220:0x046d  */
    /* JADX WARN: Code duplicated, block: B:222:0x0478  */
    /* JADX WARN: Code duplicated, block: B:224:0x0486  */
    /* JADX WARN: Code duplicated, block: B:226:0x048e  */
    /* JADX WARN: Code duplicated, block: B:235:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:237:0x04c4 A[LOOP:3: B:233:0x04b6->B:237:0x04c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:240:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:242:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:243:0x0505  */
    /* JADX WARN: Code duplicated, block: B:245:0x050b A[PHI: r1 r3 r22
  0x050b: PHI (r1v55 java.lang.String) = (r1v49 java.lang.String), (r1v56 java.lang.String), (r1v49 java.lang.String), (r1v49 java.lang.String) binds: [B:221:0x0476, B:223:0x0484, B:219:0x0444, B:218:0x0440] A[DONT_GENERATE, DONT_INLINE]
  0x050b: PHI (r3v5 int) = (r3v6 int), (r3v6 int), (r3v12 int), (r3v14 int) binds: [B:221:0x0476, B:223:0x0484, B:219:0x0444, B:218:0x0440] A[DONT_GENERATE, DONT_INLINE]
  0x050b: PHI (r22v2 com.google.android.gms.internal.ads.zzaia) = 
  (r22v1 com.google.android.gms.internal.ads.zzaia)
  (r22v3 com.google.android.gms.internal.ads.zzaia)
  (r22v1 com.google.android.gms.internal.ads.zzaia)
  (r22v1 com.google.android.gms.internal.ads.zzaia)
 binds: [B:221:0x0476, B:223:0x0484, B:219:0x0444, B:218:0x0440] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:257:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x04cf A[EDGE_INSN: B:269:0x04cf->B:239:0x04cf BREAK  A[LOOP:3: B:233:0x04b6->B:237:0x04c4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:84:0x013b  */
    private static void zzo(com.google.android.gms.internal.ads.zzdy zzdyVar, int i, int i2, int i3, int i4, java.lang.String str, boolean z, com.google.android.gms.internal.ads.zzu zzuVar, com.google.android.gms.internal.ads.zzaif zzaifVar, int i5) throws com.google.android.gms.internal.ads.zzbc {
        int iZzq;
        int iZzq2;
        int iZzn;
        int iZzg;
        int i6;
        java.lang.String str2;
        int i7;
        java.util.List listZzo;
        com.google.android.gms.internal.ads.zzaia zzaiaVarZzm;
        java.lang.String str3;
        int iZzg2;
        boolean z2;
        int iZzg3;
        int iZzd;
        int i8;
        int i9;
        byte[] bArr;
        com.google.android.gms.internal.ads.zzdy zzdyVar2;
        int i10;
        int i11;
        int iZzm;
        int i12;
        java.lang.String str4;
        boolean z3;
        int iZzm2;
        byte[] bArr2;
        int iZzm3;
        int i13;
        java.lang.String str5;
        byte[] bArr3;
        com.google.android.gms.internal.ads.zzdy zzdyVar3 = zzdyVar;
        int i14 = i2;
        int i15 = i3;
        com.google.android.gms.internal.ads.zzu zzuVarZzb = zzuVar;
        zzdyVar3.zzL(i14 + 16);
        if (z) {
            iZzq = zzdyVar.zzq();
            zzdyVar3.zzM(6);
        } else {
            zzdyVar3.zzM(8);
            iZzq = 0;
        }
        if (iZzq == 0 || iZzq == 1) {
            iZzq2 = zzdyVar.zzq();
            zzdyVar3.zzM(6);
            iZzn = zzdyVar.zzn();
            zzdyVar3.zzL(zzdyVar.zzd() - 4);
            iZzg = zzdyVar.zzg();
            if (iZzq == 1) {
                zzdyVar3.zzM(16);
            }
            i6 = -1;
        } else {
            if (iZzq != 2) {
                return;
            }
            zzdyVar3.zzM(16);
            iZzn = (int) java.lang.Math.round(java.lang.Double.longBitsToDouble(zzdyVar.zzt()));
            int iZzp = zzdyVar.zzp();
            zzdyVar3.zzM(4);
            int iZzp2 = zzdyVar.zzp();
            int iZzp3 = zzdyVar.zzp();
            int i16 = iZzp3 & 1;
            int i17 = iZzp3 & 2;
            if (i16 == 0) {
                if (iZzp2 == 8) {
                    i6 = 3;
                } else if (iZzp2 == 16) {
                    i6 = i17 != 0 ? 268435456 : 2;
                } else if (iZzp2 == 24) {
                    i6 = i17 != 0 ? androidx.media3.common.C.ENCODING_PCM_24BIT_BIG_ENDIAN : 21;
                } else if (iZzp2 == 32) {
                    i6 = i17 != 0 ? androidx.media3.common.C.ENCODING_PCM_32BIT_BIG_ENDIAN : 22;
                } else {
                    i6 = -1;
                }
            } else if (iZzp2 == 32) {
                i6 = 4;
            } else {
                i6 = -1;
            }
            zzdyVar3.zzM(8);
            iZzq2 = iZzp;
            iZzg = 0;
        }
        if (i == 1767992678) {
            iZzn = -1;
        }
        if (i == 1767992678) {
            iZzq2 = -1;
        }
        int iZzd2 = zzdyVar.zzd();
        int iIntValue = androidx.media3.extractor.mp4.Atom.TYPE_enca;
        if (i == 1701733217) {
            android.util.Pair pairZzj = zzj(zzdyVar3, i14, i15);
            if (pairZzj != null) {
                iIntValue = ((java.lang.Integer) pairZzj.first).intValue();
                zzuVarZzb = zzuVarZzb == null ? null : zzuVarZzb.zzb(((com.google.android.gms.internal.ads.zzajc) pairZzj.second).zzb);
                zzaifVar.zza[i5] = (com.google.android.gms.internal.ads.zzajc) pairZzj.second;
            }
            zzdyVar3.zzL(iZzd2);
        } else {
            iIntValue = i;
        }
        java.lang.String str6 = androidx.media3.common.MimeTypes.AUDIO_MPEGH_MHM1;
        if (iIntValue == 1633889587) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_AC3;
        } else {
            if (iIntValue != 1700998451) {
                if (iIntValue == 1633889588) {
                    i7 = i6;
                    str2 = androidx.media3.common.MimeTypes.AUDIO_AC4;
                } else if (iIntValue == 1685353315) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_DTS;
                } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_DTS_HD;
                } else if (iIntValue == 1685353317) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_DTS_EXPRESS;
                } else if (iIntValue == 1685353336) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_DTS_X;
                } else if (iIntValue == 1935764850) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_AMR_NB;
                } else if (iIntValue == 1935767394) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_AMR_WB;
                } else if (iIntValue == 1936684916) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_RAW;
                    i7 = 2;
                } else if (iIntValue == 1953984371) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_RAW;
                    i7 = 268435456;
                } else if (iIntValue == 1819304813) {
                    if (i6 == -1) {
                        str2 = androidx.media3.common.MimeTypes.AUDIO_RAW;
                        i7 = 2;
                    } else {
                        i7 = i6;
                        str2 = androidx.media3.common.MimeTypes.AUDIO_RAW;
                    }
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MPEG;
                } else if (iIntValue == 1835557169) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MPEGH_MHA1;
                } else if (iIntValue == 1835560241) {
                    i7 = i6;
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MPEGH_MHM1;
                } else if (iIntValue == 1634492771) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_ALAC;
                } else if (iIntValue == 1634492791) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_ALAW;
                } else if (iIntValue == 1970037111) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MLAW;
                } else if (iIntValue == 1332770163) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_OPUS;
                } else if (iIntValue == 1716281667) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_FLAC;
                } else if (iIntValue == 1835823201) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_TRUEHD;
                } else if (iIntValue == 1767992678) {
                    str2 = "audio/iamf";
                } else {
                    i7 = i6;
                    str2 = null;
                }
                int i18 = i7;
                listZzo = null;
                zzaiaVarZzm = null;
                str3 = null;
                while (iZzd2 - i14 < i15) {
                    zzdyVar3.zzL(iZzd2);
                    iZzg2 = zzdyVar.zzg();
                    if (iZzg2 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    java.lang.String str7 = "childAtomSize must be positive";
                    com.google.android.gms.internal.ads.zzacr.zzb(z2, "childAtomSize must be positive");
                    iZzg3 = zzdyVar.zzg();
                    iZzn = iZzn;
                    if (iZzg3 == 1835557187) {
                        zzdyVar3.zzL(iZzd2 + 8);
                        zzdyVar3.zzM(1);
                        iZzm3 = zzdyVar.zzm();
                        zzdyVar3.zzM(1);
                        if (java.util.Objects.equals(str2, str6)) {
                            i13 = 0;
                            str5 = java.lang.String.format("mhm1.%02X", java.lang.Integer.valueOf(iZzm3));
                        } else {
                            i13 = 0;
                            str5 = java.lang.String.format("mha1.%02X", java.lang.Integer.valueOf(iZzm3));
                        }
                        int iZzq3 = zzdyVar.zzq();
                        bArr3 = new byte[iZzq3];
                        zzdyVar3.zzH(bArr3, i13, iZzq3);
                        if (listZzo == null) {
                            listZzo = com.google.android.gms.internal.ads.zzfxn.zzo(bArr3);
                            iZzn = iZzn;
                            str3 = str5;
                            i9 = iZzg;
                        } else {
                            listZzo = com.google.android.gms.internal.ads.zzfxn.zzp(bArr3, (byte[]) listZzo.get(i13));
                            str3 = str5;
                            i9 = iZzg;
                        }
                    } else {
                        str6 = str6;
                        if (iZzg3 == 1835557200) {
                            zzdyVar3.zzL(iZzd2 + 8);
                            iZzm2 = zzdyVar.zzm();
                            if (iZzm2 > 0) {
                                bArr2 = new byte[iZzm2];
                                zzdyVar3.zzH(bArr2, 0, iZzm2);
                                if (listZzo == null) {
                                    listZzo = com.google.android.gms.internal.ads.zzfxn.zzo(bArr2);
                                    i9 = iZzg;
                                    iZzn = iZzn;
                                } else {
                                    listZzo = com.google.android.gms.internal.ads.zzfxn.zzp((byte[]) listZzo.get(0), bArr2);
                                    i9 = iZzg;
                                }
                            } else {
                                iZzn = iZzn;
                                i9 = iZzg;
                                iZzn = iZzn;
                            }
                        } else {
                            if (iZzg3 == 1702061171) {
                                iZzn = iZzn;
                                iZzd = iZzd2;
                                i8 = -1;
                            } else if (z || iZzg3 != 2002876005) {
                                if (iZzg3 == 1684103987) {
                                    zzdyVar3.zzL(iZzd2 + 8);
                                    zzaifVar.zzb = com.google.android.gms.internal.ads.zzabn.zzc(zzdyVar3, java.lang.Integer.toString(i4), str, zzuVarZzb);
                                } else if (iZzg3 == 1684366131) {
                                    zzdyVar3.zzL(iZzd2 + 8);
                                    zzaifVar.zzb = com.google.android.gms.internal.ads.zzabn.zzd(zzdyVar3, java.lang.Integer.toString(i4), str, zzuVarZzb);
                                } else if (iZzg3 == 1684103988) {
                                    zzdyVar3.zzL(iZzd2 + 8);
                                    java.lang.String string = java.lang.Integer.toString(i4);
                                    int i19 = com.google.android.gms.internal.ads.zzabq.zza;
                                    zzdyVar3.zzM(1);
                                    iZzm = zzdyVar.zzm() & 32;
                                    com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                                    zzzVar.zzM(string);
                                    zzzVar.zzaa(androidx.media3.common.MimeTypes.AUDIO_AC4);
                                    zzzVar.zzz(2);
                                    if (1 != (iZzm >> 5)) {
                                        i12 = 44100;
                                    } else {
                                        i12 = androidx.media3.extractor.OpusUtil.SAMPLE_RATE;
                                    }
                                    zzzVar.zzab(i12);
                                    zzzVar.zzF(zzuVarZzb);
                                    zzzVar.zzQ(str);
                                    zzaifVar.zzb = zzzVar.zzag();
                                } else if (iZzg3 != 1684892784) {
                                    if (iZzg3 != 1684305011 || iZzg3 == 1969517683) {
                                        com.google.android.gms.internal.ads.zzz zzzVar2 = new com.google.android.gms.internal.ads.zzz();
                                        zzzVar2.zzL(i4);
                                        zzzVar2.zzaa(str2);
                                        zzzVar2.zzz(iZzq2);
                                        iZzn = iZzn;
                                        zzzVar2.zzab(iZzn);
                                        zzzVar2.zzF(zzuVarZzb);
                                        zzzVar2.zzQ(str);
                                        zzaifVar.zzb = zzzVar2.zzag();
                                    } else if (iZzg3 == 1682927731) {
                                        int i20 = iZzg2 - 8;
                                        byte[] bArr4 = zzb;
                                        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr4, bArr4.length + i20);
                                        zzdyVar3.zzL(iZzd2 + 8);
                                        zzdyVar3.zzH(bArrCopyOf, bArr4.length, i20);
                                        listZzo = com.google.android.gms.internal.ads.zzadi.zze(bArrCopyOf);
                                        i9 = iZzg;
                                    } else {
                                        if (iZzg3 == 1684425825) {
                                            int i21 = iZzg2 - 12;
                                            byte[] bArr5 = new byte[i21 + 4];
                                            bArr5[0] = 102;
                                            bArr5[1] = 76;
                                            bArr5[2] = 97;
                                            bArr5[3] = 67;
                                            zzdyVar3.zzL(iZzd2 + 12);
                                            zzdyVar3.zzH(bArr5, 4, i21);
                                            listZzo = com.google.android.gms.internal.ads.zzfxn.zzo(bArr5);
                                        } else {
                                            if (iZzg3 == 1634492771) {
                                                int i22 = iZzg2 - 12;
                                                byte[] bArr6 = new byte[i22];
                                                zzdyVar3.zzL(iZzd2 + 12);
                                                zzdyVar3.zzH(bArr6, 0, i22);
                                                int i23 = com.google.android.gms.internal.ads.zzcy.zza;
                                                com.google.android.gms.internal.ads.zzdy zzdyVar4 = new com.google.android.gms.internal.ads.zzdy(bArr6);
                                                zzdyVar4.zzL(9);
                                                int iZzm4 = zzdyVar4.zzm();
                                                zzdyVar4.zzL(20);
                                                android.util.Pair pairCreate = android.util.Pair.create(java.lang.Integer.valueOf(zzdyVar4.zzp()), java.lang.Integer.valueOf(iZzm4));
                                                int iIntValue2 = ((java.lang.Integer) pairCreate.first).intValue();
                                                int iIntValue3 = ((java.lang.Integer) pairCreate.second).intValue();
                                                listZzo = com.google.android.gms.internal.ads.zzfxn.zzo(bArr6);
                                                iZzq2 = iIntValue3;
                                                iZzn = iIntValue2;
                                            } else if (iZzg3 == 1767990114) {
                                                zzdyVar3.zzL(iZzd2 + 9);
                                                int iZzb = com.google.android.gms.internal.ads.zzgaq.zzb(zzdyVar.zzv());
                                                byte[] bArr7 = new byte[iZzb];
                                                zzdyVar3.zzH(bArr7, 0, iZzb);
                                                listZzo = com.google.android.gms.internal.ads.zzfxn.zzo(bArr7);
                                            } else {
                                                iZzn = iZzn;
                                            }
                                            i9 = iZzg;
                                        }
                                        iZzn = iZzn;
                                        i9 = iZzg;
                                    }
                                    i9 = iZzg;
                                    iZzn = iZzn;
                                } else {
                                    if (iZzg > 0) {
                                        throw com.google.android.gms.internal.ads.zzbc.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + iZzg, null);
                                    }
                                    iZzn = iZzg;
                                    i9 = iZzn;
                                    iZzq2 = 2;
                                }
                                iZzn = iZzn;
                                i9 = iZzg;
                                iZzn = iZzn;
                            } else {
                                iZzd = zzdyVar.zzd();
                                if (iZzd >= iZzd2) {
                                    str4 = null;
                                    z3 = true;
                                } else {
                                    str4 = null;
                                    z3 = false;
                                }
                                com.google.android.gms.internal.ads.zzacr.zzb(z3, str4);
                                while (true) {
                                    if (iZzd - iZzd2 >= iZzg2) {
                                        iZzd = -1;
                                        break;
                                    }
                                    zzdyVar3.zzL(iZzd);
                                    int iZzg4 = zzdyVar.zzg();
                                    com.google.android.gms.internal.ads.zzacr.zzb(iZzg4 > 0, str7);
                                    java.lang.String str8 = str7;
                                    if (zzdyVar.zzg() == 1702061171) {
                                        break;
                                    }
                                    iZzd += iZzg4;
                                    str7 = str8;
                                }
                                i8 = -1;
                            }
                            if (iZzd != i8) {
                                zzaiaVarZzm = zzm(zzdyVar3, iZzd);
                                str2 = zzaiaVarZzm.zza;
                                bArr = zzaiaVarZzm.zzb;
                                if (bArr != null) {
                                    i9 = iZzg;
                                } else if (androidx.media3.common.MimeTypes.AUDIO_VORBIS.equals(str2)) {
                                    zzdyVar2 = new com.google.android.gms.internal.ads.zzdy(bArr);
                                    zzdyVar2.zzM(1);
                                    i10 = 0;
                                    while (zzdyVar2.zzb() > 0 && zzdyVar2.zzf() == 255) {
                                        zzdyVar2.zzM(1);
                                        i10 += 255;
                                    }
                                    int iZzm5 = i10 + zzdyVar2.zzm();
                                    i11 = 0;
                                    while (true) {
                                        if (zzdyVar2.zzb() > 0) {
                                            i9 = iZzg;
                                            break;
                                        }
                                        i9 = iZzg;
                                        if (zzdyVar2.zzf() == 255) {
                                            break;
                                        }
                                        zzdyVar2.zzM(1);
                                        i11 += 255;
                                        iZzg = i9;
                                    }
                                    int iZzm6 = i11 + zzdyVar2.zzm();
                                    byte[] bArr8 = new byte[iZzm5];
                                    int iZzd3 = zzdyVar2.zzd();
                                    java.lang.System.arraycopy(bArr, iZzd3, bArr8, 0, iZzm5);
                                    int i24 = iZzd3 + iZzm5 + iZzm6;
                                    int length = bArr.length - i24;
                                    byte[] bArr9 = new byte[length];
                                    java.lang.System.arraycopy(bArr, i24, bArr9, 0, length);
                                    listZzo = com.google.android.gms.internal.ads.zzfxn.zzp(bArr8, bArr9);
                                } else {
                                    i9 = iZzg;
                                    if (androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str2)) {
                                        com.google.android.gms.internal.ads.zzabi zzabiVarZza = com.google.android.gms.internal.ads.zzabk.zza(bArr);
                                        iZzn = zzabiVarZza.zza;
                                        iZzq2 = zzabiVarZza.zzb;
                                        str3 = zzabiVarZza.zzc;
                                    } else {
                                        iZzn = iZzn;
                                    }
                                    listZzo = com.google.android.gms.internal.ads.zzfxn.zzo(bArr);
                                }
                                iZzn = iZzn;
                            } else {
                                i9 = iZzg;
                                iZzn = iZzn;
                            }
                        }
                    }
                    iZzd2 += iZzg2;
                    zzdyVar3 = zzdyVar;
                    i14 = i2;
                    i15 = i3;
                    str6 = str6;
                    iZzg = i9;
                }
                int i25 = iZzn;
                if (zzaifVar.zzb == null || str2 == null) {
                }
                com.google.android.gms.internal.ads.zzz zzzVar3 = new com.google.android.gms.internal.ads.zzz();
                zzzVar3.zzL(i4);
                zzzVar3.zzaa(str2);
                zzzVar3.zzA(str3);
                zzzVar3.zzz(iZzq2);
                zzzVar3.zzab(i25);
                zzzVar3.zzU(i18);
                zzzVar3.zzN(listZzo);
                zzzVar3.zzF(zzuVarZzb);
                zzzVar3.zzQ(str);
                if (zzaiaVarZzm != null) {
                    zzzVar3.zzy(com.google.android.gms.internal.ads.zzgaq.zze(zzaiaVarZzm.zzc));
                    zzzVar3.zzV(com.google.android.gms.internal.ads.zzgaq.zze(zzaiaVarZzm.zzd));
                }
                zzaifVar.zzb = zzzVar3.zzag();
                return;
            }
            str2 = androidx.media3.common.MimeTypes.AUDIO_E_AC3;
        }
        i7 = i6;
        int i110 = i7;
        listZzo = null;
        zzaiaVarZzm = null;
        str3 = null;
        while (iZzd2 - i14 < i15) {
            zzdyVar3.zzL(iZzd2);
            iZzg2 = zzdyVar.zzg();
            if (iZzg2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            java.lang.String str9 = "childAtomSize must be positive";
            com.google.android.gms.internal.ads.zzacr.zzb(z2, "childAtomSize must be positive");
            iZzg3 = zzdyVar.zzg();
            iZzn = iZzn;
            if (iZzg3 == 1835557187) {
                zzdyVar3.zzL(iZzd2 + 8);
                zzdyVar3.zzM(1);
                iZzm3 = zzdyVar.zzm();
                zzdyVar3.zzM(1);
                if (java.util.Objects.equals(str2, str6)) {
                    i13 = 0;
                    str5 = java.lang.String.format("mhm1.%02X", java.lang.Integer.valueOf(iZzm3));
                } else {
                    i13 = 0;
                    str5 = java.lang.String.format("mha1.%02X", java.lang.Integer.valueOf(iZzm3));
                }
                int iZzq4 = zzdyVar.zzq();
                bArr3 = new byte[iZzq4];
                zzdyVar3.zzH(bArr3, i13, iZzq4);
                if (listZzo == null) {
                    listZzo = com.google.android.gms.internal.ads.zzfxn.zzo(bArr3);
                    iZzn = iZzn;
                    str3 = str5;
                    i9 = iZzg;
                } else {
                    listZzo = com.google.android.gms.internal.ads.zzfxn.zzp(bArr3, (byte[]) listZzo.get(i13));
                    str3 = str5;
                    i9 = iZzg;
                }
            } else {
                str6 = str6;
                if (iZzg3 == 1835557200) {
                    zzdyVar3.zzL(iZzd2 + 8);
                    iZzm2 = zzdyVar.zzm();
                    if (iZzm2 > 0) {
                        bArr2 = new byte[iZzm2];
                        zzdyVar3.zzH(bArr2, 0, iZzm2);
                        if (listZzo == null) {
                            listZzo = com.google.android.gms.internal.ads.zzfxn.zzo(bArr2);
                            i9 = iZzg;
                            iZzn = iZzn;
                        } else {
                            listZzo = com.google.android.gms.internal.ads.zzfxn.zzp((byte[]) listZzo.get(0), bArr2);
                            i9 = iZzg;
                        }
                    } else {
                        iZzn = iZzn;
                        i9 = iZzg;
                        iZzn = iZzn;
                    }
                } else {
                    if (iZzg3 == 1702061171) {
                        if (z) {
                        }
                        if (iZzg3 == 1684103987) {
                            zzdyVar3.zzL(iZzd2 + 8);
                            zzaifVar.zzb = com.google.android.gms.internal.ads.zzabn.zzc(zzdyVar3, java.lang.Integer.toString(i4), str, zzuVarZzb);
                        } else if (iZzg3 == 1684366131) {
                            zzdyVar3.zzL(iZzd2 + 8);
                            zzaifVar.zzb = com.google.android.gms.internal.ads.zzabn.zzd(zzdyVar3, java.lang.Integer.toString(i4), str, zzuVarZzb);
                        } else if (iZzg3 == 1684103988) {
                            zzdyVar3.zzL(iZzd2 + 8);
                            java.lang.String string2 = java.lang.Integer.toString(i4);
                            int i111 = com.google.android.gms.internal.ads.zzabq.zza;
                            zzdyVar3.zzM(1);
                            iZzm = zzdyVar.zzm() & 32;
                            com.google.android.gms.internal.ads.zzz zzzVar4 = new com.google.android.gms.internal.ads.zzz();
                            zzzVar4.zzM(string2);
                            zzzVar4.zzaa(androidx.media3.common.MimeTypes.AUDIO_AC4);
                            zzzVar4.zzz(2);
                            if (1 != (iZzm >> 5)) {
                                i12 = 44100;
                            } else {
                                i12 = androidx.media3.extractor.OpusUtil.SAMPLE_RATE;
                            }
                            zzzVar4.zzab(i12);
                            zzzVar4.zzF(zzuVarZzb);
                            zzzVar4.zzQ(str);
                            zzaifVar.zzb = zzzVar4.zzag();
                        } else if (iZzg3 != 1684892784) {
                            if (iZzg > 0) {
                                throw com.google.android.gms.internal.ads.zzbc.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + iZzg, null);
                            }
                            iZzn = iZzg;
                            i9 = iZzn;
                            iZzq2 = 2;
                        } else if (iZzg3 != 1684305011) {
                            com.google.android.gms.internal.ads.zzz zzzVar5 = new com.google.android.gms.internal.ads.zzz();
                            zzzVar5.zzL(i4);
                            zzzVar5.zzaa(str2);
                            zzzVar5.zzz(iZzq2);
                            iZzn = iZzn;
                            zzzVar5.zzab(iZzn);
                            zzzVar5.zzF(zzuVarZzb);
                            zzzVar5.zzQ(str);
                            zzaifVar.zzb = zzzVar5.zzag();
                            i9 = iZzg;
                            iZzn = iZzn;
                        } else {
                            com.google.android.gms.internal.ads.zzz zzzVar6 = new com.google.android.gms.internal.ads.zzz();
                            zzzVar6.zzL(i4);
                            zzzVar6.zzaa(str2);
                            zzzVar6.zzz(iZzq2);
                            iZzn = iZzn;
                            zzzVar6.zzab(iZzn);
                            zzzVar6.zzF(zzuVarZzb);
                            zzzVar6.zzQ(str);
                            zzaifVar.zzb = zzzVar6.zzag();
                            i9 = iZzg;
                            iZzn = iZzn;
                        }
                        iZzn = iZzn;
                        i9 = iZzg;
                        iZzn = iZzn;
                    } else {
                        iZzn = iZzn;
                        iZzd = iZzd2;
                        i8 = -1;
                    }
                    if (iZzd != i8) {
                        zzaiaVarZzm = zzm(zzdyVar3, iZzd);
                        str2 = zzaiaVarZzm.zza;
                        bArr = zzaiaVarZzm.zzb;
                        if (bArr != null) {
                            i9 = iZzg;
                        } else if (androidx.media3.common.MimeTypes.AUDIO_VORBIS.equals(str2)) {
                            zzdyVar2 = new com.google.android.gms.internal.ads.zzdy(bArr);
                            zzdyVar2.zzM(1);
                            i10 = 0;
                            while (zzdyVar2.zzb() > 0) {
                                zzdyVar2.zzM(1);
                                i10 += 255;
                            }
                            int iZzm7 = i10 + zzdyVar2.zzm();
                            i11 = 0;
                            while (true) {
                                if (zzdyVar2.zzb() > 0) {
                                    i9 = iZzg;
                                    break;
                                }
                                i9 = iZzg;
                                if (zzdyVar2.zzf() == 255) {
                                    break;
                                    break;
                                } else {
                                    zzdyVar2.zzM(1);
                                    i11 += 255;
                                    iZzg = i9;
                                }
                            }
                            int iZzm8 = i11 + zzdyVar2.zzm();
                            byte[] bArr10 = new byte[iZzm7];
                            int iZzd4 = zzdyVar2.zzd();
                            java.lang.System.arraycopy(bArr, iZzd4, bArr10, 0, iZzm7);
                            int i26 = iZzd4 + iZzm7 + iZzm8;
                            int length2 = bArr.length - i26;
                            byte[] bArr11 = new byte[length2];
                            java.lang.System.arraycopy(bArr, i26, bArr11, 0, length2);
                            listZzo = com.google.android.gms.internal.ads.zzfxn.zzp(bArr10, bArr11);
                        } else {
                            i9 = iZzg;
                            if (androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str2)) {
                                com.google.android.gms.internal.ads.zzabi zzabiVarZza2 = com.google.android.gms.internal.ads.zzabk.zza(bArr);
                                iZzn = zzabiVarZza2.zza;
                                iZzq2 = zzabiVarZza2.zzb;
                                str3 = zzabiVarZza2.zzc;
                            } else {
                                iZzn = iZzn;
                            }
                            listZzo = com.google.android.gms.internal.ads.zzfxn.zzo(bArr);
                        }
                        iZzn = iZzn;
                    } else {
                        i9 = iZzg;
                        iZzn = iZzn;
                    }
                }
            }
            iZzd2 += iZzg2;
            zzdyVar3 = zzdyVar;
            i14 = i2;
            i15 = i3;
            str6 = str6;
            iZzg = i9;
        }
        int i27 = iZzn;
        if (zzaifVar.zzb == null) {
        }
    }
}
