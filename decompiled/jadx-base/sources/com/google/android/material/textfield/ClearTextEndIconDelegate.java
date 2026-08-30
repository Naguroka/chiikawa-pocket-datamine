package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes5.dex */
class ClearTextEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    private static final int ANIMATION_FADE_DURATION = 100;
    private static final int ANIMATION_SCALE_DURATION = 150;
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    private android.widget.EditText editText;
    private android.animation.AnimatorSet iconInAnim;
    private android.animation.ValueAnimator iconOutAnim;
    private final android.view.View.OnFocusChangeListener onFocusChangeListener;
    private final android.view.View.OnClickListener onIconClickListener;

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-textfield-ClearTextEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m777xfc81bd94(android.view.View view) {
        android.widget.EditText editText = this.editText;
        if (editText == null) {
            return;
        }
        android.text.Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        refreshIconState();
    }

    /* JADX INFO: renamed from: lambda$new$1$com-google-android-material-textfield-ClearTextEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m778x7ae2c173(android.view.View view, boolean z) {
        animateIcon(shouldBeVisible());
    }

    ClearTextEndIconDelegate(com.google.android.material.textfield.EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.onIconClickListener = new android.view.View.OnClickListener() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f$0.m777xfc81bd94(view);
            }
        };
        this.onFocusChangeListener = new android.view.View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                this.f$0.m778x7ae2c173(view, z);
            }
        };
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void setUp() {
        initAnimators();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void tearDown() {
        android.widget.EditText editText = this.editText;
        if (editText != null) {
            editText.post(new java.lang.Runnable() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m779x26d8c5f4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$tearDown$2$com-google-android-material-textfield-ClearTextEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m779x26d8c5f4() {
        animateIcon(true);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconDrawableResId() {
        return com.google.android.material.R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconContentDescriptionResId() {
        return com.google.android.material.R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void onSuffixVisibilityChanged(boolean z) {
        if (this.endLayout.getSuffixText() == null) {
            return;
        }
        animateIcon(z);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(android.widget.EditText editText) {
        this.editText = editText;
        this.textInputLayout.setEndIconVisible(shouldBeVisible());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void afterEditTextChanged(android.text.Editable editable) {
        if (this.endLayout.getSuffixText() != null) {
            return;
        }
        animateIcon(shouldBeVisible());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    private void animateIcon(boolean z) {
        boolean z2 = this.endLayout.isEndIconVisible() == z;
        if (z && !this.iconInAnim.isRunning()) {
            this.iconOutAnim.cancel();
            this.iconInAnim.start();
            if (z2) {
                this.iconInAnim.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.iconInAnim.cancel();
        this.iconOutAnim.start();
        if (z2) {
            this.iconOutAnim.end();
        }
    }

    private void initAnimators() {
        android.animation.ValueAnimator scaleAnimator = getScaleAnimator();
        android.animation.ValueAnimator alphaAnimator = getAlphaAnimator(0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.iconInAnim = animatorSet;
        animatorSet.playTogether(scaleAnimator, alphaAnimator);
        this.iconInAnim.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.endLayout.setEndIconVisible(true);
            }
        });
        android.animation.ValueAnimator alphaAnimator2 = getAlphaAnimator(1.0f, 0.0f);
        this.iconOutAnim = alphaAnimator2;
        alphaAnimator2.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.endLayout.setEndIconVisible(false);
            }
        });
    }

    private android.animation.ValueAnimator getAlphaAnimator(float... fArr) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.f$0.m775xa5c23ba8(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: lambda$getAlphaAnimator$3$com-google-android-material-textfield-ClearTextEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m775xa5c23ba8(android.animation.ValueAnimator valueAnimator) {
        this.endIconView.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private android.animation.ValueAnimator getScaleAnimator() {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(ANIMATION_SCALE_FROM_VALUE, 1.0f);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.f$0.m776x3819711b(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: lambda$getScaleAnimator$4$com-google-android-material-textfield-ClearTextEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m776x3819711b(android.animation.ValueAnimator valueAnimator) {
        float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        this.endIconView.setScaleX(fFloatValue);
        this.endIconView.setScaleY(fFloatValue);
    }

    private boolean shouldBeVisible() {
        android.widget.EditText editText = this.editText;
        return editText != null && (editText.hasFocus() || this.endIconView.hasFocus()) && this.editText.getText().length() > 0;
    }
}
