package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.GA> A09;
    public final boolean A0A;

    public G9(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, android.util.SparseArray<com.facebook.ads.redexgen.core.GA> sparseArray) {
        this.A03 = i;
        this.A0A = z;
        this.A08 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A01 = i5;
        this.A00 = i6;
        this.A07 = i7;
        this.A06 = i8;
        this.A05 = i9;
        this.A09 = sparseArray;
    }

    public final void A00(com.facebook.ads.redexgen.core.G9 g9) {
        if (g9 == null) {
            return;
        }
        android.util.SparseArray<com.facebook.ads.redexgen.core.GA> sparseArray = g9.A09;
        for (int i = 0; i < sparseArray.size(); i++) {
            android.util.SparseArray<com.facebook.ads.redexgen.core.GA> sparseArray2 = this.A09;
            int i2 = sparseArray.keyAt(i);
            sparseArray2.put(i2, sparseArray.valueAt(i));
        }
    }
}
