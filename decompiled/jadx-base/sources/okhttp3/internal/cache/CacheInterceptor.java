package okhttp3.internal.cache;

/* JADX INFO: compiled from: CacheInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "cache", "Lokhttp3/Cache;", "(Lokhttp3/Cache;)V", "getCache$okhttp", "()Lokhttp3/Cache;", "cacheWritingResponse", "Lokhttp3/Response;", "cacheRequest", "Lokhttp3/internal/cache/CacheRequest;", com.json.hs.n, "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CacheInterceptor implements okhttp3.Interceptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.cache.CacheInterceptor.Companion INSTANCE = new okhttp3.internal.cache.CacheInterceptor.Companion(null);
    private final okhttp3.Cache cache;

    public CacheInterceptor(okhttp3.Cache cache) {
        this.cache = cache;
    }

    /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
    public final okhttp3.Cache getCache() {
        return this.cache;
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        okhttp3.EventListener eventListener;
        okhttp3.ResponseBody responseBodyBody;
        okhttp3.ResponseBody responseBodyBody2;
        okhttp3.ResponseBody responseBodyBody3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.Call call = chain.call();
        okhttp3.Cache cache = this.cache;
        okhttp3.Response response = cache != null ? cache.get$okhttp(chain.request()) : null;
        okhttp3.internal.cache.CacheStrategy cacheStrategyCompute = new okhttp3.internal.cache.CacheStrategy.Factory(java.lang.System.currentTimeMillis(), chain.request(), response).compute();
        okhttp3.Request networkRequest = cacheStrategyCompute.getNetworkRequest();
        okhttp3.Response cacheResponse = cacheStrategyCompute.getCacheResponse();
        okhttp3.Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(cacheStrategyCompute);
        }
        okhttp3.internal.connection.RealCall realCall = call instanceof okhttp3.internal.connection.RealCall ? (okhttp3.internal.connection.RealCall) call : null;
        if (realCall == null || (eventListener = realCall.getEventListener()) == null) {
            eventListener = okhttp3.EventListener.NONE;
        }
        if (response != null && cacheResponse == null && (responseBodyBody3 = response.body()) != null) {
            okhttp3.internal.Util.closeQuietly(responseBodyBody3);
        }
        if (networkRequest == null && cacheResponse == null) {
            okhttp3.Response responseBuild = new okhttp3.Response.Builder().request(chain.request()).protocol(okhttp3.Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(okhttp3.internal.Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(java.lang.System.currentTimeMillis()).build();
            eventListener.satisfactionFailure(call, responseBuild);
            return responseBuild;
        }
        if (networkRequest == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cacheResponse);
            okhttp3.Response responseBuild2 = cacheResponse.newBuilder().cacheResponse(INSTANCE.stripBody(cacheResponse)).build();
            eventListener.cacheHit(call, responseBuild2);
            return responseBuild2;
        }
        if (cacheResponse != null) {
            eventListener.cacheConditionalHit(call, cacheResponse);
        } else if (this.cache != null) {
            eventListener.cacheMiss(call);
        }
        try {
            okhttp3.Response responseProceed = chain.proceed(networkRequest);
            if (responseProceed == null && response != null && (responseBodyBody2 = response.body()) != null) {
                okhttp3.internal.Util.closeQuietly(responseBodyBody2);
            }
            if (cacheResponse != null) {
                boolean z = false;
                if (responseProceed != null && responseProceed.code() == 304) {
                    z = true;
                }
                if (z) {
                    okhttp3.Response.Builder builderNewBuilder = cacheResponse.newBuilder();
                    okhttp3.internal.cache.CacheInterceptor.Companion companion = INSTANCE;
                    okhttp3.Response responseBuild3 = builderNewBuilder.headers(companion.combine(cacheResponse.headers(), responseProceed.headers())).sentRequestAtMillis(responseProceed.sentRequestAtMillis()).receivedResponseAtMillis(responseProceed.receivedResponseAtMillis()).cacheResponse(companion.stripBody(cacheResponse)).networkResponse(companion.stripBody(responseProceed)).build();
                    okhttp3.ResponseBody responseBodyBody4 = responseProceed.body();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(responseBodyBody4);
                    responseBodyBody4.close();
                    okhttp3.Cache cache3 = this.cache;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(cache3);
                    cache3.trackConditionalCacheHit$okhttp();
                    this.cache.update$okhttp(cacheResponse, responseBuild3);
                    eventListener.cacheHit(call, responseBuild3);
                    return responseBuild3;
                }
                okhttp3.ResponseBody responseBodyBody5 = cacheResponse.body();
                if (responseBodyBody5 != null) {
                    okhttp3.internal.Util.closeQuietly(responseBodyBody5);
                }
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(responseProceed);
            okhttp3.Response.Builder builderNewBuilder2 = responseProceed.newBuilder();
            okhttp3.internal.cache.CacheInterceptor.Companion companion2 = INSTANCE;
            okhttp3.Response responseBuild4 = builderNewBuilder2.cacheResponse(companion2.stripBody(cacheResponse)).networkResponse(companion2.stripBody(responseProceed)).build();
            if (this.cache != null) {
                if (okhttp3.internal.http.HttpHeaders.promisesBody(responseBuild4) && okhttp3.internal.cache.CacheStrategy.INSTANCE.isCacheable(responseBuild4, networkRequest)) {
                    okhttp3.Response responseCacheWritingResponse = cacheWritingResponse(this.cache.put$okhttp(responseBuild4), responseBuild4);
                    if (cacheResponse != null) {
                        eventListener.cacheMiss(call);
                    }
                    return responseCacheWritingResponse;
                }
                if (okhttp3.internal.http.HttpMethod.INSTANCE.invalidatesCache(networkRequest.method())) {
                    try {
                        this.cache.remove$okhttp(networkRequest);
                    } catch (java.io.IOException unused) {
                    }
                }
            }
            return responseBuild4;
        } catch (java.lang.Throwable th) {
            if (response != null && (responseBodyBody = response.body()) != null) {
                okhttp3.internal.Util.closeQuietly(responseBodyBody);
            }
            throw th;
        }
    }

    private final okhttp3.Response cacheWritingResponse(final okhttp3.internal.cache.CacheRequest cacheRequest, okhttp3.Response response) throws java.io.IOException {
        if (cacheRequest == null) {
            return response;
        }
        okio.Sink body = cacheRequest.getBody();
        okhttp3.ResponseBody responseBodyBody = response.body();
        kotlin.jvm.internal.Intrinsics.checkNotNull(responseBodyBody);
        final okio.BufferedSource bodySource = responseBodyBody.getBodySource();
        final okio.BufferedSink bufferedSinkBuffer = okio.Okio.buffer(body);
        okio.Source source = new okio.Source() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // okio.Source
            public long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
                try {
                    long j = bodySource.read(sink, byteCount);
                    if (j == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            bufferedSinkBuffer.close();
                        }
                        return -1L;
                    }
                    sink.copyTo(bufferedSinkBuffer.getBuffer(), sink.size() - j, j);
                    bufferedSinkBuffer.emitCompleteSegments();
                    return j;
                } catch (java.io.IOException e) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e;
                }
            }

            @Override // okio.Source
            /* JADX INFO: renamed from: timeout */
            public okio.Timeout getTimeout() {
                return bodySource.getTimeout();
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                if (!this.cacheRequestClosed && !okhttp3.internal.Util.discard(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                bodySource.close();
            }
        };
        return response.newBuilder().body(new okhttp3.internal.http.RealResponseBody(okhttp3.Response.header$default(response, "Content-Type", null, 2, null), response.body().getContentLength(), okio.Okio.buffer(source))).build();
    }

    /* JADX INFO: compiled from: CacheInterceptor.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "()V", "combine", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "isContentSpecificHeader", "", "fieldName", "", "isEndToEnd", "stripBody", "Lokhttp3/Response;", com.json.hs.n, com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final okhttp3.Response stripBody(okhttp3.Response response) {
            return (response != null ? response.body() : null) != null ? response.newBuilder().body(null).build() : response;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final okhttp3.Headers combine(okhttp3.Headers cachedHeaders, okhttp3.Headers networkHeaders) {
            okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
            int size = cachedHeaders.size();
            for (int i = 0; i < size; i++) {
                java.lang.String strName = cachedHeaders.name(i);
                java.lang.String strValue = cachedHeaders.value(i);
                if ((!kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.WARNING, strName, true) || !kotlin.text.StringsKt.startsWith$default(strValue, "1", false, 2, (java.lang.Object) null)) && (isContentSpecificHeader(strName) || !isEndToEnd(strName) || networkHeaders.get(strName) == null)) {
                    builder.addLenient$okhttp(strName, strValue);
                }
            }
            int size2 = networkHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                java.lang.String strName2 = networkHeaders.name(i2);
                if (!isContentSpecificHeader(strName2) && isEndToEnd(strName2)) {
                    builder.addLenient$okhttp(strName2, networkHeaders.value(i2));
                }
            }
            return builder.build();
        }

        private final boolean isEndToEnd(java.lang.String fieldName) {
            return (kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.CONNECTION, fieldName, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.KEEP_ALIVE, fieldName, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.PROXY_AUTHENTICATE, fieldName, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.PROXY_AUTHORIZATION, fieldName, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.TE, fieldName, true) || kotlin.text.StringsKt.equals("Trailers", fieldName, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.TRANSFER_ENCODING, fieldName, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.UPGRADE, fieldName, true)) ? false : true;
        }

        private final boolean isContentSpecificHeader(java.lang.String fieldName) {
            return kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.CONTENT_LENGTH, fieldName, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.CONTENT_ENCODING, fieldName, true) || kotlin.text.StringsKt.equals("Content-Type", fieldName, true);
        }
    }
}
