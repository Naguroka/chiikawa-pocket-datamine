package okhttp3;

/* JADX INFO: compiled from: OkHttpClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002xyB\u0007\b\u0016¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\bSJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\bTJ\r\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\bUJ\r\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\bVJ\r\u0010\u0017\u001a\u00020\u000fH\u0007¢\u0006\u0002\bWJ\r\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\bXJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007¢\u0006\u0002\bYJ\r\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\bZJ\r\u0010\"\u001a\u00020#H\u0007¢\u0006\u0002\b[J\r\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\b\\J\r\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\b]J\r\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\b^J\r\u0010.\u001a\u00020,H\u0007¢\u0006\u0002\b_J\r\u0010/\u001a\u000200H\u0007¢\u0006\u0002\b`J\u0013\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0002\baJ\u0013\u00107\u001a\b\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0002\bbJ\b\u0010c\u001a\u00020\u0006H\u0016J\u0010\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gH\u0016J\u0018\u0010h\u001a\u00020i2\u0006\u0010f\u001a\u00020g2\u0006\u0010j\u001a\u00020kH\u0016J\r\u00108\u001a\u00020\u000fH\u0007¢\u0006\u0002\blJ\u0013\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001cH\u0007¢\u0006\u0002\bmJ\u000f\u0010;\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0002\bnJ\r\u0010>\u001a\u00020\tH\u0007¢\u0006\u0002\boJ\r\u0010?\u001a\u00020@H\u0007¢\u0006\u0002\bpJ\r\u0010B\u001a\u00020\u000fH\u0007¢\u0006\u0002\bqJ\r\u0010C\u001a\u00020,H\u0007¢\u0006\u0002\brJ\r\u0010H\u001a\u00020IH\u0007¢\u0006\u0002\bsJ\r\u0010K\u001a\u00020LH\u0007¢\u0006\u0002\btJ\b\u0010u\u001a\u00020vH\u0002J\r\u0010O\u001a\u00020\u000fH\u0007¢\u0006\u0002\bwR\u0013\u0010\b\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f8G¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0013\u0010\u000e\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00128G¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0013\u0010\u0014\u001a\u00020\u00158G¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0016R\u0013\u0010\u0017\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0018\u001a\u00020\u00198G¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001eR\u0013\u0010\u001f\u001a\u00020 8G¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010!R\u0013\u0010\"\u001a\u00020#8G¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010$R\u0013\u0010%\u001a\u00020&8G¢\u0006\b\n\u0000\u001a\u0004\b%\u0010'R\u0013\u0010(\u001a\u00020)8G¢\u0006\b\n\u0000\u001a\u0004\b(\u0010*R\u0013\u0010+\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\b+\u0010-R\u0013\u0010.\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010/\u001a\u0002008G¢\u0006\b\n\u0000\u001a\u0004\b/\u00101R\u0019\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0013\u00104\u001a\u0002058G¢\u0006\b\n\u0000\u001a\u0004\b4\u00106R\u0019\u00107\u001a\b\u0012\u0004\u0012\u0002030\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001eR\u0013\u00108\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0010R\u0019\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001eR\u0015\u0010;\u001a\u0004\u0018\u00010<8G¢\u0006\b\n\u0000\u001a\u0004\b;\u0010=R\u0013\u0010>\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\nR\u0013\u0010?\u001a\u00020@8G¢\u0006\b\n\u0000\u001a\u0004\b?\u0010AR\u0013\u0010B\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0010R\u0013\u0010C\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\bC\u0010-R\u0011\u0010D\u001a\u00020E¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010H\u001a\u00020I8G¢\u0006\b\n\u0000\u001a\u0004\bH\u0010JR\u0011\u0010K\u001a\u00020L8G¢\u0006\u0006\u001a\u0004\bK\u0010MR\u0010\u0010N\u001a\u0004\u0018\u00010LX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010O\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0010R\u0015\u0010P\u001a\u0004\u0018\u00010Q8G¢\u0006\b\n\u0000\u001a\u0004\bP\u0010R¨\u0006z"}, d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "()V", "builder", "Lokhttp3/OkHttpClient$Builder;", "(Lokhttp3/OkHttpClient$Builder;)V", "authenticator", "Lokhttp3/Authenticator;", "()Lokhttp3/Authenticator;", "cache", "Lokhttp3/Cache;", "()Lokhttp3/Cache;", "callTimeoutMillis", "", "()I", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "certificatePinner", "Lokhttp3/CertificatePinner;", "()Lokhttp3/CertificatePinner;", "connectTimeoutMillis", "connectionPool", "Lokhttp3/ConnectionPool;", "()Lokhttp3/ConnectionPool;", "connectionSpecs", "", "Lokhttp3/ConnectionSpec;", "()Ljava/util/List;", "cookieJar", "Lokhttp3/CookieJar;", "()Lokhttp3/CookieJar;", "dispatcher", "Lokhttp3/Dispatcher;", "()Lokhttp3/Dispatcher;", "dns", "Lokhttp3/Dns;", "()Lokhttp3/Dns;", "eventListenerFactory", "Lokhttp3/EventListener$Factory;", "()Lokhttp3/EventListener$Factory;", "followRedirects", "", "()Z", "followSslRedirects", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "interceptors", "Lokhttp3/Interceptor;", "minWebSocketMessageToCompress", "", "()J", "networkInterceptors", "pingIntervalMillis", "protocols", "Lokhttp3/Protocol;", "proxy", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxyAuthenticator", "proxySelector", "Ljava/net/ProxySelector;", "()Ljava/net/ProxySelector;", "readTimeoutMillis", "retryOnConnectionFailure", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase", "()Lokhttp3/internal/connection/RouteDatabase;", "socketFactory", "Ljavax/net/SocketFactory;", "()Ljavax/net/SocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "writeTimeoutMillis", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "-deprecated_authenticator", "-deprecated_cache", "-deprecated_callTimeoutMillis", "-deprecated_certificatePinner", "-deprecated_connectTimeoutMillis", "-deprecated_connectionPool", "-deprecated_connectionSpecs", "-deprecated_cookieJar", "-deprecated_dispatcher", "-deprecated_dns", "-deprecated_eventListenerFactory", "-deprecated_followRedirects", "-deprecated_followSslRedirects", "-deprecated_hostnameVerifier", "-deprecated_interceptors", "-deprecated_networkInterceptors", "newBuilder", "newCall", "Lokhttp3/Call;", "request", "Lokhttp3/Request;", "newWebSocket", "Lokhttp3/WebSocket;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/WebSocketListener;", "-deprecated_pingIntervalMillis", "-deprecated_protocols", "-deprecated_proxy", "-deprecated_proxyAuthenticator", "-deprecated_proxySelector", "-deprecated_readTimeoutMillis", "-deprecated_retryOnConnectionFailure", "-deprecated_socketFactory", "-deprecated_sslSocketFactory", "verifyClientState", "", "-deprecated_writeTimeoutMillis", "Builder", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public class OkHttpClient implements java.lang.Cloneable, okhttp3.Call.Factory, okhttp3.WebSocket.Factory {
    private final okhttp3.Authenticator authenticator;
    private final okhttp3.Cache cache;
    private final int callTimeoutMillis;
    private final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;
    private final okhttp3.CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final okhttp3.ConnectionPool connectionPool;
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    private final okhttp3.CookieJar cookieJar;
    private final okhttp3.Dispatcher dispatcher;
    private final okhttp3.Dns dns;
    private final okhttp3.EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final javax.net.ssl.HostnameVerifier hostnameVerifier;
    private final java.util.List<okhttp3.Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final java.util.List<okhttp3.Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final java.util.List<okhttp3.Protocol> protocols;
    private final java.net.Proxy proxy;
    private final okhttp3.Authenticator proxyAuthenticator;
    private final java.net.ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final okhttp3.internal.connection.RouteDatabase routeDatabase;
    private final javax.net.SocketFactory socketFactory;
    private final javax.net.ssl.SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final javax.net.ssl.X509TrustManager x509TrustManager;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.OkHttpClient.Companion INSTANCE = new okhttp3.OkHttpClient.Companion(null);
    private static final java.util.List<okhttp3.Protocol> DEFAULT_PROTOCOLS = okhttp3.internal.Util.immutableListOf(okhttp3.Protocol.HTTP_2, okhttp3.Protocol.HTTP_1_1);
    private static final java.util.List<okhttp3.ConnectionSpec> DEFAULT_CONNECTION_SPECS = okhttp3.internal.Util.immutableListOf(okhttp3.ConnectionSpec.MODERN_TLS, okhttp3.ConnectionSpec.CLEARTEXT);

    public OkHttpClient(okhttp3.OkHttpClient.Builder builder) {
        okhttp3.internal.proxy.NullProxySelector proxySelector;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        this.dispatcher = builder.getDispatcher();
        this.connectionPool = builder.getConnectionPool();
        this.interceptors = okhttp3.internal.Util.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = okhttp3.internal.Util.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
        this.authenticator = builder.getAuthenticator();
        this.followRedirects = builder.getFollowRedirects();
        this.followSslRedirects = builder.getFollowSslRedirects();
        this.cookieJar = builder.getCookieJar();
        this.cache = builder.getCache();
        this.dns = builder.getDns();
        this.proxy = builder.getProxy();
        if (builder.getProxy() != null) {
            proxySelector = okhttp3.internal.proxy.NullProxySelector.INSTANCE;
        } else {
            proxySelector = builder.getProxySelector();
            proxySelector = proxySelector == null ? java.net.ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = okhttp3.internal.proxy.NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        java.util.List<okhttp3.ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        this.connectTimeoutMillis = builder.getConnectTimeout();
        this.readTimeoutMillis = builder.getReadTimeout();
        this.writeTimeoutMillis = builder.getWriteTimeout();
        this.pingIntervalMillis = builder.getPingInterval();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        okhttp3.internal.connection.RouteDatabase routeDatabase = builder.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new okhttp3.internal.connection.RouteDatabase() : routeDatabase;
        java.util.List<okhttp3.ConnectionSpec> list = connectionSpecs$okhttp;
        boolean z = true;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((okhttp3.ConnectionSpec) it.next()).getIsTls()) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = okhttp3.CertificatePinner.DEFAULT;
        } else if (builder.getSslSocketFactoryOrNull() != null) {
            this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
            okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner = builder.getCertificateChainCleaner();
            kotlin.jvm.internal.Intrinsics.checkNotNull(certificateChainCleaner);
            this.certificateChainCleaner = certificateChainCleaner;
            javax.net.ssl.X509TrustManager x509TrustManagerOrNull = builder.getX509TrustManagerOrNull();
            kotlin.jvm.internal.Intrinsics.checkNotNull(x509TrustManagerOrNull);
            this.x509TrustManager = x509TrustManagerOrNull;
            okhttp3.CertificatePinner certificatePinner = builder.getCertificatePinner();
            kotlin.jvm.internal.Intrinsics.checkNotNull(certificateChainCleaner);
            this.certificatePinner = certificatePinner.withCertificateChainCleaner$okhttp(certificateChainCleaner);
        } else {
            javax.net.ssl.X509TrustManager x509TrustManagerPlatformTrustManager = okhttp3.internal.platform.Platform.INSTANCE.get().platformTrustManager();
            this.x509TrustManager = x509TrustManagerPlatformTrustManager;
            okhttp3.internal.platform.Platform platform = okhttp3.internal.platform.Platform.INSTANCE.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(x509TrustManagerPlatformTrustManager);
            this.sslSocketFactoryOrNull = platform.newSslSocketFactory(x509TrustManagerPlatformTrustManager);
            okhttp3.internal.tls.CertificateChainCleaner.Companion companion = okhttp3.internal.tls.CertificateChainCleaner.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(x509TrustManagerPlatformTrustManager);
            okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner2 = companion.get(x509TrustManagerPlatformTrustManager);
            this.certificateChainCleaner = certificateChainCleaner2;
            okhttp3.CertificatePinner certificatePinner2 = builder.getCertificatePinner();
            kotlin.jvm.internal.Intrinsics.checkNotNull(certificateChainCleaner2);
            this.certificatePinner = certificatePinner2.withCertificateChainCleaner$okhttp(certificateChainCleaner2);
        }
        verifyClientState();
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    public final okhttp3.Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final okhttp3.ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public final java.util.List<okhttp3.Interceptor> interceptors() {
        return this.interceptors;
    }

    public final java.util.List<okhttp3.Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public final okhttp3.EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final okhttp3.Authenticator authenticator() {
        return this.authenticator;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public final okhttp3.CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final okhttp3.Cache cache() {
        return this.cache;
    }

    public final okhttp3.Dns dns() {
        return this.dns;
    }

    public final java.net.Proxy proxy() {
        return this.proxy;
    }

    public final java.net.ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final okhttp3.Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final javax.net.SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final javax.net.ssl.SSLSocketFactory sslSocketFactory() {
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new java.lang.IllegalStateException("CLEARTEXT-only client");
    }

    /* JADX INFO: renamed from: x509TrustManager, reason: from getter */
    public final javax.net.ssl.X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    public final java.util.List<okhttp3.ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final java.util.List<okhttp3.Protocol> protocols() {
        return this.protocols;
    }

    public final javax.net.ssl.HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final okhttp3.CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    /* JADX INFO: renamed from: certificateChainCleaner, reason: from getter */
    public final okhttp3.internal.tls.CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    /* JADX INFO: renamed from: minWebSocketMessageToCompress, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public final okhttp3.internal.connection.RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    public OkHttpClient() {
        this(new okhttp3.OkHttpClient.Builder());
    }

    private final void verifyClientState() {
        boolean z;
        java.util.List<okhttp3.Interceptor> list = this.interceptors;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!list.contains(null))) {
            throw new java.lang.IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        java.util.List<okhttp3.Interceptor> list2 = this.networkInterceptors;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!list2.contains(null))) {
            throw new java.lang.IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        java.util.List<okhttp3.ConnectionSpec> list3 = this.connectionSpecs;
        if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
            java.util.Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (((okhttp3.ConnectionSpec) it.next()).getIsTls()) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (z) {
            if (!(this.sslSocketFactoryOrNull == null)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!(this.certificateChainCleaner == null)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!(this.x509TrustManager == null)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(this.certificatePinner, okhttp3.CertificatePinner.DEFAULT)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            return;
        }
        if (this.sslSocketFactoryOrNull == null) {
            throw new java.lang.IllegalStateException("sslSocketFactory == null".toString());
        }
        if (this.certificateChainCleaner == null) {
            throw new java.lang.IllegalStateException("certificateChainCleaner == null".toString());
        }
        if (this.x509TrustManager == null) {
            throw new java.lang.IllegalStateException("x509TrustManager == null".toString());
        }
    }

    @Override // okhttp3.Call.Factory
    public okhttp3.Call newCall(okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        return new okhttp3.internal.connection.RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    public okhttp3.WebSocket newWebSocket(okhttp3.Request request, okhttp3.WebSocketListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        okhttp3.internal.ws.RealWebSocket realWebSocket = new okhttp3.internal.ws.RealWebSocket(okhttp3.internal.concurrent.TaskRunner.INSTANCE, request, listener, new java.util.Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public okhttp3.OkHttpClient.Builder newBuilder() {
        return new okhttp3.OkHttpClient.Builder(this);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "dispatcher", imports = {}))
    /* JADX INFO: renamed from: -deprecated_dispatcher, reason: not valid java name and from getter */
    public final okhttp3.Dispatcher getDispatcher() {
        return this.dispatcher;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "connectionPool", imports = {}))
    /* JADX INFO: renamed from: -deprecated_connectionPool, reason: not valid java name and from getter */
    public final okhttp3.ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "interceptors", imports = {}))
    /* JADX INFO: renamed from: -deprecated_interceptors, reason: not valid java name */
    public final java.util.List<okhttp3.Interceptor> m2972deprecated_interceptors() {
        return this.interceptors;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "networkInterceptors", imports = {}))
    /* JADX INFO: renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final java.util.List<okhttp3.Interceptor> m2973deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "eventListenerFactory", imports = {}))
    /* JADX INFO: renamed from: -deprecated_eventListenerFactory, reason: not valid java name and from getter */
    public final okhttp3.EventListener.Factory getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "retryOnConnectionFailure", imports = {}))
    /* JADX INFO: renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name and from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "authenticator", imports = {}))
    /* JADX INFO: renamed from: -deprecated_authenticator, reason: not valid java name and from getter */
    public final okhttp3.Authenticator getAuthenticator() {
        return this.authenticator;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "followRedirects", imports = {}))
    /* JADX INFO: renamed from: -deprecated_followRedirects, reason: not valid java name and from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "followSslRedirects", imports = {}))
    /* JADX INFO: renamed from: -deprecated_followSslRedirects, reason: not valid java name and from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cookieJar", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cookieJar, reason: not valid java name and from getter */
    public final okhttp3.CookieJar getCookieJar() {
        return this.cookieJar;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cache", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cache, reason: not valid java name and from getter */
    public final okhttp3.Cache getCache() {
        return this.cache;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "dns", imports = {}))
    /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name and from getter */
    public final okhttp3.Dns getDns() {
        return this.dns;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxy", imports = {}))
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final java.net.Proxy getProxy() {
        return this.proxy;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxySelector", imports = {}))
    /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
    public final java.net.ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
    public final okhttp3.Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "socketFactory", imports = {}))
    /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
    public final javax.net.SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sslSocketFactory", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final javax.net.ssl.SSLSocketFactory m2982deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "connectionSpecs", imports = {}))
    /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final java.util.List<okhttp3.ConnectionSpec> m2964deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "protocols", imports = {}))
    /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
    public final java.util.List<okhttp3.Protocol> m2975deprecated_protocols() {
        return this.protocols;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hostnameVerifier", imports = {}))
    /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
    public final javax.net.ssl.HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "certificatePinner", imports = {}))
    /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
    public final okhttp3.CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "callTimeoutMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_callTimeoutMillis, reason: not valid java name and from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "connectTimeoutMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name and from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "readTimeoutMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_readTimeoutMillis, reason: not valid java name and from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "writeTimeoutMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name and from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pingIntervalMillis", imports = {}))
    /* JADX INFO: renamed from: -deprecated_pingIntervalMillis, reason: not valid java name and from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    /* JADX INFO: compiled from: OkHttpClient.kt */
    @kotlin.Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J?\u0010\u009e\u0001\u001a\u00020\u00002*\b\u0004\u0010\u009f\u0001\u001a#\u0012\u0017\u0012\u00150¡\u0001¢\u0006\u000f\b¢\u0001\u0012\n\b£\u0001\u0012\u0005\b\b(¤\u0001\u0012\u0005\u0012\u00030¥\u00010 \u0001H\u0087\bø\u0001\u0000¢\u0006\u0003\b¦\u0001J\u0010\u0010\u009e\u0001\u001a\u00020\u00002\u0007\u0010§\u0001\u001a\u00020]J?\u0010¨\u0001\u001a\u00020\u00002*\b\u0004\u0010\u009f\u0001\u001a#\u0012\u0017\u0012\u00150¡\u0001¢\u0006\u000f\b¢\u0001\u0012\n\b£\u0001\u0012\u0005\b\b(¤\u0001\u0012\u0005\u0012\u00030¥\u00010 \u0001H\u0087\bø\u0001\u0000¢\u0006\u0003\b©\u0001J\u0010\u0010¨\u0001\u001a\u00020\u00002\u0007\u0010§\u0001\u001a\u00020]J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0007\u0010ª\u0001\u001a\u00020\u0003J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u0012\u001a\u00020\u00002\b\u0010«\u0001\u001a\u00030¬\u0001H\u0007J\u0019\u0010\u0012\u001a\u00020\u00002\u0007\u0010\u00ad\u0001\u001a\u00020`2\b\u0010®\u0001\u001a\u00030¯\u0001J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010$\u001a\u00020\u00002\b\u0010«\u0001\u001a\u00030¬\u0001H\u0007J\u0019\u0010$\u001a\u00020\u00002\u0007\u0010\u00ad\u0001\u001a\u00020`2\b\u0010®\u0001\u001a\u00030¯\u0001J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(J\u0014\u0010-\u001a\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.J\u000e\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u000205J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020AJ\u0011\u0010°\u0001\u001a\u00020\u00002\b\u0010°\u0001\u001a\u00030±\u0001J\u000e\u0010F\u001a\u00020\u00002\u0006\u0010F\u001a\u00020GJ\u000e\u0010L\u001a\u00020\u00002\u0006\u0010L\u001a\u00020MJ\u000f\u0010R\u001a\u00020\u00002\u0007\u0010²\u0001\u001a\u00020MJ\u000e\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020VJ\f\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\J\u000f\u0010_\u001a\u00020\u00002\u0007\u0010³\u0001\u001a\u00020`J\f\u0010e\u001a\b\u0012\u0004\u0012\u00020]0\\J\u0012\u0010g\u001a\u00020\u00002\b\u0010«\u0001\u001a\u00030¬\u0001H\u0007J\u0019\u0010g\u001a\u00020\u00002\u0007\u0010´\u0001\u001a\u00020`2\b\u0010®\u0001\u001a\u00030¯\u0001J\u0014\u0010j\u001a\u00020\u00002\f\u0010j\u001a\b\u0012\u0004\u0012\u00020k0.J\u0010\u0010n\u001a\u00020\u00002\b\u0010n\u001a\u0004\u0018\u00010oJ\u000e\u0010t\u001a\u00020\u00002\u0006\u0010t\u001a\u00020\u0007J\u000e\u0010w\u001a\u00020\u00002\u0006\u0010w\u001a\u00020xJ\u0012\u0010}\u001a\u00020\u00002\b\u0010«\u0001\u001a\u00030¬\u0001H\u0007J\u0019\u0010}\u001a\u00020\u00002\u0007\u0010\u00ad\u0001\u001a\u00020`2\b\u0010®\u0001\u001a\u00030¯\u0001J\u0010\u0010\u0080\u0001\u001a\u00020\u00002\u0007\u0010\u0080\u0001\u001a\u00020MJ\u0011\u0010\u0089\u0001\u001a\u00020\u00002\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001J\u0013\u0010µ\u0001\u001a\u00020\u00002\b\u0010µ\u0001\u001a\u00030\u0090\u0001H\u0007J\u001b\u0010µ\u0001\u001a\u00020\u00002\b\u0010µ\u0001\u001a\u00030\u0090\u00012\b\u0010¶\u0001\u001a\u00030\u0099\u0001J\u0013\u0010\u0095\u0001\u001a\u00020\u00002\b\u0010«\u0001\u001a\u00030¬\u0001H\u0007J\u001a\u0010\u0095\u0001\u001a\u00020\u00002\u0007\u0010\u00ad\u0001\u001a\u00020`2\b\u0010®\u0001\u001a\u00030¯\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001a\u0010'\u001a\u00020(X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020GX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020MX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020MX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QR\u001a\u0010U\u001a\u00020VX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u00101R\u001a\u0010_\u001a\u00020`X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020]0\\X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u00101R\u001a\u0010g\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0015\"\u0004\bi\u0010\u0017R \u0010j\u001a\b\u0012\u0004\u0012\u00020k0.X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u00101\"\u0004\bm\u00103R\u001c\u0010n\u001a\u0004\u0018\u00010oX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001a\u0010t\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\t\"\u0004\bv\u0010\u000bR\u001c\u0010w\u001a\u0004\u0018\u00010xX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001a\u0010}\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\u0015\"\u0004\b\u007f\u0010\u0017R\u001d\u0010\u0080\u0001\u001a\u00020MX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010O\"\u0005\b\u0082\u0001\u0010QR\"\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u0089\u0001\u001a\u00030\u008a\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\"\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001d\u0010\u0095\u0001\u001a\u00020\u0013X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010\u0015\"\u0005\b\u0097\u0001\u0010\u0017R\"\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006·\u0001"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "()V", "authenticator", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "cache", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "callTimeout", "", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "certificatePinner", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "connectTimeout", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "connectionPool", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "connectionSpecs", "", "Lokhttp3/ConnectionSpec;", "getConnectionSpecs$okhttp", "()Ljava/util/List;", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "cookieJar", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "dispatcher", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "dns", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "eventListenerFactory", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "followRedirects", "", "getFollowRedirects$okhttp", "()Z", "setFollowRedirects$okhttp", "(Z)V", "followSslRedirects", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "interceptors", "", "Lokhttp3/Interceptor;", "getInterceptors$okhttp", "minWebSocketMessageToCompress", "", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "networkInterceptors", "getNetworkInterceptors$okhttp", "pingInterval", "getPingInterval$okhttp", "setPingInterval$okhttp", "protocols", "Lokhttp3/Protocol;", "getProtocols$okhttp", "setProtocols$okhttp", "proxy", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "proxyAuthenticator", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "proxySelector", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "readTimeout", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "retryOnConnectionFailure", "getRetryOnConnectionFailure$okhttp", "setRetryOnConnectionFailure$okhttp", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "socketFactory", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "writeTimeout", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "addInterceptor", "block", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lkotlin/ParameterName;", "name", "chain", "Lokhttp3/Response;", "-addInterceptor", "interceptor", "addNetworkInterceptor", "-addNetworkInterceptor", "build", "duration", "Ljava/time/Duration;", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "eventListener", "Lokhttp3/EventListener;", "followProtocolRedirects", "bytes", "interval", "sslSocketFactory", "trustManager", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private okhttp3.Authenticator authenticator;
        private okhttp3.Cache cache;
        private int callTimeout;
        private okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;
        private okhttp3.CertificatePinner certificatePinner;
        private int connectTimeout;
        private okhttp3.ConnectionPool connectionPool;
        private java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
        private okhttp3.CookieJar cookieJar;
        private okhttp3.Dispatcher dispatcher;
        private okhttp3.Dns dns;
        private okhttp3.EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private javax.net.ssl.HostnameVerifier hostnameVerifier;
        private final java.util.List<okhttp3.Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final java.util.List<okhttp3.Interceptor> networkInterceptors;
        private int pingInterval;
        private java.util.List<? extends okhttp3.Protocol> protocols;
        private java.net.Proxy proxy;
        private okhttp3.Authenticator proxyAuthenticator;
        private java.net.ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private okhttp3.internal.connection.RouteDatabase routeDatabase;
        private javax.net.SocketFactory socketFactory;
        private javax.net.ssl.SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        private javax.net.ssl.X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new okhttp3.Dispatcher();
            this.connectionPool = new okhttp3.ConnectionPool();
            this.interceptors = new java.util.ArrayList();
            this.networkInterceptors = new java.util.ArrayList();
            this.eventListenerFactory = okhttp3.internal.Util.asFactory(okhttp3.EventListener.NONE);
            this.retryOnConnectionFailure = true;
            this.authenticator = okhttp3.Authenticator.NONE;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = okhttp3.CookieJar.NO_COOKIES;
            this.dns = okhttp3.Dns.SYSTEM;
            this.proxyAuthenticator = okhttp3.Authenticator.NONE;
            javax.net.SocketFactory socketFactory = javax.net.SocketFactory.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.socketFactory = socketFactory;
            this.connectionSpecs = okhttp3.OkHttpClient.INSTANCE.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = okhttp3.OkHttpClient.INSTANCE.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE;
            this.certificatePinner = okhttp3.CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        /* JADX INFO: renamed from: getDispatcher$okhttp, reason: from getter */
        public final okhttp3.Dispatcher getDispatcher() {
            return this.dispatcher;
        }

        public final void setDispatcher$okhttp(okhttp3.Dispatcher dispatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "<set-?>");
            this.dispatcher = dispatcher;
        }

        /* JADX INFO: renamed from: getConnectionPool$okhttp, reason: from getter */
        public final okhttp3.ConnectionPool getConnectionPool() {
            return this.connectionPool;
        }

        public final void setConnectionPool$okhttp(okhttp3.ConnectionPool connectionPool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPool, "<set-?>");
            this.connectionPool = connectionPool;
        }

        public final java.util.List<okhttp3.Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final java.util.List<okhttp3.Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        /* JADX INFO: renamed from: getEventListenerFactory$okhttp, reason: from getter */
        public final okhttp3.EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        public final void setEventListenerFactory$okhttp(okhttp3.EventListener.Factory factory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "<set-?>");
            this.eventListenerFactory = factory;
        }

        /* JADX INFO: renamed from: getRetryOnConnectionFailure$okhttp, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        /* JADX INFO: renamed from: getAuthenticator$okhttp, reason: from getter */
        public final okhttp3.Authenticator getAuthenticator() {
            return this.authenticator;
        }

        public final void setAuthenticator$okhttp(okhttp3.Authenticator authenticator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticator, "<set-?>");
            this.authenticator = authenticator;
        }

        /* JADX INFO: renamed from: getFollowRedirects$okhttp, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        /* JADX INFO: renamed from: getFollowSslRedirects$okhttp, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        /* JADX INFO: renamed from: getCookieJar$okhttp, reason: from getter */
        public final okhttp3.CookieJar getCookieJar() {
            return this.cookieJar;
        }

        public final void setCookieJar$okhttp(okhttp3.CookieJar cookieJar) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookieJar, "<set-?>");
            this.cookieJar = cookieJar;
        }

        /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
        public final okhttp3.Cache getCache() {
            return this.cache;
        }

        public final void setCache$okhttp(okhttp3.Cache cache) {
            this.cache = cache;
        }

        /* JADX INFO: renamed from: getDns$okhttp, reason: from getter */
        public final okhttp3.Dns getDns() {
            return this.dns;
        }

        public final void setDns$okhttp(okhttp3.Dns dns) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dns, "<set-?>");
            this.dns = dns;
        }

        /* JADX INFO: renamed from: getProxy$okhttp, reason: from getter */
        public final java.net.Proxy getProxy() {
            return this.proxy;
        }

        public final void setProxy$okhttp(java.net.Proxy proxy) {
            this.proxy = proxy;
        }

        /* JADX INFO: renamed from: getProxySelector$okhttp, reason: from getter */
        public final java.net.ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        public final void setProxySelector$okhttp(java.net.ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        /* JADX INFO: renamed from: getProxyAuthenticator$okhttp, reason: from getter */
        public final okhttp3.Authenticator getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        public final void setProxyAuthenticator$okhttp(okhttp3.Authenticator authenticator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticator, "<set-?>");
            this.proxyAuthenticator = authenticator;
        }

        /* JADX INFO: renamed from: getSocketFactory$okhttp, reason: from getter */
        public final javax.net.SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        public final void setSocketFactory$okhttp(javax.net.SocketFactory socketFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketFactory, "<set-?>");
            this.socketFactory = socketFactory;
        }

        /* JADX INFO: renamed from: getSslSocketFactoryOrNull$okhttp, reason: from getter */
        public final javax.net.ssl.SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        public final void setSslSocketFactoryOrNull$okhttp(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        /* JADX INFO: renamed from: getX509TrustManagerOrNull$okhttp, reason: from getter */
        public final javax.net.ssl.X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        public final void setX509TrustManagerOrNull$okhttp(javax.net.ssl.X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final java.util.List<okhttp3.ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        public final void setConnectionSpecs$okhttp(java.util.List<okhttp3.ConnectionSpec> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.connectionSpecs = list;
        }

        public final java.util.List<okhttp3.Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        public final void setProtocols$okhttp(java.util.List<? extends okhttp3.Protocol> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.protocols = list;
        }

        /* JADX INFO: renamed from: getHostnameVerifier$okhttp, reason: from getter */
        public final javax.net.ssl.HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        public final void setHostnameVerifier$okhttp(javax.net.ssl.HostnameVerifier hostnameVerifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostnameVerifier, "<set-?>");
            this.hostnameVerifier = hostnameVerifier;
        }

        /* JADX INFO: renamed from: getCertificatePinner$okhttp, reason: from getter */
        public final okhttp3.CertificatePinner getCertificatePinner() {
            return this.certificatePinner;
        }

        public final void setCertificatePinner$okhttp(okhttp3.CertificatePinner certificatePinner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificatePinner, "<set-?>");
            this.certificatePinner = certificatePinner;
        }

        /* JADX INFO: renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
        public final okhttp3.internal.tls.CertificateChainCleaner getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        public final void setCertificateChainCleaner$okhttp(okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        /* JADX INFO: renamed from: getCallTimeout$okhttp, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        /* JADX INFO: renamed from: getConnectTimeout$okhttp, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        /* JADX INFO: renamed from: getReadTimeout$okhttp, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        /* JADX INFO: renamed from: getWriteTimeout$okhttp, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        /* JADX INFO: renamed from: getPingInterval$okhttp, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        /* JADX INFO: renamed from: getMinWebSocketMessageToCompress$okhttp, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            this.minWebSocketMessageToCompress = j;
        }

        /* JADX INFO: renamed from: getRouteDatabase$okhttp, reason: from getter */
        public final okhttp3.internal.connection.RouteDatabase getRouteDatabase() {
            return this.routeDatabase;
        }

        public final void setRouteDatabase$okhttp(okhttp3.internal.connection.RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(okhttp3.OkHttpClient okHttpClient) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            kotlin.collections.CollectionsKt.addAll(this.interceptors, okHttpClient.interceptors());
            kotlin.collections.CollectionsKt.addAll(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }

        public final okhttp3.OkHttpClient.Builder dispatcher(okhttp3.Dispatcher dispatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            this.dispatcher = dispatcher;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder connectionPool(okhttp3.ConnectionPool connectionPool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            this.connectionPool = connectionPool;
            return this;
        }

        public final java.util.List<okhttp3.Interceptor> interceptors() {
            return this.interceptors;
        }

        public final okhttp3.OkHttpClient.Builder addInterceptor(okhttp3.Interceptor interceptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        /* JADX INFO: renamed from: -addInterceptor, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m2984addInterceptor(final kotlin.jvm.functions.Function1<? super okhttp3.Interceptor.Chain, okhttp3.Response> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
            return addInterceptor(new okhttp3.Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // okhttp3.Interceptor
                public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
                    return block.invoke(chain);
                }
            });
        }

        public final java.util.List<okhttp3.Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final okhttp3.OkHttpClient.Builder addNetworkInterceptor(okhttp3.Interceptor interceptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        /* JADX INFO: renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final okhttp3.OkHttpClient.Builder m2985addNetworkInterceptor(final kotlin.jvm.functions.Function1<? super okhttp3.Interceptor.Chain, okhttp3.Response> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
            return addNetworkInterceptor(new okhttp3.Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // okhttp3.Interceptor
                public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
                    return block.invoke(chain);
                }
            });
        }

        public final okhttp3.OkHttpClient.Builder eventListener(okhttp3.EventListener eventListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            this.eventListenerFactory = okhttp3.internal.Util.asFactory(eventListener);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder eventListenerFactory(okhttp3.EventListener.Factory eventListenerFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder retryOnConnectionFailure(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder authenticator(okhttp3.Authenticator authenticator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticator, "authenticator");
            this.authenticator = authenticator;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder followRedirects(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder followSslRedirects(boolean followProtocolRedirects) {
            this.followSslRedirects = followProtocolRedirects;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder cookieJar(okhttp3.CookieJar cookieJar) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder cache(okhttp3.Cache cache) {
            this.cache = cache;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder dns(okhttp3.Dns dns) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dns, "dns");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder proxy(java.net.Proxy proxy) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder proxySelector(java.net.ProxySelector proxySelector) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(proxySelector, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder proxyAuthenticator(okhttp3.Authenticator proxyAuthenticator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(proxyAuthenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder socketFactory(javax.net.SocketFactory socketFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
            if (!(!(socketFactory instanceof javax.net.ssl.SSLSocketFactory))) {
                throw new java.lang.IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(socketFactory, this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        public final okhttp3.OkHttpClient.Builder sslSocketFactory(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(sslSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            javax.net.ssl.X509TrustManager x509TrustManagerTrustManager = okhttp3.internal.platform.Platform.INSTANCE.get().trustManager(sslSocketFactory);
            if (x509TrustManagerTrustManager == null) {
                throw new java.lang.IllegalStateException("Unable to extract the trust manager on " + okhttp3.internal.platform.Platform.INSTANCE.get() + ", sslSocketFactory is " + sslSocketFactory.getClass());
            }
            this.x509TrustManagerOrNull = x509TrustManagerTrustManager;
            okhttp3.internal.platform.Platform platform = okhttp3.internal.platform.Platform.INSTANCE.get();
            javax.net.ssl.X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
            kotlin.jvm.internal.Intrinsics.checkNotNull(x509TrustManager);
            this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder sslSocketFactory(javax.net.ssl.SSLSocketFactory sslSocketFactory, javax.net.ssl.X509TrustManager trustManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(sslSocketFactory, this.sslSocketFactoryOrNull) || !kotlin.jvm.internal.Intrinsics.areEqual(trustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = okhttp3.internal.tls.CertificateChainCleaner.INSTANCE.get(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder connectionSpecs(java.util.List<okhttp3.ConnectionSpec> connectionSpecs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(connectionSpecs, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = okhttp3.internal.Util.toImmutableList(connectionSpecs);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder protocols(java.util.List<? extends okhttp3.Protocol> protocols) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
            java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) protocols);
            if (!(mutableList.contains(okhttp3.Protocol.H2_PRIOR_KNOWLEDGE) || mutableList.contains(okhttp3.Protocol.HTTP_1_1))) {
                throw new java.lang.IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + mutableList).toString());
            }
            if (!(!mutableList.contains(okhttp3.Protocol.H2_PRIOR_KNOWLEDGE) || mutableList.size() <= 1)) {
                throw new java.lang.IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + mutableList).toString());
            }
            if (!(!mutableList.contains(okhttp3.Protocol.HTTP_1_0))) {
                throw new java.lang.IllegalArgumentException(("protocols must not contain http/1.0: " + mutableList).toString());
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(mutableList, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (!(!mutableList.contains(null))) {
                throw new java.lang.IllegalArgumentException("protocols must not contain null".toString());
            }
            mutableList.remove(okhttp3.Protocol.SPDY_3);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(mutableList, this.protocols)) {
                this.routeDatabase = null;
            }
            java.util.List<? extends okhttp3.Protocol> listUnmodifiableList = java.util.Collections.unmodifiableList(mutableList);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            this.protocols = listUnmodifiableList;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder hostnameVerifier(javax.net.ssl.HostnameVerifier hostnameVerifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder certificatePinner(okhttp3.CertificatePinner certificatePinner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        public final okhttp3.OkHttpClient.Builder callTimeout(long timeout, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
            this.callTimeout = okhttp3.internal.Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder callTimeout(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "duration");
            callTimeout(duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder connectTimeout(long timeout, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
            this.connectTimeout = okhttp3.internal.Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder connectTimeout(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "duration");
            connectTimeout(duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder readTimeout(long timeout, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
            this.readTimeout = okhttp3.internal.Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder readTimeout(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "duration");
            readTimeout(duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder writeTimeout(long timeout, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
            this.writeTimeout = okhttp3.internal.Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder writeTimeout(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "duration");
            writeTimeout(duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder pingInterval(long interval, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
            this.pingInterval = okhttp3.internal.Util.checkDuration("interval", interval, unit);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder pingInterval(java.time.Duration duration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "duration");
            pingInterval(duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return this;
        }

        public final okhttp3.OkHttpClient.Builder minWebSocketMessageToCompress(long bytes) {
            if (!(bytes >= 0)) {
                throw new java.lang.IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + bytes).toString());
            }
            this.minWebSocketMessageToCompress = bytes;
            return this;
        }

        public final okhttp3.OkHttpClient build() {
            return new okhttp3.OkHttpClient(this);
        }
    }

    /* JADX INFO: compiled from: OkHttpClient.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "()V", "DEFAULT_CONNECTION_SPECS", "", "Lokhttp3/ConnectionSpec;", "getDEFAULT_CONNECTION_SPECS$okhttp", "()Ljava/util/List;", "DEFAULT_PROTOCOLS", "Lokhttp3/Protocol;", "getDEFAULT_PROTOCOLS$okhttp", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.util.List<okhttp3.Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return okhttp3.OkHttpClient.DEFAULT_PROTOCOLS;
        }

        public final java.util.List<okhttp3.ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return okhttp3.OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }
    }
}
