package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1325bx implements com.facebook.ads.redexgen.core.InterfaceC03400x {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"ebJtInVgM8lwtLsL8CqjQvfHZTFWXyTj", "MRT4Iz3aNiJEaKRUIrDApfghDq01n6sB", "qhIcWii6jOsLbVLe4G", "jd0Ec4CahT7YYBjB568owPC0gY4s3zOU", "RPiMcfQYBdHC0SSG6XvNc0NsjlYurq5U", "E74vSWGMqEH8Jt4WlgBEkdQ8nTEO7fKB", "DEVdv4rr1ByH9p4ezSF9ryFdFyWOGnGy", "23RYwIDt1nJrIBpc57"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0686Fj A00;
    public final /* synthetic */ java.lang.Runnable A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 78);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{94, 88, 14, 14, 8, 10, 13, 8, 32, 3, 12, 12, 7, 16, 66, 11, 15, 18, 16, 7, 17, 17, 11, 13, 12, 66, 4, 11, 16, 7, 6, 28, 29, 49, 18, 29, 29, 22, 1, okio.Utf8.REPLACEMENT_BYTE, 28, 20, 20, 26, 29, 20, 58, 30, 3, 1, 22, 0, 0, 26, 28, 29};
    }

    static {
        A01();
    }

    public C1325bx(com.facebook.ads.redexgen.core.C0686Fj c0686Fj, java.lang.Runnable runnable) {
        this.A00 = c0686Fj;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03400x
    public final void ABN(com.facebook.ads.redexgen.core.InterfaceC1369cf interfaceC1369cf) {
        this.A00.A02.A0E().A4G();
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03400x
    public final void ABO(com.facebook.ads.redexgen.core.InterfaceC1369cf interfaceC1369cf, android.view.View view) {
        this.A00.A02.A0E().A4F(interfaceC1369cf == ((com.facebook.ads.redexgen.core.AbstractC1322bu) this.A00).A00);
        if (interfaceC1369cf != ((com.facebook.ads.redexgen.core.AbstractC1322bu) this.A00).A00) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p = ((com.facebook.ads.redexgen.core.AbstractC1322bu) this.A00).A01;
        com.facebook.ads.redexgen.core.C0686Fj c0686Fj = this.A00;
        java.lang.String[] strArr = A03;
        if (strArr[6].charAt(14) != strArr[5].charAt(14)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[0] = "gfJNIdbF2FrCa8qL8kuytpSS0QUlrsrj";
        strArr2[1] = "KzSpIsxhAVssntgB7OlLodebxm4ynnXJ";
        ((com.facebook.ads.redexgen.core.AbstractC1322bu) c0686Fj).A01 = interfaceC1369cf;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A07.A0F(interfaceC1369cf);
        } else {
            this.A00.A07.A0E(view);
            this.A00.A0P(interfaceC03320p);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03400x
    public final void ABP(com.facebook.ads.redexgen.core.InterfaceC1369cf interfaceC1369cf) {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(31, 25, 61), A00(8, 23, 44), A00(0, 8, 37));
        this.A00.A02.A0E().A4I();
        this.A00.A07.A0D();
        this.A00.A0N();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03400x
    public final void ACN(com.facebook.ads.redexgen.core.InterfaceC1369cf interfaceC1369cf, com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        this.A00.A02.A0E().A4H(interfaceC1369cf == ((com.facebook.ads.redexgen.core.AbstractC1322bu) this.A00).A00, c0779Jg.A03().getErrorCode());
        if (interfaceC1369cf != ((com.facebook.ads.redexgen.core.AbstractC1322bu) this.A00).A00) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A0P(interfaceC1369cf);
        this.A00.ABs(c0779Jg);
    }
}
