package androidx.viewpager2.adapter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FragmentStateAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.viewpager2.adapter.FragmentViewHolder> implements androidx.viewpager2.adapter.StatefulAdapter {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final java.lang.String KEY_PREFIX_FRAGMENT = "f#";
    private static final java.lang.String KEY_PREFIX_STATE = "s#";
    final androidx.fragment.app.FragmentManager mFragmentManager;
    private androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    final androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final androidx.collection.LongSparseArray<java.lang.Integer> mItemIdToViewHolder;
    final androidx.lifecycle.Lifecycle mLifecycle;
    private final androidx.collection.LongSparseArray<androidx.fragment.app.Fragment.SavedState> mSavedStates;

    public abstract androidx.fragment.app.Fragment createFragment(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(androidx.viewpager2.adapter.FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    public FragmentStateAdapter(androidx.fragment.app.FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    public FragmentStateAdapter(androidx.fragment.app.Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(androidx.fragment.app.FragmentManager fragmentManager, androidx.lifecycle.Lifecycle lifecycle) {
        this.mFragments = new androidx.collection.LongSparseArray<>();
        this.mSavedStates = new androidx.collection.LongSparseArray<>();
        this.mItemIdToViewHolder = new androidx.collection.LongSparseArray<>();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = lifecycle;
        super.setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.core.util.Preconditions.checkArgument(this.mFragmentMaxLifecycleEnforcer == null);
        androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.register(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.mFragmentMaxLifecycleEnforcer.unregister(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final androidx.viewpager2.adapter.FragmentViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        return androidx.viewpager2.adapter.FragmentViewHolder.create(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(final androidx.viewpager2.adapter.FragmentViewHolder fragmentViewHolder, int i) {
        long itemId = fragmentViewHolder.getItemId();
        int id = fragmentViewHolder.getContainer().getId();
        java.lang.Long lItemForViewHolder = itemForViewHolder(id);
        if (lItemForViewHolder != null && lItemForViewHolder.longValue() != itemId) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.remove(lItemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.put(itemId, java.lang.Integer.valueOf(id));
        ensureFragment(i);
        final android.widget.FrameLayout container = fragmentViewHolder.getContainer();
        if (androidx.core.view.ViewCompat.isAttachedToWindow(container)) {
            if (container.getParent() != null) {
                throw new java.lang.IllegalStateException("Design assumption violated.");
            }
            container.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(android.view.View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    if (container.getParent() != null) {
                        container.removeOnLayoutChangeListener(this);
                        androidx.viewpager2.adapter.FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                    }
                }
            });
        }
        gcFragments();
    }

    void gcFragments() {
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        androidx.collection.ArraySet arraySet = new androidx.collection.ArraySet();
        for (int i = 0; i < this.mFragments.size(); i++) {
            long jKeyAt = this.mFragments.keyAt(i);
            if (!containsItem(jKeyAt)) {
                arraySet.add(java.lang.Long.valueOf(jKeyAt));
                this.mItemIdToViewHolder.remove(jKeyAt);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i2 = 0; i2 < this.mFragments.size(); i2++) {
                long jKeyAt2 = this.mFragments.keyAt(i2);
                if (!isFragmentViewBound(jKeyAt2)) {
                    arraySet.add(java.lang.Long.valueOf(jKeyAt2));
                }
            }
        }
        java.util.Iterator<E> it = arraySet.iterator();
        while (it.hasNext()) {
            removeFragment(((java.lang.Long) it.next()).longValue());
        }
    }

    private boolean isFragmentViewBound(long j) {
        android.view.View view;
        if (this.mItemIdToViewHolder.containsKey(j)) {
            return true;
        }
        androidx.fragment.app.Fragment fragment = this.mFragments.get(j);
        return (fragment == null || (view = fragment.getView()) == null || view.getParent() == null) ? false : true;
    }

    private java.lang.Long itemForViewHolder(int i) {
        java.lang.Long lValueOf = null;
        for (int i2 = 0; i2 < this.mItemIdToViewHolder.size(); i2++) {
            if (this.mItemIdToViewHolder.valueAt(i2).intValue() == i) {
                if (lValueOf != null) {
                    throw new java.lang.IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = java.lang.Long.valueOf(this.mItemIdToViewHolder.keyAt(i2));
            }
        }
        return lValueOf;
    }

    private void ensureFragment(int i) {
        long itemId = getItemId(i);
        if (this.mFragments.containsKey(itemId)) {
            return;
        }
        androidx.fragment.app.Fragment fragmentCreateFragment = createFragment(i);
        fragmentCreateFragment.setInitialSavedState(this.mSavedStates.get(itemId));
        this.mFragments.put(itemId, fragmentCreateFragment);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(androidx.viewpager2.adapter.FragmentViewHolder fragmentViewHolder) {
        placeFragmentInViewHolder(fragmentViewHolder);
        gcFragments();
    }

    void placeFragmentInViewHolder(final androidx.viewpager2.adapter.FragmentViewHolder fragmentViewHolder) {
        androidx.fragment.app.Fragment fragment = this.mFragments.get(fragmentViewHolder.getItemId());
        if (fragment == null) {
            throw new java.lang.IllegalStateException("Design assumption violated.");
        }
        android.widget.FrameLayout container = fragmentViewHolder.getContainer();
        android.view.View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new java.lang.IllegalStateException("Design assumption violated.");
        }
        if (fragment.isAdded() && view == null) {
            scheduleViewAttach(fragment, container);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != container) {
                addViewToContainer(view, container);
            }
        } else {
            if (fragment.isAdded()) {
                addViewToContainer(view, container);
                return;
            }
            if (!shouldDelayFragmentTransactions()) {
                scheduleViewAttach(fragment, container);
                this.mFragmentManager.beginTransaction().add(fragment, "f" + fragmentViewHolder.getItemId()).setMaxLifecycle(fragment, androidx.lifecycle.Lifecycle.State.STARTED).commitNow();
                this.mFragmentMaxLifecycleEnforcer.updateFragmentMaxLifecycle(false);
            } else {
                if (this.mFragmentManager.isDestroyed()) {
                    return;
                }
                this.mLifecycle.addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                        if (androidx.viewpager2.adapter.FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                            return;
                        }
                        lifecycleOwner.getLifecycle().removeObserver(this);
                        if (androidx.core.view.ViewCompat.isAttachedToWindow(fragmentViewHolder.getContainer())) {
                            androidx.viewpager2.adapter.FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                        }
                    }
                });
            }
        }
    }

    private void scheduleViewAttach(final androidx.fragment.app.Fragment fragment, final android.widget.FrameLayout frameLayout) {
        this.mFragmentManager.registerFragmentLifecycleCallbacks(new androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.3
            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentViewCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment2, android.view.View view, android.os.Bundle bundle) {
                if (fragment2 == fragment) {
                    fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                    androidx.viewpager2.adapter.FragmentStateAdapter.this.addViewToContainer(view, frameLayout);
                }
            }
        }, false);
    }

    void addViewToContainer(android.view.View view, android.widget.FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new java.lang.IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((android.view.ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(androidx.viewpager2.adapter.FragmentViewHolder fragmentViewHolder) {
        java.lang.Long lItemForViewHolder = itemForViewHolder(fragmentViewHolder.getContainer().getId());
        if (lItemForViewHolder != null) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.remove(lItemForViewHolder.longValue());
        }
    }

    private void removeFragment(long j) {
        android.view.ViewParent parent;
        androidx.fragment.app.Fragment fragment = this.mFragments.get(j);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((android.widget.FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j)) {
            this.mSavedStates.remove(j);
        }
        if (!fragment.isAdded()) {
            this.mFragments.remove(j);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (fragment.isAdded() && containsItem(j)) {
            this.mSavedStates.put(j, this.mFragmentManager.saveFragmentInstanceState(fragment));
        }
        this.mFragmentManager.beginTransaction().remove(fragment).commitNow();
        this.mFragments.remove(j);
    }

    boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.isStateSaved();
    }

    public boolean containsItem(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new java.lang.UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final android.os.Parcelable saveState() {
        android.os.Bundle bundle = new android.os.Bundle(this.mFragments.size() + this.mSavedStates.size());
        for (int i = 0; i < this.mFragments.size(); i++) {
            long jKeyAt = this.mFragments.keyAt(i);
            androidx.fragment.app.Fragment fragment = this.mFragments.get(jKeyAt);
            if (fragment != null && fragment.isAdded()) {
                this.mFragmentManager.putFragment(bundle, createKey(KEY_PREFIX_FRAGMENT, jKeyAt), fragment);
            }
        }
        for (int i2 = 0; i2 < this.mSavedStates.size(); i2++) {
            long jKeyAt2 = this.mSavedStates.keyAt(i2);
            if (containsItem(jKeyAt2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, jKeyAt2), this.mSavedStates.get(jKeyAt2));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(android.os.Parcelable parcelable) {
        if (!this.mSavedStates.isEmpty() || !this.mFragments.isEmpty()) {
            throw new java.lang.IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        android.os.Bundle bundle = (android.os.Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (java.lang.String str : bundle.keySet()) {
            if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                this.mFragments.put(parseIdFromKey(str, KEY_PREFIX_FRAGMENT), this.mFragmentManager.getFragment(bundle, str));
            } else if (isValidKey(str, KEY_PREFIX_STATE)) {
                long idFromKey = parseIdFromKey(str, KEY_PREFIX_STATE);
                androidx.fragment.app.Fragment.SavedState savedState = (androidx.fragment.app.Fragment.SavedState) bundle.getParcelable(str);
                if (containsItem(idFromKey)) {
                    this.mSavedStates.put(idFromKey, savedState);
                }
            } else {
                throw new java.lang.IllegalArgumentException("Unexpected key in savedState: " + str);
            }
        }
        if (this.mFragments.isEmpty()) {
            return;
        }
        this.mHasStaleFragments = true;
        this.mIsInGracePeriod = true;
        gcFragments();
        scheduleGracePeriodEnd();
    }

    private void scheduleGracePeriodEnd() {
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                androidx.viewpager2.adapter.FragmentStateAdapter.this.mIsInGracePeriod = false;
                androidx.viewpager2.adapter.FragmentStateAdapter.this.gcFragments();
            }
        };
        this.mLifecycle.addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(runnable);
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            }
        });
        handler.postDelayed(runnable, 10000L);
    }

    private static java.lang.String createKey(java.lang.String str, long j) {
        return str + j;
    }

    private static boolean isValidKey(java.lang.String str, java.lang.String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private static long parseIdFromKey(java.lang.String str, java.lang.String str2) {
        return java.lang.Long.parseLong(str.substring(str2.length()));
    }

    class FragmentMaxLifecycleEnforcer {
        private androidx.recyclerview.widget.RecyclerView.AdapterDataObserver mDataObserver;
        private androidx.lifecycle.LifecycleEventObserver mLifecycleObserver;
        private androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback mPageChangeCallback;
        private long mPrimaryItemId = -1;
        private androidx.viewpager2.widget.ViewPager2 mViewPager;

        FragmentMaxLifecycleEnforcer() {
        }

        void register(androidx.recyclerview.widget.RecyclerView recyclerView) {
            this.mViewPager = inferViewPager(recyclerView);
            androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback = new androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.1
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrollStateChanged(int i) {
                    androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageSelected(int i) {
                    androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            this.mPageChangeCallback = onPageChangeCallback;
            this.mViewPager.registerOnPageChangeCallback(onPageChangeCallback);
            androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver = new androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.2
                @Override // androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(true);
                }
            };
            this.mDataObserver = dataSetChangeObserver;
            androidx.viewpager2.adapter.FragmentStateAdapter.this.registerAdapterDataObserver(dataSetChangeObserver);
            this.mLifecycleObserver = new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                    androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            androidx.viewpager2.adapter.FragmentStateAdapter.this.mLifecycle.addObserver(this.mLifecycleObserver);
        }

        void unregister(androidx.recyclerview.widget.RecyclerView recyclerView) {
            inferViewPager(recyclerView).unregisterOnPageChangeCallback(this.mPageChangeCallback);
            androidx.viewpager2.adapter.FragmentStateAdapter.this.unregisterAdapterDataObserver(this.mDataObserver);
            androidx.viewpager2.adapter.FragmentStateAdapter.this.mLifecycle.removeObserver(this.mLifecycleObserver);
            this.mViewPager = null;
        }

        void updateFragmentMaxLifecycle(boolean z) {
            int currentItem;
            androidx.fragment.app.Fragment fragment;
            if (androidx.viewpager2.adapter.FragmentStateAdapter.this.shouldDelayFragmentTransactions() || this.mViewPager.getScrollState() != 0 || androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragments.isEmpty() || androidx.viewpager2.adapter.FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.mViewPager.getCurrentItem()) >= androidx.viewpager2.adapter.FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = androidx.viewpager2.adapter.FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.mPrimaryItemId || z) && (fragment = androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragments.get(itemId)) != null && fragment.isAdded()) {
                this.mPrimaryItemId = itemId;
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragmentManager.beginTransaction();
                androidx.fragment.app.Fragment fragment2 = null;
                for (int i = 0; i < androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragments.size(); i++) {
                    long jKeyAt = androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragments.keyAt(i);
                    androidx.fragment.app.Fragment fragmentValueAt = androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragments.valueAt(i);
                    if (fragmentValueAt.isAdded()) {
                        if (jKeyAt != this.mPrimaryItemId) {
                            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentValueAt, androidx.lifecycle.Lifecycle.State.STARTED);
                        } else {
                            fragment2 = fragmentValueAt;
                        }
                        fragmentValueAt.setMenuVisibility(jKeyAt == this.mPrimaryItemId);
                    }
                }
                if (fragment2 != null) {
                    fragmentTransactionBeginTransaction.setMaxLifecycle(fragment2, androidx.lifecycle.Lifecycle.State.RESUMED);
                }
                if (fragmentTransactionBeginTransaction.isEmpty()) {
                    return;
                }
                fragmentTransactionBeginTransaction.commitNow();
            }
        }

        private androidx.viewpager2.widget.ViewPager2 inferViewPager(androidx.recyclerview.widget.RecyclerView recyclerView) {
            android.view.ViewParent parent = recyclerView.getParent();
            if (parent instanceof androidx.viewpager2.widget.ViewPager2) {
                return (androidx.viewpager2.widget.ViewPager2) parent;
            }
            throw new java.lang.IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }
    }

    private static abstract class DataSetChangeObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        private DataSetChangeObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }
    }
}
