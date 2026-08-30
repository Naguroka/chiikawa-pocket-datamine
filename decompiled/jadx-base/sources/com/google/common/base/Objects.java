package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Objects extends com.google.common.base.ExtraObjectsMethodsForWeb {
    private Objects() {
    }

    public static boolean equal(@javax.annotation.CheckForNull java.lang.Object a2, @javax.annotation.CheckForNull java.lang.Object b) {
        return a2 == b || (a2 != null && a2.equals(b));
    }

    public static int hashCode(@javax.annotation.CheckForNull java.lang.Object... objects) {
        return java.util.Arrays.hashCode(objects);
    }
}
