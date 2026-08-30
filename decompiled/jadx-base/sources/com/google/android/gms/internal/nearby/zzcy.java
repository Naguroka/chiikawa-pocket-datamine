package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcy extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.nearby.zzbf, com.google.android.gms.nearby.connection.ConnectionsOptions> {
    zzcy() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.nearby.connection.ConnectionsOptions connectionsOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.nearby.zzbf(context, looper, clientSettings, connectionsOptions, connectionCallbacks, onConnectionFailedListener);
    }
}
