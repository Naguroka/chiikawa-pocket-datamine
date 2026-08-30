package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
class MessageThreadUtil<T> implements androidx.recyclerview.widget.ThreadUtil<T> {
    MessageThreadUtil() {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.MessageThreadUtil$1, reason: invalid class name */
    class AnonymousClass1 implements androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> {
        static final int ADD_TILE = 2;
        static final int REMOVE_TILE = 3;
        static final int UPDATE_ITEM_COUNT = 1;
        final /* synthetic */ androidx.recyclerview.widget.ThreadUtil.MainThreadCallback val$callback;
        final androidx.recyclerview.widget.MessageThreadUtil.MessageQueue mQueue = new androidx.recyclerview.widget.MessageThreadUtil.MessageQueue();
        private final android.os.Handler mMainThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        private java.lang.Runnable mMainThreadRunnable = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.MessageThreadUtil.1.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem next = androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass1.this.mQueue.next();
                while (next != null) {
                    int i = next.what;
                    if (i == 1) {
                        androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass1.this.val$callback.updateItemCount(next.arg1, next.arg2);
                    } else if (i == 2) {
                        androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass1.this.val$callback.addTile(next.arg1, (androidx.recyclerview.widget.TileList.Tile) next.data);
                    } else if (i == 3) {
                        androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass1.this.val$callback.removeTile(next.arg1, next.arg2);
                    } else {
                        android.util.Log.e("ThreadUtil", "Unsupported message, what=" + next.what);
                    }
                    next = androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass1.this.mQueue.next();
                }
            }
        };

        AnonymousClass1(androidx.recyclerview.widget.ThreadUtil.MainThreadCallback mainThreadCallback) {
            this.val$callback = mainThreadCallback;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int i, int i2) {
            sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(1, i, i2));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int i, androidx.recyclerview.widget.TileList.Tile<T> tile) {
            sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(2, i, tile));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int i, int i2) {
            sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(3, i, i2));
        }

        private void sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem) {
            this.mQueue.sendMessage(syncQueueItem);
            this.mMainThreadHandler.post(this.mMainThreadRunnable);
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> getMainThreadProxy(androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> mainThreadCallback) {
        return new androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass1(mainThreadCallback);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.MessageThreadUtil$2, reason: invalid class name */
    class AnonymousClass2 implements androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> {
        static final int LOAD_TILE = 3;
        static final int RECYCLE_TILE = 4;
        static final int REFRESH = 1;
        static final int UPDATE_RANGE = 2;
        final /* synthetic */ androidx.recyclerview.widget.ThreadUtil.BackgroundCallback val$callback;
        final androidx.recyclerview.widget.MessageThreadUtil.MessageQueue mQueue = new androidx.recyclerview.widget.MessageThreadUtil.MessageQueue();
        private final java.util.concurrent.Executor mExecutor = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        java.util.concurrent.atomic.AtomicBoolean mBackgroundRunning = new java.util.concurrent.atomic.AtomicBoolean(false);
        private java.lang.Runnable mBackgroundRunnable = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.MessageThreadUtil.2.1
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem next = androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.mQueue.next();
                    if (next != null) {
                        int i = next.what;
                        if (i == 1) {
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.mQueue.removeMessages(1);
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.val$callback.refresh(next.arg1);
                        } else if (i == 2) {
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.mQueue.removeMessages(2);
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.mQueue.removeMessages(3);
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.val$callback.updateRange(next.arg1, next.arg2, next.arg3, next.arg4, next.arg5);
                        } else if (i == 3) {
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.val$callback.loadTile(next.arg1, next.arg2);
                        } else if (i == 4) {
                            androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.val$callback.recycleTile((androidx.recyclerview.widget.TileList.Tile) next.data);
                        } else {
                            android.util.Log.e("ThreadUtil", "Unsupported message, what=" + next.what);
                        }
                    } else {
                        androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2.this.mBackgroundRunning.set(false);
                        return;
                    }
                }
            }
        };

        AnonymousClass2(androidx.recyclerview.widget.ThreadUtil.BackgroundCallback backgroundCallback) {
            this.val$callback = backgroundCallback;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int i) {
            sendMessageAtFrontOfQueue(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(1, i, (java.lang.Object) null));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int i, int i2, int i3, int i4, int i5) {
            sendMessageAtFrontOfQueue(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(2, i, i2, i3, i4, i5, null));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int i, int i2) {
            sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(3, i, i2));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(androidx.recyclerview.widget.TileList.Tile<T> tile) {
            sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem.obtainMessage(4, 0, tile));
        }

        private void sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem) {
            this.mQueue.sendMessage(syncQueueItem);
            maybeExecuteBackgroundRunnable();
        }

        private void sendMessageAtFrontOfQueue(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem) {
            this.mQueue.sendMessageAtFrontOfQueue(syncQueueItem);
            maybeExecuteBackgroundRunnable();
        }

        private void maybeExecuteBackgroundRunnable() {
            if (this.mBackgroundRunning.compareAndSet(false, true)) {
                this.mExecutor.execute(this.mBackgroundRunnable);
            }
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> getBackgroundProxy(androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> backgroundCallback) {
        return new androidx.recyclerview.widget.MessageThreadUtil.AnonymousClass2(backgroundCallback);
    }

    static class SyncQueueItem {
        private static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem sPool;
        private static final java.lang.Object sPoolLock = new java.lang.Object();
        public int arg1;
        public int arg2;
        public int arg3;
        public int arg4;
        public int arg5;
        public java.lang.Object data;
        androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem next;
        public int what;

        SyncQueueItem() {
        }

        void recycle() {
            this.next = null;
            this.arg5 = 0;
            this.arg4 = 0;
            this.arg3 = 0;
            this.arg2 = 0;
            this.arg1 = 0;
            this.what = 0;
            this.data = null;
            synchronized (sPoolLock) {
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem = sPool;
                if (syncQueueItem != null) {
                    this.next = syncQueueItem;
                }
                sPool = this;
            }
        }

        static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem obtainMessage(int i, int i2, int i3, int i4, int i5, int i6, java.lang.Object obj) {
            androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem;
            synchronized (sPoolLock) {
                syncQueueItem = sPool;
                if (syncQueueItem == null) {
                    syncQueueItem = new androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem();
                } else {
                    sPool = syncQueueItem.next;
                    syncQueueItem.next = null;
                }
                syncQueueItem.what = i;
                syncQueueItem.arg1 = i2;
                syncQueueItem.arg2 = i3;
                syncQueueItem.arg3 = i4;
                syncQueueItem.arg4 = i5;
                syncQueueItem.arg5 = i6;
                syncQueueItem.data = obj;
            }
            return syncQueueItem;
        }

        static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem obtainMessage(int i, int i2, int i3) {
            return obtainMessage(i, i2, i3, 0, 0, 0, null);
        }

        static androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem obtainMessage(int i, int i2, java.lang.Object obj) {
            return obtainMessage(i, i2, 0, 0, 0, 0, obj);
        }
    }

    static class MessageQueue {
        private final java.lang.Object mLock = new java.lang.Object();
        private androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem mRoot;

        MessageQueue() {
        }

        androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem next() {
            synchronized (this.mLock) {
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem = this.mRoot;
                if (syncQueueItem == null) {
                    return null;
                }
                this.mRoot = syncQueueItem.next;
                return syncQueueItem;
            }
        }

        void sendMessageAtFrontOfQueue(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem) {
            synchronized (this.mLock) {
                syncQueueItem.next = this.mRoot;
                this.mRoot = syncQueueItem;
            }
        }

        void sendMessage(androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem) {
            synchronized (this.mLock) {
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem2 = this.mRoot;
                if (syncQueueItem2 == null) {
                    this.mRoot = syncQueueItem;
                    return;
                }
                while (syncQueueItem2.next != null) {
                    syncQueueItem2 = syncQueueItem2.next;
                }
                syncQueueItem2.next = syncQueueItem;
            }
        }

        void removeMessages(int i) {
            synchronized (this.mLock) {
                while (true) {
                    androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem = this.mRoot;
                    if (syncQueueItem == null || syncQueueItem.what != i) {
                        break;
                    }
                    androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem2 = this.mRoot;
                    this.mRoot = syncQueueItem2.next;
                    syncQueueItem2.recycle();
                }
                androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem3 = this.mRoot;
                if (syncQueueItem3 != null) {
                    androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem4 = syncQueueItem3.next;
                    while (syncQueueItem4 != null) {
                        androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem syncQueueItem5 = syncQueueItem4.next;
                        if (syncQueueItem4.what == i) {
                            syncQueueItem3.next = syncQueueItem5;
                            syncQueueItem4.recycle();
                        } else {
                            syncQueueItem3 = syncQueueItem4;
                        }
                        syncQueueItem4 = syncQueueItem5;
                    }
                }
            }
        }
    }
}
