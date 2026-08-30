package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public class Fade extends androidx.transition.Visibility {
    public static final int IN = 1;
    private static final java.lang.String LOG_TAG = "Fade";
    public static final int OUT = 2;
    private static final java.lang.String PROPNAME_TRANSITION_ALPHA = "android:fade:transitionAlpha";

    public Fade(int i) {
        setMode(i);
    }

    public Fade() {
    }

    public Fade(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.FADE);
        setMode(androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, (android.content.res.XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        transitionValues.values.put(PROPNAME_TRANSITION_ALPHA, java.lang.Float.valueOf(androidx.transition.ViewUtils.getTransitionAlpha(transitionValues.view)));
    }

    private android.animation.Animator createAnimation(final android.view.View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        androidx.transition.ViewUtils.setTransitionAlpha(view, f);
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, androidx.transition.ViewUtils.TRANSITION_ALPHA, f2);
        objectAnimatorOfFloat.addListener(new androidx.transition.Fade.FadeAnimatorListener(view));
        addListener(new androidx.transition.TransitionListenerAdapter() { // from class: androidx.transition.Fade.1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(androidx.transition.Transition transition) {
                androidx.transition.ViewUtils.setTransitionAlpha(view, 1.0f);
                androidx.transition.ViewUtils.clearNonTransitionAlpha(view);
                transition.removeListener(this);
            }
        });
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        float startAlpha = getStartAlpha(transitionValues, 0.0f);
        return createAnimation(view, startAlpha != 1.0f ? startAlpha : 0.0f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        androidx.transition.ViewUtils.saveNonTransitionAlpha(view);
        return createAnimation(view, getStartAlpha(transitionValues, 1.0f), 0.0f);
    }

    private static float getStartAlpha(androidx.transition.TransitionValues transitionValues, float f) {
        java.lang.Float f2;
        return (transitionValues == null || (f2 = (java.lang.Float) transitionValues.values.get(PROPNAME_TRANSITION_ALPHA)) == null) ? f : f2.floatValue();
    }

    private static class FadeAnimatorListener extends android.animation.AnimatorListenerAdapter {
        private boolean mLayerTypeChanged = false;
        private final android.view.View mView;

        FadeAnimatorListener(android.view.View view) {
            this.mView = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            if (androidx.core.view.ViewCompat.hasOverlappingRendering(this.mView) && this.mView.getLayerType() == 0) {
                this.mLayerTypeChanged = true;
                this.mView.setLayerType(2, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            androidx.transition.ViewUtils.setTransitionAlpha(this.mView, 1.0f);
            if (this.mLayerTypeChanged) {
                this.mView.setLayerType(0, null);
            }
        }
    }
}
