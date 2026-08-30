package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0758Ih {
    public final android.os.Handler A00;
    public final com.facebook.ads.redexgen.core.Ii A01;

    public C0758Ih(android.os.Handler handler, com.facebook.ads.redexgen.core.Ii ii) {
        this.A00 = ii != null ? (android.os.Handler) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(handler) : null;
        this.A01 = ii;
    }

    public final void A01(int i, int i2, int i3, float f) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.RunnableC0755Ie(this, i, i2, i3, f));
        }
    }

    public final void A02(int i, long j) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.RunnableC0754Id(this, i, j));
        }
    }

    public final void A03(android.view.Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.RunnableC0756If(this, surface));
        }
    }

    public final void A04(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.RunnableC0753Ic(this, format));
        }
    }

    public final void A05(com.facebook.ads.redexgen.core.BH bh) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.RunnableC0757Ig(this, bh));
        }
    }

    public final void A06(com.facebook.ads.redexgen.core.BH bh) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.RunnableC0751Ia(this, bh));
        }
    }

    public final void A07(java.lang.String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.RunnableC0752Ib(this, str, j, j2));
        }
    }
}
