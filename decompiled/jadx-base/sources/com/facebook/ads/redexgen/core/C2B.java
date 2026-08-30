package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C2B {
    public static com.facebook.ads.redexgen.core.C2A A00;
    public static final java.util.concurrent.atomic.AtomicBoolean A01 = new java.util.concurrent.atomic.AtomicBoolean();

    public static com.facebook.ads.redexgen.core.C2A A00(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (A00 == null) {
            A00 = new com.facebook.ads.redexgen.core.C2A(c1198Zr);
        }
        return A00;
    }

    public static void A01(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (com.facebook.ads.redexgen.core.AbstractC0764Ip.A0B(c1198Zr)) {
            A03(c1198Zr);
        }
    }

    public static void A02(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (com.facebook.ads.redexgen.core.AbstractC0764Ip.A0A(c1198Zr)) {
            A03(c1198Zr);
        }
    }

    public static void A03(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (A01.compareAndSet(false, true)) {
            com.facebook.ads.redexgen.core.ExecutorC0844Lx.A01.execute(new com.facebook.ads.redexgen.core.C1292bQ(c1198Zr));
        }
    }
}
