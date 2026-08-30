package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
class SyncTask implements java.lang.Runnable {
    private final com.google.firebase.messaging.FirebaseMessaging firebaseMessaging;
    private final long nextDelaySeconds;
    java.util.concurrent.ExecutorService processorExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 30, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory("firebase-iid-executor"));
    private final android.os.PowerManager.WakeLock syncWakeLock;

    public SyncTask(com.google.firebase.messaging.FirebaseMessaging firebaseMessaging, long j) {
        this.firebaseMessaging = firebaseMessaging;
        this.nextDelaySeconds = j;
        android.os.PowerManager.WakeLock wakeLockNewWakeLock = ((android.os.PowerManager) getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.syncWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.google.firebase.messaging.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
            this.syncWakeLock.acquire();
        }
        try {
            this.firebaseMessaging.setSyncScheduledOrRunning(true);
            if (!this.firebaseMessaging.isGmsCorePresent()) {
                this.firebaseMessaging.setSyncScheduledOrRunning(false);
            } else if (com.google.firebase.messaging.ServiceStarter.getInstance().hasAccessNetworkStatePermission(getContext()) && !isDeviceConnected()) {
                new com.google.firebase.messaging.SyncTask.ConnectivityChangeReceiver(this).registerReceiver();
            } else {
                if (maybeRefreshToken()) {
                    this.firebaseMessaging.setSyncScheduledOrRunning(false);
                } else {
                    this.firebaseMessaging.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                }
            }
        } catch (java.io.IOException e) {
            android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
            this.firebaseMessaging.setSyncScheduledOrRunning(false);
        } finally {
            if (com.google.firebase.messaging.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                this.syncWakeLock.release();
            }
        }
    }

    boolean maybeRefreshToken() throws java.io.IOException {
        try {
            if (this.firebaseMessaging.blockingGetToken() == null) {
                android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Token retrieval failed: null");
                return false;
            }
            if (!android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
                return true;
            }
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Token successfully retrieved");
            return true;
        } catch (java.io.IOException e) {
            if (com.google.firebase.messaging.GmsRpc.isErrorMessageForRetryableError(e.getMessage())) {
                android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                return false;
            }
            if (e.getMessage() == null) {
                android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            throw e;
        } catch (java.lang.SecurityException unused) {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    android.content.Context getContext() {
        return this.firebaseMessaging.getApplicationContext();
    }

    boolean isDeviceConnected() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) getContext().getSystemService("connectivity");
        android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    static class ConnectivityChangeReceiver extends android.content.BroadcastReceiver {
        private android.content.Context receiverContext;
        private com.google.firebase.messaging.SyncTask task;

        public ConnectivityChangeReceiver(com.google.firebase.messaging.SyncTask syncTask) {
            this.task = syncTask;
        }

        public void registerReceiver() {
            if (com.google.firebase.messaging.SyncTask.isDebugLogEnabled()) {
                android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Connectivity change received registered");
            }
            android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            com.google.firebase.messaging.SyncTask syncTask = this.task;
            if (syncTask != null) {
                android.content.Context context = syncTask.getContext();
                this.receiverContext = context;
                context.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            com.google.firebase.messaging.SyncTask syncTask = this.task;
            if (syncTask != null && syncTask.isDeviceConnected()) {
                if (com.google.firebase.messaging.SyncTask.isDebugLogEnabled()) {
                    android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Connectivity changed. Starting background sync.");
                }
                this.task.firebaseMessaging.enqueueTaskWithDelaySeconds(this.task, 0L);
                android.content.Context context2 = this.receiverContext;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.task = null;
            }
        }
    }

    static boolean isDebugLogEnabled() {
        return android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3);
    }
}
