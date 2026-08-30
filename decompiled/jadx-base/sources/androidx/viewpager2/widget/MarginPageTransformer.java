package androidx.viewpager2.widget;

/* JADX INFO: loaded from: classes3.dex */
public final class MarginPageTransformer implements androidx.viewpager2.widget.ViewPager2.PageTransformer {
    private final int mMarginPx;

    public MarginPageTransformer(int i) {
        androidx.core.util.Preconditions.checkArgumentNonnegative(i, "Margin must be non-negative");
        this.mMarginPx = i;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(android.view.View view, float f) {
        androidx.viewpager2.widget.ViewPager2 viewPager2RequireViewPager = requireViewPager(view);
        float f2 = this.mMarginPx * f;
        if (viewPager2RequireViewPager.getOrientation() == 0) {
            if (viewPager2RequireViewPager.isRtl()) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        view.setTranslationY(f2);
    }

    private androidx.viewpager2.widget.ViewPager2 requireViewPager(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        android.view.ViewParent parent2 = parent.getParent();
        if ((parent instanceof androidx.recyclerview.widget.RecyclerView) && (parent2 instanceof androidx.viewpager2.widget.ViewPager2)) {
            return (androidx.viewpager2.widget.ViewPager2) parent2;
        }
        throw new java.lang.IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
