package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class EndpointDiscoveryCallback {
    public abstract void onEndpointFound(java.lang.String str, com.google.android.gms.nearby.connection.DiscoveredEndpointInfo discoveredEndpointInfo);

    public abstract void onEndpointLost(java.lang.String str);
}
