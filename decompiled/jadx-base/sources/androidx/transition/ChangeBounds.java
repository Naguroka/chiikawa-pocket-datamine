package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public class ChangeBounds extends androidx.transition.Transition {
    private static final android.util.Property<android.view.View, android.graphics.PointF> BOTTOM_RIGHT_ONLY_PROPERTY;
    private static final android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF> BOTTOM_RIGHT_PROPERTY;
    private static final android.util.Property<android.view.View, android.graphics.PointF> TOP_LEFT_ONLY_PROPERTY;
    private static final android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF> TOP_LEFT_PROPERTY;
    private boolean mReparent;
    private boolean mResizeClip;
    private int[] mTempLocation;
    private static final java.lang.String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final java.lang.String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final java.lang.String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final java.lang.String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final java.lang.String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final java.lang.String[] sTransitionProperties = {PROPNAME_BOUNDS, PROPNAME_CLIP, PROPNAME_PARENT, PROPNAME_WINDOW_X, PROPNAME_WINDOW_Y};
    private static final android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> DRAWABLE_ORIGIN_PROPERTY = new android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF>(android.graphics.PointF.class, "boundsOrigin") { // from class: androidx.transition.ChangeBounds.1
        private android.graphics.Rect mBounds = new android.graphics.Rect();

        @Override // android.util.Property
        public void set(android.graphics.drawable.Drawable drawable, android.graphics.PointF pointF) {
            drawable.copyBounds(this.mBounds);
            this.mBounds.offsetTo(java.lang.Math.round(pointF.x), java.lang.Math.round(pointF.y));
            drawable.setBounds(this.mBounds);
        }

        @Override // android.util.Property
        public android.graphics.PointF get(android.graphics.drawable.Drawable drawable) {
            drawable.copyBounds(this.mBounds);
            return new android.graphics.PointF(this.mBounds.left, this.mBounds.top);
        }
    };
    private static final android.util.Property<android.view.View, android.graphics.PointF> POSITION_PROPERTY = new android.util.Property<android.view.View, android.graphics.PointF>(android.graphics.PointF.class, com.ironsource.y8.h.L) { // from class: androidx.transition.ChangeBounds.6
        @Override // android.util.Property
        public android.graphics.PointF get(android.view.View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(android.view.View view, android.graphics.PointF pointF) {
            int iRound = java.lang.Math.round(pointF.x);
            int iRound2 = java.lang.Math.round(pointF.y);
            androidx.transition.ViewUtils.setLeftTopRightBottom(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    };
    private static androidx.transition.RectEvaluator sRectEvaluator = new androidx.transition.RectEvaluator();

    static {
        java.lang.String str = "topLeft";
        TOP_LEFT_PROPERTY = new android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF>(android.graphics.PointF.class, str) { // from class: androidx.transition.ChangeBounds.2
            @Override // android.util.Property
            public android.graphics.PointF get(androidx.transition.ChangeBounds.ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public void set(androidx.transition.ChangeBounds.ViewBounds viewBounds, android.graphics.PointF pointF) {
                viewBounds.setTopLeft(pointF);
            }
        };
        java.lang.String str2 = "bottomRight";
        BOTTOM_RIGHT_PROPERTY = new android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF>(android.graphics.PointF.class, str2) { // from class: androidx.transition.ChangeBounds.3
            @Override // android.util.Property
            public android.graphics.PointF get(androidx.transition.ChangeBounds.ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public void set(androidx.transition.ChangeBounds.ViewBounds viewBounds, android.graphics.PointF pointF) {
                viewBounds.setBottomRight(pointF);
            }
        };
        BOTTOM_RIGHT_ONLY_PROPERTY = new android.util.Property<android.view.View, android.graphics.PointF>(android.graphics.PointF.class, str2) { // from class: androidx.transition.ChangeBounds.4
            @Override // android.util.Property
            public android.graphics.PointF get(android.view.View view) {
                return null;
            }

            @Override // android.util.Property
            public void set(android.view.View view, android.graphics.PointF pointF) {
                androidx.transition.ViewUtils.setLeftTopRightBottom(view, view.getLeft(), view.getTop(), java.lang.Math.round(pointF.x), java.lang.Math.round(pointF.y));
            }
        };
        TOP_LEFT_ONLY_PROPERTY = new android.util.Property<android.view.View, android.graphics.PointF>(android.graphics.PointF.class, str) { // from class: androidx.transition.ChangeBounds.5
            @Override // android.util.Property
            public android.graphics.PointF get(android.view.View view) {
                return null;
            }

            @Override // android.util.Property
            public void set(android.view.View view, android.graphics.PointF pointF) {
                androidx.transition.ViewUtils.setLeftTopRightBottom(view, java.lang.Math.round(pointF.x), java.lang.Math.round(pointF.y), view.getRight(), view.getBottom());
            }
        };
    }

    public ChangeBounds() {
        this.mTempLocation = new int[2];
        this.mResizeClip = false;
        this.mReparent = false;
    }

    public ChangeBounds(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTempLocation = new int[2];
        this.mResizeClip = false;
        this.mReparent = false;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.CHANGE_BOUNDS);
        boolean namedBoolean = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(typedArrayObtainStyledAttributes, (android.content.res.XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        setResizeClip(namedBoolean);
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    public void setResizeClip(boolean z) {
        this.mResizeClip = z;
    }

    public boolean getResizeClip() {
        return this.mResizeClip;
    }

    private void captureValues(androidx.transition.TransitionValues transitionValues) {
        android.view.View view = transitionValues.view;
        if (!androidx.core.view.ViewCompat.isLaidOut(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        transitionValues.values.put(PROPNAME_BOUNDS, new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        transitionValues.values.put(PROPNAME_PARENT, transitionValues.view.getParent());
        if (this.mReparent) {
            transitionValues.view.getLocationInWindow(this.mTempLocation);
            transitionValues.values.put(PROPNAME_WINDOW_X, java.lang.Integer.valueOf(this.mTempLocation[0]));
            transitionValues.values.put(PROPNAME_WINDOW_Y, java.lang.Integer.valueOf(this.mTempLocation[1]));
        }
        if (this.mResizeClip) {
            transitionValues.values.put(PROPNAME_CLIP, androidx.core.view.ViewCompat.getClipBounds(view));
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    private boolean parentMatches(android.view.View view, android.view.View view2) {
        if (!this.mReparent) {
            return true;
        }
        androidx.transition.TransitionValues matchedTransitionValues = getMatchedTransitionValues(view, true);
        if (matchedTransitionValues == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == matchedTransitionValues.view) {
            return true;
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(final android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        int i;
        final android.view.View view;
        android.animation.ObjectAnimator objectAnimatorOfPointF;
        int i2;
        android.graphics.Rect rect;
        android.animation.ObjectAnimator objectAnimator;
        android.animation.Animator animatorMergeAnimators;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        java.util.Map<java.lang.String, java.lang.Object> map = transitionValues.values;
        java.util.Map<java.lang.String, java.lang.Object> map2 = transitionValues2.values;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) map.get(PROPNAME_PARENT);
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) map2.get(PROPNAME_PARENT);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        final android.view.View view2 = transitionValues2.view;
        if (parentMatches(viewGroup2, viewGroup3)) {
            android.graphics.Rect rect2 = (android.graphics.Rect) transitionValues.values.get(PROPNAME_BOUNDS);
            android.graphics.Rect rect3 = (android.graphics.Rect) transitionValues2.values.get(PROPNAME_BOUNDS);
            int i3 = rect2.left;
            final int i4 = rect3.left;
            int i5 = rect2.top;
            final int i6 = rect3.top;
            int i7 = rect2.right;
            final int i8 = rect3.right;
            int i9 = rect2.bottom;
            final int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            android.graphics.Rect rect4 = (android.graphics.Rect) transitionValues.values.get(PROPNAME_CLIP);
            final android.graphics.Rect rect5 = (android.graphics.Rect) transitionValues2.values.get(PROPNAME_CLIP);
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (i7 != i8 || i9 != i10) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            if (!this.mResizeClip) {
                androidx.transition.ViewUtils.setLeftTopRightBottom(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        animatorMergeAnimators = androidx.transition.ObjectAnimatorUtils.ofPointF(view, POSITION_PROPERTY, getPathMotion().getPath(i3, i5, i4, i6));
                    } else {
                        androidx.transition.ChangeBounds.ViewBounds viewBounds = new androidx.transition.ChangeBounds.ViewBounds(view);
                        android.animation.ObjectAnimator objectAnimatorOfPointF2 = androidx.transition.ObjectAnimatorUtils.ofPointF(viewBounds, TOP_LEFT_PROPERTY, getPathMotion().getPath(i3, i5, i4, i6));
                        android.animation.ObjectAnimator objectAnimatorOfPointF3 = androidx.transition.ObjectAnimatorUtils.ofPointF(viewBounds, BOTTOM_RIGHT_PROPERTY, getPathMotion().getPath(i7, i9, i8, i10));
                        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                        animatorSet.playTogether(objectAnimatorOfPointF2, objectAnimatorOfPointF3);
                        animatorSet.addListener(new android.animation.AnimatorListenerAdapter(viewBounds) { // from class: androidx.transition.ChangeBounds.7
                            private androidx.transition.ChangeBounds.ViewBounds mViewBounds;
                            final /* synthetic */ androidx.transition.ChangeBounds.ViewBounds val$viewBounds;

                            {
                                this.val$viewBounds = viewBounds;
                                this.mViewBounds = viewBounds;
                            }
                        });
                        animatorMergeAnimators = animatorSet;
                    }
                } else if (i3 != i4 || i5 != i6) {
                    animatorMergeAnimators = androidx.transition.ObjectAnimatorUtils.ofPointF(view, TOP_LEFT_ONLY_PROPERTY, getPathMotion().getPath(i3, i5, i4, i6));
                } else {
                    animatorMergeAnimators = androidx.transition.ObjectAnimatorUtils.ofPointF(view, BOTTOM_RIGHT_ONLY_PROPERTY, getPathMotion().getPath(i7, i9, i8, i10));
                }
            } else {
                androidx.transition.ViewUtils.setLeftTopRightBottom(view, i3, i5, java.lang.Math.max(i11, i13) + i3, java.lang.Math.max(i12, i14) + i5);
                if (i3 == i4 && i5 == i6) {
                    objectAnimatorOfPointF = null;
                } else {
                    view = view2;
                    objectAnimatorOfPointF = androidx.transition.ObjectAnimatorUtils.ofPointF(view, POSITION_PROPERTY, getPathMotion().getPath(i3, i5, i4, i6));
                }
                if (rect4 == null) {
                    i2 = 0;
                    rect = new android.graphics.Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect4;
                }
                android.graphics.Rect rect6 = rect5 == null ? new android.graphics.Rect(i2, i2, i13, i14) : rect5;
                if (rect.equals(rect6)) {
                    objectAnimator = null;
                } else {
                    androidx.core.view.ViewCompat.setClipBounds(view, rect);
                    androidx.transition.RectEvaluator rectEvaluator = sRectEvaluator;
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect6;
                    android.animation.ObjectAnimator objectAnimatorOfObject = android.animation.ObjectAnimator.ofObject(view, "clipBounds", rectEvaluator, objArr);
                    objectAnimatorOfObject.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.transition.ChangeBounds.8
                        private boolean mIsCanceled;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(android.animation.Animator animator) {
                            this.mIsCanceled = true;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(android.animation.Animator animator) {
                            if (this.mIsCanceled) {
                                return;
                            }
                            androidx.core.view.ViewCompat.setClipBounds(view, rect5);
                            androidx.transition.ViewUtils.setLeftTopRightBottom(view, i4, i6, i8, i10);
                        }
                    });
                    objectAnimator = objectAnimatorOfObject;
                }
                animatorMergeAnimators = androidx.transition.TransitionUtils.mergeAnimators(objectAnimatorOfPointF, objectAnimator);
            }
            if (view.getParent() instanceof android.view.ViewGroup) {
                final android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) view.getParent();
                androidx.transition.ViewGroupUtils.suppressLayout(viewGroup4, true);
                addListener(new androidx.transition.TransitionListenerAdapter() { // from class: androidx.transition.ChangeBounds.9
                    boolean mCanceled = false;

                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionCancel(androidx.transition.Transition transition) {
                        androidx.transition.ViewGroupUtils.suppressLayout(viewGroup4, false);
                        this.mCanceled = true;
                    }

                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionEnd(androidx.transition.Transition transition) {
                        if (!this.mCanceled) {
                            androidx.transition.ViewGroupUtils.suppressLayout(viewGroup4, false);
                        }
                        transition.removeListener(this);
                    }

                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionPause(androidx.transition.Transition transition) {
                        androidx.transition.ViewGroupUtils.suppressLayout(viewGroup4, false);
                    }

                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionResume(androidx.transition.Transition transition) {
                        androidx.transition.ViewGroupUtils.suppressLayout(viewGroup4, true);
                    }
                });
            }
            return animatorMergeAnimators;
        }
        int iIntValue = ((java.lang.Integer) transitionValues.values.get(PROPNAME_WINDOW_X)).intValue();
        int iIntValue2 = ((java.lang.Integer) transitionValues.values.get(PROPNAME_WINDOW_Y)).intValue();
        int iIntValue3 = ((java.lang.Integer) transitionValues2.values.get(PROPNAME_WINDOW_X)).intValue();
        int iIntValue4 = ((java.lang.Integer) transitionValues2.values.get(PROPNAME_WINDOW_Y)).intValue();
        if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.mTempLocation);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        view2.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        final android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap);
        final float transitionAlpha = androidx.transition.ViewUtils.getTransitionAlpha(view2);
        androidx.transition.ViewUtils.setTransitionAlpha(view2, 0.0f);
        androidx.transition.ViewUtils.getOverlay(viewGroup).add(bitmapDrawable);
        androidx.transition.PathMotion pathMotion = getPathMotion();
        int[] iArr = this.mTempLocation;
        int i15 = iArr[0];
        int i16 = iArr[1];
        android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, androidx.transition.PropertyValuesHolderUtils.ofPointF(DRAWABLE_ORIGIN_PROPERTY, pathMotion.getPath(iIntValue - i15, iIntValue2 - i16, iIntValue3 - i15, iIntValue4 - i16)));
        objectAnimatorOfPropertyValuesHolder.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.transition.ChangeBounds.10
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.transition.ViewUtils.getOverlay(viewGroup).remove(bitmapDrawable);
                androidx.transition.ViewUtils.setTransitionAlpha(view2, transitionAlpha);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private android.view.View mView;

        ViewBounds(android.view.View view) {
            this.mView = view;
        }

        void setTopLeft(android.graphics.PointF pointF) {
            this.mLeft = java.lang.Math.round(pointF.x);
            this.mTop = java.lang.Math.round(pointF.y);
            int i = this.mTopLeftCalls + 1;
            this.mTopLeftCalls = i;
            if (i == this.mBottomRightCalls) {
                setLeftTopRightBottom();
            }
        }

        void setBottomRight(android.graphics.PointF pointF) {
            this.mRight = java.lang.Math.round(pointF.x);
            this.mBottom = java.lang.Math.round(pointF.y);
            int i = this.mBottomRightCalls + 1;
            this.mBottomRightCalls = i;
            if (this.mTopLeftCalls == i) {
                setLeftTopRightBottom();
            }
        }

        private void setLeftTopRightBottom() {
            androidx.transition.ViewUtils.setLeftTopRightBottom(this.mView, this.mLeft, this.mTop, this.mRight, this.mBottom);
            this.mTopLeftCalls = 0;
            this.mBottomRightCalls = 0;
        }
    }
}
