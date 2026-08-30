package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03390w {
    public static com.facebook.ads.redexgen.core.C03390w A08;
    public static byte[] A09;
    public static final java.lang.String A0A;
    public boolean A01;
    public final com.facebook.ads.redexgen.core.C7j A03;
    public final java.lang.String A04;
    public final java.util.concurrent.Executor A07;
    public final java.util.concurrent.CountDownLatch A05 = new java.util.concurrent.CountDownLatch(1);
    public final java.util.concurrent.CountDownLatch A06 = new java.util.concurrent.CountDownLatch(1);
    public final com.facebook.ads.redexgen.core.C03380v A02 = new com.facebook.ads.redexgen.core.C03380v();
    public java.lang.String A00 = null;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 24);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A09() {
        A09 = new byte[]{65, 64, 82, 57, 44, 91, 94, 73, 121, 91, 74, 74, 83, 84, 93, 115, 84, 92, 85, 20, 78, 66, 78, 72, 74, 91, 91, 78, 79, 106, 79, 88, 5, 95, 83, 95, 66, 86, 65, 85, 81, 65, 74, 71, 93, 123, 71, 69, 84, 84, 77, 74, 67};
    }

    static {
        A09();
        A0A = com.facebook.ads.redexgen.core.C03390w.class.getSimpleName();
    }

    public C03390w(com.facebook.ads.redexgen.core.C7j c7j, boolean z, java.util.concurrent.Executor executor, java.lang.String str) {
        this.A03 = c7j.A01();
        this.A04 = str;
        this.A07 = executor;
        if (z) {
            A0A();
        }
    }

    public static synchronized com.facebook.ads.redexgen.core.C03390w A01(com.facebook.ads.redexgen.core.C7j c7j) {
        if (A08 == null) {
            A08 = new com.facebook.ads.redexgen.core.C03390w(c7j, true, com.facebook.ads.redexgen.core.M8.A06, A03(0, 0, 18));
        }
        return A08;
    }

    private java.lang.String A04(java.lang.String str) {
        java.lang.String strA03 = A03(0, 0, 18);
        try {
            synchronized (this) {
                java.io.File file = new java.io.File(this.A03.getFilesDir(), str);
                if (file.exists() && file.length() > 0) {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                    byte[] data = new byte[(int) file.length()];
                    fileInputStream.read(data);
                    fileInputStream.close();
                    java.lang.String fileContent = A03(0, 5, 12);
                    strA03 = new java.lang.String(data, fileContent);
                }
            }
        } catch (java.io.FileNotFoundException e) {
            this.A03.A07().AA0(A03(36, 17, 60), com.facebook.ads.redexgen.core.C8E.A17, new com.facebook.ads.redexgen.core.C8F(e));
        } catch (java.io.IOException e2) {
            this.A03.A07().AA0(A03(36, 17, 60), com.facebook.ads.redexgen.core.C8E.A19, new com.facebook.ads.redexgen.core.C8F(e2));
        }
        return strA03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        java.lang.String strA03 = A03(36, 17, 60);
        try {
            this.A02.A08(A04(this.A04 + A03(23, 13, 51)));
            this.A02.A0A(A04(A03(5, 18, 34)));
        } catch (com.facebook.ads.redexgen.core.C8F e) {
            A0M();
            this.A03.A07().AA0(strA03, com.facebook.ads.redexgen.core.C8E.A18, e);
        } catch (org.json.JSONException e2) {
            A0M();
            this.A03.A07().AA0(strA03, com.facebook.ads.redexgen.core.C8E.A1A, new com.facebook.ads.redexgen.core.C8F(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        java.lang.String adsFrequencyCappingDataList;
        synchronized (this.A02) {
            adsFrequencyCappingDataList = this.A02.A05().toString();
        }
        A0G(A0K(), adsFrequencyCappingDataList);
    }

    private final void A0A() {
        this.A07.execute(new com.facebook.ads.redexgen.core.C1373cj(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E(com.facebook.ads.redexgen.core.C1S c1s, java.lang.String str, boolean z) {
        c1s.A07(z);
        if (c1s.A08() || c1s.A09()) {
            this.A02.A07(str);
        } else {
            this.A02.A09(str);
        }
    }

    private void A0F(java.lang.String str) {
        java.io.File file = new java.io.File(this.A03.getFilesDir(), str);
        if (file.exists()) {
            file.delete();
        }
    }

    private final synchronized void A0G(java.lang.String str, java.lang.String str2) {
        A0H(this.A04 + A03(23, 13, 51), str.getBytes());
        A0H(A03(5, 18, 34), str2.getBytes());
    }

    private void A0H(java.lang.String str, byte[] bArr) {
        try {
            synchronized (this) {
                try {
                    java.io.File file = new java.io.File(this.A03.getFilesDir(), str);
                    java.io.FileOutputStream fout = new java.io.FileOutputStream(file);
                    fout.write(bArr);
                    fout.close();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (java.io.FileNotFoundException e) {
            this.A03.A07().AA0(A03(36, 17, 60), com.facebook.ads.redexgen.core.C8E.A17, new com.facebook.ads.redexgen.core.C8F(e));
        } catch (java.io.IOException e2) {
            this.A03.A07().AA0(A03(36, 17, 60), com.facebook.ads.redexgen.core.C8E.A19, new com.facebook.ads.redexgen.core.C8F(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(java.lang.String str) {
        boolean z = false;
        try {
            synchronized (this.A02) {
                z = this.A02.A05().get(str) instanceof com.facebook.ads.redexgen.core.C1S;
            }
        } catch (org.json.JSONException e) {
            this.A03.A07().AA0(A03(36, 17, 60), com.facebook.ads.redexgen.core.C8E.A1A, new com.facebook.ads.redexgen.core.C8F(e));
        }
        return z;
    }

    public final java.lang.String A0K() {
        return this.A02.A04();
    }

    public final void A0L() {
        if (!this.A01 || this.A00 == null) {
            return;
        }
        this.A07.execute(new com.facebook.ads.redexgen.core.C1370cg(this, this.A00));
    }

    public final synchronized void A0M() {
        A0F(this.A04 + A03(5, 18, 34));
        A0F(this.A04 + A03(23, 13, 51));
    }

    public final void A0N(java.lang.String str) {
        if (!this.A01) {
            return;
        }
        this.A00 = str;
        this.A07.execute(new com.facebook.ads.redexgen.core.C1371ch(this, str));
    }

    public final void A0O(org.json.JSONObject jSONObject) {
        this.A01 = com.facebook.ads.redexgen.core.C0762Im.A18(this.A03);
        if (!this.A01) {
            return;
        }
        this.A07.execute(new com.facebook.ads.redexgen.core.C1372ci(this, jSONObject));
    }
}
