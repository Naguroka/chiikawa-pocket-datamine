package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class NE extends android.widget.FrameLayout {
    public static java.lang.String[] A0C = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public com.facebook.ads.redexgen.core.C2U A01;
    public com.facebook.ads.redexgen.core.C2V A02;
    public com.facebook.ads.redexgen.core.C2W A03;
    public final com.facebook.ads.redexgen.core.C2S A04;
    public final com.facebook.ads.redexgen.core.C1199Zs A05;
    public final com.facebook.ads.redexgen.core.J7 A06;
    public final com.facebook.ads.redexgen.core.MR A07;
    public final com.facebook.ads.redexgen.core.MS A08;
    public final java.lang.String A09;
    public final com.facebook.ads.redexgen.core.C1Z A0A;
    public final com.facebook.ads.redexgen.core.NG A0B;

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(com.facebook.ads.redexgen.core.C2W c2w, com.facebook.ads.redexgen.core.C2U c2u);

    public abstract void A0O(com.facebook.ads.redexgen.core.C2W c2w, com.facebook.ads.redexgen.core.C2U c2u);

    public abstract boolean A0P();

    public NE(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str) {
        this(c1199Zs, j7, str, null, null, null);
    }

    public NE(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, com.facebook.ads.redexgen.core.C1Z c1z, com.facebook.ads.redexgen.core.MS ms, com.facebook.ads.redexgen.core.MR mr) {
        super(c1199Zs);
        this.A00 = 0;
        this.A01 = com.facebook.ads.redexgen.core.C2U.A05;
        this.A03 = null;
        this.A0B = new com.facebook.ads.redexgen.core.V4(this);
        this.A05 = c1199Zs;
        this.A06 = j7;
        this.A08 = ms;
        this.A07 = mr;
        this.A09 = str;
        this.A0A = c1z;
        this.A04 = com.facebook.ads.redexgen.core.C2T.A00(this.A05.A01());
    }

    public static /* synthetic */ int A00(com.facebook.ads.redexgen.core.NE ne) {
        int i = ne.A00;
        ne.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A01(com.facebook.ads.redexgen.core.NE ne) {
        int i = ne.A00;
        ne.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A02.A0A()) {
            this.A06.A9t(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A03 = null;
        this.A02.A05();
        A0L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(com.facebook.ads.redexgen.core.C2W c2w) {
        this.A02.A08(this.A01);
        A0N(c2w, this.A01);
        com.facebook.ads.redexgen.core.C03390w.A01(this.A05).A0L();
        if (A0P()) {
            A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(com.facebook.ads.redexgen.core.C2W c2w) {
        this.A03 = c2w;
        this.A02.A09(this.A01, this.A00);
        A0O(c2w, this.A01);
    }

    public final void A0J() {
        A0B();
    }

    public final void A0K() {
        this.A02 = new com.facebook.ads.redexgen.core.C2V(new com.facebook.ads.redexgen.core.JF(this.A09, this.A06));
        if (this.A08 != null) {
            com.facebook.ads.redexgen.core.MS ms = this.A08;
            if (A0C[0].charAt(22) == 'O') {
                throw new java.lang.RuntimeException();
            }
            A0C[7] = "FLAi4P2";
            ms.ACz(true);
        }
        A0C();
    }
}
