package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0883Nk extends android.widget.ProgressBar {
    public static final int A02 = android.graphics.Color.argb(26, 0, 0, 0);
    public static final int A03 = android.graphics.Color.rgb(88, org.objectweb.asm.Opcodes.D2F, 255);
    public android.graphics.Paint A00;
    public android.graphics.Rect A01;

    public C0883Nk(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet, int i) {
        super(c1199Zs, attributeSet, i);
        A01();
    }

    private android.graphics.drawable.Drawable A00() {
        return new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{new android.graphics.drawable.ColorDrawable(0), new android.graphics.drawable.ClipDrawable(new android.graphics.drawable.ColorDrawable(A03), 3, 1)});
    }

    private void A01() {
        setIndeterminate(false);
        setMax(100);
        setProgressDrawable(A00());
        this.A01 = new android.graphics.Rect();
        this.A00 = new android.graphics.Paint();
        this.A00.setStyle(android.graphics.Paint.Style.FILL);
        this.A00.setColor(A02);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(android.graphics.Canvas canvas) {
        canvas.drawRect(this.A01, this.A00);
        super.onDraw(canvas);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A01.set(0, 0, getMeasuredWidth(), 2);
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        super.setProgress(i == 100 ? 0 : java.lang.Math.max(i, 5));
    }
}
