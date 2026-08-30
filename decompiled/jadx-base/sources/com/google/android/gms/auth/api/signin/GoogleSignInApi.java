package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes4.dex */
public interface GoogleSignInApi {
    public static final java.lang.String EXTRA_SIGN_IN_ACCOUNT = "signInAccount";

    android.content.Intent getSignInIntent(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    com.google.android.gms.auth.api.signin.GoogleSignInResult getSignInResultFromIntent(android.content.Intent intent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> revokeAccess(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> signOut(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> silentSignIn(com.google.android.gms.common.api.GoogleApiClient googleApiClient);
}
