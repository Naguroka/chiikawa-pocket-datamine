package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
public interface Muxer {

    public interface Factory {
        androidx.media3.muxer.Muxer create(java.lang.String str) throws androidx.media3.muxer.Muxer.MuxerException;

        com.google.common.collect.ImmutableList<java.lang.String> getSupportedSampleMimeTypes(int i);
    }

    public interface TrackToken {
    }

    void addMetadataEntry(androidx.media3.common.Metadata.Entry entry);

    androidx.media3.muxer.Muxer.TrackToken addTrack(androidx.media3.common.Format format) throws androidx.media3.muxer.Muxer.MuxerException;

    void close() throws androidx.media3.muxer.Muxer.MuxerException;

    void writeSampleData(androidx.media3.muxer.Muxer.TrackToken trackToken, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) throws androidx.media3.muxer.Muxer.MuxerException;

    public static final class MuxerException extends java.lang.Exception {
        static {
            androidx.media3.common.MediaLibraryInfo.registerModule("media3.muxer");
        }

        public MuxerException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }
    }
}
