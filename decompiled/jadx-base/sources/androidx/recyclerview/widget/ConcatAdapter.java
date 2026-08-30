package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public final class ConcatAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    static final java.lang.String TAG = "ConcatAdapter";
    private final androidx.recyclerview.widget.ConcatAdapterController mController;

    @java.lang.SafeVarargs
    public ConcatAdapter(androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>... adapterArr) {
        this(androidx.recyclerview.widget.ConcatAdapter.Config.DEFAULT, adapterArr);
    }

    @java.lang.SafeVarargs
    public ConcatAdapter(androidx.recyclerview.widget.ConcatAdapter.Config config, androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>... adapterArr) {
        this(config, (java.util.List<? extends androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>>) java.util.Arrays.asList(adapterArr));
    }

    public ConcatAdapter(java.util.List<? extends androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>> list) {
        this(androidx.recyclerview.widget.ConcatAdapter.Config.DEFAULT, list);
    }

    public ConcatAdapter(androidx.recyclerview.widget.ConcatAdapter.Config config, java.util.List<? extends androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>> list) {
        this.mController = new androidx.recyclerview.widget.ConcatAdapterController(this, config);
        java.util.Iterator<? extends androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>> it = list.iterator();
        while (it.hasNext()) {
            addAdapter(it.next());
        }
        super.setHasStableIds(this.mController.hasStableIds());
    }

    public boolean addAdapter(androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
        return this.mController.addAdapter(adapter);
    }

    public boolean addAdapter(int i, androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
        return this.mController.addAdapter(i, adapter);
    }

    public boolean removeAdapter(androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter) {
        return this.mController.removeAdapter(adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.mController.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        return this.mController.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        this.mController.onBindViewHolder(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        throw new java.lang.UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setStateRestorationPolicy(androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new java.lang.UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.mController.getItemId(i);
    }

    void internalSetStateRestorationPolicy(androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mController.getTotalCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return this.mController.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        this.mController.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        this.mController.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        this.mController.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.mController.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.mController.onDetachedFromRecyclerView(recyclerView);
    }

    public java.util.List<? extends androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>> getAdapters() {
        return java.util.Collections.unmodifiableList(this.mController.getCopyOfAdapters());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int findRelativeAdapterPositionIn(androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        return this.mController.getLocalAdapterPosition(adapter, viewHolder, i);
    }

    public android.util.Pair<androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>, java.lang.Integer> getWrappedAdapterAndPosition(int i) {
        return this.mController.getWrappedAdapterAndPosition(i);
    }

    public static final class Config {
        public static final androidx.recyclerview.widget.ConcatAdapter.Config DEFAULT = new androidx.recyclerview.widget.ConcatAdapter.Config(true, androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS);
        public final boolean isolateViewTypes;
        public final androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode stableIdMode;

        public enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        Config(boolean z, androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode stableIdMode) {
            this.isolateViewTypes = z;
            this.stableIdMode = stableIdMode;
        }

        public static final class Builder {
            private boolean mIsolateViewTypes = androidx.recyclerview.widget.ConcatAdapter.Config.DEFAULT.isolateViewTypes;
            private androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode mStableIdMode = androidx.recyclerview.widget.ConcatAdapter.Config.DEFAULT.stableIdMode;

            public androidx.recyclerview.widget.ConcatAdapter.Config.Builder setIsolateViewTypes(boolean z) {
                this.mIsolateViewTypes = z;
                return this;
            }

            public androidx.recyclerview.widget.ConcatAdapter.Config.Builder setStableIdMode(androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode stableIdMode) {
                this.mStableIdMode = stableIdMode;
                return this;
            }

            public androidx.recyclerview.widget.ConcatAdapter.Config build() {
                return new androidx.recyclerview.widget.ConcatAdapter.Config(this.mIsolateViewTypes, this.mStableIdMode);
            }
        }
    }
}
