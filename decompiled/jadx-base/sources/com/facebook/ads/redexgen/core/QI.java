package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QI extends android.widget.RelativeLayout {
    public final android.graphics.Paint A00;
    public final android.graphics.RectF A01;

    public QI(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str) {
        super(c1199Zs);
        float f = c1199Zs.getResources().getDisplayMetrics().density;
        android.widget.TextView textView = new android.widget.TextView(c1199Zs);
        textView.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
        setGravity(17);
        float density = 6.0f * f;
        int i = (int) density;
        textView.setPadding(i, i, i, i);
        addView(textView);
        this.A00 = new android.graphics.Paint();
        this.A00.setStyle(android.graphics.Paint.Style.FILL);
        this.A00.setColor(-1);
        this.A01 = new android.graphics.RectF();
        com.facebook.ads.redexgen.core.M3.A0M(this, 0);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.A01.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.A01, f * 10.0f, 10.0f * f, this.A00);
        super.onDraw(canvas);
    }
}
