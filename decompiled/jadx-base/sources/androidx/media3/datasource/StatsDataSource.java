package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class StatsDataSource implements androidx.media3.datasource.DataSource {
    private long bytesRead;
    private final androidx.media3.datasource.DataSource dataSource;
    private android.net.Uri lastOpenedUri = android.net.Uri.EMPTY;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> lastResponseHeaders = java.util.Collections.emptyMap();

    public StatsDataSource(androidx.media3.datasource.DataSource dataSource) {
        this.dataSource = (androidx.media3.datasource.DataSource) androidx.media3.common.util.Assertions.checkNotNull(dataSource);
    }

    public void resetBytesRead() {
        this.bytesRead = 0L;
    }

    public long getBytesRead() {
        return this.bytesRead;
    }

    public android.net.Uri getLastOpenedUri() {
        return this.lastOpenedUri;
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getLastResponseHeaders() {
        return this.lastResponseHeaders;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        androidx.media3.common.util.Assertions.checkNotNull(transferListener);
        this.dataSource.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        this.lastOpenedUri = dataSpec.uri;
        this.lastResponseHeaders = java.util.Collections.emptyMap();
        long jOpen = this.dataSource.open(dataSpec);
        this.lastOpenedUri = (android.net.Uri) androidx.media3.common.util.Assertions.checkNotNull(getUri());
        this.lastResponseHeaders = getResponseHeaders();
        return jOpen;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.dataSource.read(bArr, i, i2);
        if (i3 != -1) {
            this.bytesRead += (long) i3;
        }
        return i3;
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return this.dataSource.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.dataSource.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws java.io.IOException {
        this.dataSource.close();
    }
}
