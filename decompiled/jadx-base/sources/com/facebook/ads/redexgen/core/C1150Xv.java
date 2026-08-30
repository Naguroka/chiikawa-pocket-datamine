package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1150Xv implements com.facebook.ads.redexgen.core.DB {
    public static java.lang.String[] A02 = {"P6LxKoX3hqiFMmAIVR7OeJXIbWgxygGh", "pjME3bsyRopZ", "UEFZUDYTuEaf1GJh0Avn4lO8zugM0IPU", "QWMZsQufQnd6YIT4vE0", "2ZdVdRUPEYe784hkDnclgg", "W0NJjabFUAVEfXxfEuVWrnE41t6CnKuf", "UPQ2VibD02RiukY0QWB9ET1KfDzYUrsx", "MLswwOzvsn6Vmil0MDYnNWAJpg07qpL1"};
    public final com.facebook.ads.redexgen.core.I3 A00 = new com.facebook.ads.redexgen.core.I3(new byte[4]);
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1148Xt A01;

    public C1150Xv(com.facebook.ads.redexgen.core.C1148Xt c1148Xt) {
        this.A01 = c1148Xt;
    }

    @Override // com.facebook.ads.redexgen.core.DB
    public final void A4n(com.facebook.ads.redexgen.core.I4 i4) {
        int tableId = i4.A0E();
        if (tableId != 0) {
            return;
        }
        i4.A0Z(7);
        int iA04 = i4.A04();
        if (A02[5].charAt(15) == 'T') {
            throw new java.lang.RuntimeException();
        }
        A02[5] = "xK6ZRV35PXGEsGGPsJooK7TgqadUik0x";
        int i = iA04 / 4;
        for (int i2 = 0; i2 < i; i2++) {
            i4.A0a(this.A00, 4);
            int i3 = this.A00.A04(16);
            this.A00.A08(3);
            if (i3 == 0) {
                this.A00.A08(13);
            } else {
                int iA05 = this.A00.A04(13);
                this.A01.A06.put(iA05, new com.facebook.ads.redexgen.core.C1153Xy(new com.facebook.ads.redexgen.core.C1149Xu(this.A01, iA05)));
                com.facebook.ads.redexgen.core.C1148Xt.A01(this.A01);
            }
        }
        int programCount = this.A01.A05;
        if (programCount != 2) {
            this.A01.A06.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.DB
    public final void A9F(com.facebook.ads.redexgen.core.IG ig, com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, com.facebook.ads.redexgen.core.DH dh) {
    }
}
