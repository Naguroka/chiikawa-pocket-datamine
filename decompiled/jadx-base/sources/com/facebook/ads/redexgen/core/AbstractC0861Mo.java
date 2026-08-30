package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0861Mo {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 42);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-112, -116, -117, -65, -82, -77, -81, -72, -83, -81, -104, -81, -66, -63, -71, -68, -75, -123, -96, -88, -85, 95, -77, -82, 95, -79, -92, -83, -93, -92, -79, 95, -115, -96, -77, -88, -75, -92, 95, -77, -92, -84, -81, -85, -96, -77, -92, 109, 95, -124, -84, -81, -77, -72, 95, -128, -83, -93, -79, -82, -88, -93, 95, -107, -88, -92, -74, 95, -74, -88, -85, -85, 95, -95, -92, 95, -79, -92, -77, -76, -79, -83, -92, -93, 109, -1, -14, 5, -6, 7, -10, -16, 5, -10, -2, 1, -3, -14, 5, -10};
    }

    public static android.view.View A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.Throwable th) {
        A03(c1199Zs, th);
        return new android.view.View(c1199Zs);
    }

    public static void A03(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.Throwable th) {
        c1199Zs.A07().AA0(A01(85, 15, 103), com.facebook.ads.redexgen.core.C8E.A1w, new com.facebook.ads.redexgen.core.C8F(th));
        android.util.Log.e(A01(0, 17, 32), A01(17, 68, 21), th);
    }
}
