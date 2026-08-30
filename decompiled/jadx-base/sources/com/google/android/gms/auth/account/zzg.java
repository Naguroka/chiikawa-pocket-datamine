package com.google.android.gms.auth.account;

/* JADX INFO: loaded from: classes4.dex */
final class zzg implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter<com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult, android.accounts.Account> {
    zzg(com.google.android.gms.auth.account.WorkAccountClient workAccountClient) {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ android.accounts.Account convert(com.google.android.gms.common.api.Result result) {
        return ((com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult) result).getAccount();
    }
}
