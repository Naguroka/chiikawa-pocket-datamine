package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.98, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass98 extends com.facebook.ads.redexgen.core.AbstractC0974Qx {
    public static java.lang.String[] A01 = {"A0hxmHyocA20uKbzLNrX1cuoBFAzY21E", "I9xoCKjiIf8OmMJxcwGdtcNw1YuiDvi3", androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_DEADLINE, "8cu3hn6v04Mabo0DRb3BoKxPmV6m17RH", "M3PfsQ0uQOYBe23ut3RBur7M821ZKE4o", "dBLXd4nh7JPFvxg4r1eMmoTDEY", "dzagYupPsp4H2uhompZ2DySoLx14PfZd", "Z1qzuvaE1jq9Ec95ZFgzh3McR3fZkyWy"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.QG A00;

    public AnonymousClass98(com.facebook.ads.redexgen.core.QG qg) {
        this.A00 = qg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C0975Qy c0975Qy) {
        if (this.A00.A01 != null && !this.A00.A03 && c0975Qy.A00().getAction() == 0) {
            com.facebook.ads.redexgen.core.QG qg = this.A00;
            java.lang.String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[4] = "8qKCS4QoQxaUoDKBRazWJt0HJmuP0GoR";
            qg.A05.removeCallbacksAndMessages(null);
            if (this.A00.A0D(com.facebook.ads.redexgen.core.RE.A04)) {
                this.A00.A03();
                com.facebook.ads.redexgen.core.QG qg2 = this.A00;
                if (A01[3].charAt(1) != 'x') {
                    A01[3] = "krfS0sgwBFPIM38aK2Y5K2a50FO4BQxK";
                    qg2.A06(true, false);
                } else {
                    qg2.A06(true, false);
                }
            }
            if (this.A00.A02) {
                this.A00.A05.postDelayed(new com.facebook.ads.redexgen.core.QN(this), this.A00.A00);
            }
        }
    }
}
