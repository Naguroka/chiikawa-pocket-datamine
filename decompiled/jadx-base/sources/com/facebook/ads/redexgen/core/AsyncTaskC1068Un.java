package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AsyncTaskC1068Un extends android.os.AsyncTask<java.lang.String, java.lang.Void, android.graphics.Bitmap[]> implements com.facebook.ads.redexgen.core.InterfaceC04957e {
    public static byte[] A0A;
    public static java.lang.String[] A0B = {"", "", "tk2ciTRcvMIsX7PNNAsbqXfz4cjsZNd3", "5z01THRYCfHu8Ay0wH5meUoLhFHMZyns", "VYXg8wObxMc7BeMRrzz5UEer", "1KBjMNFbEleLBxdQS2J3kw1LUfJ9GnIf", "PvEnCL5gthOso5MBRjJGXOGrZMhqPY73", "dw8jODS3DySi5ymezTFU6bMU1A3tjNXQ"};
    public int A00;
    public int A01;
    public com.facebook.ads.redexgen.core.O7 A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.O5> A06;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1199Zs> A07;
    public final java.lang.ref.WeakReference<android.widget.ImageView> A08;
    public final java.lang.ref.WeakReference<android.view.ViewGroup> A09;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 84);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{45, 47, 36, 47, 56, 35, 41};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final android.graphics.Bitmap[] A03(java.lang.String... strArr) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return null;
        }
        if (A0B[2].charAt(8) == 'z') {
            throw new java.lang.RuntimeException();
        }
        A0B[2] = "Jzd8uX0XYQJZtrGuhrAJ2cBOXObB1Sdn";
        try {
            java.lang.String str = strArr[0];
            android.graphics.Bitmap bitmapA0N = null;
            android.graphics.Bitmap bitmapA01 = null;
            com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A07.get();
            java.lang.String[] strArr2 = A0B;
            if (strArr2[6].charAt(7) == strArr2[5].charAt(7)) {
                throw new java.lang.RuntimeException();
            }
            A0B[2] = "bv0UYUwFwYp94NQ105UqaFrunwxSHAuK";
            if (c1199Zs == null) {
                return new android.graphics.Bitmap[]{null, null};
            }
            try {
                bitmapA0N = new com.facebook.ads.redexgen.core.C04766f(c1199Zs).A0N(str, this.A00, this.A01);
                if (bitmapA0N != null && !this.A03) {
                    bitmapA01 = com.facebook.ads.redexgen.core.MA.A01(c1199Zs, bitmapA0N, this.A04, this.A05);
                }
            } catch (java.lang.Throwable th) {
                c1199Zs.A07().AA0(A00(0, 7, 30), com.facebook.ads.redexgen.core.C8E.A1V, new com.facebook.ads.redexgen.core.C8F(th));
            }
            return new android.graphics.Bitmap[]{bitmapA0N, bitmapA01};
        } catch (java.lang.Throwable th2) {
            com.facebook.ads.redexgen.core.KQ.A00(th2, this);
            java.lang.String[] strArr3 = A0B;
            if (strArr3[7].charAt(9) == strArr3[3].charAt(9)) {
                return null;
            }
            A0B[2] = "caPrFgLZt2WaPlUZLvOtKYt7S4BN2jGU";
            return null;
        }
    }

    static {
        A01();
    }

    public AsyncTaskC1068Un(android.view.ViewGroup viewGroup, int i, int i2, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new java.lang.ref.WeakReference<>(c1199Zs);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new java.lang.ref.WeakReference<>(viewGroup);
        this.A04 = i;
        this.A05 = i2;
    }

    public AsyncTaskC1068Un(android.view.ViewGroup viewGroup, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this(viewGroup, 12, 16, c1199Zs);
    }

    public AsyncTaskC1068Un(android.widget.ImageView imageView, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new java.lang.ref.WeakReference<>(c1199Zs);
        this.A06 = null;
        this.A08 = new java.lang.ref.WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public AsyncTaskC1068Un(com.facebook.ads.redexgen.core.O5 o5, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new java.lang.ref.WeakReference<>(c1199Zs);
        this.A06 = new java.lang.ref.WeakReference<>(o5);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(android.graphics.Bitmap[] result) throws java.lang.Throwable {
        com.facebook.ads.redexgen.core.O5 o5;
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (this.A08 != null) {
                android.widget.ImageView imageView = this.A08.get();
                if (result[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(result[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(result[0]);
                }
            }
            if (this.A06 != null && (o5 = this.A06.get()) != null) {
                o5.setImage(result[0], result[1]);
            }
            if (this.A09 != null && this.A09.get() != null && result[1] != null) {
                com.facebook.ads.redexgen.core.M3.A0S(this.A09.get(), new android.graphics.drawable.BitmapDrawable(this.A07.get().getResources(), result[1]));
            }
            if (this.A02 != null) {
                this.A02.AC8(result[0] != null);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }

    public final com.facebook.ads.redexgen.core.AsyncTaskC1068Un A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final com.facebook.ads.redexgen.core.AsyncTaskC1068Un A05(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        return this;
    }

    public final com.facebook.ads.redexgen.core.AsyncTaskC1068Un A06(com.facebook.ads.redexgen.core.O7 o7) {
        this.A02 = o7;
        return this;
    }

    public final void A07(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            if (this.A02 != null) {
                this.A02.AC8(false);
                return;
            }
            return;
        }
        executeOnExecutor(com.facebook.ads.redexgen.core.M8.A06, str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04957e
    public final com.facebook.ads.redexgen.core.C1199Zs A6G() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ android.graphics.Bitmap[] doInBackground(java.lang.String[] strArr) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return null;
        }
        try {
            return A03(strArr);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(android.graphics.Bitmap[] bitmapArr) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            A02(bitmapArr);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
