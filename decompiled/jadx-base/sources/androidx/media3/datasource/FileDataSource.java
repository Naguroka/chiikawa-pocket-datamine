package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class FileDataSource extends androidx.media3.datasource.BaseDataSource {
    private long bytesRemaining;
    private java.io.RandomAccessFile file;
    private boolean opened;
    private android.net.Uri uri;

    public static class FileDataSourceException extends androidx.media3.datasource.DataSourceException {
        @java.lang.Deprecated
        public FileDataSourceException(java.lang.Exception exc) {
            super(exc, 2000);
        }

        @java.lang.Deprecated
        public FileDataSourceException(java.lang.String str, java.io.IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(java.lang.Throwable th, int i) {
            super(th, i);
        }

        public FileDataSourceException(java.lang.String str, java.lang.Throwable th, int i) {
            super(str, th, i);
        }
    }

    public static final class Factory implements androidx.media3.datasource.DataSource.Factory {
        private androidx.media3.datasource.TransferListener listener;

        public androidx.media3.datasource.FileDataSource.Factory setListener(androidx.media3.datasource.TransferListener transferListener) {
            this.listener = transferListener;
            return this;
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public androidx.media3.datasource.FileDataSource createDataSource() {
            androidx.media3.datasource.FileDataSource fileDataSource = new androidx.media3.datasource.FileDataSource();
            androidx.media3.datasource.TransferListener transferListener = this.listener;
            if (transferListener != null) {
                fileDataSource.addTransferListener(transferListener);
            }
            return fileDataSource;
        }
    }

    public FileDataSource() {
        super(false);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.FileDataSource.FileDataSourceException {
        android.net.Uri uri = dataSpec.uri;
        this.uri = uri;
        transferInitializing(dataSpec);
        java.io.RandomAccessFile randomAccessFileOpenLocalFile = openLocalFile(uri);
        this.file = randomAccessFileOpenLocalFile;
        try {
            randomAccessFileOpenLocalFile.seek(dataSpec.position);
            long length = dataSpec.length == -1 ? this.file.length() - dataSpec.position : dataSpec.length;
            this.bytesRemaining = length;
            if (length < 0) {
                throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(null, null, 2008);
            }
            this.opened = true;
            transferStarted(dataSpec);
            return this.bytesRemaining;
        } catch (java.io.IOException e) {
            throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(e, 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws androidx.media3.datasource.FileDataSource.FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            int i3 = ((java.io.RandomAccessFile) androidx.media3.common.util.Util.castNonNull(this.file)).read(bArr, i, (int) java.lang.Math.min(this.bytesRemaining, i2));
            if (i3 > 0) {
                this.bytesRemaining -= (long) i3;
                bytesTransferred(i3);
            }
            return i3;
        } catch (java.io.IOException e) {
            throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(e, 2000);
        }
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
    public void close() throws androidx.media3.datasource.FileDataSource.FileDataSourceException {
        this.uri = null;
        try {
            java.io.RandomAccessFile randomAccessFile = this.file;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.file = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        } catch (java.io.IOException e) {
            throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(e, 2000);
        }
    }

    private static java.io.RandomAccessFile openLocalFile(android.net.Uri uri) throws androidx.media3.datasource.FileDataSource.FileDataSourceException {
        try {
            return new java.io.RandomAccessFile((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(uri.getPath()), com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
        } catch (java.io.FileNotFoundException e) {
            if (!android.text.TextUtils.isEmpty(uri.getQuery()) || !android.text.TextUtils.isEmpty(uri.getFragment())) {
                throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(java.lang.String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
            }
            throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(e, (androidx.media3.common.util.Util.SDK_INT < 21 || !androidx.media3.datasource.FileDataSource.Api21.isPermissionError(e.getCause())) ? 2005 : 2006);
        } catch (java.lang.SecurityException e2) {
            throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(e2, 2006);
        } catch (java.lang.RuntimeException e3) {
            throw new androidx.media3.datasource.FileDataSource.FileDataSourceException(e3, 2000);
        }
    }

    private static final class Api21 {
        private Api21() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isPermissionError(java.lang.Throwable th) {
            return (th instanceof android.system.ErrnoException) && ((android.system.ErrnoException) th).errno == android.system.OsConstants.EACCES;
        }
    }
}
