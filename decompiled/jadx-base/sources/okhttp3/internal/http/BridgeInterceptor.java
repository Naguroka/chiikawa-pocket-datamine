package okhttp3.internal.http;

/* JADX INFO: compiled from: BridgeInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "cookieJar", "Lokhttp3/CookieJar;", "(Lokhttp3/CookieJar;)V", "cookieHeader", "", "cookies", "", "Lokhttp3/Cookie;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BridgeInterceptor implements okhttp3.Interceptor {
    private final okhttp3.CookieJar cookieJar;

    public BridgeInterceptor(okhttp3.CookieJar cookieJar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        okhttp3.ResponseBody responseBodyBody;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.Request request = chain.request();
        okhttp3.Request.Builder builderNewBuilder = request.newBuilder();
        okhttp3.RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            okhttp3.MediaType mediaType = requestBodyBody.getContentType();
            if (mediaType != null) {
                builderNewBuilder.header("Content-Type", mediaType.getMediaType());
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                builderNewBuilder.header(com.google.common.net.HttpHeaders.CONTENT_LENGTH, java.lang.String.valueOf(jContentLength));
                builderNewBuilder.removeHeader(com.google.common.net.HttpHeaders.TRANSFER_ENCODING);
            } else {
                builderNewBuilder.header(com.google.common.net.HttpHeaders.TRANSFER_ENCODING, "chunked");
                builderNewBuilder.removeHeader(com.google.common.net.HttpHeaders.CONTENT_LENGTH);
            }
        }
        boolean z = false;
        if (request.header(com.google.common.net.HttpHeaders.HOST) == null) {
            builderNewBuilder.header(com.google.common.net.HttpHeaders.HOST, okhttp3.internal.Util.toHostHeader$default(request.url(), false, 1, null));
        }
        if (request.header(com.google.common.net.HttpHeaders.CONNECTION) == null) {
            builderNewBuilder.header(com.google.common.net.HttpHeaders.CONNECTION, com.google.common.net.HttpHeaders.KEEP_ALIVE);
        }
        if (request.header(com.google.common.net.HttpHeaders.ACCEPT_ENCODING) == null && request.header(com.google.common.net.HttpHeaders.RANGE) == null) {
            builderNewBuilder.header(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "gzip");
            z = true;
        }
        java.util.List<okhttp3.Cookie> listLoadForRequest = this.cookieJar.loadForRequest(request.url());
        if (!listLoadForRequest.isEmpty()) {
            builderNewBuilder.header(com.google.common.net.HttpHeaders.COOKIE, cookieHeader(listLoadForRequest));
        }
        if (request.header(com.google.common.net.HttpHeaders.USER_AGENT) == null) {
            builderNewBuilder.header(com.google.common.net.HttpHeaders.USER_AGENT, okhttp3.internal.Util.userAgent);
        }
        okhttp3.Response responseProceed = chain.proceed(builderNewBuilder.build());
        okhttp3.internal.http.HttpHeaders.receiveHeaders(this.cookieJar, request.url(), responseProceed.headers());
        okhttp3.Response.Builder builderRequest = responseProceed.newBuilder().request(request);
        if (z && kotlin.text.StringsKt.equals("gzip", okhttp3.Response.header$default(responseProceed, com.google.common.net.HttpHeaders.CONTENT_ENCODING, null, 2, null), true) && okhttp3.internal.http.HttpHeaders.promisesBody(responseProceed) && (responseBodyBody = responseProceed.body()) != null) {
            okio.GzipSource gzipSource = new okio.GzipSource(responseBodyBody.getBodySource());
            builderRequest.headers(responseProceed.headers().newBuilder().removeAll(com.google.common.net.HttpHeaders.CONTENT_ENCODING).removeAll(com.google.common.net.HttpHeaders.CONTENT_LENGTH).build());
            builderRequest.body(new okhttp3.internal.http.RealResponseBody(okhttp3.Response.header$default(responseProceed, "Content-Type", null, 2, null), -1L, okio.Okio.buffer(gzipSource)));
        }
        return builderRequest.build();
    }

    private final java.lang.String cookieHeader(java.util.List<okhttp3.Cookie> cookies) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        for (java.lang.Object obj : cookies) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            okhttp3.Cookie cookie = (okhttp3.Cookie) obj;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(cookie.name()).append('=').append(cookie.value());
            i = i2;
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
