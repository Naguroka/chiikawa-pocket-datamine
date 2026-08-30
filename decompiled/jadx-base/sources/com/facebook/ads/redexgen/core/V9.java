package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V9 implements com.facebook.ads.redexgen.core.MS {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"NTFBcVe31dSo2GnU3Js6iiY0zks5LQys", "Ca9zWfFJkFyFOF3Godi91RgYkRzgzr2p", "cII4QPxWTYmVZfubYcNoLj9MPP8GF9tt", "PE9F3dLYBiF4JqqMXSdTSS6miGDS", "DZYdCvYuTuX3W9uqeE5C1IukMMXrX2Kv", "LDE71mkJxI8TxTUVwO2u55MEQLy5qptr", "oLxvrvG8qZvA3h0mNhA70cq5V56", "NZtOBPQowQq2"};
    public final com.facebook.ads.redexgen.core.C5Q A00;
    public final com.facebook.ads.redexgen.core.C1199Zs A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 25);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{46, 41, 51, 56, 53, 49, 56, 38, 55, 55, 56, 40, 53, 46, 34, 41, 51, 38, 51, 46, 40, 41, 56, 44, 34, 62, 78, 73, 79, 66, 92, 89, 66, 84, 89, 66, 86, 88, 68, 69, 73, 75, 8, 64, 71, 69, 67, 68, 73, 73, 77, 8, 71, 66, 85, 8, 79, 72, 82, 67, 84, 72, 71, 74, 8, 79, 86, 69, 8, 103, 83, 66, 79, 67, 72, 69, 67, 104, 67, 82, 81, 73, 84, 77, 99, 94, 86, 73, 84, 82, 67, 66, 103, 69, 82, 79, 80, 79, 82, 95};
    }

    static {
        A01();
    }

    public V9(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C5Q c5q) {
        this.A01 = c1199Zs;
        this.A00 = c5q;
    }

    private final void A02() {
        com.facebook.ads.redexgen.core.InterfaceC04967f interfaceC04967fA0F = this.A01.A0F();
        if (interfaceC04967fA0F != null) {
            com.facebook.ads.Ad adA6E = interfaceC04967fA0F.A6E();
            java.lang.String[] strArr = A03;
            if (strArr[2].charAt(26) == strArr[4].charAt(26)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[5] = "uggbWVrJrahsC4DgFI3QlP54yVqi59lG";
            strArr2[1] = "7cYKYqsJYjxuuUZE8o6LAtyu5uwrvd1J";
            if (adA6E != null && interfaceC04967fA0F.A6I() != null) {
                interfaceC04967fA0F.A6I().onError(adA6E, com.facebook.ads.AdError.AD_PRESENTATION_ERROR);
            }
        }
        this.A00.A05().finish();
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void A9q(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C5Q c5q) {
        android.content.ComponentName component = new android.content.ComponentName(com.facebook.ads.redexgen.core.AbstractC0764Ip.A04(com.facebook.ads.redexgen.core.AbstractC0764Ip.A02.get()), A00(39, 61, 63));
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setComponent(component);
        java.lang.String strA00 = A00(26, 13, 4);
        intent2.putExtra(strA00, intent.getStringExtra(strA00));
        java.lang.String strA01 = A00(0, 26, 126);
        intent2.putExtra(strA01, intent.getIntExtra(strA01, -1));
        try {
            this.A01.A0E().AFU();
            com.facebook.ads.redexgen.core.C0813Kq.A08(c5q.A05(), intent2);
        } catch (com.facebook.ads.redexgen.core.C0811Ko unused) {
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ACz(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ADN(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void AFx(android.os.Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final java.lang.String getCurrentClientToken() {
        return A00(0, 0, 70);
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        this.A01.A0E().AF7();
        if (i2 != -1) {
            this.A01.A0E().AF6(i2);
            A02();
            return false;
        }
        com.facebook.ads.redexgen.core.C5Q c5q = this.A00;
        java.lang.String[] strArr = A03;
        if (strArr[6].length() == strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[6] = "sxsZAXbczpYXyJjlUSCXbm3Rr92";
        strArr2[7] = "fqqSdoB1RgIi";
        c5q.A05().finish();
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void onDestroy() {
    }
}
