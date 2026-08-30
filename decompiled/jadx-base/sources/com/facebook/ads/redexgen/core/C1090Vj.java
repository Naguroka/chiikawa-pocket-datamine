package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1090Vj implements com.facebook.ads.redexgen.core.InterfaceC0830Lj {
    public final com.facebook.ads.redexgen.core.C0829Li A00;
    public final com.facebook.ads.redexgen.core.InterfaceC0830Lj A01;

    public C1090Vj(com.facebook.ads.redexgen.core.InterfaceC0830Lj interfaceC0830Lj, int i, int i2) {
        this.A01 = interfaceC0830Lj;
        this.A00 = new com.facebook.ads.redexgen.core.C0829Li(i, i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0830Lj
    public final void AEb(java.lang.String str) {
        this.A00.A04(str);
        if (this.A00.A02() != null && com.facebook.ads.redexgen.core.AbstractC0832Ll.A08(this.A00)) {
            this.A01.AEb(this.A00.A02());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0830Lj
    public final void flush() {
        this.A00.A03();
        while (this.A00.A02() != null) {
            if (com.facebook.ads.redexgen.core.AbstractC0832Ll.A08(this.A00)) {
                this.A01.AEb(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
