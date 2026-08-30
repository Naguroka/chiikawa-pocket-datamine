package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X0 implements com.facebook.ads.redexgen.core.InterfaceC0723Gy {
    public final com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.X1> A00;

    public X0() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public X0(com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.X1> hl) {
        this.A00 = hl;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0723Gy
    public final com.facebook.ads.redexgen.core.InterfaceC0724Gz A4t() {
        return new com.facebook.ads.redexgen.core.X1(this.A00);
    }
}
