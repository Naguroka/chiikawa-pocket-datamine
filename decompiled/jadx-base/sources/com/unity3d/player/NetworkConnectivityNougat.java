package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public class NetworkConnectivityNougat extends com.unity3d.player.NetworkConnectivity {
    private int b;
    private final android.net.ConnectivityManager.NetworkCallback c;

    public NetworkConnectivityNougat(android.content.Context context) {
        super(context);
        this.b = 0;
        com.unity3d.player.A a2 = new com.unity3d.player.A(this);
        this.c = a2;
        if (this.f3882a == null) {
            return;
        }
        this.b = super.b();
        this.f3882a.registerDefaultNetworkCallback(a2);
    }

    @Override // com.unity3d.player.NetworkConnectivity
    public final void a() {
        android.net.ConnectivityManager connectivityManager = this.f3882a;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(this.c);
    }

    @Override // com.unity3d.player.NetworkConnectivity
    public final int b() {
        return this.b;
    }
}
