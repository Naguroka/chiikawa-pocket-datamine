package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
final class LinearIndeterminateDisjointAnimatorDelegate extends com.google.android.material.progressindicator.IndeterminateAnimatorDelegate<android.animation.ObjectAnimator> {
    private static final int TOTAL_DURATION_IN_MS = 1800;
    private float animationFraction;
    private android.animation.ObjectAnimator animator;
    androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animatorCompleteCallback;
    private final com.google.android.material.progressindicator.BaseProgressIndicatorSpec baseSpec;
    private android.animation.ObjectAnimator completeEndAnimator;
    private boolean dirtyColors;
    private int indicatorColorIndex;
    private final android.view.animation.Interpolator[] interpolatorArray;
    private static final int[] DURATION_TO_MOVE_SEGMENT_ENDS = {533, 567, 850, 750};
    private static final int[] DELAY_TO_MOVE_SEGMENT_ENDS = {1267, 1000, 333, 0};
    private static final android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate, java.lang.Float> ANIMATION_FRACTION = new android.util.Property<com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate, java.lang.Float>(java.lang.Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.3
        @Override // android.util.Property
        public java.lang.Float get(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
            return java.lang.Float.valueOf(linearIndeterminateDisjointAnimatorDelegate.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, java.lang.Float f) {
            linearIndeterminateDisjointAnimatorDelegate.setAnimationFraction(f.floatValue());
        }
    };

    public LinearIndeterminateDisjointAnimatorDelegate(android.content.Context context, com.google.android.material.progressindicator.LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.indicatorColorIndex = 0;
        this.animatorCompleteCallback = null;
        this.baseSpec = linearProgressIndicatorSpec;
        this.interpolatorArray = new android.view.animation.Interpolator[]{androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(context, com.google.android.material.R.anim.linear_indeterminate_line1_head_interpolator), androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(context, com.google.android.material.R.anim.linear_indeterminate_line1_tail_interpolator), androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(context, com.google.android.material.R.anim.linear_indeterminate_line2_head_interpolator), androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(context, com.google.android.material.R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
        maybeInitializeAnimators();
        resetPropertiesForNewStart();
        this.animator.start();
    }

    private void maybeInitializeAnimators() {
        if (this.animator == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, 0.0f, 1.0f);
            this.animator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(android.animation.Animator animator) {
                    super.onAnimationRepeat(animator);
                    com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.this;
                    linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex = (linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex + 1) % com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.this.baseSpec.indicatorColors.length;
                    com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.this.dirtyColors = true;
                }
            });
        }
        if (this.completeEndAnimator == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, 1.0f);
            this.completeEndAnimator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.completeEndAnimator.setInterpolator(null);
            this.completeEndAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    super.onAnimationEnd(animator);
                    com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.this.cancelAnimatorImmediately();
                    if (com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.this.animatorCompleteCallback != null) {
                        com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.this.animatorCompleteCallback.onAnimationEnd(com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.this.drawable);
                    }
                }
            });
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
        android.animation.ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
        android.animation.ObjectAnimator objectAnimator = this.completeEndAnimator;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        cancelAnimatorImmediately();
        if (this.drawable.isVisible()) {
            this.completeEndAnimator.setFloatValues(this.animationFraction, 1.0f);
            this.completeEndAnimator.setDuration((long) ((1.0f - this.animationFraction) * 1800.0f));
            this.completeEndAnimator.start();
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
        for (int i2 = 0; i2 < 4; i2++) {
            this.segmentPositions[i2] = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, this.interpolatorArray[i2].getInterpolation(getFractionInRange(i, DELAY_TO_MOVE_SEGMENT_ENDS[i2], DURATION_TO_MOVE_SEGMENT_ENDS[i2]))));
        }
    }

    private void maybeUpdateSegmentColors() {
        if (this.dirtyColors) {
            java.util.Arrays.fill(this.segmentColors, com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(this.baseSpec.indicatorColors[this.indicatorColorIndex], this.drawable.getAlpha()));
            this.dirtyColors = false;
        }
    }

    void resetPropertiesForNewStart() {
        this.indicatorColorIndex = 0;
        int iCompositeARGBWithAlpha = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(this.baseSpec.indicatorColors[0], this.drawable.getAlpha());
        this.segmentColors[0] = iCompositeARGBWithAlpha;
        this.segmentColors[1] = iCompositeARGBWithAlpha;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAnimationFraction() {
        return this.animationFraction;
    }

    void setAnimationFraction(float f) {
        this.animationFraction = f;
        updateSegmentPositions((int) (f * 1800.0f));
        maybeUpdateSegmentColors();
        this.drawable.invalidateSelf();
    }
}
