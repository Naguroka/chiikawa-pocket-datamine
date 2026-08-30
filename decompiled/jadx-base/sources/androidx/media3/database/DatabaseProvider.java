package androidx.media3.database;

/* JADX INFO: loaded from: classes.dex */
public interface DatabaseProvider {
    public static final java.lang.String TABLE_PREFIX = "ExoPlayer";

    android.database.sqlite.SQLiteDatabase getReadableDatabase();

    android.database.sqlite.SQLiteDatabase getWritableDatabase();
}
