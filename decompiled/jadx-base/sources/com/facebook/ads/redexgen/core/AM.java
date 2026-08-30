package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AM {
    public static java.lang.String[] A00 = {"IexUQhYz8RUJUtV2yarZNq98m", "SqA0rybJc2Jt0Ub7DMrjeUwUZAoVo8qv", "DxKx9aNXAj7QPQdQDSbsmk09wXoOPMXu", "S07tUDZ51Jgo3YfQ92rRpWn9afvBt6KZ", "soNl1VU97OXHQ4CjHAobgeJ4Yx1tI1qy", "ZprKdiaQVhEf0JuCZOvliqNdbLoAvnqm", "6MSYafjKTbgzk4635", "p5W86Vx2FooSJmLWV"};
    public static final com.facebook.ads.redexgen.core.AM A01 = new com.facebook.ads.redexgen.core.Z8();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(java.lang.Object obj);

    public abstract com.facebook.ads.redexgen.core.AK A0A(int i, com.facebook.ads.redexgen.core.AK ak, boolean z);

    public abstract com.facebook.ads.redexgen.core.AL A0D(int i, com.facebook.ads.redexgen.core.AL al, boolean z, long j);

    public int A02(int i, int i2, boolean z) {
        switch (i2) {
            case 0:
                if (i == A06(z)) {
                    return -1;
                }
                return i + 1;
            case 1:
                return i;
            case 2:
                if (i == A06(z)) {
                    return A05(z);
                }
                return i + 1;
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public final int A03(int i, com.facebook.ads.redexgen.core.AK ak, com.facebook.ads.redexgen.core.AL al, int i2, boolean z) {
        int i3 = A09(i, ak).A00;
        int windowIndex = A0B(i3, al).A01;
        if (windowIndex == i) {
            int iA02 = A02(i3, i2, z);
            java.lang.String[] strArr = A00;
            java.lang.String str = strArr[1];
            java.lang.String str2 = strArr[3];
            int iCharAt = str.charAt(18);
            int windowIndex2 = str2.charAt(18);
            if (iCharAt != windowIndex2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A00;
            strArr2[7] = "n5aRHXbmzoQSsyEqE";
            strArr2[6] = "TNiQeaFqL1JGSvg6B";
            if (iA02 == -1) {
                return -1;
            }
            int windowIndex3 = A0B(iA02, al).A00;
            return windowIndex3;
        }
        int windowIndex4 = i + 1;
        return windowIndex4;
    }

    public int A05(boolean z) {
        return A0E() ? -1 : 0;
    }

    public int A06(boolean z) {
        if (A0E()) {
            return -1;
        }
        return A01() - 1;
    }

    public final android.util.Pair<java.lang.Integer, java.lang.Long> A07(com.facebook.ads.redexgen.core.AL al, com.facebook.ads.redexgen.core.AK ak, int i, long j) {
        return A08(al, ak, i, j, 0L);
    }

    public final android.util.Pair<java.lang.Integer, java.lang.Long> A08(com.facebook.ads.redexgen.core.AL al, com.facebook.ads.redexgen.core.AK ak, int i, long j, long j2) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A00(i, 0, A01());
        A0D(i, al, false, j2);
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = al.A01();
            if (j == androidx.media3.common.C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = al.A00;
        long periodPositionUs = al.A03() + j;
        long jA07 = A09(i2, ak).A07();
        while (jA07 != androidx.media3.common.C.TIME_UNSET && periodPositionUs >= jA07 && i2 < al.A01) {
            periodPositionUs -= jA07;
            i2++;
            jA07 = A09(i2, ak).A07();
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(i2), java.lang.Long.valueOf(periodPositionUs));
    }

    public final com.facebook.ads.redexgen.core.AK A09(int i, com.facebook.ads.redexgen.core.AK ak) {
        return A0A(i, ak, false);
    }

    public final com.facebook.ads.redexgen.core.AL A0B(int i, com.facebook.ads.redexgen.core.AL al) {
        return A0C(i, al, false);
    }

    public final com.facebook.ads.redexgen.core.AL A0C(int i, com.facebook.ads.redexgen.core.AL al, boolean z) {
        return A0D(i, al, z, 0L);
    }

    public final boolean A0E() {
        return A01() == 0;
    }

    public final boolean A0F(int i, com.facebook.ads.redexgen.core.AK ak, com.facebook.ads.redexgen.core.AL al, int i2, boolean z) {
        return A03(i, ak, al, i2, z) == -1;
    }
}
