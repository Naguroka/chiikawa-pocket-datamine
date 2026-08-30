package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class ContentDataSource extends androidx.media3.datasource.BaseDataSource {
    private android.content.res.AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private java.io.FileInputStream inputStream;
    private boolean opened;
    private final android.content.ContentResolver resolver;
    private android.net.Uri uri;

    public static class ContentDataSourceException extends androidx.media3.datasource.DataSourceException {
        @java.lang.Deprecated
        public ContentDataSourceException(java.io.IOException iOException) {
            this(iOException, 2000);
        }

        public ContentDataSourceException(java.io.IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public ContentDataSource(android.content.Context context) {
        super(false);
        this.resolver = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.ContentDataSource.ContentDataSourceException {
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            android.net.Uri uriNormalizeScheme = dataSpec.uri.normalizeScheme();
            this.uri = uriNormalizeScheme;
            transferInitializing(dataSpec);
            if ("content".equals(uriNormalizeScheme.getScheme())) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.resolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.resolver.openAssetFileDescriptor(uriNormalizeScheme, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            }
            this.assetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(new java.io.IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.inputStream = fileInputStream;
            if (length != -1 && dataSpec.position > length) {
                throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
            if (jSkip != dataSpec.position) {
                throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.bytesRemaining = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.bytesRemaining = jPosition;
                    if (jPosition < 0) {
                        throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j = length - jSkip;
                this.bytesRemaining = j;
                if (j < 0) {
                    throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(null, 2008);
                }
            }
            if (dataSpec.length != -1) {
                long j2 = this.bytesRemaining;
                this.bytesRemaining = j2 == -1 ? dataSpec.length : java.lang.Math.min(j2, dataSpec.length);
            }
            this.opened = true;
            transferStarted(dataSpec);
            return dataSpec.length != -1 ? dataSpec.length : this.bytesRemaining;
        } catch (androidx.media3.datasource.ContentDataSource.ContentDataSourceException e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(e2, e2 instanceof java.io.FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws androidx.media3.datasource.ContentDataSource.ContentDataSourceException {
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
                throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(e, 2000);
            }
        }
        int i3 = ((java.io.FileInputStream) androidx.media3.common.util.Util.castNonNull(this.inputStream)).read(bArr, i, i2);
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

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // androidx.media3.datasource.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() throws androidx.media3.datasource.ContentDataSource.ContentDataSourceException {
        this.uri = null;
        try {
            java.io.FileInputStream fileInputStream = this.inputStream;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.inputStream = null;
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                } catch (java.io.IOException e) {
                    throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(e, 2000);
                }
            } catch (java.lang.Throwable th) {
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
                throw th;
            }
        } catch (java.io.IOException e2) {
            throw new androidx.media3.datasource.ContentDataSource.ContentDataSourceException(e2, 2000);
        }
    }
}
