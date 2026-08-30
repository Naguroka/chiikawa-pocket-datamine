package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1359cV extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1358cU A00;
    public final /* synthetic */ java.util.Map A01;
    public final /* synthetic */ java.util.Map A02;

    public C1359cV(com.facebook.ads.redexgen.core.C1358cU c1358cU, java.util.Map map, java.util.Map map2) {
        this.A00 = c1358cU;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (!android.text.TextUtils.isEmpty(this.A00.A01.A6r())) {
            java.util.HashMap map = new java.util.HashMap();
            java.util.Map<java.lang.String, java.lang.String> extraData = this.A02;
            map.putAll(extraData);
            java.util.Map<java.lang.String, java.lang.String> extraData2 = this.A01;
            map.putAll(extraData2);
            this.A00.A0A.A09().AAU(this.A00.A01.A6r(), map);
        }
    }
}
