package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
class RoomTrackingLiveData<T> extends androidx.lifecycle.LiveData<T> {
    final java.util.concurrent.Callable<T> mComputeFunction;
    private final androidx.room.InvalidationLiveDataContainer mContainer;
    final androidx.room.RoomDatabase mDatabase;
    final boolean mInTransaction;
    final androidx.room.InvalidationTracker.Observer mObserver;
    final java.util.concurrent.atomic.AtomicBoolean mInvalid = new java.util.concurrent.atomic.AtomicBoolean(true);
    final java.util.concurrent.atomic.AtomicBoolean mComputing = new java.util.concurrent.atomic.AtomicBoolean(false);
    final java.util.concurrent.atomic.AtomicBoolean mRegisteredObserver = new java.util.concurrent.atomic.AtomicBoolean(false);
    final java.lang.Runnable mRefreshRunnable = new java.lang.Runnable() { // from class: androidx.room.RoomTrackingLiveData.1
        /* JADX WARN: Bottom block not found for handler: all -> 0x0053 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean z;
            if (androidx.room.RoomTrackingLiveData.this.mRegisteredObserver.compareAndSet(false, true)) {
                androidx.room.RoomTrackingLiveData.this.mDatabase.getInvalidationTracker().addWeakObserver(androidx.room.RoomTrackingLiveData.this.mObserver);
            }
            do {
                if (androidx.room.RoomTrackingLiveData.this.mComputing.compareAndSet(false, true)) {
                    T tCall = null;
                    z = false;
                    while (androidx.room.RoomTrackingLiveData.this.mInvalid.compareAndSet(true, false)) {
                        try {
                            tCall = androidx.room.RoomTrackingLiveData.this.mComputeFunction.call();
                            z = true;
                        } catch (java.lang.Exception e) {
                            throw new java.lang.RuntimeException("Exception while computing database live data.", e);
                        }
                    }
                    if (z) {
                        androidx.room.RoomTrackingLiveData.this.postValue(tCall);
                    }
                    androidx.room.RoomTrackingLiveData.this.mComputing.set(false);
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (androidx.room.RoomTrackingLiveData.this.mInvalid.get());
        }
    };
    final java.lang.Runnable mInvalidationRunnable = new java.lang.Runnable() { // from class: androidx.room.RoomTrackingLiveData.2
        @Override // java.lang.Runnable
        public void run() {
            boolean zHasActiveObservers = androidx.room.RoomTrackingLiveData.this.hasActiveObservers();
            if (androidx.room.RoomTrackingLiveData.this.mInvalid.compareAndSet(false, true) && zHasActiveObservers) {
                androidx.room.RoomTrackingLiveData.this.getQueryExecutor().execute(androidx.room.RoomTrackingLiveData.this.mRefreshRunnable);
            }
        }
    };

    RoomTrackingLiveData(androidx.room.RoomDatabase roomDatabase, androidx.room.InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, java.util.concurrent.Callable<T> callable, java.lang.String[] strArr) {
        this.mDatabase = roomDatabase;
        this.mInTransaction = z;
        this.mComputeFunction = callable;
        this.mContainer = invalidationLiveDataContainer;
        this.mObserver = new androidx.room.InvalidationTracker.Observer(strArr) { // from class: androidx.room.RoomTrackingLiveData.3
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(java.util.Set<java.lang.String> set) {
                androidx.arch.core.executor.ArchTaskExecutor.getInstance().executeOnMainThread(androidx.room.RoomTrackingLiveData.this.mInvalidationRunnable);
            }
        };
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
        super.onActive();
        this.mContainer.onActive(this);
        getQueryExecutor().execute(this.mRefreshRunnable);
    }

    @Override // androidx.lifecycle.LiveData
    protected void onInactive() {
        super.onInactive();
        this.mContainer.onInactive(this);
    }

    java.util.concurrent.Executor getQueryExecutor() {
        if (this.mInTransaction) {
            return this.mDatabase.getTransactionExecutor();
        }
        return this.mDatabase.getQueryExecutor();
    }
}
