package com.google.android.gms.auth.api.credentials;

/* JADX INFO: loaded from: classes4.dex */
public class CredentialRequestResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.auth.api.credentials.CredentialRequestResult> {
    public com.google.android.gms.auth.api.credentials.Credential getCredential() {
        return getResult().getCredential();
    }
}
