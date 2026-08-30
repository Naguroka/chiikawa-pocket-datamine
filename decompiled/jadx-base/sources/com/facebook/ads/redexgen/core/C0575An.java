package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.An, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0575An {
    public final android.os.Handler A00;
    public final com.facebook.ads.redexgen.core.InterfaceC0576Ao A01;

    public C0575An(android.os.Handler handler, com.facebook.ads.redexgen.core.InterfaceC0576Ao interfaceC0576Ao) {
        this.A00 = interfaceC0576Ao != null ? (android.os.Handler) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(handler) : null;
        this.A01 = interfaceC0576Ao;
    }

    public final void A01(int i) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.RunnableC0574Am(this, i));
        }
    }

    public final void A02(int i, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.RunnableC0572Ak(this, i, j, j2));
        }
    }

    public final void A03(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.RunnableC0571Aj(this, format));
        }
    }

    public final void A04(com.facebook.ads.redexgen.core.BH bh) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.RunnableC0573Al(this, bh));
        }
    }

    public final void A05(com.facebook.ads.redexgen.core.BH bh) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.RunnableC0569Ah(this, bh));
        }
    }

    public final void A06(java.lang.String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new com.facebook.ads.redexgen.core.RunnableC0570Ai(this, str, j, j2));
        }
    }
}
