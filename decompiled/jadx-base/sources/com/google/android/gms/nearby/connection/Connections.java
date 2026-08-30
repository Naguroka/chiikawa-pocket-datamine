package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public interface Connections {

    @java.lang.Deprecated
    public static final long DURATION_INDEFINITE = 0;
    public static final int MAX_BYTES_DATA_SIZE = 32768;

    @java.lang.Deprecated
    public static final int MAX_RELIABLE_MESSAGE_LEN = 4096;

    @java.lang.Deprecated
    public static final int MAX_UNRELIABLE_MESSAGE_LEN = 1168;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    @java.lang.Deprecated
    public static abstract class ConnectionRequestListener {
        public void onConnectionRequest(java.lang.String str, java.lang.String str2, byte[] bArr) {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    @java.lang.Deprecated
    public interface ConnectionResponseCallback {
        void onConnectionResponse(java.lang.String str, com.google.android.gms.common.api.Status status, byte[] bArr);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    @java.lang.Deprecated
    public static abstract class EndpointDiscoveryListener {
        public void onEndpointFound(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        }

        public abstract void onEndpointLost(java.lang.String str);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    @java.lang.Deprecated
    public interface MessageListener {
        @java.lang.Deprecated
        void onDisconnected(java.lang.String str);

        @java.lang.Deprecated
        void onMessageReceived(java.lang.String str, byte[] bArr, boolean z);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public interface StartAdvertisingResult extends com.google.android.gms.common.api.Result {
        java.lang.String getLocalEndpointName();
    }

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> acceptConnection(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, com.google.android.gms.nearby.connection.PayloadCallback payloadCallback);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> acceptConnectionRequest(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, byte[] bArr, com.google.android.gms.nearby.connection.Connections.MessageListener messageListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> cancelPayload(com.google.android.gms.common.api.GoogleApiClient googleApiClient, long j);

    void disconnectFromEndpoint(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> rejectConnection(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> rejectConnectionRequest(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestConnection(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> sendConnectionRequest(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2, byte[] bArr, com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback connectionResponseCallback, com.google.android.gms.nearby.connection.Connections.MessageListener messageListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> sendPayload(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, com.google.android.gms.nearby.connection.Payload payload);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> sendPayload(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List<java.lang.String> list, com.google.android.gms.nearby.connection.Payload payload);

    @java.lang.Deprecated
    void sendReliableMessage(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, byte[] bArr);

    @java.lang.Deprecated
    void sendReliableMessage(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List<java.lang.String> list, byte[] bArr);

    @java.lang.Deprecated
    void sendUnreliableMessage(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, byte[] bArr);

    @java.lang.Deprecated
    void sendUnreliableMessage(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List<java.lang.String> list, byte[] bArr);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult> startAdvertising(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, com.google.android.gms.nearby.connection.AppMetadata appMetadata, long j, com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener connectionRequestListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult> startAdvertising(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback, com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> startDiscovery(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, long j, com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener endpointDiscoveryListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> startDiscovery(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, com.google.android.gms.nearby.connection.EndpointDiscoveryCallback endpointDiscoveryCallback, com.google.android.gms.nearby.connection.DiscoveryOptions discoveryOptions);

    void stopAdvertising(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    void stopAllEndpoints(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    void stopDiscovery(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    @java.lang.Deprecated
    void stopDiscovery(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);
}
