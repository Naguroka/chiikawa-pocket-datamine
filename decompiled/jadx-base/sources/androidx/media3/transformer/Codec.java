package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public interface Codec {

    public interface DecoderFactory {
        androidx.media3.transformer.Codec createForAudioDecoding(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException;

        androidx.media3.transformer.Codec createForVideoDecoding(androidx.media3.common.Format format, android.view.Surface surface, boolean z) throws androidx.media3.transformer.ExportException;
    }

    public interface EncoderFactory {
        default boolean audioNeedsEncoding() {
            return false;
        }

        androidx.media3.transformer.Codec createForAudioEncoding(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException;

        androidx.media3.transformer.Codec createForVideoEncoding(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException;

        default boolean videoNeedsEncoding() {
            return false;
        }
    }

    androidx.media3.common.Format getConfigurationFormat();

    android.view.Surface getInputSurface();

    default int getMaxPendingFrameCount() {
        return 5;
    }

    java.lang.String getName();

    java.nio.ByteBuffer getOutputBuffer() throws androidx.media3.transformer.ExportException;

    android.media.MediaCodec.BufferInfo getOutputBufferInfo() throws androidx.media3.transformer.ExportException;

    androidx.media3.common.Format getOutputFormat() throws androidx.media3.transformer.ExportException;

    boolean isEnded();

    boolean maybeDequeueInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) throws androidx.media3.transformer.ExportException;

    void queueInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) throws androidx.media3.transformer.ExportException;

    void release();

    void releaseOutputBuffer(long j) throws androidx.media3.transformer.ExportException;

    void releaseOutputBuffer(boolean z) throws androidx.media3.transformer.ExportException;

    void signalEndOfInputStream() throws androidx.media3.transformer.ExportException;
}
