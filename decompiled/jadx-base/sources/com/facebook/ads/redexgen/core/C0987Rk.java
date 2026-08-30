package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0987Rk {
    public static byte[] A0G;
    public static java.lang.String[] A0H = {"YuGvtiviQVR", "ZhJp0z4dUN", "YWv4zGcwogafSGFsXYmLIXL4tbjSTGT", "UM7SABu2ufM", "2gPy2hJr9M", "yZRmnvTn4zHntgpYIACfXRb3ExDVKnv", "qUSRIBeTtwG", "WSvVNugGHbUgKJE0aBRLXmETVgvdQ"};
    public static final java.lang.String A0I;
    public int A00;
    public int A01;
    public int A02;
    public long A03;

    @javax.annotation.Nullable
    public com.facebook.ads.redexgen.core.KY A04;
    public com.facebook.ads.redexgen.core.C0988Rl A05;
    public java.util.Map<java.lang.String, java.lang.Integer> A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final android.os.Handler A0B;
    public final android.view.View A0C;
    public final com.facebook.ads.redexgen.core.C1199Zs A0D;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.AbstractC0986Rj> A0E;
    public final boolean A0F;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A08(java.util.Vector<android.graphics.Rect> vector) {
        int size = vector.size();
        int[] iArr = new int[size * 2];
        int[] iArr2 = new int[size * 2];
        boolean[][] zArr = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, size * 2, size * 2);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            android.graphics.Rect rectElementAt = vector.elementAt(i3);
            int i4 = i + 1;
            iArr[i] = rectElementAt.left;
            int i5 = i2 + 1;
            iArr2[i2] = rectElementAt.bottom;
            i = i4 + 1;
            iArr[i4] = rectElementAt.right;
            i2 = i5 + 1;
            iArr2[i5] = rectElementAt.top;
        }
        java.util.Arrays.sort(iArr);
        java.util.Arrays.sort(iArr2);
        for (int i6 = 0; i6 < size; i6++) {
            android.graphics.Rect rectElementAt2 = vector.elementAt(i6);
            int iA09 = A09(iArr, rectElementAt2.left);
            int iA010 = A09(iArr, rectElementAt2.right);
            int iA011 = A09(iArr2, rectElementAt2.top);
            int iA012 = A09(iArr2, rectElementAt2.bottom);
            for (int i7 = iA09 + 1; i7 <= iA010; i7++) {
                for (int i8 = iA011 + 1; i8 <= iA012; i8++) {
                    zArr[i7][i8] = true;
                }
            }
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size * 2; i10++) {
            for (int i11 = 0; i11 < size * 2; i11++) {
                i9 += zArr[i10][i11] ? (iArr[i10] - iArr[i10 - 1]) * (iArr2[i11] - iArr2[i11 - 1]) : 0;
            }
        }
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r5 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        A0N(r6, false, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A0G);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r5 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022e, code lost:
    
        if (com.facebook.ads.redexgen.core.MK.A03(r8) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0230, code lost:
    
        A0N(r6, false, A0H(org.objectweb.asm.Opcodes.INVOKEINTERFACE, 26, 71));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0244, code lost:
    
        return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A0K, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0250, code lost:
    
        if (com.facebook.ads.redexgen.core.MK.A03(r8) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0253, code lost:
    
        r3 = com.facebook.ads.redexgen.core.ML.A01(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x025b, code lost:
    
        if (com.facebook.ads.redexgen.core.M4.A04(r3) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x025d, code lost:
    
        A0N(r6, false, A0H(156, 29, 89));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0272, code lost:
    
        return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A09, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0277, code lost:
    
        if (com.facebook.ads.redexgen.core.C0762Im.A1w(r8) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x027d, code lost:
    
        if (com.facebook.ads.redexgen.core.M4.A03(r3) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x027f, code lost:
    
        A0N(r6, false, A0H(31, 31, 29));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0294, code lost:
    
        return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A04, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0295, code lost:
    
        A0N(r6, true, A0H(396, 19, 48));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02aa, code lost:
    
        return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A0I, r4, r3);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.facebook.ads.redexgen.core.C0988Rl A0E(android.view.View view, int i, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        if (view == null) {
            A0N(null, false, A0H(353, 16, 29));
            return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A07);
        }
        boolean zA2c = com.facebook.ads.redexgen.core.C0762Im.A2c(c1199Zs);
        java.lang.String strA0H = A0H(com.bytedance.sdk.openadsdk.TTAdConstant.VIDEO_COVER_URL_CODE, 37, 125);
        java.lang.String strA0H2 = A0H(331, 22, 75);
        if (zA2c) {
            if (view.getParent() == null) {
                A0N(view, false, strA0H2);
                return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A0J);
            }
            boolean zIsShown = view.isShown();
            if (A0H[0].length() == 13) {
                throw new java.lang.RuntimeException();
            }
            A0H[7] = "NobRvy4BnU";
            if (!zIsShown) {
                A0N(view, false, strA0H);
                return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A0M);
            }
        } else {
            if (view.getParent() == null) {
                A0N(view, false, strA0H2);
                return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A0G);
            }
            boolean zIsShown2 = view.isShown();
            if (A0H[7].length() != 13) {
                java.lang.String[] strArr = A0H;
                strArr[5] = "nxs5ab5SCgIt1bjehrDOKVWzL3WZqz6";
                strArr[2] = "N9sY316uyLP0an2AsgJKvtC5gTj4eyT";
            } else {
                java.lang.String[] strArr2 = A0H;
                strArr2[4] = "ovG54rbub0";
                strArr2[1] = "3miU82oxKB";
            }
        }
        if (view.getWindowVisibility() != 0) {
            A0N(view, false, A0H(528, 37, 21));
            return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A0H);
        }
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            A0N(view, false, A0H(295, 36, 112) + view.getMeasuredWidth() + A0H(27, 4, 111) + view.getMeasuredHeight());
            return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A0F);
        }
        if (A00(view) < 0.9f) {
            A0N(view, false, A0H(369, 27, 28));
            return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A0A);
        }
        view.getWidth();
        if (A0H[7].length() == 13) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr3 = A0H;
        strArr3[4] = "P7geMBqOxp";
        strArr3[1] = "ZGWxjrEaaX";
        view.getHeight();
        try {
            view.getLocationOnScreen(new int[2]);
            android.graphics.Rect rect = new android.graphics.Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A06);
            }
            if (android.os.Build.VERSION.SDK_INT >= 17) {
                ((android.view.WindowManager) c1199Zs.getSystemService(A0H(594, 6, 49))).getDefaultDisplay().getRealMetrics(new android.util.DisplayMetrics());
            } else {
                android.content.res.Resources resources = c1199Zs.getResources();
                java.lang.String[] strArr4 = A0H;
                if (strArr4[4].length() != strArr4[1].length()) {
                    throw new java.lang.RuntimeException();
                }
                A0H[7] = "nsQwWKNIdgBJp7INTLhe";
                resources.getDisplayMetrics();
            }
            java.util.Vector<android.graphics.Rect> vectorA0K = A0K(view);
            int iA08 = A08(vectorA0K);
            vectorA0K.add(rect);
            float fA08 = ((A08(vectorA0K) - iA08) * 1.0f) / (view.getMeasuredHeight() * view.getMeasuredWidth());
            float fA01 = A01(i, view) / 100.0f;
            if (fA08 < fA01) {
                A0N(view, false, java.lang.String.format(java.util.Locale.US, A0H(452, 76, 31), java.lang.Float.valueOf(fA08), java.lang.Float.valueOf(fA01)));
                return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A03, fA08);
            }
            java.lang.String[] strArr5 = A0H;
            if (strArr5[4].length() == strArr5[1].length()) {
                A0H[7] = "4";
            }
        } catch (java.lang.NullPointerException unused) {
            A0N(view, false, A0H(62, 30, 103));
            return new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A0F);
        }
    }

    public static java.lang.String A0H(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 32);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0M() {
        A0G = new byte[]{110, 118, 115, 124, 127, -76, 115, 115, 119, 110, -73, -63, 110, -121, -34, -48, -37, -49, -121, -39, -52, -56, -38, -42, -43, -95, -121, -69, -81, -9, -52, 126, -95, 93, -90, -80, 93, -84, -85, 93, -79, -84, -83, 93, -84, -93, 93, -79, -91, -94, 93, -119, -84, -96, -88, -80, -96, -81, -94, -94, -85, 107, -54, -24, -11, -11, -10, -5, -89, -18, -20, -5, -89, -13, -10, -22, -24, -5, -16, -10, -11, -89, -10, -11, -89, -6, -22, -7, -20, -20, -11, -75, -46, -3, -13, 1, -4, -75, 2, -82, -5, -17, -7, -13, -82, 1, -13, -4, 1, -13, -82, 2, -3, -82, 1, -13, 2, -82, -15, -10, -13, -15, -7, -82, -9, -4, 2, -13, 0, 4, -17, -6, -82, -12, -3, 0, -82, -4, -3, -4, -69, 0, -13, -2, -13, -17, 2, -82, -15, -10, -13, -15, -7, -13, 0, -68, -60, -34, -14, -32, -18, -38, -21, -35, -103, -30, -20, -103, -24, -37, -20, -19, -21, -18, -36, -19, -30, -25, -32, -103, -17, -30, -34, -16, -89, -70, -54, -39, -52, -52, -43, -121, -48, -38, -121, -43, -42, -37, -121, -48, -43, -37, -52, -39, -56, -54, -37, -48, -35, -52, -107, -120, -100, -103, 84, -88, -99, -105, -97, -103, -90, 84, -105, -107, -94, -94, -93, -88, 84, -106, -103, 84, -94, -103, -101, -107, -88, -99, -86, -103, -103, -84, -88, -70, 99, -16, -4, -6, -69, -13, -18, -16, -14, -17, -4, -4, -8, -69, -18, -15, 0, -69, -10, -5, 1, -14, -1, -5, -18, -7, -69, 3, -10, -14, 4, -69, -45, 2, -7, -7, -32, -16, -1, -14, -14, -5, -50, -15, -31, -4, -4, -7, -17, -18, -1, -3, -47, -12, -26, -7, -11, 7, -80, -8, -15, 3, -80, -7, -2, 6, -7, 3, -7, -14, -4, -11, -80, -12, -7, -3, -11, -2, 3, -7, -1, -2, 3, -80, -72, 7, -51, -40, -84, -49, -63, -44, -48, -30, -117, -45, -52, -34, -117, -39, -38, -117, -37, -52, -35, -48, -39, -33, -103, -86, 126, -95, -109, -90, -94, -76, 93, -90, -80, 93, -85, -78, -87, -87, 107, -87, 125, -96, -110, -91, -95, -77, 92, -91, -81, 92, -80, -85, -85, 92, -80, -82, -99, -86, -81, -84, -99, -82, -95, -86, -80, 106, -67, -111, -76, -90, -71, -75, -57, 112, -71, -61, 112, -58, -71, -61, -71, -78, -68, -75, 126, 10, -34, 1, -13, 6, 2, 20, -67, 13, -2, 15, 2, 11, 17, -67, 6, 16, -67, 11, 12, 17, -67, 16, 2, 17, -67, 17, 12, -67, -13, -26, -16, -26, -33, -23, -30, -53, -84, -128, -93, -107, -88, -92, -74, 95, -75, -88, -78, -88, -95, -85, -92, 95, -96, -79, -92, -96, 95, -88, -78, 95, -77, -82, -82, 95, -78, -84, -96, -85, -85, 95, -102, 100, 109, 113, -91, 100, 100, 95, -75, -88, -78, -88, -95, -85, -92, 107, 95, -94, -76, -79, -79, -92, -83, -77, 95, -77, -89, -79, -92, -78, -89, -82, -85, -93, 95, 100, 109, 113, -91, 100, 100, -100, -94, 118, -103, -117, -98, -102, -84, 85, -84, -98, -93, -103, -92, -84, 85, -98, -88, 85, -93, -92, -87, 85, -88, -102, -87, 85, -87, -92, 85, -117, 126, -120, 126, 119, -127, 122, 99, -110, -109, -104, 68, -102, -115, -119, -101, -123, -122, -112, -119, -32, -46, -96, -109, -113, -95, -117, -116, -106, -113, -13, -19, 21, 17, 2, -93, -95, -56, -70, -65, -75, -64, -56};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized java.lang.String A0R() {
        return com.facebook.ads.redexgen.core.C0Q.values()[this.A05.A01()].toString() + java.lang.String.format(java.util.Locale.US, A0H(0, 9, 46), java.lang.Float.valueOf(this.A05.A00() * 100.0f));
    }

    static {
        A0M();
        A0I = com.facebook.ads.redexgen.core.C0987Rk.class.getSimpleName();
    }

    public C0987Rk(android.view.View view, int i, int i2, boolean z, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.AbstractC0986Rj> weakReference, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A0B = new android.os.Handler();
        this.A01 = 0;
        this.A02 = 1000;
        this.A08 = true;
        this.A05 = new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A0L);
        this.A06 = new java.util.HashMap();
        this.A03 = 0L;
        this.A00 = 0;
        this.A07 = true;
        this.A0D = c1199Zs;
        this.A0C = view;
        if (this.A0C.getId() == -1) {
            com.facebook.ads.redexgen.core.M3.A0K(this.A0C);
        }
        this.A0A = i;
        this.A0E = weakReference;
        this.A0F = z;
        if (i2 < 0) {
            if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
                android.util.Log.w(A0I, A0H(211, 29, 20));
            }
            i2 = 0;
        }
        this.A09 = i2;
    }

    public C0987Rk(android.view.View view, int i, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.AbstractC0986Rj> weakReference, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this(view, i, 0, false, weakReference, c1199Zs);
    }

    public C0987Rk(android.view.View view, int i, boolean z, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.AbstractC0986Rj> weakReference, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this(view, i, 0, z, weakReference, c1199Zs);
    }

    public static float A00(android.view.View view) {
        float alpha = view.getAlpha();
        while (view.getParent() instanceof android.view.ViewGroup) {
            view = (android.view.View) view.getParent();
            float alpha2 = view.getAlpha();
            if (alpha2 < 0.0f) {
                alpha2 = 0.0f;
            }
            if (alpha2 > 1.0f) {
                alpha2 = 1.0f;
            }
            alpha *= alpha2;
        }
        return alpha;
    }

    public static int A01(int i, android.view.View view) {
        int width = view.getWidth() * view.getHeight();
        float onePixelPercentage = width > 0 ? 100.0f / width : 100.0f;
        int viewArea = (int) java.lang.Math.max(i, java.lang.Math.ceil(onePixelPercentage));
        return viewArea;
    }

    public static /* synthetic */ int A05(com.facebook.ads.redexgen.core.C0987Rk c0987Rk) {
        int i = c0987Rk.A00;
        c0987Rk.A00 = i + 1;
        return i;
    }

    public static int A09(int[] iArr, int i) {
        int i2 = 0;
        int mid = iArr.length;
        while (i2 < mid) {
            int low = mid - i2;
            int high = (low / 2) + i2;
            int low2 = iArr[high];
            if (low2 == i) {
                return high;
            }
            int low3 = iArr[high];
            if (low3 > i) {
                mid = high;
            } else {
                i2 = high + 1;
            }
        }
        return -1;
    }

    public static java.util.Vector<android.graphics.Rect> A0K(android.view.View view) {
        java.util.Vector<android.graphics.Rect> vector = new java.util.Vector<>();
        if (!(view.getParent() instanceof android.view.ViewGroup)) {
            return vector;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < viewGroup.getChildCount(); iIndexOfChild++) {
            android.view.View childAt = viewGroup.getChildAt(iIndexOfChild);
            if (A0H[0].length() == 13) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0H;
            strArr[5] = "k1JcZ1wpbQO9ikEolBidSsMChjYk4Sl";
            strArr[2] = "tjbQFFO1F8PkdaxFL56rw4qlI30x63G";
            int childIndex = 1;
            boolean z = !(childAt instanceof com.facebook.ads.redexgen.core.QS);
            if ((childAt instanceof com.facebook.ads.redexgen.core.UA) && com.facebook.ads.redexgen.core.AbstractC0989Rm.A00(childAt)) {
                childIndex = 0;
            }
            if (z && childIndex != 0) {
                java.util.Vector<android.graphics.Rect> rectVector = A0L(childAt);
                vector.addAll(rectVector);
            }
        }
        java.util.Vector<android.graphics.Rect> rectVector2 = A0K(viewGroup);
        vector.addAll(rectVector2);
        return vector;
    }

    public static java.util.Vector<android.graphics.Rect> A0L(android.view.View view) {
        java.util.Vector<android.graphics.Rect> vector = new java.util.Vector<>();
        if (!view.isShown() || (android.os.Build.VERSION.SDK_INT >= 11 && view.getAlpha() <= 0.0f)) {
            return vector;
        }
        java.lang.String name = view.getClass().getName();
        if (A0H[7].length() == 13) {
            throw new java.lang.RuntimeException();
        }
        A0H[7] = "IkE0lymuYwIsZPrnhjlWmNJdNq4n";
        boolean isTransparentToolbar = name.equals(A0H(245, 50, 109)) && view.getBackground() != null && (view.getBackground() instanceof android.graphics.drawable.GradientDrawable);
        if ((view instanceof android.view.ViewGroup) && (com.facebook.ads.redexgen.core.AbstractC0989Rm.A00(view) || isTransparentToolbar)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                java.util.Vector<android.graphics.Rect> visibleRectInView = A0L(viewGroup.getChildAt(i));
                vector.addAll(visibleRectInView);
            }
            return vector;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        if (view.getGlobalVisibleRect(rect)) {
            vector.add(rect);
        }
        return vector;
    }

    public static void A0N(android.view.View view, boolean z, java.lang.String str) {
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
            java.lang.String str2 = A0H(androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, 5, 35) + view + A0H(9, 4, 46) + (z ? A0H(579, 8, 10) : A0H(565, 12, 4)) + A0H(13, 14, 71) + str;
        }
    }

    public final synchronized java.util.Map<java.lang.String, java.lang.String> A0S() {
        java.util.HashMap map;
        map = new java.util.HashMap();
        map.put(A0H(589, 3, 127), java.lang.String.valueOf(this.A05.A01()));
        map.put(A0H(587, 2, 93), java.lang.String.valueOf(this.A05.A00()));
        map.put(A0H(577, 2, 74), new org.json.JSONObject(this.A06).toString());
        map.put(A0H(592, 2, 13), com.facebook.ads.redexgen.core.C0841Lu.A05(this.A03));
        java.util.Map<java.lang.String, java.lang.String> viewabilityData = this.A05.A03();
        map.putAll(viewabilityData);
        return map;
    }

    public final synchronized void A0T() {
        this.A05 = new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A0L);
    }

    public final synchronized void A0U() {
        if (this.A04 != null) {
            A0V();
        }
        if (this.A07) {
            this.A0D.A0E().A3d();
        }
        this.A04 = new com.facebook.ads.redexgen.core.C7B(this, this.A0D);
        this.A0B.postDelayed(this.A04, this.A01);
        this.A08 = false;
        this.A00 = 0;
        this.A05 = new com.facebook.ads.redexgen.core.C0988Rl(com.facebook.ads.redexgen.core.C0Q.A0L);
        this.A06 = new java.util.HashMap();
    }

    public final synchronized void A0V() {
        if (this.A07) {
            this.A0D.A0E().A3e();
        }
        this.A0B.removeCallbacks(this.A04);
        this.A04 = null;
        this.A08 = true;
        this.A00 = 0;
    }

    public final void A0W(int i) {
        this.A01 = i;
    }

    public final void A0X(int i) {
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug() && !this.A0F) {
            android.util.Log.w(A0I, A0H(92, 64, 110));
        }
        this.A02 = i;
    }

    public final void A0Y(boolean z) {
        this.A07 = z;
    }

    public final synchronized boolean A0Z() {
        return this.A08;
    }
}
