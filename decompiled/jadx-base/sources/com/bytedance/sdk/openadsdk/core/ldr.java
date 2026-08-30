package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public class ldr {
    private static final java.lang.Object bX = new java.lang.Object();
    private android.content.Context IL;
    private com.bytedance.sdk.openadsdk.core.ldr.bX bg;

    ldr(android.content.Context context) {
        try {
            this.IL = context == null ? com.bytedance.sdk.openadsdk.core.VzQ.bg() : context.getApplicationContext();
            if (this.bg == null) {
                this.bg = new com.bytedance.sdk.openadsdk.core.ldr.bX();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.content.Context bX() {
        android.content.Context context = this.IL;
        return context == null ? com.bytedance.sdk.openadsdk.core.VzQ.bg() : context;
    }

    public class bX {
        private android.database.sqlite.SQLiteDatabase IL = null;

        public bX() {
        }

        private synchronized void zx() {
            try {
                synchronized (com.bytedance.sdk.openadsdk.core.ldr.bX) {
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.IL;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        com.bytedance.sdk.openadsdk.core.ldr ldrVar = com.bytedance.sdk.openadsdk.core.ldr.this;
                        android.database.sqlite.SQLiteDatabase writableDatabase = ldrVar.new bg(ldrVar.bX()).getWritableDatabase();
                        this.IL = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    }
                }
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("DBHelper", th.getMessage());
                if (ldr()) {
                    throw th;
                }
            }
        }

        public android.database.sqlite.SQLiteDatabase bg() {
            zx();
            return this.IL;
        }

        public synchronized void bg(java.lang.String str) throws android.database.SQLException {
            try {
                zx();
                this.IL.execSQL(str);
            } catch (java.lang.Throwable th) {
                if (ldr()) {
                    throw th;
                }
            }
        }

        public synchronized android.database.Cursor bg(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            android.database.Cursor cursorQuery;
            try {
                zx();
                cursorQuery = this.IL.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("DBHelper", th.getMessage());
                com.bytedance.sdk.openadsdk.core.ldr.IL il = new com.bytedance.sdk.openadsdk.core.ldr.IL();
                if (ldr()) {
                    throw th;
                }
                cursorQuery = il;
            }
            return cursorQuery;
        }

        public synchronized int bg(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
            int iUpdate;
            try {
                zx();
                iUpdate = this.IL.update(str, contentValues, str2, strArr);
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("DBHelper", e.getMessage());
                if (ldr()) {
                    throw e;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long bg(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
            long jReplace;
            try {
                zx();
                jReplace = this.IL.replace(str, str2, contentValues);
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("DBHelper", e.getMessage());
                if (ldr()) {
                    throw e;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int bg(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
            int iDelete;
            try {
                zx();
                iDelete = this.IL.delete(str, str2, strArr);
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("DBHelper", e.getMessage());
                if (ldr()) {
                    throw e;
                }
                iDelete = 0;
            }
            return iDelete;
        }

        public synchronized void IL() {
            zx();
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.IL;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public synchronized void bX() {
            zx();
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.IL;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void eqN() {
            zx();
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.IL;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        private synchronized boolean ldr() {
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.IL;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }
    }

    private class bg extends android.database.sqlite.SQLiteOpenHelper {
        final android.content.Context bg;

        public bg(android.content.Context context) {
            super(context, "ttopensdk.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 11);
            this.bg = context;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            try {
                bg(sQLiteDatabase, this.bg);
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("DBHelper", th.getMessage());
            }
        }

        private void bg(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.content.Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.eqN.bg());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.WR.bX());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.yDt.bg());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.Ta.bg());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.rri.IL.bg());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.xxp.bX());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.bg.IL.IL.bX());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.VB.bg.bX.bX());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.Lq.bg());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    bX(sQLiteDatabase);
                    bg(sQLiteDatabase, com.bytedance.sdk.openadsdk.core.ldr.this.IL);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:11:0x0037 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:12:0x0040 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:6:0x0011 A[DONT_GENERATE] */
        /* JADX WARN: Code duplicated, block: B:7:0x0012 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:8:0x0016 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0021 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i <= i2) {
                bg(sQLiteDatabase, com.bytedance.sdk.openadsdk.core.ldr.this.IL);
                switch (i) {
                    case 1:
                        bg(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                        bg(sQLiteDatabase);
                        break;
                    case 3:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.yDt.bg());
                        bg(sQLiteDatabase);
                        break;
                    case 4:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.bg.IL.IL.bX());
                        bg(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.Ta.bg());
                        bg(sQLiteDatabase);
                        break;
                    case 6:
                        bg(sQLiteDatabase);
                        break;
                }
            } else {
                try {
                    bX(sQLiteDatabase);
                    bg(sQLiteDatabase, com.bytedance.sdk.openadsdk.core.ldr.this.IL);
                    switch (i) {
                        case 1:
                            bg(sQLiteDatabase);
                            break;
                        case 2:
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                            bg(sQLiteDatabase);
                            break;
                        case 3:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.yDt.bg());
                            bg(sQLiteDatabase);
                            break;
                        case 4:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.bg.IL.IL.bX());
                            bg(sQLiteDatabase);
                            break;
                        case 5:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.Ta.bg());
                            bg(sQLiteDatabase);
                            break;
                        case 6:
                            bg(sQLiteDatabase);
                            break;
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
            if (i < 11) {
                try {
                    IL(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.rri.IL.bg(sQLiteDatabase);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("DBHelper", th.getMessage());
                }
            }
        }

        private void bg(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.eqN.IL());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.WR.eqN());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.yDt.IL());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.eqN.Ta.IL());
        }

        private void IL(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.VB.bg.bX.eqN());
        }

        private void bX(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            java.util.ArrayList<java.lang.String> arrayListEqN = eqN(sQLiteDatabase);
            if (arrayListEqN == null || arrayListEqN.size() <= 0) {
                return;
            }
            java.util.Iterator<java.lang.String> it = arrayListEqN.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(java.lang.String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0039 A[PHI: r1
  0x0039: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:19:0x0037, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
        private java.util.ArrayList<java.lang.String> eqN(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            android.database.Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        java.lang.String string = cursorRawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (java.lang.Exception unused) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (java.lang.Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
            return arrayList;
        }
    }

    public com.bytedance.sdk.openadsdk.core.ldr.bX bg() {
        return this.bg;
    }

    private class IL extends android.database.AbstractCursor {
        @Override // android.database.AbstractCursor, android.database.Cursor
        public java.lang.String[] getColumnNames() {
            return new java.lang.String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public java.lang.String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }

        private IL() {
        }
    }
}
