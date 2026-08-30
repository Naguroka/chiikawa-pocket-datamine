package com.google.android.gms.auth.api.proxy;

/* JADX INFO: loaded from: classes4.dex */
public interface ProxyApi {

    public interface ProxyResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.auth.api.proxy.ProxyResponse getResponse();
    }

    public interface SpatulaHeaderResult extends com.google.android.gms.common.api.Result {
        java.lang.String getSpatulaHeader();
    }

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult> getSpatulaHeader(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult> performProxyRequest(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest);
}
