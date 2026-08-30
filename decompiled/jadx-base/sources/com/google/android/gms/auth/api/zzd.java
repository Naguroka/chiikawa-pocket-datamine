package com.google.android.gms.auth.api;

/* JADX INFO: loaded from: classes4.dex */
final class zzd extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.auth.api.signin.internal.zzg, com.google.android.gms.auth.api.signin.GoogleSignInOptions> {
    zzd() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.auth.api.signin.internal.zzg(context, looper, clientSettings, googleSignInOptions, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    public final /* synthetic */ java.util.List getImpliedScopes(java.lang.Object obj) {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return java.util.Collections.emptyList();
        }
        return googleSignInOptions.getScopes();
    }
}
