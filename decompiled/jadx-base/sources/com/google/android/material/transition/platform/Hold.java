package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes5.dex */
public final class Hold extends android.transition.Visibility {
    @Override // android.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, android.transition.TransitionValues transitionValues, android.transition.TransitionValues transitionValues2) {
        return android.animation.ValueAnimator.ofFloat(0.0f);
    }

    @Override // android.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, android.transition.TransitionValues transitionValues, android.transition.TransitionValues transitionValues2) {
        return android.animation.ValueAnimator.ofFloat(0.0f);
    }
}
