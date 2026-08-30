package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0842Lv {
    public static byte[] A0I;
    public static java.lang.String[] A0J = {"rKrHA1ppiEGtpGml0yFHxQc7aUVdIlaK", "Q4SIGH0IwDzvXyGW0zafZen9gbqpyN1f", "xGmPyT38DpqIOoHtA0YJEsvJmmnM9rU2", "YMTGToIzL8UnFUS7pkYkKngwhslhjZnz", "", "FtuyiQzUiuUOiWtDKsyDRDOBtN4yprur", "", "qY4faXAnnIeFUOBxRnakMYaEddWfOrH2"};
    public static final java.lang.String A0K;
    public android.view.View A0F;
    public android.view.View A0G;
    public boolean A0H;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A03 = -1;
    public long A0C = -1;
    public int A09 = -1;
    public long A0E = -1;
    public long A0D = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A07 = -1;
    public int A08 = -1;
    public float A00 = -1.0f;
    public float A02 = -1.0f;
    public float A01 = -1.0f;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 102);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A0I = new byte[]{0, 12, 115, 127, 60, 51, 54, 60, 52, 56, 42, 62, 45, 59, 11, 54, 50, 58, 101, 127, 75, 78, 122, 69, 89, 67, 94, 67, 69, 68, 114, 94, 91, 111, 80, 76, 86, 75, 86, 80, 81, 102, 105, 102, 99, 105, 97, 78, 111, 102, 107, 115, 94, 99, 103, 111, 119, 120, 125, 119, 127, 76, 47, 32, 37, 47, 39, 21, 95, 80, 85, 95, 87, 89, 88, 106, 85, 89, 75, 104, 93, 91, 1, 10, 0, 48, 13, 9, 1, 115, 120, 114, 78, 46, 37, 47, 18, 20, 29, 0, 17, 23, 108, 97, 109, 99, 108, 112, 56, 34, 18, kotlin.io.encoding.Base64.padSymbol, 56, 50, 58, 22, 36, 48, 35, 53, 20, okio.Utf8.REPLACEMENT_BYTE, 48, 51, kotlin.io.encoding.Base64.padSymbol, 52, 53, 107, 113, 84, 71, 66, 79, 83, 85, 126, 118, 101, 96, 109, 113, 119, 93, 14, 25, 31, 19, 14, 24, 21, 18, 27, 92, 21, 17, 12, 14, 25, 15, 15, 21, 19, 18, 70, 92, 99, 100, 113, 98, 100, 68, 121, 125, 117, 115, 116, 97, 114, 116, 88, 36, 35, 54, 37, 35, 14, 15, 17, 28, 12, 16};
    }

    static {
        A02();
        A0K = com.facebook.ads.redexgen.core.C0842Lv.class.getSimpleName();
    }

    private com.facebook.ads.redexgen.core.LU A00() {
        if (this.A0G == null || this.A0F == null) {
            return com.facebook.ads.redexgen.core.LU.A0J;
        }
        android.view.View view = this.A0G;
        java.lang.String[] strArr = A0J;
        if (strArr[6].length() == strArr[4].length()) {
            java.lang.String[] strArr2 = A0J;
            strArr2[6] = "";
            strArr2[4] = "";
            if (view != this.A0F) {
                com.facebook.ads.redexgen.core.LU lu = com.facebook.ads.redexgen.core.LU.A0H;
                java.lang.String[] strArr3 = A0J;
                if (strArr3[7].charAt(18) != strArr3[1].charAt(18)) {
                    throw new java.lang.RuntimeException();
                }
                A0J[0] = "tmBamhoJLli8fG7mmMEXMJcTnxwesBVw";
                return lu;
            }
            if (android.os.Build.VERSION.SDK_INT < 4) {
                return com.facebook.ads.redexgen.core.LU.A0G;
            }
            java.lang.Object tag = this.A0G.getTag(com.facebook.ads.redexgen.core.LU.A02);
            if (tag == null) {
                com.facebook.ads.redexgen.core.LU lu2 = com.facebook.ads.redexgen.core.LU.A0I;
                if (A0J[2].charAt(2) == 'm') {
                    A0J[0] = "fnwPYOgaVMSkQLAdq2SZMccx8Jl2b0fK";
                    return lu2;
                }
            } else {
                if (!(tag instanceof com.facebook.ads.redexgen.core.LU)) {
                    return com.facebook.ads.redexgen.core.LU.A0K;
                }
                return (com.facebook.ads.redexgen.core.LU) tag;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public final long A03() {
        if (A07()) {
            return java.lang.System.currentTimeMillis() - this.A0C;
        }
        return -1L;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A04() {
        long j;
        if (!this.A0H) {
            return null;
        }
        java.lang.String strValueOf = java.lang.String.valueOf((this.A02 * this.A01) / 2.0f);
        if (this.A0C > 0 && this.A0D > this.A0C) {
            j = this.A0D - this.A0C;
        } else {
            j = -1;
        }
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.A04);
        java.lang.String radius = A01(20, 11, 76);
        map.put(radius, strValueOf2);
        java.lang.String strValueOf3 = java.lang.String.valueOf(this.A05);
        java.lang.String radius2 = A01(31, 11, 89);
        map.put(radius2, strValueOf3);
        java.lang.String strValueOf4 = java.lang.String.valueOf(this.A06);
        java.lang.String radius3 = A01(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 5, 30);
        map.put(radius3, strValueOf4);
        java.lang.String strValueOf5 = java.lang.String.valueOf(this.A03);
        java.lang.String radius4 = A01(102, 6, 98);
        map.put(radius4, strValueOf5);
        java.lang.String strA01 = A01(42, 14, 108);
        java.lang.String radius5 = java.lang.String.valueOf(j);
        map.put(strA01, radius5);
        java.lang.String strValueOf6 = java.lang.String.valueOf(this.A0E);
        java.lang.String radius6 = A01(org.objectweb.asm.Opcodes.IF_ACMPEQ, 9, 118);
        map.put(radius6, strValueOf6);
        java.lang.String strValueOf7 = java.lang.String.valueOf(this.A0D);
        java.lang.String radius7 = A01(82, 7, 2);
        map.put(radius7, strValueOf7);
        java.lang.String strValueOf8 = java.lang.String.valueOf(this.A0A);
        java.lang.String radius8 = A01(org.objectweb.asm.Opcodes.FRETURN, 6, 102);
        map.put(radius8, strValueOf8);
        java.lang.String strValueOf9 = java.lang.String.valueOf(this.A0B);
        java.lang.String radius9 = A01(org.objectweb.asm.Opcodes.GETFIELD, 6, 49);
        map.put(radius9, strValueOf9);
        java.lang.String strValueOf10 = java.lang.String.valueOf(this.A07);
        java.lang.String radius10 = A01(56, 6, 114);
        map.put(radius10, strValueOf10);
        java.lang.String strValueOf11 = java.lang.String.valueOf(this.A08);
        java.lang.String radius11 = A01(62, 6, 42);
        map.put(radius11, strValueOf11);
        java.lang.String strValueOf12 = java.lang.String.valueOf(this.A07);
        java.lang.String radius12 = A01(89, 4, 112);
        map.put(radius12, strValueOf12);
        java.lang.String strValueOf13 = java.lang.String.valueOf(this.A08);
        java.lang.String radius13 = A01(93, 4, 45);
        map.put(radius13, strValueOf13);
        java.lang.String strValueOf14 = java.lang.String.valueOf(this.A00);
        java.lang.String radius14 = A01(97, 5, 20);
        map.put(radius14, strValueOf14);
        java.lang.String radius15 = A01(129, 7, 64);
        map.put(radius15, strValueOf);
        java.lang.String radius16 = A01(136, 7, 98);
        map.put(radius16, strValueOf);
        java.lang.String strValueOf15 = java.lang.String.valueOf(A00().A06());
        java.lang.String radius17 = A01(68, 14, 90);
        map.put(radius17, strValueOf15);
        return map;
    }

    public final void A05() {
        this.A0C = java.lang.System.currentTimeMillis();
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
            java.lang.String str = A01(org.objectweb.asm.Opcodes.D2L, 22, 26) + this.A0C;
        }
    }

    public final void A06(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.view.MotionEvent motionEvent, android.view.View view, android.view.View view2) {
        if (view == null) {
            c1199Zs.A0E().AHN();
            return;
        }
        if (!this.A0H) {
            this.A0H = true;
            android.view.InputDevice device = motionEvent.getDevice();
            if (device != null) {
                android.view.InputDevice.MotionRange motionRange = device.getMotionRange(0);
                java.lang.String[] strArr = A0J;
                if (strArr[3].charAt(6) != strArr[5].charAt(6)) {
                    java.lang.String[] strArr2 = A0J;
                    strArr2[3] = "Gaq4uS8iinWfWA9p3yS2tuaxngbM8vTH";
                    strArr2[5] = "hEOHH5DdlsOTPss6NfO6KYKxbvbMxS72";
                    android.view.InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
                    if (motionRange != null && motionRange2 != null) {
                        this.A01 = java.lang.Math.min(motionRange.getRange(), motionRange2.getRange());
                    }
                } else {
                    throw new java.lang.RuntimeException();
                }
            }
            if (this.A01 <= 0.0f) {
                this.A01 = java.lang.Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationInWindow(iArr2);
        switch (motionEvent.getAction()) {
            case 0:
                this.A04 = (int) (iArr[0] / com.facebook.ads.redexgen.core.LP.A02);
                this.A05 = (int) (iArr[1] / com.facebook.ads.redexgen.core.LP.A02);
                this.A06 = (int) (view.getWidth() / com.facebook.ads.redexgen.core.LP.A02);
                this.A03 = (int) (view.getHeight() / com.facebook.ads.redexgen.core.LP.A02);
                this.A09 = 1;
                this.A0E = java.lang.System.currentTimeMillis();
                this.A0A = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / com.facebook.ads.redexgen.core.LP.A02);
                int touchStartYInPx = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                this.A0B = (int) (touchStartYInPx / com.facebook.ads.redexgen.core.LP.A02);
                this.A00 = motionEvent.getPressure();
                this.A02 = motionEvent.getSize();
                this.A0G = view2;
                return;
            case 1:
            case 3:
                this.A0D = java.lang.System.currentTimeMillis();
                this.A07 = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / com.facebook.ads.redexgen.core.LP.A02);
                int touchEndYInPx = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                this.A08 = (int) (touchEndYInPx / com.facebook.ads.redexgen.core.LP.A02);
                this.A0F = view2;
                return;
            case 2:
                this.A00 -= this.A00 / this.A09;
                this.A00 += motionEvent.getPressure() / this.A09;
                this.A02 -= this.A02 / this.A09;
                this.A02 += motionEvent.getSize() / this.A09;
                this.A09++;
                return;
            default:
                return;
        }
    }

    public final boolean A07() {
        return this.A0C != -1;
    }

    public final boolean A08() {
        return this.A0H;
    }

    public final boolean A09(android.content.Context context) {
        boolean z;
        int iA07 = com.facebook.ads.redexgen.core.C0762Im.A07(context);
        long jA03 = A03();
        if (iA07 >= 0 && jA03 < iA07) {
            z = true;
        } else {
            z = false;
        }
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
            java.lang.String str = A01(108, 21, 55) + z + A01(2, 18, 57) + iA07 + A01(0, 2, 74) + jA03;
        }
        return z;
    }
}
