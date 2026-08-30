package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6Z, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6Z extends com.facebook.ads.redexgen.core.AbstractC0666Ee implements android.os.Handler.Callback {
    public static java.lang.String[] A0B = {"AsMTGN9d7gRHOXgrLHGDYGFYFT2jE8zd", "Nnd19sHhSb47W9fVZMnTMxR7bhNvmH", "s9lBm1p2OdVbAG3Kd2tFU7vJqAwgt4ou", "m08DjnvNBgXd9RZec3dwEqq5HQFhdD1d", "d9MJMrtEcNZuGjnDMoXrOHXvg5M1nJ", "qOOEBDphWamPlNf8AwlCR7VtF43oF0BN", "4Fj2eG0srBS138A7Druga9Xf6oChowfL", "V9AsV71iAIUYiW8FO2ZNxs"};
    public int A00;
    public int A01;
    public com.facebook.ads.redexgen.core.InterfaceC0638Db A02;
    public boolean A03;
    public final android.os.Handler A04;
    public final com.facebook.ads.redexgen.core.C05569u A05;
    public final com.facebook.ads.redexgen.core.InterfaceC0640Dd A06;
    public final com.facebook.ads.redexgen.core.EX A07;
    public final com.facebook.ads.redexgen.core.InterfaceC0641De A08;
    public final long[] A09;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata[] A0A;

    public C6Z(com.facebook.ads.redexgen.core.InterfaceC0641De interfaceC0641De, android.os.Looper looper) {
        this(interfaceC0641De, looper, com.facebook.ads.redexgen.core.InterfaceC0640Dd.A00);
    }

    public C6Z(com.facebook.ads.redexgen.core.InterfaceC0641De interfaceC0641De, android.os.Looper looper, com.facebook.ads.redexgen.core.InterfaceC0640Dd interfaceC0640Dd) {
        super(4);
        this.A08 = (com.facebook.ads.redexgen.core.InterfaceC0641De) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(interfaceC0641De);
        this.A04 = looper == null ? null : new android.os.Handler(looper, this);
        this.A06 = (com.facebook.ads.redexgen.core.InterfaceC0640Dd) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(interfaceC0640Dd);
        this.A05 = new com.facebook.ads.redexgen.core.C05569u();
        this.A07 = new com.facebook.ads.redexgen.core.EX();
        this.A0A = new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata[5];
        this.A09 = new long[5];
    }

    private void A00() {
        java.util.Arrays.fill(this.A0A, (java.lang.Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A01(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata metadata) {
        if (this.A04 != null) {
            this.A04.obtainMessage(0, metadata).sendToTarget();
        } else {
            A02(metadata);
        }
    }

    private void A02(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata metadata) {
        this.A08.ACl(metadata);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A15() {
        A00();
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A16(long j, boolean z) {
        A00();
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A18(com.facebook.ads.internal.exoplayer2.thirdparty.Format[] formatArr, long j) throws com.facebook.ads.redexgen.core.C05449h {
        this.A02 = this.A06.A4u(formatArr[0]);
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final boolean A9Q() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final boolean A9b() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final void AFe(long j, long j2) throws com.facebook.ads.redexgen.core.C05449h {
        if (!this.A03 && this.A00 < 5) {
            this.A07.A07();
            if (A11(this.A05, this.A07, false) == -4) {
                if (this.A07.A04()) {
                    this.A03 = true;
                } else if (!this.A07.A03()) {
                    this.A07.A00 = this.A05.A00.A0G;
                    this.A07.A08();
                    try {
                        int i = (this.A01 + this.A00) % 5;
                        this.A0A[i] = this.A02.A5N(this.A07);
                        this.A09[i] = ((com.facebook.ads.redexgen.core.C1177Yw) this.A07).A00;
                        this.A00++;
                    } catch (com.facebook.ads.redexgen.core.AbstractC0639Dc e) {
                        throw com.facebook.ads.redexgen.core.C05449h.A01(e, A0z());
                    }
                }
            }
        }
        int result = this.A00;
        if (result > 0 && this.A09[this.A01] <= j) {
            A01(this.A0A[this.A01]);
            this.A0A[this.A01] = null;
            this.A01 = (this.A01 + 1) % 5;
            if (A0B[0].charAt(4) == 'N') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0B;
            strArr[1] = "Doewl3ZReBeCBh0Kbvp0jQJjuQMYDp";
            strArr[4] = "SKftZ6dFMGt0hg7TsOg0ndHDk7niPp";
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AF
    public final int AH6(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        if (this.A06.AH7(format)) {
            return com.facebook.ads.redexgen.core.AbstractC0666Ee.A0y(null, format.A0H) ? 4 : 2;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        switch (message.what) {
            case 0:
                A02((com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata) message.obj);
                return true;
            default:
                throw new java.lang.IllegalStateException();
        }
    }
}
