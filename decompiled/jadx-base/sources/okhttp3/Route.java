package okhttp3;

/* JADX INFO: compiled from: Route.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u000eJ\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0017"}, d2 = {"Lokhttp3/Route;", "", org.jacoco.core.runtime.AgentOptions.ADDRESS, "Lokhttp3/Address;", "proxy", "Ljava/net/Proxy;", "socketAddress", "Ljava/net/InetSocketAddress;", "(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "()Lokhttp3/Address;", "()Ljava/net/Proxy;", "()Ljava/net/InetSocketAddress;", "-deprecated_address", "equals", "", "other", "hashCode", "", "-deprecated_proxy", "requiresTunnel", "-deprecated_socketAddress", "toString", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Route {
    private final okhttp3.Address address;
    private final java.net.Proxy proxy;
    private final java.net.InetSocketAddress socketAddress;

    public Route(okhttp3.Address address, java.net.Proxy proxy, java.net.InetSocketAddress socketAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "proxy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = socketAddress;
    }

    public final okhttp3.Address address() {
        return this.address;
    }

    public final java.net.Proxy proxy() {
        return this.proxy;
    }

    public final java.net.InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = org.jacoco.core.runtime.AgentOptions.ADDRESS, imports = {}))
    /* JADX INFO: renamed from: -deprecated_address, reason: not valid java name and from getter */
    public final okhttp3.Address getAddress() {
        return this.address;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxy", imports = {}))
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final java.net.Proxy getProxy() {
        return this.proxy;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "socketAddress", imports = {}))
    /* JADX INFO: renamed from: -deprecated_socketAddress, reason: not valid java name and from getter */
    public final java.net.InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == java.net.Proxy.Type.HTTP;
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof okhttp3.Route) {
            okhttp3.Route route = (okhttp3.Route) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(route.address, this.address) && kotlin.jvm.internal.Intrinsics.areEqual(route.proxy, this.proxy) && kotlin.jvm.internal.Intrinsics.areEqual(route.socketAddress, this.socketAddress)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    public java.lang.String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
