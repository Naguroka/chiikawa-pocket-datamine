package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends androidx.activity.ComponentActivity implements androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator {
    static final java.lang.String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final androidx.lifecycle.LifecycleRegistry mFragmentLifecycleRegistry;
    final androidx.fragment.app.FragmentController mFragments;
    boolean mResumed;
    boolean mStopped;

    @java.lang.Deprecated
    public void onAttachFragment(androidx.fragment.app.Fragment fragment) {
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    @java.lang.Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public FragmentActivity() {
        this.mFragments = androidx.fragment.app.FragmentController.createController(new androidx.fragment.app.FragmentActivity.HostCallbacks());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = androidx.fragment.app.FragmentController.createController(new androidx.fragment.app.FragmentActivity.HostCallbacks());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().registerSavedStateProvider(FRAGMENTS_TAG, new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.fragment.app.FragmentActivity.1
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public android.os.Bundle saveState() {
                android.os.Bundle bundle = new android.os.Bundle();
                androidx.fragment.app.FragmentActivity.this.markFragmentsCreated();
                androidx.fragment.app.FragmentActivity.this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP);
                android.os.Parcelable parcelableSaveAllState = androidx.fragment.app.FragmentActivity.this.mFragments.saveAllState();
                if (parcelableSaveAllState != null) {
                    bundle.putParcelable(androidx.fragment.app.FragmentActivity.FRAGMENTS_TAG, parcelableSaveAllState);
                }
                return bundle;
            }
        });
        addOnContextAvailableListener(new androidx.activity.contextaware.OnContextAvailableListener() { // from class: androidx.fragment.app.FragmentActivity.2
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                androidx.fragment.app.FragmentActivity.this.mFragments.attachHost(null);
                android.os.Bundle bundleConsumeRestoredStateForKey = androidx.fragment.app.FragmentActivity.this.getSavedStateRegistry().consumeRestoredStateForKey(androidx.fragment.app.FragmentActivity.FRAGMENTS_TAG);
                if (bundleConsumeRestoredStateForKey != null) {
                    androidx.fragment.app.FragmentActivity.this.mFragments.restoreSaveState(bundleConsumeRestoredStateForKey.getParcelable(androidx.fragment.app.FragmentActivity.FRAGMENTS_TAG));
                }
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        this.mFragments.noteStateNotSaved();
        super.onActivityResult(i, i2, intent);
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.ActivityCompat.finishAfterTransition(this);
    }

    public void setEnterSharedElementCallback(androidx.core.app.SharedElementCallback sharedElementCallback) {
        androidx.core.app.ActivityCompat.setEnterSharedElementCallback(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(androidx.core.app.SharedElementCallback sharedElementCallback) {
        androidx.core.app.ActivityCompat.setExitSharedElementCallback(this, sharedElementCallback);
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.ActivityCompat.postponeEnterTransition(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.ActivityCompat.startPostponedEnterTransition(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.dispatchMultiWindowModeChanged(z);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.dispatchPictureInPictureModeChanged(z);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.mFragments.noteStateNotSaved();
        super.onConfigurationChanged(configuration);
        this.mFragments.dispatchConfigurationChanged(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
        this.mFragments.dispatchCreate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.dispatchCreateOptionsMenu(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    final android.view.View dispatchFragmentsOnCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return this.mFragments.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.dispatchDestroy();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.dispatchLowMemory();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.dispatchOptionsItemSelected(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.dispatchContextItemSelected(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, android.view.Menu menu) {
        if (i == 0) {
            this.mFragments.dispatchOptionsMenuClosed(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.dispatchPause();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        this.mFragments.noteStateNotSaved();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.noteStateNotSaved();
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.noteStateNotSaved();
        super.onResume();
        this.mResumed = true;
        this.mFragments.execPendingActions();
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
        this.mFragments.dispatchResume();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.dispatchPrepareOptionsMenu(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @java.lang.Deprecated
    protected boolean onPrepareOptionsPanel(android.view.View view, android.view.Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.noteStateNotSaved();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.dispatchActivityCreated();
        }
        this.mFragments.execPendingActions();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START);
        this.mFragments.dispatchStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.dispatchStop();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP);
    }

    @java.lang.Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        printWriter.println(" State:");
        java.lang.String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            androidx.loader.app.LoaderManager.getInstance(this).dump(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.getSupportFragmentManager().dump(str, fileDescriptor, printWriter, strArr);
    }

    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
        return this.mFragments.getSupportFragmentManager();
    }

    @java.lang.Deprecated
    public androidx.loader.app.LoaderManager getSupportLoaderManager() {
        return androidx.loader.app.LoaderManager.getInstance(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        this.mFragments.noteStateNotSaved();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void startActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (android.os.Bundle) null);
    }

    public void startActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i, android.os.Bundle bundle) {
        if (i == -1) {
            androidx.core.app.ActivityCompat.startActivityForResult(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @java.lang.Deprecated
    public void startIntentSenderFromFragment(androidx.fragment.app.Fragment fragment, android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        if (i == -1) {
            androidx.core.app.ActivityCompat.startIntentSenderForResult(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    class HostCallbacks extends androidx.fragment.app.FragmentHostCallback<androidx.fragment.app.FragmentActivity> implements androidx.lifecycle.ViewModelStoreOwner, androidx.activity.OnBackPressedDispatcherOwner, androidx.activity.result.ActivityResultRegistryOwner, androidx.fragment.app.FragmentOnAttachListener {
        public HostCallbacks() {
            super(androidx.fragment.app.FragmentActivity.this);
        }

        @Override // androidx.lifecycle.LifecycleOwner
        public androidx.lifecycle.Lifecycle getLifecycle() {
            return androidx.fragment.app.FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        public androidx.lifecycle.ViewModelStore getViewModelStore() {
            return androidx.fragment.app.FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.activity.OnBackPressedDispatcherOwner
        public androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return androidx.fragment.app.FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onDump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
            androidx.fragment.app.FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldSaveFragmentState(androidx.fragment.app.Fragment fragment) {
            return !androidx.fragment.app.FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public android.view.LayoutInflater onGetLayoutInflater() {
            return androidx.fragment.app.FragmentActivity.this.getLayoutInflater().cloneInContext(androidx.fragment.app.FragmentActivity.this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.fragment.app.FragmentHostCallback
        public androidx.fragment.app.FragmentActivity onGetHost() {
            return androidx.fragment.app.FragmentActivity.this;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onSupportInvalidateOptionsMenu() {
            androidx.fragment.app.FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldShowRequestPermissionRationale(java.lang.String str) {
            return androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(androidx.fragment.app.FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onHasWindowAnimations() {
            return androidx.fragment.app.FragmentActivity.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public int onGetWindowAnimations() {
            android.view.Window window = androidx.fragment.app.FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.FragmentOnAttachListener
        public void onAttachFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            androidx.fragment.app.FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public android.view.View onFindViewById(int i) {
            return androidx.fragment.app.FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public boolean onHasView() {
            android.view.Window window = androidx.fragment.app.FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.ActivityResultRegistryOwner
        public androidx.activity.result.ActivityResultRegistry getActivityResultRegistry() {
            return androidx.fragment.app.FragmentActivity.this.getActivityResultRegistry();
        }
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), androidx.lifecycle.Lifecycle.State.CREATED)) {
        }
    }

    private static boolean markState(androidx.fragment.app.FragmentManager fragmentManager, androidx.lifecycle.Lifecycle.State state) {
        boolean zMarkState = false;
        for (androidx.fragment.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), state);
                }
                if (fragment.mViewLifecycleOwner != null && fragment.mViewLifecycleOwner.getLifecycle().getState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.setCurrentState(state);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.getState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.setCurrentState(state);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }
}
