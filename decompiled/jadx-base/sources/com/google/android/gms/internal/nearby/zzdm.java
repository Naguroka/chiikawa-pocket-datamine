package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdm implements com.google.android.gms.nearby.connection.Connections {
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.nearby.zzbf> zza = new com.google.android.gms.common.api.Api.ClientKey<>();
    public static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.nearby.zzbf, com.google.android.gms.nearby.connection.ConnectionsOptions> zzb = new com.google.android.gms.internal.nearby.zzcy();

    @Override // com.google.android.gms.nearby.connection.Connections
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> acceptConnection(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, com.google.android.gms.nearby.connection.PayloadCallback payloadCallback) {
        return googleApiClient.execute(new com.google.android.gms.internal.nearby.zzdg(this, googleApiClient, str, googleApiClient.registerListener(payloadCallback)));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    @java.lang.Deprecated
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> acceptConnectionRequest(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, byte[] bArr, com.google.android.gms.nearby.connection.Connections.MessageListener messageListener) {
        return googleApiClient.execute(new com.google.android.gms.internal.nearby.zzcw(this, googleApiClient, str, bArr, googleApiClient.registerListener(messageListener)));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> cancelPayload(com.google.android.gms.common.api.GoogleApiClient googleApiClient, long j) {
        return googleApiClient.execute(new com.google.android.gms.internal.nearby.zzcq(this, googleApiClient, j));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    public final void disconnectFromEndpoint(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        googleApiClient.execute(new com.google.android.gms.internal.nearby.zzcr(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> rejectConnection(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.execute(new com.google.android.gms.internal.nearby.zzdh(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    @java.lang.Deprecated
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> rejectConnectionRequest(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.execute(new com.google.android.gms.internal.nearby.zzcx(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestConnection(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback) {
        return googleApiClient.execute(new com.google.android.gms.internal.nearby.zzdf(this, googleApiClient, str, str2, googleApiClient.registerListener(connectionLifecycleCallback)));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    @java.lang.Deprecated
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> sendConnectionRequest(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2, byte[] bArr, com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback connectionResponseCallback, com.google.android.gms.nearby.connection.Connections.MessageListener messageListener) {
        return googleApiClient.execute(new com.google.android.gms.internal.nearby.zzcv(this, googleApiClient, str, str2, bArr, googleApiClient.registerListener(connectionResponseCallback), googleApiClient.registerListener(messageListener)));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> sendPayload(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, com.google.android.gms.nearby.connection.Payload payload) {
        return googleApiClient.execute(new com.google.android.gms.internal.nearby.zzco(this, googleApiClient, str, payload));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    @java.lang.Deprecated
    public final void sendReliableMessage(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, byte[] bArr) {
        googleApiClient.execute(new com.google.android.gms.internal.nearby.zzcz(this, googleApiClient, str, bArr));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    @java.lang.Deprecated
    public final void sendUnreliableMessage(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, byte[] bArr) {
        googleApiClient.execute(new com.google.android.gms.internal.nearby.zzco(this, googleApiClient, str, com.google.android.gms.nearby.connection.Payload.fromBytes(bArr)));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    @java.lang.Deprecated
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult> startAdvertising(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, com.google.android.gms.nearby.connection.AppMetadata appMetadata, long j, com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener connectionRequestListener) {
        return googleApiClient.execute(new com.google.android.gms.internal.nearby.zzct(this, googleApiClient, str, j, googleApiClient.registerListener(connectionRequestListener)));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    @java.lang.Deprecated
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> startDiscovery(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, long j, com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener endpointDiscoveryListener) {
        return googleApiClient.execute(new com.google.android.gms.internal.nearby.zzcu(this, googleApiClient, str, j, googleApiClient.registerListener(endpointDiscoveryListener)));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    public final void stopAdvertising(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        googleApiClient.execute(new com.google.android.gms.internal.nearby.zzdc(this, googleApiClient));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    public final void stopAllEndpoints(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        googleApiClient.execute(new com.google.android.gms.internal.nearby.zzcs(this, googleApiClient));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    public final void stopDiscovery(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        googleApiClient.execute(new com.google.android.gms.internal.nearby.zzde(this, googleApiClient));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> sendPayload(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List<java.lang.String> list, com.google.android.gms.nearby.connection.Payload payload) {
        return googleApiClient.execute(new com.google.android.gms.internal.nearby.zzcp(this, googleApiClient, list, payload));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    @java.lang.Deprecated
    public final void sendReliableMessage(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List<java.lang.String> list, byte[] bArr) {
        googleApiClient.execute(new com.google.android.gms.internal.nearby.zzda(this, googleApiClient, list, bArr));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    @java.lang.Deprecated
    public final void stopDiscovery(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        googleApiClient.execute(new com.google.android.gms.internal.nearby.zzde(this, googleApiClient));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    @java.lang.Deprecated
    public final void sendUnreliableMessage(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List<java.lang.String> list, byte[] bArr) {
        googleApiClient.execute(new com.google.android.gms.internal.nearby.zzcp(this, googleApiClient, list, com.google.android.gms.nearby.connection.Payload.fromBytes(bArr)));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult> startAdvertising(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback, com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions) {
        return googleApiClient.execute(new com.google.android.gms.internal.nearby.zzdb(this, googleApiClient, str, str2, googleApiClient.registerListener(connectionLifecycleCallback), advertisingOptions));
    }

    @Override // com.google.android.gms.nearby.connection.Connections
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> startDiscovery(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, com.google.android.gms.nearby.connection.EndpointDiscoveryCallback endpointDiscoveryCallback, com.google.android.gms.nearby.connection.DiscoveryOptions discoveryOptions) {
        return googleApiClient.execute(new com.google.android.gms.internal.nearby.zzdd(this, googleApiClient, str, googleApiClient.registerListener(endpointDiscoveryCallback), discoveryOptions));
    }
}
