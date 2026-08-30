package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MD implements java.util.concurrent.Callable<java.lang.Void> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int[] A06;

    public MD(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A06 = iArr;
        this.A05 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A00 = i5;
        this.A03 = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    @javax.annotation.Nullable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void call() throws java.lang.Exception {
        com.facebook.ads.redexgen.core.C1086Vf.A00(this.A06, this.A05, this.A01, this.A02, this.A04, this.A00, this.A03);
        return null;
    }
}
