package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TT extends com.facebook.ads.redexgen.core.AbstractC0986Rj {
    public final /* synthetic */ com.facebook.ads.redexgen.core.J7 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0842Lv A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.QK A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.TR A03;
    public final /* synthetic */ java.lang.String A04;
    public final /* synthetic */ java.util.Map A05;

    public TT(com.facebook.ads.redexgen.core.TR tr, java.lang.String str, com.facebook.ads.redexgen.core.QK qk, com.facebook.ads.redexgen.core.J7 j7, java.util.Map map, com.facebook.ads.redexgen.core.C0842Lv c0842Lv) {
        this.A03 = tr;
        this.A04 = str;
        this.A02 = qk;
        this.A00 = j7;
        this.A05 = map;
        this.A01 = c0842Lv;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0986Rj
    public final void A03() {
        if (!this.A03.A02.A0Z() && !android.text.TextUtils.isEmpty(this.A04) && !this.A03.A05.get(this.A02.A02())) {
            this.A00.AA6(this.A04, new com.facebook.ads.redexgen.core.O8(this.A05).A03(this.A03.A03).A02(this.A01).A05());
            com.facebook.ads.redexgen.core.C1T.A07(this.A03.A00, this.A03.A06);
            this.A03.A05.put(this.A02.A02(), true);
        }
    }
}
