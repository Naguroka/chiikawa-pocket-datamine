package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public final class ShortVector extends com.google.flatbuffers.BaseVector {
    public com.google.flatbuffers.ShortVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 2, byteBuffer);
        return this;
    }

    public short get(int i) {
        return this.bb.getShort(__element(i));
    }

    public int getAsUnsigned(int i) {
        return get(i) & kotlin.UShort.MAX_VALUE;
    }
}
