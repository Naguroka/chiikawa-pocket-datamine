package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class aa extends android.database.sqlite.SQLiteOpenHelper implements com.json.of {
    private static com.json.aa f = null;
    private static final java.lang.String g = " TEXT";
    private static final java.lang.String h = " INTEGER";
    private static final java.lang.String i = ",";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.ba f2496a;
    private final int b;
    private final int c;
    private final java.lang.String d;
    private final java.lang.String e;

    static abstract class a implements android.provider.BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final java.lang.String f2497a = "events";
        public static final int b = 4;
        public static final java.lang.String c = "eventid";
        public static final java.lang.String d = "timestamp";
        public static final java.lang.String e = "type";
        public static final java.lang.String f = "data";

        a() {
        }
    }

    public aa(android.content.Context context, java.lang.String str, int i2) {
        super(context, str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, i2);
        this.f2496a = new com.json.ba();
        this.b = 4;
        this.c = 400;
        this.d = "DROP TABLE IF EXISTS events";
        this.e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    private android.content.ContentValues a(com.json.wb wbVar, java.lang.String str) {
        if (wbVar == null) {
            return null;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues(4);
        contentValues.put("eventid", java.lang.Integer.valueOf(wbVar.c()));
        contentValues.put(com.ironsource.aa.a.d, java.lang.Long.valueOf(wbVar.d()));
        contentValues.put("type", str);
        contentValues.put("data", wbVar.a());
        return contentValues;
    }

    private synchronized android.database.sqlite.SQLiteDatabase a(boolean z) throws java.lang.Throwable {
        int i2 = 0;
        while (true) {
            try {
                if (z) {
                    return this.f2496a.a(true, this);
                }
                return this.f2496a.a(false, this);
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
                i2++;
                if (i2 >= 4) {
                    throw th;
                }
                android.os.SystemClock.sleep(i2 * 400);
            }
        }
    }

    public static synchronized com.json.aa a(android.content.Context context, java.lang.String str, int i2) {
        if (f == null) {
            f = new com.json.aa(context, str, i2);
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0099 A[Catch: all -> 0x00b6, PHI: r11
  0x0099: PHI (r11v2 android.database.sqlite.SQLiteDatabase) = (r11v1 android.database.sqlite.SQLiteDatabase), (r11v3 android.database.sqlite.SQLiteDatabase) binds: [B:39:0x0097, B:26:0x0071] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:22:0x0064, B:24:0x006a, B:25:0x006d, B:40:0x0099, B:34:0x0088, B:36:0x008e, B:38:0x0093, B:45:0x00a1, B:47:0x00a7, B:49:0x00ac, B:51:0x00b2, B:52:0x00b5, B:32:0x0078), top: B:60:0x0001, inners: #3 }] */
    @Override // com.json.of
    public synchronized java.util.ArrayList<com.json.wb> a(java.lang.String str) {
        java.util.ArrayList<com.json.wb> arrayList;
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseA;
        arrayList = new java.util.ArrayList<>();
        android.database.Cursor cursorQuery = null;
        try {
            sQLiteDatabaseA = a(false);
            try {
                cursorQuery = sQLiteDatabaseA.query("events", null, "type = ?", new java.lang.String[]{str}, null, null, "timestamp ASC");
                if (cursorQuery.getCount() > 0) {
                    cursorQuery.moveToFirst();
                    while (!cursorQuery.isAfterLast()) {
                        int columnIndex = cursorQuery.getColumnIndex("eventid");
                        if (columnIndex >= 0) {
                            int i2 = cursorQuery.getInt(columnIndex);
                            int columnIndex2 = cursorQuery.getColumnIndex(com.ironsource.aa.a.d);
                            if (columnIndex2 >= 0) {
                                long j = cursorQuery.getLong(columnIndex2);
                                int columnIndex3 = cursorQuery.getColumnIndex("data");
                                if (columnIndex3 >= 0) {
                                    arrayList.add(new com.json.wb(i2, j, cursorQuery.getString(columnIndex3)));
                                    cursorQuery.moveToNext();
                                }
                            }
                        }
                    }
                    cursorQuery.close();
                }
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                if (sQLiteDatabaseA.isOpen()) {
                    sQLiteDatabaseA.close();
                }
            } catch (java.lang.Throwable th) {
                th = th;
                try {
                    com.json.l9.d().a(th);
                    android.util.Log.e("IronSource", "Exception while loading events: ", th);
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                        sQLiteDatabaseA.close();
                    }
                } catch (java.lang.Throwable th2) {
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                        sQLiteDatabaseA.close();
                    }
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            sQLiteDatabaseA = null;
        }
        return arrayList;
    }

    @Override // com.json.of
    public synchronized void a(java.util.List<com.json.wb> list, java.lang.String str) {
        if (list != null) {
            if (!list.isEmpty()) {
                android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
                try {
                    android.database.sqlite.SQLiteDatabase sQLiteDatabaseA = a(true);
                    try {
                        java.util.Iterator<com.json.wb> it = list.iterator();
                        while (it.hasNext()) {
                            android.content.ContentValues contentValuesA = a(it.next(), str);
                            if (sQLiteDatabaseA != null && contentValuesA != null) {
                                sQLiteDatabaseA.insert("events", null, contentValuesA);
                            }
                        }
                        if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                            sQLiteDatabaseA.close();
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        sQLiteDatabase = sQLiteDatabaseA;
                        try {
                            com.json.l9.d().a(th);
                            android.util.Log.e("IronSource", "Exception while saving events: ", th);
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabaseA = sQLiteDatabase;
                            }
                        } catch (java.lang.Throwable th2) {
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033 A[Catch: all -> 0x0045, PHI: r5
  0x0033: PHI (r5v4 android.database.sqlite.SQLiteDatabase) = (r5v3 android.database.sqlite.SQLiteDatabase), (r5v5 android.database.sqlite.SQLiteDatabase) binds: [B:16:0x0031, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0012, B:17:0x0033, B:15:0x002d, B:22:0x003b, B:24:0x0041, B:25:0x0044, B:13:0x001d), top: B:29:0x0001, inners: #1 }] */
    @Override // com.json.of
    public synchronized void b(java.lang.String str) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseA;
        java.lang.String[] strArr = {str};
        try {
            sQLiteDatabaseA = a(true);
            try {
                sQLiteDatabaseA.delete("events", "type = ?", strArr);
                if (sQLiteDatabaseA.isOpen()) {
                    sQLiteDatabaseA.close();
                }
            } catch (java.lang.Throwable th) {
                th = th;
                try {
                    com.json.l9.d().a(th);
                    android.util.Log.e("IronSource", "Exception while clearing events: ", th);
                    if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                        sQLiteDatabaseA.close();
                    }
                } catch (java.lang.Throwable th2) {
                    if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                        sQLiteDatabaseA.close();
                    }
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            sQLiteDatabaseA = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }
}
