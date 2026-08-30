package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UJ implements com.facebook.ads.redexgen.core.PS {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"6Ak70sx20HAu1BK2okLsJl8UIfFL7Thw", "WSdr2bwsModx8vqlXsCh2pEoV44R6fWS", "6pV", "IuCwGgbRSGcwid05Jmd", "uJw8pmawU", "I8uJtZilJAfxYDsx8vrQS9VBJj4oHqwc", "yyzynLMQXuMe1chn921CH2O0saed", "KEJISc72f74GCBhZaRDCVEoQGHcnATpn"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.BO A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A02;
            if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[3] = "LF603a9wKS17yr1vDnM";
            strArr2[4] = "LZWmWJ2r4";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 113);
            i4++;
        }
    }

    public static void A01() {
        byte[] bArr = {92, 64, 77, 85};
        java.lang.String[] strArr = A02;
        if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
            throw new java.lang.RuntimeException();
        }
        A02[5] = "ka1vQ6UiXKbqG0foqwxWJkzjeHAuiIwi";
        A01 = bArr;
    }

    static {
        A01();
    }

    public UJ(com.facebook.ads.redexgen.core.BO bo) {
        this.A00 = bo;
    }

    @Override // com.facebook.ads.redexgen.core.PS
    public final void AE1(java.lang.String str, org.json.JSONObject jSONObject) {
        if (str.equals(A00(0, 4, 93))) {
            this.A00.AGz();
            if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A00.A07)) {
                this.A00.A07.A0A().ABh();
            }
        }
        com.facebook.ads.redexgen.core.C0926Pb c0926Pb = this.A00.A0F;
        if (A02[5].charAt(30) != 'w') {
            throw new java.lang.RuntimeException();
        }
        A02[5] = "i1qJJe2Rv2sTY7cj85c4P5DDFviddUwN";
        c0926Pb.A0h(str, jSONObject);
    }
}
