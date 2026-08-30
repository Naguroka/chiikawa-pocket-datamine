package okhttp3.internal;

/* JADX INFO: compiled from: internal.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014\u001a\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e\u001a \u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004¨\u0006\u001f"}, d2 = {"addHeaderLenient", "Lokhttp3/Headers$Builder;", "builder", "line", "", "name", "value", "applyConnectionSpec", "", "connectionSpec", "Lokhttp3/ConnectionSpec;", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "isFallback", "", "cacheGet", "Lokhttp3/Response;", "cache", "Lokhttp3/Cache;", "request", "Lokhttp3/Request;", "cookieToString", "cookie", "Lokhttp3/Cookie;", "forObsoleteRfc2965", "parseCookie", "currentTimeMillis", "", "url", "Lokhttp3/HttpUrl;", "setCookie", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Internal {
    public static final okhttp3.Cookie parseCookie(long j, okhttp3.HttpUrl url, java.lang.String setCookie) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setCookie, "setCookie");
        return okhttp3.Cookie.INSTANCE.parse$okhttp(j, url, setCookie);
    }

    public static final java.lang.String cookieToString(okhttp3.Cookie cookie, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "cookie");
        return cookie.toString$okhttp(z);
    }

    public static final okhttp3.Headers.Builder addHeaderLenient(okhttp3.Headers.Builder builder, java.lang.String line) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line, "line");
        return builder.addLenient$okhttp(line);
    }

    public static final okhttp3.Headers.Builder addHeaderLenient(okhttp3.Headers.Builder builder, java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        return builder.addLenient$okhttp(name, value);
    }

    public static final okhttp3.Response cacheGet(okhttp3.Cache cache, okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cache, "cache");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        return cache.get$okhttp(request);
    }

    public static final void applyConnectionSpec(okhttp3.ConnectionSpec connectionSpec, javax.net.ssl.SSLSocket sslSocket, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        connectionSpec.apply$okhttp(sslSocket, z);
    }
}
