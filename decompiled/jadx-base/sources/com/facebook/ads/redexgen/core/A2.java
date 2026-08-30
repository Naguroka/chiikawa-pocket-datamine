package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A2 {
    public static java.lang.String[] A04 = {"", "VtJRvyPxmOImdsyLi4M2", "Gm1PRIYmvz", "uPcs22Bv4Ecng1eDU86bpHQLBlw1u", "FddESRKU", "iRaMLR8dbHBCXOgyzzarEjyYAsYlFtS", "", "bNCmKEz4NkHWTfLh0ykYoXiICiHkm4jm"};
    public static final com.facebook.ads.redexgen.core.A2 A05 = new com.facebook.ads.redexgen.core.A2(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public A2(float f) {
        this(f, 1.0f, false);
    }

    public A2(float f, float f2, boolean z) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(f > 0.0f);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = z;
        this.A03 = java.lang.Math.round(1000.0f * f);
    }

    public final long A00(long j) {
        return ((long) this.A03) * j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.A2 a2 = (com.facebook.ads.redexgen.core.A2) obj;
        if (this.A01 == a2.A01) {
            float f = this.A00;
            if (A04[6].length() == 0) {
                java.lang.String[] strArr = A04;
                strArr[5] = "hwWatJQYKhKE8FUxymmZjRx10ScAWIj";
                strArr[3] = "Hxeg71DMLMKL7cxntL9BIHkxZ6VOo";
                if (f == a2.A00) {
                    boolean z = this.A02;
                    boolean z2 = a2.A02;
                    if (A04[7].charAt(4) != 'a') {
                        A04[6] = "";
                        if (z == z2) {
                            return true;
                        }
                    }
                }
            }
            throw new java.lang.RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        return (((((17 * 31) + java.lang.Float.floatToRawIntBits(this.A01)) * 31) + java.lang.Float.floatToRawIntBits(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }
}
