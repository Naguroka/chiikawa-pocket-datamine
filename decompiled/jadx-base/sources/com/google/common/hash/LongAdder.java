package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class LongAdder extends com.google.common.hash.Striped64 implements java.io.Serializable, com.google.common.hash.LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    @Override // com.google.common.hash.Striped64
    final long fn(long v, long x) {
        return v + x;
    }

    @Override // com.google.common.hash.LongAddable
    public void add(long x) {
        int length;
        com.google.common.hash.Striped64.Cell cell;
        com.google.common.hash.Striped64.Cell[] cellArr = this.cells;
        if (cellArr == null) {
            long j = this.base;
            if (casBase(j, j + x)) {
                return;
            }
        }
        int[] iArr = threadHashCode.get();
        boolean zCas = true;
        if (iArr != null && cellArr != null && (length = cellArr.length) >= 1 && (cell = cellArr[(length - 1) & iArr[0]]) != null) {
            long j2 = cell.value;
            zCas = cell.cas(j2, j2 + x);
            if (zCas) {
                return;
            }
        }
        retryUpdate(x, iArr, zCas);
    }

    @Override // com.google.common.hash.LongAddable
    public void increment() {
        add(1L);
    }

    public void decrement() {
        add(-1L);
    }

    @Override // com.google.common.hash.LongAddable
    public long sum() {
        long j = this.base;
        com.google.common.hash.Striped64.Cell[] cellArr = this.cells;
        if (cellArr != null) {
            for (com.google.common.hash.Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j += cell.value;
                }
            }
        }
        return j;
    }

    public void reset() {
        internalReset(0L);
    }

    public long sumThenReset() {
        long j = this.base;
        com.google.common.hash.Striped64.Cell[] cellArr = this.cells;
        this.base = 0L;
        if (cellArr != null) {
            for (com.google.common.hash.Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j += cell.value;
                    cell.value = 0L;
                }
            }
        }
        return j;
    }

    public java.lang.String toString() {
        return java.lang.Long.toString(sum());
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return sum();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        s.defaultWriteObject();
        s.writeLong(sum());
    }

    private void readObject(java.io.ObjectInputStream s) throws java.lang.ClassNotFoundException, java.io.IOException {
        s.defaultReadObject();
        this.busy = 0;
        this.cells = null;
        this.base = s.readLong();
    }
}
