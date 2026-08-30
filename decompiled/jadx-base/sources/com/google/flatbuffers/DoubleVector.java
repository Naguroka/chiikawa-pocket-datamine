package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public final class DoubleVector extends com.google.flatbuffers.BaseVector {
    public com.google.flatbuffers.DoubleVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 8, byteBuffer);
        return this;
    }

    public double get(int i) {
        return this.bb.getDouble(__element(i));
    }
}
