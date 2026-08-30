package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public final class IntVector extends com.google.flatbuffers.BaseVector {
    public com.google.flatbuffers.IntVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 4, byteBuffer);
        return this;
    }

    public int get(int i) {
        return this.bb.getInt(__element(i));
    }

    public long getAsUnsigned(int i) {
        return ((long) get(i)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
    }
}
