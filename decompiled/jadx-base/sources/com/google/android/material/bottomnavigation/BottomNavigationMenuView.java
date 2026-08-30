package com.google.android.material.bottomnavigation;

/* JADX INFO: loaded from: classes5.dex */
public class BottomNavigationMenuView extends com.google.android.material.navigation.NavigationBarMenuView {
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private boolean itemHorizontalTranslationEnabled;
    private int[] tempChildWidths;

    public BottomNavigationMenuView(android.content.Context context) {
        super(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        android.content.res.Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = resources.getDimensionPixelSize(com.google.android.material.R.dimen.design_bottom_navigation_active_item_min_width);
        this.tempChildWidths = new int[5];
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        androidx.appcompat.view.menu.MenuBuilder menu = getMenu();
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = menu.getVisibleItems().size();
        int childCount = getChildCount();
        int size3 = android.view.View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (isShifting(getLabelVisibilityMode(), size2) && isItemHorizontalTranslationEnabled()) {
            android.view.View childAt = getChildAt(getSelectedItemPosition());
            int iMax = this.activeItemMinWidth;
            if (childAt.getVisibility() != 8) {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = java.lang.Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i3 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = java.lang.Math.min(size - (this.inactiveItemMinWidth * i3), java.lang.Math.min(iMax, this.activeItemMaxWidth));
            int i4 = size - iMin;
            int iMin2 = java.lang.Math.min(i4 / (i3 == 0 ? 1 : i3), this.inactiveItemMaxWidth);
            int i5 = i4 - (i3 * iMin2);
            int i6 = 0;
            while (i6 < childCount) {
                if (getChildAt(i6).getVisibility() != 8) {
                    this.tempChildWidths[i6] = i6 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i5 > 0) {
                        int[] iArr = this.tempChildWidths;
                        iArr[i6] = iArr[i6] + 1;
                        i5--;
                    }
                } else {
                    this.tempChildWidths[i6] = 0;
                }
                i6++;
            }
        } else {
            int iMin3 = java.lang.Math.min(size / (size2 != 0 ? size2 : 1), this.activeItemMaxWidth);
            int i7 = size - (size2 * iMin3);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr2 = this.tempChildWidths;
                    iArr2[i8] = iMin3;
                    if (i7 > 0) {
                        iArr2[i8] = iMin3 + 1;
                        i7--;
                    }
                } else {
                    this.tempChildWidths[i8] = 0;
                }
            }
        }
        int measuredWidth = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            android.view.View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.tempChildWidths[i9], 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(measuredWidth, android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), 0), android.view.View.resolveSizeAndState(size3, i2, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            android.view.View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                if (androidx.core.view.ViewCompat.getLayoutDirection(this) == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.itemHorizontalTranslationEnabled = z;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    protected com.google.android.material.navigation.NavigationBarItemView createNavigationBarItemView(android.content.Context context) {
        return new com.google.android.material.bottomnavigation.BottomNavigationItemView(context);
    }
}
