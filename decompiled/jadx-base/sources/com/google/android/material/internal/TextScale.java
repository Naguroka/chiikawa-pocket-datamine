package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class TextScale extends androidx.transition.Transition {
    private static final java.lang.String PROPNAME_SCALE = "android:textscale:scale";

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    private void captureValues(androidx.transition.TransitionValues transitionValues) {
        if (transitionValues.view instanceof android.widget.TextView) {
            transitionValues.values.put(PROPNAME_SCALE, java.lang.Float.valueOf(((android.widget.TextView) transitionValues.view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !(transitionValues.view instanceof android.widget.TextView) || !(transitionValues2.view instanceof android.widget.TextView)) {
            return null;
        }
        final android.widget.TextView textView = (android.widget.TextView) transitionValues2.view;
        java.util.Map<java.lang.String, java.lang.Object> map = transitionValues.values;
        java.util.Map<java.lang.String, java.lang.Object> map2 = transitionValues2.values;
        float fFloatValue = map.get(PROPNAME_SCALE) != null ? ((java.lang.Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        float fFloatValue2 = map2.get(PROPNAME_SCALE) != null ? ((java.lang.Float) map2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float fFloatValue3 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(fFloatValue3);
                textView.setScaleY(fFloatValue3);
            }
        });
        return valueAnimatorOfFloat;
    }
}
