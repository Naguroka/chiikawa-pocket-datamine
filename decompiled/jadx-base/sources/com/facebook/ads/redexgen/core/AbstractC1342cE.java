package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1342cE extends com.facebook.ads.redexgen.core.AbstractC04224c<com.facebook.ads.redexgen.core.VW> {
    public static java.lang.String[] A05 = {"BofGdT", "Cb8B81bPHxSAbCDzy4", "tLXqRIVVg6Ax3ByQPtTHAjuCLXMkMIv2", "Awqy8gsEnlsE3SarczMGKLCzZdtyeG5w", "c95zYEegXXkMe1M4f4KrlDKZ96YYHdKl", "dzB1VPy83al1mBxHBTo", "7fXNgxpNBgLKECdM7L4CyN3WmxsqHAeT", "HUwJOtf8ZOX36MmDYBkOhN0MiSikj2Pg"};
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
    public com.facebook.ads.redexgen.core.C1A A00;
    public final java.util.List<com.facebook.ads.redexgen.core.W7> A01;
    public final int A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;
    public final com.facebook.ads.redexgen.core.AbstractC0986Rj A04 = new com.facebook.ads.redexgen.core.C1344cG(this);

    public AbstractC1342cE(com.facebook.ads.redexgen.core.C3C c3c, java.util.List<com.facebook.ads.redexgen.core.W7> list, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A03 = c1199Zs;
        this.A02 = c3c.getChildSpacing();
        this.A01 = list;
    }

    private android.view.ViewGroup.MarginLayoutParams A02(int i) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A02;
        if (i == 0) {
            i2 *= 2;
        }
        int size = this.A01.size() - 1;
        java.lang.String[] strArr = A05;
        if (strArr[3].charAt(2) == strArr[4].charAt(2)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A05;
        strArr2[7] = "KlchvvVcsY9zV3e8wqzNtTZQscUuxnqD";
        strArr2[1] = "gQBYn2ao1l5plthpQQ";
        marginLayoutParams.setMargins(i2, 0, i >= size ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    public final int A0E() {
        return this.A01.size();
    }

    public final void A0F(android.widget.ImageView imageView, int i) {
        com.facebook.ads.redexgen.core.W7 w7 = this.A01.get(i);
        com.facebook.ads.redexgen.core.JU adCoverImage = w7.getAdCoverImage();
        if (adCoverImage != null) {
            com.facebook.ads.redexgen.core.AsyncTaskC1068Un asyncTaskC1068UnA04 = new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(imageView, this.A03).A04();
            asyncTaskC1068UnA04.A06(new com.facebook.ads.redexgen.core.C1343cF(this, i, w7));
            asyncTaskC1068UnA04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(com.facebook.ads.redexgen.core.C1A c1a) {
        this.A00 = c1a;
    }

    public void A0H(com.facebook.ads.redexgen.core.VW vw, int i) {
        vw.A0j().setLayoutParams(A02(i));
    }
}
