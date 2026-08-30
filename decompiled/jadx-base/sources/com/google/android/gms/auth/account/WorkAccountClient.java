package com.google.android.gms.auth.account;

/* JADX INFO: loaded from: classes4.dex */
public class WorkAccountClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    private final com.google.android.gms.auth.account.WorkAccountApi zzac;

    WorkAccountClient(android.content.Context context) {
        super(context, com.google.android.gms.auth.account.WorkAccount.API, (com.google.android.gms.common.api.Api.ApiOptions) null, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zzac = new com.google.android.gms.internal.auth.zzh();
    }

    WorkAccountClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) com.google.android.gms.auth.account.WorkAccount.API, (com.google.android.gms.common.api.Api.ApiOptions) null, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zzac = new com.google.android.gms.internal.auth.zzh();
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setWorkAuthenticatorEnabled(boolean z) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(this.zzac.setWorkAuthenticatorEnabledWithResult(asGoogleApiClient(), z));
    }

    public com.google.android.gms.tasks.Task<android.accounts.Account> addWorkAccount(java.lang.String str) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzac.addWorkAccount(asGoogleApiClient(), str), new com.google.android.gms.auth.account.zzg(this));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeWorkAccount(android.accounts.Account account) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(this.zzac.removeWorkAccount(asGoogleApiClient(), account));
    }
}
