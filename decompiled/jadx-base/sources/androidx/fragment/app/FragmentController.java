package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class FragmentController {
    private final androidx.fragment.app.FragmentHostCallback<?> mHost;

    @java.lang.Deprecated
    public void dispatchReallyStop() {
    }

    @java.lang.Deprecated
    public void doLoaderDestroy() {
    }

    @java.lang.Deprecated
    public void doLoaderRetain() {
    }

    @java.lang.Deprecated
    public void doLoaderStart() {
    }

    @java.lang.Deprecated
    public void doLoaderStop(boolean z) {
    }

    @java.lang.Deprecated
    public void dumpLoaders(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    @java.lang.Deprecated
    public void reportLoaderStart() {
    }

    @java.lang.Deprecated
    public void restoreLoaderNonConfig(androidx.collection.SimpleArrayMap<java.lang.String, androidx.loader.app.LoaderManager> simpleArrayMap) {
    }

    @java.lang.Deprecated
    public androidx.collection.SimpleArrayMap<java.lang.String, androidx.loader.app.LoaderManager> retainLoaderNonConfig() {
        return null;
    }

    public static androidx.fragment.app.FragmentController createController(androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback) {
        return new androidx.fragment.app.FragmentController((androidx.fragment.app.FragmentHostCallback) androidx.core.util.Preconditions.checkNotNull(fragmentHostCallback, "callbacks == null"));
    }

    private FragmentController(androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback) {
        this.mHost = fragmentHostCallback;
    }

    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
        return this.mHost.mFragmentManager;
    }

    @java.lang.Deprecated
    public androidx.loader.app.LoaderManager getSupportLoaderManager() {
        throw new java.lang.UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public androidx.fragment.app.Fragment findFragmentByWho(java.lang.String str) {
        return this.mHost.mFragmentManager.findFragmentByWho(str);
    }

    public int getActiveFragmentsCount() {
        return this.mHost.mFragmentManager.getActiveFragmentCount();
    }

    public java.util.List<androidx.fragment.app.Fragment> getActiveFragments(java.util.List<androidx.fragment.app.Fragment> list) {
        return this.mHost.mFragmentManager.getActiveFragments();
    }

    public void attachHost(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentManager fragmentManager = this.mHost.mFragmentManager;
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        fragmentManager.attachController(fragmentHostCallback, fragmentHostCallback, fragment);
    }

    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return this.mHost.mFragmentManager.getLayoutInflaterFactory().onCreateView(view, str, context, attributeSet);
    }

    public void noteStateNotSaved() {
        this.mHost.mFragmentManager.noteStateNotSaved();
    }

    public android.os.Parcelable saveAllState() {
        return this.mHost.mFragmentManager.saveAllState();
    }

    @java.lang.Deprecated
    public void restoreAllState(android.os.Parcelable parcelable, java.util.List<androidx.fragment.app.Fragment> list) {
        this.mHost.mFragmentManager.restoreAllState(parcelable, new androidx.fragment.app.FragmentManagerNonConfig(list, null, null));
    }

    @java.lang.Deprecated
    public void restoreAllState(android.os.Parcelable parcelable, androidx.fragment.app.FragmentManagerNonConfig fragmentManagerNonConfig) {
        this.mHost.mFragmentManager.restoreAllState(parcelable, fragmentManagerNonConfig);
    }

    public void restoreSaveState(android.os.Parcelable parcelable) {
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (!(fragmentHostCallback instanceof androidx.lifecycle.ViewModelStoreOwner)) {
            throw new java.lang.IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        fragmentHostCallback.mFragmentManager.restoreSaveState(parcelable);
    }

    @java.lang.Deprecated
    public java.util.List<androidx.fragment.app.Fragment> retainNonConfig() {
        androidx.fragment.app.FragmentManagerNonConfig fragmentManagerNonConfigRetainNonConfig = this.mHost.mFragmentManager.retainNonConfig();
        if (fragmentManagerNonConfigRetainNonConfig == null || fragmentManagerNonConfigRetainNonConfig.getFragments() == null) {
            return null;
        }
        return new java.util.ArrayList(fragmentManagerNonConfigRetainNonConfig.getFragments());
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentManagerNonConfig retainNestedNonConfig() {
        return this.mHost.mFragmentManager.retainNonConfig();
    }

    public void dispatchCreate() {
        this.mHost.mFragmentManager.dispatchCreate();
    }

    public void dispatchActivityCreated() {
        this.mHost.mFragmentManager.dispatchActivityCreated();
    }

    public void dispatchStart() {
        this.mHost.mFragmentManager.dispatchStart();
    }

    public void dispatchResume() {
        this.mHost.mFragmentManager.dispatchResume();
    }

    public void dispatchPause() {
        this.mHost.mFragmentManager.dispatchPause();
    }

    public void dispatchStop() {
        this.mHost.mFragmentManager.dispatchStop();
    }

    public void dispatchDestroyView() {
        this.mHost.mFragmentManager.dispatchDestroyView();
    }

    public void dispatchDestroy() {
        this.mHost.mFragmentManager.dispatchDestroy();
    }

    public void dispatchMultiWindowModeChanged(boolean z) {
        this.mHost.mFragmentManager.dispatchMultiWindowModeChanged(z);
    }

    public void dispatchPictureInPictureModeChanged(boolean z) {
        this.mHost.mFragmentManager.dispatchPictureInPictureModeChanged(z);
    }

    public void dispatchConfigurationChanged(android.content.res.Configuration configuration) {
        this.mHost.mFragmentManager.dispatchConfigurationChanged(configuration);
    }

    public void dispatchLowMemory() {
        this.mHost.mFragmentManager.dispatchLowMemory();
    }

    public boolean dispatchCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        return this.mHost.mFragmentManager.dispatchCreateOptionsMenu(menu, menuInflater);
    }

    public boolean dispatchPrepareOptionsMenu(android.view.Menu menu) {
        return this.mHost.mFragmentManager.dispatchPrepareOptionsMenu(menu);
    }

    public boolean dispatchOptionsItemSelected(android.view.MenuItem menuItem) {
        return this.mHost.mFragmentManager.dispatchOptionsItemSelected(menuItem);
    }

    public boolean dispatchContextItemSelected(android.view.MenuItem menuItem) {
        return this.mHost.mFragmentManager.dispatchContextItemSelected(menuItem);
    }

    public void dispatchOptionsMenuClosed(android.view.Menu menu) {
        this.mHost.mFragmentManager.dispatchOptionsMenuClosed(menu);
    }

    public boolean execPendingActions() {
        return this.mHost.mFragmentManager.execPendingActions(true);
    }
}
