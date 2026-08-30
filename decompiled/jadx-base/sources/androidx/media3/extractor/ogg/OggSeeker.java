package androidx.media3.extractor.ogg;

/* JADX INFO: loaded from: classes.dex */
interface OggSeeker {
    androidx.media3.extractor.SeekMap createSeekMap();

    long read(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException;

    void startSeek(long j);
}
