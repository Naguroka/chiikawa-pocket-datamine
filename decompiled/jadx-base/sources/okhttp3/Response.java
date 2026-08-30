package okhttp3;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001FB{\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b+J\r\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\b,J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\b-J\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/J\b\u00101\u001a\u000202H\u0016J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b3J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\b4J\u001e\u00105\u001a\u0004\u0018\u00010\u00072\u0006\u00106\u001a\u00020\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007H\u0007J\r\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\b8J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070/2\u0006\u00106\u001a\u00020\u0007J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b9J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\b:J\u0006\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0014J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\b?J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b@J\r\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0002\bAJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\bBJ\r\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\bCJ\b\u0010D\u001a\u00020\u0007H\u0016J\u0006\u0010E\u001a\u00020\rR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001dR\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010 R\u0013\u0010\f\u001a\u00020\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010!R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b\"\u0010$R\u0011\u0010%\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0010\u0010&\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010'R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001dR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010(R\u0013\u0010\u0015\u001a\u00020\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010)R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010*R\u0013\u0010\u0013\u001a\u00020\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010)¨\u0006G"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "request", "Lokhttp3/Request;", "protocol", "Lokhttp3/Protocol;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "", "code", "", "handshake", "Lokhttp3/Handshake;", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/ResponseBody;", "networkResponse", "cacheResponse", "priorResponse", "sentRequestAtMillis", "", "receivedResponseAtMillis", "exchange", "Lokhttp3/internal/connection/Exchange;", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;)V", "()Lokhttp3/ResponseBody;", "cacheControl", "Lokhttp3/CacheControl;", "()Lokhttp3/CacheControl;", "()Lokhttp3/Response;", "()I", "()Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/Handshake;", "()Lokhttp3/Headers;", "isRedirect", "", "()Z", "isSuccessful", "lazyCacheControl", "()Ljava/lang/String;", "()Lokhttp3/Protocol;", "()J", "()Lokhttp3/Request;", "-deprecated_body", "-deprecated_cacheControl", "-deprecated_cacheResponse", "challenges", "", "Lokhttp3/Challenge;", "close", "", "-deprecated_code", "-deprecated_handshake", "header", "name", "defaultValue", "-deprecated_headers", "-deprecated_message", "-deprecated_networkResponse", "newBuilder", "Lokhttp3/Response$Builder;", "peekBody", "byteCount", "-deprecated_priorResponse", "-deprecated_protocol", "-deprecated_receivedResponseAtMillis", "-deprecated_request", "-deprecated_sentRequestAtMillis", "toString", "trailers", "Builder", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Response implements java.io.Closeable {
    private final okhttp3.ResponseBody body;
    private final okhttp3.Response cacheResponse;
    private final int code;
    private final okhttp3.internal.connection.Exchange exchange;
    private final okhttp3.Handshake handshake;
    private final okhttp3.Headers headers;
    private okhttp3.CacheControl lazyCacheControl;
    private final java.lang.String message;
    private final okhttp3.Response networkResponse;
    private final okhttp3.Response priorResponse;
    private final okhttp3.Protocol protocol;
    private final long receivedResponseAtMillis;
    private final okhttp3.Request request;
    private final long sentRequestAtMillis;

    public final java.lang.String header(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return header$default(this, name, null, 2, null);
    }

    public Response(okhttp3.Request request, okhttp3.Protocol protocol, java.lang.String message, int i, okhttp3.Handshake handshake, okhttp3.Headers headers, okhttp3.ResponseBody responseBody, okhttp3.Response response, okhttp3.Response response2, okhttp3.Response response3, long j, long j2, okhttp3.internal.connection.Exchange exchange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = exchange;
    }

    public final okhttp3.Request request() {
        return this.request;
    }

    public final okhttp3.Protocol protocol() {
        return this.protocol;
    }

    public final java.lang.String message() {
        return this.message;
    }

    public final int code() {
        return this.code;
    }

    public final okhttp3.Handshake handshake() {
        return this.handshake;
    }

    public final okhttp3.Headers headers() {
        return this.headers;
    }

    public final okhttp3.ResponseBody body() {
        return this.body;
    }

    public final okhttp3.Response networkResponse() {
        return this.networkResponse;
    }

    public final okhttp3.Response cacheResponse() {
        return this.cacheResponse;
    }

    public final okhttp3.Response priorResponse() {
        return this.priorResponse;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* JADX INFO: renamed from: exchange, reason: from getter */
    public final okhttp3.internal.connection.Exchange getExchange() {
        return this.exchange;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "request", imports = {}))
    /* JADX INFO: renamed from: -deprecated_request, reason: not valid java name and from getter */
    public final okhttp3.Request getRequest() {
        return this.request;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "protocol", imports = {}))
    /* JADX INFO: renamed from: -deprecated_protocol, reason: not valid java name and from getter */
    public final okhttp3.Protocol getProtocol() {
        return this.protocol;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "code", imports = {}))
    /* JADX INFO: renamed from: -deprecated_code, reason: not valid java name and from getter */
    public final int getCode() {
        return this.code;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && i < 300;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, imports = {}))
    /* JADX INFO: renamed from: -deprecated_message, reason: not valid java name and from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "handshake", imports = {}))
    /* JADX INFO: renamed from: -deprecated_handshake, reason: not valid java name and from getter */
    public final okhttp3.Handshake getHandshake() {
        return this.handshake;
    }

    public final java.util.List<java.lang.String> headers(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.values(name);
    }

    public static /* synthetic */ java.lang.String header$default(okhttp3.Response response, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    public final java.lang.String header(java.lang.String name, java.lang.String defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.lang.String str = this.headers.get(name);
        return str == null ? defaultValue : str;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "headers", imports = {}))
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final okhttp3.Headers getHeaders() {
        return this.headers;
    }

    public final okhttp3.Headers trailers() throws java.io.IOException {
        okhttp3.internal.connection.Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new java.lang.IllegalStateException("trailers not available".toString());
    }

    public final okhttp3.ResponseBody peekBody(long byteCount) throws java.io.IOException {
        okhttp3.ResponseBody responseBody = this.body;
        kotlin.jvm.internal.Intrinsics.checkNotNull(responseBody);
        okio.BufferedSource bufferedSourcePeek = responseBody.source().peek();
        okio.Buffer buffer = new okio.Buffer();
        bufferedSourcePeek.request(byteCount);
        buffer.write((okio.Source) bufferedSourcePeek, java.lang.Math.min(byteCount, bufferedSourcePeek.getBuffer().size()));
        return okhttp3.ResponseBody.INSTANCE.create(buffer, this.body.contentType(), buffer.size());
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "body", imports = {}))
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final okhttp3.ResponseBody getBody() {
        return this.body;
    }

    public final okhttp3.Response.Builder newBuilder() {
        return new okhttp3.Response.Builder(this);
    }

    public final boolean isRedirect() {
        int i = this.code;
        if (i != 307 && i != 308) {
            switch (i) {
                case com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "networkResponse", imports = {}))
    /* JADX INFO: renamed from: -deprecated_networkResponse, reason: not valid java name and from getter */
    public final okhttp3.Response getNetworkResponse() {
        return this.networkResponse;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cacheResponse", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cacheResponse, reason: not valid java name and from getter */
    public final okhttp3.Response getCacheResponse() {
        return this.cacheResponse;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "priorResponse", imports = {}))
    /* JADX INFO: renamed from: -deprecated_priorResponse, reason: not valid java name and from getter */
    public final okhttp3.Response getPriorResponse() {
        return this.priorResponse;
    }

    public final java.util.List<okhttp3.Challenge> challenges() {
        java.lang.String str;
        okhttp3.Headers headers = this.headers;
        int i = this.code;
        if (i == 401) {
            str = com.google.common.net.HttpHeaders.WWW_AUTHENTICATE;
        } else {
            if (i != 407) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            str = com.google.common.net.HttpHeaders.PROXY_AUTHENTICATE;
        }
        return okhttp3.internal.http.HttpHeaders.parseChallenges(headers, str);
    }

    public final okhttp3.CacheControl cacheControl() {
        okhttp3.CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        okhttp3.CacheControl cacheControl2 = okhttp3.CacheControl.INSTANCE.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cacheControl", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final okhttp3.CacheControl m2992deprecated_cacheControl() {
        return cacheControl();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sentRequestAtMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name and from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "receivedResponseAtMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name and from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        okhttp3.ResponseBody responseBody = this.body;
        if (responseBody == null) {
            throw new java.lang.IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        responseBody.close();
    }

    public java.lang.String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    /* JADX INFO: compiled from: Response.kt */
    @kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020)H\u0016J\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010L\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010M\u001a\u00020N2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u0010O\u001a\u00020N2\u0006\u0010J\u001a\u00020)2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010P\u001a\u00020\u00002\u0006\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020)H\u0016J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020QH\u0016J\u0015\u0010R\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0017H\u0000¢\u0006\u0002\bTJ\u0010\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010.\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u00101\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u000205H\u0016J\u0010\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010U\u001a\u00020\u00002\u0006\u0010J\u001a\u00020)H\u0016J\u0010\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010F\u001a\u00020\u00002\u0006\u0010F\u001a\u00020;H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010\u0005R\u001c\u00101\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0005R\u001c\u00104\u001a\u0004\u0018\u000105X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020;X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?¨\u0006V"}, d2 = {"Lokhttp3/Response$Builder;", "", "()V", com.json.hs.n, "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "body", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "cacheResponse", "getCacheResponse$okhttp", "()Lokhttp3/Response;", "setCacheResponse$okhttp", "code", "", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "exchange", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "(Lokhttp3/internal/connection/Exchange;)V", "handshake", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "headers", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "networkResponse", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "priorResponse", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "protocol", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "receivedResponseAtMillis", "", "getReceivedResponseAtMillis$okhttp", "()J", "setReceivedResponseAtMillis$okhttp", "(J)V", "request", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "sentRequestAtMillis", "getSentRequestAtMillis$okhttp", "setSentRequestAtMillis$okhttp", "addHeader", "name", "value", "build", "checkPriorResponse", "", "checkSupportResponse", "header", "Lokhttp3/Headers;", "initExchange", "deferredTrailers", "initExchange$okhttp", "removeHeader", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Builder {
        private okhttp3.ResponseBody body;
        private okhttp3.Response cacheResponse;
        private int code;
        private okhttp3.internal.connection.Exchange exchange;
        private okhttp3.Handshake handshake;
        private okhttp3.Headers.Builder headers;
        private java.lang.String message;
        private okhttp3.Response networkResponse;
        private okhttp3.Response priorResponse;
        private okhttp3.Protocol protocol;
        private long receivedResponseAtMillis;
        private okhttp3.Request request;
        private long sentRequestAtMillis;

        /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
        public final okhttp3.Request getRequest() {
            return this.request;
        }

        public final void setRequest$okhttp(okhttp3.Request request) {
            this.request = request;
        }

        /* JADX INFO: renamed from: getProtocol$okhttp, reason: from getter */
        public final okhttp3.Protocol getProtocol() {
            return this.protocol;
        }

        public final void setProtocol$okhttp(okhttp3.Protocol protocol) {
            this.protocol = protocol;
        }

        /* JADX INFO: renamed from: getCode$okhttp, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        /* JADX INFO: renamed from: getMessage$okhttp, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final void setMessage$okhttp(java.lang.String str) {
            this.message = str;
        }

        /* JADX INFO: renamed from: getHandshake$okhttp, reason: from getter */
        public final okhttp3.Handshake getHandshake() {
            return this.handshake;
        }

        public final void setHandshake$okhttp(okhttp3.Handshake handshake) {
            this.handshake = handshake;
        }

        /* JADX INFO: renamed from: getHeaders$okhttp, reason: from getter */
        public final okhttp3.Headers.Builder getHeaders() {
            return this.headers;
        }

        public final void setHeaders$okhttp(okhttp3.Headers.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "<set-?>");
            this.headers = builder;
        }

        /* JADX INFO: renamed from: getBody$okhttp, reason: from getter */
        public final okhttp3.ResponseBody getBody() {
            return this.body;
        }

        public final void setBody$okhttp(okhttp3.ResponseBody responseBody) {
            this.body = responseBody;
        }

        /* JADX INFO: renamed from: getNetworkResponse$okhttp, reason: from getter */
        public final okhttp3.Response getNetworkResponse() {
            return this.networkResponse;
        }

        public final void setNetworkResponse$okhttp(okhttp3.Response response) {
            this.networkResponse = response;
        }

        /* JADX INFO: renamed from: getCacheResponse$okhttp, reason: from getter */
        public final okhttp3.Response getCacheResponse() {
            return this.cacheResponse;
        }

        public final void setCacheResponse$okhttp(okhttp3.Response response) {
            this.cacheResponse = response;
        }

        /* JADX INFO: renamed from: getPriorResponse$okhttp, reason: from getter */
        public final okhttp3.Response getPriorResponse() {
            return this.priorResponse;
        }

        public final void setPriorResponse$okhttp(okhttp3.Response response) {
            this.priorResponse = response;
        }

        /* JADX INFO: renamed from: getSentRequestAtMillis$okhttp, reason: from getter */
        public final long getSentRequestAtMillis() {
            return this.sentRequestAtMillis;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        /* JADX INFO: renamed from: getReceivedResponseAtMillis$okhttp, reason: from getter */
        public final long getReceivedResponseAtMillis() {
            return this.receivedResponseAtMillis;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        /* JADX INFO: renamed from: getExchange$okhttp, reason: from getter */
        public final okhttp3.internal.connection.Exchange getExchange() {
            return this.exchange;
        }

        public final void setExchange$okhttp(okhttp3.internal.connection.Exchange exchange) {
            this.exchange = exchange;
        }

        public Builder() {
            this.code = -1;
            this.headers = new okhttp3.Headers.Builder();
        }

        public Builder(okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.getExchange();
        }

        public okhttp3.Response.Builder request(okhttp3.Request request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
            return this;
        }

        public okhttp3.Response.Builder protocol(okhttp3.Protocol protocol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public okhttp3.Response.Builder code(int code) {
            this.code = code;
            return this;
        }

        public okhttp3.Response.Builder message(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            return this;
        }

        public okhttp3.Response.Builder handshake(okhttp3.Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public okhttp3.Response.Builder header(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.headers.set(name, value);
            return this;
        }

        public okhttp3.Response.Builder addHeader(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.headers.add(name, value);
            return this;
        }

        public okhttp3.Response.Builder removeHeader(java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public okhttp3.Response.Builder headers(okhttp3.Headers headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public okhttp3.Response.Builder body(okhttp3.ResponseBody body) {
            this.body = body;
            return this;
        }

        public okhttp3.Response.Builder networkResponse(okhttp3.Response networkResponse) {
            checkSupportResponse("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        public okhttp3.Response.Builder cacheResponse(okhttp3.Response cacheResponse) {
            checkSupportResponse("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        private final void checkSupportResponse(java.lang.String name, okhttp3.Response response) {
            if (response != null) {
                if (!(response.body() == null)) {
                    throw new java.lang.IllegalArgumentException((name + ".body != null").toString());
                }
                if (!(response.networkResponse() == null)) {
                    throw new java.lang.IllegalArgumentException((name + ".networkResponse != null").toString());
                }
                if (!(response.cacheResponse() == null)) {
                    throw new java.lang.IllegalArgumentException((name + ".cacheResponse != null").toString());
                }
                if (!(response.priorResponse() == null)) {
                    throw new java.lang.IllegalArgumentException((name + ".priorResponse != null").toString());
                }
            }
        }

        public okhttp3.Response.Builder priorResponse(okhttp3.Response priorResponse) {
            checkPriorResponse(priorResponse);
            this.priorResponse = priorResponse;
            return this;
        }

        private final void checkPriorResponse(okhttp3.Response response) {
            if (response != null) {
                if (!(response.body() == null)) {
                    throw new java.lang.IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        public okhttp3.Response.Builder sentRequestAtMillis(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public okhttp3.Response.Builder receivedResponseAtMillis(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        public final void initExchange$okhttp(okhttp3.internal.connection.Exchange deferredTrailers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        public okhttp3.Response build() {
            int i = this.code;
            if (!(i >= 0)) {
                throw new java.lang.IllegalStateException(("code < 0: " + this.code).toString());
            }
            okhttp3.Request request = this.request;
            if (request == null) {
                throw new java.lang.IllegalStateException("request == null".toString());
            }
            okhttp3.Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new java.lang.IllegalStateException("protocol == null".toString());
            }
            java.lang.String str = this.message;
            if (str != null) {
                return new okhttp3.Response(request, protocol, str, i, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new java.lang.IllegalStateException("message == null".toString());
        }
    }
}
