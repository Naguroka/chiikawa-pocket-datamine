package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0682Ff extends com.facebook.ads.redexgen.core.AbstractC1087Vg<com.facebook.ads.redexgen.core.C1316bo> {
    public C0682Ff(com.facebook.ads.redexgen.core.C1316bo c1316bo) {
        super(c1316bo);
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        com.facebook.ads.redexgen.core.C1316bo c1316boA07 = A07();
        if (c1316boA07 == null) {
            return;
        }
        if (com.facebook.ads.redexgen.core.MK.A02(c1316boA07.A08)) {
            c1316boA07.A07();
        } else {
            c1316boA07.A05.postDelayed(c1316boA07.A0C, 5000L);
        }
    }
}
