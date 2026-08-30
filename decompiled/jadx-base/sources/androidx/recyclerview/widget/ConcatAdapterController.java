package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
class ConcatAdapterController implements androidx.recyclerview.widget.NestedAdapterWrapper.Callback {
    private final androidx.recyclerview.widget.ConcatAdapter mConcatAdapter;
    private final androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode mStableIdMode;
    private final androidx.recyclerview.widget.StableIdStorage mStableIdStorage;
    private final androidx.recyclerview.widget.ViewTypeStorage mViewTypeStorage;
    private java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> mAttachedRecyclerViews = new java.util.ArrayList();
    private final java.util.IdentityHashMap<androidx.recyclerview.widget.RecyclerView.ViewHolder, androidx.recyclerview.widget.NestedAdapterWrapper> mBinderLookup = new java.util.IdentityHashMap<>();
    private java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> mWrappers = new java.util.ArrayList();
    private androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition mReusableHolder = new androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition();

    ConcatAdapterController(androidx.recyclerview.widget.ConcatAdapter concatAdapter, androidx.recyclerview.widget.ConcatAdapter.Config config) {
        this.mConcatAdapter = concatAdapter;
        if (config.isolateViewTypes) {
            this.mViewTypeStorage = new androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage();
        } else {
            this.mViewTypeStorage = new androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage();
        }
        this.mStableIdMode = config.stableIdMode;
        if (config.stableIdMode == androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.mStableIdStorage = new androidx.recyclerview.widget.StableIdStorage.NoStableIdStorage();
        } else if (config.stableIdMode == androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            this.mStableIdStorage = new androidx.recyclerview.widget.StableIdStorage.IsolatedStableIdStorage();
        } else {
            if (config.stableIdMode == androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
                this.mStableIdStorage = new androidx.recyclerview.widget.StableIdStorage.SharedPoolStableIdStorage();
                return;
            }
            throw new java.lang.IllegalArgumentException("unknown stable id mode");
        }
    }

    private androidx.recyclerview.widget.NestedAdapterWrapper findWrapperFor(androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
        int iIndexOfWrapper = indexOfWrapper(adapter);
        if (iIndexOfWrapper == -1) {
            return null;
        }
        return this.mWrappers.get(iIndexOfWrapper);
    }

    private int indexOfWrapper(androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
        int size = this.mWrappers.size();
        for (int i = 0; i < size; i++) {
            if (this.mWrappers.get(i).adapter == adapter) {
                return i;
            }
        }
        return -1;
    }

    boolean addAdapter(androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
        return addAdapter(this.mWrappers.size(), adapter);
    }

    boolean addAdapter(int i, androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
        if (i < 0 || i > this.mWrappers.size()) {
            throw new java.lang.IndexOutOfBoundsException("Index must be between 0 and " + this.mWrappers.size() + ". Given:" + i);
        }
        if (hasStableIds()) {
            androidx.core.util.Preconditions.checkArgument(adapter.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else if (adapter.hasStableIds()) {
            android.util.Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        if (findWrapperFor(adapter) != null) {
            return false;
        }
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = new androidx.recyclerview.widget.NestedAdapterWrapper(adapter, this, this.mViewTypeStorage, this.mStableIdStorage.createStableIdLookup());
        this.mWrappers.add(i, nestedAdapterWrapper);
        java.util.Iterator<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> it = this.mAttachedRecyclerViews.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                adapter.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (nestedAdapterWrapper.getCachedItemCount() > 0) {
            this.mConcatAdapter.notifyItemRangeInserted(countItemsBefore(nestedAdapterWrapper), nestedAdapterWrapper.getCachedItemCount());
        }
        calculateAndUpdateStateRestorationPolicy();
        return true;
    }

    boolean removeAdapter(androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
        int iIndexOfWrapper = indexOfWrapper(adapter);
        if (iIndexOfWrapper == -1) {
            return false;
        }
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = this.mWrappers.get(iIndexOfWrapper);
        int iCountItemsBefore = countItemsBefore(nestedAdapterWrapper);
        this.mWrappers.remove(iIndexOfWrapper);
        this.mConcatAdapter.notifyItemRangeRemoved(iCountItemsBefore, nestedAdapterWrapper.getCachedItemCount());
        java.util.Iterator<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> it = this.mAttachedRecyclerViews.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                adapter.onDetachedFromRecyclerView(recyclerView);
            }
        }
        nestedAdapterWrapper.dispose();
        calculateAndUpdateStateRestorationPolicy();
        return true;
    }

    private int countItemsBefore(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
        androidx.recyclerview.widget.NestedAdapterWrapper next;
        java.util.Iterator<androidx.recyclerview.widget.NestedAdapterWrapper> it = this.mWrappers.iterator();
        int cachedItemCount = 0;
        while (it.hasNext() && (next = it.next()) != nestedAdapterWrapper) {
            cachedItemCount += next.getCachedItemCount();
        }
        return cachedItemCount;
    }

    public long getItemId(int i) {
        androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition wrapperAndLocalPositionFindWrapperAndLocalPosition = findWrapperAndLocalPosition(i);
        long itemId = wrapperAndLocalPositionFindWrapperAndLocalPosition.mWrapper.getItemId(wrapperAndLocalPositionFindWrapperAndLocalPosition.mLocalPosition);
        releaseWrapperAndLocalPosition(wrapperAndLocalPositionFindWrapperAndLocalPosition);
        return itemId;
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onChanged(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
        this.mConcatAdapter.notifyDataSetChanged();
        calculateAndUpdateStateRestorationPolicy();
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeChanged(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        this.mConcatAdapter.notifyItemRangeChanged(i + countItemsBefore(nestedAdapterWrapper), i2);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeChanged(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2, java.lang.Object obj) {
        this.mConcatAdapter.notifyItemRangeChanged(i + countItemsBefore(nestedAdapterWrapper), i2, obj);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeInserted(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        this.mConcatAdapter.notifyItemRangeInserted(i + countItemsBefore(nestedAdapterWrapper), i2);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeRemoved(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        this.mConcatAdapter.notifyItemRangeRemoved(i + countItemsBefore(nestedAdapterWrapper), i2);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeMoved(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        int iCountItemsBefore = countItemsBefore(nestedAdapterWrapper);
        this.mConcatAdapter.notifyItemMoved(i + iCountItemsBefore, i2 + iCountItemsBefore);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onStateRestorationPolicyChanged(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
        calculateAndUpdateStateRestorationPolicy();
    }

    private void calculateAndUpdateStateRestorationPolicy() {
        androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicyComputeStateRestorationPolicy = computeStateRestorationPolicy();
        if (stateRestorationPolicyComputeStateRestorationPolicy != this.mConcatAdapter.getStateRestorationPolicy()) {
            this.mConcatAdapter.internalSetStateRestorationPolicy(stateRestorationPolicyComputeStateRestorationPolicy);
        }
    }

    private androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy computeStateRestorationPolicy() {
        for (androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper : this.mWrappers) {
            androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy = nestedAdapterWrapper.adapter.getStateRestorationPolicy();
            if (stateRestorationPolicy == androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT) {
                return androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            }
            if (stateRestorationPolicy == androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && nestedAdapterWrapper.getCachedItemCount() == 0) {
                return androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            }
        }
        return androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
    }

    public int getTotalCount() {
        java.util.Iterator<androidx.recyclerview.widget.NestedAdapterWrapper> it = this.mWrappers.iterator();
        int cachedItemCount = 0;
        while (it.hasNext()) {
            cachedItemCount += it.next().getCachedItemCount();
        }
        return cachedItemCount;
    }

    public int getItemViewType(int i) {
        androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition wrapperAndLocalPositionFindWrapperAndLocalPosition = findWrapperAndLocalPosition(i);
        int itemViewType = wrapperAndLocalPositionFindWrapperAndLocalPosition.mWrapper.getItemViewType(wrapperAndLocalPositionFindWrapperAndLocalPosition.mLocalPosition);
        releaseWrapperAndLocalPosition(wrapperAndLocalPositionFindWrapperAndLocalPosition);
        return itemViewType;
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        return this.mViewTypeStorage.getWrapperForGlobalType(i).onCreateViewHolder(viewGroup, i);
    }

    public android.util.Pair<androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>, java.lang.Integer> getWrappedAdapterAndPosition(int i) {
        androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition wrapperAndLocalPositionFindWrapperAndLocalPosition = findWrapperAndLocalPosition(i);
        android.util.Pair<androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>, java.lang.Integer> pair = new android.util.Pair<>(wrapperAndLocalPositionFindWrapperAndLocalPosition.mWrapper.adapter, java.lang.Integer.valueOf(wrapperAndLocalPositionFindWrapperAndLocalPosition.mLocalPosition));
        releaseWrapperAndLocalPosition(wrapperAndLocalPositionFindWrapperAndLocalPosition);
        return pair;
    }

    private androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition findWrapperAndLocalPosition(int i) {
        androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition wrapperAndLocalPosition;
        if (this.mReusableHolder.mInUse) {
            wrapperAndLocalPosition = new androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition();
        } else {
            this.mReusableHolder.mInUse = true;
            wrapperAndLocalPosition = this.mReusableHolder;
        }
        int cachedItemCount = i;
        for (androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper : this.mWrappers) {
            if (nestedAdapterWrapper.getCachedItemCount() > cachedItemCount) {
                wrapperAndLocalPosition.mWrapper = nestedAdapterWrapper;
                wrapperAndLocalPosition.mLocalPosition = cachedItemCount;
                break;
            }
            cachedItemCount -= nestedAdapterWrapper.getCachedItemCount();
        }
        if (wrapperAndLocalPosition.mWrapper != null) {
            return wrapperAndLocalPosition;
        }
        throw new java.lang.IllegalArgumentException("Cannot find wrapper for " + i);
    }

    private void releaseWrapperAndLocalPosition(androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition wrapperAndLocalPosition) {
        wrapperAndLocalPosition.mInUse = false;
        wrapperAndLocalPosition.mWrapper = null;
        wrapperAndLocalPosition.mLocalPosition = -1;
        this.mReusableHolder = wrapperAndLocalPosition;
    }

    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition wrapperAndLocalPositionFindWrapperAndLocalPosition = findWrapperAndLocalPosition(i);
        this.mBinderLookup.put(viewHolder, wrapperAndLocalPositionFindWrapperAndLocalPosition.mWrapper);
        wrapperAndLocalPositionFindWrapperAndLocalPosition.mWrapper.onBindViewHolder(viewHolder, wrapperAndLocalPositionFindWrapperAndLocalPosition.mLocalPosition);
        releaseWrapperAndLocalPosition(wrapperAndLocalPositionFindWrapperAndLocalPosition);
    }

    public boolean canRestoreState() {
        java.util.Iterator<androidx.recyclerview.widget.NestedAdapterWrapper> it = this.mWrappers.iterator();
        while (it.hasNext()) {
            if (!it.next().adapter.canRestoreState()) {
                return false;
            }
        }
        return true;
    }

    public void onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        getWrapper(viewHolder).adapter.onViewAttachedToWindow(viewHolder);
    }

    public void onViewDetachedFromWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        getWrapper(viewHolder).adapter.onViewDetachedFromWindow(viewHolder);
    }

    public void onViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper == null) {
            throw new java.lang.IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
        }
        nestedAdapterWrapper.adapter.onViewRecycled(viewHolder);
        this.mBinderLookup.remove(viewHolder);
    }

    public boolean onFailedToRecycleView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper == null) {
            throw new java.lang.IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
        }
        boolean zOnFailedToRecycleView = nestedAdapterWrapper.adapter.onFailedToRecycleView(viewHolder);
        this.mBinderLookup.remove(viewHolder);
        return zOnFailedToRecycleView;
    }

    private androidx.recyclerview.widget.NestedAdapterWrapper getWrapper(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper != null) {
            return nestedAdapterWrapper;
        }
        throw new java.lang.IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    private boolean isAttachedTo(androidx.recyclerview.widget.RecyclerView recyclerView) {
        java.util.Iterator<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> it = this.mAttachedRecyclerViews.iterator();
        while (it.hasNext()) {
            if (it.next().get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (isAttachedTo(recyclerView)) {
            return;
        }
        this.mAttachedRecyclerViews.add(new java.lang.ref.WeakReference<>(recyclerView));
        java.util.Iterator<androidx.recyclerview.widget.NestedAdapterWrapper> it = this.mWrappers.iterator();
        while (it.hasNext()) {
            it.next().adapter.onAttachedToRecyclerView(recyclerView);
        }
    }

    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        for (int size = this.mAttachedRecyclerViews.size() - 1; size >= 0; size--) {
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> weakReference = this.mAttachedRecyclerViews.get(size);
            if (weakReference.get() == null) {
                this.mAttachedRecyclerViews.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.mAttachedRecyclerViews.remove(size);
                break;
            }
        }
        java.util.Iterator<androidx.recyclerview.widget.NestedAdapterWrapper> it = this.mWrappers.iterator();
        while (it.hasNext()) {
            it.next().adapter.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public int getLocalAdapterPosition(androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper == null) {
            return -1;
        }
        int iCountItemsBefore = i - countItemsBefore(nestedAdapterWrapper);
        int itemCount = nestedAdapterWrapper.adapter.getItemCount();
        if (iCountItemsBefore < 0 || iCountItemsBefore >= itemCount) {
            throw new java.lang.IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + iCountItemsBefore + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + viewHolder + "adapter:" + adapter);
        }
        return nestedAdapterWrapper.adapter.findRelativeAdapterPositionIn(adapter, viewHolder, iCountItemsBefore);
    }

    public androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> getBoundAdapter(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper == null) {
            return null;
        }
        return nestedAdapterWrapper.adapter;
    }

    public java.util.List<androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>> getCopyOfAdapters() {
        if (this.mWrappers.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.mWrappers.size());
        java.util.Iterator<androidx.recyclerview.widget.NestedAdapterWrapper> it = this.mWrappers.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().adapter);
        }
        return arrayList;
    }

    public boolean hasStableIds() {
        return this.mStableIdMode != androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS;
    }

    static class WrapperAndLocalPosition {
        boolean mInUse;
        int mLocalPosition;
        androidx.recyclerview.widget.NestedAdapterWrapper mWrapper;

        WrapperAndLocalPosition() {
        }
    }
}
