package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1118Wm implements com.facebook.ads.redexgen.core.HZ {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"Lc6ZOpuSjj1IHjH2AmdfZtL4EvSihTxE", "IELx2s2BPgCyTaxK8MOl1UNvPdICN", "VyVHRG1xUDuOqri22aozQUHlXh3udCdp", "xQTxbie1EDs9qNLRcg8m2j5qa6BjCdLv", "YtJ3b", "RvEZ7gkpXF5RUk3l1kihsAxfWlQybyIP", "tRVDeAYq1jPcmMGohTMj2AD5wcAJrX0H", "cEMi7KsqJ6Y68dGPnFARRJAd4Z3ugaKF"};
    public static final com.facebook.ads.redexgen.core.C1118Wm A04;
    public int A00;
    public final java.util.Map<java.lang.String, byte[]> A01;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 125);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{68, 99, 123, 108, 97, 100, 105, 45, 123, 108, 97, 120, 104, 45, 126, 100, 119, 104, 55, 45, 122, 70, 75, 14, 93, 71, 84, 75, 14, 65, 72, 14, 11, 93, 14, 6, 11, 74, 7, 14, 71, 93, 14, 73, 92, 75, 79, 90, 75, 92, 14, 90, 70, 79, 64, 14, 67, 79, 86, 71, 67, 91, 67, 14, 79, 66, 66, 65, 89, 75, 74, 20, 14, 11, 74, 104, 105, 123, 16, 5};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A05(java.util.HashMap<java.lang.String, byte[]> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        for (java.lang.String str : map2.keySet()) {
            byte[] bArrA07 = A07(map2.get(str));
            if (bArrA07.length > 10485760) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(A01(20, 55, 83), str, java.lang.Integer.valueOf(bArrA07.length), 10485760));
            }
            map.put(str, bArrA07);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private boolean A06(java.util.Map<java.lang.String, byte[]> map) {
        if (this.A01.size() != map.size()) {
            return false;
        }
        for (java.util.Map.Entry<java.lang.String, byte[]> entry : this.A01.entrySet()) {
            if (!java.util.Arrays.equals(entry.getValue(), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    static {
        A03();
        A04 = new com.facebook.ads.redexgen.core.C1118Wm(java.util.Collections.emptyMap());
    }

    public C1118Wm(java.util.Map<java.lang.String, byte[]> metadata) {
        this.A01 = java.util.Collections.unmodifiableMap(metadata);
    }

    public static com.facebook.ads.redexgen.core.C1118Wm A00(java.io.DataInputStream dataInputStream) throws java.io.IOException {
        int i = dataInputStream.readInt();
        java.util.HashMap map = new java.util.HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.String utf = dataInputStream.readUTF();
            int valueSize = dataInputStream.readInt();
            if (valueSize >= 0 && valueSize <= 10485760) {
                byte[] bArr = new byte[valueSize];
                dataInputStream.readFully(bArr);
                map.put(utf, bArr);
            } else {
                throw new java.io.IOException(A01(0, 20, 112) + valueSize);
            }
        }
        return new com.facebook.ads.redexgen.core.C1118Wm(map);
    }

    public static java.util.Map<java.lang.String, byte[]> A02(java.util.Map<java.lang.String, byte[]> otherMetadata, com.facebook.ads.redexgen.core.C0726Hb c0726Hb) {
        java.util.HashMap map = new java.util.HashMap(otherMetadata);
        A04(map, c0726Hb.A04());
        A05(map, c0726Hb.A05());
        return map;
    }

    public static void A04(java.util.HashMap<java.lang.String, byte[]> metadata, java.util.List<java.lang.String> names) {
        for (int i = 0; i < i; i++) {
            metadata.remove(names.get(i));
        }
    }

    public static byte[] A07(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return java.nio.ByteBuffer.allocate(8).putLong(((java.lang.Long) obj).longValue()).array();
        }
        if (obj instanceof java.lang.String) {
            return ((java.lang.String) obj).getBytes(java.nio.charset.Charset.forName(A01(75, 5, 64)));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final com.facebook.ads.redexgen.core.C1118Wm A08(com.facebook.ads.redexgen.core.C0726Hb c0726Hb) {
        java.util.Map<java.lang.String, byte[]> mapA02 = A02(this.A01, c0726Hb);
        if (A06(mapA02)) {
            return this;
        }
        return new com.facebook.ads.redexgen.core.C1118Wm(mapA02);
    }

    public final void A09(java.io.DataOutputStream dataOutputStream) throws java.io.IOException {
        dataOutputStream.writeInt(this.A01.size());
        for (java.util.Map.Entry<java.lang.String, byte[]> entry : this.A01.entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Override // com.facebook.ads.redexgen.core.HZ
    public final long A6B(java.lang.String str, long j) {
        if (this.A01.containsKey(str)) {
            byte[] bytes = this.A01.get(str);
            return java.nio.ByteBuffer.wrap(bytes).getLong();
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.core.HZ
    public final java.lang.String A6D(java.lang.String str, java.lang.String str2) {
        if (this.A01.containsKey(str)) {
            return new java.lang.String(this.A01.get(str), java.nio.charset.Charset.forName(A01(75, 5, 64)));
        }
        return str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            if (A03[5].charAt(22) == 'A') {
                throw new java.lang.RuntimeException();
            }
            A03[0] = "dWllOszLC286Wa2jG7unkbyNU8fMVO47";
            return false;
        }
        java.util.Map<java.lang.String, byte[]> map = ((com.facebook.ads.redexgen.core.C1118Wm) obj).A01;
        java.lang.String[] strArr = A03;
        if (strArr[6].charAt(20) != strArr[3].charAt(20)) {
            throw new java.lang.RuntimeException();
        }
        A03[0] = "y2cTPgBEZJ0CQAPDGqNYJyLCowU9mkWr";
        return A06(map);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i = 0;
            for (java.util.Map.Entry<java.lang.String, byte[]> entry : this.A01.entrySet()) {
                int iHashCode = entry.getKey().hashCode();
                int result = java.util.Arrays.hashCode(entry.getValue());
                i += iHashCode ^ result;
            }
            this.A00 = i;
        }
        int result2 = this.A00;
        return result2;
    }
}
