package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class WakeLockManager {
    private static final java.lang.String TAG = "WakeLockManager";
    private static final java.lang.String WAKE_LOCK_TAG = "ExoPlayer:WakeLockManager";
    private final android.content.Context applicationContext;
    private boolean enabled;
    private boolean stayAwake;
    private android.os.PowerManager.WakeLock wakeLock;

    public WakeLockManager(android.content.Context context) {
        this.applicationContext = context.getApplicationContext();
    }

    public void setEnabled(boolean z) {
        if (z && this.wakeLock == null) {
            android.os.PowerManager powerManager = (android.os.PowerManager) this.applicationContext.getSystemService("power");
            if (powerManager == null) {
                androidx.media3.common.util.Log.w(TAG, "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                android.os.PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, WAKE_LOCK_TAG);
                this.wakeLock = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.enabled = z;
        updateWakeLock();
    }

    public void setStayAwake(boolean z) {
        this.stayAwake = z;
        updateWakeLock();
    }

    private void updateWakeLock() {
        android.os.PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock == null) {
            return;
        }
        if (this.enabled && this.stayAwake) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
