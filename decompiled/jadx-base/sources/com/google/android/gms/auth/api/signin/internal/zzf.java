package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzf implements com.google.android.gms.auth.api.signin.GoogleSignInApi {
    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final android.content.Intent getSignInIntent(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zzh.zzc(googleApiClient.getContext(), zzc(googleApiClient));
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> silentSignIn(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zzh.zzc(googleApiClient, googleApiClient.getContext(), zzc(googleApiClient), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> signOut(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zzh.zzc(googleApiClient, googleApiClient.getContext(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> revokeAccess(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zzh.zzd(googleApiClient, googleApiClient.getContext(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.auth.api.signin.GoogleSignInResult getSignInResultFromIntent(android.content.Intent intent) {
        return com.google.android.gms.auth.api.signin.internal.zzh.getSignInResultFromIntent(intent);
    }

    private static com.google.android.gms.auth.api.signin.GoogleSignInOptions zzc(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return ((com.google.android.gms.auth.api.signin.internal.zzg) googleApiClient.getClient(com.google.android.gms.auth.api.Auth.zzh)).zzg();
    }
}
