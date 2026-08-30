package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class xxp extends android.view.View {
    private final boolean IL;
    private int bX;
    private final android.graphics.Path bg;
    private android.graphics.drawable.Drawable eqN;
    private float ldr;
    private android.graphics.drawable.Drawable zx;

    public xxp(android.content.Context context) {
        this(context, false);
    }

    public xxp(android.content.Context context, boolean z) {
        super(context);
        this.bg = new android.graphics.Path();
        this.IL = z;
        bg();
    }

    private void bg() {
        android.content.Context context = getContext();
        this.eqN = com.bytedance.sdk.component.utils.Fy.bX(context, this.IL ? "tt_star_thick_dark" : "tt_star_thick");
        this.zx = com.bytedance.sdk.component.utils.Fy.bX(context, "tt_star");
    }

    public void bg(double d, int i) {
        int iBg = (int) com.bytedance.sdk.openadsdk.utils.ZQc.bg(getContext(), i, false);
        this.bX = iBg;
        this.eqN.setBounds(0, 0, iBg, iBg);
        android.graphics.drawable.Drawable drawable = this.zx;
        int i2 = this.bX;
        drawable.setBounds(0, 0, i2, i2);
        this.ldr = ((float) d) / 5.0f;
        IL();
        requestLayout();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        IL();
    }

    private void IL() {
        int width = getWidth();
        int height = getHeight();
        if (this.ldr <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.bg.reset();
        this.bg.addRect(new android.graphics.RectF(0.0f, 0.0f, width * this.ldr, height), android.graphics.Path.Direction.CCW);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.bX * 5, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.bX, 1073741824));
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.bX <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i = 0; i < 5; i++) {
            this.eqN.draw(canvas);
            canvas.translate(this.bX, 0.0f);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.bg);
        for (int i2 = 0; i2 < 5; i2++) {
            this.zx.draw(canvas);
            canvas.translate(this.bX, 0.0f);
        }
    }
}
