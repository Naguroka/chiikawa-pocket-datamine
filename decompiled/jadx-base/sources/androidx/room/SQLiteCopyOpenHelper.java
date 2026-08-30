package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
class SQLiteCopyOpenHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper {
    private final android.content.Context mContext;
    private final java.lang.String mCopyFromAssetPath;
    private final java.io.File mCopyFromFile;
    private androidx.room.DatabaseConfiguration mDatabaseConfiguration;
    private final int mDatabaseVersion;
    private final androidx.sqlite.db.SupportSQLiteOpenHelper mDelegate;
    private boolean mVerified;

    SQLiteCopyOpenHelper(android.content.Context context, java.lang.String str, java.io.File file, int i, androidx.sqlite.db.SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        this.mContext = context;
        this.mCopyFromAssetPath = str;
        this.mCopyFromFile = file;
        this.mDatabaseVersion = i;
        this.mDelegate = supportSQLiteOpenHelper;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public java.lang.String getDatabaseName() {
        return this.mDelegate.getDatabaseName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.mDelegate.setWriteAheadLoggingEnabled(z);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public synchronized androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
        if (!this.mVerified) {
            verifyDatabaseFile();
            this.mVerified = true;
        }
        return this.mDelegate.getWritableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public synchronized androidx.sqlite.db.SupportSQLiteDatabase getReadableDatabase() {
        if (!this.mVerified) {
            verifyDatabaseFile();
            this.mVerified = true;
        }
        return this.mDelegate.getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.mDelegate.close();
        this.mVerified = false;
    }

    void setDatabaseConfiguration(androidx.room.DatabaseConfiguration databaseConfiguration) {
        this.mDatabaseConfiguration = databaseConfiguration;
    }

    private void verifyDatabaseFile() {
        java.lang.String databaseName = getDatabaseName();
        java.io.File databasePath = this.mContext.getDatabasePath(databaseName);
        androidx.room.DatabaseConfiguration databaseConfiguration = this.mDatabaseConfiguration;
        androidx.room.util.CopyLock copyLock = new androidx.room.util.CopyLock(databaseName, this.mContext.getFilesDir(), databaseConfiguration == null || databaseConfiguration.multiInstanceInvalidation);
        try {
            copyLock.lock();
            if (!databasePath.exists()) {
                try {
                    copyDatabaseFile(databasePath);
                    copyLock.unlock();
                    return;
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException("Unable to copy database file.", e);
                }
            }
            if (this.mDatabaseConfiguration == null) {
                copyLock.unlock();
                return;
            }
            try {
                int version = androidx.room.util.DBUtil.readVersion(databasePath);
                int i = this.mDatabaseVersion;
                if (version == i) {
                    copyLock.unlock();
                    return;
                }
                if (this.mDatabaseConfiguration.isMigrationRequired(version, i)) {
                    copyLock.unlock();
                    return;
                }
                if (this.mContext.deleteDatabase(databaseName)) {
                    try {
                        copyDatabaseFile(databasePath);
                    } catch (java.io.IOException e2) {
                        android.util.Log.w("ROOM", "Unable to copy database file.", e2);
                    }
                } else {
                    android.util.Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                copyLock.unlock();
                return;
            } catch (java.io.IOException e3) {
                android.util.Log.w("ROOM", "Unable to read database version.", e3);
                copyLock.unlock();
                return;
            }
        } catch (java.lang.Throwable th) {
            copyLock.unlock();
            throw th;
        }
        copyLock.unlock();
        throw th;
    }

    private void copyDatabaseFile(java.io.File file) throws java.io.IOException {
        java.nio.channels.ReadableByteChannel channel;
        if (this.mCopyFromAssetPath != null) {
            channel = java.nio.channels.Channels.newChannel(this.mContext.getAssets().open(this.mCopyFromAssetPath));
        } else if (this.mCopyFromFile != null) {
            channel = new java.io.FileInputStream(this.mCopyFromFile).getChannel();
        } else {
            throw new java.lang.IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        java.io.File fileCreateTempFile = java.io.File.createTempFile("room-copy-helper", ".tmp", this.mContext.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        androidx.room.util.FileUtil.copy(channel, new java.io.FileOutputStream(fileCreateTempFile).getChannel());
        java.io.File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new java.io.IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (!fileCreateTempFile.renameTo(file)) {
            throw new java.io.IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }
}
