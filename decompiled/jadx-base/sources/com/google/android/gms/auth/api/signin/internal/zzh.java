package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzh {
    private static com.google.android.gms.common.logging.Logger zzbd = new com.google.android.gms.common.logging.Logger("GoogleSignInCommon", new java.lang.String[0]);

    public static android.content.Intent zzc(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        zzbd.d("getSignInIntent()", new java.lang.Object[0]);
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = new com.google.android.gms.auth.api.signin.internal.SignInConfiguration(context.getPackageName(), googleSignInOptions);
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, com.google.android.gms.auth.api.signin.internal.SignInHubActivity.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static android.content.Intent zzd(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        zzbd.d("getFallbackSignInIntent()", new java.lang.Object[0]);
        android.content.Intent intentZzc = zzc(context, googleSignInOptions);
        intentZzc.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return intentZzc;
    }

    public static android.content.Intent zze(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        zzbd.d("getNoImplementationSignInIntent()", new java.lang.Object[0]);
        android.content.Intent intentZzc = zzc(context, googleSignInOptions);
        intentZzc.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentZzc;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    public static com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> zzc(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, boolean z) {
        com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult;
        boolean zEquals;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccountZzh;
        zzbd.d("silentSignIn()", new java.lang.Object[0]);
        zzbd.d("getEligibleSavedSignInResult()", new java.lang.Object[0]);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions);
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptionsZzi = com.google.android.gms.auth.api.signin.internal.zzp.zzd(context).zzi();
        if (googleSignInOptionsZzi != null) {
            android.accounts.Account account = googleSignInOptionsZzi.getAccount();
            android.accounts.Account account2 = googleSignInOptions.getAccount();
            if (account == null) {
                zEquals = account2 == null;
            } else {
                zEquals = account.equals(account2);
            }
            if (!zEquals || googleSignInOptions.isServerAuthCodeRequested() || ((googleSignInOptions.isIdTokenRequested() && !(googleSignInOptionsZzi.isIdTokenRequested() && googleSignInOptions.getServerClientId().equals(googleSignInOptionsZzi.getServerClientId()))) || !new java.util.HashSet(googleSignInOptionsZzi.getScopes()).containsAll(new java.util.HashSet(googleSignInOptions.getScopes())) || (googleSignInAccountZzh = com.google.android.gms.auth.api.signin.internal.zzp.zzd(context).zzh()) == null || googleSignInAccountZzh.isExpired())) {
                googleSignInResult = null;
            } else {
                googleSignInResult = new com.google.android.gms.auth.api.signin.GoogleSignInResult(googleSignInAccountZzh, com.google.android.gms.common.api.Status.RESULT_SUCCESS);
            }
        } else {
            googleSignInResult = null;
        }
        if (googleSignInResult != null) {
            zzbd.d("Eligible saved sign in result found", new java.lang.Object[0]);
            return com.google.android.gms.common.api.PendingResults.immediatePendingResult(googleSignInResult, googleApiClient);
        }
        if (z) {
            return com.google.android.gms.common.api.PendingResults.immediatePendingResult(new com.google.android.gms.auth.api.signin.GoogleSignInResult(null, new com.google.android.gms.common.api.Status(4)), googleApiClient);
        }
        zzbd.d("trySilentSignIn()", new java.lang.Object[0]);
        return new com.google.android.gms.common.api.internal.OptionalPendingResultImpl(googleApiClient.enqueue(new com.google.android.gms.auth.api.signin.internal.zzi(googleApiClient, context, googleSignInOptions)));
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zzc(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, boolean z) {
        zzbd.d("Signing out", new java.lang.Object[0]);
        zzc(context);
        if (z) {
            return com.google.android.gms.common.api.PendingResults.immediatePendingResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS, googleApiClient);
        }
        return googleApiClient.execute(new com.google.android.gms.auth.api.signin.internal.zzk(googleApiClient));
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zzd(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, boolean z) {
        zzbd.d("Revoking access", new java.lang.Object[0]);
        java.lang.String savedRefreshToken = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(context).getSavedRefreshToken();
        zzc(context);
        if (z) {
            return com.google.android.gms.auth.api.signin.internal.zzd.zzc(savedRefreshToken);
        }
        return googleApiClient.execute(new com.google.android.gms.auth.api.signin.internal.zzm(googleApiClient));
    }

    private static void zzc(android.content.Context context) {
        com.google.android.gms.auth.api.signin.internal.zzp.zzd(context).clear();
        java.util.Iterator<com.google.android.gms.common.api.GoogleApiClient> it = com.google.android.gms.common.api.GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        com.google.android.gms.common.api.internal.GoogleApiManager.reportSignOut();
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInResult getSignInResultFromIntent(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount")) {
            return null;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
        return new com.google.android.gms.auth.api.signin.GoogleSignInResult(googleSignInAccount, status);
    }
}
