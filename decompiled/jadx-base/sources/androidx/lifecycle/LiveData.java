package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {
    static final java.lang.Object NOT_SET = new java.lang.Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile java.lang.Object mData;
    final java.lang.Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.Observer<? super T>, androidx.lifecycle.LiveData<T>.ObserverWrapper> mObservers;
    volatile java.lang.Object mPendingData;
    private final java.lang.Runnable mPostValueRunnable;
    private int mVersion;

    protected void onActive() {
    }

    protected void onInactive() {
    }

    public LiveData(T t) {
        this.mDataLock = new java.lang.Object();
        this.mObservers = new androidx.arch.core.internal.SafeIterableMap<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new java.lang.Runnable() { // from class: androidx.lifecycle.LiveData.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                java.lang.Object obj;
                synchronized (androidx.lifecycle.LiveData.this.mDataLock) {
                    obj = androidx.lifecycle.LiveData.this.mPendingData;
                    androidx.lifecycle.LiveData.this.mPendingData = androidx.lifecycle.LiveData.NOT_SET;
                }
                androidx.lifecycle.LiveData.this.setValue(obj);
            }
        };
        this.mData = t;
        this.mVersion = 0;
    }

    public LiveData() {
        this.mDataLock = new java.lang.Object();
        this.mObservers = new androidx.arch.core.internal.SafeIterableMap<>();
        this.mActiveCount = 0;
        java.lang.Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new java.lang.Runnable() { // from class: androidx.lifecycle.LiveData.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                java.lang.Object obj2;
                synchronized (androidx.lifecycle.LiveData.this.mDataLock) {
                    obj2 = androidx.lifecycle.LiveData.this.mPendingData;
                    androidx.lifecycle.LiveData.this.mPendingData = androidx.lifecycle.LiveData.NOT_SET;
                }
                androidx.lifecycle.LiveData.this.setValue(obj2);
            }
        };
        this.mData = obj;
        this.mVersion = -1;
    }

    private void considerNotify(androidx.lifecycle.LiveData<T>.ObserverWrapper observerWrapper) {
        if (observerWrapper.mActive) {
            if (!observerWrapper.shouldBeActive()) {
                observerWrapper.activeStateChanged(false);
                return;
            }
            int i = observerWrapper.mLastVersion;
            int i2 = this.mVersion;
            if (i >= i2) {
                return;
            }
            observerWrapper.mLastVersion = i2;
            observerWrapper.mObserver.onChanged((java.lang.Object) this.mData);
        }
    }

    void dispatchingValue(androidx.lifecycle.LiveData<T>.ObserverWrapper observerWrapper) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (observerWrapper != null) {
                considerNotify(observerWrapper);
                observerWrapper = null;
            } else {
                androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.Observer<? super T>, androidx.lifecycle.LiveData<T>.ObserverWrapper>.IteratorWithAdditions iteratorWithAdditions = this.mObservers.iteratorWithAdditions();
                while (iteratorWithAdditions.hasNext()) {
                    considerNotify((androidx.lifecycle.LiveData.ObserverWrapper) iteratorWithAdditions.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public void observe(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Observer<? super T> observer) {
        assertMainThread("observe");
        if (lifecycleOwner.getLifecycle().getCurrentState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            return;
        }
        androidx.lifecycle.LiveData.LifecycleBoundObserver lifecycleBoundObserver = new androidx.lifecycle.LiveData.LifecycleBoundObserver(lifecycleOwner, observer);
        androidx.lifecycle.LiveData<T>.ObserverWrapper observerWrapperPutIfAbsent = this.mObservers.putIfAbsent(observer, lifecycleBoundObserver);
        if (observerWrapperPutIfAbsent != null && !observerWrapperPutIfAbsent.isAttachedTo(lifecycleOwner)) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapperPutIfAbsent != null) {
            return;
        }
        lifecycleOwner.getLifecycle().addObserver(lifecycleBoundObserver);
    }

    public void observeForever(androidx.lifecycle.Observer<? super T> observer) {
        assertMainThread("observeForever");
        androidx.lifecycle.LiveData.AlwaysActiveObserver alwaysActiveObserver = new androidx.lifecycle.LiveData.AlwaysActiveObserver(observer);
        androidx.lifecycle.LiveData<T>.ObserverWrapper observerWrapperPutIfAbsent = this.mObservers.putIfAbsent(observer, alwaysActiveObserver);
        if (observerWrapperPutIfAbsent instanceof androidx.lifecycle.LiveData.LifecycleBoundObserver) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapperPutIfAbsent != null) {
            return;
        }
        alwaysActiveObserver.activeStateChanged(true);
    }

    public void removeObserver(androidx.lifecycle.Observer<? super T> observer) {
        assertMainThread("removeObserver");
        androidx.lifecycle.LiveData<T>.ObserverWrapper observerWrapperRemove = this.mObservers.remove(observer);
        if (observerWrapperRemove == null) {
            return;
        }
        observerWrapperRemove.detachObserver();
        observerWrapperRemove.activeStateChanged(false);
    }

    public void removeObservers(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        assertMainThread("removeObservers");
        for (java.util.Map.Entry<androidx.lifecycle.Observer<? super T>, androidx.lifecycle.LiveData<T>.ObserverWrapper> entry : this.mObservers) {
            if (entry.getValue().isAttachedTo(lifecycleOwner)) {
                removeObserver(entry.getKey());
            }
        }
    }

    protected void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = t;
        }
        if (z) {
            androidx.arch.core.executor.ArchTaskExecutor.getInstance().postToMainThread(this.mPostValueRunnable);
        }
    }

    protected void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }

    public T getValue() {
        T t = (T) this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    int getVersion() {
        return this.mVersion;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    void changeActiveCounter(int i) {
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i3 = this.mActiveCount;
                if (i2 == i3) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    onActive();
                } else if (z2) {
                    onInactive();
                }
                i2 = i3;
            } catch (java.lang.Throwable th) {
                this.mChangingActiveState = false;
                throw th;
            }
        }
    }

    class LifecycleBoundObserver extends androidx.lifecycle.LiveData<T>.ObserverWrapper implements androidx.lifecycle.LifecycleEventObserver {
        final androidx.lifecycle.LifecycleOwner mOwner;

        LifecycleBoundObserver(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Observer<? super T> observer) {
            super(observer);
            this.mOwner = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        boolean shouldBeActive() {
            return this.mOwner.getLifecycle().getCurrentState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
            androidx.lifecycle.Lifecycle.State currentState = this.mOwner.getLifecycle().getCurrentState();
            if (currentState == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                androidx.lifecycle.LiveData.this.removeObserver(this.mObserver);
                return;
            }
            androidx.lifecycle.Lifecycle.State state = null;
            while (state != currentState) {
                activeStateChanged(shouldBeActive());
                state = currentState;
                currentState = this.mOwner.getLifecycle().getCurrentState();
            }
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        boolean isAttachedTo(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
            return this.mOwner == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        void detachObserver() {
            this.mOwner.getLifecycle().removeObserver(this);
        }
    }

    private abstract class ObserverWrapper {
        boolean mActive;
        int mLastVersion = -1;
        final androidx.lifecycle.Observer<? super T> mObserver;

        void detachObserver() {
        }

        boolean isAttachedTo(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
            return false;
        }

        abstract boolean shouldBeActive();

        ObserverWrapper(androidx.lifecycle.Observer<? super T> observer) {
            this.mObserver = observer;
        }

        void activeStateChanged(boolean z) {
            if (z == this.mActive) {
                return;
            }
            this.mActive = z;
            androidx.lifecycle.LiveData.this.changeActiveCounter(z ? 1 : -1);
            if (this.mActive) {
                androidx.lifecycle.LiveData.this.dispatchingValue(this);
            }
        }
    }

    private class AlwaysActiveObserver extends androidx.lifecycle.LiveData<T>.ObserverWrapper {
        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        boolean shouldBeActive() {
            return true;
        }

        AlwaysActiveObserver(androidx.lifecycle.Observer<? super T> observer) {
            super(observer);
        }
    }

    static void assertMainThread(java.lang.String str) {
        if (!androidx.arch.core.executor.ArchTaskExecutor.getInstance().isMainThread()) {
            throw new java.lang.IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }
}
