package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes5.dex */
public final class MaterialFade extends com.google.android.material.transition.platform.MaterialVisibility<com.google.android.material.transition.platform.FadeProvider> {
    private static final float DEFAULT_FADE_END_THRESHOLD_ENTER = 0.3f;
    private static final float DEFAULT_START_SCALE = 0.8f;
    private static final int DEFAULT_THEMED_INCOMING_DURATION_ATTR = com.google.android.material.R.attr.motionDurationMedium4;
    private static final int DEFAULT_THEMED_OUTGOING_DURATION_ATTR = com.google.android.material.R.attr.motionDurationShort3;
    private static final int DEFAULT_THEMED_INCOMING_EASING_ATTR = com.google.android.material.R.attr.motionEasingEmphasizedDecelerateInterpolator;
    private static final int DEFAULT_THEMED_OUTGOING_EASING_ATTR = com.google.android.material.R.attr.motionEasingEmphasizedAccelerateInterpolator;

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(com.google.android.material.transition.platform.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ com.google.android.material.transition.platform.VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ com.google.android.material.transition.platform.VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, android.transition.TransitionValues transitionValues, android.transition.TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, android.transition.TransitionValues transitionValues, android.transition.TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(com.google.android.material.transition.platform.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(com.google.android.material.transition.platform.VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }

    public MaterialFade() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    private static com.google.android.material.transition.platform.FadeProvider createPrimaryAnimatorProvider() {
        com.google.android.material.transition.platform.FadeProvider fadeProvider = new com.google.android.material.transition.platform.FadeProvider();
        fadeProvider.setIncomingEndThreshold(DEFAULT_FADE_END_THRESHOLD_ENTER);
        return fadeProvider;
    }

    private static com.google.android.material.transition.platform.VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        com.google.android.material.transition.platform.ScaleProvider scaleProvider = new com.google.android.material.transition.platform.ScaleProvider();
        scaleProvider.setScaleOnDisappear(false);
        scaleProvider.setIncomingStartScale(DEFAULT_START_SCALE);
        return scaleProvider;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    int getDurationThemeAttrResId(boolean z) {
        if (z) {
            return DEFAULT_THEMED_INCOMING_DURATION_ATTR;
        }
        return DEFAULT_THEMED_OUTGOING_DURATION_ATTR;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    int getEasingThemeAttrResId(boolean z) {
        if (z) {
            return DEFAULT_THEMED_INCOMING_EASING_ATTR;
        }
        return DEFAULT_THEMED_OUTGOING_EASING_ATTR;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    android.animation.TimeInterpolator getDefaultEasingInterpolator(boolean z) {
        return com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR;
    }
}
