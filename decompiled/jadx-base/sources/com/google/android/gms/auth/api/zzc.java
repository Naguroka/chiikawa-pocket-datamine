package com.google.android.gms.auth.api;

/* JADX INFO: loaded from: classes4.dex */
final class zzc extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.p000authapi.zzr, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions> {
    zzc() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.p000authapi.zzr(context, looper, clientSettings, authCredentialsOptions, connectionCallbacks, onConnectionFailedListener);
    }
}
