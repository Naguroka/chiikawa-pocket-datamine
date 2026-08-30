package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0570Ai implements java.lang.Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0575An A02;
    public final /* synthetic */ java.lang.String A03;

    public RunnableC0570Ai(com.facebook.ads.redexgen.core.C0575An c0575An, java.lang.String str, long j, long j2) {
        this.A02 = c0575An;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A02.A01.ABE(this.A03, this.A01, this.A00);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
