package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentViewLifecycleOwner implements androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.lifecycle.ViewModelStoreOwner {
    private androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    private final androidx.fragment.app.Fragment mFragment;
    private androidx.lifecycle.LifecycleRegistry mLifecycleRegistry = null;
    private androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController = null;
    private final androidx.lifecycle.ViewModelStore mViewModelStore;

    FragmentViewLifecycleOwner(androidx.fragment.app.Fragment fragment, androidx.lifecycle.ViewModelStore viewModelStore) {
        this.mFragment = fragment;
        this.mViewModelStore = viewModelStore;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
        initialize();
        return this.mViewModelStore;
    }

    void initialize() {
        if (this.mLifecycleRegistry == null) {
            this.mLifecycleRegistry = new androidx.lifecycle.LifecycleRegistry(this);
            this.mSavedStateRegistryController = androidx.savedstate.SavedStateRegistryController.create(this);
        }
    }

    boolean isInitialized() {
        return this.mLifecycleRegistry != null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
        initialize();
        return this.mLifecycleRegistry;
    }

    void setCurrentState(androidx.lifecycle.Lifecycle.State state) {
        this.mLifecycleRegistry.setCurrentState(state);
    }

    void handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event event) {
        this.mLifecycleRegistry.handleLifecycleEvent(event);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        android.app.Application application;
        androidx.lifecycle.ViewModelProvider.Factory defaultViewModelProviderFactory = this.mFragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.mFragment.mDefaultFactory)) {
            this.mDefaultFactory = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.mDefaultFactory == null) {
            android.content.Context applicationContext = this.mFragment.requireContext().getApplicationContext();
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
            this.mDefaultFactory = new androidx.lifecycle.SavedStateViewModelFactory(application, this, this.mFragment.getArguments());
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
        initialize();
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    void performRestore(android.os.Bundle bundle) {
        this.mSavedStateRegistryController.performRestore(bundle);
    }

    void performSave(android.os.Bundle bundle) {
        this.mSavedStateRegistryController.performSave(bundle);
    }
}
