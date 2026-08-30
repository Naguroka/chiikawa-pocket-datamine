package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XW {
    public com.facebook.ads.redexgen.core.C0 A02;
    public java.lang.Object A03;
    public java.lang.String A04;
    public boolean A05;
    public final com.facebook.ads.redexgen.core.InterfaceC0723Gy A06;
    public int A01 = -1;
    public int A00 = 1048576;

    public XW(com.facebook.ads.redexgen.core.InterfaceC0723Gy interfaceC0723Gy) {
        this.A06 = interfaceC0723Gy;
    }

    public final com.facebook.ads.redexgen.core.XW A00(java.lang.String str) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A05);
        this.A04 = str;
        return this;
    }

    public final com.facebook.ads.redexgen.core.DQ A01(android.net.Uri uri) {
        this.A05 = true;
        if (this.A02 == null) {
            this.A02 = new com.facebook.ads.redexgen.core.C1172Yr();
        }
        return new com.facebook.ads.redexgen.core.DQ(uri, this.A06, this.A02, this.A01, this.A04, this.A00, this.A03);
    }
}
