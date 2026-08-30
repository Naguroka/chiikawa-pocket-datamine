package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1182Zb implements com.facebook.ads.redexgen.core.InterfaceC0802Ke {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"cL9KuymxmXYmG8NC9NVGcaGlfdWWeniK", "Nk16ts9BY6zqy", "EgJ1qeWjq2zhUumNQfvGHLF4hTEd3z2y", "RODoYaIjQAnjV1WNThn2vejpwKsM19Cc", "40Y1apu8pWAms0kzI1QlbJay1792dWSe", "dN3sSSJjIpaTvjnI8sFpNb6rIgDjDuKA", "fmvlDKN6b1IL1", "7gRFv5vnh1tPqRcG4sTxqyzgIBUkam47"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1198Zr A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 58);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        java.lang.String[] strArr = A02;
        if (strArr[1].length() != strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        A02[0] = "cTAx5t1qCw5Hmq8oguM2xeNpSThd5fgi";
        A01 = new byte[]{-47, -51, -52, 0, -17, -12, -16, -7, -18, -16, -39, -16, -1, 2, -6, -3, -10, -5, 20, 11, 30, 22, 11, 9, 26, 11, 10, -58, 11, 24, 24, 21, 24, -44, -94, -79, -96, -78, -89, -98, -78, -89, -88, -92, -85, -93};
    }

    static {
        A01();
    }

    public C1182Zb(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        this.A00 = c1198Zr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0802Ke
    public final void A9s(int i, java.lang.Throwable th) {
        android.util.Log.e(A00(0, 17, 81), A00(17, 17, 108), th);
        this.A00.A07().AA0(A00(34, 12, 5), i, new com.facebook.ads.redexgen.core.C8F(th));
    }
}
