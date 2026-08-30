package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0806Kj {
    public static byte[] A05;
    public static final java.lang.Object A06;
    public static final java.util.Map<java.lang.String, java.lang.String> A07;
    public static final java.util.concurrent.atomic.AtomicBoolean A08;
    public final android.content.SharedPreferences A00;
    public final com.facebook.ads.redexgen.core.C7j A01;
    public final com.facebook.ads.redexgen.core.C8O A02;
    public final java.lang.String A03;
    public final java.lang.String A04;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 79);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-100, -19, -14, -4, -25, -89, -45, -35, -32, -45, -29, 35, 47, 45, -18, 33, 46, 36, 50, 47, 41, 36, -18, 54, 37, 46, 36, 41, 46, 39, -21, -5, -23, -8, -15, 10, 26, 19, 14, 10, -18, -20, -11, -20, -7, -16, -22};
    }

    static {
        A04();
        A07 = new java.util.HashMap();
        A06 = new java.lang.Object();
        A08 = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public C0806Kj(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        this.A01 = c7j;
        this.A03 = str;
        this.A02 = new com.facebook.ads.redexgen.core.C8O(this.A01, str);
        this.A00 = com.facebook.ads.redexgen.core.KJ.A00(this.A01);
        this.A04 = A01(1, 4, 93) + str + A01(0, 1, 18) + this.A02.A06();
    }

    private final java.lang.String A00() {
        return this.A00.getString(this.A04, null);
    }

    public static java.lang.String A02(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        try {
            android.content.pm.PackageManager packageManager = c7j.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return com.facebook.ads.redexgen.core.LS.A03(packageManager.getApplicationInfo(str, 0).sourceDir);
        } catch (java.lang.Exception e) {
            if (A08.compareAndSet(false, true)) {
                c7j.A07().AA0(A01(40, 7, 56), com.facebook.ads.redexgen.core.C8E.A1P, new com.facebook.ads.redexgen.core.C8F(e));
            }
            return null;
        }
    }

    public static java.lang.String A03(java.lang.String str) {
        java.lang.String str2;
        synchronized (A06) {
            str2 = A07.get(str);
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:6:0x0016  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final void A05() throws org.json.JSONException {
        java.lang.String strA01;
        java.lang.String checksumApiFingerprint;
        java.lang.String strA02 = null;
        if (android.os.Build.VERSION.SDK_INT < 31) {
            java.lang.String strA03 = A01(5, 1, 5);
            java.lang.String checksumApiFingerprint2 = android.os.Build.VERSION.CODENAME;
            if (strA03.equals(checksumApiFingerprint2)) {
                if (com.facebook.ads.redexgen.core.C0762Im.A2b(this.A01)) {
                    strA01 = A01(11, 19, 113);
                    checksumApiFingerprint = this.A02.A0B();
                    if (strA01.equals(checksumApiFingerprint)) {
                        com.facebook.ads.redexgen.core.C7j c7j = this.A01;
                        java.lang.String checksumApiFingerprint3 = this.A03;
                        strA02 = com.facebook.ads.redexgen.core.LS.A01(c7j, checksumApiFingerprint3);
                    }
                }
            }
        } else if (com.facebook.ads.redexgen.core.C0762Im.A2b(this.A01)) {
            strA01 = A01(11, 19, 113);
            checksumApiFingerprint = this.A02.A0B();
            if (strA01.equals(checksumApiFingerprint)) {
                com.facebook.ads.redexgen.core.C7j c7j2 = this.A01;
                java.lang.String checksumApiFingerprint4 = this.A03;
                strA02 = com.facebook.ads.redexgen.core.LS.A01(c7j2, checksumApiFingerprint4);
            }
        }
        if (strA02 == null) {
            com.facebook.ads.redexgen.core.C7j c7j3 = this.A01;
            java.lang.String checksumApiFingerprint5 = this.A03;
            strA02 = A02(c7j3, checksumApiFingerprint5);
        } else if (com.facebook.ads.redexgen.core.C0762Im.A1a(this.A01)) {
            com.facebook.ads.redexgen.core.C7j c7j4 = this.A01;
            java.lang.String checksumApiFingerprint6 = this.A03;
            java.lang.String strA04 = A02(c7j4, checksumApiFingerprint6);
            java.lang.String checksumApiFingerprint7 = A01(6, 5, 33);
            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(checksumApiFingerprint7);
            c8f.A05(1);
            c8f.A06(1);
            c8f.A0A(false);
            org.json.JSONObject checksumsJson = new org.json.JSONObject();
            java.lang.String checksumApiFingerprint8 = A01(30, 5, 57);
            checksumsJson.put(checksumApiFingerprint8, strA02);
            java.lang.String checksumApiFingerprint9 = A01(35, 5, 88);
            checksumsJson.put(checksumApiFingerprint9, strA04);
            c8f.A07(checksumsJson);
            com.facebook.ads.redexgen.core.C8D c8dA07 = this.A01.A07();
            java.lang.String legacyMd5 = A01(40, 7, 56);
            c8dA07.AA1(legacyMd5, com.facebook.ads.redexgen.core.C8E.A1I, c8f);
        }
        synchronized (A06) {
            java.util.Map<java.lang.String, java.lang.String> map = A07;
            java.lang.String checksumApiFingerprint10 = this.A03;
            map.put(checksumApiFingerprint10, strA02);
        }
        android.content.SharedPreferences.Editor editorEdit = this.A00.edit();
        java.lang.String checksumApiFingerprint11 = this.A04;
        editorEdit.putString(checksumApiFingerprint11, strA02).apply();
    }

    public final void A06() {
        java.lang.String strA00 = A00();
        synchronized (A06) {
            java.util.Map<java.lang.String, java.lang.String> map = A07;
            java.lang.String storedFingerprint = this.A03;
            map.put(storedFingerprint, strA00);
        }
    }
}
