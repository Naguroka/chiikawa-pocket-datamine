package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final java.lang.String TAG = "MediaCodecInfo";
    public final boolean adaptive;
    public final android.media.MediaCodecInfo.CodecCapabilities capabilities;
    public final java.lang.String codecMimeType;
    public final boolean hardwareAccelerated;
    private final boolean isVideo;
    public final java.lang.String mimeType;
    public final java.lang.String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    public static androidx.media3.exoplayer.mediacodec.MediaCodecInfo newInstance(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new androidx.media3.exoplayer.mediacodec.MediaCodecInfo(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !isAdaptive(codecCapabilities) || needsDisableAdaptationWorkaround(str)) ? false : true, codecCapabilities != null && isTunneling(codecCapabilities), z5 || (codecCapabilities != null && isSecure(codecCapabilities)));
    }

    MediaCodecInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.name = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(str);
        this.mimeType = str2;
        this.codecMimeType = str3;
        this.capabilities = codecCapabilities;
        this.hardwareAccelerated = z;
        this.softwareOnly = z2;
        this.vendor = z3;
        this.adaptive = z4;
        this.tunneling = z5;
        this.secure = z6;
        this.isVideo = androidx.media3.common.MimeTypes.isVideo(str2);
    }

    public java.lang.String toString() {
        return this.name;
    }

    public android.media.MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new android.media.MediaCodecInfo.CodecProfileLevel[0] : this.capabilities.profileLevels;
    }

    public int getMaxSupportedInstances() {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (androidx.media3.common.util.Util.SDK_INT < 23 || (codecCapabilities = this.capabilities) == null) {
            return -1;
        }
        return getMaxSupportedInstancesV23(codecCapabilities);
    }

    public boolean isFormatSupported(androidx.media3.common.Format format) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        if (!isSampleMimeTypeSupported(format) || !isCodecProfileAndLevelSupported(format, true)) {
            return false;
        }
        if (this.isVideo) {
            if (format.width <= 0 || format.height <= 0) {
                return true;
            }
            if (androidx.media3.common.util.Util.SDK_INT >= 21) {
                return isVideoSizeAndRateSupportedV21(format.width, format.height, format.frameRate);
            }
            boolean z = format.width * format.height <= androidx.media3.exoplayer.mediacodec.MediaCodecUtil.maxH264DecodableFrameSize();
            if (!z) {
                logNoSupport("legacyFrameSize, " + format.width + "x" + format.height);
            }
            return z;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 21) {
            if (format.sampleRate != -1 && !isAudioSampleRateSupportedV21(format.sampleRate)) {
                return false;
            }
            if (format.channelCount != -1 && !isAudioChannelCountSupportedV21(format.channelCount)) {
                return false;
            }
        }
        return true;
    }

    public boolean isFormatFunctionallySupported(androidx.media3.common.Format format) {
        return isSampleMimeTypeSupported(format) && isCodecProfileAndLevelSupported(format, false);
    }

    private boolean isSampleMimeTypeSupported(androidx.media3.common.Format format) {
        return this.mimeType.equals(format.sampleMimeType) || this.mimeType.equals(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getAlternativeCodecMimeType(format));
    }

    private boolean isCodecProfileAndLevelSupported(androidx.media3.common.Format format, boolean z) {
        android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(format);
        if (codecProfileAndLevel == null) {
            return true;
        }
        int iIntValue = ((java.lang.Integer) codecProfileAndLevel.first).intValue();
        int iIntValue2 = ((java.lang.Integer) codecProfileAndLevel.second).intValue();
        if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType)) {
            if (!"video/avc".equals(this.mimeType)) {
                iIntValue = "video/hevc".equals(this.mimeType) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.isVideo && iIntValue != 42) {
            return true;
        }
        android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = getProfileLevels();
        if (androidx.media3.common.util.Util.SDK_INT <= 23 && androidx.media3.common.MimeTypes.VIDEO_VP9.equals(this.mimeType) && profileLevels.length == 0) {
            profileLevels = estimateLegacyVp9ProfileLevels(this.capabilities);
        }
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z) && !needsProfileExcludedWorkaround(this.mimeType, iIntValue))) {
                return true;
            }
        }
        logNoSupport("codec.profileLevel, " + format.codecs + ", " + this.codecMimeType);
        return false;
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (androidx.media3.common.util.Util.SDK_INT >= 29 && androidx.media3.common.MimeTypes.VIDEO_VP9.equals(this.mimeType)) {
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(androidx.media3.common.Format format) {
        if (this.isVideo) {
            return this.adaptive;
        }
        android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(format);
        return codecProfileAndLevel != null && ((java.lang.Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    public androidx.media3.exoplayer.DecoderReuseEvaluation canReuseCodec(androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        int i = !androidx.media3.common.util.Util.areEqual(format.sampleMimeType, format2.sampleMimeType) ? 8 : 0;
        if (this.isVideo) {
            if (format.rotationDegrees != format2.rotationDegrees) {
                i |= 1024;
            }
            if (!this.adaptive && (format.width != format2.width || format.height != format2.height)) {
                i |= 512;
            }
            if ((!androidx.media3.common.ColorInfo.isEquivalentToAssumedSdrDefault(format.colorInfo) || !androidx.media3.common.ColorInfo.isEquivalentToAssumedSdrDefault(format2.colorInfo)) && !androidx.media3.common.util.Util.areEqual(format.colorInfo, format2.colorInfo)) {
                i |= 2048;
            }
            if (needsAdaptationReconfigureWorkaround(this.name) && !format.initializationDataEquals(format2)) {
                i |= 2;
            }
            if (i == 0) {
                return new androidx.media3.exoplayer.DecoderReuseEvaluation(this.name, format, format2, format.initializationDataEquals(format2) ? 3 : 2, 0);
            }
        } else {
            if (format.channelCount != format2.channelCount) {
                i |= 4096;
            }
            if (format.sampleRate != format2.sampleRate) {
                i |= 8192;
            }
            if (format.pcmEncoding != format2.pcmEncoding) {
                i |= 16384;
            }
            if (i == 0 && androidx.media3.common.MimeTypes.AUDIO_AAC.equals(this.mimeType)) {
                android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(format);
                android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel2 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(format2);
                if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                    int iIntValue = ((java.lang.Integer) codecProfileAndLevel.first).intValue();
                    int iIntValue2 = ((java.lang.Integer) codecProfileAndLevel2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new androidx.media3.exoplayer.DecoderReuseEvaluation(this.name, format, format2, 3, 0);
                    }
                }
            }
            if (!format.initializationDataEquals(format2)) {
                i |= 32;
            }
            if (needsAdaptationFlushWorkaround(this.mimeType)) {
                i |= 2;
            }
            if (i == 0) {
                return new androidx.media3.exoplayer.DecoderReuseEvaluation(this.name, format, format2, 1, 0);
            }
        }
        return new androidx.media3.exoplayer.DecoderReuseEvaluation(this.name, format, format2, 0, i);
    }

    public boolean isVideoSizeAndRateSupportedV21(int i, int i2, double d) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 29) {
            int iAreResolutionAndFrameRateCovered = androidx.media3.exoplayer.mediacodec.MediaCodecPerformancePointCoverageProvider.areResolutionAndFrameRateCovered(videoCapabilities, i, i2, d);
            if (iAreResolutionAndFrameRateCovered == 2) {
                return true;
            }
            if (iAreResolutionAndFrameRateCovered == 1) {
                logNoSupport("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (!areSizeAndRateSupportedV21(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !needsRotatedVerticalResolutionWorkaround(this.name) || !areSizeAndRateSupportedV21(videoCapabilities, i2, i, d)) {
                logNoSupport("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            logAssumedSupport("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d);
        }
        return true;
    }

    public android.graphics.Point alignVideoSizeV21(int i, int i2) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return alignVideoSizeV21(videoCapabilities, i, i2);
    }

    public boolean isAudioSampleRateSupportedV21(int i) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        logNoSupport("sampleRate.support, " + i);
        return false;
    }

    public boolean isAudioChannelCountSupportedV21(int i) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        logNoSupport("channelCount.support, " + i);
        return false;
    }

    private void logNoSupport(java.lang.String str) {
        androidx.media3.common.util.Log.d(TAG, "NoSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + com.ironsource.y8.i.e);
    }

    private void logAssumedSupport(java.lang.String str) {
        androidx.media3.common.util.Log.d(TAG, "AssumedSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + com.ironsource.y8.i.e);
    }

    private static int adjustMaxInputChannelCount(java.lang.String str, java.lang.String str2, int i) {
        int i2;
        if (i > 1 || ((androidx.media3.common.util.Util.SDK_INT >= 26 && i > 0) || androidx.media3.common.MimeTypes.AUDIO_MPEG.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_AMR_NB.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_AMR_WB.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_VORBIS.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_OPUS.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_RAW.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_FLAC.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_ALAW.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_MLAW.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i;
        }
        if (androidx.media3.common.MimeTypes.AUDIO_AC3.equals(str2)) {
            i2 = 6;
        } else {
            i2 = androidx.media3.common.MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        androidx.media3.common.util.Log.w(TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + com.ironsource.y8.i.e);
        return i2;
    }

    private static boolean isAdaptive(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean isTunneling(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return androidx.media3.common.util.Util.SDK_INT >= 21 && isTunnelingV21(codecCapabilities);
    }

    private static boolean isTunnelingV21(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean isSecure(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return androidx.media3.common.util.Util.SDK_INT >= 21 && isSecureV21(codecCapabilities);
    }

    private static boolean isSecureV21(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean areSizeAndRateSupportedV21(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        android.graphics.Point pointAlignVideoSizeV21 = alignVideoSizeV21(videoCapabilities, i, i2);
        int i3 = pointAlignVideoSizeV21.x;
        int i4 = pointAlignVideoSizeV21.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, java.lang.Math.floor(d));
    }

    private static android.graphics.Point alignVideoSizeV21(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new android.graphics.Point(androidx.media3.common.util.Util.ceilDivide(i, widthAlignment) * widthAlignment, androidx.media3.common.util.Util.ceilDivide(i2, heightAlignment) * heightAlignment);
    }

    private static int getMaxSupportedInstancesV23(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private static android.media.MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((java.lang.Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i = 1024;
        } else if (iIntValue >= 120000000) {
            i = 512;
        } else if (iIntValue >= 60000000) {
            i = 256;
        } else if (iIntValue >= 30000000) {
            i = 128;
        } else if (iIntValue >= 18000000) {
            i = 64;
        } else if (iIntValue >= 12000000) {
            i = 32;
        } else if (iIntValue >= 7200000) {
            i = 16;
        } else if (iIntValue >= 3600000) {
            i = 8;
        } else if (iIntValue >= 1800000) {
            i = 4;
        } else {
            i = iIntValue >= 800000 ? 2 : 1;
        }
        android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new android.media.MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean needsDisableAdaptationWorkaround(java.lang.String str) {
        return androidx.media3.common.util.Util.SDK_INT <= 22 && ("ODROID-XU3".equals(androidx.media3.common.util.Util.MODEL) || "Nexus 10".equals(androidx.media3.common.util.Util.MODEL)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str));
    }

    private static boolean needsAdaptationReconfigureWorkaround(java.lang.String str) {
        return androidx.media3.common.util.Util.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean needsAdaptationFlushWorkaround(java.lang.String str) {
        return androidx.media3.common.MimeTypes.AUDIO_OPUS.equals(str);
    }

    private static boolean needsRotatedVerticalResolutionWorkaround(java.lang.String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(androidx.media3.common.util.Util.DEVICE)) ? false : true;
    }

    private static boolean needsProfileExcludedWorkaround(java.lang.String str, int i) {
        return "video/hevc".equals(str) && 2 == i && ("sailfish".equals(androidx.media3.common.util.Util.DEVICE) || "marlin".equals(androidx.media3.common.util.Util.DEVICE));
    }
}
