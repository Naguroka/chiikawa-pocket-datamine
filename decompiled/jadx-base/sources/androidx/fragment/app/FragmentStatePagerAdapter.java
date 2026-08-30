package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class FragmentStatePagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @java.lang.Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "FragmentStatePagerAdapt";
    private final int mBehavior;
    private androidx.fragment.app.FragmentTransaction mCurTransaction;
    private androidx.fragment.app.Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final androidx.fragment.app.FragmentManager mFragmentManager;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mFragments;
    private java.util.ArrayList<androidx.fragment.app.Fragment.SavedState> mSavedState;

    public abstract androidx.fragment.app.Fragment getItem(int i);

    @java.lang.Deprecated
    public FragmentStatePagerAdapter(androidx.fragment.app.FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public FragmentStatePagerAdapter(androidx.fragment.app.FragmentManager fragmentManager, int i) {
        this.mCurTransaction = null;
        this.mSavedState = new java.util.ArrayList<>();
        this.mFragments = new java.util.ArrayList<>();
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(android.view.ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new java.lang.IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i) {
        androidx.fragment.app.Fragment.SavedState savedState;
        androidx.fragment.app.Fragment fragment;
        if (this.mFragments.size() > i && (fragment = this.mFragments.get(i)) != null) {
            return fragment;
        }
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        androidx.fragment.app.Fragment item = getItem(i);
        if (this.mSavedState.size() > i && (savedState = this.mSavedState.get(i)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.mFragments.size() <= i) {
            this.mFragments.add(null);
        }
        item.setMenuVisibility(false);
        if (this.mBehavior == 0) {
            item.setUserVisibleHint(false);
        }
        this.mFragments.set(i, item);
        this.mCurTransaction.add(viewGroup.getId(), item);
        if (this.mBehavior == 1) {
            this.mCurTransaction.setMaxLifecycle(item, androidx.lifecycle.Lifecycle.State.STARTED);
        }
        return item;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        while (this.mSavedState.size() <= i) {
            this.mSavedState.add(null);
        }
        this.mSavedState.set(i, fragment.isAdded() ? this.mFragmentManager.saveFragmentInstanceState(fragment) : null);
        this.mFragments.set(i, null);
        this.mCurTransaction.remove(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        androidx.fragment.app.Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.beginTransaction();
                    }
                    this.mCurTransaction.setMaxLifecycle(this.mCurrentPrimaryItem, androidx.lifecycle.Lifecycle.State.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.beginTransaction();
                }
                this.mCurTransaction.setMaxLifecycle(fragment, androidx.lifecycle.Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(android.view.ViewGroup viewGroup) {
        androidx.fragment.app.FragmentTransaction fragmentTransaction = this.mCurTransaction;
        if (fragmentTransaction != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    fragmentTransaction.commitNowAllowingStateLoss();
                    this.mExecutingFinishUpdate = false;
                } catch (java.lang.Throwable th) {
                    this.mExecutingFinishUpdate = false;
                    throw th;
                }
            }
            this.mCurTransaction = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return ((androidx.fragment.app.Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public android.os.Parcelable saveState() {
        android.os.Bundle bundle;
        if (this.mSavedState.size() > 0) {
            bundle = new android.os.Bundle();
            androidx.fragment.app.Fragment.SavedState[] savedStateArr = new androidx.fragment.app.Fragment.SavedState[this.mSavedState.size()];
            this.mSavedState.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.mFragments.size(); i++) {
            androidx.fragment.app.Fragment fragment = this.mFragments.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new android.os.Bundle();
                }
                this.mFragmentManager.putFragment(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
        if (parcelable != null) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.mSavedState.clear();
            this.mFragments.clear();
            if (parcelableArray != null) {
                for (android.os.Parcelable parcelable2 : parcelableArray) {
                    this.mSavedState.add((androidx.fragment.app.Fragment.SavedState) parcelable2);
                }
            }
            for (java.lang.String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i = java.lang.Integer.parseInt(str.substring(1));
                    androidx.fragment.app.Fragment fragment = this.mFragmentManager.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.mFragments.size() <= i) {
                            this.mFragments.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        this.mFragments.set(i, fragment);
                    } else {
                        android.util.Log.w(TAG, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }
}
