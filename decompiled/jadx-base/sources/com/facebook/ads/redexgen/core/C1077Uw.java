package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1077Uw extends com.facebook.ads.redexgen.core.AbstractC04224c<com.facebook.ads.redexgen.core.TR> {
    public int A00;
    public int A01;
    public int A02;
    public com.facebook.ads.redexgen.core.MR A03;
    public com.facebook.ads.redexgen.core.C0987Rk A04;
    public java.lang.String A05;
    public java.util.List<com.facebook.ads.redexgen.core.QK> A06;
    public final android.util.SparseBooleanArray A07 = new android.util.SparseBooleanArray();
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A08;
    public final com.facebook.ads.redexgen.core.C04766f A09;
    public final com.facebook.ads.redexgen.core.C1199Zs A0A;
    public final com.facebook.ads.redexgen.core.J7 A0B;
    public final com.facebook.ads.redexgen.core.W7 A0C;
    public final com.facebook.ads.redexgen.core.C0842Lv A0D;
    public final com.facebook.ads.redexgen.core.C0597Bl A0E;
    public final com.facebook.ads.redexgen.core.N5 A0F;

    public C1077Uw(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.util.List<com.facebook.ads.redexgen.core.QK> list, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.W7 w7, com.facebook.ads.redexgen.core.MR mr, java.lang.String str, com.facebook.ads.redexgen.core.C0597Bl c0597Bl, com.facebook.ads.redexgen.core.N5 n5) {
        this.A0A = c1199Zs;
        this.A0B = j7;
        this.A0C = w7;
        this.A09 = w7.A10();
        this.A04 = w7.A1A();
        this.A0D = w7.A19();
        this.A03 = mr;
        this.A08 = abstractC1341cD;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c0597Bl;
        this.A0F = n5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.TR A0C(android.view.ViewGroup viewGroup, int i) {
        return new com.facebook.ads.redexgen.core.TR(com.facebook.ads.redexgen.core.OI.A00(new com.facebook.ads.redexgen.core.C0910Ol(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0K(this.A0F).A0H(this.A0C).A0M(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A1Q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0D(com.facebook.ads.redexgen.core.TR tr, int i) {
        com.facebook.ads.redexgen.core.QK qk = this.A06.get(i);
        tr.A0k(this.A04);
        tr.A0j(qk, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    public final int A0E() {
        return this.A06.size();
    }

    public final void A0F(int i, int i2, int i3) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (needsUpdate) {
            A06();
        }
    }

    public final void A0G(com.facebook.ads.redexgen.core.C0987Rk c0987Rk) {
        this.A04 = c0987Rk;
    }
}
