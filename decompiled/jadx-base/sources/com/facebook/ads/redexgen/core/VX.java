package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VX extends com.facebook.ads.redexgen.core.AbstractC04394t {
    public static java.lang.String[] A01 = {"LeWmJ2AEMrGR8tgfwsG9m8UwM76zwmUz", "6Bm", "ck2sw", "Oj1Ntvfg6dck0NxJmQASjzaKZXVqT4Sf", "CtYf7ZmPdO", "plI1JnuA", "RZR4g54lk6KTwqItkRA6ECctcTUw", "cGd5igXf7vOVCpmuGQi5cRxrBgQCM2pW"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04123r A00;

    public VX(com.facebook.ads.redexgen.core.C04123r c04123r) {
        this.A00 = c04123r;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04394t
    public final void A0L(com.facebook.ads.redexgen.core.FL fl, int i) {
        int iA23;
        com.facebook.ads.redexgen.core.MY my;
        super.A0L(fl, i);
        com.facebook.ads.redexgen.core.C1261at linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager != null && (iA23 = linearLayoutManager.A23()) >= 0) {
            com.facebook.ads.redexgen.core.C04123r c04123r = this.A00;
            int scrollPosition = A01[3].charAt(13);
            if (scrollPosition == 48) {
                throw new java.lang.RuntimeException();
            }
            A01[5] = "JmqJ93Os7fwoNBdh";
            if (c04123r.getAdapter() == null || iA23 >= this.A00.getAdapter().A0E() || (my = (com.facebook.ads.redexgen.core.MY) fl.A1F(iA23)) == null) {
                return;
            }
            my.AGH();
        }
    }
}
