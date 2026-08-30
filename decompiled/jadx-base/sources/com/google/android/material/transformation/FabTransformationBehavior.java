package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public abstract class FabTransformationBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {
    private float dependencyOriginalTranslationX;
    private float dependencyOriginalTranslationY;
    private final int[] tmpArray;
    private final android.graphics.Rect tmpRect;
    private final android.graphics.RectF tmpRectF1;
    private final android.graphics.RectF tmpRectF2;

    protected abstract com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec onCreateMotionSpec(android.content.Context context, boolean z);

    public FabTransformationBehavior() {
        this.tmpRect = new android.graphics.Rect();
        this.tmpRectF1 = new android.graphics.RectF();
        this.tmpRectF2 = new android.graphics.RectF();
        this.tmpArray = new int[2];
    }

    public FabTransformationBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tmpRect = new android.graphics.Rect();
        this.tmpRectF1 = new android.graphics.RectF();
        this.tmpRectF2 = new android.graphics.RectF();
        this.tmpArray = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        if (view.getVisibility() == 8) {
            throw new java.lang.IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((com.google.android.material.floatingactionbutton.FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected android.animation.AnimatorSet onCreateExpandedStateChangeAnimation(final android.view.View view, final android.view.View view2, final boolean z, boolean z2) {
        com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec fabTransformationSpecOnCreateMotionSpec = onCreateMotionSpec(view2.getContext(), z);
        if (z) {
            this.dependencyOriginalTranslationX = view.getTranslationX();
            this.dependencyOriginalTranslationY = view.getTranslationY();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        createElevationAnimation(view, view2, z, z2, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2);
        android.graphics.RectF rectF = this.tmpRectF1;
        createTranslationAnimation(view, view2, z, z2, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        createDependencyTranslationAnimation(view, view2, z, fabTransformationSpecOnCreateMotionSpec, arrayList);
        createIconFadeAnimation(view, view2, z, z2, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2);
        createExpansionAnimation(view, view2, z, z2, fabTransformationSpecOnCreateMotionSpec, fWidth, fHeight, arrayList, arrayList2);
        createColorAnimation(view, view2, z, z2, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2);
        createChildrenFadeAnimation(view, view2, z, z2, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        com.google.android.material.animation.AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (z) {
                    return;
                }
                view2.setVisibility(4);
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }
        });
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    private void createElevationAnimation(android.view.View view, android.view.View view2, boolean z, boolean z2, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec fabTransformationSpec, java.util.List<android.animation.Animator> list, java.util.List<android.animation.Animator.AnimatorListener> list2) {
        android.animation.ObjectAnimator objectAnimatorOfFloat;
        float elevation = androidx.core.view.ViewCompat.getElevation(view2) - androidx.core.view.ViewCompat.getElevation(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Z, -elevation);
        }
        fabTransformationSpec.timings.getTiming("elevation").apply(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    private void createDependencyTranslationAnimation(android.view.View view, android.view.View view2, boolean z, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec fabTransformationSpec, java.util.List<android.animation.Animator> list) {
        float fCalculateTranslationX = calculateTranslationX(view, view2, fabTransformationSpec.positioning);
        float fCalculateTranslationY = calculateTranslationY(view, view2, fabTransformationSpec.positioning);
        android.util.Pair<com.google.android.material.animation.MotionTiming, com.google.android.material.animation.MotionTiming> pairCalculateMotionTiming = calculateMotionTiming(fCalculateTranslationX, fCalculateTranslationY, z, fabTransformationSpec);
        com.google.android.material.animation.MotionTiming motionTiming = (com.google.android.material.animation.MotionTiming) pairCalculateMotionTiming.first;
        com.google.android.material.animation.MotionTiming motionTiming2 = (com.google.android.material.animation.MotionTiming) pairCalculateMotionTiming.second;
        android.util.Property property = android.view.View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            fCalculateTranslationX = this.dependencyOriginalTranslationX;
        }
        fArr[0] = fCalculateTranslationX;
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) property, fArr);
        android.util.Property property2 = android.view.View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            fCalculateTranslationY = this.dependencyOriginalTranslationY;
        }
        fArr2[0] = fCalculateTranslationY;
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) property2, fArr2);
        motionTiming.apply(objectAnimatorOfFloat);
        motionTiming2.apply(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private void createTranslationAnimation(android.view.View view, android.view.View view2, boolean z, boolean z2, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec fabTransformationSpec, java.util.List<android.animation.Animator> list, java.util.List<android.animation.Animator.AnimatorListener> list2, android.graphics.RectF rectF) {
        android.animation.ObjectAnimator objectAnimatorOfFloat;
        android.animation.ObjectAnimator objectAnimatorOfFloat2;
        float fCalculateTranslationX = calculateTranslationX(view, view2, fabTransformationSpec.positioning);
        float fCalculateTranslationY = calculateTranslationY(view, view2, fabTransformationSpec.positioning);
        android.util.Pair<com.google.android.material.animation.MotionTiming, com.google.android.material.animation.MotionTiming> pairCalculateMotionTiming = calculateMotionTiming(fCalculateTranslationX, fCalculateTranslationY, z, fabTransformationSpec);
        com.google.android.material.animation.MotionTiming motionTiming = (com.google.android.material.animation.MotionTiming) pairCalculateMotionTiming.first;
        com.google.android.material.animation.MotionTiming motionTiming2 = (com.google.android.material.animation.MotionTiming) pairCalculateMotionTiming.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fCalculateTranslationX);
                view2.setTranslationY(-fCalculateTranslationY);
            }
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f);
            calculateChildVisibleBoundsAtEndOfExpansion(view2, fabTransformationSpec, motionTiming, motionTiming2, -fCalculateTranslationX, -fCalculateTranslationY, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_X, -fCalculateTranslationX);
            objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, -fCalculateTranslationY);
        }
        motionTiming.apply(objectAnimatorOfFloat);
        motionTiming2.apply(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createIconFadeAnimation(android.view.View view, final android.view.View view2, boolean z, boolean z2, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec fabTransformationSpec, java.util.List<android.animation.Animator> list, java.util.List<android.animation.Animator.AnimatorListener> list2) {
        android.animation.ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof com.google.android.material.circularreveal.CircularRevealWidget) && (view instanceof android.widget.ImageView)) {
            final com.google.android.material.circularreveal.CircularRevealWidget circularRevealWidget = (com.google.android.material.circularreveal.CircularRevealWidget) view2;
            final android.graphics.drawable.Drawable drawable = ((android.widget.ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = android.animation.ObjectAnimator.ofInt(drawable, com.google.android.material.animation.DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 0);
            } else {
                objectAnimatorOfInt = android.animation.ObjectAnimator.ofInt(drawable, com.google.android.material.animation.DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transformation.FabTransformationBehavior.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    view2.invalidate();
                }
            });
            fabTransformationSpec.timings.getTiming("iconFade").apply(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator) {
                    circularRevealWidget.setCircularRevealOverlayDrawable(drawable);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    circularRevealWidget.setCircularRevealOverlayDrawable(null);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createExpansionAnimation(android.view.View view, android.view.View view2, boolean z, boolean z2, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec fabTransformationSpec, float f, float f2, java.util.List<android.animation.Animator> list, java.util.List<android.animation.Animator.AnimatorListener> list2) {
        android.animation.Animator animatorCreateCircularReveal;
        if (view2 instanceof com.google.android.material.circularreveal.CircularRevealWidget) {
            final com.google.android.material.circularreveal.CircularRevealWidget circularRevealWidget = (com.google.android.material.circularreveal.CircularRevealWidget) view2;
            float fCalculateRevealCenterX = calculateRevealCenterX(view, view2, fabTransformationSpec.positioning);
            float fCalculateRevealCenterY = calculateRevealCenterY(view, view2, fabTransformationSpec.positioning);
            ((com.google.android.material.floatingactionbutton.FloatingActionButton) view).getContentRect(this.tmpRect);
            float fWidth = this.tmpRect.width() / 2.0f;
            com.google.android.material.animation.MotionTiming timing = fabTransformationSpec.timings.getTiming("expansion");
            if (z) {
                if (!z2) {
                    circularRevealWidget.setRevealInfo(new com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo(fCalculateRevealCenterX, fCalculateRevealCenterY, fWidth));
                }
                if (z2) {
                    fWidth = circularRevealWidget.getRevealInfo().radius;
                }
                animatorCreateCircularReveal = com.google.android.material.circularreveal.CircularRevealCompat.createCircularReveal(circularRevealWidget, fCalculateRevealCenterX, fCalculateRevealCenterY, com.google.android.material.math.MathUtils.distanceToFurthestCorner(fCalculateRevealCenterX, fCalculateRevealCenterY, 0.0f, 0.0f, f, f2));
                animatorCreateCircularReveal.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget.getRevealInfo();
                        revealInfo.radius = Float.MAX_VALUE;
                        circularRevealWidget.setRevealInfo(revealInfo);
                    }
                });
                createPreFillRadialExpansion(view2, timing.getDelay(), (int) fCalculateRevealCenterX, (int) fCalculateRevealCenterY, fWidth, list);
            } else {
                float f3 = circularRevealWidget.getRevealInfo().radius;
                android.animation.Animator animatorCreateCircularReveal2 = com.google.android.material.circularreveal.CircularRevealCompat.createCircularReveal(circularRevealWidget, fCalculateRevealCenterX, fCalculateRevealCenterY, fWidth);
                int i = (int) fCalculateRevealCenterX;
                int i2 = (int) fCalculateRevealCenterY;
                createPreFillRadialExpansion(view2, timing.getDelay(), i, i2, f3, list);
                createPostFillRadialExpansion(view2, timing.getDelay(), timing.getDuration(), fabTransformationSpec.timings.getTotalDuration(), i, i2, fWidth, list);
                animatorCreateCircularReveal = animatorCreateCircularReveal2;
            }
            timing.apply(animatorCreateCircularReveal);
            list.add(animatorCreateCircularReveal);
            list2.add(com.google.android.material.circularreveal.CircularRevealCompat.createCircularRevealListener(circularRevealWidget));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createColorAnimation(android.view.View view, android.view.View view2, boolean z, boolean z2, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec fabTransformationSpec, java.util.List<android.animation.Animator> list, java.util.List<android.animation.Animator.AnimatorListener> list2) {
        android.animation.ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof com.google.android.material.circularreveal.CircularRevealWidget) {
            com.google.android.material.circularreveal.CircularRevealWidget circularRevealWidget = (com.google.android.material.circularreveal.CircularRevealWidget) view2;
            int backgroundTint = getBackgroundTint(view);
            int i = 16777215 & backgroundTint;
            if (z) {
                if (!z2) {
                    circularRevealWidget.setCircularRevealScrimColor(backgroundTint);
                }
                objectAnimatorOfInt = android.animation.ObjectAnimator.ofInt(circularRevealWidget, com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, i);
            } else {
                objectAnimatorOfInt = android.animation.ObjectAnimator.ofInt(circularRevealWidget, com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, backgroundTint);
            }
            objectAnimatorOfInt.setEvaluator(com.google.android.material.animation.ArgbEvaluatorCompat.getInstance());
            fabTransformationSpec.timings.getTiming("color").apply(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void createChildrenFadeAnimation(android.view.View view, android.view.View view2, boolean z, boolean z2, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec fabTransformationSpec, java.util.List<android.animation.Animator> list, java.util.List<android.animation.Animator.AnimatorListener> list2) {
        android.view.ViewGroup viewGroupCalculateChildContentContainer;
        android.animation.ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof android.view.ViewGroup) {
            if (((view2 instanceof com.google.android.material.circularreveal.CircularRevealWidget) && com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY == 0) || (viewGroupCalculateChildContentContainer = calculateChildContentContainer(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    com.google.android.material.animation.ChildrenAlphaProperty.CHILDREN_ALPHA.set(viewGroupCalculateChildContentContainer, java.lang.Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(viewGroupCalculateChildContentContainer, com.google.android.material.animation.ChildrenAlphaProperty.CHILDREN_ALPHA, 1.0f);
            } else {
                objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(viewGroupCalculateChildContentContainer, com.google.android.material.animation.ChildrenAlphaProperty.CHILDREN_ALPHA, 0.0f);
            }
            fabTransformationSpec.timings.getTiming("contentFade").apply(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    private android.util.Pair<com.google.android.material.animation.MotionTiming, com.google.android.material.animation.MotionTiming> calculateMotionTiming(float f, float f2, boolean z, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec fabTransformationSpec) {
        com.google.android.material.animation.MotionTiming timing;
        com.google.android.material.animation.MotionTiming timing2;
        if (f == 0.0f || f2 == 0.0f) {
            timing = fabTransformationSpec.timings.getTiming("translationXLinear");
            timing2 = fabTransformationSpec.timings.getTiming("translationYLinear");
        } else if ((z && f2 < 0.0f) || (!z && f2 > 0.0f)) {
            timing = fabTransformationSpec.timings.getTiming("translationXCurveUpwards");
            timing2 = fabTransformationSpec.timings.getTiming("translationYCurveUpwards");
        } else {
            timing = fabTransformationSpec.timings.getTiming("translationXCurveDownwards");
            timing2 = fabTransformationSpec.timings.getTiming("translationYCurveDownwards");
        }
        return new android.util.Pair<>(timing, timing2);
    }

    private float calculateTranslationX(android.view.View view, android.view.View view2, com.google.android.material.animation.Positioning positioning) {
        float fCenterX;
        float fCenterX2;
        float f;
        android.graphics.RectF rectF = this.tmpRectF1;
        android.graphics.RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        int i = positioning.gravity & 7;
        if (i == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i != 5) {
                f = 0.0f;
            } else {
                fCenterX = rectF2.right;
                fCenterX2 = rectF.right;
            }
            return f + positioning.xAdjustment;
        }
        f = fCenterX - fCenterX2;
        return f + positioning.xAdjustment;
    }

    private float calculateTranslationY(android.view.View view, android.view.View view2, com.google.android.material.animation.Positioning positioning) {
        float fCenterY;
        float fCenterY2;
        float f;
        android.graphics.RectF rectF = this.tmpRectF1;
        android.graphics.RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        int i = positioning.gravity & 112;
        if (i == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i != 80) {
                f = 0.0f;
            } else {
                fCenterY = rectF2.bottom;
                fCenterY2 = rectF.bottom;
            }
            return f + positioning.yAdjustment;
        }
        f = fCenterY - fCenterY2;
        return f + positioning.yAdjustment;
    }

    private void calculateWindowBounds(android.view.View view, android.graphics.RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.tmpArray;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void calculateDependencyWindowBounds(android.view.View view, android.graphics.RectF rectF) {
        calculateWindowBounds(view, rectF);
        rectF.offset(this.dependencyOriginalTranslationX, this.dependencyOriginalTranslationY);
    }

    private float calculateRevealCenterX(android.view.View view, android.view.View view2, com.google.android.material.animation.Positioning positioning) {
        android.graphics.RectF rectF = this.tmpRectF1;
        android.graphics.RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        rectF2.offset(-calculateTranslationX(view, view2, positioning), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float calculateRevealCenterY(android.view.View view, android.view.View view2, com.google.android.material.animation.Positioning positioning) {
        android.graphics.RectF rectF = this.tmpRectF1;
        android.graphics.RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        rectF2.offset(0.0f, -calculateTranslationY(view, view2, positioning));
        return rectF.centerY() - rectF2.top;
    }

    private void calculateChildVisibleBoundsAtEndOfExpansion(android.view.View view, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec fabTransformationSpec, com.google.android.material.animation.MotionTiming motionTiming, com.google.android.material.animation.MotionTiming motionTiming2, float f, float f2, float f3, float f4, android.graphics.RectF rectF) {
        float fCalculateValueOfAnimationAtEndOfExpansion = calculateValueOfAnimationAtEndOfExpansion(fabTransformationSpec, motionTiming, f, f3);
        float fCalculateValueOfAnimationAtEndOfExpansion2 = calculateValueOfAnimationAtEndOfExpansion(fabTransformationSpec, motionTiming2, f2, f4);
        android.graphics.Rect rect = this.tmpRect;
        view.getWindowVisibleDisplayFrame(rect);
        android.graphics.RectF rectF2 = this.tmpRectF1;
        rectF2.set(rect);
        android.graphics.RectF rectF3 = this.tmpRectF2;
        calculateWindowBounds(view, rectF3);
        rectF3.offset(fCalculateValueOfAnimationAtEndOfExpansion, fCalculateValueOfAnimationAtEndOfExpansion2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private float calculateValueOfAnimationAtEndOfExpansion(com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec fabTransformationSpec, com.google.android.material.animation.MotionTiming motionTiming, float f, float f2) {
        long delay = motionTiming.getDelay();
        long duration = motionTiming.getDuration();
        com.google.android.material.animation.MotionTiming timing = fabTransformationSpec.timings.getTiming("expansion");
        return com.google.android.material.animation.AnimationUtils.lerp(f, f2, motionTiming.getInterpolator().getInterpolation((((timing.getDelay() + timing.getDuration()) + 17) - delay) / duration));
    }

    private android.view.ViewGroup calculateChildContentContainer(android.view.View view) {
        android.view.View viewFindViewById = view.findViewById(com.google.android.material.R.id.mtrl_child_content_container);
        if (viewFindViewById != null) {
            return toViewGroupOrNull(viewFindViewById);
        }
        if ((view instanceof com.google.android.material.transformation.TransformationChildLayout) || (view instanceof com.google.android.material.transformation.TransformationChildCard)) {
            return toViewGroupOrNull(((android.view.ViewGroup) view).getChildAt(0));
        }
        return toViewGroupOrNull(view);
    }

    private android.view.ViewGroup toViewGroupOrNull(android.view.View view) {
        if (view instanceof android.view.ViewGroup) {
            return (android.view.ViewGroup) view;
        }
        return null;
    }

    private int getBackgroundTint(android.view.View view) {
        android.content.res.ColorStateList backgroundTintList = androidx.core.view.ViewCompat.getBackgroundTintList(view);
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    private void createPreFillRadialExpansion(android.view.View view, long j, int i, int i2, float f, java.util.List<android.animation.Animator> list) {
        if (j > 0) {
            android.animation.Animator animatorCreateCircularReveal = android.view.ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void createPostFillRadialExpansion(android.view.View view, long j, long j2, long j3, int i, int i2, float f, java.util.List<android.animation.Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            android.animation.Animator animatorCreateCircularReveal = android.view.ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            animatorCreateCircularReveal.setStartDelay(j4);
            animatorCreateCircularReveal.setDuration(j3 - j4);
            list.add(animatorCreateCircularReveal);
        }
    }

    protected static class FabTransformationSpec {
        public com.google.android.material.animation.Positioning positioning;
        public com.google.android.material.animation.MotionSpec timings;

        protected FabTransformationSpec() {
        }
    }
}
