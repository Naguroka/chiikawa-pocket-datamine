package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class cs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.net.wifi.WifiManager f695a;
    private android.net.wifi.WifiManager.WifiLock b;
    private boolean c;
    private boolean d;

    public cs(android.content.Context context) {
        this.f695a = (android.net.wifi.WifiManager) context.getApplicationContext().getSystemService(com.json.u8.b);
    }

    public void a(boolean z) {
        if (z && this.b == null) {
            android.net.wifi.WifiManager wifiManager = this.f695a;
            if (wifiManager == null) {
                com.applovin.impl.oc.d("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                android.net.wifi.WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.c = z;
        a();
    }

    public void b(boolean z) {
        this.d = z;
        a();
    }

    private void a() {
        android.net.wifi.WifiManager.WifiLock wifiLock = this.b;
        if (wifiLock == null) {
            return;
        }
        if (this.c && this.d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
