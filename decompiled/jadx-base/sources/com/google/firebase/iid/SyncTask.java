package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes5.dex */
class SyncTask implements java.lang.Runnable {
    private final com.google.firebase.iid.FirebaseInstanceId iid;
    private final long nextDelaySeconds;
    java.util.concurrent.ExecutorService processorExecutor = com.google.firebase.iid.FirebaseIidExecutors.newCachedSingleThreadExecutor();
    private final android.os.PowerManager.WakeLock syncWakeLock;

    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    static class ConnectivityChangeReceiver extends android.content.BroadcastReceiver {

        @javax.annotation.Nullable
        private com.google.firebase.iid.SyncTask task;

        public ConnectivityChangeReceiver(com.google.firebase.iid.SyncTask syncTask) {
            this.task = syncTask;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            com.google.firebase.iid.SyncTask syncTask = this.task;
            if (syncTask != null && syncTask.isDeviceConnected()) {
                if (com.google.firebase.iid.FirebaseInstanceId.isDebugLogEnabled()) {
                    android.util.Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.task.iid.enqueueTaskWithDelaySeconds(this.task, 0L);
                this.task.getContext().unregisterReceiver(this);
                this.task = null;
            }
        }

        public void registerReceiver() {
            if (com.google.firebase.iid.FirebaseInstanceId.isDebugLogEnabled()) {
                android.util.Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.task.getContext().registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    SyncTask(com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId, long j) {
        this.iid = firebaseInstanceId;
        this.nextDelaySeconds = j;
        android.os.PowerManager.WakeLock wakeLockNewWakeLock = ((android.os.PowerManager) getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.syncWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    android.content.Context getContext() {
        return this.iid.getApp().getApplicationContext();
    }

    boolean isDeviceConnected() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) getContext().getSystemService("connectivity");
        android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean maybeRefreshToken() throws java.io.IOException {
        if (!this.iid.tokenNeedsRefresh(this.iid.getTokenWithoutTriggeringSync())) {
            return true;
        }
        try {
            if (this.iid.blockingGetMasterToken() == null) {
                android.util.Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                android.util.Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (java.io.IOException e) {
            if (!com.google.firebase.iid.GmsRpc.isErrorMessageForRetryableError(e.getMessage())) {
                if (e.getMessage() != null) {
                    throw e;
                }
                android.util.Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 52);
            sb.append("Token retrieval failed: ");
            sb.append(message);
            sb.append(". Will retry token retrieval");
            android.util.Log.w("FirebaseInstanceId", sb.toString());
            return false;
        } catch (java.lang.SecurityException unused) {
            android.util.Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.google.firebase.iid.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
            this.syncWakeLock.acquire();
        }
        try {
            this.iid.setSyncScheduledOrRunning(true);
            if (!this.iid.isGmsCorePresent()) {
                this.iid.setSyncScheduledOrRunning(false);
                if (!com.google.firebase.iid.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                }
            } else if (!com.google.firebase.iid.ServiceStarter.getInstance().hasAccessNetworkStatePermission(getContext()) || isDeviceConnected()) {
                if (maybeRefreshToken()) {
                    this.iid.setSyncScheduledOrRunning(false);
                } else {
                    this.iid.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                }
                if (!com.google.firebase.iid.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                }
            } else {
                new com.google.firebase.iid.SyncTask.ConnectivityChangeReceiver(this).registerReceiver();
                if (!com.google.firebase.iid.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                }
            }
        } catch (java.io.IOException e) {
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            android.util.Log.e("FirebaseInstanceId", sb.toString());
            this.iid.setSyncScheduledOrRunning(false);
            if (!com.google.firebase.iid.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
            }
        } finally {
            if (com.google.firebase.iid.ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                this.syncWakeLock.release();
            }
        }
    }
}
