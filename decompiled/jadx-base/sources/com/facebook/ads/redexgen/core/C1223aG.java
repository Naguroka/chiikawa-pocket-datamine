package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1223aG implements com.facebook.ads.redexgen.core.C6X {
    public static java.lang.String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "m77T1m6dtAhGTcgbhkAg"};
    public final java.util.List<com.facebook.ads.redexgen.core.C1358cU> A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1222aF A01;

    public C1223aG(com.facebook.ads.redexgen.core.C1222aF c1222aF, java.util.List<com.facebook.ads.redexgen.core.C1358cU> list) {
        this.A01 = c1222aF;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A00.A05(true);
        this.A01.A00.A02();
        this.A01.A00.A03(0);
        java.util.Iterator<com.facebook.ads.redexgen.core.C1358cU> it = this.A00.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new java.lang.RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (zHasNext) {
                com.facebook.ads.redexgen.core.W7 w7 = new com.facebook.ads.redexgen.core.W7(this.A01.A01, it.next(), null, com.facebook.ads.redexgen.core.W7.A0K(), this.A01.A00.A01());
                if (w7.A0y() != null && w7.A0y().A0F() != null) {
                    ((com.facebook.ads.redexgen.core.AbstractC1317bp) w7.A0y().A0F()).A00(w7);
                }
                this.A01.A00.A04(new com.facebook.ads.NativeAd(this.A01.A01, w7));
            } else {
                com.facebook.ads.redexgen.core.KP.A00(new com.facebook.ads.redexgen.core.C1224aH(this));
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABT() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABc() {
        A00();
    }
}
