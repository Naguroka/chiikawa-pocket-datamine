package okhttp3.internal.cache;

/* JADX INFO: compiled from: CacheStrategy.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "networkRequest", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "(Lokhttp3/Request;Lokhttp3/Response;)V", "getCacheResponse", "()Lokhttp3/Response;", "getNetworkRequest", "()Lokhttp3/Request;", "Companion", "Factory", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CacheStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.cache.CacheStrategy.Companion INSTANCE = new okhttp3.internal.cache.CacheStrategy.Companion(null);
    private final okhttp3.Response cacheResponse;
    private final okhttp3.Request networkRequest;

    public CacheStrategy(okhttp3.Request request, okhttp3.Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    public final okhttp3.Request getNetworkRequest() {
        return this.networkRequest;
    }

    public final okhttp3.Response getCacheResponse() {
        return this.cacheResponse;
    }

    /* JADX INFO: compiled from: CacheStrategy.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0003H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "nowMillis", "", "request", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "(JLokhttp3/Request;Lokhttp3/Response;)V", "ageSeconds", "", "etag", "", "expires", "Ljava/util/Date;", "lastModified", "lastModifiedString", "receivedResponseMillis", "getRequest$okhttp", "()Lokhttp3/Request;", "sentRequestMillis", "servedDate", "servedDateString", "cacheResponseAge", "compute", "Lokhttp3/internal/cache/CacheStrategy;", "computeCandidate", "computeFreshnessLifetime", "hasConditions", "", "isFreshnessLifetimeHeuristic", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Factory {
        private int ageSeconds;
        private final okhttp3.Response cacheResponse;
        private java.lang.String etag;
        private java.util.Date expires;
        private java.util.Date lastModified;
        private java.lang.String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;
        private final okhttp3.Request request;
        private long sentRequestMillis;
        private java.util.Date servedDate;
        private java.lang.String servedDateString;

        public Factory(long j, okhttp3.Request request, okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            this.nowMillis = j;
            this.request = request;
            this.cacheResponse = response;
            this.ageSeconds = -1;
            if (response != null) {
                this.sentRequestMillis = response.sentRequestAtMillis();
                this.receivedResponseMillis = response.receivedResponseAtMillis();
                okhttp3.Headers headers = response.headers();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    java.lang.String strName = headers.name(i);
                    java.lang.String strValue = headers.value(i);
                    if (kotlin.text.StringsKt.equals(strName, com.google.common.net.HttpHeaders.DATE, true)) {
                        this.servedDate = okhttp3.internal.http.DatesKt.toHttpDateOrNull(strValue);
                        this.servedDateString = strValue;
                    } else if (kotlin.text.StringsKt.equals(strName, com.google.common.net.HttpHeaders.EXPIRES, true)) {
                        this.expires = okhttp3.internal.http.DatesKt.toHttpDateOrNull(strValue);
                    } else if (kotlin.text.StringsKt.equals(strName, com.google.common.net.HttpHeaders.LAST_MODIFIED, true)) {
                        this.lastModified = okhttp3.internal.http.DatesKt.toHttpDateOrNull(strValue);
                        this.lastModifiedString = strValue;
                    } else if (kotlin.text.StringsKt.equals(strName, com.google.common.net.HttpHeaders.ETAG, true)) {
                        this.etag = strValue;
                    } else if (kotlin.text.StringsKt.equals(strName, com.google.common.net.HttpHeaders.AGE, true)) {
                        this.ageSeconds = okhttp3.internal.Util.toNonNegativeInt(strValue, -1);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
        public final okhttp3.Request getRequest() {
            return this.request;
        }

        private final boolean isFreshnessLifetimeHeuristic() {
            okhttp3.Response response = this.cacheResponse;
            kotlin.jvm.internal.Intrinsics.checkNotNull(response);
            return response.cacheControl().maxAgeSeconds() == -1 && this.expires == null;
        }

        public final okhttp3.internal.cache.CacheStrategy compute() {
            okhttp3.internal.cache.CacheStrategy cacheStrategyComputeCandidate = computeCandidate();
            return (cacheStrategyComputeCandidate.getNetworkRequest() == null || !this.request.cacheControl().onlyIfCached()) ? cacheStrategyComputeCandidate : new okhttp3.internal.cache.CacheStrategy(null, null);
        }

        private final okhttp3.internal.cache.CacheStrategy computeCandidate() {
            java.lang.String str;
            if (this.cacheResponse == null) {
                return new okhttp3.internal.cache.CacheStrategy(this.request, null);
            }
            if (this.request.isHttps() && this.cacheResponse.handshake() == null) {
                return new okhttp3.internal.cache.CacheStrategy(this.request, null);
            }
            if (!okhttp3.internal.cache.CacheStrategy.INSTANCE.isCacheable(this.cacheResponse, this.request)) {
                return new okhttp3.internal.cache.CacheStrategy(this.request, null);
            }
            okhttp3.CacheControl cacheControl = this.request.cacheControl();
            if (cacheControl.noCache() || hasConditions(this.request)) {
                return new okhttp3.internal.cache.CacheStrategy(this.request, null);
            }
            okhttp3.CacheControl cacheControl2 = this.cacheResponse.cacheControl();
            long jCacheResponseAge = cacheResponseAge();
            long jComputeFreshnessLifetime = computeFreshnessLifetime();
            if (cacheControl.maxAgeSeconds() != -1) {
                jComputeFreshnessLifetime = java.lang.Math.min(jComputeFreshnessLifetime, java.util.concurrent.TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = cacheControl.minFreshSeconds() != -1 ? java.util.concurrent.TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds()) : 0L;
            if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
            }
            if (!cacheControl2.noCache()) {
                long j = millis2 + jCacheResponseAge;
                if (j < millis + jComputeFreshnessLifetime) {
                    okhttp3.Response.Builder builderNewBuilder = this.cacheResponse.newBuilder();
                    if (j >= jComputeFreshnessLifetime) {
                        builderNewBuilder.addHeader(com.google.common.net.HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jCacheResponseAge > 86400000 && isFreshnessLifetimeHeuristic()) {
                        builderNewBuilder.addHeader(com.google.common.net.HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new okhttp3.internal.cache.CacheStrategy(null, builderNewBuilder.build());
                }
            }
            java.lang.String str2 = this.etag;
            if (str2 != null) {
                str = com.google.common.net.HttpHeaders.IF_NONE_MATCH;
            } else {
                if (this.lastModified != null) {
                    str2 = this.lastModifiedString;
                } else if (this.servedDate != null) {
                    str2 = this.servedDateString;
                } else {
                    return new okhttp3.internal.cache.CacheStrategy(this.request, null);
                }
                str = com.google.common.net.HttpHeaders.IF_MODIFIED_SINCE;
            }
            okhttp3.Headers.Builder builderNewBuilder2 = this.request.headers().newBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
            builderNewBuilder2.addLenient$okhttp(str, str2);
            return new okhttp3.internal.cache.CacheStrategy(this.request.newBuilder().headers(builderNewBuilder2.build()).build(), this.cacheResponse);
        }

        private final long computeFreshnessLifetime() {
            okhttp3.Response response = this.cacheResponse;
            kotlin.jvm.internal.Intrinsics.checkNotNull(response);
            okhttp3.CacheControl cacheControl = response.cacheControl();
            if (cacheControl.maxAgeSeconds() != -1) {
                return java.util.concurrent.TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds());
            }
            java.util.Date date = this.expires;
            if (date != null) {
                java.util.Date date2 = this.servedDate;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified == null || this.cacheResponse.request().url().query() != null) {
                return 0L;
            }
            java.util.Date date3 = this.servedDate;
            long time2 = date3 != null ? date3.getTime() : this.sentRequestMillis;
            java.util.Date date4 = this.lastModified;
            kotlin.jvm.internal.Intrinsics.checkNotNull(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / ((long) 10);
            }
            return 0L;
        }

        private final long cacheResponseAge() {
            java.util.Date date = this.servedDate;
            long jMax = date != null ? java.lang.Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            if (this.ageSeconds != -1) {
                jMax = java.lang.Math.max(jMax, java.util.concurrent.TimeUnit.SECONDS.toMillis(this.ageSeconds));
            }
            long j = this.receivedResponseMillis;
            return jMax + (j - this.sentRequestMillis) + (this.nowMillis - j);
        }

        private final boolean hasConditions(okhttp3.Request request) {
            return (request.header(com.google.common.net.HttpHeaders.IF_MODIFIED_SINCE) == null && request.header(com.google.common.net.HttpHeaders.IF_NONE_MATCH) == null) ? false : true;
        }
    }

    /* JADX INFO: compiled from: CacheStrategy.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "()V", "isCacheable", "", com.json.hs.n, "Lokhttp3/Response;", "request", "Lokhttp3/Request;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        public final boolean isCacheable(okhttp3.Response response, okhttp3.Request request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            int iCode = response.code();
            if (iCode != 200 && iCode != 410 && iCode != 414 && iCode != 501 && iCode != 203 && iCode != 204) {
                if (iCode == 307) {
                    if (okhttp3.Response.header$default(response, com.google.common.net.HttpHeaders.EXPIRES, null, 2, null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().getIsPublic() && !response.cacheControl().getIsPrivate()) {
                        return false;
                    }
                } else if (iCode != 308 && iCode != 404 && iCode != 405) {
                    switch (iCode) {
                        case com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT /* 300 */:
                        case 301:
                            break;
                        case 302:
                            if (okhttp3.Response.header$default(response, com.google.common.net.HttpHeaders.EXPIRES, null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.cacheControl().noStore() || request.cacheControl().noStore()) ? false : true;
        }
    }
}
