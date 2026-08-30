package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class EncoderUtil {
    public static final int LEVEL_UNSET = -1;
    private static final com.google.common.collect.ArrayListMultimap<java.lang.String, android.media.MediaCodecInfo> mimeTypeToEncoders = com.google.common.collect.ArrayListMultimap.create();

    public static synchronized com.google.common.collect.ImmutableList<android.media.MediaCodecInfo> getSupportedEncoders(java.lang.String str) {
        maybePopulateEncoderInfo();
        return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) mimeTypeToEncoders.get((java.lang.Object) com.google.common.base.Ascii.toLowerCase(str)));
    }

    public static synchronized com.google.common.collect.ImmutableSet<java.lang.String> getSupportedMimeTypes() {
        maybePopulateEncoderInfo();
        return com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) mimeTypeToEncoders.keySet());
    }

    public static synchronized void clearCachedEncoders() {
        mimeTypeToEncoders.clear();
    }

    public static com.google.common.collect.ImmutableList<android.media.MediaCodecInfo> getSupportedEncodersForHdrEditing(java.lang.String str, androidx.media3.common.ColorInfo colorInfo) {
        if (androidx.media3.common.util.Util.SDK_INT < 33 || colorInfo == null) {
            return com.google.common.collect.ImmutableList.of();
        }
        com.google.common.collect.ImmutableList<android.media.MediaCodecInfo> supportedEncoders = getSupportedEncoders(str);
        com.google.common.collect.ImmutableList<java.lang.Integer> codecProfilesForHdrFormat = getCodecProfilesForHdrFormat(str, colorInfo.colorTransfer);
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        for (int i = 0; i < supportedEncoders.size(); i++) {
            android.media.MediaCodecInfo mediaCodecInfo = supportedEncoders.get(i);
            if (!mediaCodecInfo.isAlias() && isFeatureSupported(mediaCodecInfo, str, "hdr-editing")) {
                for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                    if (codecProfilesForHdrFormat.contains(java.lang.Integer.valueOf(codecProfileLevel.profile))) {
                        builder.add(mediaCodecInfo);
                    }
                }
            }
        }
        return builder.build();
    }

    public static com.google.common.collect.ImmutableList<java.lang.Integer> getCodecProfilesForHdrFormat(java.lang.String str, int i) {
        str.hashCode();
        switch (str) {
            case "video/av01":
                if (i == 7) {
                    return com.google.common.collect.ImmutableList.of(2);
                }
                if (i == 6) {
                    return com.google.common.collect.ImmutableList.of(4096);
                }
                break;
            case "video/hevc":
                if (i == 7) {
                    return com.google.common.collect.ImmutableList.of(2);
                }
                if (i == 6) {
                    return com.google.common.collect.ImmutableList.of(4096);
                }
                break;
            case "video/avc":
                if (i == 7) {
                    return com.google.common.collect.ImmutableList.of(16);
                }
                break;
            case "video/x-vnd.on2.vp9":
                if (i == 7 || i == 6) {
                    return com.google.common.collect.ImmutableList.of(4096, 8192);
                }
                break;
        }
        return com.google.common.collect.ImmutableList.of();
    }

    public static boolean isSizeSupported(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i, int i2) {
        if (mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().isSizeSupported(i, i2)) {
            return true;
        }
        if (i == 1920 && i2 == 1080) {
            return android.media.CamcorderProfile.hasProfile(6);
        }
        if (i == 3840 && i2 == 2160) {
            return android.media.CamcorderProfile.hasProfile(8);
        }
        return false;
    }

    public static android.util.Range<java.lang.Integer> getSupportedHeights(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i) {
        return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getSupportedHeightsFor(i);
    }

    public static android.util.Pair<android.util.Range<java.lang.Integer>, android.util.Range<java.lang.Integer>> getSupportedResolutionRanges(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        return android.util.Pair.create(videoCapabilities.getSupportedWidths(), videoCapabilities.getSupportedHeights());
    }

    public static android.util.Size getSupportedResolution(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i, int i2) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int iAlignResolution = alignResolution(i, widthAlignment);
        int iAlignResolution2 = alignResolution(i2, heightAlignment);
        if (isSizeSupported(mediaCodecInfo, str, iAlignResolution, iAlignResolution2)) {
            return new android.util.Size(iAlignResolution, iAlignResolution2);
        }
        float[] fArr = {0.95f, 0.9f, 0.85f, 0.8f, 0.75f, 0.7f, 0.6666667f, 0.6f, 0.55f, 0.5f, 0.4f, 0.33333334f, 0.25f};
        for (int i3 = 0; i3 < 13; i3++) {
            float f = fArr[i3];
            int iAlignResolution3 = alignResolution(java.lang.Math.round(i * f), widthAlignment);
            int iAlignResolution4 = alignResolution(java.lang.Math.round(i2 * f), heightAlignment);
            if (isSizeSupported(mediaCodecInfo, str, iAlignResolution3, iAlignResolution4)) {
                return new android.util.Size(iAlignResolution3, iAlignResolution4);
            }
        }
        int iIntValue = ((java.lang.Integer) videoCapabilities.getSupportedHeightsFor(((java.lang.Integer) videoCapabilities.getSupportedWidths().clamp(java.lang.Integer.valueOf(i))).intValue()).clamp(java.lang.Integer.valueOf(i2))).intValue();
        if (iIntValue != i2) {
            i = alignResolution((int) java.lang.Math.round((((double) i) * ((double) iIntValue)) / ((double) i2)), widthAlignment);
            i2 = alignResolution(iIntValue, heightAlignment);
        }
        if (isSizeSupported(mediaCodecInfo, str, i, i2)) {
            return new android.util.Size(i, i2);
        }
        return null;
    }

    public static com.google.common.collect.ImmutableSet<java.lang.Integer> findSupportedEncodingProfiles(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodecInfo.getCapabilitiesForType(str).profileLevels;
        com.google.common.collect.ImmutableSet.Builder builder = new com.google.common.collect.ImmutableSet.Builder();
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            builder.add(java.lang.Integer.valueOf(codecProfileLevel.profile));
        }
        return builder.build();
    }

    public static int findHighestSupportedEncodingLevel(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i) {
        int iMax = -1;
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i) {
                iMax = java.lang.Math.max(iMax, codecProfileLevel.level);
            }
        }
        return iMax;
    }

    public static java.lang.String findCodecForFormat(android.media.MediaFormat mediaFormat, boolean z) {
        float integer;
        java.lang.String strFindEncoderForFormat;
        android.media.MediaCodecList mediaCodecList = new android.media.MediaCodecList(0);
        if (androidx.media3.common.util.Util.SDK_INT == 21 && mediaFormat.containsKey("frame-rate")) {
            try {
                integer = mediaFormat.getFloat("frame-rate");
            } catch (java.lang.ClassCastException unused) {
                integer = mediaFormat.getInteger("frame-rate");
            }
            mediaFormat.setString("frame-rate", null);
        } else {
            integer = -1.0f;
        }
        if (z) {
            strFindEncoderForFormat = mediaCodecList.findDecoderForFormat(mediaFormat);
        } else {
            strFindEncoderForFormat = mediaCodecList.findEncoderForFormat(mediaFormat);
        }
        if (androidx.media3.common.util.Util.SDK_INT == 21) {
            androidx.media3.common.util.MediaFormatUtil.maybeSetInteger(mediaFormat, "frame-rate", java.lang.Math.round(integer));
        }
        return strFindEncoderForFormat;
    }

    public static android.util.Range<java.lang.Integer> getSupportedBitrateRange(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getBitrateRange();
    }

    public static boolean isBitrateModeSupported(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i) {
        return mediaCodecInfo.getCapabilitiesForType(str).getEncoderCapabilities().isBitrateModeSupported(i);
    }

    public static com.google.common.collect.ImmutableList<java.lang.Integer> getSupportedColorFormats(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) com.google.common.primitives.Ints.asList(mediaCodecInfo.getCapabilitiesForType(str).colorFormats));
    }

    public static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (androidx.media3.common.util.Util.SDK_INT >= 29) {
            return androidx.media3.transformer.EncoderUtil.Api29.isHardwareAccelerated(mediaCodecInfo);
        }
        return !isSoftwareOnly(mediaCodecInfo, str);
    }

    public static boolean isFeatureSupported(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, java.lang.String str2) {
        return mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported(str2);
    }

    public static int getMaxSupportedInstances(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        return mediaCodecInfo.getCapabilitiesForType(str).getMaxSupportedInstances();
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (androidx.media3.common.util.Util.SDK_INT >= 29) {
            return androidx.media3.transformer.EncoderUtil.Api29.isSoftwareOnly(mediaCodecInfo);
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

    private static int alignResolution(int i, int i2) {
        if (i % 10 == 1) {
            return (int) (((double) i2) * java.lang.Math.floor(i / i2));
        }
        return java.lang.Math.round(i / i2) * i2;
    }

    private static synchronized void maybePopulateEncoderInfo() {
        if (mimeTypeToEncoders.isEmpty()) {
            for (android.media.MediaCodecInfo mediaCodecInfo : new android.media.MediaCodecList(0).getCodecInfos()) {
                if (mediaCodecInfo.isEncoder()) {
                    for (java.lang.String str : mediaCodecInfo.getSupportedTypes()) {
                        mimeTypeToEncoders.put(com.google.common.base.Ascii.toLowerCase(str), mediaCodecInfo);
                    }
                }
            }
        }
    }

    private static final class Api29 {
        private Api29() {
        }

        public static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo) {
            return mediaCodecInfo.isHardwareAccelerated();
        }

        public static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo) {
            return mediaCodecInfo.isSoftwareOnly();
        }
    }

    private EncoderUtil() {
    }
}
