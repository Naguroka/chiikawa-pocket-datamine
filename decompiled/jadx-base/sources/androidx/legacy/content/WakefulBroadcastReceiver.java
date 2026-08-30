package androidx.legacy.content;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class WakefulBroadcastReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String EXTRA_WAKE_LOCK_ID = "androidx.contentpager.content.wakelockid";
    private static final android.util.SparseArray<android.os.PowerManager.WakeLock> sActiveWakeLocks = new android.util.SparseArray<>();
    private static int mNextId = 1;

    public static android.content.ComponentName startWakefulService(android.content.Context context, android.content.Intent intent) {
        android.util.SparseArray<android.os.PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            int i = mNextId;
            int i2 = i + 1;
            mNextId = i2;
            if (i2 <= 0) {
                mNextId = 1;
            }
            intent.putExtra(EXTRA_WAKE_LOCK_ID, i);
            android.content.ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            android.os.PowerManager.WakeLock wakeLockNewWakeLock = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(60000L);
            sparseArray.put(i, wakeLockNewWakeLock);
            return componentNameStartService;
        }
    }

    public static boolean completeWakefulIntent(android.content.Intent intent) {
        int intExtra = intent.getIntExtra(EXTRA_WAKE_LOCK_ID, 0);
        if (intExtra == 0) {
            return false;
        }
        android.util.SparseArray<android.os.PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            android.os.PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            android.util.Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }
}
