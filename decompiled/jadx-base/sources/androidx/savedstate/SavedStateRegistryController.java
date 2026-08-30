package androidx.savedstate;

/* JADX INFO: compiled from: SavedStateRegistryController.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController;", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "attached", "", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "performAttach", "", "performRestore", "savedState", "Landroid/os/Bundle;", "performSave", "outBundle", "Companion", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateRegistryController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.savedstate.SavedStateRegistryController.Companion INSTANCE = new androidx.savedstate.SavedStateRegistryController.Companion(null);
    private boolean attached;
    private final androidx.savedstate.SavedStateRegistryOwner owner;
    private final androidx.savedstate.SavedStateRegistry savedStateRegistry;

    public /* synthetic */ SavedStateRegistryController(androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateRegistryOwner);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.savedstate.SavedStateRegistryController create(androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner) {
        return INSTANCE.create(savedStateRegistryOwner);
    }

    private SavedStateRegistryController(androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner) {
        this.owner = savedStateRegistryOwner;
        this.savedStateRegistry = new androidx.savedstate.SavedStateRegistry();
    }

    public final androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    public final void performAttach() {
        androidx.lifecycle.Lifecycle lifecycle = this.owner.getLifecycle();
        if (!(lifecycle.getState() == androidx.lifecycle.Lifecycle.State.INITIALIZED)) {
            throw new java.lang.IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.addObserver(new androidx.savedstate.Recreator(this.owner));
        this.savedStateRegistry.performAttach$savedstate_release(lifecycle);
        this.attached = true;
    }

    public final void performRestore(android.os.Bundle savedState) {
        if (!this.attached) {
            performAttach();
        }
        androidx.lifecycle.Lifecycle lifecycle = this.owner.getLifecycle();
        if (!(!lifecycle.getState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED))) {
            throw new java.lang.IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getState()).toString());
        }
        this.savedStateRegistry.performRestore$savedstate_release(savedState);
    }

    public final void performSave(android.os.Bundle outBundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.savedStateRegistry.performSave(outBundle);
    }

    /* JADX INFO: compiled from: SavedStateRegistryController.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController$Companion;", "", "()V", "create", "Landroidx/savedstate/SavedStateRegistryController;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.savedstate.SavedStateRegistryController create(androidx.savedstate.SavedStateRegistryOwner owner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
            return new androidx.savedstate.SavedStateRegistryController(owner, null);
        }
    }
}
