package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
class NestedAdapterWrapper {
    public final androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter;
    private androidx.recyclerview.widget.RecyclerView.AdapterDataObserver mAdapterObserver = new androidx.recyclerview.widget.RecyclerView.AdapterDataObserver() { // from class: androidx.recyclerview.widget.NestedAdapterWrapper.1
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = androidx.recyclerview.widget.NestedAdapterWrapper.this;
            nestedAdapterWrapper.mCachedItemCount = nestedAdapterWrapper.adapter.getItemCount();
            androidx.recyclerview.widget.NestedAdapterWrapper.this.mCallback.onChanged(androidx.recyclerview.widget.NestedAdapterWrapper.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            androidx.recyclerview.widget.NestedAdapterWrapper.this.mCallback.onItemRangeChanged(androidx.recyclerview.widget.NestedAdapterWrapper.this, i, i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            androidx.recyclerview.widget.NestedAdapterWrapper.this.mCallback.onItemRangeChanged(androidx.recyclerview.widget.NestedAdapterWrapper.this, i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            androidx.recyclerview.widget.NestedAdapterWrapper.this.mCachedItemCount += i2;
            androidx.recyclerview.widget.NestedAdapterWrapper.this.mCallback.onItemRangeInserted(androidx.recyclerview.widget.NestedAdapterWrapper.this, i, i2);
            if (androidx.recyclerview.widget.NestedAdapterWrapper.this.mCachedItemCount <= 0 || androidx.recyclerview.widget.NestedAdapterWrapper.this.adapter.getStateRestorationPolicy() != androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            androidx.recyclerview.widget.NestedAdapterWrapper.this.mCallback.onStateRestorationPolicyChanged(androidx.recyclerview.widget.NestedAdapterWrapper.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            androidx.recyclerview.widget.NestedAdapterWrapper.this.mCachedItemCount -= i2;
            androidx.recyclerview.widget.NestedAdapterWrapper.this.mCallback.onItemRangeRemoved(androidx.recyclerview.widget.NestedAdapterWrapper.this, i, i2);
            if (androidx.recyclerview.widget.NestedAdapterWrapper.this.mCachedItemCount >= 1 || androidx.recyclerview.widget.NestedAdapterWrapper.this.adapter.getStateRestorationPolicy() != androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            androidx.recyclerview.widget.NestedAdapterWrapper.this.mCallback.onStateRestorationPolicyChanged(androidx.recyclerview.widget.NestedAdapterWrapper.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            androidx.core.util.Preconditions.checkArgument(i3 == 1, "moving more than 1 item is not supported in RecyclerView");
            androidx.recyclerview.widget.NestedAdapterWrapper.this.mCallback.onItemRangeMoved(androidx.recyclerview.widget.NestedAdapterWrapper.this, i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
            androidx.recyclerview.widget.NestedAdapterWrapper.this.mCallback.onStateRestorationPolicyChanged(androidx.recyclerview.widget.NestedAdapterWrapper.this);
        }
    };
    int mCachedItemCount;
    final androidx.recyclerview.widget.NestedAdapterWrapper.Callback mCallback;
    private final androidx.recyclerview.widget.StableIdStorage.StableIdLookup mStableIdLookup;
    private final androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup mViewTypeLookup;

    interface Callback {
        void onChanged(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper);

        void onItemRangeChanged(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2);

        void onItemRangeChanged(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2, java.lang.Object obj);

        void onItemRangeInserted(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2);

        void onItemRangeMoved(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2);

        void onItemRangeRemoved(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper, int i, int i2);

        void onStateRestorationPolicyChanged(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper);
    }

    NestedAdapterWrapper(androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter, androidx.recyclerview.widget.NestedAdapterWrapper.Callback callback, androidx.recyclerview.widget.ViewTypeStorage viewTypeStorage, androidx.recyclerview.widget.StableIdStorage.StableIdLookup stableIdLookup) {
        this.adapter = adapter;
        this.mCallback = callback;
        this.mViewTypeLookup = viewTypeStorage.createViewTypeWrapper(this);
        this.mStableIdLookup = stableIdLookup;
        this.mCachedItemCount = adapter.getItemCount();
        adapter.registerAdapterDataObserver(this.mAdapterObserver);
    }

    void dispose() {
        this.adapter.unregisterAdapterDataObserver(this.mAdapterObserver);
        this.mViewTypeLookup.dispose();
    }

    int getCachedItemCount() {
        return this.mCachedItemCount;
    }

    int getItemViewType(int i) {
        return this.mViewTypeLookup.localToGlobal(this.adapter.getItemViewType(i));
    }

    androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        return this.adapter.onCreateViewHolder(viewGroup, this.mViewTypeLookup.globalToLocal(i));
    }

    void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        this.adapter.bindViewHolder(viewHolder, i);
    }

    public long getItemId(int i) {
        return this.mStableIdLookup.localToGlobal(this.adapter.getItemId(i));
    }
}
