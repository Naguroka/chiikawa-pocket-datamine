package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AY {
    public static final com.facebook.ads.redexgen.core.AY A04 = new com.facebook.ads.redexgen.core.AX().A00();
    public android.media.AudioAttributes A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public AY(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    public final android.media.AudioAttributes A00() {
        if (this.A00 == null) {
            this.A00 = new android.media.AudioAttributes.Builder().setContentType(this.A01).setFlags(this.A02).setUsage(this.A03).build();
        }
        return this.A00;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.AY ay = (com.facebook.ads.redexgen.core.AY) obj;
        return this.A01 == ay.A01 && this.A02 == ay.A02 && this.A03 == ay.A03;
    }

    public final int hashCode() {
        int result = this.A01;
        int result2 = ((((17 * 31) + result) * 31) + this.A02) * 31;
        int result3 = this.A03;
        return result2 + result3;
    }
}
