package com.facebook.ads.redexgen.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JZ {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"t11qfTcdRX3vtzWg9o3D7yzOQIlsgekI", "6i20agDhmSdy9vSyuA65WoFMQBMnYQqu", "rdyvRl0mnrLy9iBwCAplKJJzDaMabc0M", "SOZt7VgRETJYcVg4", "xbstiP5KKiAzncux", "VTcuBCbEWMb14OGNQVtfuGUmCLIRmz1L", "NW0LuK6Vb9eH6jcO6lyYeFn7KSHSxynw", "5brGPIOfpSxIScBaveghLVMlb1271YeU"};
    public static final /* synthetic */ com.facebook.ads.redexgen.core.JZ[] A02;
    public static final com.facebook.ads.redexgen.core.JZ A03;
    public static final com.facebook.ads.redexgen.core.JZ A04;
    public static final com.facebook.ads.redexgen.core.JZ A05;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 33);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{88, 89, 90, 93, 73, 80, 72, 98, 107, 107, 2, 3};
    }

    static {
        A02();
        A03 = new com.facebook.ads.redexgen.core.JZ(A01(0, 7, 61), 0);
        A05 = new com.facebook.ads.redexgen.core.JZ(A01(10, 2, 108), 1);
        A04 = new com.facebook.ads.redexgen.core.JZ(A01(7, 3, 12), 2);
        A02 = A03();
    }

    public JZ(java.lang.String str, int i) {
        super(str, i);
    }

    public static com.facebook.ads.VideoAutoplayBehavior A00(com.facebook.ads.redexgen.core.JZ jz) {
        if (jz == null) {
            return com.facebook.ads.VideoAutoplayBehavior.DEFAULT;
        }
        switch (com.facebook.ads.redexgen.core.JY.A00[jz.ordinal()]) {
            case 1:
                com.facebook.ads.VideoAutoplayBehavior videoAutoplayBehavior = com.facebook.ads.VideoAutoplayBehavior.DEFAULT;
                if (A01[1].charAt(31) != 'u') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A01;
                strArr[2] = "tGhoRPzzdwkU9rBMhrkq51QPgJKMKCG7";
                strArr[7] = "oLzw2E9OShYSASB843fXRAiyIcSfpUGD";
                return videoAutoplayBehavior;
            case 2:
                return com.facebook.ads.VideoAutoplayBehavior.ON;
            case 3:
                return com.facebook.ads.VideoAutoplayBehavior.OFF;
            default:
                return com.facebook.ads.VideoAutoplayBehavior.DEFAULT;
        }
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.JZ[] A03() {
        com.facebook.ads.redexgen.core.JZ[] jzArr = new com.facebook.ads.redexgen.core.JZ[3];
        jzArr[0] = A03;
        if (A01[5].charAt(31) != 'L') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[3] = "zoiTRupMudK7uDXw";
        strArr[4] = "VFYrxWbIb3tlnjHn";
        jzArr[1] = A05;
        jzArr[2] = A04;
        return jzArr;
    }

    public static com.facebook.ads.redexgen.core.JZ valueOf(java.lang.String str) {
        return (com.facebook.ads.redexgen.core.JZ) java.lang.Enum.valueOf(com.facebook.ads.redexgen.core.JZ.class, str);
    }

    public static com.facebook.ads.redexgen.core.JZ[] values() {
        return (com.facebook.ads.redexgen.core.JZ[]) A02.clone();
    }
}
