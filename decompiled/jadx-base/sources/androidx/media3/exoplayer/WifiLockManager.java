package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class WifiLockManager {
    private static final java.lang.String TAG = "WifiLockManager";
    private static final java.lang.String WIFI_LOCK_TAG = "ExoPlayer:WifiLockManager";
    private final android.content.Context applicationContext;
    private boolean enabled;
    private boolean stayAwake;
    private android.net.wifi.WifiManager.WifiLock wifiLock;

    public WifiLockManager(android.content.Context context) {
        this.applicationContext = context.getApplicationContext();
    }

    public void setEnabled(boolean z) {
        if (z && this.wifiLock == null) {
            android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) this.applicationContext.getApplicationContext().getSystemService(com.json.u8.b);
            if (wifiManager == null) {
                androidx.media3.common.util.Log.w(TAG, "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                android.net.wifi.WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, WIFI_LOCK_TAG);
                this.wifiLock = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.enabled = z;
        updateWifiLock();
    }

    public void setStayAwake(boolean z) {
        this.stayAwake = z;
        updateWifiLock();
    }

    private void updateWifiLock() {
        android.net.wifi.WifiManager.WifiLock wifiLock = this.wifiLock;
        if (wifiLock == null) {
            return;
        }
        if (this.enabled && this.stayAwake) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
