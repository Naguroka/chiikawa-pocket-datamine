package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1221aE implements com.facebook.ads.redexgen.core.InterfaceC04615q {
    public final /* synthetic */ android.widget.ImageView A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04635s A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.W7 A02;

    public C1221aE(com.facebook.ads.redexgen.core.C04635s c04635s, android.widget.ImageView imageView, com.facebook.ads.redexgen.core.W7 w7) {
        this.A01 = c04635s;
        this.A00 = imageView;
        this.A02 = w7;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04615q
    public final void AC9(android.graphics.drawable.Drawable drawable) {
        com.facebook.ads.redexgen.core.W7.A0e(drawable, this.A00);
        this.A02.A1J(drawable);
    }
}
