package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public class LinearSnapHelper extends androidx.recyclerview.widget.SnapHelper {
    private static final float INVALID_DISTANCE = 1.0f;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        android.view.View viewFindSnapView;
        int position;
        int i3;
        android.graphics.PointF pointFComputeScrollVectorForPosition;
        int iEstimateNextPositionDiffForFling;
        int iEstimateNextPositionDiffForFling2;
        if (!(layoutManager instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) || (itemCount = layoutManager.getItemCount()) == 0 || (viewFindSnapView = findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(viewFindSnapView)) == -1 || (pointFComputeScrollVectorForPosition = ((androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition((i3 = itemCount - 1))) == null) {
            return -1;
        }
        if (layoutManager.canScrollHorizontally()) {
            iEstimateNextPositionDiffForFling = estimateNextPositionDiffForFling(layoutManager, getHorizontalHelper(layoutManager), i, 0);
            if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                iEstimateNextPositionDiffForFling = -iEstimateNextPositionDiffForFling;
            }
        } else {
            iEstimateNextPositionDiffForFling = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iEstimateNextPositionDiffForFling2 = estimateNextPositionDiffForFling(layoutManager, getVerticalHelper(layoutManager), 0, i2);
            if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                iEstimateNextPositionDiffForFling2 = -iEstimateNextPositionDiffForFling2;
            }
        } else {
            iEstimateNextPositionDiffForFling2 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iEstimateNextPositionDiffForFling = iEstimateNextPositionDiffForFling2;
        }
        if (iEstimateNextPositionDiffForFling == 0) {
            return -1;
        }
        int i4 = position + iEstimateNextPositionDiffForFling;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= itemCount ? i3 : i5;
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

    private int distanceToCenter(android.view.View view, androidx.recyclerview.widget.OrientationHelper orientationHelper) {
        return (orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2)) - (orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2));
    }

    private int estimateNextPositionDiffForFling(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.OrientationHelper orientationHelper, int i, int i2) {
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i, i2);
        float fComputeDistancePerChild = computeDistancePerChild(layoutManager, orientationHelper);
        if (fComputeDistancePerChild <= 0.0f) {
            return 0;
        }
        return java.lang.Math.round((java.lang.Math.abs(iArrCalculateScrollDistance[0]) > java.lang.Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1]) / fComputeDistancePerChild);
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

    private float computeDistancePerChild(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        android.view.View view = null;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        android.view.View view2 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = layoutManager.getChildAt(i3);
            int position = layoutManager.getPosition(childAt);
            if (position != -1) {
                if (position < i2) {
                    view = childAt;
                    i2 = position;
                }
                if (position > i) {
                    view2 = childAt;
                    i = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int iMax = java.lang.Math.max(orientationHelper.getDecoratedEnd(view), orientationHelper.getDecoratedEnd(view2)) - java.lang.Math.min(orientationHelper.getDecoratedStart(view), orientationHelper.getDecoratedStart(view2));
        if (iMax == 0) {
            return 1.0f;
        }
        return (iMax * 1.0f) / ((i - i2) + 1);
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
