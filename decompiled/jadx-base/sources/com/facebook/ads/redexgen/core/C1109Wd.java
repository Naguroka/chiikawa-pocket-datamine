package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1109Wd implements com.facebook.ads.redexgen.core.JJ {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"HMqNF3eSIzlMBYXVNU3nP1NvWYo5", "x1o785RKTr7Jq0RcU0BPUyycJ3fBjUeE", "GBfmO3K", "Po", "VaaklUluHJvo1XkXnH3kavV5L6d7gpHG", "rG9SvJ3uZ6", "s9MPDvRc6n", "AU4sbnw7bsTTRuLyXll9UaPcK28fS"};
    public static final java.lang.String A06;
    public com.facebook.ads.redexgen.core.ViewOnAttachStateChangeListenerC1110We A00;
    public com.facebook.ads.redexgen.core.Cdo<com.facebook.ads.redexgen.core.C0767It, com.facebook.ads.redexgen.core.C0772Iy> A01;
    public final com.facebook.ads.redexgen.core.C1198Zr A02;
    public final com.facebook.ads.redexgen.core.C0766Is A03 = com.facebook.ads.redexgen.core.C0766Is.A01();

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[1].length() == 18) {
                throw new java.lang.RuntimeException();
            }
            A05[1] = "YaUcq3PJYQGMSsmKTTLasxzUL6lFeW7O";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 121);
            i4++;
        }
    }

    public static void A02() {
        A04 = new byte[]{79, 115, 126, 59, 118, 126, 127, 114, 122, 59, 120, 105, 126, 122, 111, 114, 109, 126, 59, 109, 114, 126, 108, 59, 114, 104, 59, 117, 110, 119, 119, 53, 121, 66, 94, 73, 75, 69, 95, 88, 73, 94, 69, 66, 75, 12, 77, 12, 66, 89, 64, 64, 12, 79, 94, 73, 77, 88, 69, 90, 73, 12, 90, 69, 73, 91, 13, 83, 108, 96, 114, 117, 106, 108, 107, 113, 65, 100, 113, 100, 37, 108, 118, 37, 107, 112, 105, 105, 36, 25, 15, 9, 5, 4, 14, 53, 9, 2, 11, 4, 4, 15, 6};
    }

    static {
        A02();
        A06 = com.facebook.ads.redexgen.core.C1109Wd.class.getSimpleName();
    }

    public C1109Wd(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        this.A02 = c1198Zr;
    }

    private void A01() {
        this.A02.A07().AA0(A00(89, 14, 19), 3600, new com.facebook.ads.redexgen.core.C8F(A00(67, 22, 124)));
    }

    @Override // com.facebook.ads.redexgen.core.JJ
    public final void ABh() {
        if (this.A01 != null) {
            this.A01.A04.A00();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.JJ
    public final void AE9() {
        if (this.A01 != null) {
            this.A01.A04.A03();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.JJ
    public final void AHC(android.view.View view) {
        if (this.A01 == null) {
            this.A02.A07().AA0(A00(89, 14, 19), 3600, new com.facebook.ads.redexgen.core.C8F(A00(32, 35, 85)));
            return;
        }
        this.A03.A08(view);
    }

    @Override // com.facebook.ads.redexgen.core.JJ
    public final void AHO(android.view.View view, java.lang.String str, boolean z) {
        AHP(view, str, z, false);
    }

    @Override // com.facebook.ads.redexgen.core.JJ
    public final void AHP(android.view.View view, java.lang.String str, boolean z, boolean z2) {
        AHQ(view, str, z, z2, false);
    }

    @Override // com.facebook.ads.redexgen.core.JJ
    public final void AHQ(android.view.View view, java.lang.String str, boolean z, boolean z2, boolean z3) {
        if (view != null) {
            this.A00 = new com.facebook.ads.redexgen.core.ViewOnAttachStateChangeListenerC1110We(view);
            this.A03.A0A(this.A00, view);
            if (z2) {
                this.A00.A03();
            }
            this.A01 = com.facebook.ads.redexgen.core.Cdo.A00(new com.facebook.ads.redexgen.core.C0767It(this.A02, view, str, z, z3), new com.facebook.ads.redexgen.core.C0772Iy(), A06).A05(new com.facebook.ads.redexgen.core.C1111Wf(new com.facebook.ads.redexgen.core.C1108Wc())).A06();
            this.A03.A09(view, this.A01);
            return;
        }
        this.A02.A07().AA0(A00(89, 14, 19), 3600, new com.facebook.ads.redexgen.core.C8F(A00(0, 32, 98)));
    }
}
