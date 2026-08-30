package com.google.firebase.messaging.cpp;

/* JADX INFO: loaded from: classes5.dex */
public final class SerializedNotification extends com.google.flatbuffers.Table {
    public static void ValidateVersion() {
        com.google.flatbuffers.Constants.FLATBUFFERS_1_12_0();
    }

    public static com.google.firebase.messaging.cpp.SerializedNotification getRootAsSerializedNotification(java.nio.ByteBuffer byteBuffer) {
        return getRootAsSerializedNotification(byteBuffer, new com.google.firebase.messaging.cpp.SerializedNotification());
    }

    public static com.google.firebase.messaging.cpp.SerializedNotification getRootAsSerializedNotification(java.nio.ByteBuffer byteBuffer, com.google.firebase.messaging.cpp.SerializedNotification serializedNotification) {
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return serializedNotification.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public void __init(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public com.google.firebase.messaging.cpp.SerializedNotification __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public java.lang.String title() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer titleAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public java.nio.ByteBuffer titleInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public java.lang.String body() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer bodyAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public java.nio.ByteBuffer bodyInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public java.lang.String icon() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer iconAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public java.nio.ByteBuffer iconInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    public java.lang.String sound() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer soundAsByteBuffer() {
        return __vector_as_bytebuffer(10, 1);
    }

    public java.nio.ByteBuffer soundInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 10, 1);
    }

    public java.lang.String badge() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer badgeAsByteBuffer() {
        return __vector_as_bytebuffer(12, 1);
    }

    public java.nio.ByteBuffer badgeInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 12, 1);
    }

    public java.lang.String tag() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer tagAsByteBuffer() {
        return __vector_as_bytebuffer(14, 1);
    }

    public java.nio.ByteBuffer tagInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 14, 1);
    }

    public java.lang.String color() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer colorAsByteBuffer() {
        return __vector_as_bytebuffer(16, 1);
    }

    public java.nio.ByteBuffer colorInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 1);
    }

    public java.lang.String clickAction() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer clickActionAsByteBuffer() {
        return __vector_as_bytebuffer(18, 1);
    }

    public java.nio.ByteBuffer clickActionInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 18, 1);
    }

    public java.lang.String bodyLocKey() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer bodyLocKeyAsByteBuffer() {
        return __vector_as_bytebuffer(20, 1);
    }

    public java.nio.ByteBuffer bodyLocKeyInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 20, 1);
    }

    public java.lang.String bodyLocArgs(int i) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __string(__vector(i__offset) + (i * 4));
        }
        return null;
    }

    public int bodyLocArgsLength() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public com.google.flatbuffers.StringVector bodyLocArgsVector() {
        return bodyLocArgsVector(new com.google.flatbuffers.StringVector());
    }

    public com.google.flatbuffers.StringVector bodyLocArgsVector(com.google.flatbuffers.StringVector stringVector) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return stringVector.__assign(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public java.lang.String titleLocKey() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer titleLocKeyAsByteBuffer() {
        return __vector_as_bytebuffer(24, 1);
    }

    public java.nio.ByteBuffer titleLocKeyInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 24, 1);
    }

    public java.lang.String titleLocArgs(int i) {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return __string(__vector(i__offset) + (i * 4));
        }
        return null;
    }

    public int titleLocArgsLength() {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public com.google.flatbuffers.StringVector titleLocArgsVector() {
        return titleLocArgsVector(new com.google.flatbuffers.StringVector());
    }

    public com.google.flatbuffers.StringVector titleLocArgsVector(com.google.flatbuffers.StringVector stringVector) {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return stringVector.__assign(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public java.lang.String androidChannelId() {
        int i__offset = __offset(28);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer androidChannelIdAsByteBuffer() {
        return __vector_as_bytebuffer(28, 1);
    }

    public java.nio.ByteBuffer androidChannelIdInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 28, 1);
    }

    public static int createSerializedNotification(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        flatBufferBuilder.startTable(13);
        addAndroidChannelId(flatBufferBuilder, i13);
        addTitleLocArgs(flatBufferBuilder, i12);
        addTitleLocKey(flatBufferBuilder, i11);
        addBodyLocArgs(flatBufferBuilder, i10);
        addBodyLocKey(flatBufferBuilder, i9);
        addClickAction(flatBufferBuilder, i8);
        addColor(flatBufferBuilder, i7);
        addTag(flatBufferBuilder, i6);
        addBadge(flatBufferBuilder, i5);
        addSound(flatBufferBuilder, i4);
        addIcon(flatBufferBuilder, i3);
        addBody(flatBufferBuilder, i2);
        addTitle(flatBufferBuilder, i);
        return endSerializedNotification(flatBufferBuilder);
    }

    public static void startSerializedNotification(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(13);
    }

    public static void addTitle(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addBody(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addIcon(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static void addSound(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(3, i, 0);
    }

    public static void addBadge(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(4, i, 0);
    }

    public static void addTag(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(5, i, 0);
    }

    public static void addColor(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(6, i, 0);
    }

    public static void addClickAction(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(7, i, 0);
    }

    public static void addBodyLocKey(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(8, i, 0);
    }

    public static void addBodyLocArgs(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(9, i, 0);
    }

    public static int createBodyLocArgsVector(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static void startBodyLocArgsVector(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void addTitleLocKey(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(10, i, 0);
    }

    public static void addTitleLocArgs(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(11, i, 0);
    }

    public static int createTitleLocArgsVector(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static void startTitleLocArgsVector(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void addAndroidChannelId(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(12, i, 0);
    }

    public static int endSerializedNotification(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static final class Vector extends com.google.flatbuffers.BaseVector {
        public com.google.firebase.messaging.cpp.SerializedNotification.Vector __assign(int i, int i2, java.nio.ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public com.google.firebase.messaging.cpp.SerializedNotification get(int i) {
            return get(new com.google.firebase.messaging.cpp.SerializedNotification(), i);
        }

        public com.google.firebase.messaging.cpp.SerializedNotification get(com.google.firebase.messaging.cpp.SerializedNotification serializedNotification, int i) {
            return serializedNotification.__assign(com.google.firebase.messaging.cpp.SerializedNotification.__indirect(__element(i), this.bb), this.bb);
        }
    }
}
