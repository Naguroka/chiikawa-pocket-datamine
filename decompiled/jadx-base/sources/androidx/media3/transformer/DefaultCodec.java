package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultCodec implements androidx.media3.transformer.Codec {
    public static final int DEFAULT_PCM_ENCODING = 2;
    private static final java.lang.String TAG = "DefaultCodec";
    private final androidx.media3.common.Format configurationFormat;
    private final android.media.MediaFormat configurationMediaFormat;
    private int inputBufferIndex;
    private boolean inputStreamEnded;
    private final android.view.Surface inputSurface;
    private final boolean isDecoder;
    private final boolean isVideo;
    private final int maxPendingFrameCount;
    private final android.media.MediaCodec mediaCodec;
    private java.nio.ByteBuffer outputBuffer;
    private int outputBufferIndex;
    private final android.media.MediaCodec.BufferInfo outputBufferInfo;
    private androidx.media3.common.Format outputFormat;
    private boolean outputStreamEnded;
    private final java.util.concurrent.atomic.AtomicBoolean videoOutputStarted;

    public DefaultCodec(android.content.Context context, androidx.media3.common.Format format, android.media.MediaFormat mediaFormat, java.lang.String str, boolean z, android.view.Surface surface) throws androidx.media3.transformer.ExportException {
        java.lang.Exception exc;
        android.media.MediaCodec mediaCodecCreateByCodecName;
        int i;
        this.configurationFormat = format;
        this.configurationMediaFormat = mediaFormat;
        this.isDecoder = z;
        boolean zIsVideo = androidx.media3.common.MimeTypes.isVideo((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType));
        this.isVideo = zIsVideo;
        this.outputBufferInfo = new android.media.MediaCodec.BufferInfo();
        this.inputBufferIndex = -1;
        this.outputBufferIndex = -1;
        this.videoOutputStarted = new java.util.concurrent.atomic.AtomicBoolean();
        androidx.media3.effect.DebugTraceUtil.logCodecEvent(z, zIsVideo, androidx.media3.effect.DebugTraceUtil.EVENT_INPUT_FORMAT, androidx.media3.common.C.TIME_UNSET, "%s", format);
        boolean zIsSdrToneMappingEnabled = isSdrToneMappingEnabled(mediaFormat);
        android.view.Surface surfaceCreateInputSurface = null;
        try {
            mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(str);
            try {
                configureCodec(mediaCodecCreateByCodecName, mediaFormat, z, surface);
                if (zIsSdrToneMappingEnabled) {
                    androidx.media3.common.util.Assertions.checkArgument(isSdrToneMappingEnabled(mediaCodecCreateByCodecName.getInputFormat()), "Tone-mapping requested but not supported by the decoder.");
                }
                if (zIsVideo && !z) {
                    surfaceCreateInputSurface = mediaCodecCreateByCodecName.createInputSurface();
                }
                startCodec(mediaCodecCreateByCodecName);
                this.mediaCodec = mediaCodecCreateByCodecName;
                this.inputSurface = surfaceCreateInputSurface;
                this.maxPendingFrameCount = androidx.media3.common.util.Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
            } catch (java.lang.Exception e) {
                exc = e;
                androidx.media3.common.util.Log.d(TAG, "MediaCodec error", exc);
                if (surfaceCreateInputSurface != null) {
                    surfaceCreateInputSurface.release();
                }
                if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                if ((exc instanceof java.io.IOException) || (exc instanceof android.media.MediaCodec.CodecException)) {
                    i = z ? 3001 : 4001;
                } else {
                    i = exc instanceof java.lang.IllegalArgumentException ? z ? 3003 : 4003 : 1001;
                }
                throw createExportException(mediaFormat, this.isVideo, z, exc, i, str);
            }
        } catch (java.lang.Exception e2) {
            exc = e2;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // androidx.media3.transformer.Codec
    public androidx.media3.common.Format getConfigurationFormat() {
        return this.configurationFormat;
    }

    @Override // androidx.media3.transformer.Codec
    public android.view.Surface getInputSurface() {
        return (android.view.Surface) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputSurface);
    }

    @Override // androidx.media3.transformer.Codec
    public int getMaxPendingFrameCount() {
        return this.maxPendingFrameCount;
    }

    @Override // androidx.media3.transformer.Codec
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1.data"}, result = true)
    public boolean maybeDequeueInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) throws androidx.media3.transformer.ExportException {
        if (this.inputStreamEnded) {
            return false;
        }
        if (this.inputBufferIndex < 0) {
            try {
                int iDequeueInputBuffer = this.mediaCodec.dequeueInputBuffer(0L);
                this.inputBufferIndex = iDequeueInputBuffer;
                if (iDequeueInputBuffer < 0) {
                    return false;
                }
                try {
                    decoderInputBuffer.data = this.mediaCodec.getInputBuffer(iDequeueInputBuffer);
                    decoderInputBuffer.clear();
                } catch (java.lang.RuntimeException e) {
                    androidx.media3.common.util.Log.d(TAG, "MediaCodec error", e);
                    throw createExportException(e);
                }
            } catch (java.lang.RuntimeException e2) {
                androidx.media3.common.util.Log.d(TAG, "MediaCodec error", e2);
                throw createExportException(e2);
            }
        }
        androidx.media3.common.util.Assertions.checkNotNull(decoderInputBuffer.data);
        return true;
    }

    @Override // androidx.media3.transformer.Codec
    public void queueInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) throws androidx.media3.transformer.ExportException {
        int iPosition;
        int iRemaining;
        int i;
        int i2;
        androidx.media3.common.util.Assertions.checkState(!this.inputStreamEnded, "Input buffer can not be queued after the input stream has ended.");
        if (decoderInputBuffer.data == null || !decoderInputBuffer.data.hasRemaining()) {
            iPosition = 0;
            iRemaining = 0;
        } else {
            iPosition = decoderInputBuffer.data.position();
            iRemaining = decoderInputBuffer.data.remaining();
        }
        long j = decoderInputBuffer.timeUs;
        if (decoderInputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            debugTraceLogEvent(androidx.media3.effect.DebugTraceUtil.EVENT_INPUT_ENDED, Long.MIN_VALUE);
            if (this.isDecoder) {
                androidx.media3.common.util.Assertions.checkState(decoderInputBuffer.data == null || !decoderInputBuffer.data.hasRemaining());
                i = 0;
                j = 0;
                i2 = 4;
                iRemaining = 0;
            } else {
                i = iPosition;
                i2 = 4;
            }
        } else {
            i = iPosition;
            i2 = 0;
        }
        try {
            this.mediaCodec.queueInputBuffer(this.inputBufferIndex, i, iRemaining, j, i2);
            debugTraceLogEvent(androidx.media3.effect.DebugTraceUtil.EVENT_ACCEPTED_INPUT, j, "bytes=%s", java.lang.Integer.valueOf(iRemaining));
            this.inputBufferIndex = -1;
            decoderInputBuffer.data = null;
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.d(TAG, "MediaCodec error", e);
            throw createExportException(e);
        }
    }

    @Override // androidx.media3.transformer.Codec
    public void signalEndOfInputStream() throws androidx.media3.transformer.ExportException {
        if (!this.videoOutputStarted.get()) {
            try {
                java.lang.Thread.sleep(30L);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
        debugTraceLogEvent(androidx.media3.effect.DebugTraceUtil.EVENT_INPUT_ENDED, Long.MIN_VALUE);
        try {
            this.mediaCodec.signalEndOfInputStream();
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.d(TAG, "MediaCodec error", e);
            throw createExportException(e);
        }
    }

    @Override // androidx.media3.transformer.Codec
    public androidx.media3.common.Format getOutputFormat() throws androidx.media3.transformer.ExportException {
        maybeDequeueOutputBuffer(false);
        return this.outputFormat;
    }

    @Override // androidx.media3.transformer.Codec
    public java.nio.ByteBuffer getOutputBuffer() throws androidx.media3.transformer.ExportException {
        if (!maybeDequeueOutputBuffer(true)) {
            return null;
        }
        debugTraceLogEvent(androidx.media3.effect.DebugTraceUtil.EVENT_PRODUCED_OUTPUT, this.outputBufferInfo.presentationTimeUs, "bytesOutput=%s", java.lang.Integer.valueOf(this.outputBufferInfo.size));
        return this.outputBuffer;
    }

    @Override // androidx.media3.transformer.Codec
    public android.media.MediaCodec.BufferInfo getOutputBufferInfo() throws androidx.media3.transformer.ExportException {
        if (maybeDequeueOutputBuffer(false)) {
            return this.outputBufferInfo;
        }
        return null;
    }

    @Override // androidx.media3.transformer.Codec
    public void releaseOutputBuffer(boolean z) throws androidx.media3.transformer.ExportException {
        releaseOutputBuffer(z, ((android.media.MediaCodec.BufferInfo) androidx.media3.common.util.Assertions.checkStateNotNull(this.outputBufferInfo)).presentationTimeUs);
    }

    @Override // androidx.media3.transformer.Codec
    public void releaseOutputBuffer(long j) throws androidx.media3.transformer.ExportException {
        releaseOutputBuffer(true, j);
    }

    protected void releaseOutputBuffer(boolean z, long j) throws androidx.media3.transformer.ExportException {
        this.outputBuffer = null;
        try {
            if (z) {
                this.mediaCodec.releaseOutputBuffer(this.outputBufferIndex, 1000 * j);
                debugTraceLogEvent(androidx.media3.effect.DebugTraceUtil.EVENT_PRODUCED_OUTPUT, j);
            } else {
                this.mediaCodec.releaseOutputBuffer(this.outputBufferIndex, false);
            }
            this.outputBufferIndex = -1;
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.d(TAG, "MediaCodec error", e);
            throw createExportException(e);
        }
    }

    @Override // androidx.media3.transformer.Codec
    public boolean isEnded() {
        return this.outputStreamEnded && this.outputBufferIndex == -1;
    }

    @Override // androidx.media3.transformer.Codec
    public void release() {
        this.outputBuffer = null;
        android.view.Surface surface = this.inputSurface;
        if (surface != null) {
            surface.release();
        }
        this.mediaCodec.release();
    }

    @Override // androidx.media3.transformer.Codec
    public java.lang.String getName() {
        return androidx.media3.common.util.Util.SDK_INT >= 29 ? androidx.media3.transformer.DefaultCodec.Api29.getCanonicalName(this.mediaCodec) : this.mediaCodec.getName();
    }

    android.media.MediaFormat getConfigurationMediaFormat() {
        return this.configurationMediaFormat;
    }

    private boolean maybeDequeueOutputBuffer(boolean z) throws androidx.media3.transformer.ExportException {
        if (this.outputBufferIndex >= 0) {
            return true;
        }
        if (this.outputStreamEnded) {
            return false;
        }
        try {
            int iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(this.outputBufferInfo, 0L);
            this.outputBufferIndex = iDequeueOutputBuffer;
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -2) {
                    this.outputFormat = convertToFormat(this.mediaCodec.getOutputFormat(), this.isDecoder, this.configurationFormat.metadata);
                    if (this.isDecoder && java.util.Objects.equals(this.configurationFormat.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_RAW)) {
                        this.outputFormat = this.outputFormat.buildUpon().setChannelCount(this.configurationFormat.channelCount).setPcmEncoding(this.configurationFormat.pcmEncoding).build();
                    }
                    if (!this.isDecoder && this.isVideo) {
                        this.videoOutputStarted.set(true);
                    }
                    debugTraceLogEvent(androidx.media3.effect.DebugTraceUtil.EVENT_OUTPUT_FORMAT, this.outputBufferInfo.presentationTimeUs, "%s", this.outputFormat);
                }
                return false;
            }
            if ((this.outputBufferInfo.flags & 4) != 0) {
                this.outputStreamEnded = true;
                debugTraceLogEvent(androidx.media3.effect.DebugTraceUtil.EVENT_OUTPUT_ENDED, Long.MIN_VALUE);
                if (this.outputBufferInfo.size == 0) {
                    releaseOutputBuffer(false);
                    return false;
                }
                this.outputBufferInfo.flags &= -5;
            }
            if ((this.outputBufferInfo.flags & 2) != 0) {
                releaseOutputBuffer(false);
                return false;
            }
            if (z) {
                try {
                    java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.mediaCodec.getOutputBuffer(this.outputBufferIndex));
                    this.outputBuffer = byteBuffer;
                    byteBuffer.position(this.outputBufferInfo.offset);
                    this.outputBuffer.limit(this.outputBufferInfo.offset + this.outputBufferInfo.size);
                } catch (java.lang.RuntimeException e) {
                    androidx.media3.common.util.Log.d(TAG, "MediaCodec error", e);
                    throw createExportException(e);
                }
            }
            return true;
        } catch (java.lang.RuntimeException e2) {
            androidx.media3.common.util.Log.d(TAG, "MediaCodec error", e2);
            throw createExportException(e2);
        }
    }

    private androidx.media3.transformer.ExportException createExportException(java.lang.Exception exc) {
        android.media.MediaFormat mediaFormat = this.configurationMediaFormat;
        boolean z = this.isVideo;
        boolean z2 = this.isDecoder;
        return createExportException(mediaFormat, z, z2, exc, z2 ? 3002 : 4002, getName());
    }

    private static androidx.media3.transformer.ExportException createExportException(android.media.MediaFormat mediaFormat, boolean z, boolean z2, java.lang.Exception exc, int i, java.lang.String str) {
        return androidx.media3.transformer.ExportException.createForCodec(exc, i, new androidx.media3.transformer.ExportException.CodecInfo(mediaFormat.toString(), z, z2, str));
    }

    private static androidx.media3.common.Format convertToFormat(android.media.MediaFormat mediaFormat, boolean z, androidx.media3.common.Metadata metadata) {
        androidx.media3.common.Format formatCreateFormatFromMediaFormat = androidx.media3.common.util.MediaFormatUtil.createFormatFromMediaFormat(mediaFormat);
        androidx.media3.common.Format.Builder metadata2 = formatCreateFormatFromMediaFormat.buildUpon().setMetadata(metadata);
        if (z && formatCreateFormatFromMediaFormat.pcmEncoding == -1 && java.util.Objects.equals(formatCreateFormatFromMediaFormat.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_RAW)) {
            metadata2.setPcmEncoding(2);
        }
        return metadata2.build();
    }

    private static void configureCodec(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat, boolean z, android.view.Surface surface) {
        androidx.media3.common.util.TraceUtil.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (android.media.MediaCrypto) null, !z ? 1 : 0);
        androidx.media3.common.util.TraceUtil.endSection();
    }

    private static void startCodec(android.media.MediaCodec mediaCodec) {
        androidx.media3.common.util.TraceUtil.beginSection("startCodec");
        mediaCodec.start();
        androidx.media3.common.util.TraceUtil.endSection();
    }

    private static boolean isSdrToneMappingEnabled(android.media.MediaFormat mediaFormat) {
        return androidx.media3.common.util.Util.SDK_INT >= 31 && androidx.media3.common.util.MediaFormatUtil.getInteger(mediaFormat, "color-transfer-request", 0) == 3;
    }

    private void debugTraceLogEvent(java.lang.String str, long j) {
        debugTraceLogEvent(str, j, "", new java.lang.Object[0]);
    }

    private void debugTraceLogEvent(java.lang.String str, long j, java.lang.String str2, java.lang.Object... objArr) {
        androidx.media3.effect.DebugTraceUtil.logCodecEvent(this.isDecoder, this.isVideo, str, j, str2, objArr);
    }

    private static final class Api29 {
        private Api29() {
        }

        public static java.lang.String getCanonicalName(android.media.MediaCodec mediaCodec) {
            return mediaCodec.getCanonicalName();
        }
    }
}
