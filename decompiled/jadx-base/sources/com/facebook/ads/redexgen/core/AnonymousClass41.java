package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.41, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass41 extends com.facebook.ads.redexgen.core.AbstractC0614Cc {
    public final int A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.InterfaceC0724Gz> A02;
    public final java.lang.String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public AnonymousClass41(java.lang.String str, com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.InterfaceC0724Gz> hl) {
        this(str, hl, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public AnonymousClass41(java.lang.String str, com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.InterfaceC0724Gz> hl, int i, int i2, boolean z) {
        this.A03 = str;
        this.A02 = hl;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC0614Cc
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C0616Ce A01(com.facebook.ads.redexgen.core.HA ha) {
        return new com.facebook.ads.redexgen.core.C0616Ce(this.A03, null, this.A02, this.A00, this.A01, this.A04, ha);
    }
}
