package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1362cY implements com.facebook.ads.redexgen.core.InterfaceC0858Ml {
    public final /* synthetic */ com.facebook.ads.redexgen.core.GK A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0669Ei A01;

    public C1362cY(com.facebook.ads.redexgen.core.GK gk, com.facebook.ads.redexgen.core.C0669Ei c0669Ei) {
        this.A00 = gk;
        this.A01 = c0669Ei;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0858Ml
    public final void ACA() {
        this.A01.A0E().A46(this.A00.A03 != null);
        if (this.A00.A03 != null) {
            this.A00.A03.A03();
        }
    }
}
