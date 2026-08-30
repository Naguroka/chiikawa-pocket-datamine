package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RC extends android.graphics.Paint {
    public final /* synthetic */ com.facebook.ads.redexgen.core.RD A00;
    public final /* synthetic */ boolean A01;

    public RC(com.facebook.ads.redexgen.core.RD rd, boolean z) {
        this.A00 = rd;
        this.A01 = z;
        setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        setStrokeCap(android.graphics.Paint.Cap.ROUND);
        setStrokeWidth(3.0f);
        setAntiAlias(true);
        setColor(this.A01 ? -1 : -10066330);
    }
}
