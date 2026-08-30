package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1313bl implements com.facebook.ads.redexgen.core.AnonymousClass20 {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"LqS4Vpkhy9E", "ge1EwIuJY0TovlYE8lSK4ibgoBpAWn9a", "g9aMV", "tM0yo6k6wg7fwB8A5Xyw1gAw", "QSFbFVun0ml7C8TY77Vqi1TYUccnWCEL", "t0vPMbYvCUeZJjWwsMbVoEbKc6G6LcPD", "iAyfyMUWIOpY9gjOpihEXzDIF", "NOfvqhzewpei8jQqPEPmMqHVwiKNDwof"};
    public com.facebook.ads.AdError A00;
    public com.facebook.ads.redexgen.core.EnumC03681z A01 = com.facebook.ads.redexgen.core.EnumC03681z.A02;
    public com.facebook.ads.redexgen.core.EnumC03681z A02 = com.facebook.ads.redexgen.core.EnumC03681z.A02;
    public final com.facebook.ads.redexgen.core.AbstractC1310bi A03;
    public final com.facebook.ads.redexgen.core.C1199Zs A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 33);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {125, 41, 50, 125, 12, 2, 123, 77, 87, 2, 65, 67, 76, 2, 65, 74, 67, 76, 69, 71, 2, 107, 76, 86, 71, 69, 80, 67, 86, 75, 77, 76, 2, 103, 80, 80, 77, 80, 2, 79, 77, 70, 71, 2, 64, 91, 2, 81, 71, 86, 86, 75, 76, 69, 2, 99, 70, 113, 71, 86, 86, 75, 76, 69, 81, 12, 81, 71, 86, 107, 76, 86, 71, 69, 80, 67, 86, 75, 77, 76, 103, 80, 80, 77, 80, 111, 77, 70, 71, 10, 11, 37, 33, 34, 22, 7, 10, 6, 13, 0, 6, 45, 6, 23, 20, 12, 17, 8, 65, 117, 104, 106, 39, 90, 127, 98, 99, 106, 45, 100, 99, 121, 104, 127, 99, 108, 97, 45, 121, 127, 108, 99, 126, 100, 121, 100, 98, 99, 35, 125, 108, 117, 106, 105, 103, 98, 46, 47, 121, 98, 101, 125, 34, 35, 120, 100, 109, 120, 44, 101, 127, 44, 109, 96, 126, 105, 109, 104, 117, 44, 64, 67, 77, 72, 69, 66, 75, 32, 44, 64, 67, 77, 72, 73, 72, 44, 99, 126, 44, 95, 68, 67, 91, 69, 66, 75, 123, 103, 110, 123, 47, 102, 124, 47, 110, 99, 125, 106, 110, 107, 118, 47, 92, 71, 64, 88, 70, 65, 72, 121, 101, 108, 121, 45, 100, 126, 45, 99, 98, 121, 45, 65, 66, 76, 73, 72, 73};
        java.lang.String[] strArr = A06;
        if (strArr[1].charAt(28) == strArr[5].charAt(28)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A06;
        strArr2[1] = "uHXyGv91YS5AZybwuzmh7pK9ZkTxCxly";
        strArr2[5] = "aSclBZwoH94XlBt4xX3FAXD0bzJVnGEs";
        A05 = bArr;
    }

    static {
        A01();
    }

    public C1313bl(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1310bi abstractC1310bi) {
        this.A04 = c1199Zs;
        this.A03 = abstractC1310bi;
    }

    private void A02(com.facebook.ads.redexgen.core.EnumC03681z enumC03681z, com.facebook.ads.redexgen.core.EnumC03681z enumC03681z2) {
        java.lang.String strA00 = A00(113, 26, 44);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String errorTitle = A00(108, 5, 38);
        java.lang.StringBuilder sbAppend = sb.append(errorTitle).append(enumC03681z);
        java.lang.String errorTitle2 = A00(0, 4, 124);
        java.lang.String string = sbAppend.append(errorTitle2).append(enumC03681z2).toString();
        com.facebook.ads.redexgen.core.C8D c8dA07 = this.A04.A07();
        int i = com.facebook.ads.redexgen.core.C8E.A0e;
        com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(strA00, string);
        java.lang.String errorTitle3 = A00(139, 3, 61);
        c8dA07.AA0(errorTitle3, i, c8f);
        java.lang.String errorTitle4 = strA00 + ' ' + string;
        this.A04.A0E().AHl(errorTitle4);
    }

    private void A03(java.lang.String str, java.lang.String str2, boolean z) {
        com.facebook.ads.AdSettings.IntegrationErrorMode integrationErrorModeA00 = com.facebook.ads.redexgen.core.AbstractC03651w.A00(this.A04);
        java.lang.String str3 = java.lang.String.format(java.util.Locale.US, com.facebook.ads.internal.protocol.AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        java.lang.String strA00 = A00(139, 3, 61);
        java.lang.String strA01 = A00(91, 17, 66);
        if (!z) {
            android.util.Log.e(strA01, str3);
            this.A04.A07().AA0(strA00, com.facebook.ads.redexgen.core.C8E.A0c, new com.facebook.ads.redexgen.core.C8F(str3));
            this.A04.A0E().AHk(str3);
            return;
        }
        switch (com.facebook.ads.redexgen.core.C03671y.A00[integrationErrorModeA00.ordinal()]) {
            case 1:
                java.lang.String errorMessage = str3 + A00(4, 87, 3);
                throw new com.facebook.ads.redexgen.core.AnonymousClass21(errorMessage);
            case 2:
                this.A03.A08();
                this.A03.A0B(10, com.facebook.ads.internal.protocol.AdErrorType.INCORRECT_STATE_ERROR, str3);
                this.A04.A0E().AHk(str3);
                android.util.Log.e(strA01, str3);
                this.A04.A07().AA0(strA00, com.facebook.ads.redexgen.core.C8E.A0c, new com.facebook.ads.redexgen.core.C8F(str3));
                break;
        }
        android.util.Log.e(strA01, str3);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final boolean A5z() {
        boolean z = (this.A01 == com.facebook.ads.redexgen.core.EnumC03681z.A02 || this.A01 == com.facebook.ads.redexgen.core.EnumC03681z.A04) && this.A02 != com.facebook.ads.redexgen.core.EnumC03681z.A07;
        if (z) {
            this.A01 = com.facebook.ads.redexgen.core.EnumC03681z.A06;
        } else {
            A03(A00(org.objectweb.asm.Opcodes.D2I, 6, 39), A00(154, 42, 45), false);
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final boolean A60() {
        if (this.A01 == com.facebook.ads.redexgen.core.EnumC03681z.A04 && this.A00 != null && this.A00.getErrorCode() == 2008) {
            this.A04.A0E().AFM();
            this.A03.A0B(10, com.facebook.ads.internal.protocol.AdErrorType.AD_PRESENTATION_ERROR, null);
            return true;
        }
        com.facebook.ads.redexgen.core.EnumC03681z enumC03681z = this.A01;
        com.facebook.ads.redexgen.core.EnumC03681z enumC03681z2 = com.facebook.ads.redexgen.core.EnumC03681z.A05;
        java.lang.String[] strArr = A06;
        if (strArr[6].length() == strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A06;
        strArr2[4] = "mF60z106z8KVykzxhCmjg96dV72kpnud";
        strArr2[7] = "JHGcNRxcSq72OhujKZnAiyvPQwA3qgql";
        boolean z = enumC03681z == enumC03681z2 && (this.A02 != com.facebook.ads.redexgen.core.EnumC03681z.A07 || com.facebook.ads.redexgen.core.C0762Im.A0g(this.A04));
        if (z) {
            this.A01 = com.facebook.ads.redexgen.core.EnumC03681z.A02;
            this.A02 = com.facebook.ads.redexgen.core.EnumC03681z.A07;
        } else {
            com.facebook.ads.redexgen.core.EnumC03681z enumC03681z3 = this.A01;
            com.facebook.ads.redexgen.core.EnumC03681z enumC03681z4 = com.facebook.ads.redexgen.core.EnumC03681z.A05;
            java.lang.String strA00 = A00(org.objectweb.asm.Opcodes.LCMP, 6, 43);
            if (enumC03681z3 != enumC03681z4) {
                A03(strA00, A00(219, 18, 44), true);
            } else {
                A03(strA00, A00(196, 23, 46), false);
            }
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final com.facebook.ads.redexgen.core.EnumC03681z A6J() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final com.facebook.ads.redexgen.core.EnumC03681z A6K() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final void AGM(com.facebook.ads.redexgen.core.EnumC03681z enumC03681z) {
        this.A01 = enumC03681z;
        this.A02 = enumC03681z;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final void AGQ(com.facebook.ads.AdError adError) {
        this.A01 = com.facebook.ads.redexgen.core.EnumC03681z.A04;
        this.A02 = com.facebook.ads.redexgen.core.EnumC03681z.A04;
        this.A00 = adError;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final void AGV() {
        if (this.A01 != com.facebook.ads.redexgen.core.EnumC03681z.A06) {
            A02(this.A01, com.facebook.ads.redexgen.core.EnumC03681z.A05);
        }
        com.facebook.ads.redexgen.core.EnumC03681z enumC03681z = com.facebook.ads.redexgen.core.EnumC03681z.A05;
        java.lang.String[] strArr = A06;
        if (strArr[4].charAt(13) == strArr[7].charAt(13)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A06;
        strArr2[6] = "0CQ8O9HdNp0eBnIGd0pIqA2Cb";
        strArr2[2] = "A9QPt";
        this.A01 = enumC03681z;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final void AGf() {
        if (this.A02 != com.facebook.ads.redexgen.core.EnumC03681z.A07) {
            A02(this.A01, com.facebook.ads.redexgen.core.EnumC03681z.A08);
        }
        this.A02 = com.facebook.ads.redexgen.core.EnumC03681z.A08;
    }
}
