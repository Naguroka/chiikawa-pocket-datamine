package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class AssetDataSource extends androidx.media3.datasource.BaseDataSource {
    private final android.content.res.AssetManager assetManager;
    private long bytesRemaining;
    private java.io.InputStream inputStream;
    private boolean opened;
    private android.net.Uri uri;

    public static final class AssetDataSourceException extends androidx.media3.datasource.DataSourceException {
        @java.lang.Deprecated
        public AssetDataSourceException(java.io.IOException iOException) {
            super(iOException, 2000);
        }

        public AssetDataSourceException(java.lang.Throwable th, int i) {
            super(th, i);
        }
    }

    public AssetDataSource(android.content.Context context) {
        super(false);
        this.assetManager = context.getAssets();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.AssetDataSource.AssetDataSourceException {
        try {
            android.net.Uri uri = dataSpec.uri;
            this.uri = uri;
            java.lang.String strSubstring = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            transferInitializing(dataSpec);
            java.io.InputStream inputStreamOpen = this.assetManager.open(strSubstring, 1);
            this.inputStream = inputStreamOpen;
            if (inputStreamOpen.skip(dataSpec.position) < dataSpec.position) {
                throw new androidx.media3.datasource.AssetDataSource.AssetDataSourceException(null, 2008);
            }
            if (dataSpec.length != -1) {
                this.bytesRemaining = dataSpec.length;
            } else {
                long jAvailable = this.inputStream.available();
                this.bytesRemaining = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.bytesRemaining = -1L;
                }
            }
            this.opened = true;
            transferStarted(dataSpec);
            return this.bytesRemaining;
        } catch (androidx.media3.datasource.AssetDataSource.AssetDataSourceException e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new androidx.media3.datasource.AssetDataSource.AssetDataSourceException(e2, e2 instanceof java.io.FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws androidx.media3.datasource.AssetDataSource.AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) java.lang.Math.min(j, i2);
            } catch (java.io.IOException e) {
                throw new androidx.media3.datasource.AssetDataSource.AssetDataSourceException(e, 2000);
            }
        }
        int i3 = ((java.io.InputStream) androidx.media3.common.util.Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.bytesRemaining;
        if (j2 != -1) {
            this.bytesRemaining = j2 - ((long) i3);
        }
        bytesTransferred(i3);
        return i3;
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return this.uri;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // androidx.media3.datasource.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() throws androidx.media3.datasource.AssetDataSource.AssetDataSourceException {
        this.uri = null;
        try {
            java.io.InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                inputStream.close();
            }
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        } catch (java.io.IOException e) {
            throw new androidx.media3.datasource.AssetDataSource.AssetDataSourceException(e, 2000);
        }
    }
}
