package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RoomDatabase {
    private static final java.lang.String DB_IMPL_SUFFIX = "_Impl";
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean mAllowMainThreadQueries;

    @java.lang.Deprecated
    protected java.util.List<androidx.room.RoomDatabase.Callback> mCallbacks;

    @java.lang.Deprecated
    protected volatile androidx.sqlite.db.SupportSQLiteDatabase mDatabase;
    private androidx.sqlite.db.SupportSQLiteOpenHelper mOpenHelper;
    private java.util.concurrent.Executor mQueryExecutor;
    private java.util.concurrent.Executor mTransactionExecutor;
    boolean mWriteAheadLoggingEnabled;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mCloseLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private final java.lang.ThreadLocal<java.lang.Integer> mSuspendingTransactionId = new java.lang.ThreadLocal<>();
    private final java.util.Map<java.lang.String, java.lang.Object> mBackingFieldMap = new java.util.concurrent.ConcurrentHashMap();
    private final androidx.room.InvalidationTracker mInvalidationTracker = createInvalidationTracker();

    public static abstract class Callback {
        public void onCreate(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onDestructiveMigration(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    public abstract void clearAllTables();

    protected abstract androidx.room.InvalidationTracker createInvalidationTracker();

    protected abstract androidx.sqlite.db.SupportSQLiteOpenHelper createOpenHelper(androidx.room.DatabaseConfiguration databaseConfiguration);

    java.util.concurrent.locks.Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    java.lang.ThreadLocal<java.lang.Integer> getSuspendingTransactionId() {
        return this.mSuspendingTransactionId;
    }

    java.util.Map<java.lang.String, java.lang.Object> getBackingFieldMap() {
        return this.mBackingFieldMap;
    }

    public void init(androidx.room.DatabaseConfiguration databaseConfiguration) {
        androidx.sqlite.db.SupportSQLiteOpenHelper supportSQLiteOpenHelperCreateOpenHelper = createOpenHelper(databaseConfiguration);
        this.mOpenHelper = supportSQLiteOpenHelperCreateOpenHelper;
        if (supportSQLiteOpenHelperCreateOpenHelper instanceof androidx.room.SQLiteCopyOpenHelper) {
            ((androidx.room.SQLiteCopyOpenHelper) supportSQLiteOpenHelperCreateOpenHelper).setDatabaseConfiguration(databaseConfiguration);
        }
        boolean z = databaseConfiguration.journalMode == androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        this.mOpenHelper.setWriteAheadLoggingEnabled(z);
        this.mCallbacks = databaseConfiguration.callbacks;
        this.mQueryExecutor = databaseConfiguration.queryExecutor;
        this.mTransactionExecutor = new androidx.room.TransactionExecutor(databaseConfiguration.transactionExecutor);
        this.mAllowMainThreadQueries = databaseConfiguration.allowMainThreadQueries;
        this.mWriteAheadLoggingEnabled = z;
        if (databaseConfiguration.multiInstanceInvalidation) {
            this.mInvalidationTracker.startMultiInstanceInvalidation(databaseConfiguration.context, databaseConfiguration.name);
        }
    }

    public androidx.sqlite.db.SupportSQLiteOpenHelper getOpenHelper() {
        return this.mOpenHelper;
    }

    public boolean isOpen() {
        androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    public void close() {
        if (isOpen()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.mCloseLock.writeLock();
            try {
                writeLock.lock();
                this.mInvalidationTracker.stopMultiInstanceInvalidation();
                this.mOpenHelper.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && isMainThread()) {
            throw new java.lang.IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new java.lang.IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public android.database.Cursor query(java.lang.String str, java.lang.Object[] objArr) {
        return this.mOpenHelper.getWritableDatabase().query(new androidx.sqlite.db.SimpleSQLiteQuery(str, objArr));
    }

    public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery) {
        return query(supportSQLiteQuery, (android.os.CancellationSignal) null);
    }

    public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery, android.os.CancellationSignal cancellationSignal) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return this.mOpenHelper.getWritableDatabase().query(supportSQLiteQuery, cancellationSignal);
        }
        return this.mOpenHelper.getWritableDatabase().query(supportSQLiteQuery);
    }

    public androidx.sqlite.db.SupportSQLiteStatement compileStatement(java.lang.String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.getWritableDatabase().compileStatement(str);
    }

    @java.lang.Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        androidx.sqlite.db.SupportSQLiteDatabase writableDatabase = this.mOpenHelper.getWritableDatabase();
        this.mInvalidationTracker.syncTriggers(writableDatabase);
        writableDatabase.beginTransaction();
    }

    @java.lang.Deprecated
    public void endTransaction() {
        this.mOpenHelper.getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        this.mInvalidationTracker.refreshVersionsAsync();
    }

    public java.util.concurrent.Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    public java.util.concurrent.Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    @java.lang.Deprecated
    public void setTransactionSuccessful() {
        this.mOpenHelper.getWritableDatabase().setTransactionSuccessful();
    }

    public void runInTransaction(java.lang.Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public <V> V runInTransaction(java.util.concurrent.Callable<V> callable) {
        beginTransaction();
        try {
            try {
                V vCall = callable.call();
                setTransactionSuccessful();
                endTransaction();
                return vCall;
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                androidx.room.util.SneakyThrow.reThrow(e2);
                endTransaction();
                return null;
            }
        } catch (java.lang.Throwable th) {
            endTransaction();
            throw th;
        }
    }

    protected void internalInitInvalidationTracker(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        this.mInvalidationTracker.internalInit(supportSQLiteDatabase);
    }

    public androidx.room.InvalidationTracker getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    public boolean inTransaction() {
        return this.mOpenHelper.getWritableDatabase().inTransaction();
    }

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        androidx.room.RoomDatabase.JournalMode resolve(android.content.Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
            if (activityManager != null && !isLowRamDevice(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }

        private static boolean isLowRamDevice(android.app.ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }
    }

    public static class Builder<T extends androidx.room.RoomDatabase> {
        private boolean mAllowDestructiveMigrationOnDowngrade;
        private boolean mAllowMainThreadQueries;
        private java.util.ArrayList<androidx.room.RoomDatabase.Callback> mCallbacks;
        private final android.content.Context mContext;
        private java.lang.String mCopyFromAssetPath;
        private java.io.File mCopyFromFile;
        private final java.lang.Class<T> mDatabaseClass;
        private androidx.sqlite.db.SupportSQLiteOpenHelper.Factory mFactory;
        private java.util.Set<java.lang.Integer> mMigrationStartAndEndVersions;
        private java.util.Set<java.lang.Integer> mMigrationsNotRequiredFrom;
        private boolean mMultiInstanceInvalidation;
        private final java.lang.String mName;
        private java.util.concurrent.Executor mQueryExecutor;
        private java.util.concurrent.Executor mTransactionExecutor;
        private androidx.room.RoomDatabase.JournalMode mJournalMode = androidx.room.RoomDatabase.JournalMode.AUTOMATIC;
        private boolean mRequireMigration = true;
        private final androidx.room.RoomDatabase.MigrationContainer mMigrationContainer = new androidx.room.RoomDatabase.MigrationContainer();

        Builder(android.content.Context context, java.lang.Class<T> cls, java.lang.String str) {
            this.mContext = context;
            this.mDatabaseClass = cls;
            this.mName = str;
        }

        public androidx.room.RoomDatabase.Builder<T> createFromAsset(java.lang.String str) {
            this.mCopyFromAssetPath = str;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> createFromFile(java.io.File file) {
            this.mCopyFromFile = file;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> openHelperFactory(androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory) {
            this.mFactory = factory;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> addMigrations(androidx.room.migration.Migration... migrationArr) {
            if (this.mMigrationStartAndEndVersions == null) {
                this.mMigrationStartAndEndVersions = new java.util.HashSet();
            }
            for (androidx.room.migration.Migration migration : migrationArr) {
                this.mMigrationStartAndEndVersions.add(java.lang.Integer.valueOf(migration.startVersion));
                this.mMigrationStartAndEndVersions.add(java.lang.Integer.valueOf(migration.endVersion));
            }
            this.mMigrationContainer.addMigrations(migrationArr);
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> allowMainThreadQueries() {
            this.mAllowMainThreadQueries = true;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> setJournalMode(androidx.room.RoomDatabase.JournalMode journalMode) {
            this.mJournalMode = journalMode;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> setQueryExecutor(java.util.concurrent.Executor executor) {
            this.mQueryExecutor = executor;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> setTransactionExecutor(java.util.concurrent.Executor executor) {
            this.mTransactionExecutor = executor;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> enableMultiInstanceInvalidation() {
            this.mMultiInstanceInvalidation = this.mName != null;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigration() {
            this.mRequireMigration = false;
            this.mAllowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.mRequireMigration = true;
            this.mAllowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigrationFrom(int... iArr) {
            if (this.mMigrationsNotRequiredFrom == null) {
                this.mMigrationsNotRequiredFrom = new java.util.HashSet(iArr.length);
            }
            for (int i : iArr) {
                this.mMigrationsNotRequiredFrom.add(java.lang.Integer.valueOf(i));
            }
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> addCallback(androidx.room.RoomDatabase.Callback callback) {
            if (this.mCallbacks == null) {
                this.mCallbacks = new java.util.ArrayList<>();
            }
            this.mCallbacks.add(callback);
            return this;
        }

        public T build() {
            java.util.concurrent.Executor executor;
            if (this.mContext == null) {
                throw new java.lang.IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.mDatabaseClass == null) {
                throw new java.lang.IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            java.util.concurrent.Executor executor2 = this.mQueryExecutor;
            if (executor2 == null && this.mTransactionExecutor == null) {
                java.util.concurrent.Executor iOThreadExecutor = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor();
                this.mTransactionExecutor = iOThreadExecutor;
                this.mQueryExecutor = iOThreadExecutor;
            } else if (executor2 != null && this.mTransactionExecutor == null) {
                this.mTransactionExecutor = executor2;
            } else if (executor2 == null && (executor = this.mTransactionExecutor) != null) {
                this.mQueryExecutor = executor;
            }
            java.util.Set<java.lang.Integer> set = this.mMigrationStartAndEndVersions;
            if (set != null && this.mMigrationsNotRequiredFrom != null) {
                for (java.lang.Integer num : set) {
                    if (this.mMigrationsNotRequiredFrom.contains(num)) {
                        throw new java.lang.IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            if (this.mFactory == null) {
                this.mFactory = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory();
            }
            java.lang.String str = this.mCopyFromAssetPath;
            if (str != null || this.mCopyFromFile != null) {
                if (this.mName == null) {
                    throw new java.lang.IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                if (str != null && this.mCopyFromFile != null) {
                    throw new java.lang.IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                }
                this.mFactory = new androidx.room.SQLiteCopyOpenHelperFactory(this.mCopyFromAssetPath, this.mCopyFromFile, this.mFactory);
            }
            android.content.Context context = this.mContext;
            androidx.room.DatabaseConfiguration databaseConfiguration = new androidx.room.DatabaseConfiguration(context, this.mName, this.mFactory, this.mMigrationContainer, this.mCallbacks, this.mAllowMainThreadQueries, this.mJournalMode.resolve(context), this.mQueryExecutor, this.mTransactionExecutor, this.mMultiInstanceInvalidation, this.mRequireMigration, this.mAllowDestructiveMigrationOnDowngrade, this.mMigrationsNotRequiredFrom, this.mCopyFromAssetPath, this.mCopyFromFile);
            T t = (T) androidx.room.Room.getGeneratedImplementation(this.mDatabaseClass, androidx.room.RoomDatabase.DB_IMPL_SUFFIX);
            t.init(databaseConfiguration);
            return t;
        }
    }

    public static class MigrationContainer {
        private java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> mMigrations = new java.util.HashMap<>();

        public void addMigrations(androidx.room.migration.Migration... migrationArr) {
            for (androidx.room.migration.Migration migration : migrationArr) {
                addMigration(migration);
            }
        }

        private void addMigration(androidx.room.migration.Migration migration) {
            int i = migration.startVersion;
            int i2 = migration.endVersion;
            java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration> treeMap = this.mMigrations.get(java.lang.Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new java.util.TreeMap<>();
                this.mMigrations.put(java.lang.Integer.valueOf(i), treeMap);
            }
            androidx.room.migration.Migration migration2 = treeMap.get(java.lang.Integer.valueOf(i2));
            if (migration2 != null) {
                android.util.Log.w("ROOM", "Overriding migration " + migration2 + " with " + migration);
            }
            treeMap.put(java.lang.Integer.valueOf(i2), migration);
        }

        public java.util.List<androidx.room.migration.Migration> findMigrationPath(int i, int i2) {
            if (i == i2) {
                return java.util.Collections.emptyList();
            }
            return findUpMigrationPath(new java.util.ArrayList(), i2 > i, i, i2);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0019  */
        /* JADX WARN: Code duplicated, block: B:11:0x001e  */
        /* JADX WARN: Code duplicated, block: B:15:0x002d  */
        /* JADX WARN: Code duplicated, block: B:17:0x003a  */
        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        /* JADX WARN: Code duplicated, block: B:20:0x0040  */
        /* JADX WARN: Code duplicated, block: B:30:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:33:0x0054 A[EDGE_INSN: B:33:0x0054->B:25:0x0054 BREAK  A[LOOP:1: B:13:0x0026->B:41:?], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0047 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:1: B:13:0x0026->B:41:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:9:0x0017 A[DONT_INVERT] */
        private java.util.List<androidx.room.migration.Migration> findUpMigrationPath(java.util.List<androidx.room.migration.Migration> list, boolean z, int i, int i2) {
            java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration> treeMap;
            java.util.Set<java.lang.Integer> setKeySet;
            java.util.Iterator<java.lang.Integer> it;
            boolean z2;
            int iIntValue;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                    treeMap = this.mMigrations.get(java.lang.Integer.valueOf(i));
                    if (treeMap == null) {
                        if (z) {
                            setKeySet = treeMap.descendingKeySet();
                        } else {
                            setKeySet = treeMap.keySet();
                        }
                        it = setKeySet.iterator();
                        while (true) {
                            z2 = false;
                            if (it.hasNext()) {
                                break;
                            }
                            iIntValue = it.next().intValue();
                            if (z) {
                                if (iIntValue > i2 && iIntValue > i) {
                                    z2 = true;
                                }
                            } else if (iIntValue < i2 && iIntValue < i) {
                                z2 = true;
                            }
                            if (z2) {
                                list.add(treeMap.get(java.lang.Integer.valueOf(iIntValue)));
                                i = iIntValue;
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        return null;
                    }
                } else {
                    if (i <= i2) {
                        return list;
                    }
                    treeMap = this.mMigrations.get(java.lang.Integer.valueOf(i));
                    if (treeMap == null) {
                        if (z) {
                            setKeySet = treeMap.descendingKeySet();
                        } else {
                            setKeySet = treeMap.keySet();
                        }
                        it = setKeySet.iterator();
                        while (true) {
                            z2 = false;
                            if (it.hasNext()) {
                                break;
                                break;
                            }
                            iIntValue = it.next().intValue();
                            if (z) {
                                if (iIntValue > i2) {
                                }
                            } else if (iIntValue < i2) {
                            }
                            if (z2) {
                                list.add(treeMap.get(java.lang.Integer.valueOf(iIntValue)));
                                i = iIntValue;
                                z2 = true;
                                break;
                                break;
                            }
                        }
                    } else {
                        return null;
                    }
                }
            } while (z2);
            return null;
        }
    }

    private static boolean isMainThread() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }
}
