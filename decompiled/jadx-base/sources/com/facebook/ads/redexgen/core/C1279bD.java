package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1279bD implements com.facebook.ads.redexgen.core.InterfaceC03772i {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1278bC A00;

    public C1279bD(com.facebook.ads.redexgen.core.C1278bC c1278bC) {
        this.A00 = c1278bC;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03772i
    public final void A5a(android.graphics.Canvas canvas, android.graphics.RectF rectF, float f, android.graphics.Paint paint) {
        float f2 = f * 2.0f;
        float fWidth = (rectF.width() - f2) - 1.0f;
        float fHeight = (rectF.height() - f2) - 1.0f;
        android.graphics.Paint paint2 = paint;
        android.graphics.Canvas canvas2 = canvas;
        if (f >= 1.0f) {
            float f3 = f + 0.5f;
            this.A00.A00.set(-f3, -f3, f3, f3);
            int iSave = canvas2.save();
            canvas2.translate(rectF.left + f3, rectF.top + f3);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(fWidth, 0.0f);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(fHeight, 0.0f);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(fWidth, 0.0f);
            canvas2.rotate(90.0f);
            canvas2 = canvas2;
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.restoreToCount(iSave);
            float f4 = (rectF.left + f3) - 1.0f;
            float innerWidth = rectF.top;
            float innerHeight = (rectF.right - f3) + 1.0f;
            float roundedCornerRadius = rectF.top + f3;
            canvas2.drawRect(f4, innerWidth, innerHeight, roundedCornerRadius, paint2);
            float f5 = (rectF.left + f3) - 1.0f;
            float innerWidth2 = rectF.bottom - f3;
            float innerHeight2 = (rectF.right - f3) + 1.0f;
            float roundedCornerRadius2 = rectF.bottom;
            paint2 = paint2;
            canvas2.drawRect(f5, innerWidth2, innerHeight2, roundedCornerRadius2, paint2);
        }
        float f6 = rectF.left;
        float innerWidth3 = rectF.top + f;
        float innerHeight3 = rectF.right;
        canvas2.drawRect(f6, innerWidth3, innerHeight3, rectF.bottom - f, paint2);
    }
}
