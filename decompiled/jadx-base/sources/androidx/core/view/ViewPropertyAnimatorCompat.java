package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPropertyAnimatorCompat {
    static final int LISTENER_TAG_ID = 2113929216;
    private final java.lang.ref.WeakReference<android.view.View> mView;
    java.lang.Runnable mStartAction = null;
    java.lang.Runnable mEndAction = null;
    int mOldLayerType = -1;

    ViewPropertyAnimatorCompat(android.view.View view) {
        this.mView = new java.lang.ref.WeakReference<>(view);
    }

    static class ViewPropertyAnimatorListenerApi14 implements androidx.core.view.ViewPropertyAnimatorListener {
        boolean mAnimEndCalled;
        androidx.core.view.ViewPropertyAnimatorCompat mVpa;

        ViewPropertyAnimatorListenerApi14(androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
            this.mVpa = viewPropertyAnimatorCompat;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(android.view.View view) {
            this.mAnimEndCalled = false;
            if (this.mVpa.mOldLayerType > -1) {
                view.setLayerType(2, null);
            }
            if (this.mVpa.mStartAction != null) {
                java.lang.Runnable runnable = this.mVpa.mStartAction;
                this.mVpa.mStartAction = null;
                runnable.run();
            }
            java.lang.Object tag = view.getTag(androidx.core.view.ViewPropertyAnimatorCompat.LISTENER_TAG_ID);
            androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener = tag instanceof androidx.core.view.ViewPropertyAnimatorListener ? (androidx.core.view.ViewPropertyAnimatorListener) tag : null;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationStart(view);
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(android.view.View view) {
            if (this.mVpa.mOldLayerType > -1) {
                view.setLayerType(this.mVpa.mOldLayerType, null);
                this.mVpa.mOldLayerType = -1;
            }
            if (this.mVpa.mEndAction != null) {
                java.lang.Runnable runnable = this.mVpa.mEndAction;
                this.mVpa.mEndAction = null;
                runnable.run();
            }
            java.lang.Object tag = view.getTag(androidx.core.view.ViewPropertyAnimatorCompat.LISTENER_TAG_ID);
            androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener = tag instanceof androidx.core.view.ViewPropertyAnimatorListener ? (androidx.core.view.ViewPropertyAnimatorListener) tag : null;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationEnd(view);
            }
            this.mAnimEndCalled = true;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(android.view.View view) {
            java.lang.Object tag = view.getTag(androidx.core.view.ViewPropertyAnimatorCompat.LISTENER_TAG_ID);
            androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener = tag instanceof androidx.core.view.ViewPropertyAnimatorListener ? (androidx.core.view.ViewPropertyAnimatorListener) tag : null;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationCancel(view);
            }
        }
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setDuration(long j) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat alpha(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat alphaBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationX(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationY(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat withEndAction(java.lang.Runnable runnable) {
        android.view.View view = this.mView.get();
        if (view != null) {
            androidx.core.view.ViewPropertyAnimatorCompat.Api16Impl.withEndAction(view.animate(), runnable);
        }
        return this;
    }

    public long getDuration() {
        android.view.View view = this.mView.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setInterpolator(android.view.animation.Interpolator interpolator) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public android.view.animation.Interpolator getInterpolator() {
        android.view.View view = this.mView.get();
        if (view != null) {
            return androidx.core.view.ViewPropertyAnimatorCompat.Api18Impl.getInterpolator(view.animate());
        }
        return null;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setStartDelay(long j) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public long getStartDelay() {
        android.view.View view = this.mView.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotation(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationX(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationXBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationY(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationYBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleX(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleXBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleY(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleYBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    public void cancel() {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public androidx.core.view.ViewPropertyAnimatorCompat x(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat xBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat y(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat yBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationXBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationYBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationZBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.translationZBy(view.animate(), f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationZ(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.translationZ(view.animate(), f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat z(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.z(view.animate(), f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat zBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.zBy(view.animate(), f);
        }
        return this;
    }

    public void start() {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public androidx.core.view.ViewPropertyAnimatorCompat withLayer() {
        android.view.View view = this.mView.get();
        if (view != null) {
            androidx.core.view.ViewPropertyAnimatorCompat.Api16Impl.withLayer(view.animate());
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat withStartAction(java.lang.Runnable runnable) {
        android.view.View view = this.mView.get();
        if (view != null) {
            androidx.core.view.ViewPropertyAnimatorCompat.Api16Impl.withStartAction(view.animate(), runnable);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setListener(androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        android.view.View view = this.mView.get();
        if (view != null) {
            setListenerInternal(view, viewPropertyAnimatorListener);
        }
        return this;
    }

    private void setListenerInternal(final android.view.View view, final androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.core.view.ViewPropertyAnimatorCompat.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(android.animation.Animator animator) {
                    viewPropertyAnimatorListener.onAnimationCancel(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    viewPropertyAnimatorListener.onAnimationEnd(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator) {
                    viewPropertyAnimatorListener.onAnimationStart(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setUpdateListener(final androidx.core.view.ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        final android.view.View view = this.mView.get();
        if (view != null) {
            androidx.core.view.ViewPropertyAnimatorCompat.Api19Impl.setUpdateListener(view.animate(), viewPropertyAnimatorUpdateListener != null ? new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.ViewPropertyAnimatorCompat$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    viewPropertyAnimatorUpdateListener.onAnimationUpdate(view);
                }
            } : null);
        }
        return this;
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static android.view.ViewPropertyAnimator withEndAction(android.view.ViewPropertyAnimator viewPropertyAnimator, java.lang.Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        static android.view.ViewPropertyAnimator withLayer(android.view.ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        static android.view.ViewPropertyAnimator withStartAction(android.view.ViewPropertyAnimator viewPropertyAnimator, java.lang.Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    static class Api18Impl {
        private Api18Impl() {
        }

        static android.view.animation.Interpolator getInterpolator(android.view.ViewPropertyAnimator viewPropertyAnimator) {
            return (android.view.animation.Interpolator) viewPropertyAnimator.getInterpolator();
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static android.view.ViewPropertyAnimator translationZBy(android.view.ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZBy(f);
        }

        static android.view.ViewPropertyAnimator translationZ(android.view.ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZ(f);
        }

        static android.view.ViewPropertyAnimator z(android.view.ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.z(f);
        }

        static android.view.ViewPropertyAnimator zBy(android.view.ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.zBy(f);
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static android.view.ViewPropertyAnimator setUpdateListener(android.view.ViewPropertyAnimator viewPropertyAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }
}
