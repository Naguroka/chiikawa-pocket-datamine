package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1244ab implements com.facebook.ads.redexgen.core.MR {
    public static java.lang.String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C5Q> A00;

    public C1244ab(com.facebook.ads.redexgen.core.C5Q c5q) {
        this.A00 = new java.lang.ref.WeakReference<>(c5q);
    }

    private void A00(com.facebook.ads.redexgen.core.C5Q c5q) {
        com.facebook.ads.redexgen.core.QS qsA07 = c5q.A07();
        if (qsA07 != null && c5q.A04() != null) {
            c5q.A04().bringChildToFront(qsA07);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public void A3p(android.view.View view, int i, android.widget.RelativeLayout.LayoutParams layoutParams) {
        com.facebook.ads.redexgen.core.C5Q c5q = this.A00.get();
        if (c5q != null && c5q.A04() != null) {
            c5q.A04().addView(view, i, layoutParams);
            A00(c5q);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public void A3q(android.view.View view, android.widget.RelativeLayout.LayoutParams layoutParams) {
        com.facebook.ads.redexgen.core.C5Q c5q = this.A00.get();
        if (c5q != null && c5q.A04() != null) {
            c5q.A04().addView(view, layoutParams);
            A00(c5q);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public void A4P(java.lang.String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public void A4Q(java.lang.String str, com.facebook.ads.redexgen.core.C05328v c05328v) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, c05328v);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public void A9l(java.lang.String str, com.facebook.ads.redexgen.core.C1Z c1z) {
        if (this.A00.get() != null) {
            java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C5Q> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c1z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public void ABR(int i) {
        com.facebook.ads.redexgen.core.C5Q activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i);
        }
    }
}
