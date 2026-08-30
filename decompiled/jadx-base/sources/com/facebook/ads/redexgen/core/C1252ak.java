package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1252ak implements com.facebook.ads.redexgen.core.AnonymousClass59 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC04344o A00;

    public C1252ak(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o) {
        this.A00 = abstractC04344o;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass59
    public final android.view.View A6k(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass59
    public final int A6m(android.view.View view) {
        return this.A00.A0j(view) + ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass59
    public final int A6n(android.view.View view) {
        return this.A00.A0o(view) - ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass59
    public final int A7y() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass59
    public final int A7z() {
        return this.A00.A0g();
    }
}
