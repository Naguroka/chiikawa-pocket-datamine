package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0960Qj implements android.view.View.OnTouchListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.T7 A00;

    public ViewOnTouchListenerC0960Qj(com.facebook.ads.redexgen.core.T7 t7) {
        this.A00 = t7;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        this.A00.A0B.A02(new com.facebook.ads.redexgen.core.C0975Qy(view, motionEvent));
        return false;
    }
}
