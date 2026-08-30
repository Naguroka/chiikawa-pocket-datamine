package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public interface Decoder<I, O, E extends androidx.media3.decoder.DecoderException> {
    I dequeueInputBuffer() throws androidx.media3.decoder.DecoderException;

    O dequeueOutputBuffer() throws androidx.media3.decoder.DecoderException;

    void flush();

    java.lang.String getName();

    void queueInputBuffer(I i) throws androidx.media3.decoder.DecoderException;

    void release();

    void setOutputStartTimeUs(long j);
}
