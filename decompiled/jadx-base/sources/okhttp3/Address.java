package okhttp3;

/* JADX INFO: compiled from: Address.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b(J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0007¢\u0006\u0002\b)J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0015\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020\u0000H\u0000¢\u0006\u0002\b0J\b\u00101\u001a\u00020\u0005H\u0016J\u000f\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\b2J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0002\b3J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\b4J\r\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\b5J\r\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\b6J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b7J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0003H\u0016J\r\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\b:R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001cR\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00158G¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001dR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158G¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010 R\u0013\u0010\u0010\u001a\u00020\u00118\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010!R\u0013\u0010\u0019\u001a\u00020\u001a8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\"R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010#R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010$R\u0013\u0010%\u001a\u00020&8G¢\u0006\b\n\u0000\u001a\u0004\b%\u0010'¨\u0006;"}, d2 = {"Lokhttp3/Address;", "", "uriHost", "", "uriPort", "", "dns", "Lokhttp3/Dns;", "socketFactory", "Ljavax/net/SocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "certificatePinner", "Lokhttp3/CertificatePinner;", "proxyAuthenticator", "Lokhttp3/Authenticator;", "proxy", "Ljava/net/Proxy;", "protocols", "", "Lokhttp3/Protocol;", "connectionSpecs", "Lokhttp3/ConnectionSpec;", "proxySelector", "Ljava/net/ProxySelector;", "(Ljava/lang/String;ILokhttp3/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/Authenticator;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "()Lokhttp3/CertificatePinner;", "()Ljava/util/List;", "()Lokhttp3/Dns;", "()Ljavax/net/ssl/HostnameVerifier;", "()Ljava/net/Proxy;", "()Lokhttp3/Authenticator;", "()Ljava/net/ProxySelector;", "()Ljavax/net/SocketFactory;", "()Ljavax/net/ssl/SSLSocketFactory;", "url", "Lokhttp3/HttpUrl;", "()Lokhttp3/HttpUrl;", "-deprecated_certificatePinner", "-deprecated_connectionSpecs", "-deprecated_dns", "equals", "", "other", "equalsNonHost", "that", "equalsNonHost$okhttp", "hashCode", "-deprecated_hostnameVerifier", "-deprecated_protocols", "-deprecated_proxy", "-deprecated_proxyAuthenticator", "-deprecated_proxySelector", "-deprecated_socketFactory", "-deprecated_sslSocketFactory", "toString", "-deprecated_url", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Address {
    private final okhttp3.CertificatePinner certificatePinner;
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    private final okhttp3.Dns dns;
    private final javax.net.ssl.HostnameVerifier hostnameVerifier;
    private final java.util.List<okhttp3.Protocol> protocols;
    private final java.net.Proxy proxy;
    private final okhttp3.Authenticator proxyAuthenticator;
    private final java.net.ProxySelector proxySelector;
    private final javax.net.SocketFactory socketFactory;
    private final javax.net.ssl.SSLSocketFactory sslSocketFactory;
    private final okhttp3.HttpUrl url;

    public Address(java.lang.String uriHost, int i, okhttp3.Dns dns, javax.net.SocketFactory socketFactory, javax.net.ssl.SSLSocketFactory sSLSocketFactory, javax.net.ssl.HostnameVerifier hostnameVerifier, okhttp3.CertificatePinner certificatePinner, okhttp3.Authenticator proxyAuthenticator, java.net.Proxy proxy, java.util.List<? extends okhttp3.Protocol> protocols, java.util.List<okhttp3.ConnectionSpec> connectionSpecs, java.net.ProxySelector proxySelector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dns, "dns");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = proxyAuthenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new okhttp3.HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : androidx.webkit.ProxyConfig.MATCH_HTTP).host(uriHost).port(i).build();
        this.protocols = okhttp3.internal.Util.toImmutableList(protocols);
        this.connectionSpecs = okhttp3.internal.Util.toImmutableList(connectionSpecs);
    }

    public final okhttp3.Dns dns() {
        return this.dns;
    }

    public final javax.net.SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final javax.net.ssl.SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public final javax.net.ssl.HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final okhttp3.CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final okhttp3.Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final java.net.Proxy proxy() {
        return this.proxy;
    }

    public final java.net.ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final okhttp3.HttpUrl url() {
        return this.url;
    }

    public final java.util.List<okhttp3.Protocol> protocols() {
        return this.protocols;
    }

    public final java.util.List<okhttp3.ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "url", imports = {}))
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final okhttp3.HttpUrl getUrl() {
        return this.url;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "dns", imports = {}))
    /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name and from getter */
    public final okhttp3.Dns getDns() {
        return this.dns;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "socketFactory", imports = {}))
    /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
    public final javax.net.SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
    public final okhttp3.Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "protocols", imports = {}))
    /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
    public final java.util.List<okhttp3.Protocol> m2878deprecated_protocols() {
        return this.protocols;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "connectionSpecs", imports = {}))
    /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final java.util.List<okhttp3.ConnectionSpec> m2875deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxySelector", imports = {}))
    /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
    public final java.net.ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxy", imports = {}))
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final java.net.Proxy getProxy() {
        return this.proxy;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sslSocketFactory", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name and from getter */
    public final javax.net.ssl.SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hostnameVerifier", imports = {}))
    /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
    public final javax.net.ssl.HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "certificatePinner", imports = {}))
    /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
    public final okhttp3.CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof okhttp3.Address) {
            okhttp3.Address address = (okhttp3.Address) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.url, address.url) && equalsNonHost$okhttp(address)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + java.util.Objects.hashCode(this.proxy)) * 31) + java.util.Objects.hashCode(this.sslSocketFactory)) * 31) + java.util.Objects.hashCode(this.hostnameVerifier)) * 31) + java.util.Objects.hashCode(this.certificatePinner);
    }

    public final boolean equalsNonHost$okhttp(okhttp3.Address that) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(that, "that");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dns, that.dns) && kotlin.jvm.internal.Intrinsics.areEqual(this.proxyAuthenticator, that.proxyAuthenticator) && kotlin.jvm.internal.Intrinsics.areEqual(this.protocols, that.protocols) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectionSpecs, that.connectionSpecs) && kotlin.jvm.internal.Intrinsics.areEqual(this.proxySelector, that.proxySelector) && kotlin.jvm.internal.Intrinsics.areEqual(this.proxy, that.proxy) && kotlin.jvm.internal.Intrinsics.areEqual(this.sslSocketFactory, that.sslSocketFactory) && kotlin.jvm.internal.Intrinsics.areEqual(this.hostnameVerifier, that.hostnameVerifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.certificatePinner, that.certificatePinner) && this.url.port() == that.url.port();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.Object obj;
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("Address{").append(this.url.host()).append(':').append(this.url.port()).append(", ");
        if (this.proxy != null) {
            sb = new java.lang.StringBuilder("proxy=");
            obj = this.proxy;
        } else {
            sb = new java.lang.StringBuilder("proxySelector=");
            obj = this.proxySelector;
        }
        return sbAppend.append(sb.append(obj).toString()).append('}').toString();
    }
}
