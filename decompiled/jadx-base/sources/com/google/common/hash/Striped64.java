package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.hash.ElementTypesAreNonnullByDefault
abstract class Striped64 extends java.lang.Number {
    private static final sun.misc.Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    volatile transient long base;
    volatile transient int busy;

    @javax.annotation.CheckForNull
    volatile transient com.google.common.hash.Striped64.Cell[] cells;
    static final java.lang.ThreadLocal<int[]> threadHashCode = new java.lang.ThreadLocal<>();
    static final java.util.Random rng = new java.util.Random();
    static final int NCPU = java.lang.Runtime.getRuntime().availableProcessors();

    abstract long fn(long currentValue, long newValue);

    static final class Cell {
        private static final sun.misc.Unsafe UNSAFE;
        private static final long valueOffset;
        volatile long p0;
        volatile long p1;
        volatile long p2;
        volatile long p3;
        volatile long p4;
        volatile long p5;
        volatile long p6;
        volatile long q0;
        volatile long q1;
        volatile long q2;
        volatile long q3;
        volatile long q4;
        volatile long q5;
        volatile long q6;
        volatile long value;

        Cell(long x) {
            this.value = x;
        }

        final boolean cas(long cmp, long val) {
            return UNSAFE.compareAndSwapLong(this, valueOffset, cmp, val);
        }

        static {
            try {
                sun.misc.Unsafe unsafe = com.google.common.hash.Striped64.getUnsafe();
                UNSAFE = unsafe;
                valueOffset = unsafe.objectFieldOffset(com.google.common.hash.Striped64.Cell.class.getDeclaredField("value"));
            } catch (java.lang.Exception e) {
                throw new java.lang.Error(e);
            }
        }
    }

    static {
        try {
            sun.misc.Unsafe unsafe = getUnsafe();
            UNSAFE = unsafe;
            baseOffset = unsafe.objectFieldOffset(com.google.common.hash.Striped64.class.getDeclaredField(androidx.media3.extractor.text.ttml.TtmlNode.RUBY_BASE));
            busyOffset = unsafe.objectFieldOffset(com.google.common.hash.Striped64.class.getDeclaredField("busy"));
        } catch (java.lang.Exception e) {
            throw new java.lang.Error(e);
        }
    }

    Striped64() {
    }

    final boolean casBase(long cmp, long val) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, cmp, val);
    }

    final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    final void retryUpdate(long x, @javax.annotation.CheckForNull int[] hc, boolean wasUncontended) {
        int iNextInt;
        int[] iArr;
        boolean z;
        int length;
        boolean z2;
        int length2;
        if (hc == null) {
            iArr = new int[1];
            threadHashCode.set(iArr);
            iNextInt = rng.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr[0] = iNextInt;
        } else {
            iNextInt = hc[0];
            iArr = hc;
        }
        boolean z3 = false;
        int i = iNextInt;
        boolean z4 = wasUncontended;
        while (true) {
            com.google.common.hash.Striped64.Cell[] cellArr = this.cells;
            if (cellArr != null && (length = cellArr.length) > 0) {
                com.google.common.hash.Striped64.Cell cell = cellArr[(length - 1) & i];
                if (cell == null) {
                    if (this.busy == 0) {
                        com.google.common.hash.Striped64.Cell cell2 = new com.google.common.hash.Striped64.Cell(x);
                        if (this.busy == 0 && casBusy()) {
                            try {
                                com.google.common.hash.Striped64.Cell[] cellArr2 = this.cells;
                                if (cellArr2 == null || (length2 = cellArr2.length) <= 0) {
                                    z2 = false;
                                } else {
                                    int i2 = (length2 - 1) & i;
                                    if (cellArr2[i2] == null) {
                                        cellArr2[i2] = cell2;
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                }
                                this.busy = 0;
                                if (z2) {
                                    return;
                                }
                            } catch (java.lang.Throwable th) {
                                this.busy = 0;
                                throw th;
                            }
                        }
                    }
                    z3 = false;
                    int i3 = i ^ (i << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    i = i4 ^ (i4 << 5);
                    iArr[0] = i;
                } else {
                    if (z4) {
                        long j = cell.value;
                        if (cell.cas(j, fn(j, x))) {
                            return;
                        }
                        if (length >= NCPU || this.cells != cellArr) {
                            z3 = false;
                        } else if (!z3) {
                            z3 = true;
                        } else if (this.busy == 0 && casBusy()) {
                            try {
                                if (this.cells == cellArr) {
                                    com.google.common.hash.Striped64.Cell[] cellArr3 = new com.google.common.hash.Striped64.Cell[length << 1];
                                    for (int i5 = 0; i5 < length; i5++) {
                                        cellArr3[i5] = cellArr[i5];
                                    }
                                    this.cells = cellArr3;
                                }
                                this.busy = 0;
                                z3 = false;
                            } catch (java.lang.Throwable th2) {
                                this.busy = 0;
                                throw th2;
                            }
                        }
                    } else {
                        z4 = true;
                    }
                    int i6 = i ^ (i << 13);
                    int i7 = i6 ^ (i6 >>> 17);
                    i = i7 ^ (i7 << 5);
                    iArr[0] = i;
                }
            } else if (this.busy == 0 && this.cells == cellArr && casBusy()) {
                try {
                    if (this.cells == cellArr) {
                        com.google.common.hash.Striped64.Cell[] cellArr4 = new com.google.common.hash.Striped64.Cell[2];
                        cellArr4[i & 1] = new com.google.common.hash.Striped64.Cell(x);
                        this.cells = cellArr4;
                        z = true;
                    } else {
                        z = false;
                    }
                    this.busy = 0;
                    if (z) {
                        return;
                    }
                } catch (java.lang.Throwable th3) {
                    this.busy = 0;
                    throw th3;
                }
            } else {
                long j2 = this.base;
                if (casBase(j2, fn(j2, x))) {
                    return;
                }
            }
        }
    }

    final void internalReset(long initialValue) {
        com.google.common.hash.Striped64.Cell[] cellArr = this.cells;
        this.base = initialValue;
        if (cellArr != null) {
            for (com.google.common.hash.Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    cell.value = initialValue;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static sun.misc.Unsafe getUnsafe() {
        try {
            try {
                return sun.misc.Unsafe.getUnsafe();
            } catch (java.security.PrivilegedActionException e) {
                throw new java.lang.RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (java.lang.SecurityException unused) {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() { // from class: com.google.common.hash.Striped64.1
                @Override // java.security.PrivilegedExceptionAction
                public sun.misc.Unsafe run() throws java.lang.Exception {
                    for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        java.lang.Object obj = field.get(null);
                        if (sun.misc.Unsafe.class.isInstance(obj)) {
                            return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
                        }
                    }
                    throw new java.lang.NoSuchFieldError("the Unsafe");
                }
            });
        }
    }
}
