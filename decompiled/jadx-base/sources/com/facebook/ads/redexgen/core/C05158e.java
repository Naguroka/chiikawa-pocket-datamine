package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05158e {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"45sljFocWSeUIm", "kFy0iLqCQu1rSjegRu3gZQBslrN28zfh", "Jt25Esr0vPr63IR3ofREXbE2F9XS", "aIy3uOWBpnLKLBqKI1xznCdUmB4uZWmr", "OU2R0KFOTNKkc0fC1q8eYWzKYBY", "OKiYeSmWG", "N6c8h1LLghxAImqWtVZLONNsuls", "y1x9YRSrIuYSzULWME6mF7szl8n2nmJ"};
    public static final java.lang.String A02;
    public static final java.util.concurrent.atomic.AtomicBoolean A03;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{108, 0, 55, 43, 46, 38, 1, 45, 44, 36, 43, 37, 105, 70, 76, 90, 71, 65, 76, 8, 123, 108, 99, 8, 74, 93, 65, 68, 92, 8, 78, 71, 90, 8, 80, 16, 30, 17, 6, 26, 31, 23, 12, 7, 10, 3, 22, 25, 53, 47, 54, 62, 122, 52, 53, 46, 122, 59, 62, 62, 122, 42, 59, 40, 59, 55, okio.Utf8.REPLACEMENT_BYTE, 46, okio.Utf8.REPLACEMENT_BYTE, 40, 96, 21, 20, 19, 4, 22, 99, 75, 83, 74, 71, 82, 73, 84, 20, 54, kotlin.io.encoding.Base64.padSymbol, 42, 62, 60, 39, 58, 60, kotlin.io.encoding.Base64.padSymbol, 69, 36, 74, 51, 34, 57, 13, 33, 59, 40, 55, 100, 117, 117, 90, 118, 113, 100, 119, 113, 96, 97, 90, 119, 96, 100, 118, 106, 107, 79, 88, 68, 65, 73, 114, 89, 84, 93, 72, kotlin.io.encoding.Base64.padSymbol, 60, 59, 44, 62, 6, 47, 56, 53, 44, 60, 15, 13, 6, 13, 26, 1, 11, 115, 123, 123, 115, 120, 113, 75, 103, 112, 127, 99, 121, 85, 110, 111, 104, 127, 109, 109, 107, 104, 102, 111, 12, 22, 58, 0, 8, 16, 87, 74, 78, 70, 89, 76, 77, 70, 124, 76, 69, 69, 80, 70, 87, 95, 68, 65, 68, 69, 93, 68};
    }

    static {
        A06();
        A02 = com.facebook.ads.redexgen.core.C05158e.class.getSimpleName();
        A03 = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public static int A00() {
        return java.util.TimeZone.getDefault().getRawOffset();
    }

    public static long A01(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        try {
            android.content.pm.PackageManager packageManager = c7j.getPackageManager();
            if (packageManager == null) {
                return -1L;
            }
            return new java.io.File(packageManager.getApplicationInfo(str, 0).publicSourceDir).length();
        } catch (java.lang.Exception e) {
            java.lang.String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[1] = "r1yKAsFrz8T6kTbDeRMAIryo3adSH8UC";
            strArr2[3] = "KmyFzAC6ois190XCewwcScJ1n5axjY80";
            if (A03.compareAndSet(false, true)) {
                c7j.A07().AA0(A02(org.objectweb.asm.Opcodes.D2F, 7, 94), com.facebook.ads.redexgen.core.C8E.A1E, new com.facebook.ads.redexgen.core.C8F(e));
            }
            return -1L;
        }
    }

    public static java.lang.String A03(android.content.Context context) {
        try {
            java.lang.reflect.Field buildType = java.lang.Class.forName(context.getPackageName() + A02(0, 12, 116)).getDeclaredField(A02(37, 10, 101));
            return (java.lang.String) buildType.get(null);
        } catch (java.lang.Exception unused) {
            return A02(94, 3, 61);
        }
    }

    public static java.lang.String A04(android.content.Context context) {
        try {
            java.lang.reflect.Field buildType = java.lang.Class.forName(context.getPackageName() + A02(0, 12, 116)).getDeclaredField(A02(71, 5, 103));
            return java.lang.String.valueOf(buildType.getBoolean(null));
        } catch (java.lang.Exception unused) {
            return A02(94, 3, 61);
        }
    }

    public static java.lang.String A05(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        A07(c7j, jSONObject, A02(org.objectweb.asm.Opcodes.FRETURN, 6, 83), java.lang.String.valueOf(A08()));
        A07(c7j, jSONObject, A02(97, 8, 100), java.lang.String.valueOf(A01(c7j, str)));
        A07(c7j, jSONObject, A02(org.objectweb.asm.Opcodes.GETFIELD, 15, 21), java.lang.String.valueOf(A00()));
        A07(c7j, jSONObject, A02(105, 18, 51), java.lang.String.valueOf(com.facebook.ads.redexgen.core.AbstractC0808Kl.A01(c7j)));
        A07(c7j, jSONObject, A02(org.objectweb.asm.Opcodes.IF_ICMPLT, 13, 60), java.lang.String.valueOf(A09(c7j)));
        A07(c7j, jSONObject, A02(org.objectweb.asm.Opcodes.I2L, 11, 111), A04(c7j));
        A07(c7j, jSONObject, A02(123, 10, 27), A03(c7j));
        return jSONObject.toString();
    }

    public static void A07(com.facebook.ads.redexgen.core.C7j c7j, org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (org.json.JSONException e) {
            if (c7j.A04().A9O()) {
                android.util.Log.e(A02, A02(47, 24, 108), e);
            }
        }
    }

    public static boolean A08() {
        java.lang.String str = android.os.Build.FINGERPRINT;
        java.lang.String strA02 = A02(org.objectweb.asm.Opcodes.D2F, 7, 94);
        if (!str.contains(strA02) && !android.os.Build.FINGERPRINT.startsWith(A02(org.objectweb.asm.Opcodes.MONITOREXIT, 7, 28))) {
            java.lang.String str2 = android.os.Build.MODEL;
            java.lang.String strA03 = A02(org.objectweb.asm.Opcodes.DCMPL, 10, 34);
            if (!str2.contains(strA03) && !android.os.Build.MODEL.contains(A02(76, 8, 16))) {
                java.lang.String str3 = android.os.Build.MODEL;
                java.lang.String[] strArr = A01;
                if (strArr[6].length() != strArr[4].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A01;
                strArr2[6] = "CTJ6oNGQrsuCzXfrpGcSjdlcrxq";
                strArr2[4] = "Vk4ircYNHpPTfJ73X6WLPy0mTCx";
                if (!str3.contains(A02(12, 25, 30)) && !android.os.Build.MANUFACTURER.contains(A02(84, 10, 101)) && ((!android.os.Build.BRAND.startsWith(strA02) || !android.os.Build.DEVICE.startsWith(strA02)) && !strA03.equals(android.os.Build.PRODUCT))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean A09(android.content.Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
