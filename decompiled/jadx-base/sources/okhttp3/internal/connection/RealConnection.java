package okhttp3.internal.connection;

/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 {2\u00020\u00012\u00020\u0002:\u0001{B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u00105\u001a\u000206J\u0018\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u0002092\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J>\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CJ%\u0010D\u001a\u0002062\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00062\u0006\u0010H\u001a\u00020IH\u0000¢\u0006\u0002\bJJ(\u0010K\u001a\u0002062\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010L\u001a\u0002062\u0006\u0010M\u001a\u00020NH\u0002J0\u0010O\u001a\u0002062\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J*\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010R\u001a\u00020Q2\u0006\u00108\u001a\u000209H\u0002J\b\u0010S\u001a\u00020QH\u0002J(\u0010T\u001a\u0002062\u0006\u0010M\u001a\u00020N2\u0006\u0010>\u001a\u00020\t2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\r\u0010U\u001a\u000206H\u0000¢\u0006\u0002\bVJ%\u0010W\u001a\u00020\u001d2\u0006\u0010X\u001a\u00020Y2\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010[H\u0000¢\u0006\u0002\b\\J\u000e\u0010]\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u001dJ\u001d\u0010_\u001a\u00020`2\u0006\u0010E\u001a\u00020F2\u0006\u0010a\u001a\u00020bH\u0000¢\u0006\u0002\bcJ\u0015\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gH\u0000¢\u0006\u0002\bhJ\r\u0010 \u001a\u000206H\u0000¢\u0006\u0002\biJ\r\u0010!\u001a\u000206H\u0000¢\u0006\u0002\bjJ\u0018\u0010k\u001a\u0002062\u0006\u0010l\u001a\u00020\u00152\u0006\u0010m\u001a\u00020nH\u0016J\u0010\u0010o\u001a\u0002062\u0006\u0010p\u001a\u00020qH\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010r\u001a\u00020\u001d2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00060[H\u0002J\b\u00101\u001a\u00020(H\u0016J\u0010\u0010t\u001a\u0002062\u0006\u0010>\u001a\u00020\tH\u0002J\u0010\u0010u\u001a\u00020\u001d2\u0006\u00108\u001a\u000209H\u0002J\b\u0010v\u001a\u00020wH\u0016J\u001f\u0010x\u001a\u0002062\u0006\u0010@\u001a\u00020\r2\b\u0010y\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0002\bzR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006|"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;)V", "allocationLimit", "", "calls", "", "Ljava/lang/ref/Reference;", "Lokhttp3/internal/connection/RealCall;", "getCalls", "()Ljava/util/List;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "handshake", "Lokhttp3/Handshake;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "idleAtNs", "", "getIdleAtNs$okhttp", "()J", "setIdleAtNs$okhttp", "(J)V", "isMultiplexed", "", "isMultiplexed$okhttp", "()Z", "noCoalescedConnections", "noNewExchanges", "getNoNewExchanges", "setNoNewExchanges", "(Z)V", "protocol", "Lokhttp3/Protocol;", "rawSocket", "Ljava/net/Socket;", "refusedStreamCount", "routeFailureCount", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "sink", "Lokio/BufferedSink;", "socket", "source", "Lokio/BufferedSource;", "successCount", "cancel", "", "certificateSupportHost", "url", "Lokhttp3/HttpUrl;", "connect", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "connectionRetryEnabled", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "eventListener", "Lokhttp3/EventListener;", "connectFailed", "client", "Lokhttp3/OkHttpClient;", "failedRoute", "failure", "Ljava/io/IOException;", "connectFailed$okhttp", "connectSocket", "connectTls", "connectionSpecSelector", "Lokhttp3/internal/connection/ConnectionSpecSelector;", "connectTunnel", "createTunnel", "Lokhttp3/Request;", "tunnelRequest", "createTunnelRequest", "establishProtocol", "incrementSuccessCount", "incrementSuccessCount$okhttp", "isEligible", org.jacoco.core.runtime.AgentOptions.ADDRESS, "Lokhttp3/Address;", "routes", "", "isEligible$okhttp", "isHealthy", "doExtensiveChecks", "newCodec", "Lokhttp3/internal/http/ExchangeCodec;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "newCodec$okhttp", "newWebSocketStreams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "exchange", "Lokhttp3/internal/connection/Exchange;", "newWebSocketStreams$okhttp", "noCoalescedConnections$okhttp", "noNewExchanges$okhttp", "onSettings", "connection", "settings", "Lokhttp3/internal/http2/Settings;", "onStream", "stream", "Lokhttp3/internal/http2/Http2Stream;", "routeMatchesAny", "candidates", "startHttp2", "supportsUrl", "toString", "", "trackFailure", "e", "trackFailure$okhttp", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealConnection extends okhttp3.internal.http2.Http2Connection.Listener implements okhttp3.Connection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.connection.RealConnection.Companion INSTANCE = new okhttp3.internal.connection.RealConnection.Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final java.lang.String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    private final java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> calls;
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private okhttp3.Handshake handshake;
    private okhttp3.internal.http2.Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private okhttp3.Protocol protocol;
    private java.net.Socket rawSocket;
    private int refusedStreamCount;
    private final okhttp3.Route route;
    private int routeFailureCount;
    private okio.BufferedSink sink;
    private java.net.Socket socket;
    private okio.BufferedSource source;
    private int successCount;

    /* JADX INFO: compiled from: RealConnection.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[java.net.Proxy.Type.values().length];
            try {
                iArr[java.net.Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[java.net.Proxy.Type.HTTP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final okhttp3.internal.connection.RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public RealConnection(okhttp3.internal.connection.RealConnectionPool connectionPool, okhttp3.Route route) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "route");
        this.connectionPool = connectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new java.util.ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final void setNoNewExchanges(boolean z) {
        this.noNewExchanges = z;
    }

    /* JADX INFO: renamed from: getRouteFailureCount$okhttp, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        this.routeFailureCount = i;
    }

    public final java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> getCalls() {
        return this.calls;
    }

    /* JADX INFO: renamed from: getIdleAtNs$okhttp, reason: from getter */
    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    public final void setIdleAtNs$okhttp(long j) {
        this.idleAtNs = j;
    }

    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    /* JADX WARN: Code duplicated, block: B:55:0x013e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:74:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[LOOP:0: B:66:0x009d->B:76:?, LOOP_END, SYNTHETIC] */
    public final void connect(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled, okhttp3.Call call, okhttp3.EventListener eventListener) throws java.lang.Throwable {
        java.net.Socket socket;
        java.net.Socket socket2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        if (!(this.protocol == null)) {
            throw new java.lang.IllegalStateException("already connected".toString());
        }
        java.util.List<okhttp3.ConnectionSpec> listConnectionSpecs = this.route.address().connectionSpecs();
        okhttp3.internal.connection.ConnectionSpecSelector connectionSpecSelector = new okhttp3.internal.connection.ConnectionSpecSelector(listConnectionSpecs);
        if (this.route.address().sslSocketFactory() == null) {
            if (!listConnectionSpecs.contains(okhttp3.ConnectionSpec.CLEARTEXT)) {
                throw new okhttp3.internal.connection.RouteException(new java.net.UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            java.lang.String strHost = this.route.address().url().host();
            if (!okhttp3.internal.platform.Platform.INSTANCE.get().isCleartextTrafficPermitted(strHost)) {
                throw new okhttp3.internal.connection.RouteException(new java.net.UnknownServiceException("CLEARTEXT communication to " + strHost + " not permitted by network security policy"));
            }
        } else if (this.route.address().protocols().contains(okhttp3.Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new okhttp3.internal.connection.RouteException(new java.net.UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        okhttp3.internal.connection.RouteException routeException = null;
        while (true) {
            try {
                if (this.route.requiresTunnel()) {
                    connectTunnel(connectTimeout, readTimeout, writeTimeout, call, eventListener);
                    if (this.rawSocket == null) {
                        break;
                    }
                } else {
                    try {
                        connectSocket(connectTimeout, readTimeout, call, eventListener);
                    } catch (java.io.IOException e) {
                        e = e;
                        socket = this.socket;
                        if (socket != null) {
                            okhttp3.internal.Util.closeQuietly(socket);
                        }
                        socket2 = this.rawSocket;
                        if (socket2 != null) {
                            okhttp3.internal.Util.closeQuietly(socket2);
                        }
                        this.socket = null;
                        this.rawSocket = null;
                        this.source = null;
                        this.sink = null;
                        this.handshake = null;
                        this.protocol = null;
                        this.http2Connection = null;
                        this.allocationLimit = 1;
                        eventListener.connectFailed(call, this.route.socketAddress(), this.route.proxy(), null, e);
                        if (routeException == null) {
                            routeException = new okhttp3.internal.connection.RouteException(e);
                        } else {
                            routeException.addConnectException(e);
                        }
                        if (connectionRetryEnabled) {
                            if (connectionSpecSelector.connectionFailed(e)) {
                                throw routeException;
                            }
                        } else {
                            throw routeException;
                        }
                    }
                }
                try {
                    establishProtocol(connectionSpecSelector, pingIntervalMillis, call, eventListener);
                    eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), this.protocol);
                    break;
                } catch (java.io.IOException e2) {
                    e = e2;
                    socket = this.socket;
                    if (socket != null) {
                        okhttp3.internal.Util.closeQuietly(socket);
                    }
                    socket2 = this.rawSocket;
                    if (socket2 != null) {
                        okhttp3.internal.Util.closeQuietly(socket2);
                    }
                    this.socket = null;
                    this.rawSocket = null;
                    this.source = null;
                    this.sink = null;
                    this.handshake = null;
                    this.protocol = null;
                    this.http2Connection = null;
                    this.allocationLimit = 1;
                    eventListener.connectFailed(call, this.route.socketAddress(), this.route.proxy(), null, e);
                    if (routeException == null) {
                        routeException = new okhttp3.internal.connection.RouteException(e);
                    } else {
                        routeException.addConnectException(e);
                    }
                    if (connectionRetryEnabled) {
                        if (connectionSpecSelector.connectionFailed(e)) {
                            throw routeException;
                        }
                    } else {
                        throw routeException;
                    }
                }
            } catch (java.io.IOException e3) {
                e = e3;
            }
        }
        if (this.route.requiresTunnel() && this.rawSocket == null) {
            throw new okhttp3.internal.connection.RouteException(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.idleAtNs = java.lang.System.nanoTime();
    }

    private final void connectTunnel(int connectTimeout, int readTimeout, int writeTimeout, okhttp3.Call call, okhttp3.EventListener eventListener) throws java.io.IOException {
        okhttp3.Request requestCreateTunnelRequest = createTunnelRequest();
        okhttp3.HttpUrl httpUrlUrl = requestCreateTunnelRequest.url();
        for (int i = 0; i < 21; i++) {
            connectSocket(connectTimeout, readTimeout, call, eventListener);
            requestCreateTunnelRequest = createTunnel(readTimeout, writeTimeout, requestCreateTunnelRequest, httpUrlUrl);
            if (requestCreateTunnelRequest == null) {
                return;
            }
            java.net.Socket socket = this.rawSocket;
            if (socket != null) {
                okhttp3.internal.Util.closeQuietly(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
        }
    }

    private final void connectSocket(int connectTimeout, int readTimeout, okhttp3.Call call, okhttp3.EventListener eventListener) throws java.io.IOException {
        java.net.Socket socketCreateSocket;
        java.net.Proxy proxy = this.route.proxy();
        okhttp3.Address address = this.route.address();
        java.net.Proxy.Type type = proxy.type();
        int i = type == null ? -1 : okhttp3.internal.connection.RealConnection.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = address.socketFactory().createSocket();
            kotlin.jvm.internal.Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new java.net.Socket(proxy);
        }
        this.rawSocket = socketCreateSocket;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        socketCreateSocket.setSoTimeout(readTimeout);
        try {
            okhttp3.internal.platform.Platform.INSTANCE.get().connectSocket(socketCreateSocket, this.route.socketAddress(), connectTimeout);
            try {
                this.source = okio.Okio.buffer(okio.Okio.source(socketCreateSocket));
                this.sink = okio.Okio.buffer(okio.Okio.sink(socketCreateSocket));
            } catch (java.lang.NullPointerException e) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(e.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new java.io.IOException(e);
                }
            }
        } catch (java.net.ConnectException e2) {
            java.net.ConnectException connectException = new java.net.ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private final void establishProtocol(okhttp3.internal.connection.ConnectionSpecSelector connectionSpecSelector, int pingIntervalMillis, okhttp3.Call call, okhttp3.EventListener eventListener) throws java.lang.Throwable {
        if (this.route.address().sslSocketFactory() == null) {
            if (this.route.address().protocols().contains(okhttp3.Protocol.H2_PRIOR_KNOWLEDGE)) {
                this.socket = this.rawSocket;
                this.protocol = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE;
                startHttp2(pingIntervalMillis);
                return;
            } else {
                this.socket = this.rawSocket;
                this.protocol = okhttp3.Protocol.HTTP_1_1;
                return;
            }
        }
        eventListener.secureConnectStart(call);
        connectTls(connectionSpecSelector);
        eventListener.secureConnectEnd(call, this.handshake);
        if (this.protocol == okhttp3.Protocol.HTTP_2) {
            startHttp2(pingIntervalMillis);
        }
    }

    private final void startHttp2(int pingIntervalMillis) throws java.io.IOException {
        java.net.Socket socket = this.socket;
        kotlin.jvm.internal.Intrinsics.checkNotNull(socket);
        okio.BufferedSource bufferedSource = this.source;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSource);
        okio.BufferedSink bufferedSink = this.sink;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
        socket.setSoTimeout(0);
        okhttp3.internal.http2.Http2Connection http2ConnectionBuild = new okhttp3.internal.http2.Http2Connection.Builder(true, okhttp3.internal.concurrent.TaskRunner.INSTANCE).socket(socket, this.route.address().url().host(), bufferedSource, bufferedSink).listener(this).pingIntervalMillis(pingIntervalMillis).build();
        this.http2Connection = http2ConnectionBuild;
        this.allocationLimit = okhttp3.internal.http2.Http2Connection.INSTANCE.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        okhttp3.internal.http2.Http2Connection.start$default(http2ConnectionBuild, false, null, 3, null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void connectTls(okhttp3.internal.connection.ConnectionSpecSelector connectionSpecSelector) throws java.lang.Throwable {
        final okhttp3.Address address = this.route.address();
        javax.net.ssl.SSLSocketFactory sslSocketFactory = address.sslSocketFactory();
        javax.net.ssl.SSLSocket sSLSocket = null;
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNull(sslSocketFactory);
            java.net.Socket socketCreateSocket = sslSocketFactory.createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
            kotlin.jvm.internal.Intrinsics.checkNotNull(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            javax.net.ssl.SSLSocket sSLSocket2 = (javax.net.ssl.SSLSocket) socketCreateSocket;
            try {
                okhttp3.ConnectionSpec connectionSpecConfigureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
                if (connectionSpecConfigureSecureSocket.supportsTlsExtensions()) {
                    okhttp3.internal.platform.Platform.INSTANCE.get().configureTlsExtensions(sSLSocket2, address.url().host(), address.protocols());
                }
                sSLSocket2.startHandshake();
                javax.net.ssl.SSLSession sslSocketSession = sSLSocket2.getSession();
                okhttp3.Handshake.Companion companion = okhttp3.Handshake.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                final okhttp3.Handshake handshake = companion.get(sslSocketSession);
                javax.net.ssl.HostnameVerifier hostnameVerifier = address.hostnameVerifier();
                kotlin.jvm.internal.Intrinsics.checkNotNull(hostnameVerifier);
                if (!hostnameVerifier.verify(address.url().host(), sslSocketSession)) {
                    java.util.List<java.security.cert.Certificate> listPeerCertificates = handshake.peerCertificates();
                    if (!(!listPeerCertificates.isEmpty())) {
                        throw new javax.net.ssl.SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
                    }
                    java.security.cert.Certificate certificate = listPeerCertificates.get(0);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificate;
                    throw new javax.net.ssl.SSLPeerUnverifiedException(kotlin.text.StringsKt.trimMargin$default("\n              |Hostname " + address.url().host() + " not verified:\n              |    certificate: " + okhttp3.CertificatePinner.INSTANCE.pin(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + okhttp3.internal.tls.OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n              ", null, 1, null));
                }
                final okhttp3.CertificatePinner certificatePinner = address.certificatePinner();
                kotlin.jvm.internal.Intrinsics.checkNotNull(certificatePinner);
                this.handshake = new okhttp3.Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new kotlin.jvm.functions.Function0<java.util.List<? extends java.security.cert.Certificate>>() { // from class: okhttp3.internal.connection.RealConnection.connectTls.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final java.util.List<? extends java.security.cert.Certificate> invoke() {
                        okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner$okhttp = certificatePinner.getCertificateChainCleaner();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(certificateChainCleaner$okhttp);
                        return certificateChainCleaner$okhttp.clean(handshake.peerCertificates(), address.url().host());
                    }
                });
                certificatePinner.check$okhttp(address.url().host(), new kotlin.jvm.functions.Function0<java.util.List<? extends java.security.cert.X509Certificate>>() { // from class: okhttp3.internal.connection.RealConnection.connectTls.2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final java.util.List<? extends java.security.cert.X509Certificate> invoke() {
                        okhttp3.Handshake handshake2 = okhttp3.internal.connection.RealConnection.this.handshake;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(handshake2);
                        java.util.List<java.security.cert.Certificate> listPeerCertificates2 = handshake2.peerCertificates();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listPeerCertificates2, 10));
                        for (java.security.cert.Certificate certificate2 : listPeerCertificates2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(certificate2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                            arrayList.add((java.security.cert.X509Certificate) certificate2);
                        }
                        return arrayList;
                    }
                });
                java.lang.String selectedProtocol = connectionSpecConfigureSecureSocket.supportsTlsExtensions() ? okhttp3.internal.platform.Platform.INSTANCE.get().getSelectedProtocol(sSLSocket2) : null;
                this.socket = sSLSocket2;
                this.source = okio.Okio.buffer(okio.Okio.source(sSLSocket2));
                this.sink = okio.Okio.buffer(okio.Okio.sink(sSLSocket2));
                this.protocol = selectedProtocol != null ? okhttp3.Protocol.INSTANCE.get(selectedProtocol) : okhttp3.Protocol.HTTP_1_1;
                okhttp3.internal.platform.Platform.INSTANCE.get().afterHandshake(sSLSocket2);
            } catch (java.lang.Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    okhttp3.internal.platform.Platform.INSTANCE.get().afterHandshake(sSLSocket);
                }
                if (sSLSocket != null) {
                    okhttp3.internal.Util.closeQuietly((java.net.Socket) sSLSocket);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private final okhttp3.Request createTunnel(int readTimeout, int writeTimeout, okhttp3.Request tunnelRequest, okhttp3.HttpUrl url) throws java.io.IOException {
        java.lang.String str = "CONNECT " + okhttp3.internal.Util.toHostHeader(url, true) + " HTTP/1.1";
        while (true) {
            okio.BufferedSource bufferedSource = this.source;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSource);
            okio.BufferedSink bufferedSink = this.sink;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
            okhttp3.internal.http1.Http1ExchangeCodec http1ExchangeCodec = new okhttp3.internal.http1.Http1ExchangeCodec(null, this, bufferedSource, bufferedSink);
            bufferedSource.getTimeout().timeout(readTimeout, java.util.concurrent.TimeUnit.MILLISECONDS);
            bufferedSink.getTimeout().timeout(writeTimeout, java.util.concurrent.TimeUnit.MILLISECONDS);
            http1ExchangeCodec.writeRequest(tunnelRequest.headers(), str);
            http1ExchangeCodec.finishRequest();
            okhttp3.Response.Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            kotlin.jvm.internal.Intrinsics.checkNotNull(responseHeaders);
            okhttp3.Response responseBuild = responseHeaders.request(tunnelRequest).build();
            http1ExchangeCodec.skipConnectBody(responseBuild);
            int iCode = responseBuild.code();
            if (iCode == 200) {
                if (bufferedSource.getBuffer().exhausted() && bufferedSink.getBuffer().exhausted()) {
                    return null;
                }
                throw new java.io.IOException("TLS tunnel buffered too many bytes!");
            }
            if (iCode == 407) {
                okhttp3.Request requestAuthenticate = this.route.address().proxyAuthenticator().authenticate(this.route, responseBuild);
                if (requestAuthenticate == null) {
                    throw new java.io.IOException("Failed to authenticate with proxy");
                }
                if (kotlin.text.StringsKt.equals("close", okhttp3.Response.header$default(responseBuild, com.google.common.net.HttpHeaders.CONNECTION, null, 2, null), true)) {
                    return requestAuthenticate;
                }
                tunnelRequest = requestAuthenticate;
            } else {
                throw new java.io.IOException("Unexpected response code for CONNECT: " + responseBuild.code());
            }
        }
    }

    private final okhttp3.Request createTunnelRequest() throws java.io.IOException {
        okhttp3.Request requestBuild = new okhttp3.Request.Builder().url(this.route.address().url()).method("CONNECT", null).header(com.google.common.net.HttpHeaders.HOST, okhttp3.internal.Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", com.google.common.net.HttpHeaders.KEEP_ALIVE).header(com.google.common.net.HttpHeaders.USER_AGENT, okhttp3.internal.Util.userAgent).build();
        okhttp3.Request requestAuthenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new okhttp3.Response.Builder().request(requestBuild).protocol(okhttp3.Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(okhttp3.internal.Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header(com.google.common.net.HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive").build());
        return requestAuthenticate == null ? requestBuild : requestAuthenticate;
    }

    private final boolean routeMatchesAny(java.util.List<okhttp3.Route> candidates) {
        java.util.List<okhttp3.Route> list = candidates;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        for (okhttp3.Route route : list) {
            if (route.proxy().type() == java.net.Proxy.Type.DIRECT && this.route.proxy().type() == java.net.Proxy.Type.DIRECT && kotlin.jvm.internal.Intrinsics.areEqual(this.route.socketAddress(), route.socketAddress())) {
                return true;
            }
        }
        return false;
    }

    private final boolean certificateSupportHost(okhttp3.HttpUrl url, okhttp3.Handshake handshake) {
        java.util.List<java.security.cert.Certificate> listPeerCertificates = handshake.peerCertificates();
        if (!listPeerCertificates.isEmpty()) {
            okhttp3.internal.tls.OkHostnameVerifier okHostnameVerifier = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE;
            java.lang.String strHost = url.host();
            java.security.cert.Certificate certificate = listPeerCertificates.get(0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (okHostnameVerifier.verify(strHost, (java.security.cert.X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    public final okhttp3.internal.http.ExchangeCodec newCodec$okhttp(okhttp3.OkHttpClient client, okhttp3.internal.http.RealInterceptorChain chain) throws java.net.SocketException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        java.net.Socket socket = this.socket;
        kotlin.jvm.internal.Intrinsics.checkNotNull(socket);
        okio.BufferedSource bufferedSource = this.source;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSource);
        okio.BufferedSink bufferedSink = this.sink;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
        okhttp3.internal.http2.Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new okhttp3.internal.http2.Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        socket.setSoTimeout(chain.readTimeoutMillis());
        bufferedSource.getTimeout().timeout(chain.getReadTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        bufferedSink.getTimeout().timeout(chain.getWriteTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        return new okhttp3.internal.http1.Http1ExchangeCodec(client, this, bufferedSource, bufferedSink);
    }

    public final okhttp3.internal.ws.RealWebSocket.Streams newWebSocketStreams$okhttp(final okhttp3.internal.connection.Exchange exchange) throws java.net.SocketException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchange, "exchange");
        java.net.Socket socket = this.socket;
        kotlin.jvm.internal.Intrinsics.checkNotNull(socket);
        final okio.BufferedSource bufferedSource = this.source;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSource);
        final okio.BufferedSink bufferedSink = this.sink;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSink);
        socket.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new okhttp3.internal.ws.RealWebSocket.Streams(bufferedSource, bufferedSink) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                exchange.bodyComplete(-1L, true, true, null);
            }
        };
    }

    @Override // okhttp3.Connection
    /* JADX INFO: renamed from: route, reason: from getter */
    public okhttp3.Route getRoute() {
        return this.route;
    }

    public final void cancel() {
        java.net.Socket socket = this.rawSocket;
        if (socket != null) {
            okhttp3.internal.Util.closeQuietly(socket);
        }
    }

    @Override // okhttp3.Connection
    public java.net.Socket socket() {
        java.net.Socket socket = this.socket;
        kotlin.jvm.internal.Intrinsics.checkNotNull(socket);
        return socket;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(okhttp3.internal.http2.Http2Stream stream) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "stream");
        stream.close(okhttp3.internal.http2.ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void onSettings(okhttp3.internal.http2.Http2Connection connection, okhttp3.internal.http2.Settings settings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "settings");
        this.allocationLimit = settings.getMaxConcurrentStreams();
    }

    @Override // okhttp3.Connection
    /* JADX INFO: renamed from: handshake, reason: from getter */
    public okhttp3.Handshake getHandshake() {
        return this.handshake;
    }

    public final void connectFailed$okhttp(okhttp3.OkHttpClient client, okhttp3.Route failedRoute, java.io.IOException failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.proxy().type() != java.net.Proxy.Type.DIRECT) {
            okhttp3.Address address = failedRoute.address();
            address.proxySelector().connectFailed(address.url().uri(), failedRoute.proxy().address(), failure);
        }
        client.getRouteDatabase().failed(failedRoute);
    }

    public final synchronized void trackFailure$okhttp(okhttp3.internal.connection.RealCall call, java.io.IOException e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        if (e instanceof okhttp3.internal.http2.StreamResetException) {
            if (((okhttp3.internal.http2.StreamResetException) e).errorCode == okhttp3.internal.http2.ErrorCode.REFUSED_STREAM) {
                int i = this.refusedStreamCount + 1;
                this.refusedStreamCount = i;
                if (i > 1) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (((okhttp3.internal.http2.StreamResetException) e).errorCode != okhttp3.internal.http2.ErrorCode.CANCEL || !call.getCanceled()) {
                this.noNewExchanges = true;
                this.routeFailureCount++;
            }
        } else if (!isMultiplexed$okhttp() || (e instanceof okhttp3.internal.http2.ConnectionShutdownException)) {
            this.noNewExchanges = true;
            if (this.successCount == 0) {
                if (e != null) {
                    connectFailed$okhttp(call.getClient(), this.route, e);
                }
                this.routeFailureCount++;
            }
        }
    }

    @Override // okhttp3.Connection
    public okhttp3.Protocol protocol() {
        okhttp3.Protocol protocol = this.protocol;
        kotlin.jvm.internal.Intrinsics.checkNotNull(protocol);
        return protocol;
    }

    public java.lang.String toString() {
        java.lang.Object objCipherSuite;
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("Connection{").append(this.route.address().url().host()).append(':').append(this.route.address().url().port()).append(", proxy=").append(this.route.proxy()).append(" hostAddress=").append(this.route.socketAddress()).append(" cipherSuite=");
        okhttp3.Handshake handshake = this.handshake;
        if (handshake == null || (objCipherSuite = handshake.cipherSuite()) == null) {
            objCipherSuite = "none";
        }
        return sbAppend.append(objCipherSuite).append(" protocol=").append(this.protocol).append('}').toString();
    }

    /* JADX INFO: compiled from: RealConnection.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "()V", "IDLE_CONNECTION_HEALTHY_NS", "", "MAX_TUNNEL_ATTEMPTS", "", "NPE_THROW_WITH_NULL", "", "newTestConnection", "Lokhttp3/internal/connection/RealConnection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "socket", "Ljava/net/Socket;", "idleAtNs", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final okhttp3.internal.connection.RealConnection newTestConnection(okhttp3.internal.connection.RealConnectionPool connectionPool, okhttp3.Route route, java.net.Socket socket, long idleAtNs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "route");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "socket");
            okhttp3.internal.connection.RealConnection realConnection = new okhttp3.internal.connection.RealConnection(connectionPool, route);
            realConnection.socket = socket;
            realConnection.setIdleAtNs$okhttp(idleAtNs);
            return realConnection;
        }
    }

    public final boolean isEligible$okhttp(okhttp3.Address address, java.util.List<okhttp3.Route> routes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
        if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(this)) {
            if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
                return false;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(address.url().host(), getRoute().address().url().host())) {
                return true;
            }
            if (this.http2Connection == null || routes == null || !routeMatchesAny(routes) || address.hostnameVerifier() != okhttp3.internal.tls.OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
                return false;
            }
            try {
                okhttp3.CertificatePinner certificatePinner = address.certificatePinner();
                kotlin.jvm.internal.Intrinsics.checkNotNull(certificatePinner);
                java.lang.String strHost = address.url().host();
                okhttp3.Handshake handshake = getHandshake();
                kotlin.jvm.internal.Intrinsics.checkNotNull(handshake);
                certificatePinner.check(strHost, handshake.peerCertificates());
                return true;
            } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
                return false;
            }
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final boolean supportsUrl(okhttp3.HttpUrl url) {
        okhttp3.Handshake handshake;
        if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(this)) {
            okhttp3.HttpUrl httpUrlUrl = this.route.address().url();
            if (url.port() != httpUrlUrl.port()) {
                return false;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(url.host(), httpUrlUrl.host())) {
                return true;
            }
            if (this.noCoalescedConnections || (handshake = this.handshake) == null) {
                return false;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(handshake);
            return certificateSupportHost(url, handshake);
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final boolean isHealthy(boolean doExtensiveChecks) {
        long j;
        if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(this)) {
            long jNanoTime = java.lang.System.nanoTime();
            java.net.Socket socket = this.rawSocket;
            kotlin.jvm.internal.Intrinsics.checkNotNull(socket);
            java.net.Socket socket2 = this.socket;
            kotlin.jvm.internal.Intrinsics.checkNotNull(socket2);
            okio.BufferedSource bufferedSource = this.source;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedSource);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            okhttp3.internal.http2.Http2Connection http2Connection = this.http2Connection;
            if (http2Connection != null) {
                return http2Connection.isHealthy(jNanoTime);
            }
            synchronized (this) {
                j = jNanoTime - this.idleAtNs;
            }
            if (j < IDLE_CONNECTION_HEALTHY_NS || !doExtensiveChecks) {
                return true;
            }
            return okhttp3.internal.Util.isHealthy(socket2, bufferedSource);
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }
}
