package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.openadsdk.core.zx.eqN {
    private int IL;
    private int bg;

    public bg(android.content.Context context) {
        super(context);
        this.bg = 0;
        this.IL = 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmapCopy;
        android.graphics.Bitmap bitmapBg;
        if (bg()) {
            return;
        }
        measure(0, 0);
        if (IL()) {
            return;
        }
        try {
            bitmapCopy = ((android.graphics.drawable.BitmapDrawable) getDrawable()).getBitmap().copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        } catch (java.lang.Throwable unused) {
            bitmapCopy = null;
        }
        if (bitmapCopy == null) {
            super.onDraw(canvas);
            return;
        }
        int radius = getRadius();
        try {
            bitmapBg = bg(bitmapCopy, radius);
        } catch (java.lang.Throwable unused2) {
            bitmapBg = null;
        }
        if (bitmapBg == null) {
            super.onDraw(canvas);
        } else {
            canvas.drawBitmap(bitmapBg, (this.bg / 2) - radius, (this.IL / 2) - radius, (android.graphics.Paint) null);
        }
    }

    private boolean bg() {
        return getDrawable() == null || getWidth() == 0 || getHeight() == 0;
    }

    private boolean IL() {
        if (getDrawable().getClass() != android.graphics.drawable.NinePatchDrawable.class) {
            return (getDrawable() instanceof android.graphics.drawable.BitmapDrawable) && ((android.graphics.drawable.BitmapDrawable) getDrawable()).getBitmap() == null;
        }
        return true;
    }

    private int getRadius() {
        if (this.bg == 0) {
            this.bg = getWidth();
        }
        if (this.IL == 0) {
            this.IL = getHeight();
        }
        int i = this.bg;
        int i2 = this.IL;
        if (i >= i2) {
            i = i2;
        }
        return i / 2;
    }

    private android.graphics.Bitmap bg(android.graphics.Bitmap bitmap, int i) {
        android.graphics.Bitmap bitmapCreateBitmap;
        int i2 = i * 2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height > width) {
            bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width);
        } else {
            bitmapCreateBitmap = height < width ? android.graphics.Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height) : null;
        }
        if (bitmapCreateBitmap != null) {
            bitmap = bitmapCreateBitmap;
        }
        if (bitmap.getWidth() != i2 || bitmap.getHeight() != i2) {
            bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i2, i2, true);
        }
        android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap2);
        android.graphics.Paint paint = getPaint();
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap2;
    }

    private android.graphics.Paint getPaint() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }
}
