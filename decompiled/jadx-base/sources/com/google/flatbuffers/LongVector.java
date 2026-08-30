package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public final class LongVector extends com.google.flatbuffers.BaseVector {
    public com.google.flatbuffers.LongVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 8, byteBuffer);
        return this;
    }

    public long get(int i) {
        return this.bb.getLong(__element(i));
    }
}
