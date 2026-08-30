package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class Hashing {
    private static final long C1 = -862048943;
    private static final long C2 = 461845907;
    private static final int MAX_TABLE_SIZE = 1073741824;

    static boolean needsResizing(int size, int tableSize, double loadFactor) {
        return ((double) size) > loadFactor * ((double) tableSize) && tableSize < 1073741824;
    }

    private Hashing() {
    }

    static int smear(int hashCode) {
        return (int) (((long) java.lang.Integer.rotateLeft((int) (((long) hashCode) * C1), 15)) * C2);
    }

    static int smearedHash(@javax.annotation.CheckForNull java.lang.Object o) {
        return smear(o == null ? 0 : o.hashCode());
    }

    static int closedTableSize(int expectedEntries, double loadFactor) {
        int iMax = java.lang.Math.max(expectedEntries, 2);
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax);
        if (iMax <= ((int) (loadFactor * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i = iHighestOneBit << 1;
        if (i > 0) {
            return i;
        }
        return 1073741824;
    }
}
