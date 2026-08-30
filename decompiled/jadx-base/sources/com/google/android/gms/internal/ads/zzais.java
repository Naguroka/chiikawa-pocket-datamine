package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzais {
    /* JADX WARN: Code duplicated, block: B:131:0x0261 A[Catch: all -> 0x01f3, TryCatch #0 {all -> 0x01f3, blocks: (B:9:0x0030, B:11:0x003b, B:13:0x0047, B:16:0x0053, B:19:0x0060, B:22:0x006f, B:25:0x007c, B:28:0x0089, B:30:0x0093, B:38:0x00ae, B:39:0x00bf, B:40:0x00d2, B:43:0x00de, B:46:0x00eb, B:49:0x00f8, B:52:0x0105, B:55:0x0112, B:58:0x011f, B:61:0x012c, B:64:0x0139, B:67:0x0146, B:70:0x0156, B:74:0x016a, B:76:0x0170, B:78:0x0185, B:79:0x018c, B:81:0x0193, B:86:0x019e, B:91:0x01aa, B:131:0x0261, B:92:0x01bf, B:94:0x01c6, B:96:0x01d0, B:97:0x01e4, B:112:0x0213, B:115:0x0220, B:118:0x022c, B:121:0x0238, B:124:0x0244, B:127:0x0250, B:130:0x025a, B:132:0x0275, B:133:0x027c), top: B:138:0x0022 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x0261, please report this as an issue */
    public static com.google.android.gms.internal.ads.zzax zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        java.lang.String str;
        com.google.android.gms.internal.ads.zzax zzaftVar;
        int iZzd = zzdyVar.zzd() + zzdyVar.zzg();
        int iZzg = zzdyVar.zzg();
        int i = (iZzg >> 24) & 255;
        com.google.android.gms.internal.ads.zzax zzaxVarZze = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = iZzg & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int iZzg2 = zzdyVar.zzg();
                    if (zzdyVar.zzg() == 1684108385) {
                        zzdyVar.zzM(8);
                        java.lang.String strZzA = zzdyVar.zzA(iZzg2 - 16);
                        zzaxVarZze = new com.google.android.gms.internal.ads.zzagb(androidx.media3.common.C.LANGUAGE_UNDETERMINED, strZzA, strZzA);
                    } else {
                        com.google.android.gms.internal.ads.zzdo.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(com.google.android.gms.internal.ads.zzeq.zze(iZzg)));
                    }
                } else if (i2 == 7233901 || i2 == 7631467) {
                    zzaxVarZze = zze(iZzg, "TIT2", zzdyVar);
                } else if (i2 == 6516589 || i2 == 7828084) {
                    zzaxVarZze = zze(iZzg, "TCOM", zzdyVar);
                } else if (i2 == 6578553) {
                    zzaxVarZze = zze(iZzg, "TDRC", zzdyVar);
                } else if (i2 == 4280916) {
                    zzaxVarZze = zze(iZzg, "TPE1", zzdyVar);
                } else if (i2 == 7630703) {
                    zzaxVarZze = zze(iZzg, "TSSE", zzdyVar);
                } else if (i2 == 6384738) {
                    zzaxVarZze = zze(iZzg, "TALB", zzdyVar);
                } else if (i2 == 7108978) {
                    zzaxVarZze = zze(iZzg, "USLT", zzdyVar);
                } else if (i2 == 6776174) {
                    zzaxVarZze = zze(iZzg, "TCON", zzdyVar);
                } else if (i2 == 6779504) {
                    zzaxVarZze = zze(iZzg, "TIT1", zzdyVar);
                } else {
                    com.google.android.gms.internal.ads.zzdo.zzb("MetadataUtil", "Skipped unknown metadata entry: " + com.google.android.gms.internal.ads.zzeq.zze(iZzg));
                }
            } else if (iZzg == 1735291493) {
                java.lang.String strZza = com.google.android.gms.internal.ads.zzagi.zza(zzb(zzdyVar) - 1);
                if (strZza != null) {
                    zzaftVar = new com.google.android.gms.internal.ads.zzagq("TCON", null, com.google.android.gms.internal.ads.zzfxn.zzo(strZza));
                    zzaxVarZze = zzaftVar;
                } else {
                    com.google.android.gms.internal.ads.zzdo.zzf("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (iZzg == 1684632427) {
                zzaxVarZze = zzd(1684632427, "TPOS", zzdyVar);
            } else if (iZzg == 1953655662) {
                zzaxVarZze = zzd(1953655662, "TRCK", zzdyVar);
            } else if (iZzg == 1953329263) {
                zzaxVarZze = zzc(1953329263, "TBPM", zzdyVar, true, false);
            } else if (iZzg == 1668311404) {
                zzaxVarZze = zzc(1668311404, "TCMP", zzdyVar, true, true);
            } else if (iZzg == 1668249202) {
                int iZzg3 = zzdyVar.zzg();
                if (zzdyVar.zzg() == 1684108385) {
                    int iZzg4 = zzdyVar.zzg();
                    int i3 = com.google.android.gms.internal.ads.zzaik.zza;
                    int i4 = iZzg4 & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
                    if (i4 == 13) {
                        str = androidx.media3.common.MimeTypes.IMAGE_JPEG;
                    } else if (i4 == 14) {
                        str = androidx.media3.common.MimeTypes.IMAGE_PNG;
                        i4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        com.google.android.gms.internal.ads.zzdo.zzf("MetadataUtil", "Unrecognized cover art flags: " + i4);
                    } else {
                        zzdyVar.zzM(4);
                        int i5 = iZzg3 - 16;
                        byte[] bArr = new byte[i5];
                        zzdyVar.zzH(bArr, 0, i5);
                        zzaftVar = new com.google.android.gms.internal.ads.zzaft(str, null, 3, bArr);
                        zzaxVarZze = zzaftVar;
                    }
                } else {
                    com.google.android.gms.internal.ads.zzdo.zzf("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (iZzg == 1631670868) {
                zzaxVarZze = zze(1631670868, "TPE2", zzdyVar);
            } else if (iZzg == 1936682605) {
                zzaxVarZze = zze(1936682605, "TSOT", zzdyVar);
            } else if (iZzg == 1936679276) {
                zzaxVarZze = zze(1936679276, "TSOA", zzdyVar);
            } else if (iZzg == 1936679282) {
                zzaxVarZze = zze(1936679282, "TSOP", zzdyVar);
            } else if (iZzg == 1936679265) {
                zzaxVarZze = zze(1936679265, "TSO2", zzdyVar);
            } else if (iZzg == 1936679791) {
                zzaxVarZze = zze(1936679791, "TSOC", zzdyVar);
            } else if (iZzg == 1920233063) {
                zzaxVarZze = zzc(1920233063, "ITUNESADVISORY", zzdyVar, false, false);
            } else if (iZzg == 1885823344) {
                zzaxVarZze = zzc(1885823344, "ITUNESGAPLESS", zzdyVar, false, true);
            } else if (iZzg == 1936683886) {
                zzaxVarZze = zze(1936683886, "TVSHOWSORT", zzdyVar);
            } else if (iZzg == 1953919848) {
                zzaxVarZze = zze(1953919848, "TVSHOW", zzdyVar);
            } else if (iZzg == 757935405) {
                int i6 = -1;
                int i7 = -1;
                java.lang.String strZzA2 = null;
                java.lang.String strZzA3 = null;
                while (zzdyVar.zzd() < iZzd) {
                    int iZzd2 = zzdyVar.zzd();
                    int iZzg5 = zzdyVar.zzg();
                    int iZzg6 = zzdyVar.zzg();
                    zzdyVar.zzM(4);
                    if (iZzg6 == 1835360622) {
                        strZzA2 = zzdyVar.zzA(iZzg5 - 12);
                    } else {
                        int i8 = iZzg5 - 12;
                        if (iZzg6 == 1851878757) {
                            strZzA3 = zzdyVar.zzA(i8);
                        } else {
                            if (iZzg6 == 1684108385) {
                                i7 = iZzg5;
                            }
                            if (iZzg6 == 1684108385) {
                                i6 = iZzd2;
                            }
                            zzdyVar.zzM(i8);
                        }
                    }
                }
                if (strZzA2 != null && strZzA3 != null && i6 != -1) {
                    zzdyVar.zzL(i6);
                    zzdyVar.zzM(16);
                    zzaxVarZze = new com.google.android.gms.internal.ads.zzagk(strZzA2, strZzA3, zzdyVar.zzA(i7 - 16));
                }
            } else {
                com.google.android.gms.internal.ads.zzdo.zzb("MetadataUtil", "Skipped unknown metadata entry: " + com.google.android.gms.internal.ads.zzeq.zze(iZzg));
            }
            zzdyVar.zzL(iZzd);
            return zzaxVarZze;
        } catch (java.lang.Throwable th) {
            zzdyVar.zzL(iZzd);
            throw th;
        }
    }

    private static int zzb(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int iZzg = zzdyVar.zzg();
        if (zzdyVar.zzg() == 1684108385) {
            zzdyVar.zzM(8);
            int i = iZzg - 16;
            if (i == 1) {
                return zzdyVar.zzm();
            }
            if (i == 2) {
                return zzdyVar.zzq();
            }
            if (i == 3) {
                return zzdyVar.zzo();
            }
            if (i == 4 && (zzdyVar.zzf() & 128) == 0) {
                return zzdyVar.zzp();
            }
        }
        com.google.android.gms.internal.ads.zzdo.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static com.google.android.gms.internal.ads.zzagh zzc(int i, java.lang.String str, com.google.android.gms.internal.ads.zzdy zzdyVar, boolean z, boolean z2) {
        int iZzb = zzb(zzdyVar);
        if (z2) {
            iZzb = java.lang.Math.min(1, iZzb);
        }
        if (iZzb >= 0) {
            return z ? new com.google.android.gms.internal.ads.zzagq(str, null, com.google.android.gms.internal.ads.zzfxn.zzo(java.lang.Integer.toString(iZzb))) : new com.google.android.gms.internal.ads.zzagb(androidx.media3.common.C.LANGUAGE_UNDETERMINED, str, java.lang.Integer.toString(iZzb));
        }
        com.google.android.gms.internal.ads.zzdo.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(com.google.android.gms.internal.ads.zzeq.zze(i)));
        return null;
    }

    private static com.google.android.gms.internal.ads.zzagq zzd(int i, java.lang.String str, com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int iZzg = zzdyVar.zzg();
        if (zzdyVar.zzg() == 1684108385 && iZzg >= 22) {
            zzdyVar.zzM(10);
            int iZzq = zzdyVar.zzq();
            if (iZzq > 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(iZzq);
                java.lang.String string = sb.toString();
                int iZzq2 = zzdyVar.zzq();
                if (iZzq2 > 0) {
                    string = string + "/" + iZzq2;
                }
                return new com.google.android.gms.internal.ads.zzagq(str, null, com.google.android.gms.internal.ads.zzfxn.zzo(string));
            }
        }
        com.google.android.gms.internal.ads.zzdo.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(com.google.android.gms.internal.ads.zzeq.zze(i)));
        return null;
    }

    private static com.google.android.gms.internal.ads.zzagq zze(int i, java.lang.String str, com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int iZzg = zzdyVar.zzg();
        if (zzdyVar.zzg() == 1684108385) {
            zzdyVar.zzM(8);
            return new com.google.android.gms.internal.ads.zzagq(str, null, com.google.android.gms.internal.ads.zzfxn.zzo(zzdyVar.zzA(iZzg - 16)));
        }
        com.google.android.gms.internal.ads.zzdo.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(com.google.android.gms.internal.ads.zzeq.zze(i)));
        return null;
    }
}
