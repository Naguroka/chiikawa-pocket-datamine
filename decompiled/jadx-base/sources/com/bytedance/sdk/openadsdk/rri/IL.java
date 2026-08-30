package com.bytedance.sdk.openadsdk.rri;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    public static java.lang.String bg() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0, ad_id TEXT , url_type INTEGER default 0, error_code TEXT ,error_msg TEXT )";
    }

    public static void bg(android.database.sqlite.SQLiteDatabase sQLiteDatabase) throws android.database.SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN ad_id TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN error_code TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN error_msg TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN url_type INTEGER default 0");
    }
}
