package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0571Aj implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.internal.exoplayer2.thirdparty.Format A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0575An A01;

    public RunnableC0571Aj(com.facebook.ads.redexgen.core.C0575An c0575An, com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        this.A01 = c0575An;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ABH(this.A00);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
