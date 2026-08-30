package com.unity3d.ads.network.model;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/network/model/HttpResponse;", "", "body", "statusCode", "", "headers", "", "", "urlString", "(Ljava/lang/Object;ILjava/util/Map;Ljava/lang/String;)V", "getBody", "()Ljava/lang/Object;", "getHeaders", "()Ljava/util/Map;", "getStatusCode", "()I", "getUrlString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HttpResponse {
    private final java.lang.Object body;
    private final java.util.Map<java.lang.String, java.lang.Object> headers;
    private final int statusCode;
    private final java.lang.String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(java.lang.Object body) {
        this(body, 0, null, null, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(java.lang.Object body, int i) {
        this(body, i, null, null, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(java.lang.Object body, int i, java.util.Map<java.lang.String, ? extends java.lang.Object> headers) {
        this(body, i, headers, null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.unity3d.ads.network.model.HttpResponse copy$default(com.unity3d.ads.network.model.HttpResponse httpResponse, java.lang.Object obj, int i, java.util.Map map, java.lang.String str, int i2, java.lang.Object obj2) {
        if ((i2 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i2 & 2) != 0) {
            i = httpResponse.statusCode;
        }
        if ((i2 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i2 & 8) != 0) {
            str = httpResponse.urlString;
        }
        return httpResponse.copy(obj, i, map, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.Object getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component3() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getUrlString() {
        return this.urlString;
    }

    public final com.unity3d.ads.network.model.HttpResponse copy(java.lang.Object body, int statusCode, java.util.Map<java.lang.String, ? extends java.lang.Object> headers, java.lang.String urlString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlString, "urlString");
        return new com.unity3d.ads.network.model.HttpResponse(body, statusCode, headers, urlString);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.ads.network.model.HttpResponse)) {
            return false;
        }
        com.unity3d.ads.network.model.HttpResponse httpResponse = (com.unity3d.ads.network.model.HttpResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, httpResponse.headers) && kotlin.jvm.internal.Intrinsics.areEqual(this.urlString, httpResponse.urlString);
    }

    public int hashCode() {
        return (((((this.body.hashCode() * 31) + java.lang.Integer.hashCode(this.statusCode)) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode();
    }

    public java.lang.String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ')';
    }

    public HttpResponse(java.lang.Object body, int i, java.util.Map<java.lang.String, ? extends java.lang.Object> headers, java.lang.String urlString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.body = body;
        this.statusCode = i;
        this.headers = headers;
        this.urlString = urlString;
    }

    public final java.lang.Object getBody() {
        return this.body;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public /* synthetic */ HttpResponse(java.lang.Object obj, int i, java.util.Map map, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? 200 : i, (i2 & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i2 & 8) != 0 ? "" : str);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getHeaders() {
        return this.headers;
    }

    public final java.lang.String getUrlString() {
        return this.urlString;
    }
}
