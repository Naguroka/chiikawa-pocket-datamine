package com.bykv.vk.openvk.preload.geckox.utils;

/* JADX INFO: loaded from: classes3.dex */
public class CloseableUtils {
    public static boolean close(java.io.Closeable closeable) {
        if (closeable == null) {
            return true;
        }
        try {
            closeable.close();
            return true;
        } catch (java.io.IOException e) {
            com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.e("gecko-debug-tag", "close:", e);
            return false;
        }
    }

    public static boolean close(android.database.Cursor cursor) {
        if (cursor == null) {
            return true;
        }
        try {
            cursor.close();
            return true;
        } catch (java.lang.Exception e) {
            com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.e("gecko-debug-tag", "close:", e);
            return false;
        }
    }

    public static boolean close(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return true;
        }
        try {
            sQLiteDatabase.close();
            return true;
        } catch (java.lang.Exception e) {
            com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.e("gecko-debug-tag", "close:", e);
            return false;
        }
    }
}
