package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class RawResourceDataSource extends androidx.media3.datasource.BaseDataSource {

    @java.lang.Deprecated
    public static final java.lang.String RAW_RESOURCE_SCHEME = "rawresource";
    private final android.content.Context applicationContext;
    private android.content.res.AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private androidx.media3.datasource.DataSpec dataSpec;
    private java.io.InputStream inputStream;
    private boolean opened;

    public static class RawResourceDataSourceException extends androidx.media3.datasource.DataSourceException {
        @java.lang.Deprecated
        public RawResourceDataSourceException(java.lang.String str) {
            super(str, null, 2000);
        }

        @java.lang.Deprecated
        public RawResourceDataSourceException(java.lang.Throwable th) {
            super(th, 2000);
        }

        public RawResourceDataSourceException(java.lang.String str, java.lang.Throwable th, int i) {
            super(str, th, i);
        }
    }

    @java.lang.Deprecated
    public static android.net.Uri buildRawResourceUri(int i) {
        return android.net.Uri.parse("rawresource:///" + i);
    }

    public RawResourceDataSource(android.content.Context context) {
        super(false);
        this.applicationContext = context.getApplicationContext();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
        this.dataSpec = dataSpec;
        transferInitializing(dataSpec);
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = openAssetFileDescriptor(this.applicationContext, dataSpec);
        this.assetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor;
        long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.assetFileDescriptor.getFileDescriptor());
        this.inputStream = fileInputStream;
        if (length != -1) {
            try {
                if (dataSpec.position > length) {
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, null, 2008);
                }
            } catch (androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e2, 2000);
            }
        }
        long startOffset = this.assetFileDescriptor.getStartOffset();
        long jSkip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
        if (jSkip != dataSpec.position) {
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, null, 2008);
        }
        if (length == -1) {
            java.nio.channels.FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.bytesRemaining = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.bytesRemaining = size;
                if (size < 0) {
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, null, 2008);
                }
            }
        } else {
            long j = length - jSkip;
            this.bytesRemaining = j;
            if (j < 0) {
                throw new androidx.media3.datasource.DataSourceException(2008);
            }
        }
        if (dataSpec.length != -1) {
            long j2 = this.bytesRemaining;
            this.bytesRemaining = j2 == -1 ? dataSpec.length : java.lang.Math.min(j2, dataSpec.length);
        }
        this.opened = true;
        transferStarted(dataSpec);
        return dataSpec.length != -1 ? dataSpec.length : this.bytesRemaining;
    }

    private static android.content.res.AssetFileDescriptor openAssetFileDescriptor(android.content.Context context, androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
        java.lang.String host;
        android.content.res.Resources resourcesForApplication;
        int identifier;
        android.net.Uri uriNormalizeScheme = dataSpec.uri.normalizeScheme();
        if (android.text.TextUtils.equals(RAW_RESOURCE_SCHEME, uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            java.util.List<java.lang.String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                identifier = parseResourceId(pathSegments.get(0));
            } else {
                throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
        } else if (android.text.TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
            java.lang.String strSubstring = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            if (android.text.TextUtils.isEmpty(uriNormalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = uriNormalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = parseResourceId(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(host + ":" + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
        } else {
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
        }
        try {
            android.content.res.AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (android.content.res.Resources.NotFoundException e2) {
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e2, 2005);
        }
    }

    private static int parseResourceId(java.lang.String str) throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
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
                throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e, 2000);
            }
        }
        int i3 = ((java.io.InputStream) androidx.media3.common.util.Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (i3 == -1) {
            if (this.bytesRemaining == -1) {
                return -1;
            }
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("End of stream reached having not read sufficient data.", new java.io.EOFException(), 2000);
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
        androidx.media3.datasource.DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // androidx.media3.datasource.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
        this.dataSpec = null;
        try {
            java.io.InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                inputStream.close();
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
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e, 2000);
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
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e2, 2000);
        }
    }
}
