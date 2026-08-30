package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2ExchangeCodec.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0001(B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", okhttp3.internal.http2.Http2ExchangeCodec.CONNECTION, "Lokhttp3/internal/connection/RealConnection;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/http2/Http2Connection;)V", "canceled", "", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "protocol", "Lokhttp3/Protocol;", "stream", "Lokhttp3/internal/http2/Http2Stream;", "cancel", "", "createRequestBody", "Lokio/Sink;", "request", "Lokhttp3/Request;", "contentLength", "", "finishRequest", "flushRequest", "openResponseBodySource", "Lokio/Source;", com.json.hs.n, "Lokhttp3/Response;", "readResponseHeaders", "Lokhttp3/Response$Builder;", "expectContinue", "reportedContentLength", "trailers", "Lokhttp3/Headers;", "writeRequestHeaders", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {
    private volatile boolean canceled;
    private final okhttp3.internal.http.RealInterceptorChain chain;
    private final okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.internal.http2.Http2Connection http2Connection;
    private final okhttp3.Protocol protocol;
    private volatile okhttp3.internal.http2.Http2Stream stream;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.http2.Http2ExchangeCodec.Companion INSTANCE = new okhttp3.internal.http2.Http2ExchangeCodec.Companion(null);
    private static final java.lang.String CONNECTION = "connection";
    private static final java.lang.String HOST = "host";
    private static final java.lang.String KEEP_ALIVE = "keep-alive";
    private static final java.lang.String PROXY_CONNECTION = "proxy-connection";
    private static final java.lang.String TE = "te";
    private static final java.lang.String TRANSFER_ENCODING = "transfer-encoding";
    private static final java.lang.String ENCODING = "encoding";
    private static final java.lang.String UPGRADE = "upgrade";
    private static final java.util.List<java.lang.String> HTTP_2_SKIPPED_REQUEST_HEADERS = okhttp3.internal.Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE, okhttp3.internal.http2.Header.TARGET_METHOD_UTF8, okhttp3.internal.http2.Header.TARGET_PATH_UTF8, okhttp3.internal.http2.Header.TARGET_SCHEME_UTF8, okhttp3.internal.http2.Header.TARGET_AUTHORITY_UTF8);
    private static final java.util.List<java.lang.String> HTTP_2_SKIPPED_RESPONSE_HEADERS = okhttp3.internal.Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE);

    public Http2ExchangeCodec(okhttp3.OkHttpClient client, okhttp3.internal.connection.RealConnection connection, okhttp3.internal.http.RealInterceptorChain chain, okhttp3.internal.http2.Http2Connection http2Connection) {
        okhttp3.Protocol protocol;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.connection = connection;
        this.chain = chain;
        this.http2Connection = http2Connection;
        if (client.protocols().contains(okhttp3.Protocol.H2_PRIOR_KNOWLEDGE)) {
            protocol = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE;
        } else {
            protocol = okhttp3.Protocol.HTTP_2;
        }
        this.protocol = protocol;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.internal.connection.RealConnection getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okio.Sink createRequestBody(okhttp3.Request request, long contentLength) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        okhttp3.internal.http2.Http2Stream http2Stream = this.stream;
        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream);
        return http2Stream.getSink();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(okhttp3.Request request) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.newStream(INSTANCE.http2HeadersList(request), request.body() != null);
        if (this.canceled) {
            okhttp3.internal.http2.Http2Stream http2Stream = this.stream;
            kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream);
            http2Stream.closeLater(okhttp3.internal.http2.ErrorCode.CANCEL);
            throw new java.io.IOException("Canceled");
        }
        okhttp3.internal.http2.Http2Stream http2Stream2 = this.stream;
        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream2);
        http2Stream2.readTimeout().timeout(this.chain.getReadTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        okhttp3.internal.http2.Http2Stream http2Stream3 = this.stream;
        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream3);
        http2Stream3.writeTimeout().timeout(this.chain.getWriteTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws java.io.IOException {
        this.http2Connection.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() throws java.io.IOException {
        okhttp3.internal.http2.Http2Stream http2Stream = this.stream;
        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream);
        http2Stream.getSink().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.Response.Builder readResponseHeaders(boolean expectContinue) throws java.io.IOException {
        okhttp3.internal.http2.Http2Stream http2Stream = this.stream;
        if (http2Stream == null) {
            throw new java.io.IOException("stream wasn't created");
        }
        okhttp3.Response.Builder http2HeadersList = INSTANCE.readHttp2HeadersList(http2Stream.takeHeaders(), this.protocol);
        if (expectContinue && http2HeadersList.getCode() == 100) {
            return null;
        }
        return http2HeadersList;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        if (okhttp3.internal.http.HttpHeaders.promisesBody(response)) {
            return okhttp3.internal.Util.headersContentLength(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okio.Source openResponseBodySource(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        okhttp3.internal.http2.Http2Stream http2Stream = this.stream;
        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream);
        return http2Stream.getSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.Headers trailers() {
        okhttp3.internal.http2.Http2Stream http2Stream = this.stream;
        kotlin.jvm.internal.Intrinsics.checkNotNull(http2Stream);
        return http2Stream.trailers();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.canceled = true;
        okhttp3.internal.http2.Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(okhttp3.internal.http2.ErrorCode.CANCEL);
        }
    }

    /* JADX INFO: compiled from: Http2ExchangeCodec.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "()V", "CONNECTION", "", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", com.google.common.net.HttpHeaders.TE, "TRANSFER_ENCODING", "UPGRADE", "http2HeadersList", "Lokhttp3/internal/http2/Header;", "request", "Lokhttp3/Request;", "readHttp2HeadersList", "Lokhttp3/Response$Builder;", "headerBlock", "Lokhttp3/Headers;", "protocol", "Lokhttp3/Protocol;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.util.List<okhttp3.internal.http2.Header> http2HeadersList(okhttp3.Request request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            okhttp3.Headers headers = request.headers();
            java.util.ArrayList arrayList = new java.util.ArrayList(headers.size() + 4);
            arrayList.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_METHOD, request.method()));
            arrayList.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_PATH, okhttp3.internal.http.RequestLine.INSTANCE.requestPath(request.url())));
            java.lang.String strHeader = request.header(com.google.common.net.HttpHeaders.HOST);
            if (strHeader != null) {
                arrayList.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_AUTHORITY, strHeader));
            }
            arrayList.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_SCHEME, request.url().scheme()));
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                java.lang.String strName = headers.name(i);
                java.util.Locale US = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US, "US");
                java.lang.String lowerCase = strName.toLowerCase(US);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(lowerCase) || (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, okhttp3.internal.http2.Http2ExchangeCodec.TE) && kotlin.jvm.internal.Intrinsics.areEqual(headers.value(i), "trailers"))) {
                    arrayList.add(new okhttp3.internal.http2.Header(lowerCase, headers.value(i)));
                }
            }
            return arrayList;
        }

        public final okhttp3.Response.Builder readHttp2HeadersList(okhttp3.Headers headerBlock, okhttp3.Protocol protocol) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
            okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
            int size = headerBlock.size();
            okhttp3.internal.http.StatusLine statusLine = null;
            for (int i = 0; i < size; i++) {
                java.lang.String strName = headerBlock.name(i);
                java.lang.String strValue = headerBlock.value(i);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(strName, okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8)) {
                    if (!okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(strName)) {
                        builder.addLenient$okhttp(strName, strValue);
                    }
                } else {
                    statusLine = okhttp3.internal.http.StatusLine.INSTANCE.parse("HTTP/1.1 " + strValue);
                }
            }
            if (statusLine == null) {
                throw new java.net.ProtocolException("Expected ':status' header not present");
            }
            return new okhttp3.Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
        }
    }
}
