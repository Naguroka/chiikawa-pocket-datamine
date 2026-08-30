package okhttp3.internal.cache2;

/* JADX INFO: compiled from: FileOperator.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "fileChannel", "Ljava/nio/channels/FileChannel;", "(Ljava/nio/channels/FileChannel;)V", "read", "", "pos", "", "sink", "Lokio/Buffer;", "byteCount", "write", "source", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileOperator {
    private final java.nio.channels.FileChannel fileChannel;

    public FileOperator(java.nio.channels.FileChannel fileChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void write(long pos, okio.Buffer source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (byteCount < 0 || byteCount > source.size()) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        while (byteCount > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, pos, byteCount);
            pos += jTransferFrom;
            byteCount -= jTransferFrom;
        }
    }

    public final void read(long pos, okio.Buffer sink, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        while (byteCount > 0) {
            long jTransferTo = this.fileChannel.transferTo(pos, byteCount, sink);
            pos += jTransferTo;
            byteCount -= jTransferTo;
        }
    }
}
