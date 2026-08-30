package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IF {
    public static final java.util.Comparator<com.facebook.ads.redexgen.core.IE> A07 = new com.facebook.ads.redexgen.core.IC();
    public static final java.util.Comparator<com.facebook.ads.redexgen.core.IE> A08 = new com.facebook.ads.redexgen.core.ID();
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final com.facebook.ads.redexgen.core.IE[] A06 = new com.facebook.ads.redexgen.core.IE[5];
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.IE> A05 = new java.util.ArrayList<>();
    public int A00 = -1;

    public IF(int i) {
        this.A04 = i;
    }

    private void A00() {
        if (this.A00 != 1) {
            java.util.Collections.sort(this.A05, A07);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            java.util.Collections.sort(this.A05, A08);
            this.A00 = 0;
        }
    }

    public final float A02(float f) {
        A01();
        float f2 = this.A03 * f;
        int i = 0;
        for (int i2 = 0; i2 < this.A05.size(); i2++) {
            com.facebook.ads.redexgen.core.IE ie = this.A05.get(i2);
            i += ie.A02;
            float desiredWeight = i;
            if (desiredWeight >= f2) {
                float desiredWeight2 = ie.A00;
                return desiredWeight2;
            }
        }
        if (this.A05.isEmpty()) {
            return Float.NaN;
        }
        float desiredWeight3 = this.A05.get(this.A05.size() - 1).A00;
        return desiredWeight3;
    }

    public final void A03(int i, float f) {
        com.facebook.ads.redexgen.core.IE oldestSample;
        A00();
        if (this.A02 > 0) {
            com.facebook.ads.redexgen.core.IE[] ieArr = this.A06;
            int i2 = this.A02 - 1;
            this.A02 = i2;
            oldestSample = ieArr[i2];
        } else {
            oldestSample = new com.facebook.ads.redexgen.core.IE(null);
        }
        int i3 = this.A01;
        this.A01 = i3 + 1;
        oldestSample.A01 = i3;
        oldestSample.A02 = i;
        oldestSample.A00 = f;
        this.A05.add(oldestSample);
        this.A03 += i;
        while (this.A03 > this.A04) {
            int excessWeight = this.A03 - this.A04;
            com.facebook.ads.redexgen.core.IE ie = this.A05.get(0);
            if (ie.A02 <= excessWeight) {
                this.A03 -= ie.A02;
                this.A05.remove(0);
                if (this.A02 < 5) {
                    com.facebook.ads.redexgen.core.IE[] ieArr2 = this.A06;
                    int excessWeight2 = this.A02;
                    this.A02 = excessWeight2 + 1;
                    ieArr2[excessWeight2] = ie;
                }
            } else {
                ie.A02 -= excessWeight;
                this.A03 -= excessWeight;
            }
        }
    }
}
