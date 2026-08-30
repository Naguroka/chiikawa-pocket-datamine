package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1203Zw implements com.facebook.ads.redexgen.core.C0L {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"DkadTd3hzRbbbOHMxE7l2HcIgF77c2Wg", "0ZuZJmAU8cZIcQf3szyGmXM5AilOTJtQ", "s7OtZpyonCiYFMYFU1WCjmQvHXym6FPj", "3vySfQzjuhiXchKud6RTPthf0ulaYdWV", "CDvhYqwZm7dYJUP65EPDHmFcAmisUun7", "F", "FueLju8lXT0mR7zmJE5", "4fFvsSsvSh6WJapTHyxRGbQ9SIVR6447"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1198Zr A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 23);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-89, -85, -97, -91, -93};
        java.lang.String[] strArr = A02;
        if (strArr[4].charAt(11) == strArr[0].charAt(11)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[4] = "8YVOAkqjlCZIfPO923uAjm7vB9HJVDjx";
        strArr2[0] = "zjuPMStvlm1D7VGZIKzQB2odE0473uv0";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C1203Zw(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        this.A00 = c1198Zr;
    }

    @Override // com.facebook.ads.redexgen.core.C0L
    public final void A9u(java.lang.Throwable th) {
        this.A00.A07().AA0(A00(0, 5, 39), com.facebook.ads.redexgen.core.C8E.A1e, new com.facebook.ads.redexgen.core.C8F(th));
    }

    @Override // com.facebook.ads.redexgen.core.C0L
    public final void AA5(java.lang.Throwable th) {
        this.A00.A07().AA0(A00(0, 5, 39), com.facebook.ads.redexgen.core.C8E.A1g, new com.facebook.ads.redexgen.core.C8F(th));
    }

    @Override // com.facebook.ads.redexgen.core.C0L
    public final void AEs(java.lang.String str, int i, java.lang.String str2, java.lang.Long l, java.lang.Long l2, com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06) {
        com.facebook.ads.redexgen.core.C04796i.A05(this.A00, anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A09, anonymousClass06.A07, anonymousClass06.A03, i, str2, l, l2, null);
    }

    @Override // com.facebook.ads.redexgen.core.C0L
    public final void AEt(java.lang.String str, boolean z, com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06) {
        com.facebook.ads.redexgen.core.C04796i.A04(this.A00, new com.facebook.ads.redexgen.core.C04786h(anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A07, anonymousClass06.A03, str), z);
    }
}
