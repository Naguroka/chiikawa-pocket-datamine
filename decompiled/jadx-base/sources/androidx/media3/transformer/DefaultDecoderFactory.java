package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultDecoderFactory implements androidx.media3.transformer.Codec.DecoderFactory {
    private static final java.lang.String TAG = "DefaultDecoderFactory";
    private final int codecPriority;
    private final android.content.Context context;
    private final boolean enableDecoderFallback;
    private final androidx.media3.transformer.DefaultDecoderFactory.Listener listener;
    private final androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector;

    public interface Listener {
        void onCodecInitialized(java.lang.String str, java.util.List<androidx.media3.transformer.ExportException> list);
    }

    public static final class Builder {
        private final android.content.Context context;
        private boolean enableDecoderFallback;
        private androidx.media3.transformer.DefaultDecoderFactory.Listener listener = new androidx.media3.transformer.DefaultDecoderFactory.Listener() { // from class: androidx.media3.transformer.DefaultDecoderFactory$Builder$$ExternalSyntheticLambda0
            @Override // androidx.media3.transformer.DefaultDecoderFactory.Listener
            public final void onCodecInitialized(java.lang.String str, java.util.List list) {
                androidx.media3.transformer.DefaultDecoderFactory.Builder.lambda$new$0(str, list);
            }
        };
        private int codecPriority = androidx.media3.common.C.PRIORITY_PROCESSING_FOREGROUND;
        private androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector = androidx.media3.exoplayer.mediacodec.MediaCodecSelector.DEFAULT;

        static /* synthetic */ void lambda$new$0(java.lang.String str, java.util.List list) {
        }

        public Builder(android.content.Context context) {
            this.context = context.getApplicationContext();
        }

        public androidx.media3.transformer.DefaultDecoderFactory.Builder setListener(androidx.media3.transformer.DefaultDecoderFactory.Listener listener) {
            this.listener = listener;
            return this;
        }

        public androidx.media3.transformer.DefaultDecoderFactory.Builder setEnableDecoderFallback(boolean z) {
            this.enableDecoderFallback = z;
            return this;
        }

        public androidx.media3.transformer.DefaultDecoderFactory.Builder setCodecPriority(int i) {
            this.codecPriority = i;
            return this;
        }

        public androidx.media3.transformer.DefaultDecoderFactory.Builder setMediaCodecSelector(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector) {
            this.mediaCodecSelector = mediaCodecSelector;
            return this;
        }

        public androidx.media3.transformer.DefaultDecoderFactory build() {
            return new androidx.media3.transformer.DefaultDecoderFactory(this);
        }
    }

    @java.lang.Deprecated
    public DefaultDecoderFactory(android.content.Context context) {
        this(new androidx.media3.transformer.DefaultDecoderFactory.Builder(context));
    }

    @java.lang.Deprecated
    public DefaultDecoderFactory(android.content.Context context, boolean z, androidx.media3.transformer.DefaultDecoderFactory.Listener listener) {
        this(new androidx.media3.transformer.DefaultDecoderFactory.Builder(context).setEnableDecoderFallback(z).setListener(listener));
    }

    private DefaultDecoderFactory(androidx.media3.transformer.DefaultDecoderFactory.Builder builder) {
        this.context = builder.context;
        this.enableDecoderFallback = builder.enableDecoderFallback;
        this.listener = builder.listener;
        this.codecPriority = builder.codecPriority;
        this.mediaCodecSelector = builder.mediaCodecSelector;
    }

    @Override // androidx.media3.transformer.Codec.DecoderFactory
    public androidx.media3.transformer.DefaultCodec createForAudioDecoding(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException {
        return createCodecForMediaFormat(androidx.media3.common.util.MediaFormatUtil.createMediaFormatFromFormat(format), format, null, false);
    }

    @Override // androidx.media3.transformer.Codec.DecoderFactory
    public androidx.media3.transformer.DefaultCodec createForVideoDecoding(androidx.media3.common.Format format, android.view.Surface surface, boolean z) throws androidx.media3.transformer.ExportException {
        if (androidx.media3.common.ColorInfo.isTransferHdr(format.colorInfo)) {
            if (z && (androidx.media3.common.util.Util.SDK_INT < 31 || deviceNeedsDisableToneMappingWorkaround(((androidx.media3.common.ColorInfo) androidx.media3.common.util.Assertions.checkNotNull(format.colorInfo)).colorTransfer))) {
                throw createExportException(format, "Tone-mapping HDR is not supported on this device.");
            }
            if (androidx.media3.common.util.Util.SDK_INT < 29) {
                throw createExportException(format, "Decoding HDR is not supported on this device.");
            }
        }
        if (deviceNeedsDisable8kWorkaround(format)) {
            throw createExportException(format, "Decoding 8k is not supported on this device.");
        }
        if (deviceNeedsNoFrameRateWorkaround()) {
            format = format.buildUpon().setFrameRate(-1.0f).build();
        }
        android.media.MediaFormat mediaFormatCreateMediaFormatFromFormat = androidx.media3.common.util.MediaFormatUtil.createMediaFormatFromFormat(format);
        if (decoderSupportsKeyAllowFrameDrop(this.context)) {
            mediaFormatCreateMediaFormatFromFormat.setInteger("allow-frame-drop", 0);
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 31 && z) {
            mediaFormatCreateMediaFormatFromFormat.setInteger("color-transfer-request", 3);
        }
        android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(format);
        if (codecProfileAndLevel != null) {
            androidx.media3.common.util.MediaFormatUtil.maybeSetInteger(mediaFormatCreateMediaFormatFromFormat, com.google.android.gms.common.Scopes.PROFILE, ((java.lang.Integer) codecProfileAndLevel.first).intValue());
            androidx.media3.common.util.MediaFormatUtil.maybeSetInteger(mediaFormatCreateMediaFormatFromFormat, "level", ((java.lang.Integer) codecProfileAndLevel.second).intValue());
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 35) {
            mediaFormatCreateMediaFormatFromFormat.setInteger("importance", java.lang.Math.max(0, -this.codecPriority));
        }
        return createCodecForMediaFormat(mediaFormatCreateMediaFormatFromFormat, format, surface, devicePrefersSoftwareDecoder(format));
    }

    private androidx.media3.transformer.DefaultCodec createCodecForMediaFormat(android.media.MediaFormat mediaFormat, androidx.media3.common.Format format, android.view.Surface surface, boolean z) throws androidx.media3.transformer.ExportException {
        com.google.common.collect.ImmutableList.of();
        androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType);
        try {
            java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfosSortedByFormatSupport = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSortedByFormatSupport(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSoftMatch(this.mediaCodecSelector, format, false, false), format);
            if (decoderInfosSortedByFormatSupport.isEmpty()) {
                throw createExportException(format, "No decoders for format");
            }
            if (z) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i = 0; i < decoderInfosSortedByFormatSupport.size(); i++) {
                    androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = decoderInfosSortedByFormatSupport.get(i);
                    if (!mediaCodecInfo.hardwareAccelerated) {
                        arrayList.add(mediaCodecInfo);
                    }
                }
                if (!arrayList.isEmpty()) {
                    decoderInfosSortedByFormatSupport = arrayList;
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.content.Context context = this.context;
            if (!this.enableDecoderFallback) {
                decoderInfosSortedByFormatSupport = decoderInfosSortedByFormatSupport.subList(0, 1);
            }
            androidx.media3.transformer.DefaultCodec defaultCodecCreateCodecFromDecoderInfos = createCodecFromDecoderInfos(context, decoderInfosSortedByFormatSupport, format, mediaFormat, surface, arrayList2);
            this.listener.onCodecInitialized(defaultCodecCreateCodecFromDecoderInfos.getName(), arrayList2);
            return defaultCodecCreateCodecFromDecoderInfos;
        } catch (androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException e) {
            androidx.media3.common.util.Log.e(TAG, "Error querying decoders", e);
            throw createExportException(format, "Querying codecs failed");
        }
    }

    private static androidx.media3.transformer.DefaultCodec createCodecFromDecoderInfos(android.content.Context context, java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> list, androidx.media3.common.Format format, android.media.MediaFormat mediaFormat, android.view.Surface surface, java.util.List<androidx.media3.transformer.ExportException> list2) throws androidx.media3.transformer.ExportException {
        for (androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo : list) {
            mediaFormat.setString("mime", mediaCodecInfo.codecMimeType);
            try {
                return new androidx.media3.transformer.DefaultCodec(context, format, mediaFormat, mediaCodecInfo.name, true, surface);
            } catch (androidx.media3.transformer.ExportException e) {
                list2.add(e);
            }
        }
        throw list2.get(0);
    }

    private static boolean deviceNeedsDisable8kWorkaround(androidx.media3.common.Format format) {
        return androidx.media3.common.util.Util.SDK_INT < 31 && format.width >= 7680 && format.height >= 4320 && format.sampleMimeType != null && format.sampleMimeType.equals("video/hevc") && (androidx.media3.common.util.Util.MODEL.equals("SM-F711U1") || androidx.media3.common.util.Util.MODEL.equals("SM-F926U1"));
    }

    private static boolean deviceNeedsDisableToneMappingWorkaround(int i) {
        if (androidx.media3.common.util.Util.MANUFACTURER.equals("Google") && android.os.Build.ID.startsWith("TP1A")) {
            return true;
        }
        if (i == 7 && (androidx.media3.common.util.Util.MODEL.startsWith("SM-F936") || androidx.media3.common.util.Util.MODEL.startsWith("SM-F916") || androidx.media3.common.util.Util.MODEL.startsWith("SM-F721") || androidx.media3.common.util.Util.MODEL.equals("SM-X900"))) {
            return true;
        }
        return androidx.media3.common.util.Util.SDK_INT < 34 && i == 6 && androidx.media3.common.util.Util.MODEL.startsWith("SM-F936");
    }

    private static boolean deviceNeedsNoFrameRateWorkaround() {
        return androidx.media3.common.util.Util.SDK_INT < 30 && androidx.media3.common.util.Util.DEVICE.equals("joyeuse");
    }

    private static boolean decoderSupportsKeyAllowFrameDrop(android.content.Context context) {
        return androidx.media3.common.util.Util.SDK_INT >= 29 && context.getApplicationInfo().targetSdkVersion >= 29;
    }

    private static boolean devicePrefersSoftwareDecoder(androidx.media3.common.Format format) {
        return format.width * format.height >= 2073600 && (com.google.common.base.Ascii.equalsIgnoreCase(androidx.media3.common.util.Util.MODEL, "vivo 1906") || com.google.common.base.Ascii.equalsIgnoreCase(androidx.media3.common.util.Util.MODEL, "redmi 8"));
    }

    private static androidx.media3.transformer.ExportException createExportException(androidx.media3.common.Format format, java.lang.String str) {
        return androidx.media3.transformer.ExportException.createForCodec(new java.lang.IllegalArgumentException(str), 3003, new androidx.media3.transformer.ExportException.CodecInfo(format.toString(), androidx.media3.common.MimeTypes.isVideo((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType)), true, null));
    }
}
