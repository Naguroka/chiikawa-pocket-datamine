package com.google.android.gms.auth.api.credentials;

/* JADX INFO: loaded from: classes4.dex */
public interface CredentialsApi {
    public static final int ACTIVITY_RESULT_ADD_ACCOUNT = 1000;
    public static final int ACTIVITY_RESULT_NO_HINTS_AVAILABLE = 1002;
    public static final int ACTIVITY_RESULT_OTHER_ACCOUNT = 1001;
    public static final int CREDENTIAL_PICKER_REQUEST_CODE = 2000;

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> delete(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.Credential credential);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> disableAutoSignIn(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    android.app.PendingIntent getHintPickerIntent(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.HintRequest hintRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.credentials.CredentialRequestResult> request(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.CredentialRequest credentialRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> save(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.Credential credential);
}
