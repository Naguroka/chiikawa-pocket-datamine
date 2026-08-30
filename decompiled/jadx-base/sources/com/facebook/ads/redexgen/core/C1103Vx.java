package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1103Vx implements com.facebook.ads.redexgen.core.InterfaceC0994Rr {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"vUQacvUb1jgaOB1nXCILUaEr4ItZ5QEs", "N", "ozPzI", "iemFS7qx3ItQSdDQeBrvuJ9y9CMkfIqY", "EwROMxnfRd6F7268i4EpvPtVg3hQf", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "qVu8", "3RxrE6NsEsLt8TXu"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.K6 A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.K9 A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 120);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{82, 87, 4, 82, 0, 80, 80, 4, 60, 62, 57, kotlin.io.encoding.Base64.padSymbol, 105, okio.Utf8.REPLACEMENT_BYTE, 111, 62, 44, 53, 41, 40, 35, 30, 5, 3, 22, 18, 15, 9, 8, 92, 70, 78, 120, 111, 107, 120, 111, kotlin.io.encoding.Base64.padSymbol, 120, 111, 111, 114, 111, kotlin.io.encoding.Base64.padSymbol, 114, 126, 126, 104, 111, 111, 120, 121, 124, 74, 93, 89, 74, 93, 15, 93, 74, 95, 67, 70, 74, 75, 15, 92, 90, 76, 76, 74, 92, 92, 73, 90, 67, 67, 86, okio.Utf8.REPLACEMENT_BYTE, 62, 19, okio.Utf8.REPLACEMENT_BYTE, kotlin.io.encoding.Base64.padSymbol, 32, 60, 53, 36, 53, 16, 17, 58, 13, 13, 16, 13};
    }

    static {
        A01();
    }

    public C1103Vx(com.facebook.ads.redexgen.core.K9 k9, com.facebook.ads.redexgen.core.K6 k6, long j) {
        this.A02 = k9;
        this.A01 = k6;
        this.A00 = j;
    }

    private final void A02(com.facebook.ads.redexgen.core.S3 s3) {
        com.facebook.ads.redexgen.core.K5.A06(this.A01);
        try {
            com.facebook.ads.redexgen.core.InterfaceC0992Rp response = s3.A00();
            if (response != null) {
                java.lang.String strA6X = response.A6X();
                com.facebook.ads.redexgen.core.KC serverResponse = this.A02.A05.A06(this.A02.A04, strA6X, this.A00);
                if (serverResponse.A01() == com.facebook.ads.redexgen.core.KB.A03) {
                    com.facebook.ads.redexgen.core.C1100Vt c1100Vt = (com.facebook.ads.redexgen.core.C1100Vt) serverResponse;
                    java.lang.String strA04 = c1100Vt.A04();
                    com.facebook.ads.internal.protocol.AdErrorType adErrorTypeAdErrorTypeFromCode = com.facebook.ads.internal.protocol.AdErrorType.adErrorTypeFromCode(c1100Vt.A03(), com.facebook.ads.internal.protocol.AdErrorType.ERROR_MESSAGE);
                    if (strA04 != null) {
                        strA6X = strA04;
                    }
                    this.A02.A04.A0E().A3H(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A02.A00), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA6X, adErrorTypeAdErrorTypeFromCode.isPublicError());
                    this.A02.A0D(com.facebook.ads.redexgen.core.C0779Jg.A01(adErrorTypeAdErrorTypeFromCode, strA6X));
                    return;
                }
            }
            com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.NETWORK_ERROR;
            java.lang.String message = s3.getMessage();
            com.facebook.ads.redexgen.core.C0S c0sA0E = this.A02.A04.A0E();
            long jA01 = com.facebook.ads.redexgen.core.C0841Lu.A01(this.A02.A00);
            int errorCode = adErrorType.getErrorCode();
            boolean zIsPublicError = adErrorType.isPublicError();
            if (A04[2].length() == 29) {
                throw new java.lang.RuntimeException();
            }
            A04[4] = "NZ18w";
            c0sA0E.A3H(jA01, errorCode, message, zIsPublicError);
            this.A02.A0D(com.facebook.ads.redexgen.core.C0779Jg.A01(adErrorType, message));
        } catch (org.json.JSONException e) {
            com.facebook.ads.internal.protocol.AdErrorType adErrorType2 = com.facebook.ads.internal.protocol.AdErrorType.NETWORK_ERROR;
            java.lang.String errorMessage = s3.getMessage();
            this.A02.A04.A0E().A3H(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A02.A00), adErrorType2.getErrorCode(), A00(16, 15, 30) + e.getMessage(), adErrorType2.isPublicError());
            this.A02.A0D(com.facebook.ads.redexgen.core.C0779Jg.A01(adErrorType2, errorMessage));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0994Rr
    public final void ABa(com.facebook.ads.redexgen.core.InterfaceC0992Rp interfaceC0992Rp) {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(79, 10, 40), A00(52, 27, 87), A00(0, 8, 30));
        if (interfaceC0992Rp != null) {
            java.lang.String strA6X = interfaceC0992Rp.A6X();
            int iA02 = com.facebook.ads.redexgen.core.C0762Im.A02(this.A02.A04);
            java.lang.String[] strArr = A04;
            java.lang.String str = strArr[5];
            java.lang.String response = strArr[1];
            if (str.length() != response.length()) {
                throw new java.lang.RuntimeException();
            }
            A04[2] = "kblvpkFa8oUK1ItVGqcsW93nH";
            if (iA02 > 0) {
                com.facebook.ads.redexgen.core.C0805Kh.A00(this.A02.A04).A0C(strA6X);
            }
            com.facebook.ads.redexgen.core.K5.A06(this.A01);
            this.A02.A0N(strA6X, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0994Rr
    public final void ABt(java.lang.Exception exc) {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(89, 7, 7), A00(31, 21, 101), A00(8, 8, 114));
        if (com.facebook.ads.redexgen.core.S3.class.equals(exc.getClass())) {
            A02((com.facebook.ads.redexgen.core.S3) exc);
            return;
        }
        com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.NETWORK_ERROR;
        java.lang.String errorMessage = exc.getMessage();
        this.A02.A04.A0E().A3H(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A02.A00), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0D(com.facebook.ads.redexgen.core.C0779Jg.A01(adErrorType, errorMessage));
    }
}
