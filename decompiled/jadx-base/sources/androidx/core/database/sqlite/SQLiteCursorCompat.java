package androidx.core.database.sqlite;

/* JADX INFO: loaded from: classes.dex */
public final class SQLiteCursorCompat {
    private SQLiteCursorCompat() {
    }

    public static void setFillWindowForwardOnly(android.database.sqlite.SQLiteCursor sQLiteCursor, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.database.sqlite.SQLiteCursorCompat.Api28Impl.setFillWindowForwardOnly(sQLiteCursor, z);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static void setFillWindowForwardOnly(android.database.sqlite.SQLiteCursor sQLiteCursor, boolean z) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }
}
