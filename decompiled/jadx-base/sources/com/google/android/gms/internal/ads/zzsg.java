package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzsg {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final android.media.MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;

    public static com.google.android.gms.internal.ads.zzsg zzc(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new com.google.android.gms.internal.ads.zzsg(str, str2, str3, codecCapabilities, z, z2, z3, codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback") && (com.google.android.gms.internal.ads.zzei.zza > 22 || !(("ODROID-XU3".equals(com.google.android.gms.internal.ads.zzei.zzd) || "Nexus 10".equals(com.google.android.gms.internal.ads.zzei.zzd)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str)))), codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback"), z5 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")), com.google.android.gms.internal.ads.zzei.zza >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface"));
    }

    private static android.graphics.Point zzi(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = com.google.android.gms.internal.ads.zzei.zza;
        return new android.graphics.Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(java.lang.String str) {
        com.google.android.gms.internal.ads.zzdo.zzb(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.TAG, "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + com.google.android.gms.internal.ads.zzei.zze + com.ironsource.y8.i.e);
    }

    private static boolean zzk(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        android.graphics.Point pointZzi = zzi(videoCapabilities, i, i2);
        int i3 = pointZzi.x;
        int i4 = pointZzi.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, java.lang.Math.floor(d));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x010c  */
    private final boolean zzl(com.google.android.gms.internal.ads.zzab zzabVar, boolean z) {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzh;
        int i;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;
        int iIntValue;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i2 = com.google.android.gms.internal.ads.zzta.zza;
        android.util.Pair pairZza = com.google.android.gms.internal.ads.zzcy.zza(zzabVar);
        java.lang.String str = zzabVar.zzo;
        if (str != null && str.equals("video/mv-hevc") && this.zzc.equals("video/hevc")) {
            java.lang.String strZzg = com.google.android.gms.internal.ads.zzfk.zzg(zzabVar.zzr);
            if (strZzg == null) {
                pairZza = null;
            } else {
                java.lang.String strTrim = strZzg.trim();
                int i3 = com.google.android.gms.internal.ads.zzei.zza;
                pairZza = com.google.android.gms.internal.ads.zzcy.zzb(strZzg, strTrim.split("\\.", -1), zzabVar.zzC);
            }
        }
        if (pairZza != null) {
            int iIntValue2 = ((java.lang.Integer) pairZza.first).intValue();
            int iIntValue3 = ((java.lang.Integer) pairZza.second).intValue();
            int i4 = 8;
            if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(zzabVar.zzo)) {
                if ("video/avc".equals(this.zzb)) {
                    iIntValue2 = 8;
                } else if ("video/hevc".equals(this.zzb)) {
                    iIntValue2 = 2;
                }
                iIntValue3 = 0;
            }
            if (this.zzi) {
                codecProfileLevelArrZzh = zzh();
                if (com.google.android.gms.internal.ads.zzei.zza <= 23 && androidx.media3.common.MimeTypes.VIDEO_VP9.equals(this.zzb) && codecProfileLevelArrZzh.length == 0) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = ((java.lang.Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    }
                    if (iIntValue >= 180000000) {
                        i4 = 1024;
                    } else if (iIntValue >= 120000000) {
                        i4 = 512;
                    } else if (iIntValue >= 60000000) {
                        i4 = 256;
                    } else if (iIntValue >= 30000000) {
                        i4 = 128;
                    } else if (iIntValue >= 18000000) {
                        i4 = 64;
                    } else if (iIntValue >= 12000000) {
                        i4 = 32;
                    } else if (iIntValue >= 7200000) {
                        i4 = 16;
                    } else if (iIntValue < 3600000) {
                        if (iIntValue >= 1800000) {
                            i4 = 4;
                        } else if (iIntValue >= 800000) {
                            i4 = 2;
                        } else {
                            i4 = 1;
                        }
                    }
                    android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i4;
                    codecProfileLevelArrZzh = new android.media.MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArrZzh) {
                    if (codecProfileLevel2.profile == iIntValue2 || ((codecProfileLevel2.level < iIntValue3 && z) || ("video/hevc".equals(this.zzb) && iIntValue2 == 2 && ("sailfish".equals(com.google.android.gms.internal.ads.zzei.zzb) || "marlin".equals(com.google.android.gms.internal.ads.zzei.zzb))))) {
                    }
                }
                zzj("codec.profileLevel, " + zzabVar.zzk + ", " + this.zzc);
                return false;
            }
            if (iIntValue2 == 42) {
                iIntValue2 = 42;
                codecProfileLevelArrZzh = zzh();
                if (com.google.android.gms.internal.ads.zzei.zza <= 23) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue >= 180000000) {
                        i4 = 1024;
                    } else if (iIntValue >= 120000000) {
                        i4 = 512;
                    } else if (iIntValue >= 60000000) {
                        i4 = 256;
                    } else if (iIntValue >= 30000000) {
                        i4 = 128;
                    } else if (iIntValue >= 18000000) {
                        i4 = 64;
                    } else if (iIntValue >= 12000000) {
                        i4 = 32;
                    } else if (iIntValue >= 7200000) {
                        i4 = 16;
                    } else if (iIntValue < 3600000) {
                        if (iIntValue >= 1800000) {
                            i4 = 4;
                        } else if (iIntValue >= 800000) {
                            i4 = 2;
                        } else {
                            i4 = 1;
                        }
                    }
                    android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new android.media.MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel3.profile = 1;
                    codecProfileLevel3.level = i4;
                    codecProfileLevelArrZzh = new android.media.MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel3};
                }
                while (i < r5) {
                    if (codecProfileLevel2.profile == iIntValue2) {
                    }
                }
                zzj("codec.profileLevel, " + zzabVar.zzk + ", " + this.zzc);
                return false;
            }
        }
        return true;
    }

    private final boolean zzm(com.google.android.gms.internal.ads.zzab zzabVar) {
        return this.zzb.equals(zzabVar.zzo) || this.zzb.equals(com.google.android.gms.internal.ads.zzta.zzb(zzabVar));
    }

    public final java.lang.String toString() {
        return this.zza;
    }

    public final android.graphics.Point zza(int i, int i2) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i, i2);
    }

    public final com.google.android.gms.internal.ads.zzht zzb(com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzab zzabVar2) {
        int i = true != java.util.Objects.equals(zzabVar.zzo, zzabVar2.zzo) ? 8 : 0;
        if (this.zzi) {
            if (zzabVar.zzy != zzabVar2.zzy) {
                i |= 1024;
            }
            if (!this.zze && (zzabVar.zzv != zzabVar2.zzv || zzabVar.zzw != zzabVar2.zzw)) {
                i |= 512;
            }
            if ((!com.google.android.gms.internal.ads.zzk.zzg(zzabVar.zzC) || !com.google.android.gms.internal.ads.zzk.zzg(zzabVar2.zzC)) && !java.util.Objects.equals(zzabVar.zzC, zzabVar2.zzC)) {
                i |= 2048;
            }
            java.lang.String str = this.zza;
            if (com.google.android.gms.internal.ads.zzei.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzabVar.zzd(zzabVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new com.google.android.gms.internal.ads.zzht(this.zza, zzabVar, zzabVar2, true != zzabVar.zzd(zzabVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzabVar.zzD != zzabVar2.zzD) {
                i |= 4096;
            }
            if (zzabVar.zzE != zzabVar2.zzE) {
                i |= 8192;
            }
            if (zzabVar.zzF != zzabVar2.zzF) {
                i |= 16384;
            }
            if (i == 0 && androidx.media3.common.MimeTypes.AUDIO_AAC.equals(this.zzb)) {
                int i2 = com.google.android.gms.internal.ads.zzta.zza;
                android.util.Pair pairZza = com.google.android.gms.internal.ads.zzcy.zza(zzabVar);
                android.util.Pair pairZza2 = com.google.android.gms.internal.ads.zzcy.zza(zzabVar2);
                if (pairZza != null && pairZza2 != null) {
                    int iIntValue = ((java.lang.Integer) pairZza.first).intValue();
                    int iIntValue2 = ((java.lang.Integer) pairZza2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new com.google.android.gms.internal.ads.zzht(this.zza, zzabVar, zzabVar2, 3, 0);
                    }
                }
            }
            if (!zzabVar.zzd(zzabVar2)) {
                i |= 32;
            }
            if (androidx.media3.common.MimeTypes.AUDIO_OPUS.equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new com.google.android.gms.internal.ads.zzht(this.zza, zzabVar, zzabVar2, 1, 0);
            }
        }
        return new com.google.android.gms.internal.ads.zzht(this.zza, zzabVar, zzabVar2, 0, i);
    }

    public final boolean zzd(com.google.android.gms.internal.ads.zzab zzabVar) {
        return zzm(zzabVar) && zzl(zzabVar, false);
    }

    public final boolean zze(com.google.android.gms.internal.ads.zzab zzabVar) throws com.google.android.gms.internal.ads.zzsu {
        int i;
        int i2;
        if (!zzm(zzabVar) || !zzl(zzabVar, true)) {
            return false;
        }
        if (this.zzi) {
            int i3 = zzabVar.zzv;
            if (i3 <= 0 || (i2 = zzabVar.zzw) <= 0) {
                return true;
            }
            return zzg(i3, i2, zzabVar.zzx);
        }
        int i4 = zzabVar.zzE;
        if (i4 != -1) {
            android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzj("sampleRate.caps");
                return false;
            }
            android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzj("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i4)) {
                zzj("sampleRate.support, " + i4);
                return false;
            }
        }
        int i5 = zzabVar.zzD;
        if (i5 == -1) {
            return true;
        }
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
        if (codecCapabilities2 == null) {
            zzj("channelCount.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
        if (audioCapabilities2 == null) {
            zzj("channelCount.aCaps");
            return false;
        }
        java.lang.String str = this.zza;
        java.lang.String str2 = this.zzb;
        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((com.google.android.gms.internal.ads.zzei.zza < 26 || maxInputChannelCount <= 0) && !androidx.media3.common.MimeTypes.AUDIO_MPEG.equals(str2) && !androidx.media3.common.MimeTypes.AUDIO_AMR_NB.equals(str2) && !androidx.media3.common.MimeTypes.AUDIO_AMR_WB.equals(str2) && !androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str2) && !androidx.media3.common.MimeTypes.AUDIO_VORBIS.equals(str2) && !androidx.media3.common.MimeTypes.AUDIO_OPUS.equals(str2) && !androidx.media3.common.MimeTypes.AUDIO_RAW.equals(str2) && !androidx.media3.common.MimeTypes.AUDIO_FLAC.equals(str2) && !androidx.media3.common.MimeTypes.AUDIO_ALAW.equals(str2) && !androidx.media3.common.MimeTypes.AUDIO_MLAW.equals(str2) && !androidx.media3.common.MimeTypes.AUDIO_MSGSM.equals(str2))) {
            if (androidx.media3.common.MimeTypes.AUDIO_AC3.equals(str2)) {
                i = 6;
            } else {
                i = androidx.media3.common.MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
            }
            com.google.android.gms.internal.ads.zzdo.zzf(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + com.ironsource.y8.i.e);
            maxInputChannelCount = i;
        }
        if (maxInputChannelCount >= i5) {
            return true;
        }
        zzj("channelCount.support, " + i5);
        return false;
    }

    public final boolean zzf(com.google.android.gms.internal.ads.zzab zzabVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i = com.google.android.gms.internal.ads.zzta.zza;
        android.util.Pair pairZza = com.google.android.gms.internal.ads.zzcy.zza(zzabVar);
        return pairZza != null && ((java.lang.Integer) pairZza.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    public final boolean zzg(int i, int i2, double d) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (com.google.android.gms.internal.ads.zzei.zza >= 29) {
            int iZza = com.google.android.gms.internal.ads.zzsi.zza(videoCapabilities, i, i2, d);
            if (iZza != 2) {
                if (iZza == 1) {
                    zzj("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                    return false;
                }
                if (!zzk(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                    }
                    zzj("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                    return false;
                }
            }
        } else if (!zzk(videoCapabilities, i, i2, d)) {
            if (i < i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(com.google.android.gms.internal.ads.zzei.zzb)) || !zzk(videoCapabilities, i2, i, d))) {
                zzj("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            com.google.android.gms.internal.ads.zzdo.zzb(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.TAG, "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d) + "] [" + this.zza + ", " + this.zzb + "] [" + com.google.android.gms.internal.ads.zzei.zze + com.ironsource.y8.i.e);
        }
        return true;
    }

    public final android.media.MediaCodecInfo.CodecProfileLevel[] zzh() {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new android.media.MediaCodecInfo.CodecProfileLevel[0] : this.zzd.profileLevels;
    }

    zzsg(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = z7;
        this.zzi = com.google.android.gms.internal.ads.zzbb.zzi(str2);
    }
}
