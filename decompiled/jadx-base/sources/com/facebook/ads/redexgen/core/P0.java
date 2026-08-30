package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class P0 implements android.view.View.OnTouchListener {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"p7naAKHB4xLvoRE2lSSuhG1PZJd5v7nu", "WvtGE9IzO9nFNtvFFTJqUhWwvt66h6nL", "VCCKY7KSUUOD77sUX9kuHB9VbhmabzsO", "cnwdl7GMxNwVad4p0Oh4XJmd2VWgvA9c", "WrV0BeHEM3l4rmxeVHIasZWQtGmyI4N8", "o1aT8vujxCaaiLUwRZbljoToDOgVH3wd", "xRriwdEy6j865I4a7V8cGrqA6QrsYUim", "9xiHe0uHFaNvIWsoa90uuUt6pGUbqrnm"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.UQ A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A02;
            if (strArr[1].charAt(22) != strArr[4].charAt(22)) {
                break;
            }
            java.lang.String[] strArr2 = A02;
            strArr2[2] = "QNYUYdnqHgiLJjFZUPg17w9dElY9CMJL";
            strArr2[0] = "MmMVh7wO8RKpCmRa2XK3GpXBkp039CBt";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            int i5 = (bArrCopyOfRange[i4] - i3) - 121;
            java.lang.String[] strArr3 = A02;
            if (strArr3[6].charAt(7) == strArr3[5].charAt(7)) {
                break;
            }
            java.lang.String[] strArr4 = A02;
            strArr4[7] = "upZvC29S1gYfpKTic3DC7WgaDELdGVOI";
            strArr4[3] = "622S9DNbpY0TGJih4dXFXUlLvodGjwfO";
            bArrCopyOfRange[i4] = (byte) i5;
            i4++;
        }
        throw new java.lang.RuntimeException();
    }

    public static void A01() {
        A01 = new byte[]{23, 21, 7, 20, 1, 5, 14, 11, 5, 13, 1, 11, 3, 4, 68, 66, 52, 65, 46, 58, 52, 72, okio.Utf8.REPLACEMENT_BYTE, 48, 51, 46, 50, 59, 56, 50, 58, 46, 56, 48, 49};
    }

    static {
        A01();
    }

    public P0(com.facebook.ads.redexgen.core.UQ uq) {
        this.A00 = uq;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (!this.A00.A0S && this.A00.A0B != null && this.A00.A0B.isAcceptingText()) {
                    this.A00.A0S = true;
                    com.facebook.ads.redexgen.core.UQ uq = this.A00;
                    java.lang.String[] strArr = A02;
                    if (strArr[1].charAt(22) != strArr[4].charAt(22)) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A02;
                    strArr2[7] = "y8iXjV8I9QfHTyCtOipg4lT6AE7AaFQc";
                    strArr2[3] = "XU6FCJR6sW2kminM5RICnJzgT3NrL5su";
                    uq.A0f(A00(14, 21, 86));
                }
                break;
            case 1:
                com.facebook.ads.redexgen.core.UQ.A05(this.A00);
                if (!this.A00.A0R && this.A00.A08 >= 5) {
                    this.A00.A0R = true;
                    this.A00.A0f(A00(0, 14, 41));
                }
                break;
        }
        java.lang.String[] strArr3 = A02;
        if (strArr3[6].charAt(7) != strArr3[5].charAt(7)) {
            java.lang.String[] strArr4 = A02;
            strArr4[6] = "ebvcteC2Y0dTtDk82YoZqGoSTVtPrEa5";
            strArr4[5] = "fbe5xbn5zq5FbTQSbq0ElFkb30D7M3tE";
            return false;
        }
        throw new java.lang.RuntimeException();
    }
}
