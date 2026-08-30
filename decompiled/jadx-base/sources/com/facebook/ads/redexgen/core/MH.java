package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MH {
    public static com.facebook.ads.redexgen.core.MH A02;
    public final com.facebook.ads.redexgen.core.C1084Vd A00;
    public final com.facebook.ads.redexgen.core.MJ A01;

    public MH(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.util.concurrent.Executor executor, com.facebook.ads.redexgen.core.C8W c8w) {
        this.A01 = new com.facebook.ads.redexgen.core.MJ(c1199Zs);
        this.A00 = new com.facebook.ads.redexgen.core.C1084Vd(executor, c8w, c1199Zs);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.util.concurrent.Executor executor, com.facebook.ads.redexgen.core.C8W c8w) {
        if (!com.facebook.ads.redexgen.core.C0762Im.A1S(c1199Zs)) {
            return;
        }
        if (A02 == null) {
            A02 = new com.facebook.ads.redexgen.core.MH(c1199Zs, executor, c8w);
            A02.A00();
        } else {
            A02.A02(c8w);
        }
    }

    private void A02(com.facebook.ads.redexgen.core.C8W c8w) {
        this.A00.A07(c8w);
    }
}
