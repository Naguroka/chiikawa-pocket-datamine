package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JN implements android.view.View.OnTouchListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.WJ A00;
    public final /* synthetic */ boolean A01;

    public JN(com.facebook.ads.redexgen.core.WJ wj, boolean z) {
        this.A00 = wj;
        this.A01 = z;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.A01) {
            return false;
        }
        return true;
    }
}
