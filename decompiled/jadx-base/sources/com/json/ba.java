package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/ironsource/ba;", "", "", "write", "Landroid/database/sqlite/SQLiteOpenHelper;", "sqliteOpenHelper", "Landroid/database/sqlite/SQLiteDatabase;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ba {
    private static final java.lang.Object b = new java.lang.Object();

    public static /* synthetic */ android.database.sqlite.SQLiteDatabase a(com.json.ba baVar, boolean z, android.database.sqlite.SQLiteOpenHelper sQLiteOpenHelper, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return baVar.a(z, sQLiteOpenHelper);
    }

    public final android.database.sqlite.SQLiteDatabase a(android.database.sqlite.SQLiteOpenHelper sqliteOpenHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        return a(this, false, sqliteOpenHelper, 1, null);
    }

    public final android.database.sqlite.SQLiteDatabase a(boolean write, android.database.sqlite.SQLiteOpenHelper sqliteOpenHelper) {
        android.database.sqlite.SQLiteDatabase writableDatabase;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (b) {
            try {
                writableDatabase = write ? sqliteOpenHelper.getWritableDatabase() : sqliteOpenHelper.getReadableDatabase();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return writableDatabase;
    }
}
