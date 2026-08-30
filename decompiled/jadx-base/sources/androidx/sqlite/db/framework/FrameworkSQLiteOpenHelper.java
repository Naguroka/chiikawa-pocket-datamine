package androidx.sqlite.db.framework;

/* JADX INFO: loaded from: classes3.dex */
class FrameworkSQLiteOpenHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper {
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback mCallback;
    private final android.content.Context mContext;
    private androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper mDelegate;
    private final java.lang.Object mLock;
    private final java.lang.String mName;
    private final boolean mUseNoBackupDirectory;
    private boolean mWriteAheadLoggingEnabled;

    FrameworkSQLiteOpenHelper(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback) {
        this(context, str, callback, false);
    }

    FrameworkSQLiteOpenHelper(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, boolean z) {
        this.mContext = context;
        this.mName = str;
        this.mCallback = callback;
        this.mUseNoBackupDirectory = z;
        this.mLock = new java.lang.Object();
    }

    private androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper getDelegate() {
        androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper openHelper;
        synchronized (this.mLock) {
            if (this.mDelegate == null) {
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase[] frameworkSQLiteDatabaseArr = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase[1];
                if (this.mName != null && this.mUseNoBackupDirectory) {
                    this.mDelegate = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper(this.mContext, new java.io.File(this.mContext.getNoBackupFilesDir(), this.mName).getAbsolutePath(), frameworkSQLiteDatabaseArr, this.mCallback);
                } else {
                    this.mDelegate = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper(this.mContext, this.mName, frameworkSQLiteDatabaseArr, this.mCallback);
                }
                this.mDelegate.setWriteAheadLoggingEnabled(this.mWriteAheadLoggingEnabled);
            }
            openHelper = this.mDelegate;
        }
        return openHelper;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public java.lang.String getDatabaseName() {
        return this.mName;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.mLock) {
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper openHelper = this.mDelegate;
            if (openHelper != null) {
                openHelper.setWriteAheadLoggingEnabled(z);
            }
            this.mWriteAheadLoggingEnabled = z;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
        return getDelegate().getWritableSupportDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public androidx.sqlite.db.SupportSQLiteDatabase getReadableDatabase() {
        return getDelegate().getReadableSupportDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        getDelegate().close();
    }

    static class OpenHelper extends android.database.sqlite.SQLiteOpenHelper {
        final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback mCallback;
        final androidx.sqlite.db.framework.FrameworkSQLiteDatabase[] mDbRef;
        private boolean mMigrated;

        OpenHelper(android.content.Context context, java.lang.String str, final androidx.sqlite.db.framework.FrameworkSQLiteDatabase[] frameworkSQLiteDatabaseArr, final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback) {
            super(context, str, null, callback.version, new android.database.DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.1
                @Override // android.database.DatabaseErrorHandler
                public void onCorruption(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                    callback.onCorruption(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.getWrappedDb(frameworkSQLiteDatabaseArr, sQLiteDatabase));
                }
            });
            this.mCallback = callback;
            this.mDbRef = frameworkSQLiteDatabaseArr;
        }

        synchronized androidx.sqlite.db.SupportSQLiteDatabase getWritableSupportDatabase() {
            this.mMigrated = false;
            android.database.sqlite.SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.mMigrated) {
                close();
                return getWritableSupportDatabase();
            }
            return getWrappedDb(writableDatabase);
        }

        synchronized androidx.sqlite.db.SupportSQLiteDatabase getReadableSupportDatabase() {
            this.mMigrated = false;
            android.database.sqlite.SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (this.mMigrated) {
                close();
                return getReadableSupportDatabase();
            }
            return getWrappedDb(readableDatabase);
        }

        androidx.sqlite.db.framework.FrameworkSQLiteDatabase getWrappedDb(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            return getWrappedDb(this.mDbRef, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            this.mCallback.onCreate(getWrappedDb(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.mMigrated = true;
            this.mCallback.onUpgrade(getWrappedDb(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            this.mCallback.onConfigure(getWrappedDb(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.mMigrated = true;
            this.mCallback.onDowngrade(getWrappedDb(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            if (this.mMigrated) {
                return;
            }
            this.mCallback.onOpen(getWrappedDb(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.mDbRef[0] = null;
        }

        static androidx.sqlite.db.framework.FrameworkSQLiteDatabase getWrappedDb(androidx.sqlite.db.framework.FrameworkSQLiteDatabase[] frameworkSQLiteDatabaseArr, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase frameworkSQLiteDatabase = frameworkSQLiteDatabaseArr[0];
            if (frameworkSQLiteDatabase == null || !frameworkSQLiteDatabase.isDelegate(sQLiteDatabase)) {
                frameworkSQLiteDatabaseArr[0] = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase(sQLiteDatabase);
            }
            return frameworkSQLiteDatabaseArr[0];
        }
    }
}
