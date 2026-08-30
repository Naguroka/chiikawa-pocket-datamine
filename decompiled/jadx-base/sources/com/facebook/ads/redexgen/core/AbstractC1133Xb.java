package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1133Xb implements com.facebook.ads.redexgen.core.Ev {
    public com.facebook.ads.redexgen.core.ZB A00;
    public com.facebook.ads.redexgen.core.AM A01;
    public java.lang.Object A02;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.Eu> A04 = new java.util.ArrayList<>(1);
    public final com.facebook.ads.redexgen.core.F6 A03 = new com.facebook.ads.redexgen.core.F6();

    public abstract void A02();

    public abstract void A03(com.facebook.ads.redexgen.core.ZB zb, boolean z);

    public final com.facebook.ads.redexgen.core.F6 A00(com.facebook.ads.redexgen.core.Et et) {
        return this.A03.A02(0, et, 0L);
    }

    public final void A01(com.facebook.ads.redexgen.core.AM am, java.lang.Object obj) {
        this.A01 = am;
        this.A02 = obj;
        java.util.Iterator<com.facebook.ads.redexgen.core.Eu> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ADd(this, am, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ev
    public final void A3k(android.os.Handler handler, com.facebook.ads.redexgen.core.F9 f9) {
        this.A03.A07(handler, f9);
    }

    @Override // com.facebook.ads.redexgen.core.Ev
    public final void AEa(com.facebook.ads.redexgen.core.ZB zb, boolean z, com.facebook.ads.redexgen.core.Eu eu) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(this.A00 == null || this.A00 == zb);
        this.A04.add(eu);
        if (this.A00 == null) {
            this.A00 = zb;
            A03(zb, z);
        } else {
            if (this.A01 == null) {
                return;
            }
            eu.ADd(this, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ev
    public final void AF4(com.facebook.ads.redexgen.core.Eu eu) {
        this.A04.remove(eu);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.core.Ev
    public final void AFa(com.facebook.ads.redexgen.core.F9 f9) {
        this.A03.A0D(f9);
    }
}
