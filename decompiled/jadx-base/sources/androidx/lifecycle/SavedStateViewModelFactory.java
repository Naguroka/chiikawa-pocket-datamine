package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0019\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB#\b\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ%\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016¢\u0006\u0002\u0010\u0016J-\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010\u0019J+\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/lifecycle/SavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "application", "Landroid/app/Application;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;)V", "defaultArgs", "Landroid/os/Bundle;", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "factory", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", com.ironsource.y8.h.W, "", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "onRequery", "", "viewModel", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.OnRequeryFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    private android.app.Application application;
    private android.os.Bundle defaultArgs;
    private final androidx.lifecycle.ViewModelProvider.Factory factory;
    private androidx.lifecycle.Lifecycle lifecycle;
    private androidx.savedstate.SavedStateRegistry savedStateRegistry;

    public SavedStateViewModelFactory() {
        this.factory = new androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SavedStateViewModelFactory(android.app.Application application, androidx.savedstate.SavedStateRegistryOwner owner) {
        this(application, owner, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
    }

    public SavedStateViewModelFactory(android.app.Application application, androidx.savedstate.SavedStateRegistryOwner owner, android.os.Bundle bundle) {
        androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            androidViewModelFactory = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.INSTANCE.getInstance(application);
        } else {
            androidViewModelFactory = new androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory();
        }
        this.factory = androidViewModelFactory;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass, androidx.lifecycle.viewmodel.CreationExtras extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        java.lang.String str = (java.lang.String) extras.get(androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw new java.lang.IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.get(androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) != null && extras.get(androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) != null) {
            android.app.Application application = (android.app.Application) extras.get(androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
            boolean zIsAssignableFrom = androidx.lifecycle.AndroidViewModel.class.isAssignableFrom(modelClass);
            java.lang.reflect.Constructor constructorFindMatchingConstructor = (!zIsAssignableFrom || application == null) ? androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, androidx.lifecycle.SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE) : androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, androidx.lifecycle.SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE);
            if (constructorFindMatchingConstructor == null) {
                return (T) this.factory.create(modelClass, extras);
            }
            return (!zIsAssignableFrom || application == null) ? (T) androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(extras)) : (T) androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, application, androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(extras));
        }
        if (this.lifecycle != null) {
            return (T) create(str, modelClass);
        }
        throw new java.lang.IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
    }

    public final <T extends androidx.lifecycle.ViewModel> T create(java.lang.String key, java.lang.Class<T> modelClass) {
        T t;
        android.app.Application application;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        androidx.lifecycle.Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            throw new java.lang.UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = androidx.lifecycle.AndroidViewModel.class.isAssignableFrom(modelClass);
        java.lang.reflect.Constructor constructorFindMatchingConstructor = (!zIsAssignableFrom || this.application == null) ? androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, androidx.lifecycle.SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE) : androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, androidx.lifecycle.SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE);
        if (constructorFindMatchingConstructor == null) {
            return this.application != null ? (T) this.factory.create(modelClass) : (T) androidx.lifecycle.ViewModelProvider.NewInstanceFactory.INSTANCE.getInstance().create(modelClass);
        }
        androidx.savedstate.SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        kotlin.jvm.internal.Intrinsics.checkNotNull(savedStateRegistry);
        androidx.lifecycle.SavedStateHandleController savedStateHandleControllerCreate = androidx.lifecycle.LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, key, this.defaultArgs);
        if (!zIsAssignableFrom || (application = this.application) == null) {
            t = (T) androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, savedStateHandleControllerCreate.getHandle());
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(application);
            t = (T) androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, application, savedStateHandleControllerCreate.getHandle());
        }
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
        return (T) create(canonicalName, modelClass);
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(androidx.lifecycle.ViewModel viewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.lifecycle != null) {
            androidx.savedstate.SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
            kotlin.jvm.internal.Intrinsics.checkNotNull(savedStateRegistry);
            androidx.lifecycle.Lifecycle lifecycle = this.lifecycle;
            kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycle);
            androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }
}
