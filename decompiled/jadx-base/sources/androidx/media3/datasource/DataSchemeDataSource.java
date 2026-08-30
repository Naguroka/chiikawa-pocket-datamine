package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class DataSchemeDataSource extends androidx.media3.datasource.BaseDataSource {
    public static final java.lang.String SCHEME_DATA = "data";
    private int bytesRemaining;
    private byte[] data;
    private androidx.media3.datasource.DataSpec dataSpec;
    private int readPosition;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        transferInitializing(dataSpec);
        this.dataSpec = dataSpec;
        android.net.Uri uriNormalizeScheme = dataSpec.uri.normalizeScheme();
        java.lang.String scheme = uriNormalizeScheme.getScheme();
        androidx.media3.common.util.Assertions.checkArgument("data".equals(scheme), "Unsupported scheme: " + scheme);
        java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrSplit.length != 2) {
            throw androidx.media3.common.ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        java.lang.String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.data = android.util.Base64.decode(str, 0);
            } catch (java.lang.IllegalArgumentException e) {
                throw androidx.media3.common.ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.data = androidx.media3.common.util.Util.getUtf8Bytes(java.net.URLDecoder.decode(str, com.google.common.base.Charsets.US_ASCII.name()));
        }
        if (dataSpec.position > this.data.length) {
            this.data = null;
            throw new androidx.media3.datasource.DataSourceException(2008);
        }
        int i = (int) dataSpec.position;
        this.readPosition = i;
        this.bytesRemaining = this.data.length - i;
        if (dataSpec.length != -1) {
            this.bytesRemaining = (int) java.lang.Math.min(this.bytesRemaining, dataSpec.length);
        }
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
        java.lang.System.arraycopy(androidx.media3.common.util.Util.castNonNull(this.data), this.readPosition, bArr, i, iMin);
        this.readPosition += iMin;
        this.bytesRemaining -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        androidx.media3.datasource.DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.data != null) {
            this.data = null;
            transferEnded();
        }
        this.dataSpec = null;
    }
}
