package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class MediaFormatUtil {
    public static final java.lang.String KEY_MAX_BIT_RATE = "max-bitrate";
    public static final java.lang.String KEY_PCM_ENCODING_EXTENDED = "exo-pcm-encoding-int";
    public static final java.lang.String KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT = "exo-pixel-width-height-ratio-float";
    private static final int MAX_POWER_OF_TWO_INT = 1073741824;

    private static boolean isValidColorRange(int i) {
        return i == 2 || i == 1 || i == -1;
    }

    private static boolean isValidColorSpace(int i) {
        return i == 2 || i == 1 || i == 6 || i == -1;
    }

    private static boolean isValidColorTransfer(int i) {
        return i == 1 || i == 3 || i == 6 || i == 7 || i == -1;
    }

    public static androidx.media3.common.Format createFormatFromMediaFormat(android.media.MediaFormat mediaFormat) {
        int i = 0;
        androidx.media3.common.Format.Builder pcmEncoding = new androidx.media3.common.Format.Builder().setSampleMimeType(mediaFormat.getString("mime")).setLanguage(mediaFormat.getString("language")).setPeakBitrate(getInteger(mediaFormat, KEY_MAX_BIT_RATE, -1)).setAverageBitrate(getInteger(mediaFormat, "bitrate", -1)).setCodecs(mediaFormat.getString("codecs-string")).setFrameRate(getFrameRate(mediaFormat, -1.0f)).setWidth(getInteger(mediaFormat, "width", -1)).setHeight(getInteger(mediaFormat, "height", -1)).setPixelWidthHeightRatio(getPixelWidthHeightRatio(mediaFormat, 1.0f)).setMaxInputSize(getInteger(mediaFormat, "max-input-size", -1)).setRotationDegrees(getInteger(mediaFormat, "rotation-degrees", 0)).setColorInfo(getColorInfo(mediaFormat, true)).setSampleRate(getInteger(mediaFormat, "sample-rate", -1)).setChannelCount(getInteger(mediaFormat, "channel-count", -1)).setPcmEncoding(getInteger(mediaFormat, "pcm-encoding", -1));
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        while (true) {
            java.nio.ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-" + i);
            if (byteBuffer != null) {
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                builder.add(bArr);
                i++;
            } else {
                pcmEncoding.setInitializationData(builder.build());
                return pcmEncoding.build();
            }
        }
    }

    public static android.media.MediaFormat createMediaFormatFromFormat(androidx.media3.common.Format format) {
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        maybeSetInteger(mediaFormat, "bitrate", format.bitrate);
        maybeSetInteger(mediaFormat, KEY_MAX_BIT_RATE, format.peakBitrate);
        maybeSetInteger(mediaFormat, "channel-count", format.channelCount);
        maybeSetColorInfo(mediaFormat, format.colorInfo);
        maybeSetString(mediaFormat, "mime", format.sampleMimeType);
        maybeSetString(mediaFormat, "codecs-string", format.codecs);
        maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        maybeSetInteger(mediaFormat, "width", format.width);
        maybeSetInteger(mediaFormat, "height", format.height);
        setCsdBuffers(mediaFormat, format.initializationData);
        maybeSetPcmEncoding(mediaFormat, format.pcmEncoding);
        maybeSetString(mediaFormat, "language", format.language);
        maybeSetInteger(mediaFormat, "max-input-size", format.maxInputSize);
        maybeSetInteger(mediaFormat, "sample-rate", format.sampleRate);
        maybeSetInteger(mediaFormat, "caption-service-number", format.accessibilityChannel);
        mediaFormat.setInteger("rotation-degrees", format.rotationDegrees);
        int i = format.selectionFlags;
        setBooleanAsInt(mediaFormat, "is-autoselect", i & 4);
        setBooleanAsInt(mediaFormat, "is-default", i & 1);
        setBooleanAsInt(mediaFormat, "is-forced-subtitle", i & 2);
        mediaFormat.setInteger("encoder-delay", format.encoderDelay);
        mediaFormat.setInteger("encoder-padding", format.encoderPadding);
        maybeSetPixelAspectRatio(mediaFormat, format.pixelWidthHeightRatio);
        return mediaFormat;
    }

    public static void maybeSetString(android.media.MediaFormat mediaFormat, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    public static void setCsdBuffers(android.media.MediaFormat mediaFormat, java.util.List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, java.nio.ByteBuffer.wrap(list.get(i)));
        }
    }

    public static void maybeSetInteger(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void maybeSetFloat(android.media.MediaFormat mediaFormat, java.lang.String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void maybeSetByteBuffer(android.media.MediaFormat mediaFormat, java.lang.String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, java.nio.ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(android.media.MediaFormat mediaFormat, androidx.media3.common.ColorInfo colorInfo) {
        if (colorInfo != null) {
            maybeSetInteger(mediaFormat, "color-transfer", colorInfo.colorTransfer);
            maybeSetInteger(mediaFormat, "color-standard", colorInfo.colorSpace);
            maybeSetInteger(mediaFormat, "color-range", colorInfo.colorRange);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", colorInfo.hdrStaticInfo);
        }
    }

    public static androidx.media3.common.ColorInfo getColorInfo(android.media.MediaFormat mediaFormat) {
        return getColorInfo(mediaFormat, false);
    }

    private static androidx.media3.common.ColorInfo getColorInfo(android.media.MediaFormat mediaFormat, boolean z) {
        if (androidx.media3.common.util.Util.SDK_INT < 24) {
            return null;
        }
        int integer = getInteger(mediaFormat, "color-standard", -1);
        int integer2 = getInteger(mediaFormat, "color-range", -1);
        int integer3 = getInteger(mediaFormat, "color-transfer", -1);
        java.nio.ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] array = byteBuffer != null ? getArray(byteBuffer) : null;
        if (!z) {
            if (!isValidColorSpace(integer)) {
                integer = -1;
            }
            if (!isValidColorRange(integer2)) {
                integer2 = -1;
            }
            if (!isValidColorTransfer(integer3)) {
                integer3 = -1;
            }
        }
        if (integer == -1 && integer2 == -1 && integer3 == -1 && array == null) {
            return null;
        }
        return new androidx.media3.common.ColorInfo.Builder().setColorSpace(integer).setColorRange(integer2).setColorTransfer(integer3).setHdrStaticInfo(array).build();
    }

    public static int getInteger(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i;
    }

    public static float getFloat(android.media.MediaFormat mediaFormat, java.lang.String str, float f) {
        return mediaFormat.containsKey(str) ? mediaFormat.getFloat(str) : f;
    }

    private static float getFrameRate(android.media.MediaFormat mediaFormat, float f) {
        if (!mediaFormat.containsKey("frame-rate")) {
            return f;
        }
        try {
            return mediaFormat.getFloat("frame-rate");
        } catch (java.lang.ClassCastException unused) {
            return mediaFormat.getInteger("frame-rate");
        }
    }

    private static float getPixelWidthHeightRatio(android.media.MediaFormat mediaFormat, float f) {
        return (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : f;
    }

    public static byte[] getArray(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static boolean isVideoFormat(android.media.MediaFormat mediaFormat) {
        return androidx.media3.common.MimeTypes.isVideo(mediaFormat.getString("mime"));
    }

    public static boolean isAudioFormat(android.media.MediaFormat mediaFormat) {
        return androidx.media3.common.MimeTypes.isAudio(mediaFormat.getString("mime"));
    }

    public static java.lang.Integer getTimeLapseFrameRate(android.media.MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("time-lapse-enable") && mediaFormat.getInteger("time-lapse-enable") > 0 && mediaFormat.containsKey("time-lapse-fps")) {
            return java.lang.Integer.valueOf(mediaFormat.getInteger("time-lapse-fps"));
        }
        return null;
    }

    private static void setBooleanAsInt(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        mediaFormat.setInteger(str, i != 0 ? 1 : 0);
    }

    private static void maybeSetPixelAspectRatio(android.media.MediaFormat mediaFormat, float f) {
        int i;
        mediaFormat.setFloat(KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT, f);
        int i2 = 1073741824;
        if (f < 1.0f) {
            i2 = (int) (f * 1073741824);
            i = 1073741824;
        } else if (f > 1.0f) {
            i = (int) (1073741824 / f);
        } else {
            i2 = 1;
            i = 1;
        }
        mediaFormat.setInteger("sar-width", i2);
        mediaFormat.setInteger("sar-height", i);
    }

    private static void maybeSetPcmEncoding(android.media.MediaFormat mediaFormat, int i) {
        int i2;
        if (i == -1) {
            return;
        }
        maybeSetInteger(mediaFormat, KEY_PCM_ENCODING_EXTENDED, i);
        if (i != 0) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 21;
                        if (i != 21) {
                            i2 = 22;
                            if (i != 22) {
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            i2 = 0;
        }
        mediaFormat.setInteger("pcm-encoding", i2);
    }

    private MediaFormatUtil() {
    }
}
