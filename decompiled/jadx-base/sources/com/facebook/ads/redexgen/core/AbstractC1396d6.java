package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1396d6 {
    public static byte[] A00;
    public static final com.facebook.ads.redexgen.core.C1395d5 A01;
    public static final com.facebook.ads.redexgen.core.HS[] A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 12);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{79, 75, 80, 72, 77, 74, 10, 86, 65, 66, 72, 65, 71, 80, 10, 78, 82, 73, 10, 77, 74, 80, 65, 86, 74, 69, 72, 10, 118, 65, 66, 72, 65, 71, 80, 77, 75, 74, 98, 69, 71, 80, 75, 86, 93, 109, 73, 84, 72};
    }

    static {
        com.facebook.ads.redexgen.core.C1395d5 impl;
        try {
            A02();
            java.lang.Class<?> implClass = java.lang.Class.forName(A00(0, 49, 40));
            impl = (com.facebook.ads.redexgen.core.C1395d5) implClass.newInstance();
        } catch (java.lang.ClassCastException unused) {
            impl = null;
        } catch (java.lang.ClassNotFoundException unused2) {
            impl = null;
        } catch (java.lang.IllegalAccessException unused3) {
            impl = null;
        } catch (java.lang.InstantiationException unused4) {
            impl = null;
        }
        if (impl == null) {
            impl = new com.facebook.ads.redexgen.core.C1395d5();
        }
        A01 = impl;
        A02 = new com.facebook.ads.redexgen.core.HS[0];
    }

    public static java.lang.String A01(com.facebook.ads.redexgen.core.AbstractC04866r abstractC04866r) {
        return A01.A03(abstractC04866r);
    }
}
