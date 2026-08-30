package com.unity3d.services.core.network.mapper;

/* JADX INFO: compiled from: WebRequestToHttpRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toHttpRequest", "Lcom/unity3d/services/core/network/model/HttpRequest;", "Lcom/unity3d/services/core/request/WebRequest;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WebRequestToHttpRequestKt {
    public static final com.unity3d.services.core.network.model.HttpRequest toHttpRequest(com.unity3d.services.core.request.WebRequest webRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webRequest, "<this>");
        java.lang.String string = webRequest.getUrl().toString();
        java.lang.String requestType = webRequest.getRequestType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestType, "requestType");
        com.unity3d.services.core.network.model.RequestType requestTypeValueOf = com.unity3d.services.core.network.model.RequestType.valueOf(requestType);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers = webRequest.getHeaders();
        byte[] body = webRequest.getBody();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString()");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(headers, "headers");
        return new com.unity3d.services.core.network.model.HttpRequest(string, null, requestTypeValueOf, body, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131042, null);
    }
}
