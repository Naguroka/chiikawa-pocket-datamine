package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
public class RoomSQLiteQuery implements androidx.sqlite.db.SupportSQLiteQuery, androidx.sqlite.db.SupportSQLiteProgram {
    private static final int BLOB = 5;
    static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;
    static final int POOL_LIMIT = 15;
    private static final int STRING = 4;
    static final java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> sQueryPool = new java.util.TreeMap<>();
    int mArgCount;
    private final int[] mBindingTypes;
    final byte[][] mBlobBindings;
    final int mCapacity;
    final double[] mDoubleBindings;
    final long[] mLongBindings;
    private volatile java.lang.String mQuery;
    final java.lang.String[] mStringBindings;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public static androidx.room.RoomSQLiteQuery copyFrom(androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery) {
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = acquire(supportSQLiteQuery.getSql(), supportSQLiteQuery.getArgCount());
        supportSQLiteQuery.bindTo(new androidx.sqlite.db.SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery.1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // androidx.sqlite.db.SupportSQLiteProgram
            public void bindNull(int i) {
                androidx.room.RoomSQLiteQuery.this.bindNull(i);
            }

            @Override // androidx.sqlite.db.SupportSQLiteProgram
            public void bindLong(int i, long j) {
                androidx.room.RoomSQLiteQuery.this.bindLong(i, j);
            }

            @Override // androidx.sqlite.db.SupportSQLiteProgram
            public void bindDouble(int i, double d) {
                androidx.room.RoomSQLiteQuery.this.bindDouble(i, d);
            }

            @Override // androidx.sqlite.db.SupportSQLiteProgram
            public void bindString(int i, java.lang.String str) {
                androidx.room.RoomSQLiteQuery.this.bindString(i, str);
            }

            @Override // androidx.sqlite.db.SupportSQLiteProgram
            public void bindBlob(int i, byte[] bArr) {
                androidx.room.RoomSQLiteQuery.this.bindBlob(i, bArr);
            }

            @Override // androidx.sqlite.db.SupportSQLiteProgram
            public void clearBindings() {
                androidx.room.RoomSQLiteQuery.this.clearBindings();
            }
        });
        return roomSQLiteQueryAcquire;
    }

    public static androidx.room.RoomSQLiteQuery acquire(java.lang.String str, int i) {
        java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> treeMap = sQueryPool;
        synchronized (treeMap) {
            java.util.Map.Entry<java.lang.Integer, androidx.room.RoomSQLiteQuery> entryCeilingEntry = treeMap.ceilingEntry(java.lang.Integer.valueOf(i));
            if (entryCeilingEntry != null) {
                treeMap.remove(entryCeilingEntry.getKey());
                androidx.room.RoomSQLiteQuery value = entryCeilingEntry.getValue();
                value.init(str, i);
                return value;
            }
            androidx.room.RoomSQLiteQuery roomSQLiteQuery = new androidx.room.RoomSQLiteQuery(i);
            roomSQLiteQuery.init(str, i);
            return roomSQLiteQuery;
        }
    }

    private RoomSQLiteQuery(int i) {
        this.mCapacity = i;
        int i2 = i + 1;
        this.mBindingTypes = new int[i2];
        this.mLongBindings = new long[i2];
        this.mDoubleBindings = new double[i2];
        this.mStringBindings = new java.lang.String[i2];
        this.mBlobBindings = new byte[i2][];
    }

    void init(java.lang.String str, int i) {
        this.mQuery = str;
        this.mArgCount = i;
    }

    public void release() {
        java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> treeMap = sQueryPool;
        synchronized (treeMap) {
            treeMap.put(java.lang.Integer.valueOf(this.mCapacity), this);
            prunePoolLocked();
        }
    }

    private static void prunePoolLocked() {
        java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> treeMap = sQueryPool;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        java.util.Iterator<java.lang.Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public java.lang.String getSql() {
        return this.mQuery;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        return this.mArgCount;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(androidx.sqlite.db.SupportSQLiteProgram supportSQLiteProgram) {
        for (int i = 1; i <= this.mArgCount; i++) {
            int i2 = this.mBindingTypes[i];
            if (i2 == 1) {
                supportSQLiteProgram.bindNull(i);
            } else if (i2 == 2) {
                supportSQLiteProgram.bindLong(i, this.mLongBindings[i]);
            } else if (i2 == 3) {
                supportSQLiteProgram.bindDouble(i, this.mDoubleBindings[i]);
            } else if (i2 == 4) {
                supportSQLiteProgram.bindString(i, this.mStringBindings[i]);
            } else if (i2 == 5) {
                supportSQLiteProgram.bindBlob(i, this.mBlobBindings[i]);
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i) {
        this.mBindingTypes[i] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        this.mBindingTypes[i] = 2;
        this.mLongBindings[i] = j;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        this.mBindingTypes[i] = 3;
        this.mDoubleBindings[i] = d;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i, java.lang.String str) {
        this.mBindingTypes[i] = 4;
        this.mStringBindings[i] = str;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i, byte[] bArr) {
        this.mBindingTypes[i] = 5;
        this.mBlobBindings[i] = bArr;
    }

    public void copyArgumentsFrom(androidx.room.RoomSQLiteQuery roomSQLiteQuery) {
        int argCount = roomSQLiteQuery.getArgCount() + 1;
        java.lang.System.arraycopy(roomSQLiteQuery.mBindingTypes, 0, this.mBindingTypes, 0, argCount);
        java.lang.System.arraycopy(roomSQLiteQuery.mLongBindings, 0, this.mLongBindings, 0, argCount);
        java.lang.System.arraycopy(roomSQLiteQuery.mStringBindings, 0, this.mStringBindings, 0, argCount);
        java.lang.System.arraycopy(roomSQLiteQuery.mBlobBindings, 0, this.mBlobBindings, 0, argCount);
        java.lang.System.arraycopy(roomSQLiteQuery.mDoubleBindings, 0, this.mDoubleBindings, 0, argCount);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        java.util.Arrays.fill(this.mBindingTypes, 1);
        java.util.Arrays.fill(this.mStringBindings, (java.lang.Object) null);
        java.util.Arrays.fill(this.mBlobBindings, (java.lang.Object) null);
        this.mQuery = null;
    }
}
