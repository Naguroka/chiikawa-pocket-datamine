package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DQ extends com.facebook.ads.redexgen.core.AbstractC1133Xb implements com.facebook.ads.redexgen.core.InterfaceC0673Eq {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final android.net.Uri A04;
    public final com.facebook.ads.redexgen.core.C0 A05;
    public final com.facebook.ads.redexgen.core.InterfaceC0723Gy A06;
    public final java.lang.Object A07;
    public final java.lang.String A08;

    public DQ(android.net.Uri uri, com.facebook.ads.redexgen.core.InterfaceC0723Gy interfaceC0723Gy, com.facebook.ads.redexgen.core.C0 c0, int i, java.lang.String str, int i2, java.lang.Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC0723Gy;
        this.A05 = c0;
        this.A03 = i;
        this.A08 = str;
        this.A02 = i2;
        this.A00 = androidx.media3.common.C.TIME_UNSET;
        this.A07 = obj;
    }

    private void A00(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
        A01(new com.facebook.ads.redexgen.core.XS(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1133Xb
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1133Xb
    public final void A03(com.facebook.ads.redexgen.core.ZB zb, boolean z) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.core.Ev
    public final com.facebook.ads.redexgen.core.XU A56(com.facebook.ads.redexgen.core.Et et, com.facebook.ads.redexgen.core.InterfaceC0716Gr interfaceC0716Gr) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(et.A02 == 0);
        return new com.facebook.ads.redexgen.core.C0643Dg(this.A04, this.A06.A4t(), this.A05.A4x(), this.A03, A00(et), this, interfaceC0716Gr, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.Ev
    public final void AAo() throws java.io.IOException {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0673Eq
    public final void ADc(long j, boolean z) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = this.A00;
        }
        if (this.A00 == j && this.A01 == z) {
            return;
        }
        A00(j, z);
    }

    @Override // com.facebook.ads.redexgen.core.Ev
    public final void AF3(com.facebook.ads.redexgen.core.XU xu) {
        ((com.facebook.ads.redexgen.core.C0643Dg) xu).A0R();
    }
}
