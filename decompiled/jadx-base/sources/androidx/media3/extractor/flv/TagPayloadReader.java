package androidx.media3.extractor.flv;

/* JADX INFO: loaded from: classes.dex */
abstract class TagPayloadReader {
    protected final androidx.media3.extractor.TrackOutput output;

    protected abstract boolean parseHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException;

    protected abstract boolean parsePayload(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j) throws androidx.media3.common.ParserException;

    public abstract void seek();

    public static final class UnsupportedFormatException extends androidx.media3.common.ParserException {
        public UnsupportedFormatException(java.lang.String str) {
            super(str, null, false, 1);
        }
    }

    protected TagPayloadReader(androidx.media3.extractor.TrackOutput trackOutput) {
        this.output = trackOutput;
    }

    public final boolean consume(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j) throws androidx.media3.common.ParserException {
        return parseHeader(parsableByteArray) && parsePayload(parsableByteArray, j);
    }
}
