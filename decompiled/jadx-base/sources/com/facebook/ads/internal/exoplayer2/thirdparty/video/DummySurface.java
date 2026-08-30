package com.facebook.ads.internal.exoplayer2.thirdparty.video;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DummySurface extends android.view.Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public static java.lang.String[] A06 = {"BIp7vzupCQc69wolM1qrlBnEL5MetbDW", "24tJ79UOmEXBcyykx", "xCvv5gABaBgUMcrcs4LVlgCS7", "iwWXLugCxXUhH2", "11hzhE0Xkbsnly22MyoIB7rR66v", "gCs3LWFTmjjaP32jtswNknURctpSvZ", "4q1ECNbz", "paI3IYAtvVDbkAKPOxbipTd"};
    public boolean A00;
    public final boolean A01;
    public final com.facebook.ads.redexgen.core.IQ A02;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 114);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{83, 81, 90, 73, 83, 78, 66, 73, 102, 100, 121, 98, 115, 117, 98, 115, 114, 73, 117, 121, 120, 98, 115, 120, 98, 101, 103, 108, 127, 107, 104, 114, 127, 83, 85, 82, 70, 65, 67, 69, 76, 69, 83, 83, 127, 67, 79, 78, 84, 69, 88, 84, 69, 126, 99, 101, 96, 96, 127, 98, 100, 117, 116, 48, 96, 98, 121, 127, 98, 48, 100, 127, 48, 81, 64, 89, 48, 124, 117, 102, 117, 124, 48, 33, 39, 66, 78, 43, 44, 47, 42, 86, 89, 83, 69, 88, 94, 83, 25, 95, 86, 69, 83, 64, 86, 69, 82, 25, 65, 69, 25, 95, 94, 80, 95, 104, 71, 82, 69, 81, 88, 69, 90, 86, 89, 84, 82, 124, 110, 98, 124, 122, 97, 104};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized boolean A05(android.content.Context context) {
        boolean z;
        z = true;
        if (!A04) {
            A03 = com.facebook.ads.redexgen.core.IK.A02 < 24 ? 0 : A00(context);
            A04 = true;
        }
        if (A03 == 0) {
            z = false;
        }
        return z;
    }

    static {
        A04();
    }

    public DummySurface(com.facebook.ads.redexgen.core.IQ iq, android.graphics.SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.A02 = iq;
        this.A01 = z;
    }

    public static int A00(android.content.Context context) {
        java.lang.String strEglQueryString;
        if (com.facebook.ads.redexgen.core.IK.A02 < 26) {
            java.lang.String strA02 = A02(127, 7, 125);
            java.lang.String[] strArr = A06;
            if (strArr[6].length() == strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A06;
            strArr2[6] = "9NBzrv4O";
            strArr2[2] = "dOh1vNCRJLmwoUK8kN24J42WE";
            if (strA02.equals(com.facebook.ads.redexgen.core.IK.A05) || A02(85, 6, 104).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                return 0;
            }
        }
        if ((com.facebook.ads.redexgen.core.IK.A02 < 26 && !context.getPackageManager().hasSystemFeature(A02(91, 36, 69))) || (strEglQueryString = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373)) == null || !strEglQueryString.contains(A02(0, 25, 100))) {
            return 0;
        }
        java.lang.String strA03 = A02(25, 27, 82);
        java.lang.String[] strArr3 = A06;
        if (strArr3[6].length() == strArr3[2].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr4 = A06;
        strArr4[4] = "MMzWoZaG5rKncs6KGkf7KtQ7FMr";
        strArr4[5] = "AmTtu2xzwZpmljoFnnZCY6SmnReBn7";
        if (strEglQueryString.contains(strA03)) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002a  */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface A01(android.content.Context context, boolean z) {
        boolean z2;
        A03();
        if (z) {
            boolean zA05 = A05(context);
            java.lang.String[] strArr = A06;
            if (strArr[6].length() == strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A06;
            strArr2[4] = "duZpseMwc0gGjqrDW9WsXWuTAvu";
            strArr2[5] = "L8PQQ0Rvj3M4DBbwizvKN4JEZ06Jax";
            if (zA05) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(z2);
        return new com.facebook.ads.redexgen.core.IQ().A04(z ? A03 : 0);
    }

    public static void A03() {
        if (com.facebook.ads.redexgen.core.IK.A02 >= 17) {
        } else {
            throw new java.lang.UnsupportedOperationException(A02(52, 33, 98));
        }
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
