package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0792Ju {
    public static byte[] A00;
    public static final java.text.DateFormat A01;
    public static final java.util.concurrent.atomic.AtomicBoolean A02;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 37);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{112, -66, 119, 107, 112, -66, 97, -81, 104, 92, -105, 97, -81, -103, 92, 97, -81, -41, -38, -28, -19, -11, -38, -37, -40, -21, -35, -11, -30, -27, -35, -35, -37, -24, -98, -98, -112, -61, -61, -112, -55, -55, -124, -87, -87, -87};
    }

    static {
        A03();
        A01 = new java.text.SimpleDateFormat(A01(34, 12, 49), java.util.Locale.US);
        A02 = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public static java.lang.String A00() {
        return A01.format(java.util.Calendar.getInstance().getTime());
    }

    public static void A02() {
        A02.set(true);
    }

    public static void A04(java.lang.String str, java.lang.String str2) {
        if (!A02.get()) {
            return;
        }
        android.util.Log.i(A01(17, 17, 113), java.lang.String.format(java.util.Locale.US, A01(0, 6, 38), A00(), str2));
    }

    public static void A05(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!A02.get()) {
            return;
        }
        android.util.Log.i(A01(17, 17, 113), java.lang.String.format(java.util.Locale.US, A01(6, 11, 23), A00(), str3, str2));
    }
}
