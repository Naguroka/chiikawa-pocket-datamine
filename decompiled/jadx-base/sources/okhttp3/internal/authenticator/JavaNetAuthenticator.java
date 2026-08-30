package okhttp3.internal.authenticator;

/* JADX INFO: compiled from: JavaNetAuthenticator.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "defaultDns", "Lokhttp3/Dns;", "(Lokhttp3/Dns;)V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", com.json.hs.n, "Lokhttp3/Response;", "connectToInetAddress", "Ljava/net/InetAddress;", "Ljava/net/Proxy;", "url", "Lokhttp3/HttpUrl;", "dns", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JavaNetAuthenticator implements okhttp3.Authenticator {
    private final okhttp3.Dns defaultDns;

    /* JADX INFO: compiled from: JavaNetAuthenticator.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[java.net.Proxy.Type.values().length];
            try {
                iArr[java.net.Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaNetAuthenticator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public JavaNetAuthenticator(okhttp3.Dns defaultDns) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.defaultDns = defaultDns;
    }

    public /* synthetic */ JavaNetAuthenticator(okhttp3.Dns dns, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? okhttp3.Dns.SYSTEM : dns);
    }

    @Override // okhttp3.Authenticator
    public okhttp3.Request authenticate(okhttp3.Route route, okhttp3.Response response) throws java.io.IOException {
        java.net.Proxy proxy;
        okhttp3.Dns dns;
        java.net.PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        okhttp3.Address address;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        java.util.List<okhttp3.Challenge> listChallenges = response.challenges();
        okhttp3.Request request = response.request();
        okhttp3.HttpUrl httpUrlUrl = request.url();
        boolean z = response.code() == 407;
        if (route == null || (proxy = route.proxy()) == null) {
            proxy = java.net.Proxy.NO_PROXY;
        }
        for (okhttp3.Challenge challenge : listChallenges) {
            if (kotlin.text.StringsKt.equals("Basic", challenge.scheme(), true)) {
                if (route == null || (address = route.address()) == null || (dns = address.dns()) == null) {
                    dns = this.defaultDns;
                }
                if (z) {
                    java.net.SocketAddress socketAddressAddress = proxy.address();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    java.net.InetSocketAddress inetSocketAddress = (java.net.InetSocketAddress) socketAddressAddress;
                    java.lang.String hostName = inetSocketAddress.getHostName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, connectToInetAddress(proxy, httpUrlUrl, dns), inetSocketAddress.getPort(), httpUrlUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrlUrl.url(), java.net.Authenticator.RequestorType.PROXY);
                } else {
                    java.lang.String strHost = httpUrlUrl.host();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(strHost, connectToInetAddress(proxy, httpUrlUrl, dns), httpUrlUrl.port(), httpUrlUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrlUrl.url(), java.net.Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    java.lang.String str = z ? com.google.common.net.HttpHeaders.PROXY_AUTHORIZATION : com.google.common.net.HttpHeaders.AUTHORIZATION;
                    java.lang.String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return request.newBuilder().header(str, okhttp3.Credentials.basic(userName, new java.lang.String(password), challenge.charset())).build();
                }
            }
        }
        return null;
    }

    private final java.net.InetAddress connectToInetAddress(java.net.Proxy proxy, okhttp3.HttpUrl httpUrl, okhttp3.Dns dns) throws java.io.IOException {
        java.net.Proxy.Type type = proxy.type();
        if ((type == null ? -1 : okhttp3.internal.authenticator.JavaNetAuthenticator.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) == 1) {
            return (java.net.InetAddress) kotlin.collections.CollectionsKt.first((java.util.List) dns.lookup(httpUrl.host()));
        }
        java.net.SocketAddress socketAddressAddress = proxy.address();
        kotlin.jvm.internal.Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        java.net.InetAddress address = ((java.net.InetSocketAddress) socketAddressAddress).getAddress();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(address, "address() as InetSocketAddress).address");
        return address;
    }
}
