package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public class CircularPropagation extends androidx.transition.VisibilityPropagation {
    private float mPropagationSpeed = 3.0f;

    public void setPropagationSpeed(float f) {
        if (f == 0.0f) {
            throw new java.lang.IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.mPropagationSpeed = f;
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(android.view.ViewGroup viewGroup, androidx.transition.Transition transition, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        int i;
        int iRound;
        int iCenterX;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        if (transitionValues2 == null || getViewVisibility(transitionValues) == 0) {
            i = -1;
        } else {
            transitionValues = transitionValues2;
            i = 1;
        }
        int viewX = getViewX(transitionValues);
        int viewY = getViewY(transitionValues);
        android.graphics.Rect epicenter = transition.getEpicenter();
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iRound = epicenter.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int iRound2 = java.lang.Math.round(iArr[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound = java.lang.Math.round(iArr[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            iCenterX = iRound2;
        }
        float fDistance = distance(viewX, viewY, iCenterX, iRound) / distance(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return java.lang.Math.round(((duration * ((long) i)) / this.mPropagationSpeed) * fDistance);
    }

    private static float distance(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) java.lang.Math.sqrt((f5 * f5) + (f6 * f6));
    }
}
