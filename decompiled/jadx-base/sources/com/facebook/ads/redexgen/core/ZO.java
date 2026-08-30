package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZO implements com.facebook.ads.redexgen.core.InterfaceC05248n {
    public final /* synthetic */ java.lang.String[] A00;

    public ZO(java.lang.String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05248n
    public final boolean A2w(java.lang.String str) {
        for (java.lang.String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
