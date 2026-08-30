package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseProgressIndicator<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> extends android.widget.ProgressBar {
    static final float DEFAULT_OPACITY = 0.2f;
    static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_ProgressIndicator;
    public static final int HIDE_INWARD = 2;
    public static final int HIDE_NONE = 0;
    public static final int HIDE_OUTWARD = 1;
    static final int MAX_ALPHA = 255;
    static final int MAX_HIDE_DELAY = 1000;
    public static final int SHOW_INWARD = 2;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OUTWARD = 1;
    com.google.android.material.progressindicator.AnimatorDurationScaleProvider animatorDurationScaleProvider;
    private final java.lang.Runnable delayedHide;
    private final java.lang.Runnable delayedShow;
    private final androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback hideAnimationCallback;
    private boolean isIndeterminateModeChangeRequested;
    private boolean isParentDoneInitializing;
    private long lastShowStartTime;
    private final int minHideDelay;
    private final int showDelay;
    S spec;
    private int storedProgress;
    private boolean storedProgressAnimated;
    private final androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback switchIndeterminateModeCallback;
    private int visibilityAfterHide;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HideAnimationBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ShowAnimationBehavior {
    }

    abstract S createSpec(android.content.Context context, android.util.AttributeSet attributeSet);

    protected BaseProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        this.lastShowStartTime = -1L;
        this.isIndeterminateModeChangeRequested = false;
        this.visibilityAfterHide = 4;
        this.delayedShow = new java.lang.Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.1
            @Override // java.lang.Runnable
            public void run() {
                com.google.android.material.progressindicator.BaseProgressIndicator.this.internalShow();
            }
        };
        this.delayedHide = new java.lang.Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.2
            @Override // java.lang.Runnable
            public void run() {
                com.google.android.material.progressindicator.BaseProgressIndicator.this.internalHide();
                com.google.android.material.progressindicator.BaseProgressIndicator.this.lastShowStartTime = -1L;
            }
        };
        this.switchIndeterminateModeCallback = new androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.3
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
                com.google.android.material.progressindicator.BaseProgressIndicator.this.setIndeterminate(false);
                com.google.android.material.progressindicator.BaseProgressIndicator baseProgressIndicator = com.google.android.material.progressindicator.BaseProgressIndicator.this;
                baseProgressIndicator.setProgressCompat(baseProgressIndicator.storedProgress, com.google.android.material.progressindicator.BaseProgressIndicator.this.storedProgressAnimated);
            }
        };
        this.hideAnimationCallback = new androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.4
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
                super.onAnimationEnd(drawable);
                if (com.google.android.material.progressindicator.BaseProgressIndicator.this.isIndeterminateModeChangeRequested) {
                    return;
                }
                com.google.android.material.progressindicator.BaseProgressIndicator baseProgressIndicator = com.google.android.material.progressindicator.BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.visibilityAfterHide);
            }
        };
        android.content.Context context2 = getContext();
        this.spec = (S) createSpec(context2, attributeSet);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.BaseProgressIndicator, i, i2, new int[0]);
        this.showDelay = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.BaseProgressIndicator_showDelay, -1);
        this.minHideDelay = java.lang.Math.min(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayObtainStyledAttributes.recycle();
        this.animatorDurationScaleProvider = new com.google.android.material.progressindicator.AnimatorDurationScaleProvider();
        this.isParentDoneInitializing = true;
    }

    private void registerAnimationCallbacks() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().getAnimatorDelegate().registerAnimatorsCompleteCallback(this.switchIndeterminateModeCallback);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().registerAnimationCallback(this.hideAnimationCallback);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().registerAnimationCallback(this.hideAnimationCallback);
        }
    }

    private void unregisterAnimationCallbacks() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().unregisterAnimationCallback(this.hideAnimationCallback);
            getIndeterminateDrawable().getAnimatorDelegate().unregisterAnimatorsCompleteCallback();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().unregisterAnimationCallback(this.hideAnimationCallback);
        }
    }

    public void show() {
        if (this.showDelay > 0) {
            removeCallbacks(this.delayedShow);
            postDelayed(this.delayedShow, this.showDelay);
        } else {
            this.delayedShow.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalShow() {
        if (this.minHideDelay > 0) {
            this.lastShowStartTime = android.os.SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public void hide() {
        if (getVisibility() != 0) {
            removeCallbacks(this.delayedShow);
            return;
        }
        removeCallbacks(this.delayedHide);
        long jUptimeMillis = android.os.SystemClock.uptimeMillis() - this.lastShowStartTime;
        int i = this.minHideDelay;
        if (jUptimeMillis >= ((long) i)) {
            this.delayedHide.run();
        } else {
            postDelayed(this.delayedHide, ((long) i) - jUptimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalHide() {
        ((com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).setVisible(false, false, true);
        if (isNoLongerNeedToBeVisible()) {
            setVisibility(4);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        applyNewVisibility(i == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        applyNewVisibility(false);
    }

    protected void applyNewVisibility(boolean z) {
        if (this.isParentDoneInitializing) {
            ((com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).setVisible(visibleToUser(), false, z);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerAnimationCallbacks();
        if (visibleToUser()) {
            internalShow();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.delayedHide);
        removeCallbacks(this.delayedShow);
        ((com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).hideNow();
        unregisterAnimationCallbacks();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(android.graphics.Canvas canvas) {
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        int preferredWidth;
        int preferredHeight;
        com.google.android.material.progressindicator.DrawingDelegate<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        if (currentDrawingDelegate.getPreferredWidth() < 0) {
            preferredWidth = getDefaultSize(getSuggestedMinimumWidth(), i);
        } else {
            preferredWidth = currentDrawingDelegate.getPreferredWidth() + getPaddingLeft() + getPaddingRight();
        }
        if (currentDrawingDelegate.getPreferredHeight() < 0) {
            preferredHeight = getDefaultSize(getSuggestedMinimumHeight(), i2);
        } else {
            preferredHeight = currentDrawingDelegate.getPreferredHeight() + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(preferredWidth, preferredHeight);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar
    public android.graphics.drawable.Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    private com.google.android.material.progressindicator.DrawingDelegate<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().getDrawingDelegate();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().getDrawingDelegate();
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof com.google.android.material.progressindicator.DeterminateDrawable) {
                com.google.android.material.progressindicator.DeterminateDrawable determinateDrawable = (com.google.android.material.progressindicator.DeterminateDrawable) drawable;
                determinateDrawable.hideNow();
                super.setProgressDrawable(determinateDrawable);
                determinateDrawable.setLevelByFraction(getProgress() / getMax());
                return;
            }
            throw new java.lang.IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (drawable instanceof com.google.android.material.progressindicator.IndeterminateDrawable) {
                ((com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange) drawable).hideNow();
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new java.lang.IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    @Override // android.widget.ProgressBar
    public com.google.android.material.progressindicator.DeterminateDrawable<S> getProgressDrawable() {
        return (com.google.android.material.progressindicator.DeterminateDrawable) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    public com.google.android.material.progressindicator.IndeterminateDrawable<S> getIndeterminateDrawable() {
        return (com.google.android.material.progressindicator.IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    boolean visibleToUser() {
        return androidx.core.view.ViewCompat.isAttachedToWindow(this) && getWindowVisibility() == 0 && isEffectivelyVisible();
    }

    boolean isEffectivelyVisible() {
        android.view.View view = this;
        while (view.getVisibility() == 0) {
            java.lang.Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof android.view.View)) {
                return true;
            }
            view = (android.view.View) parent;
        }
        return false;
    }

    private boolean isNoLongerNeedToBeVisible() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
        if (drawableWithAnimatedVisibilityChange != null) {
            drawableWithAnimatedVisibilityChange.hideNow();
        }
        super.setIndeterminate(z);
        com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = (com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
        if (drawableWithAnimatedVisibilityChange2 != null) {
            drawableWithAnimatedVisibilityChange2.setVisible(visibleToUser(), false, false);
        }
        if ((drawableWithAnimatedVisibilityChange2 instanceof com.google.android.material.progressindicator.IndeterminateDrawable) && visibleToUser()) {
            ((com.google.android.material.progressindicator.IndeterminateDrawable) drawableWithAnimatedVisibilityChange2).getAnimatorDelegate().startAnimator();
        }
        this.isIndeterminateModeChangeRequested = false;
    }

    public int getTrackThickness() {
        return this.spec.trackThickness;
    }

    public void setTrackThickness(int i) {
        if (this.spec.trackThickness != i) {
            this.spec.trackThickness = i;
            requestLayout();
        }
    }

    public int[] getIndicatorColor() {
        return this.spec.indicatorColors;
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{com.google.android.material.color.MaterialColors.getColor(getContext(), com.google.android.material.R.attr.colorPrimary, -1)};
        }
        if (java.util.Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.spec.indicatorColors = iArr;
        getIndeterminateDrawable().getAnimatorDelegate().invalidateSpecValues();
        invalidate();
    }

    public int getTrackColor() {
        return this.spec.trackColor;
    }

    public void setTrackColor(int i) {
        if (this.spec.trackColor != i) {
            this.spec.trackColor = i;
            invalidate();
        }
    }

    public int getTrackCornerRadius() {
        return this.spec.trackCornerRadius;
    }

    public void setTrackCornerRadius(int i) {
        if (this.spec.trackCornerRadius != i) {
            S s = this.spec;
            s.trackCornerRadius = java.lang.Math.min(i, s.trackThickness / 2);
        }
    }

    public int getShowAnimationBehavior() {
        return this.spec.showAnimationBehavior;
    }

    public void setShowAnimationBehavior(int i) {
        this.spec.showAnimationBehavior = i;
        invalidate();
    }

    public int getHideAnimationBehavior() {
        return this.spec.hideAnimationBehavior;
    }

    public void setHideAnimationBehavior(int i) {
        this.spec.hideAnimationBehavior = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i, false);
    }

    public void setProgressCompat(int i, boolean z) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.storedProgress = i;
                this.storedProgressAnimated = z;
                this.isIndeterminateModeChangeRequested = true;
                if (!getIndeterminateDrawable().isVisible() || this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(getContext().getContentResolver()) == 0.0f) {
                    this.switchIndeterminateModeCallback.onAnimationEnd(getIndeterminateDrawable());
                    return;
                } else {
                    getIndeterminateDrawable().getAnimatorDelegate().requestCancelAnimatorAfterCurrentCycle();
                    return;
                }
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() == null || z) {
            return;
        }
        getProgressDrawable().jumpToCurrentState();
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new java.lang.IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.visibilityAfterHide = i;
    }

    public void setAnimatorDurationScaleProvider(com.google.android.material.progressindicator.AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.animatorDurationScaleProvider = animatorDurationScaleProvider;
        if (getProgressDrawable() != null) {
            getProgressDrawable().animatorDurationScaleProvider = animatorDurationScaleProvider;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().animatorDurationScaleProvider = animatorDurationScaleProvider;
        }
    }
}
