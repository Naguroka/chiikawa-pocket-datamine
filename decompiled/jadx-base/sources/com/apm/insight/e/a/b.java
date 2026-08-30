package com.apm.insight.e.a;

/* JADX INFO: compiled from: DuplicateLogDAO.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.apm.insight.e.a.a<com.apm.insight.d.a> {
    @Override // com.apm.insight.e.a.a
    protected final /* synthetic */ android.content.ContentValues a(com.apm.insight.d.a aVar) {
        com.apm.insight.d.a aVar2 = aVar;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("path", aVar2.f385a);
        contentValues.put("insert_time", java.lang.Long.valueOf(aVar2.b));
        return contentValues;
    }

    public b() {
        super("duplicatelog");
    }

    public final boolean a(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        int count;
        if (sQLiteDatabase != null && !android.text.TextUtils.isEmpty(str)) {
            try {
                android.database.Cursor cursorQuery = sQLiteDatabase.query(this.f389a, null, "path=?", new java.lang.String[]{str}, null, null, null);
                count = cursorQuery.getCount();
                try {
                    cursorQuery.close();
                } catch (java.lang.Throwable th) {
                    th = th;
                    com.apm.insight.a.b(th);
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                count = 0;
            }
            if (count > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.apm.insight.e.a.a
    public final void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase, com.apm.insight.d.a aVar) {
        if (aVar == null || a(sQLiteDatabase, aVar.f385a)) {
            return;
        }
        super.a(sQLiteDatabase, aVar);
        try {
            sQLiteDatabase.execSQL("delete from " + this.f389a + " where _id in (select _id from " + this.f389a + " order by insert_time desc limit 1000 offset 500)");
        } catch (java.lang.Exception e) {
            com.apm.insight.a.b((java.lang.Throwable) e);
        }
    }

    @Override // com.apm.insight.e.a.a
    protected final java.util.HashMap<java.lang.String, java.lang.String> a() {
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        map.put("path", "TEXT");
        map.put("insert_time", "INTEGER");
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "TEXT");
        map.put("ext2", "TEXT");
        return map;
    }
}
