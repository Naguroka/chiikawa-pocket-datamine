package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzq implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status mStatus;

    public zzq(com.google.android.gms.common.api.Status status) {
        this.mStatus = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }
}
