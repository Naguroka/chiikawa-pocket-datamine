package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class DM extends com.facebook.ads.redexgen.core.AbstractC1176Yv implements com.facebook.ads.redexgen.core.InterfaceC0694Ft {
    public long A00;
    public com.facebook.ads.redexgen.core.InterfaceC0694Ft A01;

    public abstract void A08();

    @Override // com.facebook.ads.redexgen.core.BC
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j, com.facebook.ads.redexgen.core.InterfaceC0694Ft interfaceC0694Ft, long j2) {
        super.A01 = j;
        this.A01 = interfaceC0694Ft;
        if (j2 == Long.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final java.util.List<com.facebook.ads.redexgen.core.C0693Fs> A6x(long j) {
        return this.A01.A6x(j - this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final long A7O(int i) {
        return this.A01.A7O(i) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final int A7P() {
        return this.A01.A7P();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final int A7r(long j) {
        return this.A01.A7r(j - this.A00);
    }
}
