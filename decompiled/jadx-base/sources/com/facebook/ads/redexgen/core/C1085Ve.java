package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1085Ve extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ android.content.DialogInterface A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.MG A01;

    public C1085Ve(com.facebook.ads.redexgen.core.MG mg, android.content.DialogInterface dialogInterface) {
        this.A01 = mg;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (this.A01.A01.A02 != null) {
            this.A01.A01.A02.AES(com.facebook.ads.redexgen.core.KE.A03(this.A01.A01.A00), new com.facebook.ads.redexgen.core.S4().A05(this.A01.A01.A02(this.A01.A00.getText().toString())).A08());
        }
        this.A00.cancel();
    }
}
