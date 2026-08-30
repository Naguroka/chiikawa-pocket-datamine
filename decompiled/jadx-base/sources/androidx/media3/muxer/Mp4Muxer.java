package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4Muxer implements androidx.media3.muxer.Muxer {
    public static final int LAST_FRAME_DURATION_BEHAVIOR_DUPLICATE_PREV_DURATION = 1;
    public static final int LAST_FRAME_DURATION_BEHAVIOR_INSERT_SHORT_FRAME = 0;
    private final androidx.media3.muxer.MetadataCollector metadataCollector;
    private final androidx.media3.muxer.Mp4Writer mp4Writer;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LastFrameDurationBehavior {
    }

    public static final class Builder {
        private androidx.media3.muxer.AnnexBToAvccConverter annexBToAvccConverter;
        private final java.io.FileOutputStream fileOutputStream;
        private int lastFrameDurationBehavior = 0;
        private boolean sampleCopyEnabled = true;
        private boolean attemptStreamableOutputEnabled = true;

        public Builder(java.io.FileOutputStream fileOutputStream) {
            this.fileOutputStream = (java.io.FileOutputStream) androidx.media3.common.util.Assertions.checkNotNull(fileOutputStream);
        }

        public androidx.media3.muxer.Mp4Muxer.Builder setLastFrameDurationBehavior(int i) {
            this.lastFrameDurationBehavior = i;
            return this;
        }

        public androidx.media3.muxer.Mp4Muxer.Builder setAnnexBToAvccConverter(androidx.media3.muxer.AnnexBToAvccConverter annexBToAvccConverter) {
            this.annexBToAvccConverter = annexBToAvccConverter;
            return this;
        }

        public androidx.media3.muxer.Mp4Muxer.Builder setSampleCopyEnabled(boolean z) {
            this.sampleCopyEnabled = z;
            return this;
        }

        public androidx.media3.muxer.Mp4Muxer.Builder setAttemptStreamableOutputEnabled(boolean z) {
            this.attemptStreamableOutputEnabled = z;
            return this;
        }

        public androidx.media3.muxer.Mp4Muxer build() {
            androidx.media3.muxer.MetadataCollector metadataCollector = new androidx.media3.muxer.MetadataCollector();
            androidx.media3.muxer.Mp4MoovStructure mp4MoovStructure = new androidx.media3.muxer.Mp4MoovStructure(metadataCollector, this.lastFrameDurationBehavior);
            java.io.FileOutputStream fileOutputStream = this.fileOutputStream;
            androidx.media3.muxer.AnnexBToAvccConverter annexBToAvccConverter = this.annexBToAvccConverter;
            if (annexBToAvccConverter == null) {
                annexBToAvccConverter = androidx.media3.muxer.AnnexBToAvccConverter.DEFAULT;
            }
            return new androidx.media3.muxer.Mp4Muxer(new androidx.media3.muxer.Mp4Writer(fileOutputStream, mp4MoovStructure, annexBToAvccConverter, this.sampleCopyEnabled, this.attemptStreamableOutputEnabled), metadataCollector);
        }
    }

    private Mp4Muxer(androidx.media3.muxer.Mp4Writer mp4Writer, androidx.media3.muxer.MetadataCollector metadataCollector) {
        this.mp4Writer = mp4Writer;
        this.metadataCollector = metadataCollector;
    }

    @Override // androidx.media3.muxer.Muxer
    public androidx.media3.muxer.Muxer.TrackToken addTrack(androidx.media3.common.Format format) {
        return addTrack(1, format);
    }

    public androidx.media3.muxer.Muxer.TrackToken addTrack(int i, androidx.media3.common.Format format) {
        return this.mp4Writer.addTrack(i, format);
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(androidx.media3.muxer.Muxer.TrackToken trackToken, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) throws androidx.media3.muxer.Muxer.MuxerException {
        try {
            this.mp4Writer.writeSampleData(trackToken, byteBuffer, bufferInfo);
        } catch (java.io.IOException e) {
            throw new androidx.media3.muxer.Muxer.MuxerException("Failed to write sample for presentationTimeUs=" + bufferInfo.presentationTimeUs + ", size=" + bufferInfo.size, e);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(androidx.media3.common.Metadata.Entry entry) {
        androidx.media3.common.util.Assertions.checkArgument(androidx.media3.muxer.Mp4Utils.isMetadataSupported(entry), "Unsupported metadata");
        this.metadataCollector.addMetadata(entry);
    }

    @Override // androidx.media3.muxer.Muxer
    public void close() throws androidx.media3.muxer.Muxer.MuxerException {
        try {
            this.mp4Writer.close();
        } catch (java.io.IOException e) {
            throw new androidx.media3.muxer.Muxer.MuxerException("Failed to close the muxer", e);
        }
    }
}
