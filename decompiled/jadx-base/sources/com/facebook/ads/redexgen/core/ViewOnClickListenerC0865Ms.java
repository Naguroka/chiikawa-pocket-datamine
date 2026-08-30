package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0865Ms implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1Z A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.JF A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.MR A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0866Mt A03;
    public final /* synthetic */ java.lang.String A04;

    public ViewOnClickListenerC0865Ms(com.facebook.ads.redexgen.core.C0866Mt c0866Mt, com.facebook.ads.redexgen.core.JF jf, com.facebook.ads.redexgen.core.MR mr, java.lang.String str, com.facebook.ads.redexgen.core.C1Z c1z) {
        this.A03 = c0866Mt;
        this.A01 = jf;
        this.A02 = mr;
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
            if (this.A03.A01.A0O(this.A03.A02.A01(), true)) {
                this.A02.A9l(this.A04, this.A00);
            } else if (!android.text.TextUtils.isEmpty(this.A00.A00())) {
                com.facebook.ads.redexgen.core.L2.A0M(new com.facebook.ads.redexgen.core.L2(), this.A03.A02, com.facebook.ads.redexgen.core.L5.A00(this.A00.A00()), this.A04);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
