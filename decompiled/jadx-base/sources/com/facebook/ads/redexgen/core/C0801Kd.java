package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0801Kd {
    public static java.lang.String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final java.lang.ThreadLocal<com.facebook.ads.redexgen.core.C0801Kd> A02 = new java.lang.ThreadLocal<>();
    public final com.facebook.ads.redexgen.core.KM A00 = new com.facebook.ads.redexgen.core.KM();

    public static com.facebook.ads.redexgen.core.KM A00() {
        return A02().A00;
    }

    public static com.facebook.ads.redexgen.core.KM A01(com.facebook.ads.redexgen.core.C0800Kc c0800Kc) {
        com.facebook.ads.redexgen.core.KM currentStackTraces = new com.facebook.ads.redexgen.core.KM(A00());
        currentStackTraces.add(c0800Kc);
        return currentStackTraces;
    }

    public static com.facebook.ads.redexgen.core.C0801Kd A02() {
        com.facebook.ads.redexgen.core.C0801Kd c0801Kd = A02.get();
        if (c0801Kd == null) {
            com.facebook.ads.redexgen.core.C0801Kd c0801Kd2 = new com.facebook.ads.redexgen.core.C0801Kd();
            A02.set(c0801Kd2);
            return c0801Kd2;
        }
        return c0801Kd;
    }

    public static void A03(com.facebook.ads.redexgen.core.KY ky) {
        com.facebook.ads.redexgen.core.KM kmA05 = ky.A05();
        if (kmA05 != null) {
            com.facebook.ads.redexgen.core.KM createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(kmA05);
        }
    }

    public static void A04(com.facebook.ads.redexgen.core.KY ky) {
        com.facebook.ads.redexgen.core.KM kmA05 = ky.A05();
        if (kmA05 != null) {
            com.facebook.ads.redexgen.core.KM km = A02().A00;
            java.lang.String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            km.removeAll(kmA05);
        }
    }
}
