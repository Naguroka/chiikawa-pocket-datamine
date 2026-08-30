package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
class InvalidationLiveDataContainer {
    private final androidx.room.RoomDatabase mDatabase;
    final java.util.Set<androidx.lifecycle.LiveData> mLiveDataSet = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());

    InvalidationLiveDataContainer(androidx.room.RoomDatabase roomDatabase) {
        this.mDatabase = roomDatabase;
    }

    <T> androidx.lifecycle.LiveData<T> create(java.lang.String[] strArr, boolean z, java.util.concurrent.Callable<T> callable) {
        return new androidx.room.RoomTrackingLiveData(this.mDatabase, this, z, callable, strArr);
    }

    void onActive(androidx.lifecycle.LiveData liveData) {
        this.mLiveDataSet.add(liveData);
    }

    void onInactive(androidx.lifecycle.LiveData liveData) {
        this.mLiveDataSet.remove(liveData);
    }
}
