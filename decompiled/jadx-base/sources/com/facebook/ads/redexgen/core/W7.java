package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W7 implements com.facebook.ads.Ad, com.facebook.ads.internal.api.NativeAdBaseApi, com.facebook.ads.internal.context.Repairable, com.facebook.ads.redexgen.core.InterfaceC0776Jc {
    public static com.facebook.ads.redexgen.core.C04766f A0k;
    public static byte[] A0l;
    public static java.lang.String[] A0m = {"0QrYY16WpsBKaBkyPEA33iBIoR05UhVT", "YnnsFrkLVth43aFbA8XanJ7Af1ELV", "Oxqa2FUUnPLQ7GUfsty3Y0efzjvyqNtk", "SIKP4BEcnF1kam64buW5uj4ZKlEjFxDR", "vEVPI6RQ4lovzpZyrpWOxFDddvUHwWNp", "NGWOmnzpb", "djSS0JJWnZq1rlBsvyeXY9GnDKzed", "NhvbMWoFDj5W6o0bWnGe4dztWB8buZER"};
    public static final java.lang.String A0n;
    public static final java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.W7>> A0o;
    public long A00;
    public android.graphics.drawable.Drawable A01;
    public android.view.View.OnTouchListener A02;
    public android.view.View A03;
    public android.view.View A04;
    public android.view.View A05;
    public android.view.View A06;
    public com.facebook.ads.NativeAdLayout A07;
    public com.facebook.ads.redexgen.core.AnonymousClass12 A08;
    public com.facebook.ads.redexgen.core.C1347cJ A09;
    public com.facebook.ads.redexgen.core.C0684Fh A0A;
    public com.facebook.ads.redexgen.core.C1316bo A0B;
    public com.facebook.ads.redexgen.core.C6l A0C;
    public com.facebook.ads.redexgen.core.C8X A0D;
    public com.facebook.ads.redexgen.core.JQ A0E;
    public com.facebook.ads.redexgen.core.W9 A0F;
    public com.facebook.ads.redexgen.core.W6 A0G;
    public com.facebook.ads.redexgen.core.JW A0H;
    public com.facebook.ads.redexgen.core.JX A0I;
    public com.facebook.ads.redexgen.core.EnumC0783Jl A0J;
    public com.facebook.ads.redexgen.core.N8 A0K;
    public com.facebook.ads.redexgen.core.O6 A0L;
    public com.facebook.ads.redexgen.core.C0926Pb A0M;
    public com.facebook.ads.redexgen.core.QS A0N;
    public com.facebook.ads.redexgen.core.AbstractC0986Rj A0O;
    public com.facebook.ads.redexgen.core.AbstractC0986Rj A0P;
    public com.facebook.ads.redexgen.core.C0987Rk A0Q;
    public com.facebook.ads.redexgen.core.C0987Rk A0R;
    public java.lang.String A0S;
    public java.lang.String A0T;
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1245ac> A0U;
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.AbstractC0986Rj> A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public com.facebook.ads.redexgen.core.C1358cU A0a;
    public final com.facebook.ads.redexgen.core.C04766f A0b;
    public final com.facebook.ads.redexgen.core.C1199Zs A0c;
    public final com.facebook.ads.redexgen.core.JT A0d;
    public final com.facebook.ads.redexgen.core.C0778Je A0e;
    public final com.facebook.ads.redexgen.core.C0842Lv A0f;
    public final java.lang.String A0g;
    public final java.lang.String A0h;
    public final java.util.List<android.view.View> A0i;
    public volatile boolean A0j;

    public static java.lang.String A0W(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0l, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 112);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0d() {
        A0l = new byte[]{-32, 26, 38, 31, 30, -18, -12, -12, -12, -13, 34, 33, 33, -25, 26, -19, -20, -23, -21, 23, -23, -74, -77, -28, -74, -25, -27, -29, -77, 38, 73, 5, 83, 84, 89, 5, 81, 84, 70, 73, 74, 73, -25, 10, -6, 11, 19, 22, 18, 7, 26, 11, -58, -51, -53, 25, -51, -58, 15, 25, -58, 20, 21, 26, -58, 7, -58, 20, 7, 26, 15, 28, 11, -58, 7, 10, -33, -37, -38, 14, -3, 2, -2, 7, -4, -2, -25, -2, 13, 16, 8, 11, 4, -27, 0, 8, 11, 4, 3, -65, 19, 14, -65, 11, 14, 0, 3, -65, -20, 4, 3, 8, 0, -51, -16, 11, 19, 22, 15, 14, -54, 30, 25, -54, 25, 12, 30, 11, 19, 24, -54, 30, 15, 23, 26, 22, 11, 30, 15, -54, -13, -18, -54, 16, 28, 25, 23, -54, 12, 19, 14, -54, 26, 11, 35, 22, 25, 11, 14, -54, -47, -49, 29, -47, -23, 14, 20, 5, 18, 14, 1, 12, -64, 5, 18, 18, 15, 18, -50, -86, 30, 67, 75, 54, 65, 62, 57, -11, 72, 58, 73, -11, 68, 59, -11, 56, 65, 62, 56, 64, 54, 55, 65, 58, -11, 75, 62, 58, 76, 72, 0, 24, 23, 28, 20, 9, 28, 24, 42, -45, 25, 34, 37, -45, 28, 22, 34, 33, -45, 28, 38, -45, 28, 38, -45, 32, 28, 38, 38, 28, 33, 26, -31, 29, 53, 52, 57, 49, 38, 57, 53, 71, -16, 57, 67, -16, kotlin.io.encoding.Base64.padSymbol, 57, 67, 67, 57, 62, 55, -2, 51, 91, 89, 90, 6, 86, 88, 85, 92, 79, 74, 75, 6, 71, 6, 60, 79, 75, 93, 35, 54, 73, 62, 75, 58, -11, 22, 57, -11, 76, 54, 72, -11, 54, 65, 71, 58, 54, 57, 78, -11, 71, 58, 60, 62, 72, 73, 58, 71, 58, 57, -11, 76, 62, 73, kotlin.io.encoding.Base64.padSymbol, -11, 54, -11, 43, 62, 58, 76, 3, -11, 22, 74, 73, 68, -11, 74, 67, 71, 58, 60, 62, 72, 73, 58, 71, 62, 67, 60, -11, 54, 67, 57, -11, 69, 71, 68, 56, 58, 58, 57, 62, 67, 60, 3, -55, -36, -17, -28, -15, -32, -101, -36, -33, -101, -33, -32, -18, -17, -19, -22, -12, -32, -33, -39, -20, -1, -12, 1, -16, -85, -20, -17, -85, -9, -6, -20, -17, -85, -3, -16, -4, 0, -16, -2, -1, -16, -17, -22, -3, -7, 11, -76, -11, 0, 6, -7, -11, -8, 13, -76, 6, -7, -5, -3, 7, 8, -7, 6, -7, -8, -76, 11, -3, 8, -4, -76, -11, -76, -30, -11, 8, -3, 10, -7, -43, -8, -62, -76, -43, 9, 8, 3, -76, 9, 2, 6, -7, -5, -3, 7, 8, -7, 6, -3, 2, -5, -76, -11, 2, -8, -76, 4, 6, 3, -9, -7, -7, -8, -3, 2, -5, -62, -1, 18, 14, 32, -55, 23, 24, 29, -55, 27, 14, 16, 18, 28, 29, 14, 27, 14, 13, -55, 32, 18, 29, 17, -55, 29, 17, 18, 28, -55, -9, 10, 29, 18, 31, 14, -22, 13, 46, 49, -19, 58, 50, 49, 54, 46, -19, 65, 70, kotlin.io.encoding.Base64.padSymbol, 50, -19, 54, 64, -19, 59, 60, 65, -19, 64, 66, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 60, okio.Utf8.REPLACEMENT_BYTE, 65, 50, 49, -5, 54, 69, 62, 51, 52, 66, 67, 65, 62, 72, 81, 84, 70, 73, 38, 73, 69, 72, 58, kotlin.io.encoding.Base64.padSymbol, 26, kotlin.io.encoding.Base64.padSymbol, 1, 2, -7, 60, 58, 69, 69, 62, kotlin.io.encoding.Base64.padSymbol, -7, 70, 72, 75, 62, -7, 77, 65, 58, 71, -7, 72, 71, 60, 62, -27, -40, -21, -32, -19, -36};
        java.lang.String[] strArr = A0m;
        if (strArr[6].length() != strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        A0m[3] = "WbNUBB1XQVUYjPuN5kyqwH0pcEyoS9gz";
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0332 A[LOOP:0: B:109:0x032c->B:111:0x0332, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x035f  */
    /* JADX WARN: Code duplicated, block: B:123:0x036f  */
    /* JADX WARN: Code duplicated, block: B:125:0x037f  */
    /* JADX WARN: Code duplicated, block: B:129:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:131:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:132:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:134:0x0415  */
    /* JADX WARN: Code duplicated, block: B:147:0x0488  */
    /* JADX WARN: Code duplicated, block: B:150:0x0499  */
    /* JADX WARN: Code duplicated, block: B:151:0x049d  */
    /* JADX WARN: Code duplicated, block: B:156:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:159:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:170:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0224  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0f(android.view.View view, android.view.View view2, java.util.List<android.view.View> list, boolean z) {
        java.util.Iterator it;
        android.view.ViewOverlay overlay;
        com.facebook.ads.redexgen.core.O6 o6;
        com.facebook.ads.redexgen.core.C0895Nw c0895Nw;
        java.lang.String[] strArr;
        java.lang.String strA1B;
        if (!A0q()) {
            this.A0c.A0E().AEx();
        }
        if (view == null) {
            java.lang.String strA0W = A0W(264, 19, 118);
            if (!A0q()) {
                this.A0c.A0E().AEw(strA0W);
            }
            throw new java.lang.IllegalArgumentException(strA0W);
        }
        if (list == null || list.size() == 0) {
            java.lang.String strA0W2 = A0W(org.objectweb.asm.Opcodes.GETFIELD, 30, 101);
            if (!A0q()) {
                this.A0c.A0E().AEw(strA0W2);
            }
            throw new java.lang.IllegalArgumentException(strA0W2);
        }
        com.facebook.ads.redexgen.core.C1358cU c1358cUA0C = A0C();
        if (c1358cUA0C == null) {
            java.lang.String strA0W3 = A0W(29, 13, 117);
            if (!A0q()) {
                this.A0c.A0E().AEw(strA0W3);
            }
            android.util.Log.e(A0n, strA0W3);
            com.facebook.ads.redexgen.core.C0779Jg c0779Jg = new com.facebook.ads.redexgen.core.C0779Jg(com.facebook.ads.internal.protocol.AdErrorType.NATIVE_AD_IS_NOT_LOADED, strA0W3);
            A11().A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), c0779Jg.A03().getErrorCode(), c0779Jg.A04());
            if (!com.facebook.ads.redexgen.core.C0762Im.A2a(this.A0c) || this.A0G == null) {
                return;
            }
            this.A0G.ABs(c0779Jg);
            return;
        }
        java.lang.String str = this.A0T;
        if ((view instanceof android.widget.FrameLayout) && str != null) {
            A0g((android.widget.FrameLayout) view, str);
        }
        if (this.A07 != null) {
            ((com.facebook.ads.redexgen.core.C1228aL) this.A07.getNativeAdLayoutApi()).A02();
        }
        com.facebook.ads.redexgen.core.C1245ac c1245ac = this.A0U.get();
        if (c1245ac != null && c1358cUA0C.A08() == 1) {
            c1245ac.A03(com.facebook.ads.redexgen.core.MB.AN_INFO_ICON);
        }
        if (view2 != null) {
            boolean z2 = (view2 instanceof com.facebook.ads.internal.api.AdNativeComponentView) && ((com.facebook.ads.internal.api.AdNativeComponentView) view2).getAdContentsView() != null;
            boolean z3 = z && (view2 instanceof android.widget.ImageView);
            if (!z2 && !z3) {
                if (this.A0G != null) {
                    com.facebook.ads.redexgen.core.C0779Jg c0779Jg2 = new com.facebook.ads.redexgen.core.C0779Jg(com.facebook.ads.internal.protocol.AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD, A0W(519, 31, 93));
                    A11().A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), c0779Jg2.A03().getErrorCode(), c0779Jg2.A04());
                    this.A0G.ABs(c0779Jg2);
                    return;
                }
                return;
            }
            android.view.View view3 = this.A04;
            if (A0m[3].charAt(5) != 'B') {
                java.lang.String[] strArr2 = A0m;
                strArr2[6] = "BCYbWK19bS9ET6nCyqUucyCTxntwC";
                strArr2[1] = "hUEQWKvNS0BeeCCeuSbrKV1BB6cqb";
                if (view3 != null) {
                    android.util.Log.w(A0n, A0W(283, 80, 101));
                    unregisterView();
                }
            } else {
                A0m[3] = "VFOGhBJepBYKNQ0g15YaI4y2lFqguygQ";
                if (view3 != null) {
                    android.util.Log.w(A0n, A0W(283, 80, 101));
                    unregisterView();
                }
            }
            boolean zContainsKey = A0o.containsKey(view);
            java.lang.String[] strArr3 = A0m;
            if (strArr3[6].length() != strArr3[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr4 = A0m;
            strArr4[0] = "r1dCEV0W05obqeylsxysUOCLLtyqbDkO";
            strArr4[4] = "jsU6g8E1kSPqSuKqGJQzSRDrUMjHNr5E";
            if (zContainsKey && A0o.get(view).get() != null) {
                android.util.Log.w(A0n, A0W(406, 75, 36));
                A0o.get(view).get().unregisterView();
            }
            this.A0F = new com.facebook.ads.redexgen.core.W9(this, this.A0c, null);
            this.A04 = view;
            this.A06 = view2;
            if (view instanceof android.view.ViewGroup) {
                this.A0K = new com.facebook.ads.redexgen.core.N8(this.A0c, new com.facebook.ads.redexgen.core.WD(this));
                ((android.view.ViewGroup) view).addView(this.A0K);
            }
            if (c1358cUA0C.A0S()) {
                this.A0O = new com.facebook.ads.redexgen.core.WC(this);
                this.A0Q = new com.facebook.ads.redexgen.core.C0987Rk(view, 1, new java.lang.ref.WeakReference(this.A0O), this.A0c);
                this.A0Q.A0Y(false);
                this.A0Q.A0X(c1358cUA0C.A09());
                this.A0Q.A0U();
                this.A0c.A0E().AAt();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(list);
            if (this.A05 != null) {
                android.view.View view4 = this.A05;
                java.lang.String[] strArr5 = A0m;
                if (strArr5[2].charAt(3) != strArr5[7].charAt(3)) {
                    java.lang.String[] strArr6 = A0m;
                    strArr6[0] = "7BxfhPTBtrovnc2SNqJYjum2f5qDPcpL";
                    strArr6[4] = "Q5pxYg7VFdMmLRDnYTITcnTwa1eIsVWj";
                    arrayList.add(view4);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        A1K((android.view.View) it.next());
                    }
                    com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cDA0z = A0z();
                    if (z && abstractC1341cDA0z != null && abstractC1341cDA0z.A18()) {
                        A1K(view);
                        arrayList.add(view);
                    }
                    int iA00 = A00();
                    this.A0P = new com.facebook.ads.redexgen.core.WB(this, view2, z3, c1358cUA0C);
                    if (view2 instanceof com.facebook.ads.internal.api.AdNativeComponentView) {
                        this.A03 = ((com.facebook.ads.internal.api.AdNativeComponentView) view2).getAdContentsView();
                    } else {
                        this.A03 = view2;
                    }
                    if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A0c)) {
                        strA1B = A1B();
                        com.facebook.ads.redexgen.core.JJ jjA0A = A11().A0A();
                        android.view.View view5 = this.A03;
                        if (strA1B == null) {
                            strA1B = A0W(0, 0, 121);
                        }
                        jjA0A.AHP(view5, strA1B, this.A03 instanceof com.facebook.ads.redexgen.core.C0966Qp, true);
                    }
                    this.A0R = new com.facebook.ads.redexgen.core.C0987Rk(this.A03, iA00, A03(), true, new java.lang.ref.WeakReference(this.A0P), this.A0c);
                    this.A0R.A0Y(!A0q());
                    this.A0R.A0W(A01());
                    this.A0R.A0X(A02());
                    if (this.A03 instanceof com.facebook.ads.redexgen.core.C0895Nw) {
                        this.A09 = new com.facebook.ads.redexgen.core.C1347cJ(this.A0c, new com.facebook.ads.redexgen.core.W8(this, null), this.A0R, this.A0a);
                        this.A09.A0D(arrayList);
                        A0o.put(view, new java.lang.ref.WeakReference<>(this));
                        if (android.os.Build.VERSION.SDK_INT >= 18) {
                            return;
                        } else {
                            return;
                        }
                    }
                    c0895Nw = (com.facebook.ads.redexgen.core.C0895Nw) this.A03;
                    strArr = A0m;
                    if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                        A0m[3] = "9jWMkBrIWAaQq3BshIoiK9kOFApm7Mnb";
                        c0895Nw.A06(this.A0R);
                        this.A09 = new com.facebook.ads.redexgen.core.C1347cJ(this.A0c, new com.facebook.ads.redexgen.core.W8(this, null), this.A0R, this.A0a);
                        this.A09.A0D(arrayList);
                        A0o.put(view, new java.lang.ref.WeakReference<>(this));
                        if (android.os.Build.VERSION.SDK_INT >= 18 || !com.facebook.ads.redexgen.core.C0762Im.A16(this.A0c)) {
                            return;
                        }
                        this.A0L = new com.facebook.ads.redexgen.core.O6();
                        this.A0L.A0C(this.A0g);
                        this.A0L.A0B(this.A0c.getPackageName());
                        this.A0L.A0A(this.A0R);
                        if (this.A0a == null || this.A0a.A0E().A03() <= 0) {
                            if (this.A0D != null) {
                                o6 = this.A0L;
                                if (A0m[3].charAt(5) == 'B') {
                                    java.lang.String[] strArr7 = A0m;
                                    strArr7[0] = "0NneDoUmBBax1k2al7sn5wGz6YlJvYnm";
                                    strArr7[4] = "TUOAUmE75XZKXYZI7fK9pdpTcTx58G4M";
                                    o6.A09(this.A0D.A0C());
                                }
                            } else if (this.A0A != null && this.A0A.A0I() != null) {
                                this.A0L.A09(this.A0A.A0I().A0C());
                            }
                            overlay = this.A04.getOverlay();
                            if (A0m[3].charAt(5) != 'B') {
                                A0m[3] = "phIEPBH6I0ughovInGkhz8ZisPRzHBk3";
                                overlay.add(this.A0L);
                                return;
                            } else {
                                java.lang.String[] strArr8 = A0m;
                                strArr8[2] = "gnfKTnhAP88IqIDCyFwPWRuvnh0aHtXe";
                                strArr8[7] = "JILhdROEHVygs9M2n2U0jFxigvp1iBje";
                                overlay.add(this.A0L);
                                return;
                            }
                        }
                        com.facebook.ads.redexgen.core.C1346cI c1346cIA0E = this.A0a.A0E();
                        java.lang.String[] strArr9 = A0m;
                        if (strArr9[6].length() == strArr9[1].length()) {
                            java.lang.String[] strArr10 = A0m;
                            strArr10[0] = "InlaPqSCsodlo1snRpIwz8DPt1ADYzZZ";
                            strArr10[4] = "FtfMBLderHMiZZFXfgJZWbC0srgJcpuD";
                            this.A0L.A08(c1346cIA0E.A03(), c1346cIA0E.A04());
                            if (this.A0D != null) {
                                o6 = this.A0L;
                                if (A0m[3].charAt(5) == 'B') {
                                    java.lang.String[] strArr11 = A0m;
                                    strArr11[0] = "0NneDoUmBBax1k2al7sn5wGz6YlJvYnm";
                                    strArr11[4] = "TUOAUmE75XZKXYZI7fK9pdpTcTx58G4M";
                                    o6.A09(this.A0D.A0C());
                                }
                            } else if (this.A0A != null) {
                                this.A0L.A09(this.A0A.A0I().A0C());
                            }
                            overlay = this.A04.getOverlay();
                            if (A0m[3].charAt(5) != 'B') {
                                A0m[3] = "phIEPBH6I0ughovInGkhz8ZisPRzHBk3";
                                overlay.add(this.A0L);
                                return;
                            } else {
                                java.lang.String[] strArr12 = A0m;
                                strArr12[2] = "gnfKTnhAP88IqIDCyFwPWRuvnh0aHtXe";
                                strArr12[7] = "JILhdROEHVygs9M2n2U0jFxigvp1iBje";
                                overlay.add(this.A0L);
                                return;
                            }
                        }
                    }
                }
            } else {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    A1K((android.view.View) it.next());
                }
                com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cDA0z2 = A0z();
                if (z) {
                    A1K(view);
                    arrayList.add(view);
                }
                int iA01 = A00();
                this.A0P = new com.facebook.ads.redexgen.core.WB(this, view2, z3, c1358cUA0C);
                if (view2 instanceof com.facebook.ads.internal.api.AdNativeComponentView) {
                    this.A03 = ((com.facebook.ads.internal.api.AdNativeComponentView) view2).getAdContentsView();
                } else {
                    this.A03 = view2;
                }
                if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A0c)) {
                    strA1B = A1B();
                    com.facebook.ads.redexgen.core.JJ jjA0A2 = A11().A0A();
                    android.view.View view6 = this.A03;
                    if (strA1B == null) {
                        strA1B = A0W(0, 0, 121);
                    }
                    jjA0A2.AHP(view6, strA1B, this.A03 instanceof com.facebook.ads.redexgen.core.C0966Qp, true);
                }
                this.A0R = new com.facebook.ads.redexgen.core.C0987Rk(this.A03, iA01, A03(), true, new java.lang.ref.WeakReference(this.A0P), this.A0c);
                this.A0R.A0Y(!A0q());
                this.A0R.A0W(A01());
                this.A0R.A0X(A02());
                if (this.A03 instanceof com.facebook.ads.redexgen.core.C0895Nw) {
                    this.A09 = new com.facebook.ads.redexgen.core.C1347cJ(this.A0c, new com.facebook.ads.redexgen.core.W8(this, null), this.A0R, this.A0a);
                    this.A09.A0D(arrayList);
                    A0o.put(view, new java.lang.ref.WeakReference<>(this));
                    if (android.os.Build.VERSION.SDK_INT >= 18) {
                        return;
                    } else {
                        return;
                    }
                }
                c0895Nw = (com.facebook.ads.redexgen.core.C0895Nw) this.A03;
                strArr = A0m;
                if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                    A0m[3] = "9jWMkBrIWAaQq3BshIoiK9kOFApm7Mnb";
                    c0895Nw.A06(this.A0R);
                    this.A09 = new com.facebook.ads.redexgen.core.C1347cJ(this.A0c, new com.facebook.ads.redexgen.core.W8(this, null), this.A0R, this.A0a);
                    this.A09.A0D(arrayList);
                    A0o.put(view, new java.lang.ref.WeakReference<>(this));
                    if (android.os.Build.VERSION.SDK_INT >= 18) {
                        return;
                    } else {
                        return;
                    }
                }
            }
        } else {
            if (this.A0J != com.facebook.ads.redexgen.core.EnumC0783Jl.A06) {
                com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.NO_MEDIAVIEW_IN_NATIVEBANNERAD;
                java.lang.String strA0W4 = A0W(210, 33, 67);
                com.facebook.ads.redexgen.core.C0779Jg c0779Jg3 = new com.facebook.ads.redexgen.core.C0779Jg(adErrorType, strA0W4);
                A11().A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), c0779Jg3.A03().getErrorCode(), c0779Jg3.A04());
                if (this.A0G != null) {
                    this.A0G.ABs(c0779Jg3);
                }
                if (com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                    java.lang.String str2 = A0n;
                    if (A0m[3].charAt(5) == 'B') {
                        A0m[3] = "KISMvB3VNIc1t4pH9OUWIwxPU7abTBQu";
                        android.util.Log.e(str2, strA0W4);
                        return;
                    } else {
                        java.lang.String[] strArr13 = A0m;
                        strArr13[2] = "I0o2CociGt9PfWtihtc1uzdPzn26Oc3b";
                        strArr13[7] = "DL9r7FwT46CQ5uSYOng5HfHjynm8xWWf";
                        android.util.Log.e(str2, strA0W4);
                        return;
                    }
                }
                return;
            }
            com.facebook.ads.internal.protocol.AdErrorType adErrorType2 = com.facebook.ads.internal.protocol.AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD;
            java.lang.String strA0W5 = A0W(243, 21, 96);
            com.facebook.ads.redexgen.core.C0779Jg c0779Jg4 = new com.facebook.ads.redexgen.core.C0779Jg(adErrorType2, strA0W5);
            A11().A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), c0779Jg4.A03().getErrorCode(), c0779Jg4.A04());
            if (this.A0G != null) {
                this.A0G.ABs(c0779Jg4);
            }
            if (!com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                return;
            }
            java.lang.String str3 = A0n;
            if (A0m[5].length() != 3) {
                java.lang.String[] strArr14 = A0m;
                strArr14[0] = "ymh7ZtbYw7oyMwS2HukMuI2t1Xj3fY7y";
                strArr14[4] = "GGURsKjIWyfUU1Vu9BOr0pf9u6pcVKo4";
                android.util.Log.e(str3, strA0W5);
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    static {
        A0d();
        A0n = com.facebook.ads.redexgen.core.W7.class.getSimpleName();
        A0o = new java.util.WeakHashMap<>();
    }

    public W7(android.content.Context context, java.lang.String str, com.facebook.ads.redexgen.core.JT jt, boolean z) {
        this.A0h = java.util.UUID.randomUUID().toString();
        this.A0J = com.facebook.ads.redexgen.core.EnumC0783Jl.A06;
        this.A0E = com.facebook.ads.redexgen.core.JQ.A04;
        this.A08 = com.facebook.ads.redexgen.core.AnonymousClass12.A03;
        this.A0U = new java.lang.ref.WeakReference<>(null);
        this.A0i = new java.util.ArrayList();
        this.A0f = new com.facebook.ads.redexgen.core.C0842Lv();
        this.A0Z = false;
        this.A0Y = false;
        this.A00 = -1L;
        if (context instanceof com.facebook.ads.redexgen.core.C1199Zs) {
            this.A0c = (com.facebook.ads.redexgen.core.C1199Zs) context;
        } else if (!z) {
            this.A0c = com.facebook.ads.redexgen.core.C04465b.A04(context);
        } else {
            this.A0c = com.facebook.ads.redexgen.core.C04465b.A03(context);
        }
        this.A0c.A0N(this);
        this.A0g = str;
        this.A0d = jt;
        if (A0k != null) {
            this.A0b = A0k;
        } else {
            this.A0b = new com.facebook.ads.redexgen.core.C04766f(this.A0c);
        }
        this.A05 = new android.view.View(context);
        this.A0e = new com.facebook.ads.redexgen.core.C0778Je(this.A0c, this);
    }

    public W7(com.facebook.ads.redexgen.core.W7 w7) {
        this((android.content.Context) w7.A0c, (java.lang.String) null, w7.A0d, true);
        this.A0D = w7.A0D;
        this.A0a = w7.A0a;
        this.A0B = w7.A0B;
        this.A0j = true;
        this.A05 = new android.view.View(this.A0c);
    }

    public W7(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1358cU c1358cU, com.facebook.ads.redexgen.core.C8X c8x, com.facebook.ads.redexgen.core.JT jt) {
        this((android.content.Context) c1199Zs, (java.lang.String) null, jt, true);
        this.A0a = c1358cU;
        this.A0D = c8x;
        this.A0j = true;
        this.A05 = new android.view.View(c1199Zs);
    }

    public W7(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1358cU c1358cU, com.facebook.ads.redexgen.core.C8X c8x, com.facebook.ads.redexgen.core.JT jt, com.facebook.ads.redexgen.core.C1316bo c1316bo) {
        this(c1199Zs, c1358cU, c8x, jt);
        this.A0B = c1316bo;
    }

    private int A00() {
        if (this.A0D != null) {
            return this.A0D.A04();
        }
        if (this.A0A == null || this.A0A.A0I() == null) {
            return 1;
        }
        com.facebook.ads.redexgen.core.C8X c8xA0I = this.A0A.A0I();
        java.lang.String[] strArr = A0m;
        java.lang.String str = strArr[6];
        java.lang.String str2 = strArr[1];
        int length = str.length();
        int viewabilityThreshold = str2.length();
        if (length != viewabilityThreshold) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0m;
        strArr2[2] = "P5kYLn6xwAUrjDfDuw88TuaVt88D3vtD";
        strArr2[7] = "ZJzVQNISDO4cH7XUZ38T2d7bCdM1k8uN";
        return c8xA0I.A04();
    }

    private int A01() {
        if (this.A0D != null) {
            return this.A0D.A07();
        }
        if (this.A0a != null) {
            return this.A0a.A0C();
        }
        if (this.A0A != null && this.A0A.A0I() != null) {
            return this.A0A.A0I().A07();
        }
        return 0;
    }

    private int A02() {
        if (this.A0D != null) {
            return this.A0D.A08();
        }
        if (this.A0a != null) {
            return this.A0a.A0D();
        }
        if (this.A0A != null && this.A0A.A0I() != null) {
            return this.A0A.A0I().A08();
        }
        return 1000;
    }

    private int A03() {
        if (this.A0D != null) {
            return this.A0D.A09();
        }
        com.facebook.ads.redexgen.core.C0684Fh c0684Fh = this.A0A;
        if (A0m[3].charAt(5) != 'B') {
            throw new java.lang.RuntimeException();
        }
        A0m[5] = "Xt";
        if (c0684Fh == null || this.A0A.A0I() == null) {
            return 0;
        }
        return this.A0A.A0I().A09();
    }

    public static android.graphics.drawable.Drawable A05(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.graphics.Bitmap bitmap, boolean z, java.lang.String str) {
        android.graphics.drawable.BitmapDrawable bitmapDrawableA00;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(c1199Zs.getResources(), bitmap);
        if (z && (bitmapDrawableA00 = com.facebook.ads.redexgen.core.QR.A00(c1199Zs, str)) != null) {
            android.graphics.drawable.Drawable iconViewDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bitmapDrawable, bitmapDrawableA00});
            return iconViewDrawable;
        }
        return bitmapDrawable;
    }

    public static com.facebook.ads.NativeAdBase A0A(android.content.Context context, java.lang.String str, java.lang.String str2) throws com.facebook.ads.redexgen.core.C0780Jh {
        com.facebook.ads.redexgen.core.EnumC0783Jl enumC0783JlA00 = com.facebook.ads.redexgen.core.C0788Jq.A00(str2);
        if (enumC0783JlA00 != null) {
            com.facebook.ads.redexgen.core.EnumC0783Jl template = com.facebook.ads.redexgen.core.EnumC0783Jl.A05;
            if (enumC0783JlA00 == template) {
                return new com.facebook.ads.NativeBannerAd(context, str);
            }
            com.facebook.ads.redexgen.core.EnumC0783Jl template2 = com.facebook.ads.redexgen.core.EnumC0783Jl.A06;
            if (enumC0783JlA00 == template2) {
                return new com.facebook.ads.NativeAd(context, str);
            }
            throw new com.facebook.ads.redexgen.core.C0780Jh(com.facebook.ads.internal.protocol.AdErrorType.BID_PAYLOAD_ERROR, java.lang.String.format(java.util.Locale.US, A0W(42, 34, 54), enumC0783JlA00));
        }
        throw new com.facebook.ads.redexgen.core.C0780Jh(com.facebook.ads.internal.protocol.AdErrorType.BID_PAYLOAD_ERROR, java.lang.String.format(java.util.Locale.US, A0W(114, 50, 58), str2));
    }

    private final com.facebook.ads.redexgen.core.C1358cU A0C() {
        com.facebook.ads.redexgen.core.C1358cU c1358cU = this.A0a;
        if (c1358cU != null && c1358cU.A0R()) {
            return c1358cU;
        }
        return null;
    }

    private com.facebook.ads.redexgen.core.C1346cI A0F() {
        return A0G(false);
    }

    private com.facebook.ads.redexgen.core.C1346cI A0G(boolean z) {
        if (this.A0a != null) {
            com.facebook.ads.redexgen.core.C1358cU c1358cU = this.A0a;
            if (A0m[3].charAt(5) == 'B') {
                java.lang.String[] strArr = A0m;
                strArr[0] = "rkQiEYXoMEhriwkmxTS9YqbekXjRctvV";
                strArr[4] = "aQIgqL6bCxVEsMgFZvYj1f08oAvgjHgO";
                if (c1358cU.A0R()) {
                    if (z) {
                        com.facebook.ads.redexgen.core.C1358cU c1358cU2 = this.A0a;
                        if (A0m[3].charAt(5) == 'B') {
                            A0m[3] = "EWl26Bqfon8mX0lHHC6z05409Pwx5AXq";
                            c1358cU2.A0I();
                        }
                    }
                    return this.A0a.A0E();
                }
            }
            throw new java.lang.RuntimeException();
        }
        return new com.facebook.ads.redexgen.core.C1346cI();
    }

    public static com.facebook.ads.redexgen.core.WA A0K() {
        return new com.facebook.ads.redexgen.core.WA();
    }

    public static com.facebook.ads.redexgen.core.W7 A0L(com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof java.lang.reflect.Proxy) {
            return (com.facebook.ads.redexgen.core.W7) ((com.facebook.ads.redexgen.core.C5L) java.lang.reflect.Proxy.getInvocationHandler(nativeAdBaseApi)).A04();
        }
        return (com.facebook.ads.redexgen.core.W7) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.JU getAdChoicesIcon() {
        return A0F().A0D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.JV getAdStarRating() {
        return A0F().A0G();
    }

    private com.facebook.ads.internal.protocol.AdPlacementType A0R() {
        if (this.A0J == com.facebook.ads.redexgen.core.EnumC0783Jl.A06) {
            return com.facebook.ads.internal.protocol.AdPlacementType.NATIVE;
        }
        return com.facebook.ads.internal.protocol.AdPlacementType.NATIVE_BANNER;
    }

    private void A0Z() {
        for (android.view.View view : this.A0i) {
            view.setOnClickListener(null);
            if (A0m[3].charAt(5) != 'B') {
                throw new java.lang.RuntimeException();
            }
            A0m[3] = "reBfvBMaH6BqwlxZ2WqAQZq3knZpIvyz";
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.A0i.clear();
    }

    private void A0a() {
        if (!android.text.TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            com.facebook.ads.redexgen.core.L2.A0M(new com.facebook.ads.redexgen.core.L2(), this.A0c, com.facebook.ads.redexgen.core.L5.A00(getAdChoicesLinkUrl()), A1B());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0b() {
        this.A0f.A05();
        this.A0e.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c() {
        if (this.A0Q != null) {
            this.A0Q.A0V();
            this.A0c.A0E().AAu();
            this.A0Q = null;
        }
    }

    public static void A0e(android.graphics.drawable.Drawable drawable, android.widget.ImageView imageView) {
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        int i = android.os.Build.VERSION.SDK_INT;
        if (A0m[3].charAt(5) != 'B') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0m;
        strArr[6] = "LXDT52DRzEPuIKBbeK5QN38hLQjcy";
        strArr[1] = "Z1aNossC2MxjaxQyIIrn4vHalGw3J";
        if (i >= 16) {
            imageView.setBackground(null);
        } else {
            imageView.setBackgroundDrawable(null);
        }
    }

    private void A0g(android.widget.FrameLayout frameLayout, java.lang.String str) {
        if (this.A0N != null) {
            frameLayout.removeView(this.A0N);
        }
        this.A0N = com.facebook.ads.redexgen.core.QR.A01(com.facebook.ads.redexgen.core.C04465b.A03(this.A0c), str);
        if (this.A0N != null) {
            frameLayout.addView(this.A0N, new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0N);
        }
    }

    private void A0h(com.facebook.ads.redexgen.core.C1358cU c1358cU, boolean z) {
        if (c1358cU == null) {
            return;
        }
        boolean zEquals = this.A0E.equals(com.facebook.ads.redexgen.core.JQ.A04);
        java.lang.String strA0W = A0W(596, 6, 7);
        if (zEquals) {
            com.facebook.ads.redexgen.core.C1346cI c1346cIA0E = c1358cU.A0E();
            java.lang.String clientToken = c1358cU.A6r();
            if (!android.text.TextUtils.isEmpty(clientToken)) {
                this.A0b.A0d(new com.facebook.ads.redexgen.core.JF(clientToken, this.A0c.A09()));
            }
            com.facebook.ads.redexgen.core.JU juA0F = c1346cIA0E.A0F();
            java.lang.String[] strArr = A0m;
            if (strArr[2].charAt(3) == strArr[7].charAt(3)) {
                throw new java.lang.RuntimeException();
            }
            A0m[3] = "olK6BBrMvSH2F6L4J2jXYHYWLLMocGr7";
            if (juA0F != null) {
                com.facebook.ads.redexgen.core.C04746d c04746d = new com.facebook.ads.redexgen.core.C04746d(c1346cIA0E.A0F().getUrl(), c1346cIA0E.A0F().getHeight(), c1346cIA0E.A0F().getWidth(), c1358cU.A0G(), A0W(596, 6, 7));
                c04746d.A00 = this.A0C;
                this.A0b.A0V();
                this.A0b.A0b(c04746d);
            }
            if (!this.A0J.equals(com.facebook.ads.redexgen.core.EnumC0783Jl.A05)) {
                if (c1346cIA0E.A0E() != null) {
                    this.A0b.A0b(new com.facebook.ads.redexgen.core.C04746d(c1346cIA0E.A0E().getUrl(), c1346cIA0E.A0E().getHeight(), c1346cIA0E.A0E().getWidth(), c1358cU.A0G(), A0W(596, 6, 7)));
                }
                if (c1358cU.A0H() != null) {
                    for (com.facebook.ads.redexgen.core.W7 w7 : c1358cU.A0H()) {
                        if (w7.getAdCoverImage() != null) {
                            this.A0b.A0b(new com.facebook.ads.redexgen.core.C04746d(w7.getAdCoverImage().getUrl(), w7.getAdCoverImage().getHeight(), w7.getAdCoverImage().getWidth(), c1358cU.A0G(), A0W(596, 6, 7)));
                        }
                    }
                }
                java.lang.String strA0b = c1346cIA0E.A0b();
                if (!android.text.TextUtils.isEmpty(strA0b)) {
                    this.A0b.A0a(new com.facebook.ads.redexgen.core.C04726b(strA0b, c1358cU.A0G(), A0W(596, 6, 7), c1346cIA0E.A0A()));
                }
            }
            com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cDA0C = c1346cIA0E.A0C();
            if (abstractC1341cDA0C != null && abstractC1341cDA0C.A19()) {
                com.facebook.ads.redexgen.core.C04726b c04726b = new com.facebook.ads.redexgen.core.C04726b(abstractC1341cDA0C.A0Z(), abstractC1341cDA0C.A0l(), strA0W);
                c04726b.A04 = true;
                c04726b.A03 = A0W(0, 5, 66);
                this.A0b.A0X(c04726b);
            }
        }
        this.A0b.A0W(new com.facebook.ads.redexgen.core.WE(this, c1358cU, z), new com.facebook.ads.redexgen.core.C6Y(c1358cU.A0G(), strA0W));
    }

    private void A0i(com.facebook.ads.redexgen.core.AnonymousClass14 anonymousClass14) {
        if (this.A0a == null) {
            return;
        }
        this.A0a.A0K(anonymousClass14);
    }

    public static void A0j(com.facebook.ads.internal.api.NativeAdImageApi nativeAdImageApi, android.widget.ImageView imageView, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        if (nativeAdImageApi != null && imageView != null) {
            new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(imageView, c1199Zs).A05(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A07(nativeAdImageApi.getUrl());
        }
    }

    private final void A0m(com.facebook.ads.redexgen.core.W6 w6) {
        this.A0G = w6;
    }

    private final void A0n(java.lang.String str) {
        this.A0S = str;
    }

    private void A0o(java.util.List<android.view.View> list, android.view.View view) {
        if (this.A0d != null && this.A0d.AGk(view)) {
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A0o(list, viewGroup.getChildAt(i));
            }
            return;
        }
        list.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0p() {
        return A18() == com.facebook.ads.redexgen.core.JZ.A05 || A18() == com.facebook.ads.redexgen.core.JZ.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0q() {
        return A0F().A0e();
    }

    public final long A0x() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.C1358cU A0y() {
        return this.A0a;
    }

    public final com.facebook.ads.redexgen.core.AbstractC1341cD A0z() {
        return A0F().A0C();
    }

    public final com.facebook.ads.redexgen.core.C04766f A10() {
        return this.A0b;
    }

    public final com.facebook.ads.redexgen.core.C1199Zs A11() {
        return this.A0c;
    }

    public final com.facebook.ads.redexgen.core.W9 A12() {
        return this.A0F;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A13, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.JU getAdCoverImage() {
        return A0F().A0E();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A14, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.JU getAdIcon() {
        return A0F().A0F();
    }

    public final com.facebook.ads.redexgen.core.W6 A15() {
        return this.A0G;
    }

    public final com.facebook.ads.redexgen.core.JW A16() {
        return this.A0H;
    }

    public final com.facebook.ads.redexgen.core.JX A17() {
        return this.A0I;
    }

    public final com.facebook.ads.redexgen.core.JZ A18() {
        return A0F().A0H();
    }

    public final com.facebook.ads.redexgen.core.C0842Lv A19() {
        return this.A0f;
    }

    public final com.facebook.ads.redexgen.core.C0987Rk A1A() {
        return this.A0R;
    }

    public final java.lang.String A1B() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A6r();
    }

    public final java.lang.String A1C() {
        return this.A0T;
    }

    public final java.lang.String A1D() {
        return A0G(true).A0N();
    }

    public final java.lang.String A1E() {
        return A0G(true).A0O();
    }

    public final java.lang.String A1F() {
        return A0F().A0a();
    }

    public final java.lang.String A1G() {
        if (this.A0a == null || android.text.TextUtils.isEmpty(this.A0a.A0E().A0b())) {
            return null;
        }
        return this.A0b.A0S(this.A0a.A0E().A0b());
    }

    public final java.util.List<com.facebook.ads.redexgen.core.W7> A1H() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A0H();
    }

    public final void A1I() {
        if (!com.facebook.ads.redexgen.core.C2T.A00(this.A0c.A01()).A0O(this.A0c, false)) {
            A0a();
            if (A0m[5].length() == 3) {
                throw new java.lang.RuntimeException();
            }
            A0m[3] = "yREZ0BSYt8CSunaR9f1myx0zIAs3a5bO";
            return;
        }
        com.facebook.ads.redexgen.core.NE neA01 = com.facebook.ads.redexgen.core.NF.A01(this.A0c, this.A0c.A09(), A1B(), this.A07);
        if (neA01 == null) {
            A0a();
        } else {
            ((com.facebook.ads.redexgen.core.C1228aL) this.A07.getNativeAdLayoutApi()).A03(neA01);
            neA01.A0K();
        }
    }

    public final void A1J(android.graphics.drawable.Drawable drawable) {
        this.A01 = drawable;
        A1e(drawable != null, true);
    }

    public final void A1K(android.view.View view) {
        this.A0i.add(view);
        view.setOnClickListener(this.A0F);
        view.setOnTouchListener(this.A0F);
        if (android.os.Build.VERSION.SDK_INT >= 18 && com.facebook.ads.redexgen.core.C0762Im.A16(view.getContext())) {
            view.setOnLongClickListener(this.A0F);
        }
    }

    public final void A1L(android.view.View view, android.widget.ImageView imageView) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        A0o(arrayList, view);
        A0f(view, imageView, arrayList, true);
    }

    public final void A1M(android.view.View view, android.widget.ImageView imageView, java.util.List<android.view.View> clickableViews) {
        A0f(view, imageView, clickableViews, true);
    }

    public final void A1N(android.view.View view, com.facebook.ads.internal.api.AdNativeComponentView adNativeComponentView) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        A0o(arrayList, view);
        A0f(view, adNativeComponentView, arrayList, false);
    }

    public final void A1O(android.view.View view, com.facebook.ads.internal.api.AdNativeComponentView adNativeComponentView, java.util.List<android.view.View> clickableViews) {
        A0f(view, adNativeComponentView, clickableViews, false);
    }

    public final void A1P(android.view.View view, com.facebook.ads.internal.api.AdNativeComponentView adNativeComponentView, java.util.List<android.view.View> clickableViews, boolean z) {
        A0f(view, adNativeComponentView, clickableViews, z);
    }

    public final void A1Q(android.view.View view, com.facebook.ads.internal.api.AdNativeComponentView adNativeComponentView, boolean z) {
        java.util.List<android.view.View> clickableViews = new java.util.ArrayList<>();
        A0o(clickableViews, view);
        A0f(view, adNativeComponentView, clickableViews, z);
    }

    public final void A1R(com.facebook.ads.MediaView mediaView) {
        if (mediaView != null) {
            this.A0Y = true;
        }
    }

    public final void A1S(com.facebook.ads.MediaView mediaView) {
        if (mediaView != null) {
            this.A0Z = true;
        }
    }

    public final void A1T(com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        A0m(new com.facebook.ads.redexgen.core.CN(nativeAdListener, nativeAdBase));
    }

    public final void A1U(com.facebook.ads.NativeAdLayout nativeAdLayout) {
        this.A07 = nativeAdLayout;
    }

    public final void A1V(com.facebook.ads.redexgen.core.C1358cU c1358cU) {
        A0h(c1358cU, true);
        if (this.A0G != null && c1358cU.A0H() != null) {
            com.facebook.ads.redexgen.core.WG wg = new com.facebook.ads.redexgen.core.WG(this);
            for (com.facebook.ads.redexgen.core.W7 w7 : c1358cU.A0H()) {
                if (A0m[3].charAt(5) != 'B') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0m;
                strArr[0] = "7JUEXy8BV6wMe69mvRG8Hisl1h58kfsH";
                strArr[4] = "Ag7M0cktqfZPxcWhbEyn8XCMGlxm5ALn";
                w7.A0i(wg);
            }
        }
    }

    public final void A1W(com.facebook.ads.redexgen.core.C1245ac c1245ac) {
        this.A0U = new java.lang.ref.WeakReference<>(c1245ac);
    }

    public final void A1X(com.facebook.ads.redexgen.core.JQ jq, java.lang.String str, com.facebook.ads.redexgen.core.C6l c6l) {
        if (str == null) {
            this.A0c.A0E().A3B();
        } else {
            this.A0c.A0E().A3A();
        }
        this.A00 = java.lang.System.currentTimeMillis();
        boolean z = this.A0j;
        java.lang.String[] strArr = A0m;
        if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
            java.lang.String[] strArr2 = A0m;
            strArr2[0] = "knecuAJjZigTf7VsFCGhTGCW7dxKplKn";
            strArr2[4] = "uRrNlLGUJL1gxvEKewtOLFu1Ztix0dl1";
            if (z) {
                com.facebook.ads.AdSettings.IntegrationErrorMode integrationErrorModeA00 = com.facebook.ads.redexgen.core.AbstractC03651w.A00(this.A0c);
                java.lang.String strA0W = A0W(566, 30, 105);
                com.facebook.ads.AdSettings.IntegrationErrorMode integrationErrorMode = com.facebook.ads.AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
                if (!integrationErrorMode.equals(integrationErrorModeA00)) {
                    com.facebook.ads.redexgen.core.C0779Jg c0779Jg = new com.facebook.ads.redexgen.core.C0779Jg(com.facebook.ads.internal.protocol.AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0W(566, 30, 105));
                    A11().A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), c0779Jg.A03().getErrorCode(), c0779Jg.A04());
                    if (this.A0G != null) {
                        this.A0G.ABs(c0779Jg);
                    } else {
                        android.util.Log.e(A0W(76, 17, 41), strA0W);
                    }
                    com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(strA0W);
                    A11().A07().AA0(A0W(550, 3, 101), com.facebook.ads.redexgen.core.C8E.A0c, c8f);
                } else {
                    throw new com.facebook.ads.redexgen.core.AnonymousClass21(strA0W);
                }
            }
            this.A0j = true;
            this.A0E = jq;
            if (jq.equals(com.facebook.ads.redexgen.core.JQ.A05)) {
                com.facebook.ads.redexgen.core.AnonymousClass12 anonymousClass12 = com.facebook.ads.redexgen.core.AnonymousClass12.A05;
                if (A0m[3].charAt(5) == 'B') {
                    A0m[3] = "N11XMBa1eBkGGouoRChlRsXEwEtHvHDZ";
                    this.A08 = anonymousClass12;
                }
            }
            this.A0C = c6l;
            com.facebook.ads.redexgen.core.C03621t c03621t = new com.facebook.ads.redexgen.core.C03621t(this.A0g, this.A0J, A0R(), null, 1, new com.facebook.ads.redexgen.core.C1309bh());
            c03621t.A05(jq);
            c03621t.A06(this.A0S);
            c03621t.A07(this.A0T);
            this.A0A = new com.facebook.ads.redexgen.core.C0684Fh(this.A0c, c03621t);
            this.A0A.A0R(new com.facebook.ads.redexgen.core.WH(this));
            this.A0A.A0V(str);
            return;
        }
        throw new java.lang.RuntimeException();
    }

    public final void A1Y(com.facebook.ads.redexgen.core.JW jw) {
        this.A0H = jw;
    }

    public final void A1Z(com.facebook.ads.redexgen.core.JX jx) {
        this.A0I = jx;
    }

    public final void A1a(com.facebook.ads.redexgen.core.EnumC0783Jl enumC0783Jl) {
        if (!A0q()) {
            if (com.facebook.ads.redexgen.core.EnumC0783Jl.A05.equals(enumC0783Jl)) {
                this.A0c.A0E().A3E(com.facebook.ads.internal.protocol.AdPlacementType.NATIVE_BANNER.toString(), this.A0g);
            } else {
                this.A0c.A0E().A3E(com.facebook.ads.internal.protocol.AdPlacementType.NATIVE.toString(), this.A0g);
            }
        }
        this.A0J = enumC0783Jl;
    }

    public final void A1b(com.facebook.ads.redexgen.core.AbstractC0986Rj abstractC0986Rj) {
        this.A0V = new java.lang.ref.WeakReference<>(abstractC0986Rj);
    }

    public final void A1c(boolean z) {
        this.A0W = z;
    }

    public final void A1d(boolean z) {
        this.A0X = z;
    }

    public final void A1e(boolean z, boolean z2) {
        java.lang.String strA0W;
        if (z) {
            if (this.A0E.equals(com.facebook.ads.redexgen.core.JQ.A05)) {
                boolean zA0q = A0q();
                if (A0m[3].charAt(5) != 'B') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0m;
                strArr[6] = "maLBxQjysuwmJ75m3YPaJDHU5JlBu";
                strArr[1] = "hXXEi4DazsshJWFEyRiAh7tUxgC1d";
                if (!zA0q && this.A0G != null) {
                    this.A0G.ACg();
                }
            }
            if (this.A0R != null) {
                this.A0R.A0U();
                this.A0e.A09();
                return;
            }
            return;
        }
        if (this.A0R != null) {
            com.facebook.ads.redexgen.core.C1358cU adapter = A0y();
            if (adapter != null) {
                strA0W = adapter.A0G();
            } else if (A0m[5].length() != 3) {
                java.lang.String[] strArr2 = A0m;
                strArr2[2] = "2ETmOz1YodPf8MKRGGB9YcIoy7FDTpAq";
                strArr2[7] = "k5VZ8yDbY0Zqj8FxkeEerY08JJe7M6tR";
                strA0W = A0W(0, 0, 121);
            } else {
                java.lang.String[] strArr3 = A0m;
                strArr3[0] = "JjUCnZOckAfeDcKZajvIf0dyi7sruRRg";
                strArr3[4] = "GlO3j5qd4HFQ8L5mPWBpkp3onxgG8Q98";
                strA0W = A0W(0, 0, 121);
            }
            this.A0e.A0C(this.A0c, strA0W);
            this.A0R.A0V();
        }
        if (this.A0G != null && z2) {
            com.facebook.ads.redexgen.core.C0779Jg c0779JgA01 = com.facebook.ads.redexgen.core.C0779Jg.A01(com.facebook.ads.internal.protocol.AdErrorType.BROKEN_MEDIA_ERROR, A0W(93, 21, 47));
            A11().A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), c0779JgA01.A03().getErrorCode(), c0779JgA01.A04());
            this.A0G.ABs(c0779JgA01);
        }
    }

    public final boolean A1f() {
        return this.A07 == null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0776Jc
    public final int A70() {
        android.view.View view = this.A06;
        if (view instanceof com.facebook.ads.internal.api.AdNativeComponentView) {
            android.view.View videoView = ((com.facebook.ads.internal.api.AdNativeComponentView) view).getAdContentsView();
            if (videoView instanceof com.facebook.ads.redexgen.core.C0966Qp) {
                return ((com.facebook.ads.redexgen.core.C0966Qp) videoView).getCurrentPosition();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(com.facebook.ads.NativeAdBase nativeAdBase) {
        return new com.facebook.ads.redexgen.core.C0774Ja(this, nativeAdBase);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A0W(553, 7, 95), A0W(363, 19, 11), A0W(13, 8, 68));
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A0c)) {
            A11().A0A().AHC(this.A03);
        }
        if (!A0q()) {
            this.A0c.A0E().A3F();
        }
        if (this.A0A != null) {
            this.A0A.A0X(true);
            this.A0A.A0J();
            this.A0A = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0E.equals(com.facebook.ads.redexgen.core.JQ.A05)) {
            this.A08 = com.facebook.ads.redexgen.core.AnonymousClass12.A04;
        }
        this.A0E = com.facebook.ads.redexgen.core.JQ.A04;
        A0h(this.A0a, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdBodyText() {
        return A0G(true).A0I();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdCallToAction() {
        return A0G(true).A0W();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        return getAdChoicesIcon().getUrl();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdChoicesLinkUrl() {
        return A0F().A0J();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdChoicesText() {
        return A0F().A0K();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdHeadline() {
        return A0G(true).A0L();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdLinkDescription() {
        return A0G(true).A0M();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdSocialContext() {
        return A0G(true).A0Q();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdTranslation() {
        return A0G(true).A0T();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdUntrimmedBodyText() {
        return A0G(true).A0U();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdvertiserName() {
        return A0G(true).A0V();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        com.facebook.ads.redexgen.core.JU nativeAdImage;
        if (this.A0a == null || (nativeAdImage = this.A0a.A0E().A0E()) == null) {
            return 0.0f;
        }
        int width = nativeAdImage.getWidth();
        int height = nativeAdImage.getHeight();
        if (height <= 0) {
            return 0.0f;
        }
        float f = width;
        float f2 = height;
        java.lang.String[] strArr = A0m;
        if (strArr[0].charAt(21) == strArr[4].charAt(21)) {
            throw new java.lang.RuntimeException();
        }
        A0m[3] = "OUTl4BjdLTzCi4kmpI6eA9pKBM08eKMp";
        return f / f2;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0h;
    }

    @Override // com.facebook.ads.Ad
    public final java.lang.String getPlacementId() {
        return this.A0g;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final android.graphics.drawable.Drawable getPreloadedIconViewDrawable() {
        com.facebook.ads.redexgen.core.JU juA0F;
        android.graphics.Bitmap bitmapA0M;
        com.facebook.ads.redexgen.core.C1358cU adapter = this.A0a;
        if (adapter != null && (juA0F = A0F().A0F()) != null && (bitmapA0M = this.A0b.A0M(juA0F.getUrl())) != null) {
            return A05(A11(), bitmapA0M, A1f(), A1C());
        }
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getPromotedTranslation() {
        return A0G(true).A0P();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getSponsoredTranslation() {
        return A0G(true).A0R();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        return this.A0a != null && this.A0a.A0Q();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA0A = true;
        if (this.A0A != null) {
            com.facebook.ads.redexgen.core.C0684Fh c0684Fh = this.A0A;
            java.lang.String[] strArr = A0m;
            if (strArr[6].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0m;
            strArr2[2] = "gqyuy6F7WThaJUOfAsIyr4sziGGBhw0f";
            strArr2[7] = "L6lbko7Rv34huPFym8TvMBezY1vQkdWf";
            zA0A = c0684Fh.A0Y();
        } else if (this.A0B != null) {
            zA0A = this.A0B.A0A();
        }
        this.A0c.A0E().A5E(zA0A);
        return zA0A;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        return this.A0a != null && this.A0a.A0R();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A0W(560, 6, 117), A0W(382, 24, 27), A0W(5, 8, 76));
        A1X(com.facebook.ads.redexgen.core.JQ.A00(com.facebook.ads.NativeAdBase.MediaCacheFlag.ALL), null, new com.facebook.ads.redexgen.core.C6l(false, -1, -1));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(com.facebook.ads.NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A0W(560, 6, 117), A0W(382, 24, 27), A0W(21, 8, 17));
        ((com.facebook.ads.redexgen.core.C0774Ja) nativeLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        if (this.A05 != null) {
            this.A05.performClick();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(java.lang.Throwable th) {
        if (this.A04 != null) {
            this.A04.post(new com.facebook.ads.redexgen.core.WI(this));
        }
        java.lang.String str = A0W(org.objectweb.asm.Opcodes.IF_ICMPLE, 16, 48) + com.facebook.ads.redexgen.core.AbstractC0832Ll.A03(this.A0c, th);
        A11().A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), 2001, str);
        if (this.A0G != null) {
            this.A0G.ABs(new com.facebook.ads.redexgen.core.C0779Jg(2001, str));
        }
    }

    @Override // com.facebook.ads.Ad
    public final void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0n(extraHints.getHints());
        this.A0T = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void unregisterView() {
        com.facebook.ads.redexgen.core.QS qs = this.A0N;
        if (qs != null) {
            android.view.ViewParent parent = qs.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(qs);
            }
            this.A0N = null;
        }
        if (this.A04 == null || this.A06 == null) {
            return;
        }
        if (!A0q()) {
            com.facebook.ads.redexgen.core.C0S c0sA0E = this.A0c.A0E();
            java.lang.String[] strArr = A0m;
            if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                A0m[3] = "w9n8TBisrss8zAM8EiwpgeUnlq2PaQ6F";
                c0sA0E.unregisterView();
                if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A0c)) {
                    A11().A0A().AHC(this.A03);
                }
                if (!A0o.containsKey(this.A04) && A0o.get(this.A04).get() == this) {
                    android.view.View view = this.A04;
                    java.lang.String[] strArr2 = A0m;
                    if (strArr2[2].charAt(3) != strArr2[7].charAt(3)) {
                        java.lang.String[] strArr3 = A0m;
                        strArr3[6] = "1kkuB6xtwDeF3EtU3aavEsH64nQcK";
                        strArr3[1] = "rb6NM7K87kMKFcLdVL5rugEXgDuZd";
                        if ((view instanceof android.view.ViewGroup) && this.A0K != null) {
                            ((android.view.ViewGroup) this.A04).removeView(this.A0K);
                            this.A0K = null;
                        }
                        if (this.A0a != null) {
                            this.A0a.A0J();
                        }
                        if (android.os.Build.VERSION.SDK_INT >= 18 && this.A0L != null) {
                            com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A0c;
                            java.lang.String[] strArr4 = A0m;
                            if (strArr4[6].length() == strArr4[1].length()) {
                                java.lang.String[] strArr5 = A0m;
                                strArr5[0] = "4gE9LeNlQroHqEeWf1EzJsbNX9PRfDme";
                                strArr5[4] = "TBDkrxJbHtSaZ13hkNs0RNY8SzE0jpKy";
                                if (com.facebook.ads.redexgen.core.C0762Im.A16(c1199Zs)) {
                                    this.A0L.A07();
                                    this.A04.getOverlay().remove(this.A0L);
                                }
                            }
                        }
                        A0o.remove(this.A04);
                        A0Z();
                        this.A04 = null;
                        this.A06 = null;
                        if (this.A0R != null) {
                            this.A0R.A0V();
                            this.A0R = null;
                        }
                        A0c();
                        this.A09 = null;
                        return;
                    }
                } else {
                    throw new java.lang.IllegalStateException(A0W(481, 38, 57));
                }
            }
        } else {
            if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A0c)) {
                A11().A0A().AHC(this.A03);
            }
            if (!A0o.containsKey(this.A04)) {
            }
            throw new java.lang.IllegalStateException(A0W(481, 38, 57));
        }
        throw new java.lang.RuntimeException();
    }
}
