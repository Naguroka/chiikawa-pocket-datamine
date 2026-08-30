package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5B {
    public com.facebook.ads.redexgen.core.AnonymousClass58 A00 = new com.facebook.ads.redexgen.core.AnonymousClass58();
    public final com.facebook.ads.redexgen.core.AnonymousClass59 A01;

    public C5B(com.facebook.ads.redexgen.core.AnonymousClass59 anonymousClass59) {
        this.A01 = anonymousClass59;
    }

    public final android.view.View A00(int i, int i2, int i3, int i4) {
        int iA7z = this.A01.A7z();
        int next = this.A01.A7y();
        int childEnd = i2 > i ? 1 : -1;
        android.view.View view = null;
        while (i != i2) {
            android.view.View viewA6k = this.A01.A6k(i);
            int iA6n = this.A01.A6n(viewA6k);
            int i5 = this.A01.A6m(viewA6k);
            this.A00.A03(iA7z, next, iA6n, i5);
            if (i3 != 0) {
                this.A00.A01();
                this.A00.A02(i3);
                if (this.A00.A04()) {
                    return viewA6k;
                }
            }
            if (i4 != 0) {
                this.A00.A01();
                this.A00.A02(i4);
                if (this.A00.A04()) {
                    view = viewA6k;
                }
            }
            i += childEnd;
        }
        return view;
    }
}
