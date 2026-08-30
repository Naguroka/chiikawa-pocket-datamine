package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0675Ey implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.F6 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.F7 A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.F8 A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.F9 A03;

    public RunnableC0675Ey(com.facebook.ads.redexgen.core.F6 f6, com.facebook.ads.redexgen.core.F9 f9, com.facebook.ads.redexgen.core.F7 f7, com.facebook.ads.redexgen.core.F8 f8) {
        this.A00 = f6;
        this.A03 = f9;
        this.A01 = f7;
        this.A02 = f8;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A03.ACW(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
