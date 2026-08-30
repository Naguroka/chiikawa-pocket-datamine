package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9S, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9S extends com.facebook.ads.redexgen.core.C1017So {
    public static java.lang.String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public com.facebook.ads.redexgen.core.C0959Qi A01;
    public boolean A02;
    public final com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.C9R> A03;
    public final com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.C9P> A04;
    public final com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.SZ> A05;
    public final com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.C9O> A06;
    public final com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.R6> A07;
    public final com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.R0> A08;
    public final com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.C0976Qz> A09;
    public final com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.QQ> A0A;
    public final com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.QP> A0B;
    public final com.facebook.ads.redexgen.core.T7 A0C;
    public final com.facebook.ads.redexgen.core.R9 A0D;
    public final com.facebook.ads.redexgen.core.AbstractC0956Qf A0E;

    public C9S(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.T7 t7, java.lang.String str) {
        this(c1199Zs, j7, t7, str, 0, 0, false, null, null);
    }

    public C9S(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.T7 t7, java.lang.String str, int i, int i2, boolean z, android.os.Bundle bundle, java.util.Map<java.lang.String, java.lang.String> map) {
        super(c1199Zs, j7, t7, str, !t7.A0i(), i, i2, z, bundle, map, new com.facebook.ads.redexgen.core.C1016Sn(c1199Zs, t7));
        this.A0E = new com.facebook.ads.redexgen.core.AbstractC0956Qf() { // from class: com.facebook.ads.redexgen.X.9T
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C0973Qw c0973Qw) {
                this.A00.A0e();
            }
        };
        this.A08 = new com.facebook.ads.redexgen.core.C1027Sy(this);
        this.A04 = new com.facebook.ads.redexgen.core.C1026Sx(this);
        this.A05 = new com.facebook.ads.redexgen.core.C1025Sw(this);
        this.A06 = new com.facebook.ads.redexgen.core.C1024Sv(this);
        this.A03 = new com.facebook.ads.redexgen.core.C1023Su(this);
        this.A07 = new com.facebook.ads.redexgen.core.C1022St(this);
        this.A0A = new com.facebook.ads.redexgen.core.C1021Ss(this);
        this.A0B = new com.facebook.ads.redexgen.core.C1020Sr(this);
        this.A09 = new com.facebook.ads.redexgen.core.T6(this);
        this.A0D = new com.facebook.ads.redexgen.core.R9() { // from class: com.facebook.ads.redexgen.X.9U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C0983Rg c0983Rg) {
                this.A00.A00 = this.A00.A0C.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = t7;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (com.facebook.ads.redexgen.core.C0762Im.A2h(c1199Zs)) {
            this.A01 = new com.facebook.ads.redexgen.core.C0959Qi(t7, str, null);
        }
    }

    public C9S(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.T7 t7, java.lang.String str, android.os.Bundle bundle, java.util.Map<java.lang.String, java.lang.String> extraParams) {
        this(c1199Zs, j7, t7, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.facebook.ads.redexgen.core.C1017So
    public final void A0m(com.facebook.ads.redexgen.core.EnumC0963Qm enumC0963Qm, java.util.Map<java.lang.String, java.lang.String> map) {
        super.A0m(enumC0963Qm, map);
        if (this.A01 != null && enumC0963Qm == com.facebook.ads.redexgen.core.EnumC0963Qm.A09) {
            java.util.Map<java.lang.String, java.lang.String> params = this.A01.A05();
            java.lang.String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0o() {
        com.facebook.ads.redexgen.core.C1028Sz c1028Sz = new com.facebook.ads.redexgen.core.C1028Sz(this);
        if (this.A0C.A0m()) {
            com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(c1028Sz);
            return;
        }
        com.facebook.ads.redexgen.core.T7 t7 = this.A0C;
        java.lang.String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        t7.getStateHandler().post(c1028Sz);
    }
}
