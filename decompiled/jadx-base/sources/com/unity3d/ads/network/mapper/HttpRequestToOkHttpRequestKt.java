package com.unity3d.ads.network.mapper;

/* JADX INFO: compiled from: HttpRequestToOkHttpRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0006¨\u0006\t"}, d2 = {"generateOkHttpBody", "Lokhttp3/RequestBody;", "body", "Lcom/unity3d/ads/network/model/HttpBody;", "generateOkHttpHeaders", "Lokhttp3/Headers;", "Lcom/unity3d/ads/network/model/HttpRequest;", "toOkHttpRequest", "Lokhttp3/Request;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HttpRequestToOkHttpRequestKt {
    private static final okhttp3.RequestBody generateOkHttpBody(com.unity3d.ads.network.model.HttpBody httpBody) {
        if (httpBody instanceof com.unity3d.ads.network.model.HttpBody.StringBody) {
            return okhttp3.RequestBody.create(okhttp3.MediaType.parse("text/plain;charset=utf-8"), ((com.unity3d.ads.network.model.HttpBody.StringBody) httpBody).getContent());
        }
        if (httpBody instanceof com.unity3d.ads.network.model.HttpBody.ByteArrayBody) {
            return okhttp3.RequestBody.create(okhttp3.MediaType.parse("text/plain;charset=utf-8"), ((com.unity3d.ads.network.model.HttpBody.ByteArrayBody) httpBody).getContent());
        }
        if (httpBody instanceof com.unity3d.ads.network.model.HttpBody.EmptyBody) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private static final okhttp3.Headers generateOkHttpHeaders(com.unity3d.ads.network.model.HttpRequest httpRequest) {
        okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : httpRequest.getHeaders().entrySet()) {
            builder.add(entry.getKey(), kotlin.collections.CollectionsKt.joinToString$default(entry.getValue(), ",", null, null, 0, null, null, 62, null));
        }
        okhttp3.Headers headersBuild = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(headersBuild, "Builder()\n    .also { he…ng(\",\")) } }\n    .build()");
        return headersBuild;
    }

    public static final okhttp3.Request toOkHttpRequest(com.unity3d.ads.network.model.HttpRequest httpRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "<this>");
        okhttp3.Request requestBuild = new okhttp3.Request.Builder().url(kotlin.text.StringsKt.removeSuffix(kotlin.text.StringsKt.trim(httpRequest.getBaseURL(), '/') + '/' + kotlin.text.StringsKt.trim(httpRequest.getPath(), '/'), (java.lang.CharSequence) "/")).method(httpRequest.getMethod().toString(), generateOkHttpBody(httpRequest.getBody())).headers(generateOkHttpHeaders(httpRequest)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestBuild, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return requestBuild;
    }
}
