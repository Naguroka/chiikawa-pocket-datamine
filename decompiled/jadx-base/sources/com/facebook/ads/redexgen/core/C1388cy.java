package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1388cy implements com.facebook.ads.redexgen.core.C0K {
    public java.io.ByteArrayInputStream A00;
    public final byte[] A01;

    public C1388cy(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.core.C0K
    public final void AEF(int i) throws com.facebook.ads.redexgen.core.C1387cx {
        this.A00 = new java.io.ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.facebook.ads.redexgen.core.C0K
    public final void close() throws com.facebook.ads.redexgen.core.C1387cx {
    }

    @Override // com.facebook.ads.redexgen.core.C0K
    public final int length() throws com.facebook.ads.redexgen.core.C1387cx {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.core.C0K
    public final int read(byte[] bArr) throws com.facebook.ads.redexgen.core.C1387cx {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
