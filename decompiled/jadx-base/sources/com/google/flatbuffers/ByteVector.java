package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public final class ByteVector extends com.google.flatbuffers.BaseVector {
    public com.google.flatbuffers.ByteVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 1, byteBuffer);
        return this;
    }

    public byte get(int i) {
        return this.bb.get(__element(i));
    }

    public int getAsUnsigned(int i) {
        return get(i) & 255;
    }
}
