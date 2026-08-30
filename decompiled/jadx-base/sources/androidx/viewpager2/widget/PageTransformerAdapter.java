package androidx.viewpager2.widget;

/* JADX INFO: loaded from: classes3.dex */
final class PageTransformerAdapter extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
    private final androidx.recyclerview.widget.LinearLayoutManager mLayoutManager;
    private androidx.viewpager2.widget.ViewPager2.PageTransformer mPageTransformer;

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i) {
    }

    PageTransformerAdapter(androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.mLayoutManager = linearLayoutManager;
    }

    androidx.viewpager2.widget.ViewPager2.PageTransformer getPageTransformer() {
        return this.mPageTransformer;
    }

    void setPageTransformer(androidx.viewpager2.widget.ViewPager2.PageTransformer pageTransformer) {
        this.mPageTransformer = pageTransformer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i, float f, int i2) {
        if (this.mPageTransformer == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.mLayoutManager.getChildCount(); i3++) {
            android.view.View childAt = this.mLayoutManager.getChildAt(i3);
            if (childAt == null) {
                throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(this.mLayoutManager.getChildCount())));
            }
            this.mPageTransformer.transformPage(childAt, (this.mLayoutManager.getPosition(childAt) - i) + f2);
        }
    }
}
