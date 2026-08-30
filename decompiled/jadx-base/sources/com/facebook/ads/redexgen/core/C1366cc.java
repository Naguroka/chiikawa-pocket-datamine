package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1366cc implements com.facebook.ads.redexgen.core.PQ {
    public final /* synthetic */ com.facebook.ads.redexgen.core.GL A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.PQ
    public final void A9k() {
        java.lang.String strA00 = this.A00.A03.A1S().A00();
        if (android.text.TextUtils.isEmpty(strA00)) {
            return;
        }
        com.facebook.ads.redexgen.core.L2.A0M(new com.facebook.ads.redexgen.core.L2(), this.A00.A04, com.facebook.ads.redexgen.core.L5.A00(strA00), this.A00.A6r());
    }

    public C1366cc(com.facebook.ads.redexgen.core.GL gl) {
        this.A00 = gl;
    }

    @Override // com.facebook.ads.redexgen.core.PQ
    public final void ABp(com.facebook.ads.redexgen.core.BN bn) {
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.facebook.ads.redexgen.core.C1367cd(this, bn), 1L);
    }

    @Override // com.facebook.ads.redexgen.core.PQ
    public final void AC4() {
    }

    @Override // com.facebook.ads.redexgen.core.PQ
    public final void ADo(android.view.View view, android.view.MotionEvent motionEvent) {
    }
}
