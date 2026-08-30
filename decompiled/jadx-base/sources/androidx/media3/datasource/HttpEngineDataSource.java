package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class HttpEngineDataSource extends androidx.media3.datasource.BaseDataSource implements androidx.media3.datasource.HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int READ_BUFFER_SIZE_BYTES = 32768;
    private long bytesRemaining;
    private final androidx.media3.common.util.Clock clock;
    private final int connectTimeoutMs;
    private com.google.common.base.Predicate<java.lang.String> contentTypePredicate;
    private volatile long currentConnectTimeoutMs;
    private androidx.media3.datasource.DataSpec currentDataSpec;
    private androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper currentUrlRequestWrapper;
    private final androidx.media3.datasource.HttpDataSource.RequestProperties defaultRequestProperties;
    private java.io.IOException exception;
    private final java.util.concurrent.Executor executor;
    private boolean finished;
    private final boolean handleSetCookieRequests;
    private final android.net.http.HttpEngine httpEngine;
    private final boolean keepPostFor302Redirects;
    private boolean opened;
    private final androidx.media3.common.util.ConditionVariable operation;
    private java.nio.ByteBuffer readBuffer;
    private final int readTimeoutMs;
    private final int requestPriority;
    private final androidx.media3.datasource.HttpDataSource.RequestProperties requestProperties;
    private final boolean resetTimeoutOnRedirects;
    private android.net.http.UrlResponseInfo responseInfo;
    private final java.lang.String userAgent;

    public static final class Factory implements androidx.media3.datasource.HttpDataSource.Factory {
        private com.google.common.base.Predicate<java.lang.String> contentTypePredicate;
        private final java.util.concurrent.Executor executor;
        private boolean handleSetCookieRequests;
        private final android.net.http.HttpEngine httpEngine;
        private boolean keepPostFor302Redirects;
        private boolean resetTimeoutOnRedirects;
        private androidx.media3.datasource.TransferListener transferListener;
        private java.lang.String userAgent;
        private final androidx.media3.datasource.HttpDataSource.RequestProperties defaultRequestProperties = new androidx.media3.datasource.HttpDataSource.RequestProperties();
        private int requestPriority = 3;
        private int connectTimeoutMs = 8000;
        private int readTimeoutMs = 8000;

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public /* bridge */ /* synthetic */ androidx.media3.datasource.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map map) {
            return setDefaultRequestProperties((java.util.Map<java.lang.String, java.lang.String>) map);
        }

        public Factory(android.net.http.HttpEngine httpEngine, java.util.concurrent.Executor executor) {
            this.httpEngine = (android.net.http.HttpEngine) androidx.media3.common.util.Assertions.checkNotNull(httpEngine);
            this.executor = executor;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public final androidx.media3.datasource.HttpEngineDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        public androidx.media3.datasource.HttpEngineDataSource.Factory setUserAgent(java.lang.String str) {
            this.userAgent = str;
            return this;
        }

        public androidx.media3.datasource.HttpEngineDataSource.Factory setRequestPriority(int i) {
            this.requestPriority = i;
            return this;
        }

        public androidx.media3.datasource.HttpEngineDataSource.Factory setConnectionTimeoutMs(int i) {
            this.connectTimeoutMs = i;
            return this;
        }

        public androidx.media3.datasource.HttpEngineDataSource.Factory setResetTimeoutOnRedirects(boolean z) {
            this.resetTimeoutOnRedirects = z;
            return this;
        }

        public androidx.media3.datasource.HttpEngineDataSource.Factory setHandleSetCookieRequests(boolean z) {
            this.handleSetCookieRequests = z;
            return this;
        }

        public androidx.media3.datasource.HttpEngineDataSource.Factory setReadTimeoutMs(int i) {
            this.readTimeoutMs = i;
            return this;
        }

        public androidx.media3.datasource.HttpEngineDataSource.Factory setContentTypePredicate(com.google.common.base.Predicate<java.lang.String> predicate) {
            this.contentTypePredicate = predicate;
            return this;
        }

        public androidx.media3.datasource.HttpEngineDataSource.Factory setKeepPostFor302Redirects(boolean z) {
            this.keepPostFor302Redirects = z;
            return this;
        }

        public androidx.media3.datasource.HttpEngineDataSource.Factory setTransferListener(androidx.media3.datasource.TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public androidx.media3.datasource.HttpDataSource createDataSource() {
            androidx.media3.datasource.HttpEngineDataSource httpEngineDataSource = new androidx.media3.datasource.HttpEngineDataSource(this.httpEngine, this.executor, this.requestPriority, this.connectTimeoutMs, this.readTimeoutMs, this.resetTimeoutOnRedirects, this.handleSetCookieRequests, this.userAgent, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects);
            androidx.media3.datasource.TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                httpEngineDataSource.addTransferListener(transferListener);
            }
            return httpEngineDataSource;
        }
    }

    public static final class OpenException extends androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        public final int httpEngineConnectionStatus;

        public OpenException(java.io.IOException iOException, androidx.media3.datasource.DataSpec dataSpec, int i, int i2) {
            super(iOException, dataSpec, i, 1);
            this.httpEngineConnectionStatus = i2;
        }

        public OpenException(java.lang.String str, androidx.media3.datasource.DataSpec dataSpec, int i, int i2) {
            super(str, dataSpec, i, 1);
            this.httpEngineConnectionStatus = i2;
        }

        public OpenException(androidx.media3.datasource.DataSpec dataSpec, int i, int i2) {
            super(dataSpec, i, 1);
            this.httpEngineConnectionStatus = i2;
        }
    }

    HttpEngineDataSource(android.net.http.HttpEngine httpEngine, java.util.concurrent.Executor executor, int i, int i2, int i3, boolean z, boolean z2, java.lang.String str, androidx.media3.datasource.HttpDataSource.RequestProperties requestProperties, com.google.common.base.Predicate<java.lang.String> predicate, boolean z3) {
        super(true);
        this.httpEngine = (android.net.http.HttpEngine) androidx.media3.common.util.Assertions.checkNotNull(httpEngine);
        this.executor = (java.util.concurrent.Executor) androidx.media3.common.util.Assertions.checkNotNull(executor);
        this.requestPriority = i;
        this.connectTimeoutMs = i2;
        this.readTimeoutMs = i3;
        this.resetTimeoutOnRedirects = z;
        this.handleSetCookieRequests = z2;
        this.userAgent = str;
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = predicate;
        this.keepPostFor302Redirects = z3;
        this.clock = androidx.media3.common.util.Clock.DEFAULT;
        this.requestProperties = new androidx.media3.datasource.HttpDataSource.RequestProperties();
        this.operation = new androidx.media3.common.util.ConditionVariable();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void setRequestProperty(java.lang.String str, java.lang.String str2) {
        this.requestProperties.set(str, str2);
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void clearRequestProperty(java.lang.String str) {
        this.requestProperties.remove(str);
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public int getResponseCode() {
        android.net.http.UrlResponseInfo urlResponseInfo = this.responseInfo;
        if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() <= 0) {
            return -1;
        }
        return this.responseInfo.getHttpStatusCode();
    }

    @Override // androidx.media3.datasource.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        android.net.http.UrlResponseInfo urlResponseInfo = this.responseInfo;
        return urlResponseInfo == null ? java.util.Collections.emptyMap() : urlResponseInfo.getHeaders().getAsMap();
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        android.net.http.UrlResponseInfo urlResponseInfo = this.responseInfo;
        if (urlResponseInfo == null) {
            return null;
        }
        return android.net.Uri.parse(urlResponseInfo.getUrl());
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        byte[] responseBody;
        java.lang.String firstHeader;
        androidx.media3.common.util.Assertions.checkNotNull(dataSpec);
        androidx.media3.common.util.Assertions.checkState(!this.opened);
        this.operation.close();
        resetConnectTimeout();
        this.currentDataSpec = dataSpec;
        try {
            androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper urlRequestWrapperBuildRequestWrapper = buildRequestWrapper(dataSpec);
            this.currentUrlRequestWrapper = urlRequestWrapperBuildRequestWrapper;
            urlRequestWrapperBuildRequestWrapper.start();
            transferInitializing(dataSpec);
            try {
                boolean zBlockUntilConnectTimeout = blockUntilConnectTimeout();
                java.io.IOException iOException = this.exception;
                if (iOException != null) {
                    java.lang.String message = iOException.getMessage();
                    if (message != null && com.google.common.base.Ascii.toLowerCase(message).contains("err_cleartext_not_permitted")) {
                        throw new androidx.media3.datasource.HttpDataSource.CleartextNotPermittedException(iOException, dataSpec);
                    }
                    throw new androidx.media3.datasource.HttpEngineDataSource.OpenException(iOException, dataSpec, 2001, urlRequestWrapperBuildRequestWrapper.getStatus());
                }
                if (!zBlockUntilConnectTimeout) {
                    throw new androidx.media3.datasource.HttpEngineDataSource.OpenException(new java.net.SocketTimeoutException(), dataSpec, 2002, urlRequestWrapperBuildRequestWrapper.getStatus());
                }
                android.net.http.UrlResponseInfo urlResponseInfo = (android.net.http.UrlResponseInfo) androidx.media3.common.util.Assertions.checkNotNull(this.responseInfo);
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> asMap = urlResponseInfo.getHeaders().getAsMap();
                long j = 0;
                if (httpStatusCode < 200 || httpStatusCode > 299) {
                    if (httpStatusCode == 416) {
                        if (dataSpec.position == androidx.media3.datasource.HttpUtil.getDocumentSize(getFirstHeader(asMap, com.google.common.net.HttpHeaders.CONTENT_RANGE))) {
                            this.opened = true;
                            transferStarted(dataSpec);
                            if (dataSpec.length != -1) {
                                return dataSpec.length;
                            }
                            return 0L;
                        }
                    }
                    try {
                        responseBody = readResponseBody();
                    } catch (java.io.IOException unused) {
                        responseBody = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
                    }
                    throw new androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException(httpStatusCode, urlResponseInfo.getHttpStatusText(), httpStatusCode == 416 ? new androidx.media3.datasource.DataSourceException(2008) : null, asMap, dataSpec, responseBody);
                }
                com.google.common.base.Predicate<java.lang.String> predicate = this.contentTypePredicate;
                if (predicate != null && (firstHeader = getFirstHeader(asMap, "Content-Type")) != null && !predicate.apply(firstHeader)) {
                    throw new androidx.media3.datasource.HttpDataSource.InvalidContentTypeException(firstHeader, dataSpec);
                }
                if (httpStatusCode == 200 && dataSpec.position != 0) {
                    j = dataSpec.position;
                }
                if (isCompressed(urlResponseInfo) || dataSpec.length != -1) {
                    this.bytesRemaining = dataSpec.length;
                } else {
                    long contentLength = androidx.media3.datasource.HttpUtil.getContentLength(getFirstHeader(asMap, com.google.common.net.HttpHeaders.CONTENT_LENGTH), getFirstHeader(asMap, com.google.common.net.HttpHeaders.CONTENT_RANGE));
                    this.bytesRemaining = contentLength != -1 ? contentLength - j : -1L;
                }
                this.opened = true;
                transferStarted(dataSpec);
                skipFully(j, dataSpec);
                return this.bytesRemaining;
            } catch (java.lang.InterruptedException unused2) {
                java.lang.Thread.currentThread().interrupt();
                throw new androidx.media3.datasource.HttpEngineDataSource.OpenException(new java.io.InterruptedIOException(), dataSpec, 1004, -1);
            }
        } catch (java.io.IOException e) {
            if (e instanceof androidx.media3.datasource.HttpDataSource.HttpDataSourceException) {
                throw ((androidx.media3.datasource.HttpDataSource.HttpDataSourceException) e);
            }
            throw new androidx.media3.datasource.HttpEngineDataSource.OpenException(e, dataSpec, 2000, 0);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        androidx.media3.common.util.Assertions.checkState(this.opened);
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        java.nio.ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        if (!orCreateReadBuffer.hasRemaining()) {
            this.operation.close();
            orCreateReadBuffer.clear();
            readInternal(orCreateReadBuffer, (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Util.castNonNull(this.currentDataSpec));
            if (this.finished) {
                this.bytesRemaining = 0L;
                return -1;
            }
            orCreateReadBuffer.flip();
            androidx.media3.common.util.Assertions.checkState(orCreateReadBuffer.hasRemaining());
        }
        long[] jArr = new long[3];
        long j = this.bytesRemaining;
        if (j == -1) {
            j = Long.MAX_VALUE;
        }
        jArr[0] = j;
        jArr[1] = orCreateReadBuffer.remaining();
        jArr[2] = i2;
        int iMin = (int) com.google.common.primitives.Longs.min(jArr);
        orCreateReadBuffer.get(bArr, i, iMin);
        long j2 = this.bytesRemaining;
        if (j2 != -1) {
            this.bytesRemaining = j2 - ((long) iMin);
        }
        bytesTransferred(iMin);
        return iMin;
    }

    public int read(java.nio.ByteBuffer byteBuffer) throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        int iCopyByteBuffer;
        androidx.media3.common.util.Assertions.checkState(this.opened);
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Passed buffer is not a direct ByteBuffer");
        }
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        int iRemaining = byteBuffer.remaining();
        java.nio.ByteBuffer byteBuffer2 = this.readBuffer;
        if (byteBuffer2 != null && (iCopyByteBuffer = copyByteBuffer(byteBuffer2, byteBuffer)) != 0) {
            long j = this.bytesRemaining;
            if (j != -1) {
                this.bytesRemaining = j - ((long) iCopyByteBuffer);
            }
            bytesTransferred(iCopyByteBuffer);
            return iCopyByteBuffer;
        }
        this.operation.close();
        readInternal(byteBuffer, (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Util.castNonNull(this.currentDataSpec));
        if (this.finished) {
            this.bytesRemaining = 0L;
            return -1;
        }
        androidx.media3.common.util.Assertions.checkState(iRemaining > byteBuffer.remaining());
        int iRemaining2 = iRemaining - byteBuffer.remaining();
        long j2 = this.bytesRemaining;
        if (j2 != -1) {
            this.bytesRemaining = j2 - ((long) iRemaining2);
        }
        bytesTransferred(iRemaining2);
        return iRemaining2;
    }

    @Override // androidx.media3.datasource.DataSource
    public synchronized void close() {
        androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper urlRequestWrapper = this.currentUrlRequestWrapper;
        if (urlRequestWrapper != null) {
            urlRequestWrapper.close();
            this.currentUrlRequestWrapper = null;
        }
        java.nio.ByteBuffer byteBuffer = this.readBuffer;
        if (byteBuffer != null) {
            byteBuffer.limit(0);
        }
        this.currentDataSpec = null;
        this.responseInfo = null;
        this.exception = null;
        this.finished = false;
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
    }

    android.net.http.UrlRequest.Callback getCurrentUrlRequestCallback() {
        androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper urlRequestWrapper = this.currentUrlRequestWrapper;
        if (urlRequestWrapper == null) {
            return null;
        }
        return urlRequestWrapper.getUrlRequestCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper buildRequestWrapper(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        androidx.media3.datasource.HttpEngineDataSource.UrlRequestCallback urlRequestCallback = new androidx.media3.datasource.HttpEngineDataSource.UrlRequestCallback();
        return new androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper(buildRequestBuilder(dataSpec, urlRequestCallback).build(), urlRequestCallback);
    }

    private android.net.http.UrlRequest.Builder buildRequestBuilder(androidx.media3.datasource.DataSpec dataSpec, android.net.http.UrlRequest.Callback callback) throws java.io.IOException {
        android.net.http.UrlRequest.Builder directExecutorAllowed = this.httpEngine.newUrlRequestBuilder(dataSpec.uri.toString(), this.executor, callback).setPriority(this.requestPriority).setDirectExecutorAllowed(true);
        java.util.HashMap map = new java.util.HashMap();
        androidx.media3.datasource.HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            map.putAll(requestProperties.getSnapshot());
        }
        map.putAll(this.requestProperties.getSnapshot());
        map.putAll(dataSpec.httpRequestHeaders);
        for (java.util.Map.Entry entry : map.entrySet()) {
            directExecutorAllowed.addHeader((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        if (dataSpec.httpBody != null && !map.containsKey("Content-Type")) {
            throw new androidx.media3.datasource.HttpEngineDataSource.OpenException("HTTP request with non-empty body must set Content-Type", dataSpec, 1004, 0);
        }
        java.lang.String strBuildRangeRequestHeader = androidx.media3.datasource.HttpUtil.buildRangeRequestHeader(dataSpec.position, dataSpec.length);
        if (strBuildRangeRequestHeader != null) {
            directExecutorAllowed.addHeader(com.google.common.net.HttpHeaders.RANGE, strBuildRangeRequestHeader);
        }
        java.lang.String str = this.userAgent;
        if (str != null) {
            directExecutorAllowed.addHeader(com.google.common.net.HttpHeaders.USER_AGENT, str);
        }
        directExecutorAllowed.setHttpMethod(dataSpec.getHttpMethodString());
        if (dataSpec.httpBody != null) {
            directExecutorAllowed.setUploadDataProvider(new androidx.media3.datasource.ByteArrayUploadDataProvider(dataSpec.httpBody), this.executor);
        }
        return directExecutorAllowed;
    }

    private boolean blockUntilConnectTimeout() throws java.lang.InterruptedException {
        long jElapsedRealtime = this.clock.elapsedRealtime();
        boolean zBlock = false;
        while (!zBlock && jElapsedRealtime < this.currentConnectTimeoutMs) {
            zBlock = this.operation.block((this.currentConnectTimeoutMs - jElapsedRealtime) + 5);
            jElapsedRealtime = this.clock.elapsedRealtime();
        }
        return zBlock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetConnectTimeout() {
        this.currentConnectTimeoutMs = this.clock.elapsedRealtime() + ((long) this.connectTimeoutMs);
    }

    private void skipFully(long j, androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        if (j == 0) {
            return;
        }
        java.nio.ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (j > 0) {
            try {
                this.operation.close();
                orCreateReadBuffer.clear();
                readInternal(orCreateReadBuffer, dataSpec);
                if (java.lang.Thread.currentThread().isInterrupted()) {
                    throw new java.io.InterruptedIOException();
                }
                if (this.finished) {
                    throw new androidx.media3.datasource.HttpEngineDataSource.OpenException(dataSpec, 2008, 14);
                }
                orCreateReadBuffer.flip();
                androidx.media3.common.util.Assertions.checkState(orCreateReadBuffer.hasRemaining());
                int iMin = (int) java.lang.Math.min(orCreateReadBuffer.remaining(), j);
                orCreateReadBuffer.position(orCreateReadBuffer.position() + iMin);
                j -= (long) iMin;
            } catch (java.io.IOException e) {
                if (e instanceof androidx.media3.datasource.HttpDataSource.HttpDataSourceException) {
                    throw ((androidx.media3.datasource.HttpDataSource.HttpDataSourceException) e);
                }
                throw new androidx.media3.datasource.HttpEngineDataSource.OpenException(e, dataSpec, e instanceof java.net.SocketTimeoutException ? 2002 : 2001, 14);
            }
        }
    }

    private byte[] readResponseBody() throws java.io.IOException {
        byte[] bArrCopyOf = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
        java.nio.ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (!this.finished) {
            this.operation.close();
            orCreateReadBuffer.clear();
            readInternal(orCreateReadBuffer, (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Util.castNonNull(this.currentDataSpec));
            orCreateReadBuffer.flip();
            if (orCreateReadBuffer.remaining() > 0) {
                int length = bArrCopyOf.length;
                bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + orCreateReadBuffer.remaining());
                orCreateReadBuffer.get(bArrCopyOf, length, orCreateReadBuffer.remaining());
            }
        }
        return bArrCopyOf;
    }

    private void readInternal(java.nio.ByteBuffer byteBuffer, androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.HttpDataSource.HttpDataSourceException {
        ((androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper) androidx.media3.common.util.Util.castNonNull(this.currentUrlRequestWrapper)).read(byteBuffer);
        try {
            if (!this.operation.block(this.readTimeoutMs)) {
                throw new java.net.SocketTimeoutException();
            }
        } catch (java.lang.InterruptedException unused) {
            if (byteBuffer == this.readBuffer) {
                this.readBuffer = null;
            }
            java.lang.Thread.currentThread().interrupt();
            this.exception = new java.io.InterruptedIOException();
        } catch (java.net.SocketTimeoutException e) {
            if (byteBuffer == this.readBuffer) {
                this.readBuffer = null;
            }
            this.exception = new androidx.media3.datasource.HttpDataSource.HttpDataSourceException(e, dataSpec, 2002, 2);
        }
        java.io.IOException iOException = this.exception;
        if (iOException != null) {
            if (iOException instanceof androidx.media3.datasource.HttpDataSource.HttpDataSourceException) {
                throw ((androidx.media3.datasource.HttpDataSource.HttpDataSourceException) iOException);
            }
            throw androidx.media3.datasource.HttpDataSource.HttpDataSourceException.createForIOException(iOException, dataSpec, 2);
        }
    }

    private java.nio.ByteBuffer getOrCreateReadBuffer() {
        if (this.readBuffer == null) {
            java.nio.ByteBuffer byteBufferAllocateDirect = java.nio.ByteBuffer.allocateDirect(32768);
            this.readBuffer = byteBufferAllocateDirect;
            byteBufferAllocateDirect.limit(0);
        }
        return this.readBuffer;
    }

    private static boolean isCompressed(android.net.http.UrlResponseInfo urlResponseInfo) {
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : urlResponseInfo.getHeaders().getAsList()) {
            if (entry.getKey().equalsIgnoreCase(com.google.common.net.HttpHeaders.CONTENT_ENCODING)) {
                return !entry.getValue().equalsIgnoreCase("identity");
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String parseCookies(java.util.List<java.lang.String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return android.text.TextUtils.join(";", list);
    }

    private static java.lang.String getFirstHeader(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, java.lang.String str) {
        java.util.List<java.lang.String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static int copyByteBuffer(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2) {
        int iMin = java.lang.Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }

    private static final class UrlRequestWrapper {
        private final android.net.http.UrlRequest urlRequest;
        private final androidx.media3.datasource.HttpEngineDataSource.UrlRequestCallback urlRequestCallback;

        UrlRequestWrapper(android.net.http.UrlRequest urlRequest, androidx.media3.datasource.HttpEngineDataSource.UrlRequestCallback urlRequestCallback) {
            this.urlRequest = urlRequest;
            this.urlRequestCallback = urlRequestCallback;
        }

        public void start() {
            this.urlRequest.start();
        }

        public void read(java.nio.ByteBuffer byteBuffer) {
            this.urlRequest.read(byteBuffer);
        }

        public void close() {
            this.urlRequestCallback.close();
            this.urlRequest.cancel();
        }

        public android.net.http.UrlRequest.Callback getUrlRequestCallback() {
            return this.urlRequestCallback;
        }

        public int getStatus() throws java.lang.InterruptedException {
            final androidx.media3.common.util.ConditionVariable conditionVariable = new androidx.media3.common.util.ConditionVariable();
            final int[] iArr = new int[1];
            this.urlRequest.getStatus(new android.net.http.UrlRequest.StatusListener() { // from class: androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper.1
                @Override // android.net.http.UrlRequest.StatusListener
                public void onStatus(int i) {
                    iArr[0] = i;
                    conditionVariable.open();
                }
            });
            conditionVariable.block();
            return iArr[0];
        }
    }

    private final class UrlRequestCallback implements android.net.http.UrlRequest.Callback {
        private volatile boolean isClosed;

        private UrlRequestCallback() {
            this.isClosed = false;
        }

        public void close() {
            this.isClosed = true;
        }

        @Override // android.net.http.UrlRequest.Callback
        public synchronized void onRedirectReceived(android.net.http.UrlRequest urlRequest, android.net.http.UrlResponseInfo urlResponseInfo, java.lang.String str) {
            androidx.media3.datasource.DataSpec dataSpecWithUri;
            if (this.isClosed) {
                return;
            }
            androidx.media3.datasource.DataSpec dataSpec = (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.datasource.HttpEngineDataSource.this.currentDataSpec);
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (dataSpec.httpMethod != 2 || (httpStatusCode != 307 && httpStatusCode != 308)) {
                if (androidx.media3.datasource.HttpEngineDataSource.this.resetTimeoutOnRedirects) {
                    androidx.media3.datasource.HttpEngineDataSource.this.resetConnectTimeout();
                }
                boolean z = androidx.media3.datasource.HttpEngineDataSource.this.keepPostFor302Redirects && dataSpec.httpMethod == 2 && httpStatusCode == 302;
                if (z || androidx.media3.datasource.HttpEngineDataSource.this.handleSetCookieRequests) {
                    java.lang.String cookies = androidx.media3.datasource.HttpEngineDataSource.parseCookies(urlResponseInfo.getHeaders().getAsMap().get(com.google.common.net.HttpHeaders.SET_COOKIE));
                    if (!z && android.text.TextUtils.isEmpty(cookies)) {
                        urlRequest.followRedirect();
                        return;
                    }
                    urlRequest.cancel();
                    if (!z && dataSpec.httpMethod == 2) {
                        dataSpecWithUri = dataSpec.buildUpon().setUri(str).setHttpMethod(1).setHttpBody(null).build();
                    } else {
                        dataSpecWithUri = dataSpec.withUri(android.net.Uri.parse(str));
                    }
                    if (!android.text.TextUtils.isEmpty(cookies)) {
                        java.util.HashMap map = new java.util.HashMap();
                        map.putAll(dataSpec.httpRequestHeaders);
                        map.put(com.google.common.net.HttpHeaders.COOKIE, cookies);
                        dataSpecWithUri = dataSpecWithUri.buildUpon().setHttpRequestHeaders(map).build();
                    }
                    try {
                        androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper urlRequestWrapperBuildRequestWrapper = androidx.media3.datasource.HttpEngineDataSource.this.buildRequestWrapper(dataSpecWithUri);
                        if (androidx.media3.datasource.HttpEngineDataSource.this.currentUrlRequestWrapper != null) {
                            androidx.media3.datasource.HttpEngineDataSource.this.currentUrlRequestWrapper.close();
                        }
                        androidx.media3.datasource.HttpEngineDataSource.this.currentUrlRequestWrapper = urlRequestWrapperBuildRequestWrapper;
                        androidx.media3.datasource.HttpEngineDataSource.this.currentUrlRequestWrapper.start();
                        return;
                    } catch (java.io.IOException e) {
                        androidx.media3.datasource.HttpEngineDataSource.this.exception = e;
                        return;
                    }
                }
                urlRequest.followRedirect();
                return;
            }
            androidx.media3.datasource.HttpEngineDataSource.this.exception = new androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException(httpStatusCode, urlResponseInfo.getHttpStatusText(), null, urlResponseInfo.getHeaders().getAsMap(), dataSpec, androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY);
            androidx.media3.datasource.HttpEngineDataSource.this.operation.open();
        }

        @Override // android.net.http.UrlRequest.Callback
        public synchronized void onResponseStarted(android.net.http.UrlRequest urlRequest, android.net.http.UrlResponseInfo urlResponseInfo) {
            if (this.isClosed) {
                return;
            }
            androidx.media3.datasource.HttpEngineDataSource.this.responseInfo = urlResponseInfo;
            androidx.media3.datasource.HttpEngineDataSource.this.operation.open();
        }

        @Override // android.net.http.UrlRequest.Callback
        public synchronized void onReadCompleted(android.net.http.UrlRequest urlRequest, android.net.http.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) {
            if (this.isClosed) {
                return;
            }
            androidx.media3.datasource.HttpEngineDataSource.this.operation.open();
        }

        @Override // android.net.http.UrlRequest.Callback
        public synchronized void onSucceeded(android.net.http.UrlRequest urlRequest, android.net.http.UrlResponseInfo urlResponseInfo) {
            if (this.isClosed) {
                return;
            }
            androidx.media3.datasource.HttpEngineDataSource.this.finished = true;
            androidx.media3.datasource.HttpEngineDataSource.this.operation.open();
        }

        @Override // android.net.http.UrlRequest.Callback
        public synchronized void onFailed(android.net.http.UrlRequest urlRequest, android.net.http.UrlResponseInfo urlResponseInfo, android.net.http.HttpException httpException) {
            if (this.isClosed) {
                return;
            }
            if (!(httpException instanceof android.net.http.NetworkException) || ((android.net.http.NetworkException) httpException).getErrorCode() != 1) {
                androidx.media3.datasource.HttpEngineDataSource.this.exception = httpException;
            } else {
                androidx.media3.datasource.HttpEngineDataSource.this.exception = new java.net.UnknownHostException();
            }
            androidx.media3.datasource.HttpEngineDataSource.this.operation.open();
        }

        @Override // android.net.http.UrlRequest.Callback
        public synchronized void onCanceled(android.net.http.UrlRequest urlRequest, android.net.http.UrlResponseInfo urlResponseInfo) {
        }
    }
}
