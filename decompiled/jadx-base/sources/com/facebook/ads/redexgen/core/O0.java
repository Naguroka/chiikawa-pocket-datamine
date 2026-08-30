package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class O0 {
    public static java.lang.String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final java.lang.String A00 = com.facebook.ads.redexgen.core.O0.class.getSimpleName();
    public final java.lang.ref.WeakReference<java.util.concurrent.atomic.AtomicBoolean> A01;
    public final java.lang.ref.WeakReference<java.util.concurrent.atomic.AtomicBoolean> A02;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0S> A03;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.O1> A04;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0987Rk> A05;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1070Up> A06;

    public O0(com.facebook.ads.redexgen.core.C1070Up c1070Up, com.facebook.ads.redexgen.core.O1 o1, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.atomic.AtomicBoolean atomicBoolean2, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A06 = new java.lang.ref.WeakReference<>(c1070Up);
        this.A04 = new java.lang.ref.WeakReference<>(o1);
        this.A05 = new java.lang.ref.WeakReference<>(c0987Rk);
        this.A01 = new java.lang.ref.WeakReference<>(atomicBoolean);
        this.A02 = new java.lang.ref.WeakReference<>(atomicBoolean2);
        this.A03 = new java.lang.ref.WeakReference<>(c1199Zs.A0E());
    }

    private com.facebook.ads.redexgen.core.C0S A00() {
        com.facebook.ads.redexgen.core.C0S funnel = this.A03.get();
        if (funnel == null) {
            return new com.facebook.ads.redexgen.core.C1378co();
        }
        return funnel;
    }

    @android.webkit.JavascriptInterface
    public void alert(java.lang.String str) {
        android.util.Log.e(this.A00, str);
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getAnalogInfo() {
        return com.facebook.ads.redexgen.core.LV.A01(com.facebook.ads.redexgen.core.C8N.A02());
    }

    @android.webkit.JavascriptInterface
    public void logFunnel(int i, java.lang.String str) {
        A00().AHS(i, str);
    }

    @android.webkit.JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AHT();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AHU();
            if (this.A06.get().isShown()) {
                A00().AHV();
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.C1072Ur(this.A05));
            }
            com.facebook.ads.redexgen.core.O1 o1 = this.A04.get();
            if (o1 != null) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.RunnableC0898Nz(this, o1));
            }
        }
    }

    @android.webkit.JavascriptInterface
    public void onPageInitialized() {
        com.facebook.ads.redexgen.core.C1070Up webView = this.A06.get();
        if (webView == null || webView.A06()) {
            A00().AHW(true);
            return;
        }
        com.facebook.ads.redexgen.core.O1 o1 = this.A04.get();
        if (o1 == null) {
            A00().AHW(true);
            return;
        }
        com.facebook.ads.redexgen.core.C0S c0sA00 = A00();
        java.lang.String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new java.lang.RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        c0sA00.AHW(false);
        o1.ACx();
    }
}
