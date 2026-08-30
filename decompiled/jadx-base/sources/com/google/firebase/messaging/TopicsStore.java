package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
final class TopicsStore {
    private static final java.lang.String DIVIDER_QUEUE_OPERATIONS = ",";
    static final java.lang.String KEY_TOPIC_OPERATIONS_QUEUE = "topic_operation_queue";
    static final java.lang.String PREFERENCES = "com.google.android.gms.appid";
    private static java.lang.ref.WeakReference<com.google.firebase.messaging.TopicsStore> topicsStoreWeakReference;
    private final android.content.SharedPreferences sharedPreferences;
    private final java.util.concurrent.Executor syncExecutor;
    private com.google.firebase.messaging.SharedPreferencesQueue topicOperationsQueue;

    private TopicsStore(android.content.SharedPreferences sharedPreferences, java.util.concurrent.Executor executor) {
        this.syncExecutor = executor;
        this.sharedPreferences = sharedPreferences;
    }

    private synchronized void initStore() {
        this.topicOperationsQueue = com.google.firebase.messaging.SharedPreferencesQueue.createInstance(this.sharedPreferences, KEY_TOPIC_OPERATIONS_QUEUE, DIVIDER_QUEUE_OPERATIONS, this.syncExecutor);
    }

    public static synchronized com.google.firebase.messaging.TopicsStore getInstance(android.content.Context context, java.util.concurrent.Executor executor) {
        com.google.firebase.messaging.TopicsStore topicsStore;
        java.lang.ref.WeakReference<com.google.firebase.messaging.TopicsStore> weakReference = topicsStoreWeakReference;
        topicsStore = weakReference != null ? weakReference.get() : null;
        if (topicsStore == null) {
            topicsStore = new com.google.firebase.messaging.TopicsStore(context.getSharedPreferences(PREFERENCES, 0), executor);
            topicsStore.initStore();
            topicsStoreWeakReference = new java.lang.ref.WeakReference<>(topicsStore);
        }
        return topicsStore;
    }

    static synchronized void clearCaches() {
        java.lang.ref.WeakReference<com.google.firebase.messaging.TopicsStore> weakReference = topicsStoreWeakReference;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    synchronized com.google.firebase.messaging.TopicOperation getNextTopicOperation() {
        return com.google.firebase.messaging.TopicOperation.from(this.topicOperationsQueue.peek());
    }

    synchronized boolean addTopicOperation(com.google.firebase.messaging.TopicOperation topicOperation) {
        return this.topicOperationsQueue.add(topicOperation.serialize());
    }

    synchronized boolean removeTopicOperation(com.google.firebase.messaging.TopicOperation topicOperation) {
        return this.topicOperationsQueue.remove(topicOperation.serialize());
    }

    synchronized com.google.firebase.messaging.TopicOperation pollTopicOperation() {
        try {
        } catch (java.util.NoSuchElementException unused) {
            android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Polling operation queue failed");
            return null;
        }
        return com.google.firebase.messaging.TopicOperation.from(this.topicOperationsQueue.remove());
    }

    synchronized java.util.List<com.google.firebase.messaging.TopicOperation> getOperations() {
        java.util.ArrayList arrayList;
        java.util.List<java.lang.String> list = this.topicOperationsQueue.toList();
        arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.messaging.TopicOperation.from(it.next()));
        }
        return arrayList;
    }

    synchronized void clearTopicOperations() {
        this.topicOperationsQueue.clear();
    }
}
