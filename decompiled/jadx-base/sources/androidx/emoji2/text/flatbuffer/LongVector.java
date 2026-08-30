package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class LongVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public androidx.emoji2.text.flatbuffer.LongVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 8, byteBuffer);
        return this;
    }

    public long get(int i) {
        return this.bb.getLong(__element(i));
    }
}
