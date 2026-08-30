package androidx.sqlite.db;

/* JADX INFO: loaded from: classes3.dex */
public interface SupportSQLiteStatement extends androidx.sqlite.db.SupportSQLiteProgram {
    void execute();

    long executeInsert();

    int executeUpdateDelete();

    long simpleQueryForLong();

    java.lang.String simpleQueryForString();
}
