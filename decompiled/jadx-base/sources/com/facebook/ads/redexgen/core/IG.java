package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IG {
    public static java.lang.String[] A03 = {"tICFAL4tVN9N09RnRvbve", "jaSc1", "IvrnX7ho1ftONDMTmSFi", "OR9MpsR11Z2GGOOmL2LcTaYcXEhohoKR", "D3KVpbGnPeieQhxvT98TBR9XUfKWbPsR", "YldczgdroHyloTUU", "n2r7gPtS6", "vBEfvOWQetlKE"};
    public long A00;
    public long A01;
    public volatile long A02 = androidx.media3.common.C.TIME_UNSET;

    public IG(long j) {
        A02(j);
    }

    public static long A00(long j) {
        return (1000000 * j) / 90000;
    }

    public static long A01(long j) {
        return (90000 * j) / 1000000;
    }

    private final synchronized void A02(long j) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A02 == androidx.media3.common.C.TIME_UNSET);
        this.A00 = j;
    }

    public final long A03() {
        return this.A00;
    }

    public final long A04() {
        if (this.A02 == androidx.media3.common.C.TIME_UNSET) {
            return this.A00 != Long.MAX_VALUE ? this.A00 : androidx.media3.common.C.TIME_UNSET;
        }
        long j = this.A02;
        long j2 = this.A01;
        if (A03[6].length() != 9) {
            throw new java.lang.RuntimeException();
        }
        A03[0] = "S4Uu90kHlMHmRsyiW8kTjIwq7rEI2";
        return j2 + j;
    }

    public final long A05() {
        if (this.A00 == Long.MAX_VALUE) {
            return 0L;
        }
        return this.A02 == androidx.media3.common.C.TIME_UNSET ? androidx.media3.common.C.TIME_UNSET : this.A01;
    }

    public final long A06(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        if (this.A02 != androidx.media3.common.C.TIME_UNSET) {
            this.A02 = j;
        } else {
            if (this.A00 != Long.MAX_VALUE) {
                this.A01 = this.A00 - j;
            }
            synchronized (this) {
                this.A02 = j;
                notifyAll();
            }
        }
        return this.A01 + j;
    }

    public final long A07(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        if (this.A02 != androidx.media3.common.C.TIME_UNSET) {
            long jA01 = A01(this.A02);
            long closestWrapCount = (4294967296L + jA01) / 8589934592L;
            long j2 = ((closestWrapCount - 1) * 8589934592L) + j;
            long j3 = (8589934592L * closestWrapCount) + j;
            long lastPts = j2 - jA01;
            long jAbs = java.lang.Math.abs(lastPts);
            long lastPts2 = j3 - jA01;
            if (jAbs >= java.lang.Math.abs(lastPts2)) {
                j2 = j3;
            }
            j = j2;
        }
        long closestWrapCount2 = A00(j);
        if (A03[1].length() != 5) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A03;
        strArr[2] = "xHymioxphqEWgFXMAMEG";
        strArr[7] = "XkLzVUm880jPf";
        return A06(closestWrapCount2);
    }

    public final void A08() {
        this.A02 = androidx.media3.common.C.TIME_UNSET;
    }
}
