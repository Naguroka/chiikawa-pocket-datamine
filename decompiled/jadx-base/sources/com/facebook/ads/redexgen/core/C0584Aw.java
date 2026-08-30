package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0584Aw {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final com.facebook.ads.redexgen.core.C0582Au A05;

    public C0584Aw(android.media.AudioTrack audioTrack) {
        if (com.facebook.ads.redexgen.core.IK.A02 >= 19) {
            this.A05 = new com.facebook.ads.redexgen.core.C0582Au(audioTrack);
            A05();
        } else {
            this.A05 = null;
            A00(3);
        }
    }

    private void A00(int i) {
        this.A00 = i;
        switch (i) {
            case 0:
                this.A03 = 0L;
                this.A01 = -1L;
                this.A02 = java.lang.System.nanoTime() / 1000;
                this.A04 = 5000L;
                return;
            case 1:
                this.A04 = 5000L;
                return;
            case 2:
            case 3:
                this.A04 = 10000000L;
                return;
            case 4:
                this.A04 = 500000L;
                return;
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public final long A01() {
        if (this.A05 != null) {
            return this.A05.A00();
        }
        return -1L;
    }

    public final long A02() {
        return this.A05 != null ? this.A05.A01() : androidx.media3.common.C.TIME_UNSET;
    }

    public final void A03() {
        if (this.A00 == 4) {
            A05();
        }
    }

    public final void A04() {
        A00(4);
    }

    public final void A05() {
        if (this.A05 != null) {
            A00(0);
        }
    }

    public final boolean A06() {
        return this.A00 == 1 || this.A00 == 2;
    }

    public final boolean A07() {
        return this.A00 == 2;
    }

    public final boolean A08(long j) {
        if (this.A05 == null || j - this.A03 < this.A04) {
            return false;
        }
        this.A03 = j;
        boolean zA02 = this.A05.A02();
        switch (this.A00) {
            case 0:
                if (!zA02) {
                    if (j - this.A02 <= 500000) {
                        return zA02;
                    }
                    A00(3);
                    return zA02;
                }
                long jA01 = this.A05.A01();
                long timestampPositionFrames = this.A02;
                if (jA01 >= timestampPositionFrames) {
                    this.A01 = this.A05.A00();
                    A00(1);
                    return zA02;
                }
                return false;
            case 1:
                if (zA02) {
                    long jA00 = this.A05.A00();
                    long timestampPositionFrames2 = this.A01;
                    if (jA00 > timestampPositionFrames2) {
                        A00(2);
                        return zA02;
                    }
                    return zA02;
                }
                A05();
                return zA02;
            case 2:
                if (!zA02) {
                    A05();
                    return zA02;
                }
                return zA02;
            case 3:
                if (zA02) {
                    A05();
                    return zA02;
                }
                return zA02;
            case 4:
                return zA02;
            default:
                throw new java.lang.IllegalStateException();
        }
    }
}
