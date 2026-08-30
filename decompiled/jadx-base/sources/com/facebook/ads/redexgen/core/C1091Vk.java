package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1091Vk implements com.facebook.ads.redexgen.core.InterfaceC0830Lj {
    public int A00;
    public final com.facebook.ads.redexgen.core.InterfaceC0830Lj A01;

    public C1091Vk(com.facebook.ads.redexgen.core.InterfaceC0830Lj interfaceC0830Lj, int i) {
        this.A01 = interfaceC0830Lj;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0830Lj
    public final void AEb(java.lang.String str) {
        if (this.A00 > 0) {
            this.A01.AEb(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0830Lj
    public final void flush() {
        this.A01.flush();
    }
}
