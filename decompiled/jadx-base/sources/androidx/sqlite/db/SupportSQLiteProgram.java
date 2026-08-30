package androidx.sqlite.db;

/* JADX INFO: loaded from: classes3.dex */
public interface SupportSQLiteProgram extends java.io.Closeable {
    void bindBlob(int i, byte[] bArr);

    void bindDouble(int i, double d);

    void bindLong(int i, long j);

    void bindNull(int i);

    void bindString(int i, java.lang.String str);

    void clearBindings();
}
