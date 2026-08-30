package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6H, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C6H {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"T8", "", "As3hIStO2xNa0GSSHrkEVjQu", "DXoFAMJTZKDaTyX0if7pZrkyLA7XvGsC", "niDMG5wZxQy0H8acRFWa8hH2XuraMrTN", "878XRXnWNCNw6FCwqGtfz4QO6Hd03tfb", "ID5FT62NpqbpmPra08cWCCHJVsi2pDHC", "txdj"};
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.C6F> A02;
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.String> A03;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[7].length() != 4) {
                throw new java.lang.RuntimeException();
            }
            A01[6] = "PcSdqCtN9qYKSfDsPVWrfTZjyuiu0dLa";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 86);
            i4++;
        }
    }

    public static void A05() {
        A00 = new byte[]{19, 27, 22, 17, 33, 40, 23, 36, 36, 27, 22, 23, 17, 15, 24, 15, 28, 19, 13, 43, 38, 40, 35, 33, 49, 56, 39, 52, 52, 43, 38, 39};
    }

    static {
        A05();
        A02 = new java.util.concurrent.atomic.AtomicReference<>();
        A03 = new java.util.concurrent.atomic.AtomicReference<>(A04(0, 0, 12));
    }

    public static com.facebook.ads.redexgen.core.C6F A00() {
        com.facebook.ads.redexgen.core.C6F advertisingIdInfo = A02.get();
        if (advertisingIdInfo == null) {
            return com.facebook.ads.redexgen.core.C6F.A00();
        }
        return advertisingIdInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.facebook.ads.redexgen.core.C6F A01(com.facebook.ads.redexgen.core.C7j c7j, com.facebook.ads.redexgen.core.C6F c6f) {
        if (c6f != null) {
            try {
            } catch (java.lang.Throwable t) {
                c7j.A07().AA0(A04(12, 7, 84), com.facebook.ads.redexgen.core.C8E.A1Q, new com.facebook.ads.redexgen.core.C8F(t));
            }
        }
        return com.facebook.ads.redexgen.core.C6N.A00(c7j);
        return c6f;
    }

    public static com.facebook.ads.redexgen.core.C6F A02(com.facebook.ads.redexgen.core.C7j c7j, com.facebook.ads.redexgen.core.C6F c6f, com.facebook.ads.redexgen.core.C6G c6g) {
        com.facebook.ads.redexgen.core.C6I c6iA00 = null;
        try {
            if (com.facebook.ads.redexgen.core.AbstractC0761Il.A06(c7j) && (c6f == null || android.text.TextUtils.isEmpty(c6f.A03()))) {
                c6iA00 = com.facebook.ads.redexgen.core.C6J.A00(c7j.getContentResolver());
            }
        } catch (java.lang.Throwable th) {
            c7j.A07().AA0(A04(12, 7, 84), com.facebook.ads.redexgen.core.C8E.A1S, new com.facebook.ads.redexgen.core.C8F(th));
        }
        if (c6iA00 != null && c6iA00.A01 != null) {
            A03.set(c6iA00.A01);
            c6g.A05(c6iA00.A01);
        }
        if (c6f == null && c6iA00 != null && !android.text.TextUtils.isEmpty(c6iA00.A00)) {
            return new com.facebook.ads.redexgen.core.C6F(c6iA00.A00, c6iA00.A02, com.facebook.ads.redexgen.core.C6E.A04);
        }
        return c6f;
    }

    public static java.lang.String A03() {
        java.lang.String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 12);
        }
        return attributionId;
    }

    public static void A06(com.facebook.ads.redexgen.core.C6G c6g) {
        A02.set(c6g.A02());
        A03.set(c6g.A03());
    }

    public static void A07(com.facebook.ads.redexgen.core.C7j c7j) {
        long jA01;
        com.facebook.ads.redexgen.core.C6F advertisingIdInfo;
        try {
            com.facebook.ads.redexgen.core.C6G c6g = new com.facebook.ads.redexgen.core.C6G(c7j);
            A06(c6g);
            if (A08()) {
                return;
            }
            com.facebook.ads.redexgen.core.C6F advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !android.text.TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                jA01 = advertisingIdInfo2.A01();
            } else {
                jA01 = -1;
            }
            if (jA01 > 0 && java.lang.System.currentTimeMillis() - jA01 < com.facebook.ads.redexgen.core.AbstractC0761Il.A00(c7j)) {
                return;
            }
            if (com.facebook.ads.redexgen.core.AbstractC0761Il.A07(c7j)) {
                advertisingIdInfo = A01(c7j, A02(c7j, null, c6g));
            } else {
                advertisingIdInfo = A02(c7j, A01(c7j, null), c6g);
            }
            if (advertisingIdInfo != null && !android.text.TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                c6g.A04(advertisingIdInfo);
            }
        } catch (java.lang.Throwable t) {
            c7j.A07().AA0(A04(12, 7, 84), com.facebook.ads.redexgen.core.C8E.A1R, new com.facebook.ads.redexgen.core.C8F(t));
        }
    }

    public static boolean A08() {
        boolean z = false;
        boolean updated = com.facebook.ads.redexgen.core.L7.A04();
        if (updated) {
            java.lang.String strA04 = A04(0, 12, 92);
            boolean updated2 = com.facebook.ads.redexgen.core.L7.A05(strA04);
            if (updated2) {
                A03.set(com.facebook.ads.redexgen.core.L7.A01(strA04));
                z = true;
            }
        }
        boolean zA04 = com.facebook.ads.redexgen.core.L7.A04();
        if (A01[7].length() != 4) {
            throw new java.lang.RuntimeException();
        }
        A01[6] = "Cpq5b7Aomj18wFHDN8BPNJlk9AiHAVMm";
        if (!zA04) {
            return z;
        }
        java.lang.String strA05 = A04(19, 13, 108);
        boolean updated3 = com.facebook.ads.redexgen.core.L7.A05(strA05);
        if (updated3) {
            java.lang.String strA01 = com.facebook.ads.redexgen.core.L7.A01(strA05);
            java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.C6F> atomicReference = A02;
            if (strA01 == null) {
                if (A01[7].length() != 4) {
                    A01[7] = "Ywke";
                    strA01 = A04(0, 0, 2);
                } else {
                    A01[5] = "aB8iQRCNNWTx0AWcZvgXlT81SikGsrWB";
                    strA01 = A04(0, 0, 12);
                }
            }
            atomicReference.set(new com.facebook.ads.redexgen.core.C6F(strA01, false, com.facebook.ads.redexgen.core.C6E.A03));
            return true;
        }
        return z;
    }
}
