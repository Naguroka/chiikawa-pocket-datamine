package okhttp3.internal.platform;

/* JADX INFO: compiled from: ConscryptPlatform.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\fH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/platform/ConscryptPlatform;", "Lokhttp3/internal/platform/Platform;", "()V", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Ljava/security/Provider;", "configureTlsExtensions", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "getSelectedProtocol", "newSSLContext", "Ljavax/net/ssl/SSLContext;", "newSslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "sslSocketFactory", "Companion", "DisabledHostnameVerifier", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConscryptPlatform extends okhttp3.internal.platform.Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.ConscryptPlatform.Companion INSTANCE;
    private static final boolean isSupported;
    private final java.security.Provider provider;

    public /* synthetic */ ConscryptPlatform(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return null;
    }

    private ConscryptPlatform() {
        java.security.Provider providerNewProvider = org.conscrypt.Conscrypt.newProvider();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(providerNewProvider, "newProvider()");
        this.provider = providerNewProvider;
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.SSLContext newSSLContext() throws java.security.NoSuchAlgorithmException {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS", this.provider);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager platformTrustManager() throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
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
        javax.net.ssl.X509TrustManager x509TrustManager = (javax.net.ssl.X509TrustManager) trustManager;
        org.conscrypt.Conscrypt.setHostnameVerifier(x509TrustManager, okhttp3.internal.platform.ConscryptPlatform.DisabledHostnameVerifier.INSTANCE);
        return x509TrustManager;
    }

    /* JADX INFO: compiled from: ConscryptPlatform.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\fJ\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\r"}, d2 = {"Lokhttp3/internal/platform/ConscryptPlatform$DisabledHostnameVerifier;", "Lorg/conscrypt/ConscryptHostnameVerifier;", "()V", "verify", "", "certs", "", "Ljava/security/cert/X509Certificate;", "hostname", "", "session", "Ljavax/net/ssl/SSLSession;", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisabledHostnameVerifier implements org.conscrypt.ConscryptHostnameVerifier {
        public static final okhttp3.internal.platform.ConscryptPlatform.DisabledHostnameVerifier INSTANCE = new okhttp3.internal.platform.ConscryptPlatform.DisabledHostnameVerifier();

        public final boolean verify(java.lang.String hostname, javax.net.ssl.SSLSession session) {
            return true;
        }

        public boolean verify(java.security.cert.X509Certificate[] certs, java.lang.String hostname, javax.net.ssl.SSLSession session) {
            return true;
        }

        private DisabledHostnameVerifier() {
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<okhttp3.Protocol> protocols) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (org.conscrypt.Conscrypt.isConscrypt(sslSocket)) {
            org.conscrypt.Conscrypt.setUseSessionTickets(sslSocket, true);
            org.conscrypt.Conscrypt.setApplicationProtocols(sslSocket, (java.lang.String[]) okhttp3.internal.platform.Platform.INSTANCE.alpnProtocolNames(protocols).toArray(new java.lang.String[0]));
        } else {
            super.configureTlsExtensions(sslSocket, hostname, protocols);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (org.conscrypt.Conscrypt.isConscrypt(sslSocket)) {
            return org.conscrypt.Conscrypt.getApplicationProtocol(sslSocket);
        }
        return super.getSelectedProtocol(sslSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.SSLSocketFactory newSslSocketFactory(javax.net.ssl.X509TrustManager trustManager) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        javax.net.ssl.SSLContext sSLContextNewSSLContext = newSSLContext();
        sSLContextNewSSLContext.init(null, new javax.net.ssl.TrustManager[]{trustManager}, null);
        javax.net.ssl.SSLSocketFactory socketFactory = sSLContextNewSSLContext.getSocketFactory();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    /* JADX INFO: compiled from: ConscryptPlatform.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\r"}, d2 = {"Lokhttp3/internal/platform/ConscryptPlatform$Companion;", "", "()V", "isSupported", "", "()Z", "atLeastVersion", "major", "", "minor", "patch", "buildIfSupported", "Lokhttp3/internal/platform/ConscryptPlatform;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isSupported() {
            return okhttp3.internal.platform.ConscryptPlatform.isSupported;
        }

        public final okhttp3.internal.platform.ConscryptPlatform buildIfSupported() {
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (isSupported()) {
                return new okhttp3.internal.platform.ConscryptPlatform(defaultConstructorMarker);
            }
            return null;
        }

        public static /* synthetic */ boolean atLeastVersion$default(okhttp3.internal.platform.ConscryptPlatform.Companion companion, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            return companion.atLeastVersion(i, i2, i3);
        }

        public final boolean atLeastVersion(int major, int minor, int patch) {
            org.conscrypt.Conscrypt.Version version = org.conscrypt.Conscrypt.version();
            if (version.major() != major) {
                return version.major() > major;
            }
            if (version.minor() != minor) {
                return version.minor() > minor;
            }
            return version.patch() >= patch;
        }
    }

    static {
        okhttp3.internal.platform.ConscryptPlatform.Companion companion = new okhttp3.internal.platform.ConscryptPlatform.Companion(null);
        INSTANCE = companion;
        boolean z = false;
        try {
            java.lang.Class.forName("org.conscrypt.Conscrypt$Version", false, companion.getClass().getClassLoader());
            if (org.conscrypt.Conscrypt.isAvailable() && companion.atLeastVersion(2, 1, 0)) {
                z = true;
            }
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused) {
        }
        isSupported = z;
    }
}
