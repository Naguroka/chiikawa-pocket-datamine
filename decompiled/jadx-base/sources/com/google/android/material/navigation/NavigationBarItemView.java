package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes5.dex */
public abstract class NavigationBarItemView extends android.widget.FrameLayout implements androidx.appcompat.view.menu.MenuView.ItemView {
    private static final com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform ACTIVE_INDICATOR_LABELED_TRANSFORM;
    private static final com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
    private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};
    private static final int INVALID_ITEM_POSITION = -1;
    private android.animation.ValueAnimator activeIndicatorAnimator;
    private int activeIndicatorDesiredHeight;
    private int activeIndicatorDesiredWidth;
    private boolean activeIndicatorEnabled;
    private int activeIndicatorMarginHorizontal;
    private float activeIndicatorProgress;
    private boolean activeIndicatorResizeable;
    private com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform activeIndicatorTransform;
    private final android.view.View activeIndicatorView;
    private com.google.android.material.badge.BadgeDrawable badgeDrawable;
    private final android.widget.ImageView icon;
    private final android.widget.FrameLayout iconContainer;
    private android.content.res.ColorStateList iconTint;
    private boolean initialized;
    private boolean isShifting;
    android.graphics.drawable.Drawable itemBackground;
    private androidx.appcompat.view.menu.MenuItemImpl itemData;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private int itemPosition;
    private android.content.res.ColorStateList itemRippleColor;
    private final android.view.ViewGroup labelGroup;
    private int labelVisibilityMode;
    private final android.widget.TextView largeLabel;
    private android.graphics.drawable.Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final android.widget.TextView smallLabel;
    private android.graphics.drawable.Drawable wrappedIconDrawable;

    protected abstract int getItemLayoutResId();

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z, char c) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    static {
        ACTIVE_INDICATOR_LABELED_TRANSFORM = new com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform();
        ACTIVE_INDICATOR_UNLABELED_TRANSFORM = new com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorUnlabeledTransform();
    }

    public NavigationBarItemView(android.content.Context context) {
        super(context);
        this.initialized = false;
        this.itemPosition = -1;
        this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        this.activeIndicatorProgress = 0.0f;
        this.activeIndicatorEnabled = false;
        this.activeIndicatorDesiredWidth = 0;
        this.activeIndicatorDesiredHeight = 0;
        this.activeIndicatorResizeable = false;
        this.activeIndicatorMarginHorizontal = 0;
        android.view.LayoutInflater.from(context).inflate(getItemLayoutResId(), (android.view.ViewGroup) this, true);
        this.iconContainer = (android.widget.FrameLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_container);
        this.activeIndicatorView = findViewById(com.google.android.material.R.id.navigation_bar_item_active_indicator_view);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_view);
        this.icon = imageView;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.google.android.material.R.id.navigation_bar_item_labels_group);
        this.labelGroup = viewGroup;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_small_label_view);
        this.smallLabel = textView;
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_large_label_view);
        this.largeLabel = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.itemPaddingTop = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.itemPaddingBottom = viewGroup.getPaddingBottom();
        androidx.core.view.ViewCompat.setImportantForAccessibility(textView, 2);
        androidx.core.view.ViewCompat.setImportantForAccessibility(textView2, 2);
        setFocusable(true);
        calculateTextScaleFactors(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (com.google.android.material.navigation.NavigationBarItemView.this.icon.getVisibility() == 0) {
                        com.google.android.material.navigation.NavigationBarItemView navigationBarItemView = com.google.android.material.navigation.NavigationBarItemView.this;
                        navigationBarItemView.tryUpdateBadgeBounds(navigationBarItemView.icon);
                    }
                }
            });
        }
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return java.lang.Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.labelGroup.getMeasuredWidth() + layoutParams.rightMargin);
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.labelGroup.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, int i) {
        java.lang.CharSequence title;
        this.itemData = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!android.text.TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        if (!android.text.TextUtils.isEmpty(menuItemImpl.getTooltipText())) {
            title = menuItemImpl.getTooltipText();
        } else {
            title = menuItemImpl.getTitle();
        }
        androidx.appcompat.widget.TooltipCompat.setTooltipText(this, title);
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        this.initialized = true;
    }

    void clear() {
        removeBadge();
        this.itemData = null;
        this.activeIndicatorProgress = 0.0f;
        this.initialized = false;
    }

    private android.view.View getIconOrContainer() {
        android.widget.FrameLayout frameLayout = this.iconContainer;
        return frameLayout != null ? frameLayout : this.icon;
    }

    public void setItemPosition(int i) {
        this.itemPosition = i;
    }

    public int getItemPosition() {
        return this.itemPosition;
    }

    public void setShifting(boolean z) {
        if (this.isShifting != z) {
            this.isShifting = z;
            refreshChecked();
        }
    }

    public void setLabelVisibilityMode(int i) {
        if (this.labelVisibilityMode != i) {
            this.labelVisibilityMode = i;
            updateActiveIndicatorTransform();
            updateActiveIndicatorLayoutParams(getWidth());
            refreshChecked();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public androidx.appcompat.view.menu.MenuItemImpl getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(java.lang.CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl == null || android.text.TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl2 = this.itemData;
        if (menuItemImpl2 != null && !android.text.TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.itemData.getTooltipText();
        }
        androidx.appcompat.widget.TooltipCompat.setTooltipText(this, charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    @Override // android.view.View
    protected void onSizeChanged(final int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new java.lang.Runnable() { // from class: com.google.android.material.navigation.NavigationBarItemView.2
            @Override // java.lang.Runnable
            public void run() {
                com.google.android.material.navigation.NavigationBarItemView.this.updateActiveIndicatorLayoutParams(i);
            }
        });
    }

    private void updateActiveIndicatorTransform() {
        if (isActiveIndicatorResizeableAndUnlabeled()) {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
        } else {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveIndicatorProgress(float f, float f2) {
        android.view.View view = this.activeIndicatorView;
        if (view != null) {
            this.activeIndicatorTransform.updateForProgress(f, f2, view);
        }
        this.activeIndicatorProgress = f;
    }

    private void maybeAnimateActiveIndicatorToProgress(final float f) {
        if (!this.activeIndicatorEnabled || !this.initialized || !androidx.core.view.ViewCompat.isAttachedToWindow(this)) {
            setActiveIndicatorProgress(f, f);
            return;
        }
        android.animation.ValueAnimator valueAnimator = this.activeIndicatorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.activeIndicatorAnimator = null;
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.activeIndicatorProgress, f);
        this.activeIndicatorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                com.google.android.material.navigation.NavigationBarItemView.this.setActiveIndicatorProgress(((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue(), f);
            }
        });
        this.activeIndicatorAnimator.setInterpolator(com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(getContext(), com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        this.activeIndicatorAnimator.setDuration(com.google.android.material.motion.MotionUtils.resolveThemeDuration(getContext(), com.google.android.material.R.attr.motionDurationLong2, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
        this.activeIndicatorAnimator.start();
    }

    private void refreshChecked() {
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
        android.widget.TextView textView = this.largeLabel;
        textView.setPivotX(textView.getWidth() / 2);
        android.widget.TextView textView2 = this.largeLabel;
        textView2.setPivotY(textView2.getBaseline());
        android.widget.TextView textView3 = this.smallLabel;
        textView3.setPivotX(textView3.getWidth() / 2);
        android.widget.TextView textView4 = this.smallLabel;
        textView4.setPivotY(textView4.getBaseline());
        maybeAnimateActiveIndicatorToProgress(z ? 1.0f : 0.0f);
        int i = this.labelVisibilityMode;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                    updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                    this.largeLabel.setVisibility(0);
                } else {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                    updateViewPaddingBottom(this.labelGroup, 0);
                    this.largeLabel.setVisibility(4);
                }
                this.smallLabel.setVisibility(4);
            } else if (i == 1) {
                updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                if (z) {
                    setViewTopMarginAndGravity(getIconOrContainer(), (int) (this.itemPaddingTop + this.shiftAmount), 49);
                    setViewScaleValues(this.largeLabel, 1.0f, 1.0f, 0);
                    android.widget.TextView textView5 = this.smallLabel;
                    float f = this.scaleUpFactor;
                    setViewScaleValues(textView5, f, f, 4);
                } else {
                    setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                    android.widget.TextView textView6 = this.largeLabel;
                    float f2 = this.scaleDownFactor;
                    setViewScaleValues(textView6, f2, f2, 4);
                    setViewScaleValues(this.smallLabel, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                this.largeLabel.setVisibility(8);
                this.smallLabel.setVisibility(8);
            }
        } else if (this.isShifting) {
            if (z) {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
                this.largeLabel.setVisibility(0);
            } else {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 17);
                updateViewPaddingBottom(this.labelGroup, 0);
                this.largeLabel.setVisibility(4);
            }
            this.smallLabel.setVisibility(4);
        } else {
            updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
            if (z) {
                setViewTopMarginAndGravity(getIconOrContainer(), (int) (this.itemPaddingTop + this.shiftAmount), 49);
                setViewScaleValues(this.largeLabel, 1.0f, 1.0f, 0);
                android.widget.TextView textView7 = this.smallLabel;
                float f3 = this.scaleUpFactor;
                setViewScaleValues(textView7, f3, f3, 4);
            } else {
                setViewTopMarginAndGravity(getIconOrContainer(), this.itemPaddingTop, 49);
                android.widget.TextView textView8 = this.largeLabel;
                float f4 = this.scaleDownFactor;
                setViewScaleValues(textView8, f4, f4, 4);
                setViewScaleValues(this.smallLabel, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            java.lang.CharSequence title = this.itemData.getTitle();
            if (!android.text.TextUtils.isEmpty(this.itemData.getContentDescription())) {
                title = this.itemData.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((java.lang.Object) title) + ", " + ((java.lang.Object) this.badgeDrawable.getContentDescription()));
        }
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatWrap.setClickable(false);
            accessibilityNodeInfoCompatWrap.removeAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        accessibilityNodeInfoCompatWrap.setRoleDescription(getResources().getString(com.google.android.material.R.string.item_view_role_description));
    }

    private int getItemVisiblePosition() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            android.view.View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof com.google.android.material.navigation.NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private static void setViewTopMarginAndGravity(android.view.View view, int i, int i2) {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private static void setViewScaleValues(android.view.View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private static void updateViewPaddingBottom(android.view.View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.smallLabel.setEnabled(z);
        this.largeLabel.setEnabled(z);
        this.icon.setEnabled(z);
        if (z) {
            androidx.core.view.ViewCompat.setPointerIcon(this, androidx.core.view.PointerIconCompat.getSystemIcon(getContext(), 1002));
        } else {
            androidx.core.view.ViewCompat.setPointerIcon(this, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.itemData.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.originalIconDrawable) {
            return;
        }
        this.originalIconDrawable = drawable;
        if (drawable != null) {
            android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
            this.wrappedIconDrawable = drawable;
            android.content.res.ColorStateList colorStateList = this.iconTint;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, colorStateList);
            }
        }
        this.icon.setImageDrawable(drawable);
    }

    public void setIconTintList(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable;
        this.iconTint = colorStateList;
        if (this.itemData == null || (drawable = this.wrappedIconDrawable) == null) {
            return;
        }
        androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, colorStateList);
        this.wrappedIconDrawable.invalidateSelf();
    }

    public void setIconSize(int i) {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.icon.setLayoutParams(layoutParams);
    }

    public void setTextAppearanceInactive(int i) {
        setTextAppearanceWithoutFontScaling(this.smallLabel, i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextAppearanceActive(int i) {
        setTextAppearanceWithoutFontScaling(this.largeLabel, i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    private static void setTextAppearanceWithoutFontScaling(android.widget.TextView textView, int i) {
        androidx.core.widget.TextViewCompat.setTextAppearance(textView, i);
        int unscaledTextSize = com.google.android.material.resources.MaterialResources.getUnscaledTextSize(textView.getContext(), i, 0);
        if (unscaledTextSize != 0) {
            textView.setTextSize(0, unscaledTextSize);
        }
    }

    public void setTextColor(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
        }
    }

    private void calculateTextScaleFactors(float f, float f2) {
        this.shiftAmount = f - f2;
        this.scaleUpFactor = (f2 * 1.0f) / f;
        this.scaleDownFactor = (f * 1.0f) / f2;
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : androidx.core.content.ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemBackground(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.itemBackground = drawable;
        refreshItemBackground();
    }

    public void setItemRippleColor(android.content.res.ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        refreshItemBackground();
    }

    private void refreshItemBackground() {
        android.graphics.drawable.Drawable drawableCreateItemBackgroundCompat = this.itemBackground;
        android.graphics.drawable.RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.itemRippleColor != null) {
            android.graphics.drawable.Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.activeIndicatorEnabled && getActiveIndicatorDrawable() != null && this.iconContainer != null && activeIndicatorDrawable != null) {
                rippleDrawable = new android.graphics.drawable.RippleDrawable(com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(this.itemRippleColor), null, activeIndicatorDrawable);
                z = false;
            } else if (drawableCreateItemBackgroundCompat == null) {
                drawableCreateItemBackgroundCompat = createItemBackgroundCompat(this.itemRippleColor);
            }
        }
        android.widget.FrameLayout frameLayout = this.iconContainer;
        if (frameLayout != null) {
            androidx.core.view.ViewCompat.setBackground(frameLayout, rippleDrawable);
        }
        androidx.core.view.ViewCompat.setBackground(this, drawableCreateItemBackgroundCompat);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    private static android.graphics.drawable.Drawable createItemBackgroundCompat(android.content.res.ColorStateList colorStateList) {
        return new android.graphics.drawable.RippleDrawable(com.google.android.material.ripple.RippleUtils.convertToRippleDrawableColor(colorStateList), null, null);
    }

    public void setItemPaddingTop(int i) {
        if (this.itemPaddingTop != i) {
            this.itemPaddingTop = i;
            refreshChecked();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.itemPaddingBottom != i) {
            this.itemPaddingBottom = i;
            refreshChecked();
        }
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.activeIndicatorEnabled = z;
        refreshItemBackground();
        android.view.View view = this.activeIndicatorView;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorWidth(int i) {
        this.activeIndicatorDesiredWidth = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateActiveIndicatorLayoutParams(int i) {
        if (this.activeIndicatorView == null) {
            return;
        }
        int iMin = java.lang.Math.min(this.activeIndicatorDesiredWidth, i - (this.activeIndicatorMarginHorizontal * 2));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.activeIndicatorView.getLayoutParams();
        layoutParams.height = isActiveIndicatorResizeableAndUnlabeled() ? iMin : this.activeIndicatorDesiredHeight;
        layoutParams.width = iMin;
        this.activeIndicatorView.setLayoutParams(layoutParams);
    }

    private boolean isActiveIndicatorResizeableAndUnlabeled() {
        return this.activeIndicatorResizeable && this.labelVisibilityMode == 2;
    }

    public void setActiveIndicatorHeight(int i) {
        this.activeIndicatorDesiredHeight = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.activeIndicatorMarginHorizontal = i;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public android.graphics.drawable.Drawable getActiveIndicatorDrawable() {
        android.view.View view = this.activeIndicatorView;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public void setActiveIndicatorDrawable(android.graphics.drawable.Drawable drawable) {
        android.view.View view = this.activeIndicatorView;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        refreshItemBackground();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.widget.FrameLayout frameLayout = this.iconContainer;
        if (frameLayout != null && this.activeIndicatorEnabled) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.activeIndicatorResizeable = z;
    }

    void setBadge(com.google.android.material.badge.BadgeDrawable badgeDrawable) {
        if (this.badgeDrawable == badgeDrawable) {
            return;
        }
        if (hasBadge() && this.icon != null) {
            android.util.Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            tryRemoveBadgeFromAnchor(this.icon);
        }
        this.badgeDrawable = badgeDrawable;
        android.widget.ImageView imageView = this.icon;
        if (imageView != null) {
            tryAttachBadgeToAnchor(imageView);
        }
    }

    public com.google.android.material.badge.BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    void removeBadge() {
        tryRemoveBadgeFromAnchor(this.icon);
    }

    private boolean hasBadge() {
        return this.badgeDrawable != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryUpdateBadgeBounds(android.view.View view) {
        if (hasBadge()) {
            com.google.android.material.badge.BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    private void tryAttachBadgeToAnchor(android.view.View view) {
        if (hasBadge() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            com.google.android.material.badge.BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    private void tryRemoveBadgeFromAnchor(android.view.View view) {
        if (hasBadge()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view);
            }
            this.badgeDrawable = null;
        }
    }

    private android.widget.FrameLayout getCustomParentForBadge(android.view.View view) {
        if (view == this.icon && com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT) {
            return (android.widget.FrameLayout) this.icon.getParent();
        }
        return null;
    }

    private int getSuggestedIconWidth() {
        com.google.android.material.badge.BadgeDrawable badgeDrawable = this.badgeDrawable;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.badgeDrawable.getHorizontalOffset();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return java.lang.Math.max(minimumWidth, layoutParams.leftMargin) + this.icon.getMeasuredWidth() + java.lang.Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private int getSuggestedIconHeight() {
        com.google.android.material.badge.BadgeDrawable badgeDrawable = this.badgeDrawable;
        int minimumHeight = badgeDrawable != null ? badgeDrawable.getMinimumHeight() / 2 : 0;
        return java.lang.Math.max(minimumHeight, ((android.widget.FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.icon.getMeasuredWidth() + minimumHeight;
    }

    protected int getItemBackgroundResId() {
        return com.google.android.material.R.drawable.mtrl_navigation_bar_item_background;
    }

    protected int getItemDefaultMarginResId() {
        return com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    private static class ActiveIndicatorTransform {
        private static final float ALPHA_FRACTION = 0.2f;
        private static final float SCALE_X_HIDDEN = 0.4f;
        private static final float SCALE_X_SHOWN = 1.0f;

        protected float calculateScaleY(float f, float f2) {
            return 1.0f;
        }

        private ActiveIndicatorTransform() {
        }

        protected float calculateAlpha(float f, float f2) {
            return com.google.android.material.animation.AnimationUtils.lerp(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f);
        }

        protected float calculateScaleX(float f, float f2) {
            return com.google.android.material.animation.AnimationUtils.lerp(SCALE_X_HIDDEN, 1.0f, f);
        }

        public void updateForProgress(float f, float f2, android.view.View view) {
            view.setScaleX(calculateScaleX(f, f2));
            view.setScaleY(calculateScaleY(f, f2));
            view.setAlpha(calculateAlpha(f, f2));
        }
    }

    private static class ActiveIndicatorUnlabeledTransform extends com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform {
        private ActiveIndicatorUnlabeledTransform() {
            super();
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
        protected float calculateScaleY(float f, float f2) {
            return calculateScaleX(f, f2);
        }
    }
}
