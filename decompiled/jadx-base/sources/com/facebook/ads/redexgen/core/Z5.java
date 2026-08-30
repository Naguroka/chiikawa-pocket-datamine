package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z5 implements com.facebook.ads.redexgen.core.B2 {
    public final com.facebook.ads.redexgen.core.C1180Yz A00 = new com.facebook.ads.redexgen.core.C1180Yz();
    public final com.facebook.ads.redexgen.core.C1179Yy A01 = new com.facebook.ads.redexgen.core.C1179Yy();
    public final com.facebook.ads.redexgen.core.InterfaceC0568Ag[] A02;

    public Z5(com.facebook.ads.redexgen.core.InterfaceC0568Ag... interfaceC0568AgArr) {
        this.A02 = (com.facebook.ads.redexgen.core.InterfaceC0568Ag[]) java.util.Arrays.copyOf(interfaceC0568AgArr, interfaceC0568AgArr.length + 2);
        this.A02[interfaceC0568AgArr.length] = this.A00;
        this.A02[interfaceC0568AgArr.length + 1] = this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.B2
    public final com.facebook.ads.redexgen.core.A2 A3x(com.facebook.ads.redexgen.core.A2 a2) {
        this.A00.A0B(a2.A02);
        return new com.facebook.ads.redexgen.core.A2(this.A01.A01(a2.A01), this.A01.A00(a2.A00), a2.A02);
    }

    @Override // com.facebook.ads.redexgen.core.B2
    public final com.facebook.ads.redexgen.core.InterfaceC0568Ag[] A6S() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.B2
    public final long A7m(long j) {
        return this.A01.A02(j);
    }

    @Override // com.facebook.ads.redexgen.core.B2
    public final long A8O() {
        return this.A00.A0A();
    }
}
