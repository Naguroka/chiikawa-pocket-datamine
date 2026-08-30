package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class ByteArrayDataSource extends androidx.media3.datasource.BaseDataSource {
    private int bytesRemaining;
    private byte[] data;
    private boolean opened;
    private int readPosition;
    private android.net.Uri uri;
    private final androidx.media3.datasource.ByteArrayDataSource.UriResolver uriResolver;

    public interface UriResolver {
        byte[] resolve(android.net.Uri uri) throws java.io.IOException;
    }

    static /* synthetic */ byte[] lambda$new$0(byte[] bArr, android.net.Uri uri) throws java.io.IOException {
        return bArr;
    }

    public ByteArrayDataSource(final byte[] bArr) {
        this(new androidx.media3.datasource.ByteArrayDataSource.UriResolver() { // from class: androidx.media3.datasource.ByteArrayDataSource$$ExternalSyntheticLambda0
            @Override // androidx.media3.datasource.ByteArrayDataSource.UriResolver
            public final byte[] resolve(android.net.Uri uri) {
                return androidx.media3.datasource.ByteArrayDataSource.lambda$new$0(bArr, uri);
            }
        });
        androidx.media3.common.util.Assertions.checkArgument(bArr.length > 0);
    }

    public ByteArrayDataSource(androidx.media3.datasource.ByteArrayDataSource.UriResolver uriResolver) {
        super(false);
        this.uriResolver = (androidx.media3.datasource.ByteArrayDataSource.UriResolver) androidx.media3.common.util.Assertions.checkNotNull(uriResolver);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        transferInitializing(dataSpec);
        android.net.Uri uri = dataSpec.uri;
        this.uri = uri;
        this.data = this.uriResolver.resolve(uri);
        if (dataSpec.position > this.data.length) {
            throw new androidx.media3.datasource.DataSourceException(2008);
        }
        this.readPosition = (int) dataSpec.position;
        this.bytesRemaining = this.data.length - ((int) dataSpec.position);
        if (dataSpec.length != -1) {
            this.bytesRemaining = (int) java.lang.Math.min(this.bytesRemaining, dataSpec.length);
        }
        this.opened = true;
        transferStarted(dataSpec);
        return dataSpec.length != -1 ? dataSpec.length : this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.bytesRemaining;
        if (i3 == 0) {
            return -1;
        }
        int iMin = java.lang.Math.min(i2, i3);
        java.lang.System.arraycopy(androidx.media3.common.util.Assertions.checkStateNotNull(this.data), this.readPosition, bArr, i, iMin);
        this.readPosition += iMin;
        this.bytesRemaining -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.uri = null;
        this.data = null;
    }
}
