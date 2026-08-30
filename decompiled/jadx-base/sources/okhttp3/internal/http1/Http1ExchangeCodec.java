package okhttp3.internal.http1;

/* JADX INFO: compiled from: Http1ExchangeCodec.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 ?2\u00020\u0001:\u0007<=>?@ABB'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001cH\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\b\u0010'\u001a\u00020\u001eH\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020!H\u0002J\b\u0010.\u001a\u00020\u001eH\u0002J\b\u0010/\u001a\u00020)H\u0002J\u0010\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020\u0019H\u0016J\u0012\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u0010H\u0016J\u0010\u00105\u001a\u00020!2\u0006\u00101\u001a\u00020\u0019H\u0016J\u000e\u00106\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u0019J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020:J\u0010\u0010;\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0017H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\u00020\u0010*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0018\u0010\u0016\u001a\u00020\u0010*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001a¨\u0006C"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "connection", "Lokhttp3/internal/connection/RealConnection;", "source", "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokio/BufferedSource;Lokio/BufferedSink;)V", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "headersReader", "Lokhttp3/internal/http1/HeadersReader;", "isClosed", "", "()Z", "state", "", "trailers", "Lokhttp3/Headers;", "isChunked", "Lokhttp3/Request;", "(Lokhttp3/Request;)Z", "Lokhttp3/Response;", "(Lokhttp3/Response;)Z", "cancel", "", "createRequestBody", "Lokio/Sink;", "request", "contentLength", "", "detachTimeout", "timeout", "Lokio/ForwardingTimeout;", "finishRequest", "flushRequest", "newChunkedSink", "newChunkedSource", "Lokio/Source;", "url", "Lokhttp3/HttpUrl;", "newFixedLengthSource", "length", "newKnownLengthSink", "newUnknownLengthSource", "openResponseBodySource", com.json.hs.n, "readResponseHeaders", "Lokhttp3/Response$Builder;", "expectContinue", "reportedContentLength", "skipConnectBody", "writeRequest", "headers", "requestLine", "", "writeRequestHeaders", "AbstractSource", "ChunkedSink", "ChunkedSource", "Companion", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http1ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final okhttp3.OkHttpClient client;
    private final okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.internal.http1.HeadersReader headersReader;
    private final okio.BufferedSink sink;
    private final okio.BufferedSource source;
    private int state;
    private okhttp3.Headers trailers;

    public Http1ExchangeCodec(okhttp3.OkHttpClient okHttpClient, okhttp3.internal.connection.RealConnection connection, okio.BufferedSource source, okio.BufferedSink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        this.client = okHttpClient;
        this.connection = connection;
        this.source = source;
        this.sink = sink;
        this.headersReader = new okhttp3.internal.http1.HeadersReader(source);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.internal.connection.RealConnection getConnection() {
        return this.connection;
    }

    private final boolean isChunked(okhttp3.Response response) {
        return kotlin.text.StringsKt.equals("chunked", okhttp3.Response.header$default(response, com.google.common.net.HttpHeaders.TRANSFER_ENCODING, null, 2, null), true);
    }

    private final boolean isChunked(okhttp3.Request request) {
        return kotlin.text.StringsKt.equals("chunked", request.header(com.google.common.net.HttpHeaders.TRANSFER_ENCODING), true);
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okio.Sink createRequestBody(okhttp3.Request request, long contentLength) throws java.net.ProtocolException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new java.net.ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (contentLength != -1) {
            return newKnownLengthSink();
        }
        throw new java.lang.IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        okhttp3.internal.http.RequestLine requestLine = okhttp3.internal.http.RequestLine.INSTANCE;
        java.net.Proxy.Type type = getConnection().getRoute().proxy().type();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        if (!okhttp3.internal.http.HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (isChunked(response)) {
            return -1L;
        }
        return okhttp3.internal.Util.headersContentLength(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okio.Source openResponseBodySource(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        if (!okhttp3.internal.http.HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long jHeadersContentLength = okhttp3.internal.Util.headersContentLength(response);
        if (jHeadersContentLength != -1) {
            return newFixedLengthSource(jHeadersContentLength);
        }
        return newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.Headers trailers() {
        if (!(this.state == 6)) {
            throw new java.lang.IllegalStateException("too early; can't read the trailers yet".toString());
        }
        okhttp3.Headers headers = this.trailers;
        return headers == null ? okhttp3.internal.Util.EMPTY_HEADERS : headers;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws java.io.IOException {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    public final void writeRequest(okhttp3.Headers headers, java.lang.String requestLine) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (!(this.state == 0)) {
            throw new java.lang.IllegalStateException(("state: " + this.state).toString());
        }
        this.sink.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            this.sink.writeUtf8(headers.name(i)).writeUtf8(": ").writeUtf8(headers.value(i)).writeUtf8("\r\n");
        }
        this.sink.writeUtf8("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public okhttp3.Response.Builder readResponseHeaders(boolean expectContinue) {
        int i = this.state;
        boolean z = false;
        if (!(i == 1 || i == 2 || i == 3)) {
            throw new java.lang.IllegalStateException(("state: " + this.state).toString());
        }
        try {
            okhttp3.internal.http.StatusLine statusLine = okhttp3.internal.http.StatusLine.INSTANCE.parse(this.headersReader.readLine());
            okhttp3.Response.Builder builderHeaders = new okhttp3.Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.headersReader.readHeaders());
            if (expectContinue && statusLine.code == 100) {
                return null;
            }
            if (statusLine.code == 100) {
                this.state = 3;
                return builderHeaders;
            }
            int i2 = statusLine.code;
            if (102 <= i2 && i2 < 200) {
                z = true;
            }
            if (z) {
                this.state = 3;
                return builderHeaders;
            }
            this.state = 4;
            return builderHeaders;
        } catch (java.io.EOFException e) {
            throw new java.io.IOException("unexpected end of stream on " + getConnection().getRoute().address().url().redact(), e);
        }
    }

    private final okio.Sink newChunkedSink() {
        if (!(this.state == 1)) {
            throw new java.lang.IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 2;
        return new okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSink();
    }

    private final okio.Sink newKnownLengthSink() {
        if (!(this.state == 1)) {
            throw new java.lang.IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 2;
        return new okhttp3.internal.http1.Http1ExchangeCodec.KnownLengthSink();
    }

    private final okio.Source newFixedLengthSource(long length) {
        if (!(this.state == 4)) {
            throw new java.lang.IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        return new okhttp3.internal.http1.Http1ExchangeCodec.FixedLengthSource(length);
    }

    private final okio.Source newChunkedSource(okhttp3.HttpUrl url) {
        if (!(this.state == 4)) {
            throw new java.lang.IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        return new okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSource(this, url);
    }

    private final okio.Source newUnknownLengthSource() {
        if (!(this.state == 4)) {
            throw new java.lang.IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        getConnection().noNewExchanges$okhttp();
        return new okhttp3.internal.http1.Http1ExchangeCodec.UnknownLengthSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(okio.ForwardingTimeout timeout) {
        okio.Timeout delegate = timeout.getDelegate();
        timeout.setDelegate(okio.Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    public final void skipConnectBody(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        long jHeadersContentLength = okhttp3.internal.Util.headersContentLength(response);
        if (jHeadersContentLength == -1) {
            return;
        }
        okio.Source sourceNewFixedLengthSource = newFixedLengthSource(jHeadersContentLength);
        okhttp3.internal.Util.skipAll(sourceNewFixedLengthSource, Integer.MAX_VALUE, java.util.concurrent.TimeUnit.MILLISECONDS);
        sourceNewFixedLengthSource.close();
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0005\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Lokio/Sink;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "closed", "", "timeout", "Lokio/ForwardingTimeout;", "close", "", "flush", "Lokio/Timeout;", "write", "source", "Lokio/Buffer;", "byteCount", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class KnownLengthSink implements okio.Sink {
        private boolean closed;
        private final okio.ForwardingTimeout timeout;

        public KnownLengthSink() {
            this.timeout = new okio.ForwardingTimeout(okhttp3.internal.http1.Http1ExchangeCodec.this.sink.getTimeout());
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public okio.Timeout getTimeout() {
            return this.timeout;
        }

        @Override // okio.Sink
        public void write(okio.Buffer source, long byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.closed)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            okhttp3.internal.Util.checkOffsetAndCount(source.size(), 0L, byteCount);
            okhttp3.internal.http1.Http1ExchangeCodec.this.sink.write(source, byteCount);
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws java.io.IOException {
            if (this.closed) {
                return;
            }
            okhttp3.internal.http1.Http1ExchangeCodec.this.sink.flush();
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            okhttp3.internal.http1.Http1ExchangeCodec.this.detachTimeout(this.timeout);
            okhttp3.internal.http1.Http1ExchangeCodec.this.state = 3;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0005\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Lokio/Sink;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "closed", "", "timeout", "Lokio/ForwardingTimeout;", "close", "", "flush", "Lokio/Timeout;", "write", "source", "Lokio/Buffer;", "byteCount", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class ChunkedSink implements okio.Sink {
        private boolean closed;
        private final okio.ForwardingTimeout timeout;

        public ChunkedSink() {
            this.timeout = new okio.ForwardingTimeout(okhttp3.internal.http1.Http1ExchangeCodec.this.sink.getTimeout());
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public okio.Timeout getTimeout() {
            return this.timeout;
        }

        @Override // okio.Sink
        public void write(okio.Buffer source, long byteCount) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.closed)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            if (byteCount == 0) {
                return;
            }
            okhttp3.internal.http1.Http1ExchangeCodec.this.sink.writeHexadecimalUnsignedLong(byteCount);
            okhttp3.internal.http1.Http1ExchangeCodec.this.sink.writeUtf8("\r\n");
            okhttp3.internal.http1.Http1ExchangeCodec.this.sink.write(source, byteCount);
            okhttp3.internal.http1.Http1ExchangeCodec.this.sink.writeUtf8("\r\n");
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            okhttp3.internal.http1.Http1ExchangeCodec.this.sink.flush();
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            okhttp3.internal.http1.Http1ExchangeCodec.this.sink.writeUtf8("0\r\n\r\n");
            okhttp3.internal.http1.Http1ExchangeCodec.this.detachTimeout(this.timeout);
            okhttp3.internal.http1.Http1ExchangeCodec.this.state = 3;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b¢\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\t\u001a\u00020\u0014H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokio/Source;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "timeout", "Lokio/ForwardingTimeout;", "getTimeout", "()Lokio/ForwardingTimeout;", "read", "", "sink", "Lokio/Buffer;", "byteCount", "responseBodyComplete", "", "Lokio/Timeout;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    private abstract class AbstractSource implements okio.Source {
        private boolean closed;
        private final okio.ForwardingTimeout timeout;

        public AbstractSource() {
            this.timeout = new okio.ForwardingTimeout(okhttp3.internal.http1.Http1ExchangeCodec.this.source.getTimeout());
        }

        protected final okio.ForwardingTimeout getTimeout() {
            return this.timeout;
        }

        protected final boolean getClosed() {
            return this.closed;
        }

        protected final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout */
        public okio.Timeout getTimeout() {
            return this.timeout;
        }

        @Override // okio.Source
        public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return okhttp3.internal.http1.Http1ExchangeCodec.this.source.read(sink, byteCount);
            } catch (java.io.IOException e) {
                okhttp3.internal.http1.Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e;
            }
        }

        public final void responseBodyComplete() {
            if (okhttp3.internal.http1.Http1ExchangeCodec.this.state == 6) {
                return;
            }
            if (okhttp3.internal.http1.Http1ExchangeCodec.this.state == 5) {
                okhttp3.internal.http1.Http1ExchangeCodec.this.detachTimeout(this.timeout);
                okhttp3.internal.http1.Http1ExchangeCodec.this.state = 6;
                return;
            }
            throw new java.lang.IllegalStateException("state: " + okhttp3.internal.http1.Http1ExchangeCodec.this.state);
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "bytesRemaining", "", "(Lokhttp3/internal/http1/Http1ExchangeCodec;J)V", "close", "", "read", "sink", "Lokio/Buffer;", "byteCount", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class FixedLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(byteCount >= 0)) {
                throw new java.lang.IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (!(!getClosed())) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            long j = this.bytesRemaining;
            if (j == 0) {
                return -1L;
            }
            long j2 = super.read(sink, java.lang.Math.min(j, byteCount));
            if (j2 == -1) {
                okhttp3.internal.http1.Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            long j3 = this.bytesRemaining - j2;
            this.bytesRemaining = j3;
            if (j3 == 0) {
                responseBodyComplete();
            }
            return j2;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !okhttp3.internal.Util.discard(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                okhttp3.internal.http1.Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "url", "Lokhttp3/HttpUrl;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "bytesRemainingInChunk", "", "hasMoreChunks", "", "close", "", "read", "sink", "Lokio/Buffer;", "byteCount", "readChunkSize", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class ChunkedSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;
        private final okhttp3.HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(okhttp3.internal.http1.Http1ExchangeCodec http1ExchangeCodec, okhttp3.HttpUrl url) {
            super();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            this.this$0 = http1ExchangeCodec;
            this.url = url;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(byteCount >= 0)) {
                throw new java.lang.IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (!(!getClosed())) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j = this.bytesRemainingInChunk;
            if (j == 0 || j == -1) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long j2 = super.read(sink, java.lang.Math.min(byteCount, this.bytesRemainingInChunk));
            if (j2 == -1) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            this.bytesRemainingInChunk -= j2;
            return j2;
        }

        private final void readChunkSize() throws java.io.IOException {
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.readUtf8LineStrict();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.readHexadecimalUnsignedLong();
                java.lang.String string = kotlin.text.StringsKt.trim((java.lang.CharSequence) this.this$0.source.readUtf8LineStrict()).toString();
                if (this.bytesRemainingInChunk >= 0) {
                    if (!(string.length() > 0) || kotlin.text.StringsKt.startsWith$default(string, ";", false, 2, (java.lang.Object) null)) {
                        if (this.bytesRemainingInChunk == 0) {
                            this.hasMoreChunks = false;
                            okhttp3.internal.http1.Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                            http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                            okhttp3.OkHttpClient okHttpClient = this.this$0.client;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(okHttpClient);
                            okhttp3.CookieJar cookieJar = okHttpClient.cookieJar();
                            okhttp3.HttpUrl httpUrl = this.url;
                            okhttp3.Headers headers = this.this$0.trailers;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(headers);
                            okhttp3.internal.http.HttpHeaders.receiveHeaders(cookieJar, httpUrl, headers);
                            responseBodyComplete();
                            return;
                        }
                        return;
                    }
                }
                throw new java.net.ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + kotlin.text.Typography.quote);
            } catch (java.lang.NumberFormatException e) {
                throw new java.net.ProtocolException(e.getMessage());
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !okhttp3.internal.Util.discard(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "inputExhausted", "", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class UnknownLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(byteCount >= 0)) {
                throw new java.lang.IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (!(!getClosed())) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long j = super.read(sink, byteCount);
            if (j != -1) {
                return j;
            }
            this.inputExhausted = true;
            responseBodyComplete();
            return -1L;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }
    }
}
