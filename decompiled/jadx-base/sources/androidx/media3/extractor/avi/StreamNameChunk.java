package androidx.media3.extractor.avi;

/* JADX INFO: loaded from: classes.dex */
final class StreamNameChunk implements androidx.media3.extractor.avi.AviChunk {
    public final java.lang.String name;

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return androidx.media3.extractor.avi.AviExtractor.FOURCC_strn;
    }

    public static androidx.media3.extractor.avi.StreamNameChunk parseFrom(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        return new androidx.media3.extractor.avi.StreamNameChunk(parsableByteArray.readString(parsableByteArray.bytesLeft()));
    }

    private StreamNameChunk(java.lang.String str) {
        this.name = str;
    }
}
