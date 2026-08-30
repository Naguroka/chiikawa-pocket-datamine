package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0926Pb {
    public static byte[] A0K;
    public static java.lang.String[] A0L = {"QJ7W4e4PJvclr77cDyA2o1qIxMihX3tE", "RH0qaB2vXSlWTV", "TMgHIdn8e0jRrsJAq9rOuGvMgMhVzLRj", "8zeB", "h3DHJTryp4843oQXq4V40YlaMfy8fMY9", "5EUDcWbBtTwBMpPZObVlQHA1Luk9oa", "lBOFkjXt9ejA3EivMitoOA5tI6ifJJ8U", "jkkICjKEbDq5EoZUmm0oqZxt7dyZ5DGY"};
    public static final java.util.concurrent.atomic.AtomicInteger A0M;
    public static final java.util.concurrent.atomic.AtomicInteger A0N;
    public com.facebook.ads.redexgen.core.PQ A02;
    public com.facebook.ads.redexgen.core.PZ A03;
    public com.facebook.ads.redexgen.core.InterfaceC0925Pa A04;
    public com.facebook.ads.redexgen.core.C0987Rk A05;
    public final int A08;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A09;
    public final com.facebook.ads.redexgen.core.C04766f A0A;
    public final com.facebook.ads.redexgen.core.C1199Zs A0B;
    public final com.facebook.ads.redexgen.core.J7 A0C;
    public final com.facebook.ads.redexgen.core.JF A0D;
    public final com.facebook.ads.redexgen.core.PO A0E;
    public final com.facebook.ads.redexgen.core.UA A0F;
    public final com.facebook.ads.redexgen.core.C0937Pm A0G;
    public final com.facebook.ads.redexgen.core.C0938Pn A0H;
    public final java.util.LinkedList<com.facebook.ads.redexgen.core.PY> A0J = new java.util.LinkedList<>();
    public com.facebook.ads.redexgen.core.C0842Lv A01 = new com.facebook.ads.redexgen.core.C0842Lv();
    public boolean A07 = true;
    public boolean A06 = false;
    public long A00 = -1;
    public final java.lang.String A0I = java.util.UUID.randomUUID().toString();

    public static java.lang.String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 56);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{-71, -79, -87, -84, -77, -87, -85, -67, -22, -32, -18, -21, -27, -32, -59, -22, -16, -31, -18, -30, -35, -33, -31, -12, -9, -27, -8, 3, 2, 5, 7, -4, 1, -6, -39, -4, 1, -4, 6, -5, -8, -9, -69, -70, -72, 6, -70, -68, -50, -37, -34, -52, -33, -22, -23, -20, -18, -29, -24, -31, -51, -18, -37, -20, -18, -33, -34, -94, -95, -97, -19, -95, -93, -75, -103, -84, -84, -103, -101, -96, -99, -100, -113, -114, -122, -83, -91, -16, -17, 2, -15, -10, -13, -14, -44, 0, -17, -5, -13, -46, -17, 2, -17, 6, 24, 21, 21, 8, 17, 23, -6, -7, -15, 24, 16, 28, 40, 23, 35, 27, 41, -52, -53, -98, -64, -47, -58, -45, -58, -47, -42, -83, -66, -46, -48, -62, -63, -123, -124, -126, -48, -124, -122, -104, -29, -30, -75, -41, -24, -35, -22, -35, -24, -19, -58, -39, -25, -23, -31, -39, -40, -100, -101, -103, -25, -101, -99, -81, 20, 19, -24, 17, 20, 24, 10, -21, 26, 17, 17, 24, 8, 23, 10, 10, 19, -5, 14, 10, 28, -51, -52, -54, 24, -52, -50, -83, -84, -124, -77, -86, -86, -79, -95, -80, -93, -93, -84, -108, -89, -93, -75, 102, 101, 99, -79, 101, 103, -82, -83, -107, -96, -85, -76, -92, -111, -92, -96, -93, 103, 102, 100, -78, 102, 107, 95, 102, 100, -78, 102, 107, 95, 102, 100, -78, 102, 104, 122, 28, 27, 3, 14, 25, 34, 18, 4, 31, 22, 33, 33, 18, 27, -43, -44, -46, 32, -44, -39, -51, -44, -46, 32, -44, -42, -24, -71, -85, -87, -75, -76, -86, -91, -87, -82, -89, -76, -76, -85, -78, -81, -95, -80, 125, -79, -80, -92, -121, -95, -75, 100, 99, 97, -81, 99, 104, 99, 97, -81, 99, 101, 119, -9, -23, -8, -58, -27, -9, -23, -70, -72, -59, -9, -9, -23, -8, -9, -84, -85, -87, -9, -85, -80, -85, -87, -9, -85, -83, -31, -45, -30, -80, -49, -31, -45, -92, -94, -79, -35, -36, -44, -41, -43, -106, -107, -109, -31, -107, -102, -107, -109, -31, -107, -105, -77, -82, -77, -96, -85, -106, -107, -115, -76, -84, -58, -61, -67, -34, -47, -52, -51, -41, -83, -34, -51, -42, -36, -112, -113, -115, -37, -113, -108, -120, -113, -115, -37, -113, -108, -120, -113, -115, -37, -113, -111, -93, -78, -91, -95, -77, -114, -95, -99, -96, -75, -112, -85, -113, -92, -85, -77, 100, 99, 97, -81, 99, 101, 119};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A0i(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String strA0A = A0A(87, 16, 86);
        if (map.containsKey(strA0A) && com.facebook.ads.redexgen.core.C0762Im.A1q(this.A0B)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(map.get(strA0A));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray(jSONArray.getString(i));
                    java.lang.String string = jSONArray2.getString(0);
                    java.lang.String string2 = jSONArray2.getString(1);
                    java.lang.String string3 = jSONArray2.getString(2);
                    java.lang.String string4 = jSONArray2.getString(3);
                    if (string != null && string2 != null && string3 != null) {
                        com.facebook.ads.redexgen.core.T5 t5 = new com.facebook.ads.redexgen.core.T5(this.A09.A1U(), java.lang.Long.parseLong(string), java.lang.Long.parseLong(string2), java.lang.Long.parseLong(string3));
                        t5.A06(java.lang.Long.parseLong(string4));
                        arrayList.add(t5);
                    }
                }
                java.lang.String strA04 = com.facebook.ads.redexgen.core.T4.A04(arrayList);
                java.util.HashMap map2 = new java.util.HashMap();
                map2.put(A0A(115, 6, 126), strA04);
                if (strA04 != null) {
                    this.A0C.AAR(this.A09.A1U(), map2);
                }
            } catch (java.lang.Exception e) {
                this.A0B.A07().AA0(A0A(274, 14, 14), 3600, new com.facebook.ads.redexgen.core.C8F(e));
            }
        }
        boolean zContainsKey = map.containsKey(strA0A);
        if (A0L[0].charAt(7) != 'P') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0L;
        strArr[4] = "rUTki8v1ZwD35w0l1wx8OInXS6BY1neH";
        strArr[7] = "OANcXSK4xu3EG1xYwZDVITEIbLyQGtEs";
        if (zContainsKey) {
            map.remove(strA0A);
        }
        this.A0C.A9z(this.A09.A1U(), new com.facebook.ads.redexgen.core.O8(map).A03(this.A05).A05());
    }

    static {
        A0D();
        A0N = new java.util.concurrent.atomic.AtomicInteger();
        A0M = new java.util.concurrent.atomic.AtomicInteger();
    }

    public C0926Pb(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.J7 j7, int i) {
        this.A0B = c1199Zs;
        this.A0C = j7;
        this.A09 = abstractC1341cD;
        this.A08 = i;
        this.A0F = new com.facebook.ads.redexgen.core.UA(this, c1199Zs);
        this.A0A = new com.facebook.ads.redexgen.core.C04766f(this.A0B);
        this.A0D = new com.facebook.ads.redexgen.core.JF(abstractC1341cD.A1U(), j7);
        this.A0E = new com.facebook.ads.redexgen.core.PO(abstractC1341cD.A0l(), abstractC1341cD.A1P().A0E().A08(), i);
        this.A0H = com.facebook.ads.redexgen.core.AbstractC0939Po.A00(this.A0B, abstractC1341cD.A0o(), this.A0A, this.A0D, this.A0E, A0H());
        this.A0G = new com.facebook.ads.redexgen.core.C0937Pm(this.A0B, this, j7, this.A0E, this.A0I, abstractC1341cD.A1U());
    }

    public static java.util.concurrent.atomic.AtomicInteger A0B() {
        return A0M;
    }

    private void A0C() {
        A0F(new com.facebook.ads.redexgen.core.PY(A0A(288, 22, 4), new java.lang.String[]{this.A0I, A0A(1, 6, 67)}));
        java.lang.String strReplace = android.util.Base64.encodeToString(this.A0H.A04.toString().getBytes(), 0).replace(A0A(0, 1, 119), A0A(0, 0, 35));
        java.lang.String assets = this.A0I;
        A0F(new com.facebook.ads.redexgen.core.PY(A0A(310, 26, 76), new java.lang.String[]{strReplace, assets}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E() {
        if (this.A06) {
            while (!this.A0J.isEmpty()) {
                com.facebook.ads.redexgen.core.PY pyPoll = this.A0J.poll();
                if (pyPoll != null) {
                    this.A0F.A05(java.lang.String.format(java.util.Locale.US, pyPoll.A00, pyPoll.A02));
                    if (pyPoll.A01) {
                        this.A0D.A04(com.facebook.ads.redexgen.core.JE.A0L, null);
                        this.A0B.A0E().A5c(pyPoll.A00);
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    private synchronized void A0F(com.facebook.ads.redexgen.core.PY py) {
        this.A0J.offer(py);
        A0E();
    }

    private boolean A0H() {
        return !A0I();
    }

    private boolean A0I() {
        return com.facebook.ads.redexgen.core.C0762Im.A2n(this.A0B, com.facebook.ads.redexgen.core.RS.A03());
    }

    public final com.facebook.ads.redexgen.core.JF A0K() {
        return this.A0D;
    }

    public final com.facebook.ads.redexgen.core.C0842Lv A0L() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.PO A0M() {
        return this.A0E;
    }

    public final com.facebook.ads.redexgen.core.PQ A0N() {
        return this.A02;
    }

    public final com.facebook.ads.redexgen.core.UA A0O() {
        return this.A0F;
    }

    public final void A0P() {
        A0F(new com.facebook.ads.redexgen.core.PY(A0A(23, 26, 91), new java.lang.String[]{this.A0I}));
    }

    public final void A0Q() {
        A0F(new com.facebook.ads.redexgen.core.PY(A0A(49, 25, 66), new java.lang.String[]{this.A0I}));
    }

    public final void A0R() {
        this.A07 = true;
    }

    public final void A0S() {
        this.A07 = false;
    }

    public final void A0T() {
        A0F(new com.facebook.ads.redexgen.core.PY(A0A(121, 23, 37), new java.lang.String[]{this.A0I}));
    }

    public final void A0U() {
        A0F(new com.facebook.ads.redexgen.core.PY(A0A(org.objectweb.asm.Opcodes.JSR, 27, 109), new java.lang.String[]{this.A0I}));
    }

    public final void A0V() {
        A0F(new com.facebook.ads.redexgen.core.PY(A0A(org.objectweb.asm.Opcodes.MONITOREXIT, 22, 6), new java.lang.String[]{this.A0I}));
    }

    public final void A0W() {
        A0F(new com.facebook.ads.redexgen.core.PY(A0A(404, 22, 4), new java.lang.String[]{this.A0I}));
    }

    public final void A0X() {
        if (android.os.Build.VERSION.SDK_INT > 16) {
            this.A0F.addJavascriptInterface(this.A0G, A0A(7, 16, 68));
        }
        this.A0D.A04(com.facebook.ads.redexgen.core.JE.A0O, null);
        java.lang.String str = this.A0H.A00;
        this.A0F.loadUrl(str);
        this.A00 = java.lang.System.currentTimeMillis();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String url = A0A(372, 3, 25);
            jSONObject.put(url, str);
            java.lang.String url2 = A0A(103, 12, 107);
            jSONObject.put(url2, com.facebook.ads.redexgen.core.AbstractC0927Pc.A00());
            java.lang.String url3 = A0A(362, 10, 7);
            jSONObject.put(url3, A0N.getAndIncrement());
            java.lang.String url4 = A0A(74, 13, 0);
            jSONObject.put(url4, A0M);
        } catch (org.json.JSONException unused) {
        }
        this.A0B.A0E().A5i(jSONObject.toString());
        if (A0L[0].charAt(7) != 'P') {
            throw new java.lang.RuntimeException();
        }
        A0L[2] = "F37Uv1pNa1vK7Gl1ach1LU4YjGU0eDGU";
        A0C();
    }

    public final void A0Y() {
        A0F(new com.facebook.ads.redexgen.core.PY(A0A(org.objectweb.asm.Opcodes.D2F, 24, 60), new java.lang.String[]{this.A0I}));
    }

    public final void A0Z(com.facebook.ads.redexgen.core.C0842Lv c0842Lv) {
        this.A01 = c0842Lv;
    }

    public final void A0a(com.facebook.ads.redexgen.core.PQ pq) {
        this.A02 = pq;
    }

    public final void A0b(com.facebook.ads.redexgen.core.PZ pz) {
        this.A03 = pz;
    }

    public final void A0c(com.facebook.ads.redexgen.core.InterfaceC0925Pa interfaceC0925Pa) {
        this.A04 = interfaceC0925Pa;
    }

    public final void A0d(com.facebook.ads.redexgen.core.U9 u9) {
        this.A0G.A0N(u9);
    }

    public final void A0e(com.facebook.ads.redexgen.core.C0987Rk c0987Rk) {
        this.A05 = c0987Rk;
    }

    public final void A0f(java.lang.String str) {
        A0F(new com.facebook.ads.redexgen.core.PY(A0A(247, 27, 117), new java.lang.String[]{this.A0I, str}));
    }

    public final void A0g(java.lang.String str, java.lang.String str2) {
        A0F(new com.facebook.ads.redexgen.core.PY(A0A(217, 30, 7), new java.lang.String[]{this.A0I, str, str2}));
    }

    public final void A0h(java.lang.String str, org.json.JSONObject jSONObject) {
        A0F(new com.facebook.ads.redexgen.core.PY(A0A(375, 29, 48), new java.lang.String[]{this.A0I, str, jSONObject.toString()}, false));
    }

    public final void A0j(org.json.JSONObject jSONObject) {
        A0F(new com.facebook.ads.redexgen.core.PY(A0A(336, 26, 54), new java.lang.String[]{android.util.Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace(A0A(0, 1, 119), A0A(0, 0, 35)), this.A0I}));
    }

    public final boolean A0k() {
        return this.A0G.A0O();
    }

    public final boolean A0l() {
        return this.A07;
    }
}
