package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0760Ik {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"6qWdP8UnAqk2", "MP5OshbzeeKQXWypFydZHFaUVi2SMaBY", "YZOrpgpjnThYhZrbQ", "9FBJpZQghCKG6mC2kMssKZrg31bKkWn0", "1igNFrY6lER43", "wq7phLHZ3BH2hfkM7", "H4ZPtJlAPqOhXadVzSXMAib", "ZeuNk8rzE4mqHJK5cCc2mdI2UMeFjq1Z"};

    @javax.annotation.Nullable
    public android.os.Messenger A00;
    public boolean A01 = false;
    public final android.content.ServiceConnection A02 = new com.facebook.ads.redexgen.core.ServiceConnectionC0759Ij(this);
    public final com.facebook.ads.redexgen.core.C1199Zs A03;
    public final java.lang.String A04;
    public final java.lang.String A05;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 84);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A06() {
        byte[] bArr = {-32, -47, -30, -47, -35, -17, -47, -34, -17, -27, -27, -39, -44, -4, -19, -2, -19, -7, 11, -4, -2, -5, 0, -5, -17, -5, -8, 11, 2, -15, -2, -1, -11, -5, -6, -63, -78, -61, -78, -66, -48, -61, -74, -62, -58, -74, -60, -59, -48, -70, -75, 14, 31, 33, 41, 31, 37, 35, -19, 33, 45, 43, 46, 45, 44, 35, 44, 50, -34, 44, 45, 50, -34, 36, 45, 51, 44, 34, -34, 45, 48, -34, 43, 39, 49, 49, 39, 44, 37, -34, 46, 35, 48, 43, 39, 49, 49, 39, 45, 44, 49, -69, -35, -38, -50, -48, -34, -34, -44, -39, -46, -117, -35, -48, -36, -32, -48, -34, -33, 1, 13, 11, -52, 4, -1, 1, 3, 0, 13, 13, 9, -52, -1, 19, 2, 7, 3, 12, 1, 3, 12, 3, 18, 21, 13, 16, 9, -52, -33, 19, 2, 7, 3, 12, 1, 3, -20, 3, 18, 21, 13, 16, 9, -15, 3, 16, 20, 7, 1, 3, 2, 14, 12, -51, 5, 0, 2, 4, 1, 14, 14, 10, -51, 10, 0, 19, 0, 13, 0, 43, 50, 37, 33, 56, 35, 46, 43, 38, 35, 54, 43, 49, 48};
        java.lang.String[] strArr = A07;
        if (strArr[0].length() == strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A07;
        strArr2[0] = "tkHV67jO43cW";
        strArr2[4] = "7eV9Uq8jXNAYU";
        A06 = bArr;
    }

    static {
        A06();
    }

    public C0760Ik(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, java.lang.String str2) {
        this.A03 = c1199Zs;
        this.A05 = str;
        this.A04 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.os.Bundle A00() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(A05(13, 22, 88), 1);
        bundle.putString(A05(0, 13, 60), this.A04);
        bundle.putString(A05(35, 16, 29), this.A05);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i, com.facebook.ads.redexgen.core.C8F c8f) {
        this.A03.A07().AA0(A05(189, 14, 110), i, c8f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(int i, com.facebook.ads.redexgen.core.C8F c8f) {
        c8f.A05(1);
        this.A03.A07().AA1(A05(189, 14, 110), i, c8f);
    }

    public final void A0C() {
        A08(com.facebook.ads.redexgen.core.C8E.A1t, new com.facebook.ads.redexgen.core.C8F(A05(101, 18, 23), this.A05));
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(A05(org.objectweb.asm.Opcodes.TABLESWITCH, 19, 75), A05(119, 51, 74));
        try {
            if (!this.A03.bindService(intent, this.A02, 1)) {
                A08(com.facebook.ads.redexgen.core.C8E.A1p, new com.facebook.ads.redexgen.core.C8F(A05(51, 50, 106)));
                this.A03.unbindService(this.A02);
            }
        } catch (java.lang.Exception e) {
            A07(com.facebook.ads.redexgen.core.C8E.A1o, new com.facebook.ads.redexgen.core.C8F(e));
        }
    }
}
