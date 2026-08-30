package com.unity3d.services.core.connectivity;

/* JADX INFO: loaded from: classes6.dex */
public class ConnectivityChangeReceiver extends android.content.BroadcastReceiver {
    private static com.unity3d.services.core.connectivity.ConnectivityChangeReceiver _receiver;

    public static void register() {
        if (_receiver == null) {
            _receiver = new com.unity3d.services.core.connectivity.ConnectivityChangeReceiver();
            com.unity3d.services.core.properties.ClientProperties.getApplicationContext().registerReceiver(_receiver, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public static void unregister() {
        if (_receiver != null) {
            com.unity3d.services.core.properties.ClientProperties.getApplicationContext().unregisterReceiver(_receiver);
            _receiver = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.net.NetworkInfo activeNetworkInfo;
        if (intent.getBooleanExtra("noConnectivity", false)) {
            com.unity3d.services.core.connectivity.ConnectivityMonitor.disconnected();
            return;
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return;
        }
        com.unity3d.services.core.connectivity.ConnectivityMonitor.connected();
    }
}
