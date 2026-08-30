package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public class PagerSnapHelper extends androidx.recyclerview.widget.SnapHelper {
    private static final int MAX_SCROLL_ON_FLING_DURATION = 100;
    private androidx.recyclerview.widget.OrientationHelper mHorizontalHelper;
    private androidx.recyclerview.widget.OrientationHelper mVerticalHelper;

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(view, getHorizontalHelper(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(view, getVerticalHelper(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return findCenterView(layoutManager, getVerticalHelper(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return findCenterView(layoutManager, getHorizontalHelper(layoutManager));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i, int i2) {
        androidx.recyclerview.widget.OrientationHelper orientationHelper;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0 || (orientationHelper = getOrientationHelper(layoutManager)) == null) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        android.view.View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = layoutManager.getChildAt(i5);
            if (childAt != null) {
                int iDistanceToCenter = distanceToCenter(childAt, orientationHelper);
                if (iDistanceToCenter <= 0 && iDistanceToCenter > i4) {
                    view2 = childAt;
                    i4 = iDistanceToCenter;
                }
                if (iDistanceToCenter >= 0 && iDistanceToCenter < i3) {
                    view = childAt;
                    i3 = iDistanceToCenter;
                }
            }
        }
        boolean zIsForwardFling = isForwardFling(layoutManager, i, i2);
        if (zIsForwardFling && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view) + (isReverseLayout(layoutManager) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    private boolean isForwardFling(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i, int i2) {
        if (layoutManager.canScrollHorizontally()) {
            return i > 0;
        }
        return i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        android.graphics.PointF pointFComputeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) || (pointFComputeScrollVectorForPosition = ((androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    protected androidx.recyclerview.widget.RecyclerView.SmoothScroller createScroller(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new androidx.recyclerview.widget.LinearSmoothScroller(this.mRecyclerView.getContext()) { // from class: androidx.recyclerview.widget.PagerSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                protected void onTargetFound(android.view.View view, androidx.recyclerview.widget.RecyclerView.State state, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action action) {
                    androidx.recyclerview.widget.PagerSnapHelper pagerSnapHelper = androidx.recyclerview.widget.PagerSnapHelper.this;
                    int[] iArrCalculateDistanceToFinalSnap = pagerSnapHelper.calculateDistanceToFinalSnap(pagerSnapHelper.mRecyclerView.getLayoutManager(), view);
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

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected int calculateTimeForScrolling(int i) {
                    return java.lang.Math.min(100, super.calculateTimeForScrolling(i));
                }
            };
        }
        return null;
    }

    private int distanceToCenter(android.view.View view, androidx.recyclerview.widget.OrientationHelper orientationHelper) {
        return (orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2)) - (orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2));
    }

    private android.view.View findCenterView(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        if (childCount == 0) {
            return null;
        }
        int startAfterPadding = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = layoutManager.getChildAt(i2);
            int iAbs = java.lang.Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    private androidx.recyclerview.widget.OrientationHelper getOrientationHelper(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return getVerticalHelper(layoutManager);
        }
        if (layoutManager.canScrollHorizontally()) {
            return getHorizontalHelper(layoutManager);
        }
        return null;
    }

    private androidx.recyclerview.widget.OrientationHelper getVerticalHelper(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        androidx.recyclerview.widget.OrientationHelper orientationHelper = this.mVerticalHelper;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.mVerticalHelper = androidx.recyclerview.widget.OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.mVerticalHelper;
    }

    private androidx.recyclerview.widget.OrientationHelper getHorizontalHelper(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        androidx.recyclerview.widget.OrientationHelper orientationHelper = this.mHorizontalHelper;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.mHorizontalHelper = androidx.recyclerview.widget.OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.mHorizontalHelper;
    }
}
