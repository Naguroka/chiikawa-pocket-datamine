package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class TeeDataSource implements androidx.media3.datasource.DataSource {
    private long bytesRemaining;
    private final androidx.media3.datasource.DataSink dataSink;
    private boolean dataSinkNeedsClosing;
    private final androidx.media3.datasource.DataSource upstream;

    public TeeDataSource(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSink dataSink) {
        this.upstream = (androidx.media3.datasource.DataSource) androidx.media3.common.util.Assertions.checkNotNull(dataSource);
        this.dataSink = (androidx.media3.datasource.DataSink) androidx.media3.common.util.Assertions.checkNotNull(dataSink);
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        androidx.media3.common.util.Assertions.checkNotNull(transferListener);
        this.upstream.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        long jOpen = this.upstream.open(dataSpec);
        this.bytesRemaining = jOpen;
        if (jOpen == 0) {
            return 0L;
        }
        if (dataSpec.length == -1) {
            long j = this.bytesRemaining;
            if (j != -1) {
                dataSpec = dataSpec.subrange(0L, j);
            }
        }
        this.dataSinkNeedsClosing = true;
        this.dataSink.open(dataSpec);
        return this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.bytesRemaining == 0) {
            return -1;
        }
        int i3 = this.upstream.read(bArr, i, i2);
        if (i3 > 0) {
            this.dataSink.write(bArr, i, i3);
            long j = this.bytesRemaining;
            if (j != -1) {
                this.bytesRemaining = j - ((long) i3);
            }
        }
        return i3;
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws java.io.IOException {
        try {
            this.upstream.close();
        } finally {
            if (this.dataSinkNeedsClosing) {
                this.dataSinkNeedsClosing = false;
                this.dataSink.close();
            }
        }
    }
}
