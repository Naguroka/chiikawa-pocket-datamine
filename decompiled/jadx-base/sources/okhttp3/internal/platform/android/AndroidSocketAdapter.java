package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: AndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "sslSocketClass", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "(Ljava/lang/Class;)V", "getAlpnSelectedProtocol", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "setAlpnProtocols", "setHostname", "setUseSessionTickets", "configureTlsExtensions", "", "sslSocket", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "getSelectedProtocol", "isSupported", "", "matchesSocket", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AndroidSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.android.AndroidSocketAdapter.Companion INSTANCE;
    private static final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory playProviderFactory;
    private final java.lang.reflect.Method getAlpnSelectedProtocol;
    private final java.lang.reflect.Method setAlpnProtocols;
    private final java.lang.reflect.Method setHostname;
    private final java.lang.reflect.Method setUseSessionTickets;
    private final java.lang.Class<? super javax.net.ssl.SSLSocket> sslSocketClass;

    public AndroidSocketAdapter(java.lang.Class<? super javax.net.ssl.SSLSocket> sslSocketClass) throws java.lang.NoSuchMethodException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.sslSocketClass = sslSocketClass;
        java.lang.reflect.Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", java.lang.Boolean.TYPE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = sslSocketClass.getMethod("setHostname", java.lang.String.class);
        this.getAlpnSelectedProtocol = sslSocketClass.getMethod("getAlpnSelectedProtocol", new java.lang.Class[0]);
        this.setAlpnProtocols = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        return okhttp3.internal.platform.android.SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        return okhttp3.internal.platform.android.SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return okhttp3.internal.platform.AndroidPlatform.INSTANCE.isSupported();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.sslSocketClass.isInstance(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<? extends okhttp3.Protocol> protocols) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            try {
                this.setUseSessionTickets.invoke(sslSocket, true);
                if (hostname != null) {
                    this.setHostname.invoke(sslSocket, hostname);
                }
                this.setAlpnProtocols.invoke(sslSocket, okhttp3.internal.platform.Platform.INSTANCE.concatLengthPrefixed(protocols));
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            } catch (java.lang.reflect.InvocationTargetException e2) {
                throw new java.lang.AssertionError(e2);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!matchesSocket(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sslSocket, new java.lang.Object[0]);
            if (bArr != null) {
                return new java.lang.String(bArr, kotlin.text.Charsets.UTF_8);
            }
            return null;
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.AssertionError(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if ((cause instanceof java.lang.NullPointerException) && kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new java.lang.AssertionError(e2);
        }
    }

    /* JADX INFO: compiled from: AndroidSocketAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u000b0\nH\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", "", "()V", "playProviderFactory", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "getPlayProviderFactory", "()Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "build", "Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "actualSSLSocketClass", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "factory", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory getPlayProviderFactory() {
            return okhttp3.internal.platform.android.AndroidSocketAdapter.playProviderFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final okhttp3.internal.platform.android.AndroidSocketAdapter build(java.lang.Class<? super javax.net.ssl.SSLSocket> actualSSLSocketClass) {
            java.lang.Class<? super javax.net.ssl.SSLSocket> superclass = actualSSLSocketClass;
            while (superclass != null && !kotlin.jvm.internal.Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new java.lang.AssertionError("No OpenSSLSocketImpl superclass of socket of type " + actualSSLSocketClass);
                }
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(superclass);
            return new okhttp3.internal.platform.android.AndroidSocketAdapter(superclass);
        }

        public final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory factory(final java.lang.String packageName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new okhttp3.internal.platform.android.DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public boolean matchesSocket(javax.net.ssl.SSLSocket sslSocket) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                    java.lang.String name = sslSocket.getClass().getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                    return kotlin.text.StringsKt.startsWith$default(name, packageName + '.', false, 2, (java.lang.Object) null);
                }

                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public okhttp3.internal.platform.android.SocketAdapter create(javax.net.ssl.SSLSocket sslSocket) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                    return okhttp3.internal.platform.android.AndroidSocketAdapter.INSTANCE.build(sslSocket.getClass());
                }
            };
        }
    }

    static {
        okhttp3.internal.platform.android.AndroidSocketAdapter.Companion companion = new okhttp3.internal.platform.android.AndroidSocketAdapter.Companion(null);
        INSTANCE = companion;
        playProviderFactory = companion.factory("com.google.android.gms.org.conscrypt");
    }
}
