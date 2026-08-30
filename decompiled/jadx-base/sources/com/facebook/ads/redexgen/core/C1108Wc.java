package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1108Wc {
    public static java.lang.String[] A02 = {"P6MYZTOvDAaFen8GvswQ7TN6uAA4LWVv", "hYZBnkN7eg3Goj1fCi2fLRcc1xaBLP0T", "hgTfm2gsKyXruwHhjUk", "Xl5p6SNgJSz0NngEgDitAc249tQNQ8ta", "gXDmJbn0MXLGD1TV1woO3x4WUye", "irvXIfdrm7YhWQVUx8qen3XIyPBMomv3", "r42H5ZZ7hG", "IBnhtff"};
    public final android.graphics.Rect A00 = new android.graphics.Rect();
    public final android.graphics.Rect A01 = new android.graphics.Rect();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(com.facebook.ads.redexgen.core.Cdo<com.facebook.ads.redexgen.core.C0767It, com.facebook.ads.redexgen.core.C0772Iy> cdo) {
        if (cdo.A03.A05()) {
            return cdo.A04.A07();
        }
        if (!cdo.A03.A06()) {
            return true;
        }
        return cdo.A04.A06();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    private boolean A01(com.facebook.ads.redexgen.core.Cdo<com.facebook.ads.redexgen.core.C0767It, com.facebook.ads.redexgen.core.C0772Iy> cdo, com.facebook.ads.redexgen.core.InterfaceC1417dd interfaceC1417dd) {
        boolean z;
        int i;
        int i2;
        float fA8k = -1.0f;
        try {
            fA8k = interfaceC1417dd.A8k(cdo);
        } catch (java.lang.IllegalStateException unused) {
        }
        if (A02[6].length() == 7) {
            throw new java.lang.RuntimeException();
        }
        A02[5] = "l0GJDJ6h98NWCV6pJLy8cxtVoo076bMe";
        if (fA8k > 0.0f && A00(cdo)) {
            return true;
        }
        if (cdo.A03.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(cdo)) {
            return true;
        }
        interfaceC1417dd.A8j(this.A00);
        if (A02[2].length() != 2) {
            A02[2] = "WH3ZGQ";
            interfaceC1417dd.A7W(cdo, this.A01);
            if (this.A00.bottom - this.A00.top > 0) {
                i = this.A01.bottom;
                i2 = this.A00.top;
                if (A02[7].length() != 7) {
                    throw new java.lang.RuntimeException();
                }
                A02[1] = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F";
                z = i - i2 > 0;
            }
            return !z && A00(cdo);
        }
        interfaceC1417dd.A7W(cdo, this.A01);
        if (this.A00.bottom - this.A00.top > 0) {
            i = this.A01.bottom;
            i2 = this.A00.top;
            if (A02[7].length() != 7) {
                throw new java.lang.RuntimeException();
            }
            A02[1] = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F";
            if (i - i2 > 0) {
            }
        }
        if (z) {
        }
        if (z) {
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(com.facebook.ads.redexgen.core.Cdo<com.facebook.ads.redexgen.core.C0767It, com.facebook.ads.redexgen.core.C0772Iy> cdo, com.facebook.ads.redexgen.core.InterfaceC1417dd interfaceC1417dd) {
        if (cdo.A04.A04() && A01(cdo, interfaceC1417dd)) {
            cdo.A04.A01();
            cdo.A03.A02().AAQ(cdo.A03.A03(), cdo.A03.A04());
        }
        if (cdo.A04.A05() && com.facebook.ads.redexgen.core.C0762Im.A1b(cdo.A03.A01())) {
            cdo.A04.A02();
            cdo.A03.A02().AA8(cdo.A03.A03(), cdo.A03.A04());
        }
    }
}
