package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ca extends android.database.sqlite.SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.json.ba f2555a = new com.json.ba();

    public ca(android.content.Context context) {
        super(context, "reports", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
    }

    public static android.database.Cursor a(int i) throws java.lang.Throwable {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseA = f2555a.a(new com.json.ca(com.json.l9.d().a()));
            try {
                android.database.Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
                sQLiteDatabaseA.close();
                return cursorRawQuery;
            } catch (java.lang.Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static void a() {
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseA = null;
        try {
            sQLiteDatabaseA = f2555a.a(true, new com.json.ca(com.json.l9.d().a()));
            sQLiteDatabaseA.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
            sQLiteDatabaseA.close();
        } catch (java.lang.Throwable th) {
            if (sQLiteDatabaseA != null) {
                sQLiteDatabaseA.close();
            }
            throw th;
        }
    }

    public static void a(com.json.ic icVar) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseA = f2555a.a(true, new com.json.ca(com.json.l9.d().a()));
            try {
                sQLiteDatabaseA.beginTransaction();
                android.content.ContentValues contentValues = new android.content.ContentValues();
                java.lang.String strE = icVar.e();
                java.lang.String strB = icVar.b();
                java.lang.String strD = icVar.d();
                contentValues.put("stack_trace", strE);
                contentValues.put("crash_date", strB);
                contentValues.put("crashType", strD);
                sQLiteDatabaseA.insert("REPORTS", null, contentValues);
                sQLiteDatabaseA.setTransactionSuccessful();
                sQLiteDatabaseA.endTransaction();
                sQLiteDatabaseA.close();
            } catch (java.lang.Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static com.json.ic b(int i) throws java.lang.Throwable {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseA = f2555a.a(new com.json.ca(com.json.l9.d().a()));
            try {
                android.database.Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
                int i2 = cursorRawQuery.getInt(0);
                java.lang.String string = cursorRawQuery.getString(1);
                java.lang.String string2 = cursorRawQuery.getString(2);
                java.lang.String string3 = cursorRawQuery.getString(3);
                cursorRawQuery.close();
                com.json.ic icVar = new com.json.ic(i2, string, string2, string3);
                sQLiteDatabaseA.close();
                return icVar;
            } catch (java.lang.Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static java.util.List<com.json.ic> b() {
        com.json.ca caVar = new com.json.ca(com.json.l9.d().a());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseA = f2555a.a(caVar);
            try {
                android.database.Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTS ;", null);
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        arrayList.add(new com.json.ic(cursorRawQuery.getInt(0), cursorRawQuery.getString(1), cursorRawQuery.getString(2), cursorRawQuery.getString(3)));
                    } while (cursorRawQuery.moveToNext());
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.close();
                return arrayList;
            } catch (java.lang.Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static android.database.Cursor c() throws java.lang.Throwable {
        com.json.ca caVar = new com.json.ca(com.json.l9.d().a());
        new java.util.ArrayList();
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseA = f2555a.a(caVar);
            try {
                android.database.Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTS;", null);
                sQLiteDatabaseA.close();
                return cursorRawQuery;
            } catch (java.lang.Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
