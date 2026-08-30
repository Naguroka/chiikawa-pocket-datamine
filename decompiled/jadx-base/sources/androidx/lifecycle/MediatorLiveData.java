package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class MediatorLiveData<T> extends androidx.lifecycle.MutableLiveData<T> {
    private androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData.Source<?>> mSources;

    public MediatorLiveData() {
        this.mSources = new androidx.arch.core.internal.SafeIterableMap<>();
    }

    public MediatorLiveData(T t) {
        super(t);
        this.mSources = new androidx.arch.core.internal.SafeIterableMap<>();
    }

    public <S> void addSource(androidx.lifecycle.LiveData<S> liveData, androidx.lifecycle.Observer<? super S> observer) {
        if (liveData == null) {
            throw new java.lang.NullPointerException("source cannot be null");
        }
        androidx.lifecycle.MediatorLiveData.Source<?> source = new androidx.lifecycle.MediatorLiveData.Source<>(liveData, observer);
        androidx.lifecycle.MediatorLiveData.Source<?> sourcePutIfAbsent = this.mSources.putIfAbsent(liveData, source);
        if (sourcePutIfAbsent != null && sourcePutIfAbsent.mObserver != observer) {
            throw new java.lang.IllegalArgumentException("This source was already added with the different observer");
        }
        if (sourcePutIfAbsent == null && hasActiveObservers()) {
            source.plug();
        }
    }

    public <S> void removeSource(androidx.lifecycle.LiveData<S> liveData) {
        androidx.lifecycle.MediatorLiveData.Source<?> sourceRemove = this.mSources.remove(liveData);
        if (sourceRemove != null) {
            sourceRemove.unplug();
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
        java.util.Iterator<java.util.Map.Entry<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData.Source<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            it.next().getValue().plug();
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void onInactive() {
        java.util.Iterator<java.util.Map.Entry<androidx.lifecycle.LiveData<?>, androidx.lifecycle.MediatorLiveData.Source<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            it.next().getValue().unplug();
        }
    }

    private static class Source<V> implements androidx.lifecycle.Observer<V> {
        final androidx.lifecycle.LiveData<V> mLiveData;
        final androidx.lifecycle.Observer<? super V> mObserver;
        int mVersion = -1;

        Source(androidx.lifecycle.LiveData<V> liveData, androidx.lifecycle.Observer<? super V> observer) {
            this.mLiveData = liveData;
            this.mObserver = observer;
        }

        void plug() {
            this.mLiveData.observeForever(this);
        }

        void unplug() {
            this.mLiveData.removeObserver(this);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(V v) {
            if (this.mVersion != this.mLiveData.getVersion()) {
                this.mVersion = this.mLiveData.getVersion();
                this.mObserver.onChanged(v);
            }
        }
    }
}
