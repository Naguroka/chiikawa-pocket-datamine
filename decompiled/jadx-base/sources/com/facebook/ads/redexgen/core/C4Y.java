package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C4Y {
    public static byte[] A03;
    public int A00;
    public final android.graphics.Rect A01;
    public final com.facebook.ads.redexgen.core.AbstractC04344o A02;

    static {
        A04();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 126);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-6, -1, 7, -14, -3, -6, -11, -79, 0, 3, -6, -10, -1, 5, -14, 5, -6, 0, -1};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(android.view.View view);

    public abstract int A0D(android.view.View view);

    public abstract int A0E(android.view.View view);

    public abstract int A0F(android.view.View view);

    public abstract int A0G(android.view.View view);

    public abstract int A0H(android.view.View view);

    public abstract void A0J(int i);

    public C4Y(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new android.graphics.Rect();
        this.A02 = abstractC04344o;
    }

    public /* synthetic */ C4Y(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o, com.facebook.ads.redexgen.core.C1259ar c1259ar) {
        this(abstractC04344o);
    }

    public static com.facebook.ads.redexgen.core.C1259ar A00(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o) {
        return new com.facebook.ads.redexgen.core.C1259ar(abstractC04344o);
    }

    public static com.facebook.ads.redexgen.core.C1258aq A01(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o) {
        return new com.facebook.ads.redexgen.core.C1258aq(abstractC04344o);
    }

    public static com.facebook.ads.redexgen.core.C4Y A02(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o, int i) {
        switch (i) {
            case 0:
                return A00(abstractC04344o);
            case 1:
                return A01(abstractC04344o);
            default:
                throw new java.lang.IllegalArgumentException(A03(0, 19, 19));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
