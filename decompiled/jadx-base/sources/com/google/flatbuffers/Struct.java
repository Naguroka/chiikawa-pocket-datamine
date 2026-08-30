package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
public class Struct {
    protected java.nio.ByteBuffer bb;
    protected int bb_pos;

    protected void __reset(int i, java.nio.ByteBuffer byteBuffer) {
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}
