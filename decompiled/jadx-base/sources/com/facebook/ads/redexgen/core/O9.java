package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class O9 implements android.view.View.OnTouchListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.OA A00;

    public O9(com.facebook.ads.redexgen.core.OA oa) {
        this.A00 = oa;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
