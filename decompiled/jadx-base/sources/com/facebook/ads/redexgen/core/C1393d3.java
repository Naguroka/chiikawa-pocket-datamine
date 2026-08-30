package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1393d3 implements com.facebook.ads.redexgen.core.AnonymousClass03<android.graphics.Bitmap> {
    public static byte[] A06;
    public final int A00;
    public final int A01;
    public final java.lang.String A02 = com.facebook.ads.redexgen.core.C1393d3.class.getSimpleName();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 75);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-110, -40, -47, -44, 3, 42, 53, 46, 34, 49, -31, 42, 52, -31, 47, 54, 45, 45, -55, -4, -25, -23, -12, -8, -19, -13, -14, -92, -24, -7, -10, -19, -14, -21, -92, -22, -19, -16, -23, -92, -25, -13, -15, -12, -10, -23, -9, -9, -19, -13, -14};
    }

    public C1393d3(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
    }

    public static com.facebook.ads.redexgen.core.AnonymousClass02<android.graphics.Bitmap> A00(java.lang.Throwable th) {
        return new com.facebook.ads.redexgen.core.AnonymousClass02<>(false, null, th);
    }

    private void A03(java.io.File file, android.graphics.Bitmap bitmap) throws java.io.IOException {
        if (bitmap == null) {
            return;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = null;
        java.io.FileOutputStream fileOutputStream = null;
        java.io.FileInputStream fileInputStream = null;
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            java.io.ByteArrayOutputStream compressedBitmapOS = new java.io.ByteArrayOutputStream();
            byteArrayOutputStream = compressedBitmapOS;
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= 3145728) {
                return;
            }
            java.lang.String str = file.getCanonicalPath() + A01(0, 4, 25);
            java.io.File file2 = new java.io.File(str);
            file2.createNewFile();
            fileOutputStream = new java.io.FileOutputStream(str);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream = new java.io.FileInputStream(str);
            fileOutputStream2 = new java.io.FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i > 0) {
                    fileOutputStream2.write(bArr, 0, i);
                } else {
                    file2.delete();
                    return;
                }
            }
        } finally {
            com.facebook.ads.redexgen.core.C0M.A07(byteArrayOutputStream);
            com.facebook.ads.redexgen.core.C0M.A07(fileOutputStream);
            com.facebook.ads.redexgen.core.C0M.A07(fileInputStream);
            com.facebook.ads.redexgen.core.C0M.A07(fileOutputStream2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass03
    public final com.facebook.ads.redexgen.core.AnonymousClass02<android.graphics.Bitmap> A3i(java.io.File file, com.facebook.ads.redexgen.core.C0L c0l) {
        if (!this.A04) {
            return new com.facebook.ads.redexgen.core.AnonymousClass02<>(true, null);
        }
        try {
            android.graphics.Bitmap bitmapA03 = com.facebook.ads.redexgen.core.C0M.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
            if (bitmapA03 != null) {
                return new com.facebook.ads.redexgen.core.AnonymousClass02<>(true, bitmapA03);
            }
            c0l.A9u(new com.facebook.ads.redexgen.core.C1387cx(A01(4, 14, 118)));
            return A00(null);
        } catch (java.lang.Throwable t) {
            file.delete();
            c0l.A9u(t);
            return A00(t);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass03
    public final void A4q(java.io.File file, com.facebook.ads.redexgen.core.C0L c0l) throws java.lang.Throwable {
        if (this.A03) {
            try {
                android.graphics.Bitmap bitmap = com.facebook.ads.redexgen.core.C0M.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
                if (bitmap != null) {
                    A03(file, bitmap);
                } else {
                    file.delete();
                    throw new com.facebook.ads.redexgen.core.C1387cx(A01(4, 14, 118));
                }
            } catch (com.facebook.ads.redexgen.core.C1387cx e) {
                c0l.AA5(e);
                throw e;
            } catch (java.lang.Throwable th) {
                c0l.AA5(th);
                java.lang.Throwable t = new com.facebook.ads.redexgen.core.C1387cx(A01(18, 33, 57), th);
                throw t;
            }
        }
    }
}
