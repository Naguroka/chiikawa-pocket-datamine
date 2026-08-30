package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0946Pv implements android.view.View.OnTouchListener {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"1JwnbZc", "kkmIQJqvWiBwk9jfILYgPIrgQCS38owh", "N8yLaPVokkuJ1YkIyuCF7aIX6VfLiVBd", "jm5vdlZ72Lbf6a1gReW0ha76qwb04vv", "DCC4I5JAGBbf78VQRaqWv8G", "3hSFZU1sfTZMtq4oO1UMPPTcQg0VdY6I", "fV1nhS4pYMKgLfTP54XPcsPXLQx3eWXA", "qgSXXDY"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.A6 A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 29);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 14, 0, 13, -6, -2, 7, 4, -2, 6, -6, 4, -4, -3, -12, -14, -28, -15, -34, -22, -28, -8, -17, -32, -29, -34, -30, -21, -24, -30, -22, -34, -24, -32, -31};
    }

    static {
        A01();
    }

    public ViewOnTouchListenerC0946Pv(com.facebook.ads.redexgen.core.A6 a6) {
        this.A00 = a6;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (this.A00.A0O || this.A00.A09 == null) {
                    return false;
                }
                com.facebook.ads.redexgen.core.A6 a6 = this.A00;
                if (A02[6].charAt(16) == 'R') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A02;
                strArr[0] = "d6v6uEk";
                strArr[7] = "mdHpVNv";
                if (a6.A09.isAcceptingText()) {
                    this.A00.A0O = true;
                    this.A00.A0g(A00(14, 21, 98));
                    return false;
                }
                return false;
            case 1:
                com.facebook.ads.redexgen.core.A6.A07(this.A00);
                boolean z = this.A00.A0N;
                if (A02[2].charAt(15) != 'o') {
                    java.lang.String[] strArr2 = A02;
                    strArr2[0] = "JX78O96";
                    strArr2[7] = "bIdbL9K";
                    if (!z && this.A00.A07 >= 5) {
                        this.A00.A0N = true;
                        this.A00.A0g(A00(0, 14, 126));
                        return false;
                    }
                    return false;
                }
                throw new java.lang.RuntimeException();
            default:
                return false;
        }
    }
}
