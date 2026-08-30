package androidx.sqlite.db;

/* JADX INFO: loaded from: classes3.dex */
public interface SupportSQLiteOpenHelper extends java.io.Closeable {

    public interface Factory {
        androidx.sqlite.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    java.lang.String getDatabaseName();

    androidx.sqlite.db.SupportSQLiteDatabase getReadableDatabase();

    androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);

    public static abstract class Callback {
        private static final java.lang.String TAG = "SupportSQLite";
        public final int version;

        public void onConfigure(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public abstract void onCreate(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase);

        public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public abstract void onUpgrade(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);

        public Callback(int i) {
            this.version = i;
        }

        public void onDowngrade(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
            throw new android.database.sqlite.SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        public void onCorruption(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            android.util.Log.e(TAG, "Corruption reported by sqlite on database: " + supportSQLiteDatabase.getPath());
            if (!supportSQLiteDatabase.isOpen()) {
                deleteDatabaseFile(supportSQLiteDatabase.getPath());
                return;
            }
            java.util.List<android.util.Pair<java.lang.String, java.lang.String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = supportSQLiteDatabase.getAttachedDbs();
                } finally {
                    if (attachedDbs != null) {
                        java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            deleteDatabaseFile((java.lang.String) it.next().second);
                        }
                    } else {
                        deleteDatabaseFile(supportSQLiteDatabase.getPath());
                    }
                }
            } catch (android.database.sqlite.SQLiteException unused) {
            }
            try {
                supportSQLiteDatabase.close();
            } catch (java.io.IOException unused2) {
            }
        }

        private void deleteDatabaseFile(java.lang.String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            android.util.Log.w(TAG, "deleting the database file: " + str);
            try {
                android.database.sqlite.SQLiteDatabase.deleteDatabase(new java.io.File(str));
            } catch (java.lang.Exception e) {
                android.util.Log.w(TAG, "delete failed: ", e);
            }
        }
    }

    public static class Configuration {
        public final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback;
        public final android.content.Context context;
        public final java.lang.String name;
        public final boolean useNoBackupDirectory;

        Configuration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback) {
            this(context, str, callback, false);
        }

        Configuration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, boolean z) {
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z;
        }

        public static androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder builder(android.content.Context context) {
            return new androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder(context);
        }

        public static class Builder {
            androidx.sqlite.db.SupportSQLiteOpenHelper.Callback mCallback;
            android.content.Context mContext;
            java.lang.String mName;
            boolean mUseNoBackUpDirectory;

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration build() {
                if (this.mCallback == null) {
                    throw new java.lang.IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.mContext == null) {
                    throw new java.lang.IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.mUseNoBackUpDirectory && android.text.TextUtils.isEmpty(this.mName)) {
                    throw new java.lang.IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration(this.mContext, this.mName, this.mCallback, this.mUseNoBackUpDirectory);
            }

            Builder(android.content.Context context) {
                this.mContext = context;
            }

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder name(java.lang.String str) {
                this.mName = str;
                return this;
            }

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder callback(androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback) {
                this.mCallback = callback;
                return this;
            }

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder noBackupDirectory(boolean z) {
                this.mUseNoBackUpDirectory = z;
                return this;
            }
        }
    }
}
