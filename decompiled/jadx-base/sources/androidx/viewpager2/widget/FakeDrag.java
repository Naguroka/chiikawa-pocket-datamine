package androidx.viewpager2.widget;

/* JADX INFO: loaded from: classes3.dex */
final class FakeDrag {
    private int mActualDraggedDistance;
    private long mFakeDragBeginTime;
    private int mMaximumVelocity;
    private final androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private float mRequestedDragDistance;
    private final androidx.viewpager2.widget.ScrollEventAdapter mScrollEventAdapter;
    private android.view.VelocityTracker mVelocityTracker;
    private final androidx.viewpager2.widget.ViewPager2 mViewPager;

    FakeDrag(androidx.viewpager2.widget.ViewPager2 viewPager2, androidx.viewpager2.widget.ScrollEventAdapter scrollEventAdapter, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.mViewPager = viewPager2;
        this.mScrollEventAdapter = scrollEventAdapter;
        this.mRecyclerView = recyclerView;
    }

    boolean isFakeDragging() {
        return this.mScrollEventAdapter.isFakeDragging();
    }

    boolean beginFakeDrag() {
        if (this.mScrollEventAdapter.isDragging()) {
            return false;
        }
        this.mActualDraggedDistance = 0;
        this.mRequestedDragDistance = 0;
        this.mFakeDragBeginTime = android.os.SystemClock.uptimeMillis();
        beginFakeVelocityTracker();
        this.mScrollEventAdapter.notifyBeginFakeDrag();
        if (!this.mScrollEventAdapter.isIdle()) {
            this.mRecyclerView.stopScroll();
        }
        addFakeMotionEvent(this.mFakeDragBeginTime, 0, 0.0f, 0.0f);
        return true;
    }

    boolean fakeDragBy(float f) {
        if (!this.mScrollEventAdapter.isFakeDragging()) {
            return false;
        }
        float f2 = this.mRequestedDragDistance - f;
        this.mRequestedDragDistance = f2;
        int iRound = java.lang.Math.round(f2 - this.mActualDraggedDistance);
        this.mActualDraggedDistance += iRound;
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean z = this.mViewPager.getOrientation() == 0;
        int i = z ? iRound : 0;
        int i2 = z ? 0 : iRound;
        float f3 = z ? this.mRequestedDragDistance : 0.0f;
        float f4 = z ? 0.0f : this.mRequestedDragDistance;
        this.mRecyclerView.scrollBy(i, i2);
        addFakeMotionEvent(jUptimeMillis, 2, f3, f4);
        return true;
    }

    boolean endFakeDrag() {
        if (!this.mScrollEventAdapter.isFakeDragging()) {
            return false;
        }
        this.mScrollEventAdapter.notifyEndFakeDrag();
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
        if (this.mRecyclerView.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.mViewPager.snapToPage();
        return true;
    }

    private void beginFakeVelocityTracker() {
        android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
            this.mMaximumVelocity = android.view.ViewConfiguration.get(this.mViewPager.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
    }

    private void addFakeMotionEvent(long j, int i, float f, float f2) {
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(this.mFakeDragBeginTime, j, i, f, f2, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }
}
