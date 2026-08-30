package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class A extends android.net.ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.NetworkConnectivityNougat f3855a;

    A(com.unity3d.player.NetworkConnectivityNougat networkConnectivityNougat) {
        this.f3855a = networkConnectivityNougat;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        super.onAvailable(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        com.unity3d.player.NetworkConnectivityNougat networkConnectivityNougat;
        int i;
        super.onCapabilitiesChanged(network, networkCapabilities);
        if (networkCapabilities.hasTransport(0)) {
            networkConnectivityNougat = this.f3855a;
            i = 1;
        } else {
            networkConnectivityNougat = this.f3855a;
            i = 2;
        }
        networkConnectivityNougat.b = i;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        super.onLost(network);
        this.f3855a.b = 0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        super.onUnavailable();
        this.f3855a.b = 0;
    }
}
