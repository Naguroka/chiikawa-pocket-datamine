package androidx.sqlite.db;

/* JADX INFO: loaded from: classes3.dex */
public interface SupportSQLiteQuery {
    void bindTo(androidx.sqlite.db.SupportSQLiteProgram supportSQLiteProgram);

    int getArgCount();

    java.lang.String getSql();
}
