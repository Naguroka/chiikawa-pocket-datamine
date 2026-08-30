package com.unity3d.services.core.network.mapper;

/* JADX INFO: compiled from: HttpRequestToWebRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toWebRequest", "Lcom/unity3d/services/core/request/WebRequest;", "Lcom/unity3d/services/core/network/model/HttpRequest;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HttpRequestToWebRequestKt {
    public static final com.unity3d.services.core.request.WebRequest toWebRequest(com.unity3d.services.core.network.model.HttpRequest httpRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "<this>");
        com.unity3d.services.core.request.WebRequest webRequest = new com.unity3d.services.core.request.WebRequest(httpRequest.getBaseURL(), httpRequest.getMethod().toString(), httpRequest.getHeaders(), httpRequest.getConnectTimeout(), httpRequest.getReadTimeout());
        java.lang.Object body = httpRequest.getBody();
        if (body instanceof java.lang.String) {
            webRequest.setBody((java.lang.String) httpRequest.getBody());
        } else if (body instanceof byte[]) {
            webRequest.setBody((byte[]) httpRequest.getBody());
        }
        return webRequest;
    }
}
