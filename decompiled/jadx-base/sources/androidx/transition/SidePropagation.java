package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public class SidePropagation extends androidx.transition.VisibilityPropagation {
    private float mPropagationSpeed = 3.0f;
    private int mSide = 80;

    public void setSide(int i) {
        this.mSide = i;
    }

    public void setPropagationSpeed(float f) {
        if (f == 0.0f) {
            throw new java.lang.IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.mPropagationSpeed = f;
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(android.view.ViewGroup viewGroup, androidx.transition.Transition transition, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        int i;
        int iCenterX;
        int iCenterY;
        androidx.transition.TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null && transitionValues2 == null) {
            return 0L;
        }
        android.graphics.Rect epicenter = transition.getEpicenter();
        if (transitionValues2 == null || getViewVisibility(transitionValues3) == 0) {
            i = -1;
        } else {
            transitionValues3 = transitionValues2;
            i = 1;
        }
        int viewX = getViewX(transitionValues3);
        int viewY = getViewY(transitionValues3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + java.lang.Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + java.lang.Math.round(viewGroup.getTranslationY());
        int width = iRound + viewGroup.getWidth();
        int height = iRound2 + viewGroup.getHeight();
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        float fDistance = distance(viewGroup, viewX, viewY, iCenterX, iCenterY, iRound, iRound2, width, height) / getMaxDistance(viewGroup);
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return java.lang.Math.round(((duration * ((long) i)) / this.mPropagationSpeed) * fDistance);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    private int distance(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.mSide;
        if (i9 == 8388611) {
            if (androidx.core.view.ViewCompat.getLayoutDirection(view) == 1) {
                i9 = 5;
            } else {
                i9 = 3;
            }
        } else if (i9 == 8388613) {
            if (androidx.core.view.ViewCompat.getLayoutDirection(view) == 1) {
                i9 = 3;
            } else {
                i9 = 5;
            }
        }
        if (i9 == 3) {
            return (i7 - i) + java.lang.Math.abs(i4 - i2);
        }
        if (i9 == 5) {
            return (i - i5) + java.lang.Math.abs(i4 - i2);
        }
        if (i9 == 48) {
            return (i8 - i2) + java.lang.Math.abs(i3 - i);
        }
        if (i9 != 80) {
            return 0;
        }
        return (i2 - i6) + java.lang.Math.abs(i3 - i);
    }

    private int getMaxDistance(android.view.ViewGroup viewGroup) {
        int i = this.mSide;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }
}
