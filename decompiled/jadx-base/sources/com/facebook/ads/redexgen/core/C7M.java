package com.facebook.ads.redexgen.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7M {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"DEtwtGzSxOHfmsYE0nJutNtLbuPgZxnp", "HEN1zAi3Yn4iHVof3jMUFUQ", "m8f1TG9WFPBUvQLDx3K0MLj2Za0d4Euo", "A4PZagHoSRM8cM4mqm2KVFoT1GUYa0fw", "0QxzD8ZSXkCRRI3ROeoKuabFTd70p3Eq", "xILcHU0IM590zH2kPS2o7", "opJvnU19Lwme99brEfR2F", "9Gp2VR68AX"};
    public static final /* synthetic */ com.facebook.ads.redexgen.core.C7M[] A02;
    public static final com.facebook.ads.redexgen.core.C7M A03;
    public static final com.facebook.ads.redexgen.core.C7M A04;
    public static final com.facebook.ads.redexgen.core.C7M A05;
    public static final com.facebook.ads.redexgen.core.C7M A06;
    public static final com.facebook.ads.redexgen.core.C7M A07;
    public static final com.facebook.ads.redexgen.core.C7M A08;
    public static final com.facebook.ads.redexgen.core.C7M A09;
    public static final com.facebook.ads.redexgen.core.C7M A0A;
    public static final com.facebook.ads.redexgen.core.C7M A0B;
    public static final com.facebook.ads.redexgen.core.C7M A0C;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 123);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-37, -26, -26, -21, -8, -8, -11, -18, -22, -9, -66, -61, -68, -51, -63, -52, -46, -65, -55, -62, -17, -11, -8, -22, -3, 29, 34, 40, -29, -26, -27, -34, 45, 52, 43, 43, 24, 26, 17, 21, 17, 28, 17, 30, 13, -23, -22, -24, -33, -28, -35};
        if (A01[2].charAt(8) != 'F') {
            throw new java.lang.RuntimeException();
        }
        A01[2] = "JRHKMDEWFLpt4s2hfuCsUWWHTwNaAfzC";
        A00 = bArr;
    }

    static {
        A01();
        A0A = new com.facebook.ads.redexgen.core.C7M(A00(32, 4, 100), 0);
        A08 = new com.facebook.ads.redexgen.core.C7M(A00(25, 3, 89), 1);
        A09 = new com.facebook.ads.redexgen.core.C7M(A00(28, 4, 28), 2);
        A07 = new com.facebook.ads.redexgen.core.C7M(A00(20, 5, 46), 3);
        A06 = new com.facebook.ads.redexgen.core.C7M(A00(14, 6, 2), 4);
        A04 = new com.facebook.ads.redexgen.core.C7M(A00(3, 7, 46), 5);
        A05 = new com.facebook.ads.redexgen.core.C7M(A00(10, 4, 0), 6);
        A0C = new com.facebook.ads.redexgen.core.C7M(A00(45, 6, 27), 7);
        A03 = new com.facebook.ads.redexgen.core.C7M(A00(0, 3, 31), 8);
        A0B = new com.facebook.ads.redexgen.core.C7M(A00(36, 9, 77), 9);
        A02 = A02();
    }

    public C7M(java.lang.String str, int i) {
        super(str, i);
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.C7M[] A02() {
        com.facebook.ads.redexgen.core.C7M[] c7mArr = new com.facebook.ads.redexgen.core.C7M[10];
        c7mArr[0] = A0A;
        c7mArr[1] = A08;
        c7mArr[2] = A09;
        c7mArr[3] = A07;
        c7mArr[4] = A06;
        c7mArr[5] = A04;
        c7mArr[6] = A05;
        c7mArr[7] = A0C;
        if (A01[1].length() == 27) {
            throw new java.lang.RuntimeException();
        }
        A01[1] = "WetVKWfSjesX";
        c7mArr[8] = A03;
        c7mArr[9] = A0B;
        return c7mArr;
    }

    public static com.facebook.ads.redexgen.core.C7M valueOf(java.lang.String str) {
        return (com.facebook.ads.redexgen.core.C7M) java.lang.Enum.valueOf(com.facebook.ads.redexgen.core.C7M.class, str);
    }

    public static com.facebook.ads.redexgen.core.C7M[] values() {
        return (com.facebook.ads.redexgen.core.C7M[]) A02.clone();
    }
}
