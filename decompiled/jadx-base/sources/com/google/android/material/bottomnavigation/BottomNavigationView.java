package com.google.android.material.bottomnavigation;

/* JADX INFO: loaded from: classes5.dex */
public class BottomNavigationView extends com.google.android.material.navigation.NavigationBarView {
    static final int MAX_ITEM_COUNT = 5;

    @java.lang.Deprecated
    public interface OnNavigationItemReselectedListener extends com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener {
    }

    @java.lang.Deprecated
    public interface OnNavigationItemSelectedListener extends com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener {
    }

    private boolean shouldDrawCompatibilityTopDivider() {
        return false;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    public BottomNavigationView(android.content.Context context) {
        this(context, null);
    }

    public BottomNavigationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, com.google.android.material.R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.content.Context context2 = getContext();
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainTintedStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.BottomNavigationView, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.BottomNavigationView_android_minHeight)) {
            setMinimumHeight(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.BottomNavigationView_android_minHeight, 0));
        }
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        if (shouldDrawCompatibilityTopDivider()) {
            addCompatibilityTopDivider(context2);
        }
        applyWindowInsets();
    }

    private void applyWindowInsets() {
        com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(this, new com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, com.google.android.material.internal.ViewUtils.RelativePadding relativePadding) {
                relativePadding.bottom += windowInsetsCompat.getSystemWindowInsetBottom();
                boolean z = androidx.core.view.ViewCompat.getLayoutDirection(view) == 1;
                int systemWindowInsetLeft = windowInsetsCompat.getSystemWindowInsetLeft();
                int systemWindowInsetRight = windowInsetsCompat.getSystemWindowInsetRight();
                relativePadding.start += z ? systemWindowInsetRight : systemWindowInsetLeft;
                int i = relativePadding.end;
                if (!z) {
                    systemWindowInsetLeft = systemWindowInsetRight;
                }
                relativePadding.end = i + systemWindowInsetLeft;
                relativePadding.applyToView(view);
                return windowInsetsCompat;
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, makeMinHeightSpec(i2));
    }

    private int makeMinHeightSpec(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (android.view.View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i;
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(android.view.View.MeasureSpec.getSize(i), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        com.google.android.material.bottomnavigation.BottomNavigationMenuView bottomNavigationMenuView = (com.google.android.material.bottomnavigation.BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.isItemHorizontalTranslationEnabled() != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().updateMenuView(false);
        }
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return ((com.google.android.material.bottomnavigation.BottomNavigationMenuView) getMenuView()).isItemHorizontalTranslationEnabled();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    protected com.google.android.material.navigation.NavigationBarMenuView createNavigationBarMenuView(android.content.Context context) {
        return new com.google.android.material.bottomnavigation.BottomNavigationMenuView(context);
    }

    private void addCompatibilityTopDivider(android.content.Context context) {
        android.view.View view = new android.view.View(context);
        view.setBackgroundColor(androidx.core.content.ContextCompat.getColor(context, com.google.android.material.R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    @java.lang.Deprecated
    public void setOnNavigationItemSelectedListener(com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        setOnItemSelectedListener(onNavigationItemSelectedListener);
    }

    @java.lang.Deprecated
    public void setOnNavigationItemReselectedListener(com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        setOnItemReselectedListener(onNavigationItemReselectedListener);
    }
}
