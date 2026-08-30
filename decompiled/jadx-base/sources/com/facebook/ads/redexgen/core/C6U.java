package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6U, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6U {
    public static boolean A04;
    public static byte[] A05;
    public static final java.lang.String A06;
    public final com.facebook.ads.redexgen.core.C6V A00;
    public final com.facebook.ads.redexgen.core.C6W A01;
    public final com.facebook.ads.redexgen.core.C1198Zr A02;
    public final com.facebook.ads.redexgen.core.SF A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 31);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{122, 108, 71, 125, 96, 108, 106, 121, 107};
    }

    static {
        A01();
        A06 = com.facebook.ads.redexgen.core.C6U.class.getSimpleName();
    }

    public C6U(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.InterfaceC0794Jw interfaceC0794Jw, com.facebook.ads.redexgen.core.C6V c6v, com.facebook.ads.redexgen.core.C6W c6w) {
        this.A02 = c1198Zr;
        this.A03 = interfaceC0794Jw.A54(com.facebook.ads.redexgen.core.SG.A06);
        this.A00 = c6v;
        this.A01 = c6w;
        this.A03.A3n(new com.facebook.ads.redexgen.core.C1207a0(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (!this.A03.A9b()) {
                this.A02.A04().A9O();
                return;
            }
            java.lang.String btExtras = this.A03.A75().optString(A00(0, 9, 7));
            if (!android.text.TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || com.facebook.ads.redexgen.core.C0762Im.A0h(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
