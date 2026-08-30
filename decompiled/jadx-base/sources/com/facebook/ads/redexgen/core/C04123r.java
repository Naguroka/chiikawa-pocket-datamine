package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C04123r extends com.facebook.ads.redexgen.core.FL {
    public static java.lang.String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C04123r(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        setCarouselLayoutManager(c1199Zs);
    }

    public com.facebook.ads.redexgen.core.TU getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        if (A00[6].length() != 2) {
            throw new java.lang.RuntimeException();
        }
        A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.FL
    public com.facebook.ads.redexgen.core.C1261at getLayoutManager() {
        return (com.facebook.ads.redexgen.core.C1261at) super.getLayoutManager();
    }

    public com.facebook.ads.redexgen.core.AbstractC04394t getOnScrollListener() {
        return new com.facebook.ads.redexgen.core.VX(this);
    }

    private void setCarouselLayoutManager(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        com.facebook.ads.redexgen.core.C1261at c1261at = new com.facebook.ads.redexgen.core.C1261at(c1199Zs, 0, false);
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            c1261at.A1R(true);
        }
        super.setLayoutManager(c1261at);
    }

    @Override // com.facebook.ads.redexgen.core.FL
    public void setLayoutManager(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o) {
    }
}
