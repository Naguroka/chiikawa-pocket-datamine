package androidx.media3.database;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDatabaseProvider implements androidx.media3.database.DatabaseProvider {
    private final android.database.sqlite.SQLiteOpenHelper sqliteOpenHelper;

    public DefaultDatabaseProvider(android.database.sqlite.SQLiteOpenHelper sQLiteOpenHelper) {
        this.sqliteOpenHelper = sQLiteOpenHelper;
    }

    @Override // androidx.media3.database.DatabaseProvider
    public android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        return this.sqliteOpenHelper.getWritableDatabase();
    }

    @Override // androidx.media3.database.DatabaseProvider
    public android.database.sqlite.SQLiteDatabase getReadableDatabase() {
        return this.sqliteOpenHelper.getReadableDatabase();
    }
}
