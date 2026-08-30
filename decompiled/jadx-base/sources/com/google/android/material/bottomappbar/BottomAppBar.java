package com.google.android.material.bottomappbar;

/* JADX INFO: loaded from: classes5.dex */
public class BottomAppBar extends androidx.appcompat.widget.Toolbar implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior {
    private static final int FAB_ALIGNMENT_ANIM_DURATION_DEFAULT = 300;
    private static final float FAB_ALIGNMENT_ANIM_EASING_MIDPOINT = 0.2f;
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANCHOR_MODE_CRADLE = 1;
    public static final int FAB_ANCHOR_MODE_EMBED = 0;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    public static final int MENU_ALIGNMENT_MODE_AUTO = 0;
    public static final int MENU_ALIGNMENT_MODE_START = 1;
    private static final int NO_FAB_END_MARGIN = -1;
    private static final int NO_MENU_RES_ID = 0;
    private int animatingModeChangeCounter;
    private java.util.ArrayList<com.google.android.material.bottomappbar.BottomAppBar.AnimationListener> animationListeners;
    private com.google.android.material.bottomappbar.BottomAppBar.Behavior behavior;
    private int bottomInset;
    private int fabAlignmentMode;
    private int fabAlignmentModeEndMargin;
    private int fabAnchorMode;
    android.animation.AnimatorListenerAdapter fabAnimationListener;
    private int fabAnimationMode;
    private boolean fabAttached;
    private final int fabOffsetEndMode;
    com.google.android.material.animation.TransformationCallback<com.google.android.material.floatingactionbutton.FloatingActionButton> fabTransformationCallback;
    private boolean hideOnScroll;
    private int leftInset;
    private final com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable;
    private int menuAlignmentMode;
    private boolean menuAnimatingWithFabAlignmentMode;
    private android.animation.Animator menuAnimator;
    private android.animation.Animator modeAnimator;
    private java.lang.Integer navigationIconTint;
    private final boolean paddingBottomSystemWindowInsets;
    private final boolean paddingLeftSystemWindowInsets;
    private final boolean paddingRightSystemWindowInsets;
    private int pendingMenuResId;
    private final boolean removeEmbeddedFabElevation;
    private int rightInset;
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_BottomAppBar;
    private static final int FAB_ALIGNMENT_ANIM_DURATION_ATTR = com.google.android.material.R.attr.motionDurationLong2;
    private static final int FAB_ALIGNMENT_ANIM_EASING_ATTR = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator;

    interface AnimationListener {
        void onAnimationEnd(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar);

        void onAnimationStart(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FabAnchorMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MenuAlignmentMode {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(java.lang.CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(java.lang.CharSequence charSequence) {
    }

    public BottomAppBar(android.content.Context context) {
        this(context, null);
    }

    public BottomAppBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.bottomAppBarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
        this.materialShapeDrawable = materialShapeDrawable;
        this.animatingModeChangeCounter = 0;
        this.pendingMenuResId = 0;
        this.menuAnimatingWithFabAlignmentMode = false;
        this.fabAttached = true;
        this.fabAnimationListener = new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (com.google.android.material.bottomappbar.BottomAppBar.this.menuAnimatingWithFabAlignmentMode) {
                    return;
                }
                com.google.android.material.bottomappbar.BottomAppBar bottomAppBar = com.google.android.material.bottomappbar.BottomAppBar.this;
                bottomAppBar.maybeAnimateMenuView(bottomAppBar.fabAlignmentMode, com.google.android.material.bottomappbar.BottomAppBar.this.fabAttached);
            }
        };
        this.fabTransformationCallback = new com.google.android.material.animation.TransformationCallback<com.google.android.material.floatingactionbutton.FloatingActionButton>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.2
            @Override // com.google.android.material.animation.TransformationCallback
            public void onScaleChanged(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
                com.google.android.material.bottomappbar.BottomAppBar.this.materialShapeDrawable.setInterpolation((floatingActionButton.getVisibility() == 0 && com.google.android.material.bottomappbar.BottomAppBar.this.fabAnchorMode == 1) ? floatingActionButton.getScaleY() : 0.0f);
            }

            @Override // com.google.android.material.animation.TransformationCallback
            public void onTranslationChanged(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
                if (com.google.android.material.bottomappbar.BottomAppBar.this.fabAnchorMode != 1) {
                    return;
                }
                float translationX = floatingActionButton.getTranslationX();
                if (com.google.android.material.bottomappbar.BottomAppBar.this.getTopEdgeTreatment().getHorizontalOffset() != translationX) {
                    com.google.android.material.bottomappbar.BottomAppBar.this.getTopEdgeTreatment().setHorizontalOffset(translationX);
                    com.google.android.material.bottomappbar.BottomAppBar.this.materialShapeDrawable.invalidateSelf();
                }
                float fMax = java.lang.Math.max(0.0f, -floatingActionButton.getTranslationY());
                if (com.google.android.material.bottomappbar.BottomAppBar.this.getTopEdgeTreatment().getCradleVerticalOffset() != fMax) {
                    com.google.android.material.bottomappbar.BottomAppBar.this.getTopEdgeTreatment().setCradleVerticalOffset(fMax);
                    com.google.android.material.bottomappbar.BottomAppBar.this.materialShapeDrawable.invalidateSelf();
                }
                com.google.android.material.bottomappbar.BottomAppBar.this.materialShapeDrawable.setInterpolation(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
            }
        };
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.BottomAppBar, i, i2, new int[0]);
        android.content.res.ColorStateList colorStateList = com.google.android.material.resources.MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.BottomAppBar_backgroundTint);
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomAppBar_navigationIconTint)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(com.google.android.material.R.styleable.BottomAppBar_navigationIconTint, -1));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.BottomAppBar_fabCradleVerticalOffset, 0);
        this.fabAlignmentMode = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.BottomAppBar_fabAlignmentMode, 0);
        this.fabAnimationMode = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.BottomAppBar_fabAnimationMode, 0);
        this.fabAnchorMode = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.BottomAppBar_fabAnchorMode, 1);
        this.removeEmbeddedFabElevation = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomAppBar_removeEmbeddedFabElevation, true);
        this.menuAlignmentMode = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.BottomAppBar_menuAlignmentMode, 0);
        this.hideOnScroll = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomAppBar_hideOnScroll, false);
        this.paddingBottomSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.fabAlignmentModeEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.BottomAppBar_fabAlignmentModeEndMargin, -1);
        typedArrayObtainStyledAttributes.recycle();
        this.fabOffsetEndMode = getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        materialShapeDrawable.setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel.builder().setTopEdge(new com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).build());
        materialShapeDrawable.setShadowCompatibilityMode(2);
        materialShapeDrawable.setPaintStyle(android.graphics.Paint.Style.FILL);
        materialShapeDrawable.initializeElevationOverlay(context2);
        setElevation(dimensionPixelSize);
        androidx.core.graphics.drawable.DrawableCompat.setTintList(materialShapeDrawable, colorStateList);
        androidx.core.view.ViewCompat.setBackground(this, materialShapeDrawable);
        com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(this, attributeSet, i, i2, new com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.3
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, com.google.android.material.internal.ViewUtils.RelativePadding relativePadding) {
                boolean z;
                if (com.google.android.material.bottomappbar.BottomAppBar.this.paddingBottomSystemWindowInsets) {
                    com.google.android.material.bottomappbar.BottomAppBar.this.bottomInset = windowInsetsCompat.getSystemWindowInsetBottom();
                }
                boolean z2 = false;
                if (com.google.android.material.bottomappbar.BottomAppBar.this.paddingLeftSystemWindowInsets) {
                    z = com.google.android.material.bottomappbar.BottomAppBar.this.leftInset != windowInsetsCompat.getSystemWindowInsetLeft();
                    com.google.android.material.bottomappbar.BottomAppBar.this.leftInset = windowInsetsCompat.getSystemWindowInsetLeft();
                } else {
                    z = false;
                }
                if (com.google.android.material.bottomappbar.BottomAppBar.this.paddingRightSystemWindowInsets) {
                    boolean z3 = com.google.android.material.bottomappbar.BottomAppBar.this.rightInset != windowInsetsCompat.getSystemWindowInsetRight();
                    com.google.android.material.bottomappbar.BottomAppBar.this.rightInset = windowInsetsCompat.getSystemWindowInsetRight();
                    z2 = z3;
                }
                if (z || z2) {
                    com.google.android.material.bottomappbar.BottomAppBar.this.cancelAnimations();
                    com.google.android.material.bottomappbar.BottomAppBar.this.setCutoutStateAndTranslateFab();
                    com.google.android.material.bottomappbar.BottomAppBar.this.setActionMenuViewPosition();
                }
                return windowInsetsCompat;
            }
        });
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.navigationIconTint = java.lang.Integer.valueOf(i);
        android.graphics.drawable.Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public int getFabAlignmentMode() {
        return this.fabAlignmentMode;
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, int i2) {
        this.pendingMenuResId = i2;
        this.menuAnimatingWithFabAlignmentMode = true;
        maybeAnimateMenuView(i, this.fabAttached);
        maybeAnimateModeChange(i);
        this.fabAlignmentMode = i;
    }

    public int getFabAnchorMode() {
        return this.fabAnchorMode;
    }

    public void setFabAnchorMode(int i) {
        this.fabAnchorMode = i;
        setCutoutStateAndTranslateFab();
        android.view.View viewFindDependentView = findDependentView();
        if (viewFindDependentView != null) {
            updateFabAnchorGravity(this, viewFindDependentView);
            viewFindDependentView.requestLayout();
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateFabAnchorGravity(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar, android.view.View view) {
        androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.anchorGravity = 17;
        if (bottomAppBar.fabAnchorMode == 1) {
            layoutParams.anchorGravity |= 48;
        }
        if (bottomAppBar.fabAnchorMode == 0) {
            layoutParams.anchorGravity |= 80;
        }
    }

    public int getFabAnimationMode() {
        return this.fabAnimationMode;
    }

    public void setFabAnimationMode(int i) {
        this.fabAnimationMode = i;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.menuAlignmentMode != i) {
            this.menuAlignmentMode = i;
            androidx.appcompat.widget.ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                translateActionMenuView(actionMenuView, this.fabAlignmentMode, isFabVisibleOrWillBeShown());
            }
        }
    }

    public int getMenuAlignmentMode() {
        return this.menuAlignmentMode;
    }

    public void setBackgroundTint(android.content.res.ColorStateList colorStateList) {
        androidx.core.graphics.drawable.DrawableCompat.setTintList(this.materialShapeDrawable, colorStateList);
    }

    public android.content.res.ColorStateList getBackgroundTint() {
        return this.materialShapeDrawable.getTintList();
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().getFabCradleMargin();
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().setFabCradleMargin(f);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().getFabCradleRoundedCornerRadius();
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().setFabCradleRoundedCornerRadius(f);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().getCradleVerticalOffset();
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().setCradleVerticalOffset(f);
            this.materialShapeDrawable.invalidateSelf();
            setCutoutStateAndTranslateFab();
        }
    }

    public int getFabAlignmentModeEndMargin() {
        return this.fabAlignmentModeEndMargin;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.fabAlignmentModeEndMargin != i) {
            this.fabAlignmentModeEndMargin = i;
            setCutoutStateAndTranslateFab();
        }
    }

    public boolean getHideOnScroll() {
        return this.hideOnScroll;
    }

    public void setHideOnScroll(boolean z) {
        this.hideOnScroll = z;
    }

    public void performHide() {
        performHide(true);
    }

    public void performHide(boolean z) {
        getBehavior().slideDown(this, z);
    }

    public void performShow() {
        performShow(true);
    }

    public void performShow(boolean z) {
        getBehavior().slideUp(this, z);
    }

    public boolean isScrolledDown() {
        return getBehavior().isScrolledDown();
    }

    public boolean isScrolledUp() {
        return getBehavior().isScrolledUp();
    }

    public void addOnScrollStateChangedListener(com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        getBehavior().addOnScrollStateChangedListener(onScrollStateChangedListener);
    }

    public void removeOnScrollStateChangedListener(com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        getBehavior().removeOnScrollStateChangedListener(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        getBehavior().clearOnScrollStateChangedListeners();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.materialShapeDrawable.setElevation(f);
        getBehavior().setAdditionalHiddenOffsetY(this, this.materialShapeDrawable.getShadowRadius() - this.materialShapeDrawable.getShadowOffsetY());
    }

    public void replaceMenu(int i) {
        if (i != 0) {
            this.pendingMenuResId = 0;
            getMenu().clear();
            inflateMenu(i);
        }
    }

    void addAnimationListener(com.google.android.material.bottomappbar.BottomAppBar.AnimationListener animationListener) {
        if (this.animationListeners == null) {
            this.animationListeners = new java.util.ArrayList<>();
        }
        this.animationListeners.add(animationListener);
    }

    void removeAnimationListener(com.google.android.material.bottomappbar.BottomAppBar.AnimationListener animationListener) {
        java.util.ArrayList<com.google.android.material.bottomappbar.BottomAppBar.AnimationListener> arrayList = this.animationListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationStart() {
        java.util.ArrayList<com.google.android.material.bottomappbar.BottomAppBar.AnimationListener> arrayList;
        int i = this.animatingModeChangeCounter;
        this.animatingModeChangeCounter = i + 1;
        if (i != 0 || (arrayList = this.animationListeners) == null) {
            return;
        }
        java.util.Iterator<com.google.android.material.bottomappbar.BottomAppBar.AnimationListener> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        java.util.ArrayList<com.google.android.material.bottomappbar.BottomAppBar.AnimationListener> arrayList;
        int i = this.animatingModeChangeCounter - 1;
        this.animatingModeChangeCounter = i;
        if (i != 0 || (arrayList = this.animationListeners) == null) {
            return;
        }
        java.util.Iterator<com.google.android.material.bottomappbar.BottomAppBar.AnimationListener> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this);
        }
    }

    boolean setFabDiameter(int i) {
        float f = i;
        if (f == getTopEdgeTreatment().getFabDiameter()) {
            return false;
        }
        getTopEdgeTreatment().setFabDiameter(f);
        this.materialShapeDrawable.invalidateSelf();
        return true;
    }

    void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().getFabCornerRadius()) {
            getTopEdgeTreatment().setFabCornerSize(f);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    private void maybeAnimateModeChange(int i) {
        if (this.fabAlignmentMode == i || !androidx.core.view.ViewCompat.isLaidOut(this)) {
            return;
        }
        android.animation.Animator animator = this.modeAnimator;
        if (animator != null) {
            animator.cancel();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.fabAnimationMode == 1) {
            createFabTranslationXAnimation(i, arrayList);
        } else {
            createFabDefaultXAnimation(i, arrayList);
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(getContext(), FAB_ALIGNMENT_ANIM_EASING_ATTR, com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR));
        this.modeAnimator = animatorSet;
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator2) {
                com.google.android.material.bottomappbar.BottomAppBar.this.dispatchAnimationStart();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator2) {
                com.google.android.material.bottomappbar.BottomAppBar.this.dispatchAnimationEnd();
                com.google.android.material.bottomappbar.BottomAppBar.this.modeAnimator = null;
            }
        });
        this.modeAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.material.floatingactionbutton.FloatingActionButton findDependentFab() {
        android.view.View viewFindDependentView = findDependentView();
        if (viewFindDependentView instanceof com.google.android.material.floatingactionbutton.FloatingActionButton) {
            return (com.google.android.material.floatingactionbutton.FloatingActionButton) viewFindDependentView;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.view.View findDependentView() {
        if (!(getParent() instanceof androidx.coordinatorlayout.widget.CoordinatorLayout)) {
            return null;
        }
        for (android.view.View view : ((androidx.coordinatorlayout.widget.CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof com.google.android.material.floatingactionbutton.FloatingActionButton) || (view instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    private boolean isFabVisibleOrWillBeShown() {
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButtonFindDependentFab = findDependentFab();
        return floatingActionButtonFindDependentFab != null && floatingActionButtonFindDependentFab.isOrWillBeShown();
    }

    protected void createFabDefaultXAnimation(final int i, java.util.List<android.animation.Animator> list) {
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButtonFindDependentFab = findDependentFab();
        if (floatingActionButtonFindDependentFab == null || floatingActionButtonFindDependentFab.isOrWillBeHidden()) {
            return;
        }
        dispatchAnimationStart();
        floatingActionButtonFindDependentFab.hide(new com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5
            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
            public void onHidden(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
                floatingActionButton.setTranslationX(com.google.android.material.bottomappbar.BottomAppBar.this.getFabTranslationX(i));
                floatingActionButton.show(new com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5.1
                    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                    public void onShown(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton2) {
                        com.google.android.material.bottomappbar.BottomAppBar.this.dispatchAnimationEnd();
                    }
                });
            }
        });
    }

    private void createFabTranslationXAnimation(int i, java.util.List<android.animation.Animator> list) {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(findDependentFab(), "translationX", getFabTranslationX(i));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    private int getFabAlignmentAnimationDuration() {
        return com.google.android.material.motion.MotionUtils.resolveThemeDuration(getContext(), FAB_ALIGNMENT_ANIM_DURATION_ATTR, 300);
    }

    private android.graphics.drawable.Drawable maybeTintNavigationIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable == null || this.navigationIconTint == null) {
            return drawable;
        }
        android.graphics.drawable.Drawable drawableWrap = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable.mutate());
        androidx.core.graphics.drawable.DrawableCompat.setTint(drawableWrap, this.navigationIconTint.intValue());
        return drawableWrap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeAnimateMenuView(int i, boolean z) {
        if (!androidx.core.view.ViewCompat.isLaidOut(this)) {
            this.menuAnimatingWithFabAlignmentMode = false;
            replaceMenu(this.pendingMenuResId);
            return;
        }
        android.animation.Animator animator = this.menuAnimator;
        if (animator != null) {
            animator.cancel();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!isFabVisibleOrWillBeShown()) {
            i = 0;
            z = false;
        }
        createMenuViewTranslationAnimation(i, z, arrayList);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.menuAnimator = animatorSet;
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator2) {
                com.google.android.material.bottomappbar.BottomAppBar.this.dispatchAnimationStart();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator2) {
                com.google.android.material.bottomappbar.BottomAppBar.this.dispatchAnimationEnd();
                com.google.android.material.bottomappbar.BottomAppBar.this.menuAnimatingWithFabAlignmentMode = false;
                com.google.android.material.bottomappbar.BottomAppBar.this.menuAnimator = null;
            }
        });
        this.menuAnimator.start();
    }

    private void createMenuViewTranslationAnimation(final int i, final boolean z, java.util.List<android.animation.Animator> list) {
        final androidx.appcompat.widget.ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        android.animation.Animator animatorOfFloat = android.animation.ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        animatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (java.lang.Math.abs(actionMenuView.getTranslationX() - getActionMenuViewTranslationX(actionMenuView, i, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.7
                public boolean cancelled;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(android.animation.Animator animator) {
                    this.cancelled = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    if (this.cancelled) {
                        return;
                    }
                    boolean z2 = com.google.android.material.bottomappbar.BottomAppBar.this.pendingMenuResId != 0;
                    com.google.android.material.bottomappbar.BottomAppBar bottomAppBar = com.google.android.material.bottomappbar.BottomAppBar.this;
                    bottomAppBar.replaceMenu(bottomAppBar.pendingMenuResId);
                    com.google.android.material.bottomappbar.BottomAppBar.this.translateActionMenuView(actionMenuView, i, z, z2);
                }
            });
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    private float getFabTranslationY() {
        if (this.fabAnchorMode == 1) {
            return -getTopEdgeTreatment().getCradleVerticalOffset();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX(int i) {
        int measuredWidth;
        boolean zIsLayoutRtl = com.google.android.material.internal.ViewUtils.isLayoutRtl(this);
        if (i != 1) {
            return 0.0f;
        }
        android.view.View viewFindDependentView = findDependentView();
        int i2 = zIsLayoutRtl ? this.leftInset : this.rightInset;
        if (this.fabAlignmentModeEndMargin != -1 && viewFindDependentView != null) {
            measuredWidth = (viewFindDependentView.getMeasuredWidth() / 2) + this.fabAlignmentModeEndMargin;
        } else {
            measuredWidth = this.fabOffsetEndMode;
        }
        return ((getMeasuredWidth() / 2) - (i2 + measuredWidth)) * (zIsLayoutRtl ? -1 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return getFabTranslationX(this.fabAlignmentMode);
    }

    private androidx.appcompat.widget.ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt instanceof androidx.appcompat.widget.ActionMenuView) {
                return (androidx.appcompat.widget.ActionMenuView) childAt;
            }
        }
        return null;
    }

    private void translateActionMenuView(androidx.appcompat.widget.ActionMenuView actionMenuView, int i, boolean z) {
        translateActionMenuView(actionMenuView, i, z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void translateActionMenuView(final androidx.appcompat.widget.ActionMenuView actionMenuView, final int i, final boolean z, boolean z2) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.material.bottomappbar.BottomAppBar.8
            @Override // java.lang.Runnable
            public void run() {
                androidx.appcompat.widget.ActionMenuView actionMenuView2 = actionMenuView;
                actionMenuView2.setTranslationX(com.google.android.material.bottomappbar.BottomAppBar.this.getActionMenuViewTranslationX(actionMenuView2, i, z));
            }
        };
        if (z2) {
            actionMenuView.post(runnable);
        } else {
            runnable.run();
        }
    }

    protected int getActionMenuViewTranslationX(androidx.appcompat.widget.ActionMenuView actionMenuView, int i, boolean z) {
        int dimensionPixelOffset = 0;
        if (this.menuAlignmentMode != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean zIsLayoutRtl = com.google.android.material.internal.ViewUtils.isLayoutRtl(this);
        int measuredWidth = zIsLayoutRtl ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            android.view.View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof androidx.appcompat.widget.Toolbar.LayoutParams) && (((androidx.appcompat.widget.Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & androidx.core.view.GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388611) {
                if (zIsLayoutRtl) {
                    measuredWidth = java.lang.Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = java.lang.Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        int right = zIsLayoutRtl ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i3 = zIsLayoutRtl ? this.rightInset : -this.leftInset;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.m3_bottomappbar_horizontal_padding);
            if (!zIsLayoutRtl) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i3) + dimensionPixelOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelAnimations() {
        android.animation.Animator animator = this.menuAnimator;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.Animator animator2 = this.modeAnimator;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            cancelAnimations();
            setCutoutStateAndTranslateFab();
        }
        setActionMenuViewPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment) this.materialShapeDrawable.getShapeAppearanceModel().getTopEdge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCutoutStateAndTranslateFab() {
        getTopEdgeTreatment().setHorizontalOffset(getFabTranslationX());
        this.materialShapeDrawable.setInterpolation((this.fabAttached && isFabVisibleOrWillBeShown() && this.fabAnchorMode == 1) ? 1.0f : 0.0f);
        android.view.View viewFindDependentView = findDependentView();
        if (viewFindDependentView != null) {
            viewFindDependentView.setTranslationY(getFabTranslationY());
            viewFindDependentView.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionMenuViewPosition() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.menuAnimator != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!isFabVisibleOrWillBeShown()) {
            translateActionMenuView(actionMenuView, 0, false);
        } else {
            translateActionMenuView(actionMenuView, this.fabAlignmentMode, this.fabAttached);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFabAnimationListeners(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
        floatingActionButton.addOnHideAnimationListener(this.fabAnimationListener);
        floatingActionButton.addOnShowAnimationListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.material.bottomappbar.BottomAppBar.this.fabAnimationListener.onAnimationStart(animator);
                com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButtonFindDependentFab = com.google.android.material.bottomappbar.BottomAppBar.this.findDependentFab();
                if (floatingActionButtonFindDependentFab != null) {
                    floatingActionButtonFindDependentFab.setTranslationX(com.google.android.material.bottomappbar.BottomAppBar.this.getFabTranslationX());
                }
            }
        });
        floatingActionButton.addTransformationCallback(this.fabTransformationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.bottomInset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.rightInset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.leftInset;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public com.google.android.material.bottomappbar.BottomAppBar.Behavior getBehavior() {
        if (this.behavior == null) {
            this.behavior = new com.google.android.material.bottomappbar.BottomAppBar.Behavior();
        }
        return this.behavior;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(this, this.materialShapeDrawable);
        if (getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public static class Behavior extends com.google.android.material.behavior.HideBottomViewOnScrollBehavior<com.google.android.material.bottomappbar.BottomAppBar> {
        private final android.graphics.Rect fabContentRect;
        private final android.view.View.OnLayoutChangeListener fabLayoutListener;
        private int originalBottomMargin;
        private java.lang.ref.WeakReference<com.google.android.material.bottomappbar.BottomAppBar> viewRef;

        public Behavior() {
            this.fabLayoutListener = new android.view.View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    boolean z;
                    com.google.android.material.bottomappbar.BottomAppBar bottomAppBar = (com.google.android.material.bottomappbar.BottomAppBar) com.google.android.material.bottomappbar.BottomAppBar.Behavior.this.viewRef.get();
                    if (bottomAppBar == null || (!((z = view instanceof com.google.android.material.floatingactionbutton.FloatingActionButton)) && !(view instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (z) {
                        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = (com.google.android.material.floatingactionbutton.FloatingActionButton) view;
                        floatingActionButton.getMeasuredContentRect(com.google.android.material.bottomappbar.BottomAppBar.Behavior.this.fabContentRect);
                        height = com.google.android.material.bottomappbar.BottomAppBar.Behavior.this.fabContentRect.height();
                        bottomAppBar.setFabDiameter(height);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().getTopLeftCornerSize().getCornerSize(new android.graphics.RectF(com.google.android.material.bottomappbar.BottomAppBar.Behavior.this.fabContentRect)));
                    }
                    androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
                    if (com.google.android.material.bottomappbar.BottomAppBar.Behavior.this.originalBottomMargin == 0) {
                        int measuredHeight = (view.getMeasuredHeight() - height) / 2;
                        if (bottomAppBar.fabAnchorMode == 1) {
                            layoutParams.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_bottomappbar_fab_bottom_margin) - measuredHeight);
                        } else if (bottomAppBar.fabAnchorMode == 0) {
                            layoutParams.bottomMargin = ((bottomAppBar.getMeasuredHeight() + bottomAppBar.getBottomInset()) - view.getMeasuredHeight()) / 2;
                        }
                        layoutParams.leftMargin = bottomAppBar.getLeftInset();
                        layoutParams.rightMargin = bottomAppBar.getRightInset();
                        if (com.google.android.material.internal.ViewUtils.isLayoutRtl(view)) {
                            layoutParams.leftMargin += bottomAppBar.fabOffsetEndMode;
                        } else {
                            layoutParams.rightMargin += bottomAppBar.fabOffsetEndMode;
                        }
                    }
                }
            };
            this.fabContentRect = new android.graphics.Rect();
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.fabLayoutListener = new android.view.View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    boolean z;
                    com.google.android.material.bottomappbar.BottomAppBar bottomAppBar = (com.google.android.material.bottomappbar.BottomAppBar) com.google.android.material.bottomappbar.BottomAppBar.Behavior.this.viewRef.get();
                    if (bottomAppBar == null || (!((z = view instanceof com.google.android.material.floatingactionbutton.FloatingActionButton)) && !(view instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (z) {
                        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = (com.google.android.material.floatingactionbutton.FloatingActionButton) view;
                        floatingActionButton.getMeasuredContentRect(com.google.android.material.bottomappbar.BottomAppBar.Behavior.this.fabContentRect);
                        height = com.google.android.material.bottomappbar.BottomAppBar.Behavior.this.fabContentRect.height();
                        bottomAppBar.setFabDiameter(height);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().getTopLeftCornerSize().getCornerSize(new android.graphics.RectF(com.google.android.material.bottomappbar.BottomAppBar.Behavior.this.fabContentRect)));
                    }
                    androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view.getLayoutParams();
                    if (com.google.android.material.bottomappbar.BottomAppBar.Behavior.this.originalBottomMargin == 0) {
                        int measuredHeight = (view.getMeasuredHeight() - height) / 2;
                        if (bottomAppBar.fabAnchorMode == 1) {
                            layoutParams.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_bottomappbar_fab_bottom_margin) - measuredHeight);
                        } else if (bottomAppBar.fabAnchorMode == 0) {
                            layoutParams.bottomMargin = ((bottomAppBar.getMeasuredHeight() + bottomAppBar.getBottomInset()) - view.getMeasuredHeight()) / 2;
                        }
                        layoutParams.leftMargin = bottomAppBar.getLeftInset();
                        layoutParams.rightMargin = bottomAppBar.getRightInset();
                        if (com.google.android.material.internal.ViewUtils.isLayoutRtl(view)) {
                            layoutParams.leftMargin += bottomAppBar.fabOffsetEndMode;
                        } else {
                            layoutParams.rightMargin += bottomAppBar.fabOffsetEndMode;
                        }
                    }
                }
            };
            this.fabContentRect = new android.graphics.Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.bottomappbar.BottomAppBar bottomAppBar, int i) {
            this.viewRef = new java.lang.ref.WeakReference<>(bottomAppBar);
            android.view.View viewFindDependentView = bottomAppBar.findDependentView();
            if (viewFindDependentView != null && !androidx.core.view.ViewCompat.isLaidOut(viewFindDependentView)) {
                com.google.android.material.bottomappbar.BottomAppBar.updateFabAnchorGravity(bottomAppBar, viewFindDependentView);
                this.originalBottomMargin = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) viewFindDependentView.getLayoutParams()).bottomMargin;
                if (viewFindDependentView instanceof com.google.android.material.floatingactionbutton.FloatingActionButton) {
                    com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = (com.google.android.material.floatingactionbutton.FloatingActionButton) viewFindDependentView;
                    if (bottomAppBar.fabAnchorMode == 0 && bottomAppBar.removeEmbeddedFabElevation) {
                        androidx.core.view.ViewCompat.setElevation(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(com.google.android.material.R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(com.google.android.material.R.animator.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar.addFabAnimationListeners(floatingActionButton);
                }
                viewFindDependentView.addOnLayoutChangeListener(this.fabLayoutListener);
                bottomAppBar.setCutoutStateAndTranslateFab();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.bottomappbar.BottomAppBar bottomAppBar, android.view.View view, android.view.View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.bottomappbar.BottomAppBar.SavedState savedState = new com.google.android.material.bottomappbar.BottomAppBar.SavedState(super.onSaveInstanceState());
        savedState.fabAlignmentMode = this.fabAlignmentMode;
        savedState.fabAttached = this.fabAttached;
        return savedState;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.bottomappbar.BottomAppBar.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.bottomappbar.BottomAppBar.SavedState savedState = (com.google.android.material.bottomappbar.BottomAppBar.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.fabAlignmentMode = savedState.fabAlignmentMode;
        this.fabAttached = savedState.fabAttached;
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomappbar.BottomAppBar.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.bottomappbar.BottomAppBar.SavedState>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.bottomappbar.BottomAppBar.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.bottomappbar.BottomAppBar.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomappbar.BottomAppBar.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.bottomappbar.BottomAppBar.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.bottomappbar.BottomAppBar.SavedState[] newArray(int i) {
                return new com.google.android.material.bottomappbar.BottomAppBar.SavedState[i];
            }
        };
        int fabAlignmentMode;
        boolean fabAttached;

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.fabAlignmentMode = parcel.readInt();
            this.fabAttached = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.fabAlignmentMode);
            parcel.writeInt(this.fabAttached ? 1 : 0);
        }
    }
}
