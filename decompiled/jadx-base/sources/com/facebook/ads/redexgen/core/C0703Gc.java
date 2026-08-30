package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0703Gc implements java.lang.Comparable<com.facebook.ads.redexgen.core.C0703Gc> {
    public static java.lang.String[] A07 = {"Pg1hszkiSUaQ1Q3zUSDOGcwj", "XShA8NFwXMYGNPNQ1BnInLPPJxqL39cw", "4AD4jwCbTLaGqX9NncWpOLB6kKpQgghq", "doOTHA4oEA3dklajbgRwWhS1FJUNjIcN", "kRAYWFoIfk1tahKyvQkcWyD9", "v3c98y91ZIbNDnVgLScu", "QZvUGrumLzA7euHuZCA08HkLf7D5kSmU", "3DTCIPMv7b0hO08Etp6WfnPKrfF9T0Ka"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters A06;

    public C0703Gc(com.facebook.ads.internal.exoplayer2.thirdparty.Format format, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i) {
        this.A06 = defaultTrackSelector$Parameters;
        this.A05 = com.facebook.ads.redexgen.core.D1.A0H(i, false) ? 1 : 0;
        this.A03 = com.facebook.ads.redexgen.core.D1.A0K(format, defaultTrackSelector$Parameters.A07) ? 1 : 0;
        this.A02 = (format.A0D & 1) != 0 ? 1 : 0;
        this.A01 = format.A05;
        this.A04 = format.A0C;
        this.A00 = format.A04;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.facebook.ads.redexgen.core.C0703Gc c0703Gc) {
        if (this.A05 != c0703Gc.A05) {
            return com.facebook.ads.redexgen.core.D1.A01(this.A05, c0703Gc.A05);
        }
        if (this.A03 != c0703Gc.A03) {
            return com.facebook.ads.redexgen.core.D1.A01(this.A03, c0703Gc.A03);
        }
        if (this.A02 != c0703Gc.A02) {
            return com.facebook.ads.redexgen.core.D1.A01(this.A02, c0703Gc.A02);
        }
        if (this.A06.A0D) {
            int i = c0703Gc.A00;
            if (A07[3].charAt(16) == 'v') {
                throw new java.lang.RuntimeException();
            }
            A07[1] = "Pc63tSmZUGJUTTfLdPyCZoSTnPj3qyRn";
            return com.facebook.ads.redexgen.core.D1.A01(i, this.A00);
        }
        int i2 = this.A05 != 1 ? -1 : 1;
        int i3 = this.A01;
        int resultSign = c0703Gc.A01;
        if (i3 != resultSign) {
            int i4 = this.A01;
            int resultSign2 = c0703Gc.A01;
            return com.facebook.ads.redexgen.core.D1.A01(i4, resultSign2) * i2;
        }
        int i5 = this.A04;
        int resultSign3 = c0703Gc.A04;
        if (i5 != resultSign3) {
            int i6 = this.A04;
            int resultSign4 = c0703Gc.A04;
            return com.facebook.ads.redexgen.core.D1.A01(i6, resultSign4) * i2;
        }
        int i7 = this.A00;
        int resultSign5 = c0703Gc.A00;
        return com.facebook.ads.redexgen.core.D1.A01(i7, resultSign5) * i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C0703Gc c0703Gc = (com.facebook.ads.redexgen.core.C0703Gc) obj;
        return this.A05 == c0703Gc.A05 && this.A03 == c0703Gc.A03 && this.A02 == c0703Gc.A02 && this.A01 == c0703Gc.A01 && this.A04 == c0703Gc.A04 && this.A00 == c0703Gc.A00;
    }

    public final int hashCode() {
        int result = this.A05;
        int i = result * 31;
        int result2 = this.A03;
        int result3 = (((i + result2) * 31) + this.A02) * 31;
        int result4 = this.A01;
        int result5 = (((result3 + result4) * 31) + this.A04) * 31;
        int result6 = this.A00;
        return result5 + result6;
    }
}
