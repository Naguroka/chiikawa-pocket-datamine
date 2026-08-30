package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public C8(int i, byte[] bArr, int i2, int i3) {
        this.A01 = i;
        this.A03 = bArr;
        this.A02 = i2;
        this.A00 = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C8 c8 = (com.facebook.ads.redexgen.core.C8) obj;
        if (this.A01 == c8.A01 && this.A02 == c8.A02 && this.A00 == c8.A00 && java.util.Arrays.equals(this.A03, c8.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i = result * 31;
        int result2 = java.util.Arrays.hashCode(this.A03);
        int result3 = (((i + result2) * 31) + this.A02) * 31;
        int result4 = this.A00;
        return result3 + result4;
    }
}
