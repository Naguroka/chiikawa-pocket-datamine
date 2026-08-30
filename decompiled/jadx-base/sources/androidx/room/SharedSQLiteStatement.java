package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SharedSQLiteStatement {
    private final androidx.room.RoomDatabase mDatabase;
    private final java.util.concurrent.atomic.AtomicBoolean mLock = new java.util.concurrent.atomic.AtomicBoolean(false);
    private volatile androidx.sqlite.db.SupportSQLiteStatement mStmt;

    protected abstract java.lang.String createQuery();

    public SharedSQLiteStatement(androidx.room.RoomDatabase roomDatabase) {
        this.mDatabase = roomDatabase;
    }

    protected void assertNotMainThread() {
        this.mDatabase.assertNotMainThread();
    }

    private androidx.sqlite.db.SupportSQLiteStatement createNewStatement() {
        return this.mDatabase.compileStatement(createQuery());
    }

    private androidx.sqlite.db.SupportSQLiteStatement getStmt(boolean z) {
        if (z) {
            if (this.mStmt == null) {
                this.mStmt = createNewStatement();
            }
            return this.mStmt;
        }
        return createNewStatement();
    }

    public androidx.sqlite.db.SupportSQLiteStatement acquire() {
        assertNotMainThread();
        return getStmt(this.mLock.compareAndSet(false, true));
    }

    public void release(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement) {
        if (supportSQLiteStatement == this.mStmt) {
            this.mLock.set(false);
        }
    }
}
