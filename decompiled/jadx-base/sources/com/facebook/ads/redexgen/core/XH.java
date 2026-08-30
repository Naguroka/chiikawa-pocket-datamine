package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XH implements com.facebook.ads.redexgen.core.InterfaceC0694Ft {
    public static final com.facebook.ads.redexgen.core.XH A01 = new com.facebook.ads.redexgen.core.XH();
    public final java.util.List<com.facebook.ads.redexgen.core.C0693Fs> A00;

    public XH() {
        this.A00 = java.util.Collections.emptyList();
    }

    public XH(com.facebook.ads.redexgen.core.C0693Fs c0693Fs) {
        this.A00 = java.util.Collections.singletonList(c0693Fs);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final java.util.List<com.facebook.ads.redexgen.core.C0693Fs> A6x(long j) {
        return j >= 0 ? this.A00 : java.util.Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final long A7O(int i) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final int A7P() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final int A7r(long j) {
        return j < 0 ? 0 : -1;
    }
}
