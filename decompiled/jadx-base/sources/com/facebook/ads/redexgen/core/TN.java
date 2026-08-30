package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TN implements com.facebook.ads.redexgen.core.C5W {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5Q A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C9Z A01;

    public TN(com.facebook.ads.redexgen.core.C9Z c9z, com.facebook.ads.redexgen.core.C5Q c5q) {
        this.A01 = c9z;
        this.A00 = c5q;
    }

    @Override // com.facebook.ads.redexgen.core.C5W
    public final boolean A9J() {
        if (!this.A01.A0Y()) {
            if (this.A01.A0Z()) {
                return true;
            }
            return this.A01.A0a();
        }
        this.A01.A0X(this.A00);
        return true;
    }
}
