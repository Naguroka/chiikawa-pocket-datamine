package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: StandardAndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB1\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0003\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/platform/android/StandardAndroidSocketAdapter;", "Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "sslSocketClass", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketFactoryClass", "Ljavax/net/ssl/SSLSocketFactory;", "paramClass", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "matchesSocketFactory", "", "sslSocketFactory", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StandardAndroidSocketAdapter extends okhttp3.internal.platform.android.AndroidSocketAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion INSTANCE = new okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion(null);
    private final java.lang.Class<?> paramClass;
    private final java.lang.Class<? super javax.net.ssl.SSLSocketFactory> sslSocketFactoryClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(java.lang.Class<? super javax.net.ssl.SSLSocket> sslSocketClass, java.lang.Class<? super javax.net.ssl.SSLSocketFactory> sslSocketFactoryClass, java.lang.Class<?> paramClass) {
        super(sslSocketClass);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paramClass, "paramClass");
        this.sslSocketFactoryClass = sslSocketFactoryClass;
        this.paramClass = paramClass;
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return this.sslSocketFactoryClass.isInstance(sslSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sslSocketFactory) throws java.lang.IllegalAccessException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        java.lang.Object fieldOrNull = okhttp3.internal.Util.readFieldOrNull(sslSocketFactory, this.paramClass, "sslParameters");
        kotlin.jvm.internal.Intrinsics.checkNotNull(fieldOrNull);
        javax.net.ssl.X509TrustManager x509TrustManager = (javax.net.ssl.X509TrustManager) okhttp3.internal.Util.readFieldOrNull(fieldOrNull, javax.net.ssl.X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (javax.net.ssl.X509TrustManager) okhttp3.internal.Util.readFieldOrNull(fieldOrNull, javax.net.ssl.X509TrustManager.class, "trustManager") : x509TrustManager;
    }

    /* JADX INFO: compiled from: StandardAndroidSocketAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/platform/android/StandardAndroidSocketAdapter$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/android/SocketAdapter;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ okhttp3.internal.platform.android.SocketAdapter buildIfSupported$default(okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion companion, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return companion.buildIfSupported(str);
        }

        public final okhttp3.internal.platform.android.SocketAdapter buildIfSupported(java.lang.String packageName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(packageName + ".OpenSSLSocketImpl");
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                java.lang.Class<?> cls2 = java.lang.Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                java.lang.Class<?> paramsClass = java.lang.Class.forName(packageName + ".SSLParametersImpl");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
                return new okhttp3.internal.platform.android.StandardAndroidSocketAdapter(cls, cls2, paramsClass);
            } catch (java.lang.Exception e) {
                okhttp3.internal.platform.Platform.INSTANCE.get().log("unable to load android socket classes", 5, e);
                return null;
            }
        }
    }
}
