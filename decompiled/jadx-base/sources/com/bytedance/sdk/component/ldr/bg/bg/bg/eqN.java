package com.bytedance.sdk.component.ldr.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends android.database.sqlite.SQLiteOpenHelper {
    final android.content.Context bg;

    public eqN(android.content.Context context) {
        super(context, "ttadlog.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        this.bg = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        try {
            bg(sQLiteDatabase);
        } catch (java.lang.Throwable unused) {
        }
    }

    private void bg(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bg.IL(com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN().IL()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ldr.bg.bg.bg.bg.eqN.bX(com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN().bg()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ldr.bg.bg.bg.bg.iR.bX(com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN().eqN()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ldr.bg.bg.bg.bg.ldr.bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN().zx()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ldr.bg.ldr.ldr.IL());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i > i2) {
                IL(sQLiteDatabase);
                bg(sQLiteDatabase);
            } else {
                bg(sQLiteDatabase);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private void IL(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.util.ArrayList<java.lang.String> arrayListBX = bX(sQLiteDatabase);
        if (arrayListBX == null || arrayListBX.size() <= 0) {
            return;
        }
        java.util.Iterator<java.lang.String> it = arrayListBX.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(java.lang.String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    private java.util.ArrayList<java.lang.String> bX(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
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
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }
}
