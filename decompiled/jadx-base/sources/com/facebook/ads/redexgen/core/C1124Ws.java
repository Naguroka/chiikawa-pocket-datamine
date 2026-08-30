package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1124Ws implements com.facebook.ads.redexgen.core.InterfaceC0724Gz {
    public long A00;
    public boolean A01;
    public final com.facebook.ads.redexgen.core.InterfaceC0722Gx A02;
    public final com.facebook.ads.redexgen.core.InterfaceC0724Gz A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final long AEE(com.facebook.ads.redexgen.core.H3 h3) throws java.io.IOException {
        this.A00 = this.A03.AEE(h3);
        if (this.A00 == 0) {
            return 0L;
        }
        if (h3.A02 == -1 && this.A00 != -1) {
            h3 = new com.facebook.ads.redexgen.core.H3(h3.A04, h3.A01, h3.A03, this.A00, h3.A05, h3.A00);
        }
        this.A01 = true;
        this.A02.AEG(h3);
        return this.A00;
    }

    public C1124Ws(com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724Gz, com.facebook.ads.redexgen.core.InterfaceC0722Gx interfaceC0722Gx) {
        this.A03 = (com.facebook.ads.redexgen.core.InterfaceC0724Gz) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(interfaceC0724Gz);
        this.A02 = (com.facebook.ads.redexgen.core.InterfaceC0722Gx) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(interfaceC0722Gx);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final android.net.Uri A8c() {
        return this.A03.A8c();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final void close() throws java.io.IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int i3 = this.A03.read(bArr, i, i2);
        if (i3 > 0) {
            this.A02.write(bArr, i, i3);
            if (this.A00 != -1) {
                this.A00 -= (long) i3;
            }
        }
        return i3;
    }
}
