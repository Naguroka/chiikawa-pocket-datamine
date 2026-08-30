package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.activity.result.ActivityResultCaller {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final java.lang.Object USE_DEFAULT_TRANSITION = new java.lang.Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    androidx.fragment.app.Fragment.AnimationInfo mAnimationInfo;
    android.os.Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    androidx.fragment.app.FragmentManager mChildFragmentManager;
    android.view.ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    androidx.fragment.app.FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    androidx.fragment.app.FragmentHostCallback<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private java.lang.Boolean mIsPrimaryNavigationFragment;
    android.view.LayoutInflater mLayoutInflater;
    androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    androidx.lifecycle.Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private final java.util.ArrayList<androidx.fragment.app.Fragment.OnPreAttachedListener> mOnPreAttachedListeners;
    androidx.fragment.app.Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    java.lang.Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    android.os.Bundle mSavedFragmentState;
    androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;
    java.lang.Boolean mSavedUserVisibleHint;
    android.os.Bundle mSavedViewRegistryState;
    android.util.SparseArray<android.os.Parcelable> mSavedViewState;
    int mState;
    java.lang.String mTag;
    androidx.fragment.app.Fragment mTarget;
    int mTargetRequestCode;
    java.lang.String mTargetWho;
    boolean mUserVisibleHint;
    android.view.View mView;
    androidx.fragment.app.FragmentViewLifecycleOwner mViewLifecycleOwner;
    androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> mViewLifecycleOwnerLiveData;
    java.lang.String mWho;

    interface OnStartEnterTransitionListener {
        void onStartEnterTransition();

        void startListening();
    }

    @java.lang.Deprecated
    public void onAttachFragment(androidx.fragment.app.Fragment fragment) {
    }

    public boolean onContextItemSelected(android.view.MenuItem menuItem) {
        return false;
    }

    public android.view.animation.Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public android.animation.Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
    }

    public void onDestroyOptionsMenu() {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(android.view.Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(android.view.Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @java.lang.Deprecated
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
    }

    private static abstract class OnPreAttachedListener {
        abstract void onPreAttached();

        private OnPreAttachedListener() {
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public androidx.lifecycle.LifecycleOwner getViewLifecycleOwner() {
        androidx.fragment.app.FragmentViewLifecycleOwner fragmentViewLifecycleOwner = this.mViewLifecycleOwner;
        if (fragmentViewLifecycleOwner != null) {
            return fragmentViewLifecycleOwner;
        }
        throw new java.lang.IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public androidx.lifecycle.LiveData<androidx.lifecycle.LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == androidx.lifecycle.Lifecycle.State.INITIALIZED.ordinal()) {
            throw new java.lang.IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        return this.mFragmentManager.getViewModelStore(this);
    }

    private int getMinimumMaxLifecycleState() {
        if (this.mMaxState == androidx.lifecycle.Lifecycle.State.INITIALIZED || this.mParentFragment == null) {
            return this.mMaxState.ordinal();
        }
        return java.lang.Math.min(this.mMaxState.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        android.app.Application application;
        if (this.mFragmentManager == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            android.content.Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof android.content.ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof android.app.Application) {
                    application = (android.app.Application) applicationContext;
                    break;
                }
                applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                android.util.Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.SavedStateViewModelFactory(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.Fragment.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.fragment.app.Fragment.SavedState>() { // from class: androidx.fragment.app.Fragment.SavedState.1
            @Override // android.os.Parcelable.Creator
            public androidx.fragment.app.Fragment.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.fragment.app.Fragment.SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.fragment.app.Fragment.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.fragment.app.Fragment.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.fragment.app.Fragment.SavedState[] newArray(int i) {
                return new androidx.fragment.app.Fragment.SavedState[i];
            }
        };
        final android.os.Bundle mState;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState(android.os.Bundle bundle) {
            this.mState = bundle;
        }

        SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            android.os.Bundle bundle = parcel.readBundle();
            this.mState = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeBundle(this.mState);
        }
    }

    public static class InstantiationException extends java.lang.RuntimeException {
        public InstantiationException(java.lang.String str, java.lang.Exception exc) {
            super(str, exc);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = java.util.UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new androidx.fragment.app.FragmentManagerImpl();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new java.lang.Runnable() { // from class: androidx.fragment.app.Fragment.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.fragment.app.Fragment.this.startPostponedEnterTransition();
            }
        };
        this.mMaxState = androidx.lifecycle.Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.MutableLiveData<>();
        this.mNextLocalRequestCode = new java.util.concurrent.atomic.AtomicInteger();
        this.mOnPreAttachedListeners = new java.util.ArrayList<>();
        initLifecycle();
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.LifecycleRegistry(this);
        this.mSavedStateRegistryController = androidx.savedstate.SavedStateRegistryController.create(this);
        this.mDefaultFactory = null;
    }

    @java.lang.Deprecated
    public static androidx.fragment.app.Fragment instantiate(android.content.Context context, java.lang.String str) {
        return instantiate(context, str, null);
    }

    @java.lang.Deprecated
    public static androidx.fragment.app.Fragment instantiate(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        try {
            androidx.fragment.app.Fragment fragmentNewInstance = androidx.fragment.app.FragmentFactory.loadFragmentClass(context.getClassLoader(), str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (java.lang.IllegalAccessException e) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (java.lang.InstantiationException e2) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    final void restoreViewState(android.os.Bundle bundle) {
        android.util.SparseArray<android.os.Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.performRestore(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new androidx.fragment.app.SuperNotCalledException("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
        }
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(java.lang.Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final java.lang.String getTag() {
        return this.mTag;
    }

    public void setArguments(android.os.Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new java.lang.IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public final android.os.Bundle getArguments() {
        return this.mArguments;
    }

    public final android.os.Bundle requireArguments() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final boolean isStateSaved() {
        androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.isStateSaved();
    }

    public void setInitialSavedState(androidx.fragment.app.Fragment.SavedState savedState) {
        if (this.mFragmentManager != null) {
            throw new java.lang.IllegalStateException("Fragment already added");
        }
        this.mSavedFragmentState = (savedState == null || savedState.mState == null) ? null : savedState.mState;
    }

    @java.lang.Deprecated
    public void setTargetFragment(androidx.fragment.app.Fragment fragment, int i) {
        androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
        androidx.fragment.app.FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new java.lang.IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (androidx.fragment.app.Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment()) {
            if (targetFragment.equals(this)) {
                throw new java.lang.IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i;
    }

    @java.lang.Deprecated
    public final androidx.fragment.app.Fragment getTargetFragment() {
        java.lang.String str;
        androidx.fragment.app.Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.findActiveFragment(str);
    }

    @java.lang.Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public android.content.Context getContext() {
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.getContext();
    }

    public final android.content.Context requireContext() {
        android.content.Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final androidx.fragment.app.FragmentActivity getActivity() {
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return (androidx.fragment.app.FragmentActivity) fragmentHostCallback.getActivity();
    }

    public final androidx.fragment.app.FragmentActivity requireActivity() {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final java.lang.Object getHost() {
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.onGetHost();
    }

    public final java.lang.Object requireHost() {
        java.lang.Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final android.content.res.Resources getResources() {
        return requireContext().getResources();
    }

    public final java.lang.CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public final java.lang.String getString(int i) {
        return getResources().getString(i);
    }

    public final java.lang.String getString(int i, java.lang.Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @java.lang.Deprecated
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final androidx.fragment.app.FragmentManager getParentFragmentManager() {
        androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @java.lang.Deprecated
    public final androidx.fragment.app.FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final androidx.fragment.app.FragmentManager getChildFragmentManager() {
        if (this.mHost == null) {
            throw new java.lang.IllegalStateException("Fragment " + this + " has not been attached yet.");
        }
        return this.mChildFragmentManager;
    }

    public final androidx.fragment.app.Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final androidx.fragment.app.Fragment requireParentFragment() {
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new java.lang.IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    final boolean isRemovingParent() {
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isVisible() {
        android.view.View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isMenuVisible() {
        androidx.fragment.app.FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.isParentMenuVisible(this.mParentFragment));
    }

    @java.lang.Deprecated
    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.addRetainedFragment(this);
        } else {
            fragmentManager.removeRetainedFragment(this);
        }
    }

    @java.lang.Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.onSupportInvalidateOptionsMenu();
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.onSupportInvalidateOptionsMenu();
            }
        }
    }

    @java.lang.Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.performPendingDeferredStart(fragmentManager.createOrGetFragmentStateManager(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = java.lang.Boolean.valueOf(z);
        }
    }

    @java.lang.Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @java.lang.Deprecated
    public androidx.loader.app.LoaderManager getLoaderManager() {
        return androidx.loader.app.LoaderManager.getInstance(this);
    }

    public void startActivity(android.content.Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(android.content.Intent intent, android.os.Bundle bundle) {
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        fragmentHostCallback.onStartActivityFromFragment(this, intent, -1, bundle);
    }

    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent intent, int i, android.os.Bundle bundle) {
        if (this.mHost == null) {
            throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        getParentFragmentManager().launchStartActivityForResult(this, intent, i, bundle);
    }

    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().launchStartIntentSenderForResult(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    @java.lang.Deprecated
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @java.lang.Deprecated
    public final void requestPermissions(java.lang.String[] strArr, int i) {
        if (this.mHost == null) {
            throw new java.lang.IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        getParentFragmentManager().launchRequestPermissions(this, strArr, i);
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String str) {
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            return fragmentHostCallback.onShouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public final android.view.LayoutInflater getLayoutInflater() {
        android.view.LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    android.view.LayoutInflater performGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    @java.lang.Deprecated
    public android.view.LayoutInflater getLayoutInflater(android.os.Bundle bundle) {
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            throw new java.lang.IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = fragmentHostCallback.onGetLayoutInflater();
        androidx.core.view.LayoutInflaterCompat.setFactory2(layoutInflaterOnGetLayoutInflater, this.mChildFragmentManager.getLayoutInflaterFactory());
        return layoutInflaterOnGetLayoutInflater;
    }

    public void onInflate(android.content.Context context, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.mCalled = true;
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        android.app.Activity activity = fragmentHostCallback == null ? null : fragmentHostCallback.getActivity();
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @java.lang.Deprecated
    public void onInflate(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(android.content.Context context) {
        this.mCalled = true;
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        android.app.Activity activity = fragmentHostCallback == null ? null : fragmentHostCallback.getActivity();
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @java.lang.Deprecated
    public void onAttach(android.app.Activity activity) {
        this.mCalled = true;
    }

    public void onCreate(android.os.Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.isStateAtLeast(1)) {
            return;
        }
        this.mChildFragmentManager.dispatchCreate();
    }

    void restoreChildFragmentState(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.restoreSaveState(parcelable);
        this.mChildFragmentManager.dispatchCreate();
    }

    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public android.view.View getView() {
        return this.mView;
    }

    public final android.view.View requireView() {
        android.view.View view = getView();
        if (view != null) {
            return view;
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @java.lang.Deprecated
    public void onActivityCreated(android.os.Bundle bundle) {
        this.mCalled = true;
    }

    public void onViewStateRestored(android.os.Bundle bundle) {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.mCalled = true;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    void initState() {
        initLifecycle();
        this.mWho = java.util.UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new androidx.fragment.app.FragmentManagerImpl();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void registerForContextMenu(android.view.View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void unregisterForContextMenu(android.view.View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public void setEnterSharedElementCallback(androidx.core.app.SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().mEnterTransitionCallback = sharedElementCallback;
    }

    public void setExitSharedElementCallback(androidx.core.app.SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().mExitTransitionCallback = sharedElementCallback;
    }

    public void setEnterTransition(java.lang.Object obj) {
        ensureAnimationInfo().mEnterTransition = obj;
    }

    public java.lang.Object getEnterTransition() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mEnterTransition;
    }

    public void setReturnTransition(java.lang.Object obj) {
        ensureAnimationInfo().mReturnTransition = obj;
    }

    public java.lang.Object getReturnTransition() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mReturnTransition == USE_DEFAULT_TRANSITION ? getEnterTransition() : this.mAnimationInfo.mReturnTransition;
    }

    public void setExitTransition(java.lang.Object obj) {
        ensureAnimationInfo().mExitTransition = obj;
    }

    public java.lang.Object getExitTransition() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mExitTransition;
    }

    public void setReenterTransition(java.lang.Object obj) {
        ensureAnimationInfo().mReenterTransition = obj;
    }

    public java.lang.Object getReenterTransition() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mReenterTransition == USE_DEFAULT_TRANSITION ? getExitTransition() : this.mAnimationInfo.mReenterTransition;
    }

    public void setSharedElementEnterTransition(java.lang.Object obj) {
        ensureAnimationInfo().mSharedElementEnterTransition = obj;
    }

    public java.lang.Object getSharedElementEnterTransition() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mSharedElementEnterTransition;
    }

    public void setSharedElementReturnTransition(java.lang.Object obj) {
        ensureAnimationInfo().mSharedElementReturnTransition = obj;
    }

    public java.lang.Object getSharedElementReturnTransition() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        if (animationInfo.mSharedElementReturnTransition == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return this.mAnimationInfo.mSharedElementReturnTransition;
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().mAllowEnterTransitionOverlap = java.lang.Boolean.valueOf(z);
    }

    public boolean getAllowEnterTransitionOverlap() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null || animationInfo.mAllowEnterTransitionOverlap == null) {
            return true;
        }
        return this.mAnimationInfo.mAllowEnterTransitionOverlap.booleanValue();
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().mAllowReturnTransitionOverlap = java.lang.Boolean.valueOf(z);
    }

    public boolean getAllowReturnTransitionOverlap() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null || animationInfo.mAllowReturnTransitionOverlap == null) {
            return true;
        }
        return this.mAnimationInfo.mAllowReturnTransitionOverlap.booleanValue();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().mEnterTransitionPostponed = true;
    }

    public final void postponeEnterTransition(long j, java.util.concurrent.TimeUnit timeUnit) {
        android.os.Handler handler;
        ensureAnimationInfo().mEnterTransitionPostponed = true;
        androidx.fragment.app.FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.getHost().getHandler();
        } else {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().mEnterTransitionPostponed) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().mEnterTransitionPostponed = false;
        } else if (android.os.Looper.myLooper() != this.mHost.getHandler().getLooper()) {
            this.mHost.getHandler().postAtFrontOfQueue(new java.lang.Runnable() { // from class: androidx.fragment.app.Fragment.2
                @Override // java.lang.Runnable
                public void run() {
                    androidx.fragment.app.Fragment.this.callStartTransitionListener(false);
                }
            });
        } else {
            callStartTransitionListener(true);
        }
    }

    void callStartTransitionListener(boolean z) {
        android.view.ViewGroup viewGroup;
        androidx.fragment.app.FragmentManager fragmentManager;
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        androidx.fragment.app.Fragment.OnStartEnterTransitionListener onStartEnterTransitionListener = null;
        if (animationInfo != null) {
            animationInfo.mEnterTransitionPostponed = false;
            androidx.fragment.app.Fragment.OnStartEnterTransitionListener onStartEnterTransitionListener2 = this.mAnimationInfo.mStartEnterTransitionListener;
            this.mAnimationInfo.mStartEnterTransitionListener = null;
            onStartEnterTransitionListener = onStartEnterTransitionListener2;
        }
        if (onStartEnterTransitionListener != null) {
            onStartEnterTransitionListener.onStartEnterTransition();
            return;
        }
        if (!androidx.fragment.app.FragmentManager.USE_STATE_MANAGER || this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        final androidx.fragment.app.SpecialEffectsController orCreateController = androidx.fragment.app.SpecialEffectsController.getOrCreateController(viewGroup, fragmentManager);
        orCreateController.markPostponedState();
        if (z) {
            this.mHost.getHandler().post(new java.lang.Runnable() { // from class: androidx.fragment.app.Fragment.3
                @Override // java.lang.Runnable
                public void run() {
                    orCreateController.executePendingOperations();
                }
            });
        } else {
            orCreateController.executePendingOperations();
        }
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(java.lang.Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(java.lang.Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        androidx.fragment.app.Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.LoaderManager.getInstance(this).dump(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.dump(str + "  ", fileDescriptor, printWriter, strArr);
    }

    androidx.fragment.app.Fragment findFragmentByWho(java.lang.String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.findFragmentByWho(str);
    }

    androidx.fragment.app.FragmentContainer createFragmentContainer() {
        return new androidx.fragment.app.FragmentContainer() { // from class: androidx.fragment.app.Fragment.4
            @Override // androidx.fragment.app.FragmentContainer
            public android.view.View onFindViewById(int i) {
                if (androidx.fragment.app.Fragment.this.mView == null) {
                    throw new java.lang.IllegalStateException("Fragment " + androidx.fragment.app.Fragment.this + " does not have a view");
                }
                return androidx.fragment.app.Fragment.this.mView.findViewById(i);
            }

            @Override // androidx.fragment.app.FragmentContainer
            public boolean onHasView() {
                return androidx.fragment.app.Fragment.this.mView != null;
            }
        };
    }

    void performAttach() {
        java.util.Iterator<androidx.fragment.app.Fragment.OnPreAttachedListener> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().onPreAttached();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.attachController(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.getContext());
        if (!this.mCalled) {
            throw new androidx.fragment.app.SuperNotCalledException("Fragment " + this + " did not call through to super.onAttach()");
        }
        this.mFragmentManager.dispatchOnAttachFragment(this);
        this.mChildFragmentManager.dispatchAttach();
    }

    void performCreate(android.os.Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                if (event != androidx.lifecycle.Lifecycle.Event.ON_STOP || androidx.fragment.app.Fragment.this.mView == null) {
                    return;
                }
                androidx.fragment.app.Fragment.this.mView.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.performRestore(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new androidx.fragment.app.SuperNotCalledException("Fragment " + this + " did not call through to super.onCreate()");
        }
        this.mLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
    }

    void performCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new androidx.fragment.app.FragmentViewLifecycleOwner(this, getViewModelStore());
        android.view.View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView != null) {
            this.mViewLifecycleOwner.initialize();
            androidx.lifecycle.ViewTreeLifecycleOwner.set(this.mView, this.mViewLifecycleOwner);
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(this.mView, this.mViewLifecycleOwner);
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.isInitialized()) {
            throw new java.lang.IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.mViewLifecycleOwner = null;
    }

    void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.dispatchViewCreated();
    }

    void performActivityCreated(android.os.Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new androidx.fragment.app.SuperNotCalledException("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        restoreViewState();
        this.mChildFragmentManager.dispatchActivityCreated();
    }

    private void restoreViewState() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    void performStart() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new androidx.fragment.app.SuperNotCalledException("Fragment " + this + " did not call through to super.onStart()");
        }
        this.mLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START);
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START);
        }
        this.mChildFragmentManager.dispatchStart();
    }

    void performResume() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new androidx.fragment.app.SuperNotCalledException("Fragment " + this + " did not call through to super.onResume()");
        }
        this.mLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
        }
        this.mChildFragmentManager.dispatchResume();
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.noteStateNotSaved();
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zIsPrimaryNavigation = this.mFragmentManager.isPrimaryNavigation(this);
        java.lang.Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zIsPrimaryNavigation) {
            this.mIsPrimaryNavigationFragment = java.lang.Boolean.valueOf(zIsPrimaryNavigation);
            onPrimaryNavigationFragmentChanged(zIsPrimaryNavigation);
            this.mChildFragmentManager.dispatchPrimaryNavigationFragmentChanged();
        }
    }

    void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.dispatchMultiWindowModeChanged(z);
    }

    void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.dispatchPictureInPictureModeChanged(z);
    }

    void performConfigurationChanged(android.content.res.Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.dispatchConfigurationChanged(configuration);
    }

    void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.dispatchLowMemory();
    }

    boolean performCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuInflater);
    }

    boolean performPrepareOptionsMenu(android.view.Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
    }

    boolean performOptionsItemSelected(android.view.MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.dispatchOptionsItemSelected(menuItem);
    }

    boolean performContextItemSelected(android.view.MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.dispatchContextItemSelected(menuItem);
    }

    void performOptionsMenuClosed(android.view.Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.dispatchOptionsMenuClosed(menu);
    }

    void performSaveInstanceState(android.os.Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.performSave(bundle);
        android.os.Parcelable parcelableSaveAllState = this.mChildFragmentManager.saveAllState();
        if (parcelableSaveAllState != null) {
            bundle.putParcelable("android:support:fragments", parcelableSaveAllState);
        }
    }

    void performPause() {
        this.mChildFragmentManager.dispatchPause();
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new androidx.fragment.app.SuperNotCalledException("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void performStop() {
        this.mChildFragmentManager.dispatchStop();
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new androidx.fragment.app.SuperNotCalledException("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void performDestroyView() {
        this.mChildFragmentManager.dispatchDestroyView();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().getState().isAtLeast(androidx.lifecycle.Lifecycle.State.CREATED)) {
            this.mViewLifecycleOwner.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new androidx.fragment.app.SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        androidx.loader.app.LoaderManager.getInstance(this).markForRedelivery();
        this.mPerformedCreateView = false;
    }

    void performDestroy() {
        this.mChildFragmentManager.dispatchDestroy();
        this.mLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new androidx.fragment.app.SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new androidx.fragment.app.SuperNotCalledException("Fragment " + this + " did not call through to super.onDetach()");
        }
        if (this.mChildFragmentManager.isDestroyed()) {
            return;
        }
        this.mChildFragmentManager.dispatchDestroy();
        this.mChildFragmentManager = new androidx.fragment.app.FragmentManagerImpl();
    }

    void setOnStartEnterTransitionListener(androidx.fragment.app.Fragment.OnStartEnterTransitionListener onStartEnterTransitionListener) {
        ensureAnimationInfo();
        if (onStartEnterTransitionListener == this.mAnimationInfo.mStartEnterTransitionListener) {
            return;
        }
        if (onStartEnterTransitionListener != null && this.mAnimationInfo.mStartEnterTransitionListener != null) {
            throw new java.lang.IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (this.mAnimationInfo.mEnterTransitionPostponed) {
            this.mAnimationInfo.mStartEnterTransitionListener = onStartEnterTransitionListener;
        }
        if (onStartEnterTransitionListener != null) {
            onStartEnterTransitionListener.startListening();
        }
    }

    private androidx.fragment.app.Fragment.AnimationInfo ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new androidx.fragment.app.Fragment.AnimationInfo();
        }
        return this.mAnimationInfo;
    }

    void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().mEnterAnim = i;
        ensureAnimationInfo().mExitAnim = i2;
        ensureAnimationInfo().mPopEnterAnim = i3;
        ensureAnimationInfo().mPopExitAnim = i4;
    }

    int getEnterAnim() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mEnterAnim;
    }

    int getExitAnim() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mExitAnim;
    }

    int getPopEnterAnim() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mPopEnterAnim;
    }

    int getPopExitAnim() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mPopExitAnim;
    }

    boolean getPopDirection() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.mIsPop;
    }

    void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().mIsPop = z;
    }

    int getNextTransition() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mNextTransition;
    }

    void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.mNextTransition = i;
    }

    java.util.ArrayList<java.lang.String> getSharedElementSourceNames() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null || animationInfo.mSharedElementSourceNames == null) {
            return new java.util.ArrayList<>();
        }
        return this.mAnimationInfo.mSharedElementSourceNames;
    }

    java.util.ArrayList<java.lang.String> getSharedElementTargetNames() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null || animationInfo.mSharedElementTargetNames == null) {
            return new java.util.ArrayList<>();
        }
        return this.mAnimationInfo.mSharedElementTargetNames;
    }

    void setSharedElementNames(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2) {
        ensureAnimationInfo();
        this.mAnimationInfo.mSharedElementSourceNames = arrayList;
        this.mAnimationInfo.mSharedElementTargetNames = arrayList2;
    }

    androidx.core.app.SharedElementCallback getEnterTransitionCallback() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mEnterTransitionCallback;
    }

    androidx.core.app.SharedElementCallback getExitTransitionCallback() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mExitTransitionCallback;
    }

    android.view.View getAnimatingAway() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mAnimatingAway;
    }

    void setAnimatingAway(android.view.View view) {
        ensureAnimationInfo().mAnimatingAway = view;
    }

    void setAnimator(android.animation.Animator animator) {
        ensureAnimationInfo().mAnimator = animator;
    }

    android.animation.Animator getAnimator() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mAnimator;
    }

    void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().mPostOnViewCreatedAlpha = f;
    }

    float getPostOnViewCreatedAlpha() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 1.0f;
        }
        return animationInfo.mPostOnViewCreatedAlpha;
    }

    void setFocusedView(android.view.View view) {
        ensureAnimationInfo().mFocusedView = view;
    }

    android.view.View getFocusedView() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mFocusedView;
    }

    boolean isPostponed() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.mEnterTransitionPostponed;
    }

    boolean isHideReplaced() {
        androidx.fragment.app.Fragment.AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.mIsHideReplaced;
    }

    void setHideReplaced(boolean z) {
        ensureAnimationInfo().mIsHideReplaced = z;
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> activityResultContract, androidx.activity.result.ActivityResultCallback<O> activityResultCallback) {
        return prepareCallInternal(activityResultContract, new androidx.arch.core.util.Function<java.lang.Void, androidx.activity.result.ActivityResultRegistry>() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.arch.core.util.Function
            public androidx.activity.result.ActivityResultRegistry apply(java.lang.Void r1) {
                if (androidx.fragment.app.Fragment.this.mHost instanceof androidx.activity.result.ActivityResultRegistryOwner) {
                    return ((androidx.activity.result.ActivityResultRegistryOwner) androidx.fragment.app.Fragment.this.mHost).getActivityResultRegistry();
                }
                return androidx.fragment.app.Fragment.this.requireActivity().getActivityResultRegistry();
            }
        }, activityResultCallback);
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> activityResultContract, final androidx.activity.result.ActivityResultRegistry activityResultRegistry, androidx.activity.result.ActivityResultCallback<O> activityResultCallback) {
        return prepareCallInternal(activityResultContract, new androidx.arch.core.util.Function<java.lang.Void, androidx.activity.result.ActivityResultRegistry>() { // from class: androidx.fragment.app.Fragment.7
            @Override // androidx.arch.core.util.Function
            public androidx.activity.result.ActivityResultRegistry apply(java.lang.Void r1) {
                return activityResultRegistry;
            }
        }, activityResultCallback);
    }

    private <I, O> androidx.activity.result.ActivityResultLauncher<I> prepareCallInternal(final androidx.activity.result.contract.ActivityResultContract<I, O> activityResultContract, final androidx.arch.core.util.Function<java.lang.Void, androidx.activity.result.ActivityResultRegistry> function, final androidx.activity.result.ActivityResultCallback<O> activityResultCallback) {
        if (this.mState > 1) {
            throw new java.lang.IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        }
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        registerOnPreAttachListener(new androidx.fragment.app.Fragment.OnPreAttachedListener() { // from class: androidx.fragment.app.Fragment.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // androidx.fragment.app.Fragment.OnPreAttachedListener
            void onPreAttached() {
                java.lang.String strGenerateActivityResultKey = androidx.fragment.app.Fragment.this.generateActivityResultKey();
                atomicReference.set(((androidx.activity.result.ActivityResultRegistry) function.apply(null)).register(strGenerateActivityResultKey, androidx.fragment.app.Fragment.this, activityResultContract, activityResultCallback));
            }
        });
        return new androidx.activity.result.ActivityResultLauncher<I>() { // from class: androidx.fragment.app.Fragment.9
            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i, androidx.core.app.ActivityOptionsCompat activityOptionsCompat) {
                androidx.activity.result.ActivityResultLauncher activityResultLauncher = (androidx.activity.result.ActivityResultLauncher) atomicReference.get();
                if (activityResultLauncher == null) {
                    throw new java.lang.IllegalStateException("Operation cannot be started before fragment is in created state");
                }
                activityResultLauncher.launch(i, activityOptionsCompat);
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                androidx.activity.result.ActivityResultLauncher activityResultLauncher = (androidx.activity.result.ActivityResultLauncher) atomicReference.getAndSet(null);
                if (activityResultLauncher != null) {
                    activityResultLauncher.unregister();
                }
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public androidx.activity.result.contract.ActivityResultContract<I, ?> getContract() {
                return activityResultContract;
            }
        };
    }

    private void registerOnPreAttachListener(androidx.fragment.app.Fragment.OnPreAttachedListener onPreAttachedListener) {
        if (this.mState >= 0) {
            onPreAttachedListener.onPreAttached();
        } else {
            this.mOnPreAttachedListeners.add(onPreAttachedListener);
        }
    }

    java.lang.String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    static class AnimationInfo {
        java.lang.Boolean mAllowEnterTransitionOverlap;
        java.lang.Boolean mAllowReturnTransitionOverlap;
        android.view.View mAnimatingAway;
        android.animation.Animator mAnimator;
        int mEnterAnim;
        boolean mEnterTransitionPostponed;
        int mExitAnim;
        boolean mIsHideReplaced;
        boolean mIsPop;
        int mNextTransition;
        int mPopEnterAnim;
        int mPopExitAnim;
        java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
        java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
        androidx.fragment.app.Fragment.OnStartEnterTransitionListener mStartEnterTransitionListener;
        java.lang.Object mEnterTransition = null;
        java.lang.Object mReturnTransition = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION;
        java.lang.Object mExitTransition = null;
        java.lang.Object mReenterTransition = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION;
        java.lang.Object mSharedElementEnterTransition = null;
        java.lang.Object mSharedElementReturnTransition = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION;
        androidx.core.app.SharedElementCallback mEnterTransitionCallback = null;
        androidx.core.app.SharedElementCallback mExitTransitionCallback = null;
        float mPostOnViewCreatedAlpha = 1.0f;
        android.view.View mFocusedView = null;

        AnimationInfo() {
        }
    }
}
