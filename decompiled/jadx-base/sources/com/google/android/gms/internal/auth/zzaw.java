package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzaw implements com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult {
    private com.google.android.gms.common.api.Status mStatus;
    private com.google.android.gms.auth.api.proxy.ProxyResponse zzch;

    public zzaw(com.google.android.gms.auth.api.proxy.ProxyResponse proxyResponse) {
        this.zzch = proxyResponse;
        this.mStatus = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
    }

    public zzaw(com.google.android.gms.common.api.Status status) {
        this.mStatus = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult
    public final com.google.android.gms.auth.api.proxy.ProxyResponse getResponse() {
        return this.zzch;
    }
}
