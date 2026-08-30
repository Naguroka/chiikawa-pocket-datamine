package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.51, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass51 {
    public static byte[] A07;
    public android.view.View A01;
    public com.facebook.ads.redexgen.core.AbstractC04344o A02;
    public com.facebook.ads.redexgen.core.FL A03;
    public boolean A04;
    public boolean A05;
    public int A00 = -1;
    public final com.facebook.ads.redexgen.core.C04444z A06 = new com.facebook.ads.redexgen.core.C04444z(0, 0);

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 20);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{106, 77, 85, 66, 79, 74, 71, 3, 87, 66, 81, 68, 70, 87, 3, 83, 76, 80, 74, 87, 74, 76, 77, 5, 52, 38, 38, 48, 49, 117, 58, 35, 48, 39, 117, 33, 52, 39, 50, 48, 33, 117, 37, 58, 38, 60, 33, 60, 58, 59, 117, 34, kotlin.io.encoding.Base64.padSymbol, 60, 57, 48, 117, 38, 56, 58, 58, 33, kotlin.io.encoding.Base64.padSymbol, 117, 38, 54, 39, 58, 57, 57, 60, 59, 50, 123, 123, 76, 74, 80, 74, 69, 76, 91, 127, 64, 76, 94};
    }

    public abstract void A0G();

    public abstract void A0H(int i, int i2, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.C04444z c04444z);

    public abstract void A0I(android.view.View view, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.C04444z c04444z);

    private final int A00(android.view.View view) {
        return this.A03.A1B(view);
    }

    private final android.view.View A01(int i) {
        return this.A03.A06.A1m(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, int i2) {
        com.facebook.ads.redexgen.core.FL fl = this.A03;
        if (!this.A05 || this.A00 == -1 || fl == null) {
            A09();
        }
        this.A04 = false;
        if (this.A01 != null) {
            if (A00(this.A01) == this.A00) {
                A0I(this.A01, fl.A0s, this.A06);
                this.A06.A05(fl);
                A09();
            } else {
                android.util.Log.e(A02(74, 12, 61), A02(23, 51, 65));
                this.A01 = null;
            }
        }
        if (this.A05) {
            A0H(i, i2, fl.A0s, this.A06);
            boolean hadJumpTarget = this.A06.A06();
            this.A06.A05(fl);
            if (hadJumpTarget) {
                if (this.A05) {
                    this.A04 = true;
                    fl.A08.A07();
                } else {
                    A09();
                }
            }
        }
    }

    public final int A06() {
        return this.A03.A06.A0W();
    }

    public final int A07() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.AbstractC04344o A08() {
        return this.A02;
    }

    public final void A09() {
        if (!this.A05) {
            return;
        }
        A0G();
        this.A03.A0s.A0F = -1;
        this.A01 = null;
        this.A00 = -1;
        this.A04 = false;
        this.A05 = false;
        this.A02.A0M(this);
        this.A02 = null;
        this.A03 = null;
    }

    public final void A0A(int i) {
        this.A00 = i;
    }

    public final void A0B(android.graphics.PointF pointF) {
        float fSqrt = (float) java.lang.Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
        float magnitude = pointF.x;
        pointF.x = magnitude / fSqrt;
        float magnitude2 = pointF.y;
        pointF.y = magnitude2 / fSqrt;
    }

    public final void A0C(android.view.View view) {
        if (A00(view) == A07()) {
            this.A01 = view;
        }
    }

    public final void A0D(com.facebook.ads.redexgen.core.FL fl, com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o) {
        this.A03 = fl;
        this.A02 = abstractC04344o;
        if (this.A00 != -1) {
            this.A03.A0s.A0F = this.A00;
            this.A05 = true;
            this.A04 = true;
            this.A01 = A01(A07());
            this.A03.A08.A07();
            return;
        }
        throw new java.lang.IllegalArgumentException(A02(0, 23, 55));
    }

    public final boolean A0E() {
        return this.A04;
    }

    public final boolean A0F() {
        return this.A05;
    }
}
