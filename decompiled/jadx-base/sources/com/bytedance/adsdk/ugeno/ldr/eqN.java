package com.bytedance.adsdk.ugeno.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    public static int bg(boolean z, int i, int i2) {
        if (i2 == 0 || !z) {
            return i;
        }
        int i3 = i - kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
        int iAbs = java.lang.Math.abs(i3) % i2;
        return (i3 >= 0 || iAbs == 0) ? iAbs : i2 - iAbs;
    }

    public static boolean bg(int i, java.util.Collection<?> collection) {
        return i >= 0 && i < collection.size();
    }
}
