package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NV implements android.view.View.OnClickListener {
    public static java.lang.String[] A03 = {"qTn7FHoQ", "BapBypyKyXgi02nUaikHNoU7eY2sLlHG", "hAbogJy7", "1kKCdLvWKNxoPSiH", "Xjk6qTkQoY8vuVUP", "RHy2P55wnjv0LaFNgRpD8dXF", "4s2GzZI6q8xqZAbl0Skgz3P6Lr2GKXBU", "B9Ul8cdGX1dUct8fF9ORVNarLvr0UfHM"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2W A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.NI A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.NW A02;

    public NV(com.facebook.ads.redexgen.core.NW nw, com.facebook.ads.redexgen.core.NI ni, com.facebook.ads.redexgen.core.C2W c2w) {
        this.A02 = nw;
        this.A01 = ni;
        this.A00 = c2w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A02.ACt(this.A00);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            java.lang.String[] strArr = A03;
            if (strArr[3].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[3] = "Wxfvm9MNAlg6MGh9";
            strArr2[4] = "9MWDJcBk5PnwUytH";
        }
    }
}
