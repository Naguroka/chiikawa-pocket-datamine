package com.google.android.material.floatingactionbutton;

/* JADX INFO: loaded from: classes5.dex */
interface MotionStrategy {
    void addAnimationListener(android.animation.Animator.AnimatorListener animatorListener);

    android.animation.AnimatorSet createAnimator();

    com.google.android.material.animation.MotionSpec getCurrentMotionSpec();

    int getDefaultMotionSpecResource();

    java.util.List<android.animation.Animator.AnimatorListener> getListeners();

    com.google.android.material.animation.MotionSpec getMotionSpec();

    void onAnimationCancel();

    void onAnimationEnd();

    void onAnimationStart(android.animation.Animator animator);

    void onChange(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback onChangedCallback);

    void performNow();

    void removeAnimationListener(android.animation.Animator.AnimatorListener animatorListener);

    void setMotionSpec(com.google.android.material.animation.MotionSpec motionSpec);

    boolean shouldCancel();
}
