package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1347cJ extends com.facebook.ads.redexgen.core.AbstractC03340r {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"naGFqnPrPSZVlF1tbzSnGlWDlhg8Bx7N", "RM0IQcINTb6QF6bWU7ymbn4JjJrL5iWr", "XJIeYwVEWh3ByQbCoBQqWdEefl5R9e76", "6T6YAwPN0KvqZkFL7aTQgfqW9EwPqPWp", "VPS1QaAIDZymsBiqXIOVWbiLhGEbna9V", "CymBNsc0cxG6yTnU49Ac6tOVI4DKwjx7", "uBQQQ5YEdlglu1zaQURE0tehHklX5mTJ", "q6iumcfL9EATxxGEWvppmeo1ZOnHOvxd"};
    public android.view.View A00;
    public android.view.View A01;
    public com.facebook.ads.redexgen.core.AnonymousClass12 A02;
    public com.facebook.ads.redexgen.core.AnonymousClass13 A03;
    public com.facebook.ads.redexgen.core.JX A04;
    public java.lang.String A05;
    public java.util.List<android.view.View> A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final com.facebook.ads.redexgen.core.C1358cU A0D;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 21);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{127, -88, -92, -93, 85, -102, -83, -104, -102, -91, -87, -98, -92, -93, -51, -32, -33, -33, -38, -39, -52, -43, -54, -36, -36, -124, -115, -118, -124, -116, -126, -125, -115, -122, -127, -108, -112, -114, 125, 123, -124, -123, -118, -112, -113, -92, -97, -27, -23, -35, -29, -31, -97, -100, -90, -89, -99, -107, -108, -103, -111, -90, -103, -107, -89, -120, 123, -121, -126, -117, 126, -118, -108, -81, -94, -77, -94, -77, -79, -91, -70, -84, -71, -17, -23, -12, -1, -6, 7, -45, -46, -37, -71, -72, -63, -84, -69, 2, 8, -3, -37, -34, -43, -45, -43, -38, -36, -34, -47, -49, -51, -49, -44, -47, -53, -39, -47, -48, -43, -51, -21, -31, -14, -35, -37, -42, -55, -40, -37, -48, -41, -36, -50, -65, -46, -50, -5, 0, -9, -20, -58, -76, -57, -61, -113, -120, -123, -120, -119, -111, -120, -87, -100, -104, -86, -26, -39, -43, -25, -41, -30, -33, -27, -32, -11, -30, -76, -97, -34, -90, -102, -15, -76, -97, -34, -9, -79, -82, 112, 91, -102, 98, 86, -81, 112, 91, -102, -77};
    }

    static {
        A05();
    }

    public C1347cJ(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC03350s abstractC03350s, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C1358cU c1358cU) {
        super(c1199Zs, abstractC03350s, c0987Rk);
        this.A02 = com.facebook.ads.redexgen.core.AnonymousClass12.A03;
        this.A03 = null;
        this.A0D = c1358cU;
    }

    private java.lang.String A02(android.view.View view) {
        try {
            org.json.JSONObject json = A04(view);
            return json.toString();
        } catch (org.json.JSONException unused) {
            return A01(0, 14, 32);
        }
    }

    private java.lang.String A03(android.view.View view) {
        int width = view.getWidth();
        java.lang.String strA01 = A01(0, 0, 95);
        if (width <= 0 || view.getHeight() <= 0) {
            return strA01;
        }
        try {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setDensity(view.getResources().getDisplayMetrics().densityDpi);
            view.draw(new android.graphics.Canvas(bitmapCreateBitmap));
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmapCreateBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, this.A0D.A0A(), byteArrayOutputStream);
            return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (java.lang.Exception unused) {
            return strA01;
        }
    }

    private org.json.JSONObject A04(android.view.View view) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt(A01(45, 2, 38), java.lang.Integer.valueOf(view.getId()));
        jSONObject.putOpt(A01(20, 5, 84), view.getClass());
        boolean z = false;
        jSONObject.putOpt(A01(100, 6, 87), java.lang.String.format(java.util.Locale.US, A01(org.objectweb.asm.Opcodes.ARETURN, 12, 33), java.lang.Integer.valueOf(view.getTop()), java.lang.Integer.valueOf(view.getLeft())));
        jSONObject.putOpt(A01(120, 4, 99), java.lang.String.format(java.util.Locale.US, A01(org.objectweb.asm.Opcodes.IF_ICMPLE, 12, 101), java.lang.Integer.valueOf(view.getHeight()), java.lang.Integer.valueOf(view.getWidth())));
        if (this.A06 != null && this.A06.contains(view)) {
            z = true;
        }
        jSONObject.putOpt(A01(25, 9, 12), java.lang.Boolean.valueOf(z));
        java.lang.String strA01 = A01(org.objectweb.asm.Opcodes.D2F, 7, 5);
        if (view instanceof android.widget.Button) {
            strA01 = A01(14, 6, 86);
        } else if (view instanceof android.widget.TextView) {
            strA01 = A01(org.objectweb.asm.Opcodes.IINC, 4, 69);
        } else if (view instanceof android.widget.ImageView) {
            strA01 = A01(47, 5, 103);
        } else {
            boolean z2 = view instanceof com.facebook.ads.MediaView;
            if (A0F[5].charAt(12) != 'y') {
                throw new java.lang.RuntimeException();
            }
            A0F[4] = "bylXNVHmRehwPu5eFX29358jXG6bP6wL";
            if (z2) {
                strA01 = A01(56, 9, 27);
            } else if (view instanceof android.view.ViewGroup) {
                strA01 = A01(155, 9, 91);
            }
        }
        jSONObject.putOpt(A01(136, 4, 114), strA01);
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            org.json.JSONArray list = new org.json.JSONArray();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                org.json.JSONObject data = A04(viewGroup.getChildAt(i));
                list.put(data);
            }
            jSONObject.putOpt(A01(52, 4, 30), list);
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03340r
    public final void A06(java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.A0D == null) {
            return;
        }
        if (this.A04 != null) {
            map.put(A01(97, 3, 127), java.lang.String.valueOf(this.A04.A05()));
        }
        if (this.A07) {
            map.put(A01(83, 3, 108), java.lang.Boolean.TRUE.toString());
        }
        if (this.A0B) {
            map.put(A01(89, 3, 80), java.lang.Boolean.TRUE.toString());
        }
        if (this.A08) {
            map.put(A01(92, 5, 54), java.lang.Boolean.TRUE.toString());
        }
        if (this.A00 != null && this.A0D.A0T()) {
            java.lang.String strA02 = A02(this.A00);
            java.lang.String strA01 = A01(org.objectweb.asm.Opcodes.DCMPL, 4, 30);
            if (A0F[5].charAt(12) != 'y') {
                throw new java.lang.RuntimeException();
            }
            A0F[0] = "0nsTrvyBVFn5JiHcx4XaPHfYKfpd5PBN";
            map.put(strA01, strA02);
        }
        if (this.A00 != null && this.A0D.A0U()) {
            map.put(A01(124, 8, 83), A03(this.A00));
        }
        if (this.A0A) {
            map.put(A01(86, 3, 124), java.lang.Boolean.TRUE.toString());
        }
        if (this.A02 != null) {
            map.put(A01(106, 14, 87), this.A02.toString());
        }
        if (this.A09) {
            map.put(A01(140, 4, 60), java.lang.Boolean.TRUE.toString());
        }
        if (this.A01 != null) {
            map.put(A01(69, 4, 8), java.lang.String.valueOf((int) (this.A01.getWidth() / com.facebook.ads.redexgen.core.LP.A02)));
            map.put(A01(65, 4, 5), java.lang.String.valueOf((int) (this.A01.getHeight() / com.facebook.ads.redexgen.core.LP.A02)));
        }
        if (this.A03 != null) {
            map.put(A01(73, 5, 44), this.A03.toString());
        }
        if (this.A05 != null) {
            map.put(A01(34, 11, 7), this.A05);
        }
        if (this.A0C) {
            map.put(A01(78, 5, 46), java.lang.Boolean.TRUE.toString());
        }
        this.A0D.A0O(map);
    }

    public final void A07(android.view.View view) {
        this.A01 = view;
    }

    public final void A08(android.view.View view) {
        this.A00 = view;
    }

    public final void A09(com.facebook.ads.redexgen.core.AnonymousClass12 anonymousClass12) {
        this.A02 = anonymousClass12;
    }

    public final void A0A(com.facebook.ads.redexgen.core.AnonymousClass13 anonymousClass13) {
        this.A03 = anonymousClass13;
    }

    public final void A0B(com.facebook.ads.redexgen.core.JX jx) {
        this.A04 = jx;
    }

    public final void A0C(java.lang.String str) {
        this.A05 = str;
    }

    public final void A0D(java.util.List<android.view.View> clickableViews) {
        this.A06 = clickableViews;
    }

    public final void A0E(boolean z) {
        this.A07 = z;
    }

    public final void A0F(boolean z) {
        this.A08 = z;
    }

    public final void A0G(boolean z) {
        this.A09 = z;
    }

    public final void A0H(boolean z) {
        this.A0A = z;
    }

    public final void A0I(boolean z) {
        this.A0B = z;
    }

    public final void A0J(boolean z) {
        this.A0C = z;
    }
}
