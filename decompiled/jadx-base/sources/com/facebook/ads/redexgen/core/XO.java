package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XO extends com.facebook.ads.redexgen.core.C0693Fs implements java.lang.Comparable<com.facebook.ads.redexgen.core.XO> {
    public final int A00;

    public XO(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.A00 = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.facebook.ads.redexgen.core.XO xo) {
        if (xo.A00 < this.A00) {
            return -1;
        }
        if (xo.A00 > this.A00) {
            return 1;
        }
        return 0;
    }
}
