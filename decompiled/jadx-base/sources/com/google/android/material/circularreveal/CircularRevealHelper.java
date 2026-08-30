package com.google.android.material.circularreveal;

/* JADX INFO: loaded from: classes5.dex */
public class CircularRevealHelper {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    private static final boolean DEBUG = false;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY = 2;
    private boolean buildingCircularRevealCache;
    private android.graphics.Paint debugPaint;
    private final com.google.android.material.circularreveal.CircularRevealHelper.Delegate delegate;
    private boolean hasCircularRevealCache;
    private android.graphics.drawable.Drawable overlayDrawable;
    private com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo;
    private final android.graphics.Paint revealPaint;
    private final android.graphics.Path revealPath;
    private final android.graphics.Paint scrimPaint;
    private final android.view.View view;

    public interface Delegate {
        void actualDraw(android.graphics.Canvas canvas);

        boolean actualIsOpaque();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircularRevealHelper(com.google.android.material.circularreveal.CircularRevealHelper.Delegate delegate) {
        this.delegate = delegate;
        android.view.View view = (android.view.View) delegate;
        this.view = view;
        view.setWillNotDraw(false);
        this.revealPath = new android.graphics.Path();
        this.revealPaint = new android.graphics.Paint(7);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.scrimPaint = paint;
        paint.setColor(0);
    }

    public void buildCircularRevealCache() {
        if (STRATEGY == 0) {
            this.buildingCircularRevealCache = true;
            this.hasCircularRevealCache = false;
            this.view.buildDrawingCache();
            android.graphics.Bitmap drawingCache = this.view.getDrawingCache();
            if (drawingCache == null && this.view.getWidth() != 0 && this.view.getHeight() != 0) {
                drawingCache = android.graphics.Bitmap.createBitmap(this.view.getWidth(), this.view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                this.view.draw(new android.graphics.Canvas(drawingCache));
            }
            if (drawingCache != null) {
                this.revealPaint.setShader(new android.graphics.BitmapShader(drawingCache, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
            }
            this.buildingCircularRevealCache = false;
            this.hasCircularRevealCache = true;
        }
    }

    public void destroyCircularRevealCache() {
        if (STRATEGY == 0) {
            this.hasCircularRevealCache = false;
            this.view.destroyDrawingCache();
            this.revealPaint.setShader(null);
            this.view.invalidate();
        }
    }

    public void setRevealInfo(com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo) {
        if (revealInfo == null) {
            this.revealInfo = null;
        } else {
            com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo2 = this.revealInfo;
            if (revealInfo2 == null) {
                this.revealInfo = new com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo(revealInfo);
            } else {
                revealInfo2.set(revealInfo);
            }
            if (com.google.android.material.math.MathUtils.geq(revealInfo.radius, getDistanceToFurthestCorner(revealInfo), 1.0E-4f)) {
                this.revealInfo.radius = Float.MAX_VALUE;
            }
        }
        invalidateRevealInfo();
    }

    public com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo getRevealInfo() {
        if (this.revealInfo == null) {
            return null;
        }
        com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo = new com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo(this.revealInfo);
        if (revealInfo.isInvalid()) {
            revealInfo.radius = getDistanceToFurthestCorner(revealInfo);
        }
        return revealInfo;
    }

    public void setCircularRevealScrimColor(int i) {
        this.scrimPaint.setColor(i);
        this.view.invalidate();
    }

    public int getCircularRevealScrimColor() {
        return this.scrimPaint.getColor();
    }

    public android.graphics.drawable.Drawable getCircularRevealOverlayDrawable() {
        return this.overlayDrawable;
    }

    public void setCircularRevealOverlayDrawable(android.graphics.drawable.Drawable drawable) {
        this.overlayDrawable = drawable;
        this.view.invalidate();
    }

    private void invalidateRevealInfo() {
        if (STRATEGY == 1) {
            this.revealPath.rewind();
            com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo = this.revealInfo;
            if (revealInfo != null) {
                this.revealPath.addCircle(revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, android.graphics.Path.Direction.CW);
            }
        }
        this.view.invalidate();
    }

    private float getDistanceToFurthestCorner(com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo) {
        return com.google.android.material.math.MathUtils.distanceToFurthestCorner(revealInfo.centerX, revealInfo.centerY, 0.0f, 0.0f, this.view.getWidth(), this.view.getHeight());
    }

    public void draw(android.graphics.Canvas canvas) {
        if (shouldDrawCircularReveal()) {
            int i = STRATEGY;
            if (i == 0) {
                canvas.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, this.revealPaint);
                if (shouldDrawScrim()) {
                    canvas.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, this.scrimPaint);
                }
            } else if (i == 1) {
                int iSave = canvas.save();
                canvas.clipPath(this.revealPath);
                this.delegate.actualDraw(canvas);
                if (shouldDrawScrim()) {
                    canvas.drawRect(0.0f, 0.0f, this.view.getWidth(), this.view.getHeight(), this.scrimPaint);
                }
                canvas.restoreToCount(iSave);
            } else if (i == 2) {
                this.delegate.actualDraw(canvas);
                if (shouldDrawScrim()) {
                    canvas.drawRect(0.0f, 0.0f, this.view.getWidth(), this.view.getHeight(), this.scrimPaint);
                }
            } else {
                throw new java.lang.IllegalStateException("Unsupported strategy " + i);
            }
        } else {
            this.delegate.actualDraw(canvas);
            if (shouldDrawScrim()) {
                canvas.drawRect(0.0f, 0.0f, this.view.getWidth(), this.view.getHeight(), this.scrimPaint);
            }
        }
        drawOverlayDrawable(canvas);
    }

    private void drawOverlayDrawable(android.graphics.Canvas canvas) {
        if (shouldDrawOverlayDrawable()) {
            android.graphics.Rect bounds = this.overlayDrawable.getBounds();
            float fWidth = this.revealInfo.centerX - (bounds.width() / 2.0f);
            float fHeight = this.revealInfo.centerY - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.overlayDrawable.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    public boolean isOpaque() {
        return this.delegate.actualIsOpaque() && !shouldDrawCircularReveal();
    }

    private boolean shouldDrawCircularReveal() {
        com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo = this.revealInfo;
        boolean z = revealInfo == null || revealInfo.isInvalid();
        if (STRATEGY == 0) {
            return !z && this.hasCircularRevealCache;
        }
        return !z;
    }

    private boolean shouldDrawScrim() {
        return (this.buildingCircularRevealCache || android.graphics.Color.alpha(this.scrimPaint.getColor()) == 0) ? false : true;
    }

    private boolean shouldDrawOverlayDrawable() {
        return (this.buildingCircularRevealCache || this.overlayDrawable == null || this.revealInfo == null) ? false : true;
    }

    private void drawDebugMode(android.graphics.Canvas canvas) {
        this.delegate.actualDraw(canvas);
        if (shouldDrawScrim()) {
            canvas.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, this.scrimPaint);
        }
        if (shouldDrawCircularReveal()) {
            drawDebugCircle(canvas, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, 10.0f);
            drawDebugCircle(canvas, -65536, 5.0f);
        }
        drawOverlayDrawable(canvas);
    }

    private void drawDebugCircle(android.graphics.Canvas canvas, int i, float f) {
        this.debugPaint.setColor(i);
        this.debugPaint.setStrokeWidth(f);
        canvas.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius - (f / 2.0f), this.debugPaint);
    }
}
