package okhttp3;

/* JADX INFO: compiled from: EventListener.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J*\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J2\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J+\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!2\u0011\u0010\"\u001a\r\u0012\t\u0012\u00070$¢\u0006\u0002\b%0#H\u0016J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0016J+\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)2\u0011\u0010*\u001a\r\u0012\t\u0012\u00070\u0016¢\u0006\u0002\b%0#H\u0016J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u00100\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u00101\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u00106\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u00107\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0016J\u0010\u00109\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0016J\u001a\u0010;\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006A"}, d2 = {"Lokhttp3/EventListener;", "", "()V", "cacheConditionalHit", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "cachedResponse", "Lokhttp3/Response;", "cacheHit", com.json.hs.n, "cacheMiss", "callEnd", "callFailed", "ioe", "Ljava/io/IOException;", "callStart", "canceled", "connectEnd", "inetSocketAddress", "Ljava/net/InetSocketAddress;", "proxy", "Ljava/net/Proxy;", "protocol", "Lokhttp3/Protocol;", "connectFailed", "connectStart", "connectionAcquired", "connection", "Lokhttp3/Connection;", "connectionReleased", "dnsEnd", "domainName", "", "inetAddressList", "", "Ljava/net/InetAddress;", "Lkotlin/jvm/JvmSuppressWildcards;", "dnsStart", "proxySelectEnd", "url", "Lokhttp3/HttpUrl;", "proxies", "proxySelectStart", "requestBodyEnd", "byteCount", "", "requestBodyStart", "requestFailed", "requestHeadersEnd", "request", "Lokhttp3/Request;", "requestHeadersStart", "responseBodyEnd", "responseBodyStart", "responseFailed", "responseHeadersEnd", "responseHeadersStart", "satisfactionFailure", "secureConnectEnd", "handshake", "Lokhttp3/Handshake;", "secureConnectStart", "Companion", "Factory", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class EventListener {
    public static final okhttp3.EventListener NONE = new okhttp3.EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    /* JADX INFO: compiled from: EventListener.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lokhttp3/EventListener$Factory;", "", "create", "Lokhttp3/EventListener;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        okhttp3.EventListener create(okhttp3.Call call);
    }

    public void cacheConditionalHit(okhttp3.Call call, okhttp3.Response cachedResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void cacheHit(okhttp3.Call call, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
    }

    public void cacheMiss(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callEnd(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callFailed(okhttp3.Call call, java.io.IOException ioe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void callStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
    }

    public void canceled(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
    }

    public void connectEnd(okhttp3.Call call, java.net.InetSocketAddress inetSocketAddress, java.net.Proxy proxy, okhttp3.Protocol protocol) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectFailed(okhttp3.Call call, java.net.InetSocketAddress inetSocketAddress, java.net.Proxy proxy, okhttp3.Protocol protocol, java.io.IOException ioe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "proxy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void connectStart(okhttp3.Call call, java.net.InetSocketAddress inetSocketAddress, java.net.Proxy proxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectionAcquired(okhttp3.Call call, okhttp3.Connection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void connectionReleased(okhttp3.Call call, okhttp3.Connection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void dnsEnd(okhttp3.Call call, java.lang.String domainName, java.util.List<java.net.InetAddress> inetAddressList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainName, "domainName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void dnsStart(okhttp3.Call call, java.lang.String domainName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    public void proxySelectEnd(okhttp3.Call call, okhttp3.HttpUrl url, java.util.List<java.net.Proxy> proxies) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public void proxySelectStart(okhttp3.Call call, okhttp3.HttpUrl url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
    }

    public void requestBodyEnd(okhttp3.Call call, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestBodyStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestFailed(okhttp3.Call call, java.io.IOException ioe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void requestHeadersEnd(okhttp3.Call call, okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
    }

    public void requestHeadersStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyEnd(okhttp3.Call call, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseFailed(okhttp3.Call call, java.io.IOException ioe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void responseHeadersEnd(okhttp3.Call call, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
    }

    public void responseHeadersStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
    }

    public void satisfactionFailure(okhttp3.Call call, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
    }

    public void secureConnectEnd(okhttp3.Call call, okhttp3.Handshake handshake) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
    }

    public void secureConnectStart(okhttp3.Call call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
    }
}
