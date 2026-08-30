package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
public final class IndeterminateDrawable<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> extends com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange {
    private com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> animatorDelegate;
    private com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate;

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(android.graphics.ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }

    IndeterminateDrawable(android.content.Context context, com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseProgressIndicatorSpec, com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate, com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> indeterminateAnimatorDelegate) {
        super(context, baseProgressIndicatorSpec);
        setDrawingDelegate(drawingDelegate);
        setAnimatorDelegate(indeterminateAnimatorDelegate);
    }

    public static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> createLinearDrawable(android.content.Context context, com.google.android.material.progressindicator.LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        com.google.android.material.progressindicator.IndeterminateAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate;
        com.google.android.material.progressindicator.LinearDrawingDelegate linearDrawingDelegate = new com.google.android.material.progressindicator.LinearDrawingDelegate(linearProgressIndicatorSpec);
        if (linearProgressIndicatorSpec.indeterminateAnimationType == 0) {
            linearIndeterminateDisjointAnimatorDelegate = new com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec);
        } else {
            linearIndeterminateDisjointAnimatorDelegate = new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate(context, linearProgressIndicatorSpec);
        }
        return new com.google.android.material.progressindicator.IndeterminateDrawable<>(context, linearProgressIndicatorSpec, linearDrawingDelegate, linearIndeterminateDisjointAnimatorDelegate);
    }

    public static com.google.android.material.progressindicator.IndeterminateDrawable<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> createCircularDrawable(android.content.Context context, com.google.android.material.progressindicator.CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new com.google.android.material.progressindicator.IndeterminateDrawable<>(context, circularProgressIndicatorSpec, new com.google.android.material.progressindicator.CircularDrawingDelegate(circularProgressIndicatorSpec), new com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate(circularProgressIndicatorSpec));
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        if (!isRunning()) {
            this.animatorDelegate.cancelAnimatorImmediately();
        }
        this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver());
        if (z && z3) {
            this.animatorDelegate.startAnimator();
        }
        return visibleInternal;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction());
            this.drawingDelegate.fillTrack(canvas, this.paint);
            for (int i = 0; i < this.animatorDelegate.segmentColors.length; i++) {
                int i2 = i * 2;
                this.drawingDelegate.fillIndicator(canvas, this.paint, this.animatorDelegate.segmentPositions[i2], this.animatorDelegate.segmentPositions[i2 + 1], this.animatorDelegate.segmentColors[i]);
            }
            canvas.restore();
        }
    }

    com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> getAnimatorDelegate() {
        return this.animatorDelegate;
    }

    void setAnimatorDelegate(com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> indeterminateAnimatorDelegate) {
        this.animatorDelegate = indeterminateAnimatorDelegate;
        indeterminateAnimatorDelegate.registerDrawable(this);
    }

    com.google.android.material.progressindicator.DrawingDelegate<S> getDrawingDelegate() {
        return this.drawingDelegate;
    }

    void setDrawingDelegate(com.google.android.material.progressindicator.DrawingDelegate<S> drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
        drawingDelegate.registerDrawable(this);
    }
}
