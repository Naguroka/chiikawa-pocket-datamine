package com.google.firebase.messaging.cpp;

/* JADX INFO: loaded from: classes5.dex */
public final class SerializedTokenReceived extends com.google.flatbuffers.Table {
    public static void ValidateVersion() {
        com.google.flatbuffers.Constants.FLATBUFFERS_1_12_0();
    }

    public static com.google.firebase.messaging.cpp.SerializedTokenReceived getRootAsSerializedTokenReceived(java.nio.ByteBuffer byteBuffer) {
        return getRootAsSerializedTokenReceived(byteBuffer, new com.google.firebase.messaging.cpp.SerializedTokenReceived());
    }

    public static com.google.firebase.messaging.cpp.SerializedTokenReceived getRootAsSerializedTokenReceived(java.nio.ByteBuffer byteBuffer, com.google.firebase.messaging.cpp.SerializedTokenReceived serializedTokenReceived) {
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return serializedTokenReceived.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public void __init(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public com.google.firebase.messaging.cpp.SerializedTokenReceived __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public java.lang.String token() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer tokenAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public java.nio.ByteBuffer tokenInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public static int createSerializedTokenReceived(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startTable(1);
        addToken(flatBufferBuilder, i);
        return endSerializedTokenReceived(flatBufferBuilder);
    }

    public static void startSerializedTokenReceived(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public static void addToken(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static int endSerializedTokenReceived(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static final class Vector extends com.google.flatbuffers.BaseVector {
        public com.google.firebase.messaging.cpp.SerializedTokenReceived.Vector __assign(int i, int i2, java.nio.ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public com.google.firebase.messaging.cpp.SerializedTokenReceived get(int i) {
            return get(new com.google.firebase.messaging.cpp.SerializedTokenReceived(), i);
        }

        public com.google.firebase.messaging.cpp.SerializedTokenReceived get(com.google.firebase.messaging.cpp.SerializedTokenReceived serializedTokenReceived, int i) {
            return serializedTokenReceived.__assign(com.google.firebase.messaging.cpp.SerializedTokenReceived.__indirect(__element(i), this.bb), this.bb);
        }
    }
}
