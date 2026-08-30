package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class LI implements java.lang.Runnable {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"rpDB7rKXNsFsWkDz6IFMGYiQm5SIurhV", "Zw7gqQaUB6b8OXSgkCM5acQChbi0fPQB", "ij96xAlSFdb9T8", "9lv2KZaF3yGNFfkp5oM5AxENUzlVWnoh", "BtiLNkHShKV4ox8o5K74B7kMcT6dIDQ3", "4qYR1HKsivt0y2MxZdwkaRz4cXsJEuH0", "44IOIp9GJ1CB282l", "5xjMlDyVDQDeuAskdNZft2cHBWd2iktp"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1T A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.LL A01;
    public final /* synthetic */ java.lang.String A02;
    public final /* synthetic */ java.lang.String A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 29);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{56, 62, 40, okio.Utf8.REPLACEMENT_BYTE, 46, 33, 36, 46, 38};
    }

    static {
        A01();
    }

    public LI(com.facebook.ads.redexgen.core.LL ll, java.lang.String str, com.facebook.ads.redexgen.core.C1T c1t, java.lang.String str2) {
        this.A01 = ll;
        this.A03 = str;
        this.A00 = c1t;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (!this.A01.A00) {
                return;
            }
            boolean z = false;
            this.A01.A00 = false;
            android.app.Activity activityA0D = this.A01.A03.A0D();
            boolean z2 = false;
            int i = android.os.Build.VERSION.SDK_INT;
            java.lang.String[] strArr = A05;
            if (strArr[1].charAt(30) != strArr[4].charAt(30)) {
                throw new java.lang.RuntimeException();
            }
            A05[2] = "zngGPNErwRp983";
            if (i >= 24) {
                if (activityA0D != null && activityA0D.isInMultiWindowMode()) {
                    z = true;
                }
                z2 = z;
            }
            if (!z2 && com.facebook.ads.redexgen.core.C0817Kw.A00().A03()) {
                return;
            }
            this.A01.A05(this.A03 != null ? this.A03 : A00(0, 9, 80), this.A00, this.A02);
        } catch (java.lang.Throwable th) {
            if (A05[2].length() != 14) {
                com.facebook.ads.redexgen.core.KQ.A00(th, this);
            } else {
                A05[2] = "Mnh0XYPOQy81qp";
                com.facebook.ads.redexgen.core.KQ.A00(th, this);
            }
        }
    }
}
