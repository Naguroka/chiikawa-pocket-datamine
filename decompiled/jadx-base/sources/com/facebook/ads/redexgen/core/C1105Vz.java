package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1105Vz extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"rr4pEtDer0K6hYSMypGI4SVA4", "qv2m0fG", "2OIR1Yv9Y7RzsB5MK8fjyIRTaeFBsJy", "02JyCSWW55zn1AQ6h7F4FoBumR9MK", "PV14KCf6Ep37wllo1HHxqudNmgtveNCD", "8xcTKK5W7UNHePnVaLckl2F", "lGpL0wggi73mqN0I3cVtORcNpouSV80j", "84RqxglWV7M6OmuSAB1gnMVf4"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.K6 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.K9 A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 98);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{121, 115, 97, 124, 127, 112, 112, 123, 108, 97, 117, 123, 103, 18, 51, 124, 50, 57, 40, 43, 51, 46, 55, 124, okio.Utf8.REPLACEMENT_BYTE, 51, 50, 50, 57, okio.Utf8.REPLACEMENT_BYTE, 40, 53, 51, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (com.facebook.ads.redexgen.core.AbstractC0839Ls.A00(this.A01.A04) == com.facebook.ads.redexgen.core.EnumC0838Lr.A07) {
            this.A01.A09();
            com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.NETWORK_ERROR;
            java.lang.String strA00 = A00(13, 21, 62);
            this.A01.A04.A0E().A3H(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A01.A00), adErrorType.getErrorCode(), strA00, adErrorType.isPublicError());
            this.A01.A0D(new com.facebook.ads.redexgen.core.C0779Jg(adErrorType, strA00));
            return;
        }
        com.facebook.ads.redexgen.core.C8N.A08(this.A01.A04);
        com.facebook.ads.redexgen.core.C6H.A07(this.A01.A04);
        boolean z = true;
        java.util.Map<java.lang.String, java.lang.String> mapA0A = this.A00.A0A(com.facebook.ads.redexgen.core.C05278q.A00().A01(this.A01.A04, true).A7K(this.A00.A05()));
        this.A01.A02 = mapA0A;
        try {
            android.content.pm.PackageManager packageManager = this.A01.A04.getPackageManager();
            if (packageManager != null) {
                mapA0A.put(A00(1, 12, 92), new java.lang.String(android.util.Base64.encode((this.A01.A04.getPackageName() + A00(0, 1, 59) + packageManager.getInstallerPackageName(this.A01.A04.getPackageName())).getBytes(), 2)));
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            if (this.A00.A07() != com.facebook.ads.redexgen.core.EnumC0783Jl.A04 && this.A00.A07() != com.facebook.ads.redexgen.core.EnumC0783Jl.A06 && this.A00.A07() != com.facebook.ads.redexgen.core.EnumC0783Jl.A05 && this.A00.A07() != null) {
                z = false;
            }
            com.facebook.ads.redexgen.core.S8.A02(z, this.A01.A04).AET(this.A01.A06, new com.facebook.ads.redexgen.core.S4().A05(this.A01.A02).A08(), this.A01.A02(com.facebook.ads.redexgen.core.C0841Lu.A00(), this.A00));
        } catch (java.lang.Exception e) {
            com.facebook.ads.internal.protocol.AdErrorType adErrorType2 = com.facebook.ads.internal.protocol.AdErrorType.AD_REQUEST_FAILED;
            java.lang.String message = e.getMessage();
            this.A01.A04.A0E().A3H(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A01.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            com.facebook.ads.redexgen.core.K9 k9 = this.A01;
            com.facebook.ads.redexgen.core.C0779Jg c0779JgA01 = com.facebook.ads.redexgen.core.C0779Jg.A01(adErrorType2, message);
            if (A03[3].length() != 29) {
                throw new java.lang.RuntimeException();
            }
            A03[3] = "TysUXKeFt8WChM0CalDFmuBH7ELd8";
            k9.A0D(c0779JgA01);
        }
    }

    static {
        A02();
    }

    public C1105Vz(com.facebook.ads.redexgen.core.K9 k9, com.facebook.ads.redexgen.core.K6 k6) {
        this.A01 = k9;
        this.A00 = k6;
    }
}
