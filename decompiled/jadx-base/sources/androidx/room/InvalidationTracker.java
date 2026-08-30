package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidationTracker {
    private static final java.lang.String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    private static final java.lang.String INVALIDATED_COLUMN_NAME = "invalidated";
    static final java.lang.String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ";
    static final java.lang.String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    private static final java.lang.String TABLE_ID_COLUMN_NAME = "table_id";
    private static final java.lang.String[] TRIGGERS = {"UPDATE", "DELETE", "INSERT"};
    private static final java.lang.String UPDATE_TABLE_NAME = "room_table_modification_log";
    volatile androidx.sqlite.db.SupportSQLiteStatement mCleanupStatement;
    final androidx.room.RoomDatabase mDatabase;
    private volatile boolean mInitialized;
    private final androidx.room.InvalidationLiveDataContainer mInvalidationLiveDataContainer;
    private androidx.room.MultiInstanceInvalidationClient mMultiInstanceInvalidationClient;
    private androidx.room.InvalidationTracker.ObservedTableTracker mObservedTableTracker;
    final androidx.arch.core.internal.SafeIterableMap<androidx.room.InvalidationTracker.Observer, androidx.room.InvalidationTracker.ObserverWrapper> mObserverMap;
    java.util.concurrent.atomic.AtomicBoolean mPendingRefresh;
    java.lang.Runnable mRefreshRunnable;
    final java.util.HashMap<java.lang.String, java.lang.Integer> mTableIdLookup;
    final java.lang.String[] mTableNames;
    private java.util.Map<java.lang.String, java.util.Set<java.lang.String>> mViewTables;

    public InvalidationTracker(androidx.room.RoomDatabase roomDatabase, java.lang.String... strArr) {
        this(roomDatabase, new java.util.HashMap(), java.util.Collections.emptyMap(), strArr);
    }

    public InvalidationTracker(androidx.room.RoomDatabase roomDatabase, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.util.Set<java.lang.String>> map2, java.lang.String... strArr) {
        this.mPendingRefresh = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.mInitialized = false;
        this.mObserverMap = new androidx.arch.core.internal.SafeIterableMap<>();
        this.mRefreshRunnable = new java.lang.Runnable() { // from class: androidx.room.InvalidationTracker.1
            @Override // java.lang.Runnable
            public void run() {
                java.util.concurrent.locks.Lock closeLock = androidx.room.InvalidationTracker.this.mDatabase.getCloseLock();
                java.util.Set<java.lang.Integer> setCheckUpdatedTable = null;
                try {
                    try {
                        closeLock.lock();
                        if (!androidx.room.InvalidationTracker.this.ensureInitialization()) {
                            closeLock.unlock();
                            return;
                        }
                        if (!androidx.room.InvalidationTracker.this.mPendingRefresh.compareAndSet(true, false)) {
                            closeLock.unlock();
                            return;
                        }
                        if (androidx.room.InvalidationTracker.this.mDatabase.inTransaction()) {
                            closeLock.unlock();
                            return;
                        }
                        if (androidx.room.InvalidationTracker.this.mDatabase.mWriteAheadLoggingEnabled) {
                            androidx.sqlite.db.SupportSQLiteDatabase writableDatabase = androidx.room.InvalidationTracker.this.mDatabase.getOpenHelper().getWritableDatabase();
                            writableDatabase.beginTransaction();
                            try {
                                setCheckUpdatedTable = checkUpdatedTable();
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                            } catch (java.lang.Throwable th) {
                                writableDatabase.endTransaction();
                                throw th;
                            }
                        } else {
                            setCheckUpdatedTable = checkUpdatedTable();
                        }
                        closeLock.unlock();
                        if (setCheckUpdatedTable == null || setCheckUpdatedTable.isEmpty()) {
                            return;
                        }
                        synchronized (androidx.room.InvalidationTracker.this.mObserverMap) {
                            java.util.Iterator<java.util.Map.Entry<androidx.room.InvalidationTracker.Observer, androidx.room.InvalidationTracker.ObserverWrapper>> it = androidx.room.InvalidationTracker.this.mObserverMap.iterator();
                            while (it.hasNext()) {
                                it.next().getValue().notifyByTableInvalidStatus(setCheckUpdatedTable);
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        closeLock.unlock();
                        throw th2;
                    }
                } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException e) {
                    android.util.Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                }
            }

            private java.util.Set<java.lang.Integer> checkUpdatedTable() {
                java.util.HashSet hashSet = new java.util.HashSet();
                android.database.Cursor cursorQuery = androidx.room.InvalidationTracker.this.mDatabase.query(new androidx.sqlite.db.SimpleSQLiteQuery(androidx.room.InvalidationTracker.SELECT_UPDATED_TABLES_SQL));
                while (cursorQuery.moveToNext()) {
                    try {
                        hashSet.add(java.lang.Integer.valueOf(cursorQuery.getInt(0)));
                    } catch (java.lang.Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                cursorQuery.close();
                if (!hashSet.isEmpty()) {
                    androidx.room.InvalidationTracker.this.mCleanupStatement.executeUpdateDelete();
                }
                return hashSet;
            }
        };
        this.mDatabase = roomDatabase;
        this.mObservedTableTracker = new androidx.room.InvalidationTracker.ObservedTableTracker(strArr.length);
        this.mTableIdLookup = new java.util.HashMap<>();
        this.mViewTables = map2;
        this.mInvalidationLiveDataContainer = new androidx.room.InvalidationLiveDataContainer(roomDatabase);
        int length = strArr.length;
        this.mTableNames = new java.lang.String[length];
        for (int i = 0; i < length; i++) {
            java.lang.String lowerCase = strArr[i].toLowerCase(java.util.Locale.US);
            this.mTableIdLookup.put(lowerCase, java.lang.Integer.valueOf(i));
            java.lang.String str = map.get(strArr[i]);
            if (str != null) {
                this.mTableNames[i] = str.toLowerCase(java.util.Locale.US);
            } else {
                this.mTableNames[i] = lowerCase;
            }
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String lowerCase2 = entry.getValue().toLowerCase(java.util.Locale.US);
            if (this.mTableIdLookup.containsKey(lowerCase2)) {
                java.lang.String lowerCase3 = entry.getKey().toLowerCase(java.util.Locale.US);
                java.util.HashMap<java.lang.String, java.lang.Integer> map3 = this.mTableIdLookup;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    void internalInit(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        synchronized (this) {
            if (this.mInitialized) {
                android.util.Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            supportSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;");
            supportSQLiteDatabase.execSQL("PRAGMA recursive_triggers='ON';");
            supportSQLiteDatabase.execSQL(CREATE_TRACKING_TABLE_SQL);
            syncTriggers(supportSQLiteDatabase);
            this.mCleanupStatement = supportSQLiteDatabase.compileStatement(RESET_UPDATED_TABLES_SQL);
            this.mInitialized = true;
        }
    }

    void startMultiInstanceInvalidation(android.content.Context context, java.lang.String str) {
        this.mMultiInstanceInvalidationClient = new androidx.room.MultiInstanceInvalidationClient(context, str, this, this.mDatabase.getQueryExecutor());
    }

    void stopMultiInstanceInvalidation() {
        androidx.room.MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.mMultiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
            this.mMultiInstanceInvalidationClient = null;
        }
    }

    private static void appendTriggerName(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2) {
        sb.append("`").append("room_table_modification_trigger_").append(str).append("_").append(str2).append("`");
    }

    private void stopTrackingTable(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        java.lang.String str = this.mTableNames[i];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str2 : TRIGGERS) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            appendTriggerName(sb, str, str2);
            supportSQLiteDatabase.execSQL(sb.toString());
        }
    }

    private void startTrackingTable(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        java.lang.String str = this.mTableNames[i];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str2 : TRIGGERS) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            appendTriggerName(sb, str, str2);
            sb.append(" AFTER ").append(str2).append(" ON `").append(str).append("` BEGIN UPDATE ").append(UPDATE_TABLE_NAME).append(" SET ").append(INVALIDATED_COLUMN_NAME).append(" = 1").append(" WHERE ").append(TABLE_ID_COLUMN_NAME).append(" = ").append(i).append(" AND ").append(INVALIDATED_COLUMN_NAME).append(" = 0").append("; END");
            supportSQLiteDatabase.execSQL(sb.toString());
        }
    }

    public void addObserver(androidx.room.InvalidationTracker.Observer observer) {
        androidx.room.InvalidationTracker.ObserverWrapper observerWrapperPutIfAbsent;
        java.lang.String[] strArrResolveViews = resolveViews(observer.mTables);
        int[] iArr = new int[strArrResolveViews.length];
        int length = strArrResolveViews.length;
        for (int i = 0; i < length; i++) {
            java.lang.Integer num = this.mTableIdLookup.get(strArrResolveViews[i].toLowerCase(java.util.Locale.US));
            if (num == null) {
                throw new java.lang.IllegalArgumentException("There is no table with name " + strArrResolveViews[i]);
            }
            iArr[i] = num.intValue();
        }
        androidx.room.InvalidationTracker.ObserverWrapper observerWrapper = new androidx.room.InvalidationTracker.ObserverWrapper(observer, iArr, strArrResolveViews);
        synchronized (this.mObserverMap) {
            observerWrapperPutIfAbsent = this.mObserverMap.putIfAbsent(observer, observerWrapper);
        }
        if (observerWrapperPutIfAbsent == null && this.mObservedTableTracker.onAdded(iArr)) {
            syncTriggers();
        }
    }

    private java.lang.String[] validateAndResolveTableNames(java.lang.String[] strArr) {
        java.lang.String[] strArrResolveViews = resolveViews(strArr);
        for (java.lang.String str : strArrResolveViews) {
            if (!this.mTableIdLookup.containsKey(str.toLowerCase(java.util.Locale.US))) {
                throw new java.lang.IllegalArgumentException("There is no table with name " + str);
            }
        }
        return strArrResolveViews;
    }

    private java.lang.String[] resolveViews(java.lang.String[] strArr) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : strArr) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
            if (this.mViewTables.containsKey(lowerCase)) {
                hashSet.addAll(this.mViewTables.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (java.lang.String[]) hashSet.toArray(new java.lang.String[hashSet.size()]);
    }

    public void addWeakObserver(androidx.room.InvalidationTracker.Observer observer) {
        addObserver(new androidx.room.InvalidationTracker.WeakObserver(this, observer));
    }

    public void removeObserver(androidx.room.InvalidationTracker.Observer observer) {
        androidx.room.InvalidationTracker.ObserverWrapper observerWrapperRemove;
        synchronized (this.mObserverMap) {
            observerWrapperRemove = this.mObserverMap.remove(observer);
        }
        if (observerWrapperRemove == null || !this.mObservedTableTracker.onRemoved(observerWrapperRemove.mTableIds)) {
            return;
        }
        syncTriggers();
    }

    boolean ensureInitialization() {
        if (!this.mDatabase.isOpen()) {
            return false;
        }
        if (!this.mInitialized) {
            this.mDatabase.getOpenHelper().getWritableDatabase();
        }
        if (this.mInitialized) {
            return true;
        }
        android.util.Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public void refreshVersionsAsync() {
        if (this.mPendingRefresh.compareAndSet(false, true)) {
            this.mDatabase.getQueryExecutor().execute(this.mRefreshRunnable);
        }
    }

    public void refreshVersionsSync() {
        syncTriggers();
        this.mRefreshRunnable.run();
    }

    public void notifyObserversByTableNames(java.lang.String... strArr) {
        synchronized (this.mObserverMap) {
            for (java.util.Map.Entry<androidx.room.InvalidationTracker.Observer, androidx.room.InvalidationTracker.ObserverWrapper> entry : this.mObserverMap) {
                if (!entry.getKey().isRemote()) {
                    entry.getValue().notifyByTableNames(strArr);
                }
            }
        }
    }

    void syncTriggers(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase.inTransaction()) {
            return;
        }
        while (true) {
            try {
                java.util.concurrent.locks.Lock closeLock = this.mDatabase.getCloseLock();
                closeLock.lock();
                try {
                    int[] tablesToSync = this.mObservedTableTracker.getTablesToSync();
                    if (tablesToSync != null) {
                        int length = tablesToSync.length;
                        supportSQLiteDatabase.beginTransaction();
                        for (int i = 0; i < length; i++) {
                            try {
                                int i2 = tablesToSync[i];
                                if (i2 == 1) {
                                    startTrackingTable(supportSQLiteDatabase, i);
                                } else if (i2 == 2) {
                                    stopTrackingTable(supportSQLiteDatabase, i);
                                }
                            } catch (java.lang.Throwable th) {
                                supportSQLiteDatabase.endTransaction();
                                throw th;
                            }
                        }
                        supportSQLiteDatabase.setTransactionSuccessful();
                        supportSQLiteDatabase.endTransaction();
                        this.mObservedTableTracker.onSyncCompleted();
                        closeLock.unlock();
                    } else {
                        closeLock.unlock();
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    closeLock.unlock();
                    throw th2;
                }
            } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException e) {
                android.util.Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }

    void syncTriggers() {
        if (this.mDatabase.isOpen()) {
            syncTriggers(this.mDatabase.getOpenHelper().getWritableDatabase());
        }
    }

    @java.lang.Deprecated
    public <T> androidx.lifecycle.LiveData<T> createLiveData(java.lang.String[] strArr, java.util.concurrent.Callable<T> callable) {
        return createLiveData(strArr, false, callable);
    }

    public <T> androidx.lifecycle.LiveData<T> createLiveData(java.lang.String[] strArr, boolean z, java.util.concurrent.Callable<T> callable) {
        return this.mInvalidationLiveDataContainer.create(validateAndResolveTableNames(strArr), z, callable);
    }

    static class ObserverWrapper {
        final androidx.room.InvalidationTracker.Observer mObserver;
        private final java.util.Set<java.lang.String> mSingleTableSet;
        final int[] mTableIds;
        private final java.lang.String[] mTableNames;

        ObserverWrapper(androidx.room.InvalidationTracker.Observer observer, int[] iArr, java.lang.String[] strArr) {
            this.mObserver = observer;
            this.mTableIds = iArr;
            this.mTableNames = strArr;
            if (iArr.length == 1) {
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(strArr[0]);
                this.mSingleTableSet = java.util.Collections.unmodifiableSet(hashSet);
                return;
            }
            this.mSingleTableSet = null;
        }

        void notifyByTableInvalidStatus(java.util.Set<java.lang.Integer> set) {
            int length = this.mTableIds.length;
            java.util.Set<java.lang.String> hashSet = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(java.lang.Integer.valueOf(this.mTableIds[i]))) {
                    if (length == 1) {
                        hashSet = this.mSingleTableSet;
                    } else {
                        if (hashSet == null) {
                            hashSet = new java.util.HashSet<>(length);
                        }
                        hashSet.add(this.mTableNames[i]);
                    }
                }
            }
            if (hashSet != null) {
                this.mObserver.onInvalidated(hashSet);
            }
        }

        void notifyByTableNames(java.lang.String[] strArr) {
            java.util.Set<java.lang.String> set = null;
            if (this.mTableNames.length == 1) {
                for (java.lang.String str : strArr) {
                    if (str.equalsIgnoreCase(this.mTableNames[0])) {
                        set = this.mSingleTableSet;
                        break;
                    }
                }
            } else {
                java.util.HashSet hashSet = new java.util.HashSet();
                for (java.lang.String str2 : strArr) {
                    for (java.lang.String str3 : this.mTableNames) {
                        if (str3.equalsIgnoreCase(str2)) {
                            hashSet.add(str3);
                            break;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.mObserver.onInvalidated(set);
            }
        }
    }

    public static abstract class Observer {
        final java.lang.String[] mTables;

        boolean isRemote() {
            return false;
        }

        public abstract void onInvalidated(java.util.Set<java.lang.String> set);

        protected Observer(java.lang.String str, java.lang.String... strArr) {
            java.lang.String[] strArr2 = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length + 1);
            this.mTables = strArr2;
            strArr2[strArr.length] = str;
        }

        public Observer(java.lang.String[] strArr) {
            this.mTables = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
        }
    }

    static class ObservedTableTracker {
        static final int ADD = 1;
        static final int NO_OP = 0;
        static final int REMOVE = 2;
        boolean mNeedsSync;
        boolean mPendingSync;
        final long[] mTableObservers;
        final int[] mTriggerStateChanges;
        final boolean[] mTriggerStates;

        ObservedTableTracker(int i) {
            long[] jArr = new long[i];
            this.mTableObservers = jArr;
            boolean[] zArr = new boolean[i];
            this.mTriggerStates = zArr;
            this.mTriggerStateChanges = new int[i];
            java.util.Arrays.fill(jArr, 0L);
            java.util.Arrays.fill(zArr, false);
        }

        boolean onAdded(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.mTableObservers;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        z = true;
                        this.mNeedsSync = true;
                    }
                }
            }
            return z;
        }

        boolean onRemoved(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.mTableObservers;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        this.mNeedsSync = true;
                    }
                }
            }
            return z;
        }

        int[] getTablesToSync() {
            synchronized (this) {
                if (this.mNeedsSync && !this.mPendingSync) {
                    int length = this.mTableObservers.length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i < length) {
                            boolean z = this.mTableObservers[i] > 0;
                            boolean[] zArr = this.mTriggerStates;
                            if (z != zArr[i]) {
                                int[] iArr = this.mTriggerStateChanges;
                                if (!z) {
                                    i2 = 2;
                                }
                                iArr[i] = i2;
                            } else {
                                this.mTriggerStateChanges[i] = 0;
                            }
                            zArr[i] = z;
                            i++;
                        } else {
                            this.mPendingSync = true;
                            this.mNeedsSync = false;
                            return this.mTriggerStateChanges;
                        }
                    }
                }
                return null;
            }
        }

        void onSyncCompleted() {
            synchronized (this) {
                this.mPendingSync = false;
            }
        }
    }

    static class WeakObserver extends androidx.room.InvalidationTracker.Observer {
        final java.lang.ref.WeakReference<androidx.room.InvalidationTracker.Observer> mDelegateRef;
        final androidx.room.InvalidationTracker mTracker;

        WeakObserver(androidx.room.InvalidationTracker invalidationTracker, androidx.room.InvalidationTracker.Observer observer) {
            super(observer.mTables);
            this.mTracker = invalidationTracker;
            this.mDelegateRef = new java.lang.ref.WeakReference<>(observer);
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(java.util.Set<java.lang.String> set) {
            androidx.room.InvalidationTracker.Observer observer = this.mDelegateRef.get();
            if (observer == null) {
                this.mTracker.removeObserver(this);
            } else {
                observer.onInvalidated(set);
            }
        }
    }
}
