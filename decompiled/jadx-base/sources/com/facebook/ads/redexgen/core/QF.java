package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QF extends com.facebook.ads.redexgen.core.KY {
    public static java.lang.String[] A02 = {"8bjSuFnY7Px2kfd2c5FIfhC79mNHlBDm", "1JhoOK1lCeFzNpWXu7eAiStn9xCsTPmH", "7NMloe4KmVhX4mabvoc5ZBvAFXalYV3E", "rfM3ikXL5SaocWaOB9TmjD2vsiJkKlJd", "sACTLZEyycWa5kMyrq", "mxP57EI80C5Gyk8oclCuNkT0toI", "e5qOGa2bHvCngaVTbxNZ2TaAb3gIhyF7", "QbLt5R1wGXlKwPtnoTvKgxPj8Dj"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.R2 A01;

    public QF(com.facebook.ads.redexgen.core.R2 r2, int i) {
        this.A01 = r2;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (this.A01.A00.A00.getVideoView() != null && this.A00 <= 0) {
            com.facebook.ads.redexgen.core.R2 r2 = this.A01;
            java.lang.String[] strArr = A02;
            if (strArr[6].charAt(3) == strArr[2].charAt(3)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[5] = "CD7DGdNDLCY4UALZZjKA1HiDkec";
            strArr2[7] = "uQvfAiBAn4mqA7tCqZPrCPt4Ck3";
            r2.A00.A00.getVideoView().A0e(false, 9);
        }
    }
}
