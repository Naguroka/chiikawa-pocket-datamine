package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public final class TransformationResult {
    public final java.lang.String audioEncoderName;
    public final int averageAudioBitrate;
    public final int averageVideoBitrate;
    public final int channelCount;
    public final androidx.media3.common.ColorInfo colorInfo;
    public final long durationMs;
    public final long fileSizeBytes;
    public final int height;
    public final com.google.common.collect.ImmutableList<androidx.media3.transformer.TransformationResult.ProcessedInput> processedInputs;
    public final int sampleRate;
    public final androidx.media3.transformer.TransformationException transformationException;
    public final java.lang.String videoEncoderName;
    public final int videoFrameCount;
    public final int width;

    @java.lang.Deprecated
    public static final class Builder {
        private java.lang.String audioEncoderName;
        private int averageAudioBitrate;
        private int averageVideoBitrate;
        private int channelCount;
        androidx.media3.common.ColorInfo colorInfo;
        private long durationMs;
        private long fileSizeBytes;
        private int height;
        private com.google.common.collect.ImmutableList<androidx.media3.transformer.TransformationResult.ProcessedInput> processedInputs;
        private int sampleRate;
        private androidx.media3.transformer.TransformationException transformationException;
        private java.lang.String videoEncoderName;
        private int videoFrameCount;
        private int width;

        public Builder() {
            this.processedInputs = com.google.common.collect.ImmutableList.of();
            this.durationMs = androidx.media3.common.C.TIME_UNSET;
            this.fileSizeBytes = -1L;
            this.averageAudioBitrate = androidx.media3.common.C.RATE_UNSET_INT;
            this.channelCount = -1;
            this.sampleRate = androidx.media3.common.C.RATE_UNSET_INT;
            this.averageVideoBitrate = androidx.media3.common.C.RATE_UNSET_INT;
            this.height = -1;
            this.width = -1;
        }

        Builder(androidx.media3.transformer.ExportResult exportResult) {
            com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
            for (int i = 0; i < exportResult.processedInputs.size(); i++) {
                androidx.media3.transformer.ExportResult.ProcessedInput processedInput = exportResult.processedInputs.get(i);
                builder.add(new androidx.media3.transformer.TransformationResult.ProcessedInput(processedInput.mediaItem, processedInput.audioDecoderName, processedInput.videoDecoderName));
            }
            this.processedInputs = builder.build();
            this.durationMs = exportResult.durationMs;
            this.fileSizeBytes = exportResult.fileSizeBytes;
            this.averageAudioBitrate = exportResult.averageAudioBitrate;
            this.channelCount = exportResult.channelCount;
            this.sampleRate = exportResult.sampleRate;
            this.audioEncoderName = exportResult.audioEncoderName;
            this.averageVideoBitrate = exportResult.averageVideoBitrate;
            this.colorInfo = exportResult.colorInfo;
            this.height = exportResult.height;
            this.width = exportResult.width;
            this.videoFrameCount = exportResult.videoFrameCount;
            this.videoEncoderName = exportResult.videoEncoderName;
            if (exportResult.exportException != null) {
                this.transformationException = new androidx.media3.transformer.TransformationException(exportResult.exportException);
            }
        }

        public androidx.media3.transformer.TransformationResult.Builder setProcessedInputs(com.google.common.collect.ImmutableList<androidx.media3.transformer.TransformationResult.ProcessedInput> immutableList) {
            this.processedInputs = immutableList;
            return this;
        }

        public androidx.media3.transformer.TransformationResult.Builder setDurationMs(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j >= 0 || j == androidx.media3.common.C.TIME_UNSET);
            this.durationMs = j;
            return this;
        }

        public androidx.media3.transformer.TransformationResult.Builder setFileSizeBytes(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j > 0 || j == -1);
            this.fileSizeBytes = j;
            return this;
        }

        public androidx.media3.transformer.TransformationResult.Builder setAverageAudioBitrate(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0 || i == -2147483647);
            this.averageAudioBitrate = i;
            return this;
        }

        public androidx.media3.transformer.TransformationResult.Builder setChannelCount(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0 || i == -1);
            this.channelCount = i;
            return this;
        }

        public androidx.media3.transformer.TransformationResult.Builder setSampleRate(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0 || i == -2147483647);
            this.sampleRate = i;
            return this;
        }

        public androidx.media3.transformer.TransformationResult.Builder setAudioEncoderName(java.lang.String str) {
            this.audioEncoderName = str;
            return this;
        }

        public androidx.media3.transformer.TransformationResult.Builder setAverageVideoBitrate(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0 || i == -2147483647);
            this.averageVideoBitrate = i;
            return this;
        }

        public androidx.media3.transformer.TransformationResult.Builder setColorInfo(androidx.media3.common.ColorInfo colorInfo) {
            this.colorInfo = colorInfo;
            return this;
        }

        public androidx.media3.transformer.TransformationResult.Builder setHeight(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0 || i == -1);
            this.height = i;
            return this;
        }

        public androidx.media3.transformer.TransformationResult.Builder setWidth(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0 || i == -1);
            this.width = i;
            return this;
        }

        public androidx.media3.transformer.TransformationResult.Builder setVideoFrameCount(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0);
            this.videoFrameCount = i;
            return this;
        }

        public androidx.media3.transformer.TransformationResult.Builder setVideoEncoderName(java.lang.String str) {
            this.videoEncoderName = str;
            return this;
        }

        public androidx.media3.transformer.TransformationResult.Builder setTransformationException(androidx.media3.transformer.TransformationException transformationException) {
            this.transformationException = transformationException;
            return this;
        }

        public androidx.media3.transformer.TransformationResult build() {
            return new androidx.media3.transformer.TransformationResult(this.processedInputs, this.durationMs, this.fileSizeBytes, this.averageAudioBitrate, this.channelCount, this.sampleRate, this.audioEncoderName, this.averageVideoBitrate, this.colorInfo, this.height, this.width, this.videoFrameCount, this.videoEncoderName, this.transformationException);
        }
    }

    @java.lang.Deprecated
    public static final class ProcessedInput {
        public final java.lang.String audioDecoderName;
        public final androidx.media3.common.MediaItem mediaItem;
        public final java.lang.String videoDecoderName;

        public ProcessedInput(androidx.media3.common.MediaItem mediaItem, java.lang.String str, java.lang.String str2) {
            this.mediaItem = mediaItem;
            this.audioDecoderName = str;
            this.videoDecoderName = str2;
        }
    }

    private TransformationResult(com.google.common.collect.ImmutableList<androidx.media3.transformer.TransformationResult.ProcessedInput> immutableList, long j, long j2, int i, int i2, int i3, java.lang.String str, int i4, androidx.media3.common.ColorInfo colorInfo, int i5, int i6, int i7, java.lang.String str2, androidx.media3.transformer.TransformationException transformationException) {
        this.processedInputs = immutableList;
        this.durationMs = j;
        this.fileSizeBytes = j2;
        this.averageAudioBitrate = i;
        this.channelCount = i2;
        this.sampleRate = i3;
        this.audioEncoderName = str;
        this.averageVideoBitrate = i4;
        this.colorInfo = colorInfo;
        this.height = i5;
        this.width = i6;
        this.videoFrameCount = i7;
        this.videoEncoderName = str2;
        this.transformationException = transformationException;
    }

    public androidx.media3.transformer.TransformationResult.Builder buildUpon() {
        return new androidx.media3.transformer.TransformationResult.Builder().setProcessedInputs(this.processedInputs).setDurationMs(this.durationMs).setFileSizeBytes(this.fileSizeBytes).setAverageAudioBitrate(this.averageAudioBitrate).setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setAudioEncoderName(this.audioEncoderName).setAverageVideoBitrate(this.averageVideoBitrate).setColorInfo(this.colorInfo).setHeight(this.height).setWidth(this.width).setVideoFrameCount(this.videoFrameCount).setVideoEncoderName(this.videoEncoderName).setTransformationException(this.transformationException);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.transformer.TransformationResult)) {
            return false;
        }
        androidx.media3.transformer.TransformationResult transformationResult = (androidx.media3.transformer.TransformationResult) obj;
        return java.util.Objects.equals(this.processedInputs, transformationResult.processedInputs) && this.durationMs == transformationResult.durationMs && this.fileSizeBytes == transformationResult.fileSizeBytes && this.averageAudioBitrate == transformationResult.averageAudioBitrate && this.channelCount == transformationResult.channelCount && this.sampleRate == transformationResult.sampleRate && java.util.Objects.equals(this.audioEncoderName, transformationResult.audioEncoderName) && this.averageVideoBitrate == transformationResult.averageVideoBitrate && java.util.Objects.equals(this.colorInfo, transformationResult.colorInfo) && this.height == transformationResult.height && this.width == transformationResult.width && this.videoFrameCount == transformationResult.videoFrameCount && java.util.Objects.equals(this.videoEncoderName, transformationResult.videoEncoderName) && java.util.Objects.equals(this.transformationException, transformationResult.transformationException);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((java.util.Objects.hashCode(this.processedInputs) * 31) + ((int) this.durationMs)) * 31) + ((int) this.fileSizeBytes)) * 31) + this.averageAudioBitrate) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + java.util.Objects.hashCode(this.audioEncoderName)) * 31) + this.averageVideoBitrate) * 31) + java.util.Objects.hashCode(this.colorInfo)) * 31) + this.height) * 31) + this.width) * 31) + this.videoFrameCount) * 31) + java.util.Objects.hashCode(this.videoEncoderName)) * 31) + java.util.Objects.hashCode(this.transformationException);
    }
}
