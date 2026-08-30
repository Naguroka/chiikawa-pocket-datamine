package com.bykv.vk.openvk.preload.geckox.a;

/* JADX INFO: compiled from: AbandonChannelSQLiteHelper.java */
/* JADX INFO: loaded from: classes3.dex */
class b extends android.database.sqlite.SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile com.bykv.vk.openvk.preload.geckox.a.b f1716a;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private b(android.content.Context context, java.lang.String str) {
        super(context, str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
    }

    public static com.bykv.vk.openvk.preload.geckox.a.b a(android.content.Context context) {
        if (f1716a == null) {
            synchronized (com.bykv.vk.openvk.preload.geckox.a.b.class) {
                if (f1716a == null) {
                    f1716a = new com.bykv.vk.openvk.preload.geckox.a.b(context.getApplicationContext(), "geckox_clean_statistic" + com.bykv.vk.openvk.preload.geckox.utils.a.c(context) + ".db");
                }
            }
        }
        return f1716a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists geckox_clean_statistic (id integer primary key autoincrement,access_key text,channel text,clean_type integer,status integer,pkg_id integer,err_code integer,clean_strategy integer,clean_duration integer,err_msg text)");
    }

    final void a(int i, int i2, java.lang.String str, long j) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("access_key", (java.lang.String) null);
        contentValues.put("channel", (java.lang.String) null);
        contentValues.put("clean_type", (java.lang.Integer) 0);
        contentValues.put("status", java.lang.Integer.valueOf(i));
        contentValues.put("pkg_id", (java.lang.Long) 0L);
        contentValues.put("err_code", java.lang.Integer.valueOf(i2));
        contentValues.put("err_msg", str);
        contentValues.put("clean_duration", java.lang.Long.valueOf(j));
        contentValues.put("clean_strategy", (java.lang.Integer) 1);
        try {
            getWritableDatabase().insert("geckox_clean_statistic", null, contentValues);
        } catch (java.lang.Exception e) {
            com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("clean-channel", "insert failed", e);
        }
    }

    final java.util.List<com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel> a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursor = null;
        try {
            android.database.Cursor cursorQuery = getWritableDatabase().query("geckox_clean_statistic", null, null, null, null, null, null);
            if (cursorQuery == null) {
                return arrayList;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    java.lang.String string = cursorQuery.getString(cursorQuery.getColumnIndex("access_key"));
                    java.lang.String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("channel"));
                    int i = cursorQuery.getInt(cursorQuery.getColumnIndex("clean_type"));
                    int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                    long j = cursorQuery.getInt(cursorQuery.getColumnIndex("pkg_id"));
                    int i3 = cursorQuery.getInt(cursorQuery.getColumnIndex("err_code"));
                    java.lang.String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("err_msg"));
                    int i4 = cursorQuery.getInt(cursorQuery.getColumnIndex("clean_strategy"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndex("clean_duration"));
                    com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel packageStatisticModel = new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel();
                    packageStatisticModel.accessKey = string;
                    packageStatisticModel.channel = string2;
                    packageStatisticModel.statsType = java.lang.Integer.valueOf(i2);
                    packageStatisticModel.id = java.lang.Long.valueOf(j);
                    packageStatisticModel.errCode = i3 == 0 ? null : java.lang.String.valueOf(i3);
                    packageStatisticModel.errMsg = string3;
                    packageStatisticModel.cleanType = java.lang.Integer.valueOf(i);
                    packageStatisticModel.cleanDuration = java.lang.Long.valueOf(j2);
                    packageStatisticModel.cleanStrategy = java.lang.Integer.valueOf(i4);
                    arrayList.add(packageStatisticModel);
                } catch (java.lang.Exception e) {
                    e = e;
                    cursor = cursorQuery;
                    com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("clean-channel", "get all statistic failed!", e);
                    cursorQuery = cursor;
                }
            }
            getWritableDatabase().delete("geckox_clean_statistic", null, null);
            com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(cursorQuery);
            return arrayList;
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }
}
