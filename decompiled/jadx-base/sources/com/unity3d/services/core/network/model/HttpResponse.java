package com.unity3d.services.core.network.model;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B]\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0001HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\u001b\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003Ja\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00062\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0004HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006("}, d2 = {"Lcom/unity3d/services/core/network/model/HttpResponse;", "", "body", "statusCode", "", "headers", "", "", "", "urlString", "protocol", "client", "contentSize", "", "(Ljava/lang/Object;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getBody", "()Ljava/lang/Object;", "getClient", "()Ljava/lang/String;", "getContentSize", "()J", "getHeaders", "()Ljava/util/Map;", "getProtocol", "getStatusCode", "()I", "getUrlString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HttpResponse {
    private final java.lang.Object body;
    private final java.lang.String client;
    private final long contentSize;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers;
    private final java.lang.String protocol;
    private final int statusCode;
    private final java.lang.String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(java.lang.Object body) {
        this(body, 0, null, null, null, null, 0L, 126, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(java.lang.Object body, int i) {
        this(body, i, null, null, null, null, 0L, 124, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(java.lang.Object body, int i, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers) {
        this(body, i, headers, null, null, null, 0L, 120, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(java.lang.Object body, int i, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.lang.String urlString) {
        this(body, i, headers, urlString, null, null, 0L, 112, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlString, "urlString");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(java.lang.Object body, int i, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.lang.String urlString, java.lang.String protocol) {
        this(body, i, headers, urlString, protocol, null, 0L, 96, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlString, "urlString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(java.lang.Object body, int i, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.lang.String urlString, java.lang.String protocol, java.lang.String client) {
        this(body, i, headers, urlString, protocol, client, 0L, 64, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlString, "urlString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.Object getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> component3() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getUrlString() {
        return this.urlString;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getContentSize() {
        return this.contentSize;
    }

    public final com.unity3d.services.core.network.model.HttpResponse copy(java.lang.Object body, int statusCode, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.lang.String urlString, java.lang.String protocol, java.lang.String client, long contentSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlString, "urlString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        return new com.unity3d.services.core.network.model.HttpResponse(body, statusCode, headers, urlString, protocol, client, contentSize);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.services.core.network.model.HttpResponse)) {
            return false;
        }
        com.unity3d.services.core.network.model.HttpResponse httpResponse = (com.unity3d.services.core.network.model.HttpResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, httpResponse.headers) && kotlin.jvm.internal.Intrinsics.areEqual(this.urlString, httpResponse.urlString) && kotlin.jvm.internal.Intrinsics.areEqual(this.protocol, httpResponse.protocol) && kotlin.jvm.internal.Intrinsics.areEqual(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize;
    }

    public int hashCode() {
        return (((((((((((this.body.hashCode() * 31) + java.lang.Integer.hashCode(this.statusCode)) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode()) * 31) + this.protocol.hashCode()) * 31) + this.client.hashCode()) * 31) + java.lang.Long.hashCode(this.contentSize);
    }

    public java.lang.String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ", protocol=" + this.protocol + ", client=" + this.client + ", contentSize=" + this.contentSize + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpResponse(java.lang.Object body, int i, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, java.lang.String urlString, java.lang.String protocol, java.lang.String client, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlString, "urlString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        this.body = body;
        this.statusCode = i;
        this.headers = headers;
        this.urlString = urlString;
        this.protocol = protocol;
        this.client = client;
        this.contentSize = j;
    }

    public final java.lang.Object getBody() {
        return this.body;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public /* synthetic */ HttpResponse(java.lang.Object obj, int i, java.util.Map map, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? 200 : i, (i2 & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i2 & 8) != 0 ? "" : str, (i2 & 16) == 0 ? str2 : "", (i2 & 32) != 0 ? "unknown" : str3, (i2 & 64) != 0 ? -1L : j);
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return this.headers;
    }

    public final java.lang.String getUrlString() {
        return this.urlString;
    }

    public final java.lang.String getProtocol() {
        return this.protocol;
    }

    public final java.lang.String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }
}
