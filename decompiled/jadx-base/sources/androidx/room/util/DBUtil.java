package androidx.room.util;

/* JADX INFO: loaded from: classes3.dex */
public class DBUtil {
    @java.lang.Deprecated
    public static android.database.Cursor query(androidx.room.RoomDatabase roomDatabase, androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery, boolean z) {
        return query(roomDatabase, supportSQLiteQuery, z, null);
    }

    public static android.database.Cursor query(androidx.room.RoomDatabase roomDatabase, androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery, boolean z, android.os.CancellationSignal cancellationSignal) {
        android.database.Cursor cursorQuery = roomDatabase.query(supportSQLiteQuery, cancellationSignal);
        if (!z || !(cursorQuery instanceof android.database.AbstractWindowedCursor)) {
            return cursorQuery;
        }
        android.database.AbstractWindowedCursor abstractWindowedCursor = (android.database.AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? androidx.room.util.CursorUtil.copyAndClose(abstractWindowedCursor) : cursorQuery;
    }

    public static void dropFtsSyncTriggers(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = supportSQLiteDatabase.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(cursorQuery.getString(0));
            } catch (java.lang.Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        for (java.lang.String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                supportSQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static int readVersion(java.io.File file) throws java.io.IOException {
        java.nio.channels.FileChannel fileChannel = null;
        try {
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
            java.nio.channels.FileChannel channel = new java.io.FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new java.io.IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i = byteBufferAllocate.getInt();
            if (channel != null) {
                channel.close();
            }
            return i;
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }

    public static android.os.CancellationSignal createCancellationSignal() {
        return new android.os.CancellationSignal();
    }

    private DBUtil() {
    }
}
