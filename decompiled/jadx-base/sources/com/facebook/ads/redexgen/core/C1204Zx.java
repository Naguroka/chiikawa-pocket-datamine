package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1204Zx extends com.facebook.ads.redexgen.core.KY {
    public static java.lang.String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C6X A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C6Y A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04766f A02;
    public final /* synthetic */ java.util.ArrayList A03;
    public final /* synthetic */ java.util.ArrayList A04;

    public C1204Zx(com.facebook.ads.redexgen.core.C04766f c04766f, java.util.ArrayList arrayList, com.facebook.ads.redexgen.core.C6Y c6y, com.facebook.ads.redexgen.core.C6X c6x, java.util.ArrayList arrayList2) {
        this.A02 = c04766f;
        this.A03 = arrayList;
        this.A01 = c6y;
        this.A00 = c6x;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        java.util.concurrent.atomic.AtomicBoolean atomicBooleanA0D = com.facebook.ads.redexgen.core.C04766f.A0D(this.A03);
        if (this.A02.A04 instanceof com.facebook.ads.redexgen.core.C1199Zs) {
            com.facebook.ads.redexgen.core.C1199Zs c1199Zs = (com.facebook.ads.redexgen.core.C1199Zs) this.A02.A04;
            if (this.A01.A00 == -1) {
                boolean z = atomicBooleanA0D.get();
                java.lang.String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    java.lang.String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z) {
                        c1199Zs.A0E().A4U(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A02.A00));
                    } else {
                        c1199Zs.A0E().A4S(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A02.A00));
                    }
                }
                throw new java.lang.RuntimeException();
            }
            if (atomicBooleanA0D.get()) {
                com.facebook.ads.redexgen.core.C0S c0sA0E = c1199Zs.A0E();
                long jA01 = com.facebook.ads.redexgen.core.C0841Lu.A01(this.A02.A00);
                com.facebook.ads.redexgen.core.C6Y c6y = this.A01;
                java.lang.String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    java.lang.String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    c0sA0E.A4V(jA01, c6y.A00);
                }
                throw new java.lang.RuntimeException();
            }
            c1199Zs.A0E().A4T(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A02.A00), this.A01.A00);
        }
        this.A02.A02.post(new com.facebook.ads.redexgen.core.C1205Zy(this, atomicBooleanA0D));
        com.facebook.ads.redexgen.core.C04766f.A0D(this.A04);
    }
}
