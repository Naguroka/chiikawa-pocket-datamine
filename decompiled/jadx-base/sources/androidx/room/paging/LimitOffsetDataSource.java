package androidx.room.paging;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LimitOffsetDataSource<T> extends androidx.paging.PositionalDataSource<T> {
    private final java.lang.String mCountQuery;
    private final androidx.room.RoomDatabase mDb;
    private final boolean mInTransaction;
    private final java.lang.String mLimitOffsetQuery;
    private final androidx.room.InvalidationTracker.Observer mObserver;
    private final androidx.room.RoomSQLiteQuery mSourceQuery;

    protected abstract java.util.List<T> convertRows(android.database.Cursor cursor);

    protected LimitOffsetDataSource(androidx.room.RoomDatabase roomDatabase, androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery, boolean z, java.lang.String... strArr) {
        this(roomDatabase, androidx.room.RoomSQLiteQuery.copyFrom(supportSQLiteQuery), z, strArr);
    }

    protected LimitOffsetDataSource(androidx.room.RoomDatabase roomDatabase, androidx.room.RoomSQLiteQuery roomSQLiteQuery, boolean z, java.lang.String... strArr) {
        this.mDb = roomDatabase;
        this.mSourceQuery = roomSQLiteQuery;
        this.mInTransaction = z;
        this.mCountQuery = "SELECT COUNT(*) FROM ( " + roomSQLiteQuery.getSql() + " )";
        this.mLimitOffsetQuery = "SELECT * FROM ( " + roomSQLiteQuery.getSql() + " ) LIMIT ? OFFSET ?";
        androidx.room.InvalidationTracker.Observer observer = new androidx.room.InvalidationTracker.Observer(strArr) { // from class: androidx.room.paging.LimitOffsetDataSource.1
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(java.util.Set<java.lang.String> set) {
                androidx.room.paging.LimitOffsetDataSource.this.invalidate();
            }
        };
        this.mObserver = observer;
        roomDatabase.getInvalidationTracker().addWeakObserver(observer);
    }

    public int countItems() {
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire(this.mCountQuery, this.mSourceQuery.getArgCount());
        roomSQLiteQueryAcquire.copyArgumentsFrom(this.mSourceQuery);
        android.database.Cursor cursorQuery = this.mDb.query(roomSQLiteQueryAcquire);
        try {
            if (cursorQuery.moveToFirst()) {
                return cursorQuery.getInt(0);
            }
            return 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    public boolean isInvalid() {
        this.mDb.getInvalidationTracker().refreshVersionsSync();
        return super.isInvalid();
    }

    public void loadInitial(androidx.paging.PositionalDataSource.LoadInitialParams loadInitialParams, androidx.paging.PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) throws java.lang.Throwable {
        androidx.room.RoomSQLiteQuery sQLiteQuery;
        int i;
        androidx.room.RoomSQLiteQuery roomSQLiteQuery;
        java.util.List<T> listEmptyList = java.util.Collections.emptyList();
        this.mDb.beginTransaction();
        android.database.Cursor cursorQuery = null;
        try {
            int iCountItems = countItems();
            if (iCountItems != 0) {
                int iComputeInitialLoadPosition = computeInitialLoadPosition(loadInitialParams, iCountItems);
                sQLiteQuery = getSQLiteQuery(iComputeInitialLoadPosition, computeInitialLoadSize(loadInitialParams, iComputeInitialLoadPosition, iCountItems));
                try {
                    cursorQuery = this.mDb.query(sQLiteQuery);
                    java.util.List<T> listConvertRows = convertRows(cursorQuery);
                    this.mDb.setTransactionSuccessful();
                    roomSQLiteQuery = sQLiteQuery;
                    i = iComputeInitialLoadPosition;
                    listEmptyList = listConvertRows;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    this.mDb.endTransaction();
                    if (sQLiteQuery != null) {
                        sQLiteQuery.release();
                    }
                    throw th;
                }
            } else {
                i = 0;
                roomSQLiteQuery = null;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            this.mDb.endTransaction();
            if (roomSQLiteQuery != null) {
                roomSQLiteQuery.release();
            }
            loadInitialCallback.onResult(listEmptyList, i, iCountItems);
        } catch (java.lang.Throwable th2) {
            th = th2;
            sQLiteQuery = null;
        }
    }

    public void loadRange(androidx.paging.PositionalDataSource.LoadRangeParams loadRangeParams, androidx.paging.PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(loadRange(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    public java.util.List<T> loadRange(int i, int i2) {
        androidx.room.RoomSQLiteQuery sQLiteQuery = getSQLiteQuery(i, i2);
        if (this.mInTransaction) {
            this.mDb.beginTransaction();
            android.database.Cursor cursorQuery = null;
            try {
                cursorQuery = this.mDb.query(sQLiteQuery);
                java.util.List<T> listConvertRows = convertRows(cursorQuery);
                this.mDb.setTransactionSuccessful();
                return listConvertRows;
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                this.mDb.endTransaction();
                sQLiteQuery.release();
            }
        }
        android.database.Cursor cursorQuery2 = this.mDb.query(sQLiteQuery);
        try {
            return convertRows(cursorQuery2);
        } finally {
            cursorQuery2.close();
            sQLiteQuery.release();
        }
    }

    private androidx.room.RoomSQLiteQuery getSQLiteQuery(int i, int i2) {
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire(this.mLimitOffsetQuery, this.mSourceQuery.getArgCount() + 2);
        roomSQLiteQueryAcquire.copyArgumentsFrom(this.mSourceQuery);
        roomSQLiteQueryAcquire.bindLong(roomSQLiteQueryAcquire.getArgCount() - 1, i2);
        roomSQLiteQueryAcquire.bindLong(roomSQLiteQueryAcquire.getArgCount(), i);
        return roomSQLiteQueryAcquire;
    }
}
