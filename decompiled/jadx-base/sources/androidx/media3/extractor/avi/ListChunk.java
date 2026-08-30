package androidx.media3.extractor.avi;

/* JADX INFO: loaded from: classes.dex */
final class ListChunk implements androidx.media3.extractor.avi.AviChunk {
    public final com.google.common.collect.ImmutableList<androidx.media3.extractor.avi.AviChunk> children;
    private final int type;

    public static androidx.media3.extractor.avi.ListChunk parseFrom(int i, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        androidx.media3.extractor.avi.AviChunk aviChunkCreateBox;
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        int iLimit = parsableByteArray.limit();
        int trackType = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            if (littleEndianInt == 1414744396) {
                aviChunkCreateBox = parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray);
            } else {
                aviChunkCreateBox = createBox(littleEndianInt, trackType, parsableByteArray);
            }
            if (aviChunkCreateBox != null) {
                if (aviChunkCreateBox.getType() == 1752331379) {
                    trackType = ((androidx.media3.extractor.avi.AviStreamHeaderChunk) aviChunkCreateBox).getTrackType();
                }
                builder.add(aviChunkCreateBox);
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(iLimit);
        }
        return new androidx.media3.extractor.avi.ListChunk(i, builder.build());
    }

    private ListChunk(int i, com.google.common.collect.ImmutableList<androidx.media3.extractor.avi.AviChunk> immutableList) {
        this.type = i;
        this.children = immutableList;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return this.type;
    }

    public <T extends androidx.media3.extractor.avi.AviChunk> T getChild(java.lang.Class<T> cls) {
        com.google.common.collect.UnmodifiableIterator<androidx.media3.extractor.avi.AviChunk> it = this.children.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    private static androidx.media3.extractor.avi.AviChunk createBox(int i, int i2, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        switch (i) {
            case androidx.media3.extractor.avi.AviExtractor.FOURCC_strf /* 1718776947 */:
                return androidx.media3.extractor.avi.StreamFormatChunk.parseFrom(i2, parsableByteArray);
            case androidx.media3.extractor.avi.AviExtractor.FOURCC_avih /* 1751742049 */:
                return androidx.media3.extractor.avi.AviMainHeaderChunk.parseFrom(parsableByteArray);
            case androidx.media3.extractor.avi.AviExtractor.FOURCC_strh /* 1752331379 */:
                return androidx.media3.extractor.avi.AviStreamHeaderChunk.parseFrom(parsableByteArray);
            case androidx.media3.extractor.avi.AviExtractor.FOURCC_strn /* 1852994675 */:
                return androidx.media3.extractor.avi.StreamNameChunk.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }
}
