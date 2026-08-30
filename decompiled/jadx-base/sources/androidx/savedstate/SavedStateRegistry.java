package androidx.savedstate;

/* JADX INFO: compiled from: SavedStateRegistry.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u0001:\u0003()*B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0007H\u0007J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0007J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0013H\u0007J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\bH\u0007J\u0018\u0010#\u001a\u00020\u00182\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0%H\u0007J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "()V", "attached", "", "components", "Landroidx/arch/core/internal/SafeIterableMap;", "", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "isAllowingSavingState", "isAllowingSavingState$savedstate_release", "()Z", "setAllowingSavingState$savedstate_release", "(Z)V", "<set-?>", "isRestored", "recreatorProvider", "Landroidx/savedstate/Recreator$SavedStateProvider;", "restoredState", "Landroid/os/Bundle;", "consumeRestoredStateForKey", com.ironsource.y8.h.W, "getSavedStateProvider", "performAttach", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "performAttach$savedstate_release", "performRestore", "savedState", "performRestore$savedstate_release", "performSave", "outBundle", "registerSavedStateProvider", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "runOnNextRecreation", "clazz", "Ljava/lang/Class;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "unregisterSavedStateProvider", "AutoRecreated", "Companion", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateRegistry {
    private static final androidx.savedstate.SavedStateRegistry.Companion Companion = new androidx.savedstate.SavedStateRegistry.Companion(null);

    @java.lang.Deprecated
    private static final java.lang.String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean attached;
    private final androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> components = new androidx.arch.core.internal.SafeIterableMap<>();
    private boolean isAllowingSavingState = true;
    private boolean isRestored;
    private androidx.savedstate.Recreator.SavedStateProvider recreatorProvider;
    private android.os.Bundle restoredState;

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "", "onRecreated", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface AutoRecreated {
        void onRecreated(androidx.savedstate.SavedStateRegistryOwner owner);
    }

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface SavedStateProvider {
        android.os.Bundle saveState();
    }

    /* JADX INFO: renamed from: isRestored, reason: from getter */
    public final boolean getIsRestored() {
        return this.isRestored;
    }

    /* JADX INFO: renamed from: isAllowingSavingState$savedstate_release, reason: from getter */
    public final boolean getIsAllowingSavingState() {
        return this.isAllowingSavingState;
    }

    public final void setAllowingSavingState$savedstate_release(boolean z) {
        this.isAllowingSavingState = z;
    }

    public final android.os.Bundle consumeRestoredStateForKey(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        if (!this.isRestored) {
            throw new java.lang.IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        android.os.Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        android.os.Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        android.os.Bundle bundle4 = this.restoredState;
        boolean z = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z = true;
        }
        if (!z) {
            this.restoredState = null;
        }
        return bundle2;
    }

    public final void registerSavedStateProvider(java.lang.String key, androidx.savedstate.SavedStateRegistry.SavedStateProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
        if (!(this.components.putIfAbsent(key, provider) == null)) {
            throw new java.lang.IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final androidx.savedstate.SavedStateRegistry.SavedStateProvider getSavedStateProvider(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        for (java.util.Map.Entry<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> components : this.components) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(components, "components");
            java.lang.String key2 = components.getKey();
            androidx.savedstate.SavedStateRegistry.SavedStateProvider value = components.getValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(key2, key)) {
                return value;
            }
        }
        return null;
    }

    public final void unregisterSavedStateProvider(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.components.remove(key);
    }

    public final void runOnNextRecreation(java.lang.Class<? extends androidx.savedstate.SavedStateRegistry.AutoRecreated> clazz) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.isAllowingSavingState) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        androidx.savedstate.Recreator.SavedStateProvider savedStateProvider = this.recreatorProvider;
        if (savedStateProvider == null) {
            savedStateProvider = new androidx.savedstate.Recreator.SavedStateProvider(this);
        }
        this.recreatorProvider = savedStateProvider;
        try {
            clazz.getDeclaredConstructor(new java.lang.Class[0]);
            androidx.savedstate.Recreator.SavedStateProvider savedStateProvider2 = this.recreatorProvider;
            if (savedStateProvider2 != null) {
                java.lang.String name = clazz.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                savedStateProvider2.add(name);
            }
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final void performAttach$savedstate_release(androidx.lifecycle.Lifecycle lifecycle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!(!this.attached)) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                androidx.savedstate.SavedStateRegistry.performAttach$lambda$4(this.f$0, lifecycleOwner, event);
            }
        });
        this.attached = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performAttach$lambda$4(androidx.savedstate.SavedStateRegistry this$0, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.Lifecycle.Event.ON_START) {
            this$0.isAllowingSavingState = true;
        } else if (event == androidx.lifecycle.Lifecycle.Event.ON_STOP) {
            this$0.isAllowingSavingState = false;
        }
    }

    public final void performRestore$savedstate_release(android.os.Bundle savedState) {
        if (!this.attached) {
            throw new java.lang.IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.isRestored)) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.restoredState = savedState != null ? savedState.getBundle(SAVED_COMPONENTS_KEY) : null;
        this.isRestored = true;
    }

    public final void performSave(android.os.Bundle outBundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider>.IteratorWithAdditions iteratorWithAdditions = this.components.iteratorWithAdditions();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iteratorWithAdditions, "this.components.iteratorWithAdditions()");
        androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider>.IteratorWithAdditions iteratorWithAdditions2 = iteratorWithAdditions;
        while (iteratorWithAdditions2.hasNext()) {
            java.util.Map.Entry next = iteratorWithAdditions2.next();
            bundle.putBundle((java.lang.String) next.getKey(), ((androidx.savedstate.SavedStateRegistry.SavedStateProvider) next.getValue()).saveState());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle(SAVED_COMPONENTS_KEY, bundle);
    }

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$Companion;", "", "()V", "SAVED_COMPONENTS_KEY", "", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
