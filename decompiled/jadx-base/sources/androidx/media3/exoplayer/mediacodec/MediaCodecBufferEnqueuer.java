package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
interface MediaCodecBufferEnqueuer {
    void flush();

    void maybeThrowException();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void queueSecureInputBuffer(int i, int i2, androidx.media3.decoder.CryptoInfo cryptoInfo, long j, int i3);

    void setParameters(android.os.Bundle bundle);

    void shutdown();

    void start();

    void waitUntilQueueingComplete() throws java.lang.InterruptedException;
}
