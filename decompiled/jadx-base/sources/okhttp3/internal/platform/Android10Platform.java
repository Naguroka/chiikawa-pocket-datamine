package okhttp3.internal.platform;

/* JADX INFO: compiled from: Android10Platform.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/platform/Android10Platform;", "Lokhttp3/internal/platform/Platform;", "()V", "socketAdapters", "", "Lokhttp3/internal/platform/android/SocketAdapter;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "configureTlsExtensions", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", "", "protocols", "Lokhttp3/Protocol;", "getSelectedProtocol", "isCleartextTrafficPermitted", "", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Android10Platform extends okhttp3.internal.platform.Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.Android10Platform.Companion INSTANCE = new okhttp3.internal.platform.Android10Platform.Companion(null);
    private static final boolean isSupported;
    private final java.util.List<okhttp3.internal.platform.android.SocketAdapter> socketAdapters;

    public Android10Platform() {
        java.util.List listListOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new okhttp3.internal.platform.android.SocketAdapter[]{okhttp3.internal.platform.android.Android10SocketAdapter.INSTANCE.buildIfSupported(), new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.AndroidSocketAdapter.INSTANCE.getPlayProviderFactory()), new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.ConscryptSocketAdapter.INSTANCE.getFactory()), new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.BouncyCastleSocketAdapter.INSTANCE.getFactory())});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listListOfNotNull) {
            if (((okhttp3.internal.platform.android.SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
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
    public void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<? extends okhttp3.Protocol> protocols) {
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

    /* JADX INFO: compiled from: Android10Platform.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/Android10Platform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isSupported() {
            return okhttp3.internal.platform.Android10Platform.isSupported;
        }

        public final okhttp3.internal.platform.Platform buildIfSupported() {
            if (isSupported()) {
                return new okhttp3.internal.platform.Android10Platform();
            }
            return null;
        }
    }

    static {
        isSupported = okhttp3.internal.platform.Platform.INSTANCE.isAndroid() && android.os.Build.VERSION.SDK_INT >= 29;
    }
}
