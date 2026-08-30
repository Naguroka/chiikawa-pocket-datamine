package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RA implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7G A00;

    public RA(com.facebook.ads.redexgen.core.C7G c7g) {
        this.A00 = c7g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
        }
        try {
            if (this.A00.getVideoView() != null) {
                if (this.A00.A02 != null) {
                    this.A00.A02.A04(com.facebook.ads.redexgen.core.JE.A0v, null);
                }
                this.A00.A01.A0E().A3R();
                switch (this.A00.getVideoView().getState()) {
                    case A07:
                    case A04:
                    case A05:
                    case A06:
                        this.A00.getVideoView().A0b(com.facebook.ads.redexgen.core.EnumC0969Qs.A04, 12);
                        break;
                    case A0A:
                        this.A00.getVideoView().A0e(true, 8);
                        break;
                    default:
                        break;
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
