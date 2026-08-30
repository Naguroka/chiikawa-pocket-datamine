package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.IL {
    private final android.graphics.Bitmap bX;
    private final android.graphics.Rect IL = new android.graphics.Rect();
    private final android.graphics.Paint eqN = new android.graphics.Paint(1);

    public bg(android.graphics.Bitmap bitmap, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.IL il) {
        this.bX = bitmap;
        if (il != null) {
            this.bg = il.bg;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.bX.getWidth();
        int height = this.bX.getHeight();
        this.IL.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                this.IL.left = (width - iWidth) / 2;
                android.graphics.Rect rect2 = this.IL;
                rect2.right = rect2.left + iWidth;
            }
            if (height > iHeight) {
                this.IL.top = (height - iHeight) / 2;
                android.graphics.Rect rect3 = this.IL;
                rect3.bottom = rect3.top + iHeight;
                return;
            }
            return;
        }
        float f = iHeight;
        float f2 = f * 1.0f;
        float f3 = height;
        float f4 = f2 / f3;
        float f5 = iWidth;
        float f6 = 1.0f * f5;
        float f7 = width;
        if (java.lang.Math.max(f4, f6 / f7) > f4) {
            int i = (int) ((f2 / f5) * f7);
            this.IL.top = (height - i) / 2;
            android.graphics.Rect rect4 = this.IL;
            rect4.bottom = rect4.top + i;
            return;
        }
        int i2 = (int) ((f6 / f) * f3);
        this.IL.left = (width - i2) / 2;
        android.graphics.Rect rect5 = this.IL;
        rect5.right = rect5.left + i2;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.IL
    protected void bg(android.graphics.Canvas canvas) {
        canvas.drawBitmap(this.bX, this.IL, getBounds(), this.eqN);
    }
}
