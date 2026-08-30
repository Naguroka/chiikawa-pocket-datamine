package okhttp3.internal.connection;

/* JADX INFO: compiled from: RouteSelector.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0002!\"B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0016H\u0086\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0086\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\u001a\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", org.jacoco.core.runtime.AgentOptions.ADDRESS, "Lokhttp3/Address;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "eventListener", "Lokhttp3/EventListener;", "(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/Call;Lokhttp3/EventListener;)V", "inetSocketAddresses", "", "Ljava/net/InetSocketAddress;", "nextProxyIndex", "", "postponedRoutes", "", "Lokhttp3/Route;", "proxies", "Ljava/net/Proxy;", "hasNext", "", "hasNextProxy", "next", "Lokhttp3/internal/connection/RouteSelector$Selection;", "nextProxy", "resetNextInetSocketAddress", "", "proxy", "resetNextProxy", "url", "Lokhttp3/HttpUrl;", "Companion", "Selection", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RouteSelector {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.connection.RouteSelector.Companion INSTANCE = new okhttp3.internal.connection.RouteSelector.Companion(null);
    private final okhttp3.Address address;
    private final okhttp3.Call call;
    private final okhttp3.EventListener eventListener;
    private java.util.List<? extends java.net.InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final java.util.List<okhttp3.Route> postponedRoutes;
    private java.util.List<? extends java.net.Proxy> proxies;
    private final okhttp3.internal.connection.RouteDatabase routeDatabase;

    public RouteSelector(okhttp3.Address address, okhttp3.internal.connection.RouteDatabase routeDatabase, okhttp3.Call call, okhttp3.EventListener eventListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        this.proxies = kotlin.collections.CollectionsKt.emptyList();
        this.inetSocketAddresses = kotlin.collections.CollectionsKt.emptyList();
        this.postponedRoutes = new java.util.ArrayList();
        resetNextProxy(address.url(), address.proxy());
    }

    public final boolean hasNext() {
        return hasNextProxy() || (this.postponedRoutes.isEmpty() ^ true);
    }

    public final okhttp3.internal.connection.RouteSelector.Selection next() throws java.io.IOException {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (hasNextProxy()) {
            java.net.Proxy proxyNextProxy = nextProxy();
            java.util.Iterator<? extends java.net.InetSocketAddress> it = this.inetSocketAddresses.iterator();
            while (it.hasNext()) {
                okhttp3.Route route = new okhttp3.Route(this.address, proxyNextProxy, it.next());
                if (this.routeDatabase.shouldPostpone(route)) {
                    this.postponedRoutes.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new okhttp3.internal.connection.RouteSelector.Selection(arrayList);
    }

    private static final java.util.List<java.net.Proxy> resetNextProxy$selectProxies(java.net.Proxy proxy, okhttp3.HttpUrl httpUrl, okhttp3.internal.connection.RouteSelector routeSelector) {
        if (proxy != null) {
            return kotlin.collections.CollectionsKt.listOf(proxy);
        }
        java.net.URI uri = httpUrl.uri();
        if (uri.getHost() == null) {
            return okhttp3.internal.Util.immutableListOf(java.net.Proxy.NO_PROXY);
        }
        java.util.List<java.net.Proxy> proxiesOrNull = routeSelector.address.proxySelector().select(uri);
        java.util.List<java.net.Proxy> list = proxiesOrNull;
        if (list == null || list.isEmpty()) {
            return okhttp3.internal.Util.immutableListOf(java.net.Proxy.NO_PROXY);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
        return okhttp3.internal.Util.toImmutableList(proxiesOrNull);
    }

    private final void resetNextProxy(okhttp3.HttpUrl url, java.net.Proxy proxy) {
        this.eventListener.proxySelectStart(this.call, url);
        java.util.List<java.net.Proxy> listResetNextProxy$selectProxies = resetNextProxy$selectProxies(proxy, url, this);
        this.proxies = listResetNextProxy$selectProxies;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, url, listResetNextProxy$selectProxies);
    }

    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final java.net.Proxy nextProxy() throws java.io.IOException {
        if (!hasNextProxy()) {
            throw new java.net.SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
        }
        java.util.List<? extends java.net.Proxy> list = this.proxies;
        int i = this.nextProxyIndex;
        this.nextProxyIndex = i + 1;
        java.net.Proxy proxy = list.get(i);
        resetNextInetSocketAddress(proxy);
        return proxy;
    }

    private final void resetNextInetSocketAddress(java.net.Proxy proxy) throws java.io.IOException {
        java.lang.String strHost;
        int iPort;
        java.util.List<java.net.InetAddress> listLookup;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == java.net.Proxy.Type.DIRECT || proxy.type() == java.net.Proxy.Type.SOCKS) {
            strHost = this.address.url().host();
            iPort = this.address.url().port();
        } else {
            java.net.SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof java.net.InetSocketAddress)) {
                throw new java.lang.IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            okhttp3.internal.connection.RouteSelector.Companion companion = INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
            java.net.InetSocketAddress inetSocketAddress = (java.net.InetSocketAddress) proxyAddress;
            strHost = companion.getSocketHost(inetSocketAddress);
            iPort = inetSocketAddress.getPort();
        }
        boolean z = false;
        if (1 <= iPort && iPort < 65536) {
            z = true;
        }
        if (!z) {
            throw new java.net.SocketException("No route to " + strHost + ':' + iPort + "; port is out of range");
        }
        if (proxy.type() == java.net.Proxy.Type.SOCKS) {
            arrayList.add(java.net.InetSocketAddress.createUnresolved(strHost, iPort));
            return;
        }
        if (okhttp3.internal.Util.canParseAsIpAddress(strHost)) {
            listLookup = kotlin.collections.CollectionsKt.listOf(java.net.InetAddress.getByName(strHost));
        } else {
            this.eventListener.dnsStart(this.call, strHost);
            listLookup = this.address.dns().lookup(strHost);
            if (listLookup.isEmpty()) {
                throw new java.net.UnknownHostException(this.address.dns() + " returned no addresses for " + strHost);
            }
            this.eventListener.dnsEnd(this.call, strHost, listLookup);
        }
        java.util.Iterator<java.net.InetAddress> it = listLookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new java.net.InetSocketAddress(it.next(), iPort));
        }
    }

    /* JADX INFO: compiled from: RouteSelector.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u000bH\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "routes", "", "Lokhttp3/Route;", "(Ljava/util/List;)V", "nextRouteIndex", "", "getRoutes", "()Ljava/util/List;", "hasNext", "", "next", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Selection {
        private int nextRouteIndex;
        private final java.util.List<okhttp3.Route> routes;

        public Selection(java.util.List<okhttp3.Route> routes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routes, "routes");
            this.routes = routes;
        }

        public final java.util.List<okhttp3.Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        public final okhttp3.Route next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            java.util.List<okhttp3.Route> list = this.routes;
            int i = this.nextRouteIndex;
            this.nextRouteIndex = i + 1;
            return list.get(i);
        }
    }

    /* JADX INFO: compiled from: RouteSelector.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "()V", "socketHost", "", "Ljava/net/InetSocketAddress;", "getSocketHost", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getSocketHost(java.net.InetSocketAddress inetSocketAddress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
            java.net.InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                java.lang.String hostName = inetSocketAddress.getHostName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
                return hostName;
            }
            java.lang.String hostAddress = address.getHostAddress();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
            return hostAddress;
        }
    }
}
