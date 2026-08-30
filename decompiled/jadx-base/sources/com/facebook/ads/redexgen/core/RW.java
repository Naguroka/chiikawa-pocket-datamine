package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RW {
    public static com.facebook.ads.redexgen.core.RW A09;
    public static byte[] A0A;
    public static final com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer[] A0B;
    public com.facebook.ads.redexgen.core.EL A00;
    public com.facebook.ads.redexgen.core.HP A01;
    public java.io.File A02;
    public boolean A03;
    public final com.facebook.ads.redexgen.core.C1198Zr A06;
    public final android.os.Handler A04 = new android.os.Handler(android.os.Looper.getMainLooper());
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.RU> A05 = new android.util.SparseArray<>();
    public final java.lang.Runnable A08 = new com.facebook.ads.redexgen.core.RT(this);
    public final com.facebook.ads.redexgen.core.EE A07 = new com.facebook.ads.redexgen.core.C0833Lm(this);

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 5);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0A = new byte[]{11, 105, 82, 95, 78, 88, 17, 11, 55, 117, 110, 99, 114, 100, 55, 31, 52, 44, 53, 55, 52, 58, okio.Utf8.REPLACEMENT_BYTE, 62, okio.Utf8.REPLACEMENT_BYTE, 117, 123, 8, 47, 58, 47, 62, 97, 123, 70, 113, 113, 108, 113, 45, 35, 80, 119, 98, 119, 102, 57, 35, 85, 96, 114, 106, 72, 77, 71, 94, 4, 72, 74, 93, 64, 70, 71, 90, 60, 57, 51, 42, 112, 57, 50, 42, 51, 49, 50, 60, 57, 46, 26, 31, 8, 89, 91, 89, 82, 95};
    }

    static {
        A0C();
        A0B = new com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer[]{com.facebook.ads.redexgen.core.C1135Xd.A02};
    }

    public RW(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.EL el) {
        this.A06 = c1198Zr;
        if (el != null) {
            this.A00 = el;
            el.A0R(this.A07);
        }
        A01().A0Q();
    }

    private synchronized com.facebook.ads.redexgen.core.EL A01() {
        if (this.A00 == null) {
            this.A00 = new com.facebook.ads.redexgen.core.EL(new com.facebook.ads.redexgen.core.EQ(A03(), A02()), 10, 5, new java.io.File(A06(), A07(52, 12, 44)), A0B);
            this.A00.A0R(this.A07);
        }
        return this.A00;
    }

    private com.facebook.ads.redexgen.core.AnonymousClass41 A02() {
        return new com.facebook.ads.redexgen.core.AnonymousClass41(A07(78, 3, 126), null);
    }

    private final synchronized com.facebook.ads.redexgen.core.HP A03() {
        if (this.A01 == null) {
            this.A01 = new com.facebook.ads.redexgen.core.C1117Wl(new java.io.File(A06(), A07(64, 14, 88)), new com.facebook.ads.redexgen.core.CY(com.facebook.ads.redexgen.core.C0762Im.A0R(this.A06)));
        }
        return this.A01;
    }

    public static com.facebook.ads.redexgen.core.C1120Wo A04(com.facebook.ads.redexgen.core.X4 x4, com.facebook.ads.redexgen.core.HP hp) {
        return new com.facebook.ads.redexgen.core.C1120Wo(hp, x4, new com.facebook.ads.redexgen.core.X0(), null, 2, null);
    }

    public static synchronized com.facebook.ads.redexgen.core.RW A05(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (A09 == null) {
            A09 = new com.facebook.ads.redexgen.core.RW(c1198Zr, null);
        }
        return A09;
    }

    private java.io.File A06() {
        if (this.A02 == null) {
            this.A02 = this.A06.getCacheDir();
        }
        return this.A02;
    }

    public static java.lang.String A08(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, android.net.Uri uri) {
        try {
            if (!com.facebook.ads.redexgen.core.C0762Im.A1m(c1198Zr)) {
                return null;
            }
            return new java.net.URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (java.net.URISyntaxException e) {
            c1198Zr.A07().AA0(A07(81, 5, 63), com.facebook.ads.redexgen.core.C8E.A0u, new com.facebook.ads.redexgen.core.C8F(e));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        for (com.facebook.ads.redexgen.core.EK ek : A01().A0T()) {
            int taskId = ek.A02;
            com.facebook.ads.redexgen.core.RU ru = this.A05.get(taskId);
            if (ru != null) {
                int i = ek.A01;
                if (i == 2 || ek.A03 > ru.A00) {
                    java.lang.String str = A07(15, 19, 94) + i + A07(0, 8, 46) + ek.A03;
                    ru.A01.ABm(ru.A02);
                    this.A05.remove(taskId);
                } else if (i == 4 || i == 3) {
                    java.lang.String str2 = A07(34, 14, 6) + i;
                    ru.A01.ABu(ek.A05);
                    this.A05.remove(taskId);
                }
            }
            java.lang.String str3 = A07(48, 4, 4) + taskId + A07(8, 7, 18) + ek.A03;
        }
    }

    private void A0A() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A04.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final com.facebook.ads.redexgen.core.C1120Wo A0F(android.content.Context context) {
        return A04(new com.facebook.ads.redexgen.core.X4(context, (com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.InterfaceC0724Gz>) null, A02()), A03());
    }

    public final void A0G(android.net.Uri uri, com.facebook.ads.redexgen.core.RV rv, long j) {
        java.lang.String strA08 = A08(this.A06, uri);
        if (strA08 == null) {
            strA08 = uri.toString();
        }
        boolean zA0H = A0H(strA08);
        this.A05.put(A01().A0P(new com.facebook.ads.redexgen.core.C1135Xd(uri, false, null, strA08)), new com.facebook.ads.redexgen.core.RU(rv, j, zA0H, null));
        A0A();
    }

    public final boolean A0H(java.lang.String str) {
        return A03().A6e(str, 0L, 1L) > 0;
    }
}
