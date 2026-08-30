package okhttp3;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001*BA\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\u0010\rJ\u000f\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u001fJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050 2\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b!J\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u0004\u0018\u00010\u0001J#\u0010$\u001a\u0004\u0018\u0001H%\"\u0004\b\u0000\u0010%2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u0002H%0\f¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0005H\u0016J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b)R\u0015\u0010\b\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R$\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001a¨\u0006+"}, d2 = {"Lokhttp3/Request;", "", "url", "Lokhttp3/HttpUrl;", "method", "", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "tags", "", "Ljava/lang/Class;", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "()Lokhttp3/RequestBody;", "cacheControl", "Lokhttp3/CacheControl;", "()Lokhttp3/CacheControl;", "()Lokhttp3/Headers;", "isHttps", "", "()Z", "lazyCacheControl", "()Ljava/lang/String;", "getTags$okhttp", "()Ljava/util/Map;", "()Lokhttp3/HttpUrl;", "-deprecated_body", "-deprecated_cacheControl", "header", "name", "-deprecated_headers", "", "-deprecated_method", "newBuilder", "Lokhttp3/Request$Builder;", "tag", "T", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "toString", "-deprecated_url", "Builder", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Request {
    private final okhttp3.RequestBody body;
    private final okhttp3.Headers headers;
    private okhttp3.CacheControl lazyCacheControl;
    private final java.lang.String method;
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> tags;
    private final okhttp3.HttpUrl url;

    public Request(okhttp3.HttpUrl url, java.lang.String method, okhttp3.Headers headers, okhttp3.RequestBody requestBody, java.util.Map<java.lang.Class<?>, ? extends java.lang.Object> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "tags");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = requestBody;
        this.tags = tags;
    }

    public final okhttp3.HttpUrl url() {
        return this.url;
    }

    public final java.lang.String method() {
        return this.method;
    }

    public final okhttp3.Headers headers() {
        return this.headers;
    }

    public final okhttp3.RequestBody body() {
        return this.body;
    }

    public final java.util.Map<java.lang.Class<?>, java.lang.Object> getTags$okhttp() {
        return this.tags;
    }

    public final boolean isHttps() {
        return this.url.getIsHttps();
    }

    public final java.lang.String header(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.get(name);
    }

    public final java.util.List<java.lang.String> headers(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.values(name);
    }

    public final java.lang.Object tag() {
        return tag(java.lang.Object.class);
    }

    public final <T> T tag(java.lang.Class<? extends T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.tags.get(type));
    }

    public final okhttp3.Request.Builder newBuilder() {
        return new okhttp3.Request.Builder(this);
    }

    public final okhttp3.CacheControl cacheControl() {
        okhttp3.CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        okhttp3.CacheControl cacheControl2 = okhttp3.CacheControl.INSTANCE.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "url", imports = {}))
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final okhttp3.HttpUrl getUrl() {
        return this.url;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "method", imports = {}))
    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name and from getter */
    public final java.lang.String getMethod() {
        return this.method;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "headers", imports = {}))
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final okhttp3.Headers getHeaders() {
        return this.headers;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "body", imports = {}))
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final okhttp3.RequestBody getBody() {
        return this.body;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cacheControl", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final okhttp3.CacheControl m2987deprecated_cacheControl() {
        return cacheControl();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair : this.headers) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair2 = pair;
                java.lang.String strComponent1 = pair2.component1();
                java.lang.String strComponent2 = pair2.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(strComponent1);
                sb.append(':');
                sb.append(strComponent2);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: compiled from: Request.kt */
    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*H\u0016J\u0014\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017J\b\u0010,\u001a\u00020\u0000H\u0016J\b\u0010-\u001a\u00020\u0000H\u0016J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020/H\u0016J\u001a\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00101\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0013H\u0016J-\u00104\u001a\u00020\u0000\"\u0004\b\u0000\u001052\u000e\u00106\u001a\n\u0012\u0006\b\u0000\u0012\u0002H50\u001a2\b\u00104\u001a\u0004\u0018\u0001H5H\u0016¢\u0006\u0002\u00107J\u0012\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u000208H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0004\u0012\u00020\u00010\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00069"}, d2 = {"Lokhttp3/Request$Builder;", "", "()V", "request", "Lokhttp3/Request;", "(Lokhttp3/Request;)V", "body", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "headers", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "method", "", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "tags", "", "Ljava/lang/Class;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "url", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "addHeader", "name", "value", "build", "cacheControl", "Lokhttp3/CacheControl;", "delete", "get", androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD, "header", "Lokhttp3/Headers;", "patch", "post", "put", "removeHeader", "tag", "T", "type", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Builder {
        private okhttp3.RequestBody body;
        private okhttp3.Headers.Builder headers;
        private java.lang.String method;
        private java.util.Map<java.lang.Class<?>, java.lang.Object> tags;
        private okhttp3.HttpUrl url;

        public final okhttp3.Request.Builder delete() {
            return delete$default(this, null, 1, null);
        }

        /* JADX INFO: renamed from: getUrl$okhttp, reason: from getter */
        public final okhttp3.HttpUrl getUrl() {
            return this.url;
        }

        public final void setUrl$okhttp(okhttp3.HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        /* JADX INFO: renamed from: getMethod$okhttp, reason: from getter */
        public final java.lang.String getMethod() {
            return this.method;
        }

        public final void setMethod$okhttp(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.method = str;
        }

        /* JADX INFO: renamed from: getHeaders$okhttp, reason: from getter */
        public final okhttp3.Headers.Builder getHeaders() {
            return this.headers;
        }

        public final void setHeaders$okhttp(okhttp3.Headers.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "<set-?>");
            this.headers = builder;
        }

        /* JADX INFO: renamed from: getBody$okhttp, reason: from getter */
        public final okhttp3.RequestBody getBody() {
            return this.body;
        }

        public final void setBody$okhttp(okhttp3.RequestBody requestBody) {
            this.body = requestBody;
        }

        public final java.util.Map<java.lang.Class<?>, java.lang.Object> getTags$okhttp() {
            return this.tags;
        }

        public final void setTags$okhttp(java.util.Map<java.lang.Class<?>, java.lang.Object> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.tags = map;
        }

        public Builder() {
            this.tags = new java.util.LinkedHashMap();
            this.method = "GET";
            this.headers = new okhttp3.Headers.Builder();
        }

        public Builder(okhttp3.Request request) {
            java.util.LinkedHashMap mutableMap;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            this.tags = new java.util.LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                mutableMap = new java.util.LinkedHashMap();
            } else {
                mutableMap = kotlin.collections.MapsKt.toMutableMap(request.getTags$okhttp());
            }
            this.tags = mutableMap;
            this.headers = request.headers().newBuilder();
        }

        public okhttp3.Request.Builder url(okhttp3.HttpUrl url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            return this;
        }

        public okhttp3.Request.Builder url(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            if (kotlin.text.StringsKt.startsWith(url, "ws:", true)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("http:");
                java.lang.String strSubstring = url.substring(3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = sb.append(strSubstring).toString();
            } else if (kotlin.text.StringsKt.startsWith(url, "wss:", true)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("https:");
                java.lang.String strSubstring2 = url.substring(4);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = sb2.append(strSubstring2).toString();
            }
            return url(okhttp3.HttpUrl.INSTANCE.get(url));
        }

        public okhttp3.Request.Builder url(java.net.URL url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            okhttp3.HttpUrl.Companion companion = okhttp3.HttpUrl.INSTANCE;
            java.lang.String string = url.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "url.toString()");
            return url(companion.get(string));
        }

        public okhttp3.Request.Builder header(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.headers.set(name, value);
            return this;
        }

        public okhttp3.Request.Builder addHeader(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.headers.add(name, value);
            return this;
        }

        public okhttp3.Request.Builder removeHeader(java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public okhttp3.Request.Builder headers(okhttp3.Headers headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public okhttp3.Request.Builder cacheControl(okhttp3.CacheControl cacheControl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            java.lang.String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader(com.google.common.net.HttpHeaders.CACHE_CONTROL) : header(com.google.common.net.HttpHeaders.CACHE_CONTROL, string);
        }

        public okhttp3.Request.Builder get() {
            return method("GET", null);
        }

        public okhttp3.Request.Builder head() {
            return method("HEAD", null);
        }

        public okhttp3.Request.Builder post(okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
            return method("POST", body);
        }

        public static /* synthetic */ okhttp3.Request.Builder delete$default(okhttp3.Request.Builder builder, okhttp3.RequestBody requestBody, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 1) != 0) {
                requestBody = okhttp3.internal.Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        public okhttp3.Request.Builder delete(okhttp3.RequestBody body) {
            return method("DELETE", body);
        }

        public okhttp3.Request.Builder put(okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
            return method("PUT", body);
        }

        public okhttp3.Request.Builder patch(okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
            return method("PATCH", body);
        }

        public okhttp3.Request.Builder method(java.lang.String method, okhttp3.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
            if (!(method.length() > 0)) {
                throw new java.lang.IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (body == null) {
                if (!(true ^ okhttp3.internal.http.HttpMethod.requiresRequestBody(method))) {
                    throw new java.lang.IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!okhttp3.internal.http.HttpMethod.permitsRequestBody(method)) {
                throw new java.lang.IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        public okhttp3.Request.Builder tag(java.lang.Object tag) {
            return tag(java.lang.Object.class, tag);
        }

        public <T> okhttp3.Request.Builder tag(java.lang.Class<? super T> type, T tag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
            if (tag == null) {
                this.tags.remove(type);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new java.util.LinkedHashMap();
                }
                java.util.Map<java.lang.Class<?>, java.lang.Object> map = this.tags;
                T tCast = type.cast(tag);
                kotlin.jvm.internal.Intrinsics.checkNotNull(tCast);
                map.put(type, tCast);
            }
            return this;
        }

        public okhttp3.Request build() {
            okhttp3.HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new okhttp3.Request(httpUrl, this.method, this.headers.build(), this.body, okhttp3.internal.Util.toImmutableMap(this.tags));
            }
            throw new java.lang.IllegalStateException("url == null".toString());
        }
    }
}
