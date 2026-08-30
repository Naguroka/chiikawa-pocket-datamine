package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class T4 {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"nvoCYT5lXV50ozFrdUrQJCA6z0GvB", "", "jdLKha1Na7nbzs0Nk4YLOHAcdwecuvvy", "x", "dSWVRlyTiHf7svvh2WPzEDVR9b7sv5FM", "fWYFOffN0cZPNc3vcPN7ReiBLy1A48b", "e5JjNsryHusTZGAVeTKu2QwvoQvLupoE", "SBHDzKPIpiPnF71bMjezo2z0"};
    public java.util.concurrent.BlockingDeque<com.facebook.ads.redexgen.core.T5> A00;
    public final int A01;

    @javax.annotation.Nullable
    public final java.lang.String A02;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 86);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static java.lang.String A05(java.util.List<java.lang.Long> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<java.lang.Long> it = list.iterator();
        while (it.hasNext()) {
            A09(sb, A00(it.next().longValue()));
        }
        return A03(sb.toString());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static java.lang.String A07(java.util.Map<java.lang.String, java.lang.Object> map) {
        return new org.json.JSONObject(map).toString();
    }

    public static void A08() {
        A03 = new byte[]{56, 59, 58, kotlin.io.encoding.Base64.padSymbol, 60, okio.Utf8.REPLACEMENT_BYTE, 62, 49, 48, 51, 50, 53, 52, 55, 54, 41, 40, 43, 42, 45, 44, 47, 46, 33, 32, 35, 24, 27, 26, 29, 28, 31, 30, 17, 16, 19, 18, 21, 20, 23, 22, 9, 8, 11, 10, 13, 12, 15, 14, 1, 0, 3, 73, 72, 75, 74, 77, 76, 79, 78, 65, 64, 82, 86, 33, 34, 48, 38, 7, 38, 47, 55, 34, 112, 38, 107, 76, 120, 105, 100, 98, 84, 100, 91, 87, 69, 83, 80, 94, 87, 7, 2, 69, 77, 6, 28, 60, 0, 26, 1, 11, 32, 1, 17, 11, 46, 17, 29, 15, 25, 26, 20, 29, 77, 72, 124, 111, 120, 121, 99, 101, 100, 48, 105, 46, 57, 57, 105, 113, 105, 24, 2, 17, 14, 20, 14, 19, 8, 14, 14, 15, 20, 6, 10, 19, 20, 8, 10, 27, 105, 54};
    }

    static {
        A08();
    }

    public T4(@javax.annotation.Nullable java.lang.String str) {
        this(str, 2000);
    }

    public T4(@javax.annotation.Nullable java.lang.String str, int i) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = new java.util.concurrent.LinkedBlockingDeque();
    }

    public static long A00(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static long A01(java.util.List<com.facebook.ads.redexgen.core.T5> list, int i, int i2) {
        java.util.HashMap map = new java.util.HashMap();
        for (int i3 = i + 1; i3 < i + i2; i3++) {
            long jA03 = list.get(i3).A03();
            long jA01 = list.get(i3).A01();
            if (map.containsKey(java.lang.Long.valueOf(jA03))) {
                map.put(java.lang.Long.valueOf(jA03), java.lang.Integer.valueOf(((java.lang.Integer) map.get(java.lang.Long.valueOf(jA03))).intValue() + 1));
            } else {
                map.put(java.lang.Long.valueOf(jA03), 1);
            }
            if (map.containsKey(java.lang.Long.valueOf(jA01))) {
                map.put(java.lang.Long.valueOf(jA01), java.lang.Integer.valueOf(((java.lang.Integer) map.get(java.lang.Long.valueOf(jA01))).intValue() + 1));
            } else {
                map.put(java.lang.Long.valueOf(jA01), 1);
            }
        }
        long jLongValue = 3333;
        int baseCountMax = 0;
        java.lang.String[] strArr = A04;
        if (strArr[2].charAt(28) != strArr[6].charAt(28)) {
            throw new java.lang.RuntimeException();
        }
        A04[1] = "";
        for (java.util.Map.Entry entry : map.entrySet()) {
            int iIntValue = ((java.lang.Integer) entry.getValue()).intValue();
            if (baseCountMax < iIntValue) {
                baseCountMax = iIntValue;
                jLongValue = ((java.lang.Long) entry.getKey()).longValue();
            }
        }
        for (int baseCountMax2 = i + 1; baseCountMax2 < i + i2; baseCountMax2++) {
            list.get(baseCountMax2).A09(list.get(baseCountMax2).A03() - jLongValue);
            list.get(baseCountMax2).A07(list.get(baseCountMax2).A01() - jLongValue);
        }
        return jLongValue;
    }

    public static java.lang.String A03(java.lang.String str) {
        java.lang.String strA02 = A02(0, 64, 47);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.lang.StringBuilder p = new java.lang.StringBuilder();
        int length = sb.length() % 3;
        if (length > 0) {
            while (length < 3) {
                p.append('=');
                java.lang.String[] strArr = A04;
                java.lang.String str2 = strArr[7];
                java.lang.String base64chars = strArr[3];
                if (str2.length() == base64chars.length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A04;
                strArr2[7] = "XxQGiDHDCrtvnrkU3l3PFftc";
                strArr2[3] = "L";
                sb.append((char) 0);
                length++;
            }
        }
        for (int n3 = 0; n3 < sb.length(); n3 += 3) {
            int iCharAt = (sb.charAt(n3) << 16) + (sb.charAt(n3 + 1) << '\b') + sb.charAt(n3 + 2);
            int n4 = (iCharAt >> 12) & 63;
            int n2 = (iCharAt >> 6) & 63;
            java.lang.StringBuilder sb3 = sb2.append(strA02.charAt((iCharAt >> 18) & 63));
            sb3.append(strA02.charAt(n4)).append(strA02.charAt(n2)).append(strA02.charAt(iCharAt & 63));
        }
        java.lang.StringBuilder r = new java.lang.StringBuilder();
        java.lang.String base64chars2 = sb2.substring(0, sb2.length() - p.length());
        return r.append(base64chars2).append((java.lang.Object) p).toString();
    }

    @javax.annotation.Nullable
    public static java.lang.String A04(@javax.annotation.Nullable java.util.List<com.facebook.ads.redexgen.core.T5> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (A04[4].charAt(10) != 'f') {
            throw new java.lang.RuntimeException();
        }
        A04[5] = "agnihNLFoXZD0MCg0BlXig325JHBk82";
        return A06(list, 0, size, false);
    }

    @javax.annotation.Nullable
    public static java.lang.String A06(@javax.annotation.Nullable java.util.List<com.facebook.ads.redexgen.core.T5> list, int i, int i2, boolean z) {
        if (list == null || list.isEmpty() || i < 0 || i >= list.size() || i2 <= 0 || i + i2 > list.size()) {
            return null;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put(A02(73, 2, 64), list.get(i).A05());
        map.put(A02(115, 7, 92), 1);
        boolean z2 = false;
        boolean z3 = false;
        if (i2 > 1) {
            A0A(list, i, i2);
            map.put(A02(64, 9, 21), java.lang.Long.valueOf(A01(list, i, i2)));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<java.lang.Long> viewable50FrameTimestampList = new java.util.ArrayList<>();
            java.util.List<java.lang.Long> audioFrameTimestampList = new java.util.ArrayList<>();
            for (int i3 = i + 1; i3 < i + i2; i3++) {
                arrayList.add(java.lang.Long.valueOf(list.get(i3).A03()));
                arrayList.add(java.lang.Long.valueOf(list.get(i3).A01()));
                arrayList.add(java.lang.Long.valueOf(list.get(i3).A02()));
                viewable50FrameTimestampList.add(java.lang.Long.valueOf(list.get(i3).A00()));
                if (list.get(i3).A00() != 0) {
                    z2 = true;
                }
                if (z) {
                    audioFrameTimestampList.add(java.lang.Long.valueOf(list.get(i3).A04()));
                    if (list.get(i3).A04() != 0) {
                        z3 = true;
                    }
                }
            }
            map.put(A02(92, 2, 117), A05(arrayList));
            map.put(A02(75, 6, 91), A05(viewable50FrameTimestampList));
            map.put(A02(94, 9, 57), java.lang.Boolean.valueOf(z2));
            if (z) {
                map.put(A02(81, 11, 100), A05(audioFrameTimestampList));
                map.put(A02(103, 12, 46), java.lang.Boolean.valueOf(z3));
            }
        }
        java.lang.String encodedFrameData = A07(map);
        if (encodedFrameData.length() > 900000) {
            return A02(122, 29, 29);
        }
        return encodedFrameData;
    }

    public static void A09(java.lang.StringBuilder sb, long j) {
        while (j >= 128) {
            int b = 128 - 1;
            char c = (char) ((((long) b) & j) | ((long) 128));
            j >>= 7;
            sb.append(c);
        }
        int b2 = (int) j;
        sb.append((char) b2);
    }

    public static void A0A(java.util.List<com.facebook.ads.redexgen.core.T5> list, int i, int i2) {
        long jA00;
        for (int i3 = (i + i2) - 1; i3 > i; i3--) {
            int i4 = i3 - 1;
            list.get(i3).A09(list.get(i3).A03() - list.get(i4).A03());
            int i5 = i3 - 1;
            list.get(i3).A07(list.get(i3).A01() - list.get(i5).A01());
            int i6 = i3 - 1;
            list.get(i3).A08(list.get(i3).A02() - list.get(i6).A02());
            com.facebook.ads.redexgen.core.T5 t5 = list.get(i3);
            int i7 = i3 - 1;
            long jA04 = 0;
            if (list.get(i7).A00() == -1) {
                jA00 = 0;
            } else {
                int i8 = i3 - 1;
                jA00 = list.get(i3).A00() - list.get(i8).A00();
            }
            t5.A06(jA00);
            com.facebook.ads.redexgen.core.T5 t6 = list.get(i3);
            int i9 = i3 - 1;
            if (list.get(i9).A04() != -1) {
                int i10 = i3 - 1;
                jA04 = list.get(i3).A04() - list.get(i10).A04();
            }
            t6.A0A(jA04);
            list.get(i3).A08(list.get(i3).A02() - list.get(i3).A01());
        }
    }

    public final java.util.List<com.facebook.ads.redexgen.core.T5> A0B() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.A00.drainTo(arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    public final void A0C(com.facebook.ads.redexgen.core.T5 t5) {
        com.facebook.ads.redexgen.core.T5 t5PeekLast = this.A00.peekLast();
        if (t5PeekLast != null) {
            long jA03 = t5PeekLast.A03();
            long jA04 = t5.A03();
            if (A04[4].charAt(10) == 'f') {
                A04[1] = "";
                if (jA03 == jA04 && t5PeekLast.A01() == t5.A01()) {
                    return;
                }
                this.A00.add(t5);
                if (A04[4].charAt(10) == 'f') {
                    A04[0] = "kleFc3GTYdmSeGzzaJMmIvt997RVj";
                    return;
                }
            }
        } else {
            this.A00.add(t5);
            if (A04[4].charAt(10) == 'f') {
                A04[0] = "kleFc3GTYdmSeGzzaJMmIvt997RVj";
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }
}
