package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
class SQLiteCopyOpenHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {
    private final java.lang.String mCopyFromAssetPath;
    private final java.io.File mCopyFromFile;
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory mDelegate;

    SQLiteCopyOpenHelperFactory(java.lang.String str, java.io.File file, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory) {
        this.mCopyFromAssetPath = str;
        this.mCopyFromFile = file;
        this.mDelegate = factory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public androidx.sqlite.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration) {
        return new androidx.room.SQLiteCopyOpenHelper(configuration.context, this.mCopyFromAssetPath, this.mCopyFromFile, configuration.callback.version, this.mDelegate.create(configuration));
    }
}
