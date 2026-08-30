package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
final class CircularIndeterminateAnimatorDelegate extends com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> {
    private static final int CONSTANT_ROTATION_DEGREES = 1520;
    private static final int DURATION_TO_COLLAPSE_IN_MS = 667;
    private static final int DURATION_TO_COMPLETE_END_IN_MS = 333;
    private static final int DURATION_TO_EXPAND_IN_MS = 667;
    private static final int DURATION_TO_FADE_IN_MS = 333;
    private static final int EXTRA_DEGREES_PER_CYCLE = 250;
    private static final int TAIL_DEGREES_OFFSET = -20;
    private static final int TOTAL_CYCLES = 4;
    private static final int TOTAL_DURATION_IN_MS = 5400;
    private float animationFraction;
    private android.animation.ObjectAnimator animator;
    androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animatorCompleteCallback;
    private final com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseSpec;
    private android.animation.ObjectAnimator completeEndAnimator;
    private float completeEndFraction;
    private int indicatorColorIndexOffset;
    private final androidx.interpolator.view.animation.FastOutSlowInInterpolator interpolator;
    private static final int[] DELAY_TO_EXPAND_IN_MS = {0, 1350, 2700, 4050};
    private static final int[] DELAY_TO_COLLAPSE_IN_MS = {667, 2017, 3367, 4717};
    private static final int[] DELAY_TO_FADE_IN_MS = {1000, 2350, 3700, 5050};
    private static final android.util.Property<com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate, java.lang.Float> ANIMATION_FRACTION = new android.util.Property<com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate, java.lang.Float>(java.lang.Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.3
        @Override // android.util.Property
        public java.lang.Float get(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
            return java.lang.Float.valueOf(circularIndeterminateAnimatorDelegate.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, java.lang.Float f) {
            circularIndeterminateAnimatorDelegate.setAnimationFraction(f.floatValue());
        }
    };
    private static final android.util.Property<com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate, java.lang.Float> COMPLETE_END_FRACTION = new android.util.Property<com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate, java.lang.Float>(java.lang.Float.class, "completeEndFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.4
        @Override // android.util.Property
        public java.lang.Float get(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
            return java.lang.Float.valueOf(circularIndeterminateAnimatorDelegate.getCompleteEndFraction());
        }

        @Override // android.util.Property
        public void set(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, java.lang.Float f) {
            circularIndeterminateAnimatorDelegate.setCompleteEndFraction(f.floatValue());
        }
    };

    public CircularIndeterminateAnimatorDelegate(com.google.android.material.progressindicator.CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.indicatorColorIndexOffset = 0;
        this.animatorCompleteCallback = null;
        this.baseSpec = circularProgressIndicatorSpec;
        this.interpolator = new androidx.interpolator.view.animation.FastOutSlowInInterpolator();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void startAnimator() {
        maybeInitializeAnimators();
        resetPropertiesForNewStart();
        this.animator.start();
    }

    private void maybeInitializeAnimators() {
        if (this.animator == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, 0.0f, 1.0f);
            this.animator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(android.animation.Animator animator) {
                    super.onAnimationRepeat(animator);
                    com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.this;
                    circularIndeterminateAnimatorDelegate.indicatorColorIndexOffset = (circularIndeterminateAnimatorDelegate.indicatorColorIndexOffset + 4) % com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.this.baseSpec.indicatorColors.length;
                }
            });
        }
        if (this.completeEndAnimator == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, COMPLETE_END_FRACTION, 0.0f, 1.0f);
            this.completeEndAnimator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.completeEndAnimator.setInterpolator(this.interpolator);
            this.completeEndAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    super.onAnimationEnd(animator);
                    com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.this.cancelAnimatorImmediately();
                    if (com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.this.animatorCompleteCallback != null) {
                        com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.this.animatorCompleteCallback.onAnimationEnd(com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.this.drawable);
                    }
                }
            });
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void cancelAnimatorImmediately() {
        android.animation.ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void requestCancelAnimatorAfterCurrentCycle() {
        android.animation.ObjectAnimator objectAnimator = this.completeEndAnimator;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.drawable.isVisible()) {
            this.completeEndAnimator.start();
        } else {
            cancelAnimatorImmediately();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        resetPropertiesForNewStart();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        this.animatorCompleteCallback = animationCallback;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
        this.animatorCompleteCallback = null;
    }

    private void updateSegmentPositions(int i) {
        this.segmentPositions[0] = (this.animationFraction * 1520.0f) - 20.0f;
        this.segmentPositions[1] = this.animationFraction * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float fractionInRange = getFractionInRange(i, DELAY_TO_EXPAND_IN_MS[i2], 667);
            float[] fArr = this.segmentPositions;
            fArr[1] = fArr[1] + (this.interpolator.getInterpolation(fractionInRange) * 250.0f);
            float fractionInRange2 = getFractionInRange(i, DELAY_TO_COLLAPSE_IN_MS[i2], 667);
            float[] fArr2 = this.segmentPositions;
            fArr2[0] = fArr2[0] + (this.interpolator.getInterpolation(fractionInRange2) * 250.0f);
        }
        float[] fArr3 = this.segmentPositions;
        fArr3[0] = fArr3[0] + ((this.segmentPositions[1] - this.segmentPositions[0]) * this.completeEndFraction);
        float[] fArr4 = this.segmentPositions;
        fArr4[0] = fArr4[0] / 360.0f;
        float[] fArr5 = this.segmentPositions;
        fArr5[1] = fArr5[1] / 360.0f;
    }

    private void maybeUpdateSegmentColors(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float fractionInRange = getFractionInRange(i, DELAY_TO_FADE_IN_MS[i2], 333);
            if (fractionInRange >= 0.0f && fractionInRange <= 1.0f) {
                int length = (i2 + this.indicatorColorIndexOffset) % this.baseSpec.indicatorColors.length;
                int length2 = (length + 1) % this.baseSpec.indicatorColors.length;
                this.segmentColors[0] = com.google.android.material.animation.ArgbEvaluatorCompat.getInstance().evaluate(this.interpolator.getInterpolation(fractionInRange), java.lang.Integer.valueOf(com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(this.baseSpec.indicatorColors[length], this.drawable.getAlpha())), java.lang.Integer.valueOf(com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(this.baseSpec.indicatorColors[length2], this.drawable.getAlpha()))).intValue();
                return;
            }
        }
    }

    void resetPropertiesForNewStart() {
        this.indicatorColorIndexOffset = 0;
        this.segmentColors[0] = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(this.baseSpec.indicatorColors[0], this.drawable.getAlpha());
        this.completeEndFraction = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAnimationFraction() {
        return this.animationFraction;
    }

    void setAnimationFraction(float f) {
        this.animationFraction = f;
        int i = (int) (f * 5400.0f);
        updateSegmentPositions(i);
        maybeUpdateSegmentColors(i);
        this.drawable.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCompleteEndFraction() {
        return this.completeEndFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompleteEndFraction(float f) {
        this.completeEndFraction = f;
    }
}
