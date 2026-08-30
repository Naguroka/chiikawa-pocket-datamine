package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1115Wj implements com.facebook.ads.redexgen.core.InterfaceC0746Hv {
    public static java.lang.String[] A05 = {"FTSoQUV14LrBCysGNfyNvfqDH1zy4Xlu", "idZtcBMWKPNqKmB4YuvKnZ9J5oClLNYc", "LQ9P31iW1MflfKVPE8yHkhkiIRx8xl24", "rHIFlyKhXEN0aoZxnSfUJTcS8KA", "X5AboSvo1IhWMpgLhiETlyUxrei9zgpK", "UidF5BSHaS3AY9Xa6cN0GZBAou3", "crEFk57nnaqZZzeaZadhB7pPRF0tSKDp", "vzSLCHVnsSnEI3ULYCW3Ix9KGKahHE6s"};
    public long A00;
    public long A01;
    public com.facebook.ads.redexgen.core.A2 A02 = com.facebook.ads.redexgen.core.A2.A05;
    public boolean A03;
    public final com.facebook.ads.redexgen.core.InterfaceC0733Hi A04;

    public C1115Wj(com.facebook.ads.redexgen.core.InterfaceC0733Hi interfaceC0733Hi) {
        this.A04 = interfaceC0733Hi;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A5p();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(A88());
            java.lang.String[] strArr = A05;
            if (strArr[3].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A05;
            strArr2[3] = "HsFOpdsYzvsCYFETv6neExoACX9";
            strArr2[5] = "q9WJPS0TOrPcuvXJ0JdfmweeOfr";
            this.A03 = false;
        }
    }

    public final void A02(long j) {
        this.A01 = j;
        if (this.A03) {
            this.A00 = this.A04.A5p();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0746Hv
    public final com.facebook.ads.redexgen.core.A2 A85() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0746Hv
    public final long A88() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long jA5p = this.A04.A5p();
            java.lang.String[] strArr = A05;
            if (strArr[4].charAt(22) != strArr[7].charAt(22)) {
                A05[2] = "W4AB9kX6nQAtCIFkSliOwSWqBfwlRuFp";
                long positionUs = this.A00;
                long j = jA5p - positionUs;
                if (this.A02.A01 == 1.0f) {
                    long jA00 = com.facebook.ads.redexgen.core.AbstractC05389b.A00(j);
                    java.lang.String[] strArr2 = A05;
                    if (strArr2[4].charAt(22) != strArr2[7].charAt(22)) {
                        java.lang.String[] strArr3 = A05;
                        strArr3[6] = "WGmVHEEDN9tp9RNfsq2N8TcUrFizj2Aj";
                        strArr3[0] = "F6FzT3Uj5KsGZJBmajlciX3TBepBTDoH";
                        return elapsedSinceBaseMs + jA00;
                    }
                } else {
                    com.facebook.ads.redexgen.core.A2 a2 = this.A02;
                    if (A05[2].charAt(9) == '8') {
                        long positionUs2 = a2.A00(j);
                        return elapsedSinceBaseMs + positionUs2;
                    }
                    java.lang.String[] strArr4 = A05;
                    strArr4[4] = "dKMdYOTDZseZlVx05Wn1bVYEVd2S8aN3";
                    strArr4[7] = "yf4c2ua2Tfc1Hpd1iDrbnRZj0K3dC2iJ";
                    long positionUs3 = a2.A00(j);
                    return elapsedSinceBaseMs + positionUs3;
                }
            }
            throw new java.lang.RuntimeException();
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0746Hv
    public final com.facebook.ads.redexgen.core.A2 AGa(com.facebook.ads.redexgen.core.A2 a2) {
        if (this.A03) {
            A02(A88());
        }
        this.A02 = a2;
        return a2;
    }
}
