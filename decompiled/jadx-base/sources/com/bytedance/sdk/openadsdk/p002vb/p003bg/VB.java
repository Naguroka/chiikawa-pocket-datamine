package com.bytedance.sdk.openadsdk.p002vb.p003bg;

/* JADX INFO: loaded from: classes4.dex */
public class VB extends android.database.sqlite.SQLiteOpenHelper {
    private static volatile com.bytedance.sdk.openadsdk.p002vb.p003bg.VB IL;
    final android.content.Context bg;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private static com.bytedance.sdk.openadsdk.p002vb.p003bg.VB bX() {
        if (IL == null) {
            synchronized (com.bytedance.sdk.openadsdk.p002vb.p003bg.VB.class) {
                if (IL == null) {
                    IL = new com.bytedance.sdk.openadsdk.p002vb.p003bg.VB(com.bytedance.sdk.openadsdk.p002vb.IL.bg());
                }
            }
        }
        return IL;
    }

    public static android.database.sqlite.SQLiteDatabase bg() {
        try {
            com.bytedance.sdk.openadsdk.p002vb.p003bg.VB vbBX = bX();
            if (vbBX == null) {
                return null;
            }
            android.database.sqlite.SQLiteDatabase writableDatabase = vbBX.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (java.lang.Throwable th) {
            android.util.Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    public static android.database.sqlite.SQLiteDatabase IL() {
        try {
            com.bytedance.sdk.openadsdk.p002vb.p003bg.VB vbBX = bX();
            if (vbBX == null) {
                return null;
            }
            android.database.sqlite.SQLiteDatabase readableDatabase = vbBX.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (java.lang.Throwable th) {
            android.util.Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    private VB(android.content.Context context) {
        super(context, "pag_monitor.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        this.bg = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
        } catch (java.lang.Throwable th) {
            android.util.Log.e("MonitorSQLiteOpenHelper", th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i > i2) {
                bg(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            } else {
                onCreate(sQLiteDatabase);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private void bg(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.util.ArrayList<java.lang.String> arrayListIL = IL(sQLiteDatabase);
        if (arrayListIL == null || arrayListIL.size() <= 0) {
            return;
        }
        java.util.Iterator<java.lang.String> it = arrayListIL.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(java.lang.String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    private java.util.ArrayList<java.lang.String> IL(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        try {
            android.database.Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    java.lang.String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("MonitorSQLiteOpenHelper", e.getMessage());
        }
        return arrayList;
    }
}
