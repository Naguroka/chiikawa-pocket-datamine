package com.apm.insight.e;

/* JADX INFO: compiled from: NpthDbHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends android.database.sqlite.SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public b(android.content.Context context) {
        super(context, "npth_log.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        new com.apm.insight.e.a.b().a(sQLiteDatabase);
    }
}
