package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PP implements android.view.View.OnTouchListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.BO A00;

    public PP(com.facebook.ads.redexgen.core.BO bo) {
        this.A00 = bo;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        this.A00.A0E.dispatchTouchEvent(android.view.MotionEvent.obtain(motionEvent));
        return false;
    }
}
