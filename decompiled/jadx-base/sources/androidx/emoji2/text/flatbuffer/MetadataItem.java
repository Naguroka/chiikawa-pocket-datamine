package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataItem extends androidx.emoji2.text.flatbuffer.Table {
    public static void ValidateVersion() {
        androidx.emoji2.text.flatbuffer.Constants.FLATBUFFERS_1_12_0();
    }

    public static androidx.emoji2.text.flatbuffer.MetadataItem getRootAsMetadataItem(java.nio.ByteBuffer byteBuffer) {
        return getRootAsMetadataItem(byteBuffer, new androidx.emoji2.text.flatbuffer.MetadataItem());
    }

    public static androidx.emoji2.text.flatbuffer.MetadataItem getRootAsMetadataItem(java.nio.ByteBuffer byteBuffer, androidx.emoji2.text.flatbuffer.MetadataItem metadataItem) {
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return metadataItem.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public void __init(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public androidx.emoji2.text.flatbuffer.MetadataItem __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public int id() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public boolean emojiStyle() {
        int i__offset = __offset(6);
        return (i__offset == 0 || this.bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public short sdkAdded() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public short compatAdded() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public short width() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public short height() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public int codepoints(int i) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return this.bb.getInt(__vector(i__offset) + (i * 4));
        }
        return 0;
    }

    public int codepointsLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public androidx.emoji2.text.flatbuffer.IntVector codepointsVector() {
        return codepointsVector(new androidx.emoji2.text.flatbuffer.IntVector());
    }

    public androidx.emoji2.text.flatbuffer.IntVector codepointsVector(androidx.emoji2.text.flatbuffer.IntVector intVector) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.bb);
        }
        return null;
    }

    public java.nio.ByteBuffer codepointsAsByteBuffer() {
        return __vector_as_bytebuffer(16, 4);
    }

    public java.nio.ByteBuffer codepointsInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 4);
    }

    public static int createMetadataItem(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, int i, boolean z, short s, short s2, short s3, short s4, int i2) {
        flatBufferBuilder.startTable(7);
        addCodepoints(flatBufferBuilder, i2);
        addId(flatBufferBuilder, i);
        addHeight(flatBufferBuilder, s4);
        addWidth(flatBufferBuilder, s3);
        addCompatAdded(flatBufferBuilder, s2);
        addSdkAdded(flatBufferBuilder, s);
        addEmojiStyle(flatBufferBuilder, z);
        return endMetadataItem(flatBufferBuilder);
    }

    public static void startMetadataItem(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(7);
    }

    public static void addId(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(0, i, 0);
    }

    public static void addEmojiStyle(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(1, z, false);
    }

    public static void addSdkAdded(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(2, s, 0);
    }

    public static void addCompatAdded(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(3, s, 0);
    }

    public static void addWidth(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(4, s, 0);
    }

    public static void addHeight(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, short s) {
        flatBufferBuilder.addShort(5, s, 0);
    }

    public static void addCodepoints(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(6, i, 0);
    }

    public static int createCodepointsVector(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static void startCodepointsVector(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static int endMetadataItem(androidx.emoji2.text.flatbuffer.FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static final class Vector extends androidx.emoji2.text.flatbuffer.BaseVector {
        public androidx.emoji2.text.flatbuffer.MetadataItem.Vector __assign(int i, int i2, java.nio.ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public androidx.emoji2.text.flatbuffer.MetadataItem get(int i) {
            return get(new androidx.emoji2.text.flatbuffer.MetadataItem(), i);
        }

        public androidx.emoji2.text.flatbuffer.MetadataItem get(androidx.emoji2.text.flatbuffer.MetadataItem metadataItem, int i) {
            return metadataItem.__assign(androidx.emoji2.text.flatbuffer.MetadataItem.__indirect(__element(i), this.bb), this.bb);
        }
    }
}
