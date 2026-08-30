package com.facebook.ads.redexgen.core;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EnumC03451c {
    public static byte[] A01;
    public static final /* synthetic */ com.facebook.ads.redexgen.core.EnumC03451c[] A02;
    public static final com.facebook.ads.redexgen.core.EnumC03451c A03;
    public static final com.facebook.ads.redexgen.core.EnumC03451c A04;
    public static final com.facebook.ads.redexgen.core.EnumC03451c A05;
    public final java.lang.String A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 83);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-91, -88, -85, -92, -66, -81, -79, -92, -94, -96, -94, -89, -92, 5, 7, 4, 13, 14, 20, 5, 7, -6, -8, -10, -8, -3, -6, 15, -3, -6, 14, 1, -3, 15, 23, 8, 10, -3, -5, -7, -5, 0, -3};
    }

    static {
        A02();
        java.lang.String strA01 = A01(27, 16, 101);
        A05 = new com.facebook.ads.redexgen.core.EnumC03451c(strA01, 0, strA01);
        java.lang.String strA02 = A01(13, 14, 98);
        A04 = new com.facebook.ads.redexgen.core.EnumC03451c(strA02, 1, strA02);
        java.lang.String strA03 = A01(0, 13, 12);
        A03 = new com.facebook.ads.redexgen.core.EnumC03451c(strA03, 2, strA03);
        A02 = A03();
    }

    public EnumC03451c(java.lang.String str, int i, java.lang.String str2) {
        super(str, i);
        this.A00 = str2;
    }

    public static com.facebook.ads.redexgen.core.EnumC03451c A00(java.lang.String str) {
        for (com.facebook.ads.redexgen.core.EnumC03451c enumC03451c : values()) {
            if (enumC03451c.A00.equalsIgnoreCase(str)) {
                return enumC03451c;
            }
        }
        return A03;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.EnumC03451c[] A03() {
        return new com.facebook.ads.redexgen.core.EnumC03451c[]{A05, A04, A03};
    }

    public static com.facebook.ads.redexgen.core.EnumC03451c valueOf(java.lang.String str) {
        return (com.facebook.ads.redexgen.core.EnumC03451c) java.lang.Enum.valueOf(com.facebook.ads.redexgen.core.EnumC03451c.class, str);
    }

    public static com.facebook.ads.redexgen.core.EnumC03451c[] values() {
        return (com.facebook.ads.redexgen.core.EnumC03451c[]) A02.clone();
    }
}
