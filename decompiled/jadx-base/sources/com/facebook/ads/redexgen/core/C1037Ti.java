package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1037Ti extends com.facebook.ads.redexgen.core.M2 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1036Th A00;

    public C1037Ti(com.facebook.ads.redexgen.core.C1036Th c1036Th) {
        this.A00 = c1036Th;
    }

    @Override // com.facebook.ads.redexgen.core.M2, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        com.facebook.ads.redexgen.core.M3.A0H(this.A00.A01);
        this.A00.A00.ACL();
    }
}
