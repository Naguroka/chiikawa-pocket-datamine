package androidx.lifecycle;

/* JADX INFO: compiled from: LegacySavedStateHandleController.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J,\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "()V", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "", "attachHandleIfNeeded", "", "viewModel", "Landroidx/lifecycle/ViewModel;", "registry", "Landroidx/savedstate/SavedStateRegistry;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "create", "Landroidx/lifecycle/SavedStateHandleController;", com.ironsource.y8.h.W, "defaultArgs", "Landroid/os/Bundle;", "tryToAddRecreator", "OnRecreation", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacySavedStateHandleController {
    public static final androidx.lifecycle.LegacySavedStateHandleController INSTANCE = new androidx.lifecycle.LegacySavedStateHandleController();
    public static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    private LegacySavedStateHandleController() {
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.lifecycle.SavedStateHandleController create(androidx.savedstate.SavedStateRegistry registry, androidx.lifecycle.Lifecycle lifecycle, java.lang.String key, android.os.Bundle defaultArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registry, "registry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        kotlin.jvm.internal.Intrinsics.checkNotNull(key);
        androidx.lifecycle.SavedStateHandleController savedStateHandleController = new androidx.lifecycle.SavedStateHandleController(key, androidx.lifecycle.SavedStateHandle.INSTANCE.createHandle(registry.consumeRestoredStateForKey(key), defaultArgs));
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        INSTANCE.tryToAddRecreator(registry, lifecycle);
        return savedStateHandleController;
    }

    @kotlin.jvm.JvmStatic
    public static final void attachHandleIfNeeded(androidx.lifecycle.ViewModel viewModel, androidx.savedstate.SavedStateRegistry registry, androidx.lifecycle.Lifecycle lifecycle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registry, "registry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        androidx.lifecycle.SavedStateHandleController savedStateHandleController = (androidx.lifecycle.SavedStateHandleController) viewModel.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.getIsAttached()) {
            return;
        }
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        INSTANCE.tryToAddRecreator(registry, lifecycle);
    }

    private final void tryToAddRecreator(final androidx.savedstate.SavedStateRegistry registry, final androidx.lifecycle.Lifecycle lifecycle) {
        androidx.lifecycle.Lifecycle.State state = lifecycle.getState();
        if (state == androidx.lifecycle.Lifecycle.State.INITIALIZED || state.isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
            registry.runOnNextRecreation(androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class);
        } else {
            lifecycle.addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController.tryToAddRecreator.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(androidx.lifecycle.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
                    if (event == androidx.lifecycle.Lifecycle.Event.ON_START) {
                        lifecycle.removeObserver(this);
                        registry.runOnNextRecreation(androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class);
                    }
                }
            });
        }
    }

    /* JADX INFO: compiled from: LegacySavedStateHandleController.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$OnRecreation;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "()V", "onRecreated", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OnRecreation implements androidx.savedstate.SavedStateRegistry.AutoRecreated {
        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public void onRecreated(androidx.savedstate.SavedStateRegistryOwner owner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof androidx.lifecycle.ViewModelStoreOwner)) {
                throw new java.lang.IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            androidx.lifecycle.ViewModelStore viewModelStore = ((androidx.lifecycle.ViewModelStoreOwner) owner).getViewModelStore();
            androidx.savedstate.SavedStateRegistry savedStateRegistry = owner.getSavedStateRegistry();
            java.util.Iterator<java.lang.String> it = viewModelStore.keys().iterator();
            while (it.hasNext()) {
                androidx.lifecycle.ViewModel viewModel = viewModelStore.get(it.next());
                kotlin.jvm.internal.Intrinsics.checkNotNull(viewModel);
                androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, owner.getLifecycle());
            }
            if (!viewModelStore.keys().isEmpty()) {
                savedStateRegistry.runOnNextRecreation(androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class);
            }
        }
    }
}
