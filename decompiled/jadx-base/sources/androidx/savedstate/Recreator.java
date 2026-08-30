package androidx.savedstate;

/* JADX INFO: compiled from: Recreator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "reflectiveNew", "className", "", "Companion", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Recreator implements androidx.lifecycle.LifecycleEventObserver {
    public static final java.lang.String CLASSES_KEY = "classes_to_restore";
    public static final java.lang.String COMPONENT_KEY = "androidx.savedstate.Restarter";
    private final androidx.savedstate.SavedStateRegistryOwner owner;

    public Recreator(androidx.savedstate.SavedStateRegistryOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
        this.owner = owner;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        if (event != androidx.lifecycle.Lifecycle.Event.ON_CREATE) {
            throw new java.lang.AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().removeObserver(this);
        android.os.Bundle bundleConsumeRestoredStateForKey = this.owner.getSavedStateRegistry().consumeRestoredStateForKey(COMPONENT_KEY);
        if (bundleConsumeRestoredStateForKey == null) {
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayList = bundleConsumeRestoredStateForKey.getStringArrayList(CLASSES_KEY);
        if (stringArrayList == null) {
            throw new java.lang.IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            reflectiveNew(it.next());
        }
    }

    private final void reflectiveNew(java.lang.String className) {
        try {
            java.lang.Class<? extends U> clsAsSubclass = java.lang.Class.forName(className, false, androidx.savedstate.Recreator.class.getClassLoader()).asSubclass(androidx.savedstate.SavedStateRegistry.AutoRecreated.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                java.lang.reflect.Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new java.lang.Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    java.lang.Object objNewInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((androidx.savedstate.SavedStateRegistry.AutoRecreated) objNewInstance).onRecreated(this.owner);
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Failed to instantiate " + className, e);
                }
            } catch (java.lang.NoSuchMethodException e2) {
                throw new java.lang.IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (java.lang.ClassNotFoundException e3) {
            throw new java.lang.RuntimeException("Class " + className + " wasn't found", e3);
        }
    }

    /* JADX INFO: compiled from: Recreator.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/savedstate/Recreator$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "registry", "Landroidx/savedstate/SavedStateRegistry;", "(Landroidx/savedstate/SavedStateRegistry;)V", "classes", "", "", "add", "", "className", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SavedStateProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {
        private final java.util.Set<java.lang.String> classes;

        public SavedStateProvider(androidx.savedstate.SavedStateRegistry registry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registry, "registry");
            this.classes = new java.util.LinkedHashSet();
            registry.registerSavedStateProvider(androidx.savedstate.Recreator.COMPONENT_KEY, this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        public android.os.Bundle saveState() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putStringArrayList(androidx.savedstate.Recreator.CLASSES_KEY, new java.util.ArrayList<>(this.classes));
            return bundle;
        }

        public final void add(java.lang.String className) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "className");
            this.classes.add(className);
        }
    }
}
