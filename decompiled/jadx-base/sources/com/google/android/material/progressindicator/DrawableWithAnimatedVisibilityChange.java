package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
abstract class DrawableWithAnimatedVisibilityChange extends android.graphics.drawable.Drawable implements androidx.vectordrawable.graphics.drawable.Animatable2Compat {
    private static final boolean DEFAULT_DRAWABLE_RESTART = false;
    private static final int GROW_DURATION = 500;
    private static final android.util.Property<com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, java.lang.Float> GROW_FRACTION = new android.util.Property<com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, java.lang.Float>(java.lang.Float.class, "growFraction") { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.3
        @Override // android.util.Property
        public java.lang.Float get(com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
            return java.lang.Float.valueOf(drawableWithAnimatedVisibilityChange.getGrowFraction());
        }

        @Override // android.util.Property
        public void set(com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, java.lang.Float f) {
            drawableWithAnimatedVisibilityChange.setGrowFraction(f.floatValue());
        }
    };
    private java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> animationCallbacks;
    final com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseSpec;
    final android.content.Context context;
    private float growFraction;
    private android.animation.ValueAnimator hideAnimator;
    private boolean ignoreCallbacks;
    private androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback internalAnimationCallback;
    private float mockGrowFraction;
    private boolean mockHideAnimationRunning;
    private boolean mockShowAnimationRunning;
    private android.animation.ValueAnimator showAnimator;
    private int totalAlpha;
    final android.graphics.Paint paint = new android.graphics.Paint();
    com.google.android.material.progressindicator.AnimatorDurationScaleProvider animatorDurationScaleProvider = new com.google.android.material.progressindicator.AnimatorDurationScaleProvider();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    DrawableWithAnimatedVisibilityChange(android.content.Context context, com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.context = context;
        this.baseSpec = baseProgressIndicatorSpec;
        setAlpha(255);
    }

    private void maybeInitializeAnimators() {
        if (this.showAnimator == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, GROW_FRACTION, 0.0f, 1.0f);
            this.showAnimator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.showAnimator.setInterpolator(com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setShowAnimator(this.showAnimator);
        }
        if (this.hideAnimator == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, GROW_FRACTION, 1.0f, 0.0f);
            this.hideAnimator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.hideAnimator.setInterpolator(com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setHideAnimator(this.hideAnimator);
        }
    }

    public void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        if (this.animationCallbacks == null) {
            this.animationCallbacks = new java.util.ArrayList();
        }
        if (this.animationCallbacks.contains(animationCallback)) {
            return;
        }
        this.animationCallbacks.add(animationCallback);
    }

    public boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> list = this.animationCallbacks;
        if (list == null || !list.contains(animationCallback)) {
            return false;
        }
        this.animationCallbacks.remove(animationCallback);
        if (!this.animationCallbacks.isEmpty()) {
            return true;
        }
        this.animationCallbacks = null;
        return true;
    }

    public void clearAnimationCallbacks() {
        this.animationCallbacks.clear();
        this.animationCallbacks = null;
    }

    void setInternalAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        this.internalAnimationCallback = animationCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationStart() {
        androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback = this.internalAnimationCallback;
        if (animationCallback != null) {
            animationCallback.onAnimationStart(this);
        }
        java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> list = this.animationCallbacks;
        if (list == null || this.ignoreCallbacks) {
            return;
        }
        java.util.Iterator<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> it = list.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback = this.internalAnimationCallback;
        if (animationCallback != null) {
            animationCallback.onAnimationEnd(this);
        }
        java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> list = this.animationCallbacks;
        if (list == null || this.ignoreCallbacks) {
            return;
        }
        java.util.Iterator<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> it = list.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this);
        }
    }

    public void start() {
        setVisibleInternal(true, true, false);
    }

    public void stop() {
        setVisibleInternal(false, true, false);
    }

    public boolean isRunning() {
        return isShowing() || isHiding();
    }

    public boolean isShowing() {
        android.animation.ValueAnimator valueAnimator = this.showAnimator;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.mockShowAnimationRunning;
    }

    public boolean isHiding() {
        android.animation.ValueAnimator valueAnimator = this.hideAnimator;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.mockHideAnimationRunning;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return setVisible(z, z2, true);
    }

    public boolean setVisible(boolean z, boolean z2, boolean z3) {
        return setVisibleInternal(z, z2, z3 && this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) > 0.0f);
    }

    boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        maybeInitializeAnimators();
        if (!isVisible() && !z) {
            return false;
        }
        android.animation.ValueAnimator valueAnimator = z ? this.showAnimator : this.hideAnimator;
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                endAnimatorWithoutCallbacks(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (z3 && valueAnimator.isRunning()) {
            return false;
        }
        boolean z4 = !z || super.setVisible(z, false);
        if (!(z ? this.baseSpec.isShowAnimationEnabled() : this.baseSpec.isHideAnimationEnabled())) {
            endAnimatorWithoutCallbacks(valueAnimator);
            return z4;
        }
        if (z2 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z4;
    }

    private void endAnimatorWithoutCallbacks(android.animation.ValueAnimator... valueAnimatorArr) {
        boolean z = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (android.animation.ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.ignoreCallbacks = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.totalAlpha = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.totalAlpha;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    private void setShowAnimator(android.animation.ValueAnimator valueAnimator) {
        android.animation.ValueAnimator valueAnimator2 = this.showAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new java.lang.IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.showAnimator = valueAnimator;
        valueAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                super.onAnimationStart(animator);
                com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.this.dispatchAnimationStart();
            }
        });
    }

    android.animation.ValueAnimator getHideAnimator() {
        return this.hideAnimator;
    }

    private void setHideAnimator(android.animation.ValueAnimator valueAnimator) {
        android.animation.ValueAnimator valueAnimator2 = this.hideAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new java.lang.IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.hideAnimator = valueAnimator;
        valueAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                super.onAnimationEnd(animator);
                com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.this.dispatchAnimationEnd();
            }
        });
    }

    float getGrowFraction() {
        if (!this.baseSpec.isShowAnimationEnabled() && !this.baseSpec.isHideAnimationEnabled()) {
            return 1.0f;
        }
        if (this.mockHideAnimationRunning || this.mockShowAnimationRunning) {
            return this.mockGrowFraction;
        }
        return this.growFraction;
    }

    void setGrowFraction(float f) {
        if (this.growFraction != f) {
            this.growFraction = f;
            invalidateSelf();
        }
    }

    void setMockShowAnimationRunning(boolean z, float f) {
        this.mockShowAnimationRunning = z;
        this.mockGrowFraction = f;
    }

    void setMockHideAnimationRunning(boolean z, float f) {
        this.mockHideAnimationRunning = z;
        this.mockGrowFraction = f;
    }
}
