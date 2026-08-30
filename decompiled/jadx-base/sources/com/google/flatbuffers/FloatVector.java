package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public final class FloatVector extends com.google.flatbuffers.BaseVector {
    public com.google.flatbuffers.FloatVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 4, byteBuffer);
        return this;
    }

    public float get(int i) {
        return this.bb.getFloat(__element(i));
    }
}
