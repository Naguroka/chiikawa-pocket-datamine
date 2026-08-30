package com.google.android.material.tabs;

/* JADX INFO: loaded from: classes5.dex */
class ElasticTabIndicatorInterpolator extends com.google.android.material.tabs.TabIndicatorInterpolator {
    ElasticTabIndicatorInterpolator() {
    }

    private static float decInterp(float f) {
        return (float) java.lang.Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
    }

    private static float accInterp(float f) {
        return (float) (1.0d - java.lang.Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    void updateIndicatorForOffset(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view, android.view.View view2, float f, android.graphics.drawable.Drawable drawable) {
        float fDecInterp;
        float fAccInterp;
        android.graphics.RectF rectFCalculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        android.graphics.RectF rectFCalculateIndicatorWidthForTab2 = calculateIndicatorWidthForTab(tabLayout, view2);
        if (rectFCalculateIndicatorWidthForTab.left < rectFCalculateIndicatorWidthForTab2.left) {
            fDecInterp = accInterp(f);
            fAccInterp = decInterp(f);
        } else {
            fDecInterp = decInterp(f);
            fAccInterp = accInterp(f);
        }
        drawable.setBounds(com.google.android.material.animation.AnimationUtils.lerp((int) rectFCalculateIndicatorWidthForTab.left, (int) rectFCalculateIndicatorWidthForTab2.left, fDecInterp), drawable.getBounds().top, com.google.android.material.animation.AnimationUtils.lerp((int) rectFCalculateIndicatorWidthForTab.right, (int) rectFCalculateIndicatorWidthForTab2.right, fAccInterp), drawable.getBounds().bottom);
    }
}
