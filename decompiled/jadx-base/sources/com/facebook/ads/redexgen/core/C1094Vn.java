package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1094Vn implements com.facebook.ads.redexgen.core.InterfaceC0830Lj {
    public int A00;
    public final com.facebook.ads.redexgen.core.InterfaceC0830Lj A01;
    public final com.facebook.ads.redexgen.core.InterfaceC0830Lj A02;

    public C1094Vn(com.facebook.ads.redexgen.core.InterfaceC0830Lj interfaceC0830Lj, int i, com.facebook.ads.redexgen.core.InterfaceC0830Lj interfaceC0830Lj2) {
        this.A01 = interfaceC0830Lj;
        this.A00 = i;
        this.A02 = interfaceC0830Lj2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0830Lj
    public final void AEb(java.lang.String str) {
        if (this.A00 > 0) {
            this.A01.AEb(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AEb(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0830Lj
    public final void flush() {
        this.A02.flush();
    }
}
