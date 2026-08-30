package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaej implements com.google.android.gms.internal.ads.zzaeb {
    public final com.google.android.gms.internal.ads.zzfxn zza;
    private final int zzb;

    private zzaej(int i, com.google.android.gms.internal.ads.zzfxn zzfxnVar) {
        this.zzb = i;
        this.zza = zzfxnVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.google.android.gms.internal.ads.zzaej zzc(int i, com.google.android.gms.internal.ads.zzdy zzdyVar) {
        java.lang.String str;
        com.google.android.gms.internal.ads.zzaeb zzaekVar;
        java.lang.String str2;
        com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
        int iZze = zzdyVar.zze();
        int i2 = -2;
        while (zzdyVar.zzb() > 8) {
            int iZzi = zzdyVar.zzi();
            int iZzd = zzdyVar.zzd() + zzdyVar.zzi();
            zzdyVar.zzK(iZzd);
            if (iZzi != 1414744396) {
                com.google.android.gms.internal.ads.zzaek zzaekVar2 = null;
                switch (iZzi) {
                    case androidx.media3.extractor.avi.AviExtractor.FOURCC_strf /* 1718776947 */:
                        if (i2 != 2) {
                            if (i2 == 1) {
                                int iZzk = zzdyVar.zzk();
                                if (iZzk == 1) {
                                    str = androidx.media3.common.MimeTypes.AUDIO_RAW;
                                } else if (iZzk == 85) {
                                    str = androidx.media3.common.MimeTypes.AUDIO_MPEG;
                                } else if (iZzk == 255) {
                                    str = androidx.media3.common.MimeTypes.AUDIO_AAC;
                                } else if (iZzk != 8192) {
                                    str = iZzk != 8193 ? null : androidx.media3.common.MimeTypes.AUDIO_DTS;
                                } else {
                                    str = androidx.media3.common.MimeTypes.AUDIO_AC3;
                                }
                                if (str != null) {
                                    int iZzk2 = zzdyVar.zzk();
                                    int iZzi2 = zzdyVar.zzi();
                                    zzdyVar.zzM(6);
                                    int iZzn = com.google.android.gms.internal.ads.zzei.zzn(zzdyVar.zzk());
                                    int iZzk3 = zzdyVar.zzb() > 0 ? zzdyVar.zzk() : 0;
                                    byte[] bArr = new byte[iZzk3];
                                    zzdyVar.zzH(bArr, 0, iZzk3);
                                    com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                                    zzzVar.zzaa(str);
                                    zzzVar.zzz(iZzk2);
                                    zzzVar.zzab(iZzi2);
                                    if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(str) && iZzn != 0) {
                                        zzzVar.zzU(iZzn);
                                    }
                                    if (androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str) && iZzk3 > 0) {
                                        zzzVar.zzN(com.google.android.gms.internal.ads.zzfxn.zzo(bArr));
                                    }
                                    zzaekVar = new com.google.android.gms.internal.ads.zzaek(zzzVar.zzag());
                                } else {
                                    com.google.android.gms.internal.ads.zzdo.zzf("StreamFormatChunk", "Ignoring track with unsupported format tag " + iZzk);
                                }
                            } else {
                                com.google.android.gms.internal.ads.zzdo.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(com.google.android.gms.internal.ads.zzei.zzD(i2)));
                            }
                            break;
                        } else {
                            zzdyVar.zzM(4);
                            int iZzi3 = zzdyVar.zzi();
                            int iZzi4 = zzdyVar.zzi();
                            zzdyVar.zzM(4);
                            int iZzi5 = zzdyVar.zzi();
                            switch (iZzi5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = androidx.media3.common.MimeTypes.VIDEO_MP4V;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = androidx.media3.common.MimeTypes.VIDEO_MP42;
                                    break;
                                case 859066445:
                                    str2 = androidx.media3.common.MimeTypes.VIDEO_MP43;
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = androidx.media3.common.MimeTypes.VIDEO_MJPEG;
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                com.google.android.gms.internal.ads.zzdo.zzf("StreamFormatChunk", "Ignoring track with unsupported compression " + iZzi5);
                            } else {
                                com.google.android.gms.internal.ads.zzz zzzVar2 = new com.google.android.gms.internal.ads.zzz();
                                zzzVar2.zzaf(iZzi3);
                                zzzVar2.zzK(iZzi4);
                                zzzVar2.zzaa(str2);
                                zzaekVar2 = new com.google.android.gms.internal.ads.zzaek(zzzVar2.zzag());
                            }
                        }
                        zzaekVar = zzaekVar2;
                        break;
                    case androidx.media3.extractor.avi.AviExtractor.FOURCC_avih /* 1751742049 */:
                        zzaekVar = com.google.android.gms.internal.ads.zzaeg.zzb(zzdyVar);
                        break;
                    case androidx.media3.extractor.avi.AviExtractor.FOURCC_strh /* 1752331379 */:
                        zzaekVar = com.google.android.gms.internal.ads.zzaeh.zzb(zzdyVar);
                        break;
                    case androidx.media3.extractor.avi.AviExtractor.FOURCC_strn /* 1852994675 */:
                        zzaekVar = com.google.android.gms.internal.ads.zzael.zzb(zzdyVar);
                        break;
                    default:
                        zzaekVar = zzaekVar2;
                        break;
                }
            } else {
                zzaekVar = zzc(zzdyVar.zzi(), zzdyVar);
            }
            if (zzaekVar != null) {
                if (zzaekVar.zza() == 1752331379) {
                    int i3 = ((com.google.android.gms.internal.ads.zzaeh) zzaekVar).zza;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        com.google.android.gms.internal.ads.zzdo.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzfxkVar.zzf(zzaekVar);
            }
            zzdyVar.zzL(iZzd);
            zzdyVar.zzK(iZze);
        }
        return new com.google.android.gms.internal.ads.zzaej(i, zzfxkVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzaeb zzb(java.lang.Class cls) {
        com.google.android.gms.internal.ads.zzfxn zzfxnVar = this.zza;
        int size = zzfxnVar.size();
        int i = 0;
        while (i < size) {
            com.google.android.gms.internal.ads.zzaeb zzaebVar = (com.google.android.gms.internal.ads.zzaeb) zzfxnVar.get(i);
            i++;
            if (zzaebVar.getClass() == cls) {
                return zzaebVar;
            }
        }
        return null;
    }
}
