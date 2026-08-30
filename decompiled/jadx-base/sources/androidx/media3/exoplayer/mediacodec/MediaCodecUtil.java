package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final class MediaCodecUtil {
    private static final java.lang.String CODEC_ID_AV01 = "av01";
    private static final java.lang.String CODEC_ID_AVC1 = "avc1";
    private static final java.lang.String CODEC_ID_AVC2 = "avc2";
    private static final java.lang.String CODEC_ID_HEV1 = "hev1";
    private static final java.lang.String CODEC_ID_HVC1 = "hvc1";
    private static final java.lang.String CODEC_ID_MP4A = "mp4a";
    private static final java.lang.String CODEC_ID_VP09 = "vp09";
    private static final java.lang.String TAG = "MediaCodecUtil";
    private static final java.util.regex.Pattern PROFILE_PATTERN = java.util.regex.Pattern.compile("^\\D?(\\d+)$");
    private static final java.util.HashMap<androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey, java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo>> decoderInfosCache = new java.util.HashMap<>();
    private static int maxH264DecodableFrameSize = -1;

    private interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i);

        boolean isFeatureRequired(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface ScoreProvider<T> {
        int getScore(T t);
    }

    private static int av1LevelNumberToConst(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int avcLevelToMaxFrameSize(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int avcProfileNumberToConst(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    private static int mp4aAudioObjectTypeToProfile(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    private static int vp9LevelNumberToConst(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int vp9ProfileNumberToConst(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    public static class DecoderQueryException extends java.lang.Exception {
        private DecoderQueryException(java.lang.Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private MediaCodecUtil() {
    }

    public static void warmDecoderInfoCache(java.lang.String str, boolean z, boolean z2) {
        try {
            getDecoderInfos(str, z, z2);
        } catch (androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException e) {
            androidx.media3.common.util.Log.e(TAG, "Codec warming failed", e);
        }
    }

    public static synchronized void clearDecoderInfoCache() {
        decoderInfosCache.clear();
    }

    public static androidx.media3.exoplayer.mediacodec.MediaCodecInfo getDecryptOnlyDecoderInfo() throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        return getDecoderInfo(androidx.media3.common.MimeTypes.AUDIO_RAW, false, false);
    }

    public static androidx.media3.exoplayer.mediacodec.MediaCodecInfo getDecoderInfo(java.lang.String str, boolean z, boolean z2) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfos = getDecoderInfos(str, z, z2);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfos(java.lang.String str, boolean z, boolean z2) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat mediaCodecListCompatV16;
        androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey codecKey = new androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey(str, z, z2);
        java.util.HashMap<androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey, java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo>> map = decoderInfosCache;
        java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> list = map.get(codecKey);
        if (list != null) {
            return list;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 21) {
            mediaCodecListCompatV16 = new androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompatV21(z, z2);
        } else {
            mediaCodecListCompatV16 = new androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompatV16();
        }
        java.util.ArrayList<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfosInternal = getDecoderInfosInternal(codecKey, mediaCodecListCompatV16);
        if (z && decoderInfosInternal.isEmpty() && 21 <= androidx.media3.common.util.Util.SDK_INT && androidx.media3.common.util.Util.SDK_INT <= 23) {
            decoderInfosInternal = getDecoderInfosInternal(codecKey, new androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompatV16());
            if (!decoderInfosInternal.isEmpty()) {
                androidx.media3.common.util.Log.w(TAG, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + decoderInfosInternal.get(0).name);
            }
        }
        applyWorkarounds(str, decoderInfosInternal);
        com.google.common.collect.ImmutableList immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) decoderInfosInternal);
        map.put(codecKey, immutableListCopyOf);
        return immutableListCopyOf;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#2.sampleMimeType"})
    public static java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfosSoftMatch(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format, boolean z, boolean z2) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfos = mediaCodecSelector.getDecoderInfos(format.sampleMimeType, z, z2);
        return com.google.common.collect.ImmutableList.builder().addAll((java.lang.Iterable) decoderInfos).addAll((java.lang.Iterable) getAlternativeDecoderInfos(mediaCodecSelector, format, z, z2)).build();
    }

    public static java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getAlternativeDecoderInfos(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format, boolean z, boolean z2) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        java.lang.String alternativeCodecMimeType = getAlternativeCodecMimeType(format);
        if (alternativeCodecMimeType == null) {
            return com.google.common.collect.ImmutableList.of();
        }
        return mediaCodecSelector.getDecoderInfos(alternativeCodecMimeType, z, z2);
    }

    public static java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfosSortedByFormatSupport(java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> list, final androidx.media3.common.Format format) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        sortByScore(arrayList, new androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
            public final int getScore(java.lang.Object obj) {
                return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.lambda$getDecoderInfosSortedByFormatSupport$0(format, (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) obj);
            }
        });
        return arrayList;
    }

    static /* synthetic */ int lambda$getDecoderInfosSortedByFormatSupport$0(androidx.media3.common.Format format, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isFormatFunctionallySupported(format) ? 1 : 0;
    }

    public static int maxH264DecodableFrameSize() throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        if (maxH264DecodableFrameSize == -1) {
            int iMax = 0;
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo decoderInfo = getDecoderInfo("video/avc", false, false);
            if (decoderInfo != null) {
                android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = java.lang.Math.max(avcLevelToMaxFrameSize(profileLevels[iMax].level), iMax2);
                    iMax++;
                }
                iMax = java.lang.Math.max(iMax2, androidx.media3.common.util.Util.SDK_INT >= 21 ? 345600 : 172800);
            }
            maxH264DecodableFrameSize = iMax;
        }
        return maxH264DecodableFrameSize;
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getCodecProfileAndLevel(androidx.media3.common.Format format) {
        if (format.codecs == null) {
            return null;
        }
        java.lang.String[] strArrSplit = format.codecs.split("\\.");
        if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType)) {
            return getDolbyVisionProfileAndLevel(format.codecs, strArrSplit);
        }
        byte b = 0;
        java.lang.String str = strArrSplit[0];
        str.hashCode();
        switch (str.hashCode()) {
            case 3004662:
                if (!str.equals(CODEC_ID_AV01)) {
                    b = -1;
                }
                break;
            case 3006243:
                b = !str.equals(CODEC_ID_AVC1) ? (byte) -1 : (byte) 1;
                break;
            case 3006244:
                b = !str.equals(CODEC_ID_AVC2) ? (byte) -1 : (byte) 2;
                break;
            case 3199032:
                b = !str.equals(CODEC_ID_HEV1) ? (byte) -1 : (byte) 3;
                break;
            case 3214780:
                b = !str.equals(CODEC_ID_HVC1) ? (byte) -1 : (byte) 4;
                break;
            case 3356560:
                b = !str.equals(CODEC_ID_MP4A) ? (byte) -1 : (byte) 5;
                break;
            case 3624515:
                b = !str.equals(CODEC_ID_VP09) ? (byte) -1 : (byte) 6;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return getAv1ProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case 1:
            case 2:
                return getAvcProfileAndLevel(format.codecs, strArrSplit);
            case 3:
            case 4:
                return getHevcProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case 5:
                return getAacCodecProfileAndLevel(format.codecs, strArrSplit);
            case 6:
                return getVp9ProfileAndLevel(format.codecs, strArrSplit);
            default:
                return null;
        }
    }

    public static java.lang.String getAlternativeCodecMimeType(androidx.media3.common.Format format) {
        android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel;
        if (androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC.equals(format.sampleMimeType)) {
            return androidx.media3.common.MimeTypes.AUDIO_E_AC3;
        }
        if (!androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) || (codecProfileAndLevel = getCodecProfileAndLevel(format)) == null) {
            return null;
        }
        int iIntValue = ((java.lang.Integer) codecProfileAndLevel.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        if (iIntValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x0107 A[Catch: Exception -> 0x015d, TRY_ENTER, TryCatch #1 {Exception -> 0x015d, blocks: (B:3:0x0008, B:5:0x001b, B:62:0x0129, B:8:0x002d, B:11:0x0038, B:56:0x00ff, B:59:0x0107, B:61:0x010d, B:63:0x0133, B:64:0x015b), top: B:71:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:83:0x0133 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static java.util.ArrayList<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfosInternal(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey codecKey, androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat mediaCodecListCompat) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        java.lang.String codecMimeType;
        java.lang.String str;
        java.lang.String str2;
        int i;
        boolean z;
        int i2;
        androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey codecKey2 = codecKey;
        try {
            java.util.ArrayList<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> arrayList = new java.util.ArrayList<>();
            java.lang.String str3 = codecKey2.mimeType;
            int codecCount = mediaCodecListCompat.getCodecCount();
            boolean zSecureDecodersExplicit = mediaCodecListCompat.secureDecodersExplicit();
            int i3 = 0;
            while (i3 < codecCount) {
                android.media.MediaCodecInfo codecInfoAt = mediaCodecListCompat.getCodecInfoAt(i3);
                if (isAlias(codecInfoAt)) {
                    i = i3;
                    z = zSecureDecodersExplicit;
                    i2 = codecCount;
                } else {
                    java.lang.String name = codecInfoAt.getName();
                    if (isCodecUsableDecoder(codecInfoAt, name, zSecureDecodersExplicit, str3) && (codecMimeType = getCodecMimeType(codecInfoAt, name, str3)) != null) {
                        try {
                            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(codecMimeType);
                            boolean zIsFeatureSupported = mediaCodecListCompat.isFeatureSupported("tunneled-playback", codecMimeType, capabilitiesForType);
                            boolean zIsFeatureRequired = mediaCodecListCompat.isFeatureRequired("tunneled-playback", codecMimeType, capabilitiesForType);
                            if ((codecKey2.tunneling || !zIsFeatureRequired) && (!codecKey2.tunneling || zIsFeatureSupported)) {
                                boolean zIsFeatureSupported2 = mediaCodecListCompat.isFeatureSupported("secure-playback", codecMimeType, capabilitiesForType);
                                boolean zIsFeatureRequired2 = mediaCodecListCompat.isFeatureRequired("secure-playback", codecMimeType, capabilitiesForType);
                                if ((codecKey2.secure || !zIsFeatureRequired2) && (!codecKey2.secure || zIsFeatureSupported2)) {
                                    boolean zIsHardwareAccelerated = isHardwareAccelerated(codecInfoAt, str3);
                                    boolean zIsSoftwareOnly = isSoftwareOnly(codecInfoAt, str3);
                                    boolean zIsVendor = isVendor(codecInfoAt);
                                    if (zSecureDecodersExplicit && codecKey2.secure == zIsFeatureSupported2) {
                                        str = codecMimeType;
                                        i = i3;
                                        z = zSecureDecodersExplicit;
                                        i2 = codecCount;
                                        arrayList.add(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.newInstance(name, str3, codecMimeType, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, zIsVendor, false, false));
                                    } else if (zSecureDecodersExplicit) {
                                        str = codecMimeType;
                                        i = i3;
                                        z = zSecureDecodersExplicit;
                                        i2 = codecCount;
                                        if (!z) {
                                            continue;
                                        }
                                    } else {
                                        try {
                                            if (codecKey2.secure) {
                                                str = codecMimeType;
                                                i = i3;
                                                z = zSecureDecodersExplicit;
                                                i2 = codecCount;
                                                if (!z && zIsFeatureSupported2) {
                                                    try {
                                                        str2 = name;
                                                        try {
                                                            arrayList.add(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.newInstance(name + ".secure", str3, str, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, zIsVendor, false, true));
                                                            return arrayList;
                                                        } catch (java.lang.Exception e) {
                                                            e = e;
                                                            if (androidx.media3.common.util.Util.SDK_INT > 23 && !arrayList.isEmpty()) {
                                                                androidx.media3.common.util.Log.e(TAG, "Skipping codec " + str2 + " (failed to query capabilities)");
                                                                i3 = i + 1;
                                                                codecKey2 = codecKey;
                                                                codecCount = i2;
                                                                zSecureDecodersExplicit = z;
                                                            } else {
                                                                androidx.media3.common.util.Log.e(TAG, "Failed to query codec " + str2 + " (" + str + ")");
                                                                throw e;
                                                            }
                                                        }
                                                    } catch (java.lang.Exception e2) {
                                                        e = e2;
                                                        str2 = name;
                                                    }
                                                }
                                            } else {
                                                str = codecMimeType;
                                                i = i3;
                                                z = zSecureDecodersExplicit;
                                                i2 = codecCount;
                                                try {
                                                    arrayList.add(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.newInstance(name, str3, codecMimeType, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, zIsVendor, false, false));
                                                } catch (java.lang.Exception e3) {
                                                    e = e3;
                                                    str2 = name;
                                                    if (androidx.media3.common.util.Util.SDK_INT > 23) {
                                                    }
                                                    androidx.media3.common.util.Log.e(TAG, "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                        } catch (java.lang.Exception e4) {
                                            e = e4;
                                            str = codecMimeType;
                                            i = i3;
                                            z = zSecureDecodersExplicit;
                                            i2 = codecCount;
                                            str2 = name;
                                            if (androidx.media3.common.util.Util.SDK_INT > 23) {
                                            }
                                            androidx.media3.common.util.Log.e(TAG, "Failed to query codec " + str2 + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                } else {
                                    i = i3;
                                    z = zSecureDecodersExplicit;
                                    i2 = codecCount;
                                }
                            } else {
                                i = i3;
                                z = zSecureDecodersExplicit;
                                i2 = codecCount;
                            }
                        } catch (java.lang.Exception e5) {
                            e = e5;
                            str = codecMimeType;
                            str2 = name;
                            i = i3;
                            z = zSecureDecodersExplicit;
                            i2 = codecCount;
                        }
                    } else {
                        i = i3;
                        z = zSecureDecodersExplicit;
                        i2 = codecCount;
                    }
                }
                i3 = i + 1;
                codecKey2 = codecKey;
                codecCount = i2;
                zSecureDecodersExplicit = z;
            }
            return arrayList;
        } catch (java.lang.Exception e6) {
            throw new androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException(e6);
        }
    }

    private static java.lang.String getCodecMimeType(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, java.lang.String str2) {
        for (java.lang.String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION)) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(androidx.media3.common.MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(androidx.media3.common.MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals(androidx.media3.common.MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, boolean z, java.lang.String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (androidx.media3.common.util.Util.SDK_INT < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (androidx.media3.common.util.Util.SDK_INT < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(androidx.media3.common.util.Util.MANUFACTURER) && (androidx.media3.common.util.Util.DEVICE.startsWith("zeroflte") || androidx.media3.common.util.Util.DEVICE.startsWith("zerolte") || androidx.media3.common.util.Util.DEVICE.startsWith("zenlte") || "SC-05G".equals(androidx.media3.common.util.Util.DEVICE) || "marinelteatt".equals(androidx.media3.common.util.Util.DEVICE) || "404SC".equals(androidx.media3.common.util.Util.DEVICE) || "SC-04G".equals(androidx.media3.common.util.Util.DEVICE) || "SCV31".equals(androidx.media3.common.util.Util.DEVICE)))) {
            return false;
        }
        if (androidx.media3.common.util.Util.SDK_INT == 19 && "OMX.SEC.vp8.dec".equals(str) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(androidx.media3.common.util.Util.MANUFACTURER) && (androidx.media3.common.util.Util.DEVICE.startsWith("d2") || androidx.media3.common.util.Util.DEVICE.startsWith("serrano") || androidx.media3.common.util.Util.DEVICE.startsWith("jflte") || androidx.media3.common.util.Util.DEVICE.startsWith("santos") || androidx.media3.common.util.Util.DEVICE.startsWith("t0"))) {
            return false;
        }
        if (androidx.media3.common.util.Util.SDK_INT == 19 && androidx.media3.common.util.Util.DEVICE.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (androidx.media3.common.util.Util.SDK_INT <= 23 && androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static void applyWorkarounds(java.lang.String str, java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> list) {
        if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(str)) {
            if (androidx.media3.common.util.Util.SDK_INT < 26 && androidx.media3.common.util.Util.DEVICE.equals("R9") && list.size() == 1 && list.get(0).name.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.newInstance("OMX.google.raw.decoder", androidx.media3.common.MimeTypes.AUDIO_RAW, androidx.media3.common.MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
            }
            sortByScore(list, new androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda2
                @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
                public final int getScore(java.lang.Object obj) {
                    return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.lambda$applyWorkarounds$1((androidx.media3.exoplayer.mediacodec.MediaCodecInfo) obj);
                }
            });
        }
        if (androidx.media3.common.util.Util.SDK_INT < 21 && list.size() > 1) {
            java.lang.String str2 = list.get(0).name;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                sortByScore(list, new androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda3
                    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
                    public final int getScore(java.lang.Object obj) {
                        return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.lambda$applyWorkarounds$2((androidx.media3.exoplayer.mediacodec.MediaCodecInfo) obj);
                    }
                });
            }
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).name)) {
            return;
        }
        list.add(list.remove(0));
    }

    static /* synthetic */ int lambda$applyWorkarounds$1(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        java.lang.String str = mediaCodecInfo.name;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (androidx.media3.common.util.Util.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    static /* synthetic */ int lambda$applyWorkarounds$2(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.name.startsWith("OMX.google") ? 1 : 0;
    }

    private static boolean isAlias(android.media.MediaCodecInfo mediaCodecInfo) {
        return androidx.media3.common.util.Util.SDK_INT >= 29 && isAliasV29(mediaCodecInfo);
    }

    private static boolean isAliasV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (androidx.media3.common.util.Util.SDK_INT >= 29) {
            return isHardwareAcceleratedV29(mediaCodecInfo);
        }
        return !isSoftwareOnly(mediaCodecInfo, str);
    }

    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (androidx.media3.common.util.Util.SDK_INT >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        if (androidx.media3.common.MimeTypes.isAudio(str)) {
            return true;
        }
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
            return true;
        }
        return (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")) ? false : true;
    }

    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean isVendor(android.media.MediaCodecInfo mediaCodecInfo) {
        if (androidx.media3.common.util.Util.SDK_INT >= 29) {
            return isVendorV29(mediaCodecInfo);
        }
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    private static boolean isVendorV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getDolbyVisionProfileAndLevel(java.lang.String str, java.lang.String[] strArr) {
        if (strArr.length < 3) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        java.util.regex.Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        java.lang.String strGroup = matcher.group(1);
        java.lang.Integer numDolbyVisionStringToProfile = dolbyVisionStringToProfile(strGroup);
        if (numDolbyVisionStringToProfile == null) {
            androidx.media3.common.util.Log.w(TAG, "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        java.lang.String str2 = strArr[2];
        java.lang.Integer numDolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (numDolbyVisionStringToLevel == null) {
            androidx.media3.common.util.Log.w(TAG, "Unknown Dolby Vision level string: " + str2);
            return null;
        }
        return new android.util.Pair<>(numDolbyVisionStringToProfile, numDolbyVisionStringToLevel);
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getHevcProfileAndLevel(java.lang.String str, java.lang.String[] strArr, androidx.media3.common.ColorInfo colorInfo) {
        if (strArr.length < 4) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        java.util.regex.Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        java.lang.String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if ("2".equals(strGroup)) {
                i = (colorInfo == null || colorInfo.colorTransfer != 6) ? 2 : 4096;
            } else {
                androidx.media3.common.util.Log.w(TAG, "Unknown HEVC profile string: " + strGroup);
                return null;
            }
        }
        java.lang.String str2 = strArr[3];
        java.lang.Integer numHevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (numHevcCodecStringToProfileLevel == null) {
            androidx.media3.common.util.Log.w(TAG, "Unknown HEVC level string: " + str2);
            return null;
        }
        return new android.util.Pair<>(java.lang.Integer.valueOf(i), numHevcCodecStringToProfileLevel);
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getAvcProfileAndLevel(java.lang.String str, java.lang.String[] strArr) {
        int i;
        int i2;
        if (strArr.length < 2) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = java.lang.Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = java.lang.Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int i3 = java.lang.Integer.parseInt(strArr[1]);
                i = java.lang.Integer.parseInt(strArr[2]);
                i2 = i3;
            } else {
                androidx.media3.common.util.Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int iAvcProfileNumberToConst = avcProfileNumberToConst(i2);
            if (iAvcProfileNumberToConst == -1) {
                androidx.media3.common.util.Log.w(TAG, "Unknown AVC profile: " + i2);
                return null;
            }
            int iAvcLevelNumberToConst = avcLevelNumberToConst(i);
            if (iAvcLevelNumberToConst == -1) {
                androidx.media3.common.util.Log.w(TAG, "Unknown AVC level: " + i);
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(iAvcProfileNumberToConst), java.lang.Integer.valueOf(iAvcLevelNumberToConst));
        } catch (java.lang.NumberFormatException unused) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getVp9ProfileAndLevel(java.lang.String str, java.lang.String[] strArr) {
        if (strArr.length < 3) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i = java.lang.Integer.parseInt(strArr[1]);
            int i2 = java.lang.Integer.parseInt(strArr[2]);
            int iVp9ProfileNumberToConst = vp9ProfileNumberToConst(i);
            if (iVp9ProfileNumberToConst == -1) {
                androidx.media3.common.util.Log.w(TAG, "Unknown VP9 profile: " + i);
                return null;
            }
            int iVp9LevelNumberToConst = vp9LevelNumberToConst(i2);
            if (iVp9LevelNumberToConst == -1) {
                androidx.media3.common.util.Log.w(TAG, "Unknown VP9 level: " + i2);
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(iVp9ProfileNumberToConst), java.lang.Integer.valueOf(iVp9LevelNumberToConst));
        } catch (java.lang.NumberFormatException unused) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getAv1ProfileAndLevel(java.lang.String str, java.lang.String[] strArr, androidx.media3.common.ColorInfo colorInfo) {
        if (strArr.length < 4) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i = 1;
        try {
            int i2 = java.lang.Integer.parseInt(strArr[1]);
            int i3 = java.lang.Integer.parseInt(strArr[2].substring(0, 2));
            int i4 = java.lang.Integer.parseInt(strArr[3]);
            if (i2 != 0) {
                androidx.media3.common.util.Log.w(TAG, "Unknown AV1 profile: " + i2);
                return null;
            }
            if (i4 != 8 && i4 != 10) {
                androidx.media3.common.util.Log.w(TAG, "Unknown AV1 bit depth: " + i4);
                return null;
            }
            if (i4 != 8) {
                i = (colorInfo == null || !(colorInfo.hdrStaticInfo != null || colorInfo.colorTransfer == 7 || colorInfo.colorTransfer == 6)) ? 2 : 4096;
            }
            int iAv1LevelNumberToConst = av1LevelNumberToConst(i3);
            if (iAv1LevelNumberToConst == -1) {
                androidx.media3.common.util.Log.w(TAG, "Unknown AV1 level: " + i3);
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iAv1LevelNumberToConst));
        } catch (java.lang.NumberFormatException unused) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getAacCodecProfileAndLevel(java.lang.String str, java.lang.String[] strArr) {
        int iMp4aAudioObjectTypeToProfile;
        if (strArr.length != 3) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if (androidx.media3.common.MimeTypes.AUDIO_AAC.equals(androidx.media3.common.MimeTypes.getMimeTypeFromMp4ObjectType(java.lang.Integer.parseInt(strArr[1], 16))) && (iMp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(java.lang.Integer.parseInt(strArr[2]))) != -1) {
                return new android.util.Pair<>(java.lang.Integer.valueOf(iMp4aAudioObjectTypeToProfile), 0);
            }
        } catch (java.lang.NumberFormatException unused) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    static /* synthetic */ int lambda$sortByScore$3(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider scoreProvider, java.lang.Object obj, java.lang.Object obj2) {
        return scoreProvider.getScore(obj2) - scoreProvider.getScore(obj);
    }

    private static <T> void sortByScore(java.util.List<T> list, final androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider<T> scoreProvider) {
        java.util.Collections.sort(list, new java.util.Comparator() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.lambda$sortByScore$3(scoreProvider, obj, obj2);
            }
        });
    }

    private static final class MediaCodecListCompatV21 implements androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat {
        private final int codecKind;
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return true;
        }

        public MediaCodecListCompatV21(boolean z, boolean z2) {
            this.codecKind = (z || z2) ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i) {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos[i];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"mediaCodecInfos"})
        private void ensureMediaCodecInfosInitialized() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new android.media.MediaCodecList(this.codecKind).getCodecInfos();
            }
        }
    }

    private static final class MediaCodecListCompatV16 implements androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat {
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return false;
        }

        private MediaCodecListCompatV16() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            return android.media.MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i) {
            return android.media.MediaCodecList.getCodecInfoAt(i);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    private static final class CodecKey {
        public final java.lang.String mimeType;
        public final boolean secure;
        public final boolean tunneling;

        public CodecKey(java.lang.String str, boolean z, boolean z2) {
            this.mimeType = str;
            this.secure = z;
            this.tunneling = z2;
        }

        public int hashCode() {
            return ((((this.mimeType.hashCode() + 31) * 31) + (this.secure ? 1231 : 1237)) * 31) + (this.tunneling ? 1231 : 1237);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey.class) {
                return false;
            }
            androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey codecKey = (androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey) obj;
            return android.text.TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure && this.tunneling == codecKey.tunneling;
        }
    }

    private static java.lang.Integer hevcCodecStringToProfileLevel(java.lang.String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                return 32;
            case "H90":
                return 128;
            case "H93":
                return 512;
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                return 64;
            case "L93":
                return 256;
            case "H120":
                return 2048;
            case "H123":
                return 8192;
            case "H150":
                return 32768;
            case "H153":
                return 131072;
            case "H156":
                return 524288;
            case "H180":
                return 2097152;
            case "H183":
                return 8388608;
            case "H186":
                return 33554432;
            case "L120":
                return 1024;
            case "L123":
                return 4096;
            case "L150":
                return 16384;
            case "L153":
                return 65536;
            case "L156":
                return 262144;
            case "L180":
                return 1048576;
            case "L183":
                return 4194304;
            case "L186":
                return 16777216;
            default:
                return null;
        }
    }

    private static java.lang.Integer dolbyVisionStringToProfile(java.lang.String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                return 16;
            case "05":
                return 32;
            case "06":
                return 64;
            case "07":
                return 128;
            case "08":
                return 256;
            case "09":
                return 512;
            case "10":
                return 1024;
            default:
                return null;
        }
    }

    private static java.lang.Integer dolbyVisionStringToLevel(java.lang.String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                return 16;
            case "06":
                return 32;
            case "07":
                return 64;
            case "08":
                return 128;
            case "09":
                return 256;
            case "10":
                return 512;
            case "11":
                return 1024;
            case "12":
                return 2048;
            case "13":
                return 4096;
            default:
                return null;
        }
    }
}
