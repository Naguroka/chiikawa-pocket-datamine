package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1335c7 implements com.facebook.ads.redexgen.core.InterfaceC03491g {
    public static java.lang.String[] A07 = {"LaTcnwnUfzgLTffZJQ1IPucRbglpEgMo", "12hOZJfgSqwHBnuTqXHxpHxEQ0NbZO7A", "Dr9pHE3G5odEHWCsCqxBSNpdFpwa86Mh", "MDWd5GjifHIGoqp8wS2KmhLcZ8", "Ozio236b3SA3ZtX", "C3UkekSSOdUqAnfYGByVev7l4a4YpLBv", "Q070rE4WAmrDPncHn0R1JG2tySYrh7TO", ""};
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1341cD A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1339cB A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC03491g A03;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C03501h A04;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1199Zs A05;
    public final /* synthetic */ java.util.EnumSet A06;

    public C1335c7(com.facebook.ads.redexgen.core.C03501h c03501h, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.C1339cB c1339cB, int i, com.facebook.ads.redexgen.core.InterfaceC03491g interfaceC03491g, java.util.EnumSet enumSet) {
        this.A04 = c03501h;
        this.A05 = c1199Zs;
        this.A01 = abstractC1341cD;
        this.A02 = c1339cB;
        this.A00 = i;
        this.A03 = interfaceC03491g;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 < this.A02.A1K()) {
            this.A04.A0A(this.A05, this.A06, this.A02, this.A02.A1N(this.A00 + 1), this.A00 + 1, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03491g
    public final void AB4(com.facebook.ads.AdError adError) {
        if (this.A00 == 0) {
            this.A03.AB4(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03491g
    public final void AB5() {
        this.A05.A00().AGG(this.A01.A1U(), this.A02.A1O());
        if (this.A00 == 0) {
            com.facebook.ads.redexgen.core.InterfaceC03491g interfaceC03491g = this.A03;
            java.lang.String[] strArr = A07;
            if (strArr[5].charAt(13) != strArr[6].charAt(13)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A07;
            strArr2[3] = "Mfrds6r17BKRZSfVfcuH4MZ0YR";
            strArr2[4] = "cdrsota1fCopt7F";
            interfaceC03491g.AB5();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03491g
    public final void AEv() {
        if (this.A00 == 0) {
            this.A03.AEv();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03491g
    public final void AHE() {
        if (this.A00 == 0) {
            this.A03.AHE();
        }
    }
}
