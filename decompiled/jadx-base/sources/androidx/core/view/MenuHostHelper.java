package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class MenuHostHelper {
    private final java.lang.Runnable mOnInvalidateMenuCallback;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> mMenuProviders = new java.util.concurrent.CopyOnWriteArrayList<>();
    private final java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper.LifecycleContainer> mProviderToLifecycleContainers = new java.util.HashMap();

    public MenuHostHelper(java.lang.Runnable runnable) {
        this.mOnInvalidateMenuCallback = runnable;
    }

    public void onPrepareMenu(android.view.Menu menu) {
        java.util.Iterator<androidx.core.view.MenuProvider> it = this.mMenuProviders.iterator();
        while (it.hasNext()) {
            it.next().onPrepareMenu(menu);
        }
    }

    public void onCreateMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        java.util.Iterator<androidx.core.view.MenuProvider> it = this.mMenuProviders.iterator();
        while (it.hasNext()) {
            it.next().onCreateMenu(menu, menuInflater);
        }
    }

    public boolean onMenuItemSelected(android.view.MenuItem menuItem) {
        java.util.Iterator<androidx.core.view.MenuProvider> it = this.mMenuProviders.iterator();
        while (it.hasNext()) {
            if (it.next().onMenuItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onMenuClosed(android.view.Menu menu) {
        java.util.Iterator<androidx.core.view.MenuProvider> it = this.mMenuProviders.iterator();
        while (it.hasNext()) {
            it.next().onMenuClosed(menu);
        }
    }

    public void addMenuProvider(androidx.core.view.MenuProvider menuProvider) {
        this.mMenuProviders.add(menuProvider);
        this.mOnInvalidateMenuCallback.run();
    }

    public void addMenuProvider(final androidx.core.view.MenuProvider menuProvider, androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        addMenuProvider(menuProvider);
        androidx.lifecycle.Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        androidx.core.view.MenuHostHelper.LifecycleContainer lifecycleContainerRemove = this.mProviderToLifecycleContainers.remove(menuProvider);
        if (lifecycleContainerRemove != null) {
            lifecycleContainerRemove.clearObservers();
        }
        this.mProviderToLifecycleContainers.put(menuProvider, new androidx.core.view.MenuHostHelper.LifecycleContainer(lifecycle, new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                this.f$0.m38lambda$addMenuProvider$0$androidxcoreviewMenuHostHelper(menuProvider, lifecycleOwner2, event);
            }
        }));
    }

    /* JADX INFO: renamed from: lambda$addMenuProvider$0$androidx-core-view-MenuHostHelper, reason: not valid java name */
    /* synthetic */ void m38lambda$addMenuProvider$0$androidxcoreviewMenuHostHelper(androidx.core.view.MenuProvider menuProvider, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
            removeMenuProvider(menuProvider);
        }
    }

    public void addMenuProvider(final androidx.core.view.MenuProvider menuProvider, androidx.lifecycle.LifecycleOwner lifecycleOwner, final androidx.lifecycle.Lifecycle.State state) {
        androidx.lifecycle.Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        androidx.core.view.MenuHostHelper.LifecycleContainer lifecycleContainerRemove = this.mProviderToLifecycleContainers.remove(menuProvider);
        if (lifecycleContainerRemove != null) {
            lifecycleContainerRemove.clearObservers();
        }
        this.mProviderToLifecycleContainers.put(menuProvider, new androidx.core.view.MenuHostHelper.LifecycleContainer(lifecycle, new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                this.f$0.m39lambda$addMenuProvider$1$androidxcoreviewMenuHostHelper(state, menuProvider, lifecycleOwner2, event);
            }
        }));
    }

    /* JADX INFO: renamed from: lambda$addMenuProvider$1$androidx-core-view-MenuHostHelper, reason: not valid java name */
    /* synthetic */ void m39lambda$addMenuProvider$1$androidxcoreviewMenuHostHelper(androidx.lifecycle.Lifecycle.State state, androidx.core.view.MenuProvider menuProvider, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        if (event == androidx.lifecycle.Lifecycle.Event.upTo(state)) {
            addMenuProvider(menuProvider);
            return;
        }
        if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
            removeMenuProvider(menuProvider);
        } else if (event == androidx.lifecycle.Lifecycle.Event.downFrom(state)) {
            this.mMenuProviders.remove(menuProvider);
            this.mOnInvalidateMenuCallback.run();
        }
    }

    public void removeMenuProvider(androidx.core.view.MenuProvider menuProvider) {
        this.mMenuProviders.remove(menuProvider);
        androidx.core.view.MenuHostHelper.LifecycleContainer lifecycleContainerRemove = this.mProviderToLifecycleContainers.remove(menuProvider);
        if (lifecycleContainerRemove != null) {
            lifecycleContainerRemove.clearObservers();
        }
        this.mOnInvalidateMenuCallback.run();
    }

    private static class LifecycleContainer {
        final androidx.lifecycle.Lifecycle mLifecycle;
        private androidx.lifecycle.LifecycleEventObserver mObserver;

        LifecycleContainer(androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver) {
            this.mLifecycle = lifecycle;
            this.mObserver = lifecycleEventObserver;
            lifecycle.addObserver(lifecycleEventObserver);
        }

        void clearObservers() {
            this.mLifecycle.removeObserver(this.mObserver);
            this.mObserver = null;
        }
    }
}
