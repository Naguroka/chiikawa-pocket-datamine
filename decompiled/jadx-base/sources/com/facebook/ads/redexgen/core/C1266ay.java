package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1266ay implements com.facebook.ads.redexgen.core.InterfaceC04193z {
    public final /* synthetic */ com.facebook.ads.redexgen.core.FV A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04153u A01;

    public C1266ay(com.facebook.ads.redexgen.core.FV fv, com.facebook.ads.redexgen.core.C04153u c04153u) {
        this.A00 = fv;
        this.A01 = c04153u;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04193z
    public final java.lang.Object A4s(int i) {
        com.facebook.ads.redexgen.core.C04133s compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04193z
    public final java.util.List<java.lang.Object> A63(java.lang.String str, int i) {
        java.util.List<com.facebook.ads.redexgen.core.C04133s> listA03 = this.A01.A03(str, i);
        if (listA03 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int infoCount = listA03.size();
        for (int i2 = 0; i2 < infoCount; i2++) {
            arrayList.add(listA03.get(i2).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04193z
    public final java.lang.Object A64(int i) {
        com.facebook.ads.redexgen.core.C04133s compatInfo = this.A01.A01(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04193z
    public final boolean AEQ(int i, int i2, android.os.Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
