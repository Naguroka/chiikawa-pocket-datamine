package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1210a3 implements com.facebook.ads.redexgen.core.AnonymousClass69 {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"1hpByTARN6eOnQ", "46DvCO0dFj9d90pc7Bl3Va1pW3afVu0G", "LtfSHnVMNf9jD1VPw2QJdb6akNXb3KRw", "UXeRQ2HNaneiXsHAoGvRBzblNiVPPyfq", "WcHPi3i27m6LdaHLnkH9ENRpFxyJu3g8", "FTcDokCppzFM6olvGfJVNXVubstDZ8VZ", "v3Z7C81p3UBYKX6nY0MAEeka3DNz7RKw", "vwYfKziuTy1RLYscQHjTEDI4uYjWuvBq"};
    public final com.facebook.ads.redexgen.core.SF A01;
    public java.util.Set<com.facebook.ads.redexgen.core.C6C> A00 = new java.util.HashSet();
    public final java.util.List<com.facebook.ads.redexgen.core.C6B> A02 = new java.util.ArrayList();

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 81);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{75, 75, 78, 24, 81, 75, 78, 24, 39, 53, 53, 35, 50, 53};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public synchronized void A03() {
        if (!this.A01.A9b()) {
            com.facebook.ads.internal.api.BuildConfigApi.isDebug();
            return;
        }
        java.util.Set<com.facebook.ads.redexgen.core.C6C> setA01 = A01(this.A01.A75());
        if (!this.A00.equals(setA01) && setA01 != null) {
            this.A00 = setA01;
            java.util.Iterator<com.facebook.ads.redexgen.core.C6B> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A3z();
            }
        }
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
            for (com.facebook.ads.redexgen.core.C6C c6c : this.A00) {
                java.lang.String.format(java.util.Locale.US, A00(0, 8, 58), c6c.A8b(), c6c.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C1210a3(com.facebook.ads.redexgen.core.InterfaceC0794Jw interfaceC0794Jw) {
        this.A01 = interfaceC0794Jw.A54(com.facebook.ads.redexgen.core.SG.A0B);
        this.A01.A3n(new com.facebook.ads.redexgen.core.C1211a4(this));
        A03();
    }

    public static java.util.Set<com.facebook.ads.redexgen.core.C6C> A01(org.json.JSONObject jSONObject) {
        com.facebook.ads.redexgen.core.C1209a2 c1209a2A00;
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A00(8, 6, 23));
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int i = 0;
        while (true) {
            int i2 = jSONArrayOptJSONArray.length();
            if (A04[2].charAt(7) != 'M') {
                throw new java.lang.RuntimeException();
            }
            A04[0] = "HjevAVNXdTQxpc55Yqf8Zim5Y";
            if (i < i2) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null || (c1209a2A00 = com.facebook.ads.redexgen.core.C1209a2.A00(jSONObjectOptJSONObject)) == null) {
                    return null;
                }
                hashSet.add(c1209a2A00);
                i++;
            } else {
                return hashSet;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass69
    public final void A3l(com.facebook.ads.redexgen.core.C6B c6b) {
        this.A02.add(c6b);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass69
    public final synchronized java.util.Set<com.facebook.ads.redexgen.core.C6C> A6Q() {
        return new java.util.HashSet(this.A00);
    }
}
