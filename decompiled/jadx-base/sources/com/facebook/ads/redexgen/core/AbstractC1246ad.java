package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1246ad extends com.facebook.ads.redexgen.core.AbstractC04374r {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"VI3k6vbyE", "wbKxmRtdnLanYPPQlq0AQ7UHjncjxjam", "7rHsxeXjhwTRluKKUSI3i7DNAgzyS", "RLsJgHk6VqLvU3GrilIJimxIkswsMvKT", "sHDfA32w1RYOD3HMFDMkWGxW2yjuY1ZH", "JEcuqbBofZsfD30FS8fTTaggCipMDK", "8NUawD4TiWbh8YzDjR1LHPIBKq0RidcG", "8EIjrQLLrDPWSel1MFlzfXR6TVhPBcGW"};
    public com.facebook.ads.redexgen.core.FL A00;
    public android.widget.Scroller A01;
    public final com.facebook.ads.redexgen.core.AbstractC04394t A02 = new com.facebook.ads.redexgen.core.C1247ae(this);

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 15);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A09() {
        A03 = new byte[]{-120, -75, 103, -80, -75, -70, -69, -88, -75, -86, -84, 103, -74, -83, 103, -106, -75, -115, -77, -80, -75, -82, -109, -80, -70, -69, -84, -75, -84, -71, 103, -88, -77, -71, -84, -88, -85, -64, 103, -70, -84, -69, 117};
    }

    public abstract int A0C(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o, int i, int i2);

    public abstract android.view.View A0D(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o);

    @java.lang.Deprecated
    public abstract com.facebook.ads.redexgen.core.C1260as A0E(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o);

    public abstract int[] A0H(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o, android.view.View view);

    static {
        A09();
    }

    private final com.facebook.ads.redexgen.core.C1260as A05(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o) {
        return A0E(abstractC04344o);
    }

    private void A07() {
        this.A00.A1g(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws java.lang.IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1f(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new java.lang.IllegalStateException(A06(0, 43, 56));
    }

    private boolean A0A(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o, int i, int i2) {
        com.facebook.ads.redexgen.core.C1260as c1260asA05;
        int iA0C;
        if (!(abstractC04344o instanceof com.facebook.ads.redexgen.core.AnonymousClass50) || (c1260asA05 = A05(abstractC04344o)) == null || (iA0C = A0C(abstractC04344o, i, i2)) == -1) {
            return false;
        }
        c1260asA05.A0A(iA0C);
        abstractC04344o.A1L(c1260asA05);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04374r
    public final boolean A0B(int i, int i2) {
        com.facebook.ads.redexgen.core.AbstractC04344o layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (java.lang.Math.abs(i2) > minFlingVelocity || java.lang.Math.abs(i) > minFlingVelocity) && A0A(layoutManager, i, i2);
    }

    public final void A0F() {
        com.facebook.ads.redexgen.core.AbstractC04344o layoutManager;
        android.view.View viewA0D;
        if (this.A00 == null || (layoutManager = this.A00.getLayoutManager()) == null || (viewA0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] iArrA0H = A0H(layoutManager, viewA0D);
        if (iArrA0H[0] != 0 || iArrA0H[1] != 0) {
            this.A00.A1c(iArrA0H[0], iArrA0H[1]);
        }
    }

    public final void A0G(com.facebook.ads.redexgen.core.FL fl) throws java.lang.IllegalStateException {
        if (this.A00 == fl) {
            return;
        }
        com.facebook.ads.redexgen.core.FL fl2 = this.A00;
        if (A04[3].charAt(14) == 'w') {
            throw new java.lang.RuntimeException();
        }
        A04[4] = "xzKGxret4GzWIxaR6oK37PWpSNYAUaFQ";
        if (fl2 != null) {
            A07();
        }
        this.A00 = fl;
        if (this.A00 != null) {
            A08();
            this.A01 = new android.widget.Scroller(this.A00.getContext(), new android.view.animation.DecelerateInterpolator());
            A0F();
        }
    }
}
