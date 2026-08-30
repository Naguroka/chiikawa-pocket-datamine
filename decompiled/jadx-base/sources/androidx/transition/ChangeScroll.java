package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public class ChangeScroll extends androidx.transition.Transition {
    private static final java.lang.String PROPNAME_SCROLL_X = "android:changeScroll:x";
    private static final java.lang.String PROPNAME_SCROLL_Y = "android:changeScroll:y";
    private static final java.lang.String[] PROPERTIES = {PROPNAME_SCROLL_X, PROPNAME_SCROLL_Y};

    public ChangeScroll() {
    }

    public ChangeScroll(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
        return PROPERTIES;
    }

    private void captureValues(androidx.transition.TransitionValues transitionValues) {
        transitionValues.values.put(PROPNAME_SCROLL_X, java.lang.Integer.valueOf(transitionValues.view.getScrollX()));
        transitionValues.values.put(PROPNAME_SCROLL_Y, java.lang.Integer.valueOf(transitionValues.view.getScrollY()));
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        android.animation.ObjectAnimator objectAnimatorOfInt;
        android.animation.ObjectAnimator objectAnimatorOfInt2 = null;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        android.view.View view = transitionValues2.view;
        int iIntValue = ((java.lang.Integer) transitionValues.values.get(PROPNAME_SCROLL_X)).intValue();
        int iIntValue2 = ((java.lang.Integer) transitionValues2.values.get(PROPNAME_SCROLL_X)).intValue();
        int iIntValue3 = ((java.lang.Integer) transitionValues.values.get(PROPNAME_SCROLL_Y)).intValue();
        int iIntValue4 = ((java.lang.Integer) transitionValues2.values.get(PROPNAME_SCROLL_Y)).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = android.animation.ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = android.animation.ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        return androidx.transition.TransitionUtils.mergeAnimators(objectAnimatorOfInt, objectAnimatorOfInt2);
    }
}
