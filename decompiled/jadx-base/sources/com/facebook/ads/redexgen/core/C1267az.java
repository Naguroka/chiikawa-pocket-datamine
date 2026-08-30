package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1267az implements com.facebook.ads.redexgen.core.InterfaceC04173w {
    public static java.lang.String[] A02 = {"BxeCSXrFaRj", "IWeOsMGsO3rBvyiTuJXWjMqB2n5POdot", "NGgDVvJhpCyddRCxf5O6", "v7dseD2N", "b08ux26", "fg5WsruxE6pK3fVhNLQH97P2VsWOQFn1", "RDjE3tUyFXCJEzmAXOjq2W6VFZ2zcAes", "Fn45yaemrdjcOolPakoXMsDmphHClKxa"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.FW A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04153u A01;

    public C1267az(com.facebook.ads.redexgen.core.FW fw, com.facebook.ads.redexgen.core.C04153u c04153u) {
        this.A00 = fw;
        this.A01 = c04153u;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04173w
    public final java.lang.Object A4s(int i) {
        com.facebook.ads.redexgen.core.C04133s compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04173w
    public final java.util.List<java.lang.Object> A63(java.lang.String str, int i) {
        java.util.List<com.facebook.ads.redexgen.core.C04133s> listA03 = this.A01.A03(str, i);
        if (listA03 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = listA03.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.facebook.ads.redexgen.core.C04133s c04133s = listA03.get(i2);
                java.lang.String[] strArr = A02;
                if (strArr[5].charAt(23) != strArr[1].charAt(23)) {
                    java.lang.String[] strArr2 = A02;
                    strArr2[5] = "3GGS2FgfxS9PdCMsSIgMeheOLZnf3MlZ";
                    strArr2[1] = "aJbfA8b3NLiXQBSk9lndmf25pj9B4jE7";
                    arrayList.add(c04133s.A0M());
                }
            }
            return arrayList;
        }
        if (A02[0].length() == 11) {
            java.lang.String[] strArr3 = A02;
            strArr3[5] = "atS9tmOPh4Y1RWGDtCP1b0ECIDkAYM0P";
            strArr3[1] = "WZrNDLg8WSJodQHinSBZlHZp62izmcoM";
            return null;
        }
        throw new java.lang.RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04173w
    public final boolean AEQ(int i, int i2, android.os.Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
