package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public class DefaultHttpDataSource extends androidx.media3.datasource.BaseDataSource implements androidx.media3.datasource.HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
    private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
    private static final long MAX_BYTES_TO_DRAIN = 2048;
    private static final int MAX_REDIRECTS = 20;
    private static final java.lang.String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesToRead;
    private final int connectTimeoutMillis;
    private java.net.HttpURLConnection connection;
    private final com.google.common.base.Predicate<java.lang.String> contentTypePredicate;
    private final boolean crossProtocolRedirectsForceOriginal;
    private androidx.media3.datasource.DataSpec dataSpec;
    private final androidx.media3.datasource.HttpDataSource.RequestProperties defaultRequestProperties;
    private java.io.InputStream inputStream;
    private final boolean keepPostFor302Redirects;
    private boolean opened;
    private final int readTimeoutMillis;
    private final androidx.media3.datasource.HttpDataSource.RequestProperties requestProperties;
    private int responseCode;
    private final java.lang.String userAgent;

    public static final class Factory implements androidx.media3.datasource.HttpDataSource.Factory {
        private boolean allowCrossProtocolRedirects;
        private com.google.common.base.Predicate<java.lang.String> contentTypePredicate;
        private boolean crossProtocolRedirectsForceOriginal;
        private boolean keepPostFor302Redirects;
        private androidx.media3.datasource.TransferListener transferListener;
        private java.lang.String userAgent;
        private final androidx.media3.datasource.HttpDataSource.RequestProperties defaultRequestProperties = new androidx.media3.datasource.HttpDataSource.RequestProperties();
        private int connectTimeoutMs = 8000;
        private int readTimeoutMs = 8000;

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public /* bridge */ /* synthetic */ androidx.media3.datasource.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map map) {
            return setDefaultRequestProperties((java.util.Map<java.lang.String, java.lang.String>) map);
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public androidx.media3.datasource.DefaultHttpDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setUserAgent(java.lang.String str) {
            this.userAgent = str;
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setConnectTimeoutMs(int i) {
            this.connectTimeoutMs = i;
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setReadTimeoutMs(int i) {
            this.readTimeoutMs = i;
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setAllowCrossProtocolRedirects(boolean z) {
            this.allowCrossProtocolRedirects = z;
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setCrossProtocolRedirectsForceOriginal(boolean z) {
            this.crossProtocolRedirectsForceOriginal = z;
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setContentTypePredicate(com.google.common.base.Predicate<java.lang.String> predicate) {
            this.contentTypePredicate = predicate;
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setTransferListener(androidx.media3.datasource.TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        public androidx.media3.datasource.DefaultHttpDataSource.Factory setKeepPostFor302Redirects(boolean z) {
            this.keepPostFor302Redirects = z;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public androidx.media3.datasource.DefaultHttpDataSource createDataSource() {
            androidx.media3.datasource.DefaultHttpDataSource defaultHttpDataSource = new androidx.media3.datasource.DefaultHttpDataSource(this.userAgent, this.connectTimeoutMs, this.readTimeoutMs, this.allowCrossProtocolRedirects, this.crossProtocolRedirectsForceOriginal, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects);
            androidx.media3.datasource.TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                defaultHttpDataSource.addTransferListener(transferListener);
            }
            return defaultHttpDataSource;
        }
    }

    private DefaultHttpDataSource(java.lang.String str, int i, int i2, boolean z, boolean z2, androidx.media3.datasource.HttpDataSource.RequestProperties requestProperties, com.google.common.base.Predicate<java.lang.String> predicate, boolean z3) {
        super(true);
        this.userAgent = str;
        this.connectTimeoutMillis = i;
        this.readTimeoutMillis = i2;
        this.allowCrossProtocolRedirects = z;
        this.crossProtocolRedirectsForceOriginal = z2;
        if (z && z2) {
            throw new java.lang.IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = predicate;
        this.requestProperties = new androidx.media3.datasource.HttpDataSource.RequestProperties();
        this.keepPostFor302Redirects = z3;
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        java.net.HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public int getResponseCode() {
        int i;
        if (this.connection == null || (i = this.responseCode) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // androidx.media3.datasource.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        if (this.connection == null) {
            return com.google.common.collect.ImmutableMap.of();
        }
        return new androidx.media3.datasource.DefaultHttpDataSource.NullFilteringHeadersMap(this.connection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void setRequestProperty(java.lang.String str, java.lang.String str2) {
        androidx.media3.common.util.Assertions.checkNotNull(str);
        androidx.media3.common.util.Assertions.checkNotNull(str2);
        this.requestProperties.set(str, str2);
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void clearRequestProperty(java.lang.String str) {
        androidx.media3.common.util.Assertions.checkNotNull(str);
        this.requestProperties.remove(str);
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        byte[] byteArray;
        this.dataSpec = dataSpec;
        long j = 0;
        this.bytesRead = 0L;
        this.bytesToRead = 0L;
        transferInitializing(dataSpec);
        try {
            java.net.HttpURLConnection httpURLConnectionMakeConnection = makeConnection(dataSpec);
            this.connection = httpURLConnectionMakeConnection;
            this.responseCode = httpURLConnectionMakeConnection.getResponseCode();
            java.lang.String responseMessage = httpURLConnectionMakeConnection.getResponseMessage();
            int i = this.responseCode;
            if (i < 200 || i > 299) {
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnectionMakeConnection.getHeaderFields();
                if (this.responseCode == 416) {
                    if (dataSpec.position == androidx.media3.datasource.HttpUtil.getDocumentSize(httpURLConnectionMakeConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE))) {
                        this.opened = true;
                        transferStarted(dataSpec);
                        if (dataSpec.length != -1) {
                            return dataSpec.length;
                        }
                        return 0L;
                    }
                }
                java.io.InputStream errorStream = httpURLConnectionMakeConnection.getErrorStream();
                try {
                    byteArray = errorStream != null ? com.google.common.io.ByteStreams.toByteArray(errorStream) : androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
                } catch (java.io.IOException unused) {
                    byteArray = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
                }
                byte[] bArr = byteArray;
                closeConnectionQuietly();
                throw new androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException(this.responseCode, responseMessage, this.responseCode == 416 ? new androidx.media3.datasource.DataSourceException(2008) : null, headerFields, dataSpec, bArr);
            }
            java.lang.String contentType = httpURLConnectionMakeConnection.getContentType();
            com.google.common.base.Predicate<java.lang.String> predicate = this.contentTypePredicate;
            if (predicate != null && !predicate.apply(contentType)) {
                closeConnectionQuietly();
                throw new androidx.media3.datasource.HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
            }
            if (this.responseCode == 200 && dataSpec.position != 0) {
                j = dataSpec.position;
            }
            boolean zIsCompressed = isCompressed(httpURLConnectionMakeConnection);
            if (zIsCompressed || dataSpec.length != -1) {
                this.bytesToRead = dataSpec.length;
            } else {
                long contentLength = androidx.media3.datasource.HttpUtil.getContentLength(httpURLConnectionMakeConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_LENGTH), httpURLConnectionMakeConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE));
                this.bytesToRead = contentLength != -1 ? contentLength - j : -1L;
            }
            try {
                this.inputStream = httpURLConnectionMakeConnection.getInputStream();
                if (zIsCompressed) {
                    this.inputStream = new java.util.zip.GZIPInputStream(this.inputStream);
                }
                this.opened = true;
                transferStarted(dataSpec);
                try {
                    skipFully(j, dataSpec);
                    return this.bytesToRead;
                } catch (java.io.IOException e) {
                    closeConnectionQuietly();
                    if (e instanceof androidx.media3.datasource.HttpDataSource.HttpDataSourceException) {
                        throw ((androidx.media3.datasource.HttpDataSource.HttpDataSourceException) e);
                    }
                    throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(e, dataSpec, 2000, 1);
                }
            } catch (java.io.IOException e2) {
                closeConnectionQuietly();
                throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(e2, dataSpec, 2000, 1);
            }
        } catch (java.io.IOException e3) {
            closeConnectionQuietly();
            throw androidx.media3.datasource.HttpDataSource.HttpDataSourceException.createForIOException(e3, dataSpec, 1);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        try {
            return readInternal(bArr, i, i2);
        } catch (java.io.IOException e) {
            throw androidx.media3.datasource.HttpDataSource.HttpDataSourceException.createForIOException(e, (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Util.castNonNull(this.dataSpec), 2);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        try {
            java.io.InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                long j = this.bytesToRead;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.bytesRead;
                }
                maybeTerminateInputStream(this.connection, j2);
                try {
                    inputStream.close();
                } catch (java.io.IOException e) {
                    throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(e, (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Util.castNonNull(this.dataSpec), 2000, 3);
                }
            }
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        } catch (java.lang.Throwable th) {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
            throw th;
        }
    }

    private java.net.HttpURLConnection makeConnection(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        java.net.URL url = new java.net.URL(dataSpec.uri.toString());
        int i = dataSpec.httpMethod;
        byte[] bArr = dataSpec.httpBody;
        long j = dataSpec.position;
        long j2 = dataSpec.length;
        boolean zIsFlagSet = dataSpec.isFlagSet(1);
        if (!this.allowCrossProtocolRedirects && !this.crossProtocolRedirectsForceOriginal && !this.keepPostFor302Redirects) {
            return makeConnection(url, i, bArr, j, j2, zIsFlagSet, true, dataSpec.httpRequestHeaders);
        }
        java.net.URL urlHandleRedirect = url;
        int i2 = i;
        byte[] bArr2 = bArr;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                long j3 = j;
                long j4 = j;
                int i5 = i2;
                java.net.URL url2 = urlHandleRedirect;
                long j5 = j2;
                java.net.HttpURLConnection httpURLConnectionMakeConnection = makeConnection(urlHandleRedirect, i2, bArr2, j3, j2, zIsFlagSet, false, dataSpec.httpRequestHeaders);
                int responseCode = httpURLConnectionMakeConnection.getResponseCode();
                java.lang.String headerField = httpURLConnectionMakeConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    httpURLConnectionMakeConnection.disconnect();
                    urlHandleRedirect = handleRedirect(url2, headerField, dataSpec);
                    i2 = i5;
                } else {
                    if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        return httpURLConnectionMakeConnection;
                    }
                    httpURLConnectionMakeConnection.disconnect();
                    if (this.keepPostFor302Redirects && responseCode == 302) {
                        i2 = i5;
                    } else {
                        bArr2 = null;
                        i2 = 1;
                    }
                    urlHandleRedirect = handleRedirect(url2, headerField, dataSpec);
                }
                i3 = i4;
                j = j4;
                j2 = j5;
            } else {
                throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(new java.net.NoRouteToHostException("Too many redirects: " + i4), dataSpec, 2001, 1);
            }
        }
    }

    private java.net.HttpURLConnection makeConnection(java.net.URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.IOException {
        java.net.HttpURLConnection httpURLConnectionOpenConnection = openConnection(url);
        httpURLConnectionOpenConnection.setConnectTimeout(this.connectTimeoutMillis);
        httpURLConnectionOpenConnection.setReadTimeout(this.readTimeoutMillis);
        java.util.HashMap map2 = new java.util.HashMap();
        androidx.media3.datasource.HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            map2.putAll(requestProperties.getSnapshot());
        }
        map2.putAll(this.requestProperties.getSnapshot());
        map2.putAll(map);
        for (java.util.Map.Entry entry : map2.entrySet()) {
            httpURLConnectionOpenConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.lang.String strBuildRangeRequestHeader = androidx.media3.datasource.HttpUtil.buildRangeRequestHeader(j, j2);
        if (strBuildRangeRequestHeader != null) {
            httpURLConnectionOpenConnection.setRequestProperty(com.google.common.net.HttpHeaders.RANGE, strBuildRangeRequestHeader);
        }
        java.lang.String str = this.userAgent;
        if (str != null) {
            httpURLConnectionOpenConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, str);
        }
        httpURLConnectionOpenConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, z ? "gzip" : "identity");
        httpURLConnectionOpenConnection.setInstanceFollowRedirects(z2);
        httpURLConnectionOpenConnection.setDoOutput(bArr != null);
        httpURLConnectionOpenConnection.setRequestMethod(androidx.media3.datasource.DataSpec.getStringForHttpMethod(i));
        if (bArr != null) {
            httpURLConnectionOpenConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionOpenConnection.connect();
            java.io.OutputStream outputStream = httpURLConnectionOpenConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionOpenConnection.connect();
        }
        return httpURLConnectionOpenConnection;
    }

    java.net.HttpURLConnection openConnection(java.net.URL url) throws java.io.IOException {
        return (java.net.HttpURLConnection) url.openConnection();
    }

    private java.net.URL handleRedirect(java.net.URL url, java.lang.String str, androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        if (str == null) {
            throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException("Null location redirect", dataSpec, 2001, 1);
        }
        try {
            java.net.URL url2 = new java.net.URL(url, str);
            java.lang.String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !androidx.webkit.ProxyConfig.MATCH_HTTP.equals(protocol)) {
                throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException("Unsupported protocol redirect: " + protocol, dataSpec, 2001, 1);
            }
            if (this.allowCrossProtocolRedirects || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (!this.crossProtocolRedirectsForceOriginal) {
                throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", dataSpec, 2001, 1);
            }
            try {
                return new java.net.URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
            } catch (java.net.MalformedURLException e) {
                throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(e, dataSpec, 2001, 1);
            }
        } catch (java.net.MalformedURLException e2) {
            throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(e2, dataSpec, 2001, 1);
        }
    }

    private void skipFully(long j, androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((java.io.InputStream) androidx.media3.common.util.Util.castNonNull(this.inputStream)).read(bArr, 0, (int) java.lang.Math.min(j, 4096));
            if (java.lang.Thread.currentThread().isInterrupted()) {
                throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(new java.io.InterruptedIOException(), dataSpec, 2000, 1);
            }
            if (i == -1) {
                throw new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
            }
            j -= (long) i;
            bytesTransferred(i);
        }
    }

    private int readInternal(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesToRead;
        if (j != -1) {
            long j2 = j - this.bytesRead;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) java.lang.Math.min(i2, j2);
        }
        int i3 = ((java.io.InputStream) androidx.media3.common.util.Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.bytesRead += (long) i3;
        bytesTransferred(i3);
        return i3;
    }

    private static void maybeTerminateInputStream(java.net.HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection == null || androidx.media3.common.util.Util.SDK_INT > 20) {
            return;
        }
        try {
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            java.lang.String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                java.lang.reflect.Method declaredMethod = ((java.lang.Class) androidx.media3.common.util.Assertions.checkNotNull(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new java.lang.Object[0]);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private void closeConnectionQuietly() {
        java.net.HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e) {
                androidx.media3.common.util.Log.e(TAG, "Unexpected error while disconnecting", e);
            }
            this.connection = null;
        }
    }

    private static boolean isCompressed(java.net.HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_ENCODING));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class NullFilteringHeadersMap extends com.google.common.collect.ForwardingMap<java.lang.String, java.util.List<java.lang.String>> {
        private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers;

        static /* synthetic */ boolean lambda$keySet$0(java.lang.String str) {
            return str != null;
        }

        public NullFilteringHeadersMap(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            this.headers = map;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public java.util.Map<java.lang.String, java.util.List<java.lang.String>> delegate() {
            return this.headers;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsKey(java.lang.Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.List<java.lang.String> get(java.lang.Object obj) {
            if (obj == null) {
                return null;
            }
            return (java.util.List) super.get(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<java.lang.String> keySet() {
            return com.google.common.collect.Sets.filter(super.keySet(), new com.google.common.base.Predicate() { // from class: androidx.media3.datasource.DefaultHttpDataSource$NullFilteringHeadersMap$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    return androidx.media3.datasource.DefaultHttpDataSource.NullFilteringHeadersMap.lambda$keySet$0((java.lang.String) obj);
                }
            });
        }

        static /* synthetic */ boolean lambda$entrySet$1(java.util.Map.Entry entry) {
            return entry.getKey() != null;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entrySet() {
            return com.google.common.collect.Sets.filter(super.entrySet(), new com.google.common.base.Predicate() { // from class: androidx.media3.datasource.DefaultHttpDataSource$NullFilteringHeadersMap$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    return androidx.media3.datasource.DefaultHttpDataSource.NullFilteringHeadersMap.lambda$entrySet$1((java.util.Map.Entry) obj);
                }
            });
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsValue(java.lang.Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean equals(java.lang.Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int hashCode() {
            return super.standardHashCode();
        }
    }
}
