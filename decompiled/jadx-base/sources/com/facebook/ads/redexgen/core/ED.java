package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ED implements java.lang.Runnable {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"9o2RxoXQGzsRG5J758VgWnXZxAzPRq", "slrrPzhosaIRqTN91PQYW8eaCwjzQBbt", "YVDvad", "Ym", "53", "hXaHevQM6mpLzWC0IPGUKBJDuwqdnNoz", "RJB0f5QpOpSi3jWxIV2", "1FVstl0HMzPtGnzHv5PnFy0PCKNLlrql"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.EL A00;
    public final /* synthetic */ com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[] A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 108);
            java.lang.String[] strArr = A03;
            if (strArr[5].charAt(26) == strArr[7].charAt(26)) {
                throw new java.lang.RuntimeException();
            }
            A03[3] = "nw";
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{78, 101, 125, 100, 102, 101, 107, 110, 71, 107, 100, 107, 109, 111, 120, 103, 82, 69, 68, 94, 68, 67, 94, 89, 80, 23, 86, 84, 67, 94, 88, 89, 68, 23, 81, 86, 94, 91, 82, 83, 25};
    }

    static {
        A01();
    }

    public ED(com.facebook.ads.redexgen.core.EL el, com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[] downloadActionArr) {
        this.A00 = el;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.A09.A02(this.A01);
            } catch (java.io.IOException e) {
                android.util.Log.e(A00(0, 15, 102), A00(15, 26, 91), e);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
