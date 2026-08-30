package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C2M {
    public static java.lang.String A00;
    public static java.lang.String A01;
    public static byte[] A02;
    public static java.lang.String[] A03 = {"Q2DZPMAW2yeQLbmmbfWH", "FQ0yrAaGYgr4mdqTvnLCAfi7gpajL", "1hQSRsoeRQ52OVueqemqWssHdomhD1Oc", "dcU3JA", "DGXXVImbyRvx6", "DMg70IVEwE3Kkzjo7dV3", "", "yfZMPiXEj5vSY"};
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.internal.adnotification.InternalAppAdCTAClickNotificationListener> A04;
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.C2O> A05;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 81);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{6, 11, 17, 18, 14, 3, 27, kotlin.io.encoding.Base64.padSymbol, 4, 13, 16, 15, 3, 22, 40, 41, 6, 55, 55, 6, 35, 4, 19, 6, 4, 43, 46, 36, 44, 69, 68, 99, 71, 90, 88, 79, 89, 89, 67, 69, 68, 8, 31, 16, 36, 13, 30, 9, 8, 18, 20, 21};
    }

    static {
        A01();
        A01 = A00(41, 11, 42);
        A00 = A00(0, 14, 51);
        A05 = new java.util.concurrent.atomic.AtomicReference<>();
        A04 = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public static void A02(final java.lang.String str, android.os.Bundle bundle) {
        final java.util.ArrayList arrayList;
        A05.get();
        if (0 != 0) {
            bundle.getString(A01);
            bundle.getString(A00);
            throw new java.lang.NullPointerException(A00(29, 12, 123));
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.util.List<com.facebook.ads.AdSDKNotificationListener> listeners = com.facebook.ads.AdSDKNotificationManager.getNotificationListeners();
        synchronized (listeners) {
            arrayList = new java.util.ArrayList(com.facebook.ads.AdSDKNotificationManager.getNotificationListeners());
        }
        com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.2L
            public static byte[] A02;

            static {
                A01();
            }

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 42);
                }
                return new java.lang.String(bArrCopyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{112, 123, 118, 103, 108, 101, 97, 112, 113, 74, 118, 101, 120, 57, kotlin.io.encoding.Base64.padSymbol, 32, 34, 53, 35, 35, 57, okio.Utf8.REPLACEMENT_BYTE, 62};
            }

            @Override // java.lang.Runnable
            public final void run() throws java.lang.Throwable {
                if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                    return;
                }
                try {
                    for (com.facebook.ads.AdSDKNotificationListener adSDKNotificationListener : arrayList) {
                        android.os.Bundle data = new android.os.Bundle();
                        data.putString(A00(0, 13, 63), str);
                        adSDKNotificationListener.onAdEvent(A00(13, 10, 122), data);
                    }
                } catch (java.lang.Throwable th) {
                    com.facebook.ads.redexgen.core.KQ.A00(th, this);
                }
            }
        });
    }

    public static void A03(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (A04 != null) {
            com.facebook.ads.internal.adnotification.InternalAppAdCTAClickNotificationListener internalAppAdCTAClickNotificationListener = A04.get();
            java.lang.String[] strArr = A03;
            if (strArr[3].length() == strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[5] = "6F2nH21UZcfDLDfNhpfU";
            strArr2[4] = "szNZ34FR6m0ld";
            if (internalAppAdCTAClickNotificationListener != null) {
                A04.get();
                throw new java.lang.NullPointerException(A00(14, 15, 22));
            }
        }
    }
}
