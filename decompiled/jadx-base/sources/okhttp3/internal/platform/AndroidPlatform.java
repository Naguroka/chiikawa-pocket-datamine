package okhttp3.internal.platform;

/* JADX INFO: compiled from: AndroidPlatform.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J-\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0011\u0010\u0014\u001a\r\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\u00160\u0006H\u0016J \u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u0013H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020(H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "()V", "closeGuard", "Lokhttp3/internal/platform/android/CloseGuard;", "socketAdapters", "", "Lokhttp3/internal/platform/android/SocketAdapter;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "buildTrustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "configureTlsExtensions", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", "", "protocols", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "connectSocket", "socket", "Ljava/net/Socket;", org.jacoco.core.runtime.AgentOptions.ADDRESS, "Ljava/net/InetSocketAddress;", "connectTimeout", "", "getSelectedProtocol", "getStackTraceForCloseable", "", "closer", "isCleartextTrafficPermitted", "", "logCloseableLeak", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "stackTrace", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Companion", "CustomTrustRootIndex", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidPlatform extends okhttp3.internal.platform.Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.AndroidPlatform.Companion INSTANCE = new okhttp3.internal.platform.AndroidPlatform.Companion(null);
    private static final boolean isSupported;
    private final okhttp3.internal.platform.android.CloseGuard closeGuard;
    private final java.util.List<okhttp3.internal.platform.android.SocketAdapter> socketAdapters;

    public AndroidPlatform() {
        java.util.List listListOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new okhttp3.internal.platform.android.SocketAdapter[]{okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion.buildIfSupported$default(okhttp3.internal.platform.android.StandardAndroidSocketAdapter.INSTANCE, null, 1, null), new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.AndroidSocketAdapter.INSTANCE.getPlayProviderFactory()), new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.ConscryptSocketAdapter.INSTANCE.getFactory()), new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.BouncyCastleSocketAdapter.INSTANCE.getFactory())});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listListOfNotNull) {
            if (((okhttp3.internal.platform.android.SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
        this.closeGuard = okhttp3.internal.platform.android.CloseGuard.INSTANCE.get();
    }

    @Override // okhttp3.internal.platform.Platform
    public void connectSocket(java.net.Socket socket, java.net.InetSocketAddress address, int connectTimeout) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "socket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, connectTimeout);
        } catch (java.lang.ClassCastException e) {
            if (android.os.Build.VERSION.SDK_INT == 26) {
                throw new java.io.IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        java.util.Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((okhttp3.internal.platform.android.SocketAdapter) next).matchesSocketFactory(sslSocketFactory));
        okhttp3.internal.platform.android.SocketAdapter socketAdapter = (okhttp3.internal.platform.android.SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.trustManager(sslSocketFactory);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<okhttp3.Protocol> protocols) {
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
        java.util.Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((okhttp3.internal.platform.android.SocketAdapter) next).matchesSocket(sslSocket));
        okhttp3.internal.platform.android.SocketAdapter socketAdapter = (okhttp3.internal.platform.android.SocketAdapter) next;
        if (socketAdapter != null) {
            socketAdapter.configureTlsExtensions(sslSocket, hostname, protocols);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        java.util.Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((okhttp3.internal.platform.android.SocketAdapter) next).matchesSocket(sslSocket));
        okhttp3.internal.platform.android.SocketAdapter socketAdapter = (okhttp3.internal.platform.android.SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.Object getStackTraceForCloseable(java.lang.String closer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closer, "closer");
        return this.closeGuard.createAndOpen(closer);
    }

    @Override // okhttp3.internal.platform.Platform
    public void logCloseableLeak(java.lang.String message, java.lang.Object stackTrace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (this.closeGuard.warnIfOpen(stackTrace)) {
            return;
        }
        okhttp3.internal.platform.Platform.log$default(this, message, 5, null, 4, null);
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(java.lang.String hostname) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "hostname");
        return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.Platform
    public okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        okhttp3.internal.platform.android.AndroidCertificateChainCleaner androidCertificateChainCleanerBuildIfSupported = okhttp3.internal.platform.android.AndroidCertificateChainCleaner.INSTANCE.buildIfSupported(trustManager);
        return androidCertificateChainCleanerBuildIfSupported != null ? androidCertificateChainCleanerBuildIfSupported : super.buildCertificateChainCleaner(trustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    public okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            java.lang.reflect.Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", java.security.cert.X509Certificate.class);
            method.setAccessible(true);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(method, "method");
            return new okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex(trustManager, method);
        } catch (java.lang.NoSuchMethodException unused) {
            return super.buildTrustRootIndex(trustManager);
        }
    }

    /* JADX INFO: compiled from: AndroidPlatform.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "findByIssuerAndSignatureMethod", "Ljava/lang/reflect/Method;", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "component1", "component2", "copy", "equals", "", "other", "", "findByIssuerAndSignature", "Ljava/security/cert/X509Certificate;", "cert", "hashCode", "", "toString", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CustomTrustRootIndex implements okhttp3.internal.tls.TrustRootIndex {
        private final java.lang.reflect.Method findByIssuerAndSignatureMethod;
        private final javax.net.ssl.X509TrustManager trustManager;

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final javax.net.ssl.X509TrustManager getTrustManager() {
            return this.trustManager;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final java.lang.reflect.Method getFindByIssuerAndSignatureMethod() {
            return this.findByIssuerAndSignatureMethod;
        }

        public static /* synthetic */ okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex copy$default(okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex customTrustRootIndex, javax.net.ssl.X509TrustManager x509TrustManager, java.lang.reflect.Method method, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                x509TrustManager = customTrustRootIndex.trustManager;
            }
            if ((i & 2) != 0) {
                method = customTrustRootIndex.findByIssuerAndSignatureMethod;
            }
            return customTrustRootIndex.copy(x509TrustManager, method);
        }

        public final okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex copy(javax.net.ssl.X509TrustManager trustManager, java.lang.reflect.Method findByIssuerAndSignatureMethod) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            return new okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex(trustManager, findByIssuerAndSignatureMethod);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex)) {
                return false;
            }
            okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex customTrustRootIndex = (okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.trustManager, customTrustRootIndex.trustManager) && kotlin.jvm.internal.Intrinsics.areEqual(this.findByIssuerAndSignatureMethod, customTrustRootIndex.findByIssuerAndSignatureMethod);
        }

        public int hashCode() {
            return (this.trustManager.hashCode() * 31) + this.findByIssuerAndSignatureMethod.hashCode();
        }

        public java.lang.String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.trustManager + ", findByIssuerAndSignatureMethod=" + this.findByIssuerAndSignatureMethod + ')';
        }

        public CustomTrustRootIndex(javax.net.ssl.X509TrustManager trustManager, java.lang.reflect.Method findByIssuerAndSignatureMethod) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.trustManager = trustManager;
            this.findByIssuerAndSignatureMethod = findByIssuerAndSignatureMethod;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate cert) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                java.lang.Object objInvoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, cert);
                kotlin.jvm.internal.Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((java.security.cert.TrustAnchor) objInvoke).getTrustedCert();
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError("unable to get issues and signature", e);
            } catch (java.lang.reflect.InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: AndroidPlatform.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isSupported() {
            return okhttp3.internal.platform.AndroidPlatform.isSupported;
        }

        public final okhttp3.internal.platform.Platform buildIfSupported() {
            if (isSupported()) {
                return new okhttp3.internal.platform.AndroidPlatform();
            }
            return null;
        }
    }

    static {
        boolean z = false;
        if (okhttp3.internal.platform.Platform.INSTANCE.isAndroid() && android.os.Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        isSupported = z;
    }
}
