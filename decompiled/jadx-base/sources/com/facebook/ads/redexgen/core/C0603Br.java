package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Br, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0603Br extends com.facebook.ads.redexgen.core.VV {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0859Mm A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A02;
            if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
            strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-102};
    }

    static {
        A01();
    }

    public C0603Br(com.facebook.ads.redexgen.core.C0859Mm c0859Mm) {
        this.A00 = c0859Mm;
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public final void A4P(java.lang.String str) {
        com.facebook.ads.redexgen.core.C03832o.A00(this.A00.A02).A07(new android.content.Intent(str + A00(0, 1, 92) + this.A00.A0A));
    }
}
