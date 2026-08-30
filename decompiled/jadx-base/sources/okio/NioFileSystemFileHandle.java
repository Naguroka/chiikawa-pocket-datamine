package okio;

/* JADX INFO: compiled from: NioFileSystemFileHandle.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\bH\u0014J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u0014J\b\u0010\u0014\u001a\u00020\rH\u0014J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokio/NioFileSystemFileHandle;", "Lokio/FileHandle;", "readWrite", "", "fileChannel", "Ljava/nio/channels/FileChannel;", "(ZLjava/nio/channels/FileChannel;)V", "protectedClose", "", "protectedFlush", "protectedRead", "", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "protectedResize", "size", "protectedSize", "protectedWrite", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NioFileSystemFileHandle extends okio.FileHandle {
    private final java.nio.channels.FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioFileSystemFileHandle(boolean z, java.nio.channels.FileChannel fileChannel) {
        super(z);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    @Override // okio.FileHandle
    protected synchronized void protectedResize(long size) {
        long size2 = size();
        long j = size - size2;
        if (j > 0) {
            int i = (int) j;
            protectedWrite(size2, new byte[i], 0, i);
        } else {
            this.fileChannel.truncate(size);
        }
    }

    @Override // okio.FileHandle
    protected synchronized long protectedSize() {
        return this.fileChannel.size();
    }

    @Override // okio.FileHandle
    protected synchronized int protectedRead(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        this.fileChannel.position(fileOffset);
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(array, arrayOffset, byteCount);
        int i = 0;
        while (i < byteCount) {
            int i2 = this.fileChannel.read(byteBufferWrap);
            if (i2 == -1) {
                if (i != 0) {
                    break;
                }
                return -1;
            }
            i += i2;
        }
        return i;
    }

    @Override // okio.FileHandle
    protected synchronized void protectedWrite(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        this.fileChannel.position(fileOffset);
        this.fileChannel.write(java.nio.ByteBuffer.wrap(array, arrayOffset, byteCount));
    }

    @Override // okio.FileHandle
    protected synchronized void protectedFlush() {
        this.fileChannel.force(true);
    }

    @Override // okio.FileHandle
    protected synchronized void protectedClose() {
        this.fileChannel.close();
    }
}
