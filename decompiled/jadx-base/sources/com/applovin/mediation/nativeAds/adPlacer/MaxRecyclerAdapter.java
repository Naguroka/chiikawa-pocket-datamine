package com.applovin.mediation.nativeAds.adPlacer;

/* JADX INFO: loaded from: classes3.dex */
public class MaxRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> implements com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer f1598a;
    private final androidx.recyclerview.widget.RecyclerView.Adapter b;
    private final com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.b c;
    private androidx.recyclerview.widget.RecyclerView d;
    private com.applovin.impl.hl e;
    private com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener f;
    private int g;
    private com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.AdPositionBehavior h;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public static class MaxAdRecyclerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.ViewGroup f1600a;

        public MaxAdRecyclerViewHolder(android.view.View view) {
            super(view);
            this.f1600a = (android.view.ViewGroup) view.findViewById(com.applovin.sdk.R.id.applovin_native_ad_view_container);
        }

        public android.view.ViewGroup getContainerView() {
            return this.f1600a;
        }
    }

    class a implements com.applovin.impl.hl.a {
        a() {
        }

        @Override // com.applovin.impl.hl.a
        public void a(int i, int i2) {
            com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.f1598a.updateFillablePositions(i, java.lang.Math.min(i2 + com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.g, com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    private class b extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        private b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            int adjustedPosition = com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.f1598a.getAdjustedPosition(i);
            com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.f1598a.getAdjustedPosition((i + i2) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            boolean z = i + i2 >= com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.b.getItemCount();
            if (com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.h == com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.AdPositionBehavior.FIXED || (com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.h == com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z)) {
                com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.f1598a.getAdjustedPosition(i);
            for (int i3 = 0; i3 < i2; i3++) {
                com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.f1598a.insertItem(adjustedPosition);
            }
            com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            int itemCount = com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.b.getItemCount();
            boolean z = i + i2 >= itemCount;
            if (com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.h == com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.AdPositionBehavior.FIXED || (com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.h == com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z)) {
                com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.f1598a.getAdjustedPosition(i);
            int adjustedCount = com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.f1598a.getAdjustedCount(itemCount + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.f1598a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.f1598a.getAdjustedCount(itemCount);
            int size = adjustedCount - adjustedCount2;
            java.util.Collection<java.lang.Integer> collectionClearTrailingAds = com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.f1598a.clearTrailingAds(adjustedCount2 - 1);
            if (!collectionClearTrailingAds.isEmpty()) {
                size += collectionClearTrailingAds.size();
            }
            com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i2), size);
        }

        /* synthetic */ b(com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter maxRecyclerAdapter, com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.a aVar) {
            this();
        }
    }

    public MaxRecyclerAdapter(com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings maxAdPlacerSettings, androidx.recyclerview.widget.RecyclerView.Adapter adapter, android.app.Activity activity) {
        com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.b bVar = new com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.b(this, null);
        this.c = bVar;
        this.g = 8;
        this.h = com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer maxAdPlacer = new com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f1598a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(adapter.hasStableIds());
        this.b = adapter;
        adapter.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.b.unregisterAdapterDataObserver(this.c);
        } catch (java.lang.Exception unused) {
        }
        this.f1598a.destroy();
        com.applovin.impl.hl hlVar = this.e;
        if (hlVar != null) {
            hlVar.a();
        }
    }

    public com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer getAdPlacer() {
        return this.f1598a;
    }

    public int getAdjustedPosition(int i) {
        return this.f1598a.getAdjustedPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1598a.getAdjustedCount(this.b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (this.b.hasStableIds()) {
            return this.f1598a.isFilledPosition(i) ? this.f1598a.getAdItemId(i) : this.b.getItemId(this.f1598a.getOriginalPosition(i));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f1598a.isAdPosition(i)) {
            return -42;
        }
        return this.b.getItemViewType(this.f1598a.getOriginalPosition(i));
    }

    public int getOriginalPosition(int i) {
        return this.f1598a.getOriginalPosition(i);
    }

    public void loadAds() {
        this.f1598a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i) {
        notifyItemChanged(i);
        com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdLoaded(i);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i) {
        com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdRemoved(i);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(com.applovin.mediation.MaxAd maxAd) {
        com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.d = recyclerView;
        com.applovin.impl.hl hlVar = new com.applovin.impl.hl(recyclerView);
        this.e = hlVar;
        hlVar.a(new com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        this.e.a(viewHolder.itemView, i);
        if (!this.f1598a.isAdPosition(i)) {
            this.b.onBindViewHolder(viewHolder, this.f1598a.getOriginalPosition(i));
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.Size adSize = this.f1598a.getAdSize(i, a(i));
        android.view.ViewGroup containerView = ((com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.MaxAdRecyclerViewHolder) viewHolder).getContainerView();
        android.view.ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == com.applovin.sdk.AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : com.applovin.sdk.AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : com.applovin.sdk.AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f1598a.renderAd(i, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        if (i != -42) {
            return this.b.onCreateViewHolder(viewGroup, i);
        }
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.applovin.sdk.R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        android.view.ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.d.getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        viewInflate.setLayoutParams(layoutParams);
        return new com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.MaxAdRecyclerViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.d = null;
        com.applovin.impl.hl hlVar = this.e;
        if (hlVar != null) {
            hlVar.a();
            this.e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return viewHolder instanceof com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(viewHolder) : this.b.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.b.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.b.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        com.applovin.impl.hl hlVar = this.e;
        if (hlVar != null) {
            hlVar.b(viewHolder.itemView);
        }
        if (!(viewHolder instanceof com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.MaxAdRecyclerViewHolder)) {
            this.b.onViewRecycled(viewHolder);
            return;
        }
        if (this.f1598a.isFilledPosition(viewHolder.getBindingAdapterPosition())) {
            ((com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.MaxAdRecyclerViewHolder) viewHolder).getContainerView().removeAllViews();
        }
        super.onViewRecycled(viewHolder);
    }

    public void setAdPositionBehavior(com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.AdPositionBehavior adPositionBehavior) {
        this.h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.b.unregisterAdapterDataObserver(this.c);
        this.b.setHasStableIds(z);
        this.b.registerAdapterDataObserver(this.c);
    }

    public void setListener(com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener listener) {
        this.f = listener;
    }

    public void setLookAhead(int i) {
        this.g = i;
    }

    private int a(int i) {
        int iPxToDp = com.applovin.sdk.AppLovinSdkUtils.pxToDp(this.d.getContext(), this.d.getWidth());
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.d.getLayoutManager();
        if (!(layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager)) {
            return layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager ? iPxToDp / ((androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager).getSpanCount() : iPxToDp;
        }
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = (androidx.recyclerview.widget.GridLayoutManager) layoutManager;
        return (iPxToDp / gridLayoutManager.getSpanCount()) * gridLayoutManager.getSpanSizeLookup().getSpanSize(i);
    }
}
