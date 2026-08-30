package androidx.viewpager2.widget;

/* JADX INFO: loaded from: classes3.dex */
final class CompositeOnPageChangeCallback extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
    private final java.util.List<androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback> mCallbacks;

    CompositeOnPageChangeCallback(int i) {
        this.mCallbacks = new java.util.ArrayList(i);
    }

    void addOnPageChangeCallback(androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mCallbacks.add(onPageChangeCallback);
    }

    void removeOnPageChangeCallback(androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mCallbacks.remove(onPageChangeCallback);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i, float f, int i2) {
        try {
            java.util.Iterator<androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i, f, i2);
            }
        } catch (java.util.ConcurrentModificationException e) {
            throwCallbackListModifiedWhileInUse(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i) {
        try {
            java.util.Iterator<androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i);
            }
        } catch (java.util.ConcurrentModificationException e) {
            throwCallbackListModifiedWhileInUse(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i) {
        try {
            java.util.Iterator<androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i);
            }
        } catch (java.util.ConcurrentModificationException e) {
            throwCallbackListModifiedWhileInUse(e);
        }
    }

    private void throwCallbackListModifiedWhileInUse(java.util.ConcurrentModificationException concurrentModificationException) {
        throw new java.lang.IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
