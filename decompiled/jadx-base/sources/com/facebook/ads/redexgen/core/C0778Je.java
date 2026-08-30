package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0778Je {
    public final com.facebook.ads.redexgen.core.InterfaceC0776Jc A0B;
    public final boolean A0F;
    public final java.lang.String A0C = com.facebook.ads.redexgen.core.C0778Je.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final java.util.List<com.facebook.ads.redexgen.core.C0777Jd> A0D = new java.util.LinkedList();

    public C0778Je(com.facebook.ads.redexgen.core.C7j c7j, com.facebook.ads.redexgen.core.InterfaceC0776Jc interfaceC0776Jc) {
        int nativeViewabilityHistorySamplingRate = com.facebook.ads.redexgen.core.Io.A0D(c7j);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = c7j.A08().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = interfaceC0776Jc;
    }

    private int A00() {
        return this.A0B.A70();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (java.lang.System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(com.facebook.ads.redexgen.core.C0777Jd c0777Jd) {
        synchronized (this.A0D) {
            this.A0D.add(c0777Jd);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new com.facebook.ads.redexgen.core.C0777Jd(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new com.facebook.ads.redexgen.core.C0777Jd(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new com.facebook.ads.redexgen.core.C0777Jd(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new com.facebook.ads.redexgen.core.C0777Jd(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new com.facebook.ads.redexgen.core.C0777Jd(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = java.lang.System.currentTimeMillis();
        A03(new com.facebook.ads.redexgen.core.C0777Jd(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new com.facebook.ads.redexgen.core.C0777Jd(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new com.facebook.ads.redexgen.core.C0777Jd(A01(), 102, A00(), null));
    }

    public final void A0C(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        if (!this.A0F) {
            return;
        }
        A03(new com.facebook.ads.redexgen.core.C0777Jd(A01(), 103, A00(), null));
        com.facebook.ads.redexgen.core.M8.A06.execute(new com.facebook.ads.redexgen.core.RunnableC0775Jb(this, str, c7j));
    }
}
