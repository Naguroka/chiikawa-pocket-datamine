package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EntityDeletionOrUpdateAdapter<T> extends androidx.room.SharedSQLiteStatement {
    protected abstract void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, T t);

    @Override // androidx.room.SharedSQLiteStatement
    protected abstract java.lang.String createQuery();

    public EntityDeletionOrUpdateAdapter(androidx.room.RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public final int handle(T t) {
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t);
            return supportSQLiteStatementAcquire.executeUpdateDelete();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final int handleMultiple(java.lang.Iterable<? extends T> iterable) {
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            java.util.Iterator<? extends T> it = iterable.iterator();
            int iExecuteUpdateDelete = 0;
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                iExecuteUpdateDelete += supportSQLiteStatementAcquire.executeUpdateDelete();
            }
            release(supportSQLiteStatementAcquire);
            return iExecuteUpdateDelete;
        } catch (java.lang.Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final int handleMultiple(T[] tArr) {
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            int iExecuteUpdateDelete = 0;
            for (T t : tArr) {
                bind(supportSQLiteStatementAcquire, t);
                iExecuteUpdateDelete += supportSQLiteStatementAcquire.executeUpdateDelete();
            }
            release(supportSQLiteStatementAcquire);
            return iExecuteUpdateDelete;
        } catch (java.lang.Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }
}
