package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JV implements com.facebook.ads.internal.api.NativeAdRatingApi {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"hUjcMotf6J7QgolLzfJFqEdJCj8", "g61DfN6A", "xfoiRdjW7FqaK", "7BIjRnWTmZFI6", "QawwIwJGbW4wV95frp", "JAocLFgZR1eZV5wbskPWRgC49zmLSQ48", "dTzZFi0gHRoFN0fz4IZK", "PRpOn4dc8EeXJ60LxB5o"};
    public final double A00;
    public final double A01;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {20, 4, 2, 13, 6, -68, -89, -78, -69, -85};
        if (A03[0].length() == 23) {
            throw new java.lang.RuntimeException();
        }
        A03[2] = "JTw9XW";
        A02 = bArr;
    }

    static {
        A02();
    }

    public JV(double d, double d2) {
        this.A01 = d;
        this.A00 = d2;
    }

    public static com.facebook.ads.redexgen.core.JV A00(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        double dOptDouble = jSONObject.optDouble(A01(5, 5, 17), 0.0d);
        double dOptDouble2 = jSONObject.optDouble(A01(0, 5, 108), 0.0d);
        if (dOptDouble == 0.0d || dOptDouble2 == 0.0d) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.JV(dOptDouble, dOptDouble2);
    }

    @Override // com.facebook.ads.internal.api.NativeAdRatingApi
    public final double getScale() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.NativeAdRatingApi
    public final double getValue() {
        return this.A01;
    }
}
