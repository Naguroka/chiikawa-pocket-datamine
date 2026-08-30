package androidx.datastore.core;

/* JADX INFO: compiled from: UncloseableOutputStream.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/datastore/core/UncloseableOutputStream;", "Ljava/io/OutputStream;", "fileOutputStream", "Ljava/io/FileOutputStream;", "(Ljava/io/FileOutputStream;)V", "getFileOutputStream", "()Ljava/io/FileOutputStream;", "close", "", "flush", "write", "b", "", "bytes", kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF, "", "len", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UncloseableOutputStream extends java.io.OutputStream {
    private final java.io.FileOutputStream fileOutputStream;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public UncloseableOutputStream(java.io.FileOutputStream fileOutputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.fileOutputStream = fileOutputStream;
    }

    public final java.io.FileOutputStream getFileOutputStream() {
        return this.fileOutputStream;
    }

    @Override // java.io.OutputStream
    public void write(int b) throws java.io.IOException {
        this.fileOutputStream.write(b);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "b");
        this.fileOutputStream.write(b);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int off, int len) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.fileOutputStream.write(bytes, off, len);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.fileOutputStream.flush();
    }
}
