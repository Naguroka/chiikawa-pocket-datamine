package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements androidx.activity.contextaware.ContextAware, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.activity.OnBackPressedDispatcherOwner, androidx.activity.result.ActivityResultRegistryOwner, androidx.activity.result.ActivityResultCaller, androidx.core.content.OnConfigurationChangedProvider, androidx.core.content.OnTrimMemoryProvider, androidx.core.app.OnNewIntentProvider, androidx.core.app.OnMultiWindowModeChangedProvider, androidx.core.app.OnPictureInPictureModeChangedProvider, androidx.core.view.MenuHost, androidx.activity.FullyDrawnReporterOwner {
    private static final java.lang.String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final androidx.activity.contextaware.ContextAwareHelper mContextAwareHelper;
    private androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final androidx.activity.FullyDrawnReporter mFullyDrawnReporter;
    private final androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    private final androidx.core.view.MenuHostHelper mMenuHostHelper;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private final androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.res.Configuration>> mOnConfigurationChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> mOnMultiWindowModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.Intent>> mOnNewIntentListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> mOnPictureInPictureModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<java.lang.Integer>> mOnTrimMemoryListeners;
    final androidx.activity.ComponentActivity.ReportFullyDrawnExecutor mReportFullyDrawnExecutor;
    final androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;
    private androidx.lifecycle.ViewModelStore mViewModelStore;

    private interface ReportFullyDrawnExecutor extends java.util.concurrent.Executor {
        void activityDestroyed();

        void viewCreated(android.view.View view);
    }

    @java.lang.Deprecated
    public java.lang.Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    static final class NonConfigurationInstances {
        java.lang.Object custom;
        androidx.lifecycle.ViewModelStore viewModelStore;

        NonConfigurationInstances() {
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-activity-ComponentActivity, reason: not valid java name */
    /* synthetic */ kotlin.Unit m0lambda$new$0$androidxactivityComponentActivity() {
        reportFullyDrawn();
        return null;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new androidx.activity.contextaware.ContextAwareHelper();
        this.mMenuHostHelper = new androidx.core.view.MenuHostHelper(new java.lang.Runnable() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new androidx.lifecycle.LifecycleRegistry(this);
        androidx.savedstate.SavedStateRegistryController savedStateRegistryControllerCreate = androidx.savedstate.SavedStateRegistryController.create(this);
        this.mSavedStateRegistryController = savedStateRegistryControllerCreate;
        this.mOnBackPressedDispatcher = new androidx.activity.OnBackPressedDispatcher(new java.lang.Runnable() { // from class: androidx.activity.ComponentActivity.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    androidx.activity.ComponentActivity.super.onBackPressed();
                } catch (java.lang.IllegalStateException e) {
                    if (!android.text.TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                }
            }
        });
        androidx.activity.ComponentActivity.ReportFullyDrawnExecutor reportFullyDrawnExecutorCreateFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = reportFullyDrawnExecutorCreateFullyDrawnExecutor;
        this.mFullyDrawnReporter = new androidx.activity.FullyDrawnReporter(reportFullyDrawnExecutorCreateFullyDrawnExecutor, new kotlin.jvm.functions.Function0() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return this.f$0.m0lambda$new$0$androidxactivityComponentActivity();
            }
        });
        this.mNextLocalRequestCode = new java.util.concurrent.atomic.AtomicInteger();
        this.mActivityResultRegistry = new androidx.activity.result.ActivityResultRegistry() { // from class: androidx.activity.ComponentActivity.2
            @Override // androidx.activity.result.ActivityResultRegistry
            public <I, O> void onLaunch(final int i, androidx.activity.result.contract.ActivityResultContract<I, O> activityResultContract, I i2, androidx.core.app.ActivityOptionsCompat activityOptionsCompat) {
                android.os.Bundle bundle;
                androidx.activity.ComponentActivity componentActivity = androidx.activity.ComponentActivity.this;
                final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<O> synchronousResult = activityResultContract.getSynchronousResult(componentActivity, i2);
                if (synchronousResult != null) {
                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: androidx.activity.ComponentActivity.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            dispatchResult(i, synchronousResult.getValue());
                        }
                    });
                    return;
                }
                android.content.Intent intentCreateIntent = activityResultContract.createIntent(componentActivity, i2);
                if (intentCreateIntent.getExtras() != null && intentCreateIntent.getExtras().getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
                }
                if (intentCreateIntent.hasExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) {
                    android.os.Bundle bundleExtra = intentCreateIntent.getBundleExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                    intentCreateIntent.removeExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                    bundle = bundleExtra;
                } else {
                    bundle = activityOptionsCompat != null ? activityOptionsCompat.toBundle() : null;
                }
                if (androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS.equals(intentCreateIntent.getAction())) {
                    java.lang.String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra(androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS);
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new java.lang.String[0];
                    }
                    androidx.core.app.ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, i);
                    return;
                }
                if (androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST.equals(intentCreateIntent.getAction())) {
                    androidx.activity.result.IntentSenderRequest intentSenderRequest = (androidx.activity.result.IntentSenderRequest) intentCreateIntent.getParcelableExtra(androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST);
                    try {
                        androidx.core.app.ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.getIntentSender(), i, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
                        return;
                    } catch (android.content.IntentSender.SendIntentException e) {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: androidx.activity.ComponentActivity.2.2
                            @Override // java.lang.Runnable
                            public void run() {
                                dispatchResult(i, 0, new android.content.Intent().setAction(androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, e));
                            }
                        });
                        return;
                    }
                }
                androidx.core.app.ActivityCompat.startActivityForResult(componentActivity, intentCreateIntent, i, bundle);
            }
        };
        this.mOnConfigurationChangedListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new java.lang.IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                if (event == androidx.lifecycle.Lifecycle.Event.ON_STOP) {
                    android.view.Window window = androidx.activity.ComponentActivity.this.getWindow();
                    android.view.View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        androidx.activity.ComponentActivity.Api19Impl.cancelPendingInputEvents(viewPeekDecorView);
                    }
                }
            }
        });
        getLifecycle().addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                    androidx.activity.ComponentActivity.this.mContextAwareHelper.clearAvailableContext();
                    if (!androidx.activity.ComponentActivity.this.isChangingConfigurations()) {
                        androidx.activity.ComponentActivity.this.getViewModelStore().clear();
                    }
                    androidx.activity.ComponentActivity.this.mReportFullyDrawnExecutor.activityDestroyed();
                }
            }
        });
        getLifecycle().addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                androidx.activity.ComponentActivity.this.ensureViewModelStore();
                androidx.activity.ComponentActivity.this.getLifecycle().removeObserver(this);
            }
        });
        savedStateRegistryControllerCreate.performAttach();
        androidx.lifecycle.SavedStateHandleSupport.enableSavedStateHandles(this);
        getSavedStateRegistry().registerSavedStateProvider(ACTIVITY_RESULT_TAG, new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda2
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final android.os.Bundle saveState() {
                return this.f$0.m1lambda$new$1$androidxactivityComponentActivity();
            }
        });
        addOnContextAvailableListener(new androidx.activity.contextaware.OnContextAvailableListener() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda3
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void onContextAvailable(android.content.Context context) {
                this.f$0.m2lambda$new$2$androidxactivityComponentActivity(context);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-activity-ComponentActivity, reason: not valid java name */
    /* synthetic */ android.os.Bundle m1lambda$new$1$androidxactivityComponentActivity() {
        android.os.Bundle bundle = new android.os.Bundle();
        this.mActivityResultRegistry.onSaveInstanceState(bundle);
        return bundle;
    }

    /* JADX INFO: renamed from: lambda$new$2$androidx-activity-ComponentActivity, reason: not valid java name */
    /* synthetic */ void m2lambda$new$2$androidxactivityComponentActivity(android.content.Context context) {
        android.os.Bundle bundleConsumeRestoredStateForKey = getSavedStateRegistry().consumeRestoredStateForKey(ACTIVITY_RESULT_TAG);
        if (bundleConsumeRestoredStateForKey != null) {
            this.mActivityResultRegistry.onRestoreInstanceState(bundleConsumeRestoredStateForKey);
        }
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        this.mSavedStateRegistryController.performRestore(bundle);
        this.mContextAwareHelper.dispatchOnContextAvailable(this);
        super.onCreate(bundle);
        androidx.lifecycle.ReportFragment.injectIfNeededIn(this);
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            this.mOnBackPressedDispatcher.setOnBackInvokedDispatcher(androidx.activity.ComponentActivity.Api33Impl.getOnBackInvokedDispatcher(this));
        }
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        androidx.lifecycle.Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.LifecycleRegistry) {
            ((androidx.lifecycle.LifecycleRegistry) lifecycle).setCurrentState(androidx.lifecycle.Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.performSave(bundle);
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
        androidx.activity.ComponentActivity.NonConfigurationInstances nonConfigurationInstances;
        java.lang.Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        androidx.lifecycle.ViewModelStore viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (nonConfigurationInstances = (androidx.activity.ComponentActivity.NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.viewModelStore;
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        androidx.activity.ComponentActivity.NonConfigurationInstances nonConfigurationInstances2 = new androidx.activity.ComponentActivity.NonConfigurationInstances();
        nonConfigurationInstances2.custom = objOnRetainCustomNonConfigurationInstance;
        nonConfigurationInstances2.viewModelStore = viewModelStore;
        return nonConfigurationInstances2;
    }

    @java.lang.Deprecated
    public java.lang.Object getLastCustomNonConfigurationInstance() {
        androidx.activity.ComponentActivity.NonConfigurationInstances nonConfigurationInstances = (androidx.activity.ComponentActivity.NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.custom;
        }
        return null;
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    private void initViewTreeOwners() {
        androidx.lifecycle.ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        androidx.lifecycle.ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
        androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(getWindow().getDecorView(), this);
        androidx.activity.ViewTreeOnBackPressedDispatcherOwner.set(getWindow().getDecorView(), this);
        androidx.activity.ViewTreeFullyDrawnReporterOwner.set(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public android.content.Context peekAvailableContext() {
        return this.mContextAwareHelper.getContext();
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.addOnContextAvailableListener(onContextAvailableListener);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.removeOnContextAvailableListener(onContextAvailableListener);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.mMenuHostHelper.onPrepareMenu(menu);
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.mMenuHostHelper.onCreateMenu(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.onMenuItemSelected(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, android.view.Menu menu) {
        this.mMenuHostHelper.onMenuClosed(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider menuProvider) {
        this.mMenuHostHelper.addMenuProvider(menuProvider);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider menuProvider, androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider menuProvider, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner, state);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(androidx.core.view.MenuProvider menuProvider) {
        this.mMenuHostHelper.removeMenuProvider(menuProvider);
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new java.lang.IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            androidx.activity.ComponentActivity.NonConfigurationInstances nonConfigurationInstances = (androidx.activity.ComponentActivity.NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                this.mViewModelStore = nonConfigurationInstances.viewModelStore;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new androidx.lifecycle.ViewModelStore();
            }
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new androidx.lifecycle.SavedStateViewModelFactory(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
        androidx.lifecycle.viewmodel.MutableCreationExtras mutableCreationExtras = new androidx.lifecycle.viewmodel.MutableCreationExtras();
        if (getApplication() != null) {
            mutableCreationExtras.set(androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, getApplication());
        }
        mutableCreationExtras.set(androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            mutableCreationExtras.set(androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY, getIntent().getExtras());
        }
        return mutableCreationExtras;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.onBackPressed();
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.activity.FullyDrawnReporterOwner
    public androidx.activity.FullyDrawnReporter getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent intent, int i, android.os.Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4) throws android.content.IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (this.mActivityResultRegistry.dispatchResult(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.dispatchResult(i, -1, new android.content.Intent().putExtra(androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS, strArr).putExtra(androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS, iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> activityResultContract, androidx.activity.result.ActivityResultRegistry activityResultRegistry, androidx.activity.result.ActivityResultCallback<O> activityResultCallback) {
        return activityResultRegistry.register("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, activityResultContract, activityResultCallback);
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> activityResultContract, androidx.activity.result.ActivityResultCallback<O> activityResultCallback) {
        return registerForActivityResult(activityResultContract, this.mActivityResultRegistry, activityResultCallback);
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    public final androidx.activity.result.ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        java.util.Iterator<androidx.core.util.Consumer<android.content.res.Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> consumer) {
        this.mOnConfigurationChangedListeners.add(consumer);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> consumer) {
        this.mOnConfigurationChangedListeners.remove(consumer);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        java.util.Iterator<androidx.core.util.Consumer<java.lang.Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(java.lang.Integer.valueOf(i));
        }
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> consumer) {
        this.mOnTrimMemoryListeners.add(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> consumer) {
        this.mOnTrimMemoryListeners.remove(consumer);
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        java.util.Iterator<androidx.core.util.Consumer<android.content.Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(androidx.core.util.Consumer<android.content.Intent> consumer) {
        this.mOnNewIntentListeners.add(consumer);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(androidx.core.util.Consumer<android.content.Intent> consumer) {
        this.mOnNewIntentListeners.remove(consumer);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        java.util.Iterator<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.MultiWindowModeChangedInfo(z));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, android.content.res.Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            java.util.Iterator<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.MultiWindowModeChangedInfo(z, configuration));
            }
        } catch (java.lang.Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> consumer) {
        this.mOnMultiWindowModeChangedListeners.add(consumer);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> consumer) {
        this.mOnMultiWindowModeChangedListeners.remove(consumer);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        java.util.Iterator<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.PictureInPictureModeChangedInfo(z));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, android.content.res.Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            java.util.Iterator<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.PictureInPictureModeChangedInfo(z, configuration));
            }
        } catch (java.lang.Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> consumer) {
        this.mOnPictureInPictureModeChangedListeners.add(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> consumer) {
        this.mOnPictureInPictureModeChangedListeners.remove(consumer);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (androidx.tracing.Trace.isEnabled()) {
                androidx.tracing.Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.fullyDrawnReported();
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    private androidx.activity.ComponentActivity.ReportFullyDrawnExecutor createFullyDrawnExecutor() {
        return new androidx.activity.ComponentActivity.ReportFullyDrawnExecutorApi16Impl();
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void cancelPendingInputEvents(android.view.View view) {
            view.cancelPendingInputEvents();
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher(android.app.Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    static class ReportFullyDrawnExecutorApi1 implements androidx.activity.ComponentActivity.ReportFullyDrawnExecutor {
        final android.os.Handler mHandler = createHandler();

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void activityDestroyed() {
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void viewCreated(android.view.View view) {
        }

        ReportFullyDrawnExecutorApi1() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            this.mHandler.postAtFrontOfQueue(runnable);
        }

        private android.os.Handler createHandler() {
            android.os.Looper looperMyLooper = android.os.Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = android.os.Looper.getMainLooper();
            }
            return new android.os.Handler(looperMyLooper);
        }
    }

    class ReportFullyDrawnExecutorApi16Impl implements androidx.activity.ComponentActivity.ReportFullyDrawnExecutor, android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable {
        final long mEndWatchTimeMillis = android.os.SystemClock.uptimeMillis() + 10000;
        boolean mOnDrawScheduled = false;
        java.lang.Runnable mRunnable;

        ReportFullyDrawnExecutorApi16Impl() {
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void viewCreated(android.view.View view) {
            if (this.mOnDrawScheduled) {
                return;
            }
            this.mOnDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void activityDestroyed() {
            androidx.activity.ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            androidx.activity.ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            this.mRunnable = runnable;
            android.view.View decorView = androidx.activity.ComponentActivity.this.getWindow().getDecorView();
            if (this.mOnDrawScheduled) {
                if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                    decorView.invalidate();
                    return;
                } else {
                    decorView.postInvalidate();
                    return;
                }
            }
            decorView.postOnAnimation(new java.lang.Runnable() { // from class: androidx.activity.ComponentActivity$ReportFullyDrawnExecutorApi16Impl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3x96b76666();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$execute$0$androidx-activity-ComponentActivity$ReportFullyDrawnExecutorApi16Impl, reason: not valid java name */
        /* synthetic */ void m3x96b76666() {
            java.lang.Runnable runnable = this.mRunnable;
            if (runnable != null) {
                runnable.run();
                this.mRunnable = null;
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            java.lang.Runnable runnable = this.mRunnable;
            if (runnable == null) {
                if (android.os.SystemClock.uptimeMillis() > this.mEndWatchTimeMillis) {
                    this.mOnDrawScheduled = false;
                    androidx.activity.ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.mRunnable = null;
            if (androidx.activity.ComponentActivity.this.mFullyDrawnReporter.isFullyDrawnReported()) {
                this.mOnDrawScheduled = false;
                androidx.activity.ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.activity.ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }
}
