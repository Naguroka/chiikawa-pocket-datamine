package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QU implements android.view.View.OnTouchListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.QV A00;

    public QU(com.facebook.ads.redexgen.core.QV qv) {
        this.A00 = qv;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = java.lang.System.currentTimeMillis();
            com.facebook.ads.redexgen.core.QV.A00(this.A00);
            this.A00.A06.AAK(this.A00.A03.A1U(), new com.facebook.ads.redexgen.core.O8().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
