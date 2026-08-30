package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DC {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"bNHe44ulArk1xcRYAVyHtoGKVU", "QD", "aMTE8ODS1fB3wUoSeM6Q2gidKTvMoW4X", "4fY6lb", "", "aWVrp0mKdoUjEw5SYp1JNmLVN3TGGrgB", "smiAt4f5K0wNgaKDUiJHJwFhj8HF310X", "AdX7FICxySrq9cdTZMKXjUqVSoNzVC1J"};
    public final java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> A00;
    public final com.facebook.ads.redexgen.core.C9[] A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 76);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{116, 83, 75, 92, 81, 84, 89, 29, 94, 81, 82, 78, 88, 89, 29, 94, 92, 77, 73, 84, 82, 83, 29, 80, 84, 80, 88, 29, 73, 68, 77, 88, 29, 77, 79, 82, 75, 84, 89, 88, 89, 7, 29, 58, 43, 43, 55, 50, 56, 58, 47, 50, 52, 53, 116, 56, 62, 58, 118, 109, 107, 99, 113, 96, 96, 124, 121, 115, 113, 100, 121, 127, 126, okio.Utf8.REPLACEMENT_BYTE, 115, 117, 113, kotlin.io.encoding.Base64.padSymbol, 39, 32, 40};
        java.lang.String[] strArr = A03;
        if (strArr[0].length() == strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[6] = "JlzGEhMpBCn7kPvihI6A0OtqgZKGmN9X";
        strArr2[2] = "Z5Nu5Vsju66DFZXsBOeO580LAuIeU0sX";
    }

    static {
        A01();
    }

    public DC(java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> closedCaptionFormats) {
        this.A00 = closedCaptionFormats;
        this.A01 = new com.facebook.ads.redexgen.core.C9[closedCaptionFormats.size()];
    }

    public final void A02(long j, com.facebook.ads.redexgen.core.I4 i4) {
        com.facebook.ads.redexgen.core.G3.A03(j, i4, this.A01);
    }

    public final void A03(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, com.facebook.ads.redexgen.core.DH dh) {
        for (int i = 0; i < i; i++) {
            dh.A05();
            com.facebook.ads.redexgen.core.C9 output = interfaceC0611Bz.AHA(dh.A03(), 3);
            com.facebook.ads.internal.exoplayer2.thirdparty.Format format = this.A00.get(i);
            java.lang.String str = format.A0O;
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(A00(43, 19, 23).equals(str) || A00(62, 19, 92).equals(str), A00(0, 43, 113) + str);
            output.A69(com.facebook.ads.internal.exoplayer2.thirdparty.Format.A08(format.A0M != null ? format.A0M : dh.A04(), str, null, -1, format.A0D, format.A0N, format.A03, null));
            this.A01[i] = output;
        }
    }
}
