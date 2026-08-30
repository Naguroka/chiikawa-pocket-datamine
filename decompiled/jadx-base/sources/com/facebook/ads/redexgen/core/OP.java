package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OP implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.OS A00;

    public OP(com.facebook.ads.redexgen.core.OS os) {
        this.A00 = os;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A04.ACc();
            if (this.A00.A00 != null) {
                com.facebook.ads.redexgen.core.M3.A0L(this.A00.A00);
            }
            for (android.view.View view2 : this.A00.A06) {
                com.facebook.ads.redexgen.core.M3.A0N(view2, 0);
            }
            com.facebook.ads.redexgen.core.M3.A0J(this.A00);
            if (this.A00.A05 == null) {
                return;
            }
            com.facebook.ads.redexgen.core.M3.A0N(this.A00.A05, 0);
            this.A00.A05.A0b(com.facebook.ads.redexgen.core.EnumC0969Qs.A02, 14);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
