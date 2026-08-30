package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XK implements com.facebook.ads.redexgen.core.InterfaceC0694Ft {
    public final long[] A00;
    public final com.facebook.ads.redexgen.core.C0693Fs[] A01;

    public XK(com.facebook.ads.redexgen.core.C0693Fs[] c0693FsArr, long[] jArr) {
        this.A01 = c0693FsArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final java.util.List<com.facebook.ads.redexgen.core.C0693Fs> A6x(long j) {
        int iA0B = com.facebook.ads.redexgen.core.IK.A0B(this.A00, j, true, false);
        if (iA0B == -1 || this.A01[iA0B] == null) {
            return java.util.Collections.emptyList();
        }
        return java.util.Collections.singletonList(this.A01[iA0B]);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final long A7O(int i) {
        boolean z = true;
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(z);
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final int A7P() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0694Ft
    public final int A7r(long j) {
        int iA0A = com.facebook.ads.redexgen.core.IK.A0A(this.A00, j, false, false);
        int index = this.A00.length;
        if (iA0A < index) {
            return iA0A;
        }
        return -1;
    }
}
