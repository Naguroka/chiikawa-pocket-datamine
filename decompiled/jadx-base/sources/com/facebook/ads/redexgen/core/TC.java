package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TC implements com.facebook.ads.redexgen.core.InterfaceC0962Ql {
    public final com.facebook.ads.redexgen.core.C1199Zs A00;
    public final com.facebook.ads.redexgen.core.J7 A01;
    public final com.facebook.ads.redexgen.core.C0959Qi A02;
    public final com.facebook.ads.redexgen.core.T7 A03;
    public final java.lang.String A06;
    public final com.facebook.ads.redexgen.core.AbstractC1006Sd A05 = new com.facebook.ads.redexgen.core.AbstractC1006Sd() { // from class: com.facebook.ads.redexgen.X.9W
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC05348x
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C9P c9p) {
            this.A00.A00.A0E().AG3();
            this.A00.A06();
        }
    };
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A04 = new com.facebook.ads.redexgen.core.AbstractC1012Sj() { // from class: com.facebook.ads.redexgen.X.9V
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC05348x
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C9R c9r) {
            this.A00.A00.A0E().AG1();
            this.A00.A06();
        }
    };

    public TC(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.T7 t7, java.lang.String str, com.facebook.ads.redexgen.core.C1017So c1017So, java.util.Map<java.lang.String, java.lang.String> extraParams) {
        this.A00 = c1199Zs;
        this.A01 = j7;
        this.A06 = str;
        this.A03 = t7;
        this.A02 = new com.facebook.ads.redexgen.core.C0959Qi(t7, str, extraParams);
        if (com.facebook.ads.redexgen.core.C0762Im.A21(this.A00)) {
            this.A00.A0E().AFy();
            c1017So.A0l(this);
        } else {
            this.A00.A0E().AFz();
            this.A03.getEventBus().A03(this.A05, this.A04);
        }
    }

    public final void A05() {
        com.facebook.ads.redexgen.core.TD td = new com.facebook.ads.redexgen.core.TD(this);
        if (this.A03.A0m()) {
            com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(td);
        } else {
            this.A03.getStateHandler().post(td);
        }
    }

    public final synchronized void A06() {
        this.A01.AAR(this.A06, this.A02.A05());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0962Ql
    public final void ACZ() {
        this.A00.A0E().AG2();
        A06();
    }
}
