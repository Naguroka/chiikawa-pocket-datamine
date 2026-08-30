package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
final class BoxUtils {
    private static final int BOX_SIZE_BYTES = 4;
    private static final int BOX_TYPE_BYTES = 4;

    private BoxUtils() {
    }

    public static java.nio.ByteBuffer wrapIntoBox(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        return wrapIntoBox(str.getBytes(com.google.common.base.Charsets.UTF_8), byteBuffer);
    }

    public static java.nio.ByteBuffer wrapIntoBox(byte[] bArr, java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBuffer.remaining() + 4 + 4);
        byteBufferAllocate.putInt(byteBuffer.remaining() + 4 + 4);
        byteBufferAllocate.put(bArr, 0, 4);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static java.nio.ByteBuffer wrapBoxesIntoBox(java.lang.String str, java.util.List<java.nio.ByteBuffer> list) {
        int iRemaining = 8;
        for (int i = 0; i < list.size(); i++) {
            iRemaining += list.get(i).remaining();
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(iRemaining);
        byteBufferAllocate.putInt(iRemaining);
        byteBufferAllocate.put(str.getBytes(com.google.common.base.Charsets.UTF_8), 0, 4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            byteBufferAllocate.put(list.get(i2));
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static java.nio.ByteBuffer concatenateBuffers(java.nio.ByteBuffer... byteBufferArr) {
        int iRemaining = 0;
        for (java.nio.ByteBuffer byteBuffer : byteBufferArr) {
            iRemaining += byteBuffer.remaining();
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(iRemaining);
        for (java.nio.ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBufferAllocate.put(byteBuffer2);
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }
}
