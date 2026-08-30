package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
final class ByteBufferWriter {
    private static final java.lang.ThreadLocal<java.lang.ref.SoftReference<byte[]>> BUFFER = new java.lang.ThreadLocal<>();
    private static final float BUFFER_REALLOCATION_THRESHOLD = 0.5f;
    private static final long CHANNEL_FIELD_OFFSET;
    private static final java.lang.Class<?> FILE_OUTPUT_STREAM_CLASS;
    private static final int MAX_CACHED_BUFFER_SIZE = 16384;
    private static final int MIN_CACHED_BUFFER_SIZE = 1024;

    private static boolean needToReallocate(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    private ByteBufferWriter() {
    }

    static {
        java.lang.Class<?> clsSafeGetClass = safeGetClass("java.io.FileOutputStream");
        FILE_OUTPUT_STREAM_CLASS = clsSafeGetClass;
        CHANNEL_FIELD_OFFSET = getChannelFieldOffset(clsSafeGetClass);
    }

    static void clearCachedBuffer() {
        BUFFER.set(null);
    }

    static void write(java.nio.ByteBuffer byteBuffer, java.io.OutputStream outputStream) throws java.io.IOException {
        int iPosition = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!writeToChannel(byteBuffer, outputStream)) {
                byte[] orCreateBuffer = getOrCreateBuffer(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int iMin = java.lang.Math.min(byteBuffer.remaining(), orCreateBuffer.length);
                    byteBuffer.get(orCreateBuffer, 0, iMin);
                    outputStream.write(orCreateBuffer, 0, iMin);
                }
            }
        } finally {
        }
    }

    private static byte[] getOrCreateBuffer(int i) {
        int iMax = java.lang.Math.max(i, 1024);
        byte[] buffer = getBuffer();
        if (buffer == null || needToReallocate(iMax, buffer.length)) {
            buffer = new byte[iMax];
            if (iMax <= 16384) {
                setBuffer(buffer);
            }
        }
        return buffer;
    }

    private static byte[] getBuffer() {
        java.lang.ref.SoftReference<byte[]> softReference = BUFFER.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    private static void setBuffer(byte[] bArr) {
        BUFFER.set(new java.lang.ref.SoftReference<>(bArr));
    }

    private static boolean writeToChannel(java.nio.ByteBuffer byteBuffer, java.io.OutputStream outputStream) throws java.io.IOException {
        java.nio.channels.WritableByteChannel writableByteChannel;
        long j = CHANNEL_FIELD_OFFSET;
        if (j < 0 || !FILE_OUTPUT_STREAM_CLASS.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (java.nio.channels.WritableByteChannel) com.google.protobuf.UnsafeUtil.getObject(outputStream, j);
        } catch (java.lang.ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }

    private static java.lang.Class<?> safeGetClass(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    private static long getChannelFieldOffset(java.lang.Class<?> cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (com.google.protobuf.UnsafeUtil.hasUnsafeArrayOperations()) {
                return com.google.protobuf.UnsafeUtil.objectFieldOffset(cls.getDeclaredField("channel"));
            }
            return -1L;
        } catch (java.lang.Throwable unused) {
            return -1L;
        }
    }
}
