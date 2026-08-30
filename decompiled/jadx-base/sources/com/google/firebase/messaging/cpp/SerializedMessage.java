package com.google.firebase.messaging.cpp;

/* JADX INFO: loaded from: classes5.dex */
public final class SerializedMessage extends com.google.flatbuffers.Table {
    public static void ValidateVersion() {
        com.google.flatbuffers.Constants.FLATBUFFERS_1_12_0();
    }

    public static com.google.firebase.messaging.cpp.SerializedMessage getRootAsSerializedMessage(java.nio.ByteBuffer byteBuffer) {
        return getRootAsSerializedMessage(byteBuffer, new com.google.firebase.messaging.cpp.SerializedMessage());
    }

    public static com.google.firebase.messaging.cpp.SerializedMessage getRootAsSerializedMessage(java.nio.ByteBuffer byteBuffer, com.google.firebase.messaging.cpp.SerializedMessage serializedMessage) {
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return serializedMessage.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public void __init(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public com.google.firebase.messaging.cpp.SerializedMessage __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public java.lang.String from() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer fromAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public java.nio.ByteBuffer fromInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public java.lang.String to() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer toAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public java.nio.ByteBuffer toInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public java.lang.String collapseKey() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer collapseKeyAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public java.nio.ByteBuffer collapseKeyInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    public com.google.firebase.messaging.cpp.DataPair data(int i) {
        return data(new com.google.firebase.messaging.cpp.DataPair(), i);
    }

    public com.google.firebase.messaging.cpp.DataPair data(com.google.firebase.messaging.cpp.DataPair dataPair, int i) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return dataPair.__assign(__indirect(__vector(i__offset) + (i * 4)), this.bb);
        }
        return null;
    }

    public int dataLength() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public com.google.firebase.messaging.cpp.DataPair.Vector dataVector() {
        return dataVector(new com.google.firebase.messaging.cpp.DataPair.Vector());
    }

    public com.google.firebase.messaging.cpp.DataPair.Vector dataVector(com.google.firebase.messaging.cpp.DataPair.Vector vector) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.bb);
        }
        return null;
    }

    public int rawData(int i) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.bb.get(__vector(i__offset) + (i * 1)) & 255;
        }
        return 0;
    }

    public int rawDataLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public com.google.flatbuffers.ByteVector rawDataVector() {
        return rawDataVector(new com.google.flatbuffers.ByteVector());
    }

    public com.google.flatbuffers.ByteVector rawDataVector(com.google.flatbuffers.ByteVector byteVector) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return byteVector.__assign(__vector(i__offset), this.bb);
        }
        return null;
    }

    public java.nio.ByteBuffer rawDataAsByteBuffer() {
        return __vector_as_bytebuffer(12, 1);
    }

    public java.nio.ByteBuffer rawDataInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 12, 1);
    }

    public java.lang.String messageId() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer messageIdAsByteBuffer() {
        return __vector_as_bytebuffer(14, 1);
    }

    public java.nio.ByteBuffer messageIdInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 14, 1);
    }

    public java.lang.String messageType() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer messageTypeAsByteBuffer() {
        return __vector_as_bytebuffer(16, 1);
    }

    public java.nio.ByteBuffer messageTypeInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 1);
    }

    public java.lang.String priority() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer priorityAsByteBuffer() {
        return __vector_as_bytebuffer(18, 1);
    }

    public java.nio.ByteBuffer priorityInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 18, 1);
    }

    public int timeToLive() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public java.lang.String error() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer errorAsByteBuffer() {
        return __vector_as_bytebuffer(22, 1);
    }

    public java.nio.ByteBuffer errorInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 22, 1);
    }

    public java.lang.String errorDescription() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer errorDescriptionAsByteBuffer() {
        return __vector_as_bytebuffer(24, 1);
    }

    public java.nio.ByteBuffer errorDescriptionInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 24, 1);
    }

    public com.google.firebase.messaging.cpp.SerializedNotification notification() {
        return notification(new com.google.firebase.messaging.cpp.SerializedNotification());
    }

    public com.google.firebase.messaging.cpp.SerializedNotification notification(com.google.firebase.messaging.cpp.SerializedNotification serializedNotification) {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return serializedNotification.__assign(__indirect(i__offset + this.bb_pos), this.bb);
        }
        return null;
    }

    public boolean notificationOpened() {
        int i__offset = __offset(28);
        return (i__offset == 0 || this.bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public java.lang.String link() {
        int i__offset = __offset(30);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer linkAsByteBuffer() {
        return __vector_as_bytebuffer(30, 1);
    }

    public java.nio.ByteBuffer linkInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 30, 1);
    }

    public long sentTime() {
        int i__offset = __offset(32);
        if (i__offset != 0) {
            return this.bb.getLong(i__offset + this.bb_pos);
        }
        return 0L;
    }

    public java.lang.String originalPriority() {
        int i__offset = __offset(34);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer originalPriorityAsByteBuffer() {
        return __vector_as_bytebuffer(34, 1);
    }

    public java.nio.ByteBuffer originalPriorityInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 34, 1);
    }

    public static int createSerializedMessage(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, int i13, long j, int i14) {
        flatBufferBuilder.startTable(16);
        addSentTime(flatBufferBuilder, j);
        addOriginalPriority(flatBufferBuilder, i14);
        addLink(flatBufferBuilder, i13);
        addNotification(flatBufferBuilder, i12);
        addErrorDescription(flatBufferBuilder, i11);
        addError(flatBufferBuilder, i10);
        addTimeToLive(flatBufferBuilder, i9);
        addPriority(flatBufferBuilder, i8);
        addMessageType(flatBufferBuilder, i7);
        addMessageId(flatBufferBuilder, i6);
        addRawData(flatBufferBuilder, i5);
        addData(flatBufferBuilder, i4);
        addCollapseKey(flatBufferBuilder, i3);
        addTo(flatBufferBuilder, i2);
        addFrom(flatBufferBuilder, i);
        addNotificationOpened(flatBufferBuilder, z);
        return endSerializedMessage(flatBufferBuilder);
    }

    public static void startSerializedMessage(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(16);
    }

    public static void addFrom(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addTo(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addCollapseKey(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static void addData(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(3, i, 0);
    }

    public static int createDataVector(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static void startDataVector(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void addRawData(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(4, i, 0);
    }

    public static int createRawDataVector(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        return flatBufferBuilder.createByteVector(bArr);
    }

    public static int createRawDataVector(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, java.nio.ByteBuffer byteBuffer) {
        return flatBufferBuilder.createByteVector(byteBuffer);
    }

    public static void startRawDataVector(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(1, i, 1);
    }

    public static void addMessageId(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(5, i, 0);
    }

    public static void addMessageType(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(6, i, 0);
    }

    public static void addPriority(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(7, i, 0);
    }

    public static void addTimeToLive(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(8, i, 0);
    }

    public static void addError(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(9, i, 0);
    }

    public static void addErrorDescription(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(10, i, 0);
    }

    public static void addNotification(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(11, i, 0);
    }

    public static void addNotificationOpened(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(12, z, false);
    }

    public static void addLink(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(13, i, 0);
    }

    public static void addSentTime(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, long j) {
        flatBufferBuilder.addLong(14, j, 0L);
    }

    public static void addOriginalPriority(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(15, i, 0);
    }

    public static int endSerializedMessage(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static final class Vector extends com.google.flatbuffers.BaseVector {
        public com.google.firebase.messaging.cpp.SerializedMessage.Vector __assign(int i, int i2, java.nio.ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public com.google.firebase.messaging.cpp.SerializedMessage get(int i) {
            return get(new com.google.firebase.messaging.cpp.SerializedMessage(), i);
        }

        public com.google.firebase.messaging.cpp.SerializedMessage get(com.google.firebase.messaging.cpp.SerializedMessage serializedMessage, int i) {
            return serializedMessage.__assign(com.google.firebase.messaging.cpp.SerializedMessage.__indirect(__element(i), this.bb), this.bb);
        }
    }
}
