package com.apm.insight.e.a;

/* JADX INFO: compiled from: AbsDAO.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final java.lang.String f389a;
    private java.lang.String b = "_id";

    protected abstract android.content.ContentValues a(T t);

    protected abstract java.util.HashMap<java.lang.String, java.lang.String> a();

    protected a(java.lang.String str) {
        this.f389a = str;
    }

    public final void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("CREATE TABLE ").append(this.f389a).append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            java.util.HashMap<java.lang.String, java.lang.String> mapA = a();
            for (java.lang.String str : mapA.keySet()) {
                sb.append(str).append(" ").append(mapA.get(str)).append(",");
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append(")");
            sQLiteDatabase.execSQL(sb.toString());
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
        }
    }

    public void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase, T t) {
        if (sQLiteDatabase == null || t == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.f389a, null, a(t));
        } catch (java.lang.Throwable th) {
            com.apm.insight.a.b(th);
        }
    }
}
