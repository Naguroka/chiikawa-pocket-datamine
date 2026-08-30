package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzta {
    public static final /* synthetic */ int zza = 0;
    private static final java.util.HashMap zzb = new java.util.HashMap();

    public static com.google.android.gms.internal.ads.zzsg zza() throws com.google.android.gms.internal.ads.zzsu {
        java.util.List listZzd = zzd(androidx.media3.common.MimeTypes.AUDIO_RAW, false, false);
        if (listZzd.isEmpty()) {
            return null;
        }
        return (com.google.android.gms.internal.ads.zzsg) listZzd.get(0);
    }

    public static java.lang.String zzb(com.google.android.gms.internal.ads.zzab zzabVar) {
        android.util.Pair pairZza;
        if (androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC.equals(zzabVar.zzo)) {
            return androidx.media3.common.MimeTypes.AUDIO_E_AC3;
        }
        if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(zzabVar.zzo) && (pairZza = com.google.android.gms.internal.ads.zzcy.zza(zzabVar)) != null) {
            int iIntValue = ((java.lang.Integer) pairZza.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(zzabVar.zzo)) {
            return "video/hevc";
        }
        return null;
    }

    public static java.util.List zzc(com.google.android.gms.internal.ads.zzsp zzspVar, com.google.android.gms.internal.ads.zzab zzabVar, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzsu {
        java.lang.String strZzb = zzb(zzabVar);
        return strZzb == null ? com.google.android.gms.internal.ads.zzfxn.zzn() : zzspVar.zza(strZzb, z, z2);
    }

    public static synchronized java.util.List zzd(java.lang.String str, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzsu {
        com.google.android.gms.internal.ads.zzst zzstVar = new com.google.android.gms.internal.ads.zzst(str, z, z2);
        java.util.HashMap map = zzb;
        java.util.List list = (java.util.List) map.get(zzstVar);
        if (list != null) {
            return list;
        }
        java.util.ArrayList arrayListZzg = zzg(zzstVar, new com.google.android.gms.internal.ads.zzsx(z, z2));
        if (z && arrayListZzg.isEmpty() && com.google.android.gms.internal.ads.zzei.zza <= 23) {
            arrayListZzg = zzg(zzstVar, new com.google.android.gms.internal.ads.zzsw(null));
            if (!arrayListZzg.isEmpty()) {
                com.google.android.gms.internal.ads.zzdo.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((com.google.android.gms.internal.ads.zzsg) arrayListZzg.get(0)).zza);
            }
        }
        if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(str)) {
            if (com.google.android.gms.internal.ads.zzei.zza < 26 && com.google.android.gms.internal.ads.zzei.zzb.equals("R9") && arrayListZzg.size() == 1 && ((com.google.android.gms.internal.ads.zzsg) arrayListZzg.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListZzg.add(com.google.android.gms.internal.ads.zzsg.zzc("OMX.google.raw.decoder", androidx.media3.common.MimeTypes.AUDIO_RAW, androidx.media3.common.MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
            }
            zzh(arrayListZzg, new com.google.android.gms.internal.ads.zzsy() { // from class: com.google.android.gms.internal.ads.zzsr
                @Override // com.google.android.gms.internal.ads.zzsy
                public final int zza(java.lang.Object obj) {
                    int i = com.google.android.gms.internal.ads.zzta.zza;
                    java.lang.String str2 = ((com.google.android.gms.internal.ads.zzsg) obj).zza;
                    if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                        return 1;
                    }
                    return (com.google.android.gms.internal.ads.zzei.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                }
            });
        }
        if (com.google.android.gms.internal.ads.zzei.zza < 32 && arrayListZzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((com.google.android.gms.internal.ads.zzsg) arrayListZzg.get(0)).zza)) {
            arrayListZzg.add((com.google.android.gms.internal.ads.zzsg) arrayListZzg.remove(0));
        }
        com.google.android.gms.internal.ads.zzfxn zzfxnVarZzl = com.google.android.gms.internal.ads.zzfxn.zzl(arrayListZzg);
        map.put(zzstVar, zzfxnVarZzl);
        return zzfxnVarZzl;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#2.sampleMimeType"})
    public static java.util.List zze(com.google.android.gms.internal.ads.zzsp zzspVar, com.google.android.gms.internal.ads.zzab zzabVar, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzsu {
        java.util.List listZza = zzspVar.zza(zzabVar.zzo, z, z2);
        java.util.List listZzc = zzc(zzspVar, zzabVar, z, z2);
        com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
        zzfxkVar.zzh(listZza);
        zzfxkVar.zzh(listZzc);
        return zzfxkVar.zzi();
    }

    public static java.util.List zzf(java.util.List list, final com.google.android.gms.internal.ads.zzab zzabVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        zzh(arrayList, new com.google.android.gms.internal.ads.zzsy() { // from class: com.google.android.gms.internal.ads.zzss
            @Override // com.google.android.gms.internal.ads.zzsy
            public final int zza(java.lang.Object obj) {
                int i = com.google.android.gms.internal.ads.zzta.zza;
                return ((com.google.android.gms.internal.ads.zzsg) obj).zzd(zzabVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0197  */
    /* JADX WARN: Code duplicated, block: B:102:0x019a  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a6 A[Catch: Exception -> 0x0238, TryCatch #2 {Exception -> 0x0238, blocks: (B:84:0x0159, B:90:0x0170, B:96:0x0185, B:98:0x018b, B:103:0x019c, B:105:0x01a6, B:115:0x01d2, B:106:0x01ab, B:108:0x01bb, B:110:0x01c3, B:99:0x0191), top: B:158:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01ab A[Catch: Exception -> 0x0238, TryCatch #2 {Exception -> 0x0238, blocks: (B:84:0x0159, B:90:0x0170, B:96:0x0185, B:98:0x018b, B:103:0x019c, B:105:0x01a6, B:115:0x01d2, B:106:0x01ab, B:108:0x01bb, B:110:0x01c3, B:99:0x0191), top: B:158:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01bb A[Catch: Exception -> 0x0238, TryCatch #2 {Exception -> 0x0238, blocks: (B:84:0x0159, B:90:0x0170, B:96:0x0185, B:98:0x018b, B:103:0x019c, B:105:0x01a6, B:115:0x01d2, B:106:0x01ab, B:108:0x01bb, B:110:0x01c3, B:99:0x0191), top: B:158:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d2 A[Catch: Exception -> 0x0238, TRY_LEAVE, TryCatch #2 {Exception -> 0x0238, blocks: (B:84:0x0159, B:90:0x0170, B:96:0x0185, B:98:0x018b, B:103:0x019c, B:105:0x01a6, B:115:0x01d2, B:106:0x01ab, B:108:0x01bb, B:110:0x01c3, B:99:0x0191), top: B:158:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:126:0x0204  */
    /* JADX WARN: Code duplicated, block: B:128:0x020d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x0247 A[Catch: Exception -> 0x0295, TRY_ENTER, TryCatch #4 {Exception -> 0x0295, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0034, B:14:0x0042, B:16:0x0048, B:18:0x004e, B:20:0x0056, B:22:0x005e, B:24:0x0068, B:26:0x0072, B:28:0x007c, B:30:0x0086, B:32:0x0090, B:34:0x009a, B:36:0x00a4, B:38:0x00ae, B:40:0x00b8, B:42:0x00be, B:44:0x00c6, B:46:0x00ce, B:48:0x00d7, B:141:0x023f, B:144:0x0247, B:146:0x024d, B:147:0x0267, B:148:0x0288, B:51:0x00e1, B:52:0x00e4, B:54:0x00ec, B:57:0x00f7, B:59:0x00ff, B:62:0x010a, B:64:0x0112, B:68:0x011f, B:70:0x0127, B:73:0x0132, B:75:0x013a, B:78:0x0145, B:80:0x014d), top: B:162:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0267 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0289 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x011d A[EDGE_INSN: B:67:0x011d->B:83:0x0157 BREAK  A[LOOP:1: B:47:0x00d5->B:51:0x00e1]] */
    /* JADX WARN: Code duplicated, block: B:92:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0180  */
    /* JADX WARN: Code duplicated, block: B:94:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0183  */
    /* JADX WARN: Code duplicated, block: B:98:0x018b A[Catch: Exception -> 0x0238, TryCatch #2 {Exception -> 0x0238, blocks: (B:84:0x0159, B:90:0x0170, B:96:0x0185, B:98:0x018b, B:103:0x019c, B:105:0x01a6, B:115:0x01d2, B:106:0x01ab, B:108:0x01bb, B:110:0x01c3, B:99:0x0191), top: B:158:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0191 A[Catch: Exception -> 0x0238, TryCatch #2 {Exception -> 0x0238, blocks: (B:84:0x0159, B:90:0x0170, B:96:0x0185, B:98:0x018b, B:103:0x019c, B:105:0x01a6, B:115:0x01d2, B:106:0x01ab, B:108:0x01bb, B:110:0x01c3, B:99:0x0191), top: B:158:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    private static java.util.ArrayList zzg(com.google.android.gms.internal.ads.zzst zzstVar, com.google.android.gms.internal.ads.zzsv zzsvVar) throws com.google.android.gms.internal.ads.zzsu {
        java.lang.String str;
        java.lang.String str2;
        int i;
        int i2;
        java.lang.String str3;
        boolean zZzd;
        boolean zZzc;
        boolean zIsHardwareAccelerated;
        boolean zZzi;
        java.lang.String strZza;
        boolean zIsVendor;
        java.lang.String str4;
        com.google.android.gms.internal.ads.zzst zzstVar2 = zzstVar;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str5 = zzstVar2.zza;
            boolean zZze = zzsvVar.zze();
            int i3 = 0;
            for (int iZza = zzsvVar.zza(); i3 < iZza; iZza = i2) {
                android.media.MediaCodecInfo mediaCodecInfoZzb = zzsvVar.zzb(i3);
                if (com.google.android.gms.internal.ads.zzei.zza < 29 || !mediaCodecInfoZzb.isAlias()) {
                    java.lang.String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || ((!zZze && name.endsWith(".secure")) || ((com.google.android.gms.internal.ads.zzei.zza < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(com.google.android.gms.internal.ads.zzei.zzc) && (com.google.android.gms.internal.ads.zzei.zzb.startsWith("zeroflte") || com.google.android.gms.internal.ads.zzei.zzb.startsWith("zerolte") || com.google.android.gms.internal.ads.zzei.zzb.startsWith("zenlte") || "SC-05G".equals(com.google.android.gms.internal.ads.zzei.zzb) || "marinelteatt".equals(com.google.android.gms.internal.ads.zzei.zzb) || "404SC".equals(com.google.android.gms.internal.ads.zzei.zzb) || "SC-04G".equals(com.google.android.gms.internal.ads.zzei.zzb) || "SCV31".equals(com.google.android.gms.internal.ads.zzei.zzb)))) || (com.google.android.gms.internal.ads.zzei.zza <= 23 && androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC.equals(str5) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))))) {
                        i = i3;
                        i2 = iZza;
                        str3 = str5;
                    } else {
                        java.lang.String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                if (!str5.equals(androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION)) {
                                    if (!str5.equals("video/mv-hevc")) {
                                        if (!str5.equals(androidx.media3.common.MimeTypes.AUDIO_ALAC) || !"OMX.lge.alac.decoder".equals(name)) {
                                            if (!str5.equals(androidx.media3.common.MimeTypes.AUDIO_FLAC) || !"OMX.lge.flac.decoder".equals(name)) {
                                                if (!str5.equals(androidx.media3.common.MimeTypes.AUDIO_AC3) || !"OMX.lge.ac3.decoder".equals(name)) {
                                                    str = null;
                                                    break;
                                                }
                                                str = "audio/lg-ac3";
                                                break;
                                            }
                                            str = "audio/x-lg-flac";
                                            break;
                                        }
                                        str = "audio/x-lg-alac";
                                        break;
                                    }
                                    if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/x-mvhevc";
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                    break;
                                }
                                str = "video/hevcdv";
                                break;
                            }
                            str = supportedTypes[i4];
                            if (str.equalsIgnoreCase(str5)) {
                                break;
                            }
                            i4++;
                        }
                        if (str != null) {
                            try {
                                android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                boolean zZzd2 = zzsvVar.zzd("tunneled-playback", str, capabilitiesForType);
                                boolean zZzc2 = zzsvVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzstVar2.zzc) {
                                    if (zZzd2) {
                                        zZzd = zzsvVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc = zzsvVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzstVar2.zzb) {
                                            if (zZzd) {
                                                zZzd = true;
                                                if (com.google.android.gms.internal.ads.zzei.zza >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                                zZzi = zzi(mediaCodecInfoZzb, str5);
                                                if (com.google.android.gms.internal.ads.zzei.zza >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = com.google.android.gms.internal.ads.zzftt.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (!zZze) {
                                                    if (!zZze) {
                                                        str4 = name;
                                                        i = i3;
                                                        i2 = iZza;
                                                        str3 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    } else if (zzstVar2.zzb) {
                                                        str4 = name;
                                                        i = i3;
                                                        i2 = iZza;
                                                        str3 = str5;
                                                        if (!zZze) {
                                                            continue;
                                                        }
                                                    } else {
                                                        str4 = name;
                                                        i = i3;
                                                        i2 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(com.google.android.gms.internal.ads.zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                } else if (!zZze) {
                                                    str4 = name;
                                                    i = i3;
                                                    i2 = iZza;
                                                    str3 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzstVar2.zzb) {
                                                    str4 = name;
                                                    i = i3;
                                                    i2 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(com.google.android.gms.internal.ads.zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                } else {
                                                    str4 = name;
                                                    i = i3;
                                                    i2 = iZza;
                                                    str3 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (!zZzc) {
                                            if (com.google.android.gms.internal.ads.zzei.zza >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (com.google.android.gms.internal.ads.zzei.zza >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = com.google.android.gms.internal.ads.zzftt.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZze) {
                                                if (!zZze) {
                                                    str4 = name;
                                                    i = i3;
                                                    i2 = iZza;
                                                    str3 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                } else if (zzstVar2.zzb) {
                                                    str4 = name;
                                                    i = i3;
                                                    i2 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(com.google.android.gms.internal.ads.zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                } else {
                                                    str4 = name;
                                                    i = i3;
                                                    i2 = iZza;
                                                    str3 = str5;
                                                    if (!zZze) {
                                                        continue;
                                                    }
                                                }
                                            } else if (!zZze) {
                                                str4 = name;
                                                i = i3;
                                                i2 = iZza;
                                                str3 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzstVar2.zzb) {
                                                str4 = name;
                                                i = i3;
                                                i2 = iZza;
                                                str3 = str5;
                                                arrayList.add(com.google.android.gms.internal.ads.zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                            } else {
                                                str4 = name;
                                                i = i3;
                                                i2 = iZza;
                                                str3 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (!zZzc2) {
                                    zZzd = zzsvVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc = zzsvVar.zzc("secure-playback", str, capabilitiesForType);
                                    if (zzstVar2.zzb) {
                                        if (!zZzc) {
                                            if (com.google.android.gms.internal.ads.zzei.zza >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (com.google.android.gms.internal.ads.zzei.zza >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = com.google.android.gms.internal.ads.zzftt.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = true;
                                                }
                                            }
                                            if (!zZze && zzstVar2.zzb == zZzd) {
                                                str4 = name;
                                                i = i3;
                                                i2 = iZza;
                                                str3 = str5;
                                                arrayList.add(com.google.android.gms.internal.ads.zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                            } else if (!zZze) {
                                                try {
                                                    if (zzstVar2.zzb) {
                                                        str4 = name;
                                                        i = i3;
                                                        i2 = iZza;
                                                        str3 = str5;
                                                        try {
                                                            arrayList.add(com.google.android.gms.internal.ads.zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                        } catch (java.lang.Exception e) {
                                                            e = e;
                                                            str2 = str4;
                                                            if (com.google.android.gms.internal.ads.zzei.zza <= 23) {
                                                            }
                                                            com.google.android.gms.internal.ads.zzdo.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                            throw e;
                                                        }
                                                    } else {
                                                        str4 = name;
                                                        i = i3;
                                                        i2 = iZza;
                                                        str3 = str5;
                                                        if (!zZze && zZzd) {
                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                            try {
                                                                sb.append(str4);
                                                                sb.append(".secure");
                                                                str2 = str4;
                                                                try {
                                                                    arrayList.add(com.google.android.gms.internal.ads.zzsg.zzc(sb.toString(), str3, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, true));
                                                                    break;
                                                                } catch (java.lang.Exception e2) {
                                                                    e = e2;
                                                                    if (com.google.android.gms.internal.ads.zzei.zza <= 23) {
                                                                    }
                                                                    com.google.android.gms.internal.ads.zzdo.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                                    throw e;
                                                                }
                                                            } catch (java.lang.Exception e3) {
                                                                e = e3;
                                                                str2 = str4;
                                                            }
                                                        }
                                                    }
                                                } catch (java.lang.Exception e4) {
                                                    e = e4;
                                                    i = i3;
                                                    i2 = iZza;
                                                    str3 = str5;
                                                    str2 = name;
                                                    if (com.google.android.gms.internal.ads.zzei.zza <= 23 || arrayList.isEmpty()) {
                                                        com.google.android.gms.internal.ads.zzdo.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                        throw e;
                                                    }
                                                    com.google.android.gms.internal.ads.zzdo.zzc("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                    i3 = i + 1;
                                                    zzstVar2 = zzstVar;
                                                    str5 = str3;
                                                }
                                            } else {
                                                str4 = name;
                                                i = i3;
                                                i2 = iZza;
                                                str3 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd) {
                                        zZzd = true;
                                        if (com.google.android.gms.internal.ads.zzei.zza >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzi(mediaCodecInfoZzb, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str5);
                                        if (com.google.android.gms.internal.ads.zzei.zza >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = com.google.android.gms.internal.ads.zzftt.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (!zZze) {
                                            if (!zZze) {
                                                str4 = name;
                                                i = i3;
                                                i2 = iZza;
                                                str3 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            } else if (zzstVar2.zzb) {
                                                str4 = name;
                                                i = i3;
                                                i2 = iZza;
                                                str3 = str5;
                                                arrayList.add(com.google.android.gms.internal.ads.zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                            } else {
                                                str4 = name;
                                                i = i3;
                                                i2 = iZza;
                                                str3 = str5;
                                                if (!zZze) {
                                                    continue;
                                                }
                                            }
                                        } else if (!zZze) {
                                            str4 = name;
                                            i = i3;
                                            i2 = iZza;
                                            str3 = str5;
                                            if (!zZze) {
                                                continue;
                                            }
                                        } else if (zzstVar2.zzb) {
                                            str4 = name;
                                            i = i3;
                                            i2 = iZza;
                                            str3 = str5;
                                            arrayList.add(com.google.android.gms.internal.ads.zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                        } else {
                                            str4 = name;
                                            i = i3;
                                            i2 = iZza;
                                            str3 = str5;
                                            if (!zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i = i3;
                                i2 = iZza;
                                str3 = str5;
                            } catch (java.lang.Exception e5) {
                                e = e5;
                                str2 = name;
                                i = i3;
                                i2 = iZza;
                                str3 = str5;
                            }
                        } else {
                            i = i3;
                            i2 = iZza;
                            str3 = str5;
                        }
                    }
                } else {
                    i = i3;
                    i2 = iZza;
                    str3 = str5;
                }
                i3 = i + 1;
                zzstVar2 = zzstVar;
                str5 = str3;
            }
            return arrayList;
        } catch (java.lang.Exception e6) {
            throw new com.google.android.gms.internal.ads.zzsu(e6, null);
        }
    }

    private static void zzh(java.util.List list, final com.google.android.gms.internal.ads.zzsy zzsyVar) {
        java.util.Collections.sort(list, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzsq
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int i = com.google.android.gms.internal.ads.zzta.zza;
                com.google.android.gms.internal.ads.zzsy zzsyVar2 = zzsyVar;
                return zzsyVar2.zza(obj2) - zzsyVar2.zza(obj);
            }
        });
    }

    private static boolean zzi(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (com.google.android.gms.internal.ads.zzei.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (com.google.android.gms.internal.ads.zzbb.zzg(str)) {
            return true;
        }
        java.lang.String strZza = com.google.android.gms.internal.ads.zzftt.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }
}
