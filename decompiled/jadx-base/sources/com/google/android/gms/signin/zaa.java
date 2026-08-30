package com.google.android.gms.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zaa extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    zaa() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, java.lang.Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.signin.internal.SignInClientImpl(context, looper, true, clientSettings, com.google.android.gms.signin.internal.SignInClientImpl.createBundleFromClientSettings(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }
}
