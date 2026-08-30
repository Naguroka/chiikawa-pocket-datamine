package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AsyncTaskC04605p extends android.os.AsyncTask<com.facebook.ads.redexgen.core.C04625r, java.lang.Void, android.graphics.drawable.Drawable> {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"Er5x4Nf8UA9tVLePD2EX", "DtYF9X90t5u", "I941X6fzqWLmgCmjxes", "iBgQ7OI2DFUGAw4NUel9vSUdaaiAzSqO", "QcmiodlDN7oY3kgnmckrDpvdiERsjn9V", "z", "b", "KLyCCmbDECCjA8c7XM6gY8wQDdZdMwfW"};
    public final com.facebook.ads.redexgen.core.InterfaceC04615q A00;
    public final com.facebook.ads.redexgen.core.C1199Zs A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final android.graphics.drawable.Drawable A00(com.facebook.ads.redexgen.core.C04625r... c04625rArr) throws java.lang.Throwable {
        if (!com.facebook.ads.redexgen.core.KQ.A02(this) && c04625rArr != null) {
            try {
                if (c04625rArr.length >= 1) {
                    java.lang.String str = c04625rArr[0].A01;
                    java.lang.String str2 = c04625rArr[0].A00;
                    android.graphics.Bitmap bitmapA0N = null;
                    try {
                        bitmapA0N = new com.facebook.ads.redexgen.core.C04766f(this.A01).A0N(str, -1, -1);
                    } catch (java.lang.Throwable th) {
                        this.A01.A07().AA0(A01(0, 7, 4), com.facebook.ads.redexgen.core.C8E.A1V, new com.facebook.ads.redexgen.core.C8F(th));
                    }
                    if (bitmapA0N != null) {
                        return com.facebook.ads.redexgen.core.W7.A05(this.A01, bitmapA0N, this.A02, str2);
                    }
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.ads.redexgen.core.KQ.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] ^ i3) ^ 36;
            java.lang.String[] strArr = A04;
            if (strArr[6].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A04[2] = "XzO4PGfz9rpTObXE3Krp6";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{71, 69, 78, 69, 82, 73, 67};
    }

    static {
        A02();
    }

    public AsyncTaskC04605p(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.InterfaceC04615q interfaceC04615q, boolean z) {
        this.A01 = c1199Zs;
        this.A00 = interfaceC04615q;
        this.A02 = z;
    }

    public /* synthetic */ AsyncTaskC04605p(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.InterfaceC04615q interfaceC04615q, boolean z, com.facebook.ads.redexgen.core.C1221aE c1221aE) {
        this(c1199Zs, interfaceC04615q, z);
    }

    private final void A03(android.graphics.drawable.Drawable drawable) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.AC9(drawable);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ android.graphics.drawable.Drawable doInBackground(com.facebook.ads.redexgen.core.C04625r[] c04625rArr) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return null;
        }
        try {
            return A00(c04625rArr);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(android.graphics.drawable.Drawable drawable) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
