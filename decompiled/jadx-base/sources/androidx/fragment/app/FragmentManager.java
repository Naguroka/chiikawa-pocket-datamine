package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager implements androidx.fragment.app.FragmentResultOwner {
    private static boolean DEBUG = false;
    private static final java.lang.String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    static final java.lang.String TAG = "FragmentManager";
    static boolean USE_STATE_MANAGER = true;
    java.util.ArrayList<androidx.fragment.app.BackStackRecord> mBackStack;
    private java.util.ArrayList<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> mBackStackChangeListeners;
    private androidx.fragment.app.FragmentContainer mContainer;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mCreatedMenus;
    private boolean mDestroyed;
    private boolean mExecutingActions;
    private boolean mHavePendingDeferredStart;
    private androidx.fragment.app.FragmentHostCallback<?> mHost;
    private boolean mNeedMenuInvalidate;
    private androidx.fragment.app.FragmentManagerViewModel mNonConfig;
    private androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    private androidx.fragment.app.Fragment mParent;
    private java.util.ArrayList<androidx.fragment.app.FragmentManager.StartEnterTransitionListener> mPostponedTransactions;
    androidx.fragment.app.Fragment mPrimaryNav;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String[]> mRequestPermissions;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> mStartActivityForResult;
    private androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mTmpAddedFragments;
    private java.util.ArrayList<java.lang.Boolean> mTmpIsPop;
    private java.util.ArrayList<androidx.fragment.app.BackStackRecord> mTmpRecords;
    private final java.util.ArrayList<androidx.fragment.app.FragmentManager.OpGenerator> mPendingActions = new java.util.ArrayList<>();
    private final androidx.fragment.app.FragmentStore mFragmentStore = new androidx.fragment.app.FragmentStore();
    private final androidx.fragment.app.FragmentLayoutInflaterFactory mLayoutInflaterFactory = new androidx.fragment.app.FragmentLayoutInflaterFactory(this);
    private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback = new androidx.activity.OnBackPressedCallback(false) { // from class: androidx.fragment.app.FragmentManager.1
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            androidx.fragment.app.FragmentManager.this.handleOnBackPressed();
        }
    };
    private final java.util.concurrent.atomic.AtomicInteger mBackStackIndex = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.Map<java.lang.String, android.os.Bundle> mResults = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager.LifecycleAwareResultListener> mResultListeners = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> mExitAnimationCancellationSignals = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final androidx.fragment.app.FragmentTransition.Callback mFragmentTransitionCallback = new androidx.fragment.app.FragmentTransition.Callback() { // from class: androidx.fragment.app.FragmentManager.2
        @Override // androidx.fragment.app.FragmentTransition.Callback
        public void onStart(androidx.fragment.app.Fragment fragment, androidx.core.os.CancellationSignal cancellationSignal) {
            androidx.fragment.app.FragmentManager.this.addCancellationSignal(fragment, cancellationSignal);
        }

        @Override // androidx.fragment.app.FragmentTransition.Callback
        public void onComplete(androidx.fragment.app.Fragment fragment, androidx.core.os.CancellationSignal cancellationSignal) {
            if (cancellationSignal.isCanceled()) {
                return;
            }
            androidx.fragment.app.FragmentManager.this.removeCancellationSignal(fragment, cancellationSignal);
        }
    };
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mLifecycleCallbacksDispatcher = new androidx.fragment.app.FragmentLifecycleCallbacksDispatcher(this);
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> mOnAttachListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
    int mCurState = -1;
    private androidx.fragment.app.FragmentFactory mFragmentFactory = null;
    private androidx.fragment.app.FragmentFactory mHostFragmentFactory = new androidx.fragment.app.FragmentFactory() { // from class: androidx.fragment.app.FragmentManager.3
        @Override // androidx.fragment.app.FragmentFactory
        public androidx.fragment.app.Fragment instantiate(java.lang.ClassLoader classLoader, java.lang.String str) {
            return androidx.fragment.app.FragmentManager.this.getHost().instantiate(androidx.fragment.app.FragmentManager.this.getHost().getContext(), str, null);
        }
    };
    private androidx.fragment.app.SpecialEffectsControllerFactory mSpecialEffectsControllerFactory = null;
    private androidx.fragment.app.SpecialEffectsControllerFactory mDefaultSpecialEffectsControllerFactory = new androidx.fragment.app.SpecialEffectsControllerFactory() { // from class: androidx.fragment.app.FragmentManager.4
        @Override // androidx.fragment.app.SpecialEffectsControllerFactory
        public androidx.fragment.app.SpecialEffectsController createController(android.view.ViewGroup viewGroup) {
            return new androidx.fragment.app.DefaultSpecialEffectsController(viewGroup);
        }
    };
    java.util.ArrayDeque<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> mLaunchedFragments = new java.util.ArrayDeque<>();
    private java.lang.Runnable mExecCommit = new java.lang.Runnable() { // from class: androidx.fragment.app.FragmentManager.5
        @Override // java.lang.Runnable
        public void run() {
            androidx.fragment.app.FragmentManager.this.execPendingActions(true);
        }
    };

    public interface BackStackEntry {
        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbShortTitle();

        @java.lang.Deprecated
        int getBreadCrumbShortTitleRes();

        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbTitle();

        @java.lang.Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        java.lang.String getName();
    }

    public static abstract class FragmentLifecycleCallbacks {
        @java.lang.Deprecated
        public void onFragmentActivityCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
        }

        public void onFragmentAttached(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.content.Context context) {
        }

        public void onFragmentCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
        }

        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }

        public void onFragmentDetached(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }

        public void onFragmentPaused(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }

        public void onFragmentPreAttached(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.content.Context context) {
        }

        public void onFragmentPreCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
        }

        public void onFragmentResumed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
        }

        public void onFragmentStarted(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }

        public void onFragmentStopped(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }

        public void onFragmentViewCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.view.View view, android.os.Bundle bundle) {
        }

        public void onFragmentViewDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }
    }

    public interface OnBackStackChangedListener {
        void onBackStackChanged();
    }

    interface OpGenerator {
        boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2);
    }

    static int reverseTransit(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i == 4099) {
            return androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE;
        }
        if (i != 8194) {
            return 0;
        }
        return androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
    }

    public static void enableNewStateManager(boolean z) {
        USE_STATE_MANAGER = z;
    }

    @java.lang.Deprecated
    public static void enableDebugLogging(boolean z) {
        DEBUG = z;
    }

    static boolean isLoggingEnabled(int i) {
        return DEBUG || android.util.Log.isLoggable(TAG, i);
    }

    private static class LifecycleAwareResultListener implements androidx.fragment.app.FragmentResultListener {
        private final androidx.lifecycle.Lifecycle mLifecycle;
        private final androidx.fragment.app.FragmentResultListener mListener;
        private final androidx.lifecycle.LifecycleEventObserver mObserver;

        LifecycleAwareResultListener(androidx.lifecycle.Lifecycle lifecycle, androidx.fragment.app.FragmentResultListener fragmentResultListener, androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver) {
            this.mLifecycle = lifecycle;
            this.mListener = fragmentResultListener;
            this.mObserver = lifecycleEventObserver;
        }

        public boolean isAtLeast(androidx.lifecycle.Lifecycle.State state) {
            return this.mLifecycle.getState().isAtLeast(state);
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
            this.mListener.onFragmentResult(str, bundle);
        }

        public void removeObserver() {
            this.mLifecycle.removeObserver(this.mObserver);
        }
    }

    private void throwException(java.lang.RuntimeException runtimeException) {
        android.util.Log.e(TAG, runtimeException.getMessage());
        android.util.Log.e(TAG, "Activity state:");
        java.io.PrintWriter printWriter = new java.io.PrintWriter(new androidx.fragment.app.LogWriter(TAG));
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.onDump("  ", null, printWriter, new java.lang.String[0]);
                throw runtimeException;
            } catch (java.lang.Exception e) {
                android.util.Log.e(TAG, "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            dump("  ", null, printWriter, new java.lang.String[0]);
            throw runtimeException;
        } catch (java.lang.Exception e2) {
            android.util.Log.e(TAG, "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction openTransaction() {
        return beginTransaction();
    }

    public androidx.fragment.app.FragmentTransaction beginTransaction() {
        return new androidx.fragment.app.BackStackRecord(this);
    }

    public boolean executePendingTransactions() {
        boolean zExecPendingActions = execPendingActions(true);
        forcePostponedTransactions();
        return zExecPendingActions;
    }

    private void updateOnBackPressedCallbackEnabled() {
        synchronized (this.mPendingActions) {
            if (!this.mPendingActions.isEmpty()) {
                this.mOnBackPressedCallback.setEnabled(true);
            } else {
                this.mOnBackPressedCallback.setEnabled(getBackStackEntryCount() > 0 && isPrimaryNavigation(this.mParent));
            }
        }
    }

    boolean isPrimaryNavigation(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        androidx.fragment.app.FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.getPrimaryNavigationFragment()) && isPrimaryNavigation(fragmentManager.mParent);
    }

    boolean isParentMenuVisible(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    void handleOnBackPressed() {
        execPendingActions(true);
        if (this.mOnBackPressedCallback.getIsEnabled()) {
            popBackStackImmediate();
        } else {
            this.mOnBackPressedDispatcher.onBackPressed();
        }
    }

    public void popBackStack() {
        enqueueAction(new androidx.fragment.app.FragmentManager.PopBackStackState(null, -1, 0), false);
    }

    public boolean popBackStackImmediate() {
        return popBackStackImmediate(null, -1, 0);
    }

    public void popBackStack(java.lang.String str, int i) {
        enqueueAction(new androidx.fragment.app.FragmentManager.PopBackStackState(str, -1, i), false);
    }

    public boolean popBackStackImmediate(java.lang.String str, int i) {
        return popBackStackImmediate(str, -1, i);
    }

    public void popBackStack(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Bad id: " + i);
        }
        enqueueAction(new androidx.fragment.app.FragmentManager.PopBackStackState(null, i, i2), false);
    }

    public boolean popBackStackImmediate(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Bad id: " + i);
        }
        return popBackStackImmediate(null, i, i2);
    }

    private boolean popBackStackImmediate(java.lang.String str, int i, int i2) {
        execPendingActions(false);
        ensureExecReady(true);
        androidx.fragment.app.Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean zPopBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, str, i, i2);
        if (zPopBackStackState) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                cleanupExec();
            } catch (java.lang.Throwable th) {
                cleanupExec();
                throw th;
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.burpActive();
        return zPopBackStackState;
    }

    public int getBackStackEntryCount() {
        java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList = this.mBackStack;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public androidx.fragment.app.FragmentManager.BackStackEntry getBackStackEntryAt(int i) {
        return this.mBackStack.get(i);
    }

    public void addOnBackStackChangedListener(androidx.fragment.app.FragmentManager.OnBackStackChangedListener onBackStackChangedListener) {
        if (this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new java.util.ArrayList<>();
        }
        this.mBackStackChangeListeners.add(onBackStackChangedListener);
    }

    public void removeOnBackStackChangedListener(androidx.fragment.app.FragmentManager.OnBackStackChangedListener onBackStackChangedListener) {
        java.util.ArrayList<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> arrayList = this.mBackStackChangeListeners;
        if (arrayList != null) {
            arrayList.remove(onBackStackChangedListener);
        }
    }

    void addCancellationSignal(androidx.fragment.app.Fragment fragment, androidx.core.os.CancellationSignal cancellationSignal) {
        if (this.mExitAnimationCancellationSignals.get(fragment) == null) {
            this.mExitAnimationCancellationSignals.put(fragment, new java.util.HashSet<>());
        }
        this.mExitAnimationCancellationSignals.get(fragment).add(cancellationSignal);
    }

    void removeCancellationSignal(androidx.fragment.app.Fragment fragment, androidx.core.os.CancellationSignal cancellationSignal) {
        java.util.HashSet<androidx.core.os.CancellationSignal> hashSet = this.mExitAnimationCancellationSignals.get(fragment);
        if (hashSet != null && hashSet.remove(cancellationSignal) && hashSet.isEmpty()) {
            this.mExitAnimationCancellationSignals.remove(fragment);
            if (fragment.mState < 5) {
                destroyFragmentView(fragment);
                moveToState(fragment);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(java.lang.String str, android.os.Bundle bundle) {
        androidx.fragment.app.FragmentManager.LifecycleAwareResultListener lifecycleAwareResultListener = this.mResultListeners.get(str);
        if (lifecycleAwareResultListener != null && lifecycleAwareResultListener.isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
            lifecycleAwareResultListener.onFragmentResult(str, bundle);
        } else {
            this.mResults.put(str, bundle);
        }
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(java.lang.String str) {
        this.mResults.remove(str);
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResultListener(final java.lang.String str, androidx.lifecycle.LifecycleOwner lifecycleOwner, final androidx.fragment.app.FragmentResultListener fragmentResultListener) {
        final androidx.lifecycle.Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            return;
        }
        androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver = new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                android.os.Bundle bundle;
                if (event == androidx.lifecycle.Lifecycle.Event.ON_START && (bundle = (android.os.Bundle) androidx.fragment.app.FragmentManager.this.mResults.get(str)) != null) {
                    fragmentResultListener.onFragmentResult(str, bundle);
                    androidx.fragment.app.FragmentManager.this.clearFragmentResult(str);
                }
                if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                    lifecycle.removeObserver(this);
                    androidx.fragment.app.FragmentManager.this.mResultListeners.remove(str);
                }
            }
        };
        lifecycle.addObserver(lifecycleEventObserver);
        androidx.fragment.app.FragmentManager.LifecycleAwareResultListener lifecycleAwareResultListenerPut = this.mResultListeners.put(str, new androidx.fragment.app.FragmentManager.LifecycleAwareResultListener(lifecycle, fragmentResultListener, lifecycleEventObserver));
        if (lifecycleAwareResultListenerPut != null) {
            lifecycleAwareResultListenerPut.removeObserver();
        }
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(java.lang.String str) {
        androidx.fragment.app.FragmentManager.LifecycleAwareResultListener lifecycleAwareResultListenerRemove = this.mResultListeners.remove(str);
        if (lifecycleAwareResultListenerRemove != null) {
            lifecycleAwareResultListenerRemove.removeObserver();
        }
    }

    public void putFragment(android.os.Bundle bundle, java.lang.String str, androidx.fragment.app.Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            throwException(new java.lang.IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public androidx.fragment.app.Fragment getFragment(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        androidx.fragment.app.Fragment fragmentFindActiveFragment = findActiveFragment(string);
        if (fragmentFindActiveFragment == null) {
            throwException(new java.lang.IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentFindActiveFragment;
    }

    public static <F extends androidx.fragment.app.Fragment> F findFragment(android.view.View view) {
        F f = (F) findViewFragment(view);
        if (f != null) {
            return f;
        }
        throw new java.lang.IllegalStateException("View " + view + " does not have a Fragment set");
    }

    private static androidx.fragment.app.Fragment findViewFragment(android.view.View view) {
        while (view != null) {
            androidx.fragment.app.Fragment viewFragment = getViewFragment(view);
            if (viewFragment != null) {
                return viewFragment;
            }
            java.lang.Object parent = view.getParent();
            view = parent instanceof android.view.View ? (android.view.View) parent : null;
        }
        return null;
    }

    static androidx.fragment.app.Fragment getViewFragment(android.view.View view) {
        java.lang.Object tag = view.getTag(androidx.fragment.R.id.fragment_container_view_tag);
        if (tag instanceof androidx.fragment.app.Fragment) {
            return (androidx.fragment.app.Fragment) tag;
        }
        return null;
    }

    void onContainerAvailable(androidx.fragment.app.FragmentContainerView fragmentContainerView) {
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.mFragmentStore.getActiveFragmentStateManagers()) {
            androidx.fragment.app.Fragment fragment = fragmentStateManager.getFragment();
            if (fragment.mContainerId == fragmentContainerView.getId() && fragment.mView != null && fragment.mView.getParent() == null) {
                fragment.mContainer = fragmentContainerView;
                fragmentStateManager.addViewToContainer();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    static androidx.fragment.app.FragmentManager findFragmentManager(android.view.View view) {
        androidx.fragment.app.FragmentActivity fragmentActivity;
        androidx.fragment.app.Fragment fragmentFindViewFragment = findViewFragment(view);
        if (fragmentFindViewFragment != null) {
            if (!fragmentFindViewFragment.isAdded()) {
                throw new java.lang.IllegalStateException("The Fragment " + fragmentFindViewFragment + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            return fragmentFindViewFragment.getChildFragmentManager();
        }
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.fragment.app.FragmentActivity) {
                fragmentActivity = (androidx.fragment.app.FragmentActivity) context;
                if (fragmentActivity != null) {
                    return fragmentActivity.getSupportFragmentManager();
                }
                throw new java.lang.IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
            }
        }
        fragmentActivity = null;
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new java.lang.IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public java.util.List<androidx.fragment.app.Fragment> getFragments() {
        return this.mFragmentStore.getFragments();
    }

    androidx.lifecycle.ViewModelStore getViewModelStore(androidx.fragment.app.Fragment fragment) {
        return this.mNonConfig.getViewModelStore(fragment);
    }

    private androidx.fragment.app.FragmentManagerViewModel getChildNonConfig(androidx.fragment.app.Fragment fragment) {
        return this.mNonConfig.getChildNonConfig(fragment);
    }

    void addRetainedFragment(androidx.fragment.app.Fragment fragment) {
        this.mNonConfig.addRetainedFragment(fragment);
    }

    void removeRetainedFragment(androidx.fragment.app.Fragment fragment) {
        this.mNonConfig.removeRetainedFragment(fragment);
    }

    java.util.List<androidx.fragment.app.Fragment> getActiveFragments() {
        return this.mFragmentStore.getActiveFragments();
    }

    int getActiveFragmentCount() {
        return this.mFragmentStore.getActiveFragmentCount();
    }

    public androidx.fragment.app.Fragment.SavedState saveFragmentInstanceState(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentStateManager fragmentStateManager = this.mFragmentStore.getFragmentStateManager(fragment.mWho);
        if (fragmentStateManager == null || !fragmentStateManager.getFragment().equals(fragment)) {
            throwException(new java.lang.IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return fragmentStateManager.saveInstanceState();
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        androidx.fragment.app.Fragment fragment = this.mParent;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.mParent)));
            sb.append("}");
        } else {
            androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.mHost;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.mHost)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int size;
        int size2;
        java.lang.String str2 = str + "    ";
        this.mFragmentStore.dump(str, fileDescriptor, printWriter, strArr);
        java.util.ArrayList<androidx.fragment.app.Fragment> arrayList = this.mCreatedMenus;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                androidx.fragment.app.Fragment fragment = this.mCreatedMenus.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList2 = this.mBackStack;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                androidx.fragment.app.BackStackRecord backStackRecord = this.mBackStack.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.dump(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.mBackStackIndex.get());
        synchronized (this.mPendingActions) {
            int size3 = this.mPendingActions.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    androidx.fragment.app.FragmentManager.OpGenerator opGenerator = this.mPendingActions.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(opGenerator);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
    }

    void performPendingDeferredStart(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        androidx.fragment.app.Fragment fragment = fragmentStateManager.getFragment();
        if (fragment.mDeferStart) {
            if (this.mExecutingActions) {
                this.mHavePendingDeferredStart = true;
                return;
            }
            fragment.mDeferStart = false;
            if (USE_STATE_MANAGER) {
                fragmentStateManager.moveToExpectedState();
            } else {
                moveToState(fragment);
            }
        }
    }

    boolean isStateAtLeast(int i) {
        return this.mCurState >= i;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0168  */
    /* JADX WARN: Code duplicated, block: B:103:0x016b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    void moveToState(androidx.fragment.app.Fragment fragment, int i) {
        androidx.fragment.app.FragmentStateManager fragmentStateManager = this.mFragmentStore.getFragmentStateManager(fragment.mWho);
        int i2 = 1;
        if (fragmentStateManager == null) {
            fragmentStateManager = new androidx.fragment.app.FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment);
            fragmentStateManager.setFragmentManagerState(1);
        }
        if (fragment.mFromLayout && fragment.mInLayout && fragment.mState == 2) {
            i = java.lang.Math.max(i, 2);
        }
        int iMin = java.lang.Math.min(i, fragmentStateManager.computeExpectedState());
        if (fragment.mState <= iMin) {
            if (fragment.mState < iMin && !this.mExitAnimationCancellationSignals.isEmpty()) {
                cancelExitAnimation(fragment);
            }
            int i3 = fragment.mState;
            if (i3 != -1) {
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 4) {
                                if (i3 == 5) {
                                }
                            }
                            if (iMin > 5) {
                                fragmentStateManager.resume();
                            }
                        }
                        if (iMin > 4) {
                            fragmentStateManager.start();
                        }
                        if (iMin > 5) {
                            fragmentStateManager.resume();
                        }
                    }
                    if (iMin > 2) {
                        fragmentStateManager.activityCreated();
                    }
                    if (iMin > 4) {
                        fragmentStateManager.start();
                    }
                    if (iMin > 5) {
                        fragmentStateManager.resume();
                    }
                }
                if (iMin > -1) {
                    fragmentStateManager.ensureInflatedView();
                }
                if (iMin > 1) {
                    fragmentStateManager.createView();
                }
                if (iMin > 2) {
                    fragmentStateManager.activityCreated();
                }
                if (iMin > 4) {
                    fragmentStateManager.start();
                }
                if (iMin > 5) {
                    fragmentStateManager.resume();
                }
            } else if (iMin > -1) {
                fragmentStateManager.attach();
            }
            if (iMin > 0) {
                fragmentStateManager.create();
            }
            if (iMin > -1) {
                fragmentStateManager.ensureInflatedView();
            }
            if (iMin > 1) {
                fragmentStateManager.createView();
            }
            if (iMin > 2) {
                fragmentStateManager.activityCreated();
            }
            if (iMin > 4) {
                fragmentStateManager.start();
            }
            if (iMin > 5) {
                fragmentStateManager.resume();
            }
        } else if (fragment.mState > iMin) {
            int i4 = fragment.mState;
            if (i4 == 0) {
                i2 = iMin;
                if (i2 < 0) {
                    fragmentStateManager.detach();
                }
                iMin = i2;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                if (i4 == 7) {
                                    if (iMin < 7) {
                                        fragmentStateManager.pause();
                                    }
                                }
                            }
                            if (iMin < 5) {
                                fragmentStateManager.stop();
                            }
                        }
                        if (iMin < 4) {
                            if (isLoggingEnabled(3)) {
                                android.util.Log.d(TAG, "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mView != null && this.mHost.onShouldSaveFragmentState(fragment) && fragment.mSavedViewState == null) {
                                fragmentStateManager.saveViewState();
                            }
                        }
                    }
                    if (iMin < 2) {
                        if (fragment.mView != null && fragment.mContainer != null) {
                            fragment.mContainer.endViewTransition(fragment.mView);
                            fragment.mView.clearAnimation();
                            if (!fragment.isRemovingParent()) {
                                androidx.fragment.app.FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = (this.mCurState <= -1 || this.mDestroyed || fragment.mView.getVisibility() != 0 || fragment.mPostponedAlpha < 0.0f) ? null : androidx.fragment.app.FragmentAnim.loadAnimation(this.mHost.getContext(), fragment, false, fragment.getPopDirection());
                                fragment.mPostponedAlpha = 0.0f;
                                android.view.ViewGroup viewGroup = fragment.mContainer;
                                android.view.View view = fragment.mView;
                                if (animationOrAnimatorLoadAnimation != null) {
                                    androidx.fragment.app.FragmentAnim.animateRemoveFragment(fragment, animationOrAnimatorLoadAnimation, this.mFragmentTransitionCallback);
                                }
                                viewGroup.removeView(view);
                                if (isLoggingEnabled(2)) {
                                    android.util.Log.v(TAG, "Removing view " + view + " for fragment " + fragment + " from container " + viewGroup);
                                }
                                if (viewGroup != fragment.mContainer) {
                                    return;
                                }
                            }
                        }
                        if (this.mExitAnimationCancellationSignals.get(fragment) == null) {
                            fragmentStateManager.destroyFragmentView();
                        }
                    }
                }
                if (iMin >= 1) {
                    i2 = iMin;
                } else if (this.mExitAnimationCancellationSignals.get(fragment) == null) {
                    fragmentStateManager.destroy();
                    i2 = iMin;
                }
                if (i2 < 0) {
                    fragmentStateManager.detach();
                }
                iMin = i2;
            }
        }
        if (fragment.mState != iMin) {
            if (isLoggingEnabled(3)) {
                android.util.Log.d(TAG, "moveToState: Fragment state for " + fragment + " not updated inline; expected state " + iMin + " found " + fragment.mState);
            }
            fragment.mState = iMin;
        }
    }

    private void cancelExitAnimation(androidx.fragment.app.Fragment fragment) {
        java.util.HashSet<androidx.core.os.CancellationSignal> hashSet = this.mExitAnimationCancellationSignals.get(fragment);
        if (hashSet != null) {
            java.util.Iterator<androidx.core.os.CancellationSignal> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            hashSet.clear();
            destroyFragmentView(fragment);
            this.mExitAnimationCancellationSignals.remove(fragment);
        }
    }

    void setExitAnimationOrder(androidx.fragment.app.Fragment fragment, boolean z) {
        android.view.ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer == null || !(fragmentContainer instanceof androidx.fragment.app.FragmentContainerView)) {
            return;
        }
        ((androidx.fragment.app.FragmentContainerView) fragmentContainer).setDrawDisappearingViewsLast(!z);
    }

    private void destroyFragmentView(androidx.fragment.app.Fragment fragment) {
        fragment.performDestroyView();
        this.mLifecycleCallbacksDispatcher.dispatchOnFragmentViewDestroyed(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    void moveToState(androidx.fragment.app.Fragment fragment) {
        moveToState(fragment, this.mCurState);
    }

    private void completeShowHideFragment(final androidx.fragment.app.Fragment fragment) {
        if (fragment.mView != null) {
            androidx.fragment.app.FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = androidx.fragment.app.FragmentAnim.loadAnimation(this.mHost.getContext(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (animationOrAnimatorLoadAnimation != null && animationOrAnimatorLoadAnimation.animator != null) {
                animationOrAnimatorLoadAnimation.animator.setTarget(fragment.mView);
                if (fragment.mHidden) {
                    if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        final android.view.ViewGroup viewGroup = fragment.mContainer;
                        final android.view.View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        animationOrAnimatorLoadAnimation.animator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.fragment.app.FragmentManager.7
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(android.animation.Animator animator) {
                                viewGroup.endViewTransition(view);
                                animator.removeListener(this);
                                if (fragment.mView == null || !fragment.mHidden) {
                                    return;
                                }
                                fragment.mView.setVisibility(8);
                            }
                        });
                    }
                } else {
                    fragment.mView.setVisibility(0);
                }
                animationOrAnimatorLoadAnimation.animator.start();
            } else {
                if (animationOrAnimatorLoadAnimation != null) {
                    fragment.mView.startAnimation(animationOrAnimatorLoadAnimation.animation);
                    animationOrAnimatorLoadAnimation.animation.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            }
        }
        invalidateMenuForFragment(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    void moveFragmentToExpectedState(androidx.fragment.app.Fragment fragment) {
        if (!this.mFragmentStore.containsActiveFragment(fragment.mWho)) {
            if (isLoggingEnabled(3)) {
                android.util.Log.d(TAG, "Ignoring moving " + fragment + " to state " + this.mCurState + "since it is not added to " + this);
                return;
            }
            return;
        }
        moveToState(fragment);
        if (fragment.mView != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            if (fragment.mPostponedAlpha > 0.0f) {
                fragment.mView.setAlpha(fragment.mPostponedAlpha);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            androidx.fragment.app.FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = androidx.fragment.app.FragmentAnim.loadAnimation(this.mHost.getContext(), fragment, true, fragment.getPopDirection());
            if (animationOrAnimatorLoadAnimation != null) {
                if (animationOrAnimatorLoadAnimation.animation != null) {
                    fragment.mView.startAnimation(animationOrAnimatorLoadAnimation.animation);
                } else {
                    animationOrAnimatorLoadAnimation.animator.setTarget(fragment.mView);
                    animationOrAnimatorLoadAnimation.animator.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            completeShowHideFragment(fragment);
        }
    }

    void moveToState(int i, boolean z) {
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback;
        if (this.mHost == null && i != -1) {
            throw new java.lang.IllegalStateException("No activity");
        }
        if (z || i != this.mCurState) {
            this.mCurState = i;
            if (USE_STATE_MANAGER) {
                this.mFragmentStore.moveToExpectedState();
            } else {
                java.util.Iterator<androidx.fragment.app.Fragment> it = this.mFragmentStore.getFragments().iterator();
                while (it.hasNext()) {
                    moveFragmentToExpectedState(it.next());
                }
                for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.mFragmentStore.getActiveFragmentStateManagers()) {
                    androidx.fragment.app.Fragment fragment = fragmentStateManager.getFragment();
                    if (!fragment.mIsNewlyAdded) {
                        moveFragmentToExpectedState(fragment);
                    }
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        this.mFragmentStore.makeInactive(fragmentStateManager);
                    }
                }
            }
            startPendingDeferredFragments();
            if (this.mNeedMenuInvalidate && (fragmentHostCallback = this.mHost) != null && this.mCurState == 7) {
                fragmentHostCallback.onSupportInvalidateOptionsMenu();
                this.mNeedMenuInvalidate = false;
            }
        }
    }

    private void startPendingDeferredFragments() {
        java.util.Iterator<androidx.fragment.app.FragmentStateManager> it = this.mFragmentStore.getActiveFragmentStateManagers().iterator();
        while (it.hasNext()) {
            performPendingDeferredStart(it.next());
        }
    }

    androidx.fragment.app.FragmentStateManager createOrGetFragmentStateManager(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentStateManager fragmentStateManager = this.mFragmentStore.getFragmentStateManager(fragment.mWho);
        if (fragmentStateManager != null) {
            return fragmentStateManager;
        }
        androidx.fragment.app.FragmentStateManager fragmentStateManager2 = new androidx.fragment.app.FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment);
        fragmentStateManager2.restoreState(this.mHost.getContext().getClassLoader());
        fragmentStateManager2.setFragmentManagerState(this.mCurState);
        return fragmentStateManager2;
    }

    androidx.fragment.app.FragmentStateManager addFragment(androidx.fragment.app.Fragment fragment) {
        if (isLoggingEnabled(2)) {
            android.util.Log.v(TAG, "add: " + fragment);
        }
        androidx.fragment.app.FragmentStateManager fragmentStateManagerCreateOrGetFragmentStateManager = createOrGetFragmentStateManager(fragment);
        fragment.mFragmentManager = this;
        this.mFragmentStore.makeActive(fragmentStateManagerCreateOrGetFragmentStateManager);
        if (!fragment.mDetached) {
            this.mFragmentStore.addFragment(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
        return fragmentStateManagerCreateOrGetFragmentStateManager;
    }

    void removeFragment(androidx.fragment.app.Fragment fragment) {
        if (isLoggingEnabled(2)) {
            android.util.Log.v(TAG, "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.mFragmentStore.removeFragment(fragment);
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mRemoving = true;
            setVisibleRemovingFragment(fragment);
        }
    }

    void hideFragment(androidx.fragment.app.Fragment fragment) {
        if (isLoggingEnabled(2)) {
            android.util.Log.v(TAG, "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        setVisibleRemovingFragment(fragment);
    }

    void showFragment(androidx.fragment.app.Fragment fragment) {
        if (isLoggingEnabled(2)) {
            android.util.Log.v(TAG, "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    void detachFragment(androidx.fragment.app.Fragment fragment) {
        if (isLoggingEnabled(2)) {
            android.util.Log.v(TAG, "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (isLoggingEnabled(2)) {
                android.util.Log.v(TAG, "remove from detach: " + fragment);
            }
            this.mFragmentStore.removeFragment(fragment);
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            setVisibleRemovingFragment(fragment);
        }
    }

    void attachFragment(androidx.fragment.app.Fragment fragment) {
        if (isLoggingEnabled(2)) {
            android.util.Log.v(TAG, "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.mFragmentStore.addFragment(fragment);
            if (isLoggingEnabled(2)) {
                android.util.Log.v(TAG, "add from attach: " + fragment);
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
    }

    public androidx.fragment.app.Fragment findFragmentById(int i) {
        return this.mFragmentStore.findFragmentById(i);
    }

    public androidx.fragment.app.Fragment findFragmentByTag(java.lang.String str) {
        return this.mFragmentStore.findFragmentByTag(str);
    }

    androidx.fragment.app.Fragment findFragmentByWho(java.lang.String str) {
        return this.mFragmentStore.findFragmentByWho(str);
    }

    androidx.fragment.app.Fragment findActiveFragment(java.lang.String str) {
        return this.mFragmentStore.findActiveFragment(str);
    }

    private void checkStateLoss() {
        if (isStateSaved()) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public boolean isStateSaved() {
        return this.mStateSaved || this.mStopped;
    }

    void enqueueAction(androidx.fragment.app.FragmentManager.OpGenerator opGenerator, boolean z) {
        if (!z) {
            if (this.mHost == null) {
                if (this.mDestroyed) {
                    throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
                }
                throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
            }
            checkStateLoss();
        }
        synchronized (this.mPendingActions) {
            if (this.mHost == null) {
                if (!z) {
                    throw new java.lang.IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.mPendingActions.add(opGenerator);
                scheduleCommit();
            }
        }
    }

    void scheduleCommit() {
        synchronized (this.mPendingActions) {
            java.util.ArrayList<androidx.fragment.app.FragmentManager.StartEnterTransitionListener> arrayList = this.mPostponedTransactions;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.mPendingActions.size() == 1;
            if (z || z2) {
                this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                this.mHost.getHandler().post(this.mExecCommit);
                updateOnBackPressedCallbackEnabled();
            }
        }
    }

    int allocBackStackIndex() {
        return this.mBackStackIndex.getAndIncrement();
    }

    private void ensureExecReady(boolean z) {
        if (this.mExecutingActions) {
            throw new java.lang.IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.mHost == null) {
            if (this.mDestroyed) {
                throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
            }
            throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if (android.os.Looper.myLooper() != this.mHost.getHandler().getLooper()) {
            throw new java.lang.IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            checkStateLoss();
        }
        if (this.mTmpRecords == null) {
            this.mTmpRecords = new java.util.ArrayList<>();
            this.mTmpIsPop = new java.util.ArrayList<>();
        }
        this.mExecutingActions = true;
        try {
            executePostponedTransaction(null, null);
        } finally {
            this.mExecutingActions = false;
        }
    }

    void execSingleAction(androidx.fragment.app.FragmentManager.OpGenerator opGenerator, boolean z) {
        if (z && (this.mHost == null || this.mDestroyed)) {
            return;
        }
        ensureExecReady(z);
        if (opGenerator.generateOps(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                cleanupExec();
            } catch (java.lang.Throwable th) {
                cleanupExec();
                throw th;
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.burpActive();
    }

    private void cleanupExec() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    boolean execPendingActions(boolean z) {
        ensureExecReady(z);
        boolean z2 = false;
        while (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
            z2 = true;
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                cleanupExec();
            } catch (java.lang.Throwable th) {
                cleanupExec();
                throw th;
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.burpActive();
        return z2;
    }

    private void executePostponedTransaction(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        java.util.ArrayList<androidx.fragment.app.FragmentManager.StartEnterTransitionListener> arrayList3 = this.mPostponedTransactions;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            androidx.fragment.app.FragmentManager.StartEnterTransitionListener startEnterTransitionListener = this.mPostponedTransactions.get(i);
            if (arrayList != null && !startEnterTransitionListener.mIsBack && (iIndexOf2 = arrayList.indexOf(startEnterTransitionListener.mRecord)) != -1 && arrayList2 != null && arrayList2.get(iIndexOf2).booleanValue()) {
                this.mPostponedTransactions.remove(i);
                i--;
                size--;
                startEnterTransitionListener.cancelTransaction();
            } else if (startEnterTransitionListener.isReady() || (arrayList != null && startEnterTransitionListener.mRecord.interactsWith(arrayList, 0, arrayList.size()))) {
                this.mPostponedTransactions.remove(i);
                i--;
                size--;
                if (arrayList != null && !startEnterTransitionListener.mIsBack && (iIndexOf = arrayList.indexOf(startEnterTransitionListener.mRecord)) != -1 && arrayList2 != null && arrayList2.get(iIndexOf).booleanValue()) {
                    startEnterTransitionListener.cancelTransaction();
                } else {
                    startEnterTransitionListener.completeTransaction();
                }
            }
            i++;
        }
    }

    private void removeRedundantOperationsAndExecute(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new java.lang.IllegalStateException("Internal error with the back stack records");
        }
        executePostponedTransaction(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).mReorderingAllowed) {
                if (i2 != i) {
                    executeOpsTogether(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).mReorderingAllowed) {
                        i2++;
                    }
                }
                executeOpsTogether(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            executeOpsTogether(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r17v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 'this'  ??, new type: androidx.fragment.app.FragmentManager
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r17v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 'this'  ??, new type: androidx.fragment.app.FragmentManager
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    private void executeOpsTogether(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.executeOpsTogether(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> collectChangedControllers(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, int i, int i2) {
        android.view.ViewGroup viewGroup;
        java.util.HashSet hashSet = new java.util.HashSet();
        while (i < i2) {
            java.util.Iterator<androidx.fragment.app.FragmentTransaction.Op> it = arrayList.get(i).mOps.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.Fragment fragment = it.next().mFragment;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(androidx.fragment.app.SpecialEffectsController.getOrCreateController(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    private void makeRemovedFragmentsInvisible(androidx.collection.ArraySet<androidx.fragment.app.Fragment> arraySet) {
        int size = arraySet.size();
        for (int i = 0; i < size; i++) {
            androidx.fragment.app.Fragment fragmentValueAt = arraySet.valueAt(i);
            if (!fragmentValueAt.mAdded) {
                android.view.View viewRequireView = fragmentValueAt.requireView();
                fragmentValueAt.mPostponedAlpha = viewRequireView.getAlpha();
                viewRequireView.setAlpha(0.0f);
            }
        }
    }

    private int postponePostponableTransactions(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2, int i, int i2, androidx.collection.ArraySet<androidx.fragment.app.Fragment> arraySet) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            androidx.fragment.app.BackStackRecord backStackRecord = arrayList.get(i4);
            boolean zBooleanValue = arrayList2.get(i4).booleanValue();
            if (backStackRecord.isPostponed() && !backStackRecord.interactsWith(arrayList, i4 + 1, i2)) {
                if (this.mPostponedTransactions == null) {
                    this.mPostponedTransactions = new java.util.ArrayList<>();
                }
                androidx.fragment.app.FragmentManager.StartEnterTransitionListener startEnterTransitionListener = new androidx.fragment.app.FragmentManager.StartEnterTransitionListener(backStackRecord, zBooleanValue);
                this.mPostponedTransactions.add(startEnterTransitionListener);
                backStackRecord.setOnStartPostponedListener(startEnterTransitionListener);
                if (zBooleanValue) {
                    backStackRecord.executeOps();
                } else {
                    backStackRecord.executePopOps(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, backStackRecord);
                }
                addAddedFragments(arraySet);
            }
        }
        return i3;
    }

    void completeExecute(androidx.fragment.app.BackStackRecord backStackRecord, boolean z, boolean z2, boolean z3) {
        if (z) {
            backStackRecord.executePopOps(z3);
        } else {
            backStackRecord.executeOps();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
        arrayList.add(backStackRecord);
        arrayList2.add(java.lang.Boolean.valueOf(z));
        if (z2 && this.mCurState >= 1) {
            androidx.fragment.app.FragmentTransition.startTransitions(this.mHost.getContext(), this.mContainer, arrayList, arrayList2, 0, 1, true, this.mFragmentTransitionCallback);
        }
        if (z3) {
            moveToState(this.mCurState, true);
        }
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.getActiveFragments()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && backStackRecord.interactsWith(fragment.mContainerId)) {
                if (fragment.mPostponedAlpha > 0.0f) {
                    fragment.mView.setAlpha(fragment.mPostponedAlpha);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    private static void executeOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            androidx.fragment.app.BackStackRecord backStackRecord = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                backStackRecord.bumpBackStackNesting(-1);
                backStackRecord.executePopOps(i == i2 + (-1));
            } else {
                backStackRecord.bumpBackStackNesting(1);
                backStackRecord.executeOps();
            }
            i++;
        }
    }

    private void setVisibleRemovingFragment(androidx.fragment.app.Fragment fragment) {
        android.view.ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (fragmentContainer.getTag(androidx.fragment.R.id.visible_removing_fragment_view_tag) == null) {
            fragmentContainer.setTag(androidx.fragment.R.id.visible_removing_fragment_view_tag, fragment);
        }
        ((androidx.fragment.app.Fragment) fragmentContainer.getTag(androidx.fragment.R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
    }

    private android.view.ViewGroup getFragmentContainer(androidx.fragment.app.Fragment fragment) {
        if (fragment.mContainer != null) {
            return fragment.mContainer;
        }
        if (fragment.mContainerId > 0 && this.mContainer.onHasView()) {
            android.view.View viewOnFindViewById = this.mContainer.onFindViewById(fragment.mContainerId);
            if (viewOnFindViewById instanceof android.view.ViewGroup) {
                return (android.view.ViewGroup) viewOnFindViewById;
            }
        }
        return null;
    }

    private void addAddedFragments(androidx.collection.ArraySet<androidx.fragment.app.Fragment> arraySet) {
        int i = this.mCurState;
        if (i < 1) {
            return;
        }
        int iMin = java.lang.Math.min(i, 5);
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment.mState < iMin) {
                moveToState(fragment, iMin);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    arraySet.add(fragment);
                }
            }
        }
    }

    private void forcePostponedTransactions() {
        if (USE_STATE_MANAGER) {
            java.util.Iterator<androidx.fragment.app.SpecialEffectsController> it = collectAllSpecialEffectsController().iterator();
            while (it.hasNext()) {
                it.next().forcePostponedExecutePendingOperations();
            }
        } else if (this.mPostponedTransactions != null) {
            while (!this.mPostponedTransactions.isEmpty()) {
                this.mPostponedTransactions.remove(0).completeTransaction();
            }
        }
    }

    private void endAnimatingAwayFragments() {
        if (USE_STATE_MANAGER) {
            java.util.Iterator<androidx.fragment.app.SpecialEffectsController> it = collectAllSpecialEffectsController().iterator();
            while (it.hasNext()) {
                it.next().forceCompleteAllOperations();
            }
        } else {
            if (this.mExitAnimationCancellationSignals.isEmpty()) {
                return;
            }
            for (androidx.fragment.app.Fragment fragment : this.mExitAnimationCancellationSignals.keySet()) {
                cancelExitAnimation(fragment);
                moveToState(fragment);
            }
        }
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> collectAllSpecialEffectsController() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<androidx.fragment.app.FragmentStateManager> it = this.mFragmentStore.getActiveFragmentStateManagers().iterator();
        while (it.hasNext()) {
            android.view.ViewGroup viewGroup = it.next().getFragment().mContainer;
            if (viewGroup != null) {
                hashSet.add(androidx.fragment.app.SpecialEffectsController.getOrCreateController(viewGroup, getSpecialEffectsControllerFactory()));
            }
        }
        return hashSet;
    }

    private boolean generateOpsForPendingActions(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2) {
        synchronized (this.mPendingActions) {
            if (this.mPendingActions.isEmpty()) {
                return false;
            }
            int size = this.mPendingActions.size();
            boolean zGenerateOps = false;
            for (int i = 0; i < size; i++) {
                zGenerateOps |= this.mPendingActions.get(i).generateOps(arrayList, arrayList2);
            }
            this.mPendingActions.clear();
            this.mHost.getHandler().removeCallbacks(this.mExecCommit);
            return zGenerateOps;
        }
    }

    private void doPendingDeferredStart() {
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
    }

    private void reportBackStackChanged() {
        if (this.mBackStackChangeListeners != null) {
            for (int i = 0; i < this.mBackStackChangeListeners.size(); i++) {
                this.mBackStackChangeListeners.get(i).onBackStackChanged();
            }
        }
    }

    void addBackStackState(androidx.fragment.app.BackStackRecord backStackRecord) {
        if (this.mBackStack == null) {
            this.mBackStack = new java.util.ArrayList<>();
        }
        this.mBackStack.add(backStackRecord);
    }

    boolean popBackStackState(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2, java.lang.String str, int i, int i2) {
        int i3;
        java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList3 = this.mBackStack;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.mBackStack.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.BackStackRecord backStackRecord = this.mBackStack.get(size2);
                    if ((str != null && str.equals(backStackRecord.getName())) || (i >= 0 && i == backStackRecord.mIndex)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.BackStackRecord backStackRecord2 = this.mBackStack.get(size2);
                        if (str == null || !str.equals(backStackRecord2.getName())) {
                            if (i < 0 || i != backStackRecord2.mIndex) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.mBackStack.size() - 1) {
                return false;
            }
            for (int size3 = this.mBackStack.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.mBackStack.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    @java.lang.Deprecated
    androidx.fragment.app.FragmentManagerNonConfig retainNonConfig() {
        if (this.mHost instanceof androidx.lifecycle.ViewModelStoreOwner) {
            throwException(new java.lang.IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.mNonConfig.getSnapshot();
    }

    android.os.Parcelable saveAllState() {
        int size;
        forcePostponedTransactions();
        endAnimatingAwayFragments();
        execPendingActions(true);
        this.mStateSaved = true;
        this.mNonConfig.setIsStateSaved(true);
        java.util.ArrayList<androidx.fragment.app.FragmentState> arrayListSaveActiveFragments = this.mFragmentStore.saveActiveFragments();
        androidx.fragment.app.BackStackState[] backStackStateArr = null;
        if (arrayListSaveActiveFragments.isEmpty()) {
            if (isLoggingEnabled(2)) {
                android.util.Log.v(TAG, "saveAllState: no fragments!");
            }
            return null;
        }
        java.util.ArrayList<java.lang.String> arrayListSaveAddedFragments = this.mFragmentStore.saveAddedFragments();
        java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList = this.mBackStack;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new androidx.fragment.app.BackStackState[size];
            for (int i = 0; i < size; i++) {
                backStackStateArr[i] = new androidx.fragment.app.BackStackState(this.mBackStack.get(i));
                if (isLoggingEnabled(2)) {
                    android.util.Log.v(TAG, "saveAllState: adding back stack #" + i + ": " + this.mBackStack.get(i));
                }
            }
        }
        androidx.fragment.app.FragmentManagerState fragmentManagerState = new androidx.fragment.app.FragmentManagerState();
        fragmentManagerState.mActive = arrayListSaveActiveFragments;
        fragmentManagerState.mAdded = arrayListSaveAddedFragments;
        fragmentManagerState.mBackStack = backStackStateArr;
        fragmentManagerState.mBackStackIndex = this.mBackStackIndex.get();
        androidx.fragment.app.Fragment fragment = this.mPrimaryNav;
        if (fragment != null) {
            fragmentManagerState.mPrimaryNavActiveWho = fragment.mWho;
        }
        fragmentManagerState.mResultKeys.addAll(this.mResults.keySet());
        fragmentManagerState.mResults.addAll(this.mResults.values());
        fragmentManagerState.mLaunchedFragments = new java.util.ArrayList<>(this.mLaunchedFragments);
        return fragmentManagerState;
    }

    void restoreAllState(android.os.Parcelable parcelable, androidx.fragment.app.FragmentManagerNonConfig fragmentManagerNonConfig) {
        if (this.mHost instanceof androidx.lifecycle.ViewModelStoreOwner) {
            throwException(new java.lang.IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.mNonConfig.restoreFromSnapshot(fragmentManagerNonConfig);
        restoreSaveState(parcelable);
    }

    void restoreSaveState(android.os.Parcelable parcelable) {
        androidx.fragment.app.FragmentStateManager fragmentStateManager;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.FragmentManagerState fragmentManagerState = (androidx.fragment.app.FragmentManagerState) parcelable;
        if (fragmentManagerState.mActive == null) {
            return;
        }
        this.mFragmentStore.resetActiveFragments();
        for (androidx.fragment.app.FragmentState fragmentState : fragmentManagerState.mActive) {
            if (fragmentState != null) {
                androidx.fragment.app.Fragment fragmentFindRetainedFragmentByWho = this.mNonConfig.findRetainedFragmentByWho(fragmentState.mWho);
                if (fragmentFindRetainedFragmentByWho != null) {
                    if (isLoggingEnabled(2)) {
                        android.util.Log.v(TAG, "restoreSaveState: re-attaching retained " + fragmentFindRetainedFragmentByWho);
                    }
                    fragmentStateManager = new androidx.fragment.app.FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragmentFindRetainedFragmentByWho, fragmentState);
                } else {
                    fragmentStateManager = new androidx.fragment.app.FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, this.mHost.getContext().getClassLoader(), getFragmentFactory(), fragmentState);
                }
                androidx.fragment.app.Fragment fragment = fragmentStateManager.getFragment();
                fragment.mFragmentManager = this;
                if (isLoggingEnabled(2)) {
                    android.util.Log.v(TAG, "restoreSaveState: active (" + fragment.mWho + "): " + fragment);
                }
                fragmentStateManager.restoreState(this.mHost.getContext().getClassLoader());
                this.mFragmentStore.makeActive(fragmentStateManager);
                fragmentStateManager.setFragmentManagerState(this.mCurState);
            }
        }
        for (androidx.fragment.app.Fragment fragment2 : this.mNonConfig.getRetainedFragments()) {
            if (!this.mFragmentStore.containsActiveFragment(fragment2.mWho)) {
                if (isLoggingEnabled(2)) {
                    android.util.Log.v(TAG, "Discarding retained Fragment " + fragment2 + " that was not found in the set of active Fragments " + fragmentManagerState.mActive);
                }
                this.mNonConfig.removeRetainedFragment(fragment2);
                fragment2.mFragmentManager = this;
                androidx.fragment.app.FragmentStateManager fragmentStateManager2 = new androidx.fragment.app.FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment2);
                fragmentStateManager2.setFragmentManagerState(1);
                fragmentStateManager2.moveToExpectedState();
                fragment2.mRemoving = true;
                fragmentStateManager2.moveToExpectedState();
            }
        }
        this.mFragmentStore.restoreAddedFragments(fragmentManagerState.mAdded);
        if (fragmentManagerState.mBackStack != null) {
            this.mBackStack = new java.util.ArrayList<>(fragmentManagerState.mBackStack.length);
            for (int i = 0; i < fragmentManagerState.mBackStack.length; i++) {
                androidx.fragment.app.BackStackRecord backStackRecordInstantiate = fragmentManagerState.mBackStack[i].instantiate(this);
                if (isLoggingEnabled(2)) {
                    android.util.Log.v(TAG, "restoreAllState: back stack #" + i + " (index " + backStackRecordInstantiate.mIndex + "): " + backStackRecordInstantiate);
                    java.io.PrintWriter printWriter = new java.io.PrintWriter(new androidx.fragment.app.LogWriter(TAG));
                    backStackRecordInstantiate.dump("  ", printWriter, false);
                    printWriter.close();
                }
                this.mBackStack.add(backStackRecordInstantiate);
            }
        } else {
            this.mBackStack = null;
        }
        this.mBackStackIndex.set(fragmentManagerState.mBackStackIndex);
        if (fragmentManagerState.mPrimaryNavActiveWho != null) {
            androidx.fragment.app.Fragment fragmentFindActiveFragment = findActiveFragment(fragmentManagerState.mPrimaryNavActiveWho);
            this.mPrimaryNav = fragmentFindActiveFragment;
            dispatchParentPrimaryNavigationFragmentChanged(fragmentFindActiveFragment);
        }
        java.util.ArrayList<java.lang.String> arrayList = fragmentManagerState.mResultKeys;
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                android.os.Bundle bundle = fragmentManagerState.mResults.get(i2);
                bundle.setClassLoader(this.mHost.getContext().getClassLoader());
                this.mResults.put(arrayList.get(i2), bundle);
            }
        }
        this.mLaunchedFragments = new java.util.ArrayDeque<>(fragmentManagerState.mLaunchedFragments);
    }

    androidx.fragment.app.FragmentHostCallback<?> getHost() {
        return this.mHost;
    }

    androidx.fragment.app.Fragment getParent() {
        return this.mParent;
    }

    androidx.fragment.app.FragmentContainer getContainer() {
        return this.mContainer;
    }

    androidx.fragment.app.FragmentStore getFragmentStore() {
        return this.mFragmentStore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void attachController(androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback, androidx.fragment.app.FragmentContainer fragmentContainer, final androidx.fragment.app.Fragment fragment) {
        androidx.lifecycle.LifecycleOwner lifecycleOwner;
        if (this.mHost != null) {
            throw new java.lang.IllegalStateException("Already attached");
        }
        this.mHost = fragmentHostCallback;
        this.mContainer = fragmentContainer;
        this.mParent = fragment;
        if (fragment != null) {
            addFragmentOnAttachListener(new androidx.fragment.app.FragmentOnAttachListener() { // from class: androidx.fragment.app.FragmentManager.8
                @Override // androidx.fragment.app.FragmentOnAttachListener
                public void onAttachFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment2) {
                    fragment.onAttachFragment(fragment2);
                }
            });
        } else if (fragmentHostCallback instanceof androidx.fragment.app.FragmentOnAttachListener) {
            addFragmentOnAttachListener((androidx.fragment.app.FragmentOnAttachListener) fragmentHostCallback);
        }
        if (this.mParent != null) {
            updateOnBackPressedCallbackEnabled();
        }
        if (fragmentHostCallback instanceof androidx.activity.OnBackPressedDispatcherOwner) {
            androidx.activity.OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (androidx.activity.OnBackPressedDispatcherOwner) fragmentHostCallback;
            androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
            this.mOnBackPressedDispatcher = onBackPressedDispatcher;
            if (fragment != null) {
                lifecycleOwner = onBackPressedDispatcherOwner;
                lifecycleOwner = fragment;
            }
            lifecycleOwner = onBackPressedDispatcherOwner;
            onBackPressedDispatcher.addCallback(lifecycleOwner, this.mOnBackPressedCallback);
        }
        if (fragment != null) {
            this.mNonConfig = fragment.mFragmentManager.getChildNonConfig(fragment);
        } else if (fragmentHostCallback instanceof androidx.lifecycle.ViewModelStoreOwner) {
            this.mNonConfig = androidx.fragment.app.FragmentManagerViewModel.getInstance(((androidx.lifecycle.ViewModelStoreOwner) fragmentHostCallback).getViewModelStore());
        } else {
            this.mNonConfig = new androidx.fragment.app.FragmentManagerViewModel(false);
        }
        this.mNonConfig.setIsStateSaved(isStateSaved());
        this.mFragmentStore.setNonConfig(this.mNonConfig);
        java.lang.Object obj = this.mHost;
        if (obj instanceof androidx.activity.result.ActivityResultRegistryOwner) {
            androidx.activity.result.ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.ActivityResultRegistryOwner) obj).getActivityResultRegistry();
            java.lang.String str = "FragmentManager:" + (fragment != null ? fragment.mWho + ":" : "");
            this.mStartActivityForResult = activityResultRegistry.register(str + "StartActivityForResult", new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult(), new androidx.activity.result.ActivityResultCallback<androidx.activity.result.ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.9
                @Override // androidx.activity.result.ActivityResultCallback
                public void onActivityResult(androidx.activity.result.ActivityResult activityResult) {
                    androidx.fragment.app.FragmentManager.LaunchedFragmentInfo launchedFragmentInfoPollFirst = androidx.fragment.app.FragmentManager.this.mLaunchedFragments.pollFirst();
                    if (launchedFragmentInfoPollFirst == null) {
                        android.util.Log.w(androidx.fragment.app.FragmentManager.TAG, "No Activities were started for result for " + this);
                        return;
                    }
                    java.lang.String str2 = launchedFragmentInfoPollFirst.mWho;
                    int i = launchedFragmentInfoPollFirst.mRequestCode;
                    androidx.fragment.app.Fragment fragmentFindFragmentByWho = androidx.fragment.app.FragmentManager.this.mFragmentStore.findFragmentByWho(str2);
                    if (fragmentFindFragmentByWho == null) {
                        android.util.Log.w(androidx.fragment.app.FragmentManager.TAG, "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        fragmentFindFragmentByWho.onActivityResult(i, activityResult.getResultCode(), activityResult.getData());
                    }
                }
            });
            this.mStartIntentSenderForResult = activityResultRegistry.register(str + "StartIntentSenderForResult", new androidx.fragment.app.FragmentManager.FragmentIntentSenderContract(), new androidx.activity.result.ActivityResultCallback<androidx.activity.result.ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.10
                @Override // androidx.activity.result.ActivityResultCallback
                public void onActivityResult(androidx.activity.result.ActivityResult activityResult) {
                    androidx.fragment.app.FragmentManager.LaunchedFragmentInfo launchedFragmentInfoPollFirst = androidx.fragment.app.FragmentManager.this.mLaunchedFragments.pollFirst();
                    if (launchedFragmentInfoPollFirst == null) {
                        android.util.Log.w(androidx.fragment.app.FragmentManager.TAG, "No IntentSenders were started for " + this);
                        return;
                    }
                    java.lang.String str2 = launchedFragmentInfoPollFirst.mWho;
                    int i = launchedFragmentInfoPollFirst.mRequestCode;
                    androidx.fragment.app.Fragment fragmentFindFragmentByWho = androidx.fragment.app.FragmentManager.this.mFragmentStore.findFragmentByWho(str2);
                    if (fragmentFindFragmentByWho == null) {
                        android.util.Log.w(androidx.fragment.app.FragmentManager.TAG, "Intent Sender result delivered for unknown Fragment " + str2);
                    } else {
                        fragmentFindFragmentByWho.onActivityResult(i, activityResult.getResultCode(), activityResult.getData());
                    }
                }
            });
            this.mRequestPermissions = activityResultRegistry.register(str + "RequestPermissions", new androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions(), new androidx.activity.result.ActivityResultCallback<java.util.Map<java.lang.String, java.lang.Boolean>>() { // from class: androidx.fragment.app.FragmentManager.11
                @Override // androidx.activity.result.ActivityResultCallback
                public void onActivityResult(java.util.Map<java.lang.String, java.lang.Boolean> map) {
                    java.lang.String[] strArr = (java.lang.String[]) map.keySet().toArray(new java.lang.String[0]);
                    java.util.ArrayList arrayList = new java.util.ArrayList(map.values());
                    int[] iArr = new int[arrayList.size()];
                    for (int i = 0; i < arrayList.size(); i++) {
                        iArr[i] = ((java.lang.Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                    }
                    androidx.fragment.app.FragmentManager.LaunchedFragmentInfo launchedFragmentInfoPollFirst = androidx.fragment.app.FragmentManager.this.mLaunchedFragments.pollFirst();
                    if (launchedFragmentInfoPollFirst == null) {
                        android.util.Log.w(androidx.fragment.app.FragmentManager.TAG, "No permissions were requested for " + this);
                        return;
                    }
                    java.lang.String str2 = launchedFragmentInfoPollFirst.mWho;
                    int i2 = launchedFragmentInfoPollFirst.mRequestCode;
                    androidx.fragment.app.Fragment fragmentFindFragmentByWho = androidx.fragment.app.FragmentManager.this.mFragmentStore.findFragmentByWho(str2);
                    if (fragmentFindFragmentByWho == null) {
                        android.util.Log.w(androidx.fragment.app.FragmentManager.TAG, "Permission request result delivered for unknown Fragment " + str2);
                    } else {
                        fragmentFindFragmentByWho.onRequestPermissionsResult(i2, strArr, iArr);
                    }
                }
            });
        }
    }

    void noteStateNotSaved() {
        if (this.mHost == null) {
            return;
        }
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    void launchStartActivityForResult(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i, android.os.Bundle bundle) {
        if (this.mStartActivityForResult != null) {
            this.mLaunchedFragments.addLast(new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo(fragment.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
            }
            this.mStartActivityForResult.launch(intent);
            return;
        }
        this.mHost.onStartActivityFromFragment(fragment, intent, i, bundle);
    }

    void launchStartIntentSenderForResult(androidx.fragment.app.Fragment fragment, android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        android.content.Intent intent2;
        if (this.mStartIntentSenderForResult != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new android.content.Intent();
                    intent2.putExtra(EXTRA_CREATED_FILLIN_INTENT, true);
                } else {
                    intent2 = intent;
                }
                if (isLoggingEnabled(2)) {
                    android.util.Log.v(TAG, "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
            } else {
                intent2 = intent;
            }
            androidx.activity.result.IntentSenderRequest intentSenderRequestBuild = new androidx.activity.result.IntentSenderRequest.Builder(intentSender).setFillInIntent(intent2).setFlags(i3, i2).build();
            this.mLaunchedFragments.addLast(new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo(fragment.mWho, i));
            if (isLoggingEnabled(2)) {
                android.util.Log.v(TAG, "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.mStartIntentSenderForResult.launch(intentSenderRequestBuild);
            return;
        }
        this.mHost.onStartIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    void launchRequestPermissions(androidx.fragment.app.Fragment fragment, java.lang.String[] strArr, int i) {
        if (this.mRequestPermissions != null) {
            this.mLaunchedFragments.addLast(new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo(fragment.mWho, i));
            this.mRequestPermissions.launch(strArr);
            return;
        }
        this.mHost.onRequestPermissionsFromFragment(fragment, strArr, i);
    }

    void dispatchAttach() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(0);
    }

    void dispatchCreate() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(1);
    }

    void dispatchViewCreated() {
        dispatchStateChange(2);
    }

    void dispatchActivityCreated() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(4);
    }

    void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(5);
    }

    void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(7);
    }

    void dispatchPause() {
        dispatchStateChange(5);
    }

    void dispatchStop() {
        this.mStopped = true;
        this.mNonConfig.setIsStateSaved(true);
        dispatchStateChange(4);
    }

    void dispatchDestroyView() {
        dispatchStateChange(1);
    }

    void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions(true);
        endAnimatingAwayFragments();
        dispatchStateChange(-1);
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            this.mOnBackPressedCallback.remove();
            this.mOnBackPressedDispatcher = null;
        }
        androidx.activity.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.mStartActivityForResult;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            this.mStartIntentSenderForResult.unregister();
            this.mRequestPermissions.unregister();
        }
    }

    private void dispatchStateChange(int i) {
        try {
            this.mExecutingActions = true;
            this.mFragmentStore.dispatchStateChange(i);
            moveToState(i, false);
            if (USE_STATE_MANAGER) {
                java.util.Iterator<androidx.fragment.app.SpecialEffectsController> it = collectAllSpecialEffectsController().iterator();
                while (it.hasNext()) {
                    it.next().forceCompleteAllOperations();
                }
            }
            this.mExecutingActions = false;
            execPendingActions(true);
        } catch (java.lang.Throwable th) {
            this.mExecutingActions = false;
            throw th;
        }
    }

    void dispatchMultiWindowModeChanged(boolean z) {
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    void dispatchPictureInPictureModeChanged(boolean z) {
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    void dispatchConfigurationChanged(android.content.res.Configuration configuration) {
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    void dispatchLowMemory() {
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    boolean dispatchCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        if (this.mCurState < 1) {
            return false;
        }
        java.util.ArrayList<androidx.fragment.app.Fragment> arrayList = null;
        boolean z = false;
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i = 0; i < this.mCreatedMenus.size(); i++) {
                androidx.fragment.app.Fragment fragment2 = this.mCreatedMenus.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z;
    }

    boolean dispatchPrepareOptionsMenu(android.view.Menu menu) {
        boolean z = false;
        if (this.mCurState < 1) {
            return false;
        }
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    boolean dispatchOptionsItemSelected(android.view.MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean dispatchContextItemSelected(android.view.MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void dispatchOptionsMenuClosed(android.view.Menu menu) {
        if (this.mCurState < 1) {
            return;
        }
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    void setPrimaryNavigationFragment(androidx.fragment.app.Fragment fragment) {
        if (fragment != null && (!fragment.equals(findActiveFragment(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new java.lang.IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        androidx.fragment.app.Fragment fragment2 = this.mPrimaryNav;
        this.mPrimaryNav = fragment;
        dispatchParentPrimaryNavigationFragmentChanged(fragment2);
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(androidx.fragment.app.Fragment fragment) {
        if (fragment == null || !fragment.equals(findActiveFragment(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    void dispatchPrimaryNavigationFragmentChanged() {
        updateOnBackPressedCallbackEnabled();
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    public androidx.fragment.app.Fragment getPrimaryNavigationFragment() {
        return this.mPrimaryNav;
    }

    void setMaxLifecycle(androidx.fragment.app.Fragment fragment, androidx.lifecycle.Lifecycle.State state) {
        if (!fragment.equals(findActiveFragment(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
            throw new java.lang.IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = state;
    }

    public void setFragmentFactory(androidx.fragment.app.FragmentFactory fragmentFactory) {
        this.mFragmentFactory = fragmentFactory;
    }

    public androidx.fragment.app.FragmentFactory getFragmentFactory() {
        androidx.fragment.app.FragmentFactory fragmentFactory = this.mFragmentFactory;
        if (fragmentFactory != null) {
            return fragmentFactory;
        }
        androidx.fragment.app.Fragment fragment = this.mParent;
        if (fragment != null) {
            return fragment.mFragmentManager.getFragmentFactory();
        }
        return this.mHostFragmentFactory;
    }

    void setSpecialEffectsControllerFactory(androidx.fragment.app.SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        this.mSpecialEffectsControllerFactory = specialEffectsControllerFactory;
    }

    androidx.fragment.app.SpecialEffectsControllerFactory getSpecialEffectsControllerFactory() {
        androidx.fragment.app.SpecialEffectsControllerFactory specialEffectsControllerFactory = this.mSpecialEffectsControllerFactory;
        if (specialEffectsControllerFactory != null) {
            return specialEffectsControllerFactory;
        }
        androidx.fragment.app.Fragment fragment = this.mParent;
        if (fragment != null) {
            return fragment.mFragmentManager.getSpecialEffectsControllerFactory();
        }
        return this.mDefaultSpecialEffectsControllerFactory;
    }

    androidx.fragment.app.FragmentLifecycleCallbacksDispatcher getLifecycleCallbacksDispatcher() {
        return this.mLifecycleCallbacksDispatcher;
    }

    public void registerFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
        this.mLifecycleCallbacksDispatcher.registerFragmentLifecycleCallbacks(fragmentLifecycleCallbacks, z);
    }

    public void unregisterFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        this.mLifecycleCallbacksDispatcher.unregisterFragmentLifecycleCallbacks(fragmentLifecycleCallbacks);
    }

    public void addFragmentOnAttachListener(androidx.fragment.app.FragmentOnAttachListener fragmentOnAttachListener) {
        this.mOnAttachListeners.add(fragmentOnAttachListener);
    }

    void dispatchOnAttachFragment(androidx.fragment.app.Fragment fragment) {
        java.util.Iterator<androidx.fragment.app.FragmentOnAttachListener> it = this.mOnAttachListeners.iterator();
        while (it.hasNext()) {
            it.next().onAttachFragment(this, fragment);
        }
    }

    public void removeFragmentOnAttachListener(androidx.fragment.app.FragmentOnAttachListener fragmentOnAttachListener) {
        this.mOnAttachListeners.remove(fragmentOnAttachListener);
    }

    boolean checkForMenus() {
        boolean zIsMenuAvailable = false;
        for (androidx.fragment.app.Fragment fragment : this.mFragmentStore.getActiveFragments()) {
            if (fragment != null) {
                zIsMenuAvailable = isMenuAvailable(fragment);
            }
            if (zIsMenuAvailable) {
                return true;
            }
        }
        return false;
    }

    private boolean isMenuAvailable(androidx.fragment.app.Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.checkForMenus();
    }

    void invalidateMenuForFragment(androidx.fragment.app.Fragment fragment) {
        if (fragment.mAdded && isMenuAvailable(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
    }

    android.view.LayoutInflater.Factory2 getLayoutInflaterFactory() {
        return this.mLayoutInflaterFactory;
    }

    private class PopBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        final int mFlags;
        final int mId;
        final java.lang.String mName;

        PopBackStackState(java.lang.String str, int i, int i2) {
            this.mName = str;
            this.mId = i;
            this.mFlags = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2) {
            if (androidx.fragment.app.FragmentManager.this.mPrimaryNav == null || this.mId >= 0 || this.mName != null || !androidx.fragment.app.FragmentManager.this.mPrimaryNav.getChildFragmentManager().popBackStackImmediate()) {
                return androidx.fragment.app.FragmentManager.this.popBackStackState(arrayList, arrayList2, this.mName, this.mId, this.mFlags);
            }
            return false;
        }
    }

    static class StartEnterTransitionListener implements androidx.fragment.app.Fragment.OnStartEnterTransitionListener {
        final boolean mIsBack;
        private int mNumPostponed;
        final androidx.fragment.app.BackStackRecord mRecord;

        StartEnterTransitionListener(androidx.fragment.app.BackStackRecord backStackRecord, boolean z) {
            this.mIsBack = z;
            this.mRecord = backStackRecord;
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        public void onStartEnterTransition() {
            int i = this.mNumPostponed - 1;
            this.mNumPostponed = i;
            if (i != 0) {
                return;
            }
            this.mRecord.mManager.scheduleCommit();
        }

        @Override // androidx.fragment.app.Fragment.OnStartEnterTransitionListener
        public void startListening() {
            this.mNumPostponed++;
        }

        public boolean isReady() {
            return this.mNumPostponed == 0;
        }

        void completeTransaction() {
            boolean z = this.mNumPostponed > 0;
            for (androidx.fragment.app.Fragment fragment : this.mRecord.mManager.getFragments()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            this.mRecord.mManager.completeExecute(this.mRecord, this.mIsBack, !z, true);
        }

        void cancelTransaction() {
            this.mRecord.mManager.completeExecute(this.mRecord, this.mIsBack, false, false);
        }
    }

    static class LaunchedFragmentInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> CREATOR = new android.os.Parcelable.Creator<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo>() { // from class: androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.fragment.app.FragmentManager.LaunchedFragmentInfo createFromParcel(android.os.Parcel parcel) {
                return new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.fragment.app.FragmentManager.LaunchedFragmentInfo[] newArray(int i) {
                return new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo[i];
            }
        };
        int mRequestCode;
        java.lang.String mWho;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        LaunchedFragmentInfo(java.lang.String str, int i) {
            this.mWho = str;
            this.mRequestCode = i;
        }

        LaunchedFragmentInfo(android.os.Parcel parcel) {
            this.mWho = parcel.readString();
            this.mRequestCode = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.mWho);
            parcel.writeInt(this.mRequestCode);
        }
    }

    static class FragmentIntentSenderContract extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> {
        FragmentIntentSenderContract() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, androidx.activity.result.IntentSenderRequest intentSenderRequest) {
            android.os.Bundle bundleExtra;
            android.content.Intent intent = new android.content.Intent(androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST);
            android.content.Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) != null) {
                intent.putExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundleExtra);
                fillInIntent.removeExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                if (fillInIntent.getBooleanExtra(androidx.fragment.app.FragmentManager.EXTRA_CREATED_FILLIN_INTENT, false)) {
                    intentSenderRequest = new androidx.activity.result.IntentSenderRequest.Builder(intentSenderRequest.getIntentSender()).setFillInIntent(null).setFlags(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).build();
                }
            }
            intent.putExtra(androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST, intentSenderRequest);
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.ActivityResult parseResult(int i, android.content.Intent intent) {
            return new androidx.activity.result.ActivityResult(i, intent);
        }
    }
}
