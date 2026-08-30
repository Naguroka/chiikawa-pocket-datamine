package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface ConnectionsClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.nearby.connection.ConnectionsOptions> {
    public static final int MAX_BYTES_DATA_SIZE = 32768;

    com.google.android.gms.tasks.Task<java.lang.Void> acceptConnection(java.lang.String str, com.google.android.gms.nearby.connection.PayloadCallback payloadCallback);

    com.google.android.gms.tasks.Task<java.lang.Void> cancelPayload(long j);

    void disconnectFromEndpoint(java.lang.String str);

    com.google.android.gms.tasks.Task<java.lang.Void> rejectConnection(java.lang.String str);

    com.google.android.gms.tasks.Task<java.lang.Void> requestConnection(java.lang.String str, java.lang.String str2, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback);

    com.google.android.gms.tasks.Task<java.lang.Void> requestConnection(java.lang.String str, java.lang.String str2, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback, com.google.android.gms.nearby.connection.ConnectionOptions connectionOptions);

    com.google.android.gms.tasks.Task<java.lang.Void> requestConnection(byte[] bArr, java.lang.String str, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback);

    com.google.android.gms.tasks.Task<java.lang.Void> requestConnection(byte[] bArr, java.lang.String str, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback, com.google.android.gms.nearby.connection.ConnectionOptions connectionOptions);

    com.google.android.gms.tasks.Task<java.lang.Void> sendPayload(java.lang.String str, com.google.android.gms.nearby.connection.Payload payload);

    com.google.android.gms.tasks.Task<java.lang.Void> sendPayload(java.util.List<java.lang.String> list, com.google.android.gms.nearby.connection.Payload payload);

    com.google.android.gms.tasks.Task<java.lang.Void> startAdvertising(java.lang.String str, java.lang.String str2, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback, com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions);

    com.google.android.gms.tasks.Task<java.lang.Void> startAdvertising(byte[] bArr, java.lang.String str, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback, com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions);

    com.google.android.gms.tasks.Task<java.lang.Void> startDiscovery(java.lang.String str, com.google.android.gms.nearby.connection.EndpointDiscoveryCallback endpointDiscoveryCallback, com.google.android.gms.nearby.connection.DiscoveryOptions discoveryOptions);

    void stopAdvertising();

    void stopAllEndpoints();

    void stopDiscovery();
}
