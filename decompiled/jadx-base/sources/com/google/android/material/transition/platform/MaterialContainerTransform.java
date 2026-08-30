package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes5.dex */
public final class MaterialContainerTransform extends android.transition.Transition {
    private static final com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS;
    private static final com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS_ARC;
    private static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    private static final java.lang.String TAG = "MaterialContainerTransform";
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    private boolean appliedThemeValues;
    private int containerColor;
    private boolean drawDebugEnabled;
    private int drawingViewId;
    private boolean elevationShadowEnabled;
    private int endContainerColor;
    private float endElevation;
    private com.google.android.material.shape.ShapeAppearanceModel endShapeAppearanceModel;
    private android.view.View endView;
    private int endViewId;
    private int fadeMode;
    private com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds fadeProgressThresholds;
    private int fitMode;
    private boolean holdAtEndEnabled;
    private boolean pathMotionCustom;
    private com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds scaleMaskProgressThresholds;
    private com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds scaleProgressThresholds;
    private int scrimColor;
    private com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds shapeMaskProgressThresholds;
    private int startContainerColor;
    private float startElevation;
    private com.google.android.material.shape.ShapeAppearanceModel startShapeAppearanceModel;
    private android.view.View startView;
    private int startViewId;
    private int transitionDirection;
    private static final java.lang.String PROP_BOUNDS = "materialContainerTransition:bounds";
    private static final java.lang.String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    private static final java.lang.String[] TRANSITION_PROPS = {PROP_BOUNDS, PROP_SHAPE_APPEARANCE};
    private static final com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS = new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup(new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.0f, 0.25f), new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.0f, 1.0f), new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.0f, 1.0f), new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.0f, 0.75f));
    private static final com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS_ARC = new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup(new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.1f, 0.4f), new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.1f, 1.0f), new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.1f, 1.0f), new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.1f, 0.9f));

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FadeMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FitMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    static {
        DEFAULT_RETURN_THRESHOLDS = new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup(new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.6f, 0.9f), new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.0f, 1.0f), new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.0f, 0.9f), new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.3f, 0.9f));
        DEFAULT_RETURN_THRESHOLDS_ARC = new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup(new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.6f, 0.9f), new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.0f, 0.9f), new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.0f, 0.9f), new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds(0.2f, 0.9f));
    }

    public MaterialContainerTransform() {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = android.R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = android.os.Build.VERSION.SDK_INT >= 28;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
    }

    public MaterialContainerTransform(android.content.Context context, boolean z) {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = android.R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = android.os.Build.VERSION.SDK_INT >= 28;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
        maybeApplyThemeValues(context, z);
        this.appliedThemeValues = true;
    }

    public int getStartViewId() {
        return this.startViewId;
    }

    public void setStartViewId(int i) {
        this.startViewId = i;
    }

    public int getEndViewId() {
        return this.endViewId;
    }

    public void setEndViewId(int i) {
        this.endViewId = i;
    }

    public android.view.View getStartView() {
        return this.startView;
    }

    public void setStartView(android.view.View view) {
        this.startView = view;
    }

    public android.view.View getEndView() {
        return this.endView;
    }

    public void setEndView(android.view.View view) {
        this.endView = view;
    }

    public com.google.android.material.shape.ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.startShapeAppearanceModel;
    }

    public void setStartShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this.startShapeAppearanceModel = shapeAppearanceModel;
    }

    public com.google.android.material.shape.ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.endShapeAppearanceModel;
    }

    public void setEndShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this.endShapeAppearanceModel = shapeAppearanceModel;
    }

    public boolean isElevationShadowEnabled() {
        return this.elevationShadowEnabled;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.elevationShadowEnabled = z;
    }

    public float getStartElevation() {
        return this.startElevation;
    }

    public void setStartElevation(float f) {
        this.startElevation = f;
    }

    public float getEndElevation() {
        return this.endElevation;
    }

    public void setEndElevation(float f) {
        this.endElevation = f;
    }

    public int getDrawingViewId() {
        return this.drawingViewId;
    }

    public void setDrawingViewId(int i) {
        this.drawingViewId = i;
    }

    public int getContainerColor() {
        return this.containerColor;
    }

    public void setContainerColor(int i) {
        this.containerColor = i;
    }

    public int getStartContainerColor() {
        return this.startContainerColor;
    }

    public void setStartContainerColor(int i) {
        this.startContainerColor = i;
    }

    public int getEndContainerColor() {
        return this.endContainerColor;
    }

    public void setEndContainerColor(int i) {
        this.endContainerColor = i;
    }

    public void setAllContainerColors(int i) {
        this.containerColor = i;
        this.startContainerColor = i;
        this.endContainerColor = i;
    }

    public int getScrimColor() {
        return this.scrimColor;
    }

    public void setScrimColor(int i) {
        this.scrimColor = i;
    }

    public int getTransitionDirection() {
        return this.transitionDirection;
    }

    public void setTransitionDirection(int i) {
        this.transitionDirection = i;
    }

    public int getFadeMode() {
        return this.fadeMode;
    }

    public void setFadeMode(int i) {
        this.fadeMode = i;
    }

    public int getFitMode() {
        return this.fitMode;
    }

    public void setFitMode(int i) {
        this.fitMode = i;
    }

    public com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds getFadeProgressThresholds() {
        return this.fadeProgressThresholds;
    }

    public void setFadeProgressThresholds(com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds progressThresholds) {
        this.fadeProgressThresholds = progressThresholds;
    }

    public com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds getScaleProgressThresholds() {
        return this.scaleProgressThresholds;
    }

    public void setScaleProgressThresholds(com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds progressThresholds) {
        this.scaleProgressThresholds = progressThresholds;
    }

    public com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds getScaleMaskProgressThresholds() {
        return this.scaleMaskProgressThresholds;
    }

    public void setScaleMaskProgressThresholds(com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds progressThresholds) {
        this.scaleMaskProgressThresholds = progressThresholds;
    }

    public com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds getShapeMaskProgressThresholds() {
        return this.shapeMaskProgressThresholds;
    }

    public void setShapeMaskProgressThresholds(com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds progressThresholds) {
        this.shapeMaskProgressThresholds = progressThresholds;
    }

    public boolean isHoldAtEndEnabled() {
        return this.holdAtEndEnabled;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.holdAtEndEnabled = z;
    }

    public boolean isDrawDebugEnabled() {
        return this.drawDebugEnabled;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.drawDebugEnabled = z;
    }

    @Override // android.transition.Transition
    public void setPathMotion(android.transition.PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.pathMotionCustom = true;
    }

    @Override // android.transition.Transition
    public java.lang.String[] getTransitionProperties() {
        return TRANSITION_PROPS;
    }

    @Override // android.transition.Transition
    public void captureStartValues(android.transition.TransitionValues transitionValues) {
        captureValues(transitionValues, this.startView, this.startViewId, this.startShapeAppearanceModel);
    }

    @Override // android.transition.Transition
    public void captureEndValues(android.transition.TransitionValues transitionValues) {
        captureValues(transitionValues, this.endView, this.endViewId, this.endShapeAppearanceModel);
    }

    private static void captureValues(android.transition.TransitionValues transitionValues, android.view.View view, int i, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        if (i != -1) {
            transitionValues.view = com.google.android.material.transition.platform.TransitionUtils.findDescendantOrAncestorById(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view) instanceof android.view.View) {
            android.view.View view2 = (android.view.View) transitionValues.view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view);
            transitionValues.view.setTag(com.google.android.material.R.id.mtrl_motion_snapshot_view, null);
            transitionValues.view = view2;
        }
        android.view.View view3 = transitionValues.view;
        if (!androidx.core.view.ViewCompat.isLaidOut(view3) && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        android.graphics.RectF relativeBounds = view3.getParent() == null ? com.google.android.material.transition.platform.TransitionUtils.getRelativeBounds(view3) : com.google.android.material.transition.platform.TransitionUtils.getLocationOnScreen(view3);
        transitionValues.values.put(PROP_BOUNDS, relativeBounds);
        transitionValues.values.put(PROP_SHAPE_APPEARANCE, captureShapeAppearance(view3, relativeBounds, shapeAppearanceModel));
    }

    private static com.google.android.material.shape.ShapeAppearanceModel captureShapeAppearance(android.view.View view, android.graphics.RectF rectF, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        return com.google.android.material.transition.platform.TransitionUtils.convertToRelativeCornerSizes(getShapeAppearance(view, shapeAppearanceModel), rectF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.ShapeAppearanceModel getShapeAppearance(android.view.View view, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        if (view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view) instanceof com.google.android.material.shape.ShapeAppearanceModel) {
            return (com.google.android.material.shape.ShapeAppearanceModel) view.getTag(com.google.android.material.R.id.mtrl_motion_snapshot_view);
        }
        android.content.Context context = view.getContext();
        int transitionShapeAppearanceResId = getTransitionShapeAppearanceResId(context);
        if (transitionShapeAppearanceResId != -1) {
            return com.google.android.material.shape.ShapeAppearanceModel.builder(context, transitionShapeAppearanceResId, 0).build();
        }
        if (view instanceof com.google.android.material.shape.Shapeable) {
            return ((com.google.android.material.shape.Shapeable) view).getShapeAppearanceModel();
        }
        return com.google.android.material.shape.ShapeAppearanceModel.builder().build();
    }

    private static int getTransitionShapeAppearanceResId(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.material.R.attr.transitionShapeAppearance});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @Override // android.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, android.transition.TransitionValues transitionValues, android.transition.TransitionValues transitionValues2) {
        final android.view.View viewFindAncestorById;
        android.view.View view;
        if (transitionValues != null && transitionValues2 != null) {
            android.graphics.RectF rectF = (android.graphics.RectF) transitionValues.values.get(PROP_BOUNDS);
            com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel = (com.google.android.material.shape.ShapeAppearanceModel) transitionValues.values.get(PROP_SHAPE_APPEARANCE);
            if (rectF == null || shapeAppearanceModel == null) {
                android.util.Log.w(TAG, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
            } else {
                android.graphics.RectF rectF2 = (android.graphics.RectF) transitionValues2.values.get(PROP_BOUNDS);
                com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel2 = (com.google.android.material.shape.ShapeAppearanceModel) transitionValues2.values.get(PROP_SHAPE_APPEARANCE);
                if (rectF2 == null || shapeAppearanceModel2 == null) {
                    android.util.Log.w(TAG, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                final android.view.View view2 = transitionValues.view;
                final android.view.View view3 = transitionValues2.view;
                android.view.View view4 = view3.getParent() != null ? view3 : view2;
                if (this.drawingViewId == view4.getId()) {
                    viewFindAncestorById = (android.view.View) view4.getParent();
                    view = view4;
                } else {
                    viewFindAncestorById = com.google.android.material.transition.platform.TransitionUtils.findAncestorById(view4, this.drawingViewId);
                    view = null;
                }
                android.graphics.RectF locationOnScreen = com.google.android.material.transition.platform.TransitionUtils.getLocationOnScreen(viewFindAncestorById);
                float f = -locationOnScreen.left;
                float f2 = -locationOnScreen.top;
                android.graphics.RectF rectFCalculateDrawableBounds = calculateDrawableBounds(viewFindAncestorById, view, f, f2);
                rectF.offset(f, f2);
                rectF2.offset(f, f2);
                boolean zIsEntering = isEntering(rectF, rectF2);
                if (!this.appliedThemeValues) {
                    maybeApplyThemeValues(view4.getContext(), zIsEntering);
                }
                final com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable transitionDrawable = new com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable(getPathMotion(), view2, rectF, shapeAppearanceModel, getElevationOrDefault(this.startElevation, view2), view3, rectF2, shapeAppearanceModel2, getElevationOrDefault(this.endElevation, view3), this.containerColor, this.startContainerColor, this.endContainerColor, this.scrimColor, zIsEntering, this.elevationShadowEnabled, com.google.android.material.transition.platform.FadeModeEvaluators.get(this.fadeMode, zIsEntering), com.google.android.material.transition.platform.FitModeEvaluators.get(this.fitMode, zIsEntering, rectF, rectF2), buildThresholdsGroup(zIsEntering), this.drawDebugEnabled);
                transitionDrawable.setBounds(java.lang.Math.round(rectFCalculateDrawableBounds.left), java.lang.Math.round(rectFCalculateDrawableBounds.top), java.lang.Math.round(rectFCalculateDrawableBounds.right), java.lang.Math.round(rectFCalculateDrawableBounds.bottom));
                android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                        transitionDrawable.setProgress(valueAnimator.getAnimatedFraction());
                    }
                });
                addListener(new com.google.android.material.transition.platform.TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.2
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionStart(android.transition.Transition transition) {
                        com.google.android.material.internal.ViewUtils.getOverlay(viewFindAncestorById).add(transitionDrawable);
                        view2.setAlpha(0.0f);
                        view3.setAlpha(0.0f);
                    }

                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionEnd(android.transition.Transition transition) {
                        com.google.android.material.transition.platform.MaterialContainerTransform.this.removeListener(this);
                        if (com.google.android.material.transition.platform.MaterialContainerTransform.this.holdAtEndEnabled) {
                            return;
                        }
                        view2.setAlpha(1.0f);
                        view3.setAlpha(1.0f);
                        com.google.android.material.internal.ViewUtils.getOverlay(viewFindAncestorById).remove(transitionDrawable);
                    }
                });
                return valueAnimatorOfFloat;
            }
        }
        return null;
    }

    private void maybeApplyThemeValues(android.content.Context context, boolean z) {
        com.google.android.material.transition.platform.TransitionUtils.maybeApplyThemeInterpolator(this, context, com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        com.google.android.material.transition.platform.TransitionUtils.maybeApplyThemeDuration(this, context, z ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4);
        if (this.pathMotionCustom) {
            return;
        }
        com.google.android.material.transition.platform.TransitionUtils.maybeApplyThemePath(this, context, com.google.android.material.R.attr.motionPath);
    }

    private static float getElevationOrDefault(float f, android.view.View view) {
        return f != -1.0f ? f : androidx.core.view.ViewCompat.getElevation(view);
    }

    private static android.graphics.RectF calculateDrawableBounds(android.view.View view, android.view.View view2, float f, float f2) {
        if (view2 != null) {
            android.graphics.RectF locationOnScreen = com.google.android.material.transition.platform.TransitionUtils.getLocationOnScreen(view2);
            locationOnScreen.offset(f, f2);
            return locationOnScreen;
        }
        return new android.graphics.RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    private boolean isEntering(android.graphics.RectF rectF, android.graphics.RectF rectF2) {
        int i = this.transitionDirection;
        if (i == 0) {
            return com.google.android.material.transition.platform.TransitionUtils.calculateArea(rectF2) > com.google.android.material.transition.platform.TransitionUtils.calculateArea(rectF);
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new java.lang.IllegalArgumentException("Invalid transition direction: " + this.transitionDirection);
    }

    private com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup buildThresholdsGroup(boolean z) {
        android.transition.PathMotion pathMotion = getPathMotion();
        if ((pathMotion instanceof android.transition.ArcMotion) || (pathMotion instanceof com.google.android.material.transition.platform.MaterialArcMotion)) {
            return getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS_ARC, DEFAULT_RETURN_THRESHOLDS_ARC);
        }
        return getThresholdsOrDefault(z, DEFAULT_ENTER_THRESHOLDS, DEFAULT_RETURN_THRESHOLDS);
    }

    private com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup getThresholdsOrDefault(boolean z, com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup progressThresholdsGroup, com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup progressThresholdsGroup2) {
        if (!z) {
            progressThresholdsGroup = progressThresholdsGroup2;
        }
        return new com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup((com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds) com.google.android.material.transition.platform.TransitionUtils.defaultIfNull(this.fadeProgressThresholds, progressThresholdsGroup.fade), (com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds) com.google.android.material.transition.platform.TransitionUtils.defaultIfNull(this.scaleProgressThresholds, progressThresholdsGroup.scale), (com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds) com.google.android.material.transition.platform.TransitionUtils.defaultIfNull(this.scaleMaskProgressThresholds, progressThresholdsGroup.scaleMask), (com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds) com.google.android.material.transition.platform.TransitionUtils.defaultIfNull(this.shapeMaskProgressThresholds, progressThresholdsGroup.shapeMask));
    }

    private static final class TransitionDrawable extends android.graphics.drawable.Drawable {
        private static final int COMPAT_SHADOW_COLOR = -7829368;
        private static final int SHADOW_COLOR = 754974720;
        private static final float SHADOW_DX_MULTIPLIER_ADJUSTMENT = 0.3f;
        private static final float SHADOW_DY_MULTIPLIER_ADJUSTMENT = 1.5f;
        private final com.google.android.material.shape.MaterialShapeDrawable compatShadowDrawable;
        private final android.graphics.Paint containerPaint;
        private float currentElevation;
        private float currentElevationDy;
        private final android.graphics.RectF currentEndBounds;
        private final android.graphics.RectF currentEndBoundsMasked;
        private android.graphics.RectF currentMaskBounds;
        private final android.graphics.RectF currentStartBounds;
        private final android.graphics.RectF currentStartBoundsMasked;
        private final android.graphics.Paint debugPaint;
        private final android.graphics.Path debugPath;
        private final float displayHeight;
        private final float displayWidth;
        private final boolean drawDebugEnabled;
        private final boolean elevationShadowEnabled;
        private final android.graphics.RectF endBounds;
        private final android.graphics.Paint endContainerPaint;
        private final float endElevation;
        private final com.google.android.material.shape.ShapeAppearanceModel endShapeAppearanceModel;
        private final android.view.View endView;
        private final boolean entering;
        private final com.google.android.material.transition.platform.FadeModeEvaluator fadeModeEvaluator;
        private com.google.android.material.transition.platform.FadeModeResult fadeModeResult;
        private final com.google.android.material.transition.platform.FitModeEvaluator fitModeEvaluator;
        private com.google.android.material.transition.platform.FitModeResult fitModeResult;
        private final com.google.android.material.transition.platform.MaskEvaluator maskEvaluator;
        private final float motionPathLength;
        private final android.graphics.PathMeasure motionPathMeasure;
        private final float[] motionPathPosition;
        private float progress;
        private final com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup progressThresholds;
        private final android.graphics.Paint scrimPaint;
        private final android.graphics.Paint shadowPaint;
        private final android.graphics.RectF startBounds;
        private final android.graphics.Paint startContainerPaint;
        private final float startElevation;
        private final com.google.android.material.shape.ShapeAppearanceModel startShapeAppearanceModel;
        private final android.view.View startView;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        private TransitionDrawable(android.transition.PathMotion pathMotion, android.view.View view, android.graphics.RectF rectF, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel, float f, android.view.View view2, android.graphics.RectF rectF2, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, com.google.android.material.transition.platform.FadeModeEvaluator fadeModeEvaluator, com.google.android.material.transition.platform.FitModeEvaluator fitModeEvaluator, com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholdsGroup progressThresholdsGroup, boolean z3) {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.containerPaint = paint;
            android.graphics.Paint paint2 = new android.graphics.Paint();
            this.startContainerPaint = paint2;
            android.graphics.Paint paint3 = new android.graphics.Paint();
            this.endContainerPaint = paint3;
            this.shadowPaint = new android.graphics.Paint();
            android.graphics.Paint paint4 = new android.graphics.Paint();
            this.scrimPaint = paint4;
            this.maskEvaluator = new com.google.android.material.transition.platform.MaskEvaluator();
            this.motionPathPosition = new float[]{rectF.centerX(), rectF.top};
            com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
            this.compatShadowDrawable = materialShapeDrawable;
            android.graphics.Paint paint5 = new android.graphics.Paint();
            this.debugPaint = paint5;
            this.debugPath = new android.graphics.Path();
            this.startView = view;
            this.startBounds = rectF;
            this.startShapeAppearanceModel = shapeAppearanceModel;
            this.startElevation = f;
            this.endView = view2;
            this.endBounds = rectF2;
            this.endShapeAppearanceModel = shapeAppearanceModel2;
            this.endElevation = f2;
            this.entering = z;
            this.elevationShadowEnabled = z2;
            this.fadeModeEvaluator = fadeModeEvaluator;
            this.fitModeEvaluator = fitModeEvaluator;
            this.progressThresholds = progressThresholdsGroup;
            this.drawDebugEnabled = z3;
            android.view.WindowManager windowManager = (android.view.WindowManager) view.getContext().getSystemService("window");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.displayWidth = displayMetrics.widthPixels;
            this.displayHeight = displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.setFillColor(android.content.res.ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(COMPAT_SHADOW_COLOR);
            android.graphics.RectF rectF3 = new android.graphics.RectF(rectF);
            this.currentStartBounds = rectF3;
            this.currentStartBoundsMasked = new android.graphics.RectF(rectF3);
            android.graphics.RectF rectF4 = new android.graphics.RectF(rectF3);
            this.currentEndBounds = rectF4;
            this.currentEndBoundsMasked = new android.graphics.RectF(rectF4);
            android.graphics.PointF motionPathPoint = getMotionPathPoint(rectF);
            android.graphics.PointF motionPathPoint2 = getMotionPathPoint(rectF2);
            android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(pathMotion.getPath(motionPathPoint.x, motionPathPoint.y, motionPathPoint2.x, motionPathPoint2.y), false);
            this.motionPathMeasure = pathMeasure;
            this.motionPathLength = pathMeasure.getLength();
            paint4.setStyle(android.graphics.Paint.Style.FILL);
            paint4.setShader(com.google.android.material.transition.platform.TransitionUtils.createColorShader(i4));
            paint5.setStyle(android.graphics.Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            updateProgress(0.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas canvas) {
            if (this.scrimPaint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.scrimPaint);
            }
            int iSave = this.drawDebugEnabled ? canvas.save() : -1;
            if (this.elevationShadowEnabled && this.currentElevation > 0.0f) {
                drawElevationShadow(canvas);
            }
            this.maskEvaluator.clip(canvas);
            maybeDrawContainerColor(canvas, this.containerPaint);
            if (this.fadeModeResult.endOnTop) {
                drawStartView(canvas);
                drawEndView(canvas);
            } else {
                drawEndView(canvas);
                drawStartView(canvas);
            }
            if (this.drawDebugEnabled) {
                canvas.restoreToCount(iSave);
                drawDebugCumulativePath(canvas, this.currentStartBounds, this.debugPath, -65281);
                drawDebugRect(canvas, this.currentStartBoundsMasked, androidx.core.view.InputDeviceCompat.SOURCE_ANY);
                drawDebugRect(canvas, this.currentStartBounds, -16711936);
                drawDebugRect(canvas, this.currentEndBoundsMasked, -16711681);
                drawDebugRect(canvas, this.currentEndBounds, -16776961);
            }
        }

        private void drawElevationShadow(android.graphics.Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.maskEvaluator.getPath(), android.graphics.Region.Op.DIFFERENCE);
            if (android.os.Build.VERSION.SDK_INT > 28) {
                drawElevationShadowWithPaintShadowLayer(canvas);
            } else {
                drawElevationShadowWithMaterialShapeDrawable(canvas);
            }
            canvas.restore();
        }

        private void drawElevationShadowWithPaintShadowLayer(android.graphics.Canvas canvas) {
            com.google.android.material.shape.ShapeAppearanceModel currentShapeAppearanceModel = this.maskEvaluator.getCurrentShapeAppearanceModel();
            if (currentShapeAppearanceModel.isRoundRect(this.currentMaskBounds)) {
                float cornerSize = currentShapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.currentMaskBounds);
                canvas.drawRoundRect(this.currentMaskBounds, cornerSize, cornerSize, this.shadowPaint);
            } else {
                canvas.drawPath(this.maskEvaluator.getPath(), this.shadowPaint);
            }
        }

        private void drawElevationShadowWithMaterialShapeDrawable(android.graphics.Canvas canvas) {
            this.compatShadowDrawable.setBounds((int) this.currentMaskBounds.left, (int) this.currentMaskBounds.top, (int) this.currentMaskBounds.right, (int) this.currentMaskBounds.bottom);
            this.compatShadowDrawable.setElevation(this.currentElevation);
            this.compatShadowDrawable.setShadowVerticalOffset((int) this.currentElevationDy);
            this.compatShadowDrawable.setShapeAppearanceModel(this.maskEvaluator.getCurrentShapeAppearanceModel());
            this.compatShadowDrawable.draw(canvas);
        }

        private void drawStartView(android.graphics.Canvas canvas) {
            maybeDrawContainerColor(canvas, this.startContainerPaint);
            com.google.android.material.transition.platform.TransitionUtils.transform(canvas, getBounds(), this.currentStartBounds.left, this.currentStartBounds.top, this.fitModeResult.startScale, this.fadeModeResult.startAlpha, new com.google.android.material.transition.platform.TransitionUtils.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.transition.platform.TransitionUtils.CanvasOperation
                public void run(android.graphics.Canvas canvas2) {
                    com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.this.startView.draw(canvas2);
                }
            });
        }

        private void drawEndView(android.graphics.Canvas canvas) {
            maybeDrawContainerColor(canvas, this.endContainerPaint);
            com.google.android.material.transition.platform.TransitionUtils.transform(canvas, getBounds(), this.currentEndBounds.left, this.currentEndBounds.top, this.fitModeResult.endScale, this.fadeModeResult.endAlpha, new com.google.android.material.transition.platform.TransitionUtils.CanvasOperation() { // from class: com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.transition.platform.TransitionUtils.CanvasOperation
                public void run(android.graphics.Canvas canvas2) {
                    com.google.android.material.transition.platform.MaterialContainerTransform.TransitionDrawable.this.endView.draw(canvas2);
                }
            });
        }

        private void maybeDrawContainerColor(android.graphics.Canvas canvas, android.graphics.Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            throw new java.lang.UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(android.graphics.ColorFilter colorFilter) {
            throw new java.lang.UnsupportedOperationException("Setting a color filter is not supported");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgress(float f) {
            if (this.progress != f) {
                updateProgress(f);
            }
        }

        private void updateProgress(float f) {
            float f2;
            float f3;
            this.progress = f;
            this.scrimPaint.setAlpha((int) (this.entering ? com.google.android.material.transition.platform.TransitionUtils.lerp(0.0f, 255.0f, f) : com.google.android.material.transition.platform.TransitionUtils.lerp(255.0f, 0.0f, f)));
            this.motionPathMeasure.getPosTan(this.motionPathLength * f, this.motionPathPosition, null);
            float[] fArr = this.motionPathPosition;
            float f4 = fArr[0];
            float f5 = fArr[1];
            if (f > 1.0f || f < 0.0f) {
                if (f > 1.0f) {
                    f3 = (f - 1.0f) / 0.00999999f;
                    f2 = 0.99f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                this.motionPathMeasure.getPosTan(this.motionPathLength * f2, fArr, null);
                float[] fArr2 = this.motionPathPosition;
                f4 += (f4 - fArr2[0]) * f3;
                f5 += (f5 - fArr2[1]) * f3;
            }
            float f6 = f4;
            float f7 = f5;
            com.google.android.material.transition.platform.FitModeResult fitModeResultEvaluate = this.fitModeEvaluator.evaluate(f, ((java.lang.Float) androidx.core.util.Preconditions.checkNotNull(java.lang.Float.valueOf(this.progressThresholds.scale.start))).floatValue(), ((java.lang.Float) androidx.core.util.Preconditions.checkNotNull(java.lang.Float.valueOf(this.progressThresholds.scale.end))).floatValue(), this.startBounds.width(), this.startBounds.height(), this.endBounds.width(), this.endBounds.height());
            this.fitModeResult = fitModeResultEvaluate;
            this.currentStartBounds.set(f6 - (fitModeResultEvaluate.currentStartWidth / 2.0f), f7, (this.fitModeResult.currentStartWidth / 2.0f) + f6, this.fitModeResult.currentStartHeight + f7);
            this.currentEndBounds.set(f6 - (this.fitModeResult.currentEndWidth / 2.0f), f7, f6 + (this.fitModeResult.currentEndWidth / 2.0f), this.fitModeResult.currentEndHeight + f7);
            this.currentStartBoundsMasked.set(this.currentStartBounds);
            this.currentEndBoundsMasked.set(this.currentEndBounds);
            float fFloatValue = ((java.lang.Float) androidx.core.util.Preconditions.checkNotNull(java.lang.Float.valueOf(this.progressThresholds.scaleMask.start))).floatValue();
            float fFloatValue2 = ((java.lang.Float) androidx.core.util.Preconditions.checkNotNull(java.lang.Float.valueOf(this.progressThresholds.scaleMask.end))).floatValue();
            boolean zShouldMaskStartBounds = this.fitModeEvaluator.shouldMaskStartBounds(this.fitModeResult);
            android.graphics.RectF rectF = zShouldMaskStartBounds ? this.currentStartBoundsMasked : this.currentEndBoundsMasked;
            float fLerp = com.google.android.material.transition.platform.TransitionUtils.lerp(0.0f, 1.0f, fFloatValue, fFloatValue2, f);
            if (!zShouldMaskStartBounds) {
                fLerp = 1.0f - fLerp;
            }
            this.fitModeEvaluator.applyMask(rectF, fLerp, this.fitModeResult);
            this.currentMaskBounds = new android.graphics.RectF(java.lang.Math.min(this.currentStartBoundsMasked.left, this.currentEndBoundsMasked.left), java.lang.Math.min(this.currentStartBoundsMasked.top, this.currentEndBoundsMasked.top), java.lang.Math.max(this.currentStartBoundsMasked.right, this.currentEndBoundsMasked.right), java.lang.Math.max(this.currentStartBoundsMasked.bottom, this.currentEndBoundsMasked.bottom));
            this.maskEvaluator.evaluate(f, this.startShapeAppearanceModel, this.endShapeAppearanceModel, this.currentStartBounds, this.currentStartBoundsMasked, this.currentEndBoundsMasked, this.progressThresholds.shapeMask);
            this.currentElevation = com.google.android.material.transition.platform.TransitionUtils.lerp(this.startElevation, this.endElevation, f);
            float fCalculateElevationDxMultiplier = calculateElevationDxMultiplier(this.currentMaskBounds, this.displayWidth);
            float fCalculateElevationDyMultiplier = calculateElevationDyMultiplier(this.currentMaskBounds, this.displayHeight);
            float f8 = this.currentElevation;
            float f9 = (int) (fCalculateElevationDyMultiplier * f8);
            this.currentElevationDy = f9;
            this.shadowPaint.setShadowLayer(f8, (int) (fCalculateElevationDxMultiplier * f8), f9, SHADOW_COLOR);
            this.fadeModeResult = this.fadeModeEvaluator.evaluate(f, ((java.lang.Float) androidx.core.util.Preconditions.checkNotNull(java.lang.Float.valueOf(this.progressThresholds.fade.start))).floatValue(), ((java.lang.Float) androidx.core.util.Preconditions.checkNotNull(java.lang.Float.valueOf(this.progressThresholds.fade.end))).floatValue(), 0.35f);
            if (this.startContainerPaint.getColor() != 0) {
                this.startContainerPaint.setAlpha(this.fadeModeResult.startAlpha);
            }
            if (this.endContainerPaint.getColor() != 0) {
                this.endContainerPaint.setAlpha(this.fadeModeResult.endAlpha);
            }
            invalidateSelf();
        }

        private static android.graphics.PointF getMotionPathPoint(android.graphics.RectF rectF) {
            return new android.graphics.PointF(rectF.centerX(), rectF.top);
        }

        private static float calculateElevationDxMultiplier(android.graphics.RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * SHADOW_DX_MULTIPLIER_ADJUSTMENT;
        }

        private static float calculateElevationDyMultiplier(android.graphics.RectF rectF, float f) {
            return (rectF.centerY() / f) * SHADOW_DY_MULTIPLIER_ADJUSTMENT;
        }

        private void drawDebugCumulativePath(android.graphics.Canvas canvas, android.graphics.RectF rectF, android.graphics.Path path, int i) {
            android.graphics.PointF motionPathPoint = getMotionPathPoint(rectF);
            if (this.progress == 0.0f) {
                path.reset();
                path.moveTo(motionPathPoint.x, motionPathPoint.y);
            } else {
                path.lineTo(motionPathPoint.x, motionPathPoint.y);
                this.debugPaint.setColor(i);
                canvas.drawPath(path, this.debugPaint);
            }
        }

        private void drawDebugRect(android.graphics.Canvas canvas, android.graphics.RectF rectF, int i) {
            this.debugPaint.setColor(i);
            canvas.drawRect(rectF, this.debugPaint);
        }
    }

    public static class ProgressThresholds {
        private final float end;
        private final float start;

        public ProgressThresholds(float f, float f2) {
            this.start = f;
            this.end = f2;
        }

        public float getStart() {
            return this.start;
        }

        public float getEnd() {
            return this.end;
        }
    }

    private static class ProgressThresholdsGroup {
        private final com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds fade;
        private final com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds scale;
        private final com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds scaleMask;
        private final com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds shapeMask;

        private ProgressThresholdsGroup(com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds progressThresholds, com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds progressThresholds2, com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds progressThresholds3, com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds progressThresholds4) {
            this.fade = progressThresholds;
            this.scale = progressThresholds2;
            this.scaleMask = progressThresholds3;
            this.shapeMask = progressThresholds4;
        }
    }
}
