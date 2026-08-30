package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzav extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.nearby.messages.internal.zzai, com.google.android.gms.nearby.messages.MessagesOptions> {
    zzav() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.nearby.messages.MessagesOptions messagesOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.nearby.messages.internal.zzai(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings, messagesOptions);
    }

    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    public final int getPriority() {
        return Integer.MAX_VALUE;
    }
}
