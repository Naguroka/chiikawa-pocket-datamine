package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentedMp4Muxer implements androidx.media3.muxer.Muxer {
    public static final long DEFAULT_FRAGMENT_DURATION_MS = 2000;
    private final androidx.media3.muxer.FragmentedMp4Writer fragmentedMp4Writer;
    private final androidx.media3.muxer.MetadataCollector metadataCollector;

    public static final class Builder {
        private final java.io.FileOutputStream fileOutputStream;
        private long fragmentDurationMs = 2000;
        private boolean sampleCopyEnabled = true;

        public Builder(java.io.FileOutputStream fileOutputStream) {
            this.fileOutputStream = fileOutputStream;
        }

        public androidx.media3.muxer.FragmentedMp4Muxer.Builder setFragmentDurationMs(long j) {
            this.fragmentDurationMs = j;
            return this;
        }

        public androidx.media3.muxer.FragmentedMp4Muxer.Builder setSampleCopyEnabled(boolean z) {
            this.sampleCopyEnabled = z;
            return this;
        }

        public androidx.media3.muxer.FragmentedMp4Muxer build() {
            return new androidx.media3.muxer.FragmentedMp4Muxer(this.fileOutputStream, this.fragmentDurationMs, this.sampleCopyEnabled);
        }
    }

    private FragmentedMp4Muxer(java.io.FileOutputStream fileOutputStream, long j, boolean z) {
        androidx.media3.common.util.Assertions.checkNotNull(fileOutputStream);
        androidx.media3.muxer.MetadataCollector metadataCollector = new androidx.media3.muxer.MetadataCollector();
        this.metadataCollector = metadataCollector;
        this.fragmentedMp4Writer = new androidx.media3.muxer.FragmentedMp4Writer(fileOutputStream, new androidx.media3.muxer.Mp4MoovStructure(metadataCollector, 1), androidx.media3.muxer.AnnexBToAvccConverter.DEFAULT, j, z);
    }

    @Override // androidx.media3.muxer.Muxer
    public androidx.media3.muxer.Muxer.TrackToken addTrack(androidx.media3.common.Format format) {
        return this.fragmentedMp4Writer.addTrack(1, format);
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(androidx.media3.muxer.Muxer.TrackToken trackToken, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) throws androidx.media3.muxer.Muxer.MuxerException {
        try {
            this.fragmentedMp4Writer.writeSampleData(trackToken, byteBuffer, bufferInfo);
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
            this.fragmentedMp4Writer.close();
        } catch (java.io.IOException e) {
            throw new androidx.media3.muxer.Muxer.MuxerException("Failed to close the muxer", e);
        }
    }
}
