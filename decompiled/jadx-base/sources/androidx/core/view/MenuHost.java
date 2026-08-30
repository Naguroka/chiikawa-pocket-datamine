package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public interface MenuHost {
    void addMenuProvider(androidx.core.view.MenuProvider menuProvider);

    void addMenuProvider(androidx.core.view.MenuProvider menuProvider, androidx.lifecycle.LifecycleOwner lifecycleOwner);

    void addMenuProvider(androidx.core.view.MenuProvider menuProvider, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state);

    void invalidateMenu();

    void removeMenuProvider(androidx.core.view.MenuProvider menuProvider);
}
