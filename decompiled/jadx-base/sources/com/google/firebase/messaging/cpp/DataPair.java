package com.google.firebase.messaging.cpp;

/* JADX INFO: loaded from: classes5.dex */
public final class DataPair extends com.google.flatbuffers.Table {
    public static void ValidateVersion() {
        com.google.flatbuffers.Constants.FLATBUFFERS_1_12_0();
    }

    public static com.google.firebase.messaging.cpp.DataPair getRootAsDataPair(java.nio.ByteBuffer byteBuffer) {
        return getRootAsDataPair(byteBuffer, new com.google.firebase.messaging.cpp.DataPair());
    }

    public static com.google.firebase.messaging.cpp.DataPair getRootAsDataPair(java.nio.ByteBuffer byteBuffer, com.google.firebase.messaging.cpp.DataPair dataPair) {
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return dataPair.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public void __init(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public com.google.firebase.messaging.cpp.DataPair __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public java.lang.String key() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer keyAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public java.nio.ByteBuffer keyInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public java.lang.String value() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public java.nio.ByteBuffer valueAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public java.nio.ByteBuffer valueInByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public static int createDataPair(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i, int i2) {
        flatBufferBuilder.startTable(2);
        addValue(flatBufferBuilder, i2);
        addKey(flatBufferBuilder, i);
        return endDataPair(flatBufferBuilder);
    }

    public static void startDataPair(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public static void addKey(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addValue(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static int endDataPair(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static final class Vector extends com.google.flatbuffers.BaseVector {
        public com.google.firebase.messaging.cpp.DataPair.Vector __assign(int i, int i2, java.nio.ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public com.google.firebase.messaging.cpp.DataPair get(int i) {
            return get(new com.google.firebase.messaging.cpp.DataPair(), i);
        }

        public com.google.firebase.messaging.cpp.DataPair get(com.google.firebase.messaging.cpp.DataPair dataPair, int i) {
            return dataPair.__assign(com.google.firebase.messaging.cpp.DataPair.__indirect(__element(i), this.bb), this.bb);
        }
    }
}
