package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MN implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1Z A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.JF A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.MO A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.MR A03;
    public final /* synthetic */ java.lang.String A04;

    public MN(com.facebook.ads.redexgen.core.MO mo, com.facebook.ads.redexgen.core.JF jf, com.facebook.ads.redexgen.core.MR mr, java.lang.String str, com.facebook.ads.redexgen.core.C1Z c1z) {
        this.A02 = mo;
        this.A01 = jf;
        this.A03 = mr;
        this.A04 = str;
        this.A00 = c1z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A01.A04(com.facebook.ads.redexgen.core.JE.A0A, null);
            if (this.A02.A02.A0O(this.A02.A03.A01(), true)) {
                this.A03.A9l(this.A04, this.A00);
            } else if (!android.text.TextUtils.isEmpty(this.A00.A00())) {
                com.facebook.ads.redexgen.core.L2.A0M(new com.facebook.ads.redexgen.core.L2(), this.A02.A03, com.facebook.ads.redexgen.core.L5.A00(this.A00.A00()), this.A04);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
