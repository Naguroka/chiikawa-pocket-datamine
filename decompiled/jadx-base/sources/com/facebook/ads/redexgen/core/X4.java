package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X4 implements com.facebook.ads.redexgen.core.InterfaceC0723Gy {
    public final android.content.Context A00;
    public final com.facebook.ads.redexgen.core.InterfaceC0723Gy A01;
    public final com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.InterfaceC0724Gz> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public X4(android.content.Context context, com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.InterfaceC0724Gz> hl, com.facebook.ads.redexgen.core.InterfaceC0723Gy interfaceC0723Gy) {
        this.A00 = context.getApplicationContext();
        this.A02 = hl;
        this.A01 = interfaceC0723Gy;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public X4(android.content.Context context, java.lang.String str, com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.InterfaceC0724Gz> hl) {
        this(context, hl, new com.facebook.ads.redexgen.core.AnonymousClass41(str, hl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0723Gy
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.X5 A4t() {
        return new com.facebook.ads.redexgen.core.X5(this.A00, this.A02, this.A01.A4t());
    }
}
