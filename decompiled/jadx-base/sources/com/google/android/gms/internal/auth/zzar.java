package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class zzar implements com.google.android.gms.auth.api.proxy.ProxyApi {
    @Override // com.google.android.gms.auth.api.proxy.ProxyApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult> performProxyRequest(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(proxyRequest);
        return googleApiClient.execute(new com.google.android.gms.internal.auth.zzas(this, googleApiClient, proxyRequest));
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult> getSpatulaHeader(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient);
        return googleApiClient.execute(new com.google.android.gms.internal.auth.zzau(this, googleApiClient));
    }
}
