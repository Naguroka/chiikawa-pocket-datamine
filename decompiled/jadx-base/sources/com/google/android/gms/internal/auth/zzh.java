package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class zzh implements com.google.android.gms.auth.account.WorkAccountApi {
    private static final com.google.android.gms.common.api.Status zzad = new com.google.android.gms.common.api.Status(13);

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final void setWorkAuthenticatorEnabled(com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z) {
        setWorkAuthenticatorEnabledWithResult(googleApiClient, z);
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Result> setWorkAuthenticatorEnabledWithResult(com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.execute(new com.google.android.gms.internal.auth.zzi(this, com.google.android.gms.auth.account.WorkAccount.API, googleApiClient, z));
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult> addWorkAccount(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.execute(new com.google.android.gms.internal.auth.zzj(this, com.google.android.gms.auth.account.WorkAccount.API, googleApiClient, str));
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Result> removeWorkAccount(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.accounts.Account account) {
        return googleApiClient.execute(new com.google.android.gms.internal.auth.zzl(this, com.google.android.gms.auth.account.WorkAccount.API, googleApiClient, account));
    }
}
