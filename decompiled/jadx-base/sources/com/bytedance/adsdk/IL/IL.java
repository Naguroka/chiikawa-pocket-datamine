package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
class IL {
    static final int[] bg = new int[0];
    static final long[] IL = new long[0];
    static final java.lang.Object[] bX = new java.lang.Object[0];

    static int bg(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
