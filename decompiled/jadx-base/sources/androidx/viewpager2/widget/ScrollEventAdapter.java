package androidx.viewpager2.widget;

/* JADX INFO: loaded from: classes3.dex */
final class ScrollEventAdapter extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    private static final int NO_POSITION = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_PROGRESS_FAKE_DRAG = 4;
    private static final int STATE_IN_PROGRESS_IMMEDIATE_SCROLL = 3;
    private static final int STATE_IN_PROGRESS_MANUAL_DRAG = 1;
    private static final int STATE_IN_PROGRESS_SMOOTH_SCROLL = 2;
    private int mAdapterState;
    private androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback mCallback;
    private boolean mDataSetChangeHappened;
    private boolean mDispatchSelected;
    private int mDragStartPosition;
    private boolean mFakeDragging;
    private final androidx.recyclerview.widget.LinearLayoutManager mLayoutManager;
    private final androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private boolean mScrollHappened;
    private int mScrollState;
    private androidx.viewpager2.widget.ScrollEventAdapter.ScrollEventValues mScrollValues;
    private int mTarget;
    private final androidx.viewpager2.widget.ViewPager2 mViewPager;

    ScrollEventAdapter(androidx.viewpager2.widget.ViewPager2 viewPager2) {
        this.mViewPager = viewPager2;
        androidx.recyclerview.widget.RecyclerView recyclerView = viewPager2.mRecyclerView;
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) recyclerView.getLayoutManager();
        this.mScrollValues = new androidx.viewpager2.widget.ScrollEventAdapter.ScrollEventValues();
        resetState();
    }

    private void resetState() {
        this.mAdapterState = 0;
        this.mScrollState = 0;
        this.mScrollValues.reset();
        this.mDragStartPosition = -1;
        this.mTarget = -1;
        this.mDispatchSelected = false;
        this.mScrollHappened = false;
        this.mFakeDragging = false;
        this.mDataSetChangeHappened = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        boolean z = true;
        if ((this.mAdapterState != 1 || this.mScrollState != 1) && i == 1) {
            startDrag(false);
            return;
        }
        if (isInAnyDraggingState() && i == 2) {
            if (this.mScrollHappened) {
                dispatchStateChanged(2);
                this.mDispatchSelected = true;
                return;
            }
            return;
        }
        if (isInAnyDraggingState() && i == 0) {
            updateScrollEventValues();
            if (!this.mScrollHappened) {
                if (this.mScrollValues.mPosition != -1) {
                    dispatchScrolled(this.mScrollValues.mPosition, 0.0f, 0);
                }
            } else if (this.mScrollValues.mOffsetPx != 0) {
                z = false;
            } else if (this.mDragStartPosition != this.mScrollValues.mPosition) {
                dispatchSelected(this.mScrollValues.mPosition);
            }
            if (z) {
                dispatchStateChanged(0);
                resetState();
            }
        }
        if (this.mAdapterState == 2 && i == 0 && this.mDataSetChangeHappened) {
            updateScrollEventValues();
            if (this.mScrollValues.mOffsetPx == 0) {
                if (this.mTarget != this.mScrollValues.mPosition) {
                    dispatchSelected(this.mScrollValues.mPosition == -1 ? 0 : this.mScrollValues.mPosition);
                }
                dispatchStateChanged(0);
                resetState();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        boolean z;
        this.mScrollHappened = true;
        updateScrollEventValues();
        if (this.mDispatchSelected) {
            this.mDispatchSelected = false;
            if (i2 > 0) {
                z = true;
            } else {
                if (i2 == 0) {
                    if ((i < 0) == this.mViewPager.isRtl()) {
                        z = true;
                    }
                }
                z = false;
            }
            int i3 = (!z || this.mScrollValues.mOffsetPx == 0) ? this.mScrollValues.mPosition : this.mScrollValues.mPosition + 1;
            this.mTarget = i3;
            if (this.mDragStartPosition != i3) {
                dispatchSelected(i3);
            }
        } else if (this.mAdapterState == 0) {
            int i4 = this.mScrollValues.mPosition;
            if (i4 == -1) {
                i4 = 0;
            }
            dispatchSelected(i4);
        }
        dispatchScrolled(this.mScrollValues.mPosition == -1 ? 0 : this.mScrollValues.mPosition, this.mScrollValues.mOffset, this.mScrollValues.mOffsetPx);
        int i5 = this.mScrollValues.mPosition;
        int i6 = this.mTarget;
        if ((i5 == i6 || i6 == -1) && this.mScrollValues.mOffsetPx == 0 && this.mScrollState != 1) {
            dispatchStateChanged(0);
            resetState();
        }
    }

    private void updateScrollEventValues() {
        int top;
        androidx.viewpager2.widget.ScrollEventAdapter.ScrollEventValues scrollEventValues = this.mScrollValues;
        scrollEventValues.mPosition = this.mLayoutManager.findFirstVisibleItemPosition();
        if (scrollEventValues.mPosition == -1) {
            scrollEventValues.reset();
            return;
        }
        android.view.View viewFindViewByPosition = this.mLayoutManager.findViewByPosition(scrollEventValues.mPosition);
        if (viewFindViewByPosition == null) {
            scrollEventValues.reset();
            return;
        }
        int leftDecorationWidth = this.mLayoutManager.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.mLayoutManager.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.mLayoutManager.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.mLayoutManager.getBottomDecorationHeight(viewFindViewByPosition);
        android.view.ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.mLayoutManager.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.mRecyclerView.getPaddingLeft();
            if (this.mViewPager.isRtl()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.mRecyclerView.getPaddingTop();
        }
        scrollEventValues.mOffsetPx = -top;
        if (scrollEventValues.mOffsetPx < 0) {
            if (new androidx.viewpager2.widget.AnimateLayoutChangeDetector(this.mLayoutManager).mayHaveInterferingAnimations()) {
                throw new java.lang.IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "Page can only be offset by a positive amount, not by %d", java.lang.Integer.valueOf(scrollEventValues.mOffsetPx)));
        }
        scrollEventValues.mOffset = height == 0 ? 0.0f : scrollEventValues.mOffsetPx / height;
    }

    private void startDrag(boolean z) {
        this.mFakeDragging = z;
        this.mAdapterState = z ? 4 : 1;
        int i = this.mTarget;
        if (i != -1) {
            this.mDragStartPosition = i;
            this.mTarget = -1;
        } else if (this.mDragStartPosition == -1) {
            this.mDragStartPosition = getPosition();
        }
        dispatchStateChanged(1);
    }

    void notifyDataSetChangeHappened() {
        this.mDataSetChangeHappened = true;
    }

    void notifyProgrammaticScroll(int i, boolean z) {
        this.mAdapterState = z ? 2 : 3;
        this.mFakeDragging = false;
        boolean z2 = this.mTarget != i;
        this.mTarget = i;
        dispatchStateChanged(2);
        if (z2) {
            dispatchSelected(i);
        }
    }

    void notifyBeginFakeDrag() {
        this.mAdapterState = 4;
        startDrag(true);
    }

    void notifyEndFakeDrag() {
        if (!isDragging() || this.mFakeDragging) {
            this.mFakeDragging = false;
            updateScrollEventValues();
            if (this.mScrollValues.mOffsetPx == 0) {
                if (this.mScrollValues.mPosition != this.mDragStartPosition) {
                    dispatchSelected(this.mScrollValues.mPosition);
                }
                dispatchStateChanged(0);
                resetState();
                return;
            }
            dispatchStateChanged(2);
        }
    }

    void setOnPageChangeCallback(androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mCallback = onPageChangeCallback;
    }

    int getScrollState() {
        return this.mScrollState;
    }

    boolean isIdle() {
        return this.mScrollState == 0;
    }

    boolean isDragging() {
        return this.mScrollState == 1;
    }

    boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    private boolean isInAnyDraggingState() {
        int i = this.mAdapterState;
        return i == 1 || i == 4;
    }

    double getRelativeScrollPosition() {
        updateScrollEventValues();
        return ((double) this.mScrollValues.mPosition) + ((double) this.mScrollValues.mOffset);
    }

    private void dispatchStateChanged(int i) {
        if ((this.mAdapterState == 3 && this.mScrollState == 0) || this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrollStateChanged(i);
        }
    }

    private void dispatchSelected(int i) {
        androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageSelected(i);
        }
    }

    private void dispatchScrolled(int i, float f, int i2) {
        androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrolled(i, f, i2);
        }
    }

    private int getPosition() {
        return this.mLayoutManager.findFirstVisibleItemPosition();
    }

    private static final class ScrollEventValues {
        float mOffset;
        int mOffsetPx;
        int mPosition;

        ScrollEventValues() {
        }

        void reset() {
            this.mPosition = -1;
            this.mOffset = 0.0f;
            this.mOffsetPx = 0;
        }
    }
}
