package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public class NetworkConnectivity extends android.app.Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected android.net.ConnectivityManager f3882a;

    public NetworkConnectivity(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        this.f3882a = connectivityManager;
        if (connectivityManager == null) {
            com.unity3d.player.AbstractC1749z.Log(6, "NetworkConnectivity: ConnectivityManager not found");
        }
    }

    public void a() {
    }

    public int b() {
        android.net.NetworkCapabilities networkCapabilities;
        android.net.ConnectivityManager connectivityManager = this.f3882a;
        if (connectivityManager == null) {
            return 0;
        }
        if (com.unity3d.player.PlatformSupport.MARSHMALLOW_SUPPORT) {
            android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = this.f3882a.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasTransport(0) ? 1 : 2;
            }
        } else {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return activeNetworkInfo.getType() == 0 ? 1 : 2;
            }
        }
        return 0;
    }
}
