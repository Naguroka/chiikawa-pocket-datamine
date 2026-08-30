package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class ExportResult {
    public static final int CONVERSION_PROCESS_NA = 0;
    public static final int CONVERSION_PROCESS_TRANSCODED = 1;
    public static final int CONVERSION_PROCESS_TRANSMUXED = 2;
    public static final int CONVERSION_PROCESS_TRANSMUXED_AND_TRANSCODED = 3;
    public static final int OPTIMIZATION_ABANDONED_KEYFRAME_PLACEMENT_OPTIMAL_FOR_TRIM = 2;
    public static final int OPTIMIZATION_ABANDONED_OTHER = 4;
    public static final int OPTIMIZATION_ABANDONED_TRIM_AND_TRANSCODING_TRANSFORMATION_REQUESTED = 3;
    public static final int OPTIMIZATION_FAILED_EXTRACTION_FAILED = 5;
    public static final int OPTIMIZATION_FAILED_FORMAT_MISMATCH = 6;
    public static final int OPTIMIZATION_NONE = 0;
    public static final int OPTIMIZATION_SUCCEEDED = 1;
    public final int audioConversionProcess;
    public final java.lang.String audioEncoderName;
    public final java.lang.String audioMimeType;
    public final int averageAudioBitrate;
    public final int averageVideoBitrate;
    public final int channelCount;
    public final androidx.media3.common.ColorInfo colorInfo;
    public final long durationMs;
    public final androidx.media3.transformer.ExportException exportException;
    public final long fileSizeBytes;
    public final int height;
    public final int optimizationResult;
    final com.google.common.collect.ImmutableList<androidx.media3.transformer.ExportResult.ProcessedInput> processedInputs;
    public final int sampleRate;
    public final int videoConversionProcess;
    public final java.lang.String videoEncoderName;
    public final int videoFrameCount;
    public final java.lang.String videoMimeType;
    public final int width;

    public static final class Builder {
        private java.lang.String audioEncoderName;
        private java.lang.String audioMimeType;
        private int averageAudioBitrate;
        private int averageVideoBitrate;
        private int channelCount;
        private androidx.media3.common.ColorInfo colorInfo;
        private long durationMs;
        private androidx.media3.transformer.ExportException exportException;
        private long fileSizeBytes;
        private int height;
        private int optimizationResult;
        private com.google.common.collect.ImmutableList.Builder<androidx.media3.transformer.ExportResult.ProcessedInput> processedInputsBuilder;
        private int sampleRate;
        private java.lang.String videoEncoderName;
        private int videoFrameCount;
        private java.lang.String videoMimeType;
        private int width;

        public Builder() {
            reset();
        }

        public androidx.media3.transformer.ExportResult.Builder addProcessedInputs(java.util.List<androidx.media3.transformer.ExportResult.ProcessedInput> list) {
            this.processedInputsBuilder.addAll((java.lang.Iterable<? extends androidx.media3.transformer.ExportResult.ProcessedInput>) list);
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setDurationMs(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j >= 0 || j == androidx.media3.common.C.TIME_UNSET);
            this.durationMs = j;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setFileSizeBytes(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j > 0 || j == -1, "Invalid file size = " + j);
            this.fileSizeBytes = j;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setAverageAudioBitrate(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0 || i == -2147483647);
            this.averageAudioBitrate = i;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setChannelCount(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0 || i == -1);
            this.channelCount = i;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setSampleRate(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0 || i == -2147483647);
            this.sampleRate = i;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setAudioEncoderName(java.lang.String str) {
            this.audioEncoderName = str;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setAudioMimeType(java.lang.String str) {
            this.audioMimeType = str;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setAverageVideoBitrate(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0 || i == -2147483647);
            this.averageVideoBitrate = i;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setColorInfo(androidx.media3.common.ColorInfo colorInfo) {
            this.colorInfo = colorInfo;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setHeight(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0 || i == -1);
            this.height = i;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setWidth(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0 || i == -1);
            this.width = i;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setVideoFrameCount(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 0);
            this.videoFrameCount = i;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setVideoEncoderName(java.lang.String str) {
            this.videoEncoderName = str;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setVideoMimeType(java.lang.String str) {
            this.videoMimeType = str;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setOptimizationResult(int i) {
            this.optimizationResult = i;
            return this;
        }

        public androidx.media3.transformer.ExportResult.Builder setExportException(androidx.media3.transformer.ExportException exportException) {
            this.exportException = exportException;
            return this;
        }

        public androidx.media3.transformer.ExportResult build() {
            return new androidx.media3.transformer.ExportResult(this.processedInputsBuilder.build(), this.durationMs, this.fileSizeBytes, this.averageAudioBitrate, this.channelCount, this.sampleRate, this.audioEncoderName, this.audioMimeType, this.averageVideoBitrate, this.colorInfo, this.height, this.width, this.videoFrameCount, this.videoEncoderName, this.videoMimeType, this.optimizationResult, this.exportException);
        }

        public void reset() {
            this.processedInputsBuilder = new com.google.common.collect.ImmutableList.Builder<>();
            this.durationMs = androidx.media3.common.C.TIME_UNSET;
            this.fileSizeBytes = -1L;
            this.averageAudioBitrate = androidx.media3.common.C.RATE_UNSET_INT;
            this.channelCount = -1;
            this.sampleRate = androidx.media3.common.C.RATE_UNSET_INT;
            this.audioEncoderName = null;
            this.averageVideoBitrate = androidx.media3.common.C.RATE_UNSET_INT;
            this.colorInfo = null;
            this.height = -1;
            this.width = -1;
            this.videoFrameCount = 0;
            this.videoEncoderName = null;
            this.optimizationResult = 0;
            this.exportException = null;
        }
    }

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

    private ExportResult(com.google.common.collect.ImmutableList<androidx.media3.transformer.ExportResult.ProcessedInput> immutableList, long j, long j2, int i, int i2, int i3, java.lang.String str, java.lang.String str2, int i4, androidx.media3.common.ColorInfo colorInfo, int i5, int i6, int i7, java.lang.String str3, java.lang.String str4, int i8, androidx.media3.transformer.ExportException exportException) {
        this.processedInputs = immutableList;
        this.durationMs = j;
        this.fileSizeBytes = j2;
        this.averageAudioBitrate = i;
        this.channelCount = i2;
        this.sampleRate = i3;
        this.audioEncoderName = str;
        this.audioMimeType = str2;
        this.averageVideoBitrate = i4;
        this.colorInfo = colorInfo;
        this.height = i5;
        this.width = i6;
        this.videoFrameCount = i7;
        this.videoEncoderName = str3;
        this.videoMimeType = str4;
        this.optimizationResult = i8;
        this.exportException = exportException;
        this.audioConversionProcess = getConversionProcess(str2, i8, immutableList, 1);
        this.videoConversionProcess = getConversionProcess(str4, i8, immutableList, 2);
    }

    public androidx.media3.transformer.ExportResult.Builder buildUpon() {
        return new androidx.media3.transformer.ExportResult.Builder().addProcessedInputs(this.processedInputs).setDurationMs(this.durationMs).setFileSizeBytes(this.fileSizeBytes).setAverageAudioBitrate(this.averageAudioBitrate).setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setAudioEncoderName(this.audioEncoderName).setAudioMimeType(this.audioMimeType).setAverageVideoBitrate(this.averageVideoBitrate).setColorInfo(this.colorInfo).setHeight(this.height).setWidth(this.width).setVideoFrameCount(this.videoFrameCount).setVideoEncoderName(this.videoEncoderName).setVideoMimeType(this.videoMimeType).setOptimizationResult(this.optimizationResult).setExportException(this.exportException);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.transformer.ExportResult)) {
            return false;
        }
        androidx.media3.transformer.ExportResult exportResult = (androidx.media3.transformer.ExportResult) obj;
        return java.util.Objects.equals(this.processedInputs, exportResult.processedInputs) && this.durationMs == exportResult.durationMs && this.fileSizeBytes == exportResult.fileSizeBytes && this.averageAudioBitrate == exportResult.averageAudioBitrate && this.channelCount == exportResult.channelCount && this.sampleRate == exportResult.sampleRate && java.util.Objects.equals(this.audioEncoderName, exportResult.audioEncoderName) && java.util.Objects.equals(this.audioMimeType, exportResult.audioMimeType) && this.averageVideoBitrate == exportResult.averageVideoBitrate && java.util.Objects.equals(this.colorInfo, exportResult.colorInfo) && this.height == exportResult.height && this.width == exportResult.width && this.videoFrameCount == exportResult.videoFrameCount && java.util.Objects.equals(this.videoEncoderName, exportResult.videoEncoderName) && java.util.Objects.equals(this.videoMimeType, exportResult.videoMimeType) && this.optimizationResult == exportResult.optimizationResult && java.util.Objects.equals(this.exportException, exportResult.exportException);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((java.util.Objects.hashCode(this.processedInputs) * 31) + ((int) this.durationMs)) * 31) + ((int) this.fileSizeBytes)) * 31) + this.averageAudioBitrate) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + java.util.Objects.hashCode(this.audioEncoderName)) * 31) + java.util.Objects.hashCode(this.audioMimeType)) * 31) + this.averageVideoBitrate) * 31) + java.util.Objects.hashCode(this.colorInfo)) * 31) + this.height) * 31) + this.width) * 31) + this.videoFrameCount) * 31) + java.util.Objects.hashCode(this.videoEncoderName)) * 31) + java.util.Objects.hashCode(this.videoMimeType)) * 31) + this.optimizationResult) * 31) + java.util.Objects.hashCode(this.exportException);
    }

    private static int getConversionProcess(java.lang.String str, int i, java.util.List<androidx.media3.transformer.ExportResult.ProcessedInput> list, int i2) {
        java.lang.String str2;
        int i3 = 0;
        if (str == null) {
            return 0;
        }
        if (i == 1) {
            return i2 == 1 ? 2 : 3;
        }
        for (androidx.media3.transformer.ExportResult.ProcessedInput processedInput : list) {
            if (i2 == 1) {
                str2 = processedInput.audioDecoderName;
            } else {
                str2 = processedInput.videoDecoderName;
            }
            if (str2 == null) {
                if (i3 == 1) {
                    return 3;
                }
                i3 = 2;
            } else {
                if (i3 == 2) {
                    return 3;
                }
                i3 = 1;
            }
        }
        return i3;
    }
}
