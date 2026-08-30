package com.google.android.material.transition;

/* JADX INFO: loaded from: classes5.dex */
abstract class MaterialVisibility<P extends com.google.android.material.transition.VisibilityAnimatorProvider> extends androidx.transition.Visibility {
    private final java.util.List<com.google.android.material.transition.VisibilityAnimatorProvider> additionalAnimatorProviders = new java.util.ArrayList();
    private final P primaryAnimatorProvider;
    private com.google.android.material.transition.VisibilityAnimatorProvider secondaryAnimatorProvider;

    int getDurationThemeAttrResId(boolean z) {
        return 0;
    }

    int getEasingThemeAttrResId(boolean z) {
        return 0;
    }

    protected MaterialVisibility(P p, com.google.android.material.transition.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.primaryAnimatorProvider = p;
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
    }

    public P getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    public com.google.android.material.transition.VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    public void setSecondaryAnimatorProvider(com.google.android.material.transition.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.secondaryAnimatorProvider = visibilityAnimatorProvider;
    }

    public void addAdditionalAnimatorProvider(com.google.android.material.transition.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.additionalAnimatorProviders.add(visibilityAnimatorProvider);
    }

    public boolean removeAdditionalAnimatorProvider(com.google.android.material.transition.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.additionalAnimatorProviders.remove(visibilityAnimatorProvider);
    }

    public void clearAdditionalAnimatorProvider() {
        this.additionalAnimatorProviders.clear();
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, false);
    }

    private android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, android.view.View view, boolean z) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        addAnimatorIfNeeded(arrayList, this.primaryAnimatorProvider, viewGroup, view, z);
        addAnimatorIfNeeded(arrayList, this.secondaryAnimatorProvider, viewGroup, view, z);
        java.util.Iterator<com.google.android.material.transition.VisibilityAnimatorProvider> it = this.additionalAnimatorProviders.iterator();
        while (it.hasNext()) {
            addAnimatorIfNeeded(arrayList, it.next(), viewGroup, view, z);
        }
        maybeApplyThemeValues(viewGroup.getContext(), z);
        com.google.android.material.animation.AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private static void addAnimatorIfNeeded(java.util.List<android.animation.Animator> list, com.google.android.material.transition.VisibilityAnimatorProvider visibilityAnimatorProvider, android.view.ViewGroup viewGroup, android.view.View view, boolean z) {
        android.animation.Animator animatorCreateDisappear;
        if (visibilityAnimatorProvider == null) {
            return;
        }
        if (z) {
            animatorCreateDisappear = visibilityAnimatorProvider.createAppear(viewGroup, view);
        } else {
            animatorCreateDisappear = visibilityAnimatorProvider.createDisappear(viewGroup, view);
        }
        if (animatorCreateDisappear != null) {
            list.add(animatorCreateDisappear);
        }
    }

    private void maybeApplyThemeValues(android.content.Context context, boolean z) {
        com.google.android.material.transition.TransitionUtils.maybeApplyThemeDuration(this, context, getDurationThemeAttrResId(z));
        com.google.android.material.transition.TransitionUtils.maybeApplyThemeInterpolator(this, context, getEasingThemeAttrResId(z), getDefaultEasingInterpolator(z));
    }

    android.animation.TimeInterpolator getDefaultEasingInterpolator(boolean z) {
        return com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }
}
