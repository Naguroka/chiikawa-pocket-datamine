package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public interface SectionPayloadReader {
    void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray);

    void init(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator);
}
