package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0876Nd implements android.view.View.OnTouchListener {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                com.facebook.ads.redexgen.core.M3.A0M(view, com.facebook.ads.redexgen.core.C0882Nj.A0H);
                return false;
            case 1:
                com.facebook.ads.redexgen.core.M3.A0M(view, 0);
                return false;
            default:
                return false;
        }
    }
}
