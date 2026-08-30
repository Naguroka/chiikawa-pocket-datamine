package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0945Pu implements android.view.View.OnClickListener {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"aSVeS7GSTPGzGlwxFERzGOUaCHJkzI2z", "LLGylRAhThVIhIHAbih9tPBDCPjYJ3wk", "dAcv7uC7M3KkKHminzJu7oFLvmyzwOeo", "9GvayoE6VvkK0xgQDuyzQgqlx5rjdrnu", "wDDK", "nNoIeo5hKMcMuIwTTSmTqlLWYr2HGCGs", "Kjjrp4DquliSLC6MHV0dGTx7o2b6nbq3", "WO7dkLjdWbLrsRFVrNnfWInSuw6lOMDM"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.A6 A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[0].charAt(19) != 'z') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[1] = "ZS6NMOZ5iivoiIhrEAHYVVuLQariJbL8";
            strArr[5] = "6wgrAttfPWhTSI4WoHgDbqlH426fwJ7f";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 70);
            i4++;
        }
    }

    public static void A01() {
        byte[] bArr = {-54, -59, -59, -62, -72, -73, -56};
        if (A02[0].charAt(19) != 'z') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[6] = "vsVzmfSe1AoNrvloOTDnivjLsCV7rctR";
        strArr[7] = "zSqcVhdNlZdzdn2RltwvtxLuLIPpuSoH";
        A01 = bArr;
    }

    static {
        A01();
    }

    public ViewOnClickListenerC0945Pu(com.facebook.ads.redexgen.core.A6 a6) {
        this.A00 = a6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0K) {
                this.A00.A0H.A02(A00(0, 7, 16));
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
