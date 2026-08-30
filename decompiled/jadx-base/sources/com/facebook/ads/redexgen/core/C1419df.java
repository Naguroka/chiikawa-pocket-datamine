package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1419df {
    public static java.lang.String[] A0D = {"hvB6Y5lFyDpOUo5WE2d6RBuRXgbY5ZUm", "NE", "ywY8EvofFV55395JkJDayoeTErGWKbkG", "zJ8LsRBLLSys8CPHp", "gH0zTalybZGhm0qBmcsXdCP28l4r1an9", "kduBCn7ltQGfodptcqURcnO6EcdnH0I2", "cBbzau3JoVbeDspRwe3LG6GIj8yddyUH", "tX"};
    public com.facebook.ads.redexgen.core.InterfaceC1422dj A00;
    public boolean A01;
    public final android.graphics.Rect A02;
    public final android.graphics.Rect A03;
    public final android.os.Handler A04;
    public final com.facebook.ads.redexgen.core.T0 A05;
    public final com.facebook.ads.redexgen.core.InterfaceC1428dq A06;
    public final com.facebook.ads.redexgen.core.ViewpointQeConfig A07;
    public final com.facebook.ads.redexgen.core.ViewpointRegistry A08;
    public final com.facebook.ads.redexgen.core.IA A09;
    public final java.lang.Runnable A0A;
    public final java.util.List<android.graphics.Rect> A0B;
    public final java.util.List<com.facebook.ads.redexgen.core.DspViewableNode> A0C;

    public C1419df(com.facebook.ads.redexgen.core.ViewpointQeConfig viewpointQeConfig, com.facebook.ads.redexgen.core.InterfaceC1428dq interfaceC1428dq, com.facebook.ads.redexgen.core.T0 t0, com.facebook.ads.redexgen.core.IA ia, com.facebook.ads.redexgen.core.ViewpointRegistry viewpointRegistry, android.os.Handler handler) {
        this(viewpointQeConfig, interfaceC1428dq, t0, ia, viewpointRegistry, handler, 100);
    }

    public C1419df(com.facebook.ads.redexgen.core.ViewpointQeConfig viewpointQeConfig, com.facebook.ads.redexgen.core.InterfaceC1428dq interfaceC1428dq, com.facebook.ads.redexgen.core.T0 t0, com.facebook.ads.redexgen.core.IA ia, com.facebook.ads.redexgen.core.ViewpointRegistry viewpointRegistry, android.os.Handler handler, int i) {
        this.A03 = new android.graphics.Rect();
        this.A02 = new android.graphics.Rect();
        this.A0C = new java.util.ArrayList();
        this.A0B = new java.util.ArrayList();
        this.A01 = false;
        this.A07 = viewpointQeConfig;
        this.A06 = interfaceC1428dq;
        this.A05 = t0;
        this.A09 = ia;
        this.A08 = viewpointRegistry;
        this.A04 = handler;
        this.A0A = new com.facebook.ads.redexgen.core.RunnableC1420dg(this, i, new java.lang.Exception());
    }

    private void A03(long j) {
        if (this.A0C.isEmpty()) {
            this.A06.A8m(this.A0B);
            this.A09.A4N(j, this.A0B);
            this.A09.A5v();
            return;
        }
        throw new java.lang.IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j) {
        this.A06.A8m(this.A0B);
        this.A09.A4N(j, this.A0B);
        if (this.A0C.isEmpty()) {
            this.A08.A08(this.A0C);
            for (final com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode : this.A0C) {
                if (this.A07.A00) {
                    this.A08.A07(dspViewableNode, new com.facebook.ads.redexgen.core.InterfaceC0728Hd() { // from class: com.facebook.ads.redexgen.X.70
                        @Override // com.facebook.ads.redexgen.core.InterfaceC0728Hd
                        public final java.lang.Object A9K(java.lang.Object obj) {
                            return this.A00.A08(dspViewableNode, (com.facebook.ads.redexgen.core.Cdo) obj);
                        }
                    });
                } else {
                    A06(dspViewableNode, this.A08.A02(dspViewableNode));
                }
            }
            this.A09.A5v();
            if (this.A00 != null) {
                com.facebook.ads.redexgen.core.InterfaceC1422dj interfaceC1422dj = this.A00;
                java.lang.String[] strArr = A0D;
                if (strArr[2].charAt(24) != strArr[5].charAt(24)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0D;
                strArr2[6] = "0nrzH38GFR0AnNATGilmIDxGL8fq4UsQ";
                strArr2[4] = "c6vzpxWZV3AO1VWKwqmDQLGTjAEAJtLq";
                interfaceC1422dj.ADV();
            }
            this.A0C.clear();
            return;
        }
        throw new java.lang.IllegalStateException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    private void A06(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.Cdo<?, ?> cdo) {
        for (android.graphics.Rect rect : this.A0B) {
            android.graphics.Rect containerRect = this.A03;
            if (dspViewableNode.A8l(containerRect, this.A02, rect) && cdo != com.facebook.ads.redexgen.core.Cdo.A08) {
                com.facebook.ads.redexgen.core.IA ia = this.A09;
                android.graphics.Rect rect2 = this.A03;
                java.lang.String[] strArr = A0D;
                if (strArr[1].length() != strArr[7].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0D;
                strArr2[6] = "GkBz7jFj6BmSvOwlnDuwIQ8kdYWcjX9Q";
                strArr2[4] = "0Qzzj3tYyfuWL6OVNzyvBOA9tkBax5QR";
                ia.A3r(cdo, rect2, this.A02);
            }
        }
    }

    public final /* synthetic */ com.facebook.ads.redexgen.core.C1406dK A08(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.Cdo cdo) {
        A06(dspViewableNode, cdo);
        return null;
    }

    public final void A09() {
        if (this.A00 != null) {
            this.A00.ADV();
        }
        if (this.A01) {
            this.A04.removeCallbacks(this.A0A);
            A03(this.A05.AAy());
        }
        this.A01 = false;
    }

    public final void A0A() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A0A);
        }
    }

    public final void A0B(com.facebook.ads.redexgen.core.InterfaceC1424dl interfaceC1424dl) {
        this.A09.AGh(interfaceC1424dl);
    }

    public final void A0C(com.facebook.ads.redexgen.core.InterfaceC1422dj interfaceC1422dj) {
        this.A00 = interfaceC1422dj;
    }
}
