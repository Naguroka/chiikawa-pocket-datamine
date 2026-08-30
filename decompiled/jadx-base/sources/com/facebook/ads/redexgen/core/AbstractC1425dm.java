package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1425dm {
    public com.facebook.ads.redexgen.core.InterfaceC1426dn A00;

    public final void A00() {
        if (this.A00 != null) {
            this.A00.onStart();
        }
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.onStop();
        }
    }

    public final void A02(com.facebook.ads.redexgen.core.InterfaceC1426dn interfaceC1426dn) {
        this.A00 = interfaceC1426dn;
    }
}
