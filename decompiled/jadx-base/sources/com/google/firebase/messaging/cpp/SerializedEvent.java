package com.google.firebase.messaging.cpp;

/* JADX INFO: loaded from: classes5.dex */
public final class SerializedEvent extends com.google.flatbuffers.Table {
    public static void ValidateVersion() {
        com.google.flatbuffers.Constants.FLATBUFFERS_1_12_0();
    }

    public static com.google.firebase.messaging.cpp.SerializedEvent getRootAsSerializedEvent(java.nio.ByteBuffer byteBuffer) {
        return getRootAsSerializedEvent(byteBuffer, new com.google.firebase.messaging.cpp.SerializedEvent());
    }

    public static com.google.firebase.messaging.cpp.SerializedEvent getRootAsSerializedEvent(java.nio.ByteBuffer byteBuffer, com.google.firebase.messaging.cpp.SerializedEvent serializedEvent) {
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return serializedEvent.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public void __init(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public com.google.firebase.messaging.cpp.SerializedEvent __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public byte eventType() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public com.google.flatbuffers.Table event(com.google.flatbuffers.Table table) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __union(table, i__offset + this.bb_pos);
        }
        return null;
    }

    public static int createSerializedEvent(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, byte b, int i) {
        flatBufferBuilder.startTable(2);
        addEvent(flatBufferBuilder, i);
        addEventType(flatBufferBuilder, b);
        return endSerializedEvent(flatBufferBuilder);
    }

    public static void startSerializedEvent(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public static void addEventType(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(0, b, 0);
    }

    public static void addEvent(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static int endSerializedEvent(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static void finishSerializedEventBuffer(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finish(i);
    }

    public static void finishSizePrefixedSerializedEventBuffer(com.google.flatbuffers.FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.finishSizePrefixed(i);
    }

    public static final class Vector extends com.google.flatbuffers.BaseVector {
        public com.google.firebase.messaging.cpp.SerializedEvent.Vector __assign(int i, int i2, java.nio.ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }

        public com.google.firebase.messaging.cpp.SerializedEvent get(int i) {
            return get(new com.google.firebase.messaging.cpp.SerializedEvent(), i);
        }

        public com.google.firebase.messaging.cpp.SerializedEvent get(com.google.firebase.messaging.cpp.SerializedEvent serializedEvent, int i) {
            return serializedEvent.__assign(com.google.firebase.messaging.cpp.SerializedEvent.__indirect(__element(i), this.bb), this.bb);
        }
    }
}
