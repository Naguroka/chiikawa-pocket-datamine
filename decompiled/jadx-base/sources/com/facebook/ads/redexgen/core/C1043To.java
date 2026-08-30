package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.To, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1043To implements com.facebook.ads.redexgen.core.Q4 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1041Tm A01;

    public C1043To(com.facebook.ads.redexgen.core.C1041Tm c1041Tm, int i) {
        this.A01 = c1041Tm;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.Q4
    public final void ABK() {
        this.A01.A0R(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.Q4
    public final void ABi(int i) {
        com.facebook.ads.redexgen.core.C1041Tm.A02(this.A01, i);
    }

    @Override // com.facebook.ads.redexgen.core.Q4
    public final void ABz(float f) {
        if (!this.A01.A08) {
            this.A01.A0G(f);
        }
    }

    @Override // com.facebook.ads.redexgen.core.Q4
    public final void ADa(boolean z) {
        this.A01.A0Q(z);
    }

    @Override // com.facebook.ads.redexgen.core.Q4
    public final void AE0(java.lang.String str) {
        this.A01.A0D.A0E().A3L(str);
        this.A01.A0H.A4P(this.A01.A0J.A7M());
        this.A01.A0H(3);
    }

    @Override // com.facebook.ads.redexgen.core.Q4
    public final void AHI() {
        this.A01.A09 = false;
        this.A01.A0I.setProgressImmediate(0.0f);
        this.A01.A0I.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.core.Q4
    public final void AHJ(float f) {
        this.A01.A0I.setProgress(100.0f * f);
    }
}
