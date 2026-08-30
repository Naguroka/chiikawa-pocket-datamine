package androidx.sqlite.db;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleSQLiteQuery implements androidx.sqlite.db.SupportSQLiteQuery {
    private final java.lang.Object[] mBindArgs;
    private final java.lang.String mQuery;

    public SimpleSQLiteQuery(java.lang.String str, java.lang.Object[] objArr) {
        this.mQuery = str;
        this.mBindArgs = objArr;
    }

    public SimpleSQLiteQuery(java.lang.String str) {
        this(str, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public java.lang.String getSql() {
        return this.mQuery;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(androidx.sqlite.db.SupportSQLiteProgram supportSQLiteProgram) {
        bind(supportSQLiteProgram, this.mBindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        java.lang.Object[] objArr = this.mBindArgs;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public static void bind(androidx.sqlite.db.SupportSQLiteProgram supportSQLiteProgram, java.lang.Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            java.lang.Object obj = objArr[i];
            i++;
            bind(supportSQLiteProgram, i, obj);
        }
    }

    private static void bind(androidx.sqlite.db.SupportSQLiteProgram supportSQLiteProgram, int i, java.lang.Object obj) {
        if (obj == null) {
            supportSQLiteProgram.bindNull(i);
            return;
        }
        if (obj instanceof byte[]) {
            supportSQLiteProgram.bindBlob(i, (byte[]) obj);
            return;
        }
        if (obj instanceof java.lang.Float) {
            supportSQLiteProgram.bindDouble(i, ((java.lang.Float) obj).floatValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            supportSQLiteProgram.bindDouble(i, ((java.lang.Double) obj).doubleValue());
            return;
        }
        if (obj instanceof java.lang.Long) {
            supportSQLiteProgram.bindLong(i, ((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Integer) {
            supportSQLiteProgram.bindLong(i, ((java.lang.Integer) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Short) {
            supportSQLiteProgram.bindLong(i, ((java.lang.Short) obj).shortValue());
            return;
        }
        if (obj instanceof java.lang.Byte) {
            supportSQLiteProgram.bindLong(i, ((java.lang.Byte) obj).byteValue());
        } else if (obj instanceof java.lang.String) {
            supportSQLiteProgram.bindString(i, (java.lang.String) obj);
        } else {
            if (obj instanceof java.lang.Boolean) {
                supportSQLiteProgram.bindLong(i, ((java.lang.Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new java.lang.IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }
}
