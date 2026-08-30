package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EntityInsertionAdapter<T> extends androidx.room.SharedSQLiteStatement {
    protected abstract void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, T t);

    public EntityInsertionAdapter(androidx.room.RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public final void insert(T t) {
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t);
            supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final void insert(T[] tArr) {
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            for (T t : tArr) {
                bind(supportSQLiteStatementAcquire, t);
                supportSQLiteStatementAcquire.executeInsert();
            }
            release(supportSQLiteStatementAcquire);
        } catch (java.lang.Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final void insert(java.lang.Iterable<? extends T> iterable) {
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            java.util.Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                supportSQLiteStatementAcquire.executeInsert();
            }
            release(supportSQLiteStatementAcquire);
        } catch (java.lang.Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final long insertAndReturnId(T t) {
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t);
            return supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(java.util.Collection<? extends T> collection) {
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            java.util.Iterator<? extends T> it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                jArr[i] = supportSQLiteStatementAcquire.executeInsert();
                i++;
            }
            release(supportSQLiteStatementAcquire);
            return jArr;
        } catch (java.lang.Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final long[] insertAndReturnIdsArray(T[] tArr) {
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[tArr.length];
            int i = 0;
            for (T t : tArr) {
                bind(supportSQLiteStatementAcquire, t);
                jArr[i] = supportSQLiteStatementAcquire.executeInsert();
                i++;
            }
            release(supportSQLiteStatementAcquire);
            return jArr;
        } catch (java.lang.Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final java.lang.Long[] insertAndReturnIdsArrayBox(java.util.Collection<? extends T> collection) {
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            java.lang.Long[] lArr = new java.lang.Long[collection.size()];
            java.util.Iterator<? extends T> it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                lArr[i] = java.lang.Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
                i++;
            }
            release(supportSQLiteStatementAcquire);
            return lArr;
        } catch (java.lang.Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final java.lang.Long[] insertAndReturnIdsArrayBox(T[] tArr) {
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            java.lang.Long[] lArr = new java.lang.Long[tArr.length];
            int i = 0;
            for (T t : tArr) {
                bind(supportSQLiteStatementAcquire, t);
                lArr[i] = java.lang.Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
                i++;
            }
            release(supportSQLiteStatementAcquire);
            return lArr;
        } catch (java.lang.Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final java.util.List<java.lang.Long> insertAndReturnIdsList(T[] tArr) {
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(tArr.length);
            int i = 0;
            for (T t : tArr) {
                bind(supportSQLiteStatementAcquire, t);
                arrayList.add(i, java.lang.Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
                i++;
            }
            release(supportSQLiteStatementAcquire);
            return arrayList;
        } catch (java.lang.Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }

    public final java.util.List<java.lang.Long> insertAndReturnIdsList(java.util.Collection<? extends T> collection) {
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
            java.util.Iterator<? extends T> it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                arrayList.add(i, java.lang.Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
                i++;
            }
            release(supportSQLiteStatementAcquire);
            return arrayList;
        } catch (java.lang.Throwable th) {
            release(supportSQLiteStatementAcquire);
            throw th;
        }
    }
}
