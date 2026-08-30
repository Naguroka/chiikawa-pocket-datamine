package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AK {
    public int A00;
    public long A01;
    public java.lang.Object A02;
    public java.lang.Object A03;
    public long A04;
    public com.facebook.ads.redexgen.core.FU A05;

    public final int A00() {
        return this.A05.A00;
    }

    public final int A01(int i) {
        return this.A05.A04[i].A00;
    }

    public final int A02(int i) {
        return this.A05.A04[i].A00();
    }

    public final int A03(int i, int i2) {
        return this.A05.A04[i].A01(i2);
    }

    public final int A04(long j) {
        return this.A05.A00(j);
    }

    public final int A05(long j) {
        return this.A05.A01(j);
    }

    public final long A06() {
        return this.A05.A01;
    }

    public final long A07() {
        return this.A01;
    }

    public final long A08() {
        return com.facebook.ads.redexgen.core.AbstractC05389b.A01(this.A04);
    }

    public final long A09(int i) {
        return this.A05.A03[i];
    }

    public final long A0A(int i, int i2) {
        com.facebook.ads.redexgen.core.FS fs = this.A05.A04[i];
        return fs.A00 != -1 ? fs.A02[i2] : androidx.media3.common.C.TIME_UNSET;
    }

    public final com.facebook.ads.redexgen.core.AK A0B(java.lang.Object obj, java.lang.Object obj2, int i, long j, long j2) {
        return A0C(obj, obj2, i, j, j2, com.facebook.ads.redexgen.core.FU.A06);
    }

    public final com.facebook.ads.redexgen.core.AK A0C(java.lang.Object obj, java.lang.Object obj2, int i, long j, long j2, com.facebook.ads.redexgen.core.FU fu) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i;
        this.A01 = j;
        this.A04 = j2;
        this.A05 = fu;
        return this;
    }

    public final boolean A0D(int i) {
        return !this.A05.A04[i].A02();
    }

    public final boolean A0E(int i, int i2) {
        com.facebook.ads.redexgen.core.FS fs = this.A05.A04[i];
        return (fs.A00 == -1 || fs.A01[i2] == 0) ? false : true;
    }
}
