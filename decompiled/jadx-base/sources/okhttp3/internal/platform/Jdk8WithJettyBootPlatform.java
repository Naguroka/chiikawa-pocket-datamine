package okhttp3.internal.platform;

/* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "putMethod", "Ljava/lang/reflect/Method;", "getMethod", "removeMethod", "clientProviderClass", "Ljava/lang/Class;", "serverProviderClass", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "afterHandshake", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "configureTlsExtensions", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "getSelectedProtocol", "AlpnProvider", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Jdk8WithJettyBootPlatform extends okhttp3.internal.platform.Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.Jdk8WithJettyBootPlatform.Companion INSTANCE = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform.Companion(null);
    private final java.lang.Class<?> clientProviderClass;
    private final java.lang.reflect.Method getMethod;
    private final java.lang.reflect.Method putMethod;
    private final java.lang.reflect.Method removeMethod;
    private final java.lang.Class<?> serverProviderClass;

    public Jdk8WithJettyBootPlatform(java.lang.reflect.Method putMethod, java.lang.reflect.Method getMethod, java.lang.reflect.Method removeMethod, java.lang.Class<?> clientProviderClass, java.lang.Class<?> serverProviderClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.putMethod = putMethod;
        this.getMethod = getMethod;
        this.removeMethod = removeMethod;
        this.clientProviderClass = clientProviderClass;
        this.serverProviderClass = serverProviderClass;
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<? extends okhttp3.Protocol> protocols) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            this.putMethod.invoke(null, sslSocket, java.lang.reflect.Proxy.newProxyInstance(okhttp3.internal.platform.Platform.class.getClassLoader(), new java.lang.Class[]{this.clientProviderClass, this.serverProviderClass}, new okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider(okhttp3.internal.platform.Platform.INSTANCE.alpnProtocolNames(protocols))));
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.AssertionError("failed to set ALPN", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.removeMethod.invoke(null, sslSocket);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.AssertionError("failed to remove ALPN", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(this.getMethod.invoke(null, sslSocket));
            kotlin.jvm.internal.Intrinsics.checkNotNull(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider alpnProvider = (okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider) invocationHandler;
            if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
                okhttp3.internal.platform.Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (alpnProvider.getUnsupported()) {
                return null;
            }
            return alpnProvider.getSelected();
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.AssertionError("failed to get ALPN selected protocol", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    /* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J0\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider;", "Ljava/lang/reflect/InvocationHandler;", "protocols", "", "", "(Ljava/util/List;)V", "selected", "getSelected", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", "unsupported", "", "getUnsupported", "()Z", "setUnsupported", "(Z)V", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class AlpnProvider implements java.lang.reflect.InvocationHandler {
        private final java.util.List<java.lang.String> protocols;
        private java.lang.String selected;
        private boolean unsupported;

        public AlpnProvider(java.util.List<java.lang.String> protocols) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
            this.protocols = protocols;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        public final void setUnsupported(boolean z) {
            this.unsupported = z;
        }

        public final java.lang.String getSelected() {
            return this.selected;
        }

        public final void setSelected(java.lang.String str) {
            this.selected = str;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args) throws java.lang.Throwable {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "proxy");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
            if (args == null) {
                args = new java.lang.Object[0];
            }
            java.lang.String name = method.getName();
            java.lang.Class<?> returnType = method.getReturnType();
            if (kotlin.jvm.internal.Intrinsics.areEqual(name, "supports") && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Boolean.TYPE, returnType)) {
                return true;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(name, "unsupported") && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Void.TYPE, returnType)) {
                this.unsupported = true;
                return null;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(name, "protocols")) {
                if (args.length == 0) {
                    return this.protocols;
                }
            }
            if ((kotlin.jvm.internal.Intrinsics.areEqual(name, "selectProtocol") || kotlin.jvm.internal.Intrinsics.areEqual(name, "select")) && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, returnType) && args.length == 1) {
                java.lang.Object obj = args[0];
                if (obj instanceof java.util.List) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    java.util.List list = (java.util.List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            java.lang.Object obj2 = list.get(i);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str = (java.lang.String) obj2;
                            if (this.protocols.contains(str)) {
                                this.selected = str;
                                return str;
                            }
                            if (i != size) {
                                i++;
                            }
                        }
                    }
                    java.lang.String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                }
            }
            if ((kotlin.jvm.internal.Intrinsics.areEqual(name, "protocolSelected") || kotlin.jvm.internal.Intrinsics.areEqual(name, "selected")) && args.length == 1) {
                java.lang.Object obj3 = args[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                this.selected = (java.lang.String) obj3;
                return null;
            }
            return method.invoke(this, java.util.Arrays.copyOf(args, args.length));
        }
    }

    /* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final okhttp3.internal.platform.Platform buildIfSupported() {
            java.lang.String jvmVersion = java.lang.System.getProperty("java.specification.version", "unknown");
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                if (java.lang.Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (java.lang.NumberFormatException unused) {
            }
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                java.lang.Class<?> cls2 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                java.lang.Class<?> clientProviderClass = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                java.lang.Class<?> serverProviderClass = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                java.lang.reflect.Method putMethod = cls.getMethod("put", javax.net.ssl.SSLSocket.class, cls2);
                java.lang.reflect.Method getMethod = cls.getMethod("get", javax.net.ssl.SSLSocket.class);
                java.lang.reflect.Method removeMethod = cls.getMethod("remove", javax.net.ssl.SSLSocket.class);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                return new okhttp3.internal.platform.Jdk8WithJettyBootPlatform(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused2) {
                return null;
            }
        }
    }
}
