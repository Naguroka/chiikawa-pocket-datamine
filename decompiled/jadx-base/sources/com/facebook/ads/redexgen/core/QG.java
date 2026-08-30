package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QG implements com.facebook.ads.redexgen.core.InterfaceC0970Qt {
    public static java.lang.String[] A0C = {"2ZSu0wXuDbQnaud22BC", "QCmSLF", "fQxhtf", "E3sU0uCnWEnB3ZcSzOkvj4xNFgaNSXPe", "Ye0yKWwaCEsRuR61siA7kBVWrkv2bkox", "1q930HE08Ni0sTckStF", "wfAs2pJjw0biCEJKLi3nGPcNksloIp8Y", "ZBBhRoR6L"};
    public com.facebook.ads.redexgen.core.T7 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final com.facebook.ads.redexgen.core.AbstractC1006Sd A07 = new com.facebook.ads.redexgen.core.AbstractC1006Sd() { // from class: com.facebook.ads.redexgen.X.9N
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC05348x
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C9P c9p) {
            this.A00.A05.removeCallbacksAndMessages(null);
            if (this.A00.A0D(com.facebook.ads.redexgen.core.RE.A04)) {
                this.A00.A03();
                this.A00.A06(true, false);
            }
            this.A00.A03 = true;
        }
    };
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A06 = new com.facebook.ads.redexgen.core.AbstractC1012Sj() { // from class: com.facebook.ads.redexgen.X.9M
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC05348x
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C9R c9r) {
            this.A00.A03();
            this.A00.A06(false, false);
            this.A00.A03 = true;
        }
    };
    public final com.facebook.ads.redexgen.core.AbstractC0990Rn A08 = new com.facebook.ads.redexgen.core.C9K(this);
    public final com.facebook.ads.redexgen.core.R8 A09 = new com.facebook.ads.redexgen.core.R8() { // from class: com.facebook.ads.redexgen.X.9D
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC05348x
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C9O c9o) {
            if (this.A00.A02 || !this.A00.A0D(com.facebook.ads.redexgen.core.RE.A04)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, false);
        }
    };
    public final com.facebook.ads.redexgen.core.AbstractC0974Qx A0A = new com.facebook.ads.redexgen.core.AnonymousClass98(this);
    public final android.os.Handler A05 = new android.os.Handler();
    public final java.util.List<com.facebook.ads.redexgen.core.RF> A0B = new java.util.ArrayList();
    public int A00 = 2000;

    public QG(boolean z) {
        this.A02 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        java.util.Iterator<com.facebook.ads.redexgen.core.RF> it = this.A0B.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0C[7].length() != 9) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0C;
            strArr[6] = "Y40dGjVL9Zscw9FMyiKWKh6z3JvZ0T5u";
            strArr[4] = "hO4VpYUkDoigTR3nwiJ8PFOPPoG0N1QG";
            if (zHasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(boolean z, boolean z2) {
        java.util.Iterator<com.facebook.ads.redexgen.core.RF> it = this.A0B.iterator();
        while (it.hasNext()) {
            it.next().A3u(z, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0D(com.facebook.ads.redexgen.core.RE re) {
        java.util.Iterator<com.facebook.ads.redexgen.core.RF> it = this.A0B.iterator();
        while (it.hasNext()) {
            if (it.next().A8Q() != re) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i) {
        this.A00 = i;
    }

    public final void A0I(com.facebook.ads.redexgen.core.RF rf) {
        this.A0B.add(rf);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void A9r(com.facebook.ads.redexgen.core.T7 t7) {
        this.A01 = t7;
        t7.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void AHD(com.facebook.ads.redexgen.core.T7 t7) {
        A03();
        t7.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
