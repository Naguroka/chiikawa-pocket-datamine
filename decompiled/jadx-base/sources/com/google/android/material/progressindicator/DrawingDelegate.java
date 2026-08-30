package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
abstract class DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> {
    protected com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange drawable;
    S spec;

    abstract void adjustCanvas(android.graphics.Canvas canvas, android.graphics.Rect rect, float f);

    abstract void fillIndicator(android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, int i);

    abstract void fillTrack(android.graphics.Canvas canvas, android.graphics.Paint paint);

    abstract int getPreferredHeight();

    abstract int getPreferredWidth();

    public DrawingDelegate(S s) {
        this.spec = s;
    }

    protected void registerDrawable(com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        this.drawable = drawableWithAnimatedVisibilityChange;
    }

    void validateSpecAndAdjustCanvas(android.graphics.Canvas canvas, android.graphics.Rect rect, float f) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f);
    }
}
