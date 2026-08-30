package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class KE {
    public static byte[] A00;
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.String> A01;
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.String> A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{31, 34, 59, 52, 62, 52, 56, 62, 52, 57, kotlin.io.encoding.Base64.padSymbol, 52, 52, 58, 52, kotlin.io.encoding.Base64.padSymbol, 60, 34, 111, 120, 106, 126, 11, 69, 64, 74, 83, 123, 72, 75, 67, 67, 77, 74, 67, 11, 114, 60, 57, 51, 42, 2, 46, 36, 51, 62, 111, 44, 109, 102, 119, 116, 108, 113, 104, 92, 98, 103, 112, 92, 96, 108, 110, 110, 108, 109, 37, 57, 57, kotlin.io.encoding.Base64.padSymbol, 62, 119, 98, 98, 42, okio.Utf8.REPLACEMENT_BYTE, 44, kotlin.io.encoding.Base64.padSymbol, 37, 104, 62, 99, 43, 44, 46, 40, 47, 34, 34, 38, 99, 46, 34, 32, 81, 77, 77, 73, 74, 3, 22, 22, 78, 78, 78, 28, 74, 23, 95, 88, 90, 92, 91, 86, 86, 82, 23, 90, 86, 84, 14, 14, 14};
    }

    static {
        A09();
        A01 = new java.util.concurrent.atomic.AtomicReference<>();
        A02 = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public static java.lang.String A01(com.facebook.ads.redexgen.core.C7j c7j) {
        return A05(c7j) + A00(47, 19, 53);
    }

    public static java.lang.String A02(com.facebook.ads.redexgen.core.C7j c7j) {
        java.lang.String loggingEndpointPrefix = com.facebook.ads.redexgen.core.C0762Im.A0V(c7j);
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A07(c7j, loggingEndpointPrefix));
        java.lang.String loggingEndpointPrefix2 = A00(22, 14, 18);
        return sbAppend.append(loggingEndpointPrefix2).toString();
    }

    public static java.lang.String A03(com.facebook.ads.redexgen.core.C7j c7j) {
        return A05(c7j) + A00(1, 21, 59);
    }

    public static java.lang.String A04(com.facebook.ads.redexgen.core.C7j c7j) {
        java.lang.String syncEndpointPrefix = com.facebook.ads.redexgen.core.C0762Im.A0W(c7j);
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A07(c7j, syncEndpointPrefix));
        java.lang.String syncEndpointPrefix2 = A00(36, 11, 107);
        return sbAppend.append(syncEndpointPrefix2).toString();
    }

    public static java.lang.String A05(com.facebook.ads.redexgen.core.C7j c7j) {
        java.lang.String str = A01.get();
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.String urlOverride = A00(66, 28, 123);
        return A06(c7j, urlOverride);
    }

    public static java.lang.String A06(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        java.lang.String string;
        java.lang.String strA8d = c7j.A04().A8d();
        java.util.Locale locale = java.util.Locale.US;
        if (android.text.TextUtils.isEmpty(strA8d)) {
            string = A00(0, 0, 61);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String prefix = A00(0, 1, 7);
            string = sb.append(prefix).append(strA8d).toString();
        }
        java.lang.String prefix2 = java.lang.String.format(locale, str, string);
        return prefix2;
    }

    public static java.lang.String A07(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        java.lang.String str2 = A02.get();
        if (!android.text.TextUtils.isEmpty(str2)) {
            return str2;
        }
        java.lang.String urlOverride = A00(94, 26, 15);
        return A08(A06(c7j, urlOverride), str);
    }

    public static java.lang.String A08(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replace(A00(120, 3, 79), str2);
    }
}
