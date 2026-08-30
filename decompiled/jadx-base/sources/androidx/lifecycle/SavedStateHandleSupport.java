package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0018H\u0007\u001a\u001f\u0010\u0019\u001a\u00020\u001a\"\f\b\u0000\u0010\u001b*\u00020\u0006*\u00020\t*\u0002H\u001bH\u0007¢\u0006\u0002\u0010\u001c\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"DEFAULT_ARGS_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/os/Bundle;", "SAVED_STATE_KEY", "", "SAVED_STATE_REGISTRY_OWNER_KEY", "Landroidx/savedstate/SavedStateRegistryOwner;", "VIEWMODEL_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "Landroidx/lifecycle/ViewModelStoreOwner;", "savedStateHandlesProvider", "Landroidx/lifecycle/SavedStateHandlesProvider;", "getSavedStateHandlesProvider", "(Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/lifecycle/SavedStateHandlesProvider;", "savedStateHandlesVM", "Landroidx/lifecycle/SavedStateHandlesVM;", "getSavedStateHandlesVM", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/SavedStateHandlesVM;", "createSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateRegistryOwner", "viewModelStoreOwner", com.ironsource.y8.h.W, "defaultArgs", "Landroidx/lifecycle/viewmodel/CreationExtras;", "enableSavedStateHandles", "", "T", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleSupport {
    private static final java.lang.String SAVED_STATE_KEY = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    private static final java.lang.String VIEWMODEL_KEY = "androidx.lifecycle.internal.SavedStateHandlesVM";
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<androidx.savedstate.SavedStateRegistryOwner> SAVED_STATE_REGISTRY_OWNER_KEY = new androidx.lifecycle.viewmodel.CreationExtras.Key<androidx.savedstate.SavedStateRegistryOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1
    };
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<androidx.lifecycle.ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY = new androidx.lifecycle.viewmodel.CreationExtras.Key<androidx.lifecycle.ViewModelStoreOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1
    };
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<android.os.Bundle> DEFAULT_ARGS_KEY = new androidx.lifecycle.viewmodel.CreationExtras.Key<android.os.Bundle>() { // from class: androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends androidx.savedstate.SavedStateRegistryOwner & androidx.lifecycle.ViewModelStoreOwner> void enableSavedStateHandles(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "<this>");
        androidx.lifecycle.Lifecycle.State state = t.getLifecycle().getState();
        if (!(state == androidx.lifecycle.Lifecycle.State.INITIALIZED || state == androidx.lifecycle.Lifecycle.State.CREATED)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (t.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY) == null) {
            androidx.lifecycle.SavedStateHandlesProvider savedStateHandlesProvider = new androidx.lifecycle.SavedStateHandlesProvider(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().registerSavedStateProvider(SAVED_STATE_KEY, savedStateHandlesProvider);
            t.getLifecycle().addObserver(new androidx.lifecycle.SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    private static final androidx.lifecycle.SavedStateHandle createSavedStateHandle(androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner, androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, android.os.Bundle bundle) {
        androidx.lifecycle.SavedStateHandlesProvider savedStateHandlesProvider = getSavedStateHandlesProvider(savedStateRegistryOwner);
        androidx.lifecycle.SavedStateHandlesVM savedStateHandlesVM = getSavedStateHandlesVM(viewModelStoreOwner);
        androidx.lifecycle.SavedStateHandle savedStateHandle = savedStateHandlesVM.getHandles().get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        androidx.lifecycle.SavedStateHandle savedStateHandleCreateHandle = androidx.lifecycle.SavedStateHandle.INSTANCE.createHandle(savedStateHandlesProvider.consumeRestoredStateForKey(str), bundle);
        savedStateHandlesVM.getHandles().put(str, savedStateHandleCreateHandle);
        return savedStateHandleCreateHandle;
    }

    public static final androidx.lifecycle.SavedStateHandle createSavedStateHandle(androidx.lifecycle.viewmodel.CreationExtras creationExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "<this>");
        androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner = (androidx.savedstate.SavedStateRegistryOwner) creationExtras.get(SAVED_STATE_REGISTRY_OWNER_KEY);
        if (savedStateRegistryOwner == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner = (androidx.lifecycle.ViewModelStoreOwner) creationExtras.get(VIEW_MODEL_STORE_OWNER_KEY);
        if (viewModelStoreOwner == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        android.os.Bundle bundle = (android.os.Bundle) creationExtras.get(DEFAULT_ARGS_KEY);
        java.lang.String str = (java.lang.String) creationExtras.get(androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        return createSavedStateHandle(savedStateRegistryOwner, viewModelStoreOwner, str, bundle);
    }

    public static final androidx.lifecycle.SavedStateHandlesVM getSavedStateHandlesVM(androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStoreOwner, "<this>");
        return (androidx.lifecycle.SavedStateHandlesVM) new androidx.lifecycle.ViewModelProvider(viewModelStoreOwner, new androidx.lifecycle.ViewModelProvider.Factory() { // from class: androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass, androidx.lifecycle.viewmodel.CreationExtras extras) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
                return new androidx.lifecycle.SavedStateHandlesVM();
            }
        }).get(VIEWMODEL_KEY, androidx.lifecycle.SavedStateHandlesVM.class);
    }

    public static final androidx.lifecycle.SavedStateHandlesProvider getSavedStateHandlesProvider(androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider = savedStateRegistryOwner.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY);
        androidx.lifecycle.SavedStateHandlesProvider savedStateHandlesProvider = savedStateProvider instanceof androidx.lifecycle.SavedStateHandlesProvider ? (androidx.lifecycle.SavedStateHandlesProvider) savedStateProvider : null;
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new java.lang.IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }
}
