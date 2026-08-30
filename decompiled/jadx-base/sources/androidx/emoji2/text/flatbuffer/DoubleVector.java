package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class DoubleVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public androidx.emoji2.text.flatbuffer.DoubleVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 8, byteBuffer);
        return this;
    }

    public double get(int i) {
        return this.bb.getDouble(__element(i));
    }
}
