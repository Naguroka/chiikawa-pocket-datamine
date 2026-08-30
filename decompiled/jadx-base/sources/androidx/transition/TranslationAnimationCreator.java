package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class TranslationAnimationCreator {
    static android.animation.Animator createAnimation(android.view.View view, androidx.transition.TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, android.animation.TimeInterpolator timeInterpolator, androidx.transition.Transition transition) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(androidx.transition.R.id.transition_position);
        if (iArr != null) {
            f5 = (iArr[0] - i) + translationX;
            f6 = (iArr[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int iRound = i + java.lang.Math.round(f5 - translationX);
        int iRound2 = i2 + java.lang.Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(view, android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_X, f5, f3), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_Y, f6, f4));
        androidx.transition.TranslationAnimationCreator.TransitionPositionListener transitionPositionListener = new androidx.transition.TranslationAnimationCreator.TransitionPositionListener(view, transitionValues.view, iRound, iRound2, translationX, translationY);
        transition.addListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.addListener(transitionPositionListener);
        androidx.transition.AnimatorUtils.addPauseListener(objectAnimatorOfPropertyValuesHolder, transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static class TransitionPositionListener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private final android.view.View mMovingView;
        private float mPausedX;
        private float mPausedY;
        private final int mStartX;
        private final int mStartY;
        private final float mTerminalX;
        private final float mTerminalY;
        private int[] mTransitionPosition;
        private final android.view.View mViewInHierarchy;

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition transition) {
        }

        TransitionPositionListener(android.view.View view, android.view.View view2, int i, int i2, float f, float f2) {
            this.mMovingView = view;
            this.mViewInHierarchy = view2;
            this.mStartX = i - java.lang.Math.round(view.getTranslationX());
            this.mStartY = i2 - java.lang.Math.round(view.getTranslationY());
            this.mTerminalX = f;
            this.mTerminalY = f2;
            int[] iArr = (int[]) view2.getTag(androidx.transition.R.id.transition_position);
            this.mTransitionPosition = iArr;
            if (iArr != null) {
                view2.setTag(androidx.transition.R.id.transition_position, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            if (this.mTransitionPosition == null) {
                this.mTransitionPosition = new int[2];
            }
            this.mTransitionPosition[0] = java.lang.Math.round(this.mStartX + this.mMovingView.getTranslationX());
            this.mTransitionPosition[1] = java.lang.Math.round(this.mStartY + this.mMovingView.getTranslationY());
            this.mViewInHierarchy.setTag(androidx.transition.R.id.transition_position, this.mTransitionPosition);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(android.animation.Animator animator) {
            this.mPausedX = this.mMovingView.getTranslationX();
            this.mPausedY = this.mMovingView.getTranslationY();
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(android.animation.Animator animator) {
            this.mMovingView.setTranslationX(this.mPausedX);
            this.mMovingView.setTranslationY(this.mPausedY);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
            transition.removeListener(this);
        }
    }

    private TranslationAnimationCreator() {
    }
}
