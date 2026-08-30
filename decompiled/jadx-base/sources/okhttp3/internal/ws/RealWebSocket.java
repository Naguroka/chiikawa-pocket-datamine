package okhttp3.internal.ws;

/* JADX INFO: compiled from: RealWebSocket.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0005_`abcB?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\f2\u0006\u00105\u001a\u000206J\b\u00107\u001a\u000203H\u0016J\u001f\u00108\u001a\u0002032\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0002\b=J\u001a\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010\u0018H\u0016J \u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010\u00182\u0006\u0010A\u001a\u00020\fJ\u000e\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020DJ\u001c\u0010E\u001a\u0002032\n\u0010F\u001a\u00060Gj\u0002`H2\b\u00109\u001a\u0004\u0018\u00010:J\u0016\u0010I\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+J\u0006\u0010J\u001a\u000203J\u0018\u0010K\u001a\u0002032\u0006\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010N\u001a\u00020 H\u0016J\u0010\u0010O\u001a\u0002032\u0006\u0010P\u001a\u00020 H\u0016J\u0010\u0010Q\u001a\u0002032\u0006\u0010P\u001a\u00020 H\u0016J\u000e\u0010R\u001a\u00020\u00122\u0006\u0010P\u001a\u00020 J\u0006\u0010S\u001a\u00020\u0012J\b\u0010!\u001a\u00020\fH\u0016J\u0006\u0010'\u001a\u00020%J\u0006\u0010(\u001a\u00020%J\b\u0010T\u001a\u00020\u0006H\u0016J\b\u0010U\u001a\u000203H\u0002J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u0018H\u0016J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010N\u001a\u00020 H\u0016J\u0018\u0010V\u001a\u00020\u00122\u0006\u0010W\u001a\u00020 2\u0006\u0010X\u001a\u00020%H\u0002J\u0006\u0010)\u001a\u00020%J\u0006\u0010Y\u001a\u000203J\r\u0010Z\u001a\u00020\u0012H\u0000¢\u0006\u0002\b[J\r\u0010\\\u001a\u000203H\u0000¢\u0006\u0002\b]J\f\u0010^\u001a\u00020\u0012*\u00020\u000eH\u0002R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006d"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "originalRequest", "Lokhttp3/Request;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/WebSocketListener;", "random", "Ljava/util/Random;", "pingIntervalMillis", "", "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", "minimumDeflateSize", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "awaitingPong", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "enqueuedClose", com.ironsource.y8.h.t, com.ironsource.y8.h.W, "", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "messageAndCloseQueue", "Ljava/util/ArrayDeque;", "", "name", "pongQueue", "Lokio/ByteString;", "queueSize", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "receivedCloseCode", "", "receivedCloseReason", "receivedPingCount", "receivedPongCount", "sentPingCount", "streams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "awaitTermination", "", "timeout", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "cancel", "checkUpgradeSuccess", com.json.hs.n, "Lokhttp3/Response;", "exchange", "Lokhttp3/internal/connection/Exchange;", "checkUpgradeSuccess$okhttp", "close", "code", "reason", "cancelAfterCloseMillis", "connect", "client", "Lokhttp3/OkHttpClient;", "failWebSocket", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initReaderAndWriter", "loopReader", "onReadClose", "onReadMessage", "text", "bytes", "onReadPing", "payload", "onReadPong", "pong", "processNextFrame", "request", "runWriter", "send", "data", "formatOpcode", "tearDown", "writeOneFrame", "writeOneFrame$okhttp", "writePingFrame", "writePingFrame$okhttp", "isValid", "Close", "Companion", "Message", "Streams", "WriterTask", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealWebSocket implements okhttp3.WebSocket, okhttp3.internal.ws.WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private okhttp3.Call call;
    private boolean enqueuedClose;
    private okhttp3.internal.ws.WebSocketExtensions extensions;
    private boolean failed;
    private final java.lang.String key;
    private final okhttp3.WebSocketListener listener;
    private final java.util.ArrayDeque<java.lang.Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private java.lang.String name;
    private final okhttp3.Request originalRequest;
    private final long pingIntervalMillis;
    private final java.util.ArrayDeque<okio.ByteString> pongQueue;
    private long queueSize;
    private final java.util.Random random;
    private okhttp3.internal.ws.WebSocketReader reader;
    private int receivedCloseCode;
    private java.lang.String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private okhttp3.internal.ws.RealWebSocket.Streams streams;
    private okhttp3.internal.concurrent.TaskQueue taskQueue;
    private okhttp3.internal.ws.WebSocketWriter writer;
    private okhttp3.internal.concurrent.Task writerTask;
    private static final java.util.List<okhttp3.Protocol> ONLY_HTTP1 = kotlin.collections.CollectionsKt.listOf(okhttp3.Protocol.HTTP_1_1);

    public RealWebSocket(okhttp3.internal.concurrent.TaskRunner taskRunner, okhttp3.Request originalRequest, okhttp3.WebSocketListener listener, java.util.Random random, long j, okhttp3.internal.ws.WebSocketExtensions webSocketExtensions, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        this.originalRequest = originalRequest;
        this.listener = listener;
        this.random = random;
        this.pingIntervalMillis = j;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j2;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new java.util.ArrayDeque<>();
        this.messageAndCloseQueue = new java.util.ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!kotlin.jvm.internal.Intrinsics.areEqual("GET", originalRequest.method())) {
            throw new java.lang.IllegalArgumentException(("Request must be GET: " + originalRequest.method()).toString());
        }
        okio.ByteString.Companion companion = okio.ByteString.INSTANCE;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        this.key = okio.ByteString.Companion.of$default(companion, bArr, 0, 0, 3, null).base64();
    }

    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final okhttp3.WebSocketListener getListener() {
        return this.listener;
    }

    @Override // okhttp3.WebSocket
    /* JADX INFO: renamed from: request, reason: from getter */
    public okhttp3.Request getOriginalRequest() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        okhttp3.Call call = this.call;
        kotlin.jvm.internal.Intrinsics.checkNotNull(call);
        call.cancel();
    }

    public final void connect(okhttp3.OkHttpClient client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        if (this.originalRequest.header(com.google.common.net.HttpHeaders.SEC_WEBSOCKET_EXTENSIONS) != null) {
            failWebSocket(new java.net.ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        okhttp3.OkHttpClient okHttpClientBuild = client.newBuilder().eventListener(okhttp3.EventListener.NONE).protocols(ONLY_HTTP1).build();
        final okhttp3.Request requestBuild = this.originalRequest.newBuilder().header(com.google.common.net.HttpHeaders.UPGRADE, "websocket").header(com.google.common.net.HttpHeaders.CONNECTION, com.google.common.net.HttpHeaders.UPGRADE).header(com.google.common.net.HttpHeaders.SEC_WEBSOCKET_KEY, this.key).header(com.google.common.net.HttpHeaders.SEC_WEBSOCKET_VERSION, "13").header(com.google.common.net.HttpHeaders.SEC_WEBSOCKET_EXTENSIONS, "permessage-deflate").build();
        okhttp3.internal.connection.RealCall realCall = new okhttp3.internal.connection.RealCall(okHttpClientBuild, requestBuild, true);
        this.call = realCall;
        kotlin.jvm.internal.Intrinsics.checkNotNull(realCall);
        realCall.enqueue(new okhttp3.Callback() { // from class: okhttp3.internal.ws.RealWebSocket.connect.1
            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
                okhttp3.internal.connection.Exchange exchange = response.getExchange();
                try {
                    okhttp3.internal.ws.RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(exchange);
                    okhttp3.internal.ws.RealWebSocket.Streams streamsNewWebSocketStreams = exchange.newWebSocketStreams();
                    okhttp3.internal.ws.WebSocketExtensions webSocketExtensions = okhttp3.internal.ws.WebSocketExtensions.INSTANCE.parse(response.headers());
                    okhttp3.internal.ws.RealWebSocket.this.extensions = webSocketExtensions;
                    if (!okhttp3.internal.ws.RealWebSocket.this.isValid(webSocketExtensions)) {
                        okhttp3.internal.ws.RealWebSocket realWebSocket = okhttp3.internal.ws.RealWebSocket.this;
                        synchronized (realWebSocket) {
                            realWebSocket.messageAndCloseQueue.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        okhttp3.internal.ws.RealWebSocket.this.initReaderAndWriter(okhttp3.internal.Util.okHttpName + " WebSocket " + requestBuild.url().redact(), streamsNewWebSocketStreams);
                        okhttp3.internal.ws.RealWebSocket.this.getListener().onOpen(okhttp3.internal.ws.RealWebSocket.this, response);
                        okhttp3.internal.ws.RealWebSocket.this.loopReader();
                    } catch (java.lang.Exception e) {
                        okhttp3.internal.ws.RealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (java.io.IOException e2) {
                    okhttp3.internal.ws.RealWebSocket.this.failWebSocket(e2, response);
                    okhttp3.internal.Util.closeQuietly(response);
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call, java.io.IOException e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
                okhttp3.internal.ws.RealWebSocket.this.failWebSocket(e, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(okhttp3.internal.ws.WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.unknownValues && webSocketExtensions.clientMaxWindowBits == null) {
            return webSocketExtensions.serverMaxWindowBits == null || new kotlin.ranges.IntRange(8, 15).contains(webSocketExtensions.serverMaxWindowBits.intValue());
        }
        return false;
    }

    public final void checkUpgradeSuccess$okhttp(okhttp3.Response response, okhttp3.internal.connection.Exchange exchange) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        if (response.code() != 101) {
            throw new java.net.ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        java.lang.String strHeader$default = okhttp3.Response.header$default(response, com.google.common.net.HttpHeaders.CONNECTION, null, 2, null);
        if (!kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.UPGRADE, strHeader$default, true)) {
            throw new java.net.ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strHeader$default + '\'');
        }
        java.lang.String strHeader$default2 = okhttp3.Response.header$default(response, com.google.common.net.HttpHeaders.UPGRADE, null, 2, null);
        if (!kotlin.text.StringsKt.equals("websocket", strHeader$default2, true)) {
            throw new java.net.ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strHeader$default2 + '\'');
        }
        java.lang.String strHeader$default3 = okhttp3.Response.header$default(response, com.google.common.net.HttpHeaders.SEC_WEBSOCKET_ACCEPT, null, 2, null);
        java.lang.String strBase64 = okio.ByteString.INSTANCE.encodeUtf8(this.key + okhttp3.internal.ws.WebSocketProtocol.ACCEPT_MAGIC).sha1().base64();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(strBase64, strHeader$default3)) {
            throw new java.net.ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strBase64 + "' but was '" + strHeader$default3 + '\'');
        }
        if (exchange == null) {
            throw new java.net.ProtocolException("Web Socket exchange missing: bad interceptor?");
        }
    }

    public final void initReaderAndWriter(java.lang.String name, okhttp3.internal.ws.RealWebSocket.Streams streams) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streams, "streams");
        okhttp3.internal.ws.WebSocketExtensions webSocketExtensions = this.extensions;
        kotlin.jvm.internal.Intrinsics.checkNotNull(webSocketExtensions);
        synchronized (this) {
            this.name = name;
            this.streams = streams;
            this.writer = new okhttp3.internal.ws.WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
            this.writerTask = new okhttp3.internal.ws.RealWebSocket.WriterTask();
            if (this.pingIntervalMillis != 0) {
                final long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(this.pingIntervalMillis);
                final java.lang.String str = name + " ping";
                this.taskQueue.schedule(new okhttp3.internal.concurrent.Task(str) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.writePingFrame$okhttp();
                        return nanos;
                    }
                }, nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        this.reader = new okhttp3.internal.ws.WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
    }

    public final void loopReader() throws java.io.IOException {
        while (this.receivedCloseCode == -1) {
            okhttp3.internal.ws.WebSocketReader webSocketReader = this.reader;
            kotlin.jvm.internal.Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    public final boolean processNextFrame() throws java.io.IOException {
        try {
            okhttp3.internal.ws.WebSocketReader webSocketReader = this.reader;
            kotlin.jvm.internal.Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (java.lang.Exception e) {
            failWebSocket(e, null);
            return false;
        }
    }

    public final void awaitTermination(long timeout, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(timeout, timeUnit);
    }

    public final void tearDown() throws java.lang.InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(java.lang.String text) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        this.listener.onMessage(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(okio.ByteString bytes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.listener.onMessage(this, bytes);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(okio.ByteString payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(okio.ByteString payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int code, java.lang.String reason) {
        okhttp3.internal.ws.RealWebSocket.Streams streams;
        okhttp3.internal.ws.WebSocketReader webSocketReader;
        okhttp3.internal.ws.WebSocketWriter webSocketWriter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
        boolean z = true;
        if (!(code != -1)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                z = false;
            }
            if (!z) {
                throw new java.lang.IllegalStateException("already closed".toString());
            }
            this.receivedCloseCode = code;
            this.receivedCloseReason = reason;
            streams = null;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                okhttp3.internal.ws.RealWebSocket.Streams streams2 = this.streams;
                this.streams = null;
                webSocketReader = this.reader;
                this.reader = null;
                webSocketWriter = this.writer;
                this.writer = null;
                this.taskQueue.shutdown();
                streams = streams2;
            } else {
                webSocketReader = null;
                webSocketWriter = null;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        try {
            this.listener.onClosing(this, code, reason);
            if (streams != null) {
                this.listener.onClosed(this, code, reason);
            }
            if (streams != null) {
                okhttp3.internal.Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                okhttp3.internal.Util.closeQuietly(webSocketReader);
            }
        } finally {
            if (streams != null) {
                okhttp3.internal.Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                okhttp3.internal.Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter != null) {
                okhttp3.internal.Util.closeQuietly(webSocketWriter);
            }
        }
    }

    @Override // okhttp3.WebSocket
    public boolean send(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        return send(okio.ByteString.INSTANCE.encodeUtf8(text), 1);
    }

    @Override // okhttp3.WebSocket
    public boolean send(okio.ByteString bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        return send(bytes, 2);
    }

    private final synchronized boolean send(okio.ByteString data, int formatOpcode) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + ((long) data.size()) > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += (long) data.size();
            this.messageAndCloseQueue.add(new okhttp3.internal.ws.RealWebSocket.Message(formatOpcode, data));
            runWriter();
            return true;
        }
        return false;
    }

    public final synchronized boolean pong(okio.ByteString payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            return true;
        }
        return false;
    }

    @Override // okhttp3.WebSocket
    public boolean close(int code, java.lang.String reason) {
        return close(code, reason, 60000L);
    }

    public final synchronized boolean close(int code, java.lang.String reason, long cancelAfterCloseMillis) {
        okio.ByteString byteStringEncodeUtf8;
        okhttp3.internal.ws.WebSocketProtocol.INSTANCE.validateCloseCode(code);
        if (reason != null) {
            byteStringEncodeUtf8 = okio.ByteString.INSTANCE.encodeUtf8(reason);
            if (!(((long) byteStringEncodeUtf8.size()) <= 123)) {
                throw new java.lang.IllegalArgumentException(("reason.size() > 123: " + reason).toString());
            }
        } else {
            byteStringEncodeUtf8 = null;
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new okhttp3.internal.ws.RealWebSocket.Close(code, byteStringEncodeUtf8, cancelAfterCloseMillis));
            runWriter();
            return true;
        }
        return false;
    }

    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
        java.lang.String str;
        okhttp3.internal.ws.WebSocketReader webSocketReader;
        okhttp3.internal.ws.WebSocketWriter webSocketWriter;
        int i;
        okhttp3.internal.ws.RealWebSocket.Streams streams;
        synchronized (this) {
            if (this.failed) {
                return false;
            }
            okhttp3.internal.ws.WebSocketWriter webSocketWriter2 = this.writer;
            okio.ByteString byteStringPoll = this.pongQueue.poll();
            final boolean z = true;
            java.lang.Object obj = null;
            if (byteStringPoll == null) {
                java.lang.Object objPoll = this.messageAndCloseQueue.poll();
                if (objPoll instanceof okhttp3.internal.ws.RealWebSocket.Close) {
                    i = this.receivedCloseCode;
                    str = this.receivedCloseReason;
                    if (i != -1) {
                        streams = this.streams;
                        this.streams = null;
                        webSocketReader = this.reader;
                        this.reader = null;
                        webSocketWriter = this.writer;
                        this.writer = null;
                        this.taskQueue.shutdown();
                    } else {
                        long cancelAfterCloseMillis = ((okhttp3.internal.ws.RealWebSocket.Close) objPoll).getCancelAfterCloseMillis();
                        okhttp3.internal.concurrent.TaskQueue taskQueue = this.taskQueue;
                        final java.lang.String str2 = this.name + " cancel";
                        taskQueue.schedule(new okhttp3.internal.concurrent.Task(str2, z) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1
                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                this.cancel();
                                return -1L;
                            }
                        }, java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
                        streams = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                    }
                } else {
                    if (objPoll == null) {
                        return false;
                    }
                    str = null;
                    webSocketReader = null;
                    webSocketWriter = null;
                    i = -1;
                    streams = null;
                }
                obj = objPoll;
            } else {
                str = null;
                webSocketReader = null;
                webSocketWriter = null;
                i = -1;
                streams = null;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            try {
                if (byteStringPoll != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(webSocketWriter2);
                    webSocketWriter2.writePong(byteStringPoll);
                } else if (obj instanceof okhttp3.internal.ws.RealWebSocket.Message) {
                    okhttp3.internal.ws.RealWebSocket.Message message = (okhttp3.internal.ws.RealWebSocket.Message) obj;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(webSocketWriter2);
                    webSocketWriter2.writeMessageFrame(message.getFormatOpcode(), message.getData());
                    synchronized (this) {
                        this.queueSize -= (long) message.getData().size();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                } else if (obj instanceof okhttp3.internal.ws.RealWebSocket.Close) {
                    okhttp3.internal.ws.RealWebSocket.Close close = (okhttp3.internal.ws.RealWebSocket.Close) obj;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(webSocketWriter2);
                    webSocketWriter2.writeClose(close.getCode(), close.getReason());
                    if (streams != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                        this.listener.onClosed(this, i, str);
                    }
                } else {
                    throw new java.lang.AssertionError();
                }
                if (streams != null) {
                    okhttp3.internal.Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    okhttp3.internal.Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    okhttp3.internal.Util.closeQuietly(webSocketWriter);
                }
                return true;
            } catch (java.lang.Throwable th) {
                if (streams != null) {
                    okhttp3.internal.Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    okhttp3.internal.Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    okhttp3.internal.Util.closeQuietly(webSocketWriter);
                }
                throw th;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            okhttp3.internal.ws.WebSocketWriter webSocketWriter = this.writer;
            if (webSocketWriter == null) {
                return;
            }
            int i = this.awaitingPong ? this.sentPingCount : -1;
            this.sentPingCount++;
            this.awaitingPong = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (i != -1) {
                failWebSocket(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
                return;
            }
            try {
                webSocketWriter.writePing(okio.ByteString.EMPTY);
            } catch (java.io.IOException e) {
                failWebSocket(e, null);
            }
        }
    }

    public final void failWebSocket(java.lang.Exception e, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            okhttp3.internal.ws.RealWebSocket.Streams streams = this.streams;
            this.streams = null;
            okhttp3.internal.ws.WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            okhttp3.internal.ws.WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            try {
                this.listener.onFailure(this, e, response);
                if (streams != null) {
                    okhttp3.internal.Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    okhttp3.internal.Util.closeQuietly(webSocketReader);
                }
            } finally {
                if (streams != null) {
                    okhttp3.internal.Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    okhttp3.internal.Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    okhttp3.internal.Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "formatOpcode", "", "data", "Lokio/ByteString;", "(ILokio/ByteString;)V", "getData", "()Lokio/ByteString;", "getFormatOpcode", "()I", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Message {
        private final okio.ByteString data;
        private final int formatOpcode;

        public Message(int i, okio.ByteString data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            this.formatOpcode = i;
            this.data = data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }

        public final okio.ByteString getData() {
            return this.data;
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "code", "", "reason", "Lokio/ByteString;", "cancelAfterCloseMillis", "", "(ILokio/ByteString;J)V", "getCancelAfterCloseMillis", "()J", "getCode", "()I", "getReason", "()Lokio/ByteString;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final okio.ByteString reason;

        public Close(int i, okio.ByteString byteString, long j) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j;
        }

        public final int getCode() {
            return this.code;
        }

        public final okio.ByteString getReason() {
            return this.reason;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "client", "", "source", "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "getClient", "()Z", "getSink", "()Lokio/BufferedSink;", "getSource", "()Lokio/BufferedSource;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Streams implements java.io.Closeable {
        private final boolean client;
        private final okio.BufferedSink sink;
        private final okio.BufferedSource source;

        public Streams(boolean z, okio.BufferedSource source, okio.BufferedSink sink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            this.client = z;
            this.source = source;
            this.sink = sink;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final okio.BufferedSource getSource() {
            return this.source;
        }

        public final okio.BufferedSink getSink() {
            return this.sink;
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class WriterTask extends okhttp3.internal.concurrent.Task {
        public WriterTask() {
            super(okhttp3.internal.ws.RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return okhttp3.internal.ws.RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (java.io.IOException e) {
                okhttp3.internal.ws.RealWebSocket.this.failWebSocket(e, null);
                return -1L;
            }
        }
    }

    private final void runWriter() {
        if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(this)) {
            okhttp3.internal.concurrent.Task task = this.writerTask;
            if (task != null) {
                okhttp3.internal.concurrent.TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
                return;
            }
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
    }
}
