package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class DataSourceInputStream extends java.io.InputStream {
    private final androidx.media3.datasource.DataSource dataSource;
    private final androidx.media3.datasource.DataSpec dataSpec;
    private long totalBytesRead;
    private boolean opened = false;
    private boolean closed = false;
    private final byte[] singleByteArray = new byte[1];

    public DataSourceInputStream(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec) {
        this.dataSource = dataSource;
        this.dataSpec = dataSpec;
    }

    public long bytesRead() {
        return this.totalBytesRead;
    }

    public void open() throws java.io.IOException {
        checkOpened();
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (read(this.singleByteArray) == -1) {
            return -1;
        }
        return this.singleByteArray[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkState(!this.closed);
        checkOpened();
        int i3 = this.dataSource.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.totalBytesRead += (long) i3;
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.closed) {
            return;
        }
        this.dataSource.close();
        this.closed = true;
    }

    private void checkOpened() throws java.io.IOException {
        if (this.opened) {
            return;
        }
        this.dataSource.open(this.dataSpec);
        this.opened = true;
    }
}
