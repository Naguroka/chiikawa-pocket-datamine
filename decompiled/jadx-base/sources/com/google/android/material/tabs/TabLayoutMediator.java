package com.google.android.material.tabs;

/* JADX INFO: loaded from: classes5.dex */
public final class TabLayoutMediator {
    private androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter;
    private boolean attached;
    private final boolean autoRefresh;
    private com.google.android.material.tabs.TabLayoutMediator.TabLayoutOnPageChangeCallback onPageChangeCallback;
    private com.google.android.material.tabs.TabLayout.OnTabSelectedListener onTabSelectedListener;
    private androidx.recyclerview.widget.RecyclerView.AdapterDataObserver pagerAdapterObserver;
    private final boolean smoothScroll;
    private final com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy tabConfigurationStrategy;
    private final com.google.android.material.tabs.TabLayout tabLayout;
    private final androidx.viewpager2.widget.ViewPager2 viewPager;

    public interface TabConfigurationStrategy {
        void onConfigureTab(com.google.android.material.tabs.TabLayout.Tab tab, int i);
    }

    public TabLayoutMediator(com.google.android.material.tabs.TabLayout tabLayout, androidx.viewpager2.widget.ViewPager2 viewPager2, com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(com.google.android.material.tabs.TabLayout tabLayout, androidx.viewpager2.widget.ViewPager2 viewPager2, boolean z, com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, z, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(com.google.android.material.tabs.TabLayout tabLayout, androidx.viewpager2.widget.ViewPager2 viewPager2, boolean z, boolean z2, com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy tabConfigurationStrategy) {
        this.tabLayout = tabLayout;
        this.viewPager = viewPager2;
        this.autoRefresh = z;
        this.smoothScroll = z2;
        this.tabConfigurationStrategy = tabConfigurationStrategy;
    }

    public void attach() {
        if (this.attached) {
            throw new java.lang.IllegalStateException("TabLayoutMediator is already attached");
        }
        androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter = this.viewPager.getAdapter();
        this.adapter = adapter;
        if (adapter == null) {
            throw new java.lang.IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.attached = true;
        com.google.android.material.tabs.TabLayoutMediator.TabLayoutOnPageChangeCallback tabLayoutOnPageChangeCallback = new com.google.android.material.tabs.TabLayoutMediator.TabLayoutOnPageChangeCallback(this.tabLayout);
        this.onPageChangeCallback = tabLayoutOnPageChangeCallback;
        this.viewPager.registerOnPageChangeCallback(tabLayoutOnPageChangeCallback);
        com.google.android.material.tabs.TabLayoutMediator.ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new com.google.android.material.tabs.TabLayoutMediator.ViewPagerOnTabSelectedListener(this.viewPager, this.smoothScroll);
        this.onTabSelectedListener = viewPagerOnTabSelectedListener;
        this.tabLayout.addOnTabSelectedListener((com.google.android.material.tabs.TabLayout.OnTabSelectedListener) viewPagerOnTabSelectedListener);
        if (this.autoRefresh) {
            com.google.android.material.tabs.TabLayoutMediator.PagerAdapterObserver pagerAdapterObserver = new com.google.android.material.tabs.TabLayoutMediator.PagerAdapterObserver();
            this.pagerAdapterObserver = pagerAdapterObserver;
            this.adapter.registerAdapterDataObserver(pagerAdapterObserver);
        }
        populateTabsFromPagerAdapter();
        this.tabLayout.setScrollPosition(this.viewPager.getCurrentItem(), 0.0f, true);
    }

    public void detach() {
        androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter;
        if (this.autoRefresh && (adapter = this.adapter) != null) {
            adapter.unregisterAdapterDataObserver(this.pagerAdapterObserver);
            this.pagerAdapterObserver = null;
        }
        this.tabLayout.removeOnTabSelectedListener(this.onTabSelectedListener);
        this.viewPager.unregisterOnPageChangeCallback(this.onPageChangeCallback);
        this.onTabSelectedListener = null;
        this.onPageChangeCallback = null;
        this.adapter = null;
        this.attached = false;
    }

    public boolean isAttached() {
        return this.attached;
    }

    void populateTabsFromPagerAdapter() {
        this.tabLayout.removeAllTabs();
        androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter = this.adapter;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                com.google.android.material.tabs.TabLayout.Tab tabNewTab = this.tabLayout.newTab();
                this.tabConfigurationStrategy.onConfigureTab(tabNewTab, i);
                this.tabLayout.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = java.lang.Math.min(this.viewPager.getCurrentItem(), this.tabLayout.getTabCount() - 1);
                if (iMin != this.tabLayout.getSelectedTabPosition()) {
                    com.google.android.material.tabs.TabLayout tabLayout = this.tabLayout;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    private static class TabLayoutOnPageChangeCallback extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        private int previousScrollState;
        private int scrollState;
        private final java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> tabLayoutRef;

        TabLayoutOnPageChangeCallback(com.google.android.material.tabs.TabLayout tabLayout) {
            this.tabLayoutRef = new java.lang.ref.WeakReference<>(tabLayout);
            reset();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            com.google.android.material.tabs.TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i3 = this.scrollState;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.previousScrollState == 1, (i3 == 2 && this.previousScrollState == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            com.google.android.material.tabs.TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.scrollState;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.previousScrollState == 0));
        }

        void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    private static class ViewPagerOnTabSelectedListener implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        private final boolean smoothScroll;
        private final androidx.viewpager2.widget.ViewPager2 viewPager;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab tab) {
        }

        ViewPagerOnTabSelectedListener(androidx.viewpager2.widget.ViewPager2 viewPager2, boolean z) {
            this.viewPager = viewPager2;
            this.smoothScroll = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab tab) {
            this.viewPager.setCurrentItem(tab.getPosition(), this.smoothScroll);
        }
    }

    private class PagerAdapterObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        PagerAdapterObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            com.google.android.material.tabs.TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            com.google.android.material.tabs.TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            com.google.android.material.tabs.TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            com.google.android.material.tabs.TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            com.google.android.material.tabs.TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            com.google.android.material.tabs.TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }
    }
}
