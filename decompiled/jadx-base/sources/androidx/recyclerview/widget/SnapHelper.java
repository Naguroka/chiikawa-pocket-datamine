package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SnapHelper extends androidx.recyclerview.widget.RecyclerView.OnFlingListener {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private android.widget.Scroller mGravityScroller;
    androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener mScrollListener = new androidx.recyclerview.widget.RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.SnapHelper.1
        boolean mScrolled = false;

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.mScrolled) {
                this.mScrolled = false;
                androidx.recyclerview.widget.SnapHelper.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.mScrolled = true;
        }
    };

    public abstract int[] calculateDistanceToFinalSnap(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view);

    public abstract android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager);

    public abstract int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i, int i2);

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i, int i2) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (java.lang.Math.abs(i2) > minFlingVelocity || java.lang.Math.abs(i) > minFlingVelocity) && snapFromFling(layoutManager, i, i2);
    }

    public void attachToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) throws java.lang.IllegalStateException {
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
            this.mGravityScroller = new android.widget.Scroller(this.mRecyclerView.getContext(), new android.view.animation.DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    private void setupCallbacks() throws java.lang.IllegalStateException {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new java.lang.IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    public int[] calculateScrollDistance(int i, int i2) {
        this.mGravityScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    private boolean snapFromFling(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i, int i2) {
        androidx.recyclerview.widget.RecyclerView.SmoothScroller smoothScrollerCreateScroller;
        int iFindTargetSnapPosition;
        if (!(layoutManager instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) || (smoothScrollerCreateScroller = createScroller(layoutManager)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(layoutManager, i, i2)) == -1) {
            return false;
        }
        smoothScrollerCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        layoutManager.startSmoothScroll(smoothScrollerCreateScroller);
        return true;
    }

    void snapToTargetExistingView() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        android.view.View viewFindSnapView;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i = iArrCalculateDistanceToFinalSnap[0];
        if (i == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i, iArrCalculateDistanceToFinalSnap[1]);
    }

    protected androidx.recyclerview.widget.RecyclerView.SmoothScroller createScroller(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        return createSnapScroller(layoutManager);
    }

    @java.lang.Deprecated
    protected androidx.recyclerview.widget.LinearSmoothScroller createSnapScroller(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new androidx.recyclerview.widget.LinearSmoothScroller(this.mRecyclerView.getContext()) { // from class: androidx.recyclerview.widget.SnapHelper.2
                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                protected void onTargetFound(android.view.View view, androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action action) {
                    if (androidx.recyclerview.widget.SnapHelper.this.mRecyclerView == null) {
                        return;
                    }
                    androidx.recyclerview.widget.SnapHelper snapHelper = androidx.recyclerview.widget.SnapHelper.this;
                    int[] iArrCalculateDistanceToFinalSnap = snapHelper.calculateDistanceToFinalSnap(snapHelper.mRecyclerView.getLayoutManager(), view);
                    int i = iArrCalculateDistanceToFinalSnap[0];
                    int i2 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(java.lang.Math.max(java.lang.Math.abs(i), java.lang.Math.abs(i2)));
                    if (iCalculateTimeForDeceleration > 0) {
                        action.update(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected float calculateSpeedPerPixel(android.util.DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }
            };
        }
        return null;
    }
}
