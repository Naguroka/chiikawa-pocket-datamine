package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0755Ie implements java.lang.Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0758Ih A04;

    public RunnableC0755Ie(com.facebook.ads.redexgen.core.C0758Ih c0758Ih, int i, int i2, int i3, float f) {
        this.A04 = c0758Ih;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A04.A01.AE8(this.A03, this.A01, this.A02, this.A00);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
