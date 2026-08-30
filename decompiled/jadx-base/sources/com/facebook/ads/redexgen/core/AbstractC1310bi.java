package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1310bi implements com.facebook.ads.redexgen.core.C2I {
    public static byte[] A06;
    public final com.facebook.ads.redexgen.core.AnonymousClass20 A00;
    public final com.facebook.ads.redexgen.core.AnonymousClass27 A01;
    public final com.facebook.ads.redexgen.core.C1199Zs A02;
    public final android.os.Handler A03;
    public final java.lang.String A04;
    public final com.facebook.ads.redexgen.core.C2C A05;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 70);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-104, -85, -92, -102, -94, -101, -75, -101, -82, -86, -88, -105, -87, -75, -95, -101, -81, -25, -20, -14, -3, -29, -16, -16, -19, -16, -3, -31, -19, -30, -29, -3, -23, -29, -9, -6, -5, -7, 6, -24, -21, 6, -16, -21, 6, -14, -20, 0, 21, 22, 20, 33, 7, 20, 20, 17, 20, 33, 15, 7, 21, 21, 3, 9, 7, 33, 13, 7, 27};
    }

    public abstract void A08();

    public abstract void A09();

    public AbstractC1310bi(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, com.facebook.ads.redexgen.core.C2D c2d) {
        this.A02 = c1199Zs;
        this.A04 = str;
        com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(this.A02).getInitApi().onAdLoadInvoked(this.A02);
        this.A00 = new com.facebook.ads.redexgen.core.C1313bl(c1199Zs, this);
        this.A01 = new com.facebook.ads.redexgen.core.AnonymousClass27(c1199Zs, this);
        this.A03 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A05 = c2d.A52(this.A00, this, this.A01);
    }

    public final com.facebook.ads.redexgen.core.AnonymousClass20 A03() {
        return this.A00;
    }

    public final java.lang.String A04() {
        return this.A04;
    }

    public final void A05() {
        if (this.A01.A01) {
            this.A02.A0E().AFI();
            A06();
        } else {
            this.A02.A0E().AFA();
            this.A01.A02 = true;
            this.A01.A0E(com.facebook.ads.redexgen.core.AbstractC0764Ip.A02.get());
        }
    }

    public final void A06() {
        this.A02.A0E().AFN();
        if (!this.A01.A0F(this.A05.A7h(), this.A05.A50(this.A04))) {
            A09();
            this.A02.A0E().AFG();
        }
    }

    public final void A07() {
        if (!com.facebook.ads.redexgen.core.C0762Im.A0r(this.A02)) {
            return;
        }
        com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(new com.facebook.ads.redexgen.core.C1311bj(this));
    }

    public final void A0A(int i) {
        this.A01.A0D(this.A02, i);
    }

    public final void A0B(int i, com.facebook.ads.internal.protocol.AdErrorType adErrorType, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String strA01 = A01(48, 21, 124);
        if (str != null) {
            bundle.putString(strA01, str);
        } else {
            bundle.putString(strA01, adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt(A01(17, 18, 88), adErrorType.getErrorCode());
        ACk(i, this.A04, bundle);
    }

    public final void A0C(android.os.Message message) {
        this.A05.A8u(message);
    }

    @Override // com.facebook.ads.redexgen.core.C2I
    public final void ACk(int i, java.lang.String str, android.os.Bundle bundle) {
        android.os.Message messageObtain = android.os.Message.obtain((android.os.Handler) null, i);
        messageObtain.getData().putString(A01(35, 13, 97), str);
        if (bundle != null) {
            messageObtain.getData().putBundle(A01(0, 17, 16), bundle);
        }
        java.lang.Runnable callbackApiRunnable = new com.facebook.ads.redexgen.core.C1312bk(this, messageObtain);
        this.A03.post(callbackApiRunnable);
    }
}
