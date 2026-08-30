package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0714Gp {
    public final int A00;
    public final com.facebook.ads.redexgen.core.C0711Gm A01;
    public final java.lang.Object A02;
    public final com.facebook.ads.redexgen.core.AG[] A03;

    public C0714Gp(com.facebook.ads.redexgen.core.AG[] agArr, com.facebook.ads.redexgen.core.InterfaceC0710Gl[] interfaceC0710GlArr, java.lang.Object obj) {
        this.A03 = agArr;
        this.A01 = new com.facebook.ads.redexgen.core.C0711Gm(interfaceC0710GlArr);
        this.A02 = obj;
        this.A00 = agArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(com.facebook.ads.redexgen.core.C0714Gp c0714Gp) {
        if (c0714Gp == null || c0714Gp.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i = 0; i < this.A01.A01; i++) {
            if (!A02(c0714Gp, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(com.facebook.ads.redexgen.core.C0714Gp c0714Gp, int i) {
        return c0714Gp != null && com.facebook.ads.redexgen.core.IK.A0g(this.A03[i], c0714Gp.A03[i]) && com.facebook.ads.redexgen.core.IK.A0g(this.A01.A00(i), c0714Gp.A01.A00(i));
    }
}
