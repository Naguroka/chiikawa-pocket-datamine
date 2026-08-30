package com.google.android.material.tabs;

/* JADX INFO: loaded from: classes5.dex */
class FadeTabIndicatorInterpolator extends com.google.android.material.tabs.TabIndicatorInterpolator {
    private static final float FADE_THRESHOLD = 0.5f;

    FadeTabIndicatorInterpolator() {
    }

    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    void updateIndicatorForOffset(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view, android.view.View view2, float f, android.graphics.drawable.Drawable drawable) {
        float fLerp;
        if (f >= 0.5f) {
            view = view2;
        }
        android.graphics.RectF rectFCalculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        if (f < 0.5f) {
            fLerp = com.google.android.material.animation.AnimationUtils.lerp(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            fLerp = com.google.android.material.animation.AnimationUtils.lerp(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) rectFCalculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) rectFCalculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fLerp * 255.0f));
    }
}
