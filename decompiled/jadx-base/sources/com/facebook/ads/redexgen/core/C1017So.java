package com.facebook.ads.redexgen.core;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.So, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1017So {
    public static byte[] A0L;
    public static java.lang.String[] A0M = {"pLRRT7xfKKmC", "sDjB9WgW1E6gHf8gwZURHsTrfoUrQz1T", "uiJP8xmaVv", "5XKoBHy1xynVgVvyT837PyBbXD1HwArb", "BpJCepaU8WbBulVTB", "9USxYKvyty1bKFarGQoBTCJfC9", "y9X2NkRV2raN2WQBQaXrllWfrJ", "7FHQr1tSmfn5NF7ZWaBxZ9Q6x0"};
    public int A01;
    public int A02;
    public com.facebook.ads.redexgen.core.InterfaceC0962Ql A03;
    public boolean A05;
    public boolean A07;
    public boolean A08;
    public boolean A0B;
    public final com.facebook.ads.redexgen.core.C1286bK A0C;
    public final com.facebook.ads.redexgen.core.C1199Zs A0D;
    public final com.facebook.ads.redexgen.core.J7 A0E;
    public final com.facebook.ads.redexgen.core.InterfaceC0961Qk A0F;
    public final com.facebook.ads.redexgen.core.InterfaceC0967Qq A0G;
    public final com.facebook.ads.redexgen.core.C0968Qr A0H;
    public final java.lang.String A0J;
    public final java.util.Map<java.lang.String, java.lang.String> A0K;
    public final java.lang.Object A0I = new java.lang.Object();
    public boolean A06 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public int A00 = 0;
    public java.lang.String A04 = null;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 34 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C1017So(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.InterfaceC0961Qk interfaceC0961Qk, java.lang.String str, boolean z, int i, int i2, boolean z2, android.os.Bundle bundle, java.util.Map<java.lang.String, java.lang.String> map, com.facebook.ads.redexgen.core.InterfaceC0967Qq interfaceC0967Qq) {
        this.A02 = 0;
        this.A01 = 0;
        this.A05 = false;
        this.A0B = false;
        this.A07 = false;
        this.A0D = c1199Zs;
        this.A0E = j7;
        this.A0F = interfaceC0961Qk;
        this.A0J = str;
        this.A0K = map;
        this.A08 = z;
        this.A07 = z2;
        this.A0G = interfaceC0967Qq;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.facebook.ads.redexgen.core.C1019Sq(this, 0.5d, -1.0d, 2.0d, true));
        arrayList.add(new com.facebook.ads.redexgen.core.C1018Sp(this, 1.0E-7d, -1.0d, 0.001d, false));
        if (bundle != null) {
            this.A0C = new com.facebook.ads.redexgen.core.C1286bK(arrayList, bundle.getBundle(A0G(6, 16, 57)), this.A0G);
            this.A02 = bundle.getInt(A0G(97, 18, 74));
            this.A01 = bundle.getInt(A0G(79, 18, 108));
        } else {
            this.A02 = i;
            this.A01 = i2;
            this.A0C = new com.facebook.ads.redexgen.core.C1286bK(arrayList, this.A0G);
        }
        this.A05 = com.facebook.ads.redexgen.core.C0762Im.A2K(this.A0D);
        this.A0B = com.facebook.ads.redexgen.core.C0762Im.A2O(this.A0D);
        this.A0H = new com.facebook.ads.redexgen.core.C0968Qr(new android.os.Handler(), this);
    }

    public static java.lang.String A0G(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0N() {
        A0L = new byte[]{-86, -84, -67, -78, -72, -73, -53, -50, -69, -33, -53, -42, -45, -34, -29, -73, -53, -40, -53, -47, -49, -36, -75, -56, -67, -63, -71, -77, -63, -57, -65, -48, -59, -55, -63, -71, -70, -63, -76, -74, -55, -66, -62, -70, -76, -62, -56, -42, -41, -34, -47, -24, -26, -37, -33, -41, -47, -33, -27, -49, -32, -49, -40, -34, -55, -45, -40, -50, -49, -30, -69, -50, -59, -58, -62, -73, -49, -69, -56, 9, -2, 16, 17, -33, 12, 18, 11, 1, -2, 15, 22, -15, 6, 10, 2, -22, -16, -25, -36, -18, -17, -53, -19, -22, -30, -19, -32, -18, -18, -49, -28, -24, -32, -56, -50, -46, -56, -58, -39, -60, -46, -40, -17, -27, -8, -10, -31, -17, -11, -38, -46, -35, -39, -5, -3, -16, -5, -5, -1, -62, -58, -69, -65, -73, -44, -37, 6, -5, -1, -9, -30, -40, -51, -18, -28, -27, -4, -14, -13, -25, -2, -6, -12, -20, -13, -19, -12, -28, -30, -41, -37, -45, -51, -37, -31, -85, -84, -108, -89, -88, -93, 31, 32, 10, 19, 20, 10, -70, -69, -79, -91, -68, -63, -77, -72, -82, -71, -63};
    }

    static {
        A0N();
    }

    private final float A0F() {
        return com.facebook.ads.redexgen.core.M0.A00(this.A0D) * this.A0F.getVolume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, java.lang.String> A0I(com.facebook.ads.redexgen.core.EnumC0963Qm enumC0963Qm) {
        int currentPositionInMillis = this.A0F.getCurrentPositionInMillis();
        int i = this.A00 + 1;
        this.A00 = i;
        return A0J(enumC0963Qm, currentPositionInMillis, i);
    }

    private java.util.Map<java.lang.String, java.lang.String> A0J(com.facebook.ads.redexgen.core.EnumC0963Qm enumC0963Qm, int i, int i2) {
        java.util.HashMap map = new java.util.HashMap();
        com.facebook.ads.redexgen.core.M0.A03(map, this.A0F.getVideoStartReason() == com.facebook.ads.redexgen.core.EnumC0969Qs.A02, !this.A0F.A9U());
        A0T(map);
        A0R(map);
        A0V(map, i);
        A0U(map);
        A0S(map);
        A0m(enumC0963Qm, map);
        map.put(A0G(0, 6, 24), java.lang.String.valueOf(enumC0963Qm.A00));
        map.put(A0G(59, 11, 57), java.lang.String.valueOf(i2));
        return map;
    }

    private void A0L() {
        if (this.A07 && this.A06) {
            return;
        }
        A0Q(this.A0J, A0I(com.facebook.ads.redexgen.core.EnumC0963Qm.A04));
    }

    private void A0M() {
        if (this.A07 && this.A06) {
            return;
        }
        java.lang.String str = this.A0J;
        java.lang.String[] strArr = A0M;
        if (strArr[2].length() == strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        A0M[6] = "FJm4aBnN5GbAhpBnCwQDj";
        A0Q(str, A0I(com.facebook.ads.redexgen.core.EnumC0963Qm.A0A));
    }

    private final void A0O(int i, boolean z, boolean z2) {
        if (i <= 0.0d || i < this.A02) {
            return;
        }
        if (i > this.A02) {
            this.A0C.A06((i - this.A02) / 1000.0f, A0F());
            double dA8i = this.A0G.A8i();
            if (dA8i < 0.5d && com.facebook.ads.redexgen.core.C0762Im.A1Y(this.A0D)) {
                this.A0D.A0E().AHM(java.lang.String.valueOf(dA8i));
            }
            this.A02 = i;
            if (z2 || i - this.A01 >= 5000) {
                java.lang.String str = this.A0J;
                com.facebook.ads.redexgen.core.EnumC0963Qm enumC0963Qm = com.facebook.ads.redexgen.core.EnumC0963Qm.A09;
                int i2 = this.A00 + 1;
                this.A00 = i2;
                A0Q(str, A0J(enumC0963Qm, i, i2));
                this.A01 = this.A02;
                this.A0C.A05();
                return;
            }
        }
        if (z) {
            if (this.A07 && this.A06) {
                return;
            }
            this.A06 = true;
            java.lang.String str2 = this.A0J;
            com.facebook.ads.redexgen.core.EnumC0963Qm enumC0963Qm2 = com.facebook.ads.redexgen.core.EnumC0963Qm.A09;
            int i3 = this.A00 + 1;
            this.A00 = i3;
            A0Q(str2, A0J(enumC0963Qm2, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        this.A0E.AAb(str, data);
        if (this.A03 != null) {
            this.A03.ACZ();
        }
    }

    private void A0R(java.util.Map<java.lang.String, java.lang.String> params) {
        com.facebook.ads.redexgen.core.C2R c2rA03 = this.A0C.A03();
        com.facebook.ads.redexgen.core.C2Q c2qA00 = c2rA03.A00();
        params.put(A0G(org.objectweb.asm.Opcodes.PUTFIELD, 3, 120), java.lang.String.valueOf(c2qA00.A00()));
        params.put(A0G(org.objectweb.asm.Opcodes.INVOKESTATIC, 3, 108), java.lang.String.valueOf(c2qA00.A06()));
        params.put(A0G(org.objectweb.asm.Opcodes.NEW, 5, 19), java.lang.String.valueOf(c2qA00.A03()));
        params.put(A0G(org.objectweb.asm.Opcodes.GOTO, 8, 61), java.lang.String.valueOf(c2qA00.A02() * 1000.0d));
        params.put(A0G(47, 12, 65), java.lang.String.valueOf(c2qA00.A01() * 1000.0d));
        params.put(A0G(122, 7, 81), java.lang.String.valueOf(c2qA00.A04() * 1000.0d));
        if (this.A04 != null) {
            params.put(A0G(org.objectweb.asm.Opcodes.DRETURN, 6, 4), this.A04);
        }
        com.facebook.ads.redexgen.core.C2Q c2qA01 = c2rA03.A01();
        params.put(A0G(150, 3, 59), java.lang.String.valueOf(c2qA01.A00()));
        params.put(A0G(153, 3, 71), java.lang.String.valueOf(c2qA01.A06()));
        params.put(A0G(156, 5, 85), java.lang.String.valueOf(c2qA01.A03()));
        params.put(A0G(22, 8, 35), java.lang.String.valueOf(c2qA01.A02() * 1000.0d));
        params.put(A0G(35, 12, 36), java.lang.String.valueOf(c2qA01.A01() * 1000.0d));
        params.put(A0G(115, 7, 52), java.lang.String.valueOf(c2qA01.A04() * 1000.0d));
    }

    private void A0S(java.util.Map<java.lang.String, java.lang.String> params) {
        if (this.A0K != null) {
            params.putAll(this.A0K);
        }
    }

    private void A0T(java.util.Map<java.lang.String, java.lang.String> map) {
        map.put(A0G(70, 9, 37), java.lang.String.valueOf(this.A0F.A9R()));
        map.put(A0G(org.objectweb.asm.Opcodes.I2L, 4, 90), java.lang.Long.toString(this.A0F.getInitialBufferTime()));
    }

    private void A0U(java.util.Map<java.lang.String, java.lang.String> params) {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.A0F.getGlobalVisibleRect(rect);
        params.put(A0G(org.objectweb.asm.Opcodes.L2F, 2, 90), java.lang.String.valueOf(rect.top));
        params.put(A0G(org.objectweb.asm.Opcodes.LXOR, 2, 60), java.lang.String.valueOf(rect.left));
        params.put(A0G(129, 2, 57), java.lang.String.valueOf(this.A0F.getMeasuredHeight()));
        params.put(A0G(org.objectweb.asm.Opcodes.D2F, 2, 51), java.lang.String.valueOf(this.A0F.getMeasuredWidth()));
        android.view.WindowManager windowManager = (android.view.WindowManager) this.A0D.getSystemService(A0G(192, 6, 25));
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        params.put(A0G(org.objectweb.asm.Opcodes.IF_ICMPLT, 3, 83), java.lang.String.valueOf(displayMetrics.heightPixels));
        params.put(A0G(org.objectweb.asm.Opcodes.IF_ICMPLE, 3, 76), java.lang.String.valueOf(displayMetrics.widthPixels));
    }

    private void A0V(java.util.Map<java.lang.String, java.lang.String> map, int i) {
        map.put(A0G(30, 5, 43), java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        map.put(A0G(139, 5, 33), java.lang.String.valueOf(this.A01 / 1000.0f));
        map.put(A0G(org.objectweb.asm.Opcodes.I2C, 4, 97), java.lang.String.valueOf(i / 1000.0f));
    }

    public final int A0a() {
        return this.A02;
    }

    public final android.os.Bundle A0b() {
        A0k(A0a(), A0a());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(A0G(97, 18, 74), this.A02);
        bundle.putInt(A0G(79, 18, 108), this.A01);
        bundle.putBundle(A0G(6, 16, 57), this.A0C.A02());
        return bundle;
    }

    public final void A0c() {
        if (this.A07 && this.A06) {
            return;
        }
        A0Q(this.A0J, A0I(com.facebook.ads.redexgen.core.EnumC0963Qm.A07));
    }

    public final void A0d() {
        if (this.A07 && this.A06) {
            return;
        }
        A0Q(this.A0J, A0I(com.facebook.ads.redexgen.core.EnumC0963Qm.A08));
    }

    public final void A0e() {
        if (A0F() < 0.05d) {
            synchronized (this.A0I) {
                if (this.A08) {
                    A0L();
                    this.A08 = false;
                }
            }
            return;
        }
        synchronized (this.A0I) {
            if (!this.A08) {
                A0M();
                this.A08 = true;
            }
        }
    }

    public final void A0f() {
        this.A0D.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, this.A0H);
    }

    public final void A0g() {
        this.A0D.getContentResolver().unregisterContentObserver(this.A0H);
    }

    public final void A0h(int i) {
        if (this.A07 && this.A06) {
            return;
        }
        this.A0C.A04();
        A0Q(this.A0J, A0I(com.facebook.ads.redexgen.core.EnumC0963Qm.A05));
        if (this.A05) {
            A0O(i, false, true);
        } else {
            A0O(i, false, ((double) i) < 2000.0d);
        }
        if (this.A0B) {
            this.A0C.A05();
        }
    }

    public final void A0i(int i) {
        A0O(i, true, false);
        if (!this.A07) {
            this.A01 = 0;
            this.A02 = 0;
        }
        this.A0C.A05();
        this.A0C.A04();
    }

    public final void A0j(int i) {
        A0O(i, false, false);
    }

    public final void A0k(int i, int i2) {
        A0O(i, true, false);
        this.A01 = i2;
        this.A02 = i2;
        this.A0C.A05();
        this.A0C.A04();
    }

    public final void A0l(com.facebook.ads.redexgen.core.InterfaceC0962Ql interfaceC0962Ql) {
        this.A03 = interfaceC0962Ql;
    }

    public void A0m(com.facebook.ads.redexgen.core.EnumC0963Qm enumC0963Qm, java.util.Map<java.lang.String, java.lang.String> params) {
    }

    public final void A0n(com.facebook.ads.redexgen.core.C1017So c1017So) {
        c1017So.A06 = this.A06;
        c1017So.A07 = this.A07;
        c1017So.A0A = this.A0A;
        c1017So.A09 = this.A09;
        c1017So.A02 = this.A02;
        c1017So.A01 = this.A01;
    }
}
