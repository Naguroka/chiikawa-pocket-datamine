package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
public final class Objects extends com.applovin.exoplayer2.common.base.c {
    private Objects() {
    }

    public static boolean equal(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hashCode(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }
}
