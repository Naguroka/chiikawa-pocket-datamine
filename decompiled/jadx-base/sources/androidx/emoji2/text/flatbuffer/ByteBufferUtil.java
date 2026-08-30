package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufferUtil {
    public static int getSizePrefix(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer.getInt(byteBuffer.position());
    }

    public static java.nio.ByteBuffer removeSizePrefix(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        return byteBufferDuplicate;
    }
}
