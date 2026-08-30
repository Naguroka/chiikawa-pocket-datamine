package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0730Hf {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @com.facebook.ads.internal.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T A01(T t) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException();
    }

    public static int A00(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @com.facebook.ads.internal.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static java.lang.String A02(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static void A03(boolean z) {
        if (z) {
        } else {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void A04(boolean z) {
        if (z) {
        } else {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void A05(boolean z, java.lang.Object obj) {
        if (z) {
        } else {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static void A06(boolean z, java.lang.Object obj) {
        if (z) {
        } else {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }
}
