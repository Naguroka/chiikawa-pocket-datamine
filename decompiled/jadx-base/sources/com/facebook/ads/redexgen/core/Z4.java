package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z4 implements com.facebook.ads.redexgen.core.InterfaceC0585Ax {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.Z3 A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 9);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{56, 44, -97, -45, -62, -57, -51, -78, -48, -65, -63, -55, -90, -60, -53, -52, -49, -58, -53, -60, 125, -58, -54, -51, -52, -48, -48, -58, -65, -55, -42, 125, -55, -66, -49, -60, -62, 125, -66, -46, -63, -58, -52, 125, -55, -66, -47, -62, -53, -64, -42, -105, 125, -92, -63, -58, -61, -70, -64, -58, -60, 113, -78, -58, -75, -70, -64, 113, -59, -70, -66, -74, -60, -59, -78, -66, -63, 113, 121, -73, -61, -78, -66, -74, 113, -63, -64, -60, -70, -59, -70, -64, -65, 113, -66, -70, -60, -66, -78, -59, -76, -71, 122, -117, 113, 118, -109, -104, -107, -116, -110, -104, -106, 67, -124, -104, -121, -116, -110, 67, -105, -116, -112, -120, -106, -105, -124, -112, -109, 67, 75, -106, -100, -106, -105, -120, -112, 67, -122, -113, -110, -122, -114, 67, -112, -116, -106, -112, -124, -105, -122, -117, 76, 93, 67};
    }

    public Z4(com.facebook.ads.redexgen.core.Z3 z3) {
        this.A00 = z3;
    }

    public /* synthetic */ Z4(com.facebook.ads.redexgen.core.Z3 z3, com.facebook.ads.redexgen.core.B0 b0) {
        this(z3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0585Ax
    public final void ACM(long j) {
        android.util.Log.w(A00(2, 10, 85), A00(12, 41, 84) + j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0585Ax
    public final void ADB(long j, long j2, long j3, long j4) {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A00(53, 52, 72)).append(j);
        java.lang.String strA00 = A00(0, 2, 3);
        java.lang.String string = sbAppend.append(strA00).append(j2).append(strA00).append(j3).append(strA00).append(j4).append(strA00).append(this.A00.A03()).append(strA00).append(this.A00.A04()).toString();
        if (!com.facebook.ads.redexgen.core.Z3.A0q) {
            java.lang.String message = A00(2, 10, 85);
            android.util.Log.w(message, string);
            return;
        }
        throw new com.facebook.ads.redexgen.core.B3(string, null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0585Ax
    public final void ADk(long j, long j2, long j3, long j4) {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A00(105, 50, 26)).append(j);
        java.lang.String strA00 = A00(0, 2, 3);
        java.lang.String string = sbAppend.append(strA00).append(j2).append(strA00).append(j3).append(strA00).append(j4).append(strA00).append(this.A00.A03()).append(strA00).append(this.A00.A04()).toString();
        if (!com.facebook.ads.redexgen.core.Z3.A0q) {
            java.lang.String message = A00(2, 10, 85);
            android.util.Log.w(message, string);
            return;
        }
        throw new com.facebook.ads.redexgen.core.B3(string, null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0585Ax
    public final void ADt(int i, long j) {
        if (this.A00.A0R != null) {
            this.A00.A0R.ADu(i, j, android.os.SystemClock.elapsedRealtime() - this.A00.A0E);
        }
    }
}
