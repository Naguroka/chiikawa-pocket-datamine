package com.apm.insight.e;

/* JADX INFO: compiled from: NpthDataManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile com.apm.insight.e.a f388a;
    private com.apm.insight.e.a.b b;
    private android.database.sqlite.SQLiteDatabase c;

    private a() {
    }

    public static com.apm.insight.e.a a() {
        if (f388a == null) {
            synchronized (com.apm.insight.e.a.class) {
                if (f388a == null) {
                    f388a = new com.apm.insight.e.a();
                }
            }
        }
        return f388a;
    }

    public final synchronized void a(android.content.Context context) {
        try {
            this.c = new com.apm.insight.e.b(context).getWritableDatabase();
        } catch (java.lang.Throwable th) {
            com.apm.insight.a.b(th);
        }
        this.b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.c, aVar);
        }
    }

    public final synchronized boolean a(java.lang.String str) {
        b();
        com.apm.insight.e.a.b bVar = this.b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.c, str);
    }

    private void b() {
        if (this.b == null) {
            a(com.apm.insight.e.g());
        }
    }
}
