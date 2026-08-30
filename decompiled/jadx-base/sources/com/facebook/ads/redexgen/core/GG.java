package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GG {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"JDfSV5wyrXHyMXmfYo4khX4qY", "sKIWSmPUwCcQTj66G2u6KGbEKZveKmo3", "UxOb46GnXn9Nptn2tTFDr9Gk0", "uDv9SVgfUW39IIs8tNcz758bHakFPicZ", "FmyptmPbirw6sb6YbpxE4nvRyKHlbC66", "YMIkwLqj3iEd2G3rmnP9ybBw", "PNyVGYryxs48kh5nTOpWyZqB", "dBJrsGAcHV4edhw9dfAhPQoXUspDKIy9"};
    public java.util.List<com.facebook.ads.redexgen.core.GG> A00;
    public final long A01;
    public final long A02;
    public final com.facebook.ads.redexgen.core.GM A03;
    public final java.lang.String A04;
    public final java.lang.String A05;
    public final java.lang.String A06;
    public final boolean A07;
    public final java.util.HashMap<java.lang.String, java.lang.Integer> A08;
    public final java.util.HashMap<java.lang.String, java.lang.Integer> A09;
    public final java.lang.String[] A0A;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 87);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A0B = new byte[]{53, 69, 39, 31, 46, 27, 30, 27, 46, 27, 46};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A08(long j, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GM> map, java.util.Map<java.lang.String, android.text.SpannableStringBuilder> map2) {
        if (A0C(j)) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : this.A08.entrySet()) {
                java.lang.String key = entry.getKey();
                int iIntValue = this.A09.containsKey(key) ? this.A09.get(key).intValue() : 0;
                int iIntValue2 = entry.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    A0A(map, map2.get(key), iIntValue, iIntValue2);
                }
            }
            for (int i = 0; i < A00(); i++) {
                A03(i).A08(j, map, map2);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final java.util.List<com.facebook.ads.redexgen.core.C0693Fs> A0D(long j, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GM> map, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GH> map2) {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        A09(j, false, this.A04, treeMap);
        A08(j, map, treeMap);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            com.facebook.ads.redexgen.core.GH gh = map2.get(entry.getKey());
            arrayList.add(new com.facebook.ads.redexgen.core.C0693Fs(A01((android.text.SpannableStringBuilder) entry.getValue()), (android.text.Layout.Alignment) null, gh.A00, gh.A05, gh.A04, gh.A01, Integer.MIN_VALUE, gh.A03, gh.A06, gh.A02));
        }
        return arrayList;
    }

    static {
        A07();
    }

    public GG(java.lang.String str, java.lang.String str2, long j, long j2, com.facebook.ads.redexgen.core.GM gm, java.lang.String[] strArr, java.lang.String str3) {
        this.A05 = str;
        this.A06 = str2;
        this.A03 = gm;
        this.A0A = strArr;
        this.A07 = str2 != null;
        this.A02 = j;
        this.A01 = j2;
        this.A04 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(str3);
        this.A09 = new java.util.HashMap<>();
        this.A08 = new java.util.HashMap<>();
    }

    private final int A00() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.size();
    }

    private android.text.SpannableStringBuilder A01(android.text.SpannableStringBuilder spannableStringBuilder) {
        int j = spannableStringBuilder.length();
        for (int spacesToDelete = 0; spacesToDelete < j; spacesToDelete++) {
            int builderLength = spannableStringBuilder.charAt(spacesToDelete);
            if (builderLength == 32) {
                int i = spacesToDelete + 1;
                while (i < builderLength) {
                    int builderLength2 = spannableStringBuilder.charAt(i);
                    if (builderLength2 != 32) {
                        break;
                    }
                    i++;
                }
                int builderLength3 = spacesToDelete + 1;
                int i2 = i - builderLength3;
                if (i2 > 0) {
                    int builderLength4 = spacesToDelete + i2;
                    spannableStringBuilder.delete(spacesToDelete, builderLength4);
                    j -= i2;
                }
            }
        }
        if (j > 0) {
            int builderLength5 = spannableStringBuilder.charAt(0);
            if (builderLength5 == 32) {
                spannableStringBuilder.delete(0, 1);
                j--;
            }
        }
        for (int i3 = 0; i3 < builderLength; i3++) {
            int builderLength6 = spannableStringBuilder.charAt(i3);
            if (builderLength6 == 10) {
                int builderLength7 = i3 + 1;
                if (spannableStringBuilder.charAt(builderLength7) == 32) {
                    int i4 = i3 + 1;
                    int builderLength8 = i3 + 2;
                    spannableStringBuilder.delete(i4, builderLength8);
                    j--;
                }
            }
        }
        if (j > 0) {
            int i5 = j - 1;
            java.lang.String[] strArr = A0C;
            java.lang.String str = strArr[2];
            java.lang.String str2 = strArr[0];
            int length = str.length();
            int builderLength9 = str2.length();
            if (length != builderLength9) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[5] = "TDuno9pHlCredo5aNiY0XERi";
            strArr2[6] = "pBdvjRb433p85efB78hwWLEg";
            int builderLength10 = spannableStringBuilder.charAt(i5);
            if (builderLength10 == 32) {
                int builderLength11 = j - 1;
                spannableStringBuilder.delete(builderLength11, j);
                if (A0C[3].charAt(30) != 'c') {
                    java.lang.String[] strArr3 = A0C;
                    strArr3[5] = "iHdziTN63dbfxf9TDl4asLIF";
                    strArr3[6] = "yVotv3k3QQIRgMKV5MbU4w7A";
                    j--;
                } else {
                    java.lang.String[] strArr4 = A0C;
                    strArr4[2] = "1mfmZid8qDUWPWNjelwjU7uaY";
                    strArr4[0] = "TMlUamkf9ZzUNuUmUEqLFNDYF";
                    j--;
                }
            }
        }
        for (int i6 = 0; i6 < builderLength; i6++) {
            int builderLength12 = spannableStringBuilder.charAt(i6);
            if (builderLength12 == 32) {
                int builderLength13 = i6 + 1;
                if (spannableStringBuilder.charAt(builderLength13) == 10) {
                    int builderLength14 = i6 + 1;
                    spannableStringBuilder.delete(i6, builderLength14);
                    j--;
                }
            }
        }
        if (j > 0) {
            int builderLength15 = j - 1;
            if (spannableStringBuilder.charAt(builderLength15) == 10) {
                int i7 = j - 1;
                if (A0C[3].charAt(30) != 'c') {
                    spannableStringBuilder.delete(i7, j);
                } else {
                    A0C[4] = "77nY8oBWpidVHbM4I1vmA2HaFAJ9JryL";
                    spannableStringBuilder.delete(i7, j);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static android.text.SpannableStringBuilder A02(java.lang.String str, java.util.Map<java.lang.String, android.text.SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new android.text.SpannableStringBuilder());
        }
        android.text.SpannableStringBuilder spannableStringBuilder = map.get(str);
        java.lang.String[] strArr = A0C;
        if (strArr[5].length() != strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0C;
        strArr2[5] = "XtAWwxpd4uEFjP1Jw3oVJWQN";
        strArr2[6] = "cGrjAdGDUe9ay7NJgvLzegtX";
        return spannableStringBuilder;
    }

    private final com.facebook.ads.redexgen.core.GG A03(int i) {
        if (this.A00 != null) {
            return this.A00.get(i);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public static com.facebook.ads.redexgen.core.GG A04(java.lang.String str) {
        return new com.facebook.ads.redexgen.core.GG(null, com.facebook.ads.redexgen.core.GI.A02(str), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, null, null, A06(0, 0, 60));
    }

    public static com.facebook.ads.redexgen.core.GG A05(java.lang.String str, long j, long j2, com.facebook.ads.redexgen.core.GM gm, java.lang.String[] strArr, java.lang.String str2) {
        return new com.facebook.ads.redexgen.core.GG(str, null, j, j2, gm, strArr, str2);
    }

    private void A09(long j, boolean z, java.lang.String str, java.util.Map<java.lang.String, android.text.SpannableStringBuilder> regionOutputs) {
        java.lang.String str2 = str;
        this.A09.clear();
        this.A08.clear();
        if (A06(2, 8, 99).equals(this.A05)) {
            return;
        }
        if (!A06(0, 0, 60).equals(this.A04)) {
            str2 = this.A04;
        }
        if (this.A07 && z) {
            android.text.SpannableStringBuilder spannableStringBuilderA02 = A02(str2, regionOutputs);
            java.lang.String resolvedRegionId = this.A06;
            spannableStringBuilderA02.append((java.lang.CharSequence) resolvedRegionId);
            return;
        }
        java.lang.String strA06 = A06(0, 2, 124);
        java.lang.String resolvedRegionId2 = this.A05;
        if (strA06.equals(resolvedRegionId2) && z) {
            A02(str2, regionOutputs).append('\n');
            return;
        }
        if (!A0C(j)) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, android.text.SpannableStringBuilder> entry : regionOutputs.entrySet()) {
            this.A09.put(entry.getKey(), java.lang.Integer.valueOf(entry.getValue().length()));
        }
        java.lang.String strA07 = A06(10, 1, 103);
        java.lang.String resolvedRegionId3 = this.A05;
        boolean zEquals = strA07.equals(resolvedRegionId3);
        for (int i = 0; i < A00(); i++) {
            A03(i).A09(j, z || zEquals, str2, regionOutputs);
        }
        if (zEquals) {
            android.text.SpannableStringBuilder spannableStringBuilderA03 = A02(str2, regionOutputs);
            java.lang.String[] strArr = A0C;
            java.lang.String str3 = strArr[2];
            java.lang.String resolvedRegionId4 = strArr[0];
            if (str3.length() != resolvedRegionId4.length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[5] = "yvEq3zaiQGZNygn4ZYaSJQ0D";
            strArr2[6] = "Pd1rV5k1uSm041xQLz3VYcWj";
            com.facebook.ads.redexgen.core.GI.A04(spannableStringBuilderA03);
        }
        for (java.util.Map.Entry<java.lang.String, android.text.SpannableStringBuilder> entry2 : regionOutputs.entrySet()) {
            this.A08.put(entry2.getKey(), java.lang.Integer.valueOf(entry2.getValue().length()));
        }
    }

    private void A0A(java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GM> map, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        com.facebook.ads.redexgen.core.GM resolvedStyle = com.facebook.ads.redexgen.core.GI.A00(this.A03, this.A0A, map);
        if (resolvedStyle != null) {
            com.facebook.ads.redexgen.core.GI.A05(spannableStringBuilder, i, i2, resolvedStyle);
        }
    }

    private void A0B(java.util.TreeSet<java.lang.Long> out, boolean z) {
        boolean zEquals = A06(10, 1, 103).equals(this.A05);
        if (z || zEquals) {
            if (this.A02 != androidx.media3.common.C.TIME_UNSET) {
                out.add(java.lang.Long.valueOf(this.A02));
            }
            if (this.A01 != androidx.media3.common.C.TIME_UNSET) {
                out.add(java.lang.Long.valueOf(this.A01));
            }
        }
        if (this.A00 == null) {
            return;
        }
        int i = 0;
        while (true) {
            java.util.List<com.facebook.ads.redexgen.core.GG> list = this.A00;
            java.lang.String[] strArr = A0C;
            java.lang.String str = strArr[1];
            java.lang.String str2 = strArr[7];
            int i2 = str.charAt(19);
            if (i2 == str2.charAt(19)) {
                throw new java.lang.RuntimeException();
            }
            A0C[3] = "vNUGiZzveS47Opw4EGvIArAbOiQyEFcc";
            if (i < list.size()) {
                com.facebook.ads.redexgen.core.GG gg = this.A00.get(i);
                boolean isPNode = z || zEquals;
                gg.A0B(out, isPNode);
                i++;
            } else {
                return;
            }
        }
    }

    private final boolean A0C(long j) {
        return (this.A02 == androidx.media3.common.C.TIME_UNSET && this.A01 == androidx.media3.common.C.TIME_UNSET) || (this.A02 <= j && this.A01 == androidx.media3.common.C.TIME_UNSET) || ((this.A02 == androidx.media3.common.C.TIME_UNSET && j < this.A01) || (this.A02 <= j && j < this.A01));
    }

    public final void A0E(com.facebook.ads.redexgen.core.GG gg) {
        if (this.A00 == null) {
            this.A00 = new java.util.ArrayList();
        }
        this.A00.add(gg);
    }

    public final long[] A0F() {
        java.util.TreeSet<java.lang.Long> treeSet = new java.util.TreeSet<>();
        A0B(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        int i = 0;
        java.util.Iterator<java.lang.Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }
}
