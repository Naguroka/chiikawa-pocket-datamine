package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public class Explode extends androidx.transition.Visibility {
    private static final java.lang.String PROPNAME_SCREEN_BOUNDS = "android:explode:screenBounds";
    private int[] mTempLoc;
    private static final android.animation.TimeInterpolator sDecelerate = new android.view.animation.DecelerateInterpolator();
    private static final android.animation.TimeInterpolator sAccelerate = new android.view.animation.AccelerateInterpolator();

    public Explode() {
        this.mTempLoc = new int[2];
        setPropagation(new androidx.transition.CircularPropagation());
    }

    public Explode(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTempLoc = new int[2];
        setPropagation(new androidx.transition.CircularPropagation());
    }

    private void captureValues(androidx.transition.TransitionValues transitionValues) {
        android.view.View view = transitionValues.view;
        view.getLocationOnScreen(this.mTempLoc);
        int[] iArr = this.mTempLoc;
        int i = iArr[0];
        int i2 = iArr[1];
        transitionValues.values.put(PROPNAME_SCREEN_BOUNDS, new android.graphics.Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        android.graphics.Rect rect = (android.graphics.Rect) transitionValues2.values.get(PROPNAME_SCREEN_BOUNDS);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        calculateOut(viewGroup, rect, this.mTempLoc);
        int[] iArr = this.mTempLoc;
        return androidx.transition.TranslationAnimationCreator.createAnimation(view, transitionValues2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, sDecelerate, this);
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        float f;
        float f2;
        if (transitionValues == null) {
            return null;
        }
        android.graphics.Rect rect = (android.graphics.Rect) transitionValues.values.get(PROPNAME_SCREEN_BOUNDS);
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(androidx.transition.R.id.transition_position);
        if (iArr != null) {
            f = (iArr[0] - rect.left) + translationX;
            f2 = (iArr[1] - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        calculateOut(viewGroup, rect, this.mTempLoc);
        int[] iArr2 = this.mTempLoc;
        return androidx.transition.TranslationAnimationCreator.createAnimation(view, transitionValues, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], sAccelerate, this);
    }

    private void calculateOut(android.view.View view, android.graphics.Rect rect, int[] iArr) {
        int iCenterY;
        int width;
        view.getLocationOnScreen(this.mTempLoc);
        int[] iArr2 = this.mTempLoc;
        int i = iArr2[0];
        int i2 = iArr2[1];
        android.graphics.Rect epicenter = getEpicenter();
        if (epicenter == null) {
            width = (view.getWidth() / 2) + i + java.lang.Math.round(view.getTranslationX());
            iCenterY = (view.getHeight() / 2) + i2 + java.lang.Math.round(view.getTranslationY());
        } else {
            int iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
            width = iCenterX;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (java.lang.Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (java.lang.Math.random() * 2.0d)) - 1.0f;
        }
        float fCalculateDistance = calculateDistance(fCenterX, fCenterY);
        float fCalculateMaxDistance = calculateMaxDistance(view, width - i, iCenterY - i2);
        iArr[0] = java.lang.Math.round((fCenterX / fCalculateDistance) * fCalculateMaxDistance);
        iArr[1] = java.lang.Math.round(fCalculateMaxDistance * (fCenterY / fCalculateDistance));
    }

    private static float calculateMaxDistance(android.view.View view, int i, int i2) {
        return calculateDistance(java.lang.Math.max(i, view.getWidth() - i), java.lang.Math.max(i2, view.getHeight() - i2));
    }

    private static float calculateDistance(float f, float f2) {
        return (float) java.lang.Math.sqrt((f * f) + (f2 * f2));
    }
}
