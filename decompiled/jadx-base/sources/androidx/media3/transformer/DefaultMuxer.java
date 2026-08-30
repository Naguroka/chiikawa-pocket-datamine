package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultMuxer implements androidx.media3.muxer.Muxer {
    private final androidx.media3.muxer.Muxer muxer;

    public static final class Factory implements androidx.media3.muxer.Muxer.Factory {
        private final androidx.media3.muxer.Muxer.Factory muxerFactory;

        public Factory() {
            this(androidx.media3.common.C.TIME_UNSET);
        }

        public Factory(long j) {
            this.muxerFactory = new androidx.media3.transformer.FrameworkMuxer.Factory(j);
        }

        @Override // androidx.media3.muxer.Muxer.Factory
        public androidx.media3.muxer.Muxer create(java.lang.String str) throws androidx.media3.muxer.Muxer.MuxerException {
            return new androidx.media3.transformer.DefaultMuxer(this.muxerFactory.create(str));
        }

        @Override // androidx.media3.muxer.Muxer.Factory
        public com.google.common.collect.ImmutableList<java.lang.String> getSupportedSampleMimeTypes(int i) {
            return this.muxerFactory.getSupportedSampleMimeTypes(i);
        }
    }

    private DefaultMuxer(androidx.media3.muxer.Muxer muxer) {
        this.muxer = muxer;
    }

    @Override // androidx.media3.muxer.Muxer
    public androidx.media3.muxer.Muxer.TrackToken addTrack(androidx.media3.common.Format format) throws androidx.media3.muxer.Muxer.MuxerException {
        return this.muxer.addTrack(format);
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(androidx.media3.muxer.Muxer.TrackToken trackToken, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) throws androidx.media3.muxer.Muxer.MuxerException {
        this.muxer.writeSampleData(trackToken, byteBuffer, bufferInfo);
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(androidx.media3.common.Metadata.Entry entry) {
        this.muxer.addMetadataEntry(entry);
    }

    @Override // androidx.media3.muxer.Muxer
    public void close() throws androidx.media3.muxer.Muxer.MuxerException {
        this.muxer.close();
    }
}
