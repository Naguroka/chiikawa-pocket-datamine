package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1368ce implements com.facebook.ads.redexgen.core.AnonymousClass64 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.GL A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.GL A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C8X A03;

    public C1368ce(com.facebook.ads.redexgen.core.GL gl, int i, com.facebook.ads.redexgen.core.C8X c8x, com.facebook.ads.redexgen.core.GL gl2) {
        this.A01 = gl;
        this.A00 = i;
        this.A03 = c8x;
        this.A02 = gl2;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass64
    public final void ABB() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass64
    public final void ABC() {
        this.A01.A00.ACN(this.A02, com.facebook.ads.redexgen.core.C0779Jg.A00(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL));
    }
}
