package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
class TopicsSyncTask implements java.lang.Runnable {
    private static final java.lang.Object TOPIC_SYNC_TASK_LOCK = new java.lang.Object();
    private static java.lang.Boolean hasAccessNetworkStatePermission;
    private static java.lang.Boolean hasWakeLockPermission;
    private final android.content.Context context;
    private final com.google.firebase.messaging.Metadata metadata;
    private final long nextDelaySeconds;
    private final android.os.PowerManager.WakeLock syncWakeLock;
    private final com.google.firebase.messaging.TopicsSubscriber topicsSubscriber;

    TopicsSyncTask(com.google.firebase.messaging.TopicsSubscriber topicsSubscriber, android.content.Context context, com.google.firebase.messaging.Metadata metadata, long j) {
        this.topicsSubscriber = topicsSubscriber;
        this.context = context;
        this.nextDelaySeconds = j;
        this.metadata = metadata;
        this.syncWakeLock = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(1, com.google.firebase.messaging.Constants.FCM_WAKE_LOCK);
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.PowerManager.WakeLock wakeLock;
        if (hasWakeLockPermission(this.context)) {
            this.syncWakeLock.acquire(com.google.firebase.messaging.Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            try {
                try {
                    this.topicsSubscriber.setSyncScheduledOrRunning(true);
                    if (!this.metadata.isGmscorePresent()) {
                        this.topicsSubscriber.setSyncScheduledOrRunning(false);
                        if (hasWakeLockPermission(this.context)) {
                            try {
                                this.syncWakeLock.release();
                                return;
                            } catch (java.lang.RuntimeException unused) {
                                android.util.Log.i(com.google.firebase.messaging.Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (hasAccessNetworkStatePermission(this.context) && !isDeviceConnected()) {
                        new com.google.firebase.messaging.TopicsSyncTask.ConnectivityChangeReceiver(this).registerReceiver();
                        if (hasWakeLockPermission(this.context)) {
                            try {
                                this.syncWakeLock.release();
                                return;
                            } catch (java.lang.RuntimeException unused2) {
                                android.util.Log.i(com.google.firebase.messaging.Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (this.topicsSubscriber.syncTopics()) {
                        this.topicsSubscriber.setSyncScheduledOrRunning(false);
                    } else {
                        this.topicsSubscriber.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                    }
                    if (hasWakeLockPermission(this.context)) {
                        wakeLock = this.syncWakeLock;
                        wakeLock.release();
                    }
                } catch (java.io.IOException e) {
                    android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    this.topicsSubscriber.setSyncScheduledOrRunning(false);
                    if (!hasWakeLockPermission(this.context)) {
                    } else {
                        wakeLock = this.syncWakeLock;
                    }
                }
            } catch (java.lang.Throwable th) {
                if (hasWakeLockPermission(this.context)) {
                    try {
                        this.syncWakeLock.release();
                    } catch (java.lang.RuntimeException unused3) {
                        android.util.Log.i(com.google.firebase.messaging.Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (java.lang.RuntimeException unused4) {
            android.util.Log.i(com.google.firebase.messaging.Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean isDeviceConnected() {
        android.net.NetworkInfo activeNetworkInfo;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.context.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isLoggable() {
        return android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3);
    }

    private static boolean hasWakeLockPermission(android.content.Context context) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            java.lang.Boolean bool = hasWakeLockPermission;
            if (bool == null) {
                zBooleanValue = hasPermission(context, "android.permission.WAKE_LOCK", bool);
            } else {
                zBooleanValue = bool.booleanValue();
            }
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zBooleanValue);
            hasWakeLockPermission = boolValueOf;
            zBooleanValue2 = boolValueOf.booleanValue();
        }
        return zBooleanValue2;
    }

    private static boolean hasAccessNetworkStatePermission(android.content.Context context) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            java.lang.Boolean bool = hasAccessNetworkStatePermission;
            if (bool == null) {
                zBooleanValue = hasPermission(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                zBooleanValue = bool.booleanValue();
            }
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zBooleanValue);
            hasAccessNetworkStatePermission = boolValueOf;
            zBooleanValue2 = boolValueOf.booleanValue();
        }
        return zBooleanValue2;
    }

    private static boolean hasPermission(android.content.Context context, java.lang.String str, java.lang.Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, createPermissionMissingLog(str));
        }
        return z;
    }

    private static java.lang.String createPermissionMissingLog(java.lang.String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    class ConnectivityChangeReceiver extends android.content.BroadcastReceiver {
        private com.google.firebase.messaging.TopicsSyncTask task;

        public ConnectivityChangeReceiver(com.google.firebase.messaging.TopicsSyncTask topicsSyncTask) {
            this.task = topicsSyncTask;
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(android.content.Context context, android.content.Intent intent) {
            com.google.firebase.messaging.TopicsSyncTask topicsSyncTask = this.task;
            if (topicsSyncTask == null) {
                return;
            }
            if (topicsSyncTask.isDeviceConnected()) {
                if (com.google.firebase.messaging.TopicsSyncTask.isLoggable()) {
                    android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Connectivity changed. Starting background sync.");
                }
                this.task.topicsSubscriber.scheduleSyncTaskWithDelaySeconds(this.task, 0L);
                context.unregisterReceiver(this);
                this.task = null;
            }
        }

        public void registerReceiver() {
            if (com.google.firebase.messaging.TopicsSyncTask.isLoggable()) {
                android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Connectivity change received registered");
            }
            com.google.firebase.messaging.TopicsSyncTask.this.context.registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }
}
