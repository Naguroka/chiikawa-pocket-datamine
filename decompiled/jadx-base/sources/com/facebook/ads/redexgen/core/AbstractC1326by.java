package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.by, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1326by implements com.facebook.ads.redexgen.core.C6X {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public AbstractC1326by(boolean z) {
        this.A00 = z;
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABT() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABc() {
        A01(true);
    }
}
