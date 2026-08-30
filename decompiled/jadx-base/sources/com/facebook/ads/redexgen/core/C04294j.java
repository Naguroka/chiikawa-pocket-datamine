package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C04294j {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final com.facebook.ads.redexgen.core.C04294j A00(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, int i) {
        android.view.View view = anonymousClass56.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04294j A01(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        return A00(anonymousClass56, 0);
    }
}
