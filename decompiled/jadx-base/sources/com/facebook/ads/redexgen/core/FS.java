package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FS {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final android.net.Uri[] A03;

    public FS() {
        this(-1, new int[0], new android.net.Uri[0], new long[0]);
    }

    public FS(int i, int[] iArr, android.net.Uri[] uriArr, long[] jArr) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(iArr.length == uriArr.length);
        this.A00 = i;
        this.A01 = iArr;
        this.A03 = uriArr;
        this.A02 = jArr;
    }

    public final int A00() {
        return A01(-1);
    }

    public final int A01(int i) {
        int i2 = i + 1;
        while (i2 < nextAdIndexToPlay) {
            int nextAdIndexToPlay = this.A01[i2];
            if (nextAdIndexToPlay == 0 || this.A01[i2] == 1) {
                break;
            }
            i2++;
        }
        return i2;
    }

    public final boolean A02() {
        return this.A00 == -1 || A00() < this.A00;
    }
}
