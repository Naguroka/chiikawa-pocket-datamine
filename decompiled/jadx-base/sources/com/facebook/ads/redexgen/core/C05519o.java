package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05519o implements java.lang.Comparable<com.facebook.ads.redexgen.core.C05519o> {
    public int A00;
    public long A01;
    public java.lang.Object A02;
    public final com.facebook.ads.redexgen.core.AD A03;

    public C05519o(com.facebook.ads.redexgen.core.AD ad) {
        this.A03 = ad;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.facebook.ads.redexgen.core.C05519o c05519o) {
        if ((this.A02 == null) != (c05519o.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i = this.A00 - c05519o.A00;
        if (i != 0) {
            return i;
        }
        int comparePeriodIndex = com.facebook.ads.redexgen.core.IK.A07(this.A01, c05519o.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i, long j, java.lang.Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
