package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1092Vl implements com.facebook.ads.redexgen.core.InterfaceC0830Lj {
    public static byte[] A03;
    public int A00;
    public java.lang.String A01;
    public final com.facebook.ads.redexgen.core.InterfaceC0830Lj A02;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-93, -93, -107, -104};
    }

    public C1092Vl(com.facebook.ads.redexgen.core.InterfaceC0830Lj interfaceC0830Lj) {
        this.A02 = interfaceC0830Lj;
    }

    private void A01() {
        if (this.A01 != null) {
            this.A02.AEb(this.A01 + A00(0, 4, 67) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0830Lj
    public final void AEb(java.lang.String str) {
        if (!com.facebook.ads.redexgen.core.AbstractC0832Ll.A0A(str)) {
            java.lang.String strA04 = com.facebook.ads.redexgen.core.AbstractC0832Ll.A04(str);
            java.lang.String filtered = this.A01;
            if (strA04.equals(filtered)) {
                this.A00++;
                return;
            }
            A01();
            this.A01 = strA04;
            this.A00 = 1;
            return;
        }
        A01();
        this.A02.AEb(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0830Lj
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
