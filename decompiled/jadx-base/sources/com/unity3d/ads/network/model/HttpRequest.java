package com.unity3d.ads.network.model;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 ;2\u00020\u0001:\u0001;B\u009d\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0002\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u001b\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\nHÆ\u0003J\u0015\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\t\u00103\u001a\u00020\u000fHÆ\u0003J¦\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u000fHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR#\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001a¨\u0006<"}, d2 = {"Lcom/unity3d/ads/network/model/HttpRequest;", "", "baseURL", "", "path", "method", "Lcom/unity3d/ads/network/model/RequestType;", "body", "Lcom/unity3d/ads/network/model/HttpBody;", "headers", "", "", "parameters", "scheme", org.jacoco.core.runtime.AgentOptions.PORT, "", "connectTimeout", "readTimeout", "writeTimeout", "callTimeout", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/network/model/RequestType;Lcom/unity3d/ads/network/model/HttpBody;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;IIII)V", "getBaseURL", "()Ljava/lang/String;", "getBody", "()Lcom/unity3d/ads/network/model/HttpBody;", "getCallTimeout", "()I", "getConnectTimeout", "getHeaders", "()Ljava/util/Map;", "getMethod", "()Lcom/unity3d/ads/network/model/RequestType;", "getParameters", "getPath", "getPort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReadTimeout", "getScheme", "getWriteTimeout", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/network/model/RequestType;Lcom/unity3d/ads/network/model/HttpBody;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;IIII)Lcom/unity3d/ads/network/model/HttpRequest;", "equals", "", "other", "hashCode", "toString", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HttpRequest {
    private static final java.lang.String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    private final java.lang.String baseURL;
    private final com.unity3d.ads.network.model.HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers;
    private final com.unity3d.ads.network.model.RequestType method;
    private final java.util.Map<java.lang.String, java.lang.String> parameters;
    private final java.lang.String path;
    private final java.lang.Integer port;
    private final int readTimeout;
    private final java.lang.String scheme;
    private final int writeTimeout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path) {
        this(baseURL, path, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.ads.network.model.RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.ads.network.model.RequestType method, com.unity3d.ads.network.model.HttpBody body) {
        this(baseURL, path, method, body, null, null, null, null, 0, 0, 0, 0, 4080, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.ads.network.model.RequestType method, com.unity3d.ads.network.model.HttpBody body, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers) {
        this(baseURL, path, method, body, headers, null, null, null, 0, 0, 0, 0, 4064, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.ads.network.model.RequestType method, com.unity3d.ads.network.model.HttpBody body, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters) {
        this(baseURL, path, method, body, headers, parameters, null, null, 0, 0, 0, 0, 4032, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.ads.network.model.RequestType method, com.unity3d.ads.network.model.HttpBody body, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, java.lang.String scheme) {
        this(baseURL, path, method, body, headers, parameters, scheme, null, 0, 0, 0, 0, okio.Utf8.MASK_2BYTES, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.ads.network.model.RequestType method, com.unity3d.ads.network.model.HttpBody body, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, java.lang.String scheme, java.lang.Integer num) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, 0, 0, 0, 0, 3840, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.ads.network.model.RequestType method, com.unity3d.ads.network.model.HttpBody body, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, java.lang.String scheme, java.lang.Integer num, int i) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i, 0, 0, 0, androidx.media3.exoplayer.RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.ads.network.model.RequestType method, com.unity3d.ads.network.model.HttpBody body, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, java.lang.String scheme, java.lang.Integer num, int i, int i2) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i, i2, 0, 0, 3072, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.ads.network.model.RequestType method, com.unity3d.ads.network.model.HttpBody body, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, java.lang.String scheme, java.lang.Integer num, int i, int i2, int i3) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i, i2, i3, 0, 2048, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getBaseURL() {
        return this.baseURL;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getReadTimeout() {
        return this.readTimeout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getCallTimeout() {
        return this.callTimeout;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.unity3d.ads.network.model.RequestType getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final com.unity3d.ads.network.model.HttpBody getBody() {
        return this.body;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> component5() {
        return this.headers;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component6() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.lang.String getScheme() {
        return this.scheme;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final java.lang.Integer getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final com.unity3d.ads.network.model.HttpRequest copy(java.lang.String baseURL, java.lang.String path, com.unity3d.ads.network.model.RequestType method, com.unity3d.ads.network.model.HttpBody body, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, java.lang.String scheme, java.lang.Integer port, int connectTimeout, int readTimeout, int writeTimeout, int callTimeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
        return new com.unity3d.ads.network.model.HttpRequest(baseURL, path, method, body, headers, parameters, scheme, port, connectTimeout, readTimeout, writeTimeout, callTimeout);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.ads.network.model.HttpRequest)) {
            return false;
        }
        com.unity3d.ads.network.model.HttpRequest httpRequest = (com.unity3d.ads.network.model.HttpRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.baseURL, httpRequest.baseURL) && kotlin.jvm.internal.Intrinsics.areEqual(this.path, httpRequest.path) && this.method == httpRequest.method && kotlin.jvm.internal.Intrinsics.areEqual(this.body, httpRequest.body) && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, httpRequest.headers) && kotlin.jvm.internal.Intrinsics.areEqual(this.parameters, httpRequest.parameters) && kotlin.jvm.internal.Intrinsics.areEqual(this.scheme, httpRequest.scheme) && kotlin.jvm.internal.Intrinsics.areEqual(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31) + this.body.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        java.lang.Integer num = this.port;
        return ((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Integer.hashCode(this.connectTimeout)) * 31) + java.lang.Integer.hashCode(this.readTimeout)) * 31) + java.lang.Integer.hashCode(this.writeTimeout)) * 31) + java.lang.Integer.hashCode(this.callTimeout);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpRequest(baseURL=");
        sb.append(this.baseURL).append(", path=").append(this.path).append(", method=").append(this.method).append(", body=").append(this.body).append(", headers=").append(this.headers).append(", parameters=").append(this.parameters).append(", scheme=").append(this.scheme).append(", port=").append(this.port).append(", connectTimeout=").append(this.connectTimeout).append(", readTimeout=").append(this.readTimeout).append(", writeTimeout=").append(this.writeTimeout).append(", callTimeout=");
        sb.append(this.callTimeout).append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.ads.network.model.RequestType method, com.unity3d.ads.network.model.HttpBody body, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, java.lang.String scheme, java.lang.Integer num, int i, int i2, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = body;
        this.headers = headers;
        this.parameters = parameters;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
    }

    public final java.lang.String getBaseURL() {
        return this.baseURL;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public /* synthetic */ HttpRequest(java.lang.String str, java.lang.String str2, com.unity3d.ads.network.model.RequestType requestType, com.unity3d.ads.network.model.HttpBody httpBody, java.util.Map map, java.util.Map map2, java.lang.String str3, java.lang.Integer num, int i, int i2, int i3, int i4, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? com.unity3d.ads.network.model.RequestType.GET : requestType, (i5 & 8) != 0 ? com.unity3d.ads.network.model.HttpBody.EmptyBody.INSTANCE : httpBody, (i5 & 16) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i5 & 32) != 0 ? kotlin.collections.MapsKt.emptyMap() : map2, (i5 & 64) != 0 ? "https" : str3, (i5 & 128) != 0 ? null : num, (i5 & 256) != 0 ? 30000 : i, (i5 & 512) != 0 ? 30000 : i2, (i5 & 1024) != 0 ? 30000 : i3, (i5 & 2048) == 0 ? i4 : 30000);
    }

    public final com.unity3d.ads.network.model.RequestType getMethod() {
        return this.method;
    }

    public final com.unity3d.ads.network.model.HttpBody getBody() {
        return this.body;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return this.headers;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return this.parameters;
    }

    public final java.lang.String getScheme() {
        return this.scheme;
    }

    public final java.lang.Integer getPort() {
        return this.port;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }
}
