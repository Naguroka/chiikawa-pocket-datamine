package androidx.core.database;

/* JADX INFO: loaded from: classes.dex */
public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    public static android.database.CursorWindow create(java.lang.String str, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.database.CursorWindowCompat.Api28Impl.createCursorWindow(str, j);
        }
        return androidx.core.database.CursorWindowCompat.Api15Impl.createCursorWindow(str);
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.database.CursorWindow createCursorWindow(java.lang.String str, long j) {
            return new android.database.CursorWindow(str, j);
        }
    }

    static class Api15Impl {
        private Api15Impl() {
        }

        static android.database.CursorWindow createCursorWindow(java.lang.String str) {
            return new android.database.CursorWindow(str);
        }
    }
}
