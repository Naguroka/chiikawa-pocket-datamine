package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1126Wu implements com.facebook.ads.redexgen.core.InterfaceC0724Gz {
    public final int A00;
    public final com.facebook.ads.redexgen.core.InterfaceC0724Gz A01;
    public final com.facebook.ads.redexgen.core.I8 A02;

    public C1126Wu(com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724Gz, com.facebook.ads.redexgen.core.I8 i8, int i) {
        this.A01 = (com.facebook.ads.redexgen.core.InterfaceC0724Gz) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(interfaceC0724Gz);
        this.A02 = (com.facebook.ads.redexgen.core.I8) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(i8);
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final android.net.Uri A8c() {
        return this.A01.A8c();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final long AEE(com.facebook.ads.redexgen.core.H3 h3) throws java.io.IOException {
        this.A02.A02(this.A00);
        return this.A01.AEE(h3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final void close() throws java.io.IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i, i2);
    }
}
