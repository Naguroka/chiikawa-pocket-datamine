package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class EmptySampleStream implements androidx.media3.exoplayer.source.SampleStream {
    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() {
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j) {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
        decoderInputBuffer.setFlags(4);
        return -4;
    }
}
