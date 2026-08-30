package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/ViewModelStoreOwner;)V", "restored", "", "restoredState", "Landroid/os/Bundle;", "viewModel", "Landroidx/lifecycle/SavedStateHandlesVM;", "getViewModel", "()Landroidx/lifecycle/SavedStateHandlesVM;", "viewModel$delegate", "Lkotlin/Lazy;", "consumeRestoredStateForKey", com.ironsource.y8.h.W, "", "performRestore", "", "saveState", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandlesProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {
    private boolean restored;
    private android.os.Bundle restoredState;
    private final androidx.savedstate.SavedStateRegistry savedStateRegistry;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public SavedStateHandlesProvider(androidx.savedstate.SavedStateRegistry savedStateRegistry, final androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.lifecycle.SavedStateHandlesVM>() { // from class: androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.lifecycle.SavedStateHandlesVM invoke() {
                return androidx.lifecycle.SavedStateHandleSupport.getSavedStateHandlesVM(viewModelStoreOwner);
            }
        });
    }

    private final androidx.lifecycle.SavedStateHandlesVM getViewModel() {
        return (androidx.lifecycle.SavedStateHandlesVM) this.viewModel.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public android.os.Bundle saveState() {
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (java.util.Map.Entry<java.lang.String, androidx.lifecycle.SavedStateHandle> entry : getViewModel().getHandles().entrySet()) {
            java.lang.String key = entry.getKey();
            android.os.Bundle bundleSaveState = entry.getValue().getSavedStateProvider().saveState();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(bundleSaveState, android.os.Bundle.EMPTY)) {
                bundle.putBundle(key, bundleSaveState);
            }
        }
        this.restored = false;
        return bundle;
    }

    public final void performRestore() {
        if (this.restored) {
            return;
        }
        android.os.Bundle bundleConsumeRestoredStateForKey = this.savedStateRegistry.consumeRestoredStateForKey("androidx.lifecycle.internal.SavedStateHandlesProvider");
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleConsumeRestoredStateForKey != null) {
            bundle.putAll(bundleConsumeRestoredStateForKey);
        }
        this.restoredState = bundle;
        this.restored = true;
        getViewModel();
    }

    public final android.os.Bundle consumeRestoredStateForKey(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        performRestore();
        android.os.Bundle bundle = this.restoredState;
        android.os.Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        android.os.Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        android.os.Bundle bundle4 = this.restoredState;
        boolean z = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z = true;
        }
        if (z) {
            this.restoredState = null;
        }
        return bundle2;
    }
}
