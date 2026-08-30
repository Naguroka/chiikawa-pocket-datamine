package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class ExperimentalAnalyzerModeFactory {
    private ExperimentalAnalyzerModeFactory() {
    }

    public static androidx.media3.transformer.Transformer buildAnalyzer(android.content.Context context) {
        return buildAnalyzer(context, new androidx.media3.transformer.Transformer.Builder(context).build());
    }

    public static androidx.media3.transformer.Transformer buildAnalyzer(android.content.Context context, androidx.media3.transformer.Transformer transformer) {
        return transformer.buildUpon().experimentalSetTrimOptimizationEnabled(false).setEncoderFactory(new androidx.media3.transformer.ExperimentalAnalyzerModeFactory.DroppingEncoder.Factory(context)).setMaxDelayBetweenMuxerSamplesMs(androidx.media3.common.C.TIME_UNSET).setMuxerFactory(new androidx.media3.transformer.ExperimentalAnalyzerModeFactory.NoWriteMuxer.Factory(com.google.common.collect.ImmutableList.of(androidx.media3.common.MimeTypes.AUDIO_AAC), com.google.common.collect.ImmutableList.of("video/avc"))).setAudioMimeType(androidx.media3.common.MimeTypes.AUDIO_AAC).setVideoMimeType("video/avc").build();
    }

    private static final class DroppingEncoder implements androidx.media3.transformer.Codec {
        private static final int INTERNAL_BUFFER_SIZE = 8196;
        private static final java.lang.String TAG = "DroppingEncoder";
        private final java.nio.ByteBuffer buffer = java.nio.ByteBuffer.allocateDirect(INTERNAL_BUFFER_SIZE).order(java.nio.ByteOrder.nativeOrder());
        private final androidx.media3.common.Format configurationFormat;
        private final android.content.Context context;
        private boolean inputStreamEnded;

        @Override // androidx.media3.transformer.Codec
        public java.lang.String getName() {
            return TAG;
        }

        @Override // androidx.media3.transformer.Codec
        public java.nio.ByteBuffer getOutputBuffer() {
            return null;
        }

        @Override // androidx.media3.transformer.Codec
        public android.media.MediaCodec.BufferInfo getOutputBufferInfo() {
            return null;
        }

        @Override // androidx.media3.transformer.Codec
        public void release() {
        }

        @Override // androidx.media3.transformer.Codec
        public void releaseOutputBuffer(long j) {
        }

        @Override // androidx.media3.transformer.Codec
        public void releaseOutputBuffer(boolean z) {
        }

        public static final class Factory implements androidx.media3.transformer.Codec.EncoderFactory {
            private final android.content.Context context;

            public Factory(android.content.Context context) {
                this.context = context;
            }

            @Override // androidx.media3.transformer.Codec.EncoderFactory
            public androidx.media3.transformer.Codec createForAudioEncoding(androidx.media3.common.Format format) {
                return new androidx.media3.transformer.ExperimentalAnalyzerModeFactory.DroppingEncoder(this.context, format);
            }

            @Override // androidx.media3.transformer.Codec.EncoderFactory
            public androidx.media3.transformer.Codec createForVideoEncoding(androidx.media3.common.Format format) {
                return new androidx.media3.transformer.ExperimentalAnalyzerModeFactory.DroppingEncoder(this.context, format);
            }
        }

        public DroppingEncoder(android.content.Context context, androidx.media3.common.Format format) {
            this.context = context;
            this.configurationFormat = format;
        }

        @Override // androidx.media3.transformer.Codec
        public androidx.media3.common.Format getConfigurationFormat() {
            return this.configurationFormat;
        }

        @Override // androidx.media3.transformer.Codec
        public android.view.Surface getInputSurface() {
            return androidx.media3.exoplayer.video.PlaceholderSurface.newInstance(this.context, false);
        }

        @Override // androidx.media3.transformer.Codec
        @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1.data"}, result = true)
        public boolean maybeDequeueInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
            if (this.inputStreamEnded) {
                return false;
            }
            decoderInputBuffer.data = this.buffer;
            return true;
        }

        @Override // androidx.media3.transformer.Codec
        public void queueInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
            androidx.media3.common.util.Assertions.checkState(!this.inputStreamEnded, "Input buffer can not be queued after the input stream has ended.");
            if (decoderInputBuffer.isEndOfStream()) {
                this.inputStreamEnded = true;
            }
            decoderInputBuffer.clear();
            decoderInputBuffer.data = null;
        }

        @Override // androidx.media3.transformer.Codec
        public void signalEndOfInputStream() {
            this.inputStreamEnded = true;
        }

        @Override // androidx.media3.transformer.Codec
        public androidx.media3.common.Format getOutputFormat() {
            return this.configurationFormat;
        }

        @Override // androidx.media3.transformer.Codec
        public boolean isEnded() {
            return this.inputStreamEnded;
        }
    }

    private static final class NoWriteMuxer implements androidx.media3.muxer.Muxer {
        @Override // androidx.media3.muxer.Muxer
        public void addMetadataEntry(androidx.media3.common.Metadata.Entry entry) {
        }

        @Override // androidx.media3.muxer.Muxer
        public void close() {
        }

        @Override // androidx.media3.muxer.Muxer
        public void writeSampleData(androidx.media3.muxer.Muxer.TrackToken trackToken, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        }

        private NoWriteMuxer() {
        }

        public static final class Factory implements androidx.media3.muxer.Muxer.Factory {
            private final com.google.common.collect.ImmutableList<java.lang.String> audioMimeTypes;
            private final com.google.common.collect.ImmutableList<java.lang.String> videoMimeTypes;

            public Factory(com.google.common.collect.ImmutableList<java.lang.String> immutableList, com.google.common.collect.ImmutableList<java.lang.String> immutableList2) {
                this.audioMimeTypes = immutableList;
                this.videoMimeTypes = immutableList2;
            }

            @Override // androidx.media3.muxer.Muxer.Factory
            public androidx.media3.muxer.Muxer create(java.lang.String str) {
                return new androidx.media3.transformer.ExperimentalAnalyzerModeFactory.NoWriteMuxer();
            }

            @Override // androidx.media3.muxer.Muxer.Factory
            public com.google.common.collect.ImmutableList<java.lang.String> getSupportedSampleMimeTypes(int i) {
                if (i == 1) {
                    return this.audioMimeTypes;
                }
                if (i == 2) {
                    return this.videoMimeTypes;
                }
                return com.google.common.collect.ImmutableList.of();
            }
        }

        @Override // androidx.media3.muxer.Muxer
        public androidx.media3.muxer.Muxer.TrackToken addTrack(androidx.media3.common.Format format) {
            return new androidx.media3.muxer.Muxer.TrackToken() { // from class: androidx.media3.transformer.ExperimentalAnalyzerModeFactory.NoWriteMuxer.1
            };
        }
    }
}
