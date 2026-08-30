package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FD {
    public static java.lang.String[] A0I = {"eg4X", "Nz0nuhBBXIgKGoX4FaY", "pup", "Qfko2ZJrbd8qm9P7Z", "VNYZn1e9X4HoU78C3Y7Is8XN4Zmjwad1", "gssx", "oXowgT48tsY3I7JxijMLCGdkVoBj4zuG", "nF70W2ZNTzYocw3julTnZ7qnHb7KYrhT"};
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public com.facebook.ads.internal.exoplayer2.thirdparty.Format A08;
    public int A01 = 1000;
    public int[] A0D = new int[this.A01];
    public long[] A0E = new long[this.A01];
    public long[] A0F = new long[this.A01];
    public int[] A0B = new int[this.A01];
    public int[] A0C = new int[this.A01];
    public com.facebook.ads.redexgen.core.C8[] A0H = new com.facebook.ads.redexgen.core.C8[this.A01];
    public com.facebook.ads.internal.exoplayer2.thirdparty.Format[] A0G = new com.facebook.ads.internal.exoplayer2.thirdparty.Format[this.A01];
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public boolean A09 = true;
    public boolean A0A = true;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A09(com.facebook.ads.redexgen.core.C05569u c05569u, com.facebook.ads.redexgen.core.C1177Yw c1177Yw, boolean z, boolean z2, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, com.facebook.ads.redexgen.core.FC fc) {
        if (!A0I()) {
            if (z2) {
                c1177Yw.A02(4);
                return -4;
            }
            if (this.A08 == null || (!z && this.A08 == format)) {
                return -3;
            }
            c05569u.A00 = this.A08;
            return -5;
        }
        int iA00 = A00(this.A03);
        if (z || this.A0G[iA00] != format) {
            c05569u.A00 = this.A0G[iA00];
            return -5;
        }
        if (c1177Yw.A0B()) {
            return -3;
        }
        c1177Yw.A00 = this.A0F[iA00];
        c1177Yw.A02(this.A0B[iA00]);
        fc.A00 = this.A0C[iA00];
        fc.A01 = this.A0E[iA00];
        fc.A02 = this.A0H[iA00];
        this.A03++;
        return -4;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0G(long j, int i, long j2, int i2, com.facebook.ads.redexgen.core.C8 c8) {
        if (this.A0A) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.A0A = false;
            }
        }
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A09);
        A04(j);
        int iA00 = A00(this.A02);
        this.A0F[iA00] = j;
        this.A0E[iA00] = j2;
        this.A0C[iA00] = i2;
        this.A0B[iA00] = i;
        this.A0H[iA00] = c8;
        this.A0G[iA00] = this.A08;
        this.A0D[iA00] = this.A05;
        this.A02++;
        if (this.A02 == this.A01) {
            int i3 = this.A01 + 1000;
            int[] iArr = new int[i3];
            long[] jArr = new long[i3];
            long[] jArr2 = new long[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            com.facebook.ads.redexgen.core.C8[] c8Arr = new com.facebook.ads.redexgen.core.C8[i3];
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] formatArr = new com.facebook.ads.internal.exoplayer2.thirdparty.Format[i3];
            int i4 = this.A01 - this.A04;
            java.lang.System.arraycopy(this.A0E, this.A04, jArr, 0, i4);
            java.lang.System.arraycopy(this.A0F, this.A04, jArr2, 0, i4);
            java.lang.System.arraycopy(this.A0B, this.A04, iArr2, 0, i4);
            java.lang.System.arraycopy(this.A0C, this.A04, iArr3, 0, i4);
            java.lang.System.arraycopy(this.A0H, this.A04, c8Arr, 0, i4);
            java.lang.System.arraycopy(this.A0G, this.A04, formatArr, 0, i4);
            java.lang.System.arraycopy(this.A0D, this.A04, iArr, 0, i4);
            int i5 = this.A04;
            java.lang.System.arraycopy(this.A0E, 0, jArr, i4, i5);
            java.lang.System.arraycopy(this.A0F, 0, jArr2, i4, i5);
            java.lang.System.arraycopy(this.A0B, 0, iArr2, i4, i5);
            java.lang.System.arraycopy(this.A0C, 0, iArr3, i4, i5);
            java.lang.System.arraycopy(this.A0H, 0, c8Arr, i4, i5);
            java.lang.System.arraycopy(this.A0G, 0, formatArr, i4, i5);
            java.lang.System.arraycopy(this.A0D, 0, iArr, i4, i5);
            this.A0E = jArr;
            this.A0F = jArr2;
            this.A0B = iArr2;
            this.A0C = iArr3;
            this.A0H = c8Arr;
            this.A0G = formatArr;
            this.A0D = iArr;
            this.A04 = 0;
            this.A02 = this.A01;
            this.A01 = i3;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized boolean A0J(long j) {
        if (this.A02 == 0) {
            return j > this.A06;
        }
        if (java.lang.Math.max(this.A06, A03(this.A03)) >= j) {
            return false;
        }
        int i = this.A02;
        int iA00 = A00(this.A02 - 1);
        while (i > this.A03 && this.A0F[iA00] >= j) {
            i--;
            iA00--;
            if (iA00 == -1) {
                iA00 = this.A01 - 1;
            }
        }
        A0C(this.A00 + i);
        return true;
    }

    private int A00(int i) {
        int i2 = this.A04 + i;
        int relativeIndex = this.A01;
        if (i2 < relativeIndex) {
            return i2;
        }
        int relativeIndex2 = this.A01;
        return i2 - relativeIndex2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    private int A01(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.A0F[i];
            int searchIndex = A0I[4].charAt(28);
            if (searchIndex != 119) {
                throw new java.lang.RuntimeException();
            }
            A0I[7] = "2t88pR0KuusKqROhFGTpPzoT6JtiYocO";
            if (j2 > j) {
                break;
            }
            if (z) {
                int sampleCountToTarget = this.A0B[i];
                if ((sampleCountToTarget & 1) != 0) {
                    i3 = i4;
                }
            } else {
                i3 = i4;
            }
            i++;
            int sampleCountToTarget2 = this.A01;
            if (i == sampleCountToTarget2) {
                i = 0;
            }
        }
        return i3;
    }

    private long A02(int i) {
        this.A06 = java.lang.Math.max(this.A06, A03(i));
        this.A02 -= i;
        this.A00 += i;
        this.A04 += i;
        if (this.A04 >= this.A01) {
            this.A04 -= this.A01;
        }
        this.A03 -= i;
        if (this.A03 < 0) {
            this.A03 = 0;
        }
        if (this.A02 == 0) {
            int relativeLastDiscardIndex = this.A04 == 0 ? this.A01 : this.A04;
            int i2 = relativeLastDiscardIndex - 1;
            long j = this.A0E[i2];
            int relativeLastDiscardIndex2 = this.A0C[i2];
            return j + ((long) relativeLastDiscardIndex2);
        }
        return this.A0E[this.A04];
    }

    private long A03(int i) {
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        long jMax = Long.MIN_VALUE;
        int iA00 = A00(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            long largestTimestampUs = this.A0F[iA00];
            jMax = java.lang.Math.max(jMax, largestTimestampUs);
            if ((this.A0B[iA00] & 1) != 0) {
                break;
            }
            iA00--;
            if (iA00 == -1) {
                iA00 = this.A01 - 1;
                if (A0I[1].length() != 19) {
                    throw new java.lang.RuntimeException();
                }
                A0I[6] = "3SlA6b43nql7FrrkKRcIyQIEhITz0K6U";
            }
        }
        return jMax;
    }

    private final synchronized void A04(long j) {
        this.A07 = java.lang.Math.max(this.A07, j);
    }

    public final int A05() {
        return this.A00 + this.A03;
    }

    public final int A06() {
        return this.A00 + this.A02;
    }

    public final synchronized int A07() {
        int i;
        i = this.A02 - this.A03;
        int skipCount = this.A02;
        this.A03 = skipCount;
        return i;
    }

    public final synchronized int A08(long j, boolean z, boolean z2) {
        int iA00 = A00(this.A03);
        if (!A0I() || j < this.A0F[iA00] || (j > this.A07 && !z2)) {
            return -1;
        }
        int i = this.A02;
        int relativeReadIndex = this.A03;
        int offset = A01(iA00, i - relativeReadIndex, j, z);
        if (offset == -1) {
            return -1;
        }
        int relativeReadIndex2 = this.A03;
        this.A03 = relativeReadIndex2 + offset;
        return offset;
    }

    public final synchronized long A0A() {
        if (this.A02 == 0) {
            return -1L;
        }
        return A02(this.A02);
    }

    public final synchronized long A0B() {
        return this.A07;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    public final long A0C(int i) {
        boolean z;
        int iA06 = A06() - i;
        if (iA06 >= 0) {
            int i2 = this.A02;
            int discardCount = this.A03;
            if (iA06 <= i2 - discardCount) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(z);
        int discardCount2 = this.A02;
        this.A02 = discardCount2 - iA06;
        long j = this.A06;
        int discardCount3 = this.A02;
        this.A07 = java.lang.Math.max(j, A03(discardCount3));
        int discardCount4 = this.A02;
        if (discardCount4 == 0) {
            return 0L;
        }
        int discardCount5 = this.A02;
        int relativeLastWriteIndex = A00(discardCount5 - 1);
        long j2 = this.A0E[relativeLastWriteIndex];
        int discardCount6 = this.A0C[relativeLastWriteIndex];
        return j2 + ((long) discardCount6);
    }

    public final synchronized long A0D(long j, boolean z, boolean z2) {
        if (this.A02 != 0 && j >= this.A0F[this.A04]) {
            int iA01 = A01(this.A04, (!z2 || this.A03 == this.A02) ? this.A02 : this.A03 + 1, j, z);
            if (iA01 == -1) {
                return -1L;
            }
            return A02(iA01);
        }
        return -1L;
    }

    public final synchronized com.facebook.ads.internal.exoplayer2.thirdparty.Format A0E() {
        return this.A09 ? null : this.A08;
    }

    public final synchronized void A0F() {
        this.A03 = 0;
    }

    public final void A0H(boolean z) {
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0A = true;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        if (z) {
            this.A08 = null;
            this.A09 = true;
        }
    }

    public final synchronized boolean A0I() {
        return this.A03 != this.A02;
    }

    public final synchronized boolean A0K(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        try {
            if (format == null) {
                this.A09 = true;
                return false;
            }
            this.A09 = false;
            if (com.facebook.ads.redexgen.core.IK.A0g(format, this.A08)) {
                return false;
            }
            this.A08 = format;
            return true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
