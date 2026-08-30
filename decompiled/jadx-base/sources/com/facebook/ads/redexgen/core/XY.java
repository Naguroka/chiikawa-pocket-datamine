package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XY implements com.facebook.ads.redexgen.core.HD {
    public static java.lang.String[] A0C = {"UHBxdqqmUd0cBUfteuxO11fv3nMetCkr", "bpIfqspTf2B8hIKXxN8UsfP", "nQLLlj7yvR51GKiSLDNkBhCd9wKHTmtF", "g1T6MLNH1r6BMEQeXhAGdqkubnn7KLBM", "2gOIWdRNZvq1Kh3BpRyp9hP618T8MmgQ", "QpJVxxzC0ZK3g", "rEgoyo7biwWjWc5JH9k81Kz3GFe4jtfN", "VeB4zDZa"};
    public long A00;
    public long A02;
    public com.facebook.ads.redexgen.core.H3 A03;
    public final android.net.Uri A05;
    public final com.facebook.ads.redexgen.core.C0672Ep A07;
    public final com.facebook.ads.redexgen.core.InterfaceC0724Gz A08;
    public final com.facebook.ads.redexgen.core.C0736Hl A09;
    public volatile boolean A0A;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0643Dg A0B;
    public final com.facebook.ads.redexgen.core.C4 A06 = new com.facebook.ads.redexgen.core.C4();
    public boolean A04 = true;
    public long A01 = -1;

    public XY(com.facebook.ads.redexgen.core.C0643Dg c0643Dg, android.net.Uri uri, com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724Gz, com.facebook.ads.redexgen.core.C0672Ep c0672Ep, com.facebook.ads.redexgen.core.C0736Hl c0736Hl) {
        this.A0B = c0643Dg;
        this.A05 = (android.net.Uri) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(uri);
        this.A08 = (com.facebook.ads.redexgen.core.InterfaceC0724Gz) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(interfaceC0724Gz);
        this.A07 = (com.facebook.ads.redexgen.core.C0672Ep) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(c0672Ep);
        this.A09 = c0736Hl;
    }

    public final void A04(long j, long j2) {
        this.A06.A00 = j;
        this.A02 = j2;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.core.HD
    public final void A4W() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.core.HD
    public final void A9o() throws java.lang.InterruptedException, java.io.IOException {
        int result = 0;
        while (result == 0) {
            boolean z = this.A0A;
            if (A0C[4].charAt(0) == 'C') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0C;
            strArr[6] = "tFp1bRZRusaEJJa7j65nePC0dyA6HXa4";
            strArr[2] = "yrMehS8ZHN9WesRJaME1jcDTy2vBV8ag";
            if (!z) {
                com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By = null;
                try {
                    long jA86 = this.A06.A00;
                    this.A03 = new com.facebook.ads.redexgen.core.H3(this.A05, jA86, -1L, this.A0B.A0b);
                    this.A01 = this.A08.AEE(this.A03);
                    if (this.A01 != -1) {
                        this.A01 += jA86;
                    }
                    com.facebook.ads.redexgen.core.C1173Ys c1173Ys = new com.facebook.ads.redexgen.core.C1173Ys(this.A08, jA86, this.A01);
                    com.facebook.ads.redexgen.core.InterfaceC0609Bx extractor = this.A07.A02(c1173Ys, this.A08.A8c());
                    if (this.A04) {
                        extractor.AG7(jA86, this.A02);
                        this.A04 = false;
                    }
                    while (result == 0 && !this.A0A) {
                        this.A09.A00();
                        result = extractor.AEk(c1173Ys, this.A06);
                        if (c1173Ys.A86() > this.A0B.A0P + jA86) {
                            jA86 = c1173Ys.A86();
                            this.A09.A01();
                            this.A0B.A0R.post(this.A0B.A0a);
                        }
                    }
                    if (result == 1) {
                        result = 0;
                    } else {
                        this.A06.A00 = c1173Ys.A86();
                        com.facebook.ads.redexgen.core.C4 c4 = this.A06;
                        if (A0C[4].charAt(0) == 'C') {
                            throw new java.lang.RuntimeException();
                        }
                        A0C[4] = "PQr9p7FkEdqUiF3RXdEEuViBVQM7OAy8";
                        this.A00 = c4.A00 - this.A03.A01;
                    }
                    com.facebook.ads.redexgen.core.IK.A0W(this.A08);
                } catch (java.lang.Throwable th) {
                    if (result != 1 && 0 != 0) {
                        this.A06.A00 = interfaceC0610By.A86();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    com.facebook.ads.redexgen.core.IK.A0W(this.A08);
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
