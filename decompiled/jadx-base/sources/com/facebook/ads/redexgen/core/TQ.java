package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TQ extends com.facebook.ads.redexgen.core.AbstractC04224c<com.facebook.ads.redexgen.core.TK> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public com.facebook.ads.redexgen.core.MQ A04;
    public com.facebook.ads.redexgen.core.MR A05;
    public java.lang.String A06;
    public java.util.List<com.facebook.ads.redexgen.core.QK> A07;
    public boolean A08;
    public final android.util.SparseBooleanArray A09 = new android.util.SparseBooleanArray();
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A0A;
    public final com.facebook.ads.redexgen.core.C04766f A0B;
    public final com.facebook.ads.redexgen.core.C1199Zs A0C;
    public final com.facebook.ads.redexgen.core.J7 A0D;
    public final com.facebook.ads.redexgen.core.C0842Lv A0E;
    public final com.facebook.ads.redexgen.core.TV A0F;
    public final com.facebook.ads.redexgen.core.C0987Rk A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public TQ(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.util.List<com.facebook.ads.redexgen.core.QK> list, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, com.facebook.ads.redexgen.core.MR mr, java.lang.String str, int i, int i2, int i3, int i4, com.facebook.ads.redexgen.core.TV tv, com.facebook.ads.redexgen.core.MQ mq) {
        this.A0C = c1199Zs;
        this.A0D = j7;
        this.A0B = c04766f;
        this.A0G = c0987Rk;
        this.A0E = c0842Lv;
        this.A05 = mr;
        this.A0A = abstractC1341cD;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A06 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0F = tv;
        this.A04 = mq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.TK A0C(android.view.ViewGroup viewGroup, int i) {
        return new com.facebook.ads.redexgen.core.TK(com.facebook.ads.redexgen.core.PN.A00(new com.facebook.ads.redexgen.core.C0910Ol(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0J(this.A04).A0M(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A1Q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0D(com.facebook.ads.redexgen.core.TK tk, int i) {
        tk.A0j(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            tk.AGH();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    public final int A0E() {
        return this.A07.size();
    }
}
