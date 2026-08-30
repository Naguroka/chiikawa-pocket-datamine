package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class ja {
    static int a(int i, double d) {
        int iMax = java.lang.Math.max(i, 2);
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i2 = iHighestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    static int a(int i) {
        return (int) (((long) java.lang.Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    static int a(java.lang.Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
