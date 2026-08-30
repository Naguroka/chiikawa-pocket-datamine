package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KN implements com.facebook.ads.redexgen.core.SQ {
    @Override // com.facebook.ads.redexgen.core.SQ
    public final long A5L() {
        return java.lang.System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.core.SQ
    public final void AGr(java.lang.Object obj, long j) throws java.lang.InterruptedException {
        obj.wait(j);
    }
}
