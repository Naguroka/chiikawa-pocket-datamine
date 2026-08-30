package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class FragmentManagerNonConfig {
    private final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> mChildNonConfigs;
    private final java.util.Collection<androidx.fragment.app.Fragment> mFragments;
    private final java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> mViewModelStores;

    FragmentManagerNonConfig(java.util.Collection<androidx.fragment.app.Fragment> collection, java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> map, java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> map2) {
        this.mFragments = collection;
        this.mChildNonConfigs = map;
        this.mViewModelStores = map2;
    }

    boolean isRetaining(androidx.fragment.app.Fragment fragment) {
        java.util.Collection<androidx.fragment.app.Fragment> collection = this.mFragments;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }

    java.util.Collection<androidx.fragment.app.Fragment> getFragments() {
        return this.mFragments;
    }

    java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> getChildNonConfigs() {
        return this.mChildNonConfigs;
    }

    java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> getViewModelStores() {
        return this.mViewModelStores;
    }
}
