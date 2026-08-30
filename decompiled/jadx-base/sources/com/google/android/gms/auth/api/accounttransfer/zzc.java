package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
final class zzc extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzu, com.google.android.gms.auth.api.accounttransfer.zzn> {
    zzc() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.accounttransfer.zzn zznVar, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.auth.zzu(context, looper, clientSettings, zznVar, connectionCallbacks, onConnectionFailedListener);
    }
}
