package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public final class UnionVector extends com.google.flatbuffers.BaseVector {
    public com.google.flatbuffers.UnionVector __assign(int i, int i2, java.nio.ByteBuffer byteBuffer) {
        __reset(i, i2, byteBuffer);
        return this;
    }

    public com.google.flatbuffers.Table get(com.google.flatbuffers.Table table, int i) {
        return com.google.flatbuffers.Table.__union(table, __element(i), this.bb);
    }
}
