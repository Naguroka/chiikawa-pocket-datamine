package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public interface HttpDataSource extends androidx.media3.datasource.DataSource {
    public static final com.google.common.base.Predicate<java.lang.String> REJECT_PAYWALL_TYPES = new com.google.common.base.Predicate() { // from class: androidx.media3.datasource.HttpDataSource$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Predicate
        public final boolean apply(java.lang.Object obj) {
            return androidx.media3.datasource.HttpDataSource.lambda$static$0((java.lang.String) obj);
        }
    };

    public interface Factory extends androidx.media3.datasource.DataSource.Factory {
        @Override // androidx.media3.datasource.DataSource.Factory
        androidx.media3.datasource.HttpDataSource createDataSource();

        androidx.media3.datasource.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> map);
    }

    void clearAllRequestProperties();

    void clearRequestProperty(java.lang.String str);

    @Override // androidx.media3.datasource.DataSource
    void close() throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException;

    int getResponseCode();

    @Override // androidx.media3.datasource.DataSource
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders();

    @Override // androidx.media3.datasource.DataSource
    long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException;

    @Override // androidx.media3.common.DataReader
    int read(byte[] bArr, int i, int i2) throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException;

    void setRequestProperty(java.lang.String str, java.lang.String str2);

    public static final class RequestProperties {
        private final java.util.Map<java.lang.String, java.lang.String> requestProperties = new java.util.HashMap();
        private java.util.Map<java.lang.String, java.lang.String> requestPropertiesSnapshot;

        public synchronized void set(java.lang.String str, java.lang.String str2) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.put(str, str2);
        }

        public synchronized void set(java.util.Map<java.lang.String, java.lang.String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.putAll(map);
        }

        public synchronized void clearAndSet(java.util.Map<java.lang.String, java.lang.String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
            this.requestProperties.putAll(map);
        }

        public synchronized void remove(java.lang.String str) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.remove(str);
        }

        public synchronized void clear() {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
        }

        public synchronized java.util.Map<java.lang.String, java.lang.String> getSnapshot() {
            if (this.requestPropertiesSnapshot == null) {
                this.requestPropertiesSnapshot = java.util.Collections.unmodifiableMap(new java.util.HashMap(this.requestProperties));
            }
            return this.requestPropertiesSnapshot;
        }
    }

    public static abstract class BaseFactory implements androidx.media3.datasource.HttpDataSource.Factory {
        private final androidx.media3.datasource.HttpDataSource.RequestProperties defaultRequestProperties = new androidx.media3.datasource.HttpDataSource.RequestProperties();

        protected abstract androidx.media3.datasource.HttpDataSource createDataSourceInternal(androidx.media3.datasource.HttpDataSource.RequestProperties requestProperties);

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public final androidx.media3.datasource.HttpDataSource createDataSource() {
            return createDataSourceInternal(this.defaultRequestProperties);
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public final androidx.media3.datasource.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }
    }

    static /* synthetic */ boolean lambda$static$0(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str);
        if (android.text.TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        return ((lowerCase.contains("text") && !lowerCase.contains(androidx.media3.common.MimeTypes.TEXT_VTT)) || lowerCase.contains("html") || lowerCase.contains("xml")) ? false : true;
    }

    public static class HttpDataSourceException extends androidx.media3.datasource.DataSourceException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final androidx.media3.datasource.DataSpec dataSpec;
        public final int type;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Type {
        }

        private static int assignErrorCode(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        public static androidx.media3.datasource.HttpDataSource.HttpDataSourceException createForIOException(java.io.IOException iOException, androidx.media3.datasource.DataSpec dataSpec, int i) {
            int i2;
            java.lang.String message = iOException.getMessage();
            if (iOException instanceof java.net.SocketTimeoutException) {
                i2 = 2002;
            } else if (iOException instanceof java.io.InterruptedIOException) {
                i2 = 1004;
            } else {
                i2 = (message == null || !com.google.common.base.Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i2 == 2007) {
                return new androidx.media3.datasource.HttpDataSource.CleartextNotPermittedException(iOException, dataSpec);
            }
            return new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(iOException, dataSpec, i2, i);
        }

        @java.lang.Deprecated
        public HttpDataSourceException(androidx.media3.datasource.DataSpec dataSpec, int i) {
            this(dataSpec, 2000, i);
        }

        public HttpDataSourceException(androidx.media3.datasource.DataSpec dataSpec, int i, int i2) {
            super(assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @java.lang.Deprecated
        public HttpDataSourceException(java.lang.String str, androidx.media3.datasource.DataSpec dataSpec, int i) {
            this(str, dataSpec, 2000, i);
        }

        public HttpDataSourceException(java.lang.String str, androidx.media3.datasource.DataSpec dataSpec, int i, int i2) {
            super(str, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @java.lang.Deprecated
        public HttpDataSourceException(java.io.IOException iOException, androidx.media3.datasource.DataSpec dataSpec, int i) {
            this(iOException, dataSpec, 2000, i);
        }

        public HttpDataSourceException(java.io.IOException iOException, androidx.media3.datasource.DataSpec dataSpec, int i, int i2) {
            super(iOException, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @java.lang.Deprecated
        public HttpDataSourceException(java.lang.String str, java.io.IOException iOException, androidx.media3.datasource.DataSpec dataSpec, int i) {
            this(str, iOException, dataSpec, 2000, i);
        }

        public HttpDataSourceException(java.lang.String str, java.io.IOException iOException, androidx.media3.datasource.DataSpec dataSpec, int i, int i2) {
            super(str, iOException, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }
    }

    public static final class CleartextNotPermittedException extends androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        public CleartextNotPermittedException(java.io.IOException iOException, androidx.media3.datasource.DataSpec dataSpec) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, dataSpec, 2007, 1);
        }
    }

    public static final class InvalidContentTypeException extends androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        public final java.lang.String contentType;

        public InvalidContentTypeException(java.lang.String str, androidx.media3.datasource.DataSpec dataSpec) {
            super("Invalid content type: " + str, dataSpec, 2003, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;
        public final java.lang.String responseMessage;

        public InvalidResponseCodeException(int i, java.lang.String str, java.io.IOException iOException, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, androidx.media3.datasource.DataSpec dataSpec, byte[] bArr) {
            super("Response code: " + i, iOException, dataSpec, 2004, 1);
            this.responseCode = i;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }
    }
}
