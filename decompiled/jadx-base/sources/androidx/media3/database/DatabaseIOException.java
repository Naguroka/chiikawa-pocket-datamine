package androidx.media3.database;

/* JADX INFO: loaded from: classes.dex */
public final class DatabaseIOException extends java.io.IOException {
    public DatabaseIOException(android.database.SQLException sQLException) {
        super(sQLException);
    }

    public DatabaseIOException(android.database.SQLException sQLException, java.lang.String str) {
        super(str, sQLException);
    }
}
