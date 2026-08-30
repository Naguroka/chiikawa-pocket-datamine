package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1320bs implements com.facebook.ads.redexgen.core.AnonymousClass10 {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0685Fi A00;
    public final /* synthetic */ java.lang.Runnable A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 58);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{69, 20, 78, 64, 19, 79, 78, 18, 77, 104, 109, 124, 120, 105, 126, 44, 101, 127, 44, 98, 121, 96, 96, 44, 99, 98, 44, 96, 99, 109, 104, 69, 98, 120, 105, 126, 127, 120, 101, 120, 101, 109, 96, 77, 104, 59, 28, 6, 23, 0, 1, 6, 27, 6, 27, 19, 30, 82, 27, 31, 2, 0, 23, 1, 1, 27, 29, 28, 82, 20, 27, 0, 23, 22, okio.Utf8.REPLACEMENT_BYTE, 48, 1, okio.Utf8.REPLACEMENT_BYTE, kotlin.io.encoding.Base64.padSymbol, 42, 55, 40, 55, 42, 39, 101, 106, 96, 118, 107, 109, 96, 42, 109, 106, 112, 97, 106, 112, 42, 101, 103, 112, 109, 107, 106, 42, 82, 77, 65, 83, 34, 51, 42, 109, 108, 75, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 78, 109, 101, 101, 107, 108, 101, 75, 111, 114, 112, 103, 113, 113, 107, 109, 108};
    }

    public C1320bs(com.facebook.ads.redexgen.core.C0685Fi c0685Fi, java.lang.Runnable runnable) {
        this.A00 = c0685Fi;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void ACC(com.facebook.ads.redexgen.core.C1363cZ c1363cZ, java.lang.String str, boolean z) {
        this.A00.A07.A0C();
        boolean z2 = !android.text.TextUtils.isEmpty(str);
        if (z && z2) {
            try {
                android.content.Intent intent = new android.content.Intent(A00(85, 26, 62));
                intent.setData(com.facebook.ads.redexgen.core.L5.A00(str));
                com.facebook.ads.redexgen.core.C0813Kq.A0C(this.A00.A0B, intent);
            } catch (com.facebook.ads.redexgen.core.C0811Ko e) {
                java.lang.Throwable cause = e.getCause();
                com.facebook.ads.redexgen.core.C0811Ko cause2 = e;
                if (cause != null) {
                    cause2 = e.getCause();
                }
                this.A00.A0B.A07().AA0(A00(74, 11, 100), com.facebook.ads.redexgen.core.C8E.A04, new com.facebook.ads.redexgen.core.C8F(cause2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void ACD(com.facebook.ads.redexgen.core.C1363cZ c1363cZ) {
        this.A00.A07.A04();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void ACE(com.facebook.ads.redexgen.core.C1363cZ c1363cZ) {
        this.A00.A07.A05();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void ACF(com.facebook.ads.redexgen.core.C1363cZ c1363cZ) {
        if (c1363cZ != this.A00.A00) {
            return;
        }
        if (c1363cZ == null) {
            this.A00.A0B.A07().AA0(A00(111, 3, 121), com.facebook.ads.redexgen.core.C8E.A0X, new com.facebook.ads.redexgen.core.C8F(A00(8, 37, 54)));
            ACG(c1363cZ, com.facebook.ads.AdError.internalError(2004));
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A01 = c1363cZ;
        this.A00.A0K();
        this.A00.A07.A0F(c1363cZ);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void ACG(com.facebook.ads.redexgen.core.C1363cZ c1363cZ, com.facebook.ads.AdError adError) {
        if (c1363cZ != this.A00.A00) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A0P(c1363cZ);
        this.A00.A0B.A0E().A5F(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0G(new com.facebook.ads.redexgen.core.C0779Jg(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void ACH(com.facebook.ads.redexgen.core.C1363cZ c1363cZ) {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(114, 31, 56), A00(45, 29, 72), A00(0, 8, 77));
        this.A00.A07.A0D();
        this.A00.A0N();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void ACI() {
        this.A00.A07.A08();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void ACJ() {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void ACK() {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A02();
    }
}
