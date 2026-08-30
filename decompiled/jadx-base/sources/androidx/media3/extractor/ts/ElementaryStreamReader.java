package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public interface ElementaryStreamReader {
    void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException;

    void createTracks(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator);

    void packetFinished(boolean z);

    void packetStarted(long j, int i);

    void seek();
}
