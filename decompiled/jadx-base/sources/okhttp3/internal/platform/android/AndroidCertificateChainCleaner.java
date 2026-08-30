package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: AndroidCertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManagerExtensions", "Landroid/net/http/X509TrustManagerExtensions;", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "clean", "", "Ljava/security/cert/Certificate;", "chain", "hostname", "", "equals", "", "other", "", "hashCode", "", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.android.AndroidCertificateChainCleaner.Companion INSTANCE = new okhttp3.internal.platform.android.AndroidCertificateChainCleaner.Companion(null);
    private final javax.net.ssl.X509TrustManager trustManager;
    private final android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions;

    public AndroidCertificateChainCleaner(javax.net.ssl.X509TrustManager trustManager, android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.trustManager = trustManager;
        this.x509TrustManagerExtensions = x509TrustManagerExtensions;
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public java.util.List<java.security.cert.Certificate> clean(java.util.List<? extends java.security.cert.Certificate> chain, java.lang.String hostname) throws javax.net.ssl.SSLPeerUnverifiedException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            java.util.List<java.security.cert.X509Certificate> listCheckServerTrusted = this.x509TrustManagerExtensions.checkServerTrusted((java.security.cert.X509Certificate[]) chain.toArray(new java.security.cert.X509Certificate[0]), "RSA", hostname);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (java.security.cert.CertificateException e) {
            javax.net.ssl.SSLPeerUnverifiedException sSLPeerUnverifiedException = new javax.net.ssl.SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof okhttp3.internal.platform.android.AndroidCertificateChainCleaner) && ((okhttp3.internal.platform.android.AndroidCertificateChainCleaner) other).trustManager == this.trustManager;
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(this.trustManager);
    }

    /* JADX INFO: compiled from: AndroidCertificateChainCleaner.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final okhttp3.internal.platform.android.AndroidCertificateChainCleaner buildIfSupported(javax.net.ssl.X509TrustManager trustManager) {
            android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new android.net.http.X509TrustManagerExtensions(trustManager);
            } catch (java.lang.IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new okhttp3.internal.platform.android.AndroidCertificateChainCleaner(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }
}
