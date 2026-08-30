package com.unity3d.services.core.connectivity;

/* JADX INFO: loaded from: classes6.dex */
public class ConnectivityNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
    private static com.unity3d.services.core.connectivity.ConnectivityNetworkCallback _impl;

    public static synchronized void register() {
        if (_impl == null) {
            _impl = new com.unity3d.services.core.connectivity.ConnectivityNetworkCallback();
            ((android.net.ConnectivityManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("connectivity")).registerNetworkCallback(new android.net.NetworkRequest.Builder().build(), _impl);
        }
    }

    public static synchronized void unregister() {
        if (_impl != null) {
            ((android.net.ConnectivityManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("connectivity")).unregisterNetworkCallback(_impl);
            _impl = null;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        com.unity3d.services.core.connectivity.ConnectivityMonitor.connected();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        com.unity3d.services.core.connectivity.ConnectivityMonitor.disconnected();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        com.unity3d.services.core.connectivity.ConnectivityMonitor.connectionStatusChanged();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) {
        com.unity3d.services.core.connectivity.ConnectivityMonitor.connectionStatusChanged();
    }
}
