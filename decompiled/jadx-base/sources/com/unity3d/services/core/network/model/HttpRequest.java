package com.unity3d.services.core.network.model;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\b\u0086\b\u0018\u0000 O2\u00020\u0001:\u0001OBÓ\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010¢\u0006\u0002\u0010\u001cJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0016HÆ\u0003J\t\u0010>\u001a\u00020\u0018HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010@\u001a\u00020\u0010HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001b\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\tHÆ\u0003J\u0015\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010F\u001a\u00020\rHÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00102JÜ\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\u00162\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\u0010HÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010*R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0011\u0010\u001b\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$¨\u0006P"}, d2 = {"Lcom/unity3d/services/core/network/model/HttpRequest;", "", "baseURL", "", "path", "method", "Lcom/unity3d/services/core/network/model/RequestType;", "body", "headers", "", "", "parameters", "bodyType", "Lcom/unity3d/services/core/network/model/BodyType;", "scheme", org.jacoco.core.runtime.AgentOptions.PORT, "", "connectTimeout", "readTimeout", "writeTimeout", "callTimeout", "isProtobuf", "", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "downloadDestination", "Ljava/io/File;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/core/network/model/RequestType;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/services/core/network/model/BodyType;Ljava/lang/String;Ljava/lang/Integer;IIIIZLcom/unity3d/ads/core/data/model/OperationType;Ljava/io/File;I)V", "getBaseURL", "()Ljava/lang/String;", "getBody", "()Ljava/lang/Object;", "getBodyType", "()Lcom/unity3d/services/core/network/model/BodyType;", "getCallTimeout", "()I", "getConnectTimeout", "getDownloadDestination", "()Ljava/io/File;", "getHeaders", "()Ljava/util/Map;", "()Z", "getMethod", "()Lcom/unity3d/services/core/network/model/RequestType;", "getOperationType", "()Lcom/unity3d/ads/core/data/model/OperationType;", "getParameters", "getPath", "getPort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPriority", "getReadTimeout", "getScheme", "getWriteTimeout", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/core/network/model/RequestType;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/services/core/network/model/BodyType;Ljava/lang/String;Ljava/lang/Integer;IIIIZLcom/unity3d/ads/core/data/model/OperationType;Ljava/io/File;I)Lcom/unity3d/services/core/network/model/HttpRequest;", "equals", "other", "hashCode", "toString", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HttpRequest {
    public static final java.lang.String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final java.lang.String baseURL;
    private final java.lang.Object body;
    private final com.unity3d.services.core.network.model.BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final java.io.File downloadDestination;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers;
    private final boolean isProtobuf;
    private final com.unity3d.services.core.network.model.RequestType method;
    private final com.unity3d.ads.core.data.model.OperationType operationType;
    private final java.util.Map<java.lang.String, java.lang.String> parameters;
    private final java.lang.String path;
    private final java.lang.Integer port;
    private final int priority;
    private final int readTimeout;
    private final java.lang.String scheme;
    private final int writeTimeout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path) {
        this(baseURL, path, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj) {
        this(baseURL, path, method, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers) {
        this(baseURL, path, method, obj, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters) {
        this(baseURL, path, method, obj, headers, parameters, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, com.unity3d.services.core.network.model.BodyType bodyType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyType, "bodyType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, com.unity3d.services.core.network.model.BodyType bodyType, java.lang.String scheme) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, com.unity3d.services.core.network.model.BodyType bodyType, java.lang.String scheme, java.lang.Integer num) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, com.unity3d.services.core.network.model.BodyType bodyType, java.lang.String scheme, java.lang.Integer num, int i) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, 0, 0, 0, false, null, null, 0, 130048, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, com.unity3d.services.core.network.model.BodyType bodyType, java.lang.String scheme, java.lang.Integer num, int i, int i2) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, 0, 0, false, null, null, 0, 129024, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, com.unity3d.services.core.network.model.BodyType bodyType, java.lang.String scheme, java.lang.Integer num, int i, int i2, int i3) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, 0, false, null, null, 0, 126976, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, com.unity3d.services.core.network.model.BodyType bodyType, java.lang.String scheme, java.lang.Integer num, int i, int i2, int i3, int i4) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, false, null, null, 0, 122880, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, com.unity3d.services.core.network.model.BodyType bodyType, java.lang.String scheme, java.lang.Integer num, int i, int i2, int i3, int i4, boolean z) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, null, null, 0, 114688, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, com.unity3d.services.core.network.model.BodyType bodyType, java.lang.String scheme, java.lang.Integer num, int i, int i2, int i3, int i4, boolean z, com.unity3d.ads.core.data.model.OperationType operationType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, operationType, null, 0, 98304, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "operationType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, com.unity3d.services.core.network.model.BodyType bodyType, java.lang.String scheme, java.lang.Integer num, int i, int i2, int i3, int i4, boolean z, com.unity3d.ads.core.data.model.OperationType operationType, java.io.File file) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, operationType, file, 0, 65536, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "operationType");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getBaseURL() {
        return this.baseURL;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getReadTimeout() {
        return this.readTimeout;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getCallTimeout() {
        return this.callTimeout;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsProtobuf() {
        return this.isProtobuf;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final com.unity3d.ads.core.data.model.OperationType getOperationType() {
        return this.operationType;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final java.io.File getDownloadDestination() {
        return this.downloadDestination;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.unity3d.services.core.network.model.RequestType getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.Object getBody() {
        return this.body;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> component5() {
        return this.headers;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component6() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final com.unity3d.services.core.network.model.BodyType getBodyType() {
        return this.bodyType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final java.lang.String getScheme() {
        return this.scheme;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final java.lang.Integer getPort() {
        return this.port;
    }

    public final com.unity3d.services.core.network.model.HttpRequest copy(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object body, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, com.unity3d.services.core.network.model.BodyType bodyType, java.lang.String scheme, java.lang.Integer port, int connectTimeout, int readTimeout, int writeTimeout, int callTimeout, boolean isProtobuf, com.unity3d.ads.core.data.model.OperationType operationType, java.io.File downloadDestination, int priority) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "operationType");
        return new com.unity3d.services.core.network.model.HttpRequest(baseURL, path, method, body, headers, parameters, bodyType, scheme, port, connectTimeout, readTimeout, writeTimeout, callTimeout, isProtobuf, operationType, downloadDestination, priority);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.services.core.network.model.HttpRequest)) {
            return false;
        }
        com.unity3d.services.core.network.model.HttpRequest httpRequest = (com.unity3d.services.core.network.model.HttpRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.baseURL, httpRequest.baseURL) && kotlin.jvm.internal.Intrinsics.areEqual(this.path, httpRequest.path) && this.method == httpRequest.method && kotlin.jvm.internal.Intrinsics.areEqual(this.body, httpRequest.body) && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, httpRequest.headers) && kotlin.jvm.internal.Intrinsics.areEqual(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && kotlin.jvm.internal.Intrinsics.areEqual(this.scheme, httpRequest.scheme) && kotlin.jvm.internal.Intrinsics.areEqual(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v36 */
    public int hashCode() {
        int iHashCode = ((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31;
        java.lang.Object obj = this.body;
        int iHashCode2 = (((((((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.bodyType.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        java.lang.Integer num = this.port;
        int iHashCode3 = (((((((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Integer.hashCode(this.connectTimeout)) * 31) + java.lang.Integer.hashCode(this.readTimeout)) * 31) + java.lang.Integer.hashCode(this.writeTimeout)) * 31) + java.lang.Integer.hashCode(this.callTimeout)) * 31;
        boolean z = this.isProtobuf;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode4 = (((iHashCode3 + r1) * 31) + this.operationType.hashCode()) * 31;
        java.io.File file = this.downloadDestination;
        return ((iHashCode4 + (file != null ? file.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.priority);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpRequest(baseURL=");
        sb.append(this.baseURL).append(", path=").append(this.path).append(", method=").append(this.method).append(", body=").append(this.body).append(", headers=").append(this.headers).append(", parameters=").append(this.parameters).append(", bodyType=").append(this.bodyType).append(", scheme=").append(this.scheme).append(", port=").append(this.port).append(", connectTimeout=").append(this.connectTimeout).append(", readTimeout=").append(this.readTimeout).append(", writeTimeout=");
        sb.append(this.writeTimeout).append(", callTimeout=").append(this.callTimeout).append(", isProtobuf=").append(this.isProtobuf).append(", operationType=").append(this.operationType).append(", downloadDestination=").append(this.downloadDestination).append(", priority=").append(this.priority).append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(java.lang.String baseURL, java.lang.String path, com.unity3d.services.core.network.model.RequestType method, java.lang.Object obj, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.util.Map<java.lang.String, java.lang.String> parameters, com.unity3d.services.core.network.model.BodyType bodyType, java.lang.String scheme, java.lang.Integer num, int i, int i2, int i3, int i4, boolean z, com.unity3d.ads.core.data.model.OperationType operationType, java.io.File file, int i5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "operationType");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = obj;
        this.headers = headers;
        this.parameters = parameters;
        this.bodyType = bodyType;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
        this.isProtobuf = z;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i5;
    }

    public final java.lang.String getBaseURL() {
        return this.baseURL;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public /* synthetic */ HttpRequest(java.lang.String str, java.lang.String str2, com.unity3d.services.core.network.model.RequestType requestType, java.lang.Object obj, java.util.Map map, java.util.Map map2, com.unity3d.services.core.network.model.BodyType bodyType, java.lang.String str3, java.lang.Integer num, int i, int i2, int i3, int i4, boolean z, com.unity3d.ads.core.data.model.OperationType operationType, java.io.File file, int i5, int i6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? com.unity3d.services.core.network.model.RequestType.GET : requestType, (i6 & 8) != 0 ? null : obj, (i6 & 16) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i6 & 32) != 0 ? kotlin.collections.MapsKt.emptyMap() : map2, (i6 & 64) != 0 ? com.unity3d.services.core.network.model.BodyType.UNKNOWN : bodyType, (i6 & 128) != 0 ? "https" : str3, (i6 & 256) != 0 ? null : num, (i6 & 512) != 0 ? 30000 : i, (i6 & 1024) != 0 ? 30000 : i2, (i6 & 2048) != 0 ? 30000 : i3, (i6 & 4096) == 0 ? i4 : 30000, (i6 & 8192) != 0 ? false : z, (i6 & 16384) != 0 ? com.unity3d.ads.core.data.model.OperationType.UNKNOWN : operationType, (i6 & 32768) != 0 ? null : file, (i6 & 65536) == 0 ? i5 : 0);
    }

    public final com.unity3d.services.core.network.model.RequestType getMethod() {
        return this.method;
    }

    public final java.lang.Object getBody() {
        return this.body;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return this.headers;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return this.parameters;
    }

    public final com.unity3d.services.core.network.model.BodyType getBodyType() {
        return this.bodyType;
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

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    public final com.unity3d.ads.core.data.model.OperationType getOperationType() {
        return this.operationType;
    }

    public final java.io.File getDownloadDestination() {
        return this.downloadDestination;
    }

    public final int getPriority() {
        return this.priority;
    }
}
