package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class AesCipherDataSource implements androidx.media3.datasource.DataSource {
    private androidx.media3.datasource.AesFlushingCipher cipher;
    private final byte[] secretKey;
    private final androidx.media3.datasource.DataSource upstream;

    public AesCipherDataSource(byte[] bArr, androidx.media3.datasource.DataSource dataSource) {
        this.upstream = dataSource;
        this.secretKey = bArr;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        androidx.media3.common.util.Assertions.checkNotNull(transferListener);
        this.upstream.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        long jOpen = this.upstream.open(dataSpec);
        this.cipher = new androidx.media3.datasource.AesFlushingCipher(2, this.secretKey, dataSpec.key, dataSpec.uriPositionOffset + dataSpec.position);
        return jOpen;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.upstream.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        ((androidx.media3.datasource.AesFlushingCipher) androidx.media3.common.util.Util.castNonNull(this.cipher)).updateInPlace(bArr, i, i3);
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
        this.cipher = null;
        this.upstream.close();
    }
}
