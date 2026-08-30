package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
final class GapWorker implements java.lang.Runnable {
    static final java.lang.ThreadLocal<androidx.recyclerview.widget.GapWorker> sGapWorker = new java.lang.ThreadLocal<>();
    static java.util.Comparator<androidx.recyclerview.widget.GapWorker.Task> sTaskComparator = new java.util.Comparator<androidx.recyclerview.widget.GapWorker.Task>() { // from class: androidx.recyclerview.widget.GapWorker.1
        @Override // java.util.Comparator
        public int compare(androidx.recyclerview.widget.GapWorker.Task task, androidx.recyclerview.widget.GapWorker.Task task2) {
            if ((task.view == null) != (task2.view == null)) {
                return task.view == null ? 1 : -1;
            }
            if (task.immediate != task2.immediate) {
                return task.immediate ? -1 : 1;
            }
            int i = task2.viewVelocity - task.viewVelocity;
            if (i != 0) {
                return i;
            }
            int i2 = task.distanceToItem - task2.distanceToItem;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    };
    long mFrameIntervalNs;
    long mPostTimeNs;
    java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> mRecyclerViews = new java.util.ArrayList<>();
    private java.util.ArrayList<androidx.recyclerview.widget.GapWorker.Task> mTasks = new java.util.ArrayList<>();

    GapWorker() {
    }

    static class Task {
        public int distanceToItem;
        public boolean immediate;
        public int position;
        public androidx.recyclerview.widget.RecyclerView view;
        public int viewVelocity;

        Task() {
        }

        public void clear() {
            this.immediate = false;
            this.viewVelocity = 0;
            this.distanceToItem = 0;
            this.view = null;
            this.position = 0;
        }
    }

    static class LayoutPrefetchRegistryImpl implements androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry {
        int mCount;
        int[] mPrefetchArray;
        int mPrefetchDx;
        int mPrefetchDy;

        LayoutPrefetchRegistryImpl() {
        }

        void setPrefetchVector(int i, int i2) {
            this.mPrefetchDx = i;
            this.mPrefetchDy = i2;
        }

        void collectPrefetchPositionsFromView(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z) {
            this.mCount = 0;
            int[] iArr = this.mPrefetchArray;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.isItemPrefetchEnabled()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.hasPendingUpdates()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.collectAdjacentPrefetchPositions(this.mPrefetchDx, this.mPrefetchDy, recyclerView.mState, this);
            }
            if (this.mCount > layoutManager.mPrefetchMaxCountObserved) {
                layoutManager.mPrefetchMaxCountObserved = this.mCount;
                layoutManager.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.updateViewCacheSize();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public void addPosition(int i, int i2) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.mCount * 2;
            int[] iArr = this.mPrefetchArray;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.mPrefetchArray = iArr2;
                java.util.Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.mPrefetchArray = iArr3;
                java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.mPrefetchArray;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.mCount++;
        }

        boolean lastPrefetchIncludedPosition(int i) {
            if (this.mPrefetchArray != null) {
                int i2 = this.mCount * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.mPrefetchArray[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        void clearPrefetchPositions() {
            int[] iArr = this.mPrefetchArray;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            this.mCount = 0;
        }
    }

    public void add(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.mRecyclerViews.add(recyclerView);
    }

    public void remove(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.mRecyclerViews.remove(recyclerView);
    }

    void postFromTraversal(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.mPostTimeNs == 0) {
            this.mPostTimeNs = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.setPrefetchVector(i, i2);
    }

    private void buildTaskList() {
        androidx.recyclerview.widget.GapWorker.Task task;
        int size = this.mRecyclerViews.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerViews.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.collectPrefetchPositionsFromView(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.mCount;
            }
        }
        this.mTasks.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.mRecyclerViews.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                androidx.recyclerview.widget.GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView2.mPrefetchRegistry;
                int iAbs = java.lang.Math.abs(layoutPrefetchRegistryImpl.mPrefetchDx) + java.lang.Math.abs(layoutPrefetchRegistryImpl.mPrefetchDy);
                for (int i5 = 0; i5 < layoutPrefetchRegistryImpl.mCount * 2; i5 += 2) {
                    if (i3 >= this.mTasks.size()) {
                        task = new androidx.recyclerview.widget.GapWorker.Task();
                        this.mTasks.add(task);
                    } else {
                        task = this.mTasks.get(i3);
                    }
                    int i6 = layoutPrefetchRegistryImpl.mPrefetchArray[i5 + 1];
                    task.immediate = i6 <= iAbs;
                    task.viewVelocity = iAbs;
                    task.distanceToItem = i6;
                    task.view = recyclerView2;
                    task.position = layoutPrefetchRegistryImpl.mPrefetchArray[i5];
                    i3++;
                }
            }
        }
        java.util.Collections.sort(this.mTasks, sTaskComparator);
    }

    static boolean isPrefetchPositionAttached(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        int unfilteredChildCount = recyclerView.mChildHelper.getUnfilteredChildCount();
        for (int i2 = 0; i2 < unfilteredChildCount; i2++) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolderInt = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.getUnfilteredChildAt(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private androidx.recyclerview.widget.RecyclerView.ViewHolder prefetchPositionWithDeadline(androidx.recyclerview.widget.RecyclerView recyclerView, int i, long j) {
        if (isPrefetchPositionAttached(recyclerView, i)) {
            return null;
        }
        androidx.recyclerview.widget.RecyclerView.Recycler recycler = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolderTryGetViewHolderForPositionByDeadline = recycler.tryGetViewHolderForPositionByDeadline(i, false, j);
            if (viewHolderTryGetViewHolderForPositionByDeadline != null) {
                if (viewHolderTryGetViewHolderForPositionByDeadline.isBound() && !viewHolderTryGetViewHolderForPositionByDeadline.isInvalid()) {
                    recycler.recycleView(viewHolderTryGetViewHolderForPositionByDeadline.itemView);
                } else {
                    recycler.addViewHolderToRecycledViewPool(viewHolderTryGetViewHolderForPositionByDeadline, false);
                }
            }
            return viewHolderTryGetViewHolderForPositionByDeadline;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    private void prefetchInnerRecyclerViewWithDeadline(androidx.recyclerview.widget.RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.getUnfilteredChildCount() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        androidx.recyclerview.widget.GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
        layoutPrefetchRegistryImpl.collectPrefetchPositionsFromView(recyclerView, true);
        if (layoutPrefetchRegistryImpl.mCount != 0) {
            try {
                androidx.core.os.TraceCompat.beginSection("RV Nested Prefetch");
                recyclerView.mState.prepareForNestedPrefetch(recyclerView.mAdapter);
                for (int i = 0; i < layoutPrefetchRegistryImpl.mCount * 2; i += 2) {
                    prefetchPositionWithDeadline(recyclerView, layoutPrefetchRegistryImpl.mPrefetchArray[i], j);
                }
                androidx.core.os.TraceCompat.endSection();
            } catch (java.lang.Throwable th) {
                androidx.core.os.TraceCompat.endSection();
                throw th;
            }
        }
    }

    private void flushTaskWithDeadline(androidx.recyclerview.widget.GapWorker.Task task, long j) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolderPrefetchPositionWithDeadline = prefetchPositionWithDeadline(task.view, task.position, task.immediate ? Long.MAX_VALUE : j);
        if (viewHolderPrefetchPositionWithDeadline == null || viewHolderPrefetchPositionWithDeadline.mNestedRecyclerView == null || !viewHolderPrefetchPositionWithDeadline.isBound() || viewHolderPrefetchPositionWithDeadline.isInvalid()) {
            return;
        }
        prefetchInnerRecyclerViewWithDeadline(viewHolderPrefetchPositionWithDeadline.mNestedRecyclerView.get(), j);
    }

    private void flushTasksWithDeadline(long j) {
        for (int i = 0; i < this.mTasks.size(); i++) {
            androidx.recyclerview.widget.GapWorker.Task task = this.mTasks.get(i);
            if (task.view == null) {
                return;
            }
            flushTaskWithDeadline(task, j);
            task.clear();
        }
    }

    void prefetch(long j) {
        buildTaskList();
        flushTasksWithDeadline(j);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.TraceCompat.beginSection("RV Prefetch");
            if (!this.mRecyclerViews.isEmpty()) {
                int size = this.mRecyclerViews.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = this.mRecyclerViews.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = java.lang.Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    prefetch(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(jMax) + this.mFrameIntervalNs);
                }
            }
        } finally {
            this.mPostTimeNs = 0L;
            androidx.core.os.TraceCompat.endSection();
        }
    }
}
