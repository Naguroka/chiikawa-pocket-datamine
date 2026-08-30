package androidx.sqlite.db.framework;

/* JADX INFO: loaded from: classes3.dex */
class FrameworkSQLiteStatement extends androidx.sqlite.db.framework.FrameworkSQLiteProgram implements androidx.sqlite.db.SupportSQLiteStatement {
    private final android.database.sqlite.SQLiteStatement mDelegate;

    FrameworkSQLiteStatement(android.database.sqlite.SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.mDelegate = sQLiteStatement;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        this.mDelegate.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        return this.mDelegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        return this.mDelegate.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        return this.mDelegate.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public java.lang.String simpleQueryForString() {
        return this.mDelegate.simpleQueryForString();
    }
}
