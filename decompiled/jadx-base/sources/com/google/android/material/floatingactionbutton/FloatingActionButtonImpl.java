package com.google.android.material.floatingactionbutton;

/* JADX INFO: loaded from: classes5.dex */
class FloatingActionButtonImpl {
    static final int ANIM_STATE_HIDING = 1;
    static final int ANIM_STATE_NONE = 0;
    static final int ANIM_STATE_SHOWING = 2;
    static final long ELEVATION_ANIM_DELAY = 100;
    static final long ELEVATION_ANIM_DURATION = 100;
    private static final float HIDE_ICON_SCALE = 0.4f;
    private static final float HIDE_OPACITY = 0.0f;
    private static final float HIDE_SCALE = 0.4f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    private static final float SHOW_ICON_SCALE = 1.0f;
    private static final float SHOW_OPACITY = 1.0f;
    private static final float SHOW_SCALE = 1.0f;
    private static final float SPEC_HIDE_ICON_SCALE = 0.0f;
    private static final float SPEC_HIDE_SCALE = 0.0f;
    com.google.android.material.floatingactionbutton.BorderDrawable borderDrawable;
    android.graphics.drawable.Drawable contentBackground;
    private android.animation.Animator currentAnimator;
    float elevation;
    boolean ensureMinTouchTargetSize;
    private java.util.ArrayList<android.animation.Animator.AnimatorListener> hideListeners;
    private com.google.android.material.animation.MotionSpec hideMotionSpec;
    float hoveredFocusedTranslationZ;
    private int maxImageSize;
    int minTouchTargetSize;
    private android.view.ViewTreeObserver.OnPreDrawListener preDrawListener;
    float pressedTranslationZ;
    android.graphics.drawable.Drawable rippleDrawable;
    private float rotation;
    final com.google.android.material.shadow.ShadowViewDelegate shadowViewDelegate;
    com.google.android.material.shape.ShapeAppearanceModel shapeAppearance;
    com.google.android.material.shape.MaterialShapeDrawable shapeDrawable;
    private java.util.ArrayList<android.animation.Animator.AnimatorListener> showListeners;
    private com.google.android.material.animation.MotionSpec showMotionSpec;
    private final com.google.android.material.internal.StateListAnimator stateListAnimator;
    private java.util.ArrayList<com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback> transformationCallbacks;
    final com.google.android.material.floatingactionbutton.FloatingActionButton view;
    static final android.animation.TimeInterpolator ELEVATION_ANIM_INTERPOLATOR = com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
    private static final int SHOW_ANIM_DURATION_ATTR = com.google.android.material.R.attr.motionDurationLong2;
    private static final int SHOW_ANIM_EASING_ATTR = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator;
    private static final int HIDE_ANIM_DURATION_ATTR = com.google.android.material.R.attr.motionDurationMedium1;
    private static final int HIDE_ANIM_EASING_ATTR = com.google.android.material.R.attr.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] PRESSED_ENABLED_STATE_SET = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    static final int[] HOVERED_FOCUSED_ENABLED_STATE_SET = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] FOCUSED_ENABLED_STATE_SET = {android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] HOVERED_ENABLED_STATE_SET = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    static final int[] ENABLED_STATE_SET = {android.R.attr.state_enabled};
    static final int[] EMPTY_STATE_SET = new int[0];
    boolean shadowPaddingEnabled = true;
    private float imageMatrixScale = 1.0f;
    private int animState = 0;
    private final android.graphics.Rect tmpRect = new android.graphics.Rect();
    private final android.graphics.RectF tmpRectF1 = new android.graphics.RectF();
    private final android.graphics.RectF tmpRectF2 = new android.graphics.RectF();
    private final android.graphics.Matrix tmpMatrix = new android.graphics.Matrix();

    interface InternalTransformationCallback {
        void onScaleChanged();

        void onTranslationChanged();
    }

    interface InternalVisibilityChangedListener {
        void onHidden();

        void onShown();
    }

    void onCompatShadowChanged() {
    }

    boolean requirePreDrawListener() {
        return true;
    }

    boolean shouldAddPadding() {
        return true;
    }

    FloatingActionButtonImpl(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, com.google.android.material.shadow.ShadowViewDelegate shadowViewDelegate) {
        this.view = floatingActionButton;
        this.shadowViewDelegate = shadowViewDelegate;
        com.google.android.material.internal.StateListAnimator stateListAnimator = new com.google.android.material.internal.StateListAnimator();
        this.stateListAnimator = stateListAnimator;
        stateListAnimator.addState(PRESSED_ENABLED_STATE_SET, createElevationAnimator(new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ElevateToPressedTranslationZAnimation()));
        stateListAnimator.addState(HOVERED_FOCUSED_ENABLED_STATE_SET, createElevationAnimator(new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.addState(FOCUSED_ENABLED_STATE_SET, createElevationAnimator(new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.addState(HOVERED_ENABLED_STATE_SET, createElevationAnimator(new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.addState(ENABLED_STATE_SET, createElevationAnimator(new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ResetElevationAnimation()));
        stateListAnimator.addState(EMPTY_STATE_SET, createElevationAnimator(new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.DisabledElevationAnimation()));
        this.rotation = floatingActionButton.getRotation();
    }

    void initializeBackgroundDrawable(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, android.content.res.ColorStateList colorStateList2, int i) {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawableCreateShapeDrawable = createShapeDrawable();
        this.shapeDrawable = materialShapeDrawableCreateShapeDrawable;
        materialShapeDrawableCreateShapeDrawable.setTintList(colorStateList);
        if (mode != null) {
            this.shapeDrawable.setTintMode(mode);
        }
        this.shapeDrawable.setShadowColor(-12303292);
        this.shapeDrawable.initializeElevationOverlay(this.view.getContext());
        com.google.android.material.ripple.RippleDrawableCompat rippleDrawableCompat = new com.google.android.material.ripple.RippleDrawableCompat(this.shapeDrawable.getShapeAppearanceModel());
        rippleDrawableCompat.setTintList(com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(colorStateList2));
        this.rippleDrawable = rippleDrawableCompat;
        this.contentBackground = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{(android.graphics.drawable.Drawable) androidx.core.util.Preconditions.checkNotNull(this.shapeDrawable), rippleDrawableCompat});
    }

    void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.BorderDrawable borderDrawable = this.borderDrawable;
        if (borderDrawable != null) {
            borderDrawable.setBorderTint(colorStateList);
        }
    }

    void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    void setMinTouchTargetSize(int i) {
        this.minTouchTargetSize = i;
    }

    void setRippleColor(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        }
    }

    final void setElevation(float f) {
        if (this.elevation != f) {
            this.elevation = f;
            onElevationsChanged(f, this.hoveredFocusedTranslationZ, this.pressedTranslationZ);
        }
    }

    float getElevation() {
        return this.elevation;
    }

    float getHoveredFocusedTranslationZ() {
        return this.hoveredFocusedTranslationZ;
    }

    float getPressedTranslationZ() {
        return this.pressedTranslationZ;
    }

    final void setHoveredFocusedTranslationZ(float f) {
        if (this.hoveredFocusedTranslationZ != f) {
            this.hoveredFocusedTranslationZ = f;
            onElevationsChanged(this.elevation, f, this.pressedTranslationZ);
        }
    }

    final void setPressedTranslationZ(float f) {
        if (this.pressedTranslationZ != f) {
            this.pressedTranslationZ = f;
            onElevationsChanged(this.elevation, this.hoveredFocusedTranslationZ, f);
        }
    }

    final void setMaxImageSize(int i) {
        if (this.maxImageSize != i) {
            this.maxImageSize = i;
            updateImageMatrixScale();
        }
    }

    final void updateImageMatrixScale() {
        setImageMatrixScale(this.imageMatrixScale);
    }

    final void setImageMatrixScale(float f) {
        this.imageMatrixScale = f;
        android.graphics.Matrix matrix = this.tmpMatrix;
        calculateImageMatrixFromScale(f, matrix);
        this.view.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calculateImageMatrixFromScale(float f, android.graphics.Matrix matrix) {
        matrix.reset();
        android.graphics.drawable.Drawable drawable = this.view.getDrawable();
        if (drawable == null || this.maxImageSize == 0) {
            return;
        }
        android.graphics.RectF rectF = this.tmpRectF1;
        android.graphics.RectF rectF2 = this.tmpRectF2;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i = this.maxImageSize;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.CENTER);
        int i2 = this.maxImageSize;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    final void setShapeAppearance(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearance = shapeAppearanceModel;
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        java.lang.Object obj = this.rippleDrawable;
        if (obj instanceof com.google.android.material.shape.Shapeable) {
            ((com.google.android.material.shape.Shapeable) obj).setShapeAppearanceModel(shapeAppearanceModel);
        }
        com.google.android.material.floatingactionbutton.BorderDrawable borderDrawable = this.borderDrawable;
        if (borderDrawable != null) {
            borderDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    final com.google.android.material.shape.ShapeAppearanceModel getShapeAppearance() {
        return this.shapeAppearance;
    }

    final com.google.android.material.animation.MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    final void setShowMotionSpec(com.google.android.material.animation.MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    final com.google.android.material.animation.MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    final void setHideMotionSpec(com.google.android.material.animation.MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    final boolean shouldExpandBoundsForA11y() {
        return !this.ensureMinTouchTargetSize || this.view.getSizeDimension() >= this.minTouchTargetSize;
    }

    boolean getEnsureMinTouchTargetSize() {
        return this.ensureMinTouchTargetSize;
    }

    void setEnsureMinTouchTargetSize(boolean z) {
        this.ensureMinTouchTargetSize = z;
    }

    void setShadowPaddingEnabled(boolean z) {
        this.shadowPaddingEnabled = z;
        updatePadding();
    }

    void onElevationsChanged(float f, float f2, float f3) {
        updatePadding();
        updateShapeElevation(f);
    }

    void updateShapeElevation(float f) {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    void onDrawableStateChanged(int[] iArr) {
        this.stateListAnimator.setState(iArr);
    }

    void jumpDrawableToCurrentState() {
        this.stateListAnimator.jumpToCurrentState();
    }

    void addOnShowAnimationListener(android.animation.Animator.AnimatorListener animatorListener) {
        if (this.showListeners == null) {
            this.showListeners = new java.util.ArrayList<>();
        }
        this.showListeners.add(animatorListener);
    }

    void removeOnShowAnimationListener(android.animation.Animator.AnimatorListener animatorListener) {
        java.util.ArrayList<android.animation.Animator.AnimatorListener> arrayList = this.showListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void addOnHideAnimationListener(android.animation.Animator.AnimatorListener animatorListener) {
        if (this.hideListeners == null) {
            this.hideListeners = new java.util.ArrayList<>();
        }
        this.hideListeners.add(animatorListener);
    }

    public void removeOnHideAnimationListener(android.animation.Animator.AnimatorListener animatorListener) {
        java.util.ArrayList<android.animation.Animator.AnimatorListener> arrayList = this.hideListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void hide(final com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z) {
        android.animation.AnimatorSet animatorSetCreateDefaultAnimator;
        if (isOrWillBeHidden()) {
            return;
        }
        android.animation.Animator animator = this.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
        if (shouldAnimateVisibilityChange()) {
            com.google.android.material.animation.MotionSpec motionSpec = this.hideMotionSpec;
            if (motionSpec != null) {
                animatorSetCreateDefaultAnimator = createAnimator(motionSpec, 0.0f, 0.0f, 0.0f);
            } else {
                animatorSetCreateDefaultAnimator = createDefaultAnimator(0.0f, 0.4f, 0.4f, HIDE_ANIM_DURATION_ATTR, HIDE_ANIM_EASING_ATTR);
            }
            animatorSetCreateDefaultAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.1
                private boolean cancelled;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator2) {
                    com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.view.internalSetVisibility(0, z);
                    com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.animState = 1;
                    com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.currentAnimator = animator2;
                    this.cancelled = false;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(android.animation.Animator animator2) {
                    this.cancelled = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator2) {
                    com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.animState = 0;
                    com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.currentAnimator = null;
                    if (this.cancelled) {
                        return;
                    }
                    com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.view;
                    boolean z2 = z;
                    floatingActionButton.internalSetVisibility(z2 ? 8 : 4, z2);
                    com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener internalVisibilityChangedListener2 = internalVisibilityChangedListener;
                    if (internalVisibilityChangedListener2 != null) {
                        internalVisibilityChangedListener2.onHidden();
                    }
                }
            });
            java.util.ArrayList<android.animation.Animator.AnimatorListener> arrayList = this.hideListeners;
            if (arrayList != null) {
                java.util.Iterator<android.animation.Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    animatorSetCreateDefaultAnimator.addListener(it.next());
                }
            }
            animatorSetCreateDefaultAnimator.start();
            return;
        }
        this.view.internalSetVisibility(z ? 8 : 4, z);
        if (internalVisibilityChangedListener != null) {
            internalVisibilityChangedListener.onHidden();
        }
    }

    void show(final com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z) {
        android.animation.AnimatorSet animatorSetCreateDefaultAnimator;
        if (isOrWillBeShown()) {
            return;
        }
        android.animation.Animator animator = this.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = this.showMotionSpec == null;
        if (shouldAnimateVisibilityChange()) {
            if (this.view.getVisibility() != 0) {
                this.view.setAlpha(0.0f);
                this.view.setScaleY(z2 ? 0.4f : 0.0f);
                this.view.setScaleX(z2 ? 0.4f : 0.0f);
                setImageMatrixScale(z2 ? 0.4f : 0.0f);
            }
            com.google.android.material.animation.MotionSpec motionSpec = this.showMotionSpec;
            if (motionSpec != null) {
                animatorSetCreateDefaultAnimator = createAnimator(motionSpec, 1.0f, 1.0f, 1.0f);
            } else {
                animatorSetCreateDefaultAnimator = createDefaultAnimator(1.0f, 1.0f, 1.0f, SHOW_ANIM_DURATION_ATTR, SHOW_ANIM_EASING_ATTR);
            }
            animatorSetCreateDefaultAnimator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator2) {
                    com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.view.internalSetVisibility(0, z);
                    com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.animState = 2;
                    com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.currentAnimator = animator2;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator2) {
                    com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.animState = 0;
                    com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.currentAnimator = null;
                    com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener internalVisibilityChangedListener2 = internalVisibilityChangedListener;
                    if (internalVisibilityChangedListener2 != null) {
                        internalVisibilityChangedListener2.onShown();
                    }
                }
            });
            java.util.ArrayList<android.animation.Animator.AnimatorListener> arrayList = this.showListeners;
            if (arrayList != null) {
                java.util.Iterator<android.animation.Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    animatorSetCreateDefaultAnimator.addListener(it.next());
                }
            }
            animatorSetCreateDefaultAnimator.start();
            return;
        }
        this.view.internalSetVisibility(0, z);
        this.view.setAlpha(1.0f);
        this.view.setScaleY(1.0f);
        this.view.setScaleX(1.0f);
        setImageMatrixScale(1.0f);
        if (internalVisibilityChangedListener != null) {
            internalVisibilityChangedListener.onShown();
        }
    }

    private android.animation.AnimatorSet createAnimator(com.google.android.material.animation.MotionSpec motionSpec, float f, float f2, float f3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.view, (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) android.view.View.ALPHA, f);
        motionSpec.getTiming("opacity").apply(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this.view, (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) android.view.View.SCALE_X, f2);
        motionSpec.getTiming("scale").apply(objectAnimatorOfFloat2);
        workAroundOreoBug(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(this.view, (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) android.view.View.SCALE_Y, f2);
        motionSpec.getTiming("scale").apply(objectAnimatorOfFloat3);
        workAroundOreoBug(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        calculateImageMatrixFromScale(f3, this.tmpMatrix);
        android.animation.ObjectAnimator objectAnimatorOfObject = android.animation.ObjectAnimator.ofObject(this.view, new com.google.android.material.animation.ImageMatrixProperty(), new com.google.android.material.animation.MatrixEvaluator() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
            public android.graphics.Matrix evaluate(float f4, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.imageMatrixScale = f4;
                return super.evaluate(f4, matrix, matrix2);
            }
        }, new android.graphics.Matrix(this.tmpMatrix));
        motionSpec.getTiming("iconScale").apply(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        com.google.android.material.animation.AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private android.animation.AnimatorSet createDefaultAnimator(final float f, final float f2, final float f3, int i, int i2) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.view.getAlpha();
        final float scaleX = this.view.getScaleX();
        final float scaleY = this.view.getScaleY();
        final float f4 = this.imageMatrixScale;
        final android.graphics.Matrix matrix = new android.graphics.Matrix(this.tmpMatrix);
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.view.setAlpha(com.google.android.material.animation.AnimationUtils.lerp(alpha, f, 0.0f, 0.2f, fFloatValue));
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.view.setScaleX(com.google.android.material.animation.AnimationUtils.lerp(scaleX, f2, fFloatValue));
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.view.setScaleY(com.google.android.material.animation.AnimationUtils.lerp(scaleY, f2, fFloatValue));
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.imageMatrixScale = com.google.android.material.animation.AnimationUtils.lerp(f4, f3, fFloatValue);
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.calculateImageMatrixFromScale(com.google.android.material.animation.AnimationUtils.lerp(f4, f3, fFloatValue), matrix);
                com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.view.setImageMatrix(matrix);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        com.google.android.material.animation.AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.setDuration(com.google.android.material.motion.MotionUtils.resolveThemeDuration(this.view.getContext(), i, this.view.getContext().getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(this.view.getContext(), i2, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private void workAroundOreoBug(android.animation.ObjectAnimator objectAnimator) {
        if (android.os.Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new android.animation.TypeEvaluator<java.lang.Float>() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.5
            android.animation.FloatEvaluator floatEvaluator = new android.animation.FloatEvaluator();

            @Override // android.animation.TypeEvaluator
            public java.lang.Float evaluate(float f, java.lang.Float f2, java.lang.Float f3) {
                float fFloatValue = this.floatEvaluator.evaluate(f, (java.lang.Number) f2, (java.lang.Number) f3).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return java.lang.Float.valueOf(fFloatValue);
            }
        });
    }

    void addTransformationCallback(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback internalTransformationCallback) {
        if (this.transformationCallbacks == null) {
            this.transformationCallbacks = new java.util.ArrayList<>();
        }
        this.transformationCallbacks.add(internalTransformationCallback);
    }

    void removeTransformationCallback(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback internalTransformationCallback) {
        java.util.ArrayList<com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(internalTransformationCallback);
    }

    void onTranslationChanged() {
        java.util.ArrayList<com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList != null) {
            java.util.Iterator<com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTranslationChanged();
            }
        }
    }

    void onScaleChanged() {
        java.util.ArrayList<com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList != null) {
            java.util.Iterator<com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onScaleChanged();
            }
        }
    }

    final android.graphics.drawable.Drawable getContentBackground() {
        return this.contentBackground;
    }

    final void updatePadding() {
        android.graphics.Rect rect = this.tmpRect;
        getPadding(rect);
        onPaddingUpdated(rect);
        this.shadowViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    void getPadding(android.graphics.Rect rect) {
        int sizeDimension = this.ensureMinTouchTargetSize ? (this.minTouchTargetSize - this.view.getSizeDimension()) / 2 : 0;
        float elevation = this.shadowPaddingEnabled ? getElevation() + this.pressedTranslationZ : 0.0f;
        int iMax = java.lang.Math.max(sizeDimension, (int) java.lang.Math.ceil(elevation));
        int iMax2 = java.lang.Math.max(sizeDimension, (int) java.lang.Math.ceil(elevation * SHADOW_MULTIPLIER));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    void onPaddingUpdated(android.graphics.Rect rect) {
        androidx.core.util.Preconditions.checkNotNull(this.contentBackground, "Didn't initialize content background");
        if (shouldAddPadding()) {
            this.shadowViewDelegate.setBackgroundDrawable(new android.graphics.drawable.InsetDrawable(this.contentBackground, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.shadowViewDelegate.setBackgroundDrawable(this.contentBackground);
        }
    }

    void onAttachedToWindow() {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(this.view, materialShapeDrawable);
        }
        if (requirePreDrawListener()) {
            this.view.getViewTreeObserver().addOnPreDrawListener(getOrCreatePreDrawListener());
        }
    }

    void onDetachedFromWindow() {
        android.view.ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
        android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.preDrawListener;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.preDrawListener = null;
        }
    }

    void onPreDraw() {
        float rotation = this.view.getRotation();
        if (this.rotation != rotation) {
            this.rotation = rotation;
            updateFromViewRotation();
        }
    }

    private android.view.ViewTreeObserver.OnPreDrawListener getOrCreatePreDrawListener() {
        if (this.preDrawListener == null) {
            this.preDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.6
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.onPreDraw();
                    return true;
                }
            };
        }
        return this.preDrawListener;
    }

    com.google.android.material.shape.MaterialShapeDrawable createShapeDrawable() {
        return new com.google.android.material.shape.MaterialShapeDrawable((com.google.android.material.shape.ShapeAppearanceModel) androidx.core.util.Preconditions.checkNotNull(this.shapeAppearance));
    }

    boolean isOrWillBeShown() {
        if (this.view.getVisibility() != 0) {
            return this.animState == 2;
        }
        return this.animState != 1;
    }

    boolean isOrWillBeHidden() {
        if (this.view.getVisibility() == 0) {
            return this.animState == 1;
        }
        return this.animState != 2;
    }

    private android.animation.ValueAnimator createElevationAnimator(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl shadowAnimatorImpl) {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setInterpolator(ELEVATION_ANIM_INTERPOLATOR);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(shadowAnimatorImpl);
        valueAnimator.addUpdateListener(shadowAnimatorImpl);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private abstract class ShadowAnimatorImpl extends android.animation.AnimatorListenerAdapter implements android.animation.ValueAnimator.AnimatorUpdateListener {
        private float shadowSizeEnd;
        private float shadowSizeStart;
        private boolean validValues;

        protected abstract float getTargetShadowSize();

        private ShadowAnimatorImpl() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            if (!this.validValues) {
                this.shadowSizeStart = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.shapeDrawable == null ? 0.0f : com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.shapeDrawable.getElevation();
                this.shadowSizeEnd = getTargetShadowSize();
                this.validValues = true;
            }
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl floatingActionButtonImpl = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this;
            float f = this.shadowSizeStart;
            floatingActionButtonImpl.updateShapeElevation((int) (f + ((this.shadowSizeEnd - f) * valueAnimator.getAnimatedFraction())));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.updateShapeElevation((int) this.shadowSizeEnd);
            this.validValues = false;
        }
    }

    private class ResetElevationAnimation extends com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl {
        ResetElevationAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
            return com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.elevation;
        }
    }

    private class ElevateToHoveredFocusedTranslationZAnimation extends com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl {
        ElevateToHoveredFocusedTranslationZAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
            return com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.elevation + com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.hoveredFocusedTranslationZ;
        }
    }

    private class ElevateToPressedTranslationZAnimation extends com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl {
        ElevateToPressedTranslationZAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
            return com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.elevation + com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.this.pressedTranslationZ;
        }
    }

    private class DisabledElevationAnimation extends com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
            return 0.0f;
        }

        DisabledElevationAnimation() {
            super();
        }
    }

    private boolean shouldAnimateVisibilityChange() {
        return androidx.core.view.ViewCompat.isLaidOut(this.view) && !this.view.isInEditMode();
    }

    void updateFromViewRotation() {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShadowCompatRotation((int) this.rotation);
        }
    }
}
