package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public final class FloatVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public androidx.emoji2.text.flatbuffer.FloatVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 4, byteBuffer);
        return this;
    }

    public float get(int i) {
        return this.bb.getFloat(__element(i));
    }
}
