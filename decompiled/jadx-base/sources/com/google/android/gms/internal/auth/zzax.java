package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class zzax implements com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult {
    private com.google.android.gms.common.api.Status mStatus;
    private java.lang.String zzci;

    public zzax(@javax.annotation.Nonnull java.lang.String str) {
        this.zzci = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.mStatus = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
    }

    public zzax(@javax.annotation.Nonnull com.google.android.gms.common.api.Status status) {
        this.mStatus = (com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.Preconditions.checkNotNull(status);
    }

    @Override // com.google.android.gms.common.api.Result
    @javax.annotation.Nullable
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult
    @javax.annotation.Nullable
    public final java.lang.String getSpatulaHeader() {
        return this.zzci;
    }
}
