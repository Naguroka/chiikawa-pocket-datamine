package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzw extends com.google.android.gms.auth.api.signin.internal.zzr {
    private final android.content.Context mContext;

    public zzw(android.content.Context context) {
        this.mContext = context;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzq
    public final void zzj() {
        zzl();
        com.google.android.gms.auth.api.signin.internal.Storage storage = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(this.mContext);
        com.google.android.gms.auth.api.signin.GoogleSignInAccount savedDefaultGoogleSignInAccount = storage.getSavedDefaultGoogleSignInAccount();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions savedDefaultGoogleSignInOptions = com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (savedDefaultGoogleSignInAccount != null) {
            savedDefaultGoogleSignInOptions = storage.getSavedDefaultGoogleSignInOptions();
        }
        com.google.android.gms.common.api.GoogleApiClient googleApiClientBuild = new com.google.android.gms.common.api.GoogleApiClient.Builder(this.mContext).addApi(com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API, savedDefaultGoogleSignInOptions).build();
        try {
            if (googleApiClientBuild.blockingConnect().isSuccess()) {
                if (savedDefaultGoogleSignInAccount != null) {
                    com.google.android.gms.auth.api.Auth.GoogleSignInApi.revokeAccess(googleApiClientBuild);
                } else {
                    googleApiClientBuild.clearDefaultAccountAndReconnect();
                }
            }
        } finally {
            googleApiClientBuild.disconnect();
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzq
    public final void zzk() {
        zzl();
        com.google.android.gms.auth.api.signin.internal.zzp.zzd(this.mContext).clear();
    }

    private final void zzl() {
        if (com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesUid(this.mContext, android.os.Binder.getCallingUid())) {
            return;
        }
        throw new java.lang.SecurityException(new java.lang.StringBuilder(52).append("Calling UID ").append(android.os.Binder.getCallingUid()).append(" is not Google Play services.").toString());
    }
}
