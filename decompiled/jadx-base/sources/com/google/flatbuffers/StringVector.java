package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public final class StringVector extends com.google.flatbuffers.BaseVector {
    private com.google.flatbuffers.Utf8 utf8 = com.google.flatbuffers.Utf8.getDefault();

    public com.google.flatbuffers.StringVector __assign(int i, int i2, java.nio.ByteBuffer byteBuffer) {
        __reset(i, i2, byteBuffer);
        return this;
    }

    public java.lang.String get(int i) {
        return com.google.flatbuffers.Table.__string(__element(i), this.bb, this.utf8);
    }
}
