package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Visibility extends androidx.transition.Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final java.lang.String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final java.lang.String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final java.lang.String PROPNAME_PARENT = "android:visibility:parent";
    private static final java.lang.String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        return null;
    }

    public android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        return null;
    }

    private static class VisibilityInfo {
        android.view.ViewGroup mEndParent;
        int mEndVisibility;
        boolean mFadeIn;
        android.view.ViewGroup mStartParent;
        int mStartVisibility;
        boolean mVisibilityChange;

        VisibilityInfo() {
        }
    }

    public Visibility() {
        this.mMode = 3;
    }

    public Visibility(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.VISIBILITY_TRANSITION);
        int namedInt = androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, (android.content.res.XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (namedInt != 0) {
            setMode(namedInt);
        }
    }

    public void setMode(int i) {
        if ((i & (-4)) != 0) {
            throw new java.lang.IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i;
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    private void captureValues(androidx.transition.TransitionValues transitionValues) {
        transitionValues.values.put(PROPNAME_VISIBILITY, java.lang.Integer.valueOf(transitionValues.view.getVisibility()));
        transitionValues.values.put(PROPNAME_PARENT, transitionValues.view.getParent());
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public boolean isVisible(androidx.transition.TransitionValues transitionValues) {
        if (transitionValues == null) {
            return false;
        }
        return ((java.lang.Integer) transitionValues.values.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((android.view.View) transitionValues.values.get(PROPNAME_PARENT)) != null;
    }

    private androidx.transition.Visibility.VisibilityInfo getVisibilityChangeInfo(androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        androidx.transition.Visibility.VisibilityInfo visibilityInfo = new androidx.transition.Visibility.VisibilityInfo();
        visibilityInfo.mVisibilityChange = false;
        visibilityInfo.mFadeIn = false;
        if (transitionValues != null && transitionValues.values.containsKey(PROPNAME_VISIBILITY)) {
            visibilityInfo.mStartVisibility = ((java.lang.Integer) transitionValues.values.get(PROPNAME_VISIBILITY)).intValue();
            visibilityInfo.mStartParent = (android.view.ViewGroup) transitionValues.values.get(PROPNAME_PARENT);
        } else {
            visibilityInfo.mStartVisibility = -1;
            visibilityInfo.mStartParent = null;
        }
        if (transitionValues2 != null && transitionValues2.values.containsKey(PROPNAME_VISIBILITY)) {
            visibilityInfo.mEndVisibility = ((java.lang.Integer) transitionValues2.values.get(PROPNAME_VISIBILITY)).intValue();
            visibilityInfo.mEndParent = (android.view.ViewGroup) transitionValues2.values.get(PROPNAME_PARENT);
        } else {
            visibilityInfo.mEndVisibility = -1;
            visibilityInfo.mEndParent = null;
        }
        if (transitionValues != null && transitionValues2 != null) {
            if (visibilityInfo.mStartVisibility == visibilityInfo.mEndVisibility && visibilityInfo.mStartParent == visibilityInfo.mEndParent) {
                return visibilityInfo;
            }
            if (visibilityInfo.mStartVisibility != visibilityInfo.mEndVisibility) {
                if (visibilityInfo.mStartVisibility == 0) {
                    visibilityInfo.mFadeIn = false;
                    visibilityInfo.mVisibilityChange = true;
                } else if (visibilityInfo.mEndVisibility == 0) {
                    visibilityInfo.mFadeIn = true;
                    visibilityInfo.mVisibilityChange = true;
                }
            } else if (visibilityInfo.mEndParent == null) {
                visibilityInfo.mFadeIn = false;
                visibilityInfo.mVisibilityChange = true;
            } else if (visibilityInfo.mStartParent == null) {
                visibilityInfo.mFadeIn = true;
                visibilityInfo.mVisibilityChange = true;
            }
        } else if (transitionValues == null && visibilityInfo.mEndVisibility == 0) {
            visibilityInfo.mFadeIn = true;
            visibilityInfo.mVisibilityChange = true;
        } else if (transitionValues2 == null && visibilityInfo.mStartVisibility == 0) {
            visibilityInfo.mFadeIn = false;
            visibilityInfo.mVisibilityChange = true;
        }
        return visibilityInfo;
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        androidx.transition.Visibility.VisibilityInfo visibilityChangeInfo = getVisibilityChangeInfo(transitionValues, transitionValues2);
        if (!visibilityChangeInfo.mVisibilityChange) {
            return null;
        }
        if (visibilityChangeInfo.mStartParent == null && visibilityChangeInfo.mEndParent == null) {
            return null;
        }
        if (visibilityChangeInfo.mFadeIn) {
            return onAppear(viewGroup, transitionValues, visibilityChangeInfo.mStartVisibility, transitionValues2, visibilityChangeInfo.mEndVisibility);
        }
        return onDisappear(viewGroup, transitionValues, visibilityChangeInfo.mStartVisibility, transitionValues2, visibilityChangeInfo.mEndVisibility);
    }

    public android.animation.Animator onAppear(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, int i, androidx.transition.TransitionValues transitionValues2, int i2) {
        if ((this.mMode & 1) != 1 || transitionValues2 == null) {
            return null;
        }
        if (transitionValues == null) {
            android.view.View view = (android.view.View) transitionValues2.view.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).mVisibilityChange) {
                return null;
            }
        }
        return onAppear(viewGroup, transitionValues2.view, transitionValues, transitionValues2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003b  */
    public android.animation.Animator onDisappear(final android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, int i, androidx.transition.TransitionValues transitionValues2, int i2) {
        android.view.View view;
        boolean z;
        boolean z2;
        android.view.View view2;
        if ((this.mMode & 2) != 2 || transitionValues == null) {
            return null;
        }
        final android.view.View view3 = transitionValues.view;
        android.view.View viewCopyViewImage = transitionValues2 != null ? transitionValues2.view : null;
        final android.view.View view4 = (android.view.View) view3.getTag(androidx.transition.R.id.save_overlay_view);
        if (view4 != null) {
            view2 = null;
            z2 = true;
        } else {
            if (viewCopyViewImage == null || viewCopyViewImage.getParent() == null) {
                if (viewCopyViewImage != null) {
                    view = null;
                    z = false;
                } else {
                    viewCopyViewImage = null;
                    view = null;
                    z = true;
                }
            } else if (i2 == 4 || view3 == viewCopyViewImage) {
                view = viewCopyViewImage;
                z = false;
                viewCopyViewImage = null;
            } else {
                viewCopyViewImage = null;
                view = null;
                z = true;
            }
            if (z) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof android.view.View) {
                        android.view.View view5 = (android.view.View) view3.getParent();
                        if (!getVisibilityChangeInfo(getTransitionValues(view5, true), getMatchedTransitionValues(view5, true)).mVisibilityChange) {
                            viewCopyViewImage = androidx.transition.TransitionUtils.copyViewImage(viewGroup, view3, view5);
                        } else {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.mCanRemoveViews) {
                            }
                        }
                    }
                    z2 = false;
                    android.view.View view6 = view;
                    view4 = viewCopyViewImage;
                    view2 = view6;
                }
                view2 = view;
                z2 = false;
                view4 = view3;
            } else {
                z2 = false;
                android.view.View view7 = view;
                view4 = viewCopyViewImage;
                view2 = view7;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            androidx.transition.ViewUtils.setTransitionVisibility(view2, 0);
            android.animation.Animator animatorOnDisappear = onDisappear(viewGroup, view2, transitionValues, transitionValues2);
            if (animatorOnDisappear != null) {
                androidx.transition.Visibility.DisappearListener disappearListener = new androidx.transition.Visibility.DisappearListener(view2, i2, true);
                animatorOnDisappear.addListener(disappearListener);
                androidx.transition.AnimatorUtils.addPauseListener(animatorOnDisappear, disappearListener);
                addListener(disappearListener);
            } else {
                androidx.transition.ViewUtils.setTransitionVisibility(view2, visibility);
            }
            return animatorOnDisappear;
        }
        if (!z2) {
            int[] iArr = (int[]) transitionValues.values.get(PROPNAME_SCREEN_LOCATION);
            int i3 = iArr[0];
            int i4 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i3 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i4 - iArr2[1]) - view4.getTop());
            androidx.transition.ViewGroupUtils.getOverlay(viewGroup).add(view4);
        }
        android.animation.Animator animatorOnDisappear2 = onDisappear(viewGroup, view4, transitionValues, transitionValues2);
        if (!z2) {
            if (animatorOnDisappear2 == null) {
                androidx.transition.ViewGroupUtils.getOverlay(viewGroup).remove(view4);
            } else {
                view3.setTag(androidx.transition.R.id.save_overlay_view, view4);
                addListener(new androidx.transition.TransitionListenerAdapter() { // from class: androidx.transition.Visibility.1
                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionPause(androidx.transition.Transition transition) {
                        androidx.transition.ViewGroupUtils.getOverlay(viewGroup).remove(view4);
                    }

                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionResume(androidx.transition.Transition transition) {
                        if (view4.getParent() == null) {
                            androidx.transition.ViewGroupUtils.getOverlay(viewGroup).add(view4);
                        } else {
                            androidx.transition.Visibility.this.cancel();
                        }
                    }

                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionEnd(androidx.transition.Transition transition) {
                        view3.setTag(androidx.transition.R.id.save_overlay_view, null);
                        androidx.transition.ViewGroupUtils.getOverlay(viewGroup).remove(view4);
                        transition.removeListener(this);
                    }
                });
            }
        }
        return animatorOnDisappear2;
    }

    @Override // androidx.transition.Transition
    public boolean isTransitionRequired(androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.values.containsKey(PROPNAME_VISIBILITY) != transitionValues.values.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        androidx.transition.Visibility.VisibilityInfo visibilityChangeInfo = getVisibilityChangeInfo(transitionValues, transitionValues2);
        if (visibilityChangeInfo.mVisibilityChange) {
            return visibilityChangeInfo.mStartVisibility == 0 || visibilityChangeInfo.mEndVisibility == 0;
        }
        return false;
    }

    private static class DisappearListener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener, androidx.transition.AnimatorUtils.AnimatorPauseListenerCompat {
        boolean mCanceled = false;
        private final int mFinalVisibility;
        private boolean mLayoutSuppressed;
        private final android.view.ViewGroup mParent;
        private final boolean mSuppressLayout;
        private final android.view.View mView;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition transition) {
        }

        DisappearListener(android.view.View view, int i, boolean z) {
            this.mView = view;
            this.mFinalVisibility = i;
            this.mParent = (android.view.ViewGroup) view.getParent();
            this.mSuppressLayout = z;
            suppressLayout(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.AnimatorUtils.AnimatorPauseListenerCompat
        public void onAnimationPause(android.animation.Animator animator) {
            if (this.mCanceled) {
                return;
            }
            androidx.transition.ViewUtils.setTransitionVisibility(this.mView, this.mFinalVisibility);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.AnimatorUtils.AnimatorPauseListenerCompat
        public void onAnimationResume(android.animation.Animator animator) {
            if (this.mCanceled) {
                return;
            }
            androidx.transition.ViewUtils.setTransitionVisibility(this.mView, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            this.mCanceled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            hideViewWhenNotCanceled();
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
            hideViewWhenNotCanceled();
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition transition) {
            suppressLayout(false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition transition) {
            suppressLayout(true);
        }

        private void hideViewWhenNotCanceled() {
            if (!this.mCanceled) {
                androidx.transition.ViewUtils.setTransitionVisibility(this.mView, this.mFinalVisibility);
                android.view.ViewGroup viewGroup = this.mParent;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            suppressLayout(false);
        }

        private void suppressLayout(boolean z) {
            android.view.ViewGroup viewGroup;
            if (!this.mSuppressLayout || this.mLayoutSuppressed == z || (viewGroup = this.mParent) == null) {
                return;
            }
            this.mLayoutSuppressed = z;
            androidx.transition.ViewGroupUtils.suppressLayout(viewGroup, z);
        }
    }
}
