package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
final class SharedPreferencesQueue {
    private final java.lang.String itemSeparator;
    private final java.lang.String queueName;
    private final android.content.SharedPreferences sharedPreferences;
    private final java.util.concurrent.Executor syncExecutor;
    final java.util.ArrayDeque<java.lang.String> internalQueue = new java.util.ArrayDeque<>();
    private boolean bulkOperation = false;

    private SharedPreferencesQueue(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2, java.util.concurrent.Executor executor) {
        this.sharedPreferences = sharedPreferences;
        this.queueName = str;
        this.itemSeparator = str2;
        this.syncExecutor = executor;
    }

    static com.google.firebase.messaging.SharedPreferencesQueue createInstance(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2, java.util.concurrent.Executor executor) {
        com.google.firebase.messaging.SharedPreferencesQueue sharedPreferencesQueue = new com.google.firebase.messaging.SharedPreferencesQueue(sharedPreferences, str, str2, executor);
        sharedPreferencesQueue.initQueue();
        return sharedPreferencesQueue;
    }

    private void initQueue() {
        synchronized (this.internalQueue) {
            this.internalQueue.clear();
            java.lang.String string = this.sharedPreferences.getString(this.queueName, "");
            if (!android.text.TextUtils.isEmpty(string) && string.contains(this.itemSeparator)) {
                java.lang.String[] strArrSplit = string.split(this.itemSeparator, -1);
                if (strArrSplit.length == 0) {
                    android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (java.lang.String str : strArrSplit) {
                    if (!android.text.TextUtils.isEmpty(str)) {
                        this.internalQueue.add(str);
                    }
                }
            }
        }
    }

    public java.util.List<java.lang.String> toList() {
        java.util.ArrayList arrayList;
        synchronized (this.internalQueue) {
            arrayList = new java.util.ArrayList(this.internalQueue);
        }
        return arrayList;
    }

    public boolean add(java.lang.String str) {
        boolean zCheckAndSyncState;
        if (android.text.TextUtils.isEmpty(str) || str.contains(this.itemSeparator)) {
            return false;
        }
        synchronized (this.internalQueue) {
            zCheckAndSyncState = checkAndSyncState(this.internalQueue.add(str));
        }
        return zCheckAndSyncState;
    }

    private java.lang.String checkAndSyncState(java.lang.String str) {
        checkAndSyncState(str != null);
        return str;
    }

    private boolean checkAndSyncState(boolean z) {
        if (z && !this.bulkOperation) {
            syncStateAsync();
        }
        return z;
    }

    private void syncStateAsync() {
        this.syncExecutor.execute(new java.lang.Runnable() { // from class: com.google.firebase.messaging.SharedPreferencesQueue$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.syncState();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncState() {
        synchronized (this.internalQueue) {
            this.sharedPreferences.edit().putString(this.queueName, serialize()).commit();
        }
    }

    public java.lang.String serialize() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<java.lang.String> it = this.internalQueue.iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append(this.itemSeparator);
        }
        return sb.toString();
    }

    public void beginTransaction() {
        this.bulkOperation = true;
    }

    void beginTransactionSync() {
        synchronized (this.internalQueue) {
            beginTransaction();
        }
    }

    public void commitTransaction() {
        this.bulkOperation = false;
        syncStateAsync();
    }

    void commitTransactionSync() {
        synchronized (this.internalQueue) {
            commitTransaction();
        }
    }

    public java.lang.String serializeSync() {
        java.lang.String strSerialize;
        synchronized (this.internalQueue) {
            strSerialize = serialize();
        }
        return strSerialize;
    }

    public boolean remove(java.lang.Object obj) {
        boolean zCheckAndSyncState;
        synchronized (this.internalQueue) {
            zCheckAndSyncState = checkAndSyncState(this.internalQueue.remove(obj));
        }
        return zCheckAndSyncState;
    }

    public java.lang.String remove() {
        java.lang.String strCheckAndSyncState;
        synchronized (this.internalQueue) {
            strCheckAndSyncState = checkAndSyncState(this.internalQueue.remove());
        }
        return strCheckAndSyncState;
    }

    public void clear() {
        synchronized (this.internalQueue) {
            this.internalQueue.clear();
            checkAndSyncState(true);
        }
    }

    public java.lang.String peek() {
        java.lang.String strPeek;
        synchronized (this.internalQueue) {
            strPeek = this.internalQueue.peek();
        }
        return strPeek;
    }

    public int size() {
        int size;
        synchronized (this.internalQueue) {
            size = this.internalQueue.size();
        }
        return size;
    }
}
