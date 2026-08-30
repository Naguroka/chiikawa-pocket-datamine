package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
final class WakeLockHolder {
    private static final java.lang.String EXTRA_WAKEFUL_INTENT = "com.google.firebase.iid.WakeLockHolder.wakefulintent";
    static final long WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS = java.util.concurrent.TimeUnit.MINUTES.toMillis(1);
    private static final java.lang.Object syncObject = new java.lang.Object();
    private static com.google.android.gms.stats.WakeLock wakeLock;

    WakeLockHolder() {
    }

    private static void checkAndInitWakeLock(android.content.Context context) {
        if (wakeLock == null) {
            com.google.android.gms.stats.WakeLock wakeLock2 = new com.google.android.gms.stats.WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            wakeLock = wakeLock2;
            wakeLock2.setReferenceCounted(true);
        }
    }

    static android.content.ComponentName startWakefulService(android.content.Context context, android.content.Intent intent) {
        synchronized (syncObject) {
            checkAndInitWakeLock(context);
            boolean zIsWakefulIntent = isWakefulIntent(intent);
            setAsWakefulIntent(intent, true);
            android.content.ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!zIsWakefulIntent) {
                wakeLock.acquire(WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
            }
            return componentNameStartService;
        }
    }

    static void sendWakefulServiceIntent(android.content.Context context, com.google.firebase.messaging.WithinAppServiceConnection withinAppServiceConnection, final android.content.Intent intent) {
        synchronized (syncObject) {
            checkAndInitWakeLock(context);
            boolean zIsWakefulIntent = isWakefulIntent(intent);
            setAsWakefulIntent(intent, true);
            if (!zIsWakefulIntent) {
                wakeLock.acquire(WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
            }
            withinAppServiceConnection.sendIntent(intent).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.firebase.messaging.WakeLockHolder$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(com.google.android.gms.tasks.Task task) {
                    com.google.firebase.messaging.WakeLockHolder.completeWakefulIntent(intent);
                }
            });
        }
    }

    private static void setAsWakefulIntent(android.content.Intent intent, boolean z) {
        intent.putExtra(EXTRA_WAKEFUL_INTENT, z);
    }

    static boolean isWakefulIntent(android.content.Intent intent) {
        return intent.getBooleanExtra(EXTRA_WAKEFUL_INTENT, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void completeWakefulIntent(android.content.Intent intent) {
        synchronized (syncObject) {
            if (wakeLock != null && isWakefulIntent(intent)) {
                setAsWakefulIntent(intent, false);
                wakeLock.release();
            }
        }
    }

    static void acquireWakeLock(android.content.Intent intent, long j) {
        synchronized (syncObject) {
            if (wakeLock != null) {
                setAsWakefulIntent(intent, true);
                wakeLock.acquire(j);
            }
        }
    }

    static void initWakeLock(android.content.Context context) {
        synchronized (syncObject) {
            checkAndInitWakeLock(context);
        }
    }

    static void reset() {
        synchronized (syncObject) {
            wakeLock = null;
        }
    }
}
