package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class VideoSampleExporter extends androidx.media3.transformer.SampleExporter {
    private static final java.lang.String TAG = "VideoSampleExporter";
    private final androidx.media3.decoder.DecoderInputBuffer encoderOutputBuffer;
    private final androidx.media3.transformer.VideoSampleExporter.EncoderWrapper encoderWrapper;
    private volatile long finalFramePresentationTimeUs;
    private boolean hasMuxedTimestampZero;
    private final long initialTimestampOffsetUs;
    private final androidx.media3.transformer.TransformerVideoGraph videoGraph;

    public VideoSampleExporter(android.content.Context context, androidx.media3.common.Format format, androidx.media3.transformer.TransformationRequest transformationRequest, androidx.media3.effect.VideoCompositorSettings videoCompositorSettings, java.util.List<androidx.media3.common.Effect> list, androidx.media3.common.VideoFrameProcessor.Factory factory, androidx.media3.transformer.Codec.EncoderFactory encoderFactory, androidx.media3.transformer.MuxerWrapper muxerWrapper, androidx.media3.common.util.Consumer<androidx.media3.transformer.ExportException> consumer, androidx.media3.transformer.FallbackListener fallbackListener, androidx.media3.common.DebugViewProvider debugViewProvider, long j, boolean z) throws androidx.media3.transformer.ExportException {
        androidx.media3.common.ColorInfo colorInfoBuild;
        androidx.media3.transformer.TransformerVideoGraph.Factory factory2;
        super(format, muxerWrapper);
        this.initialTimestampOffsetUs = j;
        this.finalFramePresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        androidx.media3.common.ColorInfo colorInfo = (androidx.media3.common.ColorInfo) androidx.media3.common.util.Assertions.checkNotNull(format.colorInfo);
        if (colorInfo.colorTransfer != 2) {
            colorInfoBuild = colorInfo;
        } else if (java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.IMAGE_JPEG_R)) {
            colorInfoBuild = new androidx.media3.common.ColorInfo.Builder().setColorSpace(6).setColorTransfer(7).setColorRange(1).build();
        } else {
            colorInfoBuild = androidx.media3.common.ColorInfo.SDR_BT709_LIMITED;
        }
        androidx.media3.transformer.VideoSampleExporter.EncoderWrapper encoderWrapper = new androidx.media3.transformer.VideoSampleExporter.EncoderWrapper(encoderFactory, format.buildUpon().setColorInfo(colorInfoBuild).build(), muxerWrapper.getSupportedSampleMimeTypes(2), transformationRequest, fallbackListener);
        this.encoderWrapper = encoderWrapper;
        this.encoderOutputBuffer = new androidx.media3.decoder.DecoderInputBuffer(0);
        androidx.media3.common.ColorInfo colorInfo2 = encoderWrapper.getHdrModeAfterFallback() == 2 && androidx.media3.common.ColorInfo.isTransferHdr(colorInfo) ? androidx.media3.common.ColorInfo.SDR_BT709_LIMITED : colorInfoBuild;
        try {
            if (z) {
                factory2 = new androidx.media3.transformer.TransformerMultipleInputVideoGraph.Factory();
            } else {
                factory2 = new androidx.media3.transformer.TransformerSingleInputVideoGraph.Factory(factory);
            }
            androidx.media3.transformer.VideoSampleExporter.VideoGraphWrapper videoGraphWrapper = new androidx.media3.transformer.VideoSampleExporter.VideoGraphWrapper(context, factory2, colorInfo2, consumer, debugViewProvider, videoCompositorSettings, list);
            this.videoGraph = videoGraphWrapper;
            videoGraphWrapper.initialize();
        } catch (androidx.media3.common.VideoFrameProcessingException e) {
            throw androidx.media3.transformer.ExportException.createForVideoFrameProcessingException(e);
        }
    }

    @Override // androidx.media3.transformer.SampleExporter
    public androidx.media3.transformer.GraphInput getInput(androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.common.Format format, int i) throws androidx.media3.transformer.ExportException {
        try {
            return this.videoGraph.createInput(i);
        } catch (androidx.media3.common.VideoFrameProcessingException e) {
            throw androidx.media3.transformer.ExportException.createForVideoFrameProcessingException(e);
        }
    }

    @Override // androidx.media3.transformer.SampleExporter
    public void release() {
        this.videoGraph.release();
        this.encoderWrapper.release();
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected androidx.media3.common.Format getMuxerInputFormat() throws androidx.media3.transformer.ExportException {
        return this.encoderWrapper.getOutputFormat();
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected androidx.media3.decoder.DecoderInputBuffer getMuxerInputBuffer() throws androidx.media3.transformer.ExportException {
        this.encoderOutputBuffer.data = this.encoderWrapper.getOutputBuffer();
        if (this.encoderOutputBuffer.data == null) {
            return null;
        }
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) androidx.media3.common.util.Assertions.checkNotNull(this.encoderWrapper.getOutputBufferInfo());
        if (bufferInfo.presentationTimeUs == 0) {
            if (this.videoGraph.hasProducedFrameWithTimestampZero() == this.hasMuxedTimestampZero && this.finalFramePresentationTimeUs != androidx.media3.common.C.TIME_UNSET && bufferInfo.size > 0) {
                bufferInfo.presentationTimeUs = this.finalFramePresentationTimeUs;
            } else {
                this.hasMuxedTimestampZero = true;
            }
        }
        this.encoderOutputBuffer.timeUs = bufferInfo.presentationTimeUs;
        this.encoderOutputBuffer.setFlags(bufferInfo.flags);
        return this.encoderOutputBuffer;
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected void releaseMuxerInputBuffer() throws androidx.media3.transformer.ExportException {
        this.encoderWrapper.releaseOutputBuffer(false);
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected boolean isMuxerInputEnded() {
        return this.encoderWrapper.isEnded();
    }

    static final class EncoderWrapper {
        private static final java.lang.String DEFAULT_OUTPUT_MIME_TYPE = "video/hevc";
        private volatile androidx.media3.transformer.Codec encoder;
        private final androidx.media3.transformer.Codec.EncoderFactory encoderFactory;
        private androidx.media3.common.SurfaceInfo encoderSurfaceInfo;
        private final androidx.media3.transformer.FallbackListener fallbackListener;
        private final int hdrModeAfterFallback;
        private final androidx.media3.common.Format inputFormat;
        private final java.util.List<java.lang.String> muxerSupportedMimeTypes;
        private volatile int outputRotationDegrees;
        private volatile boolean releaseEncoder;
        private final java.lang.String requestedOutputMimeType;
        private final androidx.media3.transformer.TransformationRequest transformationRequest;

        public EncoderWrapper(androidx.media3.transformer.Codec.EncoderFactory encoderFactory, androidx.media3.common.Format format, java.util.List<java.lang.String> list, androidx.media3.transformer.TransformationRequest transformationRequest, androidx.media3.transformer.FallbackListener fallbackListener) {
            androidx.media3.common.util.Assertions.checkArgument(format.colorInfo != null);
            this.encoderFactory = encoderFactory;
            this.inputFormat = format;
            this.muxerSupportedMimeTypes = list;
            this.transformationRequest = transformationRequest;
            this.fallbackListener = fallbackListener;
            android.util.Pair<java.lang.String, java.lang.Integer> requestedOutputMimeTypeAndHdrModeAfterFallback = getRequestedOutputMimeTypeAndHdrModeAfterFallback(format, transformationRequest);
            this.requestedOutputMimeType = (java.lang.String) requestedOutputMimeTypeAndHdrModeAfterFallback.first;
            this.hdrModeAfterFallback = ((java.lang.Integer) requestedOutputMimeTypeAndHdrModeAfterFallback.second).intValue();
        }

        private static android.util.Pair<java.lang.String, java.lang.Integer> getRequestedOutputMimeTypeAndHdrModeAfterFallback(androidx.media3.common.Format format, androidx.media3.transformer.TransformationRequest transformationRequest) {
            java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType);
            if (transformationRequest.videoMimeType != null) {
                str = transformationRequest.videoMimeType;
            } else if (androidx.media3.common.MimeTypes.isImage(str)) {
                str = "video/hevc";
            }
            return androidx.media3.transformer.TransformerUtil.getOutputMimeTypeAndHdrModeAfterFallback(transformationRequest.hdrMode, str, format.colorInfo);
        }

        public int getHdrModeAfterFallback() {
            return this.hdrModeAfterFallback;
        }

        public androidx.media3.common.SurfaceInfo getSurfaceInfo(int i, int i2) throws androidx.media3.transformer.ExportException {
            if (this.releaseEncoder) {
                return null;
            }
            androidx.media3.common.SurfaceInfo surfaceInfo = this.encoderSurfaceInfo;
            if (surfaceInfo != null) {
                return surfaceInfo;
            }
            if (i < i2) {
                this.outputRotationDegrees = 90;
                i2 = i;
                i = i2;
            }
            if (this.inputFormat.rotationDegrees % org.objectweb.asm.Opcodes.GETFIELD == this.outputRotationDegrees % org.objectweb.asm.Opcodes.GETFIELD) {
                this.outputRotationDegrees = this.inputFormat.rotationDegrees;
            }
            androidx.media3.common.Format formatBuild = new androidx.media3.common.Format.Builder().setWidth(i).setHeight(i2).setRotationDegrees(0).setFrameRate(this.inputFormat.frameRate).setSampleMimeType(this.requestedOutputMimeType).setColorInfo(getSupportedInputColor()).setCodecs(this.inputFormat.codecs).build();
            this.encoder = this.encoderFactory.createForVideoEncoding(formatBuild.buildUpon().setSampleMimeType(androidx.media3.transformer.SampleExporter.findSupportedMimeTypeForEncoderAndMuxer(formatBuild, this.muxerSupportedMimeTypes)).build());
            androidx.media3.common.Format configurationFormat = this.encoder.getConfigurationFormat();
            this.fallbackListener.onTransformationRequestFinalized(createSupportedTransformationRequest(this.transformationRequest, this.outputRotationDegrees != 0, formatBuild, configurationFormat, this.hdrModeAfterFallback));
            this.encoderSurfaceInfo = new androidx.media3.common.SurfaceInfo(this.encoder.getInputSurface(), configurationFormat.width, configurationFormat.height, this.outputRotationDegrees);
            if (this.releaseEncoder) {
                this.encoder.release();
            }
            return this.encoderSurfaceInfo;
        }

        private androidx.media3.common.ColorInfo getSupportedInputColor() {
            if (androidx.media3.common.ColorInfo.isTransferHdr(this.inputFormat.colorInfo) && this.hdrModeAfterFallback != 0) {
                return androidx.media3.common.ColorInfo.SDR_BT709_LIMITED;
            }
            if (androidx.media3.common.ColorInfo.SRGB_BT709_FULL.equals(this.inputFormat.colorInfo)) {
                return androidx.media3.common.ColorInfo.SDR_BT709_LIMITED;
            }
            return (androidx.media3.common.ColorInfo) androidx.media3.common.util.Assertions.checkNotNull(this.inputFormat.colorInfo);
        }

        @org.checkerframework.dataflow.qual.Pure
        private static androidx.media3.transformer.TransformationRequest createSupportedTransformationRequest(androidx.media3.transformer.TransformationRequest transformationRequest, boolean z, androidx.media3.common.Format format, androidx.media3.common.Format format2, int i) {
            androidx.media3.transformer.TransformationRequest.Builder builderBuildUpon = transformationRequest.buildUpon();
            if (transformationRequest.hdrMode != i) {
                builderBuildUpon.setHdrMode(i);
            }
            if (!androidx.media3.common.util.Util.areEqual(format.sampleMimeType, format2.sampleMimeType)) {
                builderBuildUpon.setVideoMimeType(format2.sampleMimeType);
            }
            if (z) {
                if (format.width != format2.width) {
                    builderBuildUpon.setResolution(format2.width);
                }
            } else if (format.height != format2.height) {
                builderBuildUpon.setResolution(format2.height);
            }
            return builderBuildUpon.build();
        }

        public void signalEndOfInputStream() throws androidx.media3.transformer.ExportException {
            if (this.encoder != null) {
                this.encoder.signalEndOfInputStream();
            }
        }

        public androidx.media3.common.Format getOutputFormat() throws androidx.media3.transformer.ExportException {
            if (this.encoder == null) {
                return null;
            }
            androidx.media3.common.Format outputFormat = this.encoder.getOutputFormat();
            return (outputFormat == null || this.outputRotationDegrees == 0) ? outputFormat : outputFormat.buildUpon().setRotationDegrees(this.outputRotationDegrees).build();
        }

        public java.nio.ByteBuffer getOutputBuffer() throws androidx.media3.transformer.ExportException {
            if (this.encoder != null) {
                return this.encoder.getOutputBuffer();
            }
            return null;
        }

        public android.media.MediaCodec.BufferInfo getOutputBufferInfo() throws androidx.media3.transformer.ExportException {
            if (this.encoder != null) {
                return this.encoder.getOutputBufferInfo();
            }
            return null;
        }

        public void releaseOutputBuffer(boolean z) throws androidx.media3.transformer.ExportException {
            if (this.encoder != null) {
                this.encoder.releaseOutputBuffer(z);
            }
        }

        public boolean isEnded() {
            return this.encoder != null && this.encoder.isEnded();
        }

        public void release() {
            if (this.encoder != null) {
                this.encoder.release();
            }
            this.releaseEncoder = true;
        }
    }

    private final class VideoGraphWrapper implements androidx.media3.transformer.TransformerVideoGraph, androidx.media3.common.VideoGraph.Listener {
        private final androidx.media3.common.util.Consumer<androidx.media3.transformer.ExportException> errorConsumer;
        private final androidx.media3.transformer.TransformerVideoGraph videoGraph;

        @Override // androidx.media3.common.VideoGraph.Listener
        public void onOutputFrameAvailableForRendering(long j) {
        }

        public VideoGraphWrapper(android.content.Context context, androidx.media3.transformer.TransformerVideoGraph.Factory factory, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.util.Consumer<androidx.media3.transformer.ExportException> consumer, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.effect.VideoCompositorSettings videoCompositorSettings, java.util.List<androidx.media3.common.Effect> list) throws androidx.media3.common.VideoFrameProcessingException {
            this.errorConsumer = consumer;
            this.videoGraph = factory.create(context, colorInfo, debugViewProvider, this, com.google.common.util.concurrent.MoreExecutors.directExecutor(), videoCompositorSettings, list, androidx.media3.transformer.VideoSampleExporter.this.initialTimestampOffsetUs);
        }

        @Override // androidx.media3.common.VideoGraph.Listener
        public void onOutputSizeChanged(int i, int i2) {
            androidx.media3.common.SurfaceInfo surfaceInfo;
            try {
                surfaceInfo = androidx.media3.transformer.VideoSampleExporter.this.encoderWrapper.getSurfaceInfo(i, i2);
            } catch (androidx.media3.transformer.ExportException e) {
                this.errorConsumer.accept(e);
                surfaceInfo = null;
            }
            setOutputSurfaceInfo(surfaceInfo);
        }

        @Override // androidx.media3.common.VideoGraph.Listener
        public void onEnded(long j) {
            androidx.media3.transformer.VideoSampleExporter.this.finalFramePresentationTimeUs = j;
            try {
                androidx.media3.transformer.VideoSampleExporter.this.encoderWrapper.signalEndOfInputStream();
            } catch (androidx.media3.transformer.ExportException e) {
                this.errorConsumer.accept(e);
            }
        }

        @Override // androidx.media3.common.VideoGraph.Listener
        public void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
            this.errorConsumer.accept(androidx.media3.transformer.ExportException.createForVideoFrameProcessingException(videoFrameProcessingException));
        }

        @Override // androidx.media3.common.VideoGraph
        public void initialize() throws androidx.media3.common.VideoFrameProcessingException {
            this.videoGraph.initialize();
        }

        @Override // androidx.media3.common.VideoGraph
        public void registerInput(int i) throws androidx.media3.common.VideoFrameProcessingException {
            this.videoGraph.registerInput(i);
        }

        @Override // androidx.media3.common.VideoGraph
        public androidx.media3.common.VideoFrameProcessor getProcessor(int i) {
            return this.videoGraph.getProcessor(i);
        }

        @Override // androidx.media3.transformer.TransformerVideoGraph
        public androidx.media3.transformer.GraphInput createInput(int i) throws androidx.media3.common.VideoFrameProcessingException {
            return this.videoGraph.createInput(i);
        }

        @Override // androidx.media3.common.VideoGraph
        public void setOutputSurfaceInfo(androidx.media3.common.SurfaceInfo surfaceInfo) {
            this.videoGraph.setOutputSurfaceInfo(surfaceInfo);
        }

        @Override // androidx.media3.common.VideoGraph
        public boolean hasProducedFrameWithTimestampZero() {
            return this.videoGraph.hasProducedFrameWithTimestampZero();
        }

        @Override // androidx.media3.common.VideoGraph
        public void release() {
            this.videoGraph.release();
        }
    }
}
