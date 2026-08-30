package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class M4 {
    public static byte[] A00;
    public static final java.lang.String A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 102);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{18, 40, 38, 58, 36, 54, 34, 49, 39, 17, 29, 8, 73, 79, 72, 88, 91, 74, 72, 71, 75, 69, 84, 65, 69, 94};
    }

    static {
        A01();
        A01 = com.facebook.ads.redexgen.core.M4.class.getSimpleName();
    }

    public static boolean A02(android.content.Context context) {
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) context.getSystemService(A00(1, 8, 37));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }

    public static boolean A03(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        java.lang.String str = map.get(A00(16, 5, 74));
        java.lang.String str2 = map.get(A00(21, 5, 84));
        java.lang.String keyguardRestrictedInputMode = map.get(A00(9, 3, 28));
        if (str != null) {
            java.lang.String flagDismissKeyguard = A00(0, 1, 69);
            if (str.equals(flagDismissKeyguard) && str2 != null && str2.equals(flagDismissKeyguard) && keyguardRestrictedInputMode != null && keyguardRestrictedInputMode.equals(A00(12, 4, 91))) {
                return true;
            }
        }
        return false;
    }

    public static boolean A04(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String keyguardRestrictedInputMode;
        if (map == null || map.isEmpty()) {
            return false;
        }
        java.lang.String str = map.get(A00(16, 5, 74));
        java.lang.String str2 = map.get(A00(21, 5, 84));
        java.lang.String flagDismissKeyguard = A00(0, 1, 69);
        return (str == null || !str.equals(flagDismissKeyguard)) && (str2 == null || !str2.equals(flagDismissKeyguard)) && (keyguardRestrictedInputMode = map.get(A00(9, 3, 28))) != null && keyguardRestrictedInputMode.equals(A00(12, 4, 91));
    }
}
