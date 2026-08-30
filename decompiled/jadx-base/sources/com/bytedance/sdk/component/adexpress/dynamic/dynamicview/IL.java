package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends android.graphics.drawable.GradientDrawable {
    private final android.graphics.Paint IL;
    protected android.graphics.Path bg;

    public IL() {
        this.bg = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.IL = paint;
        paint.setColor(-1);
    }

    public IL(android.graphics.drawable.GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.bg = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.IL = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Path path = this.bg;
        if (path == null || path.isEmpty()) {
            bg(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.IL, 31);
        bg(canvas);
        this.IL.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.bg, this.IL);
        this.IL.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    protected void bg(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }

    public void bg(int i, int i2, int i3, int i4) {
        this.bg.addRect(i, i2, i3, i4, android.graphics.Path.Direction.CW);
        invalidateSelf();
    }
}
