package com.google.android.material.navigationrail;

/* JADX INFO: loaded from: classes5.dex */
final class NavigationRailItemView extends com.google.android.material.navigation.NavigationBarItemView {
    public NavigationRailItemView(android.content.Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (android.view.View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), android.view.View.resolveSizeAndState(java.lang.Math.max(getMeasuredHeight(), android.view.View.MeasureSpec.getSize(i2)), i2, 0));
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    protected int getItemLayoutResId() {
        return com.google.android.material.R.layout.mtrl_navigation_rail_item;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    protected int getItemDefaultMarginResId() {
        return com.google.android.material.R.dimen.mtrl_navigation_rail_icon_margin;
    }
}
