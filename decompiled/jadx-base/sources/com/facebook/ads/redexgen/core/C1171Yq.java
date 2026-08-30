package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1171Yq implements com.facebook.ads.redexgen.core.C9 {
    @Override // com.facebook.ads.redexgen.core.C9
    public final void A69(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
    }

    @Override // com.facebook.ads.redexgen.core.C9
    public final int AFu(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, int i, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        int iAGn = interfaceC0610By.AGn(i);
        if (iAGn == -1) {
            if (z) {
                return -1;
            }
            throw new java.io.EOFException();
        }
        return iAGn;
    }

    @Override // com.facebook.ads.redexgen.core.C9
    public final void AFv(com.facebook.ads.redexgen.core.I4 i4, int i) {
        i4.A0Z(i);
    }

    @Override // com.facebook.ads.redexgen.core.C9
    public final void AFw(long j, int i, int i2, int i3, com.facebook.ads.redexgen.core.C8 c8) {
    }
}
