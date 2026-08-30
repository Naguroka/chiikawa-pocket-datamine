package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public final class BooleanVector extends com.google.flatbuffers.BaseVector {
    public com.google.flatbuffers.BooleanVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 1, byteBuffer);
        return this;
    }

    public boolean get(int i) {
        return this.bb.get(__element(i)) != 0;
    }
}
