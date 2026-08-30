package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultEncoderFactory implements androidx.media3.transformer.Codec.EncoderFactory {
    private static final int DEFAULT_AUDIO_BITRATE = 131072;
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final int PRIORITY_BEST_EFFORT = 1;
    private final int codecPriority;
    private final android.content.Context context;
    private final boolean enableFallback;
    private final androidx.media3.transformer.VideoEncoderSettings requestedVideoEncoderSettings;
    private final androidx.media3.transformer.EncoderSelector videoEncoderSelector;

    /* JADX INFO: Access modifiers changed from: private */
    interface EncoderFallbackCost {
        int getParameterSupportGap(android.media.MediaCodecInfo mediaCodecInfo);
    }

    private static int getSuggestedBitrate(int i, int i2, float f) {
        return (int) (((double) (i * i2 * f)) * 0.07d * 2.0d);
    }

    public static final class Builder {
        private final android.content.Context context;
        private androidx.media3.transformer.EncoderSelector videoEncoderSelector = androidx.media3.transformer.EncoderSelector.DEFAULT;
        private androidx.media3.transformer.VideoEncoderSettings requestedVideoEncoderSettings = androidx.media3.transformer.VideoEncoderSettings.DEFAULT;
        private boolean enableFallback = true;
        private int codecPriority = androidx.media3.common.C.PRIORITY_PROCESSING_FOREGROUND;

        public Builder(android.content.Context context) {
            this.context = context.getApplicationContext();
        }

        public androidx.media3.transformer.DefaultEncoderFactory.Builder setVideoEncoderSelector(androidx.media3.transformer.EncoderSelector encoderSelector) {
            this.videoEncoderSelector = encoderSelector;
            return this;
        }

        public androidx.media3.transformer.DefaultEncoderFactory.Builder setRequestedVideoEncoderSettings(androidx.media3.transformer.VideoEncoderSettings videoEncoderSettings) {
            this.requestedVideoEncoderSettings = videoEncoderSettings;
            return this;
        }

        public androidx.media3.transformer.DefaultEncoderFactory.Builder setEnableFallback(boolean z) {
            this.enableFallback = z;
            return this;
        }

        public androidx.media3.transformer.DefaultEncoderFactory.Builder setCodecPriority(int i) {
            this.codecPriority = i;
            return this;
        }

        public androidx.media3.transformer.DefaultEncoderFactory build() {
            return new androidx.media3.transformer.DefaultEncoderFactory(this);
        }
    }

    @java.lang.Deprecated
    public DefaultEncoderFactory(android.content.Context context) {
        this(new androidx.media3.transformer.DefaultEncoderFactory.Builder(context));
    }

    @java.lang.Deprecated
    public DefaultEncoderFactory(android.content.Context context, androidx.media3.transformer.EncoderSelector encoderSelector, boolean z) {
        this(new androidx.media3.transformer.DefaultEncoderFactory.Builder(context).setVideoEncoderSelector(encoderSelector).setEnableFallback(z));
    }

    @java.lang.Deprecated
    public DefaultEncoderFactory(android.content.Context context, androidx.media3.transformer.EncoderSelector encoderSelector, androidx.media3.transformer.VideoEncoderSettings videoEncoderSettings, boolean z) {
        this(new androidx.media3.transformer.DefaultEncoderFactory.Builder(context).setVideoEncoderSelector(encoderSelector).setEnableFallback(z).setRequestedVideoEncoderSettings(videoEncoderSettings));
    }

    private DefaultEncoderFactory(androidx.media3.transformer.DefaultEncoderFactory.Builder builder) {
        this.context = builder.context;
        this.videoEncoderSelector = builder.videoEncoderSelector;
        this.requestedVideoEncoderSettings = builder.requestedVideoEncoderSettings;
        this.enableFallback = builder.enableFallback;
        this.codecPriority = builder.codecPriority;
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public androidx.media3.transformer.DefaultCodec createForAudioEncoding(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException {
        if (format.bitrate == -1) {
            format = format.buildUpon().setAverageBitrate(131072).build();
        }
        androidx.media3.common.Format format2 = format;
        androidx.media3.common.util.Assertions.checkNotNull(format2.sampleMimeType);
        android.media.MediaFormat mediaFormatCreateMediaFormatFromFormat = androidx.media3.common.util.MediaFormatUtil.createMediaFormatFromFormat(format2);
        com.google.common.collect.ImmutableList<android.media.MediaCodecInfo> supportedEncoders = androidx.media3.transformer.EncoderUtil.getSupportedEncoders(format2.sampleMimeType);
        if (supportedEncoders.isEmpty()) {
            throw createExportException(format2, "No audio media codec found");
        }
        return new androidx.media3.transformer.DefaultCodec(this.context, format2, mediaFormatCreateMediaFormatFromFormat, supportedEncoders.get(0).getName(), false, null);
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public androidx.media3.transformer.DefaultCodec createForVideoEncoding(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException {
        int suggestedBitrate;
        if (format.frameRate == -1.0f || deviceNeedsDefaultFrameRateWorkaround()) {
            format = format.buildUpon().setFrameRate(30.0f).build();
        }
        androidx.media3.common.util.Assertions.checkArgument(format.width != -1);
        androidx.media3.common.util.Assertions.checkArgument(format.height != -1);
        androidx.media3.common.util.Assertions.checkArgument(format.height <= format.width);
        androidx.media3.common.util.Assertions.checkArgument(format.rotationDegrees == 0);
        androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType);
        androidx.media3.common.util.Assertions.checkStateNotNull(this.videoEncoderSelector);
        androidx.media3.transformer.DefaultEncoderFactory.VideoEncoderQueryResult videoEncoderQueryResultFindEncoderWithClosestSupportedFormat = findEncoderWithClosestSupportedFormat(format, this.requestedVideoEncoderSettings, this.videoEncoderSelector, this.enableFallback);
        if (videoEncoderQueryResultFindEncoderWithClosestSupportedFormat == null) {
            throw createExportException(format, "The requested video encoding format is not supported.");
        }
        android.media.MediaCodecInfo mediaCodecInfo = videoEncoderQueryResultFindEncoderWithClosestSupportedFormat.encoder;
        androidx.media3.common.Format format2 = videoEncoderQueryResultFindEncoderWithClosestSupportedFormat.supportedFormat;
        androidx.media3.transformer.VideoEncoderSettings videoEncoderSettings = videoEncoderQueryResultFindEncoderWithClosestSupportedFormat.supportedEncoderSettings;
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format2.sampleMimeType);
        if (this.enableFallback || videoEncoderSettings.bitrate != -1) {
            suggestedBitrate = videoEncoderSettings.bitrate;
        } else if (videoEncoderSettings.enableHighQualityTargeting) {
            suggestedBitrate = new androidx.media3.transformer.DeviceMappedEncoderBitrateProvider().getBitrate(mediaCodecInfo.getName(), format2.width, format2.height, format2.frameRate);
        } else if (format2.averageBitrate != -1) {
            suggestedBitrate = format2.averageBitrate;
        } else {
            suggestedBitrate = getSuggestedBitrate(format2.width, format2.height, format2.frameRate);
        }
        androidx.media3.common.Format formatBuild = format2.buildUpon().setAverageBitrate(suggestedBitrate).build();
        android.media.MediaFormat mediaFormatCreateMediaFormatFromFormat = androidx.media3.common.util.MediaFormatUtil.createMediaFormatFromFormat(formatBuild);
        mediaFormatCreateMediaFormatFromFormat.setInteger("bitrate-mode", videoEncoderSettings.bitrateMode);
        mediaFormatCreateMediaFormatFromFormat.setInteger("frame-rate", java.lang.Math.round(formatBuild.frameRate));
        if (videoEncoderSettings.profile != -1 && videoEncoderSettings.level != -1 && androidx.media3.common.util.Util.SDK_INT >= 23) {
            mediaFormatCreateMediaFormatFromFormat.setInteger(com.google.android.gms.common.Scopes.PROFILE, videoEncoderSettings.profile);
            mediaFormatCreateMediaFormatFromFormat.setInteger("level", videoEncoderSettings.level);
        }
        if (str.equals("video/avc")) {
            adjustMediaFormatForH264EncoderSettings(format.colorInfo, mediaCodecInfo, mediaFormatCreateMediaFormatFromFormat);
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 31 && androidx.media3.common.ColorInfo.isTransferHdr(format.colorInfo)) {
            if (androidx.media3.transformer.EncoderUtil.getSupportedColorFormats(mediaCodecInfo, str).contains(2130750114)) {
                mediaFormatCreateMediaFormatFromFormat.setInteger("color-format", 2130750114);
            } else {
                throw createExportException(format, "Encoding HDR is not supported on this device.");
            }
        } else {
            mediaFormatCreateMediaFormatFromFormat.setInteger("color-format", 2130708361);
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 25) {
            mediaFormatCreateMediaFormatFromFormat.setFloat("i-frame-interval", videoEncoderSettings.iFrameIntervalSeconds);
        } else {
            float f = videoEncoderSettings.iFrameIntervalSeconds;
            mediaFormatCreateMediaFormatFromFormat.setInteger("i-frame-interval", (f <= 0.0f || f > 1.0f) ? (int) java.lang.Math.floor(f) : 1);
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 23) {
            if (videoEncoderSettings.operatingRate == -1 && videoEncoderSettings.priority == -1) {
                adjustMediaFormatForEncoderPerformanceSettings(mediaFormatCreateMediaFormatFromFormat);
            } else {
                if (videoEncoderSettings.operatingRate != -1) {
                    mediaFormatCreateMediaFormatFromFormat.setInteger("operating-rate", videoEncoderSettings.operatingRate);
                }
                if (videoEncoderSettings.priority != -1) {
                    mediaFormatCreateMediaFormatFromFormat.setInteger(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, videoEncoderSettings.priority);
                }
            }
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 35) {
            mediaFormatCreateMediaFormatFromFormat.setInteger("importance", java.lang.Math.max(0, -this.codecPriority));
        }
        return new androidx.media3.transformer.DefaultCodec(this.context, formatBuild, mediaFormatCreateMediaFormatFromFormat, mediaCodecInfo.getName(), false, null);
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public boolean videoNeedsEncoding() {
        return !this.requestedVideoEncoderSettings.equals(androidx.media3.transformer.VideoEncoderSettings.DEFAULT);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.sampleMimeType"})
    private static androidx.media3.transformer.DefaultEncoderFactory.VideoEncoderQueryResult findEncoderWithClosestSupportedFormat(androidx.media3.common.Format format, androidx.media3.transformer.VideoEncoderSettings videoEncoderSettings, androidx.media3.transformer.EncoderSelector encoderSelector, boolean z) {
        int bitrate;
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType);
        com.google.common.collect.ImmutableList<android.media.MediaCodecInfo> immutableListSelectEncoderInfos = encoderSelector.selectEncoderInfos(str);
        if (immutableListSelectEncoderInfos.isEmpty()) {
            return null;
        }
        if (!z) {
            return new androidx.media3.transformer.DefaultEncoderFactory.VideoEncoderQueryResult(immutableListSelectEncoderInfos.get(0), format, videoEncoderSettings);
        }
        com.google.common.collect.ImmutableList<android.media.MediaCodecInfo> immutableListFilterEncodersByResolution = filterEncodersByResolution(immutableListSelectEncoderInfos, str, format.width, format.height);
        if (immutableListFilterEncodersByResolution.isEmpty()) {
            return null;
        }
        android.util.Size size = (android.util.Size) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.transformer.EncoderUtil.getSupportedResolution(immutableListFilterEncodersByResolution.get(0), str, format.width, format.height));
        if (videoEncoderSettings.enableHighQualityTargeting) {
            bitrate = -1;
        } else {
            if (videoEncoderSettings.bitrate != -1) {
                bitrate = videoEncoderSettings.bitrate;
            } else if (format.averageBitrate != -1) {
                bitrate = format.averageBitrate;
            } else {
                bitrate = getSuggestedBitrate(size.getWidth(), size.getHeight(), format.frameRate);
            }
            immutableListFilterEncodersByResolution = filterEncodersByBitrate(immutableListFilterEncodersByResolution, str, bitrate);
            if (immutableListFilterEncodersByResolution.isEmpty()) {
                return null;
            }
        }
        com.google.common.collect.ImmutableList<android.media.MediaCodecInfo> immutableListFilterEncodersByBitrateMode = filterEncodersByBitrateMode(immutableListFilterEncodersByResolution, str, videoEncoderSettings.bitrateMode);
        if (immutableListFilterEncodersByBitrateMode.isEmpty()) {
            return null;
        }
        androidx.media3.transformer.VideoEncoderSettings.Builder builderBuildUpon = videoEncoderSettings.buildUpon();
        androidx.media3.common.Format.Builder height = format.buildUpon().setSampleMimeType(str).setWidth(size.getWidth()).setHeight(size.getHeight());
        android.media.MediaCodecInfo mediaCodecInfo = immutableListFilterEncodersByBitrateMode.get(0);
        if (videoEncoderSettings.enableHighQualityTargeting) {
            bitrate = new androidx.media3.transformer.DeviceMappedEncoderBitrateProvider().getBitrate(mediaCodecInfo.getName(), size.getWidth(), size.getHeight(), format.frameRate);
            builderBuildUpon.experimentalSetEnableHighQualityTargeting(false);
        }
        int iIntValue = ((java.lang.Integer) androidx.media3.transformer.EncoderUtil.getSupportedBitrateRange(mediaCodecInfo, str).clamp(java.lang.Integer.valueOf(bitrate))).intValue();
        builderBuildUpon.setBitrate(iIntValue);
        height.setAverageBitrate(iIntValue);
        if (videoEncoderSettings.profile == -1 || videoEncoderSettings.level == -1 || videoEncoderSettings.level > androidx.media3.transformer.EncoderUtil.findHighestSupportedEncodingLevel(mediaCodecInfo, str, videoEncoderSettings.profile)) {
            builderBuildUpon.setEncodingProfileLevel(-1, -1);
        }
        return new androidx.media3.transformer.DefaultEncoderFactory.VideoEncoderQueryResult(mediaCodecInfo, height.build(), builderBuildUpon.build());
    }

    private static com.google.common.collect.ImmutableList<android.media.MediaCodecInfo> filterEncodersByResolution(java.util.List<android.media.MediaCodecInfo> list, final java.lang.String str, final int i, final int i2) {
        return filterEncoders(list, new androidx.media3.transformer.DefaultEncoderFactory.EncoderFallbackCost() { // from class: androidx.media3.transformer.DefaultEncoderFactory$$ExternalSyntheticLambda0
            @Override // androidx.media3.transformer.DefaultEncoderFactory.EncoderFallbackCost
            public final int getParameterSupportGap(android.media.MediaCodecInfo mediaCodecInfo) {
                return androidx.media3.transformer.DefaultEncoderFactory.lambda$filterEncodersByResolution$0(str, i, i2, mediaCodecInfo);
            }
        });
    }

    static /* synthetic */ int lambda$filterEncodersByResolution$0(java.lang.String str, int i, int i2, android.media.MediaCodecInfo mediaCodecInfo) {
        android.util.Size supportedResolution = androidx.media3.transformer.EncoderUtil.getSupportedResolution(mediaCodecInfo, str, i, i2);
        if (supportedResolution == null) {
            return Integer.MAX_VALUE;
        }
        return java.lang.Math.abs((i * i2) - (supportedResolution.getWidth() * supportedResolution.getHeight()));
    }

    private static com.google.common.collect.ImmutableList<android.media.MediaCodecInfo> filterEncodersByBitrate(java.util.List<android.media.MediaCodecInfo> list, final java.lang.String str, final int i) {
        return filterEncoders(list, new androidx.media3.transformer.DefaultEncoderFactory.EncoderFallbackCost() { // from class: androidx.media3.transformer.DefaultEncoderFactory$$ExternalSyntheticLambda1
            @Override // androidx.media3.transformer.DefaultEncoderFactory.EncoderFallbackCost
            public final int getParameterSupportGap(android.media.MediaCodecInfo mediaCodecInfo) {
                java.lang.String str2 = str;
                int i2 = i;
                return java.lang.Math.abs(((java.lang.Integer) androidx.media3.transformer.EncoderUtil.getSupportedBitrateRange(mediaCodecInfo, str2).clamp(java.lang.Integer.valueOf(i2))).intValue() - i2);
            }
        });
    }

    private static com.google.common.collect.ImmutableList<android.media.MediaCodecInfo> filterEncodersByBitrateMode(java.util.List<android.media.MediaCodecInfo> list, final java.lang.String str, final int i) {
        return filterEncoders(list, new androidx.media3.transformer.DefaultEncoderFactory.EncoderFallbackCost() { // from class: androidx.media3.transformer.DefaultEncoderFactory$$ExternalSyntheticLambda2
            @Override // androidx.media3.transformer.DefaultEncoderFactory.EncoderFallbackCost
            public final int getParameterSupportGap(android.media.MediaCodecInfo mediaCodecInfo) {
                return androidx.media3.transformer.DefaultEncoderFactory.lambda$filterEncodersByBitrateMode$2(str, i, mediaCodecInfo);
            }
        });
    }

    static /* synthetic */ int lambda$filterEncodersByBitrateMode$2(java.lang.String str, int i, android.media.MediaCodecInfo mediaCodecInfo) {
        return androidx.media3.transformer.EncoderUtil.isBitrateModeSupported(mediaCodecInfo, str, i) ? 0 : Integer.MAX_VALUE;
    }

    private static final class VideoEncoderQueryResult {
        public final android.media.MediaCodecInfo encoder;
        public final androidx.media3.transformer.VideoEncoderSettings supportedEncoderSettings;
        public final androidx.media3.common.Format supportedFormat;

        public VideoEncoderQueryResult(android.media.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format, androidx.media3.transformer.VideoEncoderSettings videoEncoderSettings) {
            this.encoder = mediaCodecInfo;
            this.supportedFormat = format;
            this.supportedEncoderSettings = videoEncoderSettings;
        }
    }

    private static void adjustMediaFormatForEncoderPerformanceSettings(android.media.MediaFormat mediaFormat) {
        if (androidx.media3.common.util.Util.SDK_INT < 25) {
            return;
        }
        mediaFormat.setInteger(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 1);
        if (androidx.media3.common.util.Util.SDK_INT == 26) {
            mediaFormat.setInteger("operating-rate", 30);
        } else if (deviceNeedsLowerOperatingRateAvoidingOverflowWorkaround()) {
            mediaFormat.setInteger("operating-rate", 1000);
        } else {
            mediaFormat.setInteger("operating-rate", Integer.MAX_VALUE);
        }
    }

    private static boolean deviceNeedsLowerOperatingRateAvoidingOverflowWorkaround() {
        return androidx.media3.common.util.Util.SDK_INT >= 31 && androidx.media3.common.util.Util.SDK_INT <= 34 && (android.os.Build.SOC_MODEL.equals("SM8550") || android.os.Build.SOC_MODEL.equals("T612") || android.os.Build.SOC_MODEL.equals("SM7450") || android.os.Build.SOC_MODEL.equals("SM6450"));
    }

    private static void adjustMediaFormatForH264EncoderSettings(androidx.media3.common.ColorInfo colorInfo, android.media.MediaCodecInfo mediaCodecInfo, android.media.MediaFormat mediaFormat) {
        int iIntValue = 8;
        if (androidx.media3.common.util.Util.SDK_INT >= 29) {
            if (colorInfo != null) {
                com.google.common.collect.ImmutableList<java.lang.Integer> codecProfilesForHdrFormat = androidx.media3.transformer.EncoderUtil.getCodecProfilesForHdrFormat("video/avc", colorInfo.colorTransfer);
                if (!codecProfilesForHdrFormat.isEmpty()) {
                    iIntValue = codecProfilesForHdrFormat.get(0).intValue();
                }
            }
            int iFindHighestSupportedEncodingLevel = androidx.media3.transformer.EncoderUtil.findHighestSupportedEncodingLevel(mediaCodecInfo, "video/avc", iIntValue);
            if (iFindHighestSupportedEncodingLevel != -1) {
                mediaFormat.setInteger(com.google.android.gms.common.Scopes.PROFILE, iIntValue);
                mediaFormat.setInteger("level", iFindHighestSupportedEncodingLevel);
                return;
            }
            return;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 26 && !deviceNeedsNoH264HighProfileWorkaround()) {
            int iFindHighestSupportedEncodingLevel2 = androidx.media3.transformer.EncoderUtil.findHighestSupportedEncodingLevel(mediaCodecInfo, "video/avc", 8);
            if (iFindHighestSupportedEncodingLevel2 != -1) {
                mediaFormat.setInteger(com.google.android.gms.common.Scopes.PROFILE, 8);
                mediaFormat.setInteger("level", iFindHighestSupportedEncodingLevel2);
                mediaFormat.setInteger("latency", 1);
                return;
            }
            return;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 24) {
            int iFindHighestSupportedEncodingLevel3 = androidx.media3.transformer.EncoderUtil.findHighestSupportedEncodingLevel(mediaCodecInfo, "video/avc", 1);
            androidx.media3.common.util.Assertions.checkState(iFindHighestSupportedEncodingLevel3 != -1);
            mediaFormat.setInteger(com.google.android.gms.common.Scopes.PROFILE, 1);
            mediaFormat.setInteger("level", iFindHighestSupportedEncodingLevel3);
        }
    }

    private static com.google.common.collect.ImmutableList<android.media.MediaCodecInfo> filterEncoders(java.util.List<android.media.MediaCodecInfo> list, androidx.media3.transformer.DefaultEncoderFactory.EncoderFallbackCost encoderFallbackCost) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); i2++) {
            android.media.MediaCodecInfo mediaCodecInfo = list.get(i2);
            int parameterSupportGap = encoderFallbackCost.getParameterSupportGap(mediaCodecInfo);
            if (parameterSupportGap != Integer.MAX_VALUE) {
                if (parameterSupportGap < i) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i = parameterSupportGap;
                } else if (parameterSupportGap == i) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) arrayList);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.sampleMimeType"})
    private static androidx.media3.transformer.ExportException createExportException(androidx.media3.common.Format format, java.lang.String str) {
        return androidx.media3.transformer.ExportException.createForCodec(new java.lang.IllegalArgumentException(str), 4003, new androidx.media3.transformer.ExportException.CodecInfo(format.toString(), androidx.media3.common.MimeTypes.isVideo(format.sampleMimeType), false, null));
    }

    private static boolean deviceNeedsDefaultFrameRateWorkaround() {
        return androidx.media3.common.util.Util.SDK_INT < 30 && androidx.media3.common.util.Util.DEVICE.equals("joyeuse");
    }

    private static boolean deviceNeedsNoH264HighProfileWorkaround() {
        return androidx.media3.common.util.Util.SDK_INT == 27 && (androidx.media3.common.util.Util.DEVICE.equals("ASUS_X00T_3") || androidx.media3.common.util.Util.DEVICE.equals("TC77"));
    }
}
