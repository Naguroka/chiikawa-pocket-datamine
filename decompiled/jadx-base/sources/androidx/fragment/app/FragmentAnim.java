package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentAnim {
    private FragmentAnim() {
    }

    static androidx.fragment.app.FragmentAnim.AnimationOrAnimator loadAnimation(android.content.Context context, androidx.fragment.app.Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int nextAnim = getNextAnim(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        if (fragment.mContainer != null && fragment.mContainer.getTag(androidx.fragment.R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(androidx.fragment.R.id.visible_removing_fragment_view_tag, null);
        }
        if (fragment.mContainer != null && fragment.mContainer.getLayoutTransition() != null) {
            return null;
        }
        android.view.animation.Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, nextAnim);
        if (animationOnCreateAnimation != null) {
            return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(animationOnCreateAnimation);
        }
        android.animation.Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, nextAnim);
        if (animatorOnCreateAnimator != null) {
            return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(animatorOnCreateAnimator);
        }
        if (nextAnim == 0 && nextTransition != 0) {
            nextAnim = transitToAnimResourceId(nextTransition, z);
        }
        if (nextAnim != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(nextAnim));
            if (zEquals) {
                try {
                    android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, nextAnim);
                    if (animationLoadAnimation != null) {
                        return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(animationLoadAnimation);
                    }
                    z3 = true;
                } catch (android.content.res.Resources.NotFoundException e) {
                    throw e;
                } catch (java.lang.RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    android.animation.Animator animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(context, nextAnim);
                    if (animatorLoadAnimator != null) {
                        return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(animatorLoadAnimator);
                    }
                } catch (java.lang.RuntimeException e2) {
                    if (zEquals) {
                        throw e2;
                    }
                    android.view.animation.Animation animationLoadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, nextAnim);
                    if (animationLoadAnimation2 != null) {
                        return new androidx.fragment.app.FragmentAnim.AnimationOrAnimator(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int getNextAnim(androidx.fragment.app.Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        }
        if (z) {
            return fragment.getEnterAnim();
        }
        return fragment.getExitAnim();
    }

    static void animateRemoveFragment(final androidx.fragment.app.Fragment fragment, androidx.fragment.app.FragmentAnim.AnimationOrAnimator animationOrAnimator, final androidx.fragment.app.FragmentTransition.Callback callback) {
        final android.view.View view = fragment.mView;
        final android.view.ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        final androidx.core.os.CancellationSignal cancellationSignal = new androidx.core.os.CancellationSignal();
        cancellationSignal.setOnCancelListener(new androidx.core.os.CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.FragmentAnim.1
            @Override // androidx.core.os.CancellationSignal.OnCancelListener
            public void onCancel() {
                if (fragment.getAnimatingAway() != null) {
                    android.view.View animatingAway = fragment.getAnimatingAway();
                    fragment.setAnimatingAway(null);
                    animatingAway.clearAnimation();
                }
                fragment.setAnimator(null);
            }
        });
        callback.onStart(fragment, cancellationSignal);
        if (animationOrAnimator.animation != null) {
            androidx.fragment.app.FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new androidx.fragment.app.FragmentAnim.EndViewTransitionAnimation(animationOrAnimator.animation, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            endViewTransitionAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: androidx.fragment.app.FragmentAnim.2
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(android.view.animation.Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(android.view.animation.Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(android.view.animation.Animation animation) {
                    viewGroup.post(new java.lang.Runnable() { // from class: androidx.fragment.app.FragmentAnim.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (fragment.getAnimatingAway() != null) {
                                fragment.setAnimatingAway(null);
                                callback.onComplete(fragment, cancellationSignal);
                            }
                        }
                    });
                }
            });
            fragment.mView.startAnimation(endViewTransitionAnimation);
            return;
        }
        android.animation.Animator animator = animationOrAnimator.animator;
        fragment.setAnimator(animationOrAnimator.animator);
        animator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.fragment.app.FragmentAnim.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator2) {
                viewGroup.endViewTransition(view);
                android.animation.Animator animator3 = fragment.getAnimator();
                fragment.setAnimator(null);
                if (animator3 == null || viewGroup.indexOfChild(view) >= 0) {
                    return;
                }
                callback.onComplete(fragment, cancellationSignal);
            }
        });
        animator.setTarget(fragment.mView);
        animator.start();
    }

    private static int transitToAnimResourceId(int i, boolean z) {
        if (i == 4097) {
            return z ? androidx.fragment.R.animator.fragment_open_enter : androidx.fragment.R.animator.fragment_open_exit;
        }
        if (i == 4099) {
            return z ? androidx.fragment.R.animator.fragment_fade_enter : androidx.fragment.R.animator.fragment_fade_exit;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? androidx.fragment.R.animator.fragment_close_enter : androidx.fragment.R.animator.fragment_close_exit;
    }

    static class AnimationOrAnimator {
        public final android.view.animation.Animation animation;
        public final android.animation.Animator animator;

        AnimationOrAnimator(android.view.animation.Animation animation) {
            this.animation = animation;
            this.animator = null;
            if (animation == null) {
                throw new java.lang.IllegalStateException("Animation cannot be null");
            }
        }

        AnimationOrAnimator(android.animation.Animator animator) {
            this.animation = null;
            this.animator = animator;
            if (animator == null) {
                throw new java.lang.IllegalStateException("Animator cannot be null");
            }
        }
    }

    static class EndViewTransitionAnimation extends android.view.animation.AnimationSet implements java.lang.Runnable {
        private boolean mAnimating;
        private final android.view.View mChild;
        private boolean mEnded;
        private final android.view.ViewGroup mParent;
        private boolean mTransitionEnded;

        EndViewTransitionAnimation(android.view.animation.Animation animation, android.view.ViewGroup viewGroup, android.view.View view) {
            super(false);
            this.mAnimating = true;
            this.mParent = viewGroup;
            this.mChild = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, android.view.animation.Transformation transformation) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j, transformation)) {
                this.mEnded = true;
                androidx.core.view.OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, android.view.animation.Transformation transformation, float f) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.mEnded = true;
                androidx.core.view.OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.mEnded && this.mAnimating) {
                this.mAnimating = false;
                this.mParent.post(this);
            } else {
                this.mParent.endViewTransition(this.mChild);
                this.mTransitionEnded = true;
            }
        }
    }
}
