package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05228l {
    public static java.lang.String A00;
    public static com.facebook.ads.redexgen.core.LM A01;
    public static byte[] A02;
    public static java.lang.String[] A03 = {"voSC7", "XZAhka0CvCOYv4I2O5x3YaAw3CbuYBFN", "p9gqIJ2nr", "98tXqko6jTMLdbqfVFP5nvRcnbiOcAti", "T2H4NPeAA8j3XC4jkS0zz8rIAu9TBODq", "PgqQ", "DWYdqAxgZwpx5TFll0r56voildH8EXHj", "oGCSEutn0BLuvxJJ07JBH6t"};
    public static final java.util.Map<java.lang.String, java.lang.Integer> A04;
    public static final java.util.concurrent.atomic.AtomicInteger A05;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A03;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new java.lang.RuntimeException();
            }
            A03[1] = "U3LMWoXZ5NcjJWeamIlVlKUbevsxyVyN";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
            i4++;
        }
    }

    public static void A05() {
        A02 = new byte[]{115, 6, 1, 23};
    }

    static {
        A05();
        A00 = null;
        A05 = new java.util.concurrent.atomic.AtomicInteger(0);
        A04 = new java.util.HashMap();
    }

    public static synchronized com.facebook.ads.redexgen.core.LM A00(com.facebook.ads.redexgen.core.C7j c7j) {
        if (A01 == null) {
            A01 = com.facebook.ads.redexgen.core.LN.A00(c7j);
        }
        return A01;
    }

    public static java.lang.Integer A01(java.lang.String str) {
        synchronized (A04) {
            java.lang.Integer num = A04.get(str);
            if (num == null) {
                return 0;
            }
            return num;
        }
    }

    public static void A06(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> params) {
        java.lang.String strA03;
        if (A0A(c7j)) {
            strA03 = com.facebook.ads.redexgen.core.C0806Kj.A03(str);
        } else {
            strA03 = A00;
        }
        if (strA03 != null) {
            java.lang.String fingerprint = A02(1, 3, 28);
            params.put(fingerprint, strA03);
        }
    }

    public static void A07(final com.facebook.ads.redexgen.core.C7j c7j, boolean z) {
        if (!A05.compareAndSet(0, 1)) {
            return;
        }
        A00(c7j);
        try {
            final android.content.SharedPreferences sharedPreferencesA00 = com.facebook.ads.redexgen.core.KJ.A00(c7j);
            final com.facebook.ads.redexgen.core.C8O c8o = new com.facebook.ads.redexgen.core.C8O(c7j);
            final java.lang.String str = android.os.Build.FINGERPRINT + A02(0, 1, 19) + c8o.A06();
            A00 = sharedPreferencesA00.getString(str, null);
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<java.lang.Boolean>() { // from class: com.facebook.ads.redexgen.X.8k
                public static byte[] A04;
                public static java.lang.String[] A05 = {"dMyKB8n8mY8sFmfmCsf5VwvZBLoVpPiR", "TBvdqjLuIRaxglwGY5TjNnUOxCNoUnNv", "FK0GmuaP9q8EyodOlfs4PJ6Rrg0VVoxV", "1UM", "Fv6ZlsmxNYwaZ6XY1w8nvtw6Sd1Ai0k0", "lERcqI9wEyu6Ta8yIDBCfbsl7aq4DQ3Q", "fq", "Qdyh6wSbko6o8Mj4qT2RTqVvwzMlz"};

                public static java.lang.String A01(int i, int i2, int i3) {
                    byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
                    for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 46);
                    }
                    return new java.lang.String(bArrCopyOfRange);
                }

                public static void A02() {
                    A04 = new byte[]{37, 105, 103, 122, 105, 121, kotlin.io.encoding.Base64.padSymbol, 49, 51, 112, okio.Utf8.REPLACEMENT_BYTE, 48, 58, 44, 49, 55, 58, 112, 40, 59, 48, 58, 55, 48, 57, 48, 32, 50, 35, 58, 62, 46, 49, 58, 62, 99, 97, 106, 97, 118, 109, 103};
                }

                static {
                    A02();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:10:0x0034  */
                /* JADX WARN: Code duplicated, block: B:6:0x0017  */
                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean call() throws java.lang.Exception {
                    java.lang.String strA0B;
                    java.lang.String checksumApiFingerprint;
                    java.lang.String strA01 = null;
                    if (android.os.Build.VERSION.SDK_INT < 31) {
                        java.lang.String strA02 = A01(0, 1, 88);
                        java.lang.String checksumApiFingerprint2 = android.os.Build.VERSION.CODENAME;
                        if (strA02.equals(checksumApiFingerprint2)) {
                            if (com.facebook.ads.redexgen.core.C0762Im.A2b(c7j)) {
                                strA0B = c8o.A0B();
                                checksumApiFingerprint = A01(6, 19, 112);
                                if (checksumApiFingerprint.equals(strA0B)) {
                                    com.facebook.ads.redexgen.core.C7j c7j2 = c7j;
                                    java.lang.String checksumApiFingerprint3 = c7j.getPackageName();
                                    strA01 = com.facebook.ads.redexgen.core.LS.A01(c7j2, checksumApiFingerprint3);
                                }
                            }
                        }
                    } else if (com.facebook.ads.redexgen.core.C0762Im.A2b(c7j)) {
                        strA0B = c8o.A0B();
                        checksumApiFingerprint = A01(6, 19, 112);
                        if (checksumApiFingerprint.equals(strA0B)) {
                            com.facebook.ads.redexgen.core.C7j c7j3 = c7j;
                            java.lang.String checksumApiFingerprint4 = c7j.getPackageName();
                            strA01 = com.facebook.ads.redexgen.core.LS.A01(c7j3, checksumApiFingerprint4);
                        }
                    }
                    if (strA01 == null) {
                        com.facebook.ads.redexgen.core.C7j c7j4 = c7j;
                        java.lang.String checksumApiFingerprint5 = c7j.getPackageName();
                        com.facebook.ads.redexgen.core.C05228l.A00 = com.facebook.ads.redexgen.core.C0806Kj.A02(c7j4, checksumApiFingerprint5);
                    } else {
                        boolean zA1a = com.facebook.ads.redexgen.core.C0762Im.A1a(c7j);
                        java.lang.String[] strArr = A05;
                        java.lang.String str2 = strArr[7];
                        java.lang.String checksumApiFingerprint6 = strArr[0];
                        if (str2.length() == checksumApiFingerprint6.length()) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A05;
                        strArr2[1] = "kDvoq9mMnaUwO0DWwqxaQOFrfqCdc2U4";
                        strArr2[5] = "nyTkqSQWVKKnLYnFLp1tRd7YKhoP35dr";
                        if (zA1a) {
                            com.facebook.ads.redexgen.core.C7j c7j5 = c7j;
                            java.lang.String checksumApiFingerprint7 = c7j.getPackageName();
                            java.lang.String strA03 = com.facebook.ads.redexgen.core.C0806Kj.A02(c7j5, checksumApiFingerprint7);
                            java.lang.String checksumApiFingerprint8 = A01(1, 5, 36);
                            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(checksumApiFingerprint8);
                            c8f.A05(1);
                            c8f.A06(1);
                            c8f.A0A(false);
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            java.lang.String checksumApiFingerprint9 = A01(25, 5, 125);
                            jSONObject.put(checksumApiFingerprint9, strA01);
                            java.lang.String checksumApiFingerprint10 = A01(30, 5, 115);
                            jSONObject.put(checksumApiFingerprint10, strA03);
                            c8f.A07(jSONObject);
                            com.facebook.ads.redexgen.core.C8D c8dA07 = c7j.A07();
                            int i = com.facebook.ads.redexgen.core.C8E.A1I;
                            java.lang.String checksumApiFingerprint11 = A01(35, 7, 42);
                            c8dA07.AA1(checksumApiFingerprint11, i, c8f);
                        }
                        com.facebook.ads.redexgen.core.C05228l.A00 = strA01;
                    }
                    android.content.SharedPreferences.Editor editorEdit = sharedPreferencesA00.edit();
                    java.lang.String str3 = str;
                    java.lang.String checksumApiFingerprint12 = com.facebook.ads.redexgen.core.C05228l.A00;
                    editorEdit.putString(str3, checksumApiFingerprint12).apply();
                    com.facebook.ads.redexgen.core.C05228l.A05.set(2);
                    return true;
                }
            });
            java.util.concurrent.Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (java.lang.Exception unused) {
            A05.set(0);
        }
    }

    public static void A08(com.facebook.ads.redexgen.core.C7j c7j, boolean z, java.lang.String str) {
        if (A0A(c7j)) {
            A09(c7j, z, str);
        } else {
            A07(c7j, z);
        }
    }

    public static void A09(com.facebook.ads.redexgen.core.C7j c7j, boolean z, final java.lang.String str) {
        if (str == null) {
            str = c7j.getPackageName();
        }
        if (A0B(str)) {
            return;
        }
        A00(c7j);
        final com.facebook.ads.redexgen.core.C0806Kj c0806Kj = new com.facebook.ads.redexgen.core.C0806Kj(c7j, str);
        try {
            c0806Kj.A06();
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<java.lang.Boolean>() { // from class: com.facebook.ads.redexgen.X.8j
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean call() throws java.lang.Exception {
                    c0806Kj.A05();
                    synchronized (com.facebook.ads.redexgen.core.C05228l.A04) {
                        com.facebook.ads.redexgen.core.C05228l.A04.put(str, 2);
                    }
                    return true;
                }
            });
            java.util.concurrent.Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (java.lang.Exception unused) {
            synchronized (A04) {
                A04.put(str, 0);
            }
        }
    }

    public static boolean A0A(com.facebook.ads.redexgen.core.C7j c7j) {
        if (!com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            boolean zA2g = com.facebook.ads.redexgen.core.C0762Im.A2g(c7j);
            if (A03[4].charAt(29) == 'E') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[5] = "Hubg";
            strArr[0] = "jm3dJ";
            if (!zA2g) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0B(java.lang.String str) {
        synchronized (A04) {
            int status = A01(str).intValue();
            if (status != 0) {
                return true;
            }
            A04.put(str, 1);
            return false;
        }
    }
}
