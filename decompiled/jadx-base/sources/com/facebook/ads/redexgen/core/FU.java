package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FU {
    public static java.lang.String[] A05 = {"ulivTU6ocRt44Fi8kUKccBfI3hgmY7Iu", "IWWAGEYNIxKzg9eOqITKJuHYobxhq8aF", "X0zTjQehaQj8StZrguOVf12daJe7gn3l", "BVuPoTZp9gA5d2vDS0fzf54bf8rPPFO1", "NuJhiRT", "MOipm8XgicKDGsSG3YNTxkuPY6Ba7MyG", "vtzL6kzywxy5KxiMeu5V", "1cqRJ2Z3bK7OTLD9R2J7"};
    public static final com.facebook.ads.redexgen.core.FU A06 = new com.facebook.ads.redexgen.core.FU(new long[0]);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long[] A03;
    public final com.facebook.ads.redexgen.core.FS[] A04;

    public FU(long... jArr) {
        int length = jArr.length;
        this.A00 = length;
        this.A03 = java.util.Arrays.copyOf(jArr, length);
        this.A04 = new com.facebook.ads.redexgen.core.FS[length];
        for (int i = 0; i < length; i++) {
            this.A04[i] = new com.facebook.ads.redexgen.core.FS();
        }
        this.A01 = 0L;
        this.A02 = androidx.media3.common.C.TIME_UNSET;
    }

    public final int A00(long j) {
        int i = 0;
        while (i < index && this.A03[i] != Long.MIN_VALUE && (j >= this.A03[i] || !this.A04[i].A02())) {
            i++;
        }
        long[] jArr = this.A03;
        if (A05[2].charAt(16) == 'm') {
            throw new java.lang.RuntimeException();
        }
        A05[4] = "yfkVKL0";
        int index = jArr.length;
        if (i < index) {
            return i;
        }
        return -1;
    }

    public final int A01(long j) {
        int length = this.A03.length - 1;
        while (length >= 0 && (this.A03[length] == Long.MIN_VALUE || this.A03[length] > j)) {
            length--;
        }
        if (length < 0 || !this.A04[length].A02()) {
            return -1;
        }
        return length;
    }
}
