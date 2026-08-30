package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1248af extends com.facebook.ads.redexgen.core.AbstractC04304k {
    public static java.lang.String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0R(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56);

    public abstract boolean A0S(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56);

    public abstract boolean A0T(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, int i, int i2, int i3, int i4);

    public abstract boolean A0U(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass57, int i, int i2, int i3, int i4);

    @Override // com.facebook.ads.redexgen.core.AbstractC04304k
    public final boolean A0D(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        return !this.A00 || anonymousClass56.A0Z();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04304k
    public final boolean A0E(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.C04294j c04294j, com.facebook.ads.redexgen.core.C04294j c04294j2) {
        if (c04294j != null && (c04294j.A01 != c04294j2.A01 || c04294j.A03 != c04294j2.A03)) {
            return A0T(anonymousClass56, c04294j.A01, c04294j.A03, c04294j2.A01, c04294j2.A03);
        }
        return A0R(anonymousClass56);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04304k
    public final boolean A0F(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.C04294j c04294j, com.facebook.ads.redexgen.core.C04294j c04294j2) {
        int i = c04294j.A01;
        int oldLeft = c04294j.A03;
        android.view.View view = anonymousClass56.A0H;
        int oldTop = c04294j2 == null ? view.getLeft() : c04294j2.A01;
        java.lang.String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = c04294j2 == null ? view.getTop() : c04294j2.A03;
        if (!anonymousClass56.A0a() && (i != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0T(anonymousClass56, i, oldLeft, oldTop, top);
        }
        return A0S(anonymousClass56);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04304k
    public final boolean A0G(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.C04294j c04294j, com.facebook.ads.redexgen.core.C04294j c04294j2) {
        if (c04294j.A01 != c04294j2.A01 || c04294j.A03 != c04294j2.A03) {
            return A0T(anonymousClass56, c04294j.A01, c04294j.A03, c04294j2.A01, c04294j2.A03);
        }
        A0O(anonymousClass56);
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04304k
    public final boolean A0H(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass57, com.facebook.ads.redexgen.core.C04294j c04294j, com.facebook.ads.redexgen.core.C04294j c04294j2) {
        int i;
        int i2;
        int i3 = c04294j.A01;
        int i4 = c04294j.A03;
        if (anonymousClass57.A0f()) {
            i = c04294j.A01;
            i2 = c04294j.A03;
        } else {
            i = c04294j2.A01;
            i2 = c04294j2.A03;
        }
        return A0U(anonymousClass56, anonymousClass57, i3, i4, i, i2);
    }

    public final void A0N(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        A0C(anonymousClass56);
    }

    public final void A0O(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        A0C(anonymousClass56);
    }

    public final void A0P(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        A0C(anonymousClass56);
    }

    public final void A0Q(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, boolean z) {
        A0C(anonymousClass56);
    }
}
