package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class UnionVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public androidx.emoji2.text.flatbuffer.UnionVector __assign(int i, int i2, java.nio.ByteBuffer byteBuffer) {
        __reset(i, i2, byteBuffer);
        return this;
    }

    public androidx.emoji2.text.flatbuffer.Table get(androidx.emoji2.text.flatbuffer.Table table, int i) {
        return androidx.emoji2.text.flatbuffer.Table.__union(table, __element(i), this.bb);
    }
}
