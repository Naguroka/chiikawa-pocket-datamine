package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes5.dex */
public class CollapsingToolbarLayout extends android.widget.FrameLayout {
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_CollapsingToolbar;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;
    final com.google.android.material.internal.CollapsingTextHelper collapsingTextHelper;
    private boolean collapsingTitleEnabled;
    private android.graphics.drawable.Drawable contentScrim;
    int currentOffset;
    private boolean drawCollapsingTitle;
    private android.view.View dummyView;
    final com.google.android.material.elevation.ElevationOverlayProvider elevationOverlayProvider;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    private int extraMultilineHeight;
    private boolean extraMultilineHeightEnabled;
    private boolean forceApplySystemWindowInsetTop;
    androidx.core.view.WindowInsetsCompat lastInsets;
    private com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    private boolean refreshToolbar;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private android.animation.ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;
    android.graphics.drawable.Drawable statusBarScrim;
    private int titleCollapseMode;
    private final android.graphics.Rect tmpRect;
    private android.view.ViewGroup toolbar;
    private android.view.View toolbarDirectChild;
    private int toolbarId;
    private int topInsetApplied;

    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(android.content.Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.collapsingToolbarLayoutStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.refreshToolbar = true;
        this.tmpRect = new android.graphics.Rect();
        this.scrimVisibleHeightTrigger = -1;
        this.topInsetApplied = 0;
        this.extraMultilineHeight = 0;
        android.content.Context context2 = getContext();
        com.google.android.material.internal.CollapsingTextHelper collapsingTextHelper = new com.google.android.material.internal.CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        collapsingTextHelper.setTextSizeInterpolator(com.google.android.material.animation.AnimationUtils.DECELERATE_INTERPOLATOR);
        collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(false);
        this.elevationOverlayProvider = new com.google.android.material.elevation.ElevationOverlayProvider(context2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.CollapsingToolbarLayout, i, i2, new int[0]);
        collapsingTextHelper.setExpandedTextGravity(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        collapsingTextHelper.setCollapsedTextGravity(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.expandedMarginBottom = dimensionPixelSize;
        this.expandedMarginEnd = dimensionPixelSize;
        this.expandedMarginTop = dimensionPixelSize;
        this.expandedMarginStart = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.expandedMarginStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.expandedMarginEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.expandedMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.expandedMarginBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.collapsingTitleEnabled = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes.getText(com.google.android.material.R.styleable.CollapsingToolbarLayout_title));
        collapsingTextHelper.setExpandedTextAppearance(com.google.android.material.R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        collapsingTextHelper.setCollapsedTextAppearance(androidx.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            collapsingTextHelper.setExpandedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            collapsingTextHelper.setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.CollapsingToolbarLayout_titleTextEllipsize)) {
            setTitleEllipsize(convertEllipsizeToTruncateAt(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.CollapsingToolbarLayout_titleTextEllipsize, -1)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleTextColor)) {
            collapsingTextHelper.setExpandedTextColor(com.google.android.material.resources.MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor)) {
            collapsingTextHelper.setCollapsedTextColor(com.google.android.material.resources.MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor));
        }
        this.scrimVisibleHeightTrigger = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.CollapsingToolbarLayout_maxLines)) {
            collapsingTextHelper.setMaxLines(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.CollapsingToolbarLayout_maxLines, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.CollapsingToolbarLayout_titlePositionInterpolator)) {
            collapsingTextHelper.setPositionInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.CollapsingToolbarLayout_titlePositionInterpolator, 0)));
        }
        this.scrimAnimationDuration = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(com.google.android.material.R.styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(com.google.android.material.R.styleable.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.toolbarId = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.CollapsingToolbarLayout_toolbarId, -1);
        this.forceApplySystemWindowInsetTop = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.extraMultilineHeightEnabled = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(this, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                return com.google.android.material.appbar.CollapsingToolbarLayout.this.onWindowInsetChanged(windowInsetsCompat);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.ViewParent parent = getParent();
        if (parent instanceof com.google.android.material.appbar.AppBarLayout) {
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) parent;
            disableLiftOnScrollIfNeeded(appBarLayout);
            androidx.core.view.ViewCompat.setFitsSystemWindows(this, androidx.core.view.ViewCompat.getFitsSystemWindows(appBarLayout));
            if (this.onOffsetChangedListener == null) {
                this.onOffsetChangedListener = new com.google.android.material.appbar.CollapsingToolbarLayout.OffsetUpdateListener();
            }
            appBarLayout.addOnOffsetChangedListener(this.onOffsetChangedListener);
            androidx.core.view.ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        android.view.ViewParent parent = getParent();
        com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.onOffsetChangedListener;
        if (onOffsetChangedListener != null && (parent instanceof com.google.android.material.appbar.AppBarLayout)) {
            ((com.google.android.material.appbar.AppBarLayout) parent).removeOnOffsetChangedListener(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    androidx.core.view.WindowInsetsCompat onWindowInsetChanged(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        androidx.core.view.WindowInsetsCompat windowInsetsCompat2 = androidx.core.view.ViewCompat.getFitsSystemWindows(this) ? windowInsetsCompat : null;
        if (!androidx.core.util.ObjectsCompat.equals(this.lastInsets, windowInsetsCompat2)) {
            this.lastInsets = windowInsetsCompat2;
            requestLayout();
        }
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable;
        super.draw(canvas);
        ensureToolbar();
        if (this.toolbar == null && (drawable = this.contentScrim) != null && this.scrimAlpha > 0) {
            drawable.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
        }
        if (this.collapsingTitleEnabled && this.drawCollapsingTitle) {
            if (this.toolbar != null && this.contentScrim != null && this.scrimAlpha > 0 && isTitleCollapseFadeMode() && this.collapsingTextHelper.getExpansionFraction() < this.collapsingTextHelper.getFadeModeThresholdFraction()) {
                int iSave = canvas.save();
                canvas.clipRect(this.contentScrim.getBounds(), android.graphics.Region.Op.DIFFERENCE);
                this.collapsingTextHelper.draw(canvas);
                canvas.restoreToCount(iSave);
            } else {
                this.collapsingTextHelper.draw(canvas);
            }
        }
        if (this.statusBarScrim == null || this.scrimAlpha <= 0) {
            return;
        }
        androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.statusBarScrim.setBounds(0, -this.currentOffset, getWidth(), systemWindowInsetTop - this.currentOffset);
            this.statusBarScrim.mutate().setAlpha(this.scrimAlpha);
            this.statusBarScrim.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        boolean z;
        if (this.contentScrim == null || this.scrimAlpha <= 0 || !isToolbarChild(view)) {
            z = false;
        } else {
            updateContentScrimBounds(this.contentScrim, view, getWidth(), getHeight());
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        android.graphics.drawable.Drawable drawable = this.contentScrim;
        if (drawable != null) {
            updateContentScrimBounds(drawable, i, i2);
        }
    }

    private boolean isTitleCollapseFadeMode() {
        return this.titleCollapseMode == 1;
    }

    private void disableLiftOnScrollIfNeeded(com.google.android.material.appbar.AppBarLayout appBarLayout) {
        if (isTitleCollapseFadeMode()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void updateContentScrimBounds(android.graphics.drawable.Drawable drawable, int i, int i2) {
        updateContentScrimBounds(drawable, this.toolbar, i, i2);
    }

    private void updateContentScrimBounds(android.graphics.drawable.Drawable drawable, android.view.View view, int i, int i2) {
        if (isTitleCollapseFadeMode() && view != null && this.collapsingTitleEnabled) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private void ensureToolbar() {
        if (this.refreshToolbar) {
            android.view.ViewGroup viewGroup = null;
            this.toolbar = null;
            this.toolbarDirectChild = null;
            int i = this.toolbarId;
            if (i != -1) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById(i);
                this.toolbar = viewGroup2;
                if (viewGroup2 != null) {
                    this.toolbarDirectChild = findDirectChild(viewGroup2);
                }
            }
            if (this.toolbar == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    android.view.View childAt = getChildAt(i2);
                    if (isToolbar(childAt)) {
                        viewGroup = (android.view.ViewGroup) childAt;
                        break;
                    }
                }
                this.toolbar = viewGroup;
            }
            updateDummyView();
            this.refreshToolbar = false;
        }
    }

    private static boolean isToolbar(android.view.View view) {
        return (view instanceof androidx.appcompat.widget.Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean isToolbarChild(android.view.View view) {
        android.view.View view2 = this.toolbarDirectChild;
        if (view2 == null || view2 == this) {
            if (view == this.toolbar) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    private android.view.View findDirectChild(android.view.View view) {
        for (android.view.ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof android.view.View) {
                view = parent;
            }
        }
        return view;
    }

    private void updateDummyView() {
        android.view.View view;
        if (!this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.dummyView);
            }
        }
        if (!this.collapsingTitleEnabled || this.toolbar == null) {
            return;
        }
        if (this.dummyView == null) {
            this.dummyView = new android.view.View(getContext());
        }
        if (this.dummyView.getParent() == null) {
            this.toolbar.addView(this.dummyView, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        ensureToolbar();
        super.onMeasure(i, i2);
        int mode = android.view.View.MeasureSpec.getMode(i2);
        androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if ((mode == 0 || this.forceApplySystemWindowInsetTop) && systemWindowInsetTop > 0) {
            this.topInsetApplied = systemWindowInsetTop;
            super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + systemWindowInsetTop, 1073741824));
        }
        if (this.extraMultilineHeightEnabled && this.collapsingTextHelper.getMaxLines() > 1) {
            updateTitleFromToolbarIfNeeded();
            updateTextBounds(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int expandedLineCount = this.collapsingTextHelper.getExpandedLineCount();
            if (expandedLineCount > 1) {
                this.extraMultilineHeight = java.lang.Math.round(this.collapsingTextHelper.getExpandedTextFullHeight()) * (expandedLineCount - 1);
                super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.extraMultilineHeight, 1073741824));
            }
        }
        android.view.ViewGroup viewGroup = this.toolbar;
        if (viewGroup != null) {
            android.view.View view = this.toolbarDirectChild;
            if (view == null || view == this) {
                setMinimumHeight(getHeightWithMargins(viewGroup));
            } else {
                setMinimumHeight(getHeightWithMargins(view));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                android.view.View childAt = getChildAt(i5);
                if (!androidx.core.view.ViewCompat.getFitsSystemWindows(childAt) && childAt.getTop() < systemWindowInsetTop) {
                    androidx.core.view.ViewCompat.offsetTopAndBottom(childAt, systemWindowInsetTop);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            getViewOffsetHelper(getChildAt(i6)).onViewLayout();
        }
        updateTextBounds(i, i2, i3, i4, false);
        updateTitleFromToolbarIfNeeded();
        updateScrimVisibility();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            getViewOffsetHelper(getChildAt(i7)).applyOffsets();
        }
    }

    private void updateTextBounds(int i, int i2, int i3, int i4, boolean z) {
        android.view.View view;
        if (!this.collapsingTitleEnabled || (view = this.dummyView) == null) {
            return;
        }
        boolean z2 = androidx.core.view.ViewCompat.isAttachedToWindow(view) && this.dummyView.getVisibility() == 0;
        this.drawCollapsingTitle = z2;
        if (z2 || z) {
            boolean z3 = androidx.core.view.ViewCompat.getLayoutDirection(this) == 1;
            updateCollapsedBounds(z3);
            this.collapsingTextHelper.setExpandedBounds(z3 ? this.expandedMarginEnd : this.expandedMarginStart, this.tmpRect.top + this.expandedMarginTop, (i3 - i) - (z3 ? this.expandedMarginStart : this.expandedMarginEnd), (i4 - i2) - this.expandedMarginBottom);
            this.collapsingTextHelper.recalculate(z);
        }
    }

    private void updateTitleFromToolbarIfNeeded() {
        if (this.toolbar != null && this.collapsingTitleEnabled && android.text.TextUtils.isEmpty(this.collapsingTextHelper.getText())) {
            setTitle(getToolbarTitle(this.toolbar));
        }
    }

    private void updateCollapsedBounds(boolean z) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        android.view.View view = this.toolbarDirectChild;
        if (view == null) {
            view = this.toolbar;
        }
        int maxOffsetForPinChild = getMaxOffsetForPinChild(view);
        com.google.android.material.internal.DescendantOffsetUtils.getDescendantRect(this, this.dummyView, this.tmpRect);
        android.view.ViewGroup viewGroup = this.toolbar;
        if (viewGroup instanceof androidx.appcompat.widget.Toolbar) {
            androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else {
            android.view.ViewGroup viewGroup2 = this.toolbar;
            if (viewGroup2 instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup2;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginStart = 0;
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
        }
        com.google.android.material.internal.CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        int i = this.tmpRect.left + (z ? titleMarginEnd : titleMarginStart);
        int i2 = this.tmpRect.top + maxOffsetForPinChild + titleMarginTop;
        int i3 = this.tmpRect.right;
        if (!z) {
            titleMarginStart = titleMarginEnd;
        }
        collapsingTextHelper.setCollapsedBounds(i, i2, i3 - titleMarginStart, (this.tmpRect.bottom + maxOffsetForPinChild) - titleMarginBottom);
    }

    private static java.lang.CharSequence getToolbarTitle(android.view.View view) {
        if (view instanceof androidx.appcompat.widget.Toolbar) {
            return ((androidx.appcompat.widget.Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    private static int getHeightWithMargins(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    static com.google.android.material.appbar.ViewOffsetHelper getViewOffsetHelper(android.view.View view) {
        com.google.android.material.appbar.ViewOffsetHelper viewOffsetHelper = (com.google.android.material.appbar.ViewOffsetHelper) view.getTag(com.google.android.material.R.id.view_offset_helper);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        com.google.android.material.appbar.ViewOffsetHelper viewOffsetHelper2 = new com.google.android.material.appbar.ViewOffsetHelper(view);
        view.setTag(com.google.android.material.R.id.view_offset_helper, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.collapsingTextHelper.setText(charSequence);
        updateContentDescriptionFromTitle();
    }

    public java.lang.CharSequence getTitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingTextHelper.getText();
        }
        return null;
    }

    public void setTitleCollapseMode(int i) {
        this.titleCollapseMode = i;
        boolean zIsTitleCollapseFadeMode = isTitleCollapseFadeMode();
        this.collapsingTextHelper.setFadeModeEnabled(zIsTitleCollapseFadeMode);
        android.view.ViewParent parent = getParent();
        if (parent instanceof com.google.android.material.appbar.AppBarLayout) {
            disableLiftOnScrollIfNeeded((com.google.android.material.appbar.AppBarLayout) parent);
        }
        if (zIsTitleCollapseFadeMode && this.contentScrim == null) {
            setContentScrimColor(this.elevationOverlayProvider.compositeOverlayWithThemeSurfaceColorIfNeeded(getResources().getDimension(com.google.android.material.R.dimen.design_appbar_elevation)));
        }
    }

    public int getTitleCollapseMode() {
        return this.titleCollapseMode;
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.collapsingTitleEnabled) {
            this.collapsingTitleEnabled = z;
            updateContentDescriptionFromTitle();
            updateDummyView();
            requestLayout();
        }
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    public void setTitleEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        this.collapsingTextHelper.setTitleTextEllipsize(truncateAt);
    }

    public android.text.TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.collapsingTextHelper.getTitleTextEllipsize();
    }

    private android.text.TextUtils.TruncateAt convertEllipsizeToTruncateAt(int i) {
        if (i == 0) {
            return android.text.TextUtils.TruncateAt.START;
        }
        if (i == 1) {
            return android.text.TextUtils.TruncateAt.MIDDLE;
        }
        if (i == 3) {
            return android.text.TextUtils.TruncateAt.MARQUEE;
        }
        return android.text.TextUtils.TruncateAt.END;
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, androidx.core.view.ViewCompat.isLaidOut(this) && !isInEditMode());
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.scrimsAreShown != z) {
            if (z2) {
                animateScrim(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.scrimsAreShown = z;
        }
    }

    private void animateScrim(int i) {
        android.animation.TimeInterpolator timeInterpolator;
        ensureToolbar();
        android.animation.ValueAnimator valueAnimator = this.scrimAnimator;
        if (valueAnimator == null) {
            android.animation.ValueAnimator valueAnimator2 = new android.animation.ValueAnimator();
            this.scrimAnimator = valueAnimator2;
            if (i > this.scrimAlpha) {
                timeInterpolator = com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
            } else {
                timeInterpolator = com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.scrimAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator3) {
                    com.google.android.material.appbar.CollapsingToolbarLayout.this.setScrimAlpha(((java.lang.Integer) valueAnimator3.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.scrimAnimator.cancel();
        }
        this.scrimAnimator.setDuration(this.scrimAnimationDuration);
        this.scrimAnimator.setIntValues(this.scrimAlpha, i);
        this.scrimAnimator.start();
    }

    void setScrimAlpha(int i) {
        android.view.ViewGroup viewGroup;
        if (i != this.scrimAlpha) {
            if (this.contentScrim != null && (viewGroup = this.toolbar) != null) {
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(viewGroup);
            }
            this.scrimAlpha = i;
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public void setContentScrim(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.contentScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            android.graphics.drawable.Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.contentScrim = drawableMutate;
            if (drawableMutate != null) {
                updateContentScrimBounds(drawableMutate, getWidth(), getHeight());
                this.contentScrim.setCallback(this);
                this.contentScrim.setAlpha(this.scrimAlpha);
            }
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new android.graphics.drawable.ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(androidx.core.content.ContextCompat.getDrawable(getContext(), i));
    }

    public android.graphics.drawable.Drawable getContentScrim() {
        return this.contentScrim;
    }

    public void setStatusBarScrim(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            android.graphics.drawable.Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.statusBarScrim = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.statusBarScrim.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(this.statusBarScrim, androidx.core.view.ViewCompat.getLayoutDirection(this));
                this.statusBarScrim.setVisible(getVisibility() == 0, false);
                this.statusBarScrim.setCallback(this);
                this.statusBarScrim.setAlpha(this.scrimAlpha);
            }
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.statusBarScrim;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        android.graphics.drawable.Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (collapsingTextHelper != null) {
            state |= collapsingTextHelper.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.contentScrim || drawable == this.statusBarScrim;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        android.graphics.drawable.Drawable drawable = this.statusBarScrim;
        if (drawable != null && drawable.isVisible() != z) {
            this.statusBarScrim.setVisible(z, false);
        }
        android.graphics.drawable.Drawable drawable2 = this.contentScrim;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.contentScrim.setVisible(z, false);
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new android.graphics.drawable.ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(androidx.core.content.ContextCompat.getDrawable(getContext(), i));
    }

    public android.graphics.drawable.Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(android.content.res.ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(android.content.res.ColorStateList colorStateList) {
        this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
    }

    public void setCollapsedTitleGravity(int i) {
        this.collapsingTextHelper.setCollapsedTextGravity(i);
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTextHelper.getCollapsedTextGravity();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.collapsingTextHelper.setExpandedTextAppearance(i);
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(android.content.res.ColorStateList.valueOf(i));
    }

    public void setExpandedTitleTextColor(android.content.res.ColorStateList colorStateList) {
        this.collapsingTextHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleGravity(int i) {
        this.collapsingTextHelper.setExpandedTextGravity(i);
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTextHelper.getExpandedTextGravity();
    }

    public void setCollapsedTitleTypeface(android.graphics.Typeface typeface) {
        this.collapsingTextHelper.setCollapsedTypeface(typeface);
    }

    public android.graphics.Typeface getCollapsedTitleTypeface() {
        return this.collapsingTextHelper.getCollapsedTypeface();
    }

    public void setExpandedTitleTypeface(android.graphics.Typeface typeface) {
        this.collapsingTextHelper.setExpandedTypeface(typeface);
    }

    public android.graphics.Typeface getExpandedTitleTypeface() {
        return this.collapsingTextHelper.getExpandedTypeface();
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.expandedMarginStart = i;
        this.expandedMarginTop = i2;
        this.expandedMarginEnd = i3;
        this.expandedMarginBottom = i4;
        requestLayout();
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public void setExpandedTitleMarginStart(int i) {
        this.expandedMarginStart = i;
        requestLayout();
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    public void setExpandedTitleMarginTop(int i) {
        this.expandedMarginTop = i;
        requestLayout();
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.expandedMarginEnd = i;
        requestLayout();
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.expandedMarginBottom = i;
        requestLayout();
    }

    public void setMaxLines(int i) {
        this.collapsingTextHelper.setMaxLines(i);
    }

    public int getMaxLines() {
        return this.collapsingTextHelper.getMaxLines();
    }

    public int getLineCount() {
        return this.collapsingTextHelper.getLineCount();
    }

    public void setLineSpacingAdd(float f) {
        this.collapsingTextHelper.setLineSpacingAdd(f);
    }

    public float getLineSpacingAdd() {
        return this.collapsingTextHelper.getLineSpacingAdd();
    }

    public void setLineSpacingMultiplier(float f) {
        this.collapsingTextHelper.setLineSpacingMultiplier(f);
    }

    public float getLineSpacingMultiplier() {
        return this.collapsingTextHelper.getLineSpacingMultiplier();
    }

    public void setHyphenationFrequency(int i) {
        this.collapsingTextHelper.setHyphenationFrequency(i);
    }

    public int getHyphenationFrequency() {
        return this.collapsingTextHelper.getHyphenationFrequency();
    }

    public void setStaticLayoutBuilderConfigurer(com.google.android.material.appbar.CollapsingToolbarLayout.StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.collapsingTextHelper.setStaticLayoutBuilderConfigurer(staticLayoutBuilderConfigurer);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(z);
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.collapsingTextHelper.isRtlTextDirectionHeuristicsEnabled();
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.forceApplySystemWindowInsetTop = z;
    }

    public boolean isForceApplySystemWindowInsetTop() {
        return this.forceApplySystemWindowInsetTop;
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.extraMultilineHeightEnabled = z;
    }

    public boolean isExtraMultilineHeightEnabled() {
        return this.extraMultilineHeightEnabled;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.scrimVisibleHeightTrigger != i) {
            this.scrimVisibleHeightTrigger = i;
            updateScrimVisibility();
        }
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.scrimVisibleHeightTrigger;
        if (i >= 0) {
            return i + this.topInsetApplied + this.extraMultilineHeight;
        }
        androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        int minimumHeight = androidx.core.view.ViewCompat.getMinimumHeight(this);
        if (minimumHeight > 0) {
            return java.lang.Math.min((minimumHeight * 2) + systemWindowInsetTop, getHeight());
        }
        return getHeight() / 3;
    }

    public void setTitlePositionInterpolator(android.animation.TimeInterpolator timeInterpolator) {
        this.collapsingTextHelper.setPositionInterpolator(timeInterpolator);
    }

    public android.animation.TimeInterpolator getTitlePositionInterpolator() {
        return this.collapsingTextHelper.getPositionInterpolator();
    }

    public void setScrimAnimationDuration(long j) {
        this.scrimAnimationDuration = j;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams generateDefaultLayoutParams() {
        return new com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams(layoutParams);
    }

    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        int collapseMode;
        float parallaxMult;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.CollapsingToolbarLayout_Layout);
            this.collapseMode = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(typedArrayObtainStyledAttributes.getFloat(com.google.android.material.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2, i3);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(android.widget.FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams layoutParams) {
            super((android.widget.FrameLayout.LayoutParams) layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            this.collapseMode = layoutParams.collapseMode;
            this.parallaxMult = layoutParams.parallaxMult;
        }

        public void setCollapseMode(int i) {
            this.collapseMode = i;
        }

        public int getCollapseMode() {
            return this.collapseMode;
        }

        public void setParallaxMultiplier(float f) {
            this.parallaxMult = f;
        }

        public float getParallaxMultiplier() {
            return this.parallaxMult;
        }
    }

    final void updateScrimVisibility() {
        if (this.contentScrim == null && this.statusBarScrim == null) {
            return;
        }
        setScrimsShown(getHeight() + this.currentOffset < getScrimVisibleHeightTrigger());
    }

    final int getMaxOffsetForPinChild(android.view.View view) {
        return ((getHeight() - getViewOffsetHelper(view).getLayoutTop()) - view.getHeight()) - ((com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    private void updateContentDescriptionFromTitle() {
        setContentDescription(getTitle());
    }

    private class OffsetUpdateListener implements com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener {
        OffsetUpdateListener() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(com.google.android.material.appbar.AppBarLayout appBarLayout, int i) {
            com.google.android.material.appbar.CollapsingToolbarLayout.this.currentOffset = i;
            int systemWindowInsetTop = com.google.android.material.appbar.CollapsingToolbarLayout.this.lastInsets != null ? com.google.android.material.appbar.CollapsingToolbarLayout.this.lastInsets.getSystemWindowInsetTop() : 0;
            int childCount = com.google.android.material.appbar.CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = com.google.android.material.appbar.CollapsingToolbarLayout.this.getChildAt(i2);
                com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams layoutParams = (com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams();
                com.google.android.material.appbar.ViewOffsetHelper viewOffsetHelper = com.google.android.material.appbar.CollapsingToolbarLayout.getViewOffsetHelper(childAt);
                int i3 = layoutParams.collapseMode;
                if (i3 == 1) {
                    viewOffsetHelper.setTopAndBottomOffset(androidx.core.math.MathUtils.clamp(-i, 0, com.google.android.material.appbar.CollapsingToolbarLayout.this.getMaxOffsetForPinChild(childAt)));
                } else if (i3 == 2) {
                    viewOffsetHelper.setTopAndBottomOffset(java.lang.Math.round((-i) * layoutParams.parallaxMult));
                }
            }
            com.google.android.material.appbar.CollapsingToolbarLayout.this.updateScrimVisibility();
            if (com.google.android.material.appbar.CollapsingToolbarLayout.this.statusBarScrim != null && systemWindowInsetTop > 0) {
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(com.google.android.material.appbar.CollapsingToolbarLayout.this);
            }
            int height = com.google.android.material.appbar.CollapsingToolbarLayout.this.getHeight();
            int minimumHeight = (height - androidx.core.view.ViewCompat.getMinimumHeight(com.google.android.material.appbar.CollapsingToolbarLayout.this)) - systemWindowInsetTop;
            float f = minimumHeight;
            com.google.android.material.appbar.CollapsingToolbarLayout.this.collapsingTextHelper.setFadeModeStartFraction(java.lang.Math.min(1.0f, (height - com.google.android.material.appbar.CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f));
            com.google.android.material.appbar.CollapsingToolbarLayout.this.collapsingTextHelper.setCurrentOffsetY(com.google.android.material.appbar.CollapsingToolbarLayout.this.currentOffset + minimumHeight);
            com.google.android.material.appbar.CollapsingToolbarLayout.this.collapsingTextHelper.setExpansionFraction(java.lang.Math.abs(i) / f);
        }
    }
}
