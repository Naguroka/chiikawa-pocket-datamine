package androidx.media3.database;

/* JADX INFO: loaded from: classes.dex */
public class StandaloneDatabaseProvider extends android.database.sqlite.SQLiteOpenHelper implements androidx.media3.database.DatabaseProvider {
    public static final java.lang.String DATABASE_NAME = "exoplayer_internal.db";
    private static final java.lang.String TAG = "SADatabaseProvider";
    private static final int VERSION = 1;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public StandaloneDatabaseProvider(android.content.Context context) {
        super(context.getApplicationContext(), DATABASE_NAME, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        wipeDatabase(sQLiteDatabase);
    }

    private static void wipeDatabase(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.database.Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", new java.lang.String[]{"type", "name"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                java.lang.String string = cursorQuery.getString(0);
                java.lang.String string2 = cursorQuery.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    java.lang.String str = "DROP " + string + " IF EXISTS " + string2;
                    try {
                        sQLiteDatabase.execSQL(str);
                    } catch (android.database.SQLException e) {
                        androidx.media3.common.util.Log.e(TAG, "Error executing " + str, e);
                    }
                }
            } catch (java.lang.Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }
}
