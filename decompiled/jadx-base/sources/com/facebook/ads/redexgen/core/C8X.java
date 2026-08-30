package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8X {
    public static byte[] A0F;
    public static final com.facebook.ads.internal.protocol.AdPlacementType A0G;
    public static final java.lang.String A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public com.facebook.ads.internal.protocol.AdPlacementType A0B;
    public boolean A0D;
    public java.util.List<com.facebook.ads.internal.dto.AdCookieData> A0C = null;
    public final long A0E = java.lang.System.currentTimeMillis();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0056  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C8X(java.util.Map<java.lang.String, java.lang.String> map) {
        byte b;
        this.A01 = -1;
        this.A00 = -1;
        this.A0B = A0G;
        this.A03 = 1;
        this.A0A = 0;
        this.A04 = 0;
        this.A05 = 20;
        this.A08 = 0;
        this.A09 = 1000;
        this.A06 = 10000;
        this.A07 = 200;
        this.A02 = 3600;
        this.A0D = false;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            switch (key.hashCode()) {
                case -1561601017:
                    if (key.equals(A01(105, 17, 37))) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                    break;
                case -856794442:
                    if (key.equals(A01(org.objectweb.asm.Opcodes.IFNONNULL, 26, 14))) {
                        b = 10;
                    } else {
                        b = -1;
                    }
                    break;
                case -726276175:
                    if (key.equals(A01(122, 15, 32))) {
                        b = 11;
                    } else {
                        b = -1;
                    }
                    break;
                case -634541425:
                    if (key.equals(A01(9, 32, 26))) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                    break;
                case -553208868:
                    if (key.equals(A01(0, 9, 14))) {
                        b = 6;
                    } else {
                        b = -1;
                    }
                    break;
                case 3575610:
                    if (key.equals(A01(org.objectweb.asm.Opcodes.L2F, 4, 34))) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case 700812481:
                    if (key.equals(A01(41, 26, 71))) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                case 858630459:
                    if (key.equals(A01(225, 24, 119))) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case 986744879:
                    if (key.equals(A01(141, 27, 79))) {
                        b = 12;
                    } else {
                        b = -1;
                    }
                    break;
                case 1085444827:
                    if (key.equals(A01(98, 7, 46))) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case 1183549815:
                    if (key.equals(A01(org.objectweb.asm.Opcodes.JSR, 31, 41))) {
                        b = 9;
                    } else {
                        b = -1;
                    }
                    break;
                case 1503616961:
                    if (key.equals(A01(67, 16, 88))) {
                        b = 8;
                    } else {
                        b = -1;
                    }
                    break;
                case 2002133996:
                    if (key.equals(A01(83, 15, 52))) {
                        b = 7;
                    } else {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    this.A0B = com.facebook.ads.internal.protocol.AdPlacementType.fromString(entry.getValue());
                    break;
                case 1:
                    this.A03 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 2:
                    this.A0A = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 3:
                    this.A04 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 4:
                    this.A05 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 5:
                    this.A02 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 6:
                    this.A0D = java.lang.Boolean.valueOf(entry.getValue()).booleanValue();
                    break;
                case 7:
                    this.A01 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 8:
                    this.A00 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 9:
                    this.A08 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 10:
                    this.A09 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 11:
                    this.A06 = java.lang.Integer.parseInt(entry.getValue());
                    break;
                case 12:
                    try {
                        this.A07 = java.lang.Integer.parseInt(entry.getValue());
                    } catch (java.lang.NumberFormatException unused) {
                        this.A07 = 200;
                    }
                    break;
            }
        }
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 46);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A0F = new byte[]{67, 65, 67, 72, 69, 65, 66, 76, 69, 93, 90, 66, 85, 88, 93, 80, 85, 64, 93, 91, 90, 107, 80, 65, 70, 85, 64, 93, 91, 90, 107, 93, 90, 107, 71, 81, 87, 91, 90, 80, 71, 4, 0, 7, 54, 31, 0, 12, 30, 8, 11, 0, 5, 0, 29, 16, 54, 25, 12, 27, 10, 12, 7, 29, 8, 14, 12, 6, 26, 23, 21, 19, 27, 19, 24, 2, 41, 30, 19, 31, 17, 30, 2, 106, 118, 123, 121, 127, 119, 127, 116, 110, 69, 109, 115, 126, 110, 114, 114, 101, 102, 114, 101, 115, 104, 121, 110, 109, 121, 110, 120, 99, 84, 127, 99, 121, 110, 120, 99, 100, 103, 111, 124, 107, 127, 123, 107, 125, 122, 81, 122, 103, 99, 107, 97, 123, 122, 120, 117, 124, 105, 23, 8, 5, 4, 14, 62, 21, 8, 12, 4, 62, 17, 14, 13, 13, 8, 15, 6, 62, 8, 15, 21, 4, 19, 23, 0, 13, 113, 110, 98, 112, 102, 101, 110, 107, 110, 115, 126, 88, 100, 111, 98, 100, 108, 88, 110, 105, 110, 115, 110, 102, 107, 88, 99, 98, 107, 102, 126, 86, 73, 69, 87, 65, 66, 73, 76, 73, 84, 89, 127, 67, 72, 69, 67, 75, 127, 73, 78, 84, 69, 82, 86, 65, 76, 47, 48, 60, 46, 56, 59, 48, 53, 48, 45, 32, 6, 58, 49, 60, 58, 50, 6, 45, 48, 58, 50, 60, 43};
    }

    static {
        A02();
        A0H = com.facebook.ads.redexgen.core.C8X.class.getSimpleName();
        A0G = com.facebook.ads.internal.protocol.AdPlacementType.UNKNOWN;
    }

    public static com.facebook.ads.redexgen.core.C8X A00(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        java.util.HashMap map = new java.util.HashMap();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            map.put(next, java.lang.String.valueOf(jSONObject.opt(next)));
        }
        return new com.facebook.ads.redexgen.core.C8X(map);
    }

    public final int A03() {
        return this.A02 * 1000;
    }

    public final int A04() {
        return this.A03;
    }

    public final int A05() {
        return this.A06;
    }

    public final int A06() {
        return this.A07;
    }

    public final int A07() {
        return this.A08;
    }

    public final int A08() {
        return this.A09;
    }

    public final int A09() {
        return this.A0A;
    }

    public final long A0A() {
        return this.A04 * 1000;
    }

    public final long A0B() {
        return this.A05 * 1000;
    }

    public final long A0C() {
        return this.A0E;
    }

    public final com.facebook.ads.internal.protocol.AdPlacementType A0D() {
        return this.A0B;
    }

    public final boolean A0E() {
        return this.A0D;
    }
}
