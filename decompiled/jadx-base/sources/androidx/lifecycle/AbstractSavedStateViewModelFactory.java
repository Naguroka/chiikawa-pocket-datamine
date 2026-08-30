package androidx.lifecycle;

/* JADX INFO: compiled from: AbstractSavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ%\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0016¢\u0006\u0002\u0010\u0012J-\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015J-\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0002¢\u0006\u0002\u0010\u0018J5\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0019\u001a\u00020\u001aH$¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000fH\u0017R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "defaultArgs", "Landroid/os/Bundle;", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", com.ironsource.y8.h.W, "", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "onRequery", "", "viewModel", "Companion", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractSavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.OnRequeryFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    public static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private android.os.Bundle defaultArgs;
    private androidx.lifecycle.Lifecycle lifecycle;
    private androidx.savedstate.SavedStateRegistry savedStateRegistry;

    protected abstract <T extends androidx.lifecycle.ViewModel> T create(java.lang.String key, java.lang.Class<T> modelClass, androidx.lifecycle.SavedStateHandle handle);

    public AbstractSavedStateViewModelFactory() {
    }

    public AbstractSavedStateViewModelFactory(androidx.savedstate.SavedStateRegistryOwner owner, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass, androidx.lifecycle.viewmodel.CreationExtras extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        java.lang.String str = (java.lang.String) extras.get(androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw new java.lang.IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (this.savedStateRegistry != null) {
            return (T) create(str, modelClass);
        }
        return (T) create(str, modelClass, androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(extras));
    }

    private final <T extends androidx.lifecycle.ViewModel> T create(java.lang.String key, java.lang.Class<T> modelClass) {
        androidx.savedstate.SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        kotlin.jvm.internal.Intrinsics.checkNotNull(savedStateRegistry);
        androidx.lifecycle.Lifecycle lifecycle = this.lifecycle;
        kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycle);
        androidx.lifecycle.SavedStateHandleController savedStateHandleControllerCreate = androidx.lifecycle.LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, key, this.defaultArgs);
        T t = (T) create(key, modelClass, savedStateHandleControllerCreate.getHandle());
        t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerCreate);
        return t;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        java.lang.String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.lifecycle == null) {
            throw new java.lang.UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        return (T) create(canonicalName, modelClass);
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(androidx.lifecycle.ViewModel viewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        androidx.savedstate.SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        if (savedStateRegistry != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(savedStateRegistry);
            androidx.lifecycle.Lifecycle lifecycle = this.lifecycle;
            kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycle);
            androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }
}
