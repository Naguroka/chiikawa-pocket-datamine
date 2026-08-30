package com.google.android.material.bottomnavigation;

/* JADX INFO: loaded from: classes5.dex */
public class BottomNavigationItemView extends com.google.android.material.navigation.NavigationBarItemView {
    public BottomNavigationItemView(android.content.Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    protected int getItemLayoutResId() {
        return com.google.android.material.R.layout.design_bottom_navigation_item;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    protected int getItemDefaultMarginResId() {
        return com.google.android.material.R.dimen.design_bottom_navigation_margin;
    }
}
