package okhttp3.internal.platform;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J-\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u00130\u0011H\u0016J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u000fJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u001a2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020\u000fH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020+H\u0016¨\u00060"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "()V", "afterHandshake", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "buildTrustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "configureTlsExtensions", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "connectSocket", "socket", "Ljava/net/Socket;", org.jacoco.core.runtime.AgentOptions.ADDRESS, "Ljava/net/InetSocketAddress;", "connectTimeout", "", "getPrefix", "getSelectedProtocol", "getStackTraceForCloseable", "closer", "isCleartextTrafficPermitted", "", "log", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "level", "t", "", "logCloseableLeak", "stackTrace", "newSSLContext", "Ljavax/net/ssl/SSLContext;", "newSslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "platformTrustManager", "toString", "sslSocketFactory", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.Platform.Companion INSTANCE;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final java.util.logging.Logger logger;
    private static volatile okhttp3.internal.platform.Platform platform;

    @kotlin.jvm.JvmStatic
    public static final okhttp3.internal.platform.Platform get() {
        return INSTANCE.get();
    }

    public void afterHandshake(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<okhttp3.Protocol> protocols) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public final java.lang.String getPrefix() {
        return "OkHttp";
    }

    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public boolean isCleartextTrafficPermitted(java.lang.String hostname) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public javax.net.ssl.SSLContext newSSLContext() throws java.security.NoSuchAlgorithmException {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public javax.net.ssl.X509TrustManager platformTrustManager() {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((java.security.KeyStore) null);
        javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.Intrinsics.checkNotNull(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof javax.net.ssl.X509TrustManager))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected default trust managers: ");
            java.lang.String string = java.util.Arrays.toString(trustManagers);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            throw new java.lang.IllegalStateException(sb.append(string).toString().toString());
        }
        javax.net.ssl.TrustManager trustManager = trustManagers[0];
        kotlin.jvm.internal.Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        return (javax.net.ssl.X509TrustManager) trustManager;
    }

    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        try {
            java.lang.Class<?> sslContextClass = java.lang.Class.forName("sun.security.ssl.SSLContextImpl");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sslContextClass, "sslContextClass");
            java.lang.Object fieldOrNull = okhttp3.internal.Util.readFieldOrNull(sslSocketFactory, sslContextClass, "context");
            if (fieldOrNull == null) {
                return null;
            }
            return (javax.net.ssl.X509TrustManager) okhttp3.internal.Util.readFieldOrNull(fieldOrNull, javax.net.ssl.X509TrustManager.class, "trustManager");
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        } catch (java.lang.RuntimeException e) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(e.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                return null;
            }
            throw e;
        }
    }

    public void connectSocket(java.net.Socket socket, java.net.InetSocketAddress address, int connectTimeout) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "socket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, connectTimeout);
    }

    public static /* synthetic */ void log$default(okhttp3.internal.platform.Platform platform2, java.lang.String str, int i, java.lang.Throwable th, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        platform2.log(str, i, th);
    }

    public void log(java.lang.String message, int level, java.lang.Throwable t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        logger.log(level == 5 ? java.util.logging.Level.WARNING : java.util.logging.Level.INFO, message, t);
    }

    public java.lang.Object getStackTraceForCloseable(java.lang.String closer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closer, "closer");
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            return new java.lang.Throwable(closer);
        }
        return null;
    }

    public void logCloseableLeak(java.lang.String message, java.lang.Object stackTrace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (stackTrace == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        log(message, 5, (java.lang.Throwable) stackTrace);
    }

    public okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new okhttp3.internal.tls.BasicCertificateChainCleaner(buildTrustRootIndex(trustManager));
    }

    public okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        java.security.cert.X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new okhttp3.internal.tls.BasicTrustRootIndex((java.security.cert.X509Certificate[]) java.util.Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public javax.net.ssl.SSLSocketFactory newSslSocketFactory(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            javax.net.ssl.SSLContext sSLContextNewSSLContext = newSSLContext();
            sSLContextNewSSLContext.init(null, new javax.net.ssl.TrustManager[]{trustManager}, null);
            javax.net.ssl.SSLSocketFactory socketFactory = sSLContextNewSSLContext.getSocketFactory();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.AssertionError("No System TLS: " + e, e);
        }
    }

    public java.lang.String toString() {
        java.lang.String simpleName = getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    /* JADX INFO: compiled from: Platform.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012J\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "()V", "INFO", "", "WARN", "isAndroid", "", "()Z", "isBouncyCastlePreferred", "isConscryptPreferred", "isOpenJSSEPreferred", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", com.json.ce.A, "Lokhttp3/internal/platform/Platform;", "alpnProtocolNames", "", "", "protocols", "Lokhttp3/Protocol;", "concatLengthPrefixed", "", "findAndroidPlatform", "findJvmPlatform", "findPlatform", "get", "resetForTests", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.internal.platform.Platform get() {
            return okhttp3.internal.platform.Platform.platform;
        }

        public static /* synthetic */ void resetForTests$default(okhttp3.internal.platform.Platform.Companion companion, okhttp3.internal.platform.Platform platform, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                platform = companion.findPlatform();
            }
            companion.resetForTests(platform);
        }

        public final void resetForTests(okhttp3.internal.platform.Platform platform) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "platform");
            okhttp3.internal.platform.Platform.platform = platform;
        }

        public final java.util.List<java.lang.String> alpnProtocolNames(java.util.List<? extends okhttp3.Protocol> protocols) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : protocols) {
                if (((okhttp3.Protocol) obj) != okhttp3.Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((okhttp3.Protocol) it.next()).getProtocol());
            }
            return arrayList3;
        }

        public final boolean isAndroid() {
            return kotlin.jvm.internal.Intrinsics.areEqual("Dalvik", java.lang.System.getProperty("java.vm.name"));
        }

        private final boolean isConscryptPreferred() {
            return kotlin.jvm.internal.Intrinsics.areEqual("Conscrypt", java.security.Security.getProviders()[0].getName());
        }

        private final boolean isOpenJSSEPreferred() {
            return kotlin.jvm.internal.Intrinsics.areEqual("OpenJSSE", java.security.Security.getProviders()[0].getName());
        }

        private final boolean isBouncyCastlePreferred() {
            return kotlin.jvm.internal.Intrinsics.areEqual("BC", java.security.Security.getProviders()[0].getName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final okhttp3.internal.platform.Platform findPlatform() {
            if (isAndroid()) {
                return findAndroidPlatform();
            }
            return findJvmPlatform();
        }

        private final okhttp3.internal.platform.Platform findAndroidPlatform() {
            okhttp3.internal.platform.android.AndroidLog.INSTANCE.enable();
            okhttp3.internal.platform.Platform platformBuildIfSupported = okhttp3.internal.platform.Android10Platform.INSTANCE.buildIfSupported();
            if (platformBuildIfSupported != null) {
                return platformBuildIfSupported;
            }
            okhttp3.internal.platform.Platform platformBuildIfSupported2 = okhttp3.internal.platform.AndroidPlatform.Companion.buildIfSupported();
            kotlin.jvm.internal.Intrinsics.checkNotNull(platformBuildIfSupported2);
            return platformBuildIfSupported2;
        }

        private final okhttp3.internal.platform.Platform findJvmPlatform() {
            okhttp3.internal.platform.OpenJSSEPlatform openJSSEPlatformBuildIfSupported;
            okhttp3.internal.platform.BouncyCastlePlatform bouncyCastlePlatformBuildIfSupported;
            okhttp3.internal.platform.ConscryptPlatform conscryptPlatformBuildIfSupported;
            if (isConscryptPreferred() && (conscryptPlatformBuildIfSupported = okhttp3.internal.platform.ConscryptPlatform.INSTANCE.buildIfSupported()) != null) {
                return conscryptPlatformBuildIfSupported;
            }
            if (isBouncyCastlePreferred() && (bouncyCastlePlatformBuildIfSupported = okhttp3.internal.platform.BouncyCastlePlatform.INSTANCE.buildIfSupported()) != null) {
                return bouncyCastlePlatformBuildIfSupported;
            }
            if (isOpenJSSEPreferred() && (openJSSEPlatformBuildIfSupported = okhttp3.internal.platform.OpenJSSEPlatform.INSTANCE.buildIfSupported()) != null) {
                return openJSSEPlatformBuildIfSupported;
            }
            okhttp3.internal.platform.Jdk9Platform jdk9PlatformBuildIfSupported = okhttp3.internal.platform.Jdk9Platform.INSTANCE.buildIfSupported();
            if (jdk9PlatformBuildIfSupported != null) {
                return jdk9PlatformBuildIfSupported;
            }
            okhttp3.internal.platform.Platform platformBuildIfSupported = okhttp3.internal.platform.Jdk8WithJettyBootPlatform.INSTANCE.buildIfSupported();
            return platformBuildIfSupported != null ? platformBuildIfSupported : new okhttp3.internal.platform.Platform();
        }

        public final byte[] concatLengthPrefixed(java.util.List<? extends okhttp3.Protocol> protocols) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
            okio.Buffer buffer = new okio.Buffer();
            for (java.lang.String str : alpnProtocolNames(protocols)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }
    }

    static {
        okhttp3.internal.platform.Platform.Companion companion = new okhttp3.internal.platform.Platform.Companion(null);
        INSTANCE = companion;
        platform = companion.findPlatform();
        logger = java.util.logging.Logger.getLogger(okhttp3.OkHttpClient.class.getName());
    }
}
