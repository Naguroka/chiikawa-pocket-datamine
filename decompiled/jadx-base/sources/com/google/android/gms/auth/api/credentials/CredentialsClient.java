package com.google.android.gms.auth.api.credentials;

/* JADX INFO: loaded from: classes4.dex */
public class CredentialsClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.auth.api.Auth.AuthCredentialsOptions> {
    CredentialsClient(android.content.Context context, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions) {
        super(context, com.google.android.gms.auth.api.Auth.CREDENTIALS_API, authCredentialsOptions, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    CredentialsClient(android.app.Activity activity, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions) {
        super(activity, com.google.android.gms.auth.api.Auth.CREDENTIALS_API, authCredentialsOptions, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.credentials.CredentialRequestResponse> request(com.google.android.gms.auth.api.credentials.CredentialRequest credentialRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toResponseTask(com.google.android.gms.auth.api.Auth.CredentialsApi.request(asGoogleApiClient(), credentialRequest), new com.google.android.gms.auth.api.credentials.CredentialRequestResponse());
    }

    public android.app.PendingIntent getHintPickerIntent(com.google.android.gms.auth.api.credentials.HintRequest hintRequest) {
        return com.google.android.gms.internal.p000authapi.zzq.zzc(getApplicationContext(), getApiOptions(), hintRequest);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> save(com.google.android.gms.auth.api.credentials.Credential credential) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.Auth.CredentialsApi.save(asGoogleApiClient(), credential));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> delete(com.google.android.gms.auth.api.credentials.Credential credential) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.Auth.CredentialsApi.delete(asGoogleApiClient(), credential));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> disableAutoSignIn() {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.Auth.CredentialsApi.disableAutoSignIn(asGoogleApiClient()));
    }
}
