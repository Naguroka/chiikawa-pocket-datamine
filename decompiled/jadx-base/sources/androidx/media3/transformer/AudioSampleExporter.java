package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class AudioSampleExporter extends androidx.media3.transformer.SampleExporter {
    private final androidx.media3.transformer.AudioGraph audioGraph;
    private final androidx.media3.transformer.Codec encoder;
    private final androidx.media3.common.audio.AudioProcessor.AudioFormat encoderInputAudioFormat;
    private final androidx.media3.decoder.DecoderInputBuffer encoderInputBuffer;
    private final androidx.media3.decoder.DecoderInputBuffer encoderOutputBuffer;
    private long encoderTotalInputBytes;
    private final androidx.media3.transformer.AudioGraphInput firstInput;
    private final androidx.media3.common.Format firstInputFormat;
    private boolean returnedFirstInput;

    public AudioSampleExporter(androidx.media3.common.Format format, androidx.media3.common.Format format2, androidx.media3.transformer.TransformationRequest transformationRequest, androidx.media3.transformer.EditedMediaItem editedMediaItem, com.google.common.collect.ImmutableList<androidx.media3.common.audio.AudioProcessor> immutableList, androidx.media3.transformer.AudioMixer.Factory factory, androidx.media3.transformer.Codec.EncoderFactory encoderFactory, androidx.media3.transformer.MuxerWrapper muxerWrapper, androidx.media3.transformer.FallbackListener fallbackListener) throws androidx.media3.transformer.ExportException {
        java.lang.String str;
        super(format, muxerWrapper);
        androidx.media3.transformer.AudioGraph audioGraph = new androidx.media3.transformer.AudioGraph(factory, immutableList);
        this.audioGraph = audioGraph;
        this.firstInputFormat = format2;
        this.firstInput = audioGraph.registerInput(editedMediaItem, format2);
        androidx.media3.common.audio.AudioProcessor.AudioFormat outputAudioFormat = audioGraph.getOutputAudioFormat();
        this.encoderInputAudioFormat = outputAudioFormat;
        androidx.media3.common.util.Assertions.checkState(!outputAudioFormat.equals(androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET));
        androidx.media3.common.Format.Builder builder = new androidx.media3.common.Format.Builder();
        if (transformationRequest.audioMimeType != null) {
            str = transformationRequest.audioMimeType;
        } else {
            str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType);
        }
        androidx.media3.common.Format formatBuild = builder.setSampleMimeType(str).setSampleRate(outputAudioFormat.sampleRate).setChannelCount(outputAudioFormat.channelCount).setPcmEncoding(outputAudioFormat.encoding).setCodecs(format2.codecs).build();
        androidx.media3.transformer.Codec codecCreateForAudioEncoding = encoderFactory.createForAudioEncoding(formatBuild.buildUpon().setSampleMimeType(findSupportedMimeTypeForEncoderAndMuxer(formatBuild, muxerWrapper.getSupportedSampleMimeTypes(1))).build());
        this.encoder = codecCreateForAudioEncoding;
        this.encoderInputBuffer = new androidx.media3.decoder.DecoderInputBuffer(0);
        this.encoderOutputBuffer = new androidx.media3.decoder.DecoderInputBuffer(0);
        fallbackListener.onTransformationRequestFinalized(createFallbackTransformationRequest(transformationRequest, formatBuild, codecCreateForAudioEncoding.getConfigurationFormat()));
    }

    @Override // androidx.media3.transformer.SampleExporter
    public androidx.media3.transformer.AudioGraphInput getInput(androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.common.Format format, int i) throws androidx.media3.transformer.ExportException {
        if (!this.returnedFirstInput) {
            this.returnedFirstInput = true;
            androidx.media3.common.util.Assertions.checkState(format.equals(this.firstInputFormat));
            return this.firstInput;
        }
        return this.audioGraph.registerInput(editedMediaItem, format);
    }

    @Override // androidx.media3.transformer.SampleExporter
    public void release() {
        this.audioGraph.reset();
        this.encoder.release();
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected boolean processDataUpToMuxer() throws androidx.media3.transformer.ExportException {
        java.nio.ByteBuffer output = this.audioGraph.getOutput();
        if (!this.encoder.maybeDequeueInputBuffer(this.encoderInputBuffer)) {
            return false;
        }
        if (this.audioGraph.isEnded()) {
            androidx.media3.effect.DebugTraceUtil.logEvent(androidx.media3.effect.DebugTraceUtil.COMPONENT_AUDIO_GRAPH, androidx.media3.effect.DebugTraceUtil.EVENT_OUTPUT_ENDED, Long.MIN_VALUE);
            queueEndOfStreamToEncoder();
            return false;
        }
        if (!output.hasRemaining()) {
            return false;
        }
        feedEncoder(output);
        return true;
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected androidx.media3.common.Format getMuxerInputFormat() throws androidx.media3.transformer.ExportException {
        return this.encoder.getOutputFormat();
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected androidx.media3.decoder.DecoderInputBuffer getMuxerInputBuffer() throws androidx.media3.transformer.ExportException {
        this.encoderOutputBuffer.data = this.encoder.getOutputBuffer();
        if (this.encoderOutputBuffer.data == null) {
            return null;
        }
        this.encoderOutputBuffer.timeUs = ((android.media.MediaCodec.BufferInfo) androidx.media3.common.util.Assertions.checkNotNull(this.encoder.getOutputBufferInfo())).presentationTimeUs;
        this.encoderOutputBuffer.setFlags(1);
        return this.encoderOutputBuffer;
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected void releaseMuxerInputBuffer() throws androidx.media3.transformer.ExportException {
        this.encoder.releaseOutputBuffer(false);
    }

    @Override // androidx.media3.transformer.SampleExporter
    protected boolean isMuxerInputEnded() {
        return this.encoder.isEnded();
    }

    private void feedEncoder(java.nio.ByteBuffer byteBuffer) throws androidx.media3.transformer.ExportException {
        java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.encoderInputBuffer.data);
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(java.lang.Math.min(iLimit, byteBuffer.position() + byteBuffer2.capacity()));
        byteBuffer2.put(byteBuffer);
        this.encoderInputBuffer.timeUs = getOutputAudioDurationUs();
        this.encoderTotalInputBytes += (long) byteBuffer2.position();
        this.encoderInputBuffer.setFlags(0);
        this.encoderInputBuffer.flip();
        byteBuffer.limit(iLimit);
        this.encoder.queueInputBuffer(this.encoderInputBuffer);
    }

    private void queueEndOfStreamToEncoder() throws androidx.media3.transformer.ExportException {
        androidx.media3.common.util.Assertions.checkState(((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.encoderInputBuffer.data)).position() == 0);
        this.encoderInputBuffer.timeUs = getOutputAudioDurationUs();
        this.encoderInputBuffer.addFlag(4);
        this.encoderInputBuffer.flip();
        this.encoder.queueInputBuffer(this.encoderInputBuffer);
    }

    @org.checkerframework.dataflow.qual.Pure
    private static androidx.media3.transformer.TransformationRequest createFallbackTransformationRequest(androidx.media3.transformer.TransformationRequest transformationRequest, androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        return androidx.media3.common.util.Util.areEqual(format.sampleMimeType, format2.sampleMimeType) ? transformationRequest : transformationRequest.buildUpon().setAudioMimeType(format2.sampleMimeType).build();
    }

    private long getOutputAudioDurationUs() {
        return ((this.encoderTotalInputBytes / ((long) this.encoderInputAudioFormat.bytesPerFrame)) * 1000000) / ((long) this.encoderInputAudioFormat.sampleRate);
    }
}
