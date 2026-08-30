package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WQ implements com.facebook.ads.redexgen.core.JK {
    public static byte[] A01;
    public final com.facebook.ads.redexgen.core.C1199Zs A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 12);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{94, 89, 91, 76, 77, 89, 84, 103, 76, 81, 85, 93, 75, 76, 89, 85, 72, 64, 79, 74, 70, 77, 87, 124, 66, 83, 74, 124, 85, 70, 81, 80, 74, 76, 77, 101, 105, 104, 114, 99, 104, 114, 60, 41, 41, 5, 2, 31, 24, 13, 0, 0, 51, 30, 9, 10, 9, 30, 30, 9, 30, 68, 94, 114, 78, 89, 57, 40, 42, 34, 40, 46, 44, 22, 39, 40, 36, 44};
    }

    public WQ(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A00 = c1199Zs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A03(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
        this.A00.A0E().AAA(str);
        android.content.pm.PackageManager packageManager = this.A00.getPackageManager();
        if (packageManager == null) {
            this.A00.A0E().AAF(str);
            return false;
        }
        android.content.ContentResolver contentResolver = this.A00.getContentResolver();
        if (contentResolver == null) {
            this.A00.A0E().AAC(str);
            return false;
        }
        if (packageManager.resolveContentProvider(str, 0) == null) {
            this.A00.A0E().AAB(str);
            return false;
        }
        android.net.Uri uri = android.net.Uri.parse(A00(35, 10, 10) + str + A00(0, 1, 125) + str2);
        android.content.ContentValues values = new android.content.ContentValues();
        values.put(A00(17, 18, 47), (java.lang.Integer) 1);
        values.put(A00(61, 5, 33), java.lang.Boolean.valueOf(z));
        values.put(A00(45, 16, 96), str3);
        values.put(A00(66, 12, 69), str4);
        values.put(A00(1, 16, 52), java.lang.Long.valueOf(j));
        try {
            contentResolver.insert(uri, values);
            this.A00.A0E().AAH(str);
            return true;
        } catch (java.lang.UnsupportedOperationException unused) {
            this.A00.A0E().AAE(str);
            return false;
        } catch (java.lang.Exception unused2) {
            this.A00.A0E().AAD(str);
            return false;
        }
    }

    public final void A04(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, boolean z2) {
        this.A00.A0E().AAG();
        com.facebook.ads.redexgen.core.M8.A06.execute(new com.facebook.ads.redexgen.core.WR(this, z, str, str2, str3, j, z2));
    }
}
