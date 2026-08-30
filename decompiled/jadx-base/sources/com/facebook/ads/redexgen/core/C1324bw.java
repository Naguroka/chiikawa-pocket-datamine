package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1324bw extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"7HAtzWHHqocdVWrHWLF7dHgS7Bm2h12C", "DbOr4ijtOwCAaeVmvR816jBzMEkuu4t1", "lnUtOUEm1wuvoR9nZTKEc7Wj6", "rgunTSV1g2reSAbvPi4FwUaf05Z1esdk", "lf9TdmWUJKPBCDTsH0x6g9hItkASR1Wu", "rzwaJSO2zPm7h9LPx5qAuh7aJhmBGJeQ", "21sK4Gi1tfVdwS7GyFfEScwosNwGd1WZ", "FSSaRzfmWACYGxNNk9yD6VAWr"};
    public com.facebook.ads.redexgen.core.InterfaceC03320p A00;
    public java.lang.String A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0686Fj A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-64, -29, -32, -17, -13, -28, -15, -97, -13, -24, -20, -28, -18, -12, -13, -83};
        java.lang.String[] strArr = A04;
        if (strArr[6].charAt(4) != strArr[1].charAt(4)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[5] = "osBBqT7uNXEQnnthAEoQEGxFzU3x5jcE";
        strArr2[0] = "83ZlJzScQovvXu1byfPC9cIolLTrcwle";
        A03 = bArr;
    }

    static {
        A02();
    }

    public C1324bw(com.facebook.ads.redexgen.core.C0686Fj c0686Fj, com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p, java.lang.String str) {
        this.A02 = c0686Fj;
        this.A00 = interfaceC03320p;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        this.A02.A0U(this.A01);
        this.A02.A0P(this.A00);
        this.A02.ABs(new com.facebook.ads.redexgen.core.C0779Jg(com.facebook.ads.internal.protocol.AdErrorType.NETWORK_ERROR, A00(0, 16, 123)));
    }
}
