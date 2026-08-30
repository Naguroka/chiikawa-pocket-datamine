package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzo implements com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult {
    private final com.google.android.gms.common.api.Status mStatus;
    private final android.accounts.Account zzk;

    public zzo(com.google.android.gms.common.api.Status status, android.accounts.Account account) {
        this.mStatus = status;
        this.zzk = account;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult
    public final android.accounts.Account getAccount() {
        return this.zzk;
    }
}
