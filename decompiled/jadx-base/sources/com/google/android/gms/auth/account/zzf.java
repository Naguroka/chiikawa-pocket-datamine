package com.google.android.gms.auth.account;

/* JADX INFO: loaded from: classes4.dex */
final class zzf extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzr, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    zzf() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.Api.ApiOptions.NoOptions noOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.auth.zzr(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
