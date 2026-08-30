package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataList extends androidx.emoji2.text.flatbuffer.Table {
    public static void ValidateVersion() {
        androidx.emoji2.text.flatbuffer.Constants.FLATBUFFERS_1_12_0();
    }

    public static androidx.emoji2.text.flatbuffer.MetadataList getRootAsMetadataList(java.nio.ByteBuffer byteBuffer) {
        return getRootAsMetadataList(byteBuffer, new androidx.emoji2.text.flatbuffer.MetadataList());
    }

    public static androidx.emoji2.text.flatbuffer.MetadataList getRootAsMetadataList(java.nio.ByteBuffer byteBuffer, androidx.emoji2.text.flatbuffer.MetadataList metadataList) {
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return metadataList.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public void __init(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public androidx.emoji2.text.flatbuffer.MetadataList __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public int version() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem list(int i) {
        return list(new androidx.emoji2.text.flatbuffer.MetadataItem(), i);
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem list(androidx.emoji2.text.flatbuffer.MetadataItem metadataItem, int i) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return metadataItem.__assign(__indirect(__vector(i__offset) + (i * 4)), this.bb);
        }
        return null;
    }

    public int listLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem.Vector listVector() {
        return listVector(new androidx.emoji2.text.flatbuffer.MetadataItem.Vector());
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem.Vector listVector(androidx.emoji2.text.flatbuffer.MetadataItem.Vector vector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public java.lang.String sourceSha() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer sourceShaAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public java.nio.ByteBuffer sourceShaInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    public static int createMetadataList(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3) {
        flatBufferBuilder.startTable(3);
        addSourceSha(flatBufferBuilder, i3);
        addList(flatBufferBuilder, i2);
        addVersion(flatBufferBuilder, i);
        return endMetadataList(flatBufferBuilder);
    }

    public static void startMetadataList(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
    }

    public static void addVersion(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(0, i, 0);
    }

    public static void addList(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static int createListVector(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static void startListVector(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void addSourceSha(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static int endMetadataList(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static void finishMetadataListBuffer(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finish(i);
    }

    public static void finishSizePrefixedMetadataListBuffer(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finishSizePrefixed(i);
    }

    public static final class Vector extends androidx.emoji2.text.flatbuffer.BaseVector {
        public androidx.emoji2.text.flatbuffer.MetadataList.Vector __assign(int i, int i2, java.nio.ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public androidx.emoji2.text.flatbuffer.MetadataList get(int i) {
            return get(new androidx.emoji2.text.flatbuffer.MetadataList(), i);
        }

        public androidx.emoji2.text.flatbuffer.MetadataList get(androidx.emoji2.text.flatbuffer.MetadataList metadataList, int i) {
            return metadataList.__assign(androidx.emoji2.text.flatbuffer.MetadataList.__indirect(__element(i), this.bb), this.bb);
        }
    }
}
